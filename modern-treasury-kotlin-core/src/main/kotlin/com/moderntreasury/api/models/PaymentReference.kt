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
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = PaymentReference.Builder::class)
@NoAutoDetect
class PaymentReference
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val referenceableId: JsonField<String>,
    private val referenceableType: JsonField<ReferenceableType>,
    private val referenceNumber: JsonField<String>,
    private val referenceNumberType: JsonField<ReferenceNumberType>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * The id of the referenceable to search for. Must be accompanied by the referenceable_type or
     * will return an error.
     */
    fun referenceableId(): String = referenceableId.getRequired("referenceable_id")

    /**
     * One of the referenceable types. This must be accompanied by the id of the referenceable or
     * will return an error.
     */
    fun referenceableType(): ReferenceableType = referenceableType.getRequired("referenceable_type")

    /** The actual reference number assigned by the bank. */
    fun referenceNumber(): String = referenceNumber.getRequired("reference_number")

    /** The type of reference number. */
    fun referenceNumberType(): ReferenceNumberType =
        referenceNumberType.getRequired("reference_number_type")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /**
     * The id of the referenceable to search for. Must be accompanied by the referenceable_type or
     * will return an error.
     */
    @JsonProperty("referenceable_id") @ExcludeMissing fun _referenceableId() = referenceableId

    /**
     * One of the referenceable types. This must be accompanied by the id of the referenceable or
     * will return an error.
     */
    @JsonProperty("referenceable_type") @ExcludeMissing fun _referenceableType() = referenceableType

    /** The actual reference number assigned by the bank. */
    @JsonProperty("reference_number") @ExcludeMissing fun _referenceNumber() = referenceNumber

    /** The type of reference number. */
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
            referenceableId()
            referenceableType()
            referenceNumber()
            referenceNumberType()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var referenceableId: JsonField<String> = JsonMissing.of()
        private var referenceableType: JsonField<ReferenceableType> = JsonMissing.of()
        private var referenceNumber: JsonField<String> = JsonMissing.of()
        private var referenceNumberType: JsonField<ReferenceNumberType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentReference: PaymentReference) = apply {
            this.id = paymentReference.id
            this.object_ = paymentReference.object_
            this.liveMode = paymentReference.liveMode
            this.createdAt = paymentReference.createdAt
            this.updatedAt = paymentReference.updatedAt
            this.referenceableId = paymentReference.referenceableId
            this.referenceableType = paymentReference.referenceableType
            this.referenceNumber = paymentReference.referenceNumber
            this.referenceNumberType = paymentReference.referenceNumberType
            additionalProperties(paymentReference.additionalProperties)
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

        /**
         * The id of the referenceable to search for. Must be accompanied by the referenceable_type
         * or will return an error.
         */
        fun referenceableId(referenceableId: String) =
            referenceableId(JsonField.of(referenceableId))

        /**
         * The id of the referenceable to search for. Must be accompanied by the referenceable_type
         * or will return an error.
         */
        @JsonProperty("referenceable_id")
        @ExcludeMissing
        fun referenceableId(referenceableId: JsonField<String>) = apply {
            this.referenceableId = referenceableId
        }

        /**
         * One of the referenceable types. This must be accompanied by the id of the referenceable
         * or will return an error.
         */
        fun referenceableType(referenceableType: ReferenceableType) =
            referenceableType(JsonField.of(referenceableType))

        /**
         * One of the referenceable types. This must be accompanied by the id of the referenceable
         * or will return an error.
         */
        @JsonProperty("referenceable_type")
        @ExcludeMissing
        fun referenceableType(referenceableType: JsonField<ReferenceableType>) = apply {
            this.referenceableType = referenceableType
        }

        /** The actual reference number assigned by the bank. */
        fun referenceNumber(referenceNumber: String) =
            referenceNumber(JsonField.of(referenceNumber))

        /** The actual reference number assigned by the bank. */
        @JsonProperty("reference_number")
        @ExcludeMissing
        fun referenceNumber(referenceNumber: JsonField<String>) = apply {
            this.referenceNumber = referenceNumber
        }

        /** The type of reference number. */
        fun referenceNumberType(referenceNumberType: ReferenceNumberType) =
            referenceNumberType(JsonField.of(referenceNumberType))

        /** The type of reference number. */
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
                referenceableId,
                referenceableType,
                referenceNumber,
                referenceNumberType,
                additionalProperties.toImmutable(),
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

            return /* spotless:off */ other is ReferenceNumberType && this.value == other.value /* spotless:on */
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

            val CROSS_RIVER_PAYMENT_ID = ReferenceNumberType(JsonField.of("cross_river_payment_id"))

            val CROSS_RIVER_SERVICE_MESSAGE =
                ReferenceNumberType(JsonField.of("cross_river_service_message"))

            val CROSS_RIVER_TRANSACTION_ID =
                ReferenceNumberType(JsonField.of("cross_river_transaction_id"))

            val CURRENCYCLOUD_CONVERSION_ID =
                ReferenceNumberType(JsonField.of("currencycloud_conversion_id"))

            val CURRENCYCLOUD_PAYMENT_ID =
                ReferenceNumberType(JsonField.of("currencycloud_payment_id"))

            val DC_BANK_TRANSACTION_ID = ReferenceNumberType(JsonField.of("dc_bank_transaction_id"))

            val DWOLLA_TRANSACTION_ID = ReferenceNumberType(JsonField.of("dwolla_transaction_id"))

            val EFT_TRACE_NUMBER = ReferenceNumberType(JsonField.of("eft_trace_number"))

            val EVOLVE_TRANSACTION_ID = ReferenceNumberType(JsonField.of("evolve_transaction_id"))

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

            val JPMC_PAYMENT_BATCH_ID = ReferenceNumberType(JsonField.of("jpmc_payment_batch_id"))

            val JPMC_PAYMENT_INFORMATION_ID =
                ReferenceNumberType(JsonField.of("jpmc_payment_information_id"))

            val JPMC_PAYMENT_RETURNED_DATETIME =
                ReferenceNumberType(JsonField.of("jpmc_payment_returned_datetime"))

            val LOB_CHECK_ID = ReferenceNumberType(JsonField.of("lob_check_id"))

            val OTHER = ReferenceNumberType(JsonField.of("other"))

            val PARTIAL_SWIFT_MIR = ReferenceNumberType(JsonField.of("partial_swift_mir"))

            val PNC_CLEARING_REFERENCE = ReferenceNumberType(JsonField.of("pnc_clearing_reference"))

            val PNC_INSTRUCTION_ID = ReferenceNumberType(JsonField.of("pnc_instruction_id"))

            val PNC_MULTIPAYMENT_ID = ReferenceNumberType(JsonField.of("pnc_multipayment_id"))

            val PNC_PAYMENT_TRACE_ID = ReferenceNumberType(JsonField.of("pnc_payment_trace_id"))

            val PNC_TRANSACTION_REFERENCE_NUMBER =
                ReferenceNumberType(JsonField.of("pnc_transaction_reference_number"))

            val RSPEC_VENDOR_PAYMENT_ID =
                ReferenceNumberType(JsonField.of("rspec_vendor_payment_id"))

            val RTP_INSTRUCTION_ID = ReferenceNumberType(JsonField.of("rtp_instruction_id"))

            val SIGNET_API_REFERENCE_ID =
                ReferenceNumberType(JsonField.of("signet_api_reference_id"))

            val SIGNET_CONFIRMATION_ID = ReferenceNumberType(JsonField.of("signet_confirmation_id"))

            val SIGNET_REQUEST_ID = ReferenceNumberType(JsonField.of("signet_request_id"))

            val SILVERGATE_PAYMENT_ID = ReferenceNumberType(JsonField.of("silvergate_payment_id"))

            val SVB_END_TO_END_ID = ReferenceNumberType(JsonField.of("svb_end_to_end_id"))

            val SVB_PAYMENT_ID = ReferenceNumberType(JsonField.of("svb_payment_id"))

            val SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW =
                ReferenceNumberType(JsonField.of("svb_transaction_cleared_for_sanctions_review"))

            val SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW =
                ReferenceNumberType(JsonField.of("svb_transaction_held_for_sanctions_review"))

            val SWIFT_MIR = ReferenceNumberType(JsonField.of("swift_mir"))

            val SWIFT_UETR = ReferenceNumberType(JsonField.of("swift_uetr"))

            val UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER =
                ReferenceNumberType(JsonField.of("umb_product_partner_account_number"))

            val USBANK_PAYMENT_APPLICATION_REFERENCE_ID =
                ReferenceNumberType(JsonField.of("usbank_payment_application_reference_id"))

            val USBANK_PAYMENT_ID = ReferenceNumberType(JsonField.of("usbank_payment_id"))

            val USBANK_PENDING_RTP_PAYMENT_ID =
                ReferenceNumberType(JsonField.of("usbank_pending_rtp_payment_id"))

            val USBANK_POSTED_RTP_PAYMENT_ID =
                ReferenceNumberType(JsonField.of("usbank_posted_rtp_payment_id"))

            val WELLS_FARGO_END_TO_END_ID =
                ReferenceNumberType(JsonField.of("wells_fargo_end_to_end_id"))

            val WELLS_FARGO_PAYMENT_ID = ReferenceNumberType(JsonField.of("wells_fargo_payment_id"))

            val WELLS_FARGO_TRACE_NUMBER =
                ReferenceNumberType(JsonField.of("wells_fargo_trace_number"))

            val WELLS_FARGO_UETR = ReferenceNumberType(JsonField.of("wells_fargo_uetr"))

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
                    throw ModernTreasuryInvalidDataException("Unknown ReferenceNumberType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class ReferenceableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReferenceableType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PAYMENT_ORDER = ReferenceableType(JsonField.of("payment_order"))

            val REVERSAL = ReferenceableType(JsonField.of("reversal"))

            val RETURN = ReferenceableType(JsonField.of("return"))

            fun of(value: String) = ReferenceableType(JsonField.of(value))
        }

        enum class Known {
            PAYMENT_ORDER,
            REVERSAL,
            RETURN,
        }

        enum class Value {
            PAYMENT_ORDER,
            REVERSAL,
            RETURN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                REVERSAL -> Value.REVERSAL
                RETURN -> Value.RETURN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                REVERSAL -> Known.REVERSAL
                RETURN -> Known.RETURN
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown ReferenceableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentReference && this.id == other.id && this.object_ == other.object_ && this.liveMode == other.liveMode && this.createdAt == other.createdAt && this.updatedAt == other.updatedAt && this.referenceableId == other.referenceableId && this.referenceableType == other.referenceableType && this.referenceNumber == other.referenceNumber && this.referenceNumberType == other.referenceNumberType && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, object_, liveMode, createdAt, updatedAt, referenceableId, referenceableType, referenceNumber, referenceNumberType, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "PaymentReference{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, referenceableId=$referenceableId, referenceableType=$referenceableType, referenceNumber=$referenceNumber, referenceNumberType=$referenceNumberType, additionalProperties=$additionalProperties}"
}
