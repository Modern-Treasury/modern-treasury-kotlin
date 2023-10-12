// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects

class LedgerEntryListParams
constructor(
    private val id: List<String>?,
    private val afterCursor: String?,
    private val asOfLockVersion: Long?,
    private val direction: Direction?,
    private val effectiveAt: EffectiveAt?,
    private val effectiveDate: EffectiveDate?,
    private val ledgerAccountCategoryId: String?,
    private val ledgerAccountId: String?,
    private val ledgerAccountLockVersion: LedgerAccountLockVersion?,
    private val ledgerAccountPayoutId: String?,
    private val ledgerAccountStatementId: String?,
    private val ledgerTransactionId: String?,
    private val metadata: Metadata?,
    private val orderBy: OrderBy?,
    private val perPage: Long?,
    private val showBalances: Boolean?,
    private val showDeleted: Boolean?,
    private val status: Status?,
    private val updatedAt: UpdatedAt?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun id(): List<String>? = id

    fun afterCursor(): String? = afterCursor

    fun asOfLockVersion(): Long? = asOfLockVersion

    fun direction(): Direction? = direction

    fun effectiveAt(): EffectiveAt? = effectiveAt

    fun effectiveDate(): EffectiveDate? = effectiveDate

    fun ledgerAccountCategoryId(): String? = ledgerAccountCategoryId

    fun ledgerAccountId(): String? = ledgerAccountId

    fun ledgerAccountLockVersion(): LedgerAccountLockVersion? = ledgerAccountLockVersion

    fun ledgerAccountPayoutId(): String? = ledgerAccountPayoutId

    fun ledgerAccountStatementId(): String? = ledgerAccountStatementId

    fun ledgerTransactionId(): String? = ledgerTransactionId

    fun metadata(): Metadata? = metadata

    fun orderBy(): OrderBy? = orderBy

    fun perPage(): Long? = perPage

    fun showBalances(): Boolean? = showBalances

    fun showDeleted(): Boolean? = showDeleted

    fun status(): Status? = status

    fun updatedAt(): UpdatedAt? = updatedAt

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.id?.let { params.put("id[]", it.map(Any::toString)) }
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.asOfLockVersion?.let { params.put("as_of_lock_version", listOf(it.toString())) }
        this.direction?.let { params.put("direction", listOf(it.toString())) }
        this.effectiveAt?.forEachQueryParam { key, values ->
            params.put("effective_at[$key]", values)
        }
        this.effectiveDate?.forEachQueryParam { key, values ->
            params.put("effective_date[$key]", values)
        }
        this.ledgerAccountCategoryId?.let {
            params.put("ledger_account_category_id", listOf(it.toString()))
        }
        this.ledgerAccountId?.let { params.put("ledger_account_id", listOf(it.toString())) }
        this.ledgerAccountLockVersion?.forEachQueryParam { key, values ->
            params.put("ledger_account_lock_version[$key]", values)
        }
        this.ledgerAccountPayoutId?.let {
            params.put("ledger_account_payout_id", listOf(it.toString()))
        }
        this.ledgerAccountStatementId?.let {
            params.put("ledger_account_statement_id", listOf(it.toString()))
        }
        this.ledgerTransactionId?.let { params.put("ledger_transaction_id", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values -> params.put("metadata[$key]", values) }
        this.orderBy?.forEachQueryParam { key, values -> params.put("order_by[$key]", values) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.showBalances?.let { params.put("show_balances", listOf(it.toString())) }
        this.showDeleted?.let { params.put("show_deleted", listOf(it.toString())) }
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

        return other is LedgerEntryListParams &&
            this.id == other.id &&
            this.afterCursor == other.afterCursor &&
            this.asOfLockVersion == other.asOfLockVersion &&
            this.direction == other.direction &&
            this.effectiveAt == other.effectiveAt &&
            this.effectiveDate == other.effectiveDate &&
            this.ledgerAccountCategoryId == other.ledgerAccountCategoryId &&
            this.ledgerAccountId == other.ledgerAccountId &&
            this.ledgerAccountLockVersion == other.ledgerAccountLockVersion &&
            this.ledgerAccountPayoutId == other.ledgerAccountPayoutId &&
            this.ledgerAccountStatementId == other.ledgerAccountStatementId &&
            this.ledgerTransactionId == other.ledgerTransactionId &&
            this.metadata == other.metadata &&
            this.orderBy == other.orderBy &&
            this.perPage == other.perPage &&
            this.showBalances == other.showBalances &&
            this.showDeleted == other.showDeleted &&
            this.status == other.status &&
            this.updatedAt == other.updatedAt &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            id,
            afterCursor,
            asOfLockVersion,
            direction,
            effectiveAt,
            effectiveDate,
            ledgerAccountCategoryId,
            ledgerAccountId,
            ledgerAccountLockVersion,
            ledgerAccountPayoutId,
            ledgerAccountStatementId,
            ledgerTransactionId,
            metadata,
            orderBy,
            perPage,
            showBalances,
            showDeleted,
            status,
            updatedAt,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "LedgerEntryListParams{id=$id, afterCursor=$afterCursor, asOfLockVersion=$asOfLockVersion, direction=$direction, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, ledgerAccountCategoryId=$ledgerAccountCategoryId, ledgerAccountId=$ledgerAccountId, ledgerAccountLockVersion=$ledgerAccountLockVersion, ledgerAccountPayoutId=$ledgerAccountPayoutId, ledgerAccountStatementId=$ledgerAccountStatementId, ledgerTransactionId=$ledgerTransactionId, metadata=$metadata, orderBy=$orderBy, perPage=$perPage, showBalances=$showBalances, showDeleted=$showDeleted, status=$status, updatedAt=$updatedAt, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: MutableList<String> = mutableListOf()
        private var afterCursor: String? = null
        private var asOfLockVersion: Long? = null
        private var direction: Direction? = null
        private var effectiveAt: EffectiveAt? = null
        private var effectiveDate: EffectiveDate? = null
        private var ledgerAccountCategoryId: String? = null
        private var ledgerAccountId: String? = null
        private var ledgerAccountLockVersion: LedgerAccountLockVersion? = null
        private var ledgerAccountPayoutId: String? = null
        private var ledgerAccountStatementId: String? = null
        private var ledgerTransactionId: String? = null
        private var metadata: Metadata? = null
        private var orderBy: OrderBy? = null
        private var perPage: Long? = null
        private var showBalances: Boolean? = null
        private var showDeleted: Boolean? = null
        private var status: Status? = null
        private var updatedAt: UpdatedAt? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(ledgerEntryListParams: LedgerEntryListParams) = apply {
            this.id(ledgerEntryListParams.id ?: listOf())
            this.afterCursor = ledgerEntryListParams.afterCursor
            this.asOfLockVersion = ledgerEntryListParams.asOfLockVersion
            this.direction = ledgerEntryListParams.direction
            this.effectiveAt = ledgerEntryListParams.effectiveAt
            this.effectiveDate = ledgerEntryListParams.effectiveDate
            this.ledgerAccountCategoryId = ledgerEntryListParams.ledgerAccountCategoryId
            this.ledgerAccountId = ledgerEntryListParams.ledgerAccountId
            this.ledgerAccountLockVersion = ledgerEntryListParams.ledgerAccountLockVersion
            this.ledgerAccountPayoutId = ledgerEntryListParams.ledgerAccountPayoutId
            this.ledgerAccountStatementId = ledgerEntryListParams.ledgerAccountStatementId
            this.ledgerTransactionId = ledgerEntryListParams.ledgerTransactionId
            this.metadata = ledgerEntryListParams.metadata
            this.orderBy = ledgerEntryListParams.orderBy
            this.perPage = ledgerEntryListParams.perPage
            this.showBalances = ledgerEntryListParams.showBalances
            this.showDeleted = ledgerEntryListParams.showDeleted
            this.status = ledgerEntryListParams.status
            this.updatedAt = ledgerEntryListParams.updatedAt
            additionalQueryParams(ledgerEntryListParams.additionalQueryParams)
            additionalHeaders(ledgerEntryListParams.additionalHeaders)
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
         * Shows all ledger entries that were present on a ledger account at a particular
         * `lock_version`. You must also specify `ledger_account_id`.
         */
        fun asOfLockVersion(asOfLockVersion: Long) = apply {
            this.asOfLockVersion = asOfLockVersion
        }

        /**
         * If true, response will include ledger entries that were deleted. When you update a ledger
         * transaction to specify a new set of entries, the previous entries are deleted.
         */
        fun direction(direction: Direction) = apply { this.direction = direction }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the
         * transaction's effective time. Format ISO8601
         */
        fun effectiveAt(effectiveAt: EffectiveAt) = apply { this.effectiveAt = effectiveAt }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the
         * transaction's effective date. Format YYYY-MM-DD
         */
        fun effectiveDate(effectiveDate: EffectiveDate) = apply {
            this.effectiveDate = effectiveDate
        }

        /** Get all ledger entries that match the direction specified. One of `credit`, `debit`. */
        fun ledgerAccountCategoryId(ledgerAccountCategoryId: String) = apply {
            this.ledgerAccountCategoryId = ledgerAccountCategoryId
        }

        fun ledgerAccountId(ledgerAccountId: String) = apply {
            this.ledgerAccountId = ledgerAccountId
        }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the lock_version
         * of a ledger account. For example, for all entries created at or before before
         * lock_version 1000 of a ledger account, use `ledger_account_lock_version%5Blte%5D=1000`.
         */
        fun ledgerAccountLockVersion(ledgerAccountLockVersion: LedgerAccountLockVersion) = apply {
            this.ledgerAccountLockVersion = ledgerAccountLockVersion
        }

        fun ledgerAccountPayoutId(ledgerAccountPayoutId: String) = apply {
            this.ledgerAccountPayoutId = ledgerAccountPayoutId
        }

        /** Get all ledger entries that are included in the ledger account statement. */
        fun ledgerAccountStatementId(ledgerAccountStatementId: String) = apply {
            this.ledgerAccountStatementId = ledgerAccountStatementId
        }

        fun ledgerTransactionId(ledgerTransactionId: String) = apply {
            this.ledgerTransactionId = ledgerTransactionId
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
         * If true, response will include the balances attached to the ledger entry. If there is no
         * balance available, null will be returned instead.
         */
        fun showBalances(showBalances: Boolean) = apply { this.showBalances = showBalances }

        /**
         * If true, response will include ledger entries that were deleted. When you update a ledger
         * transaction to specify a new set of entries, the previous entries are deleted.
         */
        fun showDeleted(showDeleted: Boolean) = apply { this.showDeleted = showDeleted }

        /**
         * Get all ledger entries that match the status specified. One of `pending`, `posted`, or
         * `archived`.
         */
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

        fun build(): LedgerEntryListParams =
            LedgerEntryListParams(
                if (id.size == 0) null else id.toUnmodifiable(),
                afterCursor,
                asOfLockVersion,
                direction,
                effectiveAt,
                effectiveDate,
                ledgerAccountCategoryId,
                ledgerAccountId,
                ledgerAccountLockVersion,
                ledgerAccountPayoutId,
                ledgerAccountStatementId,
                ledgerTransactionId,
                metadata,
                orderBy,
                perPage,
                showBalances,
                showDeleted,
                status,
                updatedAt,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Direction && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CREDIT = Direction(JsonField.of("credit"))

            val DEBIT = Direction(JsonField.of("debit"))

            fun of(value: String) = Direction(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
            DEBIT,
        }

        enum class Value {
            CREDIT,
            DEBIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the transaction's
     * effective time. Format ISO8601
     */
    @JsonDeserialize(builder = EffectiveAt.Builder::class)
    @NoAutoDetect
    class EffectiveAt
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

            return other is EffectiveAt && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "EffectiveAt{additionalProperties=$additionalProperties}"

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
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the transaction's
     * effective date. Format YYYY-MM-DD
     */
    @JsonDeserialize(builder = EffectiveDate.Builder::class)
    @NoAutoDetect
    class EffectiveDate
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

            return other is EffectiveDate && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "EffectiveDate{additionalProperties=$additionalProperties}"

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
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the lock_version of
     * a ledger account. For example, for all entries created at or before before lock_version 1000
     * of a ledger account, use `ledger_account_lock_version%5Blte%5D=1000`.
     */
    @JsonDeserialize(builder = LedgerAccountLockVersion.Builder::class)
    @NoAutoDetect
    class LedgerAccountLockVersion
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

            return other is LedgerAccountLockVersion &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "LedgerAccountLockVersion{additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            internal fun from(ledgerAccountLockVersion: LedgerAccountLockVersion) = apply {
                additionalProperties(ledgerAccountLockVersion.additionalProperties)
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

            fun build(): LedgerAccountLockVersion =
                LedgerAccountLockVersion(additionalProperties.toUnmodifiable())
        }
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

        private var hashCode: Int = 0

        fun createdAt(): CreatedAt? = createdAt

        fun effectiveAt(): EffectiveAt? = effectiveAt

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.createdAt?.let { putParam("created_at", listOf(it.toString())) }
            this.effectiveAt?.let { putParam("effective_at", listOf(it.toString())) }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OrderBy &&
                this.createdAt == other.createdAt &&
                this.effectiveAt == other.effectiveAt &&
                this.additionalProperties == other.additionalProperties
        }

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
        ) {

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
        ) {

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
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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

            return other is UpdatedAt && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "UpdatedAt{additionalProperties=$additionalProperties}"

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
    }
}
