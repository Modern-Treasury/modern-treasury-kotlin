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
import java.util.Objects

class ExpectedPaymentCreateParams
constructor(
    private val amountUpperBound: Long,
    private val amountLowerBound: Long,
    private val direction: Direction,
    private val internalAccountId: String,
    private val type: ExpectedPaymentType?,
    private val currency: Currency?,
    private val dateUpperBound: LocalDate?,
    private val dateLowerBound: LocalDate?,
    private val description: String?,
    private val statementDescriptor: String?,
    private val metadata: Metadata?,
    private val counterpartyId: String?,
    private val remittanceInformation: String?,
    private val reconciliationGroups: JsonValue?,
    private val reconciliationFilters: JsonValue?,
    private val lineItems: List<LineItemRequest>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amountUpperBound(): Long = amountUpperBound

    fun amountLowerBound(): Long = amountLowerBound

    fun direction(): Direction = direction

    fun internalAccountId(): String = internalAccountId

    fun type(): ExpectedPaymentType? = type

    fun currency(): Currency? = currency

    fun dateUpperBound(): LocalDate? = dateUpperBound

    fun dateLowerBound(): LocalDate? = dateLowerBound

    fun description(): String? = description

    fun statementDescriptor(): String? = statementDescriptor

    fun metadata(): Metadata? = metadata

    fun counterpartyId(): String? = counterpartyId

    fun remittanceInformation(): String? = remittanceInformation

    fun reconciliationGroups(): JsonValue? = reconciliationGroups

    fun reconciliationFilters(): JsonValue? = reconciliationFilters

    fun lineItems(): List<LineItemRequest>? = lineItems

    internal fun getBody(): ExpectedPaymentCreateBody {
        return ExpectedPaymentCreateBody(
            amountUpperBound,
            amountLowerBound,
            direction,
            internalAccountId,
            type,
            currency,
            dateUpperBound,
            dateLowerBound,
            description,
            statementDescriptor,
            metadata,
            counterpartyId,
            remittanceInformation,
            reconciliationGroups,
            reconciliationFilters,
            lineItems,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ExpectedPaymentCreateBody.Builder::class)
    @NoAutoDetect
    class ExpectedPaymentCreateBody
    internal constructor(
        private val amountUpperBound: Long?,
        private val amountLowerBound: Long?,
        private val direction: Direction?,
        private val internalAccountId: String?,
        private val type: ExpectedPaymentType?,
        private val currency: Currency?,
        private val dateUpperBound: LocalDate?,
        private val dateLowerBound: LocalDate?,
        private val description: String?,
        private val statementDescriptor: String?,
        private val metadata: Metadata?,
        private val counterpartyId: String?,
        private val remittanceInformation: String?,
        private val reconciliationGroups: JsonValue?,
        private val reconciliationFilters: JsonValue?,
        private val lineItems: List<LineItemRequest>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        @JsonProperty("amount_upper_bound") fun amountUpperBound(): Long? = amountUpperBound

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        @JsonProperty("amount_lower_bound") fun amountLowerBound(): Long? = amountLowerBound

        /**
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         */
        @JsonProperty("direction") fun direction(): Direction? = direction

        /** The ID of the Internal Account for the expected payment. */
        @JsonProperty("internal_account_id") fun internalAccountId(): String? = internalAccountId

        /**
         * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
         * signet, wire.
         */
        @JsonProperty("type") fun type(): ExpectedPaymentType? = type

        /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
        @JsonProperty("currency") fun currency(): Currency? = currency

        /** The latest date the payment may come in. Format: yyyy-mm-dd */
        @JsonProperty("date_upper_bound") fun dateUpperBound(): LocalDate? = dateUpperBound

        /** The earliest date the payment may come in. Format: yyyy-mm-dd */
        @JsonProperty("date_lower_bound") fun dateLowerBound(): LocalDate? = dateLowerBound

        /** An optional description for internal use. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * The statement description you expect to see on the transaction. For ACH payments, this
         * will be the full line item passed from the bank. For wire payments, this will be the OBI
         * field on the wire. For check payments, this will be the memo field.
         */
        @JsonProperty("statement_descriptor")
        fun statementDescriptor(): String? = statementDescriptor

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** The ID of the counterparty you expect for this payment. */
        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        @JsonProperty("remittance_information")
        fun remittanceInformation(): String? = remittanceInformation

        /** The reconciliation groups you have for this payment. */
        @JsonProperty("reconciliation_groups")
        fun reconciliationGroups(): JsonValue? = reconciliationGroups

        /** The reconciliation filters you have for this payment. */
        @JsonProperty("reconciliation_filters")
        fun reconciliationFilters(): JsonValue? = reconciliationFilters

        @JsonProperty("line_items") fun lineItems(): List<LineItemRequest>? = lineItems

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExpectedPaymentCreateBody &&
                this.amountUpperBound == other.amountUpperBound &&
                this.amountLowerBound == other.amountLowerBound &&
                this.direction == other.direction &&
                this.internalAccountId == other.internalAccountId &&
                this.type == other.type &&
                this.currency == other.currency &&
                this.dateUpperBound == other.dateUpperBound &&
                this.dateLowerBound == other.dateLowerBound &&
                this.description == other.description &&
                this.statementDescriptor == other.statementDescriptor &&
                this.metadata == other.metadata &&
                this.counterpartyId == other.counterpartyId &&
                this.remittanceInformation == other.remittanceInformation &&
                this.reconciliationGroups == other.reconciliationGroups &&
                this.reconciliationFilters == other.reconciliationFilters &&
                this.lineItems == other.lineItems &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amountUpperBound,
                        amountLowerBound,
                        direction,
                        internalAccountId,
                        type,
                        currency,
                        dateUpperBound,
                        dateLowerBound,
                        description,
                        statementDescriptor,
                        metadata,
                        counterpartyId,
                        remittanceInformation,
                        reconciliationGroups,
                        reconciliationFilters,
                        lineItems,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ExpectedPaymentCreateBody{amountUpperBound=$amountUpperBound, amountLowerBound=$amountLowerBound, direction=$direction, internalAccountId=$internalAccountId, type=$type, currency=$currency, dateUpperBound=$dateUpperBound, dateLowerBound=$dateLowerBound, description=$description, statementDescriptor=$statementDescriptor, metadata=$metadata, counterpartyId=$counterpartyId, remittanceInformation=$remittanceInformation, reconciliationGroups=$reconciliationGroups, reconciliationFilters=$reconciliationFilters, lineItems=$lineItems, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amountUpperBound: Long? = null
            private var amountLowerBound: Long? = null
            private var direction: Direction? = null
            private var internalAccountId: String? = null
            private var type: ExpectedPaymentType? = null
            private var currency: Currency? = null
            private var dateUpperBound: LocalDate? = null
            private var dateLowerBound: LocalDate? = null
            private var description: String? = null
            private var statementDescriptor: String? = null
            private var metadata: Metadata? = null
            private var counterpartyId: String? = null
            private var remittanceInformation: String? = null
            private var reconciliationGroups: JsonValue? = null
            private var reconciliationFilters: JsonValue? = null
            private var lineItems: List<LineItemRequest>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(expectedPaymentCreateBody: ExpectedPaymentCreateBody) = apply {
                this.amountUpperBound = expectedPaymentCreateBody.amountUpperBound
                this.amountLowerBound = expectedPaymentCreateBody.amountLowerBound
                this.direction = expectedPaymentCreateBody.direction
                this.internalAccountId = expectedPaymentCreateBody.internalAccountId
                this.type = expectedPaymentCreateBody.type
                this.currency = expectedPaymentCreateBody.currency
                this.dateUpperBound = expectedPaymentCreateBody.dateUpperBound
                this.dateLowerBound = expectedPaymentCreateBody.dateLowerBound
                this.description = expectedPaymentCreateBody.description
                this.statementDescriptor = expectedPaymentCreateBody.statementDescriptor
                this.metadata = expectedPaymentCreateBody.metadata
                this.counterpartyId = expectedPaymentCreateBody.counterpartyId
                this.remittanceInformation = expectedPaymentCreateBody.remittanceInformation
                this.reconciliationGroups = expectedPaymentCreateBody.reconciliationGroups
                this.reconciliationFilters = expectedPaymentCreateBody.reconciliationFilters
                this.lineItems = expectedPaymentCreateBody.lineItems
                additionalProperties(expectedPaymentCreateBody.additionalProperties)
            }

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_upper_bound")
            fun amountUpperBound(amountUpperBound: Long) = apply {
                this.amountUpperBound = amountUpperBound
            }

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_lower_bound")
            fun amountLowerBound(amountLowerBound: Long) = apply {
                this.amountLowerBound = amountLowerBound
            }

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            @JsonProperty("direction")
            fun direction(direction: Direction) = apply { this.direction = direction }

            /** The ID of the Internal Account for the expected payment. */
            @JsonProperty("internal_account_id")
            fun internalAccountId(internalAccountId: String) = apply {
                this.internalAccountId = internalAccountId
            }

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            @JsonProperty("type") fun type(type: ExpectedPaymentType) = apply { this.type = type }

            /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
            @JsonProperty("currency")
            fun currency(currency: Currency) = apply { this.currency = currency }

            /** The latest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_upper_bound")
            fun dateUpperBound(dateUpperBound: LocalDate) = apply {
                this.dateUpperBound = dateUpperBound
            }

            /** The earliest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_lower_bound")
            fun dateLowerBound(dateLowerBound: LocalDate) = apply {
                this.dateLowerBound = dateLowerBound
            }

            /** An optional description for internal use. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             */
            @JsonProperty("statement_descriptor")
            fun statementDescriptor(statementDescriptor: String) = apply {
                this.statementDescriptor = statementDescriptor
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** The ID of the counterparty you expect for this payment. */
            @JsonProperty("counterparty_id")
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            fun remittanceInformation(remittanceInformation: String) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /** The reconciliation groups you have for this payment. */
            @JsonProperty("reconciliation_groups")
            fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
                this.reconciliationGroups = reconciliationGroups
            }

            /** The reconciliation filters you have for this payment. */
            @JsonProperty("reconciliation_filters")
            fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
                this.reconciliationFilters = reconciliationFilters
            }

            @JsonProperty("line_items")
            fun lineItems(lineItems: List<LineItemRequest>) = apply { this.lineItems = lineItems }

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

            fun build(): ExpectedPaymentCreateBody =
                ExpectedPaymentCreateBody(
                    checkNotNull(amountUpperBound) {
                        "`amountUpperBound` is required but was not set"
                    },
                    checkNotNull(amountLowerBound) {
                        "`amountLowerBound` is required but was not set"
                    },
                    checkNotNull(direction) { "`direction` is required but was not set" },
                    checkNotNull(internalAccountId) {
                        "`internalAccountId` is required but was not set"
                    },
                    type,
                    currency,
                    dateUpperBound,
                    dateLowerBound,
                    description,
                    statementDescriptor,
                    metadata,
                    counterpartyId,
                    remittanceInformation,
                    reconciliationGroups,
                    reconciliationFilters,
                    lineItems?.toUnmodifiable(),
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

        return other is ExpectedPaymentCreateParams &&
            this.amountUpperBound == other.amountUpperBound &&
            this.amountLowerBound == other.amountLowerBound &&
            this.direction == other.direction &&
            this.internalAccountId == other.internalAccountId &&
            this.type == other.type &&
            this.currency == other.currency &&
            this.dateUpperBound == other.dateUpperBound &&
            this.dateLowerBound == other.dateLowerBound &&
            this.description == other.description &&
            this.statementDescriptor == other.statementDescriptor &&
            this.metadata == other.metadata &&
            this.counterpartyId == other.counterpartyId &&
            this.remittanceInformation == other.remittanceInformation &&
            this.reconciliationGroups == other.reconciliationGroups &&
            this.reconciliationFilters == other.reconciliationFilters &&
            this.lineItems == other.lineItems &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amountUpperBound,
            amountLowerBound,
            direction,
            internalAccountId,
            type,
            currency,
            dateUpperBound,
            dateLowerBound,
            description,
            statementDescriptor,
            metadata,
            counterpartyId,
            remittanceInformation,
            reconciliationGroups,
            reconciliationFilters,
            lineItems,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ExpectedPaymentCreateParams{amountUpperBound=$amountUpperBound, amountLowerBound=$amountLowerBound, direction=$direction, internalAccountId=$internalAccountId, type=$type, currency=$currency, dateUpperBound=$dateUpperBound, dateLowerBound=$dateLowerBound, description=$description, statementDescriptor=$statementDescriptor, metadata=$metadata, counterpartyId=$counterpartyId, remittanceInformation=$remittanceInformation, reconciliationGroups=$reconciliationGroups, reconciliationFilters=$reconciliationFilters, lineItems=$lineItems, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amountUpperBound: Long? = null
        private var amountLowerBound: Long? = null
        private var direction: Direction? = null
        private var internalAccountId: String? = null
        private var type: ExpectedPaymentType? = null
        private var currency: Currency? = null
        private var dateUpperBound: LocalDate? = null
        private var dateLowerBound: LocalDate? = null
        private var description: String? = null
        private var statementDescriptor: String? = null
        private var metadata: Metadata? = null
        private var counterpartyId: String? = null
        private var remittanceInformation: String? = null
        private var reconciliationGroups: JsonValue? = null
        private var reconciliationFilters: JsonValue? = null
        private var lineItems: List<LineItemRequest>? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(expectedPaymentCreateParams: ExpectedPaymentCreateParams) = apply {
            this.amountUpperBound = expectedPaymentCreateParams.amountUpperBound
            this.amountLowerBound = expectedPaymentCreateParams.amountLowerBound
            this.direction = expectedPaymentCreateParams.direction
            this.internalAccountId = expectedPaymentCreateParams.internalAccountId
            this.type = expectedPaymentCreateParams.type
            this.currency = expectedPaymentCreateParams.currency
            this.dateUpperBound = expectedPaymentCreateParams.dateUpperBound
            this.dateLowerBound = expectedPaymentCreateParams.dateLowerBound
            this.description = expectedPaymentCreateParams.description
            this.statementDescriptor = expectedPaymentCreateParams.statementDescriptor
            this.metadata = expectedPaymentCreateParams.metadata
            this.counterpartyId = expectedPaymentCreateParams.counterpartyId
            this.remittanceInformation = expectedPaymentCreateParams.remittanceInformation
            this.reconciliationGroups = expectedPaymentCreateParams.reconciliationGroups
            this.reconciliationFilters = expectedPaymentCreateParams.reconciliationFilters
            this.lineItems = expectedPaymentCreateParams.lineItems
            additionalQueryParams(expectedPaymentCreateParams.additionalQueryParams)
            additionalHeaders(expectedPaymentCreateParams.additionalHeaders)
            additionalBodyProperties(expectedPaymentCreateParams.additionalBodyProperties)
        }

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountUpperBound(amountUpperBound: Long) = apply {
            this.amountUpperBound = amountUpperBound
        }

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountLowerBound(amountLowerBound: Long) = apply {
            this.amountLowerBound = amountLowerBound
        }

        /**
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         */
        fun direction(direction: Direction) = apply { this.direction = direction }

        /** The ID of the Internal Account for the expected payment. */
        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
         * signet, wire.
         */
        fun type(type: ExpectedPaymentType) = apply { this.type = type }

        /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
        fun currency(currency: Currency) = apply { this.currency = currency }

        /** The latest date the payment may come in. Format: yyyy-mm-dd */
        fun dateUpperBound(dateUpperBound: LocalDate) = apply {
            this.dateUpperBound = dateUpperBound
        }

        /** The earliest date the payment may come in. Format: yyyy-mm-dd */
        fun dateLowerBound(dateLowerBound: LocalDate) = apply {
            this.dateLowerBound = dateLowerBound
        }

        /** An optional description for internal use. */
        fun description(description: String) = apply { this.description = description }

        /**
         * The statement description you expect to see on the transaction. For ACH payments, this
         * will be the full line item passed from the bank. For wire payments, this will be the OBI
         * field on the wire. For check payments, this will be the memo field.
         */
        fun statementDescriptor(statementDescriptor: String) = apply {
            this.statementDescriptor = statementDescriptor
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** The ID of the counterparty you expect for this payment. */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        fun remittanceInformation(remittanceInformation: String) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /** The reconciliation groups you have for this payment. */
        fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
            this.reconciliationGroups = reconciliationGroups
        }

        /** The reconciliation filters you have for this payment. */
        fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
            this.reconciliationFilters = reconciliationFilters
        }

        fun lineItems(lineItems: List<LineItemRequest>) = apply { this.lineItems = lineItems }

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

        fun build(): ExpectedPaymentCreateParams =
            ExpectedPaymentCreateParams(
                checkNotNull(amountUpperBound) { "`amountUpperBound` is required but was not set" },
                checkNotNull(amountLowerBound) { "`amountLowerBound` is required but was not set" },
                checkNotNull(direction) { "`direction` is required but was not set" },
                checkNotNull(internalAccountId) {
                    "`internalAccountId` is required but was not set"
                },
                type,
                currency,
                dateUpperBound,
                dateLowerBound,
                description,
                statementDescriptor,
                metadata,
                counterpartyId,
                remittanceInformation,
                reconciliationGroups,
                reconciliationFilters,
                lineItems?.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Direction && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CREDIT = Direction(JsonField.of("credit"))

            val DEBIT = Direction(JsonField.of("debit"))

            fun of(value: String) = Direction(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
            DEBIT,
        }

        enum class Value {
            CREDIT,
            DEBIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = LineItemRequest.Builder::class)
    @NoAutoDetect
    class LineItemRequest
    private constructor(
        private val amount: Long?,
        private val metadata: Metadata?,
        private val description: String?,
        private val accountingCategoryId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** A free-form description of the line item. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        @JsonProperty("accounting_category_id")
        fun accountingCategoryId(): String? = accountingCategoryId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LineItemRequest &&
                this.amount == other.amount &&
                this.metadata == other.metadata &&
                this.description == other.description &&
                this.accountingCategoryId == other.accountingCategoryId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        metadata,
                        description,
                        accountingCategoryId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "LineItemRequest{amount=$amount, metadata=$metadata, description=$description, accountingCategoryId=$accountingCategoryId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var metadata: Metadata? = null
            private var description: String? = null
            private var accountingCategoryId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(lineItemRequest: LineItemRequest) = apply {
                this.amount = lineItemRequest.amount
                this.metadata = lineItemRequest.metadata
                this.description = lineItemRequest.description
                this.accountingCategoryId = lineItemRequest.accountingCategoryId
                additionalProperties(lineItemRequest.additionalProperties)
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** A free-form description of the line item. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @JsonProperty("accounting_category_id")
            fun accountingCategoryId(accountingCategoryId: String) = apply {
                this.accountingCategoryId = accountingCategoryId
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

            fun build(): LineItemRequest =
                LineItemRequest(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    metadata,
                    description,
                    accountingCategoryId,
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

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metadata && this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

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
        }
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

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
    }
}
