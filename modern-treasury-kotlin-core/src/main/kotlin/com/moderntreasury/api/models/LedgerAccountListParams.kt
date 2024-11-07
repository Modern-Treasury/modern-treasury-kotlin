// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class LedgerAccountListParams
constructor(
    private val id: List<String>?,
    private val afterCursor: String?,
    private val availableBalanceAmount: AvailableBalanceAmount?,
    private val balances: Balances?,
    private val createdAt: CreatedAt?,
    private val currency: String?,
    private val ledgerAccountCategoryId: String?,
    private val ledgerId: String?,
    private val metadata: Metadata?,
    private val name: List<String>?,
    private val pendingBalanceAmount: PendingBalanceAmount?,
    private val perPage: Long?,
    private val postedBalanceAmount: PostedBalanceAmount?,
    private val updatedAt: UpdatedAt?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun id(): List<String>? = id

    fun afterCursor(): String? = afterCursor

    fun availableBalanceAmount(): AvailableBalanceAmount? = availableBalanceAmount

    fun balances(): Balances? = balances

    fun createdAt(): CreatedAt? = createdAt

    fun currency(): String? = currency

    fun ledgerAccountCategoryId(): String? = ledgerAccountCategoryId

    fun ledgerId(): String? = ledgerId

    fun metadata(): Metadata? = metadata

    fun name(): List<String>? = name

    fun pendingBalanceAmount(): PendingBalanceAmount? = pendingBalanceAmount

    fun perPage(): Long? = perPage

    fun postedBalanceAmount(): PostedBalanceAmount? = postedBalanceAmount

    fun updatedAt(): UpdatedAt? = updatedAt

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.id?.let { queryParams.put("id[]", it.map(Any::toString)) }
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.availableBalanceAmount?.forEachQueryParam { key, values ->
            queryParams.put("available_balance_amount[$key]", values)
        }
        this.balances?.forEachQueryParam { key, values ->
            queryParams.put("balances[$key]", values)
        }
        this.createdAt?.forEachQueryParam { key, values ->
            queryParams.put("created_at[$key]", values)
        }
        this.currency?.let { queryParams.put("currency", listOf(it.toString())) }
        this.ledgerAccountCategoryId?.let {
            queryParams.put("ledger_account_category_id", listOf(it.toString()))
        }
        this.ledgerId?.let { queryParams.put("ledger_id", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values ->
            queryParams.put("metadata[$key]", values)
        }
        this.name?.let { queryParams.put("name[]", it.map(Any::toString)) }
        this.pendingBalanceAmount?.forEachQueryParam { key, values ->
            queryParams.put("pending_balance_amount[$key]", values)
        }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        this.postedBalanceAmount?.forEachQueryParam { key, values ->
            queryParams.put("posted_balance_amount[$key]", values)
        }
        this.updatedAt?.forEachQueryParam { key, values ->
            queryParams.put("updated_at[$key]", values)
        }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountListParams && this.id == other.id && this.afterCursor == other.afterCursor && this.availableBalanceAmount == other.availableBalanceAmount && this.balances == other.balances && this.createdAt == other.createdAt && this.currency == other.currency && this.ledgerAccountCategoryId == other.ledgerAccountCategoryId && this.ledgerId == other.ledgerId && this.metadata == other.metadata && this.name == other.name && this.pendingBalanceAmount == other.pendingBalanceAmount && this.perPage == other.perPage && this.postedBalanceAmount == other.postedBalanceAmount && this.updatedAt == other.updatedAt && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(id, afterCursor, availableBalanceAmount, balances, createdAt, currency, ledgerAccountCategoryId, ledgerId, metadata, name, pendingBalanceAmount, perPage, postedBalanceAmount, updatedAt, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "LedgerAccountListParams{id=$id, afterCursor=$afterCursor, availableBalanceAmount=$availableBalanceAmount, balances=$balances, createdAt=$createdAt, currency=$currency, ledgerAccountCategoryId=$ledgerAccountCategoryId, ledgerId=$ledgerId, metadata=$metadata, name=$name, pendingBalanceAmount=$pendingBalanceAmount, perPage=$perPage, postedBalanceAmount=$postedBalanceAmount, updatedAt=$updatedAt, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: MutableList<String> = mutableListOf()
        private var afterCursor: String? = null
        private var availableBalanceAmount: AvailableBalanceAmount? = null
        private var balances: Balances? = null
        private var createdAt: CreatedAt? = null
        private var currency: String? = null
        private var ledgerAccountCategoryId: String? = null
        private var ledgerId: String? = null
        private var metadata: Metadata? = null
        private var name: MutableList<String> = mutableListOf()
        private var pendingBalanceAmount: PendingBalanceAmount? = null
        private var perPage: Long? = null
        private var postedBalanceAmount: PostedBalanceAmount? = null
        private var updatedAt: UpdatedAt? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(ledgerAccountListParams: LedgerAccountListParams) = apply {
            this.id(ledgerAccountListParams.id ?: listOf())
            this.afterCursor = ledgerAccountListParams.afterCursor
            this.availableBalanceAmount = ledgerAccountListParams.availableBalanceAmount
            this.balances = ledgerAccountListParams.balances
            this.createdAt = ledgerAccountListParams.createdAt
            this.currency = ledgerAccountListParams.currency
            this.ledgerAccountCategoryId = ledgerAccountListParams.ledgerAccountCategoryId
            this.ledgerId = ledgerAccountListParams.ledgerId
            this.metadata = ledgerAccountListParams.metadata
            this.name(ledgerAccountListParams.name ?: listOf())
            this.pendingBalanceAmount = ledgerAccountListParams.pendingBalanceAmount
            this.perPage = ledgerAccountListParams.perPage
            this.postedBalanceAmount = ledgerAccountListParams.postedBalanceAmount
            this.updatedAt = ledgerAccountListParams.updatedAt
            additionalHeaders(ledgerAccountListParams.additionalHeaders)
            additionalQueryParams(ledgerAccountListParams.additionalQueryParams)
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
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
         * balance amount.
         */
        fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount) = apply {
            this.availableBalanceAmount = availableBalanceAmount
        }

        /**
         * Use `balances[effective_at_lower_bound]` and `balances[effective_at_upper_bound]` to get
         * the balances change between the two timestamps. The lower bound is inclusive while the
         * upper bound is exclusive of the provided timestamps. If no value is supplied the balances
         * will be retrieved not including that bound.
         */
        fun balances(balances: Balances) = apply { this.balances = balances }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the created at
         * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
         * created_at%5Bgt%5D=2000-01-01T12:00:00Z.
         */
        fun createdAt(createdAt: CreatedAt) = apply { this.createdAt = createdAt }

        fun currency(currency: String) = apply { this.currency = currency }

        fun ledgerAccountCategoryId(ledgerAccountCategoryId: String) = apply {
            this.ledgerAccountCategoryId = ledgerAccountCategoryId
        }

        fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /**
         * If you have specific names to retrieve in bulk, you can pass them as query parameters
         * delimited with `name[]=`, for example `?name[]=123&name[]=abc`.
         */
        fun name(name: List<String>) = apply {
            this.name.clear()
            this.name.addAll(name)
        }

        /**
         * If you have specific names to retrieve in bulk, you can pass them as query parameters
         * delimited with `name[]=`, for example `?name[]=123&name[]=abc`.
         */
        fun addName(name: String) = apply { this.name.add(name) }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
         * balance amount.
         */
        fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount) = apply {
            this.pendingBalanceAmount = pendingBalanceAmount
        }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
         * balance amount.
         */
        fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount) = apply {
            this.postedBalanceAmount = postedBalanceAmount
        }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the updated at
         * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
         * updated_at%5Bgt%5D=2000-01-01T12:00:00Z.
         */
        fun updatedAt(updatedAt: UpdatedAt) = apply { this.updatedAt = updatedAt }

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

        fun build(): LedgerAccountListParams =
            LedgerAccountListParams(
                if (id.size == 0) null else id.toImmutable(),
                afterCursor,
                availableBalanceAmount,
                balances,
                createdAt,
                currency,
                ledgerAccountCategoryId,
                ledgerId,
                metadata,
                if (name.size == 0) null else name.toImmutable(),
                pendingBalanceAmount,
                perPage,
                postedBalanceAmount,
                updatedAt,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
     * balance amount.
     */
    @JsonDeserialize(builder = AvailableBalanceAmount.Builder::class)
    @NoAutoDetect
    class AvailableBalanceAmount
    private constructor(
        private val gt: Long?,
        private val lt: Long?,
        private val gte: Long?,
        private val lte: Long?,
        private val eq: Long?,
        private val notEq: Long?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        fun gt(): Long? = gt

        fun lt(): Long? = lt

        fun gte(): Long? = gte

        fun lte(): Long? = lte

        fun eq(): Long? = eq

        fun notEq(): Long? = notEq

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.eq?.let { putParam("eq", listOf(it.toString())) }
            this.gt?.let { putParam("gt", listOf(it.toString())) }
            this.gte?.let { putParam("gte", listOf(it.toString())) }
            this.lt?.let { putParam("lt", listOf(it.toString())) }
            this.lte?.let { putParam("lte", listOf(it.toString())) }
            this.notEq?.let { putParam("not_eq", listOf(it.toString())) }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var gt: Long? = null
            private var lt: Long? = null
            private var gte: Long? = null
            private var lte: Long? = null
            private var eq: Long? = null
            private var notEq: Long? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            internal fun from(availableBalanceAmount: AvailableBalanceAmount) = apply {
                this.gt = availableBalanceAmount.gt
                this.lt = availableBalanceAmount.lt
                this.gte = availableBalanceAmount.gte
                this.lte = availableBalanceAmount.lte
                this.eq = availableBalanceAmount.eq
                this.notEq = availableBalanceAmount.notEq
                additionalProperties(availableBalanceAmount.additionalProperties)
            }

            fun gt(gt: Long) = apply { this.gt = gt }

            fun lt(lt: Long) = apply { this.lt = lt }

            fun gte(gte: Long) = apply { this.gte = gte }

            fun lte(lte: Long) = apply { this.lte = lte }

            fun eq(eq: Long) = apply { this.eq = eq }

            fun notEq(notEq: Long) = apply { this.notEq = notEq }

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

            fun build(): AvailableBalanceAmount =
                AvailableBalanceAmount(
                    gt,
                    lt,
                    gte,
                    lte,
                    eq,
                    notEq,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AvailableBalanceAmount && this.gt == other.gt && this.lt == other.lt && this.gte == other.gte && this.lte == other.lte && this.eq == other.eq && this.notEq == other.notEq && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(gt, lt, gte, lte, eq, notEq, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AvailableBalanceAmount{gt=$gt, lt=$lt, gte=$gte, lte=$lte, eq=$eq, notEq=$notEq, additionalProperties=$additionalProperties}"
    }

    /**
     * Use `balances[effective_at_lower_bound]` and `balances[effective_at_upper_bound]` to get the
     * balances change between the two timestamps. The lower bound is inclusive while the upper
     * bound is exclusive of the provided timestamps. If no value is supplied the balances will be
     * retrieved not including that bound.
     */
    @JsonDeserialize(builder = Balances.Builder::class)
    @NoAutoDetect
    class Balances
    private constructor(
        private val asOfDate: LocalDate?,
        private val effectiveAt: OffsetDateTime?,
        private val effectiveAtLowerBound: OffsetDateTime?,
        private val effectiveAtUpperBound: OffsetDateTime?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        fun asOfDate(): LocalDate? = asOfDate

        fun effectiveAt(): OffsetDateTime? = effectiveAt

        fun effectiveAtLowerBound(): OffsetDateTime? = effectiveAtLowerBound

        fun effectiveAtUpperBound(): OffsetDateTime? = effectiveAtUpperBound

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.asOfDate?.let { putParam("as_of_date", listOf(it.toString())) }
            this.effectiveAt?.let {
                putParam("effective_at", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            this.effectiveAtLowerBound?.let {
                putParam(
                    "effective_at_lower_bound",
                    listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                )
            }
            this.effectiveAtUpperBound?.let {
                putParam(
                    "effective_at_upper_bound",
                    listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                )
            }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var asOfDate: LocalDate? = null
            private var effectiveAt: OffsetDateTime? = null
            private var effectiveAtLowerBound: OffsetDateTime? = null
            private var effectiveAtUpperBound: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            internal fun from(balances: Balances) = apply {
                this.asOfDate = balances.asOfDate
                this.effectiveAt = balances.effectiveAt
                this.effectiveAtLowerBound = balances.effectiveAtLowerBound
                this.effectiveAtUpperBound = balances.effectiveAtUpperBound
                additionalProperties(balances.additionalProperties)
            }

            fun asOfDate(asOfDate: LocalDate) = apply { this.asOfDate = asOfDate }

            fun effectiveAt(effectiveAt: OffsetDateTime) = apply { this.effectiveAt = effectiveAt }

            fun effectiveAtLowerBound(effectiveAtLowerBound: OffsetDateTime) = apply {
                this.effectiveAtLowerBound = effectiveAtLowerBound
            }

            fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime) = apply {
                this.effectiveAtUpperBound = effectiveAtUpperBound
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

            fun build(): Balances =
                Balances(
                    asOfDate,
                    effectiveAt,
                    effectiveAtLowerBound,
                    effectiveAtUpperBound,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Balances && this.asOfDate == other.asOfDate && this.effectiveAt == other.effectiveAt && this.effectiveAtLowerBound == other.effectiveAtLowerBound && this.effectiveAtUpperBound == other.effectiveAtUpperBound && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(asOfDate, effectiveAt, effectiveAtLowerBound, effectiveAtUpperBound, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Balances{asOfDate=$asOfDate, effectiveAt=$effectiveAt, effectiveAtLowerBound=$effectiveAtLowerBound, effectiveAtUpperBound=$effectiveAtUpperBound, additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the created at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * created_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    @JsonDeserialize(builder = CreatedAt.Builder::class)
    @NoAutoDetect
    class CreatedAt
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

            internal fun from(createdAt: CreatedAt) = apply {
                additionalProperties(createdAt.additionalProperties)
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

            fun build(): CreatedAt = CreatedAt(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreatedAt && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "CreatedAt{additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
     * balance amount.
     */
    @JsonDeserialize(builder = PendingBalanceAmount.Builder::class)
    @NoAutoDetect
    class PendingBalanceAmount
    private constructor(
        private val gt: Long?,
        private val lt: Long?,
        private val gte: Long?,
        private val lte: Long?,
        private val eq: Long?,
        private val notEq: Long?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        fun gt(): Long? = gt

        fun lt(): Long? = lt

        fun gte(): Long? = gte

        fun lte(): Long? = lte

        fun eq(): Long? = eq

        fun notEq(): Long? = notEq

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.eq?.let { putParam("eq", listOf(it.toString())) }
            this.gt?.let { putParam("gt", listOf(it.toString())) }
            this.gte?.let { putParam("gte", listOf(it.toString())) }
            this.lt?.let { putParam("lt", listOf(it.toString())) }
            this.lte?.let { putParam("lte", listOf(it.toString())) }
            this.notEq?.let { putParam("not_eq", listOf(it.toString())) }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var gt: Long? = null
            private var lt: Long? = null
            private var gte: Long? = null
            private var lte: Long? = null
            private var eq: Long? = null
            private var notEq: Long? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                this.gt = pendingBalanceAmount.gt
                this.lt = pendingBalanceAmount.lt
                this.gte = pendingBalanceAmount.gte
                this.lte = pendingBalanceAmount.lte
                this.eq = pendingBalanceAmount.eq
                this.notEq = pendingBalanceAmount.notEq
                additionalProperties(pendingBalanceAmount.additionalProperties)
            }

            fun gt(gt: Long) = apply { this.gt = gt }

            fun lt(lt: Long) = apply { this.lt = lt }

            fun gte(gte: Long) = apply { this.gte = gte }

            fun lte(lte: Long) = apply { this.lte = lte }

            fun eq(eq: Long) = apply { this.eq = eq }

            fun notEq(notEq: Long) = apply { this.notEq = notEq }

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

            fun build(): PendingBalanceAmount =
                PendingBalanceAmount(
                    gt,
                    lt,
                    gte,
                    lte,
                    eq,
                    notEq,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PendingBalanceAmount && this.gt == other.gt && this.lt == other.lt && this.gte == other.gte && this.lte == other.lte && this.eq == other.eq && this.notEq == other.notEq && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(gt, lt, gte, lte, eq, notEq, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "PendingBalanceAmount{gt=$gt, lt=$lt, gte=$gte, lte=$lte, eq=$eq, notEq=$notEq, additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
     * balance amount.
     */
    @JsonDeserialize(builder = PostedBalanceAmount.Builder::class)
    @NoAutoDetect
    class PostedBalanceAmount
    private constructor(
        private val gt: Long?,
        private val lt: Long?,
        private val gte: Long?,
        private val lte: Long?,
        private val eq: Long?,
        private val notEq: Long?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        fun gt(): Long? = gt

        fun lt(): Long? = lt

        fun gte(): Long? = gte

        fun lte(): Long? = lte

        fun eq(): Long? = eq

        fun notEq(): Long? = notEq

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.eq?.let { putParam("eq", listOf(it.toString())) }
            this.gt?.let { putParam("gt", listOf(it.toString())) }
            this.gte?.let { putParam("gte", listOf(it.toString())) }
            this.lt?.let { putParam("lt", listOf(it.toString())) }
            this.lte?.let { putParam("lte", listOf(it.toString())) }
            this.notEq?.let { putParam("not_eq", listOf(it.toString())) }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var gt: Long? = null
            private var lt: Long? = null
            private var gte: Long? = null
            private var lte: Long? = null
            private var eq: Long? = null
            private var notEq: Long? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                this.gt = postedBalanceAmount.gt
                this.lt = postedBalanceAmount.lt
                this.gte = postedBalanceAmount.gte
                this.lte = postedBalanceAmount.lte
                this.eq = postedBalanceAmount.eq
                this.notEq = postedBalanceAmount.notEq
                additionalProperties(postedBalanceAmount.additionalProperties)
            }

            fun gt(gt: Long) = apply { this.gt = gt }

            fun lt(lt: Long) = apply { this.lt = lt }

            fun gte(gte: Long) = apply { this.gte = gte }

            fun lte(lte: Long) = apply { this.lte = lte }

            fun eq(eq: Long) = apply { this.eq = eq }

            fun notEq(notEq: Long) = apply { this.notEq = notEq }

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

            fun build(): PostedBalanceAmount =
                PostedBalanceAmount(
                    gt,
                    lt,
                    gte,
                    lte,
                    eq,
                    notEq,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PostedBalanceAmount && this.gt == other.gt && this.lt == other.lt && this.gte == other.gte && this.lte == other.lte && this.eq == other.eq && this.notEq == other.notEq && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(gt, lt, gte, lte, eq, notEq, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "PostedBalanceAmount{gt=$gt, lt=$lt, gte=$gte, lte=$lte, eq=$eq, notEq=$notEq, additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the updated at
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

            fun build(): UpdatedAt = UpdatedAt(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UpdatedAt && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "UpdatedAt{additionalProperties=$additionalProperties}"
    }
}
