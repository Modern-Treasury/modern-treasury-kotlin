// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects

class LedgerTransactionListParams
constructor(
    private val id: List<String>?,
    private val afterCursor: String?,
    private val effectiveAt: EffectiveAt?,
    private val effectiveDate: EffectiveDate?,
    private val externalId: String?,
    private val ledgerAccountCategoryId: String?,
    private val ledgerAccountId: String?,
    private val ledgerAccountSettlementId: String?,
    private val ledgerId: String?,
    private val ledgerableId: String?,
    private val ledgerableType: LedgerableType?,
    private val metadata: Metadata?,
    private val orderBy: OrderBy?,
    private val perPage: Long?,
    private val postedAt: PostedAt?,
    private val reversesLedgerTransactionId: String?,
    private val status: Status?,
    private val updatedAt: UpdatedAt?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun id(): List<String>? = id

    fun afterCursor(): String? = afterCursor

    fun effectiveAt(): EffectiveAt? = effectiveAt

    fun effectiveDate(): EffectiveDate? = effectiveDate

    fun externalId(): String? = externalId

    fun ledgerAccountCategoryId(): String? = ledgerAccountCategoryId

    fun ledgerAccountId(): String? = ledgerAccountId

    fun ledgerAccountSettlementId(): String? = ledgerAccountSettlementId

    fun ledgerId(): String? = ledgerId

    fun ledgerableId(): String? = ledgerableId

    fun ledgerableType(): LedgerableType? = ledgerableType

    fun metadata(): Metadata? = metadata

    fun orderBy(): OrderBy? = orderBy

    fun perPage(): Long? = perPage

    fun postedAt(): PostedAt? = postedAt

    fun reversesLedgerTransactionId(): String? = reversesLedgerTransactionId

    fun status(): Status? = status

    fun updatedAt(): UpdatedAt? = updatedAt

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.id?.let { params.put("id[]", it.map(Any::toString)) }
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.effectiveAt?.forEachQueryParam { key, values ->
            params.put("effective_at[$key]", values)
        }
        this.effectiveDate?.forEachQueryParam { key, values ->
            params.put("effective_date[$key]", values)
        }
        this.externalId?.let { params.put("external_id", listOf(it.toString())) }
        this.ledgerAccountCategoryId?.let {
            params.put("ledger_account_category_id", listOf(it.toString()))
        }
        this.ledgerAccountId?.let { params.put("ledger_account_id", listOf(it.toString())) }
        this.ledgerAccountSettlementId?.let {
            params.put("ledger_account_settlement_id", listOf(it.toString()))
        }
        this.ledgerId?.let { params.put("ledger_id", listOf(it.toString())) }
        this.ledgerableId?.let { params.put("ledgerable_id", listOf(it.toString())) }
        this.ledgerableType?.let { params.put("ledgerable_type", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values -> params.put("metadata[$key]", values) }
        this.orderBy?.forEachQueryParam { key, values -> params.put("order_by[$key]", values) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.postedAt?.forEachQueryParam { key, values -> params.put("posted_at[$key]", values) }
        this.reversesLedgerTransactionId?.let {
            params.put("reverses_ledger_transaction_id", listOf(it.toString()))
        }
        this.status?.let { params.put("status", listOf(it.toString())) }
        this.updatedAt?.forEachQueryParam { key, values -> params.put("updated_at[$key]", values) }
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

        return other is LedgerTransactionListParams &&
            this.id == other.id &&
            this.afterCursor == other.afterCursor &&
            this.effectiveAt == other.effectiveAt &&
            this.effectiveDate == other.effectiveDate &&
            this.externalId == other.externalId &&
            this.ledgerAccountCategoryId == other.ledgerAccountCategoryId &&
            this.ledgerAccountId == other.ledgerAccountId &&
            this.ledgerAccountSettlementId == other.ledgerAccountSettlementId &&
            this.ledgerId == other.ledgerId &&
            this.ledgerableId == other.ledgerableId &&
            this.ledgerableType == other.ledgerableType &&
            this.metadata == other.metadata &&
            this.orderBy == other.orderBy &&
            this.perPage == other.perPage &&
            this.postedAt == other.postedAt &&
            this.reversesLedgerTransactionId == other.reversesLedgerTransactionId &&
            this.status == other.status &&
            this.updatedAt == other.updatedAt &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            id,
            afterCursor,
            effectiveAt,
            effectiveDate,
            externalId,
            ledgerAccountCategoryId,
            ledgerAccountId,
            ledgerAccountSettlementId,
            ledgerId,
            ledgerableId,
            ledgerableType,
            metadata,
            orderBy,
            perPage,
            postedAt,
            reversesLedgerTransactionId,
            status,
            updatedAt,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "LedgerTransactionListParams{id=$id, afterCursor=$afterCursor, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, externalId=$externalId, ledgerAccountCategoryId=$ledgerAccountCategoryId, ledgerAccountId=$ledgerAccountId, ledgerAccountSettlementId=$ledgerAccountSettlementId, ledgerId=$ledgerId, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, orderBy=$orderBy, perPage=$perPage, postedAt=$postedAt, reversesLedgerTransactionId=$reversesLedgerTransactionId, status=$status, updatedAt=$updatedAt, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: MutableList<String> = mutableListOf()
        private var afterCursor: String? = null
        private var effectiveAt: EffectiveAt? = null
        private var effectiveDate: EffectiveDate? = null
        private var externalId: String? = null
        private var ledgerAccountCategoryId: String? = null
        private var ledgerAccountId: String? = null
        private var ledgerAccountSettlementId: String? = null
        private var ledgerId: String? = null
        private var ledgerableId: String? = null
        private var ledgerableType: LedgerableType? = null
        private var metadata: Metadata? = null
        private var orderBy: OrderBy? = null
        private var perPage: Long? = null
        private var postedAt: PostedAt? = null
        private var reversesLedgerTransactionId: String? = null
        private var status: Status? = null
        private var updatedAt: UpdatedAt? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(ledgerTransactionListParams: LedgerTransactionListParams) = apply {
            this.id(ledgerTransactionListParams.id ?: listOf())
            this.afterCursor = ledgerTransactionListParams.afterCursor
            this.effectiveAt = ledgerTransactionListParams.effectiveAt
            this.effectiveDate = ledgerTransactionListParams.effectiveDate
            this.externalId = ledgerTransactionListParams.externalId
            this.ledgerAccountCategoryId = ledgerTransactionListParams.ledgerAccountCategoryId
            this.ledgerAccountId = ledgerTransactionListParams.ledgerAccountId
            this.ledgerAccountSettlementId = ledgerTransactionListParams.ledgerAccountSettlementId
            this.ledgerId = ledgerTransactionListParams.ledgerId
            this.ledgerableId = ledgerTransactionListParams.ledgerableId
            this.ledgerableType = ledgerTransactionListParams.ledgerableType
            this.metadata = ledgerTransactionListParams.metadata
            this.orderBy = ledgerTransactionListParams.orderBy
            this.perPage = ledgerTransactionListParams.perPage
            this.postedAt = ledgerTransactionListParams.postedAt
            this.reversesLedgerTransactionId =
                ledgerTransactionListParams.reversesLedgerTransactionId
            this.status = ledgerTransactionListParams.status
            this.updatedAt = ledgerTransactionListParams.updatedAt
            additionalQueryParams(ledgerTransactionListParams.additionalQueryParams)
            additionalHeaders(ledgerTransactionListParams.additionalHeaders)
        }

        /**
         * If you have specific IDs to retrieve in bulk, you can pass them as query parameters
         * delimited with `id[]=`, for example `?id[]=123&id[]=abc`.
         */
        fun id(id: List<String>) = apply {
            this.id.clear()
            this.id.addAll(id)
        }

        /**
         * If you have specific IDs to retrieve in bulk, you can pass them as query parameters
         * delimited with `id[]=`, for example `?id[]=123&id[]=abc`.
         */
        fun addId(id: String) = apply { this.id.add(id) }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        /**
         * Use "gt" (>), "gte" (>=), "lt" (<), "lte" (<=), or "eq" (=) to filter by effective at.
         * For example, for all transactions after Jan 1 2000, use
         * effective_at%5Bgt%5D=2000-01-01T00:00:00:00.000Z.
         */
        fun effectiveAt(effectiveAt: EffectiveAt) = apply { this.effectiveAt = effectiveAt }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by effective date.
         * For example, for all dates after Jan 1 2000, use effective_date%5Bgt%5D=2000-01-01.
         */
        fun effectiveDate(effectiveDate: EffectiveDate) = apply {
            this.effectiveDate = effectiveDate
        }

        fun externalId(externalId: String) = apply { this.externalId = externalId }

        fun ledgerAccountCategoryId(ledgerAccountCategoryId: String) = apply {
            this.ledgerAccountCategoryId = ledgerAccountCategoryId
        }

        fun ledgerAccountId(ledgerAccountId: String) = apply {
            this.ledgerAccountId = ledgerAccountId
        }

        fun ledgerAccountSettlementId(ledgerAccountSettlementId: String) = apply {
            this.ledgerAccountSettlementId = ledgerAccountSettlementId
        }

        fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

        fun ledgerableId(ledgerableId: String) = apply { this.ledgerableId = ledgerableId }

        fun ledgerableType(ledgerableType: LedgerableType) = apply {
            this.ledgerableType = ledgerableType
        }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /**
         * Order by `created_at` or `effective_at` in `asc` or `desc` order. For example, to order
         * by `effective_at asc`, use `order_by%5Beffective_at%5D=asc`. Ordering by only one field
         * at a time is supported.
         */
        fun orderBy(orderBy: OrderBy) = apply { this.orderBy = orderBy }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the posted at
         * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
         * posted_at%5Bgt%5D=2000-01-01T12:00:00Z.
         */
        fun postedAt(postedAt: PostedAt) = apply { this.postedAt = postedAt }

        fun reversesLedgerTransactionId(reversesLedgerTransactionId: String) = apply {
            this.reversesLedgerTransactionId = reversesLedgerTransactionId
        }

        fun status(status: Status) = apply { this.status = status }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the posted at
         * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
         * updated_at%5Bgt%5D=2000-01-01T12:00:00Z.
         */
        fun updatedAt(updatedAt: UpdatedAt) = apply { this.updatedAt = updatedAt }

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

        fun build(): LedgerTransactionListParams =
            LedgerTransactionListParams(
                if (id.size == 0) null else id.toUnmodifiable(),
                afterCursor,
                effectiveAt,
                effectiveDate,
                externalId,
                ledgerAccountCategoryId,
                ledgerAccountId,
                ledgerAccountSettlementId,
                ledgerId,
                ledgerableId,
                ledgerableType,
                metadata,
                orderBy,
                perPage,
                postedAt,
                reversesLedgerTransactionId,
                status,
                updatedAt,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    /**
     * Use "gt" (>), "gte" (>=), "lt" (<), "lte" (<=), or "eq" (=) to filter by effective at. For
     * example, for all transactions after Jan 1 2000, use
     * effective_at%5Bgt%5D=2000-01-01T00:00:00:00.000Z.
     */
    @JsonDeserialize(builder = EffectiveAt.Builder::class)
    @NoAutoDetect
    class EffectiveAt
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

            internal fun from(effectiveAt: EffectiveAt) = apply {
                additionalProperties(effectiveAt.additionalProperties)
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

            fun build(): EffectiveAt = EffectiveAt(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EffectiveAt && this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "EffectiveAt{additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by effective date. For
     * example, for all dates after Jan 1 2000, use effective_date%5Bgt%5D=2000-01-01.
     */
    @JsonDeserialize(builder = EffectiveDate.Builder::class)
    @NoAutoDetect
    class EffectiveDate
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

            internal fun from(effectiveDate: EffectiveDate) = apply {
                additionalProperties(effectiveDate.additionalProperties)
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

            fun build(): EffectiveDate = EffectiveDate(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EffectiveDate && this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "EffectiveDate{additionalProperties=$additionalProperties}"
    }

    class LedgerableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LedgerableType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val EXPECTED_PAYMENT = LedgerableType(JsonField.of("expected_payment"))

            val INCOMING_PAYMENT_DETAIL = LedgerableType(JsonField.of("incoming_payment_detail"))

            val PAPER_ITEM = LedgerableType(JsonField.of("paper_item"))

            val PAYMENT_ORDER = LedgerableType(JsonField.of("payment_order"))

            val RETURN = LedgerableType(JsonField.of("return"))

            val REVERSAL = LedgerableType(JsonField.of("reversal"))

            fun of(value: String) = LedgerableType(JsonField.of(value))
        }

        enum class Known {
            EXPECTED_PAYMENT,
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
        }

        enum class Value {
            EXPECTED_PAYMENT,
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Value.PAPER_ITEM
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                RETURN -> Value.RETURN
                REVERSAL -> Value.REVERSAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Known.PAPER_ITEM
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                RETURN -> Known.RETURN
                REVERSAL -> Known.REVERSAL
                else -> throw ModernTreasuryInvalidDataException("Unknown LedgerableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /**
     * Order by `created_at` or `effective_at` in `asc` or `desc` order. For example, to order by
     * `effective_at asc`, use `order_by%5Beffective_at%5D=asc`. Ordering by only one field at a
     * time is supported.
     */
    @JsonDeserialize(builder = OrderBy.Builder::class)
    @NoAutoDetect
    class OrderBy
    private constructor(
        private val createdAt: CreatedAt?,
        private val effectiveAt: EffectiveAt?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        fun createdAt(): CreatedAt? = createdAt

        fun effectiveAt(): EffectiveAt? = effectiveAt

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.createdAt?.let { putParam("created_at", listOf(it.toString())) }
            this.effectiveAt?.let { putParam("effective_at", listOf(it.toString())) }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var createdAt: CreatedAt? = null
            private var effectiveAt: EffectiveAt? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            internal fun from(orderBy: OrderBy) = apply {
                this.createdAt = orderBy.createdAt
                this.effectiveAt = orderBy.effectiveAt
                additionalProperties(orderBy.additionalProperties)
            }

            fun createdAt(createdAt: CreatedAt) = apply { this.createdAt = createdAt }

            fun effectiveAt(effectiveAt: EffectiveAt) = apply { this.effectiveAt = effectiveAt }

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

            fun build(): OrderBy =
                OrderBy(
                    createdAt,
                    effectiveAt,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class CreatedAt
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreatedAt && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ASC = CreatedAt(JsonField.of("asc"))

                val DESC = CreatedAt(JsonField.of("desc"))

                fun of(value: String) = CreatedAt(JsonField.of(value))
            }

            enum class Known {
                ASC,
                DESC,
            }

            enum class Value {
                ASC,
                DESC,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ASC -> Value.ASC
                    DESC -> Value.DESC
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ASC -> Known.ASC
                    DESC -> Known.DESC
                    else -> throw ModernTreasuryInvalidDataException("Unknown CreatedAt: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class EffectiveAt
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EffectiveAt && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ASC = EffectiveAt(JsonField.of("asc"))

                val DESC = EffectiveAt(JsonField.of("desc"))

                fun of(value: String) = EffectiveAt(JsonField.of(value))
            }

            enum class Known {
                ASC,
                DESC,
            }

            enum class Value {
                ASC,
                DESC,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ASC -> Value.ASC
                    DESC -> Value.DESC
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ASC -> Known.ASC
                    DESC -> Known.DESC
                    else -> throw ModernTreasuryInvalidDataException("Unknown EffectiveAt: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OrderBy &&
                this.createdAt == other.createdAt &&
                this.effectiveAt == other.effectiveAt &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        createdAt,
                        effectiveAt,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "OrderBy{createdAt=$createdAt, effectiveAt=$effectiveAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the posted at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * posted_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    @JsonDeserialize(builder = PostedAt.Builder::class)
    @NoAutoDetect
    class PostedAt
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

            internal fun from(postedAt: PostedAt) = apply {
                additionalProperties(postedAt.additionalProperties)
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

            fun build(): PostedAt = PostedAt(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PostedAt && this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "PostedAt{additionalProperties=$additionalProperties}"
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

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PENDING = Status(JsonField.of("pending"))

            val POSTED = Status(JsonField.of("posted"))

            val ARCHIVED = Status(JsonField.of("archived"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            POSTED,
            ARCHIVED,
        }

        enum class Value {
            PENDING,
            POSTED,
            ARCHIVED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                POSTED -> Value.POSTED
                ARCHIVED -> Value.ARCHIVED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                POSTED -> Known.POSTED
                ARCHIVED -> Known.ARCHIVED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the posted at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * updated_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    @JsonDeserialize(builder = UpdatedAt.Builder::class)
    @NoAutoDetect
    class UpdatedAt
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

            internal fun from(updatedAt: UpdatedAt) = apply {
                additionalProperties(updatedAt.additionalProperties)
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

            fun build(): UpdatedAt = UpdatedAt(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UpdatedAt && this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "UpdatedAt{additionalProperties=$additionalProperties}"
    }
}
