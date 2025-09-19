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
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class ReturnObject
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Long>,
    private val code: JsonField<Code>,
    private val corrections: JsonField<Corrections>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val currentReturn: JsonField<ReturnObject>,
    private val dateOfDeath: JsonField<LocalDate>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val failureReason: JsonField<String>,
    private val internalAccountId: JsonField<String>,
    private val ledgerTransactionId: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val object_: JsonField<String>,
    private val reason: JsonField<String>,
    private val referenceNumbers: JsonField<List<PaymentReference>>,
    private val returnableId: JsonField<String>,
    private val returnableType: JsonField<ReturnableType>,
    private val role: JsonField<Role>,
    private val status: JsonField<Status>,
    private val transactionId: JsonField<String>,
    private val transactionLineItemId: JsonField<String>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalInformation: JsonField<String>,
    private val data: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<Code> = JsonMissing.of(),
        @JsonProperty("corrections")
        @ExcludeMissing
        corrections: JsonField<Corrections> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("current_return")
        @ExcludeMissing
        currentReturn: JsonField<ReturnObject> = JsonMissing.of(),
        @JsonProperty("date_of_death")
        @ExcludeMissing
        dateOfDeath: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("failure_reason")
        @ExcludeMissing
        failureReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        internalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_transaction_id")
        @ExcludeMissing
        ledgerTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reference_numbers")
        @ExcludeMissing
        referenceNumbers: JsonField<List<PaymentReference>> = JsonMissing.of(),
        @JsonProperty("returnable_id")
        @ExcludeMissing
        returnableId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("returnable_type")
        @ExcludeMissing
        returnableType: JsonField<ReturnableType> = JsonMissing.of(),
        @JsonProperty("role") @ExcludeMissing role: JsonField<Role> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction_line_item_id")
        @ExcludeMissing
        transactionLineItemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("additional_information")
        @ExcludeMissing
        additionalInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonValue = JsonMissing.of(),
    ) : this(
        id,
        amount,
        code,
        corrections,
        createdAt,
        currency,
        currentReturn,
        dateOfDeath,
        discardedAt,
        failureReason,
        internalAccountId,
        ledgerTransactionId,
        liveMode,
        object_,
        reason,
        referenceNumbers,
        returnableId,
        returnableType,
        role,
        status,
        transactionId,
        transactionLineItemId,
        type,
        updatedAt,
        additionalInformation,
        data,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The return code. For ACH returns, this is the required ACH return code.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun code(): Code? = code.getNullable("code")

    /**
     * Only relevant for ACH NOC returns. This is an object containing all of the new and corrected
     * information provided by the bank that was previously incorrect on the original outgoing
     * payment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun corrections(): Corrections? = corrections.getNullable("corrections")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Currency that this transaction is denominated in.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * If the return's status is `returned`, this will include the return object's data that is
     * returning this return.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currentReturn(): ReturnObject? = currentReturn.getNullable("current_return")

    /**
     * If the return code is `R14` or `R15` this is the date the deceased counterparty passed away.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateOfDeath(): LocalDate? = dateOfDeath.getNullable("date_of_death")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /**
     * If an originating return failed to be processed by the bank, a description of the failure
     * reason will be available.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun failureReason(): String? = failureReason.getNullable("failure_reason")

    /**
     * The ID of the relevant Internal Account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun internalAccountId(): String? = internalAccountId.getNullable("internal_account_id")

    /**
     * The ID of the ledger transaction linked to the return.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerTransactionId(): String? = ledgerTransactionId.getNullable("ledger_transaction_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun object_(): String = object_.getRequired("object")

    /**
     * Often the bank will provide an explanation for the return, which is a short human readable
     * string.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reason(): String? = reason.getNullable("reason")

    /**
     * An array of Payment Reference objects.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referenceNumbers(): List<PaymentReference> =
        referenceNumbers.getRequired("reference_numbers")

    /**
     * The ID of the object being returned or `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun returnableId(): String? = returnableId.getNullable("returnable_id")

    /**
     * The type of object being returned or `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun returnableType(): ReturnableType? = returnableType.getNullable("returnable_type")

    /**
     * The role of the return, can be `originating` or `receiving`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun role(): Role = role.getRequired("role")

    /**
     * The current status of the return.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The ID of the relevant Transaction or `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transactionId(): String? = transactionId.getNullable("transaction_id")

    /**
     * The ID of the relevant Transaction Line Item or `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transactionLineItemId(): String? =
        transactionLineItemId.getNullable("transaction_line_item_id")

    /**
     * The type of return. Can be one of: `ach`, `ach_noc`, `au_becs`, `bacs`, `eft`, `interac`,
     * `manual`, `paper_item`, `wire`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Some returns may include additional information from the bank. In these cases, this string
     * will be present.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun additionalInformation(): String? =
        additionalInformation.getNullable("additional_information")

    /** The raw data from the return file that we get from the bank. */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonValue = data

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Code> = code

    /**
     * Returns the raw JSON value of [corrections].
     *
     * Unlike [corrections], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("corrections")
    @ExcludeMissing
    fun _corrections(): JsonField<Corrections> = corrections

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [currentReturn].
     *
     * Unlike [currentReturn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_return")
    @ExcludeMissing
    fun _currentReturn(): JsonField<ReturnObject> = currentReturn

    /**
     * Returns the raw JSON value of [dateOfDeath].
     *
     * Unlike [dateOfDeath], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_of_death")
    @ExcludeMissing
    fun _dateOfDeath(): JsonField<LocalDate> = dateOfDeath

    /**
     * Returns the raw JSON value of [discardedAt].
     *
     * Unlike [discardedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /**
     * Returns the raw JSON value of [failureReason].
     *
     * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failure_reason")
    @ExcludeMissing
    fun _failureReason(): JsonField<String> = failureReason

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
     * Returns the raw JSON value of [ledgerTransactionId].
     *
     * Unlike [ledgerTransactionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    fun _ledgerTransactionId(): JsonField<String> = ledgerTransactionId

    /**
     * Returns the raw JSON value of [liveMode].
     *
     * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /**
     * Returns the raw JSON value of [referenceNumbers].
     *
     * Unlike [referenceNumbers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reference_numbers")
    @ExcludeMissing
    fun _referenceNumbers(): JsonField<List<PaymentReference>> = referenceNumbers

    /**
     * Returns the raw JSON value of [returnableId].
     *
     * Unlike [returnableId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("returnable_id")
    @ExcludeMissing
    fun _returnableId(): JsonField<String> = returnableId

    /**
     * Returns the raw JSON value of [returnableType].
     *
     * Unlike [returnableType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("returnable_type")
    @ExcludeMissing
    fun _returnableType(): JsonField<ReturnableType> = returnableType

    /**
     * Returns the raw JSON value of [role].
     *
     * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [transactionLineItemId].
     *
     * Unlike [transactionLineItemId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transaction_line_item_id")
    @ExcludeMissing
    fun _transactionLineItemId(): JsonField<String> = transactionLineItemId

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [additionalInformation].
     *
     * Unlike [additionalInformation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("additional_information")
    @ExcludeMissing
    fun _additionalInformation(): JsonField<String> = additionalInformation

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
         * Returns a mutable builder for constructing an instance of [ReturnObject].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amount()
         * .code()
         * .corrections()
         * .createdAt()
         * .currency()
         * .currentReturn()
         * .dateOfDeath()
         * .discardedAt()
         * .failureReason()
         * .internalAccountId()
         * .ledgerTransactionId()
         * .liveMode()
         * .object_()
         * .reason()
         * .referenceNumbers()
         * .returnableId()
         * .returnableType()
         * .role()
         * .status()
         * .transactionId()
         * .transactionLineItemId()
         * .type()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ReturnObject]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var code: JsonField<Code>? = null
        private var corrections: JsonField<Corrections>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var currentReturn: JsonField<ReturnObject>? = null
        private var dateOfDeath: JsonField<LocalDate>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var failureReason: JsonField<String>? = null
        private var internalAccountId: JsonField<String>? = null
        private var ledgerTransactionId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var object_: JsonField<String>? = null
        private var reason: JsonField<String>? = null
        private var referenceNumbers: JsonField<MutableList<PaymentReference>>? = null
        private var returnableId: JsonField<String>? = null
        private var returnableType: JsonField<ReturnableType>? = null
        private var role: JsonField<Role>? = null
        private var status: JsonField<Status>? = null
        private var transactionId: JsonField<String>? = null
        private var transactionLineItemId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalInformation: JsonField<String> = JsonMissing.of()
        private var data: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(returnObject: ReturnObject) = apply {
            id = returnObject.id
            amount = returnObject.amount
            code = returnObject.code
            corrections = returnObject.corrections
            createdAt = returnObject.createdAt
            currency = returnObject.currency
            currentReturn = returnObject.currentReturn
            dateOfDeath = returnObject.dateOfDeath
            discardedAt = returnObject.discardedAt
            failureReason = returnObject.failureReason
            internalAccountId = returnObject.internalAccountId
            ledgerTransactionId = returnObject.ledgerTransactionId
            liveMode = returnObject.liveMode
            object_ = returnObject.object_
            reason = returnObject.reason
            referenceNumbers = returnObject.referenceNumbers.map { it.toMutableList() }
            returnableId = returnObject.returnableId
            returnableType = returnObject.returnableType
            role = returnObject.role
            status = returnObject.status
            transactionId = returnObject.transactionId
            transactionLineItemId = returnObject.transactionLineItemId
            type = returnObject.type
            updatedAt = returnObject.updatedAt
            additionalInformation = returnObject.additionalInformation
            data = returnObject.data
            additionalProperties = returnObject.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The return code. For ACH returns, this is the required ACH return code. */
        fun code(code: Code?) = code(JsonField.ofNullable(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Code] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Code>) = apply { this.code = code }

        /**
         * Only relevant for ACH NOC returns. This is an object containing all of the new and
         * corrected information provided by the bank that was previously incorrect on the original
         * outgoing payment.
         */
        fun corrections(corrections: Corrections?) = corrections(JsonField.ofNullable(corrections))

        /**
         * Sets [Builder.corrections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.corrections] with a well-typed [Corrections] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun corrections(corrections: JsonField<Corrections>) = apply {
            this.corrections = corrections
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Currency that this transaction is denominated in. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * If the return's status is `returned`, this will include the return object's data that is
         * returning this return.
         */
        fun currentReturn(currentReturn: ReturnObject?) =
            currentReturn(JsonField.ofNullable(currentReturn))

        /**
         * Sets [Builder.currentReturn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentReturn] with a well-typed [ReturnObject] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currentReturn(currentReturn: JsonField<ReturnObject>) = apply {
            this.currentReturn = currentReturn
        }

        /**
         * If the return code is `R14` or `R15` this is the date the deceased counterparty passed
         * away.
         */
        fun dateOfDeath(dateOfDeath: LocalDate?) = dateOfDeath(JsonField.ofNullable(dateOfDeath))

        /**
         * Sets [Builder.dateOfDeath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateOfDeath] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateOfDeath(dateOfDeath: JsonField<LocalDate>) = apply {
            this.dateOfDeath = dateOfDeath
        }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        /**
         * Sets [Builder.discardedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discardedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /**
         * If an originating return failed to be processed by the bank, a description of the failure
         * reason will be available.
         */
        fun failureReason(failureReason: String?) =
            failureReason(JsonField.ofNullable(failureReason))

        /**
         * Sets [Builder.failureReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureReason] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun failureReason(failureReason: JsonField<String>) = apply {
            this.failureReason = failureReason
        }

        /** The ID of the relevant Internal Account. */
        fun internalAccountId(internalAccountId: String?) =
            internalAccountId(JsonField.ofNullable(internalAccountId))

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

        /** The ID of the ledger transaction linked to the return. */
        fun ledgerTransactionId(ledgerTransactionId: String?) =
            ledgerTransactionId(JsonField.ofNullable(ledgerTransactionId))

        /**
         * Sets [Builder.ledgerTransactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerTransactionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * Sets [Builder.liveMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liveMode] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * Often the bank will provide an explanation for the return, which is a short human
         * readable string.
         */
        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /** An array of Payment Reference objects. */
        fun referenceNumbers(referenceNumbers: List<PaymentReference>) =
            referenceNumbers(JsonField.of(referenceNumbers))

        /**
         * Sets [Builder.referenceNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceNumbers] with a well-typed
         * `List<PaymentReference>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun referenceNumbers(referenceNumbers: JsonField<List<PaymentReference>>) = apply {
            this.referenceNumbers = referenceNumbers.map { it.toMutableList() }
        }

        /**
         * Adds a single [PaymentReference] to [referenceNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReferenceNumber(referenceNumber: PaymentReference) = apply {
            referenceNumbers =
                (referenceNumbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("referenceNumbers", it).add(referenceNumber)
                }
        }

        /** The ID of the object being returned or `null`. */
        fun returnableId(returnableId: String?) = returnableId(JsonField.ofNullable(returnableId))

        /**
         * Sets [Builder.returnableId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.returnableId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun returnableId(returnableId: JsonField<String>) = apply {
            this.returnableId = returnableId
        }

        /** The type of object being returned or `null`. */
        fun returnableType(returnableType: ReturnableType?) =
            returnableType(JsonField.ofNullable(returnableType))

        /**
         * Sets [Builder.returnableType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.returnableType] with a well-typed [ReturnableType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun returnableType(returnableType: JsonField<ReturnableType>) = apply {
            this.returnableType = returnableType
        }

        /** The role of the return, can be `originating` or `receiving`. */
        fun role(role: Role) = role(JsonField.of(role))

        /**
         * Sets [Builder.role] to an arbitrary JSON value.
         *
         * You should usually call [Builder.role] with a well-typed [Role] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun role(role: JsonField<Role>) = apply { this.role = role }

        /** The current status of the return. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The ID of the relevant Transaction or `null`. */
        fun transactionId(transactionId: String?) =
            transactionId(JsonField.ofNullable(transactionId))

        /**
         * Sets [Builder.transactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /** The ID of the relevant Transaction Line Item or `null`. */
        fun transactionLineItemId(transactionLineItemId: String?) =
            transactionLineItemId(JsonField.ofNullable(transactionLineItemId))

        /**
         * Sets [Builder.transactionLineItemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionLineItemId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transactionLineItemId(transactionLineItemId: JsonField<String>) = apply {
            this.transactionLineItemId = transactionLineItemId
        }

        /**
         * The type of return. Can be one of: `ach`, `ach_noc`, `au_becs`, `bacs`, `eft`, `interac`,
         * `manual`, `paper_item`, `wire`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * Some returns may include additional information from the bank. In these cases, this
         * string will be present.
         */
        fun additionalInformation(additionalInformation: String?) =
            additionalInformation(JsonField.ofNullable(additionalInformation))

        /**
         * Sets [Builder.additionalInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalInformation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun additionalInformation(additionalInformation: JsonField<String>) = apply {
            this.additionalInformation = additionalInformation
        }

        /** The raw data from the return file that we get from the bank. */
        fun data(data: JsonValue) = apply { this.data = data }

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
         * Returns an immutable instance of [ReturnObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amount()
         * .code()
         * .corrections()
         * .createdAt()
         * .currency()
         * .currentReturn()
         * .dateOfDeath()
         * .discardedAt()
         * .failureReason()
         * .internalAccountId()
         * .ledgerTransactionId()
         * .liveMode()
         * .object_()
         * .reason()
         * .referenceNumbers()
         * .returnableId()
         * .returnableType()
         * .role()
         * .status()
         * .transactionId()
         * .transactionLineItemId()
         * .type()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReturnObject =
            ReturnObject(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("code", code),
                checkRequired("corrections", corrections),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("currentReturn", currentReturn),
                checkRequired("dateOfDeath", dateOfDeath),
                checkRequired("discardedAt", discardedAt),
                checkRequired("failureReason", failureReason),
                checkRequired("internalAccountId", internalAccountId),
                checkRequired("ledgerTransactionId", ledgerTransactionId),
                checkRequired("liveMode", liveMode),
                checkRequired("object_", object_),
                checkRequired("reason", reason),
                checkRequired("referenceNumbers", referenceNumbers).map { it.toImmutable() },
                checkRequired("returnableId", returnableId),
                checkRequired("returnableType", returnableType),
                checkRequired("role", role),
                checkRequired("status", status),
                checkRequired("transactionId", transactionId),
                checkRequired("transactionLineItemId", transactionLineItemId),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
                additionalInformation,
                data,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ReturnObject = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        code()?.validate()
        corrections()?.validate()
        createdAt()
        currency().validate()
        currentReturn()?.validate()
        dateOfDeath()
        discardedAt()
        failureReason()
        internalAccountId()
        ledgerTransactionId()
        liveMode()
        object_()
        reason()
        referenceNumbers().forEach { it.validate() }
        returnableId()
        returnableType()?.validate()
        role().validate()
        status().validate()
        transactionId()
        transactionLineItemId()
        type().validate()
        updatedAt()
        additionalInformation()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (amount.asKnown() == null) 0 else 1) +
            (code.asKnown()?.validity() ?: 0) +
            (corrections.asKnown()?.validity() ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (currency.asKnown()?.validity() ?: 0) +
            (currentReturn.asKnown()?.validity() ?: 0) +
            (if (dateOfDeath.asKnown() == null) 0 else 1) +
            (if (discardedAt.asKnown() == null) 0 else 1) +
            (if (failureReason.asKnown() == null) 0 else 1) +
            (if (internalAccountId.asKnown() == null) 0 else 1) +
            (if (ledgerTransactionId.asKnown() == null) 0 else 1) +
            (if (liveMode.asKnown() == null) 0 else 1) +
            (if (object_.asKnown() == null) 0 else 1) +
            (if (reason.asKnown() == null) 0 else 1) +
            (referenceNumbers.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (returnableId.asKnown() == null) 0 else 1) +
            (returnableType.asKnown()?.validity() ?: 0) +
            (role.asKnown()?.validity() ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (if (transactionId.asKnown() == null) 0 else 1) +
            (if (transactionLineItemId.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (additionalInformation.asKnown() == null) 0 else 1)

    /** The return code. For ACH returns, this is the required ACH return code. */
    class Code @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val _901 = of("901")

            val _902 = of("902")

            val _903 = of("903")

            val _904 = of("904")

            val _905 = of("905")

            val _907 = of("907")

            val _908 = of("908")

            val _909 = of("909")

            val _910 = of("910")

            val _911 = of("911")

            val _912 = of("912")

            val _914 = of("914")

            val C01 = of("C01")

            val C02 = of("C02")

            val C03 = of("C03")

            val C05 = of("C05")

            val C06 = of("C06")

            val C07 = of("C07")

            val C08 = of("C08")

            val C09 = of("C09")

            val C13 = of("C13")

            val C14 = of("C14")

            val R01 = of("R01")

            val R02 = of("R02")

            val R03 = of("R03")

            val R04 = of("R04")

            val R05 = of("R05")

            val R06 = of("R06")

            val R07 = of("R07")

            val R08 = of("R08")

            val R09 = of("R09")

            val R10 = of("R10")

            val R11 = of("R11")

            val R12 = of("R12")

            val R13 = of("R13")

            val R14 = of("R14")

            val R15 = of("R15")

            val R16 = of("R16")

            val R17 = of("R17")

            val R18 = of("R18")

            val R19 = of("R19")

            val R20 = of("R20")

            val R21 = of("R21")

            val R22 = of("R22")

            val R23 = of("R23")

            val R24 = of("R24")

            val R25 = of("R25")

            val R26 = of("R26")

            val R27 = of("R27")

            val R28 = of("R28")

            val R29 = of("R29")

            val R30 = of("R30")

            val R31 = of("R31")

            val R32 = of("R32")

            val R33 = of("R33")

            val R34 = of("R34")

            val R35 = of("R35")

            val R36 = of("R36")

            val R37 = of("R37")

            val R38 = of("R38")

            val R39 = of("R39")

            val R40 = of("R40")

            val R41 = of("R41")

            val R42 = of("R42")

            val R43 = of("R43")

            val R44 = of("R44")

            val R45 = of("R45")

            val R46 = of("R46")

            val R47 = of("R47")

            val R50 = of("R50")

            val R51 = of("R51")

            val R52 = of("R52")

            val R53 = of("R53")

            val R61 = of("R61")

            val R62 = of("R62")

            val R67 = of("R67")

            val R68 = of("R68")

            val R69 = of("R69")

            val R70 = of("R70")

            val R71 = of("R71")

            val R72 = of("R72")

            val R73 = of("R73")

            val R74 = of("R74")

            val R75 = of("R75")

            val R76 = of("R76")

            val R77 = of("R77")

            val R80 = of("R80")

            val R81 = of("R81")

            val R82 = of("R82")

            val R83 = of("R83")

            val R84 = of("R84")

            val R85 = of("R85")

            val CURRENCYCLOUD = of("currencycloud")

            fun of(value: String) = Code(JsonField.of(value))
        }

        /** An enum containing [Code]'s known values. */
        enum class Known {
            _901,
            _902,
            _903,
            _904,
            _905,
            _907,
            _908,
            _909,
            _910,
            _911,
            _912,
            _914,
            C01,
            C02,
            C03,
            C05,
            C06,
            C07,
            C08,
            C09,
            C13,
            C14,
            R01,
            R02,
            R03,
            R04,
            R05,
            R06,
            R07,
            R08,
            R09,
            R10,
            R11,
            R12,
            R13,
            R14,
            R15,
            R16,
            R17,
            R18,
            R19,
            R20,
            R21,
            R22,
            R23,
            R24,
            R25,
            R26,
            R27,
            R28,
            R29,
            R30,
            R31,
            R32,
            R33,
            R34,
            R35,
            R36,
            R37,
            R38,
            R39,
            R40,
            R41,
            R42,
            R43,
            R44,
            R45,
            R46,
            R47,
            R50,
            R51,
            R52,
            R53,
            R61,
            R62,
            R67,
            R68,
            R69,
            R70,
            R71,
            R72,
            R73,
            R74,
            R75,
            R76,
            R77,
            R80,
            R81,
            R82,
            R83,
            R84,
            R85,
            CURRENCYCLOUD,
        }

        /**
         * An enum containing [Code]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Code] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _901,
            _902,
            _903,
            _904,
            _905,
            _907,
            _908,
            _909,
            _910,
            _911,
            _912,
            _914,
            C01,
            C02,
            C03,
            C05,
            C06,
            C07,
            C08,
            C09,
            C13,
            C14,
            R01,
            R02,
            R03,
            R04,
            R05,
            R06,
            R07,
            R08,
            R09,
            R10,
            R11,
            R12,
            R13,
            R14,
            R15,
            R16,
            R17,
            R18,
            R19,
            R20,
            R21,
            R22,
            R23,
            R24,
            R25,
            R26,
            R27,
            R28,
            R29,
            R30,
            R31,
            R32,
            R33,
            R34,
            R35,
            R36,
            R37,
            R38,
            R39,
            R40,
            R41,
            R42,
            R43,
            R44,
            R45,
            R46,
            R47,
            R50,
            R51,
            R52,
            R53,
            R61,
            R62,
            R67,
            R68,
            R69,
            R70,
            R71,
            R72,
            R73,
            R74,
            R75,
            R76,
            R77,
            R80,
            R81,
            R82,
            R83,
            R84,
            R85,
            CURRENCYCLOUD,
            /** An enum member indicating that [Code] was instantiated with an unknown value. */
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
                _901 -> Value._901
                _902 -> Value._902
                _903 -> Value._903
                _904 -> Value._904
                _905 -> Value._905
                _907 -> Value._907
                _908 -> Value._908
                _909 -> Value._909
                _910 -> Value._910
                _911 -> Value._911
                _912 -> Value._912
                _914 -> Value._914
                C01 -> Value.C01
                C02 -> Value.C02
                C03 -> Value.C03
                C05 -> Value.C05
                C06 -> Value.C06
                C07 -> Value.C07
                C08 -> Value.C08
                C09 -> Value.C09
                C13 -> Value.C13
                C14 -> Value.C14
                R01 -> Value.R01
                R02 -> Value.R02
                R03 -> Value.R03
                R04 -> Value.R04
                R05 -> Value.R05
                R06 -> Value.R06
                R07 -> Value.R07
                R08 -> Value.R08
                R09 -> Value.R09
                R10 -> Value.R10
                R11 -> Value.R11
                R12 -> Value.R12
                R13 -> Value.R13
                R14 -> Value.R14
                R15 -> Value.R15
                R16 -> Value.R16
                R17 -> Value.R17
                R18 -> Value.R18
                R19 -> Value.R19
                R20 -> Value.R20
                R21 -> Value.R21
                R22 -> Value.R22
                R23 -> Value.R23
                R24 -> Value.R24
                R25 -> Value.R25
                R26 -> Value.R26
                R27 -> Value.R27
                R28 -> Value.R28
                R29 -> Value.R29
                R30 -> Value.R30
                R31 -> Value.R31
                R32 -> Value.R32
                R33 -> Value.R33
                R34 -> Value.R34
                R35 -> Value.R35
                R36 -> Value.R36
                R37 -> Value.R37
                R38 -> Value.R38
                R39 -> Value.R39
                R40 -> Value.R40
                R41 -> Value.R41
                R42 -> Value.R42
                R43 -> Value.R43
                R44 -> Value.R44
                R45 -> Value.R45
                R46 -> Value.R46
                R47 -> Value.R47
                R50 -> Value.R50
                R51 -> Value.R51
                R52 -> Value.R52
                R53 -> Value.R53
                R61 -> Value.R61
                R62 -> Value.R62
                R67 -> Value.R67
                R68 -> Value.R68
                R69 -> Value.R69
                R70 -> Value.R70
                R71 -> Value.R71
                R72 -> Value.R72
                R73 -> Value.R73
                R74 -> Value.R74
                R75 -> Value.R75
                R76 -> Value.R76
                R77 -> Value.R77
                R80 -> Value.R80
                R81 -> Value.R81
                R82 -> Value.R82
                R83 -> Value.R83
                R84 -> Value.R84
                R85 -> Value.R85
                CURRENCYCLOUD -> Value.CURRENCYCLOUD
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
                _901 -> Known._901
                _902 -> Known._902
                _903 -> Known._903
                _904 -> Known._904
                _905 -> Known._905
                _907 -> Known._907
                _908 -> Known._908
                _909 -> Known._909
                _910 -> Known._910
                _911 -> Known._911
                _912 -> Known._912
                _914 -> Known._914
                C01 -> Known.C01
                C02 -> Known.C02
                C03 -> Known.C03
                C05 -> Known.C05
                C06 -> Known.C06
                C07 -> Known.C07
                C08 -> Known.C08
                C09 -> Known.C09
                C13 -> Known.C13
                C14 -> Known.C14
                R01 -> Known.R01
                R02 -> Known.R02
                R03 -> Known.R03
                R04 -> Known.R04
                R05 -> Known.R05
                R06 -> Known.R06
                R07 -> Known.R07
                R08 -> Known.R08
                R09 -> Known.R09
                R10 -> Known.R10
                R11 -> Known.R11
                R12 -> Known.R12
                R13 -> Known.R13
                R14 -> Known.R14
                R15 -> Known.R15
                R16 -> Known.R16
                R17 -> Known.R17
                R18 -> Known.R18
                R19 -> Known.R19
                R20 -> Known.R20
                R21 -> Known.R21
                R22 -> Known.R22
                R23 -> Known.R23
                R24 -> Known.R24
                R25 -> Known.R25
                R26 -> Known.R26
                R27 -> Known.R27
                R28 -> Known.R28
                R29 -> Known.R29
                R30 -> Known.R30
                R31 -> Known.R31
                R32 -> Known.R32
                R33 -> Known.R33
                R34 -> Known.R34
                R35 -> Known.R35
                R36 -> Known.R36
                R37 -> Known.R37
                R38 -> Known.R38
                R39 -> Known.R39
                R40 -> Known.R40
                R41 -> Known.R41
                R42 -> Known.R42
                R43 -> Known.R43
                R44 -> Known.R44
                R45 -> Known.R45
                R46 -> Known.R46
                R47 -> Known.R47
                R50 -> Known.R50
                R51 -> Known.R51
                R52 -> Known.R52
                R53 -> Known.R53
                R61 -> Known.R61
                R62 -> Known.R62
                R67 -> Known.R67
                R68 -> Known.R68
                R69 -> Known.R69
                R70 -> Known.R70
                R71 -> Known.R71
                R72 -> Known.R72
                R73 -> Known.R73
                R74 -> Known.R74
                R75 -> Known.R75
                R76 -> Known.R76
                R77 -> Known.R77
                R80 -> Known.R80
                R81 -> Known.R81
                R82 -> Known.R82
                R83 -> Known.R83
                R84 -> Known.R84
                R85 -> Known.R85
                CURRENCYCLOUD -> Known.CURRENCYCLOUD
                else -> throw ModernTreasuryInvalidDataException("Unknown Code: $value")
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

        fun validate(): Code = apply {
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

            return other is Code && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Only relevant for ACH NOC returns. This is an object containing all of the new and corrected
     * information provided by the bank that was previously incorrect on the original outgoing
     * payment.
     */
    class Corrections
    private constructor(
        private val accountNumber: JsonField<String>,
        private val companyId: JsonField<String>,
        private val companyName: JsonField<String>,
        private val individualIdentificationNumber: JsonField<String>,
        private val routingNumber: JsonField<String>,
        private val transactionCode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_number")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("company_id")
            @ExcludeMissing
            companyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("company_name")
            @ExcludeMissing
            companyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("individual_identification_number")
            @ExcludeMissing
            individualIdentificationNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routing_number")
            @ExcludeMissing
            routingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transaction_code")
            @ExcludeMissing
            transactionCode: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountNumber,
            companyId,
            companyName,
            individualIdentificationNumber,
            routingNumber,
            transactionCode,
            mutableMapOf(),
        )

        /**
         * The updated account number that should replace the one originally used on the outgoing
         * payment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountNumber(): String? = accountNumber.getNullable("account_number")

        /**
         * The updated company ID that should replace the one originally used on the outgoing
         * payment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun companyId(): String? = companyId.getNullable("company_id")

        /**
         * The updated company name that should replace the one originally used on the outgoing
         * payment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun companyName(): String? = companyName.getNullable("company_name")

        /**
         * The updated individual identification number that should replace the one originally used
         * on the outgoing payment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun individualIdentificationNumber(): String? =
            individualIdentificationNumber.getNullable("individual_identification_number")

        /**
         * The updated routing number that should replace the one originally used on the outgoing
         * payment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun routingNumber(): String? = routingNumber.getNullable("routing_number")

        /**
         * The updated account type code that should replace the one originally used on the outgoing
         * payment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun transactionCode(): String? = transactionCode.getNullable("transaction_code")

        /**
         * Returns the raw JSON value of [accountNumber].
         *
         * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /**
         * Returns the raw JSON value of [companyId].
         *
         * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("company_id") @ExcludeMissing fun _companyId(): JsonField<String> = companyId

        /**
         * Returns the raw JSON value of [companyName].
         *
         * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("company_name")
        @ExcludeMissing
        fun _companyName(): JsonField<String> = companyName

        /**
         * Returns the raw JSON value of [individualIdentificationNumber].
         *
         * Unlike [individualIdentificationNumber], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("individual_identification_number")
        @ExcludeMissing
        fun _individualIdentificationNumber(): JsonField<String> = individualIdentificationNumber

        /**
         * Returns the raw JSON value of [routingNumber].
         *
         * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        /**
         * Returns the raw JSON value of [transactionCode].
         *
         * Unlike [transactionCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transaction_code")
        @ExcludeMissing
        fun _transactionCode(): JsonField<String> = transactionCode

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

            /** Returns a mutable builder for constructing an instance of [Corrections]. */
            fun builder() = Builder()
        }

        /** A builder for [Corrections]. */
        class Builder internal constructor() {

            private var accountNumber: JsonField<String> = JsonMissing.of()
            private var companyId: JsonField<String> = JsonMissing.of()
            private var companyName: JsonField<String> = JsonMissing.of()
            private var individualIdentificationNumber: JsonField<String> = JsonMissing.of()
            private var routingNumber: JsonField<String> = JsonMissing.of()
            private var transactionCode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(corrections: Corrections) = apply {
                accountNumber = corrections.accountNumber
                companyId = corrections.companyId
                companyName = corrections.companyName
                individualIdentificationNumber = corrections.individualIdentificationNumber
                routingNumber = corrections.routingNumber
                transactionCode = corrections.transactionCode
                additionalProperties = corrections.additionalProperties.toMutableMap()
            }

            /**
             * The updated account number that should replace the one originally used on the
             * outgoing payment.
             */
            fun accountNumber(accountNumber: String?) =
                accountNumber(JsonField.ofNullable(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /**
             * The updated company ID that should replace the one originally used on the outgoing
             * payment.
             */
            fun companyId(companyId: String?) = companyId(JsonField.ofNullable(companyId))

            /**
             * Sets [Builder.companyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

            /**
             * The updated company name that should replace the one originally used on the outgoing
             * payment.
             */
            fun companyName(companyName: String?) = companyName(JsonField.ofNullable(companyName))

            /**
             * Sets [Builder.companyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun companyName(companyName: JsonField<String>) = apply {
                this.companyName = companyName
            }

            /**
             * The updated individual identification number that should replace the one originally
             * used on the outgoing payment.
             */
            fun individualIdentificationNumber(individualIdentificationNumber: String?) =
                individualIdentificationNumber(JsonField.ofNullable(individualIdentificationNumber))

            /**
             * Sets [Builder.individualIdentificationNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.individualIdentificationNumber] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun individualIdentificationNumber(individualIdentificationNumber: JsonField<String>) =
                apply {
                    this.individualIdentificationNumber = individualIdentificationNumber
                }

            /**
             * The updated routing number that should replace the one originally used on the
             * outgoing payment.
             */
            fun routingNumber(routingNumber: String?) =
                routingNumber(JsonField.ofNullable(routingNumber))

            /**
             * Sets [Builder.routingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
            }

            /**
             * The updated account type code that should replace the one originally used on the
             * outgoing payment.
             */
            fun transactionCode(transactionCode: String?) =
                transactionCode(JsonField.ofNullable(transactionCode))

            /**
             * Sets [Builder.transactionCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transactionCode(transactionCode: JsonField<String>) = apply {
                this.transactionCode = transactionCode
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
             * Returns an immutable instance of [Corrections].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Corrections =
                Corrections(
                    accountNumber,
                    companyId,
                    companyName,
                    individualIdentificationNumber,
                    routingNumber,
                    transactionCode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Corrections = apply {
            if (validated) {
                return@apply
            }

            accountNumber()
            companyId()
            companyName()
            individualIdentificationNumber()
            routingNumber()
            transactionCode()
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
            (if (accountNumber.asKnown() == null) 0 else 1) +
                (if (companyId.asKnown() == null) 0 else 1) +
                (if (companyName.asKnown() == null) 0 else 1) +
                (if (individualIdentificationNumber.asKnown() == null) 0 else 1) +
                (if (routingNumber.asKnown() == null) 0 else 1) +
                (if (transactionCode.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Corrections &&
                accountNumber == other.accountNumber &&
                companyId == other.companyId &&
                companyName == other.companyName &&
                individualIdentificationNumber == other.individualIdentificationNumber &&
                routingNumber == other.routingNumber &&
                transactionCode == other.transactionCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountNumber,
                companyId,
                companyName,
                individualIdentificationNumber,
                routingNumber,
                transactionCode,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Corrections{accountNumber=$accountNumber, companyId=$companyId, companyName=$companyName, individualIdentificationNumber=$individualIdentificationNumber, routingNumber=$routingNumber, transactionCode=$transactionCode, additionalProperties=$additionalProperties}"
    }

    class PaymentReference
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val liveMode: JsonField<Boolean>,
        private val object_: JsonField<String>,
        private val referenceNumber: JsonField<String>,
        private val referenceNumberType: JsonField<ReferenceNumberType>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("live_mode")
            @ExcludeMissing
            liveMode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reference_number")
            @ExcludeMissing
            referenceNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reference_number_type")
            @ExcludeMissing
            referenceNumberType: JsonField<ReferenceNumberType> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            liveMode,
            object_,
            referenceNumber,
            referenceNumberType,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun object_(): String = object_.getRequired("object")

        /**
         * The vendor reference number.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun referenceNumber(): String = referenceNumber.getRequired("reference_number")

        /**
         * The type of the reference number. Referring to the vendor payment id.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun referenceNumberType(): ReferenceNumberType =
            referenceNumberType.getRequired("reference_number_type")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [liveMode].
         *
         * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

        /**
         * Returns the raw JSON value of [object_].
         *
         * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        /**
         * Returns the raw JSON value of [referenceNumber].
         *
         * Unlike [referenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reference_number")
        @ExcludeMissing
        fun _referenceNumber(): JsonField<String> = referenceNumber

        /**
         * Returns the raw JSON value of [referenceNumberType].
         *
         * Unlike [referenceNumberType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("reference_number_type")
        @ExcludeMissing
        fun _referenceNumberType(): JsonField<ReferenceNumberType> = referenceNumberType

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
             * Returns a mutable builder for constructing an instance of [PaymentReference].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .createdAt()
             * .liveMode()
             * .object_()
             * .referenceNumber()
             * .referenceNumberType()
             * .updatedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PaymentReference]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var object_: JsonField<String>? = null
            private var referenceNumber: JsonField<String>? = null
            private var referenceNumberType: JsonField<ReferenceNumberType>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentReference: PaymentReference) = apply {
                id = paymentReference.id
                createdAt = paymentReference.createdAt
                liveMode = paymentReference.liveMode
                object_ = paymentReference.object_
                referenceNumber = paymentReference.referenceNumber
                referenceNumberType = paymentReference.referenceNumberType
                updatedAt = paymentReference.updatedAt
                additionalProperties = paymentReference.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

            /**
             * Sets [Builder.liveMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.liveMode] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            fun object_(object_: String) = object_(JsonField.of(object_))

            /**
             * Sets [Builder.object_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.object_] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /** The vendor reference number. */
            fun referenceNumber(referenceNumber: String) =
                referenceNumber(JsonField.of(referenceNumber))

            /**
             * Sets [Builder.referenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referenceNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referenceNumber(referenceNumber: JsonField<String>) = apply {
                this.referenceNumber = referenceNumber
            }

            /** The type of the reference number. Referring to the vendor payment id. */
            fun referenceNumberType(referenceNumberType: ReferenceNumberType) =
                referenceNumberType(JsonField.of(referenceNumberType))

            /**
             * Sets [Builder.referenceNumberType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referenceNumberType] with a well-typed
             * [ReferenceNumberType] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun referenceNumberType(referenceNumberType: JsonField<ReferenceNumberType>) = apply {
                this.referenceNumberType = referenceNumberType
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [PaymentReference].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .createdAt()
             * .liveMode()
             * .object_()
             * .referenceNumber()
             * .referenceNumberType()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentReference =
                PaymentReference(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("liveMode", liveMode),
                    checkRequired("object_", object_),
                    checkRequired("referenceNumber", referenceNumber),
                    checkRequired("referenceNumberType", referenceNumberType),
                    checkRequired("updatedAt", updatedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PaymentReference = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            liveMode()
            object_()
            referenceNumber()
            referenceNumberType().validate()
            updatedAt()
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
            (if (id.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (liveMode.asKnown() == null) 0 else 1) +
                (if (object_.asKnown() == null) 0 else 1) +
                (if (referenceNumber.asKnown() == null) 0 else 1) +
                (referenceNumberType.asKnown()?.validity() ?: 0) +
                (if (updatedAt.asKnown() == null) 0 else 1)

        /** The type of the reference number. Referring to the vendor payment id. */
        class ReferenceNumberType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ACH_ORIGINAL_TRACE_NUMBER = of("ach_original_trace_number")

                val ACH_TRACE_NUMBER = of("ach_trace_number")

                val BANKPROV_PAYMENT_ACTIVITY_DATE = of("bankprov_payment_activity_date")

                val BANKPROV_PAYMENT_ID = of("bankprov_payment_id")

                val BNK_DEV_PRENOTIFICATION_ID = of("bnk_dev_prenotification_id")

                val BNK_DEV_TRANSFER_ID = of("bnk_dev_transfer_id")

                val BNY_MELLON_TRANSACTION_REFERENCE_NUMBER =
                    of("bny_mellon_transaction_reference_number")

                val BOFA_END_TO_END_ID = of("bofa_end_to_end_id")

                val BOFA_TRANSACTION_ID = of("bofa_transaction_id")

                val BRALE_TRANSFER_ID = of("brale_transfer_id")

                val BRIDGE_DESTINATION_TRANSACTION_HASH = of("bridge_destination_transaction_hash")

                val BRIDGE_SOURCE_TRANSACTION_HASH = of("bridge_source_transaction_hash")

                val BRIDGE_TRANSFER_ID = of("bridge_transfer_id")

                val CHECK_NUMBER = of("check_number")

                val CITIBANK_REFERENCE_NUMBER = of("citibank_reference_number")

                val CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER =
                    of("citibank_worldlink_clearing_system_reference_number")

                val COLUMN_FX_QUOTE_ID = of("column_fx_quote_id")

                val COLUMN_REVERSAL_PAIR_TRANSFER_ID = of("column_reversal_pair_transfer_id")

                val COLUMN_TRANSFER_ID = of("column_transfer_id")

                val CROSS_RIVER_CORE_TRANSACTION_ID = of("cross_river_core_transaction_id")

                val CROSS_RIVER_FED_BATCH_ID = of("cross_river_fed_batch_id")

                val CROSS_RIVER_PAYMENT_ID = of("cross_river_payment_id")

                val CROSS_RIVER_SERVICE_MESSAGE = of("cross_river_service_message")

                val CROSS_RIVER_TRANSACTION_ID = of("cross_river_transaction_id")

                val CURRENCYCLOUD_CONVERSION_ID = of("currencycloud_conversion_id")

                val CURRENCYCLOUD_PAYMENT_ID = of("currencycloud_payment_id")

                val DC_BANK_TRANSACTION_ID = of("dc_bank_transaction_id")

                val EFT_TRACE_NUMBER = of("eft_trace_number")

                val EVOLVE_CORE_BATCH = of("evolve_core_batch")

                val EVOLVE_CORE_FILE_KEY = of("evolve_core_file_key")

                val EVOLVE_CORE_SEQ = of("evolve_core_seq")

                val EVOLVE_TRANSACTION_ID = of("evolve_transaction_id")

                val FAKE_VENDOR_PAYMENT_ID = of("fake_vendor_payment_id")

                val FEDWIRE_IMAD = of("fedwire_imad")

                val FEDWIRE_OMAD = of("fedwire_omad")

                val FIRST_REPUBLIC_INTERNAL_ID = of("first_republic_internal_id")

                val GOLDMAN_SACHS_COLLECTION_REQUEST_ID = of("goldman_sachs_collection_request_id")

                val GOLDMAN_SACHS_END_TO_END_ID = of("goldman_sachs_end_to_end_id")

                val GOLDMAN_SACHS_PAYMENT_REQUEST_ID = of("goldman_sachs_payment_request_id")

                val GOLDMAN_SACHS_REQUEST_ID = of("goldman_sachs_request_id")

                val GOLDMAN_SACHS_UNIQUE_PAYMENT_ID = of("goldman_sachs_unique_payment_id")

                val HIFI_OFFRAMP_ID = of("hifi_offramp_id")

                val HIFI_TRANSFER_ID = of("hifi_transfer_id")

                val INTERAC_MESSAGE_ID = of("interac_message_id")

                val JPMC_CCN = of("jpmc_ccn")

                val JPMC_CLEARING_SYSTEM_REFERENCE = of("jpmc_clearing_system_reference")

                val JPMC_CUSTOMER_REFERENCE_ID = of("jpmc_customer_reference_id")

                val JPMC_END_TO_END_ID = of("jpmc_end_to_end_id")

                val JPMC_FIRM_ROOT_ID = of("jpmc_firm_root_id")

                val JPMC_FX_TRN_ID = of("jpmc_fx_trn_id")

                val JPMC_P3_ID = of("jpmc_p3_id")

                val JPMC_PAYMENT_BATCH_ID = of("jpmc_payment_batch_id")

                val JPMC_PAYMENT_INFORMATION_ID = of("jpmc_payment_information_id")

                val JPMC_PAYMENT_RETURNED_DATETIME = of("jpmc_payment_returned_datetime")

                val JPMC_TRANSACTION_REFERENCE_NUMBER = of("jpmc_transaction_reference_number")

                val LOB_CHECK_ID = of("lob_check_id")

                val MT_FOF_TRANSFER_ID = of("mt_fof_transfer_id")

                val OTHER = of("other")

                val PARTIAL_SWIFT_MIR = of("partial_swift_mir")

                val PNC_CLEARING_REFERENCE = of("pnc_clearing_reference")

                val PNC_INSTRUCTION_ID = of("pnc_instruction_id")

                val PNC_MULTIPAYMENT_ID = of("pnc_multipayment_id")

                val PNC_PAYMENT_TRACE_ID = of("pnc_payment_trace_id")

                val PNC_REQUEST_FOR_PAYMENT_ID = of("pnc_request_for_payment_id")

                val PNC_TRANSACTION_REFERENCE_NUMBER = of("pnc_transaction_reference_number")

                val RBC_WIRE_REFERENCE_ID = of("rbc_wire_reference_id")

                val RTP_INSTRUCTION_ID = of("rtp_instruction_id")

                val SIGNET_API_REFERENCE_ID = of("signet_api_reference_id")

                val SIGNET_CONFIRMATION_ID = of("signet_confirmation_id")

                val SIGNET_REQUEST_ID = of("signet_request_id")

                val SILVERGATE_PAYMENT_ID = of("silvergate_payment_id")

                val SVB_END_TO_END_ID = of("svb_end_to_end_id")

                val SVB_PAYMENT_ID = of("svb_payment_id")

                val SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW =
                    of("svb_transaction_cleared_for_sanctions_review")

                val SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW =
                    of("svb_transaction_held_for_sanctions_review")

                val SWIFT_MIR = of("swift_mir")

                val SWIFT_UETR = of("swift_uetr")

                val UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER = of("umb_product_partner_account_number")

                val USBANK_PAYMENT_APPLICATION_REFERENCE_ID =
                    of("usbank_payment_application_reference_id")

                val USBANK_PAYMENT_ID = of("usbank_payment_id")

                val USBANK_PENDING_RTP_PAYMENT_ID = of("usbank_pending_rtp_payment_id")

                val USBANK_POSTED_RTP_PAYMENT_ID = of("usbank_posted_rtp_payment_id")

                val WELLS_FARGO_END_TO_END_ID = of("wells_fargo_end_to_end_id")

                val WELLS_FARGO_PAYMENT_ID = of("wells_fargo_payment_id")

                val WELLS_FARGO_TRACE_NUMBER = of("wells_fargo_trace_number")

                val WELLS_FARGO_UETR = of("wells_fargo_uetr")

                val WESTERN_ALLIANCE_PAYMENT_ID = of("western_alliance_payment_id")

                val WESTERN_ALLIANCE_TRANSACTION_ID = of("western_alliance_transaction_id")

                val WESTERN_ALLIANCE_WIRE_CONFIRMATION_NUMBER =
                    of("western_alliance_wire_confirmation_number")

                fun of(value: String) = ReferenceNumberType(JsonField.of(value))
            }

            /** An enum containing [ReferenceNumberType]'s known values. */
            enum class Known {
                ACH_ORIGINAL_TRACE_NUMBER,
                ACH_TRACE_NUMBER,
                BANKPROV_PAYMENT_ACTIVITY_DATE,
                BANKPROV_PAYMENT_ID,
                BNK_DEV_PRENOTIFICATION_ID,
                BNK_DEV_TRANSFER_ID,
                BNY_MELLON_TRANSACTION_REFERENCE_NUMBER,
                BOFA_END_TO_END_ID,
                BOFA_TRANSACTION_ID,
                BRALE_TRANSFER_ID,
                BRIDGE_DESTINATION_TRANSACTION_HASH,
                BRIDGE_SOURCE_TRANSACTION_HASH,
                BRIDGE_TRANSFER_ID,
                CHECK_NUMBER,
                CITIBANK_REFERENCE_NUMBER,
                CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER,
                COLUMN_FX_QUOTE_ID,
                COLUMN_REVERSAL_PAIR_TRANSFER_ID,
                COLUMN_TRANSFER_ID,
                CROSS_RIVER_CORE_TRANSACTION_ID,
                CROSS_RIVER_FED_BATCH_ID,
                CROSS_RIVER_PAYMENT_ID,
                CROSS_RIVER_SERVICE_MESSAGE,
                CROSS_RIVER_TRANSACTION_ID,
                CURRENCYCLOUD_CONVERSION_ID,
                CURRENCYCLOUD_PAYMENT_ID,
                DC_BANK_TRANSACTION_ID,
                EFT_TRACE_NUMBER,
                EVOLVE_CORE_BATCH,
                EVOLVE_CORE_FILE_KEY,
                EVOLVE_CORE_SEQ,
                EVOLVE_TRANSACTION_ID,
                FAKE_VENDOR_PAYMENT_ID,
                FEDWIRE_IMAD,
                FEDWIRE_OMAD,
                FIRST_REPUBLIC_INTERNAL_ID,
                GOLDMAN_SACHS_COLLECTION_REQUEST_ID,
                GOLDMAN_SACHS_END_TO_END_ID,
                GOLDMAN_SACHS_PAYMENT_REQUEST_ID,
                GOLDMAN_SACHS_REQUEST_ID,
                GOLDMAN_SACHS_UNIQUE_PAYMENT_ID,
                HIFI_OFFRAMP_ID,
                HIFI_TRANSFER_ID,
                INTERAC_MESSAGE_ID,
                JPMC_CCN,
                JPMC_CLEARING_SYSTEM_REFERENCE,
                JPMC_CUSTOMER_REFERENCE_ID,
                JPMC_END_TO_END_ID,
                JPMC_FIRM_ROOT_ID,
                JPMC_FX_TRN_ID,
                JPMC_P3_ID,
                JPMC_PAYMENT_BATCH_ID,
                JPMC_PAYMENT_INFORMATION_ID,
                JPMC_PAYMENT_RETURNED_DATETIME,
                JPMC_TRANSACTION_REFERENCE_NUMBER,
                LOB_CHECK_ID,
                MT_FOF_TRANSFER_ID,
                OTHER,
                PARTIAL_SWIFT_MIR,
                PNC_CLEARING_REFERENCE,
                PNC_INSTRUCTION_ID,
                PNC_MULTIPAYMENT_ID,
                PNC_PAYMENT_TRACE_ID,
                PNC_REQUEST_FOR_PAYMENT_ID,
                PNC_TRANSACTION_REFERENCE_NUMBER,
                RBC_WIRE_REFERENCE_ID,
                RTP_INSTRUCTION_ID,
                SIGNET_API_REFERENCE_ID,
                SIGNET_CONFIRMATION_ID,
                SIGNET_REQUEST_ID,
                SILVERGATE_PAYMENT_ID,
                SVB_END_TO_END_ID,
                SVB_PAYMENT_ID,
                SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW,
                SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW,
                SWIFT_MIR,
                SWIFT_UETR,
                UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER,
                USBANK_PAYMENT_APPLICATION_REFERENCE_ID,
                USBANK_PAYMENT_ID,
                USBANK_PENDING_RTP_PAYMENT_ID,
                USBANK_POSTED_RTP_PAYMENT_ID,
                WELLS_FARGO_END_TO_END_ID,
                WELLS_FARGO_PAYMENT_ID,
                WELLS_FARGO_TRACE_NUMBER,
                WELLS_FARGO_UETR,
                WESTERN_ALLIANCE_PAYMENT_ID,
                WESTERN_ALLIANCE_TRANSACTION_ID,
                WESTERN_ALLIANCE_WIRE_CONFIRMATION_NUMBER,
            }

            /**
             * An enum containing [ReferenceNumberType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ReferenceNumberType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACH_ORIGINAL_TRACE_NUMBER,
                ACH_TRACE_NUMBER,
                BANKPROV_PAYMENT_ACTIVITY_DATE,
                BANKPROV_PAYMENT_ID,
                BNK_DEV_PRENOTIFICATION_ID,
                BNK_DEV_TRANSFER_ID,
                BNY_MELLON_TRANSACTION_REFERENCE_NUMBER,
                BOFA_END_TO_END_ID,
                BOFA_TRANSACTION_ID,
                BRALE_TRANSFER_ID,
                BRIDGE_DESTINATION_TRANSACTION_HASH,
                BRIDGE_SOURCE_TRANSACTION_HASH,
                BRIDGE_TRANSFER_ID,
                CHECK_NUMBER,
                CITIBANK_REFERENCE_NUMBER,
                CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER,
                COLUMN_FX_QUOTE_ID,
                COLUMN_REVERSAL_PAIR_TRANSFER_ID,
                COLUMN_TRANSFER_ID,
                CROSS_RIVER_CORE_TRANSACTION_ID,
                CROSS_RIVER_FED_BATCH_ID,
                CROSS_RIVER_PAYMENT_ID,
                CROSS_RIVER_SERVICE_MESSAGE,
                CROSS_RIVER_TRANSACTION_ID,
                CURRENCYCLOUD_CONVERSION_ID,
                CURRENCYCLOUD_PAYMENT_ID,
                DC_BANK_TRANSACTION_ID,
                EFT_TRACE_NUMBER,
                EVOLVE_CORE_BATCH,
                EVOLVE_CORE_FILE_KEY,
                EVOLVE_CORE_SEQ,
                EVOLVE_TRANSACTION_ID,
                FAKE_VENDOR_PAYMENT_ID,
                FEDWIRE_IMAD,
                FEDWIRE_OMAD,
                FIRST_REPUBLIC_INTERNAL_ID,
                GOLDMAN_SACHS_COLLECTION_REQUEST_ID,
                GOLDMAN_SACHS_END_TO_END_ID,
                GOLDMAN_SACHS_PAYMENT_REQUEST_ID,
                GOLDMAN_SACHS_REQUEST_ID,
                GOLDMAN_SACHS_UNIQUE_PAYMENT_ID,
                HIFI_OFFRAMP_ID,
                HIFI_TRANSFER_ID,
                INTERAC_MESSAGE_ID,
                JPMC_CCN,
                JPMC_CLEARING_SYSTEM_REFERENCE,
                JPMC_CUSTOMER_REFERENCE_ID,
                JPMC_END_TO_END_ID,
                JPMC_FIRM_ROOT_ID,
                JPMC_FX_TRN_ID,
                JPMC_P3_ID,
                JPMC_PAYMENT_BATCH_ID,
                JPMC_PAYMENT_INFORMATION_ID,
                JPMC_PAYMENT_RETURNED_DATETIME,
                JPMC_TRANSACTION_REFERENCE_NUMBER,
                LOB_CHECK_ID,
                MT_FOF_TRANSFER_ID,
                OTHER,
                PARTIAL_SWIFT_MIR,
                PNC_CLEARING_REFERENCE,
                PNC_INSTRUCTION_ID,
                PNC_MULTIPAYMENT_ID,
                PNC_PAYMENT_TRACE_ID,
                PNC_REQUEST_FOR_PAYMENT_ID,
                PNC_TRANSACTION_REFERENCE_NUMBER,
                RBC_WIRE_REFERENCE_ID,
                RTP_INSTRUCTION_ID,
                SIGNET_API_REFERENCE_ID,
                SIGNET_CONFIRMATION_ID,
                SIGNET_REQUEST_ID,
                SILVERGATE_PAYMENT_ID,
                SVB_END_TO_END_ID,
                SVB_PAYMENT_ID,
                SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW,
                SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW,
                SWIFT_MIR,
                SWIFT_UETR,
                UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER,
                USBANK_PAYMENT_APPLICATION_REFERENCE_ID,
                USBANK_PAYMENT_ID,
                USBANK_PENDING_RTP_PAYMENT_ID,
                USBANK_POSTED_RTP_PAYMENT_ID,
                WELLS_FARGO_END_TO_END_ID,
                WELLS_FARGO_PAYMENT_ID,
                WELLS_FARGO_TRACE_NUMBER,
                WELLS_FARGO_UETR,
                WESTERN_ALLIANCE_PAYMENT_ID,
                WESTERN_ALLIANCE_TRANSACTION_ID,
                WESTERN_ALLIANCE_WIRE_CONFIRMATION_NUMBER,
                /**
                 * An enum member indicating that [ReferenceNumberType] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACH_ORIGINAL_TRACE_NUMBER -> Value.ACH_ORIGINAL_TRACE_NUMBER
                    ACH_TRACE_NUMBER -> Value.ACH_TRACE_NUMBER
                    BANKPROV_PAYMENT_ACTIVITY_DATE -> Value.BANKPROV_PAYMENT_ACTIVITY_DATE
                    BANKPROV_PAYMENT_ID -> Value.BANKPROV_PAYMENT_ID
                    BNK_DEV_PRENOTIFICATION_ID -> Value.BNK_DEV_PRENOTIFICATION_ID
                    BNK_DEV_TRANSFER_ID -> Value.BNK_DEV_TRANSFER_ID
                    BNY_MELLON_TRANSACTION_REFERENCE_NUMBER ->
                        Value.BNY_MELLON_TRANSACTION_REFERENCE_NUMBER
                    BOFA_END_TO_END_ID -> Value.BOFA_END_TO_END_ID
                    BOFA_TRANSACTION_ID -> Value.BOFA_TRANSACTION_ID
                    BRALE_TRANSFER_ID -> Value.BRALE_TRANSFER_ID
                    BRIDGE_DESTINATION_TRANSACTION_HASH -> Value.BRIDGE_DESTINATION_TRANSACTION_HASH
                    BRIDGE_SOURCE_TRANSACTION_HASH -> Value.BRIDGE_SOURCE_TRANSACTION_HASH
                    BRIDGE_TRANSFER_ID -> Value.BRIDGE_TRANSFER_ID
                    CHECK_NUMBER -> Value.CHECK_NUMBER
                    CITIBANK_REFERENCE_NUMBER -> Value.CITIBANK_REFERENCE_NUMBER
                    CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER ->
                        Value.CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER
                    COLUMN_FX_QUOTE_ID -> Value.COLUMN_FX_QUOTE_ID
                    COLUMN_REVERSAL_PAIR_TRANSFER_ID -> Value.COLUMN_REVERSAL_PAIR_TRANSFER_ID
                    COLUMN_TRANSFER_ID -> Value.COLUMN_TRANSFER_ID
                    CROSS_RIVER_CORE_TRANSACTION_ID -> Value.CROSS_RIVER_CORE_TRANSACTION_ID
                    CROSS_RIVER_FED_BATCH_ID -> Value.CROSS_RIVER_FED_BATCH_ID
                    CROSS_RIVER_PAYMENT_ID -> Value.CROSS_RIVER_PAYMENT_ID
                    CROSS_RIVER_SERVICE_MESSAGE -> Value.CROSS_RIVER_SERVICE_MESSAGE
                    CROSS_RIVER_TRANSACTION_ID -> Value.CROSS_RIVER_TRANSACTION_ID
                    CURRENCYCLOUD_CONVERSION_ID -> Value.CURRENCYCLOUD_CONVERSION_ID
                    CURRENCYCLOUD_PAYMENT_ID -> Value.CURRENCYCLOUD_PAYMENT_ID
                    DC_BANK_TRANSACTION_ID -> Value.DC_BANK_TRANSACTION_ID
                    EFT_TRACE_NUMBER -> Value.EFT_TRACE_NUMBER
                    EVOLVE_CORE_BATCH -> Value.EVOLVE_CORE_BATCH
                    EVOLVE_CORE_FILE_KEY -> Value.EVOLVE_CORE_FILE_KEY
                    EVOLVE_CORE_SEQ -> Value.EVOLVE_CORE_SEQ
                    EVOLVE_TRANSACTION_ID -> Value.EVOLVE_TRANSACTION_ID
                    FAKE_VENDOR_PAYMENT_ID -> Value.FAKE_VENDOR_PAYMENT_ID
                    FEDWIRE_IMAD -> Value.FEDWIRE_IMAD
                    FEDWIRE_OMAD -> Value.FEDWIRE_OMAD
                    FIRST_REPUBLIC_INTERNAL_ID -> Value.FIRST_REPUBLIC_INTERNAL_ID
                    GOLDMAN_SACHS_COLLECTION_REQUEST_ID -> Value.GOLDMAN_SACHS_COLLECTION_REQUEST_ID
                    GOLDMAN_SACHS_END_TO_END_ID -> Value.GOLDMAN_SACHS_END_TO_END_ID
                    GOLDMAN_SACHS_PAYMENT_REQUEST_ID -> Value.GOLDMAN_SACHS_PAYMENT_REQUEST_ID
                    GOLDMAN_SACHS_REQUEST_ID -> Value.GOLDMAN_SACHS_REQUEST_ID
                    GOLDMAN_SACHS_UNIQUE_PAYMENT_ID -> Value.GOLDMAN_SACHS_UNIQUE_PAYMENT_ID
                    HIFI_OFFRAMP_ID -> Value.HIFI_OFFRAMP_ID
                    HIFI_TRANSFER_ID -> Value.HIFI_TRANSFER_ID
                    INTERAC_MESSAGE_ID -> Value.INTERAC_MESSAGE_ID
                    JPMC_CCN -> Value.JPMC_CCN
                    JPMC_CLEARING_SYSTEM_REFERENCE -> Value.JPMC_CLEARING_SYSTEM_REFERENCE
                    JPMC_CUSTOMER_REFERENCE_ID -> Value.JPMC_CUSTOMER_REFERENCE_ID
                    JPMC_END_TO_END_ID -> Value.JPMC_END_TO_END_ID
                    JPMC_FIRM_ROOT_ID -> Value.JPMC_FIRM_ROOT_ID
                    JPMC_FX_TRN_ID -> Value.JPMC_FX_TRN_ID
                    JPMC_P3_ID -> Value.JPMC_P3_ID
                    JPMC_PAYMENT_BATCH_ID -> Value.JPMC_PAYMENT_BATCH_ID
                    JPMC_PAYMENT_INFORMATION_ID -> Value.JPMC_PAYMENT_INFORMATION_ID
                    JPMC_PAYMENT_RETURNED_DATETIME -> Value.JPMC_PAYMENT_RETURNED_DATETIME
                    JPMC_TRANSACTION_REFERENCE_NUMBER -> Value.JPMC_TRANSACTION_REFERENCE_NUMBER
                    LOB_CHECK_ID -> Value.LOB_CHECK_ID
                    MT_FOF_TRANSFER_ID -> Value.MT_FOF_TRANSFER_ID
                    OTHER -> Value.OTHER
                    PARTIAL_SWIFT_MIR -> Value.PARTIAL_SWIFT_MIR
                    PNC_CLEARING_REFERENCE -> Value.PNC_CLEARING_REFERENCE
                    PNC_INSTRUCTION_ID -> Value.PNC_INSTRUCTION_ID
                    PNC_MULTIPAYMENT_ID -> Value.PNC_MULTIPAYMENT_ID
                    PNC_PAYMENT_TRACE_ID -> Value.PNC_PAYMENT_TRACE_ID
                    PNC_REQUEST_FOR_PAYMENT_ID -> Value.PNC_REQUEST_FOR_PAYMENT_ID
                    PNC_TRANSACTION_REFERENCE_NUMBER -> Value.PNC_TRANSACTION_REFERENCE_NUMBER
                    RBC_WIRE_REFERENCE_ID -> Value.RBC_WIRE_REFERENCE_ID
                    RTP_INSTRUCTION_ID -> Value.RTP_INSTRUCTION_ID
                    SIGNET_API_REFERENCE_ID -> Value.SIGNET_API_REFERENCE_ID
                    SIGNET_CONFIRMATION_ID -> Value.SIGNET_CONFIRMATION_ID
                    SIGNET_REQUEST_ID -> Value.SIGNET_REQUEST_ID
                    SILVERGATE_PAYMENT_ID -> Value.SILVERGATE_PAYMENT_ID
                    SVB_END_TO_END_ID -> Value.SVB_END_TO_END_ID
                    SVB_PAYMENT_ID -> Value.SVB_PAYMENT_ID
                    SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW ->
                        Value.SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW
                    SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW ->
                        Value.SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW
                    SWIFT_MIR -> Value.SWIFT_MIR
                    SWIFT_UETR -> Value.SWIFT_UETR
                    UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER -> Value.UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER
                    USBANK_PAYMENT_APPLICATION_REFERENCE_ID ->
                        Value.USBANK_PAYMENT_APPLICATION_REFERENCE_ID
                    USBANK_PAYMENT_ID -> Value.USBANK_PAYMENT_ID
                    USBANK_PENDING_RTP_PAYMENT_ID -> Value.USBANK_PENDING_RTP_PAYMENT_ID
                    USBANK_POSTED_RTP_PAYMENT_ID -> Value.USBANK_POSTED_RTP_PAYMENT_ID
                    WELLS_FARGO_END_TO_END_ID -> Value.WELLS_FARGO_END_TO_END_ID
                    WELLS_FARGO_PAYMENT_ID -> Value.WELLS_FARGO_PAYMENT_ID
                    WELLS_FARGO_TRACE_NUMBER -> Value.WELLS_FARGO_TRACE_NUMBER
                    WELLS_FARGO_UETR -> Value.WELLS_FARGO_UETR
                    WESTERN_ALLIANCE_PAYMENT_ID -> Value.WESTERN_ALLIANCE_PAYMENT_ID
                    WESTERN_ALLIANCE_TRANSACTION_ID -> Value.WESTERN_ALLIANCE_TRANSACTION_ID
                    WESTERN_ALLIANCE_WIRE_CONFIRMATION_NUMBER ->
                        Value.WESTERN_ALLIANCE_WIRE_CONFIRMATION_NUMBER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    ACH_ORIGINAL_TRACE_NUMBER -> Known.ACH_ORIGINAL_TRACE_NUMBER
                    ACH_TRACE_NUMBER -> Known.ACH_TRACE_NUMBER
                    BANKPROV_PAYMENT_ACTIVITY_DATE -> Known.BANKPROV_PAYMENT_ACTIVITY_DATE
                    BANKPROV_PAYMENT_ID -> Known.BANKPROV_PAYMENT_ID
                    BNK_DEV_PRENOTIFICATION_ID -> Known.BNK_DEV_PRENOTIFICATION_ID
                    BNK_DEV_TRANSFER_ID -> Known.BNK_DEV_TRANSFER_ID
                    BNY_MELLON_TRANSACTION_REFERENCE_NUMBER ->
                        Known.BNY_MELLON_TRANSACTION_REFERENCE_NUMBER
                    BOFA_END_TO_END_ID -> Known.BOFA_END_TO_END_ID
                    BOFA_TRANSACTION_ID -> Known.BOFA_TRANSACTION_ID
                    BRALE_TRANSFER_ID -> Known.BRALE_TRANSFER_ID
                    BRIDGE_DESTINATION_TRANSACTION_HASH -> Known.BRIDGE_DESTINATION_TRANSACTION_HASH
                    BRIDGE_SOURCE_TRANSACTION_HASH -> Known.BRIDGE_SOURCE_TRANSACTION_HASH
                    BRIDGE_TRANSFER_ID -> Known.BRIDGE_TRANSFER_ID
                    CHECK_NUMBER -> Known.CHECK_NUMBER
                    CITIBANK_REFERENCE_NUMBER -> Known.CITIBANK_REFERENCE_NUMBER
                    CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER ->
                        Known.CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER
                    COLUMN_FX_QUOTE_ID -> Known.COLUMN_FX_QUOTE_ID
                    COLUMN_REVERSAL_PAIR_TRANSFER_ID -> Known.COLUMN_REVERSAL_PAIR_TRANSFER_ID
                    COLUMN_TRANSFER_ID -> Known.COLUMN_TRANSFER_ID
                    CROSS_RIVER_CORE_TRANSACTION_ID -> Known.CROSS_RIVER_CORE_TRANSACTION_ID
                    CROSS_RIVER_FED_BATCH_ID -> Known.CROSS_RIVER_FED_BATCH_ID
                    CROSS_RIVER_PAYMENT_ID -> Known.CROSS_RIVER_PAYMENT_ID
                    CROSS_RIVER_SERVICE_MESSAGE -> Known.CROSS_RIVER_SERVICE_MESSAGE
                    CROSS_RIVER_TRANSACTION_ID -> Known.CROSS_RIVER_TRANSACTION_ID
                    CURRENCYCLOUD_CONVERSION_ID -> Known.CURRENCYCLOUD_CONVERSION_ID
                    CURRENCYCLOUD_PAYMENT_ID -> Known.CURRENCYCLOUD_PAYMENT_ID
                    DC_BANK_TRANSACTION_ID -> Known.DC_BANK_TRANSACTION_ID
                    EFT_TRACE_NUMBER -> Known.EFT_TRACE_NUMBER
                    EVOLVE_CORE_BATCH -> Known.EVOLVE_CORE_BATCH
                    EVOLVE_CORE_FILE_KEY -> Known.EVOLVE_CORE_FILE_KEY
                    EVOLVE_CORE_SEQ -> Known.EVOLVE_CORE_SEQ
                    EVOLVE_TRANSACTION_ID -> Known.EVOLVE_TRANSACTION_ID
                    FAKE_VENDOR_PAYMENT_ID -> Known.FAKE_VENDOR_PAYMENT_ID
                    FEDWIRE_IMAD -> Known.FEDWIRE_IMAD
                    FEDWIRE_OMAD -> Known.FEDWIRE_OMAD
                    FIRST_REPUBLIC_INTERNAL_ID -> Known.FIRST_REPUBLIC_INTERNAL_ID
                    GOLDMAN_SACHS_COLLECTION_REQUEST_ID -> Known.GOLDMAN_SACHS_COLLECTION_REQUEST_ID
                    GOLDMAN_SACHS_END_TO_END_ID -> Known.GOLDMAN_SACHS_END_TO_END_ID
                    GOLDMAN_SACHS_PAYMENT_REQUEST_ID -> Known.GOLDMAN_SACHS_PAYMENT_REQUEST_ID
                    GOLDMAN_SACHS_REQUEST_ID -> Known.GOLDMAN_SACHS_REQUEST_ID
                    GOLDMAN_SACHS_UNIQUE_PAYMENT_ID -> Known.GOLDMAN_SACHS_UNIQUE_PAYMENT_ID
                    HIFI_OFFRAMP_ID -> Known.HIFI_OFFRAMP_ID
                    HIFI_TRANSFER_ID -> Known.HIFI_TRANSFER_ID
                    INTERAC_MESSAGE_ID -> Known.INTERAC_MESSAGE_ID
                    JPMC_CCN -> Known.JPMC_CCN
                    JPMC_CLEARING_SYSTEM_REFERENCE -> Known.JPMC_CLEARING_SYSTEM_REFERENCE
                    JPMC_CUSTOMER_REFERENCE_ID -> Known.JPMC_CUSTOMER_REFERENCE_ID
                    JPMC_END_TO_END_ID -> Known.JPMC_END_TO_END_ID
                    JPMC_FIRM_ROOT_ID -> Known.JPMC_FIRM_ROOT_ID
                    JPMC_FX_TRN_ID -> Known.JPMC_FX_TRN_ID
                    JPMC_P3_ID -> Known.JPMC_P3_ID
                    JPMC_PAYMENT_BATCH_ID -> Known.JPMC_PAYMENT_BATCH_ID
                    JPMC_PAYMENT_INFORMATION_ID -> Known.JPMC_PAYMENT_INFORMATION_ID
                    JPMC_PAYMENT_RETURNED_DATETIME -> Known.JPMC_PAYMENT_RETURNED_DATETIME
                    JPMC_TRANSACTION_REFERENCE_NUMBER -> Known.JPMC_TRANSACTION_REFERENCE_NUMBER
                    LOB_CHECK_ID -> Known.LOB_CHECK_ID
                    MT_FOF_TRANSFER_ID -> Known.MT_FOF_TRANSFER_ID
                    OTHER -> Known.OTHER
                    PARTIAL_SWIFT_MIR -> Known.PARTIAL_SWIFT_MIR
                    PNC_CLEARING_REFERENCE -> Known.PNC_CLEARING_REFERENCE
                    PNC_INSTRUCTION_ID -> Known.PNC_INSTRUCTION_ID
                    PNC_MULTIPAYMENT_ID -> Known.PNC_MULTIPAYMENT_ID
                    PNC_PAYMENT_TRACE_ID -> Known.PNC_PAYMENT_TRACE_ID
                    PNC_REQUEST_FOR_PAYMENT_ID -> Known.PNC_REQUEST_FOR_PAYMENT_ID
                    PNC_TRANSACTION_REFERENCE_NUMBER -> Known.PNC_TRANSACTION_REFERENCE_NUMBER
                    RBC_WIRE_REFERENCE_ID -> Known.RBC_WIRE_REFERENCE_ID
                    RTP_INSTRUCTION_ID -> Known.RTP_INSTRUCTION_ID
                    SIGNET_API_REFERENCE_ID -> Known.SIGNET_API_REFERENCE_ID
                    SIGNET_CONFIRMATION_ID -> Known.SIGNET_CONFIRMATION_ID
                    SIGNET_REQUEST_ID -> Known.SIGNET_REQUEST_ID
                    SILVERGATE_PAYMENT_ID -> Known.SILVERGATE_PAYMENT_ID
                    SVB_END_TO_END_ID -> Known.SVB_END_TO_END_ID
                    SVB_PAYMENT_ID -> Known.SVB_PAYMENT_ID
                    SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW ->
                        Known.SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW
                    SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW ->
                        Known.SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW
                    SWIFT_MIR -> Known.SWIFT_MIR
                    SWIFT_UETR -> Known.SWIFT_UETR
                    UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER -> Known.UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER
                    USBANK_PAYMENT_APPLICATION_REFERENCE_ID ->
                        Known.USBANK_PAYMENT_APPLICATION_REFERENCE_ID
                    USBANK_PAYMENT_ID -> Known.USBANK_PAYMENT_ID
                    USBANK_PENDING_RTP_PAYMENT_ID -> Known.USBANK_PENDING_RTP_PAYMENT_ID
                    USBANK_POSTED_RTP_PAYMENT_ID -> Known.USBANK_POSTED_RTP_PAYMENT_ID
                    WELLS_FARGO_END_TO_END_ID -> Known.WELLS_FARGO_END_TO_END_ID
                    WELLS_FARGO_PAYMENT_ID -> Known.WELLS_FARGO_PAYMENT_ID
                    WELLS_FARGO_TRACE_NUMBER -> Known.WELLS_FARGO_TRACE_NUMBER
                    WELLS_FARGO_UETR -> Known.WELLS_FARGO_UETR
                    WESTERN_ALLIANCE_PAYMENT_ID -> Known.WESTERN_ALLIANCE_PAYMENT_ID
                    WESTERN_ALLIANCE_TRANSACTION_ID -> Known.WESTERN_ALLIANCE_TRANSACTION_ID
                    WESTERN_ALLIANCE_WIRE_CONFIRMATION_NUMBER ->
                        Known.WESTERN_ALLIANCE_WIRE_CONFIRMATION_NUMBER
                    else ->
                        throw ModernTreasuryInvalidDataException(
                            "Unknown ReferenceNumberType: $value"
                        )
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw ModernTreasuryInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): ReferenceNumberType = apply {
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

                return other is ReferenceNumberType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentReference &&
                id == other.id &&
                createdAt == other.createdAt &&
                liveMode == other.liveMode &&
                object_ == other.object_ &&
                referenceNumber == other.referenceNumber &&
                referenceNumberType == other.referenceNumberType &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                liveMode,
                object_,
                referenceNumber,
                referenceNumberType,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentReference{id=$id, createdAt=$createdAt, liveMode=$liveMode, object_=$object_, referenceNumber=$referenceNumber, referenceNumberType=$referenceNumberType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    /** The type of object being returned or `null`. */
    class ReturnableType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

            val PAYMENT_ORDER = of("payment_order")

            val RETURN = of("return")

            val REVERSAL = of("reversal")

            fun of(value: String) = ReturnableType(JsonField.of(value))
        }

        /** An enum containing [ReturnableType]'s known values. */
        enum class Known {
            INCOMING_PAYMENT_DETAIL,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
        }

        /**
         * An enum containing [ReturnableType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReturnableType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INCOMING_PAYMENT_DETAIL,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
            /**
             * An enum member indicating that [ReturnableType] was instantiated with an unknown
             * value.
             */
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
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                RETURN -> Value.RETURN
                REVERSAL -> Value.REVERSAL
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
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                RETURN -> Known.RETURN
                REVERSAL -> Known.REVERSAL
                else -> throw ModernTreasuryInvalidDataException("Unknown ReturnableType: $value")
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

        fun validate(): ReturnableType = apply {
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

            return other is ReturnableType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The role of the return, can be `originating` or `receiving`. */
    class Role @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val ORIGINATING = of("originating")

            val RECEIVING = of("receiving")

            fun of(value: String) = Role(JsonField.of(value))
        }

        /** An enum containing [Role]'s known values. */
        enum class Known {
            ORIGINATING,
            RECEIVING,
        }

        /**
         * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Role] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ORIGINATING,
            RECEIVING,
            /** An enum member indicating that [Role] was instantiated with an unknown value. */
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
                ORIGINATING -> Value.ORIGINATING
                RECEIVING -> Value.RECEIVING
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
                ORIGINATING -> Known.ORIGINATING
                RECEIVING -> Known.RECEIVING
                else -> throw ModernTreasuryInvalidDataException("Unknown Role: $value")
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

        fun validate(): Role = apply {
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

            return other is Role && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The current status of the return. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val COMPLETED = of("completed")

            val FAILED = of("failed")

            val PENDING = of("pending")

            val PROCESSING = of("processing")

            val RETURNED = of("returned")

            val SENT = of("sent")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            COMPLETED,
            FAILED,
            PENDING,
            PROCESSING,
            RETURNED,
            SENT,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COMPLETED,
            FAILED,
            PENDING,
            PROCESSING,
            RETURNED,
            SENT,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
                PENDING -> Value.PENDING
                PROCESSING -> Value.PROCESSING
                RETURNED -> Value.RETURNED
                SENT -> Value.SENT
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
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
                PENDING -> Known.PENDING
                PROCESSING -> Known.PROCESSING
                RETURNED -> Known.RETURNED
                SENT -> Known.SENT
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The type of return. Can be one of: `ach`, `ach_noc`, `au_becs`, `bacs`, `eft`, `interac`,
     * `manual`, `paper_item`, `wire`.
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

            val ACH_NOC = of("ach_noc")

            val AU_BECS = of("au_becs")

            val BACS = of("bacs")

            val BOOK = of("book")

            val CHECK = of("check")

            val CROSS_BORDER = of("cross_border")

            val EFT = of("eft")

            val INTERAC = of("interac")

            val MANUAL = of("manual")

            val SEPA = of("sepa")

            val WIRE = of("wire")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ACH,
            ACH_NOC,
            AU_BECS,
            BACS,
            BOOK,
            CHECK,
            CROSS_BORDER,
            EFT,
            INTERAC,
            MANUAL,
            SEPA,
            WIRE,
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
            ACH_NOC,
            AU_BECS,
            BACS,
            BOOK,
            CHECK,
            CROSS_BORDER,
            EFT,
            INTERAC,
            MANUAL,
            SEPA,
            WIRE,
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
                ACH_NOC -> Value.ACH_NOC
                AU_BECS -> Value.AU_BECS
                BACS -> Value.BACS
                BOOK -> Value.BOOK
                CHECK -> Value.CHECK
                CROSS_BORDER -> Value.CROSS_BORDER
                EFT -> Value.EFT
                INTERAC -> Value.INTERAC
                MANUAL -> Value.MANUAL
                SEPA -> Value.SEPA
                WIRE -> Value.WIRE
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
                ACH_NOC -> Known.ACH_NOC
                AU_BECS -> Known.AU_BECS
                BACS -> Known.BACS
                BOOK -> Known.BOOK
                CHECK -> Known.CHECK
                CROSS_BORDER -> Known.CROSS_BORDER
                EFT -> Known.EFT
                INTERAC -> Known.INTERAC
                MANUAL -> Known.MANUAL
                SEPA -> Known.SEPA
                WIRE -> Known.WIRE
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

        return other is ReturnObject &&
            id == other.id &&
            amount == other.amount &&
            code == other.code &&
            corrections == other.corrections &&
            createdAt == other.createdAt &&
            currency == other.currency &&
            currentReturn == other.currentReturn &&
            dateOfDeath == other.dateOfDeath &&
            discardedAt == other.discardedAt &&
            failureReason == other.failureReason &&
            internalAccountId == other.internalAccountId &&
            ledgerTransactionId == other.ledgerTransactionId &&
            liveMode == other.liveMode &&
            object_ == other.object_ &&
            reason == other.reason &&
            referenceNumbers == other.referenceNumbers &&
            returnableId == other.returnableId &&
            returnableType == other.returnableType &&
            role == other.role &&
            status == other.status &&
            transactionId == other.transactionId &&
            transactionLineItemId == other.transactionLineItemId &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            additionalInformation == other.additionalInformation &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            amount,
            code,
            corrections,
            createdAt,
            currency,
            currentReturn,
            dateOfDeath,
            discardedAt,
            failureReason,
            internalAccountId,
            ledgerTransactionId,
            liveMode,
            object_,
            reason,
            referenceNumbers,
            returnableId,
            returnableType,
            role,
            status,
            transactionId,
            transactionLineItemId,
            type,
            updatedAt,
            additionalInformation,
            data,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReturnObject{id=$id, amount=$amount, code=$code, corrections=$corrections, createdAt=$createdAt, currency=$currency, currentReturn=$currentReturn, dateOfDeath=$dateOfDeath, discardedAt=$discardedAt, failureReason=$failureReason, internalAccountId=$internalAccountId, ledgerTransactionId=$ledgerTransactionId, liveMode=$liveMode, object_=$object_, reason=$reason, referenceNumbers=$referenceNumbers, returnableId=$returnableId, returnableType=$returnableType, role=$role, status=$status, transactionId=$transactionId, transactionLineItemId=$transactionLineItemId, type=$type, updatedAt=$updatedAt, additionalInformation=$additionalInformation, data=$data, additionalProperties=$additionalProperties}"
}
