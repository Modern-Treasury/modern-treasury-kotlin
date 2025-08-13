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
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/** create transaction */
class TransactionCreateParams
private constructor(
    private val body: TransactionCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * The date on which the transaction occurred.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun asOfDate(): LocalDate? = body.asOfDate()

    /**
     * Either `credit` or `debit`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun direction(): String = body.direction()

    /**
     * The ID of the relevant Internal Account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun internalAccountId(): String = body.internalAccountId()

    /**
     * When applicable, the bank-given code that determines the transaction's category. For most
     * banks this is the BAI2/BTRS transaction code.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun vendorCode(): String? = body.vendorCode()

    /**
     * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
     * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`, `goldman_sachs`,
     * `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or others.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun vendorCodeType(): String? = body.vendorCodeType()

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * This field will be `true` if the transaction has posted to the account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun posted(): Boolean? = body.posted()

    /**
     * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`, `book`,
     * or `sen`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): Type? = body.type()

    /**
     * An identifier given to this transaction by the bank, often `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun vendorCustomerId(): String? = body.vendorCustomerId()

    /**
     * The transaction detail text that often appears in on your bank statement and in your banking
     * portal.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun vendorDescription(): String? = body.vendorDescription()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [asOfDate].
     *
     * Unlike [asOfDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _asOfDate(): JsonField<LocalDate> = body._asOfDate()

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _direction(): JsonField<String> = body._direction()

    /**
     * Returns the raw JSON value of [internalAccountId].
     *
     * Unlike [internalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _internalAccountId(): JsonField<String> = body._internalAccountId()

    /**
     * Returns the raw JSON value of [vendorCode].
     *
     * Unlike [vendorCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vendorCode(): JsonField<String> = body._vendorCode()

    /**
     * Returns the raw JSON value of [vendorCodeType].
     *
     * Unlike [vendorCodeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vendorCodeType(): JsonField<String> = body._vendorCodeType()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [posted].
     *
     * Unlike [posted], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _posted(): JsonField<Boolean> = body._posted()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [vendorCustomerId].
     *
     * Unlike [vendorCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _vendorCustomerId(): JsonField<String> = body._vendorCustomerId()

    /**
     * Returns the raw JSON value of [vendorDescription].
     *
     * Unlike [vendorDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _vendorDescription(): JsonField<String> = body._vendorDescription()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

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
    class Builder internal constructor() {

        private var body: TransactionCreateRequest.Builder = TransactionCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(transactionCreateParams: TransactionCreateParams) = apply {
            body = transactionCreateParams.body.toBuilder()
            additionalHeaders = transactionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = transactionCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amount]
         * - [asOfDate]
         * - [direction]
         * - [internalAccountId]
         * - [vendorCode]
         * - etc.
         */
        fun body(body: TransactionCreateRequest) = apply { this.body = body.toBuilder() }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** The date on which the transaction occurred. */
        fun asOfDate(asOfDate: LocalDate?) = apply { body.asOfDate(asOfDate) }

        /**
         * Sets [Builder.asOfDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asOfDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { body.asOfDate(asOfDate) }

        /** Either `credit` or `debit`. */
        fun direction(direction: String) = apply { body.direction(direction) }

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<String>) = apply { body.direction(direction) }

        /** The ID of the relevant Internal Account. */
        fun internalAccountId(internalAccountId: String) = apply {
            body.internalAccountId(internalAccountId)
        }

        /**
         * Sets [Builder.internalAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internalAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            body.internalAccountId(internalAccountId)
        }

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
         */
        fun vendorCode(vendorCode: String?) = apply { body.vendorCode(vendorCode) }

        /**
         * Sets [Builder.vendorCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Sets [Builder.vendorCodeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorCodeType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vendorCodeType(vendorCodeType: JsonField<String>) = apply {
            body.vendorCodeType(vendorCodeType)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** This field will be `true` if the transaction has posted to the account. */
        fun posted(posted: Boolean) = apply { body.posted(posted) }

        /**
         * Sets [Builder.posted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.posted] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun posted(posted: JsonField<Boolean>) = apply { body.posted(posted) }

        /**
         * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
         * `book`, or `sen`.
         */
        fun type(type: Type?) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /** An identifier given to this transaction by the bank, often `null`. */
        fun vendorCustomerId(vendorCustomerId: String?) = apply {
            body.vendorCustomerId(vendorCustomerId)
        }

        /**
         * Sets [Builder.vendorCustomerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorCustomerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vendorCustomerId(vendorCustomerId: JsonField<String>) = apply {
            body.vendorCustomerId(vendorCustomerId)
        }

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
         */
        fun vendorDescription(vendorDescription: String?) = apply {
            body.vendorDescription(vendorDescription)
        }

        /**
         * Sets [Builder.vendorDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /**
         * Returns an immutable instance of [TransactionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
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
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransactionCreateParams =
            TransactionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): TransactionCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class TransactionCreateRequest
    private constructor(
        private val amount: JsonField<Long>,
        private val asOfDate: JsonField<LocalDate>,
        private val direction: JsonField<String>,
        private val internalAccountId: JsonField<String>,
        private val vendorCode: JsonField<String>,
        private val vendorCodeType: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val posted: JsonField<Boolean>,
        private val type: JsonField<Type>,
        private val vendorCustomerId: JsonField<String>,
        private val vendorDescription: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("as_of_date")
            @ExcludeMissing
            asOfDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("internal_account_id")
            @ExcludeMissing
            internalAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vendor_code")
            @ExcludeMissing
            vendorCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vendor_code_type")
            @ExcludeMissing
            vendorCodeType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("posted") @ExcludeMissing posted: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("vendor_customer_id")
            @ExcludeMissing
            vendorCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vendor_description")
            @ExcludeMissing
            vendorDescription: JsonField<String> = JsonMissing.of(),
        ) : this(
            amount,
            asOfDate,
            direction,
            internalAccountId,
            vendorCode,
            vendorCodeType,
            metadata,
            posted,
            type,
            vendorCustomerId,
            vendorDescription,
            mutableMapOf(),
        )

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The date on which the transaction occurred.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun asOfDate(): LocalDate? = asOfDate.getNullable("as_of_date")

        /**
         * Either `credit` or `debit`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun direction(): String = direction.getRequired("direction")

        /**
         * The ID of the relevant Internal Account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun vendorCode(): String? = vendorCode.getNullable("vendor_code")

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or
         * others.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun vendorCodeType(): String? = vendorCodeType.getNullable("vendor_code_type")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * This field will be `true` if the transaction has posted to the account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun posted(): Boolean? = posted.getNullable("posted")

        /**
         * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
         * `book`, or `sen`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun type(): Type? = type.getNullable("type")

        /**
         * An identifier given to this transaction by the bank, often `null`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun vendorCustomerId(): String? = vendorCustomerId.getNullable("vendor_customer_id")

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun vendorDescription(): String? = vendorDescription.getNullable("vendor_description")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [asOfDate].
         *
         * Unlike [asOfDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("as_of_date") @ExcludeMissing fun _asOfDate(): JsonField<LocalDate> = asOfDate

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<String> = direction

        /**
         * Returns the raw JSON value of [internalAccountId].
         *
         * Unlike [internalAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        fun _internalAccountId(): JsonField<String> = internalAccountId

        /**
         * Returns the raw JSON value of [vendorCode].
         *
         * Unlike [vendorCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vendor_code")
        @ExcludeMissing
        fun _vendorCode(): JsonField<String> = vendorCode

        /**
         * Returns the raw JSON value of [vendorCodeType].
         *
         * Unlike [vendorCodeType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vendor_code_type")
        @ExcludeMissing
        fun _vendorCodeType(): JsonField<String> = vendorCodeType

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [posted].
         *
         * Unlike [posted], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("posted") @ExcludeMissing fun _posted(): JsonField<Boolean> = posted

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [vendorCustomerId].
         *
         * Unlike [vendorCustomerId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vendor_customer_id")
        @ExcludeMissing
        fun _vendorCustomerId(): JsonField<String> = vendorCustomerId

        /**
         * Returns the raw JSON value of [vendorDescription].
         *
         * Unlike [vendorDescription], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vendor_description")
        @ExcludeMissing
        fun _vendorDescription(): JsonField<String> = vendorDescription

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
            private var vendorCustomerId: JsonField<String> = JsonMissing.of()
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
                vendorCustomerId = transactionCreateRequest.vendorCustomerId
                vendorDescription = transactionCreateRequest.vendorDescription
                additionalProperties = transactionCreateRequest.additionalProperties.toMutableMap()
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The date on which the transaction occurred. */
            fun asOfDate(asOfDate: LocalDate?) = asOfDate(JsonField.ofNullable(asOfDate))

            /**
             * Sets [Builder.asOfDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.asOfDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

            /** Either `credit` or `debit`. */
            fun direction(direction: String) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<String>) = apply { this.direction = direction }

            /** The ID of the relevant Internal Account. */
            fun internalAccountId(internalAccountId: String) =
                internalAccountId(JsonField.of(internalAccountId))

            /**
             * Sets [Builder.internalAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.internalAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun internalAccountId(internalAccountId: JsonField<String>) = apply {
                this.internalAccountId = internalAccountId
            }

            /**
             * When applicable, the bank-given code that determines the transaction's category. For
             * most banks this is the BAI2/BTRS transaction code.
             */
            fun vendorCode(vendorCode: String?) = vendorCode(JsonField.ofNullable(vendorCode))

            /**
             * Sets [Builder.vendorCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vendorCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.vendorCodeType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vendorCodeType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** This field will be `true` if the transaction has posted to the account. */
            fun posted(posted: Boolean) = posted(JsonField.of(posted))

            /**
             * Sets [Builder.posted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.posted] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun posted(posted: JsonField<Boolean>) = apply { this.posted = posted }

            /**
             * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
             * `book`, or `sen`.
             */
            fun type(type: Type?) = type(JsonField.ofNullable(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** An identifier given to this transaction by the bank, often `null`. */
            fun vendorCustomerId(vendorCustomerId: String?) =
                vendorCustomerId(JsonField.ofNullable(vendorCustomerId))

            /**
             * Sets [Builder.vendorCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vendorCustomerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vendorCustomerId(vendorCustomerId: JsonField<String>) = apply {
                this.vendorCustomerId = vendorCustomerId
            }

            /**
             * The transaction detail text that often appears in on your bank statement and in your
             * banking portal.
             */
            fun vendorDescription(vendorDescription: String?) =
                vendorDescription(JsonField.ofNullable(vendorDescription))

            /**
             * Sets [Builder.vendorDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vendorDescription] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [TransactionCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
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
             *
             * @throws IllegalStateException if any required field is unset.
             */
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
                    vendorCustomerId,
                    vendorDescription,
                    additionalProperties.toMutableMap(),
                )
        }

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
            type()?.validate()
            vendorCustomerId()
            vendorDescription()
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
        internal fun validity(): Int =
            (if (amount.asKnown() == null) 0 else 1) +
                (if (asOfDate.asKnown() == null) 0 else 1) +
                (if (direction.asKnown() == null) 0 else 1) +
                (if (internalAccountId.asKnown() == null) 0 else 1) +
                (if (vendorCode.asKnown() == null) 0 else 1) +
                (if (vendorCodeType.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (posted.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0) +
                (if (vendorCustomerId.asKnown() == null) 0 else 1) +
                (if (vendorDescription.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactionCreateRequest &&
                amount == other.amount &&
                asOfDate == other.asOfDate &&
                direction == other.direction &&
                internalAccountId == other.internalAccountId &&
                vendorCode == other.vendorCode &&
                vendorCodeType == other.vendorCodeType &&
                metadata == other.metadata &&
                posted == other.posted &&
                type == other.type &&
                vendorCustomerId == other.vendorCustomerId &&
                vendorDescription == other.vendorDescription &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amount,
                asOfDate,
                direction,
                internalAccountId,
                vendorCode,
                vendorCodeType,
                metadata,
                posted,
                type,
                vendorCustomerId,
                vendorDescription,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransactionCreateRequest{amount=$amount, asOfDate=$asOfDate, direction=$direction, internalAccountId=$internalAccountId, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, metadata=$metadata, posted=$posted, type=$type, vendorCustomerId=$vendorCustomerId, vendorDescription=$vendorDescription, additionalProperties=$additionalProperties}"
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

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
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

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

            val BASE = of("base")

            val BOOK = of("book")

            val CARD = of("card")

            val CHATS = of("chats")

            val CHECK = of("check")

            val CROSS_BORDER = of("cross_border")

            val DK_NETS = of("dk_nets")

            val EFT = of("eft")

            val ETHEREUM = of("ethereum")

            val HU_ICS = of("hu_ics")

            val INTERAC = of("interac")

            val MASAV = of("masav")

            val MX_CCEN = of("mx_ccen")

            val NEFT = of("neft")

            val NICS = of("nics")

            val NZ_BECS = of("nz_becs")

            val PL_ELIXIR = of("pl_elixir")

            val POLYGON = of("polygon")

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

            val SOLANA = of("solana")

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
            BASE,
            BOOK,
            CARD,
            CHATS,
            CHECK,
            CROSS_BORDER,
            DK_NETS,
            EFT,
            ETHEREUM,
            HU_ICS,
            INTERAC,
            MASAV,
            MX_CCEN,
            NEFT,
            NICS,
            NZ_BECS,
            PL_ELIXIR,
            POLYGON,
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
            SOLANA,
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
            BASE,
            BOOK,
            CARD,
            CHATS,
            CHECK,
            CROSS_BORDER,
            DK_NETS,
            EFT,
            ETHEREUM,
            HU_ICS,
            INTERAC,
            MASAV,
            MX_CCEN,
            NEFT,
            NICS,
            NZ_BECS,
            PL_ELIXIR,
            POLYGON,
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
            SOLANA,
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
                BASE -> Value.BASE
                BOOK -> Value.BOOK
                CARD -> Value.CARD
                CHATS -> Value.CHATS
                CHECK -> Value.CHECK
                CROSS_BORDER -> Value.CROSS_BORDER
                DK_NETS -> Value.DK_NETS
                EFT -> Value.EFT
                ETHEREUM -> Value.ETHEREUM
                HU_ICS -> Value.HU_ICS
                INTERAC -> Value.INTERAC
                MASAV -> Value.MASAV
                MX_CCEN -> Value.MX_CCEN
                NEFT -> Value.NEFT
                NICS -> Value.NICS
                NZ_BECS -> Value.NZ_BECS
                PL_ELIXIR -> Value.PL_ELIXIR
                POLYGON -> Value.POLYGON
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
                SOLANA -> Value.SOLANA
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
                BASE -> Known.BASE
                BOOK -> Known.BOOK
                CARD -> Known.CARD
                CHATS -> Known.CHATS
                CHECK -> Known.CHECK
                CROSS_BORDER -> Known.CROSS_BORDER
                DK_NETS -> Known.DK_NETS
                EFT -> Known.EFT
                ETHEREUM -> Known.ETHEREUM
                HU_ICS -> Known.HU_ICS
                INTERAC -> Known.INTERAC
                MASAV -> Known.MASAV
                MX_CCEN -> Known.MX_CCEN
                NEFT -> Known.NEFT
                NICS -> Known.NICS
                NZ_BECS -> Known.NZ_BECS
                PL_ELIXIR -> Known.PL_ELIXIR
                POLYGON -> Known.POLYGON
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
                SOLANA -> Known.SOLANA
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

        private var validated: Boolean = false

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TransactionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
