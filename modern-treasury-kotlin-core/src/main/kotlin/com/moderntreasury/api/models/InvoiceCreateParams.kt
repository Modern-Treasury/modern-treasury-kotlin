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
import java.time.OffsetDateTime
import java.util.Objects

/** create invoice */
class InvoiceCreateParams
private constructor(
    private val body: InvoiceCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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

    /** The ID of the counterparty receiving the invoice. */
    fun _counterpartyId(): JsonField<String> = body._counterpartyId()

    /** A future date by when the invoice needs to be paid. */
    fun _dueDate(): JsonField<OffsetDateTime> = body._dueDate()

    /** The ID of the internal account the invoice should be paid to. */
    fun _originatingAccountId(): JsonField<String> = body._originatingAccountId()

    /**
     * When true, the invoice will progress to unpaid automatically and cannot be edited after
     * entering that state. If the invoice fails to progress to unpaid, the errors will be returned
     * and the invoice will not be created.
     */
    fun _autoAdvance(): JsonField<Boolean> = body._autoAdvance()

    /** The invoicer's contact details displayed at the top of the invoice. */
    fun _contactDetails(): JsonField<List<ContactDetail>> = body._contactDetails()

    /** The counterparty's billing address. */
    fun _counterpartyBillingAddress(): JsonField<CounterpartyBillingAddress> =
        body._counterpartyBillingAddress()

    /** The counterparty's shipping address where physical goods should be delivered. */
    fun _counterpartyShippingAddress(): JsonField<CounterpartyShippingAddress> =
        body._counterpartyShippingAddress()

    /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
    fun _currency(): JsonField<Currency> = body._currency()

    /** A free-form description of the invoice. */
    fun _description(): JsonField<String> = body._description()

    /**
     * When payment_method is automatic, the fallback payment method to use when an automatic
     * payment fails. One of `manual` or `ui`.
     */
    fun _fallbackPaymentMethod(): JsonField<String> = body._fallbackPaymentMethod()

    /**
     * Whether to ingest the ledger_entries to populate the invoice line items. If this is false,
     * then a line item must be provided. If this is true, line_items must be empty. Ignored if
     * ledger_account_settlement_id is empty.
     */
    fun _ingestLedgerEntries(): JsonField<Boolean> = body._ingestLedgerEntries()

    /**
     * An array of invoice line items. The API supports a maximum of 50 invoice line items per
     * invoice. If a greater number of invoice line items is required, please contact support.
     */
    fun _invoiceLineItems(): JsonField<List<InvoiceLineItemCreateRequest>> =
        body._invoiceLineItems()

    /** The invoice issuer's business address. */
    fun _invoicerAddress(): JsonField<InvoicerAddress> = body._invoicerAddress()

    /** The ID of the virtual account the invoice should be paid to. */
    fun _ledgerAccountSettlementId(): JsonField<String> = body._ledgerAccountSettlementId()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Emails in addition to the counterparty email to send invoice status notifications to. At
     * least one email is required if notifications are enabled and the counterparty doesn't have an
     * email.
     */
    fun _notificationEmailAddresses(): JsonField<List<String>> = body._notificationEmailAddresses()

    /**
     * If true, the invoice will send email notifications to the invoice recipients about invoice
     * status changes.
     */
    fun _notificationsEnabled(): JsonField<Boolean> = body._notificationsEnabled()

    /**
     * Date transactions are to be posted to the participants' account. Defaults to the current
     * business day or the next business day if the current day is a bank holiday or weekend.
     * Format: yyyy-mm-dd.
     */
    fun _paymentEffectiveDate(): JsonField<LocalDate> = body._paymentEffectiveDate()

    /**
     * The method by which the invoice can be paid. `ui` will show the embedded payment collection
     * flow. `automatic` will automatically initiate payment based upon the account details of the
     * receiving_account id.\nIf the invoice amount is positive, the automatically initiated payment
     * order's direction will be debit. If the invoice amount is negative, the automatically
     * initiated payment order's direction will be credit. One of `manual`, `ui`, or `automatic`.
     */
    fun _paymentMethod(): JsonField<PaymentMethod> = body._paymentMethod()

    /**
     * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`,
     * `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`, `signet`,
     * `provexchange`, `zengin`.
     */
    fun _paymentType(): JsonField<PaymentOrderType> = body._paymentType()

    /** The receiving account ID. Can be an `external_account`. */
    fun _receivingAccountId(): JsonField<String> = body._receivingAccountId()

    /**
     * The email of the recipient of the invoice. Leaving this value as null will fallback to using
     * the counterparty's name.
     */
    fun _recipientEmail(): JsonField<String> = body._recipientEmail()

    /**
     * The name of the recipient of the invoice. Leaving this value as null will fallback to using
     * the counterparty's name.
     */
    fun _recipientName(): JsonField<String> = body._recipientName()

    /**
     * Number of days after due date when overdue reminder emails will be sent out to invoice
     * recipients.
     */
    fun _remindAfterOverdueDays(): JsonField<List<Long>> = body._remindAfterOverdueDays()

    /** The ID of the virtual account the invoice should be paid to. */
    fun _virtualAccountId(): JsonField<String> = body._virtualAccountId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): InvoiceCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class InvoiceCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        private val counterpartyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("due_date")
        @ExcludeMissing
        private val dueDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("originating_account_id")
        @ExcludeMissing
        private val originatingAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("auto_advance")
        @ExcludeMissing
        private val autoAdvance: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("contact_details")
        @ExcludeMissing
        private val contactDetails: JsonField<List<ContactDetail>> = JsonMissing.of(),
        @JsonProperty("counterparty_billing_address")
        @ExcludeMissing
        private val counterpartyBillingAddress: JsonField<CounterpartyBillingAddress> =
            JsonMissing.of(),
        @JsonProperty("counterparty_shipping_address")
        @ExcludeMissing
        private val counterpartyShippingAddress: JsonField<CounterpartyShippingAddress> =
            JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fallback_payment_method")
        @ExcludeMissing
        private val fallbackPaymentMethod: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ingest_ledger_entries")
        @ExcludeMissing
        private val ingestLedgerEntries: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("invoice_line_items")
        @ExcludeMissing
        private val invoiceLineItems: JsonField<List<InvoiceLineItemCreateRequest>> =
            JsonMissing.of(),
        @JsonProperty("invoicer_address")
        @ExcludeMissing
        private val invoicerAddress: JsonField<InvoicerAddress> = JsonMissing.of(),
        @JsonProperty("ledger_account_settlement_id")
        @ExcludeMissing
        private val ledgerAccountSettlementId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("notification_email_addresses")
        @ExcludeMissing
        private val notificationEmailAddresses: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("notifications_enabled")
        @ExcludeMissing
        private val notificationsEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("payment_effective_date")
        @ExcludeMissing
        private val paymentEffectiveDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("payment_method")
        @ExcludeMissing
        private val paymentMethod: JsonField<PaymentMethod> = JsonMissing.of(),
        @JsonProperty("payment_type")
        @ExcludeMissing
        private val paymentType: JsonField<PaymentOrderType> = JsonMissing.of(),
        @JsonProperty("receiving_account_id")
        @ExcludeMissing
        private val receivingAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_email")
        @ExcludeMissing
        private val recipientEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_name")
        @ExcludeMissing
        private val recipientName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remind_after_overdue_days")
        @ExcludeMissing
        private val remindAfterOverdueDays: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("virtual_account_id")
        @ExcludeMissing
        private val virtualAccountId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The ID of the counterparty receiving the invoice. */
        fun counterpartyId(): String = counterpartyId.getRequired("counterparty_id")

        /** A future date by when the invoice needs to be paid. */
        fun dueDate(): OffsetDateTime = dueDate.getRequired("due_date")

        /** The ID of the internal account the invoice should be paid to. */
        fun originatingAccountId(): String =
            originatingAccountId.getRequired("originating_account_id")

        /**
         * When true, the invoice will progress to unpaid automatically and cannot be edited after
         * entering that state. If the invoice fails to progress to unpaid, the errors will be
         * returned and the invoice will not be created.
         */
        fun autoAdvance(): Boolean? = autoAdvance.getNullable("auto_advance")

        /** The invoicer's contact details displayed at the top of the invoice. */
        fun contactDetails(): List<ContactDetail>? = contactDetails.getNullable("contact_details")

        /** The counterparty's billing address. */
        fun counterpartyBillingAddress(): CounterpartyBillingAddress? =
            counterpartyBillingAddress.getNullable("counterparty_billing_address")

        /** The counterparty's shipping address where physical goods should be delivered. */
        fun counterpartyShippingAddress(): CounterpartyShippingAddress? =
            counterpartyShippingAddress.getNullable("counterparty_shipping_address")

        /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
        fun currency(): Currency? = currency.getNullable("currency")

        /** A free-form description of the invoice. */
        fun description(): String? = description.getNullable("description")

        /**
         * When payment_method is automatic, the fallback payment method to use when an automatic
         * payment fails. One of `manual` or `ui`.
         */
        fun fallbackPaymentMethod(): String? =
            fallbackPaymentMethod.getNullable("fallback_payment_method")

        /**
         * Whether to ingest the ledger_entries to populate the invoice line items. If this is
         * false, then a line item must be provided. If this is true, line_items must be empty.
         * Ignored if ledger_account_settlement_id is empty.
         */
        fun ingestLedgerEntries(): Boolean? =
            ingestLedgerEntries.getNullable("ingest_ledger_entries")

        /**
         * An array of invoice line items. The API supports a maximum of 50 invoice line items per
         * invoice. If a greater number of invoice line items is required, please contact support.
         */
        fun invoiceLineItems(): List<InvoiceLineItemCreateRequest>? =
            invoiceLineItems.getNullable("invoice_line_items")

        /** The invoice issuer's business address. */
        fun invoicerAddress(): InvoicerAddress? = invoicerAddress.getNullable("invoicer_address")

        /** The ID of the virtual account the invoice should be paid to. */
        fun ledgerAccountSettlementId(): String? =
            ledgerAccountSettlementId.getNullable("ledger_account_settlement_id")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * Emails in addition to the counterparty email to send invoice status notifications to. At
         * least one email is required if notifications are enabled and the counterparty doesn't
         * have an email.
         */
        fun notificationEmailAddresses(): List<String>? =
            notificationEmailAddresses.getNullable("notification_email_addresses")

        /**
         * If true, the invoice will send email notifications to the invoice recipients about
         * invoice status changes.
         */
        fun notificationsEnabled(): Boolean? =
            notificationsEnabled.getNullable("notifications_enabled")

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        fun paymentEffectiveDate(): LocalDate? =
            paymentEffectiveDate.getNullable("payment_effective_date")

        /**
         * The method by which the invoice can be paid. `ui` will show the embedded payment
         * collection flow. `automatic` will automatically initiate payment based upon the account
         * details of the receiving_account id.\nIf the invoice amount is positive, the
         * automatically initiated payment order's direction will be debit. If the invoice amount is
         * negative, the automatically initiated payment order's direction will be credit. One of
         * `manual`, `ui`, or `automatic`.
         */
        fun paymentMethod(): PaymentMethod? = paymentMethod.getNullable("payment_method")

        /**
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         */
        fun paymentType(): PaymentOrderType? = paymentType.getNullable("payment_type")

        /** The receiving account ID. Can be an `external_account`. */
        fun receivingAccountId(): String? = receivingAccountId.getNullable("receiving_account_id")

        /**
         * The email of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        fun recipientEmail(): String? = recipientEmail.getNullable("recipient_email")

        /**
         * The name of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        fun recipientName(): String? = recipientName.getNullable("recipient_name")

        /**
         * Number of days after due date when overdue reminder emails will be sent out to invoice
         * recipients.
         */
        fun remindAfterOverdueDays(): List<Long>? =
            remindAfterOverdueDays.getNullable("remind_after_overdue_days")

        /** The ID of the virtual account the invoice should be paid to. */
        fun virtualAccountId(): String? = virtualAccountId.getNullable("virtual_account_id")

        /** The ID of the counterparty receiving the invoice. */
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        fun _counterpartyId(): JsonField<String> = counterpartyId

        /** A future date by when the invoice needs to be paid. */
        @JsonProperty("due_date")
        @ExcludeMissing
        fun _dueDate(): JsonField<OffsetDateTime> = dueDate

        /** The ID of the internal account the invoice should be paid to. */
        @JsonProperty("originating_account_id")
        @ExcludeMissing
        fun _originatingAccountId(): JsonField<String> = originatingAccountId

        /**
         * When true, the invoice will progress to unpaid automatically and cannot be edited after
         * entering that state. If the invoice fails to progress to unpaid, the errors will be
         * returned and the invoice will not be created.
         */
        @JsonProperty("auto_advance")
        @ExcludeMissing
        fun _autoAdvance(): JsonField<Boolean> = autoAdvance

        /** The invoicer's contact details displayed at the top of the invoice. */
        @JsonProperty("contact_details")
        @ExcludeMissing
        fun _contactDetails(): JsonField<List<ContactDetail>> = contactDetails

        /** The counterparty's billing address. */
        @JsonProperty("counterparty_billing_address")
        @ExcludeMissing
        fun _counterpartyBillingAddress(): JsonField<CounterpartyBillingAddress> =
            counterpartyBillingAddress

        /** The counterparty's shipping address where physical goods should be delivered. */
        @JsonProperty("counterparty_shipping_address")
        @ExcludeMissing
        fun _counterpartyShippingAddress(): JsonField<CounterpartyShippingAddress> =
            counterpartyShippingAddress

        /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /** A free-form description of the invoice. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * When payment_method is automatic, the fallback payment method to use when an automatic
         * payment fails. One of `manual` or `ui`.
         */
        @JsonProperty("fallback_payment_method")
        @ExcludeMissing
        fun _fallbackPaymentMethod(): JsonField<String> = fallbackPaymentMethod

        /**
         * Whether to ingest the ledger_entries to populate the invoice line items. If this is
         * false, then a line item must be provided. If this is true, line_items must be empty.
         * Ignored if ledger_account_settlement_id is empty.
         */
        @JsonProperty("ingest_ledger_entries")
        @ExcludeMissing
        fun _ingestLedgerEntries(): JsonField<Boolean> = ingestLedgerEntries

        /**
         * An array of invoice line items. The API supports a maximum of 50 invoice line items per
         * invoice. If a greater number of invoice line items is required, please contact support.
         */
        @JsonProperty("invoice_line_items")
        @ExcludeMissing
        fun _invoiceLineItems(): JsonField<List<InvoiceLineItemCreateRequest>> = invoiceLineItems

        /** The invoice issuer's business address. */
        @JsonProperty("invoicer_address")
        @ExcludeMissing
        fun _invoicerAddress(): JsonField<InvoicerAddress> = invoicerAddress

        /** The ID of the virtual account the invoice should be paid to. */
        @JsonProperty("ledger_account_settlement_id")
        @ExcludeMissing
        fun _ledgerAccountSettlementId(): JsonField<String> = ledgerAccountSettlementId

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Emails in addition to the counterparty email to send invoice status notifications to. At
         * least one email is required if notifications are enabled and the counterparty doesn't
         * have an email.
         */
        @JsonProperty("notification_email_addresses")
        @ExcludeMissing
        fun _notificationEmailAddresses(): JsonField<List<String>> = notificationEmailAddresses

        /**
         * If true, the invoice will send email notifications to the invoice recipients about
         * invoice status changes.
         */
        @JsonProperty("notifications_enabled")
        @ExcludeMissing
        fun _notificationsEnabled(): JsonField<Boolean> = notificationsEnabled

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        @JsonProperty("payment_effective_date")
        @ExcludeMissing
        fun _paymentEffectiveDate(): JsonField<LocalDate> = paymentEffectiveDate

        /**
         * The method by which the invoice can be paid. `ui` will show the embedded payment
         * collection flow. `automatic` will automatically initiate payment based upon the account
         * details of the receiving_account id.\nIf the invoice amount is positive, the
         * automatically initiated payment order's direction will be debit. If the invoice amount is
         * negative, the automatically initiated payment order's direction will be credit. One of
         * `manual`, `ui`, or `automatic`.
         */
        @JsonProperty("payment_method")
        @ExcludeMissing
        fun _paymentMethod(): JsonField<PaymentMethod> = paymentMethod

        /**
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         */
        @JsonProperty("payment_type")
        @ExcludeMissing
        fun _paymentType(): JsonField<PaymentOrderType> = paymentType

        /** The receiving account ID. Can be an `external_account`. */
        @JsonProperty("receiving_account_id")
        @ExcludeMissing
        fun _receivingAccountId(): JsonField<String> = receivingAccountId

        /**
         * The email of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        @JsonProperty("recipient_email")
        @ExcludeMissing
        fun _recipientEmail(): JsonField<String> = recipientEmail

        /**
         * The name of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        @JsonProperty("recipient_name")
        @ExcludeMissing
        fun _recipientName(): JsonField<String> = recipientName

        /**
         * Number of days after due date when overdue reminder emails will be sent out to invoice
         * recipients.
         */
        @JsonProperty("remind_after_overdue_days")
        @ExcludeMissing
        fun _remindAfterOverdueDays(): JsonField<List<Long>> = remindAfterOverdueDays

        /** The ID of the virtual account the invoice should be paid to. */
        @JsonProperty("virtual_account_id")
        @ExcludeMissing
        fun _virtualAccountId(): JsonField<String> = virtualAccountId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InvoiceCreateBody = apply {
            if (validated) {
                return@apply
            }

            counterpartyId()
            dueDate()
            originatingAccountId()
            autoAdvance()
            contactDetails()?.forEach { it.validate() }
            counterpartyBillingAddress()?.validate()
            counterpartyShippingAddress()?.validate()
            currency()
            description()
            fallbackPaymentMethod()
            ingestLedgerEntries()
            invoiceLineItems()?.forEach { it.validate() }
            invoicerAddress()?.validate()
            ledgerAccountSettlementId()
            metadata()?.validate()
            notificationEmailAddresses()
            notificationsEnabled()
            paymentEffectiveDate()
            paymentMethod()
            paymentType()
            receivingAccountId()
            recipientEmail()
            recipientName()
            remindAfterOverdueDays()
            virtualAccountId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [InvoiceCreateBody]. */
        class Builder internal constructor() {

            private var counterpartyId: JsonField<String>? = null
            private var dueDate: JsonField<OffsetDateTime>? = null
            private var originatingAccountId: JsonField<String>? = null
            private var autoAdvance: JsonField<Boolean> = JsonMissing.of()
            private var contactDetails: JsonField<MutableList<ContactDetail>>? = null
            private var counterpartyBillingAddress: JsonField<CounterpartyBillingAddress> =
                JsonMissing.of()
            private var counterpartyShippingAddress: JsonField<CounterpartyShippingAddress> =
                JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var fallbackPaymentMethod: JsonField<String> = JsonMissing.of()
            private var ingestLedgerEntries: JsonField<Boolean> = JsonMissing.of()
            private var invoiceLineItems: JsonField<MutableList<InvoiceLineItemCreateRequest>>? =
                null
            private var invoicerAddress: JsonField<InvoicerAddress> = JsonMissing.of()
            private var ledgerAccountSettlementId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var notificationEmailAddresses: JsonField<MutableList<String>>? = null
            private var notificationsEnabled: JsonField<Boolean> = JsonMissing.of()
            private var paymentEffectiveDate: JsonField<LocalDate> = JsonMissing.of()
            private var paymentMethod: JsonField<PaymentMethod> = JsonMissing.of()
            private var paymentType: JsonField<PaymentOrderType> = JsonMissing.of()
            private var receivingAccountId: JsonField<String> = JsonMissing.of()
            private var recipientEmail: JsonField<String> = JsonMissing.of()
            private var recipientName: JsonField<String> = JsonMissing.of()
            private var remindAfterOverdueDays: JsonField<MutableList<Long>>? = null
            private var virtualAccountId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoiceCreateBody: InvoiceCreateBody) = apply {
                counterpartyId = invoiceCreateBody.counterpartyId
                dueDate = invoiceCreateBody.dueDate
                originatingAccountId = invoiceCreateBody.originatingAccountId
                autoAdvance = invoiceCreateBody.autoAdvance
                contactDetails = invoiceCreateBody.contactDetails.map { it.toMutableList() }
                counterpartyBillingAddress = invoiceCreateBody.counterpartyBillingAddress
                counterpartyShippingAddress = invoiceCreateBody.counterpartyShippingAddress
                currency = invoiceCreateBody.currency
                description = invoiceCreateBody.description
                fallbackPaymentMethod = invoiceCreateBody.fallbackPaymentMethod
                ingestLedgerEntries = invoiceCreateBody.ingestLedgerEntries
                invoiceLineItems = invoiceCreateBody.invoiceLineItems.map { it.toMutableList() }
                invoicerAddress = invoiceCreateBody.invoicerAddress
                ledgerAccountSettlementId = invoiceCreateBody.ledgerAccountSettlementId
                metadata = invoiceCreateBody.metadata
                notificationEmailAddresses =
                    invoiceCreateBody.notificationEmailAddresses.map { it.toMutableList() }
                notificationsEnabled = invoiceCreateBody.notificationsEnabled
                paymentEffectiveDate = invoiceCreateBody.paymentEffectiveDate
                paymentMethod = invoiceCreateBody.paymentMethod
                paymentType = invoiceCreateBody.paymentType
                receivingAccountId = invoiceCreateBody.receivingAccountId
                recipientEmail = invoiceCreateBody.recipientEmail
                recipientName = invoiceCreateBody.recipientName
                remindAfterOverdueDays =
                    invoiceCreateBody.remindAfterOverdueDays.map { it.toMutableList() }
                virtualAccountId = invoiceCreateBody.virtualAccountId
                additionalProperties = invoiceCreateBody.additionalProperties.toMutableMap()
            }

            /** The ID of the counterparty receiving the invoice. */
            fun counterpartyId(counterpartyId: String) =
                counterpartyId(JsonField.of(counterpartyId))

            /** The ID of the counterparty receiving the invoice. */
            fun counterpartyId(counterpartyId: JsonField<String>) = apply {
                this.counterpartyId = counterpartyId
            }

            /** A future date by when the invoice needs to be paid. */
            fun dueDate(dueDate: OffsetDateTime) = dueDate(JsonField.of(dueDate))

            /** A future date by when the invoice needs to be paid. */
            fun dueDate(dueDate: JsonField<OffsetDateTime>) = apply { this.dueDate = dueDate }

            /** The ID of the internal account the invoice should be paid to. */
            fun originatingAccountId(originatingAccountId: String) =
                originatingAccountId(JsonField.of(originatingAccountId))

            /** The ID of the internal account the invoice should be paid to. */
            fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
                this.originatingAccountId = originatingAccountId
            }

            /**
             * When true, the invoice will progress to unpaid automatically and cannot be edited
             * after entering that state. If the invoice fails to progress to unpaid, the errors
             * will be returned and the invoice will not be created.
             */
            fun autoAdvance(autoAdvance: Boolean?) = autoAdvance(JsonField.ofNullable(autoAdvance))

            /**
             * When true, the invoice will progress to unpaid automatically and cannot be edited
             * after entering that state. If the invoice fails to progress to unpaid, the errors
             * will be returned and the invoice will not be created.
             */
            fun autoAdvance(autoAdvance: Boolean) = autoAdvance(autoAdvance as Boolean?)

            /**
             * When true, the invoice will progress to unpaid automatically and cannot be edited
             * after entering that state. If the invoice fails to progress to unpaid, the errors
             * will be returned and the invoice will not be created.
             */
            fun autoAdvance(autoAdvance: JsonField<Boolean>) = apply {
                this.autoAdvance = autoAdvance
            }

            /** The invoicer's contact details displayed at the top of the invoice. */
            fun contactDetails(contactDetails: List<ContactDetail>) =
                contactDetails(JsonField.of(contactDetails))

            /** The invoicer's contact details displayed at the top of the invoice. */
            fun contactDetails(contactDetails: JsonField<List<ContactDetail>>) = apply {
                this.contactDetails = contactDetails.map { it.toMutableList() }
            }

            /** The invoicer's contact details displayed at the top of the invoice. */
            fun addContactDetail(contactDetail: ContactDetail) = apply {
                contactDetails =
                    (contactDetails ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(contactDetail)
                    }
            }

            /** The counterparty's billing address. */
            fun counterpartyBillingAddress(
                counterpartyBillingAddress: CounterpartyBillingAddress?
            ) = counterpartyBillingAddress(JsonField.ofNullable(counterpartyBillingAddress))

            /** The counterparty's billing address. */
            fun counterpartyBillingAddress(
                counterpartyBillingAddress: JsonField<CounterpartyBillingAddress>
            ) = apply { this.counterpartyBillingAddress = counterpartyBillingAddress }

            /** The counterparty's shipping address where physical goods should be delivered. */
            fun counterpartyShippingAddress(
                counterpartyShippingAddress: CounterpartyShippingAddress?
            ) = counterpartyShippingAddress(JsonField.ofNullable(counterpartyShippingAddress))

            /** The counterparty's shipping address where physical goods should be delivered. */
            fun counterpartyShippingAddress(
                counterpartyShippingAddress: JsonField<CounterpartyShippingAddress>
            ) = apply { this.counterpartyShippingAddress = counterpartyShippingAddress }

            /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** A free-form description of the invoice. */
            fun description(description: String) = description(JsonField.of(description))

            /** A free-form description of the invoice. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * When payment_method is automatic, the fallback payment method to use when an
             * automatic payment fails. One of `manual` or `ui`.
             */
            fun fallbackPaymentMethod(fallbackPaymentMethod: String?) =
                fallbackPaymentMethod(JsonField.ofNullable(fallbackPaymentMethod))

            /**
             * When payment_method is automatic, the fallback payment method to use when an
             * automatic payment fails. One of `manual` or `ui`.
             */
            fun fallbackPaymentMethod(fallbackPaymentMethod: JsonField<String>) = apply {
                this.fallbackPaymentMethod = fallbackPaymentMethod
            }

            /**
             * Whether to ingest the ledger_entries to populate the invoice line items. If this is
             * false, then a line item must be provided. If this is true, line_items must be empty.
             * Ignored if ledger_account_settlement_id is empty.
             */
            fun ingestLedgerEntries(ingestLedgerEntries: Boolean?) =
                ingestLedgerEntries(JsonField.ofNullable(ingestLedgerEntries))

            /**
             * Whether to ingest the ledger_entries to populate the invoice line items. If this is
             * false, then a line item must be provided. If this is true, line_items must be empty.
             * Ignored if ledger_account_settlement_id is empty.
             */
            fun ingestLedgerEntries(ingestLedgerEntries: Boolean) =
                ingestLedgerEntries(ingestLedgerEntries as Boolean?)

            /**
             * Whether to ingest the ledger_entries to populate the invoice line items. If this is
             * false, then a line item must be provided. If this is true, line_items must be empty.
             * Ignored if ledger_account_settlement_id is empty.
             */
            fun ingestLedgerEntries(ingestLedgerEntries: JsonField<Boolean>) = apply {
                this.ingestLedgerEntries = ingestLedgerEntries
            }

            /**
             * An array of invoice line items. The API supports a maximum of 50 invoice line items
             * per invoice. If a greater number of invoice line items is required, please contact
             * support.
             */
            fun invoiceLineItems(invoiceLineItems: List<InvoiceLineItemCreateRequest>?) =
                invoiceLineItems(JsonField.ofNullable(invoiceLineItems))

            /**
             * An array of invoice line items. The API supports a maximum of 50 invoice line items
             * per invoice. If a greater number of invoice line items is required, please contact
             * support.
             */
            fun invoiceLineItems(invoiceLineItems: JsonField<List<InvoiceLineItemCreateRequest>>) =
                apply {
                    this.invoiceLineItems = invoiceLineItems.map { it.toMutableList() }
                }

            /**
             * An array of invoice line items. The API supports a maximum of 50 invoice line items
             * per invoice. If a greater number of invoice line items is required, please contact
             * support.
             */
            fun addInvoiceLineItem(invoiceLineItem: InvoiceLineItemCreateRequest) = apply {
                invoiceLineItems =
                    (invoiceLineItems ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(invoiceLineItem)
                    }
            }

            /** The invoice issuer's business address. */
            fun invoicerAddress(invoicerAddress: InvoicerAddress?) =
                invoicerAddress(JsonField.ofNullable(invoicerAddress))

            /** The invoice issuer's business address. */
            fun invoicerAddress(invoicerAddress: JsonField<InvoicerAddress>) = apply {
                this.invoicerAddress = invoicerAddress
            }

            /** The ID of the virtual account the invoice should be paid to. */
            fun ledgerAccountSettlementId(ledgerAccountSettlementId: String?) =
                ledgerAccountSettlementId(JsonField.ofNullable(ledgerAccountSettlementId))

            /** The ID of the virtual account the invoice should be paid to. */
            fun ledgerAccountSettlementId(ledgerAccountSettlementId: JsonField<String>) = apply {
                this.ledgerAccountSettlementId = ledgerAccountSettlementId
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * Emails in addition to the counterparty email to send invoice status notifications to.
             * At least one email is required if notifications are enabled and the counterparty
             * doesn't have an email.
             */
            fun notificationEmailAddresses(notificationEmailAddresses: List<String>?) =
                notificationEmailAddresses(JsonField.ofNullable(notificationEmailAddresses))

            /**
             * Emails in addition to the counterparty email to send invoice status notifications to.
             * At least one email is required if notifications are enabled and the counterparty
             * doesn't have an email.
             */
            fun notificationEmailAddresses(notificationEmailAddresses: JsonField<List<String>>) =
                apply {
                    this.notificationEmailAddresses =
                        notificationEmailAddresses.map { it.toMutableList() }
                }

            /**
             * Emails in addition to the counterparty email to send invoice status notifications to.
             * At least one email is required if notifications are enabled and the counterparty
             * doesn't have an email.
             */
            fun addNotificationEmailAddress(notificationEmailAddress: String) = apply {
                notificationEmailAddresses =
                    (notificationEmailAddresses ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(notificationEmailAddress)
                    }
            }

            /**
             * If true, the invoice will send email notifications to the invoice recipients about
             * invoice status changes.
             */
            fun notificationsEnabled(notificationsEnabled: Boolean) =
                notificationsEnabled(JsonField.of(notificationsEnabled))

            /**
             * If true, the invoice will send email notifications to the invoice recipients about
             * invoice status changes.
             */
            fun notificationsEnabled(notificationsEnabled: JsonField<Boolean>) = apply {
                this.notificationsEnabled = notificationsEnabled
            }

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            fun paymentEffectiveDate(paymentEffectiveDate: LocalDate) =
                paymentEffectiveDate(JsonField.of(paymentEffectiveDate))

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            fun paymentEffectiveDate(paymentEffectiveDate: JsonField<LocalDate>) = apply {
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
            fun paymentMethod(paymentMethod: PaymentMethod) =
                paymentMethod(JsonField.of(paymentMethod))

            /**
             * The method by which the invoice can be paid. `ui` will show the embedded payment
             * collection flow. `automatic` will automatically initiate payment based upon the
             * account details of the receiving_account id.\nIf the invoice amount is positive, the
             * automatically initiated payment order's direction will be debit. If the invoice
             * amount is negative, the automatically initiated payment order's direction will be
             * credit. One of `manual`, `ui`, or `automatic`.
             */
            fun paymentMethod(paymentMethod: JsonField<PaymentMethod>) = apply {
                this.paymentMethod = paymentMethod
            }

            /**
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            fun paymentType(paymentType: PaymentOrderType) = paymentType(JsonField.of(paymentType))

            /**
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            fun paymentType(paymentType: JsonField<PaymentOrderType>) = apply {
                this.paymentType = paymentType
            }

            /** The receiving account ID. Can be an `external_account`. */
            fun receivingAccountId(receivingAccountId: String) =
                receivingAccountId(JsonField.of(receivingAccountId))

            /** The receiving account ID. Can be an `external_account`. */
            fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
                this.receivingAccountId = receivingAccountId
            }

            /**
             * The email of the recipient of the invoice. Leaving this value as null will fallback
             * to using the counterparty's name.
             */
            fun recipientEmail(recipientEmail: String?) =
                recipientEmail(JsonField.ofNullable(recipientEmail))

            /**
             * The email of the recipient of the invoice. Leaving this value as null will fallback
             * to using the counterparty's name.
             */
            fun recipientEmail(recipientEmail: JsonField<String>) = apply {
                this.recipientEmail = recipientEmail
            }

            /**
             * The name of the recipient of the invoice. Leaving this value as null will fallback to
             * using the counterparty's name.
             */
            fun recipientName(recipientName: String?) =
                recipientName(JsonField.ofNullable(recipientName))

            /**
             * The name of the recipient of the invoice. Leaving this value as null will fallback to
             * using the counterparty's name.
             */
            fun recipientName(recipientName: JsonField<String>) = apply {
                this.recipientName = recipientName
            }

            /**
             * Number of days after due date when overdue reminder emails will be sent out to
             * invoice recipients.
             */
            fun remindAfterOverdueDays(remindAfterOverdueDays: List<Long>?) =
                remindAfterOverdueDays(JsonField.ofNullable(remindAfterOverdueDays))

            /**
             * Number of days after due date when overdue reminder emails will be sent out to
             * invoice recipients.
             */
            fun remindAfterOverdueDays(remindAfterOverdueDays: JsonField<List<Long>>) = apply {
                this.remindAfterOverdueDays = remindAfterOverdueDays.map { it.toMutableList() }
            }

            /**
             * Number of days after due date when overdue reminder emails will be sent out to
             * invoice recipients.
             */
            fun addRemindAfterOverdueDay(remindAfterOverdueDay: Long) = apply {
                remindAfterOverdueDays =
                    (remindAfterOverdueDays ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(remindAfterOverdueDay)
                    }
            }

            /** The ID of the virtual account the invoice should be paid to. */
            fun virtualAccountId(virtualAccountId: String?) =
                virtualAccountId(JsonField.ofNullable(virtualAccountId))

            /** The ID of the virtual account the invoice should be paid to. */
            fun virtualAccountId(virtualAccountId: JsonField<String>) = apply {
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
                    checkRequired("counterpartyId", counterpartyId),
                    checkRequired("dueDate", dueDate),
                    checkRequired("originatingAccountId", originatingAccountId),
                    autoAdvance,
                    (contactDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    counterpartyBillingAddress,
                    counterpartyShippingAddress,
                    currency,
                    description,
                    fallbackPaymentMethod,
                    ingestLedgerEntries,
                    (invoiceLineItems ?: JsonMissing.of()).map { it.toImmutable() },
                    invoicerAddress,
                    ledgerAccountSettlementId,
                    metadata,
                    (notificationEmailAddresses ?: JsonMissing.of()).map { it.toImmutable() },
                    notificationsEnabled,
                    paymentEffectiveDate,
                    paymentMethod,
                    paymentType,
                    receivingAccountId,
                    recipientEmail,
                    recipientName,
                    (remindAfterOverdueDays ?: JsonMissing.of()).map { it.toImmutable() },
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

    /** A builder for [InvoiceCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

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

        /** The ID of the counterparty receiving the invoice. */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            body.counterpartyId(counterpartyId)
        }

        /** A future date by when the invoice needs to be paid. */
        fun dueDate(dueDate: OffsetDateTime) = apply { body.dueDate(dueDate) }

        /** A future date by when the invoice needs to be paid. */
        fun dueDate(dueDate: JsonField<OffsetDateTime>) = apply { body.dueDate(dueDate) }

        /** The ID of the internal account the invoice should be paid to. */
        fun originatingAccountId(originatingAccountId: String) = apply {
            body.originatingAccountId(originatingAccountId)
        }

        /** The ID of the internal account the invoice should be paid to. */
        fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
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

        /**
         * When true, the invoice will progress to unpaid automatically and cannot be edited after
         * entering that state. If the invoice fails to progress to unpaid, the errors will be
         * returned and the invoice will not be created.
         */
        fun autoAdvance(autoAdvance: JsonField<Boolean>) = apply { body.autoAdvance(autoAdvance) }

        /** The invoicer's contact details displayed at the top of the invoice. */
        fun contactDetails(contactDetails: List<ContactDetail>) = apply {
            body.contactDetails(contactDetails)
        }

        /** The invoicer's contact details displayed at the top of the invoice. */
        fun contactDetails(contactDetails: JsonField<List<ContactDetail>>) = apply {
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

        /** The counterparty's billing address. */
        fun counterpartyBillingAddress(
            counterpartyBillingAddress: JsonField<CounterpartyBillingAddress>
        ) = apply { body.counterpartyBillingAddress(counterpartyBillingAddress) }

        /** The counterparty's shipping address where physical goods should be delivered. */
        fun counterpartyShippingAddress(counterpartyShippingAddress: CounterpartyShippingAddress?) =
            apply {
                body.counterpartyShippingAddress(counterpartyShippingAddress)
            }

        /** The counterparty's shipping address where physical goods should be delivered. */
        fun counterpartyShippingAddress(
            counterpartyShippingAddress: JsonField<CounterpartyShippingAddress>
        ) = apply { body.counterpartyShippingAddress(counterpartyShippingAddress) }

        /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
        fun currency(currency: Currency) = apply { body.currency(currency) }

        /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
        fun currency(currency: JsonField<Currency>) = apply { body.currency(currency) }

        /** A free-form description of the invoice. */
        fun description(description: String) = apply { body.description(description) }

        /** A free-form description of the invoice. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * When payment_method is automatic, the fallback payment method to use when an automatic
         * payment fails. One of `manual` or `ui`.
         */
        fun fallbackPaymentMethod(fallbackPaymentMethod: String?) = apply {
            body.fallbackPaymentMethod(fallbackPaymentMethod)
        }

        /**
         * When payment_method is automatic, the fallback payment method to use when an automatic
         * payment fails. One of `manual` or `ui`.
         */
        fun fallbackPaymentMethod(fallbackPaymentMethod: JsonField<String>) = apply {
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
         * Whether to ingest the ledger_entries to populate the invoice line items. If this is
         * false, then a line item must be provided. If this is true, line_items must be empty.
         * Ignored if ledger_account_settlement_id is empty.
         */
        fun ingestLedgerEntries(ingestLedgerEntries: JsonField<Boolean>) = apply {
            body.ingestLedgerEntries(ingestLedgerEntries)
        }

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
        fun invoiceLineItems(invoiceLineItems: JsonField<List<InvoiceLineItemCreateRequest>>) =
            apply {
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

        /** The invoice issuer's business address. */
        fun invoicerAddress(invoicerAddress: JsonField<InvoicerAddress>) = apply {
            body.invoicerAddress(invoicerAddress)
        }

        /** The ID of the virtual account the invoice should be paid to. */
        fun ledgerAccountSettlementId(ledgerAccountSettlementId: String?) = apply {
            body.ledgerAccountSettlementId(ledgerAccountSettlementId)
        }

        /** The ID of the virtual account the invoice should be paid to. */
        fun ledgerAccountSettlementId(ledgerAccountSettlementId: JsonField<String>) = apply {
            body.ledgerAccountSettlementId(ledgerAccountSettlementId)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

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
        fun notificationEmailAddresses(notificationEmailAddresses: JsonField<List<String>>) =
            apply {
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
        fun notificationsEnabled(notificationsEnabled: Boolean) = apply {
            body.notificationsEnabled(notificationsEnabled)
        }

        /**
         * If true, the invoice will send email notifications to the invoice recipients about
         * invoice status changes.
         */
        fun notificationsEnabled(notificationsEnabled: JsonField<Boolean>) = apply {
            body.notificationsEnabled(notificationsEnabled)
        }

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        fun paymentEffectiveDate(paymentEffectiveDate: LocalDate) = apply {
            body.paymentEffectiveDate(paymentEffectiveDate)
        }

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        fun paymentEffectiveDate(paymentEffectiveDate: JsonField<LocalDate>) = apply {
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
        fun paymentMethod(paymentMethod: PaymentMethod) = apply {
            body.paymentMethod(paymentMethod)
        }

        /**
         * The method by which the invoice can be paid. `ui` will show the embedded payment
         * collection flow. `automatic` will automatically initiate payment based upon the account
         * details of the receiving_account id.\nIf the invoice amount is positive, the
         * automatically initiated payment order's direction will be debit. If the invoice amount is
         * negative, the automatically initiated payment order's direction will be credit. One of
         * `manual`, `ui`, or `automatic`.
         */
        fun paymentMethod(paymentMethod: JsonField<PaymentMethod>) = apply {
            body.paymentMethod(paymentMethod)
        }

        /**
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         */
        fun paymentType(paymentType: PaymentOrderType) = apply { body.paymentType(paymentType) }

        /**
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         */
        fun paymentType(paymentType: JsonField<PaymentOrderType>) = apply {
            body.paymentType(paymentType)
        }

        /** The receiving account ID. Can be an `external_account`. */
        fun receivingAccountId(receivingAccountId: String) = apply {
            body.receivingAccountId(receivingAccountId)
        }

        /** The receiving account ID. Can be an `external_account`. */
        fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
            body.receivingAccountId(receivingAccountId)
        }

        /**
         * The email of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        fun recipientEmail(recipientEmail: String?) = apply { body.recipientEmail(recipientEmail) }

        /**
         * The email of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        fun recipientEmail(recipientEmail: JsonField<String>) = apply {
            body.recipientEmail(recipientEmail)
        }

        /**
         * The name of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        fun recipientName(recipientName: String?) = apply { body.recipientName(recipientName) }

        /**
         * The name of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        fun recipientName(recipientName: JsonField<String>) = apply {
            body.recipientName(recipientName)
        }

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
        fun remindAfterOverdueDays(remindAfterOverdueDays: JsonField<List<Long>>) = apply {
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

        /** The ID of the virtual account the invoice should be paid to. */
        fun virtualAccountId(virtualAccountId: JsonField<String>) = apply {
            body.virtualAccountId(virtualAccountId)
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
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_identifier")
        @ExcludeMissing
        private val contactIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_identifier_type")
        @ExcludeMissing
        private val contactIdentifierType: JsonField<ContactIdentifierType> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun contactIdentifier(): String = contactIdentifier.getRequired("contact_identifier")

        fun contactIdentifierType(): ContactIdentifierType =
            contactIdentifierType.getRequired("contact_identifier_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun object_(): String = object_.getRequired("object")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("contact_identifier")
        @ExcludeMissing
        fun _contactIdentifier(): JsonField<String> = contactIdentifier

        @JsonProperty("contact_identifier_type")
        @ExcludeMissing
        fun _contactIdentifierType(): JsonField<ContactIdentifierType> = contactIdentifierType

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContactDetail = apply {
            if (validated) {
                return@apply
            }

            id()
            contactIdentifier()
            contactIdentifierType()
            createdAt()
            discardedAt()
            liveMode()
            object_()
            updatedAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [ContactDetail]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var contactIdentifier: JsonField<String>? = null
            private var contactIdentifierType: JsonField<ContactIdentifierType>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var discardedAt: JsonField<OffsetDateTime>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var object_: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
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

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun contactIdentifier(contactIdentifier: String) =
                contactIdentifier(JsonField.of(contactIdentifier))

            fun contactIdentifier(contactIdentifier: JsonField<String>) = apply {
                this.contactIdentifier = contactIdentifier
            }

            fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) =
                contactIdentifierType(JsonField.of(contactIdentifierType))

            fun contactIdentifierType(contactIdentifierType: JsonField<ContactIdentifierType>) =
                apply {
                    this.contactIdentifierType = contactIdentifierType
                }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun discardedAt(discardedAt: OffsetDateTime?) =
                discardedAt(JsonField.ofNullable(discardedAt))

            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                this.discardedAt = discardedAt
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

            fun build(): ContactDetail =
                ContactDetail(
                    checkRequired("id", id),
                    checkRequired("contactIdentifier", contactIdentifier),
                    checkRequired("contactIdentifierType", contactIdentifierType),
                    checkRequired("createdAt", createdAt),
                    checkRequired("discardedAt", discardedAt),
                    checkRequired("liveMode", liveMode),
                    checkRequired("object_", object_),
                    checkRequired("updatedAt", updatedAt),
                    additionalProperties.toImmutable(),
                )
        }

        class ContactIdentifierType
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

                val EMAIL = of("email")

                val PHONE_NUMBER = of("phone_number")

                val WEBSITE = of("website")

                fun of(value: String) = ContactIdentifierType(JsonField.of(value))
            }

            /** An enum containing [ContactIdentifierType]'s known values. */
            enum class Known {
                EMAIL,
                PHONE_NUMBER,
                WEBSITE,
            }

            /**
             * An enum containing [ContactIdentifierType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ContactIdentifierType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EMAIL,
                PHONE_NUMBER,
                WEBSITE,
                /**
                 * An enum member indicating that [ContactIdentifierType] was instantiated with an
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
                    EMAIL -> Value.EMAIL
                    PHONE_NUMBER -> Value.PHONE_NUMBER
                    WEBSITE -> Value.WEBSITE
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
                    EMAIL -> Known.EMAIL
                    PHONE_NUMBER -> Known.PHONE_NUMBER
                    WEBSITE -> Known.WEBSITE
                    else ->
                        throw ModernTreasuryInvalidDataException(
                            "Unknown ContactIdentifierType: $value"
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
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality")
        @ExcludeMissing
        private val locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region")
        @ExcludeMissing
        private val region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String = country.getRequired("country")

        fun line1(): String = line1.getRequired("line1")

        /** Locality or City. */
        fun locality(): String = locality.getRequired("locality")

        /** The postal code of the address. */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /** Region or State. */
        fun region(): String = region.getRequired("region")

        fun line2(): String? = line2.getNullable("line2")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        /** The postal code of the address. */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CounterpartyBillingAddress = apply {
            if (validated) {
                return@apply
            }

            country()
            line1()
            locality()
            postalCode()
            region()
            line2()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [CounterpartyBillingAddress]. */
        class Builder internal constructor() {

            private var country: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var locality: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var region: JsonField<String>? = null
            private var line2: JsonField<String> = JsonMissing.of()
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
            fun country(country: String) = country(JsonField.of(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String) = line1(JsonField.of(line1))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /** Locality or City. */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /** Region or State. */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun line2(line2: String) = line2(JsonField.of(line2))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
                    checkRequired("country", country),
                    checkRequired("line1", line1),
                    checkRequired("locality", locality),
                    checkRequired("postalCode", postalCode),
                    checkRequired("region", region),
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
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality")
        @ExcludeMissing
        private val locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region")
        @ExcludeMissing
        private val region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String = country.getRequired("country")

        fun line1(): String = line1.getRequired("line1")

        /** Locality or City. */
        fun locality(): String = locality.getRequired("locality")

        /** The postal code of the address. */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /** Region or State. */
        fun region(): String = region.getRequired("region")

        fun line2(): String? = line2.getNullable("line2")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        /** The postal code of the address. */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CounterpartyShippingAddress = apply {
            if (validated) {
                return@apply
            }

            country()
            line1()
            locality()
            postalCode()
            region()
            line2()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [CounterpartyShippingAddress]. */
        class Builder internal constructor() {

            private var country: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var locality: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var region: JsonField<String>? = null
            private var line2: JsonField<String> = JsonMissing.of()
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
            fun country(country: String) = country(JsonField.of(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String) = line1(JsonField.of(line1))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /** Locality or City. */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /** Region or State. */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun line2(line2: String) = line2(JsonField.of(line2))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
                    checkRequired("country", country),
                    checkRequired("line1", line1),
                    checkRequired("locality", locality),
                    checkRequired("postalCode", postalCode),
                    checkRequired("region", region),
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
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit_amount")
        @ExcludeMissing
        private val unitAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        private val direction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("unit_amount_decimal")
        @ExcludeMissing
        private val unitAmountDecimal: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The name of the line item, typically a product or SKU name. */
        fun name(): String = name.getRequired("name")

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit.
         */
        fun unitAmount(): Long = unitAmount.getRequired("unit_amount")

        /** An optional free-form description of the line item. */
        fun description(): String? = description.getNullable("description")

        /**
         * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
         * increases the invoice's `total_amount` due. `credit` has the opposite intention and
         * effect.
         */
        fun direction(): String? = direction.getNullable("direction")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * The number of units of a product or service that this line item is for. Must be a whole
         * number. Defaults to 1 if not provided.
         */
        fun quantity(): Long? = quantity.getNullable("quantity")

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
         */
        fun unitAmountDecimal(): String? = unitAmountDecimal.getNullable("unit_amount_decimal")

        /** The name of the line item, typically a product or SKU name. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit.
         */
        @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount(): JsonField<Long> = unitAmount

        /** An optional free-form description of the line item. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
         * increases the invoice's `total_amount` due. `credit` has the opposite intention and
         * effect.
         */
        @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<String> = direction

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * The number of units of a product or service that this line item is for. Must be a whole
         * number. Defaults to 1 if not provided.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
         */
        @JsonProperty("unit_amount_decimal")
        @ExcludeMissing
        fun _unitAmountDecimal(): JsonField<String> = unitAmountDecimal

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InvoiceLineItemCreateRequest = apply {
            if (validated) {
                return@apply
            }

            name()
            unitAmount()
            description()
            direction()
            metadata()?.validate()
            quantity()
            unitAmountDecimal()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [InvoiceLineItemCreateRequest]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var unitAmount: JsonField<Long>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var direction: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var quantity: JsonField<Long> = JsonMissing.of()
            private var unitAmountDecimal: JsonField<String> = JsonMissing.of()
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
            fun name(name: String) = name(JsonField.of(name))

            /** The name of the line item, typically a product or SKU name. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit.
             */
            fun unitAmount(unitAmount: Long) = unitAmount(JsonField.of(unitAmount))

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit.
             */
            fun unitAmount(unitAmount: JsonField<Long>) = apply { this.unitAmount = unitAmount }

            /** An optional free-form description of the line item. */
            fun description(description: String) = description(JsonField.of(description))

            /** An optional free-form description of the line item. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Either `debit` or `credit`. `debit` indicates that a client owes the business money
             * and increases the invoice's `total_amount` due. `credit` has the opposite intention
             * and effect.
             */
            fun direction(direction: String) = direction(JsonField.of(direction))

            /**
             * Either `debit` or `credit`. `debit` indicates that a client owes the business money
             * and increases the invoice's `total_amount` due. `credit` has the opposite intention
             * and effect.
             */
            fun direction(direction: JsonField<String>) = apply { this.direction = direction }

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

            /**
             * The number of units of a product or service that this line item is for. Must be a
             * whole number. Defaults to 1 if not provided.
             */
            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            /**
             * The number of units of a product or service that this line item is for. Must be a
             * whole number. Defaults to 1 if not provided.
             */
            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
             */
            fun unitAmountDecimal(unitAmountDecimal: String) =
                unitAmountDecimal(JsonField.of(unitAmountDecimal))

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
             */
            fun unitAmountDecimal(unitAmountDecimal: JsonField<String>) = apply {
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
                    checkRequired("name", name),
                    checkRequired("unitAmount", unitAmount),
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
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality")
        @ExcludeMissing
        private val locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region")
        @ExcludeMissing
        private val region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String = country.getRequired("country")

        fun line1(): String = line1.getRequired("line1")

        /** Locality or City. */
        fun locality(): String = locality.getRequired("locality")

        /** The postal code of the address. */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /** Region or State. */
        fun region(): String = region.getRequired("region")

        fun line2(): String? = line2.getNullable("line2")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        /** The postal code of the address. */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InvoicerAddress = apply {
            if (validated) {
                return@apply
            }

            country()
            line1()
            locality()
            postalCode()
            region()
            line2()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [InvoicerAddress]. */
        class Builder internal constructor() {

            private var country: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var locality: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var region: JsonField<String>? = null
            private var line2: JsonField<String> = JsonMissing.of()
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
            fun country(country: String) = country(JsonField.of(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String) = line1(JsonField.of(line1))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /** Locality or City. */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /** Region or State. */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun line2(line2: String) = line2(JsonField.of(line2))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
                    checkRequired("country", country),
                    checkRequired("line1", line1),
                    checkRequired("locality", locality),
                    checkRequired("postalCode", postalCode),
                    checkRequired("region", region),
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
     * The method by which the invoice can be paid. `ui` will show the embedded payment collection
     * flow. `automatic` will automatically initiate payment based upon the account details of the
     * receiving_account id.\nIf the invoice amount is positive, the automatically initiated payment
     * order's direction will be debit. If the invoice amount is negative, the automatically
     * initiated payment order's direction will be credit. One of `manual`, `ui`, or `automatic`.
     */
    class PaymentMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val UI = of("ui")

            val MANUAL = of("manual")

            val AUTOMATIC = of("automatic")

            fun of(value: String) = PaymentMethod(JsonField.of(value))
        }

        /** An enum containing [PaymentMethod]'s known values. */
        enum class Known {
            UI,
            MANUAL,
            AUTOMATIC,
        }

        /**
         * An enum containing [PaymentMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PaymentMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UI,
            MANUAL,
            AUTOMATIC,
            /**
             * An enum member indicating that [PaymentMethod] was instantiated with an unknown
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
                UI -> Value.UI
                MANUAL -> Value.MANUAL
                AUTOMATIC -> Value.AUTOMATIC
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
                UI -> Known.UI
                MANUAL -> Known.MANUAL
                AUTOMATIC -> Known.AUTOMATIC
                else -> throw ModernTreasuryInvalidDataException("Unknown PaymentMethod: $value")
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
