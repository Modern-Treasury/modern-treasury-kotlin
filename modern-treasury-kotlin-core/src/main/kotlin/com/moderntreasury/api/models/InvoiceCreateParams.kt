// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

class InvoiceCreateParams
constructor(
    private val counterpartyId: String,
    private val dueDate: OffsetDateTime,
    private val originatingAccountId: String,
    private val contactDetails: List<ContactDetail>?,
    private val counterpartyBillingAddress: CounterpartyBillingAddress?,
    private val counterpartyShippingAddress: CounterpartyShippingAddress?,
    private val currency: Currency?,
    private val description: String?,
    private val invoicerAddress: InvoicerAddress?,
    private val notificationEmailAddresses: List<String>?,
    private val notificationsEnabled: Boolean?,
    private val paymentEffectiveDate: LocalDate?,
    private val paymentMethod: PaymentMethod?,
    private val paymentType: PaymentType?,
    private val receivingAccountId: String?,
    private val recipientEmail: String?,
    private val recipientName: String?,
    private val virtualAccountId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun counterpartyId(): String = counterpartyId

    fun dueDate(): OffsetDateTime = dueDate

    fun originatingAccountId(): String = originatingAccountId

    fun contactDetails(): List<ContactDetail>? = contactDetails

    fun counterpartyBillingAddress(): CounterpartyBillingAddress? = counterpartyBillingAddress

    fun counterpartyShippingAddress(): CounterpartyShippingAddress? = counterpartyShippingAddress

    fun currency(): Currency? = currency

    fun description(): String? = description

    fun invoicerAddress(): InvoicerAddress? = invoicerAddress

    fun notificationEmailAddresses(): List<String>? = notificationEmailAddresses

    fun notificationsEnabled(): Boolean? = notificationsEnabled

    fun paymentEffectiveDate(): LocalDate? = paymentEffectiveDate

    fun paymentMethod(): PaymentMethod? = paymentMethod

    fun paymentType(): PaymentType? = paymentType

    fun receivingAccountId(): String? = receivingAccountId

    fun recipientEmail(): String? = recipientEmail

    fun recipientName(): String? = recipientName

    fun virtualAccountId(): String? = virtualAccountId

    internal fun getBody(): InvoiceCreateBody {
        return InvoiceCreateBody(
            counterpartyId,
            dueDate,
            originatingAccountId,
            contactDetails,
            counterpartyBillingAddress,
            counterpartyShippingAddress,
            currency,
            description,
            invoicerAddress,
            notificationEmailAddresses,
            notificationsEnabled,
            paymentEffectiveDate,
            paymentMethod,
            paymentType,
            receivingAccountId,
            recipientEmail,
            recipientName,
            virtualAccountId,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = InvoiceCreateBody.Builder::class)
    @NoAutoDetect
    class InvoiceCreateBody
    internal constructor(
        private val counterpartyId: String?,
        private val dueDate: OffsetDateTime?,
        private val originatingAccountId: String?,
        private val contactDetails: List<ContactDetail>?,
        private val counterpartyBillingAddress: CounterpartyBillingAddress?,
        private val counterpartyShippingAddress: CounterpartyShippingAddress?,
        private val currency: Currency?,
        private val description: String?,
        private val invoicerAddress: InvoicerAddress?,
        private val notificationEmailAddresses: List<String>?,
        private val notificationsEnabled: Boolean?,
        private val paymentEffectiveDate: LocalDate?,
        private val paymentMethod: PaymentMethod?,
        private val paymentType: PaymentType?,
        private val receivingAccountId: String?,
        private val recipientEmail: String?,
        private val recipientName: String?,
        private val virtualAccountId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The ID of the counterparty receiving the invoice. */
        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

        /** A future date by when the invoice needs to be paid. */
        @JsonProperty("due_date") fun dueDate(): OffsetDateTime? = dueDate

        /** The ID of the internal account the invoice should be paid to. */
        @JsonProperty("originating_account_id")
        fun originatingAccountId(): String? = originatingAccountId

        /** The invoicer's contact details displayed at the top of the invoice. */
        @JsonProperty("contact_details") fun contactDetails(): List<ContactDetail>? = contactDetails

        /** The counterparty's billing address. */
        @JsonProperty("counterparty_billing_address")
        fun counterpartyBillingAddress(): CounterpartyBillingAddress? = counterpartyBillingAddress

        /** The counterparty's shipping address where physical goods should be delivered. */
        @JsonProperty("counterparty_shipping_address")
        fun counterpartyShippingAddress(): CounterpartyShippingAddress? =
            counterpartyShippingAddress

        /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
        @JsonProperty("currency") fun currency(): Currency? = currency

        /** A free-form description of the invoice. */
        @JsonProperty("description") fun description(): String? = description

        /** The invoice issuer's business address. */
        @JsonProperty("invoicer_address") fun invoicerAddress(): InvoicerAddress? = invoicerAddress

        /**
         * Emails in addition to the counterparty email to send invoice status notifications to. At
         * least one email is required if notifications are enabled and the counterparty doesn't
         * have an email.
         */
        @JsonProperty("notification_email_addresses")
        fun notificationEmailAddresses(): List<String>? = notificationEmailAddresses

        /**
         * If true, the invoice will send email notifications to the invoice recipients about
         * invoice status changes.
         */
        @JsonProperty("notifications_enabled")
        fun notificationsEnabled(): Boolean? = notificationsEnabled

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        @JsonProperty("payment_effective_date")
        fun paymentEffectiveDate(): LocalDate? = paymentEffectiveDate

        /**
         * The method by which the invoice can be paid. `ui` will show the embedded payment
         * collection flow. `automatic` will automatically initiate payment based upon the account
         * details of the receiving_account id.\nIf the invoice amount is positive, the
         * automatically initiated payment order's direction will be debit. If the invoice amount is
         * negative, the automatically initiated payment order's direction will be credit. One of
         * `manual`, `ui`, or `automatic`.
         */
        @JsonProperty("payment_method") fun paymentMethod(): PaymentMethod? = paymentMethod

        /**
         * One of `ach`, `bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`,
         * `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`, `signet`,
         * `provexchange`, `zengin`.
         */
        @JsonProperty("payment_type") fun paymentType(): PaymentType? = paymentType

        /** The receiving account ID. Can be an `external_account`. */
        @JsonProperty("receiving_account_id") fun receivingAccountId(): String? = receivingAccountId

        /**
         * The email of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        @JsonProperty("recipient_email") fun recipientEmail(): String? = recipientEmail

        /**
         * The name of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        @JsonProperty("recipient_name") fun recipientName(): String? = recipientName

        /** The ID of the virtual account the invoice should be paid to. */
        @JsonProperty("virtual_account_id") fun virtualAccountId(): String? = virtualAccountId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InvoiceCreateBody &&
                this.counterpartyId == other.counterpartyId &&
                this.dueDate == other.dueDate &&
                this.originatingAccountId == other.originatingAccountId &&
                this.contactDetails == other.contactDetails &&
                this.counterpartyBillingAddress == other.counterpartyBillingAddress &&
                this.counterpartyShippingAddress == other.counterpartyShippingAddress &&
                this.currency == other.currency &&
                this.description == other.description &&
                this.invoicerAddress == other.invoicerAddress &&
                this.notificationEmailAddresses == other.notificationEmailAddresses &&
                this.notificationsEnabled == other.notificationsEnabled &&
                this.paymentEffectiveDate == other.paymentEffectiveDate &&
                this.paymentMethod == other.paymentMethod &&
                this.paymentType == other.paymentType &&
                this.receivingAccountId == other.receivingAccountId &&
                this.recipientEmail == other.recipientEmail &&
                this.recipientName == other.recipientName &&
                this.virtualAccountId == other.virtualAccountId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        counterpartyId,
                        dueDate,
                        originatingAccountId,
                        contactDetails,
                        counterpartyBillingAddress,
                        counterpartyShippingAddress,
                        currency,
                        description,
                        invoicerAddress,
                        notificationEmailAddresses,
                        notificationsEnabled,
                        paymentEffectiveDate,
                        paymentMethod,
                        paymentType,
                        receivingAccountId,
                        recipientEmail,
                        recipientName,
                        virtualAccountId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "InvoiceCreateBody{counterpartyId=$counterpartyId, dueDate=$dueDate, originatingAccountId=$originatingAccountId, contactDetails=$contactDetails, counterpartyBillingAddress=$counterpartyBillingAddress, counterpartyShippingAddress=$counterpartyShippingAddress, currency=$currency, description=$description, invoicerAddress=$invoicerAddress, notificationEmailAddresses=$notificationEmailAddresses, notificationsEnabled=$notificationsEnabled, paymentEffectiveDate=$paymentEffectiveDate, paymentMethod=$paymentMethod, paymentType=$paymentType, receivingAccountId=$receivingAccountId, recipientEmail=$recipientEmail, recipientName=$recipientName, virtualAccountId=$virtualAccountId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var counterpartyId: String? = null
            private var dueDate: OffsetDateTime? = null
            private var originatingAccountId: String? = null
            private var contactDetails: List<ContactDetail>? = null
            private var counterpartyBillingAddress: CounterpartyBillingAddress? = null
            private var counterpartyShippingAddress: CounterpartyShippingAddress? = null
            private var currency: Currency? = null
            private var description: String? = null
            private var invoicerAddress: InvoicerAddress? = null
            private var notificationEmailAddresses: List<String>? = null
            private var notificationsEnabled: Boolean? = null
            private var paymentEffectiveDate: LocalDate? = null
            private var paymentMethod: PaymentMethod? = null
            private var paymentType: PaymentType? = null
            private var receivingAccountId: String? = null
            private var recipientEmail: String? = null
            private var recipientName: String? = null
            private var virtualAccountId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoiceCreateBody: InvoiceCreateBody) = apply {
                this.counterpartyId = invoiceCreateBody.counterpartyId
                this.dueDate = invoiceCreateBody.dueDate
                this.originatingAccountId = invoiceCreateBody.originatingAccountId
                this.contactDetails = invoiceCreateBody.contactDetails
                this.counterpartyBillingAddress = invoiceCreateBody.counterpartyBillingAddress
                this.counterpartyShippingAddress = invoiceCreateBody.counterpartyShippingAddress
                this.currency = invoiceCreateBody.currency
                this.description = invoiceCreateBody.description
                this.invoicerAddress = invoiceCreateBody.invoicerAddress
                this.notificationEmailAddresses = invoiceCreateBody.notificationEmailAddresses
                this.notificationsEnabled = invoiceCreateBody.notificationsEnabled
                this.paymentEffectiveDate = invoiceCreateBody.paymentEffectiveDate
                this.paymentMethod = invoiceCreateBody.paymentMethod
                this.paymentType = invoiceCreateBody.paymentType
                this.receivingAccountId = invoiceCreateBody.receivingAccountId
                this.recipientEmail = invoiceCreateBody.recipientEmail
                this.recipientName = invoiceCreateBody.recipientName
                this.virtualAccountId = invoiceCreateBody.virtualAccountId
                additionalProperties(invoiceCreateBody.additionalProperties)
            }

            /** The ID of the counterparty receiving the invoice. */
            @JsonProperty("counterparty_id")
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            /** A future date by when the invoice needs to be paid. */
            @JsonProperty("due_date")
            fun dueDate(dueDate: OffsetDateTime) = apply { this.dueDate = dueDate }

            /** The ID of the internal account the invoice should be paid to. */
            @JsonProperty("originating_account_id")
            fun originatingAccountId(originatingAccountId: String) = apply {
                this.originatingAccountId = originatingAccountId
            }

            /** The invoicer's contact details displayed at the top of the invoice. */
            @JsonProperty("contact_details")
            fun contactDetails(contactDetails: List<ContactDetail>) = apply {
                this.contactDetails = contactDetails
            }

            /** The counterparty's billing address. */
            @JsonProperty("counterparty_billing_address")
            fun counterpartyBillingAddress(counterpartyBillingAddress: CounterpartyBillingAddress) =
                apply {
                    this.counterpartyBillingAddress = counterpartyBillingAddress
                }

            /** The counterparty's shipping address where physical goods should be delivered. */
            @JsonProperty("counterparty_shipping_address")
            fun counterpartyShippingAddress(
                counterpartyShippingAddress: CounterpartyShippingAddress
            ) = apply { this.counterpartyShippingAddress = counterpartyShippingAddress }

            /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
            @JsonProperty("currency")
            fun currency(currency: Currency) = apply { this.currency = currency }

            /** A free-form description of the invoice. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** The invoice issuer's business address. */
            @JsonProperty("invoicer_address")
            fun invoicerAddress(invoicerAddress: InvoicerAddress) = apply {
                this.invoicerAddress = invoicerAddress
            }

            /**
             * Emails in addition to the counterparty email to send invoice status notifications to.
             * At least one email is required if notifications are enabled and the counterparty
             * doesn't have an email.
             */
            @JsonProperty("notification_email_addresses")
            fun notificationEmailAddresses(notificationEmailAddresses: List<String>) = apply {
                this.notificationEmailAddresses = notificationEmailAddresses
            }

            /**
             * If true, the invoice will send email notifications to the invoice recipients about
             * invoice status changes.
             */
            @JsonProperty("notifications_enabled")
            fun notificationsEnabled(notificationsEnabled: Boolean) = apply {
                this.notificationsEnabled = notificationsEnabled
            }

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            @JsonProperty("payment_effective_date")
            fun paymentEffectiveDate(paymentEffectiveDate: LocalDate) = apply {
                this.paymentEffectiveDate = paymentEffectiveDate
            }

            /**
             * The method by which the invoice can be paid. `ui` will show the embedded payment
             * collection flow. `automatic` will automatically initiate payment based upon the
             * account details of the receiving_account id.\nIf the invoice amount is positive, the
             * automatically initiated payment order's direction will be debit. If the invoice
             * amount is negative, the automatically initiated payment order's direction will be
             * credit. One of `manual`, `ui`, or `automatic`.
             */
            @JsonProperty("payment_method")
            fun paymentMethod(paymentMethod: PaymentMethod) = apply {
                this.paymentMethod = paymentMethod
            }

            /**
             * One of `ach`, `bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            @JsonProperty("payment_type")
            fun paymentType(paymentType: PaymentType) = apply { this.paymentType = paymentType }

            /** The receiving account ID. Can be an `external_account`. */
            @JsonProperty("receiving_account_id")
            fun receivingAccountId(receivingAccountId: String) = apply {
                this.receivingAccountId = receivingAccountId
            }

            /**
             * The email of the recipient of the invoice. Leaving this value as null will fallback
             * to using the counterparty's name.
             */
            @JsonProperty("recipient_email")
            fun recipientEmail(recipientEmail: String) = apply {
                this.recipientEmail = recipientEmail
            }

            /**
             * The name of the recipient of the invoice. Leaving this value as null will fallback to
             * using the counterparty's name.
             */
            @JsonProperty("recipient_name")
            fun recipientName(recipientName: String) = apply { this.recipientName = recipientName }

            /** The ID of the virtual account the invoice should be paid to. */
            @JsonProperty("virtual_account_id")
            fun virtualAccountId(virtualAccountId: String) = apply {
                this.virtualAccountId = virtualAccountId
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

            fun build(): InvoiceCreateBody =
                InvoiceCreateBody(
                    checkNotNull(counterpartyId) { "`counterpartyId` is required but was not set" },
                    checkNotNull(dueDate) { "`dueDate` is required but was not set" },
                    checkNotNull(originatingAccountId) {
                        "`originatingAccountId` is required but was not set"
                    },
                    contactDetails?.toUnmodifiable(),
                    counterpartyBillingAddress,
                    counterpartyShippingAddress,
                    currency,
                    description,
                    invoicerAddress,
                    notificationEmailAddresses?.toUnmodifiable(),
                    notificationsEnabled,
                    paymentEffectiveDate,
                    paymentMethod,
                    paymentType,
                    receivingAccountId,
                    recipientEmail,
                    recipientName,
                    virtualAccountId,
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

        return other is InvoiceCreateParams &&
            this.counterpartyId == other.counterpartyId &&
            this.dueDate == other.dueDate &&
            this.originatingAccountId == other.originatingAccountId &&
            this.contactDetails == other.contactDetails &&
            this.counterpartyBillingAddress == other.counterpartyBillingAddress &&
            this.counterpartyShippingAddress == other.counterpartyShippingAddress &&
            this.currency == other.currency &&
            this.description == other.description &&
            this.invoicerAddress == other.invoicerAddress &&
            this.notificationEmailAddresses == other.notificationEmailAddresses &&
            this.notificationsEnabled == other.notificationsEnabled &&
            this.paymentEffectiveDate == other.paymentEffectiveDate &&
            this.paymentMethod == other.paymentMethod &&
            this.paymentType == other.paymentType &&
            this.receivingAccountId == other.receivingAccountId &&
            this.recipientEmail == other.recipientEmail &&
            this.recipientName == other.recipientName &&
            this.virtualAccountId == other.virtualAccountId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            counterpartyId,
            dueDate,
            originatingAccountId,
            contactDetails,
            counterpartyBillingAddress,
            counterpartyShippingAddress,
            currency,
            description,
            invoicerAddress,
            notificationEmailAddresses,
            notificationsEnabled,
            paymentEffectiveDate,
            paymentMethod,
            paymentType,
            receivingAccountId,
            recipientEmail,
            recipientName,
            virtualAccountId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "InvoiceCreateParams{counterpartyId=$counterpartyId, dueDate=$dueDate, originatingAccountId=$originatingAccountId, contactDetails=$contactDetails, counterpartyBillingAddress=$counterpartyBillingAddress, counterpartyShippingAddress=$counterpartyShippingAddress, currency=$currency, description=$description, invoicerAddress=$invoicerAddress, notificationEmailAddresses=$notificationEmailAddresses, notificationsEnabled=$notificationsEnabled, paymentEffectiveDate=$paymentEffectiveDate, paymentMethod=$paymentMethod, paymentType=$paymentType, receivingAccountId=$receivingAccountId, recipientEmail=$recipientEmail, recipientName=$recipientName, virtualAccountId=$virtualAccountId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var counterpartyId: String? = null
        private var dueDate: OffsetDateTime? = null
        private var originatingAccountId: String? = null
        private var contactDetails: MutableList<ContactDetail> = mutableListOf()
        private var counterpartyBillingAddress: CounterpartyBillingAddress? = null
        private var counterpartyShippingAddress: CounterpartyShippingAddress? = null
        private var currency: Currency? = null
        private var description: String? = null
        private var invoicerAddress: InvoicerAddress? = null
        private var notificationEmailAddresses: MutableList<String> = mutableListOf()
        private var notificationsEnabled: Boolean? = null
        private var paymentEffectiveDate: LocalDate? = null
        private var paymentMethod: PaymentMethod? = null
        private var paymentType: PaymentType? = null
        private var receivingAccountId: String? = null
        private var recipientEmail: String? = null
        private var recipientName: String? = null
        private var virtualAccountId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceCreateParams: InvoiceCreateParams) = apply {
            this.counterpartyId = invoiceCreateParams.counterpartyId
            this.dueDate = invoiceCreateParams.dueDate
            this.originatingAccountId = invoiceCreateParams.originatingAccountId
            this.contactDetails(invoiceCreateParams.contactDetails ?: listOf())
            this.counterpartyBillingAddress = invoiceCreateParams.counterpartyBillingAddress
            this.counterpartyShippingAddress = invoiceCreateParams.counterpartyShippingAddress
            this.currency = invoiceCreateParams.currency
            this.description = invoiceCreateParams.description
            this.invoicerAddress = invoiceCreateParams.invoicerAddress
            this.notificationEmailAddresses(
                invoiceCreateParams.notificationEmailAddresses ?: listOf()
            )
            this.notificationsEnabled = invoiceCreateParams.notificationsEnabled
            this.paymentEffectiveDate = invoiceCreateParams.paymentEffectiveDate
            this.paymentMethod = invoiceCreateParams.paymentMethod
            this.paymentType = invoiceCreateParams.paymentType
            this.receivingAccountId = invoiceCreateParams.receivingAccountId
            this.recipientEmail = invoiceCreateParams.recipientEmail
            this.recipientName = invoiceCreateParams.recipientName
            this.virtualAccountId = invoiceCreateParams.virtualAccountId
            additionalQueryParams(invoiceCreateParams.additionalQueryParams)
            additionalHeaders(invoiceCreateParams.additionalHeaders)
            additionalBodyProperties(invoiceCreateParams.additionalBodyProperties)
        }

        /** The ID of the counterparty receiving the invoice. */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /** A future date by when the invoice needs to be paid. */
        fun dueDate(dueDate: OffsetDateTime) = apply { this.dueDate = dueDate }

        /** The ID of the internal account the invoice should be paid to. */
        fun originatingAccountId(originatingAccountId: String) = apply {
            this.originatingAccountId = originatingAccountId
        }

        /** The invoicer's contact details displayed at the top of the invoice. */
        fun contactDetails(contactDetails: List<ContactDetail>) = apply {
            this.contactDetails.clear()
            this.contactDetails.addAll(contactDetails)
        }

        /** The invoicer's contact details displayed at the top of the invoice. */
        fun addContactDetail(contactDetail: ContactDetail) = apply {
            this.contactDetails.add(contactDetail)
        }

        /** The counterparty's billing address. */
        fun counterpartyBillingAddress(counterpartyBillingAddress: CounterpartyBillingAddress) =
            apply {
                this.counterpartyBillingAddress = counterpartyBillingAddress
            }

        /** The counterparty's shipping address where physical goods should be delivered. */
        fun counterpartyShippingAddress(counterpartyShippingAddress: CounterpartyShippingAddress) =
            apply {
                this.counterpartyShippingAddress = counterpartyShippingAddress
            }

        /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
        fun currency(currency: Currency) = apply { this.currency = currency }

        /** A free-form description of the invoice. */
        fun description(description: String) = apply { this.description = description }

        /** The invoice issuer's business address. */
        fun invoicerAddress(invoicerAddress: InvoicerAddress) = apply {
            this.invoicerAddress = invoicerAddress
        }

        /**
         * Emails in addition to the counterparty email to send invoice status notifications to. At
         * least one email is required if notifications are enabled and the counterparty doesn't
         * have an email.
         */
        fun notificationEmailAddresses(notificationEmailAddresses: List<String>) = apply {
            this.notificationEmailAddresses.clear()
            this.notificationEmailAddresses.addAll(notificationEmailAddresses)
        }

        /**
         * Emails in addition to the counterparty email to send invoice status notifications to. At
         * least one email is required if notifications are enabled and the counterparty doesn't
         * have an email.
         */
        fun addNotificationEmailAddress(notificationEmailAddress: String) = apply {
            this.notificationEmailAddresses.add(notificationEmailAddress)
        }

        /**
         * If true, the invoice will send email notifications to the invoice recipients about
         * invoice status changes.
         */
        fun notificationsEnabled(notificationsEnabled: Boolean) = apply {
            this.notificationsEnabled = notificationsEnabled
        }

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        fun paymentEffectiveDate(paymentEffectiveDate: LocalDate) = apply {
            this.paymentEffectiveDate = paymentEffectiveDate
        }

        /**
         * The method by which the invoice can be paid. `ui` will show the embedded payment
         * collection flow. `automatic` will automatically initiate payment based upon the account
         * details of the receiving_account id.\nIf the invoice amount is positive, the
         * automatically initiated payment order's direction will be debit. If the invoice amount is
         * negative, the automatically initiated payment order's direction will be credit. One of
         * `manual`, `ui`, or `automatic`.
         */
        fun paymentMethod(paymentMethod: PaymentMethod) = apply {
            this.paymentMethod = paymentMethod
        }

        /**
         * One of `ach`, `bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`,
         * `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`, `signet`,
         * `provexchange`, `zengin`.
         */
        fun paymentType(paymentType: PaymentType) = apply { this.paymentType = paymentType }

        /** The receiving account ID. Can be an `external_account`. */
        fun receivingAccountId(receivingAccountId: String) = apply {
            this.receivingAccountId = receivingAccountId
        }

        /**
         * The email of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        fun recipientEmail(recipientEmail: String) = apply { this.recipientEmail = recipientEmail }

        /**
         * The name of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        fun recipientName(recipientName: String) = apply { this.recipientName = recipientName }

        /** The ID of the virtual account the invoice should be paid to. */
        fun virtualAccountId(virtualAccountId: String) = apply {
            this.virtualAccountId = virtualAccountId
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

        fun build(): InvoiceCreateParams =
            InvoiceCreateParams(
                checkNotNull(counterpartyId) { "`counterpartyId` is required but was not set" },
                checkNotNull(dueDate) { "`dueDate` is required but was not set" },
                checkNotNull(originatingAccountId) {
                    "`originatingAccountId` is required but was not set"
                },
                if (contactDetails.size == 0) null else contactDetails.toUnmodifiable(),
                counterpartyBillingAddress,
                counterpartyShippingAddress,
                currency,
                description,
                invoicerAddress,
                if (notificationEmailAddresses.size == 0) null
                else notificationEmailAddresses.toUnmodifiable(),
                notificationsEnabled,
                paymentEffectiveDate,
                paymentMethod,
                paymentType,
                receivingAccountId,
                recipientEmail,
                recipientName,
                virtualAccountId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = ContactDetail.Builder::class)
    @NoAutoDetect
    class ContactDetail
    private constructor(
        private val id: String?,
        private val object_: String?,
        private val liveMode: Boolean?,
        private val createdAt: OffsetDateTime?,
        private val updatedAt: OffsetDateTime?,
        private val discardedAt: OffsetDateTime?,
        private val contactIdentifier: String?,
        private val contactIdentifierType: ContactIdentifierType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("id") fun id(): String? = id

        @JsonProperty("object") fun object_(): String? = object_

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") fun liveMode(): Boolean? = liveMode

        @JsonProperty("created_at") fun createdAt(): OffsetDateTime? = createdAt

        @JsonProperty("updated_at") fun updatedAt(): OffsetDateTime? = updatedAt

        @JsonProperty("discarded_at") fun discardedAt(): OffsetDateTime? = discardedAt

        @JsonProperty("contact_identifier") fun contactIdentifier(): String? = contactIdentifier

        @JsonProperty("contact_identifier_type")
        fun contactIdentifierType(): ContactIdentifierType? = contactIdentifierType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ContactDetail &&
                this.id == other.id &&
                this.object_ == other.object_ &&
                this.liveMode == other.liveMode &&
                this.createdAt == other.createdAt &&
                this.updatedAt == other.updatedAt &&
                this.discardedAt == other.discardedAt &&
                this.contactIdentifier == other.contactIdentifier &&
                this.contactIdentifierType == other.contactIdentifierType &&
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
                        discardedAt,
                        contactIdentifier,
                        contactIdentifierType,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ContactDetail{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: String? = null
            private var object_: String? = null
            private var liveMode: Boolean? = null
            private var createdAt: OffsetDateTime? = null
            private var updatedAt: OffsetDateTime? = null
            private var discardedAt: OffsetDateTime? = null
            private var contactIdentifier: String? = null
            private var contactIdentifierType: ContactIdentifierType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(contactDetail: ContactDetail) = apply {
                this.id = contactDetail.id
                this.object_ = contactDetail.object_
                this.liveMode = contactDetail.liveMode
                this.createdAt = contactDetail.createdAt
                this.updatedAt = contactDetail.updatedAt
                this.discardedAt = contactDetail.discardedAt
                this.contactIdentifier = contactDetail.contactIdentifier
                this.contactIdentifierType = contactDetail.contactIdentifierType
                additionalProperties(contactDetail.additionalProperties)
            }

            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

            @JsonProperty("object") fun object_(object_: String) = apply { this.object_ = object_ }

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            @JsonProperty("live_mode")
            fun liveMode(liveMode: Boolean) = apply { this.liveMode = liveMode }

            @JsonProperty("created_at")
            fun createdAt(createdAt: OffsetDateTime) = apply { this.createdAt = createdAt }

            @JsonProperty("updated_at")
            fun updatedAt(updatedAt: OffsetDateTime) = apply { this.updatedAt = updatedAt }

            @JsonProperty("discarded_at")
            fun discardedAt(discardedAt: OffsetDateTime) = apply { this.discardedAt = discardedAt }

            @JsonProperty("contact_identifier")
            fun contactIdentifier(contactIdentifier: String) = apply {
                this.contactIdentifier = contactIdentifier
            }

            @JsonProperty("contact_identifier_type")
            fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) = apply {
                this.contactIdentifierType = contactIdentifierType
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

            fun build(): ContactDetail =
                ContactDetail(
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(object_) { "`object_` is required but was not set" },
                    checkNotNull(liveMode) { "`liveMode` is required but was not set" },
                    checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                    checkNotNull(updatedAt) { "`updatedAt` is required but was not set" },
                    discardedAt,
                    checkNotNull(contactIdentifier) {
                        "`contactIdentifier` is required but was not set"
                    },
                    checkNotNull(contactIdentifierType) {
                        "`contactIdentifierType` is required but was not set"
                    },
                    additionalProperties.toUnmodifiable(),
                )
        }

        class ContactIdentifierType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ContactIdentifierType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val EMAIL = ContactIdentifierType(JsonField.of("email"))

                val PHONE_NUMBER = ContactIdentifierType(JsonField.of("phone_number"))

                val WEBSITE = ContactIdentifierType(JsonField.of("website"))

                fun of(value: String) = ContactIdentifierType(JsonField.of(value))
            }

            enum class Known {
                EMAIL,
                PHONE_NUMBER,
                WEBSITE,
            }

            enum class Value {
                EMAIL,
                PHONE_NUMBER,
                WEBSITE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    EMAIL -> Value.EMAIL
                    PHONE_NUMBER -> Value.PHONE_NUMBER
                    WEBSITE -> Value.WEBSITE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    EMAIL -> Known.EMAIL
                    PHONE_NUMBER -> Known.PHONE_NUMBER
                    WEBSITE -> Known.WEBSITE
                    else ->
                        throw ModernTreasuryInvalidDataException(
                            "Unknown ContactIdentifierType: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    /** The counterparty's billing address. */
    @JsonDeserialize(builder = CounterpartyBillingAddress.Builder::class)
    @NoAutoDetect
    class CounterpartyBillingAddress
    private constructor(
        private val line1: String?,
        private val line2: String?,
        private val locality: String?,
        private val region: String?,
        private val postalCode: String?,
        private val country: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("line1") fun line1(): String? = line1

        @JsonProperty("line2") fun line2(): String? = line2

        /** Locality or City. */
        @JsonProperty("locality") fun locality(): String? = locality

        /** Region or State. */
        @JsonProperty("region") fun region(): String? = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") fun postalCode(): String? = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") fun country(): String? = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CounterpartyBillingAddress &&
                this.line1 == other.line1 &&
                this.line2 == other.line2 &&
                this.locality == other.locality &&
                this.region == other.region &&
                this.postalCode == other.postalCode &&
                this.country == other.country &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        line1,
                        line2,
                        locality,
                        region,
                        postalCode,
                        country,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CounterpartyBillingAddress{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: String? = null
            private var line2: String? = null
            private var locality: String? = null
            private var region: String? = null
            private var postalCode: String? = null
            private var country: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(counterpartyBillingAddress: CounterpartyBillingAddress) = apply {
                this.line1 = counterpartyBillingAddress.line1
                this.line2 = counterpartyBillingAddress.line2
                this.locality = counterpartyBillingAddress.locality
                this.region = counterpartyBillingAddress.region
                this.postalCode = counterpartyBillingAddress.postalCode
                this.country = counterpartyBillingAddress.country
                additionalProperties(counterpartyBillingAddress.additionalProperties)
            }

            @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

            @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

            /** Locality or City. */
            @JsonProperty("locality")
            fun locality(locality: String) = apply { this.locality = locality }

            /** Region or State. */
            @JsonProperty("region") fun region(region: String) = apply { this.region = region }

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country") fun country(country: String) = apply { this.country = country }

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

            fun build(): CounterpartyBillingAddress =
                CounterpartyBillingAddress(
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    line2,
                    checkNotNull(locality) { "`locality` is required but was not set" },
                    checkNotNull(region) { "`region` is required but was not set" },
                    checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                    checkNotNull(country) { "`country` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /** The counterparty's shipping address where physical goods should be delivered. */
    @JsonDeserialize(builder = CounterpartyShippingAddress.Builder::class)
    @NoAutoDetect
    class CounterpartyShippingAddress
    private constructor(
        private val line1: String?,
        private val line2: String?,
        private val locality: String?,
        private val region: String?,
        private val postalCode: String?,
        private val country: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("line1") fun line1(): String? = line1

        @JsonProperty("line2") fun line2(): String? = line2

        /** Locality or City. */
        @JsonProperty("locality") fun locality(): String? = locality

        /** Region or State. */
        @JsonProperty("region") fun region(): String? = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") fun postalCode(): String? = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") fun country(): String? = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CounterpartyShippingAddress &&
                this.line1 == other.line1 &&
                this.line2 == other.line2 &&
                this.locality == other.locality &&
                this.region == other.region &&
                this.postalCode == other.postalCode &&
                this.country == other.country &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        line1,
                        line2,
                        locality,
                        region,
                        postalCode,
                        country,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CounterpartyShippingAddress{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: String? = null
            private var line2: String? = null
            private var locality: String? = null
            private var region: String? = null
            private var postalCode: String? = null
            private var country: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(counterpartyShippingAddress: CounterpartyShippingAddress) = apply {
                this.line1 = counterpartyShippingAddress.line1
                this.line2 = counterpartyShippingAddress.line2
                this.locality = counterpartyShippingAddress.locality
                this.region = counterpartyShippingAddress.region
                this.postalCode = counterpartyShippingAddress.postalCode
                this.country = counterpartyShippingAddress.country
                additionalProperties(counterpartyShippingAddress.additionalProperties)
            }

            @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

            @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

            /** Locality or City. */
            @JsonProperty("locality")
            fun locality(locality: String) = apply { this.locality = locality }

            /** Region or State. */
            @JsonProperty("region") fun region(region: String) = apply { this.region = region }

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country") fun country(country: String) = apply { this.country = country }

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

            fun build(): CounterpartyShippingAddress =
                CounterpartyShippingAddress(
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    line2,
                    checkNotNull(locality) { "`locality` is required but was not set" },
                    checkNotNull(region) { "`region` is required but was not set" },
                    checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                    checkNotNull(country) { "`country` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /** The invoice issuer's business address. */
    @JsonDeserialize(builder = InvoicerAddress.Builder::class)
    @NoAutoDetect
    class InvoicerAddress
    private constructor(
        private val line1: String?,
        private val line2: String?,
        private val locality: String?,
        private val region: String?,
        private val postalCode: String?,
        private val country: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("line1") fun line1(): String? = line1

        @JsonProperty("line2") fun line2(): String? = line2

        /** Locality or City. */
        @JsonProperty("locality") fun locality(): String? = locality

        /** Region or State. */
        @JsonProperty("region") fun region(): String? = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") fun postalCode(): String? = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") fun country(): String? = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InvoicerAddress &&
                this.line1 == other.line1 &&
                this.line2 == other.line2 &&
                this.locality == other.locality &&
                this.region == other.region &&
                this.postalCode == other.postalCode &&
                this.country == other.country &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        line1,
                        line2,
                        locality,
                        region,
                        postalCode,
                        country,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "InvoicerAddress{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: String? = null
            private var line2: String? = null
            private var locality: String? = null
            private var region: String? = null
            private var postalCode: String? = null
            private var country: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoicerAddress: InvoicerAddress) = apply {
                this.line1 = invoicerAddress.line1
                this.line2 = invoicerAddress.line2
                this.locality = invoicerAddress.locality
                this.region = invoicerAddress.region
                this.postalCode = invoicerAddress.postalCode
                this.country = invoicerAddress.country
                additionalProperties(invoicerAddress.additionalProperties)
            }

            @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

            @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

            /** Locality or City. */
            @JsonProperty("locality")
            fun locality(locality: String) = apply { this.locality = locality }

            /** Region or State. */
            @JsonProperty("region") fun region(region: String) = apply { this.region = region }

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country") fun country(country: String) = apply { this.country = country }

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

            fun build(): InvoicerAddress =
                InvoicerAddress(
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    line2,
                    checkNotNull(locality) { "`locality` is required but was not set" },
                    checkNotNull(region) { "`region` is required but was not set" },
                    checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                    checkNotNull(country) { "`country` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class PaymentMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentMethod && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val UI = PaymentMethod(JsonField.of("ui"))

            val MANUAL = PaymentMethod(JsonField.of("manual"))

            val AUTOMATIC = PaymentMethod(JsonField.of("automatic"))

            fun of(value: String) = PaymentMethod(JsonField.of(value))
        }

        enum class Known {
            UI,
            MANUAL,
            AUTOMATIC,
        }

        enum class Value {
            UI,
            MANUAL,
            AUTOMATIC,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                UI -> Value.UI
                MANUAL -> Value.MANUAL
                AUTOMATIC -> Value.AUTOMATIC
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                UI -> Known.UI
                MANUAL -> Known.MANUAL
                AUTOMATIC -> Known.AUTOMATIC
                else -> throw ModernTreasuryInvalidDataException("Unknown PaymentMethod: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class PaymentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACH = PaymentType(JsonField.of("ach"))

            val AU_BECS = PaymentType(JsonField.of("au_becs"))

            val BACS = PaymentType(JsonField.of("bacs"))

            val BOOK = PaymentType(JsonField.of("book"))

            val CARD = PaymentType(JsonField.of("card"))

            val CHATS = PaymentType(JsonField.of("chats"))

            val CHECK = PaymentType(JsonField.of("check"))

            val CROSS_BORDER = PaymentType(JsonField.of("cross_border"))

            val DK_NETS = PaymentType(JsonField.of("dk_nets"))

            val EFT = PaymentType(JsonField.of("eft"))

            val HU_ICS = PaymentType(JsonField.of("hu_ics"))

            val INTERAC = PaymentType(JsonField.of("interac"))

            val MASAV = PaymentType(JsonField.of("masav"))

            val NEFT = PaymentType(JsonField.of("neft"))

            val NICS = PaymentType(JsonField.of("nics"))

            val NZ_BECS = PaymentType(JsonField.of("nz_becs"))

            val PROVXCHANGE = PaymentType(JsonField.of("provxchange"))

            val RO_SENT = PaymentType(JsonField.of("ro_sent"))

            val RTP = PaymentType(JsonField.of("rtp"))

            val SG_GIRO = PaymentType(JsonField.of("sg_giro"))

            val SE_BANKGIROT = PaymentType(JsonField.of("se_bankgirot"))

            val SEN = PaymentType(JsonField.of("sen"))

            val SEPA = PaymentType(JsonField.of("sepa"))

            val SIC = PaymentType(JsonField.of("sic"))

            val SIGNET = PaymentType(JsonField.of("signet"))

            val WIRE = PaymentType(JsonField.of("wire"))

            val ZENGIN = PaymentType(JsonField.of("zengin"))

            fun of(value: String) = PaymentType(JsonField.of(value))
        }

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
            NEFT,
            NICS,
            NZ_BECS,
            PROVXCHANGE,
            RO_SENT,
            RTP,
            SG_GIRO,
            SE_BANKGIROT,
            SEN,
            SEPA,
            SIC,
            SIGNET,
            WIRE,
            ZENGIN,
        }

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
            NEFT,
            NICS,
            NZ_BECS,
            PROVXCHANGE,
            RO_SENT,
            RTP,
            SG_GIRO,
            SE_BANKGIROT,
            SEN,
            SEPA,
            SIC,
            SIGNET,
            WIRE,
            ZENGIN,
            _UNKNOWN,
        }

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
                NEFT -> Value.NEFT
                NICS -> Value.NICS
                NZ_BECS -> Value.NZ_BECS
                PROVXCHANGE -> Value.PROVXCHANGE
                RO_SENT -> Value.RO_SENT
                RTP -> Value.RTP
                SG_GIRO -> Value.SG_GIRO
                SE_BANKGIROT -> Value.SE_BANKGIROT
                SEN -> Value.SEN
                SEPA -> Value.SEPA
                SIC -> Value.SIC
                SIGNET -> Value.SIGNET
                WIRE -> Value.WIRE
                ZENGIN -> Value.ZENGIN
                else -> Value._UNKNOWN
            }

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
                NEFT -> Known.NEFT
                NICS -> Known.NICS
                NZ_BECS -> Known.NZ_BECS
                PROVXCHANGE -> Known.PROVXCHANGE
                RO_SENT -> Known.RO_SENT
                RTP -> Known.RTP
                SG_GIRO -> Known.SG_GIRO
                SE_BANKGIROT -> Known.SE_BANKGIROT
                SEN -> Known.SEN
                SEPA -> Known.SEPA
                SIC -> Known.SIC
                SIGNET -> Known.SIGNET
                WIRE -> Known.WIRE
                ZENGIN -> Known.ZENGIN
                else -> throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
