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

class Invoice
private constructor(
    private val id: JsonField<String>,
    private val amountPaid: JsonField<Long>,
    private val amountRemaining: JsonField<Long>,
    private val contactDetails: JsonField<List<ContactDetail>>,
    private val counterpartyBillingAddress: JsonField<CounterpartyBillingAddress>,
    private val counterpartyId: JsonField<String>,
    private val counterpartyShippingAddress: JsonField<CounterpartyShippingAddress>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val description: JsonField<String>,
    private val dueDate: JsonField<OffsetDateTime>,
    private val expectedPayments: JsonField<List<ExpectedPayment>>,
    private val fallbackPaymentMethod: JsonField<String>,
    private val hostedUrl: JsonField<String>,
    private val invoicerAddress: JsonField<InvoicerAddress>,
    private val invoicerName: JsonField<String>,
    private val ledgerAccountSettlementId: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val notificationEmailAddresses: JsonField<List<String>>,
    private val notificationsEnabled: JsonField<Boolean>,
    private val number: JsonField<String>,
    private val object_: JsonField<String>,
    private val originatingAccountId: JsonField<String>,
    private val paymentEffectiveDate: JsonField<LocalDate>,
    private val paymentMethod: JsonField<PaymentMethod>,
    private val paymentOrders: JsonField<List<PaymentOrder>>,
    private val paymentType: JsonField<PaymentType>,
    private val pdfUrl: JsonField<String>,
    private val receivingAccountId: JsonField<String>,
    private val recipientEmail: JsonField<String>,
    private val recipientName: JsonField<String>,
    private val remindAfterOverdueDays: JsonField<List<Long>>,
    private val status: JsonField<Status>,
    private val totalAmount: JsonField<Long>,
    private val transactionLineItemIds: JsonField<List<String>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val virtualAccountId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount_paid") @ExcludeMissing amountPaid: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amount_remaining")
        @ExcludeMissing
        amountRemaining: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("contact_details")
        @ExcludeMissing
        contactDetails: JsonField<List<ContactDetail>> = JsonMissing.of(),
        @JsonProperty("counterparty_billing_address")
        @ExcludeMissing
        counterpartyBillingAddress: JsonField<CounterpartyBillingAddress> = JsonMissing.of(),
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        counterpartyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("counterparty_shipping_address")
        @ExcludeMissing
        counterpartyShippingAddress: JsonField<CounterpartyShippingAddress> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("due_date")
        @ExcludeMissing
        dueDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expected_payments")
        @ExcludeMissing
        expectedPayments: JsonField<List<ExpectedPayment>> = JsonMissing.of(),
        @JsonProperty("fallback_payment_method")
        @ExcludeMissing
        fallbackPaymentMethod: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hosted_url") @ExcludeMissing hostedUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoicer_address")
        @ExcludeMissing
        invoicerAddress: JsonField<InvoicerAddress> = JsonMissing.of(),
        @JsonProperty("invoicer_name")
        @ExcludeMissing
        invoicerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_account_settlement_id")
        @ExcludeMissing
        ledgerAccountSettlementId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("notification_email_addresses")
        @ExcludeMissing
        notificationEmailAddresses: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("notifications_enabled")
        @ExcludeMissing
        notificationsEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("number") @ExcludeMissing number: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originating_account_id")
        @ExcludeMissing
        originatingAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_effective_date")
        @ExcludeMissing
        paymentEffectiveDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("payment_method")
        @ExcludeMissing
        paymentMethod: JsonField<PaymentMethod> = JsonMissing.of(),
        @JsonProperty("payment_orders")
        @ExcludeMissing
        paymentOrders: JsonField<List<PaymentOrder>> = JsonMissing.of(),
        @JsonProperty("payment_type")
        @ExcludeMissing
        paymentType: JsonField<PaymentType> = JsonMissing.of(),
        @JsonProperty("pdf_url") @ExcludeMissing pdfUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiving_account_id")
        @ExcludeMissing
        receivingAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_email")
        @ExcludeMissing
        recipientEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_name")
        @ExcludeMissing
        recipientName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remind_after_overdue_days")
        @ExcludeMissing
        remindAfterOverdueDays: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("total_amount")
        @ExcludeMissing
        totalAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("transaction_line_item_ids")
        @ExcludeMissing
        transactionLineItemIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("virtual_account_id")
        @ExcludeMissing
        virtualAccountId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        amountPaid,
        amountRemaining,
        contactDetails,
        counterpartyBillingAddress,
        counterpartyId,
        counterpartyShippingAddress,
        createdAt,
        currency,
        description,
        dueDate,
        expectedPayments,
        fallbackPaymentMethod,
        hostedUrl,
        invoicerAddress,
        invoicerName,
        ledgerAccountSettlementId,
        liveMode,
        metadata,
        notificationEmailAddresses,
        notificationsEnabled,
        number,
        object_,
        originatingAccountId,
        paymentEffectiveDate,
        paymentMethod,
        paymentOrders,
        paymentType,
        pdfUrl,
        receivingAccountId,
        recipientEmail,
        recipientName,
        remindAfterOverdueDays,
        status,
        totalAmount,
        transactionLineItemIds,
        updatedAt,
        virtualAccountId,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Amount paid on the invoice in specified currency's smallest unit, e.g., $10 USD would be
     * represented as 1000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amountPaid(): Long = amountPaid.getRequired("amount_paid")

    /**
     * Amount remaining due on the invoice in specified currency's smallest unit, e.g., $10 USD
     * would be represented as 1000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amountRemaining(): Long = amountRemaining.getRequired("amount_remaining")

    /**
     * The invoicer's contact details displayed at the top of the invoice.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contactDetails(): List<ContactDetail> = contactDetails.getRequired("contact_details")

    /**
     * The counterparty's billing address.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun counterpartyBillingAddress(): CounterpartyBillingAddress? =
        counterpartyBillingAddress.getNullable("counterparty_billing_address")

    /**
     * The ID of the counterparty receiving the invoice.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun counterpartyId(): String = counterpartyId.getRequired("counterparty_id")

    /**
     * The counterparty's shipping address where physical goods should be delivered.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun counterpartyShippingAddress(): CounterpartyShippingAddress? =
        counterpartyShippingAddress.getNullable("counterparty_shipping_address")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Currency that the invoice is denominated in. Defaults to `USD` if not provided.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * An optional free-form description of the invoice.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * A future date by when the invoice needs to be paid.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dueDate(): OffsetDateTime = dueDate.getRequired("due_date")

    /**
     * The expected payments created for an unpaid invoice.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expectedPayments(): List<ExpectedPayment> =
        expectedPayments.getRequired("expected_payments")

    /**
     * When payment_method is automatic, the fallback payment method to use when an automatic
     * payment fails. One of `manual` or `ui`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fallbackPaymentMethod(): String? =
        fallbackPaymentMethod.getNullable("fallback_payment_method")

    /**
     * The URL of the hosted web UI where the invoice can be viewed.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hostedUrl(): String = hostedUrl.getRequired("hosted_url")

    /**
     * The invoice issuer's business address.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun invoicerAddress(): InvoicerAddress? = invoicerAddress.getNullable("invoicer_address")

    /**
     * The name of the issuer for the invoice. Defaults to the name of the Organization.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun invoicerName(): String? = invoicerName.getNullable("invoicer_name")

    /**
     * The ledger account settlement object linked to the invoice.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerAccountSettlementId(): String? =
        ledgerAccountSettlementId.getNullable("ledger_account_settlement_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    /**
     * Emails in addition to the counterparty email to send invoice status notifications to. At
     * least one email is required if notifications are enabled and the counterparty doesn't have an
     * email.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun notificationEmailAddresses(): List<String>? =
        notificationEmailAddresses.getNullable("notification_email_addresses")

    /**
     * If true, the invoice will send email notifications to the invoice recipients about invoice
     * status changes.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun notificationsEnabled(): Boolean = notificationsEnabled.getRequired("notifications_enabled")

    /**
     * A unique record number assigned to each invoice that is issued.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun number(): String = number.getRequired("number")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun object_(): String = object_.getRequired("object")

    /**
     * The ID of the internal account the invoice should be paid to.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originatingAccountId(): String = originatingAccountId.getRequired("originating_account_id")

    /**
     * Date transactions are to be posted to the participants' account. Defaults to the current
     * business day or the next business day if the current day is a bank holiday or weekend.
     * Format: yyyy-mm-dd.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentEffectiveDate(): LocalDate? =
        paymentEffectiveDate.getNullable("payment_effective_date")

    /**
     * When opening an invoice, whether to show the embedded payment UI , automatically debit the
     * recipient, or rely on manual payment from the recipient.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentMethod(): PaymentMethod? = paymentMethod.getNullable("payment_method")

    /**
     * The payment orders created for paying the invoice through the invoice payment UI.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentOrders(): List<PaymentOrder> = paymentOrders.getRequired("payment_orders")

    /**
     * One of `ach` or `eft`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentType(): PaymentType? = paymentType.getNullable("payment_type")

    /**
     * The URL where the invoice PDF can be downloaded.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pdfUrl(): String? = pdfUrl.getNullable("pdf_url")

    /**
     * The receiving account ID. Can be an `internal_account`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun receivingAccountId(): String? = receivingAccountId.getNullable("receiving_account_id")

    /**
     * The email of the recipient of the invoice. Leaving this value as null will fallback to using
     * the counterparty's name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun recipientEmail(): String? = recipientEmail.getNullable("recipient_email")

    /**
     * The name of the recipient of the invoice. Leaving this value as null will fallback to using
     * the counterparty's name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun recipientName(): String? = recipientName.getNullable("recipient_name")

    /**
     * Number of days after due date when overdue reminder emails will be sent out to invoice
     * recipients.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun remindAfterOverdueDays(): List<Long>? =
        remindAfterOverdueDays.getNullable("remind_after_overdue_days")

    /**
     * The status of the invoice.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Total amount due in specified currency's smallest unit, e.g., $10 USD would be represented
     * as 1000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalAmount(): Long = totalAmount.getRequired("total_amount")

    /**
     * IDs of transaction line items associated with an invoice.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionLineItemIds(): List<String> =
        transactionLineItemIds.getRequired("transaction_line_item_ids")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * The ID of the virtual account the invoice should be paid to.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun virtualAccountId(): String? = virtualAccountId.getNullable("virtual_account_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [amountPaid].
     *
     * Unlike [amountPaid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount_paid") @ExcludeMissing fun _amountPaid(): JsonField<Long> = amountPaid

    /**
     * Returns the raw JSON value of [amountRemaining].
     *
     * Unlike [amountRemaining], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount_remaining")
    @ExcludeMissing
    fun _amountRemaining(): JsonField<Long> = amountRemaining

    /**
     * Returns the raw JSON value of [contactDetails].
     *
     * Unlike [contactDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contact_details")
    @ExcludeMissing
    fun _contactDetails(): JsonField<List<ContactDetail>> = contactDetails

    /**
     * Returns the raw JSON value of [counterpartyBillingAddress].
     *
     * Unlike [counterpartyBillingAddress], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("counterparty_billing_address")
    @ExcludeMissing
    fun _counterpartyBillingAddress(): JsonField<CounterpartyBillingAddress> =
        counterpartyBillingAddress

    /**
     * Returns the raw JSON value of [counterpartyId].
     *
     * Unlike [counterpartyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    fun _counterpartyId(): JsonField<String> = counterpartyId

    /**
     * Returns the raw JSON value of [counterpartyShippingAddress].
     *
     * Unlike [counterpartyShippingAddress], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("counterparty_shipping_address")
    @ExcludeMissing
    fun _counterpartyShippingAddress(): JsonField<CounterpartyShippingAddress> =
        counterpartyShippingAddress

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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [dueDate].
     *
     * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("due_date") @ExcludeMissing fun _dueDate(): JsonField<OffsetDateTime> = dueDate

    /**
     * Returns the raw JSON value of [expectedPayments].
     *
     * Unlike [expectedPayments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("expected_payments")
    @ExcludeMissing
    fun _expectedPayments(): JsonField<List<ExpectedPayment>> = expectedPayments

    /**
     * Returns the raw JSON value of [fallbackPaymentMethod].
     *
     * Unlike [fallbackPaymentMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fallback_payment_method")
    @ExcludeMissing
    fun _fallbackPaymentMethod(): JsonField<String> = fallbackPaymentMethod

    /**
     * Returns the raw JSON value of [hostedUrl].
     *
     * Unlike [hostedUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hosted_url") @ExcludeMissing fun _hostedUrl(): JsonField<String> = hostedUrl

    /**
     * Returns the raw JSON value of [invoicerAddress].
     *
     * Unlike [invoicerAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoicer_address")
    @ExcludeMissing
    fun _invoicerAddress(): JsonField<InvoicerAddress> = invoicerAddress

    /**
     * Returns the raw JSON value of [invoicerName].
     *
     * Unlike [invoicerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoicer_name")
    @ExcludeMissing
    fun _invoicerName(): JsonField<String> = invoicerName

    /**
     * Returns the raw JSON value of [ledgerAccountSettlementId].
     *
     * Unlike [ledgerAccountSettlementId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("ledger_account_settlement_id")
    @ExcludeMissing
    fun _ledgerAccountSettlementId(): JsonField<String> = ledgerAccountSettlementId

    /**
     * Returns the raw JSON value of [liveMode].
     *
     * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [notificationEmailAddresses].
     *
     * Unlike [notificationEmailAddresses], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("notification_email_addresses")
    @ExcludeMissing
    fun _notificationEmailAddresses(): JsonField<List<String>> = notificationEmailAddresses

    /**
     * Returns the raw JSON value of [notificationsEnabled].
     *
     * Unlike [notificationsEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("notifications_enabled")
    @ExcludeMissing
    fun _notificationsEnabled(): JsonField<Boolean> = notificationsEnabled

    /**
     * Returns the raw JSON value of [number].
     *
     * Unlike [number], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Returns the raw JSON value of [originatingAccountId].
     *
     * Unlike [originatingAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("originating_account_id")
    @ExcludeMissing
    fun _originatingAccountId(): JsonField<String> = originatingAccountId

    /**
     * Returns the raw JSON value of [paymentEffectiveDate].
     *
     * Unlike [paymentEffectiveDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payment_effective_date")
    @ExcludeMissing
    fun _paymentEffectiveDate(): JsonField<LocalDate> = paymentEffectiveDate

    /**
     * Returns the raw JSON value of [paymentMethod].
     *
     * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_method")
    @ExcludeMissing
    fun _paymentMethod(): JsonField<PaymentMethod> = paymentMethod

    /**
     * Returns the raw JSON value of [paymentOrders].
     *
     * Unlike [paymentOrders], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_orders")
    @ExcludeMissing
    fun _paymentOrders(): JsonField<List<PaymentOrder>> = paymentOrders

    /**
     * Returns the raw JSON value of [paymentType].
     *
     * Unlike [paymentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_type")
    @ExcludeMissing
    fun _paymentType(): JsonField<PaymentType> = paymentType

    /**
     * Returns the raw JSON value of [pdfUrl].
     *
     * Unlike [pdfUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pdf_url") @ExcludeMissing fun _pdfUrl(): JsonField<String> = pdfUrl

    /**
     * Returns the raw JSON value of [receivingAccountId].
     *
     * Unlike [receivingAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("receiving_account_id")
    @ExcludeMissing
    fun _receivingAccountId(): JsonField<String> = receivingAccountId

    /**
     * Returns the raw JSON value of [recipientEmail].
     *
     * Unlike [recipientEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipient_email")
    @ExcludeMissing
    fun _recipientEmail(): JsonField<String> = recipientEmail

    /**
     * Returns the raw JSON value of [recipientName].
     *
     * Unlike [recipientName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipient_name")
    @ExcludeMissing
    fun _recipientName(): JsonField<String> = recipientName

    /**
     * Returns the raw JSON value of [remindAfterOverdueDays].
     *
     * Unlike [remindAfterOverdueDays], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("remind_after_overdue_days")
    @ExcludeMissing
    fun _remindAfterOverdueDays(): JsonField<List<Long>> = remindAfterOverdueDays

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [totalAmount].
     *
     * Unlike [totalAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_amount") @ExcludeMissing fun _totalAmount(): JsonField<Long> = totalAmount

    /**
     * Returns the raw JSON value of [transactionLineItemIds].
     *
     * Unlike [transactionLineItemIds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("transaction_line_item_ids")
    @ExcludeMissing
    fun _transactionLineItemIds(): JsonField<List<String>> = transactionLineItemIds

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [virtualAccountId].
     *
     * Unlike [virtualAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("virtual_account_id")
    @ExcludeMissing
    fun _virtualAccountId(): JsonField<String> = virtualAccountId

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
         * Returns a mutable builder for constructing an instance of [Invoice].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amountPaid()
         * .amountRemaining()
         * .contactDetails()
         * .counterpartyBillingAddress()
         * .counterpartyId()
         * .counterpartyShippingAddress()
         * .createdAt()
         * .currency()
         * .description()
         * .dueDate()
         * .expectedPayments()
         * .fallbackPaymentMethod()
         * .hostedUrl()
         * .invoicerAddress()
         * .invoicerName()
         * .ledgerAccountSettlementId()
         * .liveMode()
         * .metadata()
         * .notificationEmailAddresses()
         * .notificationsEnabled()
         * .number()
         * .object_()
         * .originatingAccountId()
         * .paymentEffectiveDate()
         * .paymentMethod()
         * .paymentOrders()
         * .paymentType()
         * .pdfUrl()
         * .receivingAccountId()
         * .recipientEmail()
         * .recipientName()
         * .remindAfterOverdueDays()
         * .status()
         * .totalAmount()
         * .transactionLineItemIds()
         * .updatedAt()
         * .virtualAccountId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Invoice]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amountPaid: JsonField<Long>? = null
        private var amountRemaining: JsonField<Long>? = null
        private var contactDetails: JsonField<MutableList<ContactDetail>>? = null
        private var counterpartyBillingAddress: JsonField<CounterpartyBillingAddress>? = null
        private var counterpartyId: JsonField<String>? = null
        private var counterpartyShippingAddress: JsonField<CounterpartyShippingAddress>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var description: JsonField<String>? = null
        private var dueDate: JsonField<OffsetDateTime>? = null
        private var expectedPayments: JsonField<MutableList<ExpectedPayment>>? = null
        private var fallbackPaymentMethod: JsonField<String>? = null
        private var hostedUrl: JsonField<String>? = null
        private var invoicerAddress: JsonField<InvoicerAddress>? = null
        private var invoicerName: JsonField<String>? = null
        private var ledgerAccountSettlementId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var notificationEmailAddresses: JsonField<MutableList<String>>? = null
        private var notificationsEnabled: JsonField<Boolean>? = null
        private var number: JsonField<String>? = null
        private var object_: JsonField<String>? = null
        private var originatingAccountId: JsonField<String>? = null
        private var paymentEffectiveDate: JsonField<LocalDate>? = null
        private var paymentMethod: JsonField<PaymentMethod>? = null
        private var paymentOrders: JsonField<MutableList<PaymentOrder>>? = null
        private var paymentType: JsonField<PaymentType>? = null
        private var pdfUrl: JsonField<String>? = null
        private var receivingAccountId: JsonField<String>? = null
        private var recipientEmail: JsonField<String>? = null
        private var recipientName: JsonField<String>? = null
        private var remindAfterOverdueDays: JsonField<MutableList<Long>>? = null
        private var status: JsonField<Status>? = null
        private var totalAmount: JsonField<Long>? = null
        private var transactionLineItemIds: JsonField<MutableList<String>>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var virtualAccountId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoice: Invoice) = apply {
            id = invoice.id
            amountPaid = invoice.amountPaid
            amountRemaining = invoice.amountRemaining
            contactDetails = invoice.contactDetails.map { it.toMutableList() }
            counterpartyBillingAddress = invoice.counterpartyBillingAddress
            counterpartyId = invoice.counterpartyId
            counterpartyShippingAddress = invoice.counterpartyShippingAddress
            createdAt = invoice.createdAt
            currency = invoice.currency
            description = invoice.description
            dueDate = invoice.dueDate
            expectedPayments = invoice.expectedPayments.map { it.toMutableList() }
            fallbackPaymentMethod = invoice.fallbackPaymentMethod
            hostedUrl = invoice.hostedUrl
            invoicerAddress = invoice.invoicerAddress
            invoicerName = invoice.invoicerName
            ledgerAccountSettlementId = invoice.ledgerAccountSettlementId
            liveMode = invoice.liveMode
            metadata = invoice.metadata
            notificationEmailAddresses =
                invoice.notificationEmailAddresses.map { it.toMutableList() }
            notificationsEnabled = invoice.notificationsEnabled
            number = invoice.number
            object_ = invoice.object_
            originatingAccountId = invoice.originatingAccountId
            paymentEffectiveDate = invoice.paymentEffectiveDate
            paymentMethod = invoice.paymentMethod
            paymentOrders = invoice.paymentOrders.map { it.toMutableList() }
            paymentType = invoice.paymentType
            pdfUrl = invoice.pdfUrl
            receivingAccountId = invoice.receivingAccountId
            recipientEmail = invoice.recipientEmail
            recipientName = invoice.recipientName
            remindAfterOverdueDays = invoice.remindAfterOverdueDays.map { it.toMutableList() }
            status = invoice.status
            totalAmount = invoice.totalAmount
            transactionLineItemIds = invoice.transactionLineItemIds.map { it.toMutableList() }
            updatedAt = invoice.updatedAt
            virtualAccountId = invoice.virtualAccountId
            additionalProperties = invoice.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Amount paid on the invoice in specified currency's smallest unit, e.g., $10 USD would be
         * represented as 1000.
         */
        fun amountPaid(amountPaid: Long) = amountPaid(JsonField.of(amountPaid))

        /**
         * Sets [Builder.amountPaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountPaid] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amountPaid(amountPaid: JsonField<Long>) = apply { this.amountPaid = amountPaid }

        /**
         * Amount remaining due on the invoice in specified currency's smallest unit, e.g., $10 USD
         * would be represented as 1000.
         */
        fun amountRemaining(amountRemaining: Long) = amountRemaining(JsonField.of(amountRemaining))

        /**
         * Sets [Builder.amountRemaining] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountRemaining] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amountRemaining(amountRemaining: JsonField<Long>) = apply {
            this.amountRemaining = amountRemaining
        }

        /** The invoicer's contact details displayed at the top of the invoice. */
        fun contactDetails(contactDetails: List<ContactDetail>) =
            contactDetails(JsonField.of(contactDetails))

        /**
         * Sets [Builder.contactDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactDetails] with a well-typed `List<ContactDetail>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun contactDetails(contactDetails: JsonField<List<ContactDetail>>) = apply {
            this.contactDetails = contactDetails.map { it.toMutableList() }
        }

        /**
         * Adds a single [ContactDetail] to [contactDetails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContactDetail(contactDetail: ContactDetail) = apply {
            contactDetails =
                (contactDetails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("contactDetails", it).add(contactDetail)
                }
        }

        /** The counterparty's billing address. */
        fun counterpartyBillingAddress(counterpartyBillingAddress: CounterpartyBillingAddress?) =
            counterpartyBillingAddress(JsonField.ofNullable(counterpartyBillingAddress))

        /**
         * Sets [Builder.counterpartyBillingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counterpartyBillingAddress] with a well-typed
         * [CounterpartyBillingAddress] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun counterpartyBillingAddress(
            counterpartyBillingAddress: JsonField<CounterpartyBillingAddress>
        ) = apply { this.counterpartyBillingAddress = counterpartyBillingAddress }

        /** The ID of the counterparty receiving the invoice. */
        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

        /**
         * Sets [Builder.counterpartyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counterpartyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        /** The counterparty's shipping address where physical goods should be delivered. */
        fun counterpartyShippingAddress(counterpartyShippingAddress: CounterpartyShippingAddress?) =
            counterpartyShippingAddress(JsonField.ofNullable(counterpartyShippingAddress))

        /**
         * Sets [Builder.counterpartyShippingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counterpartyShippingAddress] with a well-typed
         * [CounterpartyShippingAddress] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun counterpartyShippingAddress(
            counterpartyShippingAddress: JsonField<CounterpartyShippingAddress>
        ) = apply { this.counterpartyShippingAddress = counterpartyShippingAddress }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** An optional free-form description of the invoice. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** A future date by when the invoice needs to be paid. */
        fun dueDate(dueDate: OffsetDateTime) = dueDate(JsonField.of(dueDate))

        /**
         * Sets [Builder.dueDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dueDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dueDate(dueDate: JsonField<OffsetDateTime>) = apply { this.dueDate = dueDate }

        /** The expected payments created for an unpaid invoice. */
        fun expectedPayments(expectedPayments: List<ExpectedPayment>) =
            expectedPayments(JsonField.of(expectedPayments))

        /**
         * Sets [Builder.expectedPayments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedPayments] with a well-typed
         * `List<ExpectedPayment>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun expectedPayments(expectedPayments: JsonField<List<ExpectedPayment>>) = apply {
            this.expectedPayments = expectedPayments.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExpectedPayment] to [expectedPayments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExpectedPayment(expectedPayment: ExpectedPayment) = apply {
            expectedPayments =
                (expectedPayments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("expectedPayments", it).add(expectedPayment)
                }
        }

        /**
         * When payment_method is automatic, the fallback payment method to use when an automatic
         * payment fails. One of `manual` or `ui`.
         */
        fun fallbackPaymentMethod(fallbackPaymentMethod: String?) =
            fallbackPaymentMethod(JsonField.ofNullable(fallbackPaymentMethod))

        /**
         * Sets [Builder.fallbackPaymentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fallbackPaymentMethod] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fallbackPaymentMethod(fallbackPaymentMethod: JsonField<String>) = apply {
            this.fallbackPaymentMethod = fallbackPaymentMethod
        }

        /** The URL of the hosted web UI where the invoice can be viewed. */
        fun hostedUrl(hostedUrl: String) = hostedUrl(JsonField.of(hostedUrl))

        /**
         * Sets [Builder.hostedUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostedUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hostedUrl(hostedUrl: JsonField<String>) = apply { this.hostedUrl = hostedUrl }

        /** The invoice issuer's business address. */
        fun invoicerAddress(invoicerAddress: InvoicerAddress?) =
            invoicerAddress(JsonField.ofNullable(invoicerAddress))

        /**
         * Sets [Builder.invoicerAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoicerAddress] with a well-typed [InvoicerAddress]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun invoicerAddress(invoicerAddress: JsonField<InvoicerAddress>) = apply {
            this.invoicerAddress = invoicerAddress
        }

        /** The name of the issuer for the invoice. Defaults to the name of the Organization. */
        fun invoicerName(invoicerName: String?) = invoicerName(JsonField.ofNullable(invoicerName))

        /**
         * Sets [Builder.invoicerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoicerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoicerName(invoicerName: JsonField<String>) = apply {
            this.invoicerName = invoicerName
        }

        /** The ledger account settlement object linked to the invoice. */
        fun ledgerAccountSettlementId(ledgerAccountSettlementId: String?) =
            ledgerAccountSettlementId(JsonField.ofNullable(ledgerAccountSettlementId))

        /**
         * Sets [Builder.ledgerAccountSettlementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerAccountSettlementId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun ledgerAccountSettlementId(ledgerAccountSettlementId: JsonField<String>) = apply {
            this.ledgerAccountSettlementId = ledgerAccountSettlementId
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

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /**
         * Emails in addition to the counterparty email to send invoice status notifications to. At
         * least one email is required if notifications are enabled and the counterparty doesn't
         * have an email.
         */
        fun notificationEmailAddresses(notificationEmailAddresses: List<String>?) =
            notificationEmailAddresses(JsonField.ofNullable(notificationEmailAddresses))

        /**
         * Sets [Builder.notificationEmailAddresses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notificationEmailAddresses] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun notificationEmailAddresses(notificationEmailAddresses: JsonField<List<String>>) =
            apply {
                this.notificationEmailAddresses =
                    notificationEmailAddresses.map { it.toMutableList() }
            }

        /**
         * Adds a single [String] to [notificationEmailAddresses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNotificationEmailAddress(notificationEmailAddress: String) = apply {
            notificationEmailAddresses =
                (notificationEmailAddresses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("notificationEmailAddresses", it).add(notificationEmailAddress)
                }
        }

        /**
         * If true, the invoice will send email notifications to the invoice recipients about
         * invoice status changes.
         */
        fun notificationsEnabled(notificationsEnabled: Boolean) =
            notificationsEnabled(JsonField.of(notificationsEnabled))

        /**
         * Sets [Builder.notificationsEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notificationsEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notificationsEnabled(notificationsEnabled: JsonField<Boolean>) = apply {
            this.notificationsEnabled = notificationsEnabled
        }

        /** A unique record number assigned to each invoice that is issued. */
        fun number(number: String) = number(JsonField.of(number))

        /**
         * Sets [Builder.number] to an arbitrary JSON value.
         *
         * You should usually call [Builder.number] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun number(number: JsonField<String>) = apply { this.number = number }

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The ID of the internal account the invoice should be paid to. */
        fun originatingAccountId(originatingAccountId: String) =
            originatingAccountId(JsonField.of(originatingAccountId))

        /**
         * Sets [Builder.originatingAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatingAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
            this.originatingAccountId = originatingAccountId
        }

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        fun paymentEffectiveDate(paymentEffectiveDate: LocalDate?) =
            paymentEffectiveDate(JsonField.ofNullable(paymentEffectiveDate))

        /**
         * Sets [Builder.paymentEffectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentEffectiveDate] with a well-typed [LocalDate]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun paymentEffectiveDate(paymentEffectiveDate: JsonField<LocalDate>) = apply {
            this.paymentEffectiveDate = paymentEffectiveDate
        }

        /**
         * When opening an invoice, whether to show the embedded payment UI , automatically debit
         * the recipient, or rely on manual payment from the recipient.
         */
        fun paymentMethod(paymentMethod: PaymentMethod?) =
            paymentMethod(JsonField.ofNullable(paymentMethod))

        /**
         * Sets [Builder.paymentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentMethod] with a well-typed [PaymentMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentMethod(paymentMethod: JsonField<PaymentMethod>) = apply {
            this.paymentMethod = paymentMethod
        }

        /** The payment orders created for paying the invoice through the invoice payment UI. */
        fun paymentOrders(paymentOrders: List<PaymentOrder>) =
            paymentOrders(JsonField.of(paymentOrders))

        /**
         * Sets [Builder.paymentOrders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentOrders] with a well-typed `List<PaymentOrder>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun paymentOrders(paymentOrders: JsonField<List<PaymentOrder>>) = apply {
            this.paymentOrders = paymentOrders.map { it.toMutableList() }
        }

        /**
         * Adds a single [PaymentOrder] to [paymentOrders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPaymentOrder(paymentOrder: PaymentOrder) = apply {
            paymentOrders =
                (paymentOrders ?: JsonField.of(mutableListOf())).also {
                    checkKnown("paymentOrders", it).add(paymentOrder)
                }
        }

        /** One of `ach` or `eft`. */
        fun paymentType(paymentType: PaymentType?) = paymentType(JsonField.ofNullable(paymentType))

        /**
         * Sets [Builder.paymentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentType] with a well-typed [PaymentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentType(paymentType: JsonField<PaymentType>) = apply {
            this.paymentType = paymentType
        }

        /** The URL where the invoice PDF can be downloaded. */
        fun pdfUrl(pdfUrl: String?) = pdfUrl(JsonField.ofNullable(pdfUrl))

        /**
         * Sets [Builder.pdfUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pdfUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pdfUrl(pdfUrl: JsonField<String>) = apply { this.pdfUrl = pdfUrl }

        /** The receiving account ID. Can be an `internal_account`. */
        fun receivingAccountId(receivingAccountId: String?) =
            receivingAccountId(JsonField.ofNullable(receivingAccountId))

        /**
         * Sets [Builder.receivingAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receivingAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
            this.receivingAccountId = receivingAccountId
        }

        /**
         * The email of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        fun recipientEmail(recipientEmail: String?) =
            recipientEmail(JsonField.ofNullable(recipientEmail))

        /**
         * Sets [Builder.recipientEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientEmail] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.recipientName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recipientName(recipientName: JsonField<String>) = apply {
            this.recipientName = recipientName
        }

        /**
         * Number of days after due date when overdue reminder emails will be sent out to invoice
         * recipients.
         */
        fun remindAfterOverdueDays(remindAfterOverdueDays: List<Long>?) =
            remindAfterOverdueDays(JsonField.ofNullable(remindAfterOverdueDays))

        /**
         * Sets [Builder.remindAfterOverdueDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remindAfterOverdueDays] with a well-typed `List<Long>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun remindAfterOverdueDays(remindAfterOverdueDays: JsonField<List<Long>>) = apply {
            this.remindAfterOverdueDays = remindAfterOverdueDays.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [remindAfterOverdueDays].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRemindAfterOverdueDay(remindAfterOverdueDay: Long) = apply {
            remindAfterOverdueDays =
                (remindAfterOverdueDays ?: JsonField.of(mutableListOf())).also {
                    checkKnown("remindAfterOverdueDays", it).add(remindAfterOverdueDay)
                }
        }

        /** The status of the invoice. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * Total amount due in specified currency's smallest unit, e.g., $10 USD would be
         * represented as 1000.
         */
        fun totalAmount(totalAmount: Long) = totalAmount(JsonField.of(totalAmount))

        /**
         * Sets [Builder.totalAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalAmount(totalAmount: JsonField<Long>) = apply { this.totalAmount = totalAmount }

        /** IDs of transaction line items associated with an invoice. */
        fun transactionLineItemIds(transactionLineItemIds: List<String>) =
            transactionLineItemIds(JsonField.of(transactionLineItemIds))

        /**
         * Sets [Builder.transactionLineItemIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionLineItemIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transactionLineItemIds(transactionLineItemIds: JsonField<List<String>>) = apply {
            this.transactionLineItemIds = transactionLineItemIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [transactionLineItemIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTransactionLineItemId(transactionLineItemId: String) = apply {
            transactionLineItemIds =
                (transactionLineItemIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("transactionLineItemIds", it).add(transactionLineItemId)
                }
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The ID of the virtual account the invoice should be paid to. */
        fun virtualAccountId(virtualAccountId: String?) =
            virtualAccountId(JsonField.ofNullable(virtualAccountId))

        /**
         * Sets [Builder.virtualAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.virtualAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [Invoice].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amountPaid()
         * .amountRemaining()
         * .contactDetails()
         * .counterpartyBillingAddress()
         * .counterpartyId()
         * .counterpartyShippingAddress()
         * .createdAt()
         * .currency()
         * .description()
         * .dueDate()
         * .expectedPayments()
         * .fallbackPaymentMethod()
         * .hostedUrl()
         * .invoicerAddress()
         * .invoicerName()
         * .ledgerAccountSettlementId()
         * .liveMode()
         * .metadata()
         * .notificationEmailAddresses()
         * .notificationsEnabled()
         * .number()
         * .object_()
         * .originatingAccountId()
         * .paymentEffectiveDate()
         * .paymentMethod()
         * .paymentOrders()
         * .paymentType()
         * .pdfUrl()
         * .receivingAccountId()
         * .recipientEmail()
         * .recipientName()
         * .remindAfterOverdueDays()
         * .status()
         * .totalAmount()
         * .transactionLineItemIds()
         * .updatedAt()
         * .virtualAccountId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Invoice =
            Invoice(
                checkRequired("id", id),
                checkRequired("amountPaid", amountPaid),
                checkRequired("amountRemaining", amountRemaining),
                checkRequired("contactDetails", contactDetails).map { it.toImmutable() },
                checkRequired("counterpartyBillingAddress", counterpartyBillingAddress),
                checkRequired("counterpartyId", counterpartyId),
                checkRequired("counterpartyShippingAddress", counterpartyShippingAddress),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("description", description),
                checkRequired("dueDate", dueDate),
                checkRequired("expectedPayments", expectedPayments).map { it.toImmutable() },
                checkRequired("fallbackPaymentMethod", fallbackPaymentMethod),
                checkRequired("hostedUrl", hostedUrl),
                checkRequired("invoicerAddress", invoicerAddress),
                checkRequired("invoicerName", invoicerName),
                checkRequired("ledgerAccountSettlementId", ledgerAccountSettlementId),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("notificationEmailAddresses", notificationEmailAddresses).map {
                    it.toImmutable()
                },
                checkRequired("notificationsEnabled", notificationsEnabled),
                checkRequired("number", number),
                checkRequired("object_", object_),
                checkRequired("originatingAccountId", originatingAccountId),
                checkRequired("paymentEffectiveDate", paymentEffectiveDate),
                checkRequired("paymentMethod", paymentMethod),
                checkRequired("paymentOrders", paymentOrders).map { it.toImmutable() },
                checkRequired("paymentType", paymentType),
                checkRequired("pdfUrl", pdfUrl),
                checkRequired("receivingAccountId", receivingAccountId),
                checkRequired("recipientEmail", recipientEmail),
                checkRequired("recipientName", recipientName),
                checkRequired("remindAfterOverdueDays", remindAfterOverdueDays).map {
                    it.toImmutable()
                },
                checkRequired("status", status),
                checkRequired("totalAmount", totalAmount),
                checkRequired("transactionLineItemIds", transactionLineItemIds).map {
                    it.toImmutable()
                },
                checkRequired("updatedAt", updatedAt),
                checkRequired("virtualAccountId", virtualAccountId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Invoice = apply {
        if (validated) {
            return@apply
        }

        id()
        amountPaid()
        amountRemaining()
        contactDetails().forEach { it.validate() }
        counterpartyBillingAddress()?.validate()
        counterpartyId()
        counterpartyShippingAddress()?.validate()
        createdAt()
        currency().validate()
        description()
        dueDate()
        expectedPayments().forEach { it.validate() }
        fallbackPaymentMethod()
        hostedUrl()
        invoicerAddress()?.validate()
        invoicerName()
        ledgerAccountSettlementId()
        liveMode()
        metadata()?.validate()
        notificationEmailAddresses()
        notificationsEnabled()
        number()
        object_()
        originatingAccountId()
        paymentEffectiveDate()
        paymentMethod()?.validate()
        paymentOrders().forEach { it.validate() }
        paymentType()?.validate()
        pdfUrl()
        receivingAccountId()
        recipientEmail()
        recipientName()
        remindAfterOverdueDays()
        status().validate()
        totalAmount()
        transactionLineItemIds()
        updatedAt()
        virtualAccountId()
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
            (if (amountPaid.asKnown() == null) 0 else 1) +
            (if (amountRemaining.asKnown() == null) 0 else 1) +
            (contactDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (counterpartyBillingAddress.asKnown()?.validity() ?: 0) +
            (if (counterpartyId.asKnown() == null) 0 else 1) +
            (counterpartyShippingAddress.asKnown()?.validity() ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (currency.asKnown()?.validity() ?: 0) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (dueDate.asKnown() == null) 0 else 1) +
            (expectedPayments.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (fallbackPaymentMethod.asKnown() == null) 0 else 1) +
            (if (hostedUrl.asKnown() == null) 0 else 1) +
            (invoicerAddress.asKnown()?.validity() ?: 0) +
            (if (invoicerName.asKnown() == null) 0 else 1) +
            (if (ledgerAccountSettlementId.asKnown() == null) 0 else 1) +
            (if (liveMode.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (notificationEmailAddresses.asKnown()?.size ?: 0) +
            (if (notificationsEnabled.asKnown() == null) 0 else 1) +
            (if (number.asKnown() == null) 0 else 1) +
            (if (object_.asKnown() == null) 0 else 1) +
            (if (originatingAccountId.asKnown() == null) 0 else 1) +
            (if (paymentEffectiveDate.asKnown() == null) 0 else 1) +
            (paymentMethod.asKnown()?.validity() ?: 0) +
            (paymentOrders.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (paymentType.asKnown()?.validity() ?: 0) +
            (if (pdfUrl.asKnown() == null) 0 else 1) +
            (if (receivingAccountId.asKnown() == null) 0 else 1) +
            (if (recipientEmail.asKnown() == null) 0 else 1) +
            (if (recipientName.asKnown() == null) 0 else 1) +
            (remindAfterOverdueDays.asKnown()?.size ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (if (totalAmount.asKnown() == null) 0 else 1) +
            (transactionLineItemIds.asKnown()?.size ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (virtualAccountId.asKnown() == null) 0 else 1)

    /** The counterparty's billing address. */
    class CounterpartyBillingAddress
    private constructor(
        private val country: JsonField<String>,
        private val line1: JsonField<String>,
        private val locality: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val region: JsonField<String>,
        private val line2: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locality")
            @ExcludeMissing
            locality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
        ) : this(country, line1, locality, postalCode, region, line2, mutableMapOf())

        /**
         * Country code conforms to [ISO 3166-1 alpha-2]
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun line1(): String = line1.getRequired("line1")

        /**
         * Locality or City.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun locality(): String = locality.getRequired("locality")

        /**
         * The postal code of the address.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * Region or State.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun region(): String = region.getRequired("region")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun line2(): String? = line2.getNullable("line2")

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /**
         * Returns the raw JSON value of [locality].
         *
         * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [line2].
         *
         * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
             * Returns a mutable builder for constructing an instance of
             * [CounterpartyBillingAddress].
             *
             * The following fields are required:
             * ```kotlin
             * .country()
             * .line1()
             * .locality()
             * .postalCode()
             * .region()
             * ```
             */
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

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String) = line1(JsonField.of(line1))

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /**
             * Sets [Builder.locality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locality] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun line2(line2: String) = line2(JsonField.of(line2))

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [CounterpartyBillingAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .country()
             * .line1()
             * .locality()
             * .postalCode()
             * .region()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CounterpartyBillingAddress =
                CounterpartyBillingAddress(
                    checkRequired("country", country),
                    checkRequired("line1", line1),
                    checkRequired("locality", locality),
                    checkRequired("postalCode", postalCode),
                    checkRequired("region", region),
                    line2,
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (country.asKnown() == null) 0 else 1) +
                (if (line1.asKnown() == null) 0 else 1) +
                (if (locality.asKnown() == null) 0 else 1) +
                (if (postalCode.asKnown() == null) 0 else 1) +
                (if (region.asKnown() == null) 0 else 1) +
                (if (line2.asKnown() == null) 0 else 1)

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
    class CounterpartyShippingAddress
    private constructor(
        private val country: JsonField<String>,
        private val line1: JsonField<String>,
        private val locality: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val region: JsonField<String>,
        private val line2: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locality")
            @ExcludeMissing
            locality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
        ) : this(country, line1, locality, postalCode, region, line2, mutableMapOf())

        /**
         * Country code conforms to [ISO 3166-1 alpha-2]
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun line1(): String = line1.getRequired("line1")

        /**
         * Locality or City.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun locality(): String = locality.getRequired("locality")

        /**
         * The postal code of the address.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * Region or State.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun region(): String = region.getRequired("region")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun line2(): String? = line2.getNullable("line2")

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /**
         * Returns the raw JSON value of [locality].
         *
         * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [line2].
         *
         * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
             * Returns a mutable builder for constructing an instance of
             * [CounterpartyShippingAddress].
             *
             * The following fields are required:
             * ```kotlin
             * .country()
             * .line1()
             * .locality()
             * .postalCode()
             * .region()
             * ```
             */
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

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String) = line1(JsonField.of(line1))

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /**
             * Sets [Builder.locality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locality] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun line2(line2: String) = line2(JsonField.of(line2))

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [CounterpartyShippingAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .country()
             * .line1()
             * .locality()
             * .postalCode()
             * .region()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CounterpartyShippingAddress =
                CounterpartyShippingAddress(
                    checkRequired("country", country),
                    checkRequired("line1", line1),
                    checkRequired("locality", locality),
                    checkRequired("postalCode", postalCode),
                    checkRequired("region", region),
                    line2,
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (country.asKnown() == null) 0 else 1) +
                (if (line1.asKnown() == null) 0 else 1) +
                (if (locality.asKnown() == null) 0 else 1) +
                (if (postalCode.asKnown() == null) 0 else 1) +
                (if (region.asKnown() == null) 0 else 1) +
                (if (line2.asKnown() == null) 0 else 1)

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

    /** The invoice issuer's business address. */
    class InvoicerAddress
    private constructor(
        private val country: JsonField<String>,
        private val line1: JsonField<String>,
        private val locality: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val region: JsonField<String>,
        private val line2: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locality")
            @ExcludeMissing
            locality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
        ) : this(country, line1, locality, postalCode, region, line2, mutableMapOf())

        /**
         * Country code conforms to [ISO 3166-1 alpha-2]
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun line1(): String = line1.getRequired("line1")

        /**
         * Locality or City.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun locality(): String = locality.getRequired("locality")

        /**
         * The postal code of the address.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * Region or State.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun region(): String = region.getRequired("region")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun line2(): String? = line2.getNullable("line2")

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /**
         * Returns the raw JSON value of [locality].
         *
         * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [line2].
         *
         * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
             * Returns a mutable builder for constructing an instance of [InvoicerAddress].
             *
             * The following fields are required:
             * ```kotlin
             * .country()
             * .line1()
             * .locality()
             * .postalCode()
             * .region()
             * ```
             */
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

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String) = line1(JsonField.of(line1))

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /**
             * Sets [Builder.locality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locality] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun line2(line2: String) = line2(JsonField.of(line2))

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [InvoicerAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .country()
             * .line1()
             * .locality()
             * .postalCode()
             * .region()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): InvoicerAddress =
                InvoicerAddress(
                    checkRequired("country", country),
                    checkRequired("line1", line1),
                    checkRequired("locality", locality),
                    checkRequired("postalCode", postalCode),
                    checkRequired("region", region),
                    line2,
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (country.asKnown() == null) 0 else 1) +
                (if (line1.asKnown() == null) 0 else 1) +
                (if (locality.asKnown() == null) 0 else 1) +
                (if (postalCode.asKnown() == null) 0 else 1) +
                (if (region.asKnown() == null) 0 else 1) +
                (if (line2.asKnown() == null) 0 else 1)

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
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
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

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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
     * When opening an invoice, whether to show the embedded payment UI , automatically debit the
     * recipient, or rely on manual payment from the recipient.
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

        private var validated: Boolean = false

        fun validate(): PaymentMethod = apply {
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

            return /* spotless:off */ other is PaymentMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** One of `ach` or `eft`. */
    class PaymentType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val EFT = of("eft")

            val ACH = of("ach")

            fun of(value: String) = PaymentType(JsonField.of(value))
        }

        /** An enum containing [PaymentType]'s known values. */
        enum class Known {
            EFT,
            ACH,
        }

        /**
         * An enum containing [PaymentType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PaymentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EFT,
            ACH,
            /**
             * An enum member indicating that [PaymentType] was instantiated with an unknown value.
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
                EFT -> Value.EFT
                ACH -> Value.ACH
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
                EFT -> Known.EFT
                ACH -> Known.ACH
                else -> throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
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

        fun validate(): PaymentType = apply {
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

            return /* spotless:off */ other is PaymentType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The status of the invoice. */
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

            val DRAFT = of("draft")

            val PAID = of("paid")

            val PARTIALLY_PAID = of("partially_paid")

            val PAYMENT_PENDING = of("payment_pending")

            val UNPAID = of("unpaid")

            val VOIDED = of("voided")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DRAFT,
            PAID,
            PARTIALLY_PAID,
            PAYMENT_PENDING,
            UNPAID,
            VOIDED,
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
            DRAFT,
            PAID,
            PARTIALLY_PAID,
            PAYMENT_PENDING,
            UNPAID,
            VOIDED,
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
                DRAFT -> Value.DRAFT
                PAID -> Value.PAID
                PARTIALLY_PAID -> Value.PARTIALLY_PAID
                PAYMENT_PENDING -> Value.PAYMENT_PENDING
                UNPAID -> Value.UNPAID
                VOIDED -> Value.VOIDED
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
                DRAFT -> Known.DRAFT
                PAID -> Known.PAID
                PARTIALLY_PAID -> Known.PARTIALLY_PAID
                PAYMENT_PENDING -> Known.PAYMENT_PENDING
                UNPAID -> Known.UNPAID
                VOIDED -> Known.VOIDED
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Invoice && id == other.id && amountPaid == other.amountPaid && amountRemaining == other.amountRemaining && contactDetails == other.contactDetails && counterpartyBillingAddress == other.counterpartyBillingAddress && counterpartyId == other.counterpartyId && counterpartyShippingAddress == other.counterpartyShippingAddress && createdAt == other.createdAt && currency == other.currency && description == other.description && dueDate == other.dueDate && expectedPayments == other.expectedPayments && fallbackPaymentMethod == other.fallbackPaymentMethod && hostedUrl == other.hostedUrl && invoicerAddress == other.invoicerAddress && invoicerName == other.invoicerName && ledgerAccountSettlementId == other.ledgerAccountSettlementId && liveMode == other.liveMode && metadata == other.metadata && notificationEmailAddresses == other.notificationEmailAddresses && notificationsEnabled == other.notificationsEnabled && number == other.number && object_ == other.object_ && originatingAccountId == other.originatingAccountId && paymentEffectiveDate == other.paymentEffectiveDate && paymentMethod == other.paymentMethod && paymentOrders == other.paymentOrders && paymentType == other.paymentType && pdfUrl == other.pdfUrl && receivingAccountId == other.receivingAccountId && recipientEmail == other.recipientEmail && recipientName == other.recipientName && remindAfterOverdueDays == other.remindAfterOverdueDays && status == other.status && totalAmount == other.totalAmount && transactionLineItemIds == other.transactionLineItemIds && updatedAt == other.updatedAt && virtualAccountId == other.virtualAccountId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amountPaid, amountRemaining, contactDetails, counterpartyBillingAddress, counterpartyId, counterpartyShippingAddress, createdAt, currency, description, dueDate, expectedPayments, fallbackPaymentMethod, hostedUrl, invoicerAddress, invoicerName, ledgerAccountSettlementId, liveMode, metadata, notificationEmailAddresses, notificationsEnabled, number, object_, originatingAccountId, paymentEffectiveDate, paymentMethod, paymentOrders, paymentType, pdfUrl, receivingAccountId, recipientEmail, recipientName, remindAfterOverdueDays, status, totalAmount, transactionLineItemIds, updatedAt, virtualAccountId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Invoice{id=$id, amountPaid=$amountPaid, amountRemaining=$amountRemaining, contactDetails=$contactDetails, counterpartyBillingAddress=$counterpartyBillingAddress, counterpartyId=$counterpartyId, counterpartyShippingAddress=$counterpartyShippingAddress, createdAt=$createdAt, currency=$currency, description=$description, dueDate=$dueDate, expectedPayments=$expectedPayments, fallbackPaymentMethod=$fallbackPaymentMethod, hostedUrl=$hostedUrl, invoicerAddress=$invoicerAddress, invoicerName=$invoicerName, ledgerAccountSettlementId=$ledgerAccountSettlementId, liveMode=$liveMode, metadata=$metadata, notificationEmailAddresses=$notificationEmailAddresses, notificationsEnabled=$notificationsEnabled, number=$number, object_=$object_, originatingAccountId=$originatingAccountId, paymentEffectiveDate=$paymentEffectiveDate, paymentMethod=$paymentMethod, paymentOrders=$paymentOrders, paymentType=$paymentType, pdfUrl=$pdfUrl, receivingAccountId=$receivingAccountId, recipientEmail=$recipientEmail, recipientName=$recipientName, remindAfterOverdueDays=$remindAfterOverdueDays, status=$status, totalAmount=$totalAmount, transactionLineItemIds=$transactionLineItemIds, updatedAt=$updatedAt, virtualAccountId=$virtualAccountId, additionalProperties=$additionalProperties}"
}
