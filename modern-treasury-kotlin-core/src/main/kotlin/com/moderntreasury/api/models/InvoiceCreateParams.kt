// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

class InvoiceCreateParams
constructor(
    private val body: InvoiceCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The ID of the counterparty receiving the invoice. */
    fun counterpartyId(): String = body.counterpartyId()

    /** A future date by when the invoice needs to be paid. */
    fun dueDate(): OffsetDateTime = body.dueDate()

    /** The ID of the internal account the invoice should be paid to. */
    fun originatingAccountId(): String = body.originatingAccountId()

    /**
     * When true, the invoice will progress to unpaid automatically and cannot be edited after
     * entering that state. If the invoice fails to progress to unpaid, the errors will be returned
     * and the invoice will not be created.
     */
    fun autoAdvance(): Boolean? = body.autoAdvance()

    /** The invoicer's contact details displayed at the top of the invoice. */
    fun contactDetails(): List<ContactDetail>? = body.contactDetails()

    /** The counterparty's billing address. */
    fun counterpartyBillingAddress(): CounterpartyBillingAddress? =
        body.counterpartyBillingAddress()

    /** The counterparty's shipping address where physical goods should be delivered. */
    fun counterpartyShippingAddress(): CounterpartyShippingAddress? =
        body.counterpartyShippingAddress()

    /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
    fun currency(): Currency? = body.currency()

    /** A free-form description of the invoice. */
    fun description(): String? = body.description()

    /**
     * When payment_method is automatic, the fallback payment method to use when an automatic
     * payment fails. One of `manual` or `ui`.
     */
    fun fallbackPaymentMethod(): String? = body.fallbackPaymentMethod()

    /**
     * Whether to ingest the ledger_entries to populate the invoice line items. If this is false,
     * then a line item must be provided. If this is true, line_items must be empty. Ignored if
     * ledger_account_settlement_id is empty.
     */
    fun ingestLedgerEntries(): Boolean? = body.ingestLedgerEntries()

    /**
     * An array of invoice line items. The API supports a maximum of 50 invoice line items per
     * invoice. If a greater number of invoice line items is required, please contact support.
     */
    fun invoiceLineItems(): List<InvoiceLineItemCreateRequest>? = body.invoiceLineItems()

    /** The invoice issuer's business address. */
    fun invoicerAddress(): InvoicerAddress? = body.invoicerAddress()

    /** The ID of the virtual account the invoice should be paid to. */
    fun ledgerAccountSettlementId(): String? = body.ledgerAccountSettlementId()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata? = body.metadata()

    /**
     * Emails in addition to the counterparty email to send invoice status notifications to. At
     * least one email is required if notifications are enabled and the counterparty doesn't have an
     * email.
     */
    fun notificationEmailAddresses(): List<String>? = body.notificationEmailAddresses()

    /**
     * If true, the invoice will send email notifications to the invoice recipients about invoice
     * status changes.
     */
    fun notificationsEnabled(): Boolean? = body.notificationsEnabled()

    /**
     * Date transactions are to be posted to the participants' account. Defaults to the current
     * business day or the next business day if the current day is a bank holiday or weekend.
     * Format: yyyy-mm-dd.
     */
    fun paymentEffectiveDate(): LocalDate? = body.paymentEffectiveDate()

    /**
     * The method by which the invoice can be paid. `ui` will show the embedded payment collection
     * flow. `automatic` will automatically initiate payment based upon the account details of the
     * receiving_account id.\nIf the invoice amount is positive, the automatically initiated payment
     * order's direction will be debit. If the invoice amount is negative, the automatically
     * initiated payment order's direction will be credit. One of `manual`, `ui`, or `automatic`.
     */
    fun paymentMethod(): PaymentMethod? = body.paymentMethod()

    /**
     * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`,
     * `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`, `signet`,
     * `provexchange`, `zengin`.
     */
    fun paymentType(): PaymentOrderType? = body.paymentType()

    /** The receiving account ID. Can be an `external_account`. */
    fun receivingAccountId(): String? = body.receivingAccountId()

    /**
     * The email of the recipient of the invoice. Leaving this value as null will fallback to using
     * the counterparty's name.
     */
    fun recipientEmail(): String? = body.recipientEmail()

    /**
     * The name of the recipient of the invoice. Leaving this value as null will fallback to using
     * the counterparty's name.
     */
    fun recipientName(): String? = body.recipientName()

    /**
     * Number of days after due date when overdue reminder emails will be sent out to invoice
     * recipients.
     */
    fun remindAfterOverdueDays(): List<Long>? = body.remindAfterOverdueDays()

    /** The ID of the virtual account the invoice should be paid to. */
    fun virtualAccountId(): String? = body.virtualAccountId()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): InvoiceCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class InvoiceCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("counterparty_id") private val counterpartyId: String,
        @JsonProperty("due_date") private val dueDate: OffsetDateTime,
        @JsonProperty("originating_account_id") private val originatingAccountId: String,
        @JsonProperty("auto_advance") private val autoAdvance: Boolean?,
        @JsonProperty("contact_details") private val contactDetails: List<ContactDetail>?,
        @JsonProperty("counterparty_billing_address")
        private val counterpartyBillingAddress: CounterpartyBillingAddress?,
        @JsonProperty("counterparty_shipping_address")
        private val counterpartyShippingAddress: CounterpartyShippingAddress?,
        @JsonProperty("currency") private val currency: Currency?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("fallback_payment_method") private val fallbackPaymentMethod: String?,
        @JsonProperty("ingest_ledger_entries") private val ingestLedgerEntries: Boolean?,
        @JsonProperty("invoice_line_items")
        private val invoiceLineItems: List<InvoiceLineItemCreateRequest>?,
        @JsonProperty("invoicer_address") private val invoicerAddress: InvoicerAddress?,
        @JsonProperty("ledger_account_settlement_id")
        private val ledgerAccountSettlementId: String?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("notification_email_addresses")
        private val notificationEmailAddresses: List<String>?,
        @JsonProperty("notifications_enabled") private val notificationsEnabled: Boolean?,
        @JsonProperty("payment_effective_date") private val paymentEffectiveDate: LocalDate?,
        @JsonProperty("payment_method") private val paymentMethod: PaymentMethod?,
        @JsonProperty("payment_type") private val paymentType: PaymentOrderType?,
        @JsonProperty("receiving_account_id") private val receivingAccountId: String?,
        @JsonProperty("recipient_email") private val recipientEmail: String?,
        @JsonProperty("recipient_name") private val recipientName: String?,
        @JsonProperty("remind_after_overdue_days") private val remindAfterOverdueDays: List<Long>?,
        @JsonProperty("virtual_account_id") private val virtualAccountId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The ID of the counterparty receiving the invoice. */
        @JsonProperty("counterparty_id") fun counterpartyId(): String = counterpartyId

        /** A future date by when the invoice needs to be paid. */
        @JsonProperty("due_date") fun dueDate(): OffsetDateTime = dueDate

        /** The ID of the internal account the invoice should be paid to. */
        @JsonProperty("originating_account_id")
        fun originatingAccountId(): String = originatingAccountId

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
            private var contactDetails: MutableList<ContactDetail>? = null
            private var counterpartyBillingAddress: CounterpartyBillingAddress? = null
            private var counterpartyShippingAddress: CounterpartyShippingAddress? = null
            private var currency: Currency? = null
            private var description: String? = null
            private var fallbackPaymentMethod: String? = null
            private var ingestLedgerEntries: Boolean? = null
            private var invoiceLineItems: MutableList<InvoiceLineItemCreateRequest>? = null
            private var invoicerAddress: InvoicerAddress? = null
            private var ledgerAccountSettlementId: String? = null
            private var metadata: Metadata? = null
            private var notificationEmailAddresses: MutableList<String>? = null
            private var notificationsEnabled: Boolean? = null
            private var paymentEffectiveDate: LocalDate? = null
            private var paymentMethod: PaymentMethod? = null
            private var paymentType: PaymentOrderType? = null
            private var receivingAccountId: String? = null
            private var recipientEmail: String? = null
            private var recipientName: String? = null
            private var remindAfterOverdueDays: MutableList<Long>? = null
            private var virtualAccountId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoiceCreateBody: InvoiceCreateBody) = apply {
                counterpartyId = invoiceCreateBody.counterpartyId
                dueDate = invoiceCreateBody.dueDate
                originatingAccountId = invoiceCreateBody.originatingAccountId
                autoAdvance = invoiceCreateBody.autoAdvance
                contactDetails = invoiceCreateBody.contactDetails?.toMutableList()
                counterpartyBillingAddress = invoiceCreateBody.counterpartyBillingAddress
                counterpartyShippingAddress = invoiceCreateBody.counterpartyShippingAddress
                currency = invoiceCreateBody.currency
                description = invoiceCreateBody.description
                fallbackPaymentMethod = invoiceCreateBody.fallbackPaymentMethod
                ingestLedgerEntries = invoiceCreateBody.ingestLedgerEntries
                invoiceLineItems = invoiceCreateBody.invoiceLineItems?.toMutableList()
                invoicerAddress = invoiceCreateBody.invoicerAddress
                ledgerAccountSettlementId = invoiceCreateBody.ledgerAccountSettlementId
                metadata = invoiceCreateBody.metadata
                notificationEmailAddresses =
                    invoiceCreateBody.notificationEmailAddresses?.toMutableList()
                notificationsEnabled = invoiceCreateBody.notificationsEnabled
                paymentEffectiveDate = invoiceCreateBody.paymentEffectiveDate
                paymentMethod = invoiceCreateBody.paymentMethod
                paymentType = invoiceCreateBody.paymentType
                receivingAccountId = invoiceCreateBody.receivingAccountId
                recipientEmail = invoiceCreateBody.recipientEmail
                recipientName = invoiceCreateBody.recipientName
                remindAfterOverdueDays = invoiceCreateBody.remindAfterOverdueDays?.toMutableList()
                virtualAccountId = invoiceCreateBody.virtualAccountId
                additionalProperties = invoiceCreateBody.additionalProperties.toMutableMap()
            }

            /** The ID of the counterparty receiving the invoice. */
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            /** A future date by when the invoice needs to be paid. */
            fun dueDate(dueDate: OffsetDateTime) = apply { this.dueDate = dueDate }

            /** The ID of the internal account the invoice should be paid to. */
            fun originatingAccountId(originatingAccountId: String) = apply {
                this.originatingAccountId = originatingAccountId
            }

            /**
             * When true, the invoice will progress to unpaid automatically and cannot be edited
             * after entering that state. If the invoice fails to progress to unpaid, the errors
             * will be returned and the invoice will not be created.
             */
            fun autoAdvance(autoAdvance: Boolean?) = apply { this.autoAdvance = autoAdvance }

            /**
             * When true, the invoice will progress to unpaid automatically and cannot be edited
             * after entering that state. If the invoice fails to progress to unpaid, the errors
             * will be returned and the invoice will not be created.
             */
            fun autoAdvance(autoAdvance: Boolean) = autoAdvance(autoAdvance as Boolean?)

            /** The invoicer's contact details displayed at the top of the invoice. */
            fun contactDetails(contactDetails: List<ContactDetail>?) = apply {
                this.contactDetails = contactDetails?.toMutableList()
            }

            /** The invoicer's contact details displayed at the top of the invoice. */
            fun addContactDetail(contactDetail: ContactDetail) = apply {
                contactDetails = (contactDetails ?: mutableListOf()).apply { add(contactDetail) }
            }

            /** The counterparty's billing address. */
            fun counterpartyBillingAddress(
                counterpartyBillingAddress: CounterpartyBillingAddress?
            ) = apply { this.counterpartyBillingAddress = counterpartyBillingAddress }

            /** The counterparty's shipping address where physical goods should be delivered. */
            fun counterpartyShippingAddress(
                counterpartyShippingAddress: CounterpartyShippingAddress?
            ) = apply { this.counterpartyShippingAddress = counterpartyShippingAddress }

            /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
            fun currency(currency: Currency?) = apply { this.currency = currency }

            /** A free-form description of the invoice. */
            fun description(description: String?) = apply { this.description = description }

            /**
             * When payment_method is automatic, the fallback payment method to use when an
             * automatic payment fails. One of `manual` or `ui`.
             */
            fun fallbackPaymentMethod(fallbackPaymentMethod: String?) = apply {
                this.fallbackPaymentMethod = fallbackPaymentMethod
            }

            /**
             * Whether to ingest the ledger_entries to populate the invoice line items. If this is
             * false, then a line item must be provided. If this is true, line_items must be empty.
             * Ignored if ledger_account_settlement_id is empty.
             */
            fun ingestLedgerEntries(ingestLedgerEntries: Boolean?) = apply {
                this.ingestLedgerEntries = ingestLedgerEntries
            }

            /**
             * Whether to ingest the ledger_entries to populate the invoice line items. If this is
             * false, then a line item must be provided. If this is true, line_items must be empty.
             * Ignored if ledger_account_settlement_id is empty.
             */
            fun ingestLedgerEntries(ingestLedgerEntries: Boolean) =
                ingestLedgerEntries(ingestLedgerEntries as Boolean?)

            /**
             * An array of invoice line items. The API supports a maximum of 50 invoice line items
             * per invoice. If a greater number of invoice line items is required, please contact
             * support.
             */
            fun invoiceLineItems(invoiceLineItems: List<InvoiceLineItemCreateRequest>?) = apply {
                this.invoiceLineItems = invoiceLineItems?.toMutableList()
            }

            /**
             * An array of invoice line items. The API supports a maximum of 50 invoice line items
             * per invoice. If a greater number of invoice line items is required, please contact
             * support.
             */
            fun addInvoiceLineItem(invoiceLineItem: InvoiceLineItemCreateRequest) = apply {
                invoiceLineItems =
                    (invoiceLineItems ?: mutableListOf()).apply { add(invoiceLineItem) }
            }

            /** The invoice issuer's business address. */
            fun invoicerAddress(invoicerAddress: InvoicerAddress?) = apply {
                this.invoicerAddress = invoicerAddress
            }

            /** The ID of the virtual account the invoice should be paid to. */
            fun ledgerAccountSettlementId(ledgerAccountSettlementId: String?) = apply {
                this.ledgerAccountSettlementId = ledgerAccountSettlementId
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

            /**
             * Emails in addition to the counterparty email to send invoice status notifications to.
             * At least one email is required if notifications are enabled and the counterparty
             * doesn't have an email.
             */
            fun notificationEmailAddresses(notificationEmailAddresses: List<String>?) = apply {
                this.notificationEmailAddresses = notificationEmailAddresses?.toMutableList()
            }

            /**
             * Emails in addition to the counterparty email to send invoice status notifications to.
             * At least one email is required if notifications are enabled and the counterparty
             * doesn't have an email.
             */
            fun addNotificationEmailAddress(notificationEmailAddress: String) = apply {
                notificationEmailAddresses =
                    (notificationEmailAddresses ?: mutableListOf()).apply {
                        add(notificationEmailAddress)
                    }
            }

            /**
             * If true, the invoice will send email notifications to the invoice recipients about
             * invoice status changes.
             */
            fun notificationsEnabled(notificationsEnabled: Boolean?) = apply {
                this.notificationsEnabled = notificationsEnabled
            }

            /**
             * If true, the invoice will send email notifications to the invoice recipients about
             * invoice status changes.
             */
            fun notificationsEnabled(notificationsEnabled: Boolean) =
                notificationsEnabled(notificationsEnabled as Boolean?)

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            fun paymentEffectiveDate(paymentEffectiveDate: LocalDate?) = apply {
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
            fun paymentMethod(paymentMethod: PaymentMethod?) = apply {
                this.paymentMethod = paymentMethod
            }

            /**
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            fun paymentType(paymentType: PaymentOrderType?) = apply {
                this.paymentType = paymentType
            }

            /** The receiving account ID. Can be an `external_account`. */
            fun receivingAccountId(receivingAccountId: String?) = apply {
                this.receivingAccountId = receivingAccountId
            }

            /**
             * The email of the recipient of the invoice. Leaving this value as null will fallback
             * to using the counterparty's name.
             */
            fun recipientEmail(recipientEmail: String?) = apply {
                this.recipientEmail = recipientEmail
            }

            /**
             * The name of the recipient of the invoice. Leaving this value as null will fallback to
             * using the counterparty's name.
             */
            fun recipientName(recipientName: String?) = apply { this.recipientName = recipientName }

            /**
             * Number of days after due date when overdue reminder emails will be sent out to
             * invoice recipients.
             */
            fun remindAfterOverdueDays(remindAfterOverdueDays: List<Long>?) = apply {
                this.remindAfterOverdueDays = remindAfterOverdueDays?.toMutableList()
            }

            /**
             * Number of days after due date when overdue reminder emails will be sent out to
             * invoice recipients.
             */
            fun addRemindAfterOverdueDay(remindAfterOverdueDay: Long) = apply {
                remindAfterOverdueDays =
                    (remindAfterOverdueDays ?: mutableListOf()).apply { add(remindAfterOverdueDay) }
            }

            /** The ID of the virtual account the invoice should be paid to. */
            fun virtualAccountId(virtualAccountId: String?) = apply {
                this.virtualAccountId = virtualAccountId
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

            fun build(): InvoiceCreateBody =
                InvoiceCreateBody(
                    checkNotNull(counterpartyId) { "`counterpartyId` is required but was not set" },
                    checkNotNull(dueDate) { "`dueDate` is required but was not set" },
                    checkNotNull(originatingAccountId) {
                        "`originatingAccountId` is required but was not set"
                    },
                    autoAdvance,
                    contactDetails?.toImmutable(),
                    counterpartyBillingAddress,
                    counterpartyShippingAddress,
                    currency,
                    description,
                    fallbackPaymentMethod,
                    ingestLedgerEntries,
                    invoiceLineItems?.toImmutable(),
                    invoicerAddress,
                    ledgerAccountSettlementId,
                    metadata,
                    notificationEmailAddresses?.toImmutable(),
                    notificationsEnabled,
                    paymentEffectiveDate,
                    paymentMethod,
                    paymentType,
                    receivingAccountId,
                    recipientEmail,
                    recipientName,
                    remindAfterOverdueDays?.toImmutable(),
                    virtualAccountId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceCreateBody && counterpartyId == other.counterpartyId && dueDate == other.dueDate && originatingAccountId == other.originatingAccountId && autoAdvance == other.autoAdvance && contactDetails == other.contactDetails && counterpartyBillingAddress == other.counterpartyBillingAddress && counterpartyShippingAddress == other.counterpartyShippingAddress && currency == other.currency && description == other.description && fallbackPaymentMethod == other.fallbackPaymentMethod && ingestLedgerEntries == other.ingestLedgerEntries && invoiceLineItems == other.invoiceLineItems && invoicerAddress == other.invoicerAddress && ledgerAccountSettlementId == other.ledgerAccountSettlementId && metadata == other.metadata && notificationEmailAddresses == other.notificationEmailAddresses && notificationsEnabled == other.notificationsEnabled && paymentEffectiveDate == other.paymentEffectiveDate && paymentMethod == other.paymentMethod && paymentType == other.paymentType && receivingAccountId == other.receivingAccountId && recipientEmail == other.recipientEmail && recipientName == other.recipientName && remindAfterOverdueDays == other.remindAfterOverdueDays && virtualAccountId == other.virtualAccountId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(counterpartyId, dueDate, originatingAccountId, autoAdvance, contactDetails, counterpartyBillingAddress, counterpartyShippingAddress, currency, description, fallbackPaymentMethod, ingestLedgerEntries, invoiceLineItems, invoicerAddress, ledgerAccountSettlementId, metadata, notificationEmailAddresses, notificationsEnabled, paymentEffectiveDate, paymentMethod, paymentType, receivingAccountId, recipientEmail, recipientName, remindAfterOverdueDays, virtualAccountId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceCreateBody{counterpartyId=$counterpartyId, dueDate=$dueDate, originatingAccountId=$originatingAccountId, autoAdvance=$autoAdvance, contactDetails=$contactDetails, counterpartyBillingAddress=$counterpartyBillingAddress, counterpartyShippingAddress=$counterpartyShippingAddress, currency=$currency, description=$description, fallbackPaymentMethod=$fallbackPaymentMethod, ingestLedgerEntries=$ingestLedgerEntries, invoiceLineItems=$invoiceLineItems, invoicerAddress=$invoicerAddress, ledgerAccountSettlementId=$ledgerAccountSettlementId, metadata=$metadata, notificationEmailAddresses=$notificationEmailAddresses, notificationsEnabled=$notificationsEnabled, paymentEffectiveDate=$paymentEffectiveDate, paymentMethod=$paymentMethod, paymentType=$paymentType, receivingAccountId=$receivingAccountId, recipientEmail=$recipientEmail, recipientName=$recipientName, remindAfterOverdueDays=$remindAfterOverdueDays, virtualAccountId=$virtualAccountId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: InvoiceCreateBody.Builder = InvoiceCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(invoiceCreateParams: InvoiceCreateParams) = apply {
            body = invoiceCreateParams.body.toBuilder()
            additionalHeaders = invoiceCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceCreateParams.additionalQueryParams.toBuilder()
        }

        /** The ID of the counterparty receiving the invoice. */
        fun counterpartyId(counterpartyId: String) = apply { body.counterpartyId(counterpartyId) }

        /** A future date by when the invoice needs to be paid. */
        fun dueDate(dueDate: OffsetDateTime) = apply { body.dueDate(dueDate) }

        /** The ID of the internal account the invoice should be paid to. */
        fun originatingAccountId(originatingAccountId: String) = apply {
            body.originatingAccountId(originatingAccountId)
        }

        /**
         * When true, the invoice will progress to unpaid automatically and cannot be edited after
         * entering that state. If the invoice fails to progress to unpaid, the errors will be
         * returned and the invoice will not be created.
         */
        fun autoAdvance(autoAdvance: Boolean?) = apply { body.autoAdvance(autoAdvance) }

        /**
         * When true, the invoice will progress to unpaid automatically and cannot be edited after
         * entering that state. If the invoice fails to progress to unpaid, the errors will be
         * returned and the invoice will not be created.
         */
        fun autoAdvance(autoAdvance: Boolean) = autoAdvance(autoAdvance as Boolean?)

        /** The invoicer's contact details displayed at the top of the invoice. */
        fun contactDetails(contactDetails: List<ContactDetail>?) = apply {
            body.contactDetails(contactDetails)
        }

        /** The invoicer's contact details displayed at the top of the invoice. */
        fun addContactDetail(contactDetail: ContactDetail) = apply {
            body.addContactDetail(contactDetail)
        }

        /** The counterparty's billing address. */
        fun counterpartyBillingAddress(counterpartyBillingAddress: CounterpartyBillingAddress?) =
            apply {
                body.counterpartyBillingAddress(counterpartyBillingAddress)
            }

        /** The counterparty's shipping address where physical goods should be delivered. */
        fun counterpartyShippingAddress(counterpartyShippingAddress: CounterpartyShippingAddress?) =
            apply {
                body.counterpartyShippingAddress(counterpartyShippingAddress)
            }

        /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
        fun currency(currency: Currency?) = apply { body.currency(currency) }

        /** A free-form description of the invoice. */
        fun description(description: String?) = apply { body.description(description) }

        /**
         * When payment_method is automatic, the fallback payment method to use when an automatic
         * payment fails. One of `manual` or `ui`.
         */
        fun fallbackPaymentMethod(fallbackPaymentMethod: String?) = apply {
            body.fallbackPaymentMethod(fallbackPaymentMethod)
        }

        /**
         * Whether to ingest the ledger_entries to populate the invoice line items. If this is
         * false, then a line item must be provided. If this is true, line_items must be empty.
         * Ignored if ledger_account_settlement_id is empty.
         */
        fun ingestLedgerEntries(ingestLedgerEntries: Boolean?) = apply {
            body.ingestLedgerEntries(ingestLedgerEntries)
        }

        /**
         * Whether to ingest the ledger_entries to populate the invoice line items. If this is
         * false, then a line item must be provided. If this is true, line_items must be empty.
         * Ignored if ledger_account_settlement_id is empty.
         */
        fun ingestLedgerEntries(ingestLedgerEntries: Boolean) =
            ingestLedgerEntries(ingestLedgerEntries as Boolean?)

        /**
         * An array of invoice line items. The API supports a maximum of 50 invoice line items per
         * invoice. If a greater number of invoice line items is required, please contact support.
         */
        fun invoiceLineItems(invoiceLineItems: List<InvoiceLineItemCreateRequest>?) = apply {
            body.invoiceLineItems(invoiceLineItems)
        }

        /**
         * An array of invoice line items. The API supports a maximum of 50 invoice line items per
         * invoice. If a greater number of invoice line items is required, please contact support.
         */
        fun addInvoiceLineItem(invoiceLineItem: InvoiceLineItemCreateRequest) = apply {
            body.addInvoiceLineItem(invoiceLineItem)
        }

        /** The invoice issuer's business address. */
        fun invoicerAddress(invoicerAddress: InvoicerAddress?) = apply {
            body.invoicerAddress(invoicerAddress)
        }

        /** The ID of the virtual account the invoice should be paid to. */
        fun ledgerAccountSettlementId(ledgerAccountSettlementId: String?) = apply {
            body.ledgerAccountSettlementId(ledgerAccountSettlementId)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * Emails in addition to the counterparty email to send invoice status notifications to. At
         * least one email is required if notifications are enabled and the counterparty doesn't
         * have an email.
         */
        fun notificationEmailAddresses(notificationEmailAddresses: List<String>?) = apply {
            body.notificationEmailAddresses(notificationEmailAddresses)
        }

        /**
         * Emails in addition to the counterparty email to send invoice status notifications to. At
         * least one email is required if notifications are enabled and the counterparty doesn't
         * have an email.
         */
        fun addNotificationEmailAddress(notificationEmailAddress: String) = apply {
            body.addNotificationEmailAddress(notificationEmailAddress)
        }

        /**
         * If true, the invoice will send email notifications to the invoice recipients about
         * invoice status changes.
         */
        fun notificationsEnabled(notificationsEnabled: Boolean?) = apply {
            body.notificationsEnabled(notificationsEnabled)
        }

        /**
         * If true, the invoice will send email notifications to the invoice recipients about
         * invoice status changes.
         */
        fun notificationsEnabled(notificationsEnabled: Boolean) =
            notificationsEnabled(notificationsEnabled as Boolean?)

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        fun paymentEffectiveDate(paymentEffectiveDate: LocalDate?) = apply {
            body.paymentEffectiveDate(paymentEffectiveDate)
        }

        /**
         * The method by which the invoice can be paid. `ui` will show the embedded payment
         * collection flow. `automatic` will automatically initiate payment based upon the account
         * details of the receiving_account id.\nIf the invoice amount is positive, the
         * automatically initiated payment order's direction will be debit. If the invoice amount is
         * negative, the automatically initiated payment order's direction will be credit. One of
         * `manual`, `ui`, or `automatic`.
         */
        fun paymentMethod(paymentMethod: PaymentMethod?) = apply {
            body.paymentMethod(paymentMethod)
        }

        /**
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         */
        fun paymentType(paymentType: PaymentOrderType?) = apply { body.paymentType(paymentType) }

        /** The receiving account ID. Can be an `external_account`. */
        fun receivingAccountId(receivingAccountId: String?) = apply {
            body.receivingAccountId(receivingAccountId)
        }

        /**
         * The email of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        fun recipientEmail(recipientEmail: String?) = apply { body.recipientEmail(recipientEmail) }

        /**
         * The name of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        fun recipientName(recipientName: String?) = apply { body.recipientName(recipientName) }

        /**
         * Number of days after due date when overdue reminder emails will be sent out to invoice
         * recipients.
         */
        fun remindAfterOverdueDays(remindAfterOverdueDays: List<Long>?) = apply {
            body.remindAfterOverdueDays(remindAfterOverdueDays)
        }

        /**
         * Number of days after due date when overdue reminder emails will be sent out to invoice
         * recipients.
         */
        fun addRemindAfterOverdueDay(remindAfterOverdueDay: Long) = apply {
            body.addRemindAfterOverdueDay(remindAfterOverdueDay)
        }

        /** The ID of the virtual account the invoice should be paid to. */
        fun virtualAccountId(virtualAccountId: String?) = apply {
            body.virtualAccountId(virtualAccountId)
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

        fun build(): InvoiceCreateParams =
            InvoiceCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class ContactDetail
    @JsonCreator
    private constructor(
        @JsonProperty("id") private val id: String,
        @JsonProperty("contact_identifier") private val contactIdentifier: String,
        @JsonProperty("contact_identifier_type")
        private val contactIdentifierType: ContactIdentifierType,
        @JsonProperty("created_at") private val createdAt: OffsetDateTime,
        @JsonProperty("discarded_at") private val discardedAt: OffsetDateTime?,
        @JsonProperty("live_mode") private val liveMode: Boolean,
        @JsonProperty("object") private val object_: String,
        @JsonProperty("updated_at") private val updatedAt: OffsetDateTime,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("id") fun id(): String = id

        @JsonProperty("contact_identifier") fun contactIdentifier(): String = contactIdentifier

        @JsonProperty("contact_identifier_type")
        fun contactIdentifierType(): ContactIdentifierType = contactIdentifierType

        @JsonProperty("created_at") fun createdAt(): OffsetDateTime = createdAt

        @JsonProperty("discarded_at") fun discardedAt(): OffsetDateTime? = discardedAt

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") fun liveMode(): Boolean = liveMode

        @JsonProperty("object") fun object_(): String = object_

        @JsonProperty("updated_at") fun updatedAt(): OffsetDateTime = updatedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: String? = null
            private var contactIdentifier: String? = null
            private var contactIdentifierType: ContactIdentifierType? = null
            private var createdAt: OffsetDateTime? = null
            private var discardedAt: OffsetDateTime? = null
            private var liveMode: Boolean? = null
            private var object_: String? = null
            private var updatedAt: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(contactDetail: ContactDetail) = apply {
                id = contactDetail.id
                contactIdentifier = contactDetail.contactIdentifier
                contactIdentifierType = contactDetail.contactIdentifierType
                createdAt = contactDetail.createdAt
                discardedAt = contactDetail.discardedAt
                liveMode = contactDetail.liveMode
                object_ = contactDetail.object_
                updatedAt = contactDetail.updatedAt
                additionalProperties = contactDetail.additionalProperties.toMutableMap()
            }

            fun id(id: String) = apply { this.id = id }

            fun contactIdentifier(contactIdentifier: String) = apply {
                this.contactIdentifier = contactIdentifier
            }

            fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) = apply {
                this.contactIdentifierType = contactIdentifierType
            }

            fun createdAt(createdAt: OffsetDateTime) = apply { this.createdAt = createdAt }

            fun discardedAt(discardedAt: OffsetDateTime?) = apply { this.discardedAt = discardedAt }

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: Boolean) = apply { this.liveMode = liveMode }

            fun object_(object_: String) = apply { this.object_ = object_ }

            fun updatedAt(updatedAt: OffsetDateTime) = apply { this.updatedAt = updatedAt }

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

            fun build(): ContactDetail =
                ContactDetail(
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(contactIdentifier) {
                        "`contactIdentifier` is required but was not set"
                    },
                    checkNotNull(contactIdentifierType) {
                        "`contactIdentifierType` is required but was not set"
                    },
                    checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                    discardedAt,
                    checkNotNull(liveMode) { "`liveMode` is required but was not set" },
                    checkNotNull(object_) { "`object_` is required but was not set" },
                    checkNotNull(updatedAt) { "`updatedAt` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class ContactIdentifierType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val EMAIL = of("email")

                val PHONE_NUMBER = of("phone_number")

                val WEBSITE = of("website")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ContactIdentifierType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContactDetail && id == other.id && contactIdentifier == other.contactIdentifier && contactIdentifierType == other.contactIdentifierType && createdAt == other.createdAt && discardedAt == other.discardedAt && liveMode == other.liveMode && object_ == other.object_ && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, contactIdentifier, contactIdentifierType, createdAt, discardedAt, liveMode, object_, updatedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContactDetail{id=$id, contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, createdAt=$createdAt, discardedAt=$discardedAt, liveMode=$liveMode, object_=$object_, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    /** The counterparty's billing address. */
    @NoAutoDetect
    class CounterpartyBillingAddress
    @JsonCreator
    private constructor(
        @JsonProperty("country") private val country: String,
        @JsonProperty("line1") private val line1: String,
        @JsonProperty("locality") private val locality: String,
        @JsonProperty("postal_code") private val postalCode: String,
        @JsonProperty("region") private val region: String,
        @JsonProperty("line2") private val line2: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") fun country(): String = country

        @JsonProperty("line1") fun line1(): String = line1

        /** Locality or City. */
        @JsonProperty("locality") fun locality(): String = locality

        /** The postal code of the address. */
        @JsonProperty("postal_code") fun postalCode(): String = postalCode

        /** Region or State. */
        @JsonProperty("region") fun region(): String = region

        @JsonProperty("line2") fun line2(): String? = line2

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var country: String? = null
            private var line1: String? = null
            private var locality: String? = null
            private var postalCode: String? = null
            private var region: String? = null
            private var line2: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(counterpartyBillingAddress: CounterpartyBillingAddress) = apply {
                country = counterpartyBillingAddress.country
                line1 = counterpartyBillingAddress.line1
                locality = counterpartyBillingAddress.locality
                postalCode = counterpartyBillingAddress.postalCode
                region = counterpartyBillingAddress.region
                line2 = counterpartyBillingAddress.line2
                additionalProperties =
                    counterpartyBillingAddress.additionalProperties.toMutableMap()
            }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = apply { this.country = country }

            fun line1(line1: String) = apply { this.line1 = line1 }

            /** Locality or City. */
            fun locality(locality: String) = apply { this.locality = locality }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String) = apply { this.region = region }

            fun line2(line2: String?) = apply { this.line2 = line2 }

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

            fun build(): CounterpartyBillingAddress =
                CounterpartyBillingAddress(
                    checkNotNull(country) { "`country` is required but was not set" },
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    checkNotNull(locality) { "`locality` is required but was not set" },
                    checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                    checkNotNull(region) { "`region` is required but was not set" },
                    line2,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CounterpartyBillingAddress && country == other.country && line1 == other.line1 && locality == other.locality && postalCode == other.postalCode && region == other.region && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(country, line1, locality, postalCode, region, line2, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CounterpartyBillingAddress{country=$country, line1=$line1, locality=$locality, postalCode=$postalCode, region=$region, line2=$line2, additionalProperties=$additionalProperties}"
    }

    /** The counterparty's shipping address where physical goods should be delivered. */
    @NoAutoDetect
    class CounterpartyShippingAddress
    @JsonCreator
    private constructor(
        @JsonProperty("country") private val country: String,
        @JsonProperty("line1") private val line1: String,
        @JsonProperty("locality") private val locality: String,
        @JsonProperty("postal_code") private val postalCode: String,
        @JsonProperty("region") private val region: String,
        @JsonProperty("line2") private val line2: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") fun country(): String = country

        @JsonProperty("line1") fun line1(): String = line1

        /** Locality or City. */
        @JsonProperty("locality") fun locality(): String = locality

        /** The postal code of the address. */
        @JsonProperty("postal_code") fun postalCode(): String = postalCode

        /** Region or State. */
        @JsonProperty("region") fun region(): String = region

        @JsonProperty("line2") fun line2(): String? = line2

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var country: String? = null
            private var line1: String? = null
            private var locality: String? = null
            private var postalCode: String? = null
            private var region: String? = null
            private var line2: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(counterpartyShippingAddress: CounterpartyShippingAddress) = apply {
                country = counterpartyShippingAddress.country
                line1 = counterpartyShippingAddress.line1
                locality = counterpartyShippingAddress.locality
                postalCode = counterpartyShippingAddress.postalCode
                region = counterpartyShippingAddress.region
                line2 = counterpartyShippingAddress.line2
                additionalProperties =
                    counterpartyShippingAddress.additionalProperties.toMutableMap()
            }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = apply { this.country = country }

            fun line1(line1: String) = apply { this.line1 = line1 }

            /** Locality or City. */
            fun locality(locality: String) = apply { this.locality = locality }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String) = apply { this.region = region }

            fun line2(line2: String?) = apply { this.line2 = line2 }

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

            fun build(): CounterpartyShippingAddress =
                CounterpartyShippingAddress(
                    checkNotNull(country) { "`country` is required but was not set" },
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    checkNotNull(locality) { "`locality` is required but was not set" },
                    checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                    checkNotNull(region) { "`region` is required but was not set" },
                    line2,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CounterpartyShippingAddress && country == other.country && line1 == other.line1 && locality == other.locality && postalCode == other.postalCode && region == other.region && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(country, line1, locality, postalCode, region, line2, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CounterpartyShippingAddress{country=$country, line1=$line1, locality=$locality, postalCode=$postalCode, region=$region, line2=$line2, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class InvoiceLineItemCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("name") private val name: String,
        @JsonProperty("unit_amount") private val unitAmount: Long,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("direction") private val direction: String?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("quantity") private val quantity: Long?,
        @JsonProperty("unit_amount_decimal") private val unitAmountDecimal: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The name of the line item, typically a product or SKU name. */
        @JsonProperty("name") fun name(): String = name

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit.
         */
        @JsonProperty("unit_amount") fun unitAmount(): Long = unitAmount

        /** An optional free-form description of the line item. */
        @JsonProperty("description") fun description(): String? = description

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

        /**
         * The number of units of a product or service that this line item is for. Must be a whole
         * number. Defaults to 1 if not provided.
         */
        @JsonProperty("quantity") fun quantity(): Long? = quantity

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
         */
        @JsonProperty("unit_amount_decimal") fun unitAmountDecimal(): String? = unitAmountDecimal

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var unitAmount: Long? = null
            private var description: String? = null
            private var direction: String? = null
            private var metadata: Metadata? = null
            private var quantity: Long? = null
            private var unitAmountDecimal: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoiceLineItemCreateRequest: InvoiceLineItemCreateRequest) = apply {
                name = invoiceLineItemCreateRequest.name
                unitAmount = invoiceLineItemCreateRequest.unitAmount
                description = invoiceLineItemCreateRequest.description
                direction = invoiceLineItemCreateRequest.direction
                metadata = invoiceLineItemCreateRequest.metadata
                quantity = invoiceLineItemCreateRequest.quantity
                unitAmountDecimal = invoiceLineItemCreateRequest.unitAmountDecimal
                additionalProperties =
                    invoiceLineItemCreateRequest.additionalProperties.toMutableMap()
            }

            /** The name of the line item, typically a product or SKU name. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit.
             */
            fun unitAmount(unitAmount: Long) = apply { this.unitAmount = unitAmount }

            /** An optional free-form description of the line item. */
            fun description(description: String?) = apply { this.description = description }

            /**
             * Either `debit` or `credit`. `debit` indicates that a client owes the business money
             * and increases the invoice's `total_amount` due. `credit` has the opposite intention
             * and effect.
             */
            fun direction(direction: String?) = apply { this.direction = direction }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

            /**
             * The number of units of a product or service that this line item is for. Must be a
             * whole number. Defaults to 1 if not provided.
             */
            fun quantity(quantity: Long?) = apply { this.quantity = quantity }

            /**
             * The number of units of a product or service that this line item is for. Must be a
             * whole number. Defaults to 1 if not provided.
             */
            fun quantity(quantity: Long) = quantity(quantity as Long?)

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
             */
            fun unitAmountDecimal(unitAmountDecimal: String?) = apply {
                this.unitAmountDecimal = unitAmountDecimal
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

            fun build(): InvoiceLineItemCreateRequest =
                InvoiceLineItemCreateRequest(
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                    description,
                    direction,
                    metadata,
                    quantity,
                    unitAmountDecimal,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
                    additionalProperties = metadata.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceLineItemCreateRequest && name == other.name && unitAmount == other.unitAmount && description == other.description && direction == other.direction && metadata == other.metadata && quantity == other.quantity && unitAmountDecimal == other.unitAmountDecimal && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, unitAmount, description, direction, metadata, quantity, unitAmountDecimal, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceLineItemCreateRequest{name=$name, unitAmount=$unitAmount, description=$description, direction=$direction, metadata=$metadata, quantity=$quantity, unitAmountDecimal=$unitAmountDecimal, additionalProperties=$additionalProperties}"
    }

    /** The invoice issuer's business address. */
    @NoAutoDetect
    class InvoicerAddress
    @JsonCreator
    private constructor(
        @JsonProperty("country") private val country: String,
        @JsonProperty("line1") private val line1: String,
        @JsonProperty("locality") private val locality: String,
        @JsonProperty("postal_code") private val postalCode: String,
        @JsonProperty("region") private val region: String,
        @JsonProperty("line2") private val line2: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") fun country(): String = country

        @JsonProperty("line1") fun line1(): String = line1

        /** Locality or City. */
        @JsonProperty("locality") fun locality(): String = locality

        /** The postal code of the address. */
        @JsonProperty("postal_code") fun postalCode(): String = postalCode

        /** Region or State. */
        @JsonProperty("region") fun region(): String = region

        @JsonProperty("line2") fun line2(): String? = line2

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var country: String? = null
            private var line1: String? = null
            private var locality: String? = null
            private var postalCode: String? = null
            private var region: String? = null
            private var line2: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoicerAddress: InvoicerAddress) = apply {
                country = invoicerAddress.country
                line1 = invoicerAddress.line1
                locality = invoicerAddress.locality
                postalCode = invoicerAddress.postalCode
                region = invoicerAddress.region
                line2 = invoicerAddress.line2
                additionalProperties = invoicerAddress.additionalProperties.toMutableMap()
            }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = apply { this.country = country }

            fun line1(line1: String) = apply { this.line1 = line1 }

            /** Locality or City. */
            fun locality(locality: String) = apply { this.locality = locality }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String) = apply { this.region = region }

            fun line2(line2: String?) = apply { this.line2 = line2 }

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

            fun build(): InvoicerAddress =
                InvoicerAddress(
                    checkNotNull(country) { "`country` is required but was not set" },
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    checkNotNull(locality) { "`locality` is required but was not set" },
                    checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                    checkNotNull(region) { "`region` is required but was not set" },
                    line2,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoicerAddress && country == other.country && line1 == other.line1 && locality == other.locality && postalCode == other.postalCode && region == other.region && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(country, line1, locality, postalCode, region, line2, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoicerAddress{country=$country, line1=$line1, locality=$locality, postalCode=$postalCode, region=$region, line2=$line2, additionalProperties=$additionalProperties}"
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

    class PaymentMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val UI = of("ui")

            val MANUAL = of("manual")

            val AUTOMATIC = of("automatic")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InvoiceCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
