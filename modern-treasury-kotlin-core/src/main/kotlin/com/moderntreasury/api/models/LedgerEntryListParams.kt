// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Objects

/** Get a list of all ledger entries. */
class LedgerEntryListParams
private constructor(
    private val id: List<String>?,
    private val afterCursor: String?,
    private val amount: Amount?,
    private val asOfLockVersion: Long?,
    private val direction: TransactionDirection?,
    private val effectiveAt: EffectiveAt?,
    private val effectiveDate: EffectiveDate?,
    private val ledgerAccountCategoryId: String?,
    private val ledgerAccountId: String?,
    private val ledgerAccountLockVersion: LedgerAccountLockVersion?,
    private val ledgerAccountPayoutId: String?,
    private val ledgerAccountSettlementId: String?,
    private val ledgerAccountStatementId: String?,
    private val ledgerTransactionId: String?,
    private val metadata: Metadata?,
    private val orderBy: OrderBy?,
    private val perPage: Long?,
    private val showBalances: Boolean?,
    private val showDeleted: Boolean?,
    private val status: List<Status>?,
    private val updatedAt: UpdatedAt?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * If you have specific IDs to retrieve in bulk, you can pass them as query parameters delimited
     * with `id[]=`, for example `?id[]=123&id[]=abc`.
     */
    fun id(): List<String>? = id

    fun afterCursor(): String? = afterCursor

    /** Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by amount. */
    fun amount(): Amount? = amount

    /**
     * Shows all ledger entries that were present on a ledger account at a particular
     * `lock_version`. You must also specify `ledger_account_id`.
     */
    fun asOfLockVersion(): Long? = asOfLockVersion

    /**
     * If true, response will include ledger entries that were deleted. When you update a ledger
     * transaction to specify a new set of entries, the previous entries are deleted.
     */
    fun direction(): TransactionDirection? = direction

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the transaction's
     * effective time. Format ISO8601
     */
    fun effectiveAt(): EffectiveAt? = effectiveAt

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the transaction's
     * effective date. Format YYYY-MM-DD
     */
    fun effectiveDate(): EffectiveDate? = effectiveDate

    /** Get all ledger entries that match the direction specified. One of `credit`, `debit`. */
    fun ledgerAccountCategoryId(): String? = ledgerAccountCategoryId

    fun ledgerAccountId(): String? = ledgerAccountId

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the lock_version of
     * a ledger account. For example, for all entries created at or before before lock_version 1000
     * of a ledger account, use `ledger_account_lock_version%5Blte%5D=1000`.
     */
    fun ledgerAccountLockVersion(): LedgerAccountLockVersion? = ledgerAccountLockVersion

    fun ledgerAccountPayoutId(): String? = ledgerAccountPayoutId

    fun ledgerAccountSettlementId(): String? = ledgerAccountSettlementId

    /** Get all ledger entries that are included in the ledger account statement. */
    fun ledgerAccountStatementId(): String? = ledgerAccountStatementId

    fun ledgerTransactionId(): String? = ledgerTransactionId

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    fun metadata(): Metadata? = metadata

    /**
     * Order by `created_at` or `effective_at` in `asc` or `desc` order. For example, to order by
     * `effective_at asc`, use `order_by%5Beffective_at%5D=asc`. Ordering by only one field at a
     * time is supported.
     */
    fun orderBy(): OrderBy? = orderBy

    fun perPage(): Long? = perPage

    /**
     * If true, response will include the balances attached to the ledger entry. If there is no
     * balance available, null will be returned instead.
     */
    fun showBalances(): Boolean? = showBalances

    /**
     * If true, response will include ledger entries that were deleted. When you update a ledger
     * transaction to specify a new set of entries, the previous entries are deleted.
     */
    fun showDeleted(): Boolean? = showDeleted

    /**
     * Get all ledger entries that match the status specified. One of `pending`, `posted`, or
     * `archived`. For multiple statuses, use `status[]=pending&status[]=posted`.
     */
    fun status(): List<Status>? = status

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the posted at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * updated_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    fun updatedAt(): UpdatedAt? = updatedAt

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): LedgerEntryListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [LedgerEntryListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [LedgerEntryListParams]. */
    class Builder internal constructor() {

        private var id: MutableList<String>? = null
        private var afterCursor: String? = null
        private var amount: Amount? = null
        private var asOfLockVersion: Long? = null
        private var direction: TransactionDirection? = null
        private var effectiveAt: EffectiveAt? = null
        private var effectiveDate: EffectiveDate? = null
        private var ledgerAccountCategoryId: String? = null
        private var ledgerAccountId: String? = null
        private var ledgerAccountLockVersion: LedgerAccountLockVersion? = null
        private var ledgerAccountPayoutId: String? = null
        private var ledgerAccountSettlementId: String? = null
        private var ledgerAccountStatementId: String? = null
        private var ledgerTransactionId: String? = null
        private var metadata: Metadata? = null
        private var orderBy: OrderBy? = null
        private var perPage: Long? = null
        private var showBalances: Boolean? = null
        private var showDeleted: Boolean? = null
        private var status: MutableList<Status>? = null
        private var updatedAt: UpdatedAt? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(ledgerEntryListParams: LedgerEntryListParams) = apply {
            id = ledgerEntryListParams.id?.toMutableList()
            afterCursor = ledgerEntryListParams.afterCursor
            amount = ledgerEntryListParams.amount
            asOfLockVersion = ledgerEntryListParams.asOfLockVersion
            direction = ledgerEntryListParams.direction
            effectiveAt = ledgerEntryListParams.effectiveAt
            effectiveDate = ledgerEntryListParams.effectiveDate
            ledgerAccountCategoryId = ledgerEntryListParams.ledgerAccountCategoryId
            ledgerAccountId = ledgerEntryListParams.ledgerAccountId
            ledgerAccountLockVersion = ledgerEntryListParams.ledgerAccountLockVersion
            ledgerAccountPayoutId = ledgerEntryListParams.ledgerAccountPayoutId
            ledgerAccountSettlementId = ledgerEntryListParams.ledgerAccountSettlementId
            ledgerAccountStatementId = ledgerEntryListParams.ledgerAccountStatementId
            ledgerTransactionId = ledgerEntryListParams.ledgerTransactionId
            metadata = ledgerEntryListParams.metadata
            orderBy = ledgerEntryListParams.orderBy
            perPage = ledgerEntryListParams.perPage
            showBalances = ledgerEntryListParams.showBalances
            showDeleted = ledgerEntryListParams.showDeleted
            status = ledgerEntryListParams.status?.toMutableList()
            updatedAt = ledgerEntryListParams.updatedAt
            additionalHeaders = ledgerEntryListParams.additionalHeaders.toBuilder()
            additionalQueryParams = ledgerEntryListParams.additionalQueryParams.toBuilder()
        }

        /**
         * If you have specific IDs to retrieve in bulk, you can pass them as query parameters
         * delimited with `id[]=`, for example `?id[]=123&id[]=abc`.
         */
        fun id(id: List<String>?) = apply { this.id = id?.toMutableList() }

        /**
         * Adds a single [String] to [Builder.id].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { this.id = (this.id ?: mutableListOf()).apply { add(id) } }

        fun afterCursor(afterCursor: String?) = apply { this.afterCursor = afterCursor }

        /** Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by amount. */
        fun amount(amount: Amount?) = apply { this.amount = amount }

        /**
         * Shows all ledger entries that were present on a ledger account at a particular
         * `lock_version`. You must also specify `ledger_account_id`.
         */
        fun asOfLockVersion(asOfLockVersion: Long?) = apply {
            this.asOfLockVersion = asOfLockVersion
        }

        /**
         * Alias for [Builder.asOfLockVersion].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun asOfLockVersion(asOfLockVersion: Long) = asOfLockVersion(asOfLockVersion as Long?)

        /**
         * If true, response will include ledger entries that were deleted. When you update a ledger
         * transaction to specify a new set of entries, the previous entries are deleted.
         */
        fun direction(direction: TransactionDirection?) = apply { this.direction = direction }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the
         * transaction's effective time. Format ISO8601
         */
        fun effectiveAt(effectiveAt: EffectiveAt?) = apply { this.effectiveAt = effectiveAt }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the
         * transaction's effective date. Format YYYY-MM-DD
         */
        fun effectiveDate(effectiveDate: EffectiveDate?) = apply {
            this.effectiveDate = effectiveDate
        }

        /** Get all ledger entries that match the direction specified. One of `credit`, `debit`. */
        fun ledgerAccountCategoryId(ledgerAccountCategoryId: String?) = apply {
            this.ledgerAccountCategoryId = ledgerAccountCategoryId
        }

        fun ledgerAccountId(ledgerAccountId: String?) = apply {
            this.ledgerAccountId = ledgerAccountId
        }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the lock_version
         * of a ledger account. For example, for all entries created at or before before
         * lock_version 1000 of a ledger account, use `ledger_account_lock_version%5Blte%5D=1000`.
         */
        fun ledgerAccountLockVersion(ledgerAccountLockVersion: LedgerAccountLockVersion?) = apply {
            this.ledgerAccountLockVersion = ledgerAccountLockVersion
        }

        fun ledgerAccountPayoutId(ledgerAccountPayoutId: String?) = apply {
            this.ledgerAccountPayoutId = ledgerAccountPayoutId
        }

        fun ledgerAccountSettlementId(ledgerAccountSettlementId: String?) = apply {
            this.ledgerAccountSettlementId = ledgerAccountSettlementId
        }

        /** Get all ledger entries that are included in the ledger account statement. */
        fun ledgerAccountStatementId(ledgerAccountStatementId: String?) = apply {
            this.ledgerAccountStatementId = ledgerAccountStatementId
        }

        fun ledgerTransactionId(ledgerTransactionId: String?) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

        /**
         * Order by `created_at` or `effective_at` in `asc` or `desc` order. For example, to order
         * by `effective_at asc`, use `order_by%5Beffective_at%5D=asc`. Ordering by only one field
         * at a time is supported.
         */
        fun orderBy(orderBy: OrderBy?) = apply { this.orderBy = orderBy }

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        /**
         * Alias for [Builder.perPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perPage(perPage: Long) = perPage(perPage as Long?)

        /**
         * If true, response will include the balances attached to the ledger entry. If there is no
         * balance available, null will be returned instead.
         */
        fun showBalances(showBalances: Boolean?) = apply { this.showBalances = showBalances }

        /**
         * Alias for [Builder.showBalances].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun showBalances(showBalances: Boolean) = showBalances(showBalances as Boolean?)

        /**
         * If true, response will include ledger entries that were deleted. When you update a ledger
         * transaction to specify a new set of entries, the previous entries are deleted.
         */
        fun showDeleted(showDeleted: Boolean?) = apply { this.showDeleted = showDeleted }

        /**
         * Alias for [Builder.showDeleted].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun showDeleted(showDeleted: Boolean) = showDeleted(showDeleted as Boolean?)

        /**
         * Get all ledger entries that match the status specified. One of `pending`, `posted`, or
         * `archived`. For multiple statuses, use `status[]=pending&status[]=posted`.
         */
        fun status(status: List<Status>?) = apply { this.status = status?.toMutableList() }

        /**
         * Adds a single [Status] to [Builder.status].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatus(status: Status) = apply {
            this.status = (this.status ?: mutableListOf()).apply { add(status) }
        }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the posted at
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

        /**
         * Returns an immutable instance of [LedgerEntryListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LedgerEntryListParams =
            LedgerEntryListParams(
                id?.toImmutable(),
                afterCursor,
                amount,
                asOfLockVersion,
                direction,
                effectiveAt,
                effectiveDate,
                ledgerAccountCategoryId,
                ledgerAccountId,
                ledgerAccountLockVersion,
                ledgerAccountPayoutId,
                ledgerAccountSettlementId,
                ledgerAccountStatementId,
                ledgerTransactionId,
                metadata,
                orderBy,
                perPage,
                showBalances,
                showDeleted,
                status?.toImmutable(),
                updatedAt,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                id?.forEach { put("id[]", it) }
                afterCursor?.let { put("after_cursor", it) }
                amount?.let {
                    it.eq()?.let { put("amount[eq]", it.toString()) }
                    it.gt()?.let { put("amount[gt]", it.toString()) }
                    it.gte()?.let { put("amount[gte]", it.toString()) }
                    it.lt()?.let { put("amount[lt]", it.toString()) }
                    it.lte()?.let { put("amount[lte]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("amount[$key]", value)
                        }
                    }
                }
                asOfLockVersion?.let { put("as_of_lock_version", it.toString()) }
                direction?.let { put("direction", it.toString()) }
                effectiveAt?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("effective_at[$key]", value)
                        }
                    }
                }
                effectiveDate?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("effective_date[$key]", value)
                        }
                    }
                }
                ledgerAccountCategoryId?.let { put("ledger_account_category_id", it) }
                ledgerAccountId?.let { put("ledger_account_id", it) }
                ledgerAccountLockVersion?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("ledger_account_lock_version[$key]", value)
                        }
                    }
                }
                ledgerAccountPayoutId?.let { put("ledger_account_payout_id", it) }
                ledgerAccountSettlementId?.let { put("ledger_account_settlement_id", it) }
                ledgerAccountStatementId?.let { put("ledger_account_statement_id", it) }
                ledgerTransactionId?.let { put("ledger_transaction_id", it) }
                metadata?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("metadata[$key]", value)
                        }
                    }
                }
                orderBy?.let {
                    it.createdAt()?.let { put("order_by[created_at]", it.toString()) }
                    it.effectiveAt()?.let { put("order_by[effective_at]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("order_by[$key]", value)
                        }
                    }
                }
                perPage?.let { put("per_page", it.toString()) }
                showBalances?.let { put("show_balances", it.toString()) }
                showDeleted?.let { put("show_deleted", it.toString()) }
                status?.forEach { put("status[]", it.toString()) }
                updatedAt?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("updated_at[$key]", value)
                        }
                    }
                }
                putAll(additionalQueryParams)
            }
            .build()

    /** Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by amount. */
    class Amount
    private constructor(
        private val eq: Long?,
        private val gt: Long?,
        private val gte: Long?,
        private val lt: Long?,
        private val lte: Long?,
        private val additionalProperties: QueryParams,
    ) {

        fun eq(): Long? = eq

        fun gt(): Long? = gt

        fun gte(): Long? = gte

        fun lt(): Long? = lt

        fun lte(): Long? = lte

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Amount]. */
            fun builder() = Builder()
        }

        /** A builder for [Amount]. */
        class Builder internal constructor() {

            private var eq: Long? = null
            private var gt: Long? = null
            private var gte: Long? = null
            private var lt: Long? = null
            private var lte: Long? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(amount: Amount) = apply {
                eq = amount.eq
                gt = amount.gt
                gte = amount.gte
                lt = amount.lt
                lte = amount.lte
                additionalProperties = amount.additionalProperties.toBuilder()
            }

            fun eq(eq: Long?) = apply { this.eq = eq }

            /**
             * Alias for [Builder.eq].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun eq(eq: Long) = eq(eq as Long?)

            fun gt(gt: Long?) = apply { this.gt = gt }

            /**
             * Alias for [Builder.gt].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun gt(gt: Long) = gt(gt as Long?)

            fun gte(gte: Long?) = apply { this.gte = gte }

            /**
             * Alias for [Builder.gte].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun gte(gte: Long) = gte(gte as Long?)

            fun lt(lt: Long?) = apply { this.lt = lt }

            /**
             * Alias for [Builder.lt].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun lt(lt: Long) = lt(lt as Long?)

            fun lte(lte: Long?) = apply { this.lte = lte }

            /**
             * Alias for [Builder.lte].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun lte(lte: Long) = lte(lte as Long?)

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

            /**
             * Returns an immutable instance of [Amount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Amount = Amount(eq, gt, gte, lt, lte, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Amount && eq == other.eq && gt == other.gt && gte == other.gte && lt == other.lt && lte == other.lte && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eq, gt, gte, lt, lte, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Amount{eq=$eq, gt=$gt, gte=$gte, lt=$lt, lte=$lte, additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the transaction's
     * effective time. Format ISO8601
     */
    class EffectiveAt private constructor(private val additionalProperties: QueryParams) {

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [EffectiveAt]. */
            fun builder() = Builder()
        }

        /** A builder for [EffectiveAt]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(effectiveAt: EffectiveAt) = apply {
                additionalProperties = effectiveAt.additionalProperties.toBuilder()
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

            /**
             * Returns an immutable instance of [EffectiveAt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): EffectiveAt = EffectiveAt(additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EffectiveAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "EffectiveAt{additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the transaction's
     * effective date. Format YYYY-MM-DD
     */
    class EffectiveDate private constructor(private val additionalProperties: QueryParams) {

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [EffectiveDate]. */
            fun builder() = Builder()
        }

        /** A builder for [EffectiveDate]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(effectiveDate: EffectiveDate) = apply {
                additionalProperties = effectiveDate.additionalProperties.toBuilder()
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

            /**
             * Returns an immutable instance of [EffectiveDate].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): EffectiveDate = EffectiveDate(additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EffectiveDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "EffectiveDate{additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the lock_version of
     * a ledger account. For example, for all entries created at or before before lock_version 1000
     * of a ledger account, use `ledger_account_lock_version%5Blte%5D=1000`.
     */
    class LedgerAccountLockVersion
    private constructor(private val additionalProperties: QueryParams) {

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [LedgerAccountLockVersion].
             */
            fun builder() = Builder()
        }

        /** A builder for [LedgerAccountLockVersion]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(ledgerAccountLockVersion: LedgerAccountLockVersion) = apply {
                additionalProperties = ledgerAccountLockVersion.additionalProperties.toBuilder()
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

            /**
             * Returns an immutable instance of [LedgerAccountLockVersion].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LedgerAccountLockVersion =
                LedgerAccountLockVersion(additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerAccountLockVersion && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerAccountLockVersion{additionalProperties=$additionalProperties}"
    }

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    class Metadata private constructor(private val additionalProperties: QueryParams) {

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
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

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
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
     * Order by `created_at` or `effective_at` in `asc` or `desc` order. For example, to order by
     * `effective_at asc`, use `order_by%5Beffective_at%5D=asc`. Ordering by only one field at a
     * time is supported.
     */
    class OrderBy
    private constructor(
        private val createdAt: CreatedAt?,
        private val effectiveAt: EffectiveAt?,
        private val additionalProperties: QueryParams,
    ) {

        fun createdAt(): CreatedAt? = createdAt

        fun effectiveAt(): EffectiveAt? = effectiveAt

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [OrderBy]. */
            fun builder() = Builder()
        }

        /** A builder for [OrderBy]. */
        class Builder internal constructor() {

            private var createdAt: CreatedAt? = null
            private var effectiveAt: EffectiveAt? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(orderBy: OrderBy) = apply {
                createdAt = orderBy.createdAt
                effectiveAt = orderBy.effectiveAt
                additionalProperties = orderBy.additionalProperties.toBuilder()
            }

            fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

            fun effectiveAt(effectiveAt: EffectiveAt?) = apply { this.effectiveAt = effectiveAt }

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

            /**
             * Returns an immutable instance of [OrderBy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OrderBy = OrderBy(createdAt, effectiveAt, additionalProperties.build())
        }

        class CreatedAt @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ASC = of("asc")

                val DESC = of("desc")

                fun of(value: String) = CreatedAt(JsonField.of(value))
            }

            /** An enum containing [CreatedAt]'s known values. */
            enum class Known {
                ASC,
                DESC,
            }

            /**
             * An enum containing [CreatedAt]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [CreatedAt] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ASC,
                DESC,
                /**
                 * An enum member indicating that [CreatedAt] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ASC -> Value.ASC
                    DESC -> Value.DESC
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    ASC -> Known.ASC
                    DESC -> Known.DESC
                    else -> throw ModernTreasuryInvalidDataException("Unknown CreatedAt: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw ModernTreasuryInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): CreatedAt = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ModernTreasuryInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreatedAt && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EffectiveAt @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ASC = of("asc")

                val DESC = of("desc")

                fun of(value: String) = EffectiveAt(JsonField.of(value))
            }

            /** An enum containing [EffectiveAt]'s known values. */
            enum class Known {
                ASC,
                DESC,
            }

            /**
             * An enum containing [EffectiveAt]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EffectiveAt] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ASC,
                DESC,
                /**
                 * An enum member indicating that [EffectiveAt] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ASC -> Value.ASC
                    DESC -> Value.DESC
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    ASC -> Known.ASC
                    DESC -> Known.DESC
                    else -> throw ModernTreasuryInvalidDataException("Unknown EffectiveAt: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw ModernTreasuryInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): EffectiveAt = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ModernTreasuryInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EffectiveAt && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OrderBy && createdAt == other.createdAt && effectiveAt == other.effectiveAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(createdAt, effectiveAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OrderBy{createdAt=$createdAt, effectiveAt=$effectiveAt, additionalProperties=$additionalProperties}"
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PENDING = of("pending")

            val POSTED = of("posted")

            val ARCHIVED = of("archived")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            POSTED,
            ARCHIVED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            POSTED,
            ARCHIVED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                POSTED -> Value.POSTED
                ARCHIVED -> Value.ARCHIVED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                POSTED -> Known.POSTED
                ARCHIVED -> Known.ARCHIVED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the posted at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * updated_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    class UpdatedAt private constructor(private val additionalProperties: QueryParams) {

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [UpdatedAt]. */
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

            /**
             * Returns an immutable instance of [UpdatedAt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
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

        return /* spotless:off */ other is LedgerEntryListParams && id == other.id && afterCursor == other.afterCursor && amount == other.amount && asOfLockVersion == other.asOfLockVersion && direction == other.direction && effectiveAt == other.effectiveAt && effectiveDate == other.effectiveDate && ledgerAccountCategoryId == other.ledgerAccountCategoryId && ledgerAccountId == other.ledgerAccountId && ledgerAccountLockVersion == other.ledgerAccountLockVersion && ledgerAccountPayoutId == other.ledgerAccountPayoutId && ledgerAccountSettlementId == other.ledgerAccountSettlementId && ledgerAccountStatementId == other.ledgerAccountStatementId && ledgerTransactionId == other.ledgerTransactionId && metadata == other.metadata && orderBy == other.orderBy && perPage == other.perPage && showBalances == other.showBalances && showDeleted == other.showDeleted && status == other.status && updatedAt == other.updatedAt && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, afterCursor, amount, asOfLockVersion, direction, effectiveAt, effectiveDate, ledgerAccountCategoryId, ledgerAccountId, ledgerAccountLockVersion, ledgerAccountPayoutId, ledgerAccountSettlementId, ledgerAccountStatementId, ledgerTransactionId, metadata, orderBy, perPage, showBalances, showDeleted, status, updatedAt, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LedgerEntryListParams{id=$id, afterCursor=$afterCursor, amount=$amount, asOfLockVersion=$asOfLockVersion, direction=$direction, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, ledgerAccountCategoryId=$ledgerAccountCategoryId, ledgerAccountId=$ledgerAccountId, ledgerAccountLockVersion=$ledgerAccountLockVersion, ledgerAccountPayoutId=$ledgerAccountPayoutId, ledgerAccountSettlementId=$ledgerAccountSettlementId, ledgerAccountStatementId=$ledgerAccountStatementId, ledgerTransactionId=$ledgerTransactionId, metadata=$metadata, orderBy=$orderBy, perPage=$perPage, showBalances=$showBalances, showDeleted=$showDeleted, status=$status, updatedAt=$updatedAt, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
