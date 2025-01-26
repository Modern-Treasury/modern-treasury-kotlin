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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class ReturnObject
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<Code> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("current_return")
    @ExcludeMissing
    private val currentReturn: JsonField<ReturnObject> = JsonMissing.of(),
    @JsonProperty("date_of_death")
    @ExcludeMissing
    private val dateOfDeath: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("failure_reason")
    @ExcludeMissing
    private val failureReason: JsonField<String> = JsonMissing.of(),
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    private val internalAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    private val ledgerTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("reason")
    @ExcludeMissing
    private val reason: JsonField<String> = JsonMissing.of(),
    @JsonProperty("reference_numbers")
    @ExcludeMissing
    private val referenceNumbers: JsonField<List<PaymentReference>> = JsonMissing.of(),
    @JsonProperty("returnable_id")
    @ExcludeMissing
    private val returnableId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("returnable_type")
    @ExcludeMissing
    private val returnableType: JsonField<ReturnableType> = JsonMissing.of(),
    @JsonProperty("role") @ExcludeMissing private val role: JsonField<Role> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("transaction_id")
    @ExcludeMissing
    private val transactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("transaction_line_item_id")
    @ExcludeMissing
    private val transactionLineItemId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("additional_information")
    @ExcludeMissing
    private val additionalInformation: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    fun amount(): Long = amount.getRequired("amount")

    /** The return code. For ACH returns, this is the required ACH return code. */
    fun code(): Code? = code.getNullable("code")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** Currency that this transaction is denominated in. */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * If the return's status is `returned`, this will include the return object's data that is
     * returning this return.
     */
    fun currentReturn(): ReturnObject? = currentReturn.getNullable("current_return")

    /**
     * If the return code is `R14` or `R15` this is the date the deceased counterparty passed away.
     */
    fun dateOfDeath(): LocalDate? = dateOfDeath.getNullable("date_of_death")

    /**
     * If an originating return failed to be processed by the bank, a description of the failure
     * reason will be available.
     */
    fun failureReason(): String? = failureReason.getNullable("failure_reason")

    /** The ID of the relevant Internal Account. */
    fun internalAccountId(): String? = internalAccountId.getNullable("internal_account_id")

    /** The ID of the ledger transaction linked to the return. */
    fun ledgerTransactionId(): String? = ledgerTransactionId.getNullable("ledger_transaction_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun object_(): String = object_.getRequired("object")

    /**
     * Often the bank will provide an explanation for the return, which is a short human readable
     * string.
     */
    fun reason(): String? = reason.getNullable("reason")

    /** An array of Payment Reference objects. */
    fun referenceNumbers(): List<PaymentReference> =
        referenceNumbers.getRequired("reference_numbers")

    /** The ID of the object being returned or `null`. */
    fun returnableId(): String? = returnableId.getNullable("returnable_id")

    /** The type of object being returned or `null`. */
    fun returnableType(): ReturnableType? = returnableType.getNullable("returnable_type")

    /** The role of the return, can be `originating` or `receiving`. */
    fun role(): Role = role.getRequired("role")

    /** The current status of the return. */
    fun status(): Status = status.getRequired("status")

    /** The ID of the relevant Transaction or `null`. */
    fun transactionId(): String? = transactionId.getNullable("transaction_id")

    /** The ID of the relevant Transaction Line Item or `null`. */
    fun transactionLineItemId(): String? =
        transactionLineItemId.getNullable("transaction_line_item_id")

    /**
     * The type of return. Can be one of: `ach`, `ach_noc`, `au_becs`, `bacs`, `eft`, `interac`,
     * `manual`, `paper_item`, `wire`.
     */
    fun type(): Type = type.getRequired("type")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Some returns may include additional information from the bank. In these cases, this string
     * will be present.
     */
    fun additionalInformation(): String? =
        additionalInformation.getNullable("additional_information")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /** The return code. For ACH returns, this is the required ACH return code. */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Code> = code

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** Currency that this transaction is denominated in. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * If the return's status is `returned`, this will include the return object's data that is
     * returning this return.
     */
    @JsonProperty("current_return")
    @ExcludeMissing
    fun _currentReturn(): JsonField<ReturnObject> = currentReturn

    /**
     * If the return code is `R14` or `R15` this is the date the deceased counterparty passed away.
     */
    @JsonProperty("date_of_death")
    @ExcludeMissing
    fun _dateOfDeath(): JsonField<LocalDate> = dateOfDeath

    /**
     * If an originating return failed to be processed by the bank, a description of the failure
     * reason will be available.
     */
    @JsonProperty("failure_reason")
    @ExcludeMissing
    fun _failureReason(): JsonField<String> = failureReason

    /** The ID of the relevant Internal Account. */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId(): JsonField<String> = internalAccountId

    /** The ID of the ledger transaction linked to the return. */
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    fun _ledgerTransactionId(): JsonField<String> = ledgerTransactionId

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Often the bank will provide an explanation for the return, which is a short human readable
     * string.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /** An array of Payment Reference objects. */
    @JsonProperty("reference_numbers")
    @ExcludeMissing
    fun _referenceNumbers(): JsonField<List<PaymentReference>> = referenceNumbers

    /** The ID of the object being returned or `null`. */
    @JsonProperty("returnable_id")
    @ExcludeMissing
    fun _returnableId(): JsonField<String> = returnableId

    /** The type of object being returned or `null`. */
    @JsonProperty("returnable_type")
    @ExcludeMissing
    fun _returnableType(): JsonField<ReturnableType> = returnableType

    /** The role of the return, can be `originating` or `receiving`. */
    @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

    /** The current status of the return. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** The ID of the relevant Transaction or `null`. */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /** The ID of the relevant Transaction Line Item or `null`. */
    @JsonProperty("transaction_line_item_id")
    @ExcludeMissing
    fun _transactionLineItemId(): JsonField<String> = transactionLineItemId

    /**
     * The type of return. Can be one of: `ach`, `ach_noc`, `au_becs`, `bacs`, `eft`, `interac`,
     * `manual`, `paper_item`, `wire`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Some returns may include additional information from the bank. In these cases, this string
     * will be present.
     */
    @JsonProperty("additional_information")
    @ExcludeMissing
    fun _additionalInformation(): JsonField<String> = additionalInformation

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ReturnObject = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        code()
        createdAt()
        currency()
        currentReturn()?.validate()
        dateOfDeath()
        failureReason()
        internalAccountId()
        ledgerTransactionId()
        liveMode()
        object_()
        reason()
        referenceNumbers().forEach { it.validate() }
        returnableId()
        returnableType()
        role()
        status()
        transactionId()
        transactionLineItemId()
        type()
        updatedAt()
        additionalInformation()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var code: JsonField<Code>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var currentReturn: JsonField<ReturnObject>? = null
        private var dateOfDeath: JsonField<LocalDate>? = null
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
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(returnObject: ReturnObject) = apply {
            id = returnObject.id
            amount = returnObject.amount
            code = returnObject.code
            createdAt = returnObject.createdAt
            currency = returnObject.currency
            currentReturn = returnObject.currentReturn
            dateOfDeath = returnObject.dateOfDeath
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
            additionalProperties = returnObject.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The return code. For ACH returns, this is the required ACH return code. */
        fun code(code: Code?) = code(JsonField.ofNullable(code))

        /** The return code. For ACH returns, this is the required ACH return code. */
        fun code(code: JsonField<Code>) = apply { this.code = code }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Currency that this transaction is denominated in. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** Currency that this transaction is denominated in. */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * If the return's status is `returned`, this will include the return object's data that is
         * returning this return.
         */
        fun currentReturn(currentReturn: ReturnObject?) =
            currentReturn(JsonField.ofNullable(currentReturn))

        /**
         * If the return's status is `returned`, this will include the return object's data that is
         * returning this return.
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
         * If the return code is `R14` or `R15` this is the date the deceased counterparty passed
         * away.
         */
        fun dateOfDeath(dateOfDeath: JsonField<LocalDate>) = apply {
            this.dateOfDeath = dateOfDeath
        }

        /**
         * If an originating return failed to be processed by the bank, a description of the failure
         * reason will be available.
         */
        fun failureReason(failureReason: String?) =
            failureReason(JsonField.ofNullable(failureReason))

        /**
         * If an originating return failed to be processed by the bank, a description of the failure
         * reason will be available.
         */
        fun failureReason(failureReason: JsonField<String>) = apply {
            this.failureReason = failureReason
        }

        /** The ID of the relevant Internal Account. */
        fun internalAccountId(internalAccountId: String?) =
            internalAccountId(JsonField.ofNullable(internalAccountId))

        /** The ID of the relevant Internal Account. */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /** The ID of the ledger transaction linked to the return. */
        fun ledgerTransactionId(ledgerTransactionId: String?) =
            ledgerTransactionId(JsonField.ofNullable(ledgerTransactionId))

        /** The ID of the ledger transaction linked to the return. */
        fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * Often the bank will provide an explanation for the return, which is a short human
         * readable string.
         */
        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        /**
         * Often the bank will provide an explanation for the return, which is a short human
         * readable string.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /** An array of Payment Reference objects. */
        fun referenceNumbers(referenceNumbers: List<PaymentReference>) =
            referenceNumbers(JsonField.of(referenceNumbers))

        /** An array of Payment Reference objects. */
        fun referenceNumbers(referenceNumbers: JsonField<List<PaymentReference>>) = apply {
            this.referenceNumbers = referenceNumbers.map { it.toMutableList() }
        }

        /** An array of Payment Reference objects. */
        fun addReferenceNumber(referenceNumber: PaymentReference) = apply {
            referenceNumbers =
                (referenceNumbers ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(referenceNumber)
                }
        }

        /** The ID of the object being returned or `null`. */
        fun returnableId(returnableId: String?) = returnableId(JsonField.ofNullable(returnableId))

        /** The ID of the object being returned or `null`. */
        fun returnableId(returnableId: JsonField<String>) = apply {
            this.returnableId = returnableId
        }

        /** The type of object being returned or `null`. */
        fun returnableType(returnableType: ReturnableType?) =
            returnableType(JsonField.ofNullable(returnableType))

        /** The type of object being returned or `null`. */
        fun returnableType(returnableType: JsonField<ReturnableType>) = apply {
            this.returnableType = returnableType
        }

        /** The role of the return, can be `originating` or `receiving`. */
        fun role(role: Role) = role(JsonField.of(role))

        /** The role of the return, can be `originating` or `receiving`. */
        fun role(role: JsonField<Role>) = apply { this.role = role }

        /** The current status of the return. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The current status of the return. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The ID of the relevant Transaction or `null`. */
        fun transactionId(transactionId: String?) =
            transactionId(JsonField.ofNullable(transactionId))

        /** The ID of the relevant Transaction or `null`. */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /** The ID of the relevant Transaction Line Item or `null`. */
        fun transactionLineItemId(transactionLineItemId: String?) =
            transactionLineItemId(JsonField.ofNullable(transactionLineItemId))

        /** The ID of the relevant Transaction Line Item or `null`. */
        fun transactionLineItemId(transactionLineItemId: JsonField<String>) = apply {
            this.transactionLineItemId = transactionLineItemId
        }

        /**
         * The type of return. Can be one of: `ach`, `ach_noc`, `au_becs`, `bacs`, `eft`, `interac`,
         * `manual`, `paper_item`, `wire`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * The type of return. Can be one of: `ach`, `ach_noc`, `au_becs`, `bacs`, `eft`, `interac`,
         * `manual`, `paper_item`, `wire`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * Some returns may include additional information from the bank. In these cases, this
         * string will be present.
         */
        fun additionalInformation(additionalInformation: String?) =
            additionalInformation(JsonField.ofNullable(additionalInformation))

        /**
         * Some returns may include additional information from the bank. In these cases, this
         * string will be present.
         */
        fun additionalInformation(additionalInformation: JsonField<String>) = apply {
            this.additionalInformation = additionalInformation
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

        fun build(): ReturnObject =
            ReturnObject(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("code", code),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("currentReturn", currentReturn),
                checkRequired("dateOfDeath", dateOfDeath),
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
                additionalProperties.toImmutable(),
            )
    }

    /** The return code. For ACH returns, this is the required ACH return code. */
    class Code
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            val R14 = of("R14")

            val R15 = of("R15")

            val R16 = of("R16")

            val R17 = of("R17")

            val R20 = of("R20")

            val R21 = of("R21")

            val R22 = of("R22")

            val R23 = of("R23")

            val R24 = of("R24")

            val R29 = of("R29")

            val R31 = of("R31")

            val R33 = of("R33")

            val R37 = of("R37")

            val R38 = of("R38")

            val R39 = of("R39")

            val R51 = of("R51")

            val R52 = of("R52")

            val R53 = of("R53")

            val CURRENCYCLOUD = of("currencycloud")

            fun of(value: String) = Code(JsonField.of(value))
        }

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
            R14,
            R15,
            R16,
            R17,
            R20,
            R21,
            R22,
            R23,
            R24,
            R29,
            R31,
            R33,
            R37,
            R38,
            R39,
            R51,
            R52,
            R53,
            CURRENCYCLOUD,
        }

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
            R14,
            R15,
            R16,
            R17,
            R20,
            R21,
            R22,
            R23,
            R24,
            R29,
            R31,
            R33,
            R37,
            R38,
            R39,
            R51,
            R52,
            R53,
            CURRENCYCLOUD,
            _UNKNOWN,
        }

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
                R14 -> Value.R14
                R15 -> Value.R15
                R16 -> Value.R16
                R17 -> Value.R17
                R20 -> Value.R20
                R21 -> Value.R21
                R22 -> Value.R22
                R23 -> Value.R23
                R24 -> Value.R24
                R29 -> Value.R29
                R31 -> Value.R31
                R33 -> Value.R33
                R37 -> Value.R37
                R38 -> Value.R38
                R39 -> Value.R39
                R51 -> Value.R51
                R52 -> Value.R52
                R53 -> Value.R53
                CURRENCYCLOUD -> Value.CURRENCYCLOUD
                else -> Value._UNKNOWN
            }

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
                R14 -> Known.R14
                R15 -> Known.R15
                R16 -> Known.R16
                R17 -> Known.R17
                R20 -> Known.R20
                R21 -> Known.R21
                R22 -> Known.R22
                R23 -> Known.R23
                R24 -> Known.R24
                R29 -> Known.R29
                R31 -> Known.R31
                R33 -> Known.R33
                R37 -> Known.R37
                R38 -> Known.R38
                R39 -> Known.R39
                R51 -> Known.R51
                R52 -> Known.R52
                R53 -> Known.R53
                CURRENCYCLOUD -> Known.CURRENCYCLOUD
                else -> throw ModernTreasuryInvalidDataException("Unknown Code: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Code && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class PaymentReference
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reference_number")
        @ExcludeMissing
        private val referenceNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reference_number_type")
        @ExcludeMissing
        private val referenceNumberType: JsonField<ReferenceNumberType> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun object_(): String = object_.getRequired("object")

        /** The vendor reference number. */
        fun referenceNumber(): String = referenceNumber.getRequired("reference_number")

        /** The type of the reference number. Referring to the vendor payment id. */
        fun referenceNumberType(): ReferenceNumberType =
            referenceNumberType.getRequired("reference_number_type")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        /** The vendor reference number. */
        @JsonProperty("reference_number")
        @ExcludeMissing
        fun _referenceNumber(): JsonField<String> = referenceNumber

        /** The type of the reference number. Referring to the vendor payment id. */
        @JsonProperty("reference_number_type")
        @ExcludeMissing
        fun _referenceNumberType(): JsonField<ReferenceNumberType> = referenceNumberType

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
            referenceNumberType()
            updatedAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

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

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            fun object_(object_: String) = object_(JsonField.of(object_))

            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /** The vendor reference number. */
            fun referenceNumber(referenceNumber: String) =
                referenceNumber(JsonField.of(referenceNumber))

            /** The vendor reference number. */
            fun referenceNumber(referenceNumber: JsonField<String>) = apply {
                this.referenceNumber = referenceNumber
            }

            /** The type of the reference number. Referring to the vendor payment id. */
            fun referenceNumberType(referenceNumberType: ReferenceNumberType) =
                referenceNumberType(JsonField.of(referenceNumberType))

            /** The type of the reference number. Referring to the vendor payment id. */
            fun referenceNumberType(referenceNumberType: JsonField<ReferenceNumberType>) = apply {
                this.referenceNumberType = referenceNumberType
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

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

            fun build(): PaymentReference =
                PaymentReference(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("liveMode", liveMode),
                    checkRequired("object_", object_),
                    checkRequired("referenceNumber", referenceNumber),
                    checkRequired("referenceNumberType", referenceNumberType),
                    checkRequired("updatedAt", updatedAt),
                    additionalProperties.toImmutable(),
                )
        }

        /** The type of the reference number. Referring to the vendor payment id. */
        class ReferenceNumberType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ACH_ORIGINAL_TRACE_NUMBER = of("ach_original_trace_number")

                val ACH_TRACE_NUMBER = of("ach_trace_number")

                val BANKPROV_PAYMENT_ACTIVITY_DATE = of("bankprov_payment_activity_date")

                val BANKPROV_PAYMENT_ID = of("bankprov_payment_id")

                val BNK_DEV_PRENOTIFICATION_ID = of("bnk_dev_prenotification_id")

                val BNK_DEV_TRANSFER_ID = of("bnk_dev_transfer_id")

                val BOFA_END_TO_END_ID = of("bofa_end_to_end_id")

                val BOFA_TRANSACTION_ID = of("bofa_transaction_id")

                val CHECK_NUMBER = of("check_number")

                val CITIBANK_REFERENCE_NUMBER = of("citibank_reference_number")

                val CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER =
                    of("citibank_worldlink_clearing_system_reference_number")

                val COLUMN_FX_QUOTE_ID = of("column_fx_quote_id")

                val COLUMN_REVERSAL_PAIR_TRANSFER_ID = of("column_reversal_pair_transfer_id")

                val COLUMN_TRANSFER_ID = of("column_transfer_id")

                val CROSS_RIVER_PAYMENT_ID = of("cross_river_payment_id")

                val CROSS_RIVER_SERVICE_MESSAGE = of("cross_river_service_message")

                val CROSS_RIVER_TRANSACTION_ID = of("cross_river_transaction_id")

                val CURRENCYCLOUD_CONVERSION_ID = of("currencycloud_conversion_id")

                val CURRENCYCLOUD_PAYMENT_ID = of("currencycloud_payment_id")

                val DC_BANK_TRANSACTION_ID = of("dc_bank_transaction_id")

                val DWOLLA_TRANSACTION_ID = of("dwolla_transaction_id")

                val EFT_TRACE_NUMBER = of("eft_trace_number")

                val EVOLVE_TRANSACTION_ID = of("evolve_transaction_id")

                val FEDWIRE_IMAD = of("fedwire_imad")

                val FEDWIRE_OMAD = of("fedwire_omad")

                val FIRST_REPUBLIC_INTERNAL_ID = of("first_republic_internal_id")

                val GOLDMAN_SACHS_COLLECTION_REQUEST_ID = of("goldman_sachs_collection_request_id")

                val GOLDMAN_SACHS_END_TO_END_ID = of("goldman_sachs_end_to_end_id")

                val GOLDMAN_SACHS_PAYMENT_REQUEST_ID = of("goldman_sachs_payment_request_id")

                val GOLDMAN_SACHS_REQUEST_ID = of("goldman_sachs_request_id")

                val GOLDMAN_SACHS_UNIQUE_PAYMENT_ID = of("goldman_sachs_unique_payment_id")

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

                val LOB_CHECK_ID = of("lob_check_id")

                val OTHER = of("other")

                val PARTIAL_SWIFT_MIR = of("partial_swift_mir")

                val PNC_CLEARING_REFERENCE = of("pnc_clearing_reference")

                val PNC_INSTRUCTION_ID = of("pnc_instruction_id")

                val PNC_MULTIPAYMENT_ID = of("pnc_multipayment_id")

                val PNC_PAYMENT_TRACE_ID = of("pnc_payment_trace_id")

                val PNC_TRANSACTION_REFERENCE_NUMBER = of("pnc_transaction_reference_number")

                val RSPEC_VENDOR_PAYMENT_ID = of("rspec_vendor_payment_id")

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

                fun of(value: String) = ReferenceNumberType(JsonField.of(value))
            }

            enum class Known {
                ACH_ORIGINAL_TRACE_NUMBER,
                ACH_TRACE_NUMBER,
                BANKPROV_PAYMENT_ACTIVITY_DATE,
                BANKPROV_PAYMENT_ID,
                BNK_DEV_PRENOTIFICATION_ID,
                BNK_DEV_TRANSFER_ID,
                BOFA_END_TO_END_ID,
                BOFA_TRANSACTION_ID,
                CHECK_NUMBER,
                CITIBANK_REFERENCE_NUMBER,
                CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER,
                COLUMN_FX_QUOTE_ID,
                COLUMN_REVERSAL_PAIR_TRANSFER_ID,
                COLUMN_TRANSFER_ID,
                CROSS_RIVER_PAYMENT_ID,
                CROSS_RIVER_SERVICE_MESSAGE,
                CROSS_RIVER_TRANSACTION_ID,
                CURRENCYCLOUD_CONVERSION_ID,
                CURRENCYCLOUD_PAYMENT_ID,
                DC_BANK_TRANSACTION_ID,
                DWOLLA_TRANSACTION_ID,
                EFT_TRACE_NUMBER,
                EVOLVE_TRANSACTION_ID,
                FEDWIRE_IMAD,
                FEDWIRE_OMAD,
                FIRST_REPUBLIC_INTERNAL_ID,
                GOLDMAN_SACHS_COLLECTION_REQUEST_ID,
                GOLDMAN_SACHS_END_TO_END_ID,
                GOLDMAN_SACHS_PAYMENT_REQUEST_ID,
                GOLDMAN_SACHS_REQUEST_ID,
                GOLDMAN_SACHS_UNIQUE_PAYMENT_ID,
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
                LOB_CHECK_ID,
                OTHER,
                PARTIAL_SWIFT_MIR,
                PNC_CLEARING_REFERENCE,
                PNC_INSTRUCTION_ID,
                PNC_MULTIPAYMENT_ID,
                PNC_PAYMENT_TRACE_ID,
                PNC_TRANSACTION_REFERENCE_NUMBER,
                RSPEC_VENDOR_PAYMENT_ID,
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
            }

            enum class Value {
                ACH_ORIGINAL_TRACE_NUMBER,
                ACH_TRACE_NUMBER,
                BANKPROV_PAYMENT_ACTIVITY_DATE,
                BANKPROV_PAYMENT_ID,
                BNK_DEV_PRENOTIFICATION_ID,
                BNK_DEV_TRANSFER_ID,
                BOFA_END_TO_END_ID,
                BOFA_TRANSACTION_ID,
                CHECK_NUMBER,
                CITIBANK_REFERENCE_NUMBER,
                CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER,
                COLUMN_FX_QUOTE_ID,
                COLUMN_REVERSAL_PAIR_TRANSFER_ID,
                COLUMN_TRANSFER_ID,
                CROSS_RIVER_PAYMENT_ID,
                CROSS_RIVER_SERVICE_MESSAGE,
                CROSS_RIVER_TRANSACTION_ID,
                CURRENCYCLOUD_CONVERSION_ID,
                CURRENCYCLOUD_PAYMENT_ID,
                DC_BANK_TRANSACTION_ID,
                DWOLLA_TRANSACTION_ID,
                EFT_TRACE_NUMBER,
                EVOLVE_TRANSACTION_ID,
                FEDWIRE_IMAD,
                FEDWIRE_OMAD,
                FIRST_REPUBLIC_INTERNAL_ID,
                GOLDMAN_SACHS_COLLECTION_REQUEST_ID,
                GOLDMAN_SACHS_END_TO_END_ID,
                GOLDMAN_SACHS_PAYMENT_REQUEST_ID,
                GOLDMAN_SACHS_REQUEST_ID,
                GOLDMAN_SACHS_UNIQUE_PAYMENT_ID,
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
                LOB_CHECK_ID,
                OTHER,
                PARTIAL_SWIFT_MIR,
                PNC_CLEARING_REFERENCE,
                PNC_INSTRUCTION_ID,
                PNC_MULTIPAYMENT_ID,
                PNC_PAYMENT_TRACE_ID,
                PNC_TRANSACTION_REFERENCE_NUMBER,
                RSPEC_VENDOR_PAYMENT_ID,
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
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACH_ORIGINAL_TRACE_NUMBER -> Value.ACH_ORIGINAL_TRACE_NUMBER
                    ACH_TRACE_NUMBER -> Value.ACH_TRACE_NUMBER
                    BANKPROV_PAYMENT_ACTIVITY_DATE -> Value.BANKPROV_PAYMENT_ACTIVITY_DATE
                    BANKPROV_PAYMENT_ID -> Value.BANKPROV_PAYMENT_ID
                    BNK_DEV_PRENOTIFICATION_ID -> Value.BNK_DEV_PRENOTIFICATION_ID
                    BNK_DEV_TRANSFER_ID -> Value.BNK_DEV_TRANSFER_ID
                    BOFA_END_TO_END_ID -> Value.BOFA_END_TO_END_ID
                    BOFA_TRANSACTION_ID -> Value.BOFA_TRANSACTION_ID
                    CHECK_NUMBER -> Value.CHECK_NUMBER
                    CITIBANK_REFERENCE_NUMBER -> Value.CITIBANK_REFERENCE_NUMBER
                    CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER ->
                        Value.CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER
                    COLUMN_FX_QUOTE_ID -> Value.COLUMN_FX_QUOTE_ID
                    COLUMN_REVERSAL_PAIR_TRANSFER_ID -> Value.COLUMN_REVERSAL_PAIR_TRANSFER_ID
                    COLUMN_TRANSFER_ID -> Value.COLUMN_TRANSFER_ID
                    CROSS_RIVER_PAYMENT_ID -> Value.CROSS_RIVER_PAYMENT_ID
                    CROSS_RIVER_SERVICE_MESSAGE -> Value.CROSS_RIVER_SERVICE_MESSAGE
                    CROSS_RIVER_TRANSACTION_ID -> Value.CROSS_RIVER_TRANSACTION_ID
                    CURRENCYCLOUD_CONVERSION_ID -> Value.CURRENCYCLOUD_CONVERSION_ID
                    CURRENCYCLOUD_PAYMENT_ID -> Value.CURRENCYCLOUD_PAYMENT_ID
                    DC_BANK_TRANSACTION_ID -> Value.DC_BANK_TRANSACTION_ID
                    DWOLLA_TRANSACTION_ID -> Value.DWOLLA_TRANSACTION_ID
                    EFT_TRACE_NUMBER -> Value.EFT_TRACE_NUMBER
                    EVOLVE_TRANSACTION_ID -> Value.EVOLVE_TRANSACTION_ID
                    FEDWIRE_IMAD -> Value.FEDWIRE_IMAD
                    FEDWIRE_OMAD -> Value.FEDWIRE_OMAD
                    FIRST_REPUBLIC_INTERNAL_ID -> Value.FIRST_REPUBLIC_INTERNAL_ID
                    GOLDMAN_SACHS_COLLECTION_REQUEST_ID -> Value.GOLDMAN_SACHS_COLLECTION_REQUEST_ID
                    GOLDMAN_SACHS_END_TO_END_ID -> Value.GOLDMAN_SACHS_END_TO_END_ID
                    GOLDMAN_SACHS_PAYMENT_REQUEST_ID -> Value.GOLDMAN_SACHS_PAYMENT_REQUEST_ID
                    GOLDMAN_SACHS_REQUEST_ID -> Value.GOLDMAN_SACHS_REQUEST_ID
                    GOLDMAN_SACHS_UNIQUE_PAYMENT_ID -> Value.GOLDMAN_SACHS_UNIQUE_PAYMENT_ID
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
                    LOB_CHECK_ID -> Value.LOB_CHECK_ID
                    OTHER -> Value.OTHER
                    PARTIAL_SWIFT_MIR -> Value.PARTIAL_SWIFT_MIR
                    PNC_CLEARING_REFERENCE -> Value.PNC_CLEARING_REFERENCE
                    PNC_INSTRUCTION_ID -> Value.PNC_INSTRUCTION_ID
                    PNC_MULTIPAYMENT_ID -> Value.PNC_MULTIPAYMENT_ID
                    PNC_PAYMENT_TRACE_ID -> Value.PNC_PAYMENT_TRACE_ID
                    PNC_TRANSACTION_REFERENCE_NUMBER -> Value.PNC_TRANSACTION_REFERENCE_NUMBER
                    RSPEC_VENDOR_PAYMENT_ID -> Value.RSPEC_VENDOR_PAYMENT_ID
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
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACH_ORIGINAL_TRACE_NUMBER -> Known.ACH_ORIGINAL_TRACE_NUMBER
                    ACH_TRACE_NUMBER -> Known.ACH_TRACE_NUMBER
                    BANKPROV_PAYMENT_ACTIVITY_DATE -> Known.BANKPROV_PAYMENT_ACTIVITY_DATE
                    BANKPROV_PAYMENT_ID -> Known.BANKPROV_PAYMENT_ID
                    BNK_DEV_PRENOTIFICATION_ID -> Known.BNK_DEV_PRENOTIFICATION_ID
                    BNK_DEV_TRANSFER_ID -> Known.BNK_DEV_TRANSFER_ID
                    BOFA_END_TO_END_ID -> Known.BOFA_END_TO_END_ID
                    BOFA_TRANSACTION_ID -> Known.BOFA_TRANSACTION_ID
                    CHECK_NUMBER -> Known.CHECK_NUMBER
                    CITIBANK_REFERENCE_NUMBER -> Known.CITIBANK_REFERENCE_NUMBER
                    CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER ->
                        Known.CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER
                    COLUMN_FX_QUOTE_ID -> Known.COLUMN_FX_QUOTE_ID
                    COLUMN_REVERSAL_PAIR_TRANSFER_ID -> Known.COLUMN_REVERSAL_PAIR_TRANSFER_ID
                    COLUMN_TRANSFER_ID -> Known.COLUMN_TRANSFER_ID
                    CROSS_RIVER_PAYMENT_ID -> Known.CROSS_RIVER_PAYMENT_ID
                    CROSS_RIVER_SERVICE_MESSAGE -> Known.CROSS_RIVER_SERVICE_MESSAGE
                    CROSS_RIVER_TRANSACTION_ID -> Known.CROSS_RIVER_TRANSACTION_ID
                    CURRENCYCLOUD_CONVERSION_ID -> Known.CURRENCYCLOUD_CONVERSION_ID
                    CURRENCYCLOUD_PAYMENT_ID -> Known.CURRENCYCLOUD_PAYMENT_ID
                    DC_BANK_TRANSACTION_ID -> Known.DC_BANK_TRANSACTION_ID
                    DWOLLA_TRANSACTION_ID -> Known.DWOLLA_TRANSACTION_ID
                    EFT_TRACE_NUMBER -> Known.EFT_TRACE_NUMBER
                    EVOLVE_TRANSACTION_ID -> Known.EVOLVE_TRANSACTION_ID
                    FEDWIRE_IMAD -> Known.FEDWIRE_IMAD
                    FEDWIRE_OMAD -> Known.FEDWIRE_OMAD
                    FIRST_REPUBLIC_INTERNAL_ID -> Known.FIRST_REPUBLIC_INTERNAL_ID
                    GOLDMAN_SACHS_COLLECTION_REQUEST_ID -> Known.GOLDMAN_SACHS_COLLECTION_REQUEST_ID
                    GOLDMAN_SACHS_END_TO_END_ID -> Known.GOLDMAN_SACHS_END_TO_END_ID
                    GOLDMAN_SACHS_PAYMENT_REQUEST_ID -> Known.GOLDMAN_SACHS_PAYMENT_REQUEST_ID
                    GOLDMAN_SACHS_REQUEST_ID -> Known.GOLDMAN_SACHS_REQUEST_ID
                    GOLDMAN_SACHS_UNIQUE_PAYMENT_ID -> Known.GOLDMAN_SACHS_UNIQUE_PAYMENT_ID
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
                    LOB_CHECK_ID -> Known.LOB_CHECK_ID
                    OTHER -> Known.OTHER
                    PARTIAL_SWIFT_MIR -> Known.PARTIAL_SWIFT_MIR
                    PNC_CLEARING_REFERENCE -> Known.PNC_CLEARING_REFERENCE
                    PNC_INSTRUCTION_ID -> Known.PNC_INSTRUCTION_ID
                    PNC_MULTIPAYMENT_ID -> Known.PNC_MULTIPAYMENT_ID
                    PNC_PAYMENT_TRACE_ID -> Known.PNC_PAYMENT_TRACE_ID
                    PNC_TRANSACTION_REFERENCE_NUMBER -> Known.PNC_TRANSACTION_REFERENCE_NUMBER
                    RSPEC_VENDOR_PAYMENT_ID -> Known.RSPEC_VENDOR_PAYMENT_ID
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
                    else ->
                        throw ModernTreasuryInvalidDataException(
                            "Unknown ReferenceNumberType: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ReferenceNumberType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentReference && id == other.id && createdAt == other.createdAt && liveMode == other.liveMode && object_ == other.object_ && referenceNumber == other.referenceNumber && referenceNumberType == other.referenceNumberType && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, createdAt, liveMode, object_, referenceNumber, referenceNumberType, updatedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentReference{id=$id, createdAt=$createdAt, liveMode=$liveMode, object_=$object_, referenceNumber=$referenceNumber, referenceNumberType=$referenceNumberType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    /** The type of object being returned or `null`. */
    class ReturnableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

            val PAPER_ITEM = of("paper_item")

            val PAYMENT_ORDER = of("payment_order")

            val RETURN = of("return")

            val REVERSAL = of("reversal")

            fun of(value: String) = ReturnableType(JsonField.of(value))
        }

        enum class Known {
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
        }

        enum class Value {
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Value.PAPER_ITEM
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                RETURN -> Value.RETURN
                REVERSAL -> Value.REVERSAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Known.PAPER_ITEM
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                RETURN -> Known.RETURN
                REVERSAL -> Known.REVERSAL
                else -> throw ModernTreasuryInvalidDataException("Unknown ReturnableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReturnableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The role of the return, can be `originating` or `receiving`. */
    class Role
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ORIGINATING = of("originating")

            val RECEIVING = of("receiving")

            fun of(value: String) = Role(JsonField.of(value))
        }

        enum class Known {
            ORIGINATING,
            RECEIVING,
        }

        enum class Value {
            ORIGINATING,
            RECEIVING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ORIGINATING -> Value.ORIGINATING
                RECEIVING -> Value.RECEIVING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ORIGINATING -> Known.ORIGINATING
                RECEIVING -> Known.RECEIVING
                else -> throw ModernTreasuryInvalidDataException("Unknown Role: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Role && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The current status of the return. */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

        enum class Known {
            COMPLETED,
            FAILED,
            PENDING,
            PROCESSING,
            RETURNED,
            SENT,
        }

        enum class Value {
            COMPLETED,
            FAILED,
            PENDING,
            PROCESSING,
            RETURNED,
            SENT,
            _UNKNOWN,
        }

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

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The type of return. Can be one of: `ach`, `ach_noc`, `au_becs`, `bacs`, `eft`, `interac`,
     * `manual`, `paper_item`, `wire`.
     */
    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            val PAPER_ITEM = of("paper_item")

            val SEPA = of("sepa")

            val WIRE = of("wire")

            fun of(value: String) = Type(JsonField.of(value))
        }

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
            PAPER_ITEM,
            SEPA,
            WIRE,
        }

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
            PAPER_ITEM,
            SEPA,
            WIRE,
            _UNKNOWN,
        }

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
                PAPER_ITEM -> Value.PAPER_ITEM
                SEPA -> Value.SEPA
                WIRE -> Value.WIRE
                else -> Value._UNKNOWN
            }

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
                PAPER_ITEM -> Known.PAPER_ITEM
                SEPA -> Known.SEPA
                WIRE -> Known.WIRE
                else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is ReturnObject && id == other.id && amount == other.amount && code == other.code && createdAt == other.createdAt && currency == other.currency && currentReturn == other.currentReturn && dateOfDeath == other.dateOfDeath && failureReason == other.failureReason && internalAccountId == other.internalAccountId && ledgerTransactionId == other.ledgerTransactionId && liveMode == other.liveMode && object_ == other.object_ && reason == other.reason && referenceNumbers == other.referenceNumbers && returnableId == other.returnableId && returnableType == other.returnableType && role == other.role && status == other.status && transactionId == other.transactionId && transactionLineItemId == other.transactionLineItemId && type == other.type && updatedAt == other.updatedAt && additionalInformation == other.additionalInformation && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, code, createdAt, currency, currentReturn, dateOfDeath, failureReason, internalAccountId, ledgerTransactionId, liveMode, object_, reason, referenceNumbers, returnableId, returnableType, role, status, transactionId, transactionLineItemId, type, updatedAt, additionalInformation, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReturnObject{id=$id, amount=$amount, code=$code, createdAt=$createdAt, currency=$currency, currentReturn=$currentReturn, dateOfDeath=$dateOfDeath, failureReason=$failureReason, internalAccountId=$internalAccountId, ledgerTransactionId=$ledgerTransactionId, liveMode=$liveMode, object_=$object_, reason=$reason, referenceNumbers=$referenceNumbers, returnableId=$returnableId, returnableType=$returnableType, role=$role, status=$status, transactionId=$transactionId, transactionLineItemId=$transactionLineItemId, type=$type, updatedAt=$updatedAt, additionalInformation=$additionalInformation, additionalProperties=$additionalProperties}"
}
