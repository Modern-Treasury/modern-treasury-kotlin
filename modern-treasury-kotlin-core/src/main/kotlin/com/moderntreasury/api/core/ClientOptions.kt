// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.core

import com.fasterxml.jackson.databind.json.JsonMapper
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.HttpClient
import com.moderntreasury.api.core.http.PhantomReachableClosingHttpClient
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.http.RetryingHttpClient
import java.time.Clock
import java.util.Base64

class ClientOptions
private constructor(
    private val originalHttpClient: HttpClient,
    val httpClient: HttpClient,
    val checkJacksonVersionCompatibility: Boolean,
    val jsonMapper: JsonMapper,
    val clock: Clock,
    private val baseUrl: String?,
    val headers: Headers,
    val queryParams: QueryParams,
    val responseValidation: Boolean,
    val timeout: Timeout,
    val maxRetries: Int,
    val apiKey: String,
    val organizationId: String,
    val webhookKey: String?,
) {

    init {
        if (checkJacksonVersionCompatibility) {
            checkJacksonVersionCompatibility()
        }
    }

    fun baseUrl(): String = baseUrl ?: PRODUCTION_URL

    fun toBuilder() = Builder().from(this)

    companion object {

        const val PRODUCTION_URL = "https://app.moderntreasury.com"

        /**
         * Returns a mutable builder for constructing an instance of [ClientOptions].
         *
         * The following fields are required:
         * ```kotlin
         * .httpClient()
         * .apiKey()
         * .organizationId()
         * ```
         */
        fun builder() = Builder()

        fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    /** A builder for [ClientOptions]. */
    class Builder internal constructor() {

        private var httpClient: HttpClient? = null
        private var checkJacksonVersionCompatibility: Boolean = true
        private var jsonMapper: JsonMapper = jsonMapper()
        private var clock: Clock = Clock.systemUTC()
        private var baseUrl: String? = null
        private var headers: Headers.Builder = Headers.builder()
        private var queryParams: QueryParams.Builder = QueryParams.builder()
        private var responseValidation: Boolean = false
        private var timeout: Timeout = Timeout.default()
        private var maxRetries: Int = 2
        private var apiKey: String? = null
        private var organizationId: String? = null
        private var webhookKey: String? = null

        internal fun from(clientOptions: ClientOptions) = apply {
            httpClient = clientOptions.originalHttpClient
            checkJacksonVersionCompatibility = clientOptions.checkJacksonVersionCompatibility
            jsonMapper = clientOptions.jsonMapper
            clock = clientOptions.clock
            baseUrl = clientOptions.baseUrl
            headers = clientOptions.headers.toBuilder()
            queryParams = clientOptions.queryParams.toBuilder()
            responseValidation = clientOptions.responseValidation
            timeout = clientOptions.timeout
            maxRetries = clientOptions.maxRetries
            apiKey = clientOptions.apiKey
            organizationId = clientOptions.organizationId
            webhookKey = clientOptions.webhookKey
        }

        fun httpClient(httpClient: HttpClient) = apply {
            this.httpClient = PhantomReachableClosingHttpClient(httpClient)
        }

        fun checkJacksonVersionCompatibility(checkJacksonVersionCompatibility: Boolean) = apply {
            this.checkJacksonVersionCompatibility = checkJacksonVersionCompatibility
        }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { this.jsonMapper = jsonMapper }

        fun clock(clock: Clock) = apply { this.clock = clock }

        fun baseUrl(baseUrl: String?) = apply { this.baseUrl = baseUrl }

        fun responseValidation(responseValidation: Boolean) = apply {
            this.responseValidation = responseValidation
        }

        fun timeout(timeout: Timeout) = apply { this.timeout = timeout }

        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        fun apiKey(apiKey: String) = apply { this.apiKey = apiKey }

        fun organizationId(organizationId: String) = apply { this.organizationId = organizationId }

        fun webhookKey(webhookKey: String?) = apply { this.webhookKey = webhookKey }

        fun headers(headers: Headers) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply { headers.put(name, value) }

        fun putHeaders(name: String, values: Iterable<String>) = apply { headers.put(name, values) }

        fun putAllHeaders(headers: Headers) = apply { this.headers.putAll(headers) }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            this.headers.putAll(headers)
        }

        fun replaceHeaders(name: String, value: String) = apply { headers.replace(name, value) }

        fun replaceHeaders(name: String, values: Iterable<String>) = apply {
            headers.replace(name, values)
        }

        fun replaceAllHeaders(headers: Headers) = apply { this.headers.replaceAll(headers) }

        fun replaceAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            this.headers.replaceAll(headers)
        }

        fun removeHeaders(name: String) = apply { headers.remove(name) }

        fun removeAllHeaders(names: Set<String>) = apply { headers.removeAll(names) }

        fun queryParams(queryParams: QueryParams) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun putQueryParam(key: String, value: String) = apply { queryParams.put(key, value) }

        fun putQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.put(key, values)
        }

        fun putAllQueryParams(queryParams: QueryParams) = apply {
            this.queryParams.putAll(queryParams)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.putAll(queryParams)
        }

        fun replaceQueryParams(key: String, value: String) = apply {
            queryParams.replace(key, value)
        }

        fun replaceQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.replace(key, values)
        }

        fun replaceAllQueryParams(queryParams: QueryParams) = apply {
            this.queryParams.replaceAll(queryParams)
        }

        fun replaceAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.replaceAll(queryParams)
        }

        fun removeQueryParams(key: String) = apply { queryParams.remove(key) }

        fun removeAllQueryParams(keys: Set<String>) = apply { queryParams.removeAll(keys) }

        fun fromEnv() = apply {
            System.getenv("MODERN_TREASURY_BASE_URL")?.let { baseUrl(it) }
            System.getenv("MODERN_TREASURY_API_KEY")?.let { apiKey(it) }
            System.getenv("MODERN_TREASURY_ORGANIZATION_ID")?.let { organizationId(it) }
            System.getenv("MODERN_TREASURY_WEBHOOK_KEY")?.let { webhookKey(it) }
        }

        /**
         * Returns an immutable instance of [ClientOptions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .httpClient()
         * .apiKey()
         * .organizationId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClientOptions {
            val httpClient = checkRequired("httpClient", httpClient)
            val apiKey = checkRequired("apiKey", apiKey)
            val organizationId = checkRequired("organizationId", organizationId)

            val headers = Headers.builder()
            val queryParams = QueryParams.builder()
            headers.put("X-Stainless-Lang", "kotlin")
            headers.put("X-Stainless-Arch", getOsArch())
            headers.put("X-Stainless-OS", getOsName())
            headers.put("X-Stainless-OS-Version", getOsVersion())
            headers.put("X-Stainless-Package-Version", getPackageVersion())
            headers.put("X-Stainless-Runtime", "JRE")
            headers.put("X-Stainless-Runtime-Version", getJavaVersion())
            organizationId.let { username ->
                apiKey.let { password ->
                    if (!username.isEmpty() && !password.isEmpty()) {
                        headers.put(
                            "Authorization",
                            "Basic ${Base64.getEncoder().encodeToString("$username:$password".toByteArray())}",
                        )
                    }
                }
            }
            headers.replaceAll(this.headers.build())
            queryParams.replaceAll(this.queryParams.build())

            return ClientOptions(
                httpClient,
                RetryingHttpClient.builder()
                    .httpClient(httpClient)
                    .clock(clock)
                    .maxRetries(maxRetries)
                    .idempotencyHeader("Idempotency-Key")
                    .build(),
                checkJacksonVersionCompatibility,
                jsonMapper,
                clock,
                baseUrl,
                headers.build(),
                queryParams.build(),
                responseValidation,
                timeout,
                maxRetries,
                apiKey,
                organizationId,
                webhookKey,
            )
        }
    }
}
