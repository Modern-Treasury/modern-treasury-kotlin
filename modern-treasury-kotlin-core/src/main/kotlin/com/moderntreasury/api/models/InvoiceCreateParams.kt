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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

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

            /** The invoicer's contact details displayed at the top of the invoice. */
            fun contactDetails(contactDetails: List<ContactDetail>?) = apply {
                this.contactDetails = contactDetails
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
             * An array of invoice line items. The API supports a maximum of 50 invoice line items
             * per invoice. If a greater number of invoice line items is required, please contact
             * support.
             */
            fun invoiceLineItems(invoiceLineItems: List<InvoiceLineItemCreateRequest>?) = apply {
                this.invoiceLineItems = invoiceLineItems
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
                this.notificationEmailAddresses = notificationEmailAddresses
            }

            /**
             * If true, the invoice will send email notifications to the invoice recipients about
             * invoice status changes.
             */
            fun notificationsEnabled(notificationsEnabled: Boolean?) = apply {
                this.notificationsEnabled = notificationsEnabled
            }

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
                this.remindAfterOverdueDays = remindAfterOverdueDays
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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceCreateParams: InvoiceCreateParams) = apply {
            counterpartyId = invoiceCreateParams.counterpartyId
            dueDate = invoiceCreateParams.dueDate
            originatingAccountId = invoiceCreateParams.originatingAccountId
            autoAdvance = invoiceCreateParams.autoAdvance
            contactDetails = invoiceCreateParams.contactDetails?.toMutableList() ?: mutableListOf()
            counterpartyBillingAddress = invoiceCreateParams.counterpartyBillingAddress
            counterpartyShippingAddress = invoiceCreateParams.counterpartyShippingAddress
            currency = invoiceCreateParams.currency
            description = invoiceCreateParams.description
            fallbackPaymentMethod = invoiceCreateParams.fallbackPaymentMethod
            ingestLedgerEntries = invoiceCreateParams.ingestLedgerEntries
            invoiceLineItems =
                invoiceCreateParams.invoiceLineItems?.toMutableList() ?: mutableListOf()
            invoicerAddress = invoiceCreateParams.invoicerAddress
            ledgerAccountSettlementId = invoiceCreateParams.ledgerAccountSettlementId
            metadata = invoiceCreateParams.metadata
            notificationEmailAddresses =
                invoiceCreateParams.notificationEmailAddresses?.toMutableList() ?: mutableListOf()
            notificationsEnabled = invoiceCreateParams.notificationsEnabled
            paymentEffectiveDate = invoiceCreateParams.paymentEffectiveDate
            paymentMethod = invoiceCreateParams.paymentMethod
            paymentType = invoiceCreateParams.paymentType
            receivingAccountId = invoiceCreateParams.receivingAccountId
            recipientEmail = invoiceCreateParams.recipientEmail
            recipientName = invoiceCreateParams.recipientName
            remindAfterOverdueDays =
                invoiceCreateParams.remindAfterOverdueDays?.toMutableList() ?: mutableListOf()
            virtualAccountId = invoiceCreateParams.virtualAccountId
            additionalHeaders = invoiceCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = invoiceCreateParams.additionalBodyProperties.toMutableMap()
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
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): InvoiceCreateParams =
            InvoiceCreateParams(
                checkNotNull(counterpartyId) { "`counterpartyId` is required but was not set" },
                checkNotNull(dueDate) { "`dueDate` is required but was not set" },
                checkNotNull(originatingAccountId) {
                    "`originatingAccountId` is required but was not set"
                },
                autoAdvance,
                contactDetails.toImmutable().ifEmpty { null },
                counterpartyBillingAddress,
                counterpartyShippingAddress,
                currency,
                description,
                fallbackPaymentMethod,
                ingestLedgerEntries,
                invoiceLineItems.toImmutable().ifEmpty { null },
                invoicerAddress,
                ledgerAccountSettlementId,
                metadata,
                notificationEmailAddresses.toImmutable().ifEmpty { null },
                notificationsEnabled,
                paymentEffectiveDate,
                paymentMethod,
                paymentType,
                receivingAccountId,
                recipientEmail,
                recipientName,
                remindAfterOverdueDays.toImmutable().ifEmpty { null },
                virtualAccountId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class ContactDetail
    @JsonCreator
    private constructor(
        @JsonProperty("id") private val id: String,
        @JsonProperty("object") private val object_: String,
        @JsonProperty("live_mode") private val liveMode: Boolean,
        @JsonProperty("created_at") private val createdAt: OffsetDateTime,
        @JsonProperty("updated_at") private val updatedAt: OffsetDateTime,
        @JsonProperty("discarded_at") private val discardedAt: OffsetDateTime?,
        @JsonProperty("contact_identifier") private val contactIdentifier: String,
        @JsonProperty("contact_identifier_type")
        private val contactIdentifierType: ContactIdentifierType,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("id") fun id(): String = id

        @JsonProperty("object") fun object_(): String = object_

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") fun liveMode(): Boolean = liveMode

        @JsonProperty("created_at") fun createdAt(): OffsetDateTime = createdAt

        @JsonProperty("updated_at") fun updatedAt(): OffsetDateTime = updatedAt

        @JsonProperty("discarded_at") fun discardedAt(): OffsetDateTime? = discardedAt

        @JsonProperty("contact_identifier") fun contactIdentifier(): String = contactIdentifier

        @JsonProperty("contact_identifier_type")
        fun contactIdentifierType(): ContactIdentifierType = contactIdentifierType

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
                id = contactDetail.id
                object_ = contactDetail.object_
                liveMode = contactDetail.liveMode
                createdAt = contactDetail.createdAt
                updatedAt = contactDetail.updatedAt
                discardedAt = contactDetail.discardedAt
                contactIdentifier = contactDetail.contactIdentifier
                contactIdentifierType = contactDetail.contactIdentifierType
                additionalProperties = contactDetail.additionalProperties.toMutableMap()
            }

            fun id(id: String) = apply { this.id = id }

            fun object_(object_: String) = apply { this.object_ = object_ }

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: Boolean) = apply { this.liveMode = liveMode }

            fun createdAt(createdAt: OffsetDateTime) = apply { this.createdAt = createdAt }

            fun updatedAt(updatedAt: OffsetDateTime) = apply { this.updatedAt = updatedAt }

            fun discardedAt(discardedAt: OffsetDateTime?) = apply { this.discardedAt = discardedAt }

            fun contactIdentifier(contactIdentifier: String) = apply {
                this.contactIdentifier = contactIdentifier
            }

            fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) = apply {
                this.contactIdentifierType = contactIdentifierType
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

            return /* spotless:off */ other is ContactDetail && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && discardedAt == other.discardedAt && contactIdentifier == other.contactIdentifier && contactIdentifierType == other.contactIdentifierType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, contactIdentifier, contactIdentifierType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContactDetail{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"
    }

    /** The counterparty's billing address. */
    @NoAutoDetect
    class CounterpartyBillingAddress
    @JsonCreator
    private constructor(
        @JsonProperty("line1") private val line1: String,
        @JsonProperty("line2") private val line2: String?,
        @JsonProperty("locality") private val locality: String,
        @JsonProperty("region") private val region: String,
        @JsonProperty("postal_code") private val postalCode: String,
        @JsonProperty("country") private val country: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("line1") fun line1(): String = line1

        @JsonProperty("line2") fun line2(): String? = line2

        /** Locality or City. */
        @JsonProperty("locality") fun locality(): String = locality

        /** Region or State. */
        @JsonProperty("region") fun region(): String = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") fun postalCode(): String = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") fun country(): String = country

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
                line1 = counterpartyBillingAddress.line1
                line2 = counterpartyBillingAddress.line2
                locality = counterpartyBillingAddress.locality
                region = counterpartyBillingAddress.region
                postalCode = counterpartyBillingAddress.postalCode
                country = counterpartyBillingAddress.country
                additionalProperties =
                    counterpartyBillingAddress.additionalProperties.toMutableMap()
            }

            fun line1(line1: String) = apply { this.line1 = line1 }

            fun line2(line2: String?) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String) = apply { this.locality = locality }

            /** Region or State. */
            fun region(region: String) = apply { this.region = region }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = apply { this.country = country }

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
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    line2,
                    checkNotNull(locality) { "`locality` is required but was not set" },
                    checkNotNull(region) { "`region` is required but was not set" },
                    checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                    checkNotNull(country) { "`country` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CounterpartyBillingAddress && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(line1, line2, locality, region, postalCode, country, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CounterpartyBillingAddress{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
    }

    /** The counterparty's shipping address where physical goods should be delivered. */
    @NoAutoDetect
    class CounterpartyShippingAddress
    @JsonCreator
    private constructor(
        @JsonProperty("line1") private val line1: String,
        @JsonProperty("line2") private val line2: String?,
        @JsonProperty("locality") private val locality: String,
        @JsonProperty("region") private val region: String,
        @JsonProperty("postal_code") private val postalCode: String,
        @JsonProperty("country") private val country: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("line1") fun line1(): String = line1

        @JsonProperty("line2") fun line2(): String? = line2

        /** Locality or City. */
        @JsonProperty("locality") fun locality(): String = locality

        /** Region or State. */
        @JsonProperty("region") fun region(): String = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") fun postalCode(): String = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") fun country(): String = country

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
                line1 = counterpartyShippingAddress.line1
                line2 = counterpartyShippingAddress.line2
                locality = counterpartyShippingAddress.locality
                region = counterpartyShippingAddress.region
                postalCode = counterpartyShippingAddress.postalCode
                country = counterpartyShippingAddress.country
                additionalProperties =
                    counterpartyShippingAddress.additionalProperties.toMutableMap()
            }

            fun line1(line1: String) = apply { this.line1 = line1 }

            fun line2(line2: String?) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String) = apply { this.locality = locality }

            /** Region or State. */
            fun region(region: String) = apply { this.region = region }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = apply { this.country = country }

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
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    line2,
                    checkNotNull(locality) { "`locality` is required but was not set" },
                    checkNotNull(region) { "`region` is required but was not set" },
                    checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                    checkNotNull(country) { "`country` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CounterpartyShippingAddress && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(line1, line2, locality, region, postalCode, country, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CounterpartyShippingAddress{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class InvoiceLineItemCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("name") private val name: String,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("quantity") private val quantity: Long?,
        @JsonProperty("unit_amount") private val unitAmount: Long,
        @JsonProperty("unit_amount_decimal") private val unitAmountDecimal: String?,
        @JsonProperty("direction") private val direction: String?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The name of the line item, typically a product or SKU name. */
        @JsonProperty("name") fun name(): String = name

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
        @JsonProperty("unit_amount") fun unitAmount(): Long = unitAmount

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
                name = invoiceLineItemCreateRequest.name
                description = invoiceLineItemCreateRequest.description
                quantity = invoiceLineItemCreateRequest.quantity
                unitAmount = invoiceLineItemCreateRequest.unitAmount
                unitAmountDecimal = invoiceLineItemCreateRequest.unitAmountDecimal
                direction = invoiceLineItemCreateRequest.direction
                metadata = invoiceLineItemCreateRequest.metadata
                additionalProperties =
                    invoiceLineItemCreateRequest.additionalProperties.toMutableMap()
            }

            /** The name of the line item, typically a product or SKU name. */
            fun name(name: String) = apply { this.name = name }

            /** An optional free-form description of the line item. */
            fun description(description: String?) = apply { this.description = description }

            /**
             * The number of units of a product or service that this line item is for. Must be a
             * whole number. Defaults to 1 if not provided.
             */
            fun quantity(quantity: Long?) = apply { this.quantity = quantity }

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit.
             */
            fun unitAmount(unitAmount: Long) = apply { this.unitAmount = unitAmount }

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
             */
            fun unitAmountDecimal(unitAmountDecimal: String?) = apply {
                this.unitAmountDecimal = unitAmountDecimal
            }

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
                    description,
                    quantity,
                    checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                    unitAmountDecimal,
                    direction,
                    metadata,
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

            return /* spotless:off */ other is InvoiceLineItemCreateRequest && name == other.name && description == other.description && quantity == other.quantity && unitAmount == other.unitAmount && unitAmountDecimal == other.unitAmountDecimal && direction == other.direction && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, description, quantity, unitAmount, unitAmountDecimal, direction, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceLineItemCreateRequest{name=$name, description=$description, quantity=$quantity, unitAmount=$unitAmount, unitAmountDecimal=$unitAmountDecimal, direction=$direction, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    /** The invoice issuer's business address. */
    @NoAutoDetect
    class InvoicerAddress
    @JsonCreator
    private constructor(
        @JsonProperty("line1") private val line1: String,
        @JsonProperty("line2") private val line2: String?,
        @JsonProperty("locality") private val locality: String,
        @JsonProperty("region") private val region: String,
        @JsonProperty("postal_code") private val postalCode: String,
        @JsonProperty("country") private val country: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("line1") fun line1(): String = line1

        @JsonProperty("line2") fun line2(): String? = line2

        /** Locality or City. */
        @JsonProperty("locality") fun locality(): String = locality

        /** Region or State. */
        @JsonProperty("region") fun region(): String = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") fun postalCode(): String = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") fun country(): String = country

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
                line1 = invoicerAddress.line1
                line2 = invoicerAddress.line2
                locality = invoicerAddress.locality
                region = invoicerAddress.region
                postalCode = invoicerAddress.postalCode
                country = invoicerAddress.country
                additionalProperties = invoicerAddress.additionalProperties.toMutableMap()
            }

            fun line1(line1: String) = apply { this.line1 = line1 }

            fun line2(line2: String?) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String) = apply { this.locality = locality }

            /** Region or State. */
            fun region(region: String) = apply { this.region = region }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = apply { this.country = country }

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
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    line2,
                    checkNotNull(locality) { "`locality` is required but was not set" },
                    checkNotNull(region) { "`region` is required but was not set" },
                    checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                    checkNotNull(country) { "`country` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoicerAddress && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(line1, line2, locality, region, postalCode, country, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoicerAddress{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is InvoiceCreateParams && counterpartyId == other.counterpartyId && dueDate == other.dueDate && originatingAccountId == other.originatingAccountId && autoAdvance == other.autoAdvance && contactDetails == other.contactDetails && counterpartyBillingAddress == other.counterpartyBillingAddress && counterpartyShippingAddress == other.counterpartyShippingAddress && currency == other.currency && description == other.description && fallbackPaymentMethod == other.fallbackPaymentMethod && ingestLedgerEntries == other.ingestLedgerEntries && invoiceLineItems == other.invoiceLineItems && invoicerAddress == other.invoicerAddress && ledgerAccountSettlementId == other.ledgerAccountSettlementId && metadata == other.metadata && notificationEmailAddresses == other.notificationEmailAddresses && notificationsEnabled == other.notificationsEnabled && paymentEffectiveDate == other.paymentEffectiveDate && paymentMethod == other.paymentMethod && paymentType == other.paymentType && receivingAccountId == other.receivingAccountId && recipientEmail == other.recipientEmail && recipientName == other.recipientName && remindAfterOverdueDays == other.remindAfterOverdueDays && virtualAccountId == other.virtualAccountId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(counterpartyId, dueDate, originatingAccountId, autoAdvance, contactDetails, counterpartyBillingAddress, counterpartyShippingAddress, currency, description, fallbackPaymentMethod, ingestLedgerEntries, invoiceLineItems, invoicerAddress, ledgerAccountSettlementId, metadata, notificationEmailAddresses, notificationsEnabled, paymentEffectiveDate, paymentMethod, paymentType, receivingAccountId, recipientEmail, recipientName, remindAfterOverdueDays, virtualAccountId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "InvoiceCreateParams{counterpartyId=$counterpartyId, dueDate=$dueDate, originatingAccountId=$originatingAccountId, autoAdvance=$autoAdvance, contactDetails=$contactDetails, counterpartyBillingAddress=$counterpartyBillingAddress, counterpartyShippingAddress=$counterpartyShippingAddress, currency=$currency, description=$description, fallbackPaymentMethod=$fallbackPaymentMethod, ingestLedgerEntries=$ingestLedgerEntries, invoiceLineItems=$invoiceLineItems, invoicerAddress=$invoicerAddress, ledgerAccountSettlementId=$ledgerAccountSettlementId, metadata=$metadata, notificationEmailAddresses=$notificationEmailAddresses, notificationsEnabled=$notificationsEnabled, paymentEffectiveDate=$paymentEffectiveDate, paymentMethod=$paymentMethod, paymentType=$paymentType, receivingAccountId=$receivingAccountId, recipientEmail=$recipientEmail, recipientName=$recipientName, remindAfterOverdueDays=$remindAfterOverdueDays, virtualAccountId=$virtualAccountId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
