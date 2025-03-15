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
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Objects

/** Remove ledger entries from a draft ledger account settlement. */
class LedgerAccountSettlementAccountEntryDeleteParams
private constructor(
    private val id: String,
    private val body: LedgerAccountSettlementEntriesDeleteRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    /**
     * The ids of the ledger entries that are to be added or removed from the ledger account
     * settlement.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerEntryIds(): List<JsonValue>? = body.ledgerEntryIds()

    /**
     * Returns the raw JSON value of [ledgerEntryIds].
     *
     * Unlike [ledgerEntryIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ledgerEntryIds(): JsonField<List<JsonValue>> = body._ledgerEntryIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): LedgerAccountSettlementEntriesDeleteRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class LedgerAccountSettlementEntriesDeleteRequest
    @JsonCreator
    private constructor(
        @JsonProperty("ledger_entry_ids")
        @ExcludeMissing
        private val ledgerEntryIds: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The ids of the ledger entries that are to be added or removed from the ledger account
         * settlement.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ledgerEntryIds(): List<JsonValue>? = ledgerEntryIds.getNullable("ledger_entry_ids")

        /**
         * Returns the raw JSON value of [ledgerEntryIds].
         *
         * Unlike [ledgerEntryIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ledger_entry_ids")
        @ExcludeMissing
        fun _ledgerEntryIds(): JsonField<List<JsonValue>> = ledgerEntryIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LedgerAccountSettlementEntriesDeleteRequest = apply {
            if (validated) {
                return@apply
            }

            ledgerEntryIds()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [LedgerAccountSettlementEntriesDeleteRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .ledgerEntryIds()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LedgerAccountSettlementEntriesDeleteRequest]. */
        class Builder internal constructor() {

            private var ledgerEntryIds: JsonField<MutableList<JsonValue>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                ledgerAccountSettlementEntriesDeleteRequest:
                    LedgerAccountSettlementEntriesDeleteRequest
            ) = apply {
                ledgerEntryIds =
                    ledgerAccountSettlementEntriesDeleteRequest.ledgerEntryIds.map {
                        it.toMutableList()
                    }
                additionalProperties =
                    ledgerAccountSettlementEntriesDeleteRequest.additionalProperties.toMutableMap()
            }

            /**
             * The ids of the ledger entries that are to be added or removed from the ledger account
             * settlement.
             */
            fun ledgerEntryIds(ledgerEntryIds: List<JsonValue>?) =
                ledgerEntryIds(JsonField.ofNullable(ledgerEntryIds))

            /**
             * Sets [Builder.ledgerEntryIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerEntryIds] with a well-typed `List<JsonValue>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ledgerEntryIds(ledgerEntryIds: JsonField<List<JsonValue>>) = apply {
                this.ledgerEntryIds = ledgerEntryIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [ledgerEntryIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLedgerEntryId(ledgerEntryId: JsonValue) = apply {
                ledgerEntryIds =
                    (ledgerEntryIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ledgerEntryIds", it).add(ledgerEntryId)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): LedgerAccountSettlementEntriesDeleteRequest =
                LedgerAccountSettlementEntriesDeleteRequest(
                    checkRequired("ledgerEntryIds", ledgerEntryIds).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerAccountSettlementEntriesDeleteRequest && ledgerEntryIds == other.ledgerEntryIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(ledgerEntryIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerAccountSettlementEntriesDeleteRequest{ledgerEntryIds=$ledgerEntryIds, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerAccountSettlementAccountEntryDeleteParams].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .ledgerEntryIds()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LedgerAccountSettlementAccountEntryDeleteParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var id: String? = null
        private var body: LedgerAccountSettlementEntriesDeleteRequest.Builder =
            LedgerAccountSettlementEntriesDeleteRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            ledgerAccountSettlementAccountEntryDeleteParams:
                LedgerAccountSettlementAccountEntryDeleteParams
        ) = apply {
            id = ledgerAccountSettlementAccountEntryDeleteParams.id
            body = ledgerAccountSettlementAccountEntryDeleteParams.body.toBuilder()
            additionalHeaders =
                ledgerAccountSettlementAccountEntryDeleteParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                ledgerAccountSettlementAccountEntryDeleteParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        /**
         * The ids of the ledger entries that are to be added or removed from the ledger account
         * settlement.
         */
        fun ledgerEntryIds(ledgerEntryIds: List<JsonValue>?) = apply {
            body.ledgerEntryIds(ledgerEntryIds)
        }

        /**
         * Sets [Builder.ledgerEntryIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerEntryIds] with a well-typed `List<JsonValue>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun ledgerEntryIds(ledgerEntryIds: JsonField<List<JsonValue>>) = apply {
            body.ledgerEntryIds(ledgerEntryIds)
        }

        /**
         * Adds a single [JsonValue] to [ledgerEntryIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLedgerEntryId(ledgerEntryId: JsonValue) = apply {
            body.addLedgerEntryId(ledgerEntryId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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

        fun build(): LedgerAccountSettlementAccountEntryDeleteParams =
            LedgerAccountSettlementAccountEntryDeleteParams(
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountSettlementAccountEntryDeleteParams && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LedgerAccountSettlementAccountEntryDeleteParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
