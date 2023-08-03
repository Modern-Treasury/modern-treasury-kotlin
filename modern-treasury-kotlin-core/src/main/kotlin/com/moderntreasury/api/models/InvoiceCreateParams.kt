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
    private val contactDetails: List<ContactDetail>?,
    private val counterpartyId: String,
    private val counterpartyBillingAddress: CounterpartyBillingAddress?,
    private val counterpartyShippingAddress: CounterpartyShippingAddress?,
    private val currency: Currency?,
    private val description: String?,
    private val dueDate: OffsetDateTime,
    private val invoicerAddress: InvoicerAddress?,
    private val originatingAccountId: String,
    private val receivingAccountId: String?,
    private val paymentEffectiveDate: LocalDate?,
    private val paymentType: PaymentType?,
    private val paymentMethod: PaymentMethod?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun contactDetails(): List<ContactDetail>? = contactDetails

    fun counterpartyId(): String = counterpartyId

    fun counterpartyBillingAddress(): CounterpartyBillingAddress? = counterpartyBillingAddress

    fun counterpartyShippingAddress(): CounterpartyShippingAddress? = counterpartyShippingAddress

    fun currency(): Currency? = currency

    fun description(): String? = description

    fun dueDate(): OffsetDateTime = dueDate

    fun invoicerAddress(): InvoicerAddress? = invoicerAddress

    fun originatingAccountId(): String = originatingAccountId

    fun receivingAccountId(): String? = receivingAccountId

    fun paymentEffectiveDate(): LocalDate? = paymentEffectiveDate

    fun paymentType(): PaymentType? = paymentType

    fun paymentMethod(): PaymentMethod? = paymentMethod

    internal fun getBody(): InvoiceCreateBody {
        return InvoiceCreateBody(
            contactDetails,
            counterpartyId,
            counterpartyBillingAddress,
            counterpartyShippingAddress,
            currency,
            description,
            dueDate,
            invoicerAddress,
            originatingAccountId,
            receivingAccountId,
            paymentEffectiveDate,
            paymentType,
            paymentMethod,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = InvoiceCreateBody.Builder::class)
    @NoAutoDetect
    class InvoiceCreateBody
    internal constructor(
        private val contactDetails: List<ContactDetail>?,
        private val counterpartyId: String?,
        private val counterpartyBillingAddress: CounterpartyBillingAddress?,
        private val counterpartyShippingAddress: CounterpartyShippingAddress?,
        private val currency: Currency?,
        private val description: String?,
        private val dueDate: OffsetDateTime?,
        private val invoicerAddress: InvoicerAddress?,
        private val originatingAccountId: String?,
        private val receivingAccountId: String?,
        private val paymentEffectiveDate: LocalDate?,
        private val paymentType: PaymentType?,
        private val paymentMethod: PaymentMethod?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The invoicer's contact details displayed at the top of the invoice. */
        @JsonProperty("contact_details") fun contactDetails(): List<ContactDetail>? = contactDetails

        /** The ID of the counterparty receiving the invoice. */
        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

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

        /** A future date by when the invoice needs to be paid. */
        @JsonProperty("due_date") fun dueDate(): OffsetDateTime? = dueDate

        /** The invoice issuer's business address. */
        @JsonProperty("invoicer_address") fun invoicerAddress(): InvoicerAddress? = invoicerAddress

        /** The ID of the internal account the invoice should be paid to. */
        @JsonProperty("originating_account_id")
        fun originatingAccountId(): String? = originatingAccountId

        /** The receiving account ID. Can be an `external_account`. */
        @JsonProperty("receiving_account_id") fun receivingAccountId(): String? = receivingAccountId

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        @JsonProperty("payment_effective_date")
        fun paymentEffectiveDate(): LocalDate? = paymentEffectiveDate

        /**
         * One of `ach`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`, `au_becs`,
         * `interac`, `signet`, `provexchange`.
         */
        @JsonProperty("payment_type") fun paymentType(): PaymentType? = paymentType

        /**
         * The method by which the invoice can be paid. `ui` will show the embedded payment
         * collection flow. `automatic` will automatically initiate payment based upon the account
         * details of the receiving_account id.\nIf the invoice amount is positive, the
         * automatically initiated payment order's direction will be debit. If the invoice amount is
         * negative, the automatically initiated payment order's direction will be credit. One of
         * `manual`, `ui`, or `automatic`.
         */
        @JsonProperty("payment_method") fun paymentMethod(): PaymentMethod? = paymentMethod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InvoiceCreateBody &&
                this.contactDetails == other.contactDetails &&
                this.counterpartyId == other.counterpartyId &&
                this.counterpartyBillingAddress == other.counterpartyBillingAddress &&
                this.counterpartyShippingAddress == other.counterpartyShippingAddress &&
                this.currency == other.currency &&
                this.description == other.description &&
                this.dueDate == other.dueDate &&
                this.invoicerAddress == other.invoicerAddress &&
                this.originatingAccountId == other.originatingAccountId &&
                this.receivingAccountId == other.receivingAccountId &&
                this.paymentEffectiveDate == other.paymentEffectiveDate &&
                this.paymentType == other.paymentType &&
                this.paymentMethod == other.paymentMethod &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        contactDetails,
                        counterpartyId,
                        counterpartyBillingAddress,
                        counterpartyShippingAddress,
                        currency,
                        description,
                        dueDate,
                        invoicerAddress,
                        originatingAccountId,
                        receivingAccountId,
                        paymentEffectiveDate,
                        paymentType,
                        paymentMethod,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "InvoiceCreateBody{contactDetails=$contactDetails, counterpartyId=$counterpartyId, counterpartyBillingAddress=$counterpartyBillingAddress, counterpartyShippingAddress=$counterpartyShippingAddress, currency=$currency, description=$description, dueDate=$dueDate, invoicerAddress=$invoicerAddress, originatingAccountId=$originatingAccountId, receivingAccountId=$receivingAccountId, paymentEffectiveDate=$paymentEffectiveDate, paymentType=$paymentType, paymentMethod=$paymentMethod, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var contactDetails: List<ContactDetail>? = null
            private var counterpartyId: String? = null
            private var counterpartyBillingAddress: CounterpartyBillingAddress? = null
            private var counterpartyShippingAddress: CounterpartyShippingAddress? = null
            private var currency: Currency? = null
            private var description: String? = null
            private var dueDate: OffsetDateTime? = null
            private var invoicerAddress: InvoicerAddress? = null
            private var originatingAccountId: String? = null
            private var receivingAccountId: String? = null
            private var paymentEffectiveDate: LocalDate? = null
            private var paymentType: PaymentType? = null
            private var paymentMethod: PaymentMethod? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoiceCreateBody: InvoiceCreateBody) = apply {
                this.contactDetails = invoiceCreateBody.contactDetails
                this.counterpartyId = invoiceCreateBody.counterpartyId
                this.counterpartyBillingAddress = invoiceCreateBody.counterpartyBillingAddress
                this.counterpartyShippingAddress = invoiceCreateBody.counterpartyShippingAddress
                this.currency = invoiceCreateBody.currency
                this.description = invoiceCreateBody.description
                this.dueDate = invoiceCreateBody.dueDate
                this.invoicerAddress = invoiceCreateBody.invoicerAddress
                this.originatingAccountId = invoiceCreateBody.originatingAccountId
                this.receivingAccountId = invoiceCreateBody.receivingAccountId
                this.paymentEffectiveDate = invoiceCreateBody.paymentEffectiveDate
                this.paymentType = invoiceCreateBody.paymentType
                this.paymentMethod = invoiceCreateBody.paymentMethod
                additionalProperties(invoiceCreateBody.additionalProperties)
            }

            /** The invoicer's contact details displayed at the top of the invoice. */
            @JsonProperty("contact_details")
            fun contactDetails(contactDetails: List<ContactDetail>) = apply {
                this.contactDetails = contactDetails
            }

            /** The ID of the counterparty receiving the invoice. */
            @JsonProperty("counterparty_id")
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
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

            /** A future date by when the invoice needs to be paid. */
            @JsonProperty("due_date")
            fun dueDate(dueDate: OffsetDateTime) = apply { this.dueDate = dueDate }

            /** The invoice issuer's business address. */
            @JsonProperty("invoicer_address")
            fun invoicerAddress(invoicerAddress: InvoicerAddress) = apply {
                this.invoicerAddress = invoicerAddress
            }

            /** The ID of the internal account the invoice should be paid to. */
            @JsonProperty("originating_account_id")
            fun originatingAccountId(originatingAccountId: String) = apply {
                this.originatingAccountId = originatingAccountId
            }

            /** The receiving account ID. Can be an `external_account`. */
            @JsonProperty("receiving_account_id")
            fun receivingAccountId(receivingAccountId: String) = apply {
                this.receivingAccountId = receivingAccountId
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
             * One of `ach`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`,
             * `au_becs`, `interac`, `signet`, `provexchange`.
             */
            @JsonProperty("payment_type")
            fun paymentType(paymentType: PaymentType) = apply { this.paymentType = paymentType }

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
                    contactDetails?.toUnmodifiable(),
                    checkNotNull(counterpartyId) { "`counterpartyId` is required but was not set" },
                    counterpartyBillingAddress,
                    counterpartyShippingAddress,
                    currency,
                    description,
                    checkNotNull(dueDate) { "`dueDate` is required but was not set" },
                    invoicerAddress,
                    checkNotNull(originatingAccountId) {
                        "`originatingAccountId` is required but was not set"
                    },
                    receivingAccountId,
                    paymentEffectiveDate,
                    paymentType,
                    paymentMethod,
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
            this.contactDetails == other.contactDetails &&
            this.counterpartyId == other.counterpartyId &&
            this.counterpartyBillingAddress == other.counterpartyBillingAddress &&
            this.counterpartyShippingAddress == other.counterpartyShippingAddress &&
            this.currency == other.currency &&
            this.description == other.description &&
            this.dueDate == other.dueDate &&
            this.invoicerAddress == other.invoicerAddress &&
            this.originatingAccountId == other.originatingAccountId &&
            this.receivingAccountId == other.receivingAccountId &&
            this.paymentEffectiveDate == other.paymentEffectiveDate &&
            this.paymentType == other.paymentType &&
            this.paymentMethod == other.paymentMethod &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            contactDetails,
            counterpartyId,
            counterpartyBillingAddress,
            counterpartyShippingAddress,
            currency,
            description,
            dueDate,
            invoicerAddress,
            originatingAccountId,
            receivingAccountId,
            paymentEffectiveDate,
            paymentType,
            paymentMethod,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "InvoiceCreateParams{contactDetails=$contactDetails, counterpartyId=$counterpartyId, counterpartyBillingAddress=$counterpartyBillingAddress, counterpartyShippingAddress=$counterpartyShippingAddress, currency=$currency, description=$description, dueDate=$dueDate, invoicerAddress=$invoicerAddress, originatingAccountId=$originatingAccountId, receivingAccountId=$receivingAccountId, paymentEffectiveDate=$paymentEffectiveDate, paymentType=$paymentType, paymentMethod=$paymentMethod, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var contactDetails: List<ContactDetail>? = null
        private var counterpartyId: String? = null
        private var counterpartyBillingAddress: CounterpartyBillingAddress? = null
        private var counterpartyShippingAddress: CounterpartyShippingAddress? = null
        private var currency: Currency? = null
        private var description: String? = null
        private var dueDate: OffsetDateTime? = null
        private var invoicerAddress: InvoicerAddress? = null
        private var originatingAccountId: String? = null
        private var receivingAccountId: String? = null
        private var paymentEffectiveDate: LocalDate? = null
        private var paymentType: PaymentType? = null
        private var paymentMethod: PaymentMethod? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceCreateParams: InvoiceCreateParams) = apply {
            this.contactDetails = invoiceCreateParams.contactDetails
            this.counterpartyId = invoiceCreateParams.counterpartyId
            this.counterpartyBillingAddress = invoiceCreateParams.counterpartyBillingAddress
            this.counterpartyShippingAddress = invoiceCreateParams.counterpartyShippingAddress
            this.currency = invoiceCreateParams.currency
            this.description = invoiceCreateParams.description
            this.dueDate = invoiceCreateParams.dueDate
            this.invoicerAddress = invoiceCreateParams.invoicerAddress
            this.originatingAccountId = invoiceCreateParams.originatingAccountId
            this.receivingAccountId = invoiceCreateParams.receivingAccountId
            this.paymentEffectiveDate = invoiceCreateParams.paymentEffectiveDate
            this.paymentType = invoiceCreateParams.paymentType
            this.paymentMethod = invoiceCreateParams.paymentMethod
            additionalQueryParams(invoiceCreateParams.additionalQueryParams)
            additionalHeaders(invoiceCreateParams.additionalHeaders)
            additionalBodyProperties(invoiceCreateParams.additionalBodyProperties)
        }

        /** The invoicer's contact details displayed at the top of the invoice. */
        fun contactDetails(contactDetails: List<ContactDetail>) = apply {
            this.contactDetails = contactDetails
        }

        /** The ID of the counterparty receiving the invoice. */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

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

        /** A future date by when the invoice needs to be paid. */
        fun dueDate(dueDate: OffsetDateTime) = apply { this.dueDate = dueDate }

        /** The invoice issuer's business address. */
        fun invoicerAddress(invoicerAddress: InvoicerAddress) = apply {
            this.invoicerAddress = invoicerAddress
        }

        /** The ID of the internal account the invoice should be paid to. */
        fun originatingAccountId(originatingAccountId: String) = apply {
            this.originatingAccountId = originatingAccountId
        }

        /** The receiving account ID. Can be an `external_account`. */
        fun receivingAccountId(receivingAccountId: String) = apply {
            this.receivingAccountId = receivingAccountId
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
         * One of `ach`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`, `au_becs`,
         * `interac`, `signet`, `provexchange`.
         */
        fun paymentType(paymentType: PaymentType) = apply { this.paymentType = paymentType }

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
                contactDetails?.toUnmodifiable(),
                checkNotNull(counterpartyId) { "`counterpartyId` is required but was not set" },
                counterpartyBillingAddress,
                counterpartyShippingAddress,
                currency,
                description,
                checkNotNull(dueDate) { "`dueDate` is required but was not set" },
                invoicerAddress,
                checkNotNull(originatingAccountId) {
                    "`originatingAccountId` is required but was not set"
                },
                receivingAccountId,
                paymentEffectiveDate,
                paymentType,
                paymentMethod,
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

            val CHECK = PaymentType(JsonField.of("check"))

            val EFT = PaymentType(JsonField.of("eft"))

            val CROSS_BORDER = PaymentType(JsonField.of("cross_border"))

            val INTERAC = PaymentType(JsonField.of("interac"))

            val MASAV = PaymentType(JsonField.of("masav"))

            val NEFT = PaymentType(JsonField.of("neft"))

            val PROVXCHANGE = PaymentType(JsonField.of("provxchange"))

            val RTP = PaymentType(JsonField.of("rtp"))

            val SEN = PaymentType(JsonField.of("sen"))

            val SEPA = PaymentType(JsonField.of("sepa"))

            val SIGNET = PaymentType(JsonField.of("signet"))

            val WIRE = PaymentType(JsonField.of("wire"))

            fun of(value: String) = PaymentType(JsonField.of(value))
        }

        enum class Known {
            ACH,
            AU_BECS,
            BACS,
            BOOK,
            CARD,
            CHECK,
            EFT,
            CROSS_BORDER,
            INTERAC,
            MASAV,
            NEFT,
            PROVXCHANGE,
            RTP,
            SEN,
            SEPA,
            SIGNET,
            WIRE,
        }

        enum class Value {
            ACH,
            AU_BECS,
            BACS,
            BOOK,
            CARD,
            CHECK,
            EFT,
            CROSS_BORDER,
            INTERAC,
            MASAV,
            NEFT,
            PROVXCHANGE,
            RTP,
            SEN,
            SEPA,
            SIGNET,
            WIRE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                AU_BECS -> Value.AU_BECS
                BACS -> Value.BACS
                BOOK -> Value.BOOK
                CARD -> Value.CARD
                CHECK -> Value.CHECK
                EFT -> Value.EFT
                CROSS_BORDER -> Value.CROSS_BORDER
                INTERAC -> Value.INTERAC
                MASAV -> Value.MASAV
                NEFT -> Value.NEFT
                PROVXCHANGE -> Value.PROVXCHANGE
                RTP -> Value.RTP
                SEN -> Value.SEN
                SEPA -> Value.SEPA
                SIGNET -> Value.SIGNET
                WIRE -> Value.WIRE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                AU_BECS -> Known.AU_BECS
                BACS -> Known.BACS
                BOOK -> Known.BOOK
                CARD -> Known.CARD
                CHECK -> Known.CHECK
                EFT -> Known.EFT
                CROSS_BORDER -> Known.CROSS_BORDER
                INTERAC -> Known.INTERAC
                MASAV -> Known.MASAV
                NEFT -> Known.NEFT
                PROVXCHANGE -> Known.PROVXCHANGE
                RTP -> Known.RTP
                SEN -> Known.SEN
                SEPA -> Known.SEPA
                SIGNET -> Known.SIGNET
                WIRE -> Known.WIRE
                else -> throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
