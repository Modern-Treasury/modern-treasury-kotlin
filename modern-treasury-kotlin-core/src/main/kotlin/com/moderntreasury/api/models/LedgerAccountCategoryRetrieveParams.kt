// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/** Get the details on a single ledger account category. */
class LedgerAccountCategoryRetrieveParams
private constructor(
    private val id: String?,
    private val balances: Balances?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /**
     * For example, if you want the balances as of a particular time (ISO8601), the encoded query
     * string would be `balances%5Beffective_at%5D=2000-12-31T12:00:00Z`. The balances as of a time
     * are inclusive of entries with that exact time, but with respect to the ledger accounts that
     * are currently present in the category.
     */
    fun balances(): Balances? = balances

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): LedgerAccountCategoryRetrieveParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerAccountCategoryRetrieveParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [LedgerAccountCategoryRetrieveParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var balances: Balances? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            ledgerAccountCategoryRetrieveParams: LedgerAccountCategoryRetrieveParams
        ) = apply {
            id = ledgerAccountCategoryRetrieveParams.id
            balances = ledgerAccountCategoryRetrieveParams.balances
            additionalHeaders = ledgerAccountCategoryRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                ledgerAccountCategoryRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /**
         * For example, if you want the balances as of a particular time (ISO8601), the encoded
         * query string would be `balances%5Beffective_at%5D=2000-12-31T12:00:00Z`. The balances as
         * of a time are inclusive of entries with that exact time, but with respect to the ledger
         * accounts that are currently present in the category.
         */
        fun balances(balances: Balances?) = apply { this.balances = balances }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [LedgerAccountCategoryRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LedgerAccountCategoryRetrieveParams =
            LedgerAccountCategoryRetrieveParams(
                id,
                balances,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                balances?.let {
                    it.asOfDate()?.let { put("balances[as_of_date]", it.toString()) }
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
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * For example, if you want the balances as of a particular time (ISO8601), the encoded query
     * string would be `balances%5Beffective_at%5D=2000-12-31T12:00:00Z`. The balances as of a time
     * are inclusive of entries with that exact time, but with respect to the ledger accounts that
     * are currently present in the category.
     */
    class Balances
    private constructor(
        private val asOfDate: LocalDate?,
        private val effectiveAt: OffsetDateTime?,
        private val additionalProperties: QueryParams,
    ) {

        fun asOfDate(): LocalDate? = asOfDate

        fun effectiveAt(): OffsetDateTime? = effectiveAt

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Balances]. */
            fun builder() = Builder()
        }

        /** A builder for [Balances]. */
        class Builder internal constructor() {

            private var asOfDate: LocalDate? = null
            private var effectiveAt: OffsetDateTime? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(balances: Balances) = apply {
                asOfDate = balances.asOfDate
                effectiveAt = balances.effectiveAt
                additionalProperties = balances.additionalProperties.toBuilder()
            }

            fun asOfDate(asOfDate: LocalDate?) = apply { this.asOfDate = asOfDate }

            fun effectiveAt(effectiveAt: OffsetDateTime?) = apply { this.effectiveAt = effectiveAt }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceadditional_properties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAlladditional_properties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeadditional_properties(key: String) = apply {
                additionalProperties.remove(key)
            }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Balances].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Balances = Balances(asOfDate, effectiveAt, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Balances &&
                asOfDate == other.asOfDate &&
                effectiveAt == other.effectiveAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(asOfDate, effectiveAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Balances{asOfDate=$asOfDate, effectiveAt=$effectiveAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerAccountCategoryRetrieveParams &&
            id == other.id &&
            balances == other.balances &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, balances, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "LedgerAccountCategoryRetrieveParams{id=$id, balances=$balances, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
