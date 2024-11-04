// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
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
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun createdAt(): CreatedAt? = createdAt

    fun ledgerAccountStatementId(): String? = ledgerAccountStatementId

    fun ledgerTransactionId(): String? = ledgerTransactionId

    fun perPage(): Long? = perPage

    fun version(): Version? = version

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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
        return params.toImmutable()
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerTransactionVersionListParams && this.afterCursor == other.afterCursor && this.createdAt == other.createdAt && this.ledgerAccountStatementId == other.ledgerAccountStatementId && this.ledgerTransactionId == other.ledgerTransactionId && this.perPage == other.perPage && this.version == other.version && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(afterCursor, createdAt, ledgerAccountStatementId, ledgerTransactionId, perPage, version, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "LedgerTransactionVersionListParams{afterCursor=$afterCursor, createdAt=$createdAt, ledgerAccountStatementId=$ledgerAccountStatementId, ledgerTransactionId=$ledgerTransactionId, perPage=$perPage, version=$version, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

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
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        internal fun from(ledgerTransactionVersionListParams: LedgerTransactionVersionListParams) =
            apply {
                this.afterCursor = ledgerTransactionVersionListParams.afterCursor
                this.createdAt = ledgerTransactionVersionListParams.createdAt
                this.ledgerAccountStatementId =
                    ledgerTransactionVersionListParams.ledgerAccountStatementId
                this.ledgerTransactionId = ledgerTransactionVersionListParams.ledgerTransactionId
                this.perPage = ledgerTransactionVersionListParams.perPage
                this.version = ledgerTransactionVersionListParams.version
                additionalHeaders(ledgerTransactionVersionListParams.additionalHeaders)
                additionalQueryParams(ledgerTransactionVersionListParams.additionalQueryParams)
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

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

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

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

        fun build(): LedgerTransactionVersionListParams =
            LedgerTransactionVersionListParams(
                afterCursor,
                createdAt,
                ledgerAccountStatementId,
                ledgerTransactionId,
                perPage,
                version,
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
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the version. For
     * example, for all versions after 2, use version%5Bgt%5D=2.
     */
    @JsonDeserialize(builder = Version.Builder::class)
    @NoAutoDetect
    class Version
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

            fun build(): Version = Version(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Version && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Version{additionalProperties=$additionalProperties}"
    }
}
