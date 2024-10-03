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
    private val autoAdvance: Boolean?,
    private val contactDetails: List<ContactDetail>?,
    private val counterpartyBillingAddress: CounterpartyBillingAddress?,
    private val counterpartyShippingAddress: CounterpartyShippingAddress?,
    private val currency: Currency?,
    private val description: String?,
    private val fallbackPaymentMethod: String?,
    private val ingestLedgerEntries: Boolean?,
    private val invoiceLineItems: List<InvoiceLineItemCreateRequest>?,
    private val invoicerAddress: InvoicerAddress?,
    private val ledgerAccountSettlementId: String?,
    private val metadata: Metadata?,
    private val notificationEmailAddresses: List<String>?,
    private val notificationsEnabled: Boolean?,
    private val paymentEffectiveDate: LocalDate?,
    private val paymentMethod: PaymentMethod?,
    private val paymentType: PaymentOrderType?,
    private val receivingAccountId: String?,
    private val recipientEmail: String?,
    private val recipientName: String?,
    private val remindAfterOverdueDays: List<Long>?,
    private val virtualAccountId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun counterpartyId(): String = counterpartyId

    fun dueDate(): OffsetDateTime = dueDate

    fun originatingAccountId(): String = originatingAccountId

    fun autoAdvance(): Boolean? = autoAdvance

    fun contactDetails(): List<ContactDetail>? = contactDetails

    fun counterpartyBillingAddress(): CounterpartyBillingAddress? = counterpartyBillingAddress

    fun counterpartyShippingAddress(): CounterpartyShippingAddress? = counterpartyShippingAddress

    fun currency(): Currency? = currency

    fun description(): String? = description

    fun fallbackPaymentMethod(): String? = fallbackPaymentMethod

    fun ingestLedgerEntries(): Boolean? = ingestLedgerEntries

    fun invoiceLineItems(): List<InvoiceLineItemCreateRequest>? = invoiceLineItems

    fun invoicerAddress(): InvoicerAddress? = invoicerAddress

    fun ledgerAccountSettlementId(): String? = ledgerAccountSettlementId

    fun metadata(): Metadata? = metadata

    fun notificationEmailAddresses(): List<String>? = notificationEmailAddresses

    fun notificationsEnabled(): Boolean? = notificationsEnabled

    fun paymentEffectiveDate(): LocalDate? = paymentEffectiveDate

    fun paymentMethod(): PaymentMethod? = paymentMethod

    fun paymentType(): PaymentOrderType? = paymentType

    fun receivingAccountId(): String? = receivingAccountId

    fun recipientEmail(): String? = recipientEmail

    fun recipientName(): String? = recipientName

    fun remindAfterOverdueDays(): List<Long>? = remindAfterOverdueDays

    fun virtualAccountId(): String? = virtualAccountId

    internal fun getBody(): InvoiceCreateBody {
        return InvoiceCreateBody(
            counterpartyId,
            dueDate,
            originatingAccountId,
            autoAdvance,
            contactDetails,
            counterpartyBillingAddress,
            counterpartyShippingAddress,
            currency,
            description,
            fallbackPaymentMethod,
            ingestLedgerEntries,
            invoiceLineItems,
            invoicerAddress,
            ledgerAccountSettlementId,
            metadata,
            notificationEmailAddresses,
            notificationsEnabled,
            paymentEffectiveDate,
            paymentMethod,
            paymentType,
            receivingAccountId,
            recipientEmail,
            recipientName,
            remindAfterOverdueDays,
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
        private val autoAdvance: Boolean?,
        private val contactDetails: List<ContactDetail>?,
        private val counterpartyBillingAddress: CounterpartyBillingAddress?,
        private val counterpartyShippingAddress: CounterpartyShippingAddress?,
        private val currency: Currency?,
        private val description: String?,
        private val fallbackPaymentMethod: String?,
        private val ingestLedgerEntries: Boolean?,
        private val invoiceLineItems: List<InvoiceLineItemCreateRequest>?,
        private val invoicerAddress: InvoicerAddress?,
        private val ledgerAccountSettlementId: String?,
        private val metadata: Metadata?,
        private val notificationEmailAddresses: List<String>?,
        private val notificationsEnabled: Boolean?,
        private val paymentEffectiveDate: LocalDate?,
        private val paymentMethod: PaymentMethod?,
        private val paymentType: PaymentOrderType?,
        private val receivingAccountId: String?,
        private val recipientEmail: String?,
        private val recipientName: String?,
        private val remindAfterOverdueDays: List<Long>?,
        private val virtualAccountId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The ID of the counterparty receiving the invoice. */
        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

        /** A future date by when the invoice needs to be paid. */
        @JsonProperty("due_date") fun dueDate(): OffsetDateTime? = dueDate

        /** The ID of the internal account the invoice should be paid to. */
        @JsonProperty("originating_account_id")
        fun originatingAccountId(): String? = originatingAccountId

        /**
         * When true, the invoice will progress to unpaid automatically and cannot be edited after
         * entering that state. If the invoice fails to progress to unpaid, the errors will be
         * returned and the invoice will not be created.
         */
        @JsonProperty("auto_advance") fun autoAdvance(): Boolean? = autoAdvance

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

        /**
         * When payment_method is automatic, the fallback payment method to use when an automatic
         * payment fails. One of `manual` or `ui`.
         */
        @JsonProperty("fallback_payment_method")
        fun fallbackPaymentMethod(): String? = fallbackPaymentMethod

        /**
         * Whether to ingest the ledger_entries to populate the invoice line items. If this is
         * false, then a line item must be provided. If this is true, line_items must be empty.
         * Ignored if ledger_account_settlement_id is empty.
         */
        @JsonProperty("ingest_ledger_entries")
        fun ingestLedgerEntries(): Boolean? = ingestLedgerEntries

        /**
         * An array of invoice line items. The API supports a maximum of 50 invoice line items per
         * invoice. If a greater number of invoice line items is required, please contact support.
         */
        @JsonProperty("invoice_line_items")
        fun invoiceLineItems(): List<InvoiceLineItemCreateRequest>? = invoiceLineItems

        /** The invoice issuer's business address. */
        @JsonProperty("invoicer_address") fun invoicerAddress(): InvoicerAddress? = invoicerAddress

        /** The ID of the virtual account the invoice should be paid to. */
        @JsonProperty("ledger_account_settlement_id")
        fun ledgerAccountSettlementId(): String? = ledgerAccountSettlementId

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

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
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         */
        @JsonProperty("payment_type") fun paymentType(): PaymentOrderType? = paymentType

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

        /**
         * Number of days after due date when overdue reminder emails will be sent out to invoice
         * recipients.
         */
        @JsonProperty("remind_after_overdue_days")
        fun remindAfterOverdueDays(): List<Long>? = remindAfterOverdueDays

        /** The ID of the virtual account the invoice should be paid to. */
        @JsonProperty("virtual_account_id") fun virtualAccountId(): String? = virtualAccountId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var counterpartyId: String? = null
            private var dueDate: OffsetDateTime? = null
            private var originatingAccountId: String? = null
            private var autoAdvance: Boolean? = null
            private var contactDetails: List<ContactDetail>? = null
            private var counterpartyBillingAddress: CounterpartyBillingAddress? = null
            private var counterpartyShippingAddress: CounterpartyShippingAddress? = null
            private var currency: Currency? = null
            private var description: String? = null
            private var fallbackPaymentMethod: String? = null
            private var ingestLedgerEntries: Boolean? = null
            private var invoiceLineItems: List<InvoiceLineItemCreateRequest>? = null
            private var invoicerAddress: InvoicerAddress? = null
            private var ledgerAccountSettlementId: String? = null
            private var metadata: Metadata? = null
            private var notificationEmailAddresses: List<String>? = null
            private var notificationsEnabled: Boolean? = null
            private var paymentEffectiveDate: LocalDate? = null
            private var paymentMethod: PaymentMethod? = null
            private var paymentType: PaymentOrderType? = null
            private var receivingAccountId: String? = null
            private var recipientEmail: String? = null
            private var recipientName: String? = null
            private var remindAfterOverdueDays: List<Long>? = null
            private var virtualAccountId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoiceCreateBody: InvoiceCreateBody) = apply {
                this.counterpartyId = invoiceCreateBody.counterpartyId
                this.dueDate = invoiceCreateBody.dueDate
                this.originatingAccountId = invoiceCreateBody.originatingAccountId
                this.autoAdvance = invoiceCreateBody.autoAdvance
                this.contactDetails = invoiceCreateBody.contactDetails
                this.counterpartyBillingAddress = invoiceCreateBody.counterpartyBillingAddress
                this.counterpartyShippingAddress = invoiceCreateBody.counterpartyShippingAddress
                this.currency = invoiceCreateBody.currency
                this.description = invoiceCreateBody.description
                this.fallbackPaymentMethod = invoiceCreateBody.fallbackPaymentMethod
                this.ingestLedgerEntries = invoiceCreateBody.ingestLedgerEntries
                this.invoiceLineItems = invoiceCreateBody.invoiceLineItems
                this.invoicerAddress = invoiceCreateBody.invoicerAddress
                this.ledgerAccountSettlementId = invoiceCreateBody.ledgerAccountSettlementId
                this.metadata = invoiceCreateBody.metadata
                this.notificationEmailAddresses = invoiceCreateBody.notificationEmailAddresses
                this.notificationsEnabled = invoiceCreateBody.notificationsEnabled
                this.paymentEffectiveDate = invoiceCreateBody.paymentEffectiveDate
                this.paymentMethod = invoiceCreateBody.paymentMethod
                this.paymentType = invoiceCreateBody.paymentType
                this.receivingAccountId = invoiceCreateBody.receivingAccountId
                this.recipientEmail = invoiceCreateBody.recipientEmail
                this.recipientName = invoiceCreateBody.recipientName
                this.remindAfterOverdueDays = invoiceCreateBody.remindAfterOverdueDays
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

            /**
             * When true, the invoice will progress to unpaid automatically and cannot be edited
             * after entering that state. If the invoice fails to progress to unpaid, the errors
             * will be returned and the invoice will not be created.
             */
            @JsonProperty("auto_advance")
            fun autoAdvance(autoAdvance: Boolean) = apply { this.autoAdvance = autoAdvance }

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

            /**
             * When payment_method is automatic, the fallback payment method to use when an
             * automatic payment fails. One of `manual` or `ui`.
             */
            @JsonProperty("fallback_payment_method")
            fun fallbackPaymentMethod(fallbackPaymentMethod: String) = apply {
                this.fallbackPaymentMethod = fallbackPaymentMethod
            }

            /**
             * Whether to ingest the ledger_entries to populate the invoice line items. If this is
             * false, then a line item must be provided. If this is true, line_items must be empty.
             * Ignored if ledger_account_settlement_id is empty.
             */
            @JsonProperty("ingest_ledger_entries")
            fun ingestLedgerEntries(ingestLedgerEntries: Boolean) = apply {
                this.ingestLedgerEntries = ingestLedgerEntries
            }

            /**
             * An array of invoice line items. The API supports a maximum of 50 invoice line items
             * per invoice. If a greater number of invoice line items is required, please contact
             * support.
             */
            @JsonProperty("invoice_line_items")
            fun invoiceLineItems(invoiceLineItems: List<InvoiceLineItemCreateRequest>) = apply {
                this.invoiceLineItems = invoiceLineItems
            }

            /** The invoice issuer's business address. */
            @JsonProperty("invoicer_address")
            fun invoicerAddress(invoicerAddress: InvoicerAddress) = apply {
                this.invoicerAddress = invoicerAddress
            }

            /** The ID of the virtual account the invoice should be paid to. */
            @JsonProperty("ledger_account_settlement_id")
            fun ledgerAccountSettlementId(ledgerAccountSettlementId: String) = apply {
                this.ledgerAccountSettlementId = ledgerAccountSettlementId
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            @JsonProperty("payment_type")
            fun paymentType(paymentType: PaymentOrderType) = apply {
                this.paymentType = paymentType
            }

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

            /**
             * Number of days after due date when overdue reminder emails will be sent out to
             * invoice recipients.
             */
            @JsonProperty("remind_after_overdue_days")
            fun remindAfterOverdueDays(remindAfterOverdueDays: List<Long>) = apply {
                this.remindAfterOverdueDays = remindAfterOverdueDays
            }

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
                    autoAdvance,
                    contactDetails?.toUnmodifiable(),
                    counterpartyBillingAddress,
                    counterpartyShippingAddress,
                    currency,
                    description,
                    fallbackPaymentMethod,
                    ingestLedgerEntries,
                    invoiceLineItems?.toUnmodifiable(),
                    invoicerAddress,
                    ledgerAccountSettlementId,
                    metadata,
                    notificationEmailAddresses?.toUnmodifiable(),
                    notificationsEnabled,
                    paymentEffectiveDate,
                    paymentMethod,
                    paymentType,
                    receivingAccountId,
                    recipientEmail,
                    recipientName,
                    remindAfterOverdueDays?.toUnmodifiable(),
                    virtualAccountId,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceCreateBody && this.counterpartyId == other.counterpartyId && this.dueDate == other.dueDate && this.originatingAccountId == other.originatingAccountId && this.autoAdvance == other.autoAdvance && this.contactDetails == other.contactDetails && this.counterpartyBillingAddress == other.counterpartyBillingAddress && this.counterpartyShippingAddress == other.counterpartyShippingAddress && this.currency == other.currency && this.description == other.description && this.fallbackPaymentMethod == other.fallbackPaymentMethod && this.ingestLedgerEntries == other.ingestLedgerEntries && this.invoiceLineItems == other.invoiceLineItems && this.invoicerAddress == other.invoicerAddress && this.ledgerAccountSettlementId == other.ledgerAccountSettlementId && this.metadata == other.metadata && this.notificationEmailAddresses == other.notificationEmailAddresses && this.notificationsEnabled == other.notificationsEnabled && this.paymentEffectiveDate == other.paymentEffectiveDate && this.paymentMethod == other.paymentMethod && this.paymentType == other.paymentType && this.receivingAccountId == other.receivingAccountId && this.recipientEmail == other.recipientEmail && this.recipientName == other.recipientName && this.remindAfterOverdueDays == other.remindAfterOverdueDays && this.virtualAccountId == other.virtualAccountId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(counterpartyId, dueDate, originatingAccountId, autoAdvance, contactDetails, counterpartyBillingAddress, counterpartyShippingAddress, currency, description, fallbackPaymentMethod, ingestLedgerEntries, invoiceLineItems, invoicerAddress, ledgerAccountSettlementId, metadata, notificationEmailAddresses, notificationsEnabled, paymentEffectiveDate, paymentMethod, paymentType, receivingAccountId, recipientEmail, recipientName, remindAfterOverdueDays, virtualAccountId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "InvoiceCreateBody{counterpartyId=$counterpartyId, dueDate=$dueDate, originatingAccountId=$originatingAccountId, autoAdvance=$autoAdvance, contactDetails=$contactDetails, counterpartyBillingAddress=$counterpartyBillingAddress, counterpartyShippingAddress=$counterpartyShippingAddress, currency=$currency, description=$description, fallbackPaymentMethod=$fallbackPaymentMethod, ingestLedgerEntries=$ingestLedgerEntries, invoiceLineItems=$invoiceLineItems, invoicerAddress=$invoicerAddress, ledgerAccountSettlementId=$ledgerAccountSettlementId, metadata=$metadata, notificationEmailAddresses=$notificationEmailAddresses, notificationsEnabled=$notificationsEnabled, paymentEffectiveDate=$paymentEffectiveDate, paymentMethod=$paymentMethod, paymentType=$paymentType, receivingAccountId=$receivingAccountId, recipientEmail=$recipientEmail, recipientName=$recipientName, remindAfterOverdueDays=$remindAfterOverdueDays, virtualAccountId=$virtualAccountId, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceCreateParams && this.counterpartyId == other.counterpartyId && this.dueDate == other.dueDate && this.originatingAccountId == other.originatingAccountId && this.autoAdvance == other.autoAdvance && this.contactDetails == other.contactDetails && this.counterpartyBillingAddress == other.counterpartyBillingAddress && this.counterpartyShippingAddress == other.counterpartyShippingAddress && this.currency == other.currency && this.description == other.description && this.fallbackPaymentMethod == other.fallbackPaymentMethod && this.ingestLedgerEntries == other.ingestLedgerEntries && this.invoiceLineItems == other.invoiceLineItems && this.invoicerAddress == other.invoicerAddress && this.ledgerAccountSettlementId == other.ledgerAccountSettlementId && this.metadata == other.metadata && this.notificationEmailAddresses == other.notificationEmailAddresses && this.notificationsEnabled == other.notificationsEnabled && this.paymentEffectiveDate == other.paymentEffectiveDate && this.paymentMethod == other.paymentMethod && this.paymentType == other.paymentType && this.receivingAccountId == other.receivingAccountId && this.recipientEmail == other.recipientEmail && this.recipientName == other.recipientName && this.remindAfterOverdueDays == other.remindAfterOverdueDays && this.virtualAccountId == other.virtualAccountId && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(counterpartyId, dueDate, originatingAccountId, autoAdvance, contactDetails, counterpartyBillingAddress, counterpartyShippingAddress, currency, description, fallbackPaymentMethod, ingestLedgerEntries, invoiceLineItems, invoicerAddress, ledgerAccountSettlementId, metadata, notificationEmailAddresses, notificationsEnabled, paymentEffectiveDate, paymentMethod, paymentType, receivingAccountId, recipientEmail, recipientName, remindAfterOverdueDays, virtualAccountId, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "InvoiceCreateParams{counterpartyId=$counterpartyId, dueDate=$dueDate, originatingAccountId=$originatingAccountId, autoAdvance=$autoAdvance, contactDetails=$contactDetails, counterpartyBillingAddress=$counterpartyBillingAddress, counterpartyShippingAddress=$counterpartyShippingAddress, currency=$currency, description=$description, fallbackPaymentMethod=$fallbackPaymentMethod, ingestLedgerEntries=$ingestLedgerEntries, invoiceLineItems=$invoiceLineItems, invoicerAddress=$invoicerAddress, ledgerAccountSettlementId=$ledgerAccountSettlementId, metadata=$metadata, notificationEmailAddresses=$notificationEmailAddresses, notificationsEnabled=$notificationsEnabled, paymentEffectiveDate=$paymentEffectiveDate, paymentMethod=$paymentMethod, paymentType=$paymentType, receivingAccountId=$receivingAccountId, recipientEmail=$recipientEmail, recipientName=$recipientName, remindAfterOverdueDays=$remindAfterOverdueDays, virtualAccountId=$virtualAccountId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var counterpartyId: String? = null
        private var dueDate: OffsetDateTime? = null
        private var originatingAccountId: String? = null
        private var autoAdvance: Boolean? = null
        private var contactDetails: MutableList<ContactDetail> = mutableListOf()
        private var counterpartyBillingAddress: CounterpartyBillingAddress? = null
        private var counterpartyShippingAddress: CounterpartyShippingAddress? = null
        private var currency: Currency? = null
        private var description: String? = null
        private var fallbackPaymentMethod: String? = null
        private var ingestLedgerEntries: Boolean? = null
        private var invoiceLineItems: MutableList<InvoiceLineItemCreateRequest> = mutableListOf()
        private var invoicerAddress: InvoicerAddress? = null
        private var ledgerAccountSettlementId: String? = null
        private var metadata: Metadata? = null
        private var notificationEmailAddresses: MutableList<String> = mutableListOf()
        private var notificationsEnabled: Boolean? = null
        private var paymentEffectiveDate: LocalDate? = null
        private var paymentMethod: PaymentMethod? = null
        private var paymentType: PaymentOrderType? = null
        private var receivingAccountId: String? = null
        private var recipientEmail: String? = null
        private var recipientName: String? = null
        private var remindAfterOverdueDays: MutableList<Long> = mutableListOf()
        private var virtualAccountId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceCreateParams: InvoiceCreateParams) = apply {
            this.counterpartyId = invoiceCreateParams.counterpartyId
            this.dueDate = invoiceCreateParams.dueDate
            this.originatingAccountId = invoiceCreateParams.originatingAccountId
            this.autoAdvance = invoiceCreateParams.autoAdvance
            this.contactDetails(invoiceCreateParams.contactDetails ?: listOf())
            this.counterpartyBillingAddress = invoiceCreateParams.counterpartyBillingAddress
            this.counterpartyShippingAddress = invoiceCreateParams.counterpartyShippingAddress
            this.currency = invoiceCreateParams.currency
            this.description = invoiceCreateParams.description
            this.fallbackPaymentMethod = invoiceCreateParams.fallbackPaymentMethod
            this.ingestLedgerEntries = invoiceCreateParams.ingestLedgerEntries
            this.invoiceLineItems(invoiceCreateParams.invoiceLineItems ?: listOf())
            this.invoicerAddress = invoiceCreateParams.invoicerAddress
            this.ledgerAccountSettlementId = invoiceCreateParams.ledgerAccountSettlementId
            this.metadata = invoiceCreateParams.metadata
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
            this.remindAfterOverdueDays(invoiceCreateParams.remindAfterOverdueDays ?: listOf())
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

        /**
         * When true, the invoice will progress to unpaid automatically and cannot be edited after
         * entering that state. If the invoice fails to progress to unpaid, the errors will be
         * returned and the invoice will not be created.
         */
        fun autoAdvance(autoAdvance: Boolean) = apply { this.autoAdvance = autoAdvance }

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

        /**
         * When payment_method is automatic, the fallback payment method to use when an automatic
         * payment fails. One of `manual` or `ui`.
         */
        fun fallbackPaymentMethod(fallbackPaymentMethod: String) = apply {
            this.fallbackPaymentMethod = fallbackPaymentMethod
        }

        /**
         * Whether to ingest the ledger_entries to populate the invoice line items. If this is
         * false, then a line item must be provided. If this is true, line_items must be empty.
         * Ignored if ledger_account_settlement_id is empty.
         */
        fun ingestLedgerEntries(ingestLedgerEntries: Boolean) = apply {
            this.ingestLedgerEntries = ingestLedgerEntries
        }

        /**
         * An array of invoice line items. The API supports a maximum of 50 invoice line items per
         * invoice. If a greater number of invoice line items is required, please contact support.
         */
        fun invoiceLineItems(invoiceLineItems: List<InvoiceLineItemCreateRequest>) = apply {
            this.invoiceLineItems.clear()
            this.invoiceLineItems.addAll(invoiceLineItems)
        }

        /**
         * An array of invoice line items. The API supports a maximum of 50 invoice line items per
         * invoice. If a greater number of invoice line items is required, please contact support.
         */
        fun addInvoiceLineItem(invoiceLineItem: InvoiceLineItemCreateRequest) = apply {
            this.invoiceLineItems.add(invoiceLineItem)
        }

        /** The invoice issuer's business address. */
        fun invoicerAddress(invoicerAddress: InvoicerAddress) = apply {
            this.invoicerAddress = invoicerAddress
        }

        /** The ID of the virtual account the invoice should be paid to. */
        fun ledgerAccountSettlementId(ledgerAccountSettlementId: String) = apply {
            this.ledgerAccountSettlementId = ledgerAccountSettlementId
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         */
        fun paymentType(paymentType: PaymentOrderType) = apply { this.paymentType = paymentType }

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

        /**
         * Number of days after due date when overdue reminder emails will be sent out to invoice
         * recipients.
         */
        fun remindAfterOverdueDays(remindAfterOverdueDays: List<Long>) = apply {
            this.remindAfterOverdueDays.clear()
            this.remindAfterOverdueDays.addAll(remindAfterOverdueDays)
        }

        /**
         * Number of days after due date when overdue reminder emails will be sent out to invoice
         * recipients.
         */
        fun addRemindAfterOverdueDay(remindAfterOverdueDay: Long) = apply {
            this.remindAfterOverdueDays.add(remindAfterOverdueDay)
        }

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
                autoAdvance,
                if (contactDetails.size == 0) null else contactDetails.toUnmodifiable(),
                counterpartyBillingAddress,
                counterpartyShippingAddress,
                currency,
                description,
                fallbackPaymentMethod,
                ingestLedgerEntries,
                if (invoiceLineItems.size == 0) null else invoiceLineItems.toUnmodifiable(),
                invoicerAddress,
                ledgerAccountSettlementId,
                metadata,
                if (notificationEmailAddresses.size == 0) null
                else notificationEmailAddresses.toUnmodifiable(),
                notificationsEnabled,
                paymentEffectiveDate,
                paymentMethod,
                paymentType,
                receivingAccountId,
                recipientEmail,
                recipientName,
                if (remindAfterOverdueDays.size == 0) null
                else remindAfterOverdueDays.toUnmodifiable(),
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
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ContactIdentifierType && this.value == other.value /* spotless:on */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContactDetail && this.id == other.id && this.object_ == other.object_ && this.liveMode == other.liveMode && this.createdAt == other.createdAt && this.updatedAt == other.updatedAt && this.discardedAt == other.discardedAt && this.contactIdentifier == other.contactIdentifier && this.contactIdentifierType == other.contactIdentifierType && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, contactIdentifier, contactIdentifierType, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContactDetail{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CounterpartyBillingAddress && this.line1 == other.line1 && this.line2 == other.line2 && this.locality == other.locality && this.region == other.region && this.postalCode == other.postalCode && this.country == other.country && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(line1, line2, locality, region, postalCode, country, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CounterpartyBillingAddress{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CounterpartyShippingAddress && this.line1 == other.line1 && this.line2 == other.line2 && this.locality == other.locality && this.region == other.region && this.postalCode == other.postalCode && this.country == other.country && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(line1, line2, locality, region, postalCode, country, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CounterpartyShippingAddress{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = InvoiceLineItemCreateRequest.Builder::class)
    @NoAutoDetect
    class InvoiceLineItemCreateRequest
    private constructor(
        private val name: String?,
        private val description: String?,
        private val quantity: Long?,
        private val unitAmount: Long?,
        private val unitAmountDecimal: String?,
        private val direction: String?,
        private val metadata: Metadata?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The name of the line item, typically a product or SKU name. */
        @JsonProperty("name") fun name(): String? = name

        /** An optional free-form description of the line item. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * The number of units of a product or service that this line item is for. Must be a whole
         * number. Defaults to 1 if not provided.
         */
        @JsonProperty("quantity") fun quantity(): Long? = quantity

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit.
         */
        @JsonProperty("unit_amount") fun unitAmount(): Long? = unitAmount

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
         */
        @JsonProperty("unit_amount_decimal") fun unitAmountDecimal(): String? = unitAmountDecimal

        /**
         * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
         * increases the invoice's `total_amount` due. `credit` has the opposite intention and
         * effect.
         */
        @JsonProperty("direction") fun direction(): String? = direction

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var description: String? = null
            private var quantity: Long? = null
            private var unitAmount: Long? = null
            private var unitAmountDecimal: String? = null
            private var direction: String? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoiceLineItemCreateRequest: InvoiceLineItemCreateRequest) = apply {
                this.name = invoiceLineItemCreateRequest.name
                this.description = invoiceLineItemCreateRequest.description
                this.quantity = invoiceLineItemCreateRequest.quantity
                this.unitAmount = invoiceLineItemCreateRequest.unitAmount
                this.unitAmountDecimal = invoiceLineItemCreateRequest.unitAmountDecimal
                this.direction = invoiceLineItemCreateRequest.direction
                this.metadata = invoiceLineItemCreateRequest.metadata
                additionalProperties(invoiceLineItemCreateRequest.additionalProperties)
            }

            /** The name of the line item, typically a product or SKU name. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** An optional free-form description of the line item. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * The number of units of a product or service that this line item is for. Must be a
             * whole number. Defaults to 1 if not provided.
             */
            @JsonProperty("quantity")
            fun quantity(quantity: Long) = apply { this.quantity = quantity }

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit.
             */
            @JsonProperty("unit_amount")
            fun unitAmount(unitAmount: Long) = apply { this.unitAmount = unitAmount }

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
             */
            @JsonProperty("unit_amount_decimal")
            fun unitAmountDecimal(unitAmountDecimal: String) = apply {
                this.unitAmountDecimal = unitAmountDecimal
            }

            /**
             * Either `debit` or `credit`. `debit` indicates that a client owes the business money
             * and increases the invoice's `total_amount` due. `credit` has the opposite intention
             * and effect.
             */
            @JsonProperty("direction")
            fun direction(direction: String) = apply { this.direction = direction }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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

            fun build(): InvoiceLineItemCreateRequest =
                InvoiceLineItemCreateRequest(
                    checkNotNull(name) { "`name` is required but was not set" },
                    description,
                    quantity,
                    checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                    unitAmountDecimal,
                    direction,
                    metadata,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceLineItemCreateRequest && this.name == other.name && this.description == other.description && this.quantity == other.quantity && this.unitAmount == other.unitAmount && this.unitAmountDecimal == other.unitAmountDecimal && this.direction == other.direction && this.metadata == other.metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(name, description, quantity, unitAmount, unitAmountDecimal, direction, metadata, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "InvoiceLineItemCreateRequest{name=$name, description=$description, quantity=$quantity, unitAmount=$unitAmount, unitAmountDecimal=$unitAmountDecimal, direction=$direction, metadata=$metadata, additionalProperties=$additionalProperties}"
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoicerAddress && this.line1 == other.line1 && this.line2 == other.line2 && this.locality == other.locality && this.region == other.region && this.postalCode == other.postalCode && this.country == other.country && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(line1, line2, locality, region, postalCode, country, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "InvoicerAddress{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class PaymentMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentMethod && this.value == other.value /* spotless:on */
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
}
