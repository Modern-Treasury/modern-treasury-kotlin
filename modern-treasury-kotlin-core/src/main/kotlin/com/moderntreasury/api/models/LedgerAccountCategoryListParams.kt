// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/** Get a list of ledger account categories. */
class LedgerAccountCategoryListParams
private constructor(
    private val id: List<String>?,
    private val afterCursor: String?,
    private val balances: Balances?,
    private val currency: String?,
    private val externalId: String?,
    private val ledgerAccountId: String?,
    private val ledgerId: String?,
    private val metadata: Metadata?,
    private val name: String?,
    private val parentLedgerAccountCategoryId: String?,
    private val perPage: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * If you have specific IDs to retrieve in bulk, you can pass them as query parameters delimited
     * with `id[]=`, for example `?id[]=123&id[]=abc`.
     */
    fun id(): List<String>? = id

    fun afterCursor(): String? = afterCursor

    /**
     * For example, if you want the balances as of a particular time (ISO8601), the encoded query
     * string would be `balances%5Beffective_at%5D=2000-12-31T12:00:00Z`. The balances as of a time
     * are inclusive of entries with that exact time.
     */
    fun balances(): Balances? = balances

    fun currency(): String? = currency

    fun externalId(): String? = externalId

    /** Query categories which contain a ledger account directly or through child categories. */
    fun ledgerAccountId(): String? = ledgerAccountId

    fun ledgerId(): String? = ledgerId

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    fun metadata(): Metadata? = metadata

    fun name(): String? = name

    /** Query categories that are nested underneath a parent category */
    fun parentLedgerAccountCategoryId(): String? = parentLedgerAccountCategoryId

    fun perPage(): Long? = perPage

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): LedgerAccountCategoryListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerAccountCategoryListParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [LedgerAccountCategoryListParams]. */
    class Builder internal constructor() {

        private var id: MutableList<String>? = null
        private var afterCursor: String? = null
        private var balances: Balances? = null
        private var currency: String? = null
        private var externalId: String? = null
        private var ledgerAccountId: String? = null
        private var ledgerId: String? = null
        private var metadata: Metadata? = null
        private var name: String? = null
        private var parentLedgerAccountCategoryId: String? = null
        private var perPage: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(ledgerAccountCategoryListParams: LedgerAccountCategoryListParams) =
            apply {
                id = ledgerAccountCategoryListParams.id?.toMutableList()
                afterCursor = ledgerAccountCategoryListParams.afterCursor
                balances = ledgerAccountCategoryListParams.balances
                currency = ledgerAccountCategoryListParams.currency
                externalId = ledgerAccountCategoryListParams.externalId
                ledgerAccountId = ledgerAccountCategoryListParams.ledgerAccountId
                ledgerId = ledgerAccountCategoryListParams.ledgerId
                metadata = ledgerAccountCategoryListParams.metadata
                name = ledgerAccountCategoryListParams.name
                parentLedgerAccountCategoryId =
                    ledgerAccountCategoryListParams.parentLedgerAccountCategoryId
                perPage = ledgerAccountCategoryListParams.perPage
                additionalHeaders = ledgerAccountCategoryListParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    ledgerAccountCategoryListParams.additionalQueryParams.toBuilder()
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

        /**
         * For example, if you want the balances as of a particular time (ISO8601), the encoded
         * query string would be `balances%5Beffective_at%5D=2000-12-31T12:00:00Z`. The balances as
         * of a time are inclusive of entries with that exact time.
         */
        fun balances(balances: Balances?) = apply { this.balances = balances }

        fun currency(currency: String?) = apply { this.currency = currency }

        fun externalId(externalId: String?) = apply { this.externalId = externalId }

        /** Query categories which contain a ledger account directly or through child categories. */
        fun ledgerAccountId(ledgerAccountId: String?) = apply {
            this.ledgerAccountId = ledgerAccountId
        }

        fun ledgerId(ledgerId: String?) = apply { this.ledgerId = ledgerId }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

        fun name(name: String?) = apply { this.name = name }

        /** Query categories that are nested underneath a parent category */
        fun parentLedgerAccountCategoryId(parentLedgerAccountCategoryId: String?) = apply {
            this.parentLedgerAccountCategoryId = parentLedgerAccountCategoryId
        }

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        /**
         * Alias for [Builder.perPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perPage(perPage: Long) = perPage(perPage as Long?)

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
         * Returns an immutable instance of [LedgerAccountCategoryListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LedgerAccountCategoryListParams =
            LedgerAccountCategoryListParams(
                id?.toImmutable(),
                afterCursor,
                balances,
                currency,
                externalId,
                ledgerAccountId,
                ledgerId,
                metadata,
                name,
                parentLedgerAccountCategoryId,
                perPage,
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
                balances?.let {
                    it.effectiveAt()?.let {
                        put(
                            "balances[effective_at]",
                            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                        )
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("balances[$key]", value)
                        }
                    }
                }
                currency?.let { put("currency", it) }
                externalId?.let { put("external_id", it) }
                ledgerAccountId?.let { put("ledger_account_id", it) }
                ledgerId?.let { put("ledger_id", it) }
                metadata?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("metadata[$key]", value)
                        }
                    }
                }
                name?.let { put("name", it) }
                parentLedgerAccountCategoryId?.let { put("parent_ledger_account_category_id", it) }
                perPage?.let { put("per_page", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * For example, if you want the balances as of a particular time (ISO8601), the encoded query
     * string would be `balances%5Beffective_at%5D=2000-12-31T12:00:00Z`. The balances as of a time
     * are inclusive of entries with that exact time.
     */
    class Balances
    private constructor(
        private val effectiveAt: OffsetDateTime?,
        private val additionalProperties: QueryParams,
    ) {

        fun effectiveAt(): OffsetDateTime? = effectiveAt

        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Balances]. */
            fun builder() = Builder()
        }

        /** A builder for [Balances]. */
        class Builder internal constructor() {

            private var effectiveAt: OffsetDateTime? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(balances: Balances) = apply {
                effectiveAt = balances.effectiveAt
                additionalProperties = balances.additionalProperties.toBuilder()
            }

            fun effectiveAt(effectiveAt: OffsetDateTime?) = apply { this.effectiveAt = effectiveAt }

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
             * Returns an immutable instance of [Balances].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Balances = Balances(effectiveAt, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Balances && effectiveAt == other.effectiveAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(effectiveAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Balances{effectiveAt=$effectiveAt, additionalProperties=$additionalProperties}"
    }

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    class Metadata private constructor(private val additionalProperties: QueryParams) {

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountCategoryListParams && id == other.id && afterCursor == other.afterCursor && balances == other.balances && currency == other.currency && externalId == other.externalId && ledgerAccountId == other.ledgerAccountId && ledgerId == other.ledgerId && metadata == other.metadata && name == other.name && parentLedgerAccountCategoryId == other.parentLedgerAccountCategoryId && perPage == other.perPage && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, afterCursor, balances, currency, externalId, ledgerAccountId, ledgerId, metadata, name, parentLedgerAccountCategoryId, perPage, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LedgerAccountCategoryListParams{id=$id, afterCursor=$afterCursor, balances=$balances, currency=$currency, externalId=$externalId, ledgerAccountId=$ledgerAccountId, ledgerId=$ledgerId, metadata=$metadata, name=$name, parentLedgerAccountCategoryId=$parentLedgerAccountCategoryId, perPage=$perPage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
