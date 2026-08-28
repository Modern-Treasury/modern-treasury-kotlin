// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.errorBodyHandler
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.json
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.models.VirtualAccountSetting
import com.moderntreasury.api.models.VirtualAccountSettingCreateParams
import com.moderntreasury.api.models.VirtualAccountSettingListPage
import com.moderntreasury.api.models.VirtualAccountSettingListParams

class VirtualAccountSettingServiceImpl
internal constructor(private val clientOptions: ClientOptions) : VirtualAccountSettingService {

    private val withRawResponse: VirtualAccountSettingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VirtualAccountSettingService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): VirtualAccountSettingService =
        VirtualAccountSettingServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: VirtualAccountSettingCreateParams,
        requestOptions: RequestOptions,
    ): VirtualAccountSetting =
        // post /api/virtual_account_settings
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: VirtualAccountSettingListParams,
        requestOptions: RequestOptions,
    ): VirtualAccountSettingListPage =
        // get /api/virtual_account_settings
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VirtualAccountSettingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): VirtualAccountSettingService.WithRawResponse =
            VirtualAccountSettingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<VirtualAccountSetting> =
            jsonHandler<VirtualAccountSetting>(clientOptions.jsonMapper)

        override fun create(
            params: VirtualAccountSettingCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VirtualAccountSetting> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "virtual_account_settings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<VirtualAccountSetting>> =
            jsonHandler<List<VirtualAccountSetting>>(clientOptions.jsonMapper)

        override fun list(
            params: VirtualAccountSettingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VirtualAccountSettingListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "virtual_account_settings")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        VirtualAccountSettingListPage.builder()
                            .service(VirtualAccountSettingServiceImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }
    }
}
