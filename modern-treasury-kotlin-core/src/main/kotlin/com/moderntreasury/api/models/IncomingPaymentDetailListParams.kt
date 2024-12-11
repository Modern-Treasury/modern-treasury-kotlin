// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.util.Objects

class IncomingPaymentDetailListParams
constructor(
    private val afterCursor: String?,
    private val asOfDateEnd: LocalDate?,
    private val asOfDateStart: LocalDate?,
    private val direction: TransactionDirection?,
    private val metadata: Metadata?,
    private val perPage: Long?,
    private val status: Status?,
    private val type: Type?,
    private val virtualAccountId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun afterCursor(): String? = afterCursor

    fun asOfDateEnd(): LocalDate? = asOfDateEnd

    fun asOfDateStart(): LocalDate? = asOfDateStart

    fun direction(): TransactionDirection? = direction

    fun metadata(): Metadata? = metadata

    fun perPage(): Long? = perPage

    fun status(): Status? = status

    fun type(): Type? = type

    fun virtualAccountId(): String? = virtualAccountId

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.asOfDateEnd?.let { queryParams.put("as_of_date_end", listOf(it.toString())) }
        this.asOfDateStart?.let { queryParams.put("as_of_date_start", listOf(it.toString())) }
        this.direction?.let { queryParams.put("direction", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values ->
            queryParams.put("metadata[$key]", values)
        }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        this.type?.let { queryParams.put("type", listOf(it.toString())) }
        this.virtualAccountId?.let { queryParams.put("virtual_account_id", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var asOfDateEnd: LocalDate? = null
        private var asOfDateStart: LocalDate? = null
        private var direction: TransactionDirection? = null
        private var metadata: Metadata? = null
        private var perPage: Long? = null
        private var status: Status? = null
        private var type: Type? = null
        private var virtualAccountId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(incomingPaymentDetailListParams: IncomingPaymentDetailListParams) =
            apply {
                afterCursor = incomingPaymentDetailListParams.afterCursor
                asOfDateEnd = incomingPaymentDetailListParams.asOfDateEnd
                asOfDateStart = incomingPaymentDetailListParams.asOfDateStart
                direction = incomingPaymentDetailListParams.direction
                metadata = incomingPaymentDetailListParams.metadata
                perPage = incomingPaymentDetailListParams.perPage
                status = incomingPaymentDetailListParams.status
                type = incomingPaymentDetailListParams.type
                virtualAccountId = incomingPaymentDetailListParams.virtualAccountId
                additionalHeaders = incomingPaymentDetailListParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    incomingPaymentDetailListParams.additionalQueryParams.toBuilder()
            }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        /**
         * Filters incoming payment details with an as_of_date starting on or before the specified
         * date (YYYY-MM-DD).
         */
        fun asOfDateEnd(asOfDateEnd: LocalDate) = apply { this.asOfDateEnd = asOfDateEnd }

        /**
         * Filters incoming payment details with an as_of_date starting on or after the specified
         * date (YYYY-MM-DD).
         */
        fun asOfDateStart(asOfDateStart: LocalDate) = apply { this.asOfDateStart = asOfDateStart }

        /** One of `credit` or `debit`. */
        fun direction(direction: TransactionDirection) = apply { this.direction = direction }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /**
         * The current status of the incoming payment order. One of `pending`, `completed`, or
         * `returned`.
         */
        fun status(status: Status) = apply { this.status = status }

        /** One of: `ach`, `book`, `check`, `eft`, `interac`, `rtp`, `sepa`, `signet`, or `wire`. */
        fun type(type: Type) = apply { this.type = type }

        /**
         * If the incoming payment detail is in a virtual account, the ID of the Virtual Account.
         */
        fun virtualAccountId(virtualAccountId: String) = apply {
            this.virtualAccountId = virtualAccountId
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): IncomingPaymentDetailListParams =
            IncomingPaymentDetailListParams(
                afterCursor,
                asOfDateEnd,
                asOfDateStart,
                direction,
                metadata,
                perPage,
                status,
                type,
                virtualAccountId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val COMPLETED = of("completed")

            val PENDING = of("pending")

            val RETURNED = of("returned")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            COMPLETED,
            PENDING,
            RETURNED,
        }

        enum class Value {
            COMPLETED,
            PENDING,
            RETURNED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMPLETED -> Value.COMPLETED
                PENDING -> Value.PENDING
                RETURNED -> Value.RETURNED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COMPLETED -> Known.COMPLETED
                PENDING -> Known.PENDING
                RETURNED -> Known.RETURNED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACH = of("ach")

            val BOOK = of("book")

            val CHECK = of("check")

            val EFT = of("eft")

            val INTERAC = of("interac")

            val RTP = of("rtp")

            val SEPA = of("sepa")

            val SIGNET = of("signet")

            val WIRE = of("wire")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ACH,
            BOOK,
            CHECK,
            EFT,
            INTERAC,
            RTP,
            SEPA,
            SIGNET,
            WIRE,
        }

        enum class Value {
            ACH,
            BOOK,
            CHECK,
            EFT,
            INTERAC,
            RTP,
            SEPA,
            SIGNET,
            WIRE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                BOOK -> Value.BOOK
                CHECK -> Value.CHECK
                EFT -> Value.EFT
                INTERAC -> Value.INTERAC
                RTP -> Value.RTP
                SEPA -> Value.SEPA
                SIGNET -> Value.SIGNET
                WIRE -> Value.WIRE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                BOOK -> Known.BOOK
                CHECK -> Known.CHECK
                EFT -> Known.EFT
                INTERAC -> Known.INTERAC
                RTP -> Known.RTP
                SEPA -> Known.SEPA
                SIGNET -> Known.SIGNET
                WIRE -> Known.WIRE
                else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IncomingPaymentDetailListParams && afterCursor == other.afterCursor && asOfDateEnd == other.asOfDateEnd && asOfDateStart == other.asOfDateStart && direction == other.direction && metadata == other.metadata && perPage == other.perPage && status == other.status && type == other.type && virtualAccountId == other.virtualAccountId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, asOfDateEnd, asOfDateStart, direction, metadata, perPage, status, type, virtualAccountId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "IncomingPaymentDetailListParams{afterCursor=$afterCursor, asOfDateEnd=$asOfDateEnd, asOfDateStart=$asOfDateStart, direction=$direction, metadata=$metadata, perPage=$perPage, status=$status, type=$type, virtualAccountId=$virtualAccountId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
