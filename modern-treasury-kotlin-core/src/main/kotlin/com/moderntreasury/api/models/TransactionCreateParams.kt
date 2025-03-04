// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects

/** create transaction */
class TransactionCreateParams
private constructor(
    private val body: TransactionCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    fun amount(): Long = body.amount()

    /** The date on which the transaction occurred. */
    fun asOfDate(): LocalDate? = body.asOfDate()

    /** Either `credit` or `debit`. */
    fun direction(): String = body.direction()

    /** The ID of the relevant Internal Account. */
    fun internalAccountId(): String = body.internalAccountId()

    /**
     * When applicable, the bank-given code that determines the transaction's category. For most
     * banks this is the BAI2/BTRS transaction code.
     */
    fun vendorCode(): String? = body.vendorCode()

    /**
     * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
     * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`, `goldman_sachs`,
     * `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or others.
     */
    fun vendorCodeType(): String? = body.vendorCodeType()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata? = body.metadata()

    /** This field will be `true` if the transaction has posted to the account. */
    fun posted(): Boolean? = body.posted()

    /**
     * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`, `book`,
     * or `sen`.
     */
    fun type(): Type? = body.type()

    /**
     * The transaction detail text that often appears in on your bank statement and in your banking
     * portal.
     */
    fun vendorDescription(): String? = body.vendorDescription()

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    fun _amount(): JsonField<Long> = body._amount()

    /** The date on which the transaction occurred. */
    fun _asOfDate(): JsonField<LocalDate> = body._asOfDate()

    /** Either `credit` or `debit`. */
    fun _direction(): JsonField<String> = body._direction()

    /** The ID of the relevant Internal Account. */
    fun _internalAccountId(): JsonField<String> = body._internalAccountId()

    /**
     * When applicable, the bank-given code that determines the transaction's category. For most
     * banks this is the BAI2/BTRS transaction code.
     */
    fun _vendorCode(): JsonField<String> = body._vendorCode()

    /**
     * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
     * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`, `goldman_sachs`,
     * `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or others.
     */
    fun _vendorCodeType(): JsonField<String> = body._vendorCodeType()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /** This field will be `true` if the transaction has posted to the account. */
    fun _posted(): JsonField<Boolean> = body._posted()

    /**
     * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`, `book`,
     * or `sen`.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * The transaction detail text that often appears in on your bank statement and in your banking
     * portal.
     */
    fun _vendorDescription(): JsonField<String> = body._vendorDescription()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): TransactionCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class TransactionCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("as_of_date")
        @ExcludeMissing
        private val asOfDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        private val direction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        private val internalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vendor_code")
        @ExcludeMissing
        private val vendorCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vendor_code_type")
        @ExcludeMissing
        private val vendorCodeType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("posted")
        @ExcludeMissing
        private val posted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("vendor_description")
        @ExcludeMissing
        private val vendorDescription: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(): Long = amount.getRequired("amount")

        /** The date on which the transaction occurred. */
        fun asOfDate(): LocalDate? = asOfDate.getNullable("as_of_date")

        /** Either `credit` or `debit`. */
        fun direction(): String = direction.getRequired("direction")

        /** The ID of the relevant Internal Account. */
        fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
         */
        fun vendorCode(): String? = vendorCode.getNullable("vendor_code")

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or
         * others.
         */
        fun vendorCodeType(): String? = vendorCodeType.getNullable("vendor_code_type")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /** This field will be `true` if the transaction has posted to the account. */
        fun posted(): Boolean? = posted.getNullable("posted")

        /**
         * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
         * `book`, or `sen`.
         */
        fun type(): Type? = type.getNullable("type")

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
         */
        fun vendorDescription(): String? = vendorDescription.getNullable("vendor_description")

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** The date on which the transaction occurred. */
        @JsonProperty("as_of_date") @ExcludeMissing fun _asOfDate(): JsonField<LocalDate> = asOfDate

        /** Either `credit` or `debit`. */
        @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<String> = direction

        /** The ID of the relevant Internal Account. */
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        fun _internalAccountId(): JsonField<String> = internalAccountId

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
         */
        @JsonProperty("vendor_code")
        @ExcludeMissing
        fun _vendorCode(): JsonField<String> = vendorCode

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or
         * others.
         */
        @JsonProperty("vendor_code_type")
        @ExcludeMissing
        fun _vendorCodeType(): JsonField<String> = vendorCodeType

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /** This field will be `true` if the transaction has posted to the account. */
        @JsonProperty("posted") @ExcludeMissing fun _posted(): JsonField<Boolean> = posted

        /**
         * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
         * `book`, or `sen`.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
         */
        @JsonProperty("vendor_description")
        @ExcludeMissing
        fun _vendorDescription(): JsonField<String> = vendorDescription

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TransactionCreateRequest = apply {
            if (validated) {
                return@apply
            }

            amount()
            asOfDate()
            direction()
            internalAccountId()
            vendorCode()
            vendorCodeType()
            metadata()?.validate()
            posted()
            type()
            vendorDescription()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [TransactionCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .asOfDate()
             * .direction()
             * .internalAccountId()
             * .vendorCode()
             * .vendorCodeType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [TransactionCreateRequest]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var asOfDate: JsonField<LocalDate>? = null
            private var direction: JsonField<String>? = null
            private var internalAccountId: JsonField<String>? = null
            private var vendorCode: JsonField<String>? = null
            private var vendorCodeType: JsonField<String>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var posted: JsonField<Boolean> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var vendorDescription: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(transactionCreateRequest: TransactionCreateRequest) = apply {
                amount = transactionCreateRequest.amount
                asOfDate = transactionCreateRequest.asOfDate
                direction = transactionCreateRequest.direction
                internalAccountId = transactionCreateRequest.internalAccountId
                vendorCode = transactionCreateRequest.vendorCode
                vendorCodeType = transactionCreateRequest.vendorCodeType
                metadata = transactionCreateRequest.metadata
                posted = transactionCreateRequest.posted
                type = transactionCreateRequest.type
                vendorDescription = transactionCreateRequest.vendorDescription
                additionalProperties = transactionCreateRequest.additionalProperties.toMutableMap()
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The date on which the transaction occurred. */
            fun asOfDate(asOfDate: LocalDate?) = asOfDate(JsonField.ofNullable(asOfDate))

            /** The date on which the transaction occurred. */
            fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

            /** Either `credit` or `debit`. */
            fun direction(direction: String) = direction(JsonField.of(direction))

            /** Either `credit` or `debit`. */
            fun direction(direction: JsonField<String>) = apply { this.direction = direction }

            /** The ID of the relevant Internal Account. */
            fun internalAccountId(internalAccountId: String) =
                internalAccountId(JsonField.of(internalAccountId))

            /** The ID of the relevant Internal Account. */
            fun internalAccountId(internalAccountId: JsonField<String>) = apply {
                this.internalAccountId = internalAccountId
            }

            /**
             * When applicable, the bank-given code that determines the transaction's category. For
             * most banks this is the BAI2/BTRS transaction code.
             */
            fun vendorCode(vendorCode: String?) = vendorCode(JsonField.ofNullable(vendorCode))

            /**
             * When applicable, the bank-given code that determines the transaction's category. For
             * most banks this is the BAI2/BTRS transaction code.
             */
            fun vendorCode(vendorCode: JsonField<String>) = apply { this.vendorCode = vendorCode }

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * `us_bank`, or others.
             */
            fun vendorCodeType(vendorCodeType: String?) =
                vendorCodeType(JsonField.ofNullable(vendorCodeType))

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * `us_bank`, or others.
             */
            fun vendorCodeType(vendorCodeType: JsonField<String>) = apply {
                this.vendorCodeType = vendorCodeType
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** This field will be `true` if the transaction has posted to the account. */
            fun posted(posted: Boolean) = posted(JsonField.of(posted))

            /** This field will be `true` if the transaction has posted to the account. */
            fun posted(posted: JsonField<Boolean>) = apply { this.posted = posted }

            /**
             * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
             * `book`, or `sen`.
             */
            fun type(type: Type?) = type(JsonField.ofNullable(type))

            /**
             * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
             * `book`, or `sen`.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * The transaction detail text that often appears in on your bank statement and in your
             * banking portal.
             */
            fun vendorDescription(vendorDescription: String?) =
                vendorDescription(JsonField.ofNullable(vendorDescription))

            /**
             * The transaction detail text that often appears in on your bank statement and in your
             * banking portal.
             */
            fun vendorDescription(vendorDescription: JsonField<String>) = apply {
                this.vendorDescription = vendorDescription
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

            fun build(): TransactionCreateRequest =
                TransactionCreateRequest(
                    checkRequired("amount", amount),
                    checkRequired("asOfDate", asOfDate),
                    checkRequired("direction", direction),
                    checkRequired("internalAccountId", internalAccountId),
                    checkRequired("vendorCode", vendorCode),
                    checkRequired("vendorCodeType", vendorCodeType),
                    metadata,
                    posted,
                    type,
                    vendorDescription,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransactionCreateRequest && amount == other.amount && asOfDate == other.asOfDate && direction == other.direction && internalAccountId == other.internalAccountId && vendorCode == other.vendorCode && vendorCodeType == other.vendorCodeType && metadata == other.metadata && posted == other.posted && type == other.type && vendorDescription == other.vendorDescription && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, asOfDate, direction, internalAccountId, vendorCode, vendorCodeType, metadata, posted, type, vendorDescription, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransactionCreateRequest{amount=$amount, asOfDate=$asOfDate, direction=$direction, internalAccountId=$internalAccountId, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, metadata=$metadata, posted=$posted, type=$type, vendorDescription=$vendorDescription, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TransactionCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .asOfDate()
         * .direction()
         * .internalAccountId()
         * .vendorCode()
         * .vendorCodeType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TransactionCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: TransactionCreateRequest.Builder = TransactionCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(transactionCreateParams: TransactionCreateParams) = apply {
            body = transactionCreateParams.body.toBuilder()
            additionalHeaders = transactionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = transactionCreateParams.additionalQueryParams.toBuilder()
        }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** The date on which the transaction occurred. */
        fun asOfDate(asOfDate: LocalDate?) = apply { body.asOfDate(asOfDate) }

        /** The date on which the transaction occurred. */
        fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { body.asOfDate(asOfDate) }

        /** Either `credit` or `debit`. */
        fun direction(direction: String) = apply { body.direction(direction) }

        /** Either `credit` or `debit`. */
        fun direction(direction: JsonField<String>) = apply { body.direction(direction) }

        /** The ID of the relevant Internal Account. */
        fun internalAccountId(internalAccountId: String) = apply {
            body.internalAccountId(internalAccountId)
        }

        /** The ID of the relevant Internal Account. */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            body.internalAccountId(internalAccountId)
        }

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
         */
        fun vendorCode(vendorCode: String?) = apply { body.vendorCode(vendorCode) }

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
         */
        fun vendorCode(vendorCode: JsonField<String>) = apply { body.vendorCode(vendorCode) }

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or
         * others.
         */
        fun vendorCodeType(vendorCodeType: String?) = apply { body.vendorCodeType(vendorCodeType) }

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or
         * others.
         */
        fun vendorCodeType(vendorCodeType: JsonField<String>) = apply {
            body.vendorCodeType(vendorCodeType)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** This field will be `true` if the transaction has posted to the account. */
        fun posted(posted: Boolean) = apply { body.posted(posted) }

        /** This field will be `true` if the transaction has posted to the account. */
        fun posted(posted: JsonField<Boolean>) = apply { body.posted(posted) }

        /**
         * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
         * `book`, or `sen`.
         */
        fun type(type: Type?) = apply { body.type(type) }

        /**
         * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
         * `book`, or `sen`.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
         */
        fun vendorDescription(vendorDescription: String?) = apply {
            body.vendorDescription(vendorDescription)
        }

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
         */
        fun vendorDescription(vendorDescription: JsonField<String>) = apply {
            body.vendorDescription(vendorDescription)
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

        fun build(): TransactionCreateParams =
            TransactionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
     * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`, `book`,
     * or `sen`.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val ACH = of("ach")

            val AU_BECS = of("au_becs")

            val BACS = of("bacs")

            val BOOK = of("book")

            val CARD = of("card")

            val CHATS = of("chats")

            val CHECK = of("check")

            val CROSS_BORDER = of("cross_border")

            val DK_NETS = of("dk_nets")

            val EFT = of("eft")

            val HU_ICS = of("hu_ics")

            val INTERAC = of("interac")

            val MASAV = of("masav")

            val MX_CCEN = of("mx_ccen")

            val NEFT = of("neft")

            val NICS = of("nics")

            val NZ_BECS = of("nz_becs")

            val PL_ELIXIR = of("pl_elixir")

            val PROVXCHANGE = of("provxchange")

            val RO_SENT = of("ro_sent")

            val RTP = of("rtp")

            val SE_BANKGIROT = of("se_bankgirot")

            val SEN = of("sen")

            val SEPA = of("sepa")

            val SG_GIRO = of("sg_giro")

            val SIC = of("sic")

            val SIGNET = of("signet")

            val SKNBI = of("sknbi")

            val WIRE = of("wire")

            val ZENGIN = of("zengin")

            val OTHER = of("other")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ACH,
            AU_BECS,
            BACS,
            BOOK,
            CARD,
            CHATS,
            CHECK,
            CROSS_BORDER,
            DK_NETS,
            EFT,
            HU_ICS,
            INTERAC,
            MASAV,
            MX_CCEN,
            NEFT,
            NICS,
            NZ_BECS,
            PL_ELIXIR,
            PROVXCHANGE,
            RO_SENT,
            RTP,
            SE_BANKGIROT,
            SEN,
            SEPA,
            SG_GIRO,
            SIC,
            SIGNET,
            SKNBI,
            WIRE,
            ZENGIN,
            OTHER,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACH,
            AU_BECS,
            BACS,
            BOOK,
            CARD,
            CHATS,
            CHECK,
            CROSS_BORDER,
            DK_NETS,
            EFT,
            HU_ICS,
            INTERAC,
            MASAV,
            MX_CCEN,
            NEFT,
            NICS,
            NZ_BECS,
            PL_ELIXIR,
            PROVXCHANGE,
            RO_SENT,
            RTP,
            SE_BANKGIROT,
            SEN,
            SEPA,
            SG_GIRO,
            SIC,
            SIGNET,
            SKNBI,
            WIRE,
            ZENGIN,
            OTHER,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                ACH -> Value.ACH
                AU_BECS -> Value.AU_BECS
                BACS -> Value.BACS
                BOOK -> Value.BOOK
                CARD -> Value.CARD
                CHATS -> Value.CHATS
                CHECK -> Value.CHECK
                CROSS_BORDER -> Value.CROSS_BORDER
                DK_NETS -> Value.DK_NETS
                EFT -> Value.EFT
                HU_ICS -> Value.HU_ICS
                INTERAC -> Value.INTERAC
                MASAV -> Value.MASAV
                MX_CCEN -> Value.MX_CCEN
                NEFT -> Value.NEFT
                NICS -> Value.NICS
                NZ_BECS -> Value.NZ_BECS
                PL_ELIXIR -> Value.PL_ELIXIR
                PROVXCHANGE -> Value.PROVXCHANGE
                RO_SENT -> Value.RO_SENT
                RTP -> Value.RTP
                SE_BANKGIROT -> Value.SE_BANKGIROT
                SEN -> Value.SEN
                SEPA -> Value.SEPA
                SG_GIRO -> Value.SG_GIRO
                SIC -> Value.SIC
                SIGNET -> Value.SIGNET
                SKNBI -> Value.SKNBI
                WIRE -> Value.WIRE
                ZENGIN -> Value.ZENGIN
                OTHER -> Value.OTHER
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
                ACH -> Known.ACH
                AU_BECS -> Known.AU_BECS
                BACS -> Known.BACS
                BOOK -> Known.BOOK
                CARD -> Known.CARD
                CHATS -> Known.CHATS
                CHECK -> Known.CHECK
                CROSS_BORDER -> Known.CROSS_BORDER
                DK_NETS -> Known.DK_NETS
                EFT -> Known.EFT
                HU_ICS -> Known.HU_ICS
                INTERAC -> Known.INTERAC
                MASAV -> Known.MASAV
                MX_CCEN -> Known.MX_CCEN
                NEFT -> Known.NEFT
                NICS -> Known.NICS
                NZ_BECS -> Known.NZ_BECS
                PL_ELIXIR -> Known.PL_ELIXIR
                PROVXCHANGE -> Known.PROVXCHANGE
                RO_SENT -> Known.RO_SENT
                RTP -> Known.RTP
                SE_BANKGIROT -> Known.SE_BANKGIROT
                SEN -> Known.SEN
                SEPA -> Known.SEPA
                SG_GIRO -> Known.SG_GIRO
                SIC -> Known.SIC
                SIGNET -> Known.SIGNET
                SKNBI -> Known.SKNBI
                WIRE -> Known.WIRE
                ZENGIN -> Known.ZENGIN
                OTHER -> Known.OTHER
                else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TransactionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
