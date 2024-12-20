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
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class Invoice
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("contact_details")
    @ExcludeMissing
    private val contactDetails: JsonField<List<ContactDetail>> = JsonMissing.of(),
    @JsonProperty("recipient_email")
    @ExcludeMissing
    private val recipientEmail: JsonField<String> = JsonMissing.of(),
    @JsonProperty("recipient_name")
    @ExcludeMissing
    private val recipientName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    private val counterpartyId: JsonField<String> = JsonMissing.of(),
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
    @JsonProperty("due_date")
    @ExcludeMissing
    private val dueDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("invoicer_address")
    @ExcludeMissing
    private val invoicerAddress: JsonField<InvoicerAddress> = JsonMissing.of(),
    @JsonProperty("originating_account_id")
    @ExcludeMissing
    private val originatingAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("receiving_account_id")
    @ExcludeMissing
    private val receivingAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("virtual_account_id")
    @ExcludeMissing
    private val virtualAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledger_account_settlement_id")
    @ExcludeMissing
    private val ledgerAccountSettlementId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_effective_date")
    @ExcludeMissing
    private val paymentEffectiveDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("payment_type")
    @ExcludeMissing
    private val paymentType: JsonField<PaymentType> = JsonMissing.of(),
    @JsonProperty("payment_method")
    @ExcludeMissing
    private val paymentMethod: JsonField<PaymentMethod> = JsonMissing.of(),
    @JsonProperty("fallback_payment_method")
    @ExcludeMissing
    private val fallbackPaymentMethod: JsonField<String> = JsonMissing.of(),
    @JsonProperty("notifications_enabled")
    @ExcludeMissing
    private val notificationsEnabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("notification_email_addresses")
    @ExcludeMissing
    private val notificationEmailAddresses: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("remind_after_overdue_days")
    @ExcludeMissing
    private val remindAfterOverdueDays: JsonField<List<Long>> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("hosted_url")
    @ExcludeMissing
    private val hostedUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("number")
    @ExcludeMissing
    private val number: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_orders")
    @ExcludeMissing
    private val paymentOrders: JsonField<List<PaymentOrder>> = JsonMissing.of(),
    @JsonProperty("expected_payments")
    @ExcludeMissing
    private val expectedPayments: JsonField<List<ExpectedPayment>> = JsonMissing.of(),
    @JsonProperty("pdf_url")
    @ExcludeMissing
    private val pdfUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("total_amount")
    @ExcludeMissing
    private val totalAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("amount_remaining")
    @ExcludeMissing
    private val amountRemaining: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("amount_paid")
    @ExcludeMissing
    private val amountPaid: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("transaction_line_item_ids")
    @ExcludeMissing
    private val transactionLineItemIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The invoicer's contact details displayed at the top of the invoice. */
    fun contactDetails(): List<ContactDetail> = contactDetails.getRequired("contact_details")

    /**
     * The email of the recipient of the invoice. Leaving this value as null will fallback to using
     * the counterparty's name.
     */
    fun recipientEmail(): String? = recipientEmail.getNullable("recipient_email")

    /**
     * The name of the recipient of the invoice. Leaving this value as null will fallback to using
     * the counterparty's name.
     */
    fun recipientName(): String? = recipientName.getNullable("recipient_name")

    /** The ID of the counterparty receiving the invoice. */
    fun counterpartyId(): String = counterpartyId.getRequired("counterparty_id")

    /** The counterparty's billing address. */
    fun counterpartyBillingAddress(): CounterpartyBillingAddress? =
        counterpartyBillingAddress.getNullable("counterparty_billing_address")

    /** The counterparty's shipping address where physical goods should be delivered. */
    fun counterpartyShippingAddress(): CounterpartyShippingAddress? =
        counterpartyShippingAddress.getNullable("counterparty_shipping_address")

    /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
    fun currency(): Currency = currency.getRequired("currency")

    /** A free-form description of the invoice. */
    fun description(): String = description.getRequired("description")

    /** A future date by when the invoice needs to be paid. */
    fun dueDate(): OffsetDateTime = dueDate.getRequired("due_date")

    /** The invoice issuer's business address. */
    fun invoicerAddress(): InvoicerAddress? = invoicerAddress.getNullable("invoicer_address")

    /** The ID of the internal account the invoice should be paid to. */
    fun originatingAccountId(): String = originatingAccountId.getRequired("originating_account_id")

    /** The receiving account ID. Can be an `internal_account`. */
    fun receivingAccountId(): String? = receivingAccountId.getNullable("receiving_account_id")

    /** The ID of the virtual account the invoice should be paid to. */
    fun virtualAccountId(): String? = virtualAccountId.getNullable("virtual_account_id")

    /** The ledger account settlement object linked to the invoice. */
    fun ledgerAccountSettlementId(): String? =
        ledgerAccountSettlementId.getNullable("ledger_account_settlement_id")

    /**
     * Date transactions are to be posted to the participants' account. Defaults to the current
     * business day or the next business day if the current day is a bank holiday or weekend.
     * Format: yyyy-mm-dd.
     */
    fun paymentEffectiveDate(): LocalDate? =
        paymentEffectiveDate.getNullable("payment_effective_date")

    /** One of `ach` or `eft`. */
    fun paymentType(): PaymentType? = paymentType.getNullable("payment_type")

    /**
     * When opening an invoice, whether to show the embedded payment UI , automatically debit the
     * recipient, or rely on manual payment from the recipient.
     */
    fun paymentMethod(): PaymentMethod? = paymentMethod.getNullable("payment_method")

    /**
     * When payment_method is automatic, the fallback payment method to use when an automatic
     * payment fails. One of `manual` or `ui`.
     */
    fun fallbackPaymentMethod(): String? =
        fallbackPaymentMethod.getNullable("fallback_payment_method")

    /**
     * If true, the invoice will send email notifications to the invoice recipients about invoice
     * status changes.
     */
    fun notificationsEnabled(): Boolean = notificationsEnabled.getRequired("notifications_enabled")

    /**
     * Emails in addition to the counterparty email to send invoice status notifications to. At
     * least one email is required if notifications are enabled and the counterparty doesn't have an
     * email.
     */
    fun notificationEmailAddresses(): List<String>? =
        notificationEmailAddresses.getNullable("notification_email_addresses")

    /**
     * Number of days after due date when overdue reminder emails will be sent out to invoice
     * recipients.
     */
    fun remindAfterOverdueDays(): List<Long>? =
        remindAfterOverdueDays.getNullable("remind_after_overdue_days")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    /** The URL of the hosted web UI where the invoice can be viewed. */
    fun hostedUrl(): String = hostedUrl.getRequired("hosted_url")

    /** A unique record number assigned to each invoice that is issued. */
    fun number(): String = number.getRequired("number")

    /** The payment orders created for paying the invoice through the invoice payment UI. */
    fun paymentOrders(): List<PaymentOrder> = paymentOrders.getRequired("payment_orders")

    /** The expected payments created for an unpaid invoice. */
    fun expectedPayments(): List<ExpectedPayment> =
        expectedPayments.getRequired("expected_payments")

    /** The URL where the invoice PDF can be downloaded. */
    fun pdfUrl(): String? = pdfUrl.getNullable("pdf_url")

    /** The status of the invoice. */
    fun status(): Status = status.getRequired("status")

    /**
     * Total amount due in specified currency's smallest unit, e.g., $10 USD would be represented
     * as 1000.
     */
    fun totalAmount(): Long = totalAmount.getRequired("total_amount")

    /**
     * Amount remaining due on the invoice in specified currency's smallest unit, e.g., $10 USD
     * would be represented as 1000.
     */
    fun amountRemaining(): Long = amountRemaining.getRequired("amount_remaining")

    /**
     * Amount paid on the invoice in specified currency's smallest unit, e.g., $10 USD would be
     * represented as 1000.
     */
    fun amountPaid(): Long = amountPaid.getRequired("amount_paid")

    /** IDs of transaction line items associated with an invoice. */
    fun transactionLineItemIds(): List<String> =
        transactionLineItemIds.getRequired("transaction_line_item_ids")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** The invoicer's contact details displayed at the top of the invoice. */
    @JsonProperty("contact_details") @ExcludeMissing fun _contactDetails() = contactDetails

    /**
     * The email of the recipient of the invoice. Leaving this value as null will fallback to using
     * the counterparty's name.
     */
    @JsonProperty("recipient_email") @ExcludeMissing fun _recipientEmail() = recipientEmail

    /**
     * The name of the recipient of the invoice. Leaving this value as null will fallback to using
     * the counterparty's name.
     */
    @JsonProperty("recipient_name") @ExcludeMissing fun _recipientName() = recipientName

    /** The ID of the counterparty receiving the invoice. */
    @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

    /** The counterparty's billing address. */
    @JsonProperty("counterparty_billing_address")
    @ExcludeMissing
    fun _counterpartyBillingAddress() = counterpartyBillingAddress

    /** The counterparty's shipping address where physical goods should be delivered. */
    @JsonProperty("counterparty_shipping_address")
    @ExcludeMissing
    fun _counterpartyShippingAddress() = counterpartyShippingAddress

    /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** A free-form description of the invoice. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** A future date by when the invoice needs to be paid. */
    @JsonProperty("due_date") @ExcludeMissing fun _dueDate() = dueDate

    /** The invoice issuer's business address. */
    @JsonProperty("invoicer_address") @ExcludeMissing fun _invoicerAddress() = invoicerAddress

    /** The ID of the internal account the invoice should be paid to. */
    @JsonProperty("originating_account_id")
    @ExcludeMissing
    fun _originatingAccountId() = originatingAccountId

    /** The receiving account ID. Can be an `internal_account`. */
    @JsonProperty("receiving_account_id")
    @ExcludeMissing
    fun _receivingAccountId() = receivingAccountId

    /** The ID of the virtual account the invoice should be paid to. */
    @JsonProperty("virtual_account_id") @ExcludeMissing fun _virtualAccountId() = virtualAccountId

    /** The ledger account settlement object linked to the invoice. */
    @JsonProperty("ledger_account_settlement_id")
    @ExcludeMissing
    fun _ledgerAccountSettlementId() = ledgerAccountSettlementId

    /**
     * Date transactions are to be posted to the participants' account. Defaults to the current
     * business day or the next business day if the current day is a bank holiday or weekend.
     * Format: yyyy-mm-dd.
     */
    @JsonProperty("payment_effective_date")
    @ExcludeMissing
    fun _paymentEffectiveDate() = paymentEffectiveDate

    /** One of `ach` or `eft`. */
    @JsonProperty("payment_type") @ExcludeMissing fun _paymentType() = paymentType

    /**
     * When opening an invoice, whether to show the embedded payment UI , automatically debit the
     * recipient, or rely on manual payment from the recipient.
     */
    @JsonProperty("payment_method") @ExcludeMissing fun _paymentMethod() = paymentMethod

    /**
     * When payment_method is automatic, the fallback payment method to use when an automatic
     * payment fails. One of `manual` or `ui`.
     */
    @JsonProperty("fallback_payment_method")
    @ExcludeMissing
    fun _fallbackPaymentMethod() = fallbackPaymentMethod

    /**
     * If true, the invoice will send email notifications to the invoice recipients about invoice
     * status changes.
     */
    @JsonProperty("notifications_enabled")
    @ExcludeMissing
    fun _notificationsEnabled() = notificationsEnabled

    /**
     * Emails in addition to the counterparty email to send invoice status notifications to. At
     * least one email is required if notifications are enabled and the counterparty doesn't have an
     * email.
     */
    @JsonProperty("notification_email_addresses")
    @ExcludeMissing
    fun _notificationEmailAddresses() = notificationEmailAddresses

    /**
     * Number of days after due date when overdue reminder emails will be sent out to invoice
     * recipients.
     */
    @JsonProperty("remind_after_overdue_days")
    @ExcludeMissing
    fun _remindAfterOverdueDays() = remindAfterOverdueDays

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    /** The URL of the hosted web UI where the invoice can be viewed. */
    @JsonProperty("hosted_url") @ExcludeMissing fun _hostedUrl() = hostedUrl

    /** A unique record number assigned to each invoice that is issued. */
    @JsonProperty("number") @ExcludeMissing fun _number() = number

    /** The payment orders created for paying the invoice through the invoice payment UI. */
    @JsonProperty("payment_orders") @ExcludeMissing fun _paymentOrders() = paymentOrders

    /** The expected payments created for an unpaid invoice. */
    @JsonProperty("expected_payments") @ExcludeMissing fun _expectedPayments() = expectedPayments

    /** The URL where the invoice PDF can be downloaded. */
    @JsonProperty("pdf_url") @ExcludeMissing fun _pdfUrl() = pdfUrl

    /** The status of the invoice. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * Total amount due in specified currency's smallest unit, e.g., $10 USD would be represented
     * as 1000.
     */
    @JsonProperty("total_amount") @ExcludeMissing fun _totalAmount() = totalAmount

    /**
     * Amount remaining due on the invoice in specified currency's smallest unit, e.g., $10 USD
     * would be represented as 1000.
     */
    @JsonProperty("amount_remaining") @ExcludeMissing fun _amountRemaining() = amountRemaining

    /**
     * Amount paid on the invoice in specified currency's smallest unit, e.g., $10 USD would be
     * represented as 1000.
     */
    @JsonProperty("amount_paid") @ExcludeMissing fun _amountPaid() = amountPaid

    /** IDs of transaction line items associated with an invoice. */
    @JsonProperty("transaction_line_item_ids")
    @ExcludeMissing
    fun _transactionLineItemIds() = transactionLineItemIds

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Invoice = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            contactDetails().forEach { it.validate() }
            recipientEmail()
            recipientName()
            counterpartyId()
            counterpartyBillingAddress()?.validate()
            counterpartyShippingAddress()?.validate()
            currency()
            description()
            dueDate()
            invoicerAddress()?.validate()
            originatingAccountId()
            receivingAccountId()
            virtualAccountId()
            ledgerAccountSettlementId()
            paymentEffectiveDate()
            paymentType()
            paymentMethod()
            fallbackPaymentMethod()
            notificationsEnabled()
            notificationEmailAddresses()
            remindAfterOverdueDays()
            metadata()?.validate()
            hostedUrl()
            number()
            paymentOrders().forEach { it.validate() }
            expectedPayments().forEach { it.validate() }
            pdfUrl()
            status()
            totalAmount()
            amountRemaining()
            amountPaid()
            transactionLineItemIds()
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
        private var contactDetails: JsonField<List<ContactDetail>> = JsonMissing.of()
        private var recipientEmail: JsonField<String> = JsonMissing.of()
        private var recipientName: JsonField<String> = JsonMissing.of()
        private var counterpartyId: JsonField<String> = JsonMissing.of()
        private var counterpartyBillingAddress: JsonField<CounterpartyBillingAddress> =
            JsonMissing.of()
        private var counterpartyShippingAddress: JsonField<CounterpartyShippingAddress> =
            JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var dueDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var invoicerAddress: JsonField<InvoicerAddress> = JsonMissing.of()
        private var originatingAccountId: JsonField<String> = JsonMissing.of()
        private var receivingAccountId: JsonField<String> = JsonMissing.of()
        private var virtualAccountId: JsonField<String> = JsonMissing.of()
        private var ledgerAccountSettlementId: JsonField<String> = JsonMissing.of()
        private var paymentEffectiveDate: JsonField<LocalDate> = JsonMissing.of()
        private var paymentType: JsonField<PaymentType> = JsonMissing.of()
        private var paymentMethod: JsonField<PaymentMethod> = JsonMissing.of()
        private var fallbackPaymentMethod: JsonField<String> = JsonMissing.of()
        private var notificationsEnabled: JsonField<Boolean> = JsonMissing.of()
        private var notificationEmailAddresses: JsonField<List<String>> = JsonMissing.of()
        private var remindAfterOverdueDays: JsonField<List<Long>> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var hostedUrl: JsonField<String> = JsonMissing.of()
        private var number: JsonField<String> = JsonMissing.of()
        private var paymentOrders: JsonField<List<PaymentOrder>> = JsonMissing.of()
        private var expectedPayments: JsonField<List<ExpectedPayment>> = JsonMissing.of()
        private var pdfUrl: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var totalAmount: JsonField<Long> = JsonMissing.of()
        private var amountRemaining: JsonField<Long> = JsonMissing.of()
        private var amountPaid: JsonField<Long> = JsonMissing.of()
        private var transactionLineItemIds: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoice: Invoice) = apply {
            id = invoice.id
            object_ = invoice.object_
            liveMode = invoice.liveMode
            createdAt = invoice.createdAt
            updatedAt = invoice.updatedAt
            contactDetails = invoice.contactDetails
            recipientEmail = invoice.recipientEmail
            recipientName = invoice.recipientName
            counterpartyId = invoice.counterpartyId
            counterpartyBillingAddress = invoice.counterpartyBillingAddress
            counterpartyShippingAddress = invoice.counterpartyShippingAddress
            currency = invoice.currency
            description = invoice.description
            dueDate = invoice.dueDate
            invoicerAddress = invoice.invoicerAddress
            originatingAccountId = invoice.originatingAccountId
            receivingAccountId = invoice.receivingAccountId
            virtualAccountId = invoice.virtualAccountId
            ledgerAccountSettlementId = invoice.ledgerAccountSettlementId
            paymentEffectiveDate = invoice.paymentEffectiveDate
            paymentType = invoice.paymentType
            paymentMethod = invoice.paymentMethod
            fallbackPaymentMethod = invoice.fallbackPaymentMethod
            notificationsEnabled = invoice.notificationsEnabled
            notificationEmailAddresses = invoice.notificationEmailAddresses
            remindAfterOverdueDays = invoice.remindAfterOverdueDays
            metadata = invoice.metadata
            hostedUrl = invoice.hostedUrl
            number = invoice.number
            paymentOrders = invoice.paymentOrders
            expectedPayments = invoice.expectedPayments
            pdfUrl = invoice.pdfUrl
            status = invoice.status
            totalAmount = invoice.totalAmount
            amountRemaining = invoice.amountRemaining
            amountPaid = invoice.amountPaid
            transactionLineItemIds = invoice.transactionLineItemIds
            additionalProperties = invoice.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

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
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The invoicer's contact details displayed at the top of the invoice. */
        fun contactDetails(contactDetails: List<ContactDetail>) =
            contactDetails(JsonField.of(contactDetails))

        /** The invoicer's contact details displayed at the top of the invoice. */
        fun contactDetails(contactDetails: JsonField<List<ContactDetail>>) = apply {
            this.contactDetails = contactDetails
        }

        /**
         * The email of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        fun recipientEmail(recipientEmail: String) = recipientEmail(JsonField.of(recipientEmail))

        /**
         * The email of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        fun recipientEmail(recipientEmail: JsonField<String>) = apply {
            this.recipientEmail = recipientEmail
        }

        /**
         * The name of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        fun recipientName(recipientName: String) = recipientName(JsonField.of(recipientName))

        /**
         * The name of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        fun recipientName(recipientName: JsonField<String>) = apply {
            this.recipientName = recipientName
        }

        /** The ID of the counterparty receiving the invoice. */
        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

        /** The ID of the counterparty receiving the invoice. */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        /** The counterparty's billing address. */
        fun counterpartyBillingAddress(counterpartyBillingAddress: CounterpartyBillingAddress) =
            counterpartyBillingAddress(JsonField.of(counterpartyBillingAddress))

        /** The counterparty's billing address. */
        fun counterpartyBillingAddress(
            counterpartyBillingAddress: JsonField<CounterpartyBillingAddress>
        ) = apply { this.counterpartyBillingAddress = counterpartyBillingAddress }

        /** The counterparty's shipping address where physical goods should be delivered. */
        fun counterpartyShippingAddress(counterpartyShippingAddress: CounterpartyShippingAddress) =
            counterpartyShippingAddress(JsonField.of(counterpartyShippingAddress))

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
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** A future date by when the invoice needs to be paid. */
        fun dueDate(dueDate: OffsetDateTime) = dueDate(JsonField.of(dueDate))

        /** A future date by when the invoice needs to be paid. */
        fun dueDate(dueDate: JsonField<OffsetDateTime>) = apply { this.dueDate = dueDate }

        /** The invoice issuer's business address. */
        fun invoicerAddress(invoicerAddress: InvoicerAddress) =
            invoicerAddress(JsonField.of(invoicerAddress))

        /** The invoice issuer's business address. */
        fun invoicerAddress(invoicerAddress: JsonField<InvoicerAddress>) = apply {
            this.invoicerAddress = invoicerAddress
        }

        /** The ID of the internal account the invoice should be paid to. */
        fun originatingAccountId(originatingAccountId: String) =
            originatingAccountId(JsonField.of(originatingAccountId))

        /** The ID of the internal account the invoice should be paid to. */
        fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
            this.originatingAccountId = originatingAccountId
        }

        /** The receiving account ID. Can be an `internal_account`. */
        fun receivingAccountId(receivingAccountId: String) =
            receivingAccountId(JsonField.of(receivingAccountId))

        /** The receiving account ID. Can be an `internal_account`. */
        fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
            this.receivingAccountId = receivingAccountId
        }

        /** The ID of the virtual account the invoice should be paid to. */
        fun virtualAccountId(virtualAccountId: String) =
            virtualAccountId(JsonField.of(virtualAccountId))

        /** The ID of the virtual account the invoice should be paid to. */
        fun virtualAccountId(virtualAccountId: JsonField<String>) = apply {
            this.virtualAccountId = virtualAccountId
        }

        /** The ledger account settlement object linked to the invoice. */
        fun ledgerAccountSettlementId(ledgerAccountSettlementId: String) =
            ledgerAccountSettlementId(JsonField.of(ledgerAccountSettlementId))

        /** The ledger account settlement object linked to the invoice. */
        fun ledgerAccountSettlementId(ledgerAccountSettlementId: JsonField<String>) = apply {
            this.ledgerAccountSettlementId = ledgerAccountSettlementId
        }

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        fun paymentEffectiveDate(paymentEffectiveDate: LocalDate) =
            paymentEffectiveDate(JsonField.of(paymentEffectiveDate))

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        fun paymentEffectiveDate(paymentEffectiveDate: JsonField<LocalDate>) = apply {
            this.paymentEffectiveDate = paymentEffectiveDate
        }

        /** One of `ach` or `eft`. */
        fun paymentType(paymentType: PaymentType) = paymentType(JsonField.of(paymentType))

        /** One of `ach` or `eft`. */
        fun paymentType(paymentType: JsonField<PaymentType>) = apply {
            this.paymentType = paymentType
        }

        /**
         * When opening an invoice, whether to show the embedded payment UI , automatically debit
         * the recipient, or rely on manual payment from the recipient.
         */
        fun paymentMethod(paymentMethod: PaymentMethod) = paymentMethod(JsonField.of(paymentMethod))

        /**
         * When opening an invoice, whether to show the embedded payment UI , automatically debit
         * the recipient, or rely on manual payment from the recipient.
         */
        fun paymentMethod(paymentMethod: JsonField<PaymentMethod>) = apply {
            this.paymentMethod = paymentMethod
        }

        /**
         * When payment_method is automatic, the fallback payment method to use when an automatic
         * payment fails. One of `manual` or `ui`.
         */
        fun fallbackPaymentMethod(fallbackPaymentMethod: String) =
            fallbackPaymentMethod(JsonField.of(fallbackPaymentMethod))

        /**
         * When payment_method is automatic, the fallback payment method to use when an automatic
         * payment fails. One of `manual` or `ui`.
         */
        fun fallbackPaymentMethod(fallbackPaymentMethod: JsonField<String>) = apply {
            this.fallbackPaymentMethod = fallbackPaymentMethod
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
         * Emails in addition to the counterparty email to send invoice status notifications to. At
         * least one email is required if notifications are enabled and the counterparty doesn't
         * have an email.
         */
        fun notificationEmailAddresses(notificationEmailAddresses: List<String>) =
            notificationEmailAddresses(JsonField.of(notificationEmailAddresses))

        /**
         * Emails in addition to the counterparty email to send invoice status notifications to. At
         * least one email is required if notifications are enabled and the counterparty doesn't
         * have an email.
         */
        fun notificationEmailAddresses(notificationEmailAddresses: JsonField<List<String>>) =
            apply {
                this.notificationEmailAddresses = notificationEmailAddresses
            }

        /**
         * Number of days after due date when overdue reminder emails will be sent out to invoice
         * recipients.
         */
        fun remindAfterOverdueDays(remindAfterOverdueDays: List<Long>) =
            remindAfterOverdueDays(JsonField.of(remindAfterOverdueDays))

        /**
         * Number of days after due date when overdue reminder emails will be sent out to invoice
         * recipients.
         */
        fun remindAfterOverdueDays(remindAfterOverdueDays: JsonField<List<Long>>) = apply {
            this.remindAfterOverdueDays = remindAfterOverdueDays
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The URL of the hosted web UI where the invoice can be viewed. */
        fun hostedUrl(hostedUrl: String) = hostedUrl(JsonField.of(hostedUrl))

        /** The URL of the hosted web UI where the invoice can be viewed. */
        fun hostedUrl(hostedUrl: JsonField<String>) = apply { this.hostedUrl = hostedUrl }

        /** A unique record number assigned to each invoice that is issued. */
        fun number(number: String) = number(JsonField.of(number))

        /** A unique record number assigned to each invoice that is issued. */
        fun number(number: JsonField<String>) = apply { this.number = number }

        /** The payment orders created for paying the invoice through the invoice payment UI. */
        fun paymentOrders(paymentOrders: List<PaymentOrder>) =
            paymentOrders(JsonField.of(paymentOrders))

        /** The payment orders created for paying the invoice through the invoice payment UI. */
        fun paymentOrders(paymentOrders: JsonField<List<PaymentOrder>>) = apply {
            this.paymentOrders = paymentOrders
        }

        /** The expected payments created for an unpaid invoice. */
        fun expectedPayments(expectedPayments: List<ExpectedPayment>) =
            expectedPayments(JsonField.of(expectedPayments))

        /** The expected payments created for an unpaid invoice. */
        fun expectedPayments(expectedPayments: JsonField<List<ExpectedPayment>>) = apply {
            this.expectedPayments = expectedPayments
        }

        /** The URL where the invoice PDF can be downloaded. */
        fun pdfUrl(pdfUrl: String) = pdfUrl(JsonField.of(pdfUrl))

        /** The URL where the invoice PDF can be downloaded. */
        fun pdfUrl(pdfUrl: JsonField<String>) = apply { this.pdfUrl = pdfUrl }

        /** The status of the invoice. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the invoice. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * Total amount due in specified currency's smallest unit, e.g., $10 USD would be
         * represented as 1000.
         */
        fun totalAmount(totalAmount: Long) = totalAmount(JsonField.of(totalAmount))

        /**
         * Total amount due in specified currency's smallest unit, e.g., $10 USD would be
         * represented as 1000.
         */
        fun totalAmount(totalAmount: JsonField<Long>) = apply { this.totalAmount = totalAmount }

        /**
         * Amount remaining due on the invoice in specified currency's smallest unit, e.g., $10 USD
         * would be represented as 1000.
         */
        fun amountRemaining(amountRemaining: Long) = amountRemaining(JsonField.of(amountRemaining))

        /**
         * Amount remaining due on the invoice in specified currency's smallest unit, e.g., $10 USD
         * would be represented as 1000.
         */
        fun amountRemaining(amountRemaining: JsonField<Long>) = apply {
            this.amountRemaining = amountRemaining
        }

        /**
         * Amount paid on the invoice in specified currency's smallest unit, e.g., $10 USD would be
         * represented as 1000.
         */
        fun amountPaid(amountPaid: Long) = amountPaid(JsonField.of(amountPaid))

        /**
         * Amount paid on the invoice in specified currency's smallest unit, e.g., $10 USD would be
         * represented as 1000.
         */
        fun amountPaid(amountPaid: JsonField<Long>) = apply { this.amountPaid = amountPaid }

        /** IDs of transaction line items associated with an invoice. */
        fun transactionLineItemIds(transactionLineItemIds: List<String>) =
            transactionLineItemIds(JsonField.of(transactionLineItemIds))

        /** IDs of transaction line items associated with an invoice. */
        fun transactionLineItemIds(transactionLineItemIds: JsonField<List<String>>) = apply {
            this.transactionLineItemIds = transactionLineItemIds
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

        fun build(): Invoice =
            Invoice(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                contactDetails.map { it.toImmutable() },
                recipientEmail,
                recipientName,
                counterpartyId,
                counterpartyBillingAddress,
                counterpartyShippingAddress,
                currency,
                description,
                dueDate,
                invoicerAddress,
                originatingAccountId,
                receivingAccountId,
                virtualAccountId,
                ledgerAccountSettlementId,
                paymentEffectiveDate,
                paymentType,
                paymentMethod,
                fallbackPaymentMethod,
                notificationsEnabled,
                notificationEmailAddresses.map { it.toImmutable() },
                remindAfterOverdueDays.map { it.toImmutable() },
                metadata,
                hostedUrl,
                number,
                paymentOrders.map { it.toImmutable() },
                expectedPayments.map { it.toImmutable() },
                pdfUrl,
                status,
                totalAmount,
                amountRemaining,
                amountPaid,
                transactionLineItemIds.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class ContactDetail
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("contact_identifier")
        @ExcludeMissing
        private val contactIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_identifier_type")
        @ExcludeMissing
        private val contactIdentifierType: JsonField<ContactIdentifierType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun object_(): String = object_.getRequired("object")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

        fun contactIdentifier(): String = contactIdentifier.getRequired("contact_identifier")

        fun contactIdentifierType(): ContactIdentifierType =
            contactIdentifierType.getRequired("contact_identifier_type")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("object") @ExcludeMissing fun _object_() = object_

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

        @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

        @JsonProperty("contact_identifier")
        @ExcludeMissing
        fun _contactIdentifier() = contactIdentifier

        @JsonProperty("contact_identifier_type")
        @ExcludeMissing
        fun _contactIdentifierType() = contactIdentifierType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContactDetail = apply {
            if (!validated) {
                id()
                object_()
                liveMode()
                createdAt()
                updatedAt()
                discardedAt()
                contactIdentifier()
                contactIdentifierType()
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
            private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var contactIdentifier: JsonField<String> = JsonMissing.of()
            private var contactIdentifierType: JsonField<ContactIdentifierType> = JsonMissing.of()
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

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun object_(object_: String) = object_(JsonField.of(object_))

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
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                this.discardedAt = discardedAt
            }

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
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    discardedAt,
                    contactIdentifier,
                    contactIdentifierType,
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
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality")
        @ExcludeMissing
        private val locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region")
        @ExcludeMissing
        private val region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun line1(): String = line1.getRequired("line1")

        fun line2(): String? = line2.getNullable("line2")

        /** Locality or City. */
        fun locality(): String = locality.getRequired("locality")

        /** Region or State. */
        fun region(): String = region.getRequired("region")

        /** The postal code of the address. */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String = country.getRequired("country")

        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality() = locality

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region() = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country() = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CounterpartyBillingAddress = apply {
            if (!validated) {
                line1()
                line2()
                locality()
                region()
                postalCode()
                country()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
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

            fun line1(line1: String) = line1(JsonField.of(line1))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String) = line2(JsonField.of(line2))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /** Locality or City. */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /** Region or State. */
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = country(JsonField.of(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: JsonField<String>) = apply { this.country = country }

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
                    line1,
                    line2,
                    locality,
                    region,
                    postalCode,
                    country,
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
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality")
        @ExcludeMissing
        private val locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region")
        @ExcludeMissing
        private val region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun line1(): String = line1.getRequired("line1")

        fun line2(): String? = line2.getNullable("line2")

        /** Locality or City. */
        fun locality(): String = locality.getRequired("locality")

        /** Region or State. */
        fun region(): String = region.getRequired("region")

        /** The postal code of the address. */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String = country.getRequired("country")

        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality() = locality

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region() = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country() = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CounterpartyShippingAddress = apply {
            if (!validated) {
                line1()
                line2()
                locality()
                region()
                postalCode()
                country()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
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

            fun line1(line1: String) = line1(JsonField.of(line1))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String) = line2(JsonField.of(line2))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /** Locality or City. */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /** Region or State. */
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = country(JsonField.of(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: JsonField<String>) = apply { this.country = country }

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
                    line1,
                    line2,
                    locality,
                    region,
                    postalCode,
                    country,
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

    /** The invoice issuer's business address. */
    @NoAutoDetect
    class InvoicerAddress
    @JsonCreator
    private constructor(
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality")
        @ExcludeMissing
        private val locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region")
        @ExcludeMissing
        private val region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun line1(): String = line1.getRequired("line1")

        fun line2(): String? = line2.getNullable("line2")

        /** Locality or City. */
        fun locality(): String = locality.getRequired("locality")

        /** Region or State. */
        fun region(): String = region.getRequired("region")

        /** The postal code of the address. */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String = country.getRequired("country")

        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality() = locality

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region() = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country() = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InvoicerAddress = apply {
            if (!validated) {
                line1()
                line2()
                locality()
                region()
                postalCode()
                country()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
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

            fun line1(line1: String) = line1(JsonField.of(line1))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String) = line2(JsonField.of(line2))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /** Locality or City. */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /** Region or State. */
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = country(JsonField.of(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: JsonField<String>) = apply { this.country = country }

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
                    line1,
                    line2,
                    locality,
                    region,
                    postalCode,
                    country,
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

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

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

    class PaymentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val EFT = of("eft")

            val ACH = of("ach")

            fun of(value: String) = PaymentType(JsonField.of(value))
        }

        enum class Known {
            EFT,
            ACH,
        }

        enum class Value {
            EFT,
            ACH,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EFT -> Value.EFT
                ACH -> Value.ACH
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EFT -> Known.EFT
                ACH -> Known.ACH
                else -> throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DRAFT = of("draft")

            val PAID = of("paid")

            val PARTIALLY_PAID = of("partially_paid")

            val PAYMENT_PENDING = of("payment_pending")

            val UNPAID = of("unpaid")

            val VOIDED = of("voided")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            DRAFT,
            PAID,
            PARTIALLY_PAID,
            PAYMENT_PENDING,
            UNPAID,
            VOIDED,
        }

        enum class Value {
            DRAFT,
            PAID,
            PARTIALLY_PAID,
            PAYMENT_PENDING,
            UNPAID,
            VOIDED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DRAFT -> Value.DRAFT
                PAID -> Value.PAID
                PARTIALLY_PAID -> Value.PARTIALLY_PAID
                PAYMENT_PENDING -> Value.PAYMENT_PENDING
                UNPAID -> Value.UNPAID
                VOIDED -> Value.VOIDED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DRAFT -> Known.DRAFT
                PAID -> Known.PAID
                PARTIALLY_PAID -> Known.PARTIALLY_PAID
                PAYMENT_PENDING -> Known.PAYMENT_PENDING
                UNPAID -> Known.UNPAID
                VOIDED -> Known.VOIDED
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Invoice && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && contactDetails == other.contactDetails && recipientEmail == other.recipientEmail && recipientName == other.recipientName && counterpartyId == other.counterpartyId && counterpartyBillingAddress == other.counterpartyBillingAddress && counterpartyShippingAddress == other.counterpartyShippingAddress && currency == other.currency && description == other.description && dueDate == other.dueDate && invoicerAddress == other.invoicerAddress && originatingAccountId == other.originatingAccountId && receivingAccountId == other.receivingAccountId && virtualAccountId == other.virtualAccountId && ledgerAccountSettlementId == other.ledgerAccountSettlementId && paymentEffectiveDate == other.paymentEffectiveDate && paymentType == other.paymentType && paymentMethod == other.paymentMethod && fallbackPaymentMethod == other.fallbackPaymentMethod && notificationsEnabled == other.notificationsEnabled && notificationEmailAddresses == other.notificationEmailAddresses && remindAfterOverdueDays == other.remindAfterOverdueDays && metadata == other.metadata && hostedUrl == other.hostedUrl && number == other.number && paymentOrders == other.paymentOrders && expectedPayments == other.expectedPayments && pdfUrl == other.pdfUrl && status == other.status && totalAmount == other.totalAmount && amountRemaining == other.amountRemaining && amountPaid == other.amountPaid && transactionLineItemIds == other.transactionLineItemIds && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, contactDetails, recipientEmail, recipientName, counterpartyId, counterpartyBillingAddress, counterpartyShippingAddress, currency, description, dueDate, invoicerAddress, originatingAccountId, receivingAccountId, virtualAccountId, ledgerAccountSettlementId, paymentEffectiveDate, paymentType, paymentMethod, fallbackPaymentMethod, notificationsEnabled, notificationEmailAddresses, remindAfterOverdueDays, metadata, hostedUrl, number, paymentOrders, expectedPayments, pdfUrl, status, totalAmount, amountRemaining, amountPaid, transactionLineItemIds, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Invoice{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, contactDetails=$contactDetails, recipientEmail=$recipientEmail, recipientName=$recipientName, counterpartyId=$counterpartyId, counterpartyBillingAddress=$counterpartyBillingAddress, counterpartyShippingAddress=$counterpartyShippingAddress, currency=$currency, description=$description, dueDate=$dueDate, invoicerAddress=$invoicerAddress, originatingAccountId=$originatingAccountId, receivingAccountId=$receivingAccountId, virtualAccountId=$virtualAccountId, ledgerAccountSettlementId=$ledgerAccountSettlementId, paymentEffectiveDate=$paymentEffectiveDate, paymentType=$paymentType, paymentMethod=$paymentMethod, fallbackPaymentMethod=$fallbackPaymentMethod, notificationsEnabled=$notificationsEnabled, notificationEmailAddresses=$notificationEmailAddresses, remindAfterOverdueDays=$remindAfterOverdueDays, metadata=$metadata, hostedUrl=$hostedUrl, number=$number, paymentOrders=$paymentOrders, expectedPayments=$expectedPayments, pdfUrl=$pdfUrl, status=$status, totalAmount=$totalAmount, amountRemaining=$amountRemaining, amountPaid=$amountPaid, transactionLineItemIds=$transactionLineItemIds, additionalProperties=$additionalProperties}"
}
