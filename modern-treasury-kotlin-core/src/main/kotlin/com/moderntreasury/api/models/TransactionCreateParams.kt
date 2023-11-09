// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.util.Objects

class TransactionCreateParams
constructor(
    private val amount: Long,
    private val asOfDate: LocalDate?,
    private val direction: String,
    private val internalAccountId: String,
    private val vendorCode: String,
    private val vendorCodeType: String,
    private val metadata: Metadata?,
    private val posted: Boolean?,
    private val vendorDescription: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun asOfDate(): LocalDate? = asOfDate

    fun direction(): String = direction

    fun internalAccountId(): String = internalAccountId

    fun vendorCode(): String = vendorCode

    fun vendorCodeType(): String = vendorCodeType

    fun metadata(): Metadata? = metadata

    fun posted(): Boolean? = posted

    fun vendorDescription(): String? = vendorDescription

    internal fun getBody(): TransactionCreateBody {
        return TransactionCreateBody(
            amount,
            asOfDate,
            direction,
            internalAccountId,
            vendorCode,
            vendorCodeType,
            metadata,
            posted,
            vendorDescription,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = TransactionCreateBody.Builder::class)
    @NoAutoDetect
    class TransactionCreateBody
    internal constructor(
        private val amount: Long?,
        private val asOfDate: LocalDate?,
        private val direction: String?,
        private val internalAccountId: String?,
        private val vendorCode: String?,
        private val vendorCodeType: String?,
        private val metadata: Metadata?,
        private val posted: Boolean?,
        private val vendorDescription: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The date on which the transaction occurred. */
        @JsonProperty("as_of_date") fun asOfDate(): LocalDate? = asOfDate

        /** Either `credit` or `debit`. */
        @JsonProperty("direction") fun direction(): String? = direction

        /** The ID of the relevant Internal Account. */
        @JsonProperty("internal_account_id") fun internalAccountId(): String? = internalAccountId

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
         */
        @JsonProperty("vendor_code") fun vendorCode(): String? = vendorCode

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or
         * others.
         */
        @JsonProperty("vendor_code_type") fun vendorCodeType(): String? = vendorCodeType

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** This field will be `true` if the transaction has posted to the account. */
        @JsonProperty("posted") fun posted(): Boolean? = posted

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
         */
        @JsonProperty("vendor_description") fun vendorDescription(): String? = vendorDescription

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactionCreateBody &&
                this.amount == other.amount &&
                this.asOfDate == other.asOfDate &&
                this.direction == other.direction &&
                this.internalAccountId == other.internalAccountId &&
                this.vendorCode == other.vendorCode &&
                this.vendorCodeType == other.vendorCodeType &&
                this.metadata == other.metadata &&
                this.posted == other.posted &&
                this.vendorDescription == other.vendorDescription &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        asOfDate,
                        direction,
                        internalAccountId,
                        vendorCode,
                        vendorCodeType,
                        metadata,
                        posted,
                        vendorDescription,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TransactionCreateBody{amount=$amount, asOfDate=$asOfDate, direction=$direction, internalAccountId=$internalAccountId, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, metadata=$metadata, posted=$posted, vendorDescription=$vendorDescription, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var asOfDate: LocalDate? = null
            private var direction: String? = null
            private var internalAccountId: String? = null
            private var vendorCode: String? = null
            private var vendorCodeType: String? = null
            private var metadata: Metadata? = null
            private var posted: Boolean? = null
            private var vendorDescription: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(transactionCreateBody: TransactionCreateBody) = apply {
                this.amount = transactionCreateBody.amount
                this.asOfDate = transactionCreateBody.asOfDate
                this.direction = transactionCreateBody.direction
                this.internalAccountId = transactionCreateBody.internalAccountId
                this.vendorCode = transactionCreateBody.vendorCode
                this.vendorCodeType = transactionCreateBody.vendorCodeType
                this.metadata = transactionCreateBody.metadata
                this.posted = transactionCreateBody.posted
                this.vendorDescription = transactionCreateBody.vendorDescription
                additionalProperties(transactionCreateBody.additionalProperties)
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The date on which the transaction occurred. */
            @JsonProperty("as_of_date")
            fun asOfDate(asOfDate: LocalDate) = apply { this.asOfDate = asOfDate }

            /** Either `credit` or `debit`. */
            @JsonProperty("direction")
            fun direction(direction: String) = apply { this.direction = direction }

            /** The ID of the relevant Internal Account. */
            @JsonProperty("internal_account_id")
            fun internalAccountId(internalAccountId: String) = apply {
                this.internalAccountId = internalAccountId
            }

            /**
             * When applicable, the bank-given code that determines the transaction's category. For
             * most banks this is the BAI2/BTRS transaction code.
             */
            @JsonProperty("vendor_code")
            fun vendorCode(vendorCode: String) = apply { this.vendorCode = vendorCode }

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * `us_bank`, or others.
             */
            @JsonProperty("vendor_code_type")
            fun vendorCodeType(vendorCodeType: String) = apply {
                this.vendorCodeType = vendorCodeType
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** This field will be `true` if the transaction has posted to the account. */
            @JsonProperty("posted") fun posted(posted: Boolean) = apply { this.posted = posted }

            /**
             * The transaction detail text that often appears in on your bank statement and in your
             * banking portal.
             */
            @JsonProperty("vendor_description")
            fun vendorDescription(vendorDescription: String) = apply {
                this.vendorDescription = vendorDescription
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): TransactionCreateBody =
                TransactionCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    asOfDate,
                    checkNotNull(direction) { "`direction` is required but was not set" },
                    checkNotNull(internalAccountId) {
                        "`internalAccountId` is required but was not set"
                    },
                    checkNotNull(vendorCode) { "`vendorCode` is required but was not set" },
                    checkNotNull(vendorCodeType) { "`vendorCodeType` is required but was not set" },
                    metadata,
                    posted,
                    vendorDescription,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionCreateParams &&
            this.amount == other.amount &&
            this.asOfDate == other.asOfDate &&
            this.direction == other.direction &&
            this.internalAccountId == other.internalAccountId &&
            this.vendorCode == other.vendorCode &&
            this.vendorCodeType == other.vendorCodeType &&
            this.metadata == other.metadata &&
            this.posted == other.posted &&
            this.vendorDescription == other.vendorDescription &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amount,
            asOfDate,
            direction,
            internalAccountId,
            vendorCode,
            vendorCodeType,
            metadata,
            posted,
            vendorDescription,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "TransactionCreateParams{amount=$amount, asOfDate=$asOfDate, direction=$direction, internalAccountId=$internalAccountId, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, metadata=$metadata, posted=$posted, vendorDescription=$vendorDescription, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var asOfDate: LocalDate? = null
        private var direction: String? = null
        private var internalAccountId: String? = null
        private var vendorCode: String? = null
        private var vendorCodeType: String? = null
        private var metadata: Metadata? = null
        private var posted: Boolean? = null
        private var vendorDescription: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(transactionCreateParams: TransactionCreateParams) = apply {
            this.amount = transactionCreateParams.amount
            this.asOfDate = transactionCreateParams.asOfDate
            this.direction = transactionCreateParams.direction
            this.internalAccountId = transactionCreateParams.internalAccountId
            this.vendorCode = transactionCreateParams.vendorCode
            this.vendorCodeType = transactionCreateParams.vendorCodeType
            this.metadata = transactionCreateParams.metadata
            this.posted = transactionCreateParams.posted
            this.vendorDescription = transactionCreateParams.vendorDescription
            additionalQueryParams(transactionCreateParams.additionalQueryParams)
            additionalHeaders(transactionCreateParams.additionalHeaders)
            additionalBodyProperties(transactionCreateParams.additionalBodyProperties)
        }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The date on which the transaction occurred. */
        fun asOfDate(asOfDate: LocalDate) = apply { this.asOfDate = asOfDate }

        /** Either `credit` or `debit`. */
        fun direction(direction: String) = apply { this.direction = direction }

        /** The ID of the relevant Internal Account. */
        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
         */
        fun vendorCode(vendorCode: String) = apply { this.vendorCode = vendorCode }

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or
         * others.
         */
        fun vendorCodeType(vendorCodeType: String) = apply { this.vendorCodeType = vendorCodeType }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** This field will be `true` if the transaction has posted to the account. */
        fun posted(posted: Boolean) = apply { this.posted = posted }

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
         */
        fun vendorDescription(vendorDescription: String) = apply {
            this.vendorDescription = vendorDescription
        }

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

        fun build(): TransactionCreateParams =
            TransactionCreateParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                asOfDate,
                checkNotNull(direction) { "`direction` is required but was not set" },
                checkNotNull(internalAccountId) {
                    "`internalAccountId` is required but was not set"
                },
                checkNotNull(vendorCode) { "`vendorCode` is required but was not set" },
                checkNotNull(vendorCodeType) { "`vendorCodeType` is required but was not set" },
                metadata,
                posted,
                vendorDescription,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }
}
