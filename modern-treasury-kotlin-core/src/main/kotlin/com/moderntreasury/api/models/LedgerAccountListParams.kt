// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/** Get a list of ledger accounts. */
class LedgerAccountListParams
private constructor(
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

    /**
     * If you have specific IDs to retrieve in bulk, you can pass them as query parameters delimited
     * with `id[]=`, for example `?id[]=123&id[]=abc`.
     */
    fun id(): List<String>? = id

    fun afterCursor(): String? = afterCursor

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
     * balance amount.
     */
    fun availableBalanceAmount(): AvailableBalanceAmount? = availableBalanceAmount

    /**
     * Use `balances[effective_at_lower_bound]` and `balances[effective_at_upper_bound]` to get the
     * balances change between the two timestamps. The lower bound is inclusive while the upper
     * bound is exclusive of the provided timestamps. If no value is supplied the balances will be
     * retrieved not including that bound.
     */
    fun balances(): Balances? = balances

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the created at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * created_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    fun createdAt(): CreatedAt? = createdAt

    fun currency(): String? = currency

    fun ledgerAccountCategoryId(): String? = ledgerAccountCategoryId

    fun ledgerId(): String? = ledgerId

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    fun metadata(): Metadata? = metadata

    /**
     * If you have specific names to retrieve in bulk, you can pass them as query parameters
     * delimited with `name[]=`, for example `?name[]=123&name[]=abc`.
     */
    fun name(): List<String>? = name

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
     * balance amount.
     */
    fun pendingBalanceAmount(): PendingBalanceAmount? = pendingBalanceAmount

    fun perPage(): Long? = perPage

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
     * balance amount.
     */
    fun postedBalanceAmount(): PostedBalanceAmount? = postedBalanceAmount

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the updated at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * updated_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    fun updatedAt(): UpdatedAt? = updatedAt

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

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

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [LedgerAccountListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var id: MutableList<String>? = null
        private var afterCursor: String? = null
        private var availableBalanceAmount: AvailableBalanceAmount? = null
        private var balances: Balances? = null
        private var createdAt: CreatedAt? = null
        private var currency: String? = null
        private var ledgerAccountCategoryId: String? = null
        private var ledgerId: String? = null
        private var metadata: Metadata? = null
        private var name: MutableList<String>? = null
        private var pendingBalanceAmount: PendingBalanceAmount? = null
        private var perPage: Long? = null
        private var postedBalanceAmount: PostedBalanceAmount? = null
        private var updatedAt: UpdatedAt? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(ledgerAccountListParams: LedgerAccountListParams) = apply {
            id = ledgerAccountListParams.id?.toMutableList()
            afterCursor = ledgerAccountListParams.afterCursor
            availableBalanceAmount = ledgerAccountListParams.availableBalanceAmount
            balances = ledgerAccountListParams.balances
            createdAt = ledgerAccountListParams.createdAt
            currency = ledgerAccountListParams.currency
            ledgerAccountCategoryId = ledgerAccountListParams.ledgerAccountCategoryId
            ledgerId = ledgerAccountListParams.ledgerId
            metadata = ledgerAccountListParams.metadata
            name = ledgerAccountListParams.name?.toMutableList()
            pendingBalanceAmount = ledgerAccountListParams.pendingBalanceAmount
            perPage = ledgerAccountListParams.perPage
            postedBalanceAmount = ledgerAccountListParams.postedBalanceAmount
            updatedAt = ledgerAccountListParams.updatedAt
            additionalHeaders = ledgerAccountListParams.additionalHeaders.toBuilder()
            additionalQueryParams = ledgerAccountListParams.additionalQueryParams.toBuilder()
        }

        /**
         * If you have specific IDs to retrieve in bulk, you can pass them as query parameters
         * delimited with `id[]=`, for example `?id[]=123&id[]=abc`.
         */
        fun id(id: List<String>?) = apply { this.id = id?.toMutableList() }

        /**
         * If you have specific IDs to retrieve in bulk, you can pass them as query parameters
         * delimited with `id[]=`, for example `?id[]=123&id[]=abc`.
         */
        fun addId(id: String) = apply { this.id = (this.id ?: mutableListOf()).apply { add(id) } }

        fun afterCursor(afterCursor: String?) = apply { this.afterCursor = afterCursor }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
         * balance amount.
         */
        fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount?) = apply {
            this.availableBalanceAmount = availableBalanceAmount
        }

        /**
         * Use `balances[effective_at_lower_bound]` and `balances[effective_at_upper_bound]` to get
         * the balances change between the two timestamps. The lower bound is inclusive while the
         * upper bound is exclusive of the provided timestamps. If no value is supplied the balances
         * will be retrieved not including that bound.
         */
        fun balances(balances: Balances?) = apply { this.balances = balances }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the created at
         * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
         * created_at%5Bgt%5D=2000-01-01T12:00:00Z.
         */
        fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

        fun currency(currency: String?) = apply { this.currency = currency }

        fun ledgerAccountCategoryId(ledgerAccountCategoryId: String?) = apply {
            this.ledgerAccountCategoryId = ledgerAccountCategoryId
        }

        fun ledgerId(ledgerId: String?) = apply { this.ledgerId = ledgerId }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

        /**
         * If you have specific names to retrieve in bulk, you can pass them as query parameters
         * delimited with `name[]=`, for example `?name[]=123&name[]=abc`.
         */
        fun name(name: List<String>?) = apply { this.name = name?.toMutableList() }

        /**
         * If you have specific names to retrieve in bulk, you can pass them as query parameters
         * delimited with `name[]=`, for example `?name[]=123&name[]=abc`.
         */
        fun addName(name: String) = apply {
            this.name = (this.name ?: mutableListOf()).apply { add(name) }
        }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
         * balance amount.
         */
        fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount?) = apply {
            this.pendingBalanceAmount = pendingBalanceAmount
        }

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        fun perPage(perPage: Long) = perPage(perPage as Long?)

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
         * balance amount.
         */
        fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount?) = apply {
            this.postedBalanceAmount = postedBalanceAmount
        }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the updated at
         * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
         * updated_at%5Bgt%5D=2000-01-01T12:00:00Z.
         */
        fun updatedAt(updatedAt: UpdatedAt?) = apply { this.updatedAt = updatedAt }

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
                id?.toImmutable(),
                afterCursor,
                availableBalanceAmount,
                balances,
                createdAt,
                currency,
                ledgerAccountCategoryId,
                ledgerId,
                metadata,
                name?.toImmutable(),
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
    class AvailableBalanceAmount
    private constructor(
        private val eq: Long?,
        private val gt: Long?,
        private val gte: Long?,
        private val lt: Long?,
        private val lte: Long?,
        private val notEq: Long?,
        private val additionalProperties: QueryParams,
    ) {

        fun eq(): Long? = eq

        fun gt(): Long? = gt

        fun gte(): Long? = gte

        fun lt(): Long? = lt

        fun lte(): Long? = lte

        fun notEq(): Long? = notEq

        fun _additionalProperties(): QueryParams = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.eq?.let { putParam("eq", listOf(it.toString())) }
            this.gt?.let { putParam("gt", listOf(it.toString())) }
            this.gte?.let { putParam("gte", listOf(it.toString())) }
            this.lt?.let { putParam("lt", listOf(it.toString())) }
            this.lte?.let { putParam("lte", listOf(it.toString())) }
            this.notEq?.let { putParam("not_eq", listOf(it.toString())) }
            additionalProperties.keys().forEach { putParam(it, additionalProperties.values(it)) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [AvailableBalanceAmount]. */
        class Builder internal constructor() {

            private var eq: Long? = null
            private var gt: Long? = null
            private var gte: Long? = null
            private var lt: Long? = null
            private var lte: Long? = null
            private var notEq: Long? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(availableBalanceAmount: AvailableBalanceAmount) = apply {
                eq = availableBalanceAmount.eq
                gt = availableBalanceAmount.gt
                gte = availableBalanceAmount.gte
                lt = availableBalanceAmount.lt
                lte = availableBalanceAmount.lte
                notEq = availableBalanceAmount.notEq
                additionalProperties = availableBalanceAmount.additionalProperties.toBuilder()
            }

            fun eq(eq: Long?) = apply { this.eq = eq }

            fun eq(eq: Long) = eq(eq as Long?)

            fun gt(gt: Long?) = apply { this.gt = gt }

            fun gt(gt: Long) = gt(gt as Long?)

            fun gte(gte: Long?) = apply { this.gte = gte }

            fun gte(gte: Long) = gte(gte as Long?)

            fun lt(lt: Long?) = apply { this.lt = lt }

            fun lt(lt: Long) = lt(lt as Long?)

            fun lte(lte: Long?) = apply { this.lte = lte }

            fun lte(lte: Long) = lte(lte as Long?)

            fun notEq(notEq: Long?) = apply { this.notEq = notEq }

            fun notEq(notEq: Long) = notEq(notEq as Long?)

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            fun build(): AvailableBalanceAmount =
                AvailableBalanceAmount(
                    eq,
                    gt,
                    gte,
                    lt,
                    lte,
                    notEq,
                    additionalProperties.build(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AvailableBalanceAmount && eq == other.eq && gt == other.gt && gte == other.gte && lt == other.lt && lte == other.lte && notEq == other.notEq && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eq, gt, gte, lt, lte, notEq, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AvailableBalanceAmount{eq=$eq, gt=$gt, gte=$gte, lt=$lt, lte=$lte, notEq=$notEq, additionalProperties=$additionalProperties}"
    }

    /**
     * Use `balances[effective_at_lower_bound]` and `balances[effective_at_upper_bound]` to get the
     * balances change between the two timestamps. The lower bound is inclusive while the upper
     * bound is exclusive of the provided timestamps. If no value is supplied the balances will be
     * retrieved not including that bound.
     */
    class Balances
    private constructor(
        private val asOfDate: LocalDate?,
        private val effectiveAt: OffsetDateTime?,
        private val effectiveAtLowerBound: OffsetDateTime?,
        private val effectiveAtUpperBound: OffsetDateTime?,
        private val additionalProperties: QueryParams,
    ) {

        fun asOfDate(): LocalDate? = asOfDate

        fun effectiveAt(): OffsetDateTime? = effectiveAt

        fun effectiveAtLowerBound(): OffsetDateTime? = effectiveAtLowerBound

        fun effectiveAtUpperBound(): OffsetDateTime? = effectiveAtUpperBound

        fun _additionalProperties(): QueryParams = additionalProperties

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
            additionalProperties.keys().forEach { putParam(it, additionalProperties.values(it)) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Balances]. */
        class Builder internal constructor() {

            private var asOfDate: LocalDate? = null
            private var effectiveAt: OffsetDateTime? = null
            private var effectiveAtLowerBound: OffsetDateTime? = null
            private var effectiveAtUpperBound: OffsetDateTime? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(balances: Balances) = apply {
                asOfDate = balances.asOfDate
                effectiveAt = balances.effectiveAt
                effectiveAtLowerBound = balances.effectiveAtLowerBound
                effectiveAtUpperBound = balances.effectiveAtUpperBound
                additionalProperties = balances.additionalProperties.toBuilder()
            }

            fun asOfDate(asOfDate: LocalDate?) = apply { this.asOfDate = asOfDate }

            fun effectiveAt(effectiveAt: OffsetDateTime?) = apply { this.effectiveAt = effectiveAt }

            fun effectiveAtLowerBound(effectiveAtLowerBound: OffsetDateTime?) = apply {
                this.effectiveAtLowerBound = effectiveAtLowerBound
            }

            fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime?) = apply {
                this.effectiveAtUpperBound = effectiveAtUpperBound
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            fun build(): Balances =
                Balances(
                    asOfDate,
                    effectiveAt,
                    effectiveAtLowerBound,
                    effectiveAtUpperBound,
                    additionalProperties.build(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Balances && asOfDate == other.asOfDate && effectiveAt == other.effectiveAt && effectiveAtLowerBound == other.effectiveAtLowerBound && effectiveAtUpperBound == other.effectiveAtUpperBound && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(asOfDate, effectiveAt, effectiveAtLowerBound, effectiveAtUpperBound, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Balances{asOfDate=$asOfDate, effectiveAt=$effectiveAt, effectiveAtLowerBound=$effectiveAtLowerBound, effectiveAtUpperBound=$effectiveAtUpperBound, additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the created at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * created_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    class CreatedAt
    private constructor(
        private val additionalProperties: QueryParams,
    ) {

        fun _additionalProperties(): QueryParams = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            additionalProperties.keys().forEach { putParam(it, additionalProperties.values(it)) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [CreatedAt]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(createdAt: CreatedAt) = apply {
                additionalProperties = createdAt.additionalProperties.toBuilder()
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            fun build(): CreatedAt = CreatedAt(additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreatedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CreatedAt{additionalProperties=$additionalProperties}"
    }

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    class Metadata
    private constructor(
        private val additionalProperties: QueryParams,
    ) {

        fun _additionalProperties(): QueryParams = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            additionalProperties.keys().forEach { putParam(it, additionalProperties.values(it)) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toBuilder()
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            fun build(): Metadata = Metadata(additionalProperties.build())
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

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
     * balance amount.
     */
    class PendingBalanceAmount
    private constructor(
        private val eq: Long?,
        private val gt: Long?,
        private val gte: Long?,
        private val lt: Long?,
        private val lte: Long?,
        private val notEq: Long?,
        private val additionalProperties: QueryParams,
    ) {

        fun eq(): Long? = eq

        fun gt(): Long? = gt

        fun gte(): Long? = gte

        fun lt(): Long? = lt

        fun lte(): Long? = lte

        fun notEq(): Long? = notEq

        fun _additionalProperties(): QueryParams = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.eq?.let { putParam("eq", listOf(it.toString())) }
            this.gt?.let { putParam("gt", listOf(it.toString())) }
            this.gte?.let { putParam("gte", listOf(it.toString())) }
            this.lt?.let { putParam("lt", listOf(it.toString())) }
            this.lte?.let { putParam("lte", listOf(it.toString())) }
            this.notEq?.let { putParam("not_eq", listOf(it.toString())) }
            additionalProperties.keys().forEach { putParam(it, additionalProperties.values(it)) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [PendingBalanceAmount]. */
        class Builder internal constructor() {

            private var eq: Long? = null
            private var gt: Long? = null
            private var gte: Long? = null
            private var lt: Long? = null
            private var lte: Long? = null
            private var notEq: Long? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                eq = pendingBalanceAmount.eq
                gt = pendingBalanceAmount.gt
                gte = pendingBalanceAmount.gte
                lt = pendingBalanceAmount.lt
                lte = pendingBalanceAmount.lte
                notEq = pendingBalanceAmount.notEq
                additionalProperties = pendingBalanceAmount.additionalProperties.toBuilder()
            }

            fun eq(eq: Long?) = apply { this.eq = eq }

            fun eq(eq: Long) = eq(eq as Long?)

            fun gt(gt: Long?) = apply { this.gt = gt }

            fun gt(gt: Long) = gt(gt as Long?)

            fun gte(gte: Long?) = apply { this.gte = gte }

            fun gte(gte: Long) = gte(gte as Long?)

            fun lt(lt: Long?) = apply { this.lt = lt }

            fun lt(lt: Long) = lt(lt as Long?)

            fun lte(lte: Long?) = apply { this.lte = lte }

            fun lte(lte: Long) = lte(lte as Long?)

            fun notEq(notEq: Long?) = apply { this.notEq = notEq }

            fun notEq(notEq: Long) = notEq(notEq as Long?)

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            fun build(): PendingBalanceAmount =
                PendingBalanceAmount(
                    eq,
                    gt,
                    gte,
                    lt,
                    lte,
                    notEq,
                    additionalProperties.build(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PendingBalanceAmount && eq == other.eq && gt == other.gt && gte == other.gte && lt == other.lt && lte == other.lte && notEq == other.notEq && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eq, gt, gte, lt, lte, notEq, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PendingBalanceAmount{eq=$eq, gt=$gt, gte=$gte, lt=$lt, lte=$lte, notEq=$notEq, additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
     * balance amount.
     */
    class PostedBalanceAmount
    private constructor(
        private val eq: Long?,
        private val gt: Long?,
        private val gte: Long?,
        private val lt: Long?,
        private val lte: Long?,
        private val notEq: Long?,
        private val additionalProperties: QueryParams,
    ) {

        fun eq(): Long? = eq

        fun gt(): Long? = gt

        fun gte(): Long? = gte

        fun lt(): Long? = lt

        fun lte(): Long? = lte

        fun notEq(): Long? = notEq

        fun _additionalProperties(): QueryParams = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.eq?.let { putParam("eq", listOf(it.toString())) }
            this.gt?.let { putParam("gt", listOf(it.toString())) }
            this.gte?.let { putParam("gte", listOf(it.toString())) }
            this.lt?.let { putParam("lt", listOf(it.toString())) }
            this.lte?.let { putParam("lte", listOf(it.toString())) }
            this.notEq?.let { putParam("not_eq", listOf(it.toString())) }
            additionalProperties.keys().forEach { putParam(it, additionalProperties.values(it)) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [PostedBalanceAmount]. */
        class Builder internal constructor() {

            private var eq: Long? = null
            private var gt: Long? = null
            private var gte: Long? = null
            private var lt: Long? = null
            private var lte: Long? = null
            private var notEq: Long? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                eq = postedBalanceAmount.eq
                gt = postedBalanceAmount.gt
                gte = postedBalanceAmount.gte
                lt = postedBalanceAmount.lt
                lte = postedBalanceAmount.lte
                notEq = postedBalanceAmount.notEq
                additionalProperties = postedBalanceAmount.additionalProperties.toBuilder()
            }

            fun eq(eq: Long?) = apply { this.eq = eq }

            fun eq(eq: Long) = eq(eq as Long?)

            fun gt(gt: Long?) = apply { this.gt = gt }

            fun gt(gt: Long) = gt(gt as Long?)

            fun gte(gte: Long?) = apply { this.gte = gte }

            fun gte(gte: Long) = gte(gte as Long?)

            fun lt(lt: Long?) = apply { this.lt = lt }

            fun lt(lt: Long) = lt(lt as Long?)

            fun lte(lte: Long?) = apply { this.lte = lte }

            fun lte(lte: Long) = lte(lte as Long?)

            fun notEq(notEq: Long?) = apply { this.notEq = notEq }

            fun notEq(notEq: Long) = notEq(notEq as Long?)

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            fun build(): PostedBalanceAmount =
                PostedBalanceAmount(
                    eq,
                    gt,
                    gte,
                    lt,
                    lte,
                    notEq,
                    additionalProperties.build(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PostedBalanceAmount && eq == other.eq && gt == other.gt && gte == other.gte && lt == other.lt && lte == other.lte && notEq == other.notEq && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eq, gt, gte, lt, lte, notEq, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PostedBalanceAmount{eq=$eq, gt=$gt, gte=$gte, lt=$lt, lte=$lte, notEq=$notEq, additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the updated at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * updated_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    class UpdatedAt
    private constructor(
        private val additionalProperties: QueryParams,
    ) {

        fun _additionalProperties(): QueryParams = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            additionalProperties.keys().forEach { putParam(it, additionalProperties.values(it)) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [UpdatedAt]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(updatedAt: UpdatedAt) = apply {
                additionalProperties = updatedAt.additionalProperties.toBuilder()
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            fun build(): UpdatedAt = UpdatedAt(additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UpdatedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "UpdatedAt{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountListParams && id == other.id && afterCursor == other.afterCursor && availableBalanceAmount == other.availableBalanceAmount && balances == other.balances && createdAt == other.createdAt && currency == other.currency && ledgerAccountCategoryId == other.ledgerAccountCategoryId && ledgerId == other.ledgerId && metadata == other.metadata && name == other.name && pendingBalanceAmount == other.pendingBalanceAmount && perPage == other.perPage && postedBalanceAmount == other.postedBalanceAmount && updatedAt == other.updatedAt && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, afterCursor, availableBalanceAmount, balances, createdAt, currency, ledgerAccountCategoryId, ledgerId, metadata, name, pendingBalanceAmount, perPage, postedBalanceAmount, updatedAt, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LedgerAccountListParams{id=$id, afterCursor=$afterCursor, availableBalanceAmount=$availableBalanceAmount, balances=$balances, createdAt=$createdAt, currency=$currency, ledgerAccountCategoryId=$ledgerAccountCategoryId, ledgerId=$ledgerId, metadata=$metadata, name=$name, pendingBalanceAmount=$pendingBalanceAmount, perPage=$perPage, postedBalanceAmount=$postedBalanceAmount, updatedAt=$updatedAt, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
