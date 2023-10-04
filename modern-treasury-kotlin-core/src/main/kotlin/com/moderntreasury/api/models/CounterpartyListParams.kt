// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class CounterpartyListParams
constructor(
    private val afterCursor: String?,
    private val perPage: Long?,
    private val name: String?,
    private val email: String?,
    private val metadata: Metadata?,
    private val createdAtLowerBound: OffsetDateTime?,
    private val createdAtUpperBound: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun perPage(): Long? = perPage

    fun name(): String? = name

    fun email(): String? = email

    fun metadata(): Metadata? = metadata

    fun createdAtLowerBound(): OffsetDateTime? = createdAtLowerBound

    fun createdAtUpperBound(): OffsetDateTime? = createdAtUpperBound

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.name?.let { params.put("name", listOf(it.toString())) }
        this.email?.let { params.put("email", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values -> params.put("metadata[$key]", values) }
        this.createdAtLowerBound?.let {
            params.put("created_at_lower_bound", listOf(it.toString()))
        }
        this.createdAtUpperBound?.let {
            params.put("created_at_upper_bound", listOf(it.toString()))
        }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CounterpartyListParams &&
            this.afterCursor == other.afterCursor &&
            this.perPage == other.perPage &&
            this.name == other.name &&
            this.email == other.email &&
            this.metadata == other.metadata &&
            this.createdAtLowerBound == other.createdAtLowerBound &&
            this.createdAtUpperBound == other.createdAtUpperBound &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            afterCursor,
            perPage,
            name,
            email,
            metadata,
            createdAtLowerBound,
            createdAtUpperBound,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "CounterpartyListParams{afterCursor=$afterCursor, perPage=$perPage, name=$name, email=$email, metadata=$metadata, createdAtLowerBound=$createdAtLowerBound, createdAtUpperBound=$createdAtUpperBound, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var perPage: Long? = null
        private var name: String? = null
        private var email: String? = null
        private var metadata: Metadata? = null
        private var createdAtLowerBound: OffsetDateTime? = null
        private var createdAtUpperBound: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(counterpartyListParams: CounterpartyListParams) = apply {
            this.afterCursor = counterpartyListParams.afterCursor
            this.perPage = counterpartyListParams.perPage
            this.name = counterpartyListParams.name
            this.email = counterpartyListParams.email
            this.metadata = counterpartyListParams.metadata
            this.createdAtLowerBound = counterpartyListParams.createdAtLowerBound
            this.createdAtUpperBound = counterpartyListParams.createdAtUpperBound
            additionalQueryParams(counterpartyListParams.additionalQueryParams)
            additionalHeaders(counterpartyListParams.additionalHeaders)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /** Performs a partial string match of the name field. This is also case insensitive. */
        fun name(name: String) = apply { this.name = name }

        /** Performs a partial string match of the email field. This is also case insensitive. */
        fun email(email: String) = apply { this.email = email }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** Used to return counterparties created after some datetime. */
        fun createdAtLowerBound(createdAtLowerBound: OffsetDateTime) = apply {
            this.createdAtLowerBound = createdAtLowerBound
        }

        /** Used to return counterparties created before some datetime. */
        fun createdAtUpperBound(createdAtUpperBound: OffsetDateTime) = apply {
            this.createdAtUpperBound = createdAtUpperBound
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): CounterpartyListParams =
            CounterpartyListParams(
                afterCursor,
                perPage,
                name,
                email,
                metadata,
                createdAtLowerBound,
                createdAtUpperBound,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, List<String>>,
    ) {

        private var hashCode: Int = 0

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }
}
