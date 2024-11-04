// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects

class ConnectionLegalEntityListParams
constructor(
    private val afterCursor: String?,
    private val connectionId: String?,
    private val legalEntityId: String?,
    private val perPage: Long?,
    private val status: Status?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun connectionId(): String? = connectionId

    fun legalEntityId(): String? = legalEntityId

    fun perPage(): Long? = perPage

    fun status(): Status? = status

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.connectionId?.let { params.put("connection_id", listOf(it.toString())) }
        this.legalEntityId?.let { params.put("legal_entity_id", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.status?.let { params.put("status", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConnectionLegalEntityListParams && this.afterCursor == other.afterCursor && this.connectionId == other.connectionId && this.legalEntityId == other.legalEntityId && this.perPage == other.perPage && this.status == other.status && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(afterCursor, connectionId, legalEntityId, perPage, status, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "ConnectionLegalEntityListParams{afterCursor=$afterCursor, connectionId=$connectionId, legalEntityId=$legalEntityId, perPage=$perPage, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var connectionId: String? = null
        private var legalEntityId: String? = null
        private var perPage: Long? = null
        private var status: Status? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        internal fun from(connectionLegalEntityListParams: ConnectionLegalEntityListParams) =
            apply {
                this.afterCursor = connectionLegalEntityListParams.afterCursor
                this.connectionId = connectionLegalEntityListParams.connectionId
                this.legalEntityId = connectionLegalEntityListParams.legalEntityId
                this.perPage = connectionLegalEntityListParams.perPage
                this.status = connectionLegalEntityListParams.status
                additionalHeaders(connectionLegalEntityListParams.additionalHeaders)
                additionalQueryParams(connectionLegalEntityListParams.additionalQueryParams)
            }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        fun connectionId(connectionId: String) = apply { this.connectionId = connectionId }

        fun legalEntityId(legalEntityId: String) = apply { this.legalEntityId = legalEntityId }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        fun status(status: Status) = apply { this.status = status }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

        fun build(): ConnectionLegalEntityListParams =
            ConnectionLegalEntityListParams(
                afterCursor,
                connectionId,
                legalEntityId,
                perPage,
                status,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val COMPLETED = Status(JsonField.of("completed"))

            val DENIED = Status(JsonField.of("denied"))

            val FAILED = Status(JsonField.of("failed"))

            val PROCESSING = Status(JsonField.of("processing"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            COMPLETED,
            DENIED,
            FAILED,
            PROCESSING,
        }

        enum class Value {
            COMPLETED,
            DENIED,
            FAILED,
            PROCESSING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMPLETED -> Value.COMPLETED
                DENIED -> Value.DENIED
                FAILED -> Value.FAILED
                PROCESSING -> Value.PROCESSING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COMPLETED -> Known.COMPLETED
                DENIED -> Known.DENIED
                FAILED -> Known.FAILED
                PROCESSING -> Known.PROCESSING
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
