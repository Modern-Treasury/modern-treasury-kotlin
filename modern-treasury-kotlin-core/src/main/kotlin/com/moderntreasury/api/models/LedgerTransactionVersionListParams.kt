// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.models.*
import java.util.Objects

class LedgerTransactionVersionListParams
constructor(
    private val afterCursor: String?,
    private val createdAt: CreatedAt?,
    private val ledgerAccountStatementId: String?,
    private val ledgerTransactionId: String?,
    private val perPage: Long?,
    private val version: Version?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun afterCursor(): String? = afterCursor

    fun createdAt(): CreatedAt? = createdAt

    fun ledgerAccountStatementId(): String? = ledgerAccountStatementId

    fun ledgerTransactionId(): String? = ledgerTransactionId

    fun perPage(): Long? = perPage

    fun version(): Version? = version

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.createdAt?.forEachQueryParam { key, values -> params.put("created_at[$key]", values) }
        this.ledgerAccountStatementId?.let {
            params.put("ledger_account_statement_id", listOf(it.toString()))
        }
        this.ledgerTransactionId?.let { params.put("ledger_transaction_id", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.version?.forEachQueryParam { key, values -> params.put("version[$key]", values) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerTransactionVersionListParams &&
            this.afterCursor == other.afterCursor &&
            this.createdAt == other.createdAt &&
            this.ledgerAccountStatementId == other.ledgerAccountStatementId &&
            this.ledgerTransactionId == other.ledgerTransactionId &&
            this.perPage == other.perPage &&
            this.version == other.version &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            afterCursor,
            createdAt,
            ledgerAccountStatementId,
            ledgerTransactionId,
            perPage,
            version,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "LedgerTransactionVersionListParams{afterCursor=$afterCursor, createdAt=$createdAt, ledgerAccountStatementId=$ledgerAccountStatementId, ledgerTransactionId=$ledgerTransactionId, perPage=$perPage, version=$version, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var createdAt: CreatedAt? = null
        private var ledgerAccountStatementId: String? = null
        private var ledgerTransactionId: String? = null
        private var perPage: Long? = null
        private var version: Version? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerTransactionVersionListParams: LedgerTransactionVersionListParams) =
            apply {
                this.afterCursor = ledgerTransactionVersionListParams.afterCursor
                this.createdAt = ledgerTransactionVersionListParams.createdAt
                this.ledgerAccountStatementId =
                    ledgerTransactionVersionListParams.ledgerAccountStatementId
                this.ledgerTransactionId = ledgerTransactionVersionListParams.ledgerTransactionId
                this.perPage = ledgerTransactionVersionListParams.perPage
                this.version = ledgerTransactionVersionListParams.version
                additionalQueryParams(ledgerTransactionVersionListParams.additionalQueryParams)
                additionalHeaders(ledgerTransactionVersionListParams.additionalHeaders)
                additionalBodyProperties(
                    ledgerTransactionVersionListParams.additionalBodyProperties
                )
            }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the created_at
         * timestamp. For example, for all dates after Jan 1 2000 12:00 UTC, use
         * created_at%5Bgt%5D=2000-01-01T12:00:00Z.
         */
        fun createdAt(createdAt: CreatedAt) = apply { this.createdAt = createdAt }

        /**
         * Get all ledger transaction versions that are included in the ledger account statement.
         */
        fun ledgerAccountStatementId(ledgerAccountStatementId: String) = apply {
            this.ledgerAccountStatementId = ledgerAccountStatementId
        }

        /**
         * Get all the ledger transaction versions corresponding to the ID of a ledger transaction.
         */
        fun ledgerTransactionId(ledgerTransactionId: String) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the version. For
         * example, for all versions after 2, use version%5Bgt%5D=2.
         */
        fun version(version: Version) = apply { this.version = version }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): LedgerTransactionVersionListParams =
            LedgerTransactionVersionListParams(
                afterCursor,
                createdAt,
                ledgerAccountStatementId,
                ledgerTransactionId,
                perPage,
                version,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the created_at
     * timestamp. For example, for all dates after Jan 1 2000 12:00 UTC, use
     * created_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    @JsonDeserialize(builder = CreatedAt.Builder::class)
    @NoAutoDetect
    class CreatedAt
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

            return other is CreatedAt && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "CreatedAt{additionalProperties=$additionalProperties}"

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

            fun build(): CreatedAt = CreatedAt(additionalProperties.toUnmodifiable())
        }
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the version. For
     * example, for all versions after 2, use version%5Bgt%5D=2.
     */
    @JsonDeserialize(builder = Version.Builder::class)
    @NoAutoDetect
    class Version
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

            return other is Version && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Version{additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            internal fun from(version: Version) = apply {
                additionalProperties(version.additionalProperties)
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

            fun build(): Version = Version(additionalProperties.toUnmodifiable())
        }
    }
}
