// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.core

import com.fasterxml.jackson.databind.json.JsonMapper
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.http.HttpClient
import com.moderntreasury.api.core.http.RetryingHttpClient
import java.time.Clock
import java.util.Base64

class ClientOptions
private constructor(
    val httpClient: HttpClient,
    val jsonMapper: JsonMapper,
    val clock: Clock,
    val baseUrl: String,
    val apiKey: String,
    val organizationId: String,
    val webhookKey: String?,
    val headers: ListMultimap<String, String>,
    val responseValidation: Boolean,
) {

    companion object {

        const val PRODUCTION_URL = "https://app.moderntreasury.com"

        fun builder() = Builder()

        fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    class Builder {

        private var httpClient: HttpClient? = null
        private var jsonMapper: JsonMapper? = null
        private var clock: Clock = Clock.systemUTC()
        private var baseUrl: String = PRODUCTION_URL
        private var headers: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var responseValidation: Boolean = false
        private var maxRetries: Int = 2
        private var apiKey: String? = null
        private var organizationId: String? = null
        private var webhookKey: String? = null

        fun httpClient(httpClient: HttpClient) = apply { this.httpClient = httpClient }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { this.jsonMapper = jsonMapper }

        fun baseUrl(baseUrl: String) = apply { this.baseUrl = baseUrl }

        fun clock(clock: Clock) = apply { this.clock = clock }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply {
            this.headers.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.headers.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            headers.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.headers.put(name, mutableListOf()) }

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
            headers.put("X-Stainless-Lang", "kotlin")
            headers.put("X-Stainless-Arch", getOsArch())
            headers.put("X-Stainless-OS", getOsName())
            headers.put("X-Stainless-OS-Version", getOsVersion())
            headers.put("X-Stainless-Package-Version", getPackageVersion())
            headers.put("X-Stainless-Runtime-Version", getJavaVersion())
            headers.put(
                "Authorization",
                "Basic ${Base64.getEncoder().encodeToString("${organizationId}:${apiKey}".toByteArray())}"
            )
            this.headers.forEach(headers::replaceValues)

            return ClientOptions(
                RetryingHttpClient.builder()
                    .httpClient(httpClient!!)
                    .clock(clock)
                    .maxRetries(maxRetries)
                    .idempotencyHeader("Idempotency-Key")
                    .build(),
                jsonMapper ?: jsonMapper(),
                clock,
                baseUrl,
                apiKey!!,
                organizationId!!,
                webhookKey,
                headers.toUnmodifiable(),
                responseValidation,
            )
        }
    }
}
