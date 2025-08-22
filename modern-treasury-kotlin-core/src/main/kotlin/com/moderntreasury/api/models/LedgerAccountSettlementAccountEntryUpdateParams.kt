// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.Objects

/** Add ledger entries to a draft ledger account settlement. */
class LedgerAccountSettlementAccountEntryUpdateParams
private constructor(
    private val id: String?,
    private val body: LedgerAccountSettlementEntriesPatchRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /**
     * The ids of the ledger entries that are to be added or removed from the ledger account
     * settlement.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerEntryIds(): List<String>? = body.ledgerEntryIds()

    /**
     * Returns the raw JSON value of [ledgerEntryIds].
     *
     * Unlike [ledgerEntryIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ledgerEntryIds(): JsonField<List<String>> = body._ledgerEntryIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerAccountSettlementAccountEntryUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .ledgerEntryIds()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LedgerAccountSettlementAccountEntryUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: LedgerAccountSettlementEntriesPatchRequest.Builder =
            LedgerAccountSettlementEntriesPatchRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            ledgerAccountSettlementAccountEntryUpdateParams:
                LedgerAccountSettlementAccountEntryUpdateParams
        ) = apply {
            id = ledgerAccountSettlementAccountEntryUpdateParams.id
            body = ledgerAccountSettlementAccountEntryUpdateParams.body.toBuilder()
            additionalHeaders =
                ledgerAccountSettlementAccountEntryUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                ledgerAccountSettlementAccountEntryUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [ledgerEntryIds]
         */
        fun body(body: LedgerAccountSettlementEntriesPatchRequest) = apply {
            this.body = body.toBuilder()
        }

        /**
         * The ids of the ledger entries that are to be added or removed from the ledger account
         * settlement.
         */
        fun ledgerEntryIds(ledgerEntryIds: List<String>?) = apply {
            body.ledgerEntryIds(ledgerEntryIds)
        }

        /**
         * Sets [Builder.ledgerEntryIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerEntryIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ledgerEntryIds(ledgerEntryIds: JsonField<List<String>>) = apply {
            body.ledgerEntryIds(ledgerEntryIds)
        }

        /**
         * Adds a single [String] to [ledgerEntryIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLedgerEntryId(ledgerEntryId: String) = apply { body.addLedgerEntryId(ledgerEntryId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAlladditional_body_properties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAlladditional_body_properties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAlladditional_body_properties(keys: Set<String>) = apply {
            body.removeAlladditional_body_properties(keys)
        }

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
         * Returns an immutable instance of [LedgerAccountSettlementAccountEntryUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .ledgerEntryIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LedgerAccountSettlementAccountEntryUpdateParams =
            LedgerAccountSettlementAccountEntryUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): LedgerAccountSettlementEntriesPatchRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class LedgerAccountSettlementEntriesPatchRequest
    private constructor(
        private val ledgerEntryIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ledger_entry_ids")
            @ExcludeMissing
            ledgerEntryIds: JsonField<List<String>> = JsonMissing.of()
        ) : this(ledgerEntryIds, mutableMapOf())

        /**
         * The ids of the ledger entries that are to be added or removed from the ledger account
         * settlement.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ledgerEntryIds(): List<String>? = ledgerEntryIds.getNullable("ledger_entry_ids")

        /**
         * Returns the raw JSON value of [ledgerEntryIds].
         *
         * Unlike [ledgerEntryIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ledger_entry_ids")
        @ExcludeMissing
        fun _ledgerEntryIds(): JsonField<List<String>> = ledgerEntryIds

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [LedgerAccountSettlementEntriesPatchRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .ledgerEntryIds()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LedgerAccountSettlementEntriesPatchRequest]. */
        class Builder internal constructor() {

            private var ledgerEntryIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                ledgerAccountSettlementEntriesPatchRequest:
                    LedgerAccountSettlementEntriesPatchRequest
            ) = apply {
                ledgerEntryIds =
                    ledgerAccountSettlementEntriesPatchRequest.ledgerEntryIds.map {
                        it.toMutableList()
                    }
                additionalProperties =
                    ledgerAccountSettlementEntriesPatchRequest.additionalProperties.toMutableMap()
            }

            /**
             * The ids of the ledger entries that are to be added or removed from the ledger account
             * settlement.
             */
            fun ledgerEntryIds(ledgerEntryIds: List<String>?) =
                ledgerEntryIds(JsonField.ofNullable(ledgerEntryIds))

            /**
             * Sets [Builder.ledgerEntryIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerEntryIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ledgerEntryIds(ledgerEntryIds: JsonField<List<String>>) = apply {
                this.ledgerEntryIds = ledgerEntryIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [ledgerEntryIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLedgerEntryId(ledgerEntryId: String) = apply {
                ledgerEntryIds =
                    (ledgerEntryIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ledgerEntryIds", it).add(ledgerEntryId)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [LedgerAccountSettlementEntriesPatchRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .ledgerEntryIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LedgerAccountSettlementEntriesPatchRequest =
                LedgerAccountSettlementEntriesPatchRequest(
                    checkRequired("ledgerEntryIds", ledgerEntryIds).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LedgerAccountSettlementEntriesPatchRequest = apply {
            if (validated) {
                return@apply
            }

            ledgerEntryIds()
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
        internal fun validity(): Int = (ledgerEntryIds.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LedgerAccountSettlementEntriesPatchRequest &&
                ledgerEntryIds == other.ledgerEntryIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(ledgerEntryIds, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerAccountSettlementEntriesPatchRequest{ledgerEntryIds=$ledgerEntryIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerAccountSettlementAccountEntryUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "LedgerAccountSettlementAccountEntryUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
