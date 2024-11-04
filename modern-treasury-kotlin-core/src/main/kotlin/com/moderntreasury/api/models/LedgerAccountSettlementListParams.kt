// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.models.*
import java.util.Objects

class LedgerAccountSettlementListParams
constructor(
    private val id: List<String>?,
    private val afterCursor: String?,
    private val createdAt: CreatedAt?,
    private val ledgerId: String?,
    private val ledgerTransactionId: String?,
    private val metadata: Metadata?,
    private val perPage: Long?,
    private val settledLedgerAccountId: String?,
    private val settlementEntryDirection: String?,
    private val updatedAt: UpdatedAt?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun id(): List<String>? = id

    fun afterCursor(): String? = afterCursor

    fun createdAt(): CreatedAt? = createdAt

    fun ledgerId(): String? = ledgerId

    fun ledgerTransactionId(): String? = ledgerTransactionId

    fun metadata(): Metadata? = metadata

    fun perPage(): Long? = perPage

    fun settledLedgerAccountId(): String? = settledLedgerAccountId

    fun settlementEntryDirection(): String? = settlementEntryDirection

    fun updatedAt(): UpdatedAt? = updatedAt

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.id?.let { params.put("id[]", it.map(Any::toString)) }
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.createdAt?.forEachQueryParam { key, values -> params.put("created_at[$key]", values) }
        this.ledgerId?.let { params.put("ledger_id", listOf(it.toString())) }
        this.ledgerTransactionId?.let { params.put("ledger_transaction_id", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values -> params.put("metadata[$key]", values) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.settledLedgerAccountId?.let {
            params.put("settled_ledger_account_id", listOf(it.toString()))
        }
        this.settlementEntryDirection?.let {
            params.put("settlement_entry_direction", listOf(it.toString()))
        }
        this.updatedAt?.forEachQueryParam { key, values -> params.put("updated_at[$key]", values) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountSettlementListParams && this.id == other.id && this.afterCursor == other.afterCursor && this.createdAt == other.createdAt && this.ledgerId == other.ledgerId && this.ledgerTransactionId == other.ledgerTransactionId && this.metadata == other.metadata && this.perPage == other.perPage && this.settledLedgerAccountId == other.settledLedgerAccountId && this.settlementEntryDirection == other.settlementEntryDirection && this.updatedAt == other.updatedAt && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(id, afterCursor, createdAt, ledgerId, ledgerTransactionId, metadata, perPage, settledLedgerAccountId, settlementEntryDirection, updatedAt, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "LedgerAccountSettlementListParams{id=$id, afterCursor=$afterCursor, createdAt=$createdAt, ledgerId=$ledgerId, ledgerTransactionId=$ledgerTransactionId, metadata=$metadata, perPage=$perPage, settledLedgerAccountId=$settledLedgerAccountId, settlementEntryDirection=$settlementEntryDirection, updatedAt=$updatedAt, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: MutableList<String> = mutableListOf()
        private var afterCursor: String? = null
        private var createdAt: CreatedAt? = null
        private var ledgerId: String? = null
        private var ledgerTransactionId: String? = null
        private var metadata: Metadata? = null
        private var perPage: Long? = null
        private var settledLedgerAccountId: String? = null
        private var settlementEntryDirection: String? = null
        private var updatedAt: UpdatedAt? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        internal fun from(ledgerAccountSettlementListParams: LedgerAccountSettlementListParams) =
            apply {
                this.id(ledgerAccountSettlementListParams.id ?: listOf())
                this.afterCursor = ledgerAccountSettlementListParams.afterCursor
                this.createdAt = ledgerAccountSettlementListParams.createdAt
                this.ledgerId = ledgerAccountSettlementListParams.ledgerId
                this.ledgerTransactionId = ledgerAccountSettlementListParams.ledgerTransactionId
                this.metadata = ledgerAccountSettlementListParams.metadata
                this.perPage = ledgerAccountSettlementListParams.perPage
                this.settledLedgerAccountId =
                    ledgerAccountSettlementListParams.settledLedgerAccountId
                this.settlementEntryDirection =
                    ledgerAccountSettlementListParams.settlementEntryDirection
                this.updatedAt = ledgerAccountSettlementListParams.updatedAt
                additionalHeaders(ledgerAccountSettlementListParams.additionalHeaders)
                additionalQueryParams(ledgerAccountSettlementListParams.additionalQueryParams)
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
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the created at
         * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
         * created_at%5Bgt%5D=2000-01-01T12:00:00Z.
         */
        fun createdAt(createdAt: CreatedAt) = apply { this.createdAt = createdAt }

        fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

        fun ledgerTransactionId(ledgerTransactionId: String) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        fun settledLedgerAccountId(settledLedgerAccountId: String) = apply {
            this.settledLedgerAccountId = settledLedgerAccountId
        }

        fun settlementEntryDirection(settlementEntryDirection: String) = apply {
            this.settlementEntryDirection = settlementEntryDirection
        }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the updated at
         * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
         * updated_at%5Bgt%5D=2000-01-01T12:00:00Z.
         */
        fun updatedAt(updatedAt: UpdatedAt) = apply { this.updatedAt = updatedAt }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

        fun build(): LedgerAccountSettlementListParams =
            LedgerAccountSettlementListParams(
                if (id.size == 0) null else id.toImmutable(),
                afterCursor,
                createdAt,
                ledgerId,
                ledgerTransactionId,
                metadata,
                perPage,
                settledLedgerAccountId,
                settlementEntryDirection,
                updatedAt,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
            )
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
