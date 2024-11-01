// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.core

import com.fasterxml.jackson.databind.json.JsonMapper
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.http.HttpClient
import com.moderntreasury.api.core.http.PhantomReachableClosingHttpClient
import com.moderntreasury.api.core.http.RetryingHttpClient
import java.time.Clock
import java.util.Base64

class ClientOptions
private constructor(
    private val originalHttpClient: HttpClient,
    val httpClient: HttpClient,
    val jsonMapper: JsonMapper,
    val clock: Clock,
    val baseUrl: String,
    val headers: ListMultimap<String, String>,
    val queryParams: ListMultimap<String, String>,
    val responseValidation: Boolean,
    val maxRetries: Int,
    val apiKey: String,
    val organizationId: String,
    val webhookKey: String?,
) {

    fun toBuilder() = Builder().from(this)

    companion object {

        const val PRODUCTION_URL = "https://app.moderntreasury.com"

        fun builder() = Builder()

        fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    class Builder {

        private var httpClient: HttpClient? = null
        private var jsonMapper: JsonMapper = jsonMapper()
        private var clock: Clock = Clock.systemUTC()
        private var baseUrl: String = PRODUCTION_URL
        private var headers: ListMultimap<String, String> = ArrayListMultimap.create()
        private var queryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var responseValidation: Boolean = false
        private var maxRetries: Int = 2
        private var apiKey: String? = null
        private var organizationId: String? = null
        private var webhookKey: String? = null

        internal fun from(clientOptions: ClientOptions) = apply {
            httpClient = clientOptions.originalHttpClient
            jsonMapper = clientOptions.jsonMapper
            clock = clientOptions.clock
            baseUrl = clientOptions.baseUrl
            headers = ArrayListMultimap.create(clientOptions.headers)
            queryParams = ArrayListMultimap.create(clientOptions.queryParams)
            responseValidation = clientOptions.responseValidation
            maxRetries = clientOptions.maxRetries
            apiKey = clientOptions.apiKey
            organizationId = clientOptions.organizationId
            webhookKey = clientOptions.webhookKey
        }

        fun httpClient(httpClient: HttpClient) = apply { this.httpClient = httpClient }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { this.jsonMapper = jsonMapper }

        fun clock(clock: Clock) = apply { this.clock = clock }

        fun baseUrl(baseUrl: String) = apply { this.baseUrl = baseUrl }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply { headers.put(name, value) }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            headers.putAll(name, values)
        }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            headers.forEach(::putHeaders)
        }

        fun removeHeader(name: String) = apply { headers.removeAll(name) }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun putQueryParam(name: String, value: String) = apply { queryParams.put(name, value) }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            queryParams.putAll(name, values)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            queryParams.forEach(::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply { queryParams.removeAll(name) }

        fun responseValidation(responseValidation: Boolean) = apply {
            this.responseValidation = responseValidation
        }

        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        fun apiKey(apiKey: String) = apply { this.apiKey = apiKey }

        fun organizationId(organizationId: String) = apply { this.organizationId = organizationId }

        fun webhookKey(webhookKey: String?) = apply { this.webhookKey = webhookKey }

        fun fromEnv() = apply {
            System.getenv("MODERN_TREASURY_API_KEY")?.let { apiKey(it) }
            System.getenv("MODERN_TREASURY_ORGANIZATION_ID")?.let { organizationId(it) }
            System.getenv("MODERN_TREASURY_WEBHOOK_KEY")?.let { webhookKey(it) }
        }

        fun build(): ClientOptions {
            checkNotNull(httpClient) { "`httpClient` is required but was not set" }
            checkNotNull(apiKey) { "`apiKey` is required but was not set" }
            checkNotNull(organizationId) { "`organizationId` is required but was not set" }

            val headers = ArrayListMultimap.create<String, String>()
            val queryParams = ArrayListMultimap.create<String, String>()
            headers.put("X-Stainless-Lang", "kotlin")
            headers.put("X-Stainless-Arch", getOsArch())
            headers.put("X-Stainless-OS", getOsName())
            headers.put("X-Stainless-OS-Version", getOsVersion())
            headers.put("X-Stainless-Package-Version", getPackageVersion())
            headers.put("X-Stainless-Runtime", "JRE")
            headers.put("X-Stainless-Runtime-Version", getJavaVersion())
            if (!organizationId.isNullOrEmpty() && !apiKey.isNullOrEmpty()) {
                headers.put(
                    "Authorization",
                    "Basic ${Base64.getEncoder().encodeToString("${organizationId}:${apiKey}".toByteArray())}"
                )
            }
            this.headers.asMap().forEach(headers::replaceValues)
            this.queryParams.asMap().forEach(queryParams::replaceValues)

            return ClientOptions(
                httpClient!!,
                PhantomReachableClosingHttpClient(
                    RetryingHttpClient.builder()
                        .httpClient(httpClient!!)
                        .clock(clock)
                        .maxRetries(maxRetries)
                        .idempotencyHeader("Idempotency-Key")
                        .build()
                ),
                jsonMapper,
                clock,
                baseUrl,
                headers.toImmutable(),
                queryParams.toImmutable(),
                responseValidation,
                maxRetries,
                apiKey!!,
                organizationId!!,
                webhookKey,
            )
        }
    }
}
