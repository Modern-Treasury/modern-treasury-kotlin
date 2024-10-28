package com.moderntreasury.api.core.http

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.closeWhenPhantomReachable

internal class PhantomReachableClosingHttpClient(private val httpClient: HttpClient) : HttpClient {
    init {
        closeWhenPhantomReachable(this, httpClient)
    }

    override fun execute(request: HttpRequest, requestOptions: RequestOptions): HttpResponse =
        httpClient.execute(request, requestOptions)

    override suspend fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions
    ): HttpResponse = httpClient.executeAsync(request, requestOptions)

    override fun close() = httpClient.close()
}
