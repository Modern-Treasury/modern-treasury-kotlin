// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = ReturnObject.Builder::class)
@NoAutoDetect
class ReturnObject
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val returnableId: JsonField<String>,
    private val returnableType: JsonField<ReturnableType>,
    private val code: JsonField<Code>,
    private val reason: JsonField<String>,
    private val dateOfDeath: JsonField<LocalDate>,
    private val additionalInformation: JsonField<String>,
    private val status: JsonField<Status>,
    private val transactionLineItemId: JsonField<String>,
    private val transactionId: JsonField<String>,
    private val internalAccountId: JsonField<String>,
    private val type: JsonField<Type>,
    private val amount: JsonField<Long>,
    private val currency: JsonField<Currency>,
    private val failureReason: JsonField<String>,
    private val role: JsonField<Role>,
    private val currentReturn: JsonField<ReturnObject>,
    private val referenceNumbers: JsonField<List<PaymentReference>>,
    private val ledgerTransactionId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The ID of the object being returned or `null`. */
    fun returnableId(): String? = returnableId.getNullable("returnable_id")

    /** The type of object being returned or `null`. */
    fun returnableType(): ReturnableType? = returnableType.getNullable("returnable_type")

    /** The return code. For ACH returns, this is the required ACH return code. */
    fun code(): Code? = code.getNullable("code")

    /**
     * Often the bank will provide an explanation for the return, which is a short human readable
     * string.
     */
    fun reason(): String? = reason.getNullable("reason")

    /**
     * If the return code is `R14` or `R15` this is the date the deceased counterparty passed away.
     */
    fun dateOfDeath(): LocalDate? = dateOfDeath.getNullable("date_of_death")

    /**
     * Some returns may include additional information from the bank. In these cases, this string
     * will be present.
     */
    fun additionalInformation(): String? =
        additionalInformation.getNullable("additional_information")

    /** The current status of the return. */
    fun status(): Status = status.getRequired("status")

    /** The ID of the relevant Transaction Line Item or `null`. */
    fun transactionLineItemId(): String? =
        transactionLineItemId.getNullable("transaction_line_item_id")

    /** The ID of the relevant Transaction or `null`. */
    fun transactionId(): String? = transactionId.getNullable("transaction_id")

    /** The ID of the relevant Internal Account. */
    fun internalAccountId(): String? = internalAccountId.getNullable("internal_account_id")

    /**
     * The type of return. Can be one of: `ach`, `ach_noc`, `au_becs`, `bacs`, `eft`, `interac`,
     * `manual`, `paper_item`, `wire`.
     */
    fun type(): Type = type.getRequired("type")

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    fun amount(): Long = amount.getRequired("amount")

    /** Currency that this transaction is denominated in. */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * If an originating return failed to be processed by the bank, a description of the failure
     * reason will be available.
     */
    fun failureReason(): String? = failureReason.getNullable("failure_reason")

    /** The role of the return, can be `originating` or `receiving`. */
    fun role(): Role = role.getRequired("role")

    /**
     * If the return's status is `returned`, this will include the return object's data that is
     * returning this return.
     */
    fun currentReturn(): ReturnObject? = currentReturn.getNullable("current_return")

    /** An array of Payment Reference objects. */
    fun referenceNumbers(): List<PaymentReference> =
        referenceNumbers.getRequired("reference_numbers")

    /** The ID of the ledger transaction linked to the return. */
    fun ledgerTransactionId(): String? = ledgerTransactionId.getNullable("ledger_transaction_id")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** The ID of the object being returned or `null`. */
    @JsonProperty("returnable_id") @ExcludeMissing fun _returnableId() = returnableId

    /** The type of object being returned or `null`. */
    @JsonProperty("returnable_type") @ExcludeMissing fun _returnableType() = returnableType

    /** The return code. For ACH returns, this is the required ACH return code. */
    @JsonProperty("code") @ExcludeMissing fun _code() = code

    /**
     * Often the bank will provide an explanation for the return, which is a short human readable
     * string.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

    /**
     * If the return code is `R14` or `R15` this is the date the deceased counterparty passed away.
     */
    @JsonProperty("date_of_death") @ExcludeMissing fun _dateOfDeath() = dateOfDeath

    /**
     * Some returns may include additional information from the bank. In these cases, this string
     * will be present.
     */
    @JsonProperty("additional_information")
    @ExcludeMissing
    fun _additionalInformation() = additionalInformation

    /** The current status of the return. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The ID of the relevant Transaction Line Item or `null`. */
    @JsonProperty("transaction_line_item_id")
    @ExcludeMissing
    fun _transactionLineItemId() = transactionLineItemId

    /** The ID of the relevant Transaction or `null`. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /** The ID of the relevant Internal Account. */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId() = internalAccountId

    /**
     * The type of return. Can be one of: `ach`, `ach_noc`, `au_becs`, `bacs`, `eft`, `interac`,
     * `manual`, `paper_item`, `wire`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** Currency that this transaction is denominated in. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * If an originating return failed to be processed by the bank, a description of the failure
     * reason will be available.
     */
    @JsonProperty("failure_reason") @ExcludeMissing fun _failureReason() = failureReason

    /** The role of the return, can be `originating` or `receiving`. */
    @JsonProperty("role") @ExcludeMissing fun _role() = role

    /**
     * If the return's status is `returned`, this will include the return object's data that is
     * returning this return.
     */
    @JsonProperty("current_return") @ExcludeMissing fun _currentReturn() = currentReturn

    /** An array of Payment Reference objects. */
    @JsonProperty("reference_numbers") @ExcludeMissing fun _referenceNumbers() = referenceNumbers

    /** The ID of the ledger transaction linked to the return. */
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    fun _ledgerTransactionId() = ledgerTransactionId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ReturnObject = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            returnableId()
            returnableType()
            code()
            reason()
            dateOfDeath()
            additionalInformation()
            status()
            transactionLineItemId()
            transactionId()
            internalAccountId()
            type()
            amount()
            currency()
            failureReason()
            role()
            currentReturn()?.validate()
            referenceNumbers().forEach { it.validate() }
            ledgerTransactionId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReturnObject &&
            this.id == other.id &&
            this.object_ == other.object_ &&
            this.liveMode == other.liveMode &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.returnableId == other.returnableId &&
            this.returnableType == other.returnableType &&
            this.code == other.code &&
            this.reason == other.reason &&
            this.dateOfDeath == other.dateOfDeath &&
            this.additionalInformation == other.additionalInformation &&
            this.status == other.status &&
            this.transactionLineItemId == other.transactionLineItemId &&
            this.transactionId == other.transactionId &&
            this.internalAccountId == other.internalAccountId &&
            this.type == other.type &&
            this.amount == other.amount &&
            this.currency == other.currency &&
            this.failureReason == other.failureReason &&
            this.role == other.role &&
            this.currentReturn == other.currentReturn &&
            this.referenceNumbers == other.referenceNumbers &&
            this.ledgerTransactionId == other.ledgerTransactionId &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    returnableId,
                    returnableType,
                    code,
                    reason,
                    dateOfDeath,
                    additionalInformation,
                    status,
                    transactionLineItemId,
                    transactionId,
                    internalAccountId,
                    type,
                    amount,
                    currency,
                    failureReason,
                    role,
                    currentReturn,
                    referenceNumbers,
                    ledgerTransactionId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ReturnObject{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, returnableId=$returnableId, returnableType=$returnableType, code=$code, reason=$reason, dateOfDeath=$dateOfDeath, additionalInformation=$additionalInformation, status=$status, transactionLineItemId=$transactionLineItemId, transactionId=$transactionId, internalAccountId=$internalAccountId, type=$type, amount=$amount, currency=$currency, failureReason=$failureReason, role=$role, currentReturn=$currentReturn, referenceNumbers=$referenceNumbers, ledgerTransactionId=$ledgerTransactionId, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var returnableId: JsonField<String> = JsonMissing.of()
        private var returnableType: JsonField<ReturnableType> = JsonMissing.of()
        private var code: JsonField<Code> = JsonMissing.of()
        private var reason: JsonField<String> = JsonMissing.of()
        private var dateOfDeath: JsonField<LocalDate> = JsonMissing.of()
        private var additionalInformation: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var transactionLineItemId: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var internalAccountId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var failureReason: JsonField<String> = JsonMissing.of()
        private var role: JsonField<Role> = JsonMissing.of()
        private var currentReturn: JsonField<ReturnObject> = JsonMissing.of()
        private var referenceNumbers: JsonField<List<PaymentReference>> = JsonMissing.of()
        private var ledgerTransactionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(returnObject: ReturnObject) = apply {
            this.id = returnObject.id
            this.object_ = returnObject.object_
            this.liveMode = returnObject.liveMode
            this.createdAt = returnObject.createdAt
            this.updatedAt = returnObject.updatedAt
            this.returnableId = returnObject.returnableId
            this.returnableType = returnObject.returnableType
            this.code = returnObject.code
            this.reason = returnObject.reason
            this.dateOfDeath = returnObject.dateOfDeath
            this.additionalInformation = returnObject.additionalInformation
            this.status = returnObject.status
            this.transactionLineItemId = returnObject.transactionLineItemId
            this.transactionId = returnObject.transactionId
            this.internalAccountId = returnObject.internalAccountId
            this.type = returnObject.type
            this.amount = returnObject.amount
            this.currency = returnObject.currency
            this.failureReason = returnObject.failureReason
            this.role = returnObject.role
            this.currentReturn = returnObject.currentReturn
            this.referenceNumbers = returnObject.referenceNumbers
            this.ledgerTransactionId = returnObject.ledgerTransactionId
            additionalProperties(returnObject.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode")
        @ExcludeMissing
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The ID of the object being returned or `null`. */
        fun returnableId(returnableId: String) = returnableId(JsonField.of(returnableId))

        /** The ID of the object being returned or `null`. */
        @JsonProperty("returnable_id")
        @ExcludeMissing
        fun returnableId(returnableId: JsonField<String>) = apply {
            this.returnableId = returnableId
        }

        /** The type of object being returned or `null`. */
        fun returnableType(returnableType: ReturnableType) =
            returnableType(JsonField.of(returnableType))

        /** The type of object being returned or `null`. */
        @JsonProperty("returnable_type")
        @ExcludeMissing
        fun returnableType(returnableType: JsonField<ReturnableType>) = apply {
            this.returnableType = returnableType
        }

        /** The return code. For ACH returns, this is the required ACH return code. */
        fun code(code: Code) = code(JsonField.of(code))

        /** The return code. For ACH returns, this is the required ACH return code. */
        @JsonProperty("code")
        @ExcludeMissing
        fun code(code: JsonField<Code>) = apply { this.code = code }

        /**
         * Often the bank will provide an explanation for the return, which is a short human
         * readable string.
         */
        fun reason(reason: String) = reason(JsonField.of(reason))

        /**
         * Often the bank will provide an explanation for the return, which is a short human
         * readable string.
         */
        @JsonProperty("reason")
        @ExcludeMissing
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /**
         * If the return code is `R14` or `R15` this is the date the deceased counterparty passed
         * away.
         */
        fun dateOfDeath(dateOfDeath: LocalDate) = dateOfDeath(JsonField.of(dateOfDeath))

        /**
         * If the return code is `R14` or `R15` this is the date the deceased counterparty passed
         * away.
         */
        @JsonProperty("date_of_death")
        @ExcludeMissing
        fun dateOfDeath(dateOfDeath: JsonField<LocalDate>) = apply {
            this.dateOfDeath = dateOfDeath
        }

        /**
         * Some returns may include additional information from the bank. In these cases, this
         * string will be present.
         */
        fun additionalInformation(additionalInformation: String) =
            additionalInformation(JsonField.of(additionalInformation))

        /**
         * Some returns may include additional information from the bank. In these cases, this
         * string will be present.
         */
        @JsonProperty("additional_information")
        @ExcludeMissing
        fun additionalInformation(additionalInformation: JsonField<String>) = apply {
            this.additionalInformation = additionalInformation
        }

        /** The current status of the return. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The current status of the return. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The ID of the relevant Transaction Line Item or `null`. */
        fun transactionLineItemId(transactionLineItemId: String) =
            transactionLineItemId(JsonField.of(transactionLineItemId))

        /** The ID of the relevant Transaction Line Item or `null`. */
        @JsonProperty("transaction_line_item_id")
        @ExcludeMissing
        fun transactionLineItemId(transactionLineItemId: JsonField<String>) = apply {
            this.transactionLineItemId = transactionLineItemId
        }

        /** The ID of the relevant Transaction or `null`. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID of the relevant Transaction or `null`. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /** The ID of the relevant Internal Account. */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /** The ID of the relevant Internal Account. */
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
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
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** Currency that this transaction is denominated in. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** Currency that this transaction is denominated in. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * If an originating return failed to be processed by the bank, a description of the failure
         * reason will be available.
         */
        fun failureReason(failureReason: String) = failureReason(JsonField.of(failureReason))

        /**
         * If an originating return failed to be processed by the bank, a description of the failure
         * reason will be available.
         */
        @JsonProperty("failure_reason")
        @ExcludeMissing
        fun failureReason(failureReason: JsonField<String>) = apply {
            this.failureReason = failureReason
        }

        /** The role of the return, can be `originating` or `receiving`. */
        fun role(role: Role) = role(JsonField.of(role))

        /** The role of the return, can be `originating` or `receiving`. */
        @JsonProperty("role")
        @ExcludeMissing
        fun role(role: JsonField<Role>) = apply { this.role = role }

        /**
         * If the return's status is `returned`, this will include the return object's data that is
         * returning this return.
         */
        fun currentReturn(currentReturn: ReturnObject) = currentReturn(JsonField.of(currentReturn))

        /**
         * If the return's status is `returned`, this will include the return object's data that is
         * returning this return.
         */
        @JsonProperty("current_return")
        @ExcludeMissing
        fun currentReturn(currentReturn: JsonField<ReturnObject>) = apply {
            this.currentReturn = currentReturn
        }

        /** An array of Payment Reference objects. */
        fun referenceNumbers(referenceNumbers: List<PaymentReference>) =
            referenceNumbers(JsonField.of(referenceNumbers))

        /** An array of Payment Reference objects. */
        @JsonProperty("reference_numbers")
        @ExcludeMissing
        fun referenceNumbers(referenceNumbers: JsonField<List<PaymentReference>>) = apply {
            this.referenceNumbers = referenceNumbers
        }

        /** The ID of the ledger transaction linked to the return. */
        fun ledgerTransactionId(ledgerTransactionId: String) =
            ledgerTransactionId(JsonField.of(ledgerTransactionId))

        /** The ID of the ledger transaction linked to the return. */
        @JsonProperty("ledger_transaction_id")
        @ExcludeMissing
        fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
            this.ledgerTransactionId = ledgerTransactionId
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

        fun build(): ReturnObject =
            ReturnObject(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                returnableId,
                returnableType,
                code,
                reason,
                dateOfDeath,
                additionalInformation,
                status,
                transactionLineItemId,
                transactionId,
                internalAccountId,
                type,
                amount,
                currency,
                failureReason,
                role,
                currentReturn,
                referenceNumbers.map { it.toUnmodifiable() },
                ledgerTransactionId,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Code
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Code && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val _901 = Code(JsonField.of("901"))

            val _902 = Code(JsonField.of("902"))

            val _903 = Code(JsonField.of("903"))

            val _904 = Code(JsonField.of("904"))

            val _905 = Code(JsonField.of("905"))

            val _907 = Code(JsonField.of("907"))

            val _908 = Code(JsonField.of("908"))

            val _909 = Code(JsonField.of("909"))

            val _910 = Code(JsonField.of("910"))

            val _911 = Code(JsonField.of("911"))

            val _912 = Code(JsonField.of("912"))

            val _914 = Code(JsonField.of("914"))

            val C01 = Code(JsonField.of("C01"))

            val C02 = Code(JsonField.of("C02"))

            val C03 = Code(JsonField.of("C03"))

            val C05 = Code(JsonField.of("C05"))

            val C06 = Code(JsonField.of("C06"))

            val C07 = Code(JsonField.of("C07"))

            val C08 = Code(JsonField.of("C08"))

            val C09 = Code(JsonField.of("C09"))

            val C13 = Code(JsonField.of("C13"))

            val C14 = Code(JsonField.of("C14"))

            val R01 = Code(JsonField.of("R01"))

            val R02 = Code(JsonField.of("R02"))

            val R03 = Code(JsonField.of("R03"))

            val R04 = Code(JsonField.of("R04"))

            val R05 = Code(JsonField.of("R05"))

            val R06 = Code(JsonField.of("R06"))

            val R07 = Code(JsonField.of("R07"))

            val R08 = Code(JsonField.of("R08"))

            val R09 = Code(JsonField.of("R09"))

            val R10 = Code(JsonField.of("R10"))

            val R11 = Code(JsonField.of("R11"))

            val R12 = Code(JsonField.of("R12"))

            val R14 = Code(JsonField.of("R14"))

            val R15 = Code(JsonField.of("R15"))

            val R16 = Code(JsonField.of("R16"))

            val R17 = Code(JsonField.of("R17"))

            val R20 = Code(JsonField.of("R20"))

            val R21 = Code(JsonField.of("R21"))

            val R22 = Code(JsonField.of("R22"))

            val R23 = Code(JsonField.of("R23"))

            val R24 = Code(JsonField.of("R24"))

            val R29 = Code(JsonField.of("R29"))

            val R31 = Code(JsonField.of("R31"))

            val R33 = Code(JsonField.of("R33"))

            val R37 = Code(JsonField.of("R37"))

            val R38 = Code(JsonField.of("R38"))

            val R39 = Code(JsonField.of("R39"))

            val R51 = Code(JsonField.of("R51"))

            val R52 = Code(JsonField.of("R52"))

            val R53 = Code(JsonField.of("R53"))

            val CURRENCYCLOUD = Code(JsonField.of("currencycloud"))

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
    }

    @JsonDeserialize(builder = PaymentReference.Builder::class)
    @NoAutoDetect
    class PaymentReference
    private constructor(
        private val id: JsonField<String>,
        private val object_: JsonField<String>,
        private val liveMode: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val referenceNumber: JsonField<String>,
        private val referenceNumberType: JsonField<ReferenceNumberType>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun object_(): String = object_.getRequired("object")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /** The vendor reference number. */
        fun referenceNumber(): String = referenceNumber.getRequired("reference_number")

        /** The type of the reference number. Referring to the vendor payment id. */
        fun referenceNumberType(): ReferenceNumberType =
            referenceNumberType.getRequired("reference_number_type")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("object") @ExcludeMissing fun _object_() = object_

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

        /** The vendor reference number. */
        @JsonProperty("reference_number") @ExcludeMissing fun _referenceNumber() = referenceNumber

        /** The type of the reference number. Referring to the vendor payment id. */
        @JsonProperty("reference_number_type")
        @ExcludeMissing
        fun _referenceNumberType() = referenceNumberType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PaymentReference = apply {
            if (!validated) {
                id()
                object_()
                liveMode()
                createdAt()
                updatedAt()
                referenceNumber()
                referenceNumberType()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentReference &&
                this.id == other.id &&
                this.object_ == other.object_ &&
                this.liveMode == other.liveMode &&
                this.createdAt == other.createdAt &&
                this.updatedAt == other.updatedAt &&
                this.referenceNumber == other.referenceNumber &&
                this.referenceNumberType == other.referenceNumberType &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        object_,
                        liveMode,
                        createdAt,
                        updatedAt,
                        referenceNumber,
                        referenceNumberType,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PaymentReference{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, referenceNumber=$referenceNumber, referenceNumberType=$referenceNumberType, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var object_: JsonField<String> = JsonMissing.of()
            private var liveMode: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var referenceNumber: JsonField<String> = JsonMissing.of()
            private var referenceNumberType: JsonField<ReferenceNumberType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentReference: PaymentReference) = apply {
                this.id = paymentReference.id
                this.object_ = paymentReference.object_
                this.liveMode = paymentReference.liveMode
                this.createdAt = paymentReference.createdAt
                this.updatedAt = paymentReference.updatedAt
                this.referenceNumber = paymentReference.referenceNumber
                this.referenceNumberType = paymentReference.referenceNumberType
                additionalProperties(paymentReference.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun object_(object_: String) = object_(JsonField.of(object_))

            @JsonProperty("object")
            @ExcludeMissing
            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            @JsonProperty("live_mode")
            @ExcludeMissing
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            @JsonProperty("updated_at")
            @ExcludeMissing
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /** The vendor reference number. */
            fun referenceNumber(referenceNumber: String) =
                referenceNumber(JsonField.of(referenceNumber))

            /** The vendor reference number. */
            @JsonProperty("reference_number")
            @ExcludeMissing
            fun referenceNumber(referenceNumber: JsonField<String>) = apply {
                this.referenceNumber = referenceNumber
            }

            /** The type of the reference number. Referring to the vendor payment id. */
            fun referenceNumberType(referenceNumberType: ReferenceNumberType) =
                referenceNumberType(JsonField.of(referenceNumberType))

            /** The type of the reference number. Referring to the vendor payment id. */
            @JsonProperty("reference_number_type")
            @ExcludeMissing
            fun referenceNumberType(referenceNumberType: JsonField<ReferenceNumberType>) = apply {
                this.referenceNumberType = referenceNumberType
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

            fun build(): PaymentReference =
                PaymentReference(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    referenceNumber,
                    referenceNumberType,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class ReferenceNumberType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ReferenceNumberType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ACH_ORIGINAL_TRACE_NUMBER =
                    ReferenceNumberType(JsonField.of("ach_original_trace_number"))

                val ACH_TRACE_NUMBER = ReferenceNumberType(JsonField.of("ach_trace_number"))

                val BANKPROV_PAYMENT_ACTIVITY_DATE =
                    ReferenceNumberType(JsonField.of("bankprov_payment_activity_date"))

                val BANKPROV_PAYMENT_ID = ReferenceNumberType(JsonField.of("bankprov_payment_id"))

                val BNK_DEV_PRENOTIFICATION_ID =
                    ReferenceNumberType(JsonField.of("bnk_dev_prenotification_id"))

                val BNK_DEV_TRANSFER_ID = ReferenceNumberType(JsonField.of("bnk_dev_transfer_id"))

                val BOFA_END_TO_END_ID = ReferenceNumberType(JsonField.of("bofa_end_to_end_id"))

                val BOFA_TRANSACTION_ID = ReferenceNumberType(JsonField.of("bofa_transaction_id"))

                val CHECK_NUMBER = ReferenceNumberType(JsonField.of("check_number"))

                val CITIBANK_REFERENCE_NUMBER =
                    ReferenceNumberType(JsonField.of("citibank_reference_number"))

                val CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER =
                    ReferenceNumberType(
                        JsonField.of("citibank_worldlink_clearing_system_reference_number")
                    )

                val COLUMN_FX_QUOTE_ID = ReferenceNumberType(JsonField.of("column_fx_quote_id"))

                val COLUMN_REVERSAL_PAIR_TRANSFER_ID =
                    ReferenceNumberType(JsonField.of("column_reversal_pair_transfer_id"))

                val COLUMN_TRANSFER_ID = ReferenceNumberType(JsonField.of("column_transfer_id"))

                val CROSS_RIVER_PAYMENT_ID =
                    ReferenceNumberType(JsonField.of("cross_river_payment_id"))

                val CROSS_RIVER_SERVICE_MESSAGE =
                    ReferenceNumberType(JsonField.of("cross_river_service_message"))

                val CROSS_RIVER_TRANSACTION_ID =
                    ReferenceNumberType(JsonField.of("cross_river_transaction_id"))

                val CURRENCYCLOUD_CONVERSION_ID =
                    ReferenceNumberType(JsonField.of("currencycloud_conversion_id"))

                val CURRENCYCLOUD_PAYMENT_ID =
                    ReferenceNumberType(JsonField.of("currencycloud_payment_id"))

                val DC_BANK_TRANSACTION_ID =
                    ReferenceNumberType(JsonField.of("dc_bank_transaction_id"))

                val DWOLLA_TRANSACTION_ID =
                    ReferenceNumberType(JsonField.of("dwolla_transaction_id"))

                val EFT_TRACE_NUMBER = ReferenceNumberType(JsonField.of("eft_trace_number"))

                val EVOLVE_TRANSACTION_ID =
                    ReferenceNumberType(JsonField.of("evolve_transaction_id"))

                val FEDWIRE_IMAD = ReferenceNumberType(JsonField.of("fedwire_imad"))

                val FEDWIRE_OMAD = ReferenceNumberType(JsonField.of("fedwire_omad"))

                val FIRST_REPUBLIC_INTERNAL_ID =
                    ReferenceNumberType(JsonField.of("first_republic_internal_id"))

                val GOLDMAN_SACHS_COLLECTION_REQUEST_ID =
                    ReferenceNumberType(JsonField.of("goldman_sachs_collection_request_id"))

                val GOLDMAN_SACHS_END_TO_END_ID =
                    ReferenceNumberType(JsonField.of("goldman_sachs_end_to_end_id"))

                val GOLDMAN_SACHS_PAYMENT_REQUEST_ID =
                    ReferenceNumberType(JsonField.of("goldman_sachs_payment_request_id"))

                val GOLDMAN_SACHS_REQUEST_ID =
                    ReferenceNumberType(JsonField.of("goldman_sachs_request_id"))

                val GOLDMAN_SACHS_UNIQUE_PAYMENT_ID =
                    ReferenceNumberType(JsonField.of("goldman_sachs_unique_payment_id"))

                val INTERAC_MESSAGE_ID = ReferenceNumberType(JsonField.of("interac_message_id"))

                val JPMC_CCN = ReferenceNumberType(JsonField.of("jpmc_ccn"))

                val JPMC_CLEARING_SYSTEM_REFERENCE =
                    ReferenceNumberType(JsonField.of("jpmc_clearing_system_reference"))

                val JPMC_CUSTOMER_REFERENCE_ID =
                    ReferenceNumberType(JsonField.of("jpmc_customer_reference_id"))

                val JPMC_END_TO_END_ID = ReferenceNumberType(JsonField.of("jpmc_end_to_end_id"))

                val JPMC_FIRM_ROOT_ID = ReferenceNumberType(JsonField.of("jpmc_firm_root_id"))

                val JPMC_FX_TRN_ID = ReferenceNumberType(JsonField.of("jpmc_fx_trn_id"))

                val JPMC_P3_ID = ReferenceNumberType(JsonField.of("jpmc_p3_id"))

                val JPMC_PAYMENT_BATCH_ID =
                    ReferenceNumberType(JsonField.of("jpmc_payment_batch_id"))

                val JPMC_PAYMENT_INFORMATION_ID =
                    ReferenceNumberType(JsonField.of("jpmc_payment_information_id"))

                val JPMC_PAYMENT_RETURNED_DATETIME =
                    ReferenceNumberType(JsonField.of("jpmc_payment_returned_datetime"))

                val LOB_CHECK_ID = ReferenceNumberType(JsonField.of("lob_check_id"))

                val OTHER = ReferenceNumberType(JsonField.of("other"))

                val PARTIAL_SWIFT_MIR = ReferenceNumberType(JsonField.of("partial_swift_mir"))

                val PNC_CLEARING_REFERENCE =
                    ReferenceNumberType(JsonField.of("pnc_clearing_reference"))

                val PNC_INSTRUCTION_ID = ReferenceNumberType(JsonField.of("pnc_instruction_id"))

                val PNC_MULTIPAYMENT_ID = ReferenceNumberType(JsonField.of("pnc_multipayment_id"))

                val PNC_PAYMENT_TRACE_ID = ReferenceNumberType(JsonField.of("pnc_payment_trace_id"))

                val RSPEC_VENDOR_PAYMENT_ID =
                    ReferenceNumberType(JsonField.of("rspec_vendor_payment_id"))

                val RTP_INSTRUCTION_ID = ReferenceNumberType(JsonField.of("rtp_instruction_id"))

                val SIGNET_API_REFERENCE_ID =
                    ReferenceNumberType(JsonField.of("signet_api_reference_id"))

                val SIGNET_CONFIRMATION_ID =
                    ReferenceNumberType(JsonField.of("signet_confirmation_id"))

                val SIGNET_REQUEST_ID = ReferenceNumberType(JsonField.of("signet_request_id"))

                val SILVERGATE_PAYMENT_ID =
                    ReferenceNumberType(JsonField.of("silvergate_payment_id"))

                val SVB_END_TO_END_ID = ReferenceNumberType(JsonField.of("svb_end_to_end_id"))

                val SVB_PAYMENT_ID = ReferenceNumberType(JsonField.of("svb_payment_id"))

                val SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW =
                    ReferenceNumberType(
                        JsonField.of("svb_transaction_cleared_for_sanctions_review")
                    )

                val SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW =
                    ReferenceNumberType(JsonField.of("svb_transaction_held_for_sanctions_review"))

                val SWIFT_MIR = ReferenceNumberType(JsonField.of("swift_mir"))

                val SWIFT_UETR = ReferenceNumberType(JsonField.of("swift_uetr"))

                val UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER =
                    ReferenceNumberType(JsonField.of("umb_product_partner_account_number"))

                val USBANK_PAYMENT_ID = ReferenceNumberType(JsonField.of("usbank_payment_id"))

                val WELLS_FARGO_PAYMENT_ID =
                    ReferenceNumberType(JsonField.of("wells_fargo_payment_id"))

                val WELLS_FARGO_TRACE_NUMBER =
                    ReferenceNumberType(JsonField.of("wells_fargo_trace_number"))

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
                USBANK_PAYMENT_ID,
                WELLS_FARGO_PAYMENT_ID,
                WELLS_FARGO_TRACE_NUMBER,
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
                USBANK_PAYMENT_ID,
                WELLS_FARGO_PAYMENT_ID,
                WELLS_FARGO_TRACE_NUMBER,
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
                    USBANK_PAYMENT_ID -> Value.USBANK_PAYMENT_ID
                    WELLS_FARGO_PAYMENT_ID -> Value.WELLS_FARGO_PAYMENT_ID
                    WELLS_FARGO_TRACE_NUMBER -> Value.WELLS_FARGO_TRACE_NUMBER
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
                    USBANK_PAYMENT_ID -> Known.USBANK_PAYMENT_ID
                    WELLS_FARGO_PAYMENT_ID -> Known.WELLS_FARGO_PAYMENT_ID
                    WELLS_FARGO_TRACE_NUMBER -> Known.WELLS_FARGO_TRACE_NUMBER
                    else ->
                        throw ModernTreasuryInvalidDataException(
                            "Unknown ReferenceNumberType: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class ReturnableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReturnableType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val INCOMING_PAYMENT_DETAIL = ReturnableType(JsonField.of("incoming_payment_detail"))

            val PAPER_ITEM = ReturnableType(JsonField.of("paper_item"))

            val PAYMENT_ORDER = ReturnableType(JsonField.of("payment_order"))

            val RETURN = ReturnableType(JsonField.of("return"))

            val REVERSAL = ReturnableType(JsonField.of("reversal"))

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
    }

    class Role
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Role && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ORIGINATING = Role(JsonField.of("originating"))

            val RECEIVING = Role(JsonField.of("receiving"))

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
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val COMPLETED = Status(JsonField.of("completed"))

            val FAILED = Status(JsonField.of("failed"))

            val PENDING = Status(JsonField.of("pending"))

            val PROCESSING = Status(JsonField.of("processing"))

            val RETURNED = Status(JsonField.of("returned"))

            val SENT = Status(JsonField.of("sent"))

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
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACH = Type(JsonField.of("ach"))

            val ACH_NOC = Type(JsonField.of("ach_noc"))

            val AU_BECS = Type(JsonField.of("au_becs"))

            val BACS = Type(JsonField.of("bacs"))

            val BOOK = Type(JsonField.of("book"))

            val CHECK = Type(JsonField.of("check"))

            val CROSS_BORDER = Type(JsonField.of("cross_border"))

            val EFT = Type(JsonField.of("eft"))

            val INTERAC = Type(JsonField.of("interac"))

            val MANUAL = Type(JsonField.of("manual"))

            val PAPER_ITEM = Type(JsonField.of("paper_item"))

            val SEPA = Type(JsonField.of("sepa"))

            val WIRE = Type(JsonField.of("wire"))

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
    }
}
