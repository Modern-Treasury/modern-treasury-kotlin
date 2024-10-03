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
import java.util.Objects

class ExpectedPaymentUpdateParams
constructor(
    private val id: String,
    private val amountLowerBound: Long?,
    private val amountUpperBound: Long?,
    private val counterpartyId: String?,
    private val currency: Currency?,
    private val dateLowerBound: LocalDate?,
    private val dateUpperBound: LocalDate?,
    private val description: String?,
    private val direction: TransactionDirection?,
    private val internalAccountId: String?,
    private val metadata: Metadata?,
    private val reconciliationFilters: JsonValue?,
    private val reconciliationGroups: JsonValue?,
    private val reconciliationRuleVariables: List<ReconciliationRuleVariable>?,
    private val remittanceInformation: String?,
    private val statementDescriptor: String?,
    private val status: Status?,
    private val type: ExpectedPaymentType?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun amountLowerBound(): Long? = amountLowerBound

    fun amountUpperBound(): Long? = amountUpperBound

    fun counterpartyId(): String? = counterpartyId

    fun currency(): Currency? = currency

    fun dateLowerBound(): LocalDate? = dateLowerBound

    fun dateUpperBound(): LocalDate? = dateUpperBound

    fun description(): String? = description

    fun direction(): TransactionDirection? = direction

    fun internalAccountId(): String? = internalAccountId

    fun metadata(): Metadata? = metadata

    fun reconciliationFilters(): JsonValue? = reconciliationFilters

    fun reconciliationGroups(): JsonValue? = reconciliationGroups

    fun reconciliationRuleVariables(): List<ReconciliationRuleVariable>? =
        reconciliationRuleVariables

    fun remittanceInformation(): String? = remittanceInformation

    fun statementDescriptor(): String? = statementDescriptor

    fun status(): Status? = status

    fun type(): ExpectedPaymentType? = type

    internal fun getBody(): ExpectedPaymentUpdateBody {
        return ExpectedPaymentUpdateBody(
            amountLowerBound,
            amountUpperBound,
            counterpartyId,
            currency,
            dateLowerBound,
            dateUpperBound,
            description,
            direction,
            internalAccountId,
            metadata,
            reconciliationFilters,
            reconciliationGroups,
            reconciliationRuleVariables,
            remittanceInformation,
            statementDescriptor,
            status,
            type,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @JsonDeserialize(builder = ExpectedPaymentUpdateBody.Builder::class)
    @NoAutoDetect
    class ExpectedPaymentUpdateBody
    internal constructor(
        private val amountLowerBound: Long?,
        private val amountUpperBound: Long?,
        private val counterpartyId: String?,
        private val currency: Currency?,
        private val dateLowerBound: LocalDate?,
        private val dateUpperBound: LocalDate?,
        private val description: String?,
        private val direction: TransactionDirection?,
        private val internalAccountId: String?,
        private val metadata: Metadata?,
        private val reconciliationFilters: JsonValue?,
        private val reconciliationGroups: JsonValue?,
        private val reconciliationRuleVariables: List<ReconciliationRuleVariable>?,
        private val remittanceInformation: String?,
        private val statementDescriptor: String?,
        private val status: Status?,
        private val type: ExpectedPaymentType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        @JsonProperty("amount_lower_bound") fun amountLowerBound(): Long? = amountLowerBound

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        @JsonProperty("amount_upper_bound") fun amountUpperBound(): Long? = amountUpperBound

        /** The ID of the counterparty you expect for this payment. */
        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

        /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
        @JsonProperty("currency") fun currency(): Currency? = currency

        /** The earliest date the payment may come in. Format: yyyy-mm-dd */
        @JsonProperty("date_lower_bound") fun dateLowerBound(): LocalDate? = dateLowerBound

        /** The latest date the payment may come in. Format: yyyy-mm-dd */
        @JsonProperty("date_upper_bound") fun dateUpperBound(): LocalDate? = dateUpperBound

        /** An optional description for internal use. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         */
        @JsonProperty("direction") fun direction(): TransactionDirection? = direction

        /** The ID of the Internal Account for the expected payment. */
        @JsonProperty("internal_account_id") fun internalAccountId(): String? = internalAccountId

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** The reconciliation filters you have for this payment. */
        @JsonProperty("reconciliation_filters")
        fun reconciliationFilters(): JsonValue? = reconciliationFilters

        /** The reconciliation groups you have for this payment. */
        @JsonProperty("reconciliation_groups")
        fun reconciliationGroups(): JsonValue? = reconciliationGroups

        /** An array of reconciliation rule variables for this payment. */
        @JsonProperty("reconciliation_rule_variables")
        fun reconciliationRuleVariables(): List<ReconciliationRuleVariable>? =
            reconciliationRuleVariables

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        @JsonProperty("remittance_information")
        fun remittanceInformation(): String? = remittanceInformation

        /**
         * The statement description you expect to see on the transaction. For ACH payments, this
         * will be the full line item passed from the bank. For wire payments, this will be the OBI
         * field on the wire. For check payments, this will be the memo field.
         */
        @JsonProperty("statement_descriptor")
        fun statementDescriptor(): String? = statementDescriptor

        /** The Expected Payment's status can be updated from partially_reconciled to reconciled. */
        @JsonProperty("status") fun status(): Status? = status

        /**
         * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
         * signet, wire.
         */
        @JsonProperty("type") fun type(): ExpectedPaymentType? = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amountLowerBound: Long? = null
            private var amountUpperBound: Long? = null
            private var counterpartyId: String? = null
            private var currency: Currency? = null
            private var dateLowerBound: LocalDate? = null
            private var dateUpperBound: LocalDate? = null
            private var description: String? = null
            private var direction: TransactionDirection? = null
            private var internalAccountId: String? = null
            private var metadata: Metadata? = null
            private var reconciliationFilters: JsonValue? = null
            private var reconciliationGroups: JsonValue? = null
            private var reconciliationRuleVariables: List<ReconciliationRuleVariable>? = null
            private var remittanceInformation: String? = null
            private var statementDescriptor: String? = null
            private var status: Status? = null
            private var type: ExpectedPaymentType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(expectedPaymentUpdateBody: ExpectedPaymentUpdateBody) = apply {
                this.amountLowerBound = expectedPaymentUpdateBody.amountLowerBound
                this.amountUpperBound = expectedPaymentUpdateBody.amountUpperBound
                this.counterpartyId = expectedPaymentUpdateBody.counterpartyId
                this.currency = expectedPaymentUpdateBody.currency
                this.dateLowerBound = expectedPaymentUpdateBody.dateLowerBound
                this.dateUpperBound = expectedPaymentUpdateBody.dateUpperBound
                this.description = expectedPaymentUpdateBody.description
                this.direction = expectedPaymentUpdateBody.direction
                this.internalAccountId = expectedPaymentUpdateBody.internalAccountId
                this.metadata = expectedPaymentUpdateBody.metadata
                this.reconciliationFilters = expectedPaymentUpdateBody.reconciliationFilters
                this.reconciliationGroups = expectedPaymentUpdateBody.reconciliationGroups
                this.reconciliationRuleVariables =
                    expectedPaymentUpdateBody.reconciliationRuleVariables
                this.remittanceInformation = expectedPaymentUpdateBody.remittanceInformation
                this.statementDescriptor = expectedPaymentUpdateBody.statementDescriptor
                this.status = expectedPaymentUpdateBody.status
                this.type = expectedPaymentUpdateBody.type
                additionalProperties(expectedPaymentUpdateBody.additionalProperties)
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
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_upper_bound")
            fun amountUpperBound(amountUpperBound: Long) = apply {
                this.amountUpperBound = amountUpperBound
            }

            /** The ID of the counterparty you expect for this payment. */
            @JsonProperty("counterparty_id")
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
            @JsonProperty("currency")
            fun currency(currency: Currency) = apply { this.currency = currency }

            /** The earliest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_lower_bound")
            fun dateLowerBound(dateLowerBound: LocalDate) = apply {
                this.dateLowerBound = dateLowerBound
            }

            /** The latest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_upper_bound")
            fun dateUpperBound(dateUpperBound: LocalDate) = apply {
                this.dateUpperBound = dateUpperBound
            }

            /** An optional description for internal use. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            @JsonProperty("direction")
            fun direction(direction: TransactionDirection) = apply { this.direction = direction }

            /** The ID of the Internal Account for the expected payment. */
            @JsonProperty("internal_account_id")
            fun internalAccountId(internalAccountId: String) = apply {
                this.internalAccountId = internalAccountId
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** The reconciliation filters you have for this payment. */
            @JsonProperty("reconciliation_filters")
            fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
                this.reconciliationFilters = reconciliationFilters
            }

            /** The reconciliation groups you have for this payment. */
            @JsonProperty("reconciliation_groups")
            fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
                this.reconciliationGroups = reconciliationGroups
            }

            /** An array of reconciliation rule variables for this payment. */
            @JsonProperty("reconciliation_rule_variables")
            fun reconciliationRuleVariables(
                reconciliationRuleVariables: List<ReconciliationRuleVariable>
            ) = apply { this.reconciliationRuleVariables = reconciliationRuleVariables }

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            fun remittanceInformation(remittanceInformation: String) = apply {
                this.remittanceInformation = remittanceInformation
            }

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
             * The Expected Payment's status can be updated from partially_reconciled to reconciled.
             */
            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            @JsonProperty("type") fun type(type: ExpectedPaymentType) = apply { this.type = type }

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

            fun build(): ExpectedPaymentUpdateBody =
                ExpectedPaymentUpdateBody(
                    amountLowerBound,
                    amountUpperBound,
                    counterpartyId,
                    currency,
                    dateLowerBound,
                    dateUpperBound,
                    description,
                    direction,
                    internalAccountId,
                    metadata,
                    reconciliationFilters,
                    reconciliationGroups,
                    reconciliationRuleVariables?.toUnmodifiable(),
                    remittanceInformation,
                    statementDescriptor,
                    status,
                    type,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExpectedPaymentUpdateBody && this.amountLowerBound == other.amountLowerBound && this.amountUpperBound == other.amountUpperBound && this.counterpartyId == other.counterpartyId && this.currency == other.currency && this.dateLowerBound == other.dateLowerBound && this.dateUpperBound == other.dateUpperBound && this.description == other.description && this.direction == other.direction && this.internalAccountId == other.internalAccountId && this.metadata == other.metadata && this.reconciliationFilters == other.reconciliationFilters && this.reconciliationGroups == other.reconciliationGroups && this.reconciliationRuleVariables == other.reconciliationRuleVariables && this.remittanceInformation == other.remittanceInformation && this.statementDescriptor == other.statementDescriptor && this.status == other.status && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amountLowerBound, amountUpperBound, counterpartyId, currency, dateLowerBound, dateUpperBound, description, direction, internalAccountId, metadata, reconciliationFilters, reconciliationGroups, reconciliationRuleVariables, remittanceInformation, statementDescriptor, status, type, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ExpectedPaymentUpdateBody{amountLowerBound=$amountLowerBound, amountUpperBound=$amountUpperBound, counterpartyId=$counterpartyId, currency=$currency, dateLowerBound=$dateLowerBound, dateUpperBound=$dateUpperBound, description=$description, direction=$direction, internalAccountId=$internalAccountId, metadata=$metadata, reconciliationFilters=$reconciliationFilters, reconciliationGroups=$reconciliationGroups, reconciliationRuleVariables=$reconciliationRuleVariables, remittanceInformation=$remittanceInformation, statementDescriptor=$statementDescriptor, status=$status, type=$type, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExpectedPaymentUpdateParams && this.id == other.id && this.amountLowerBound == other.amountLowerBound && this.amountUpperBound == other.amountUpperBound && this.counterpartyId == other.counterpartyId && this.currency == other.currency && this.dateLowerBound == other.dateLowerBound && this.dateUpperBound == other.dateUpperBound && this.description == other.description && this.direction == other.direction && this.internalAccountId == other.internalAccountId && this.metadata == other.metadata && this.reconciliationFilters == other.reconciliationFilters && this.reconciliationGroups == other.reconciliationGroups && this.reconciliationRuleVariables == other.reconciliationRuleVariables && this.remittanceInformation == other.remittanceInformation && this.statementDescriptor == other.statementDescriptor && this.status == other.status && this.type == other.type && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(id, amountLowerBound, amountUpperBound, counterpartyId, currency, dateLowerBound, dateUpperBound, description, direction, internalAccountId, metadata, reconciliationFilters, reconciliationGroups, reconciliationRuleVariables, remittanceInformation, statementDescriptor, status, type, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ExpectedPaymentUpdateParams{id=$id, amountLowerBound=$amountLowerBound, amountUpperBound=$amountUpperBound, counterpartyId=$counterpartyId, currency=$currency, dateLowerBound=$dateLowerBound, dateUpperBound=$dateUpperBound, description=$description, direction=$direction, internalAccountId=$internalAccountId, metadata=$metadata, reconciliationFilters=$reconciliationFilters, reconciliationGroups=$reconciliationGroups, reconciliationRuleVariables=$reconciliationRuleVariables, remittanceInformation=$remittanceInformation, statementDescriptor=$statementDescriptor, status=$status, type=$type, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var amountLowerBound: Long? = null
        private var amountUpperBound: Long? = null
        private var counterpartyId: String? = null
        private var currency: Currency? = null
        private var dateLowerBound: LocalDate? = null
        private var dateUpperBound: LocalDate? = null
        private var description: String? = null
        private var direction: TransactionDirection? = null
        private var internalAccountId: String? = null
        private var metadata: Metadata? = null
        private var reconciliationFilters: JsonValue? = null
        private var reconciliationGroups: JsonValue? = null
        private var reconciliationRuleVariables: MutableList<ReconciliationRuleVariable> =
            mutableListOf()
        private var remittanceInformation: String? = null
        private var statementDescriptor: String? = null
        private var status: Status? = null
        private var type: ExpectedPaymentType? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(expectedPaymentUpdateParams: ExpectedPaymentUpdateParams) = apply {
            this.id = expectedPaymentUpdateParams.id
            this.amountLowerBound = expectedPaymentUpdateParams.amountLowerBound
            this.amountUpperBound = expectedPaymentUpdateParams.amountUpperBound
            this.counterpartyId = expectedPaymentUpdateParams.counterpartyId
            this.currency = expectedPaymentUpdateParams.currency
            this.dateLowerBound = expectedPaymentUpdateParams.dateLowerBound
            this.dateUpperBound = expectedPaymentUpdateParams.dateUpperBound
            this.description = expectedPaymentUpdateParams.description
            this.direction = expectedPaymentUpdateParams.direction
            this.internalAccountId = expectedPaymentUpdateParams.internalAccountId
            this.metadata = expectedPaymentUpdateParams.metadata
            this.reconciliationFilters = expectedPaymentUpdateParams.reconciliationFilters
            this.reconciliationGroups = expectedPaymentUpdateParams.reconciliationGroups
            this.reconciliationRuleVariables(
                expectedPaymentUpdateParams.reconciliationRuleVariables ?: listOf()
            )
            this.remittanceInformation = expectedPaymentUpdateParams.remittanceInformation
            this.statementDescriptor = expectedPaymentUpdateParams.statementDescriptor
            this.status = expectedPaymentUpdateParams.status
            this.type = expectedPaymentUpdateParams.type
            additionalQueryParams(expectedPaymentUpdateParams.additionalQueryParams)
            additionalHeaders(expectedPaymentUpdateParams.additionalHeaders)
            additionalBodyProperties(expectedPaymentUpdateParams.additionalBodyProperties)
        }

        fun id(id: String) = apply { this.id = id }

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountLowerBound(amountLowerBound: Long) = apply {
            this.amountLowerBound = amountLowerBound
        }

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountUpperBound(amountUpperBound: Long) = apply {
            this.amountUpperBound = amountUpperBound
        }

        /** The ID of the counterparty you expect for this payment. */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
        fun currency(currency: Currency) = apply { this.currency = currency }

        /** The earliest date the payment may come in. Format: yyyy-mm-dd */
        fun dateLowerBound(dateLowerBound: LocalDate) = apply {
            this.dateLowerBound = dateLowerBound
        }

        /** The latest date the payment may come in. Format: yyyy-mm-dd */
        fun dateUpperBound(dateUpperBound: LocalDate) = apply {
            this.dateUpperBound = dateUpperBound
        }

        /** An optional description for internal use. */
        fun description(description: String) = apply { this.description = description }

        /**
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         */
        fun direction(direction: TransactionDirection) = apply { this.direction = direction }

        /** The ID of the Internal Account for the expected payment. */
        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** The reconciliation filters you have for this payment. */
        fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
            this.reconciliationFilters = reconciliationFilters
        }

        /** The reconciliation groups you have for this payment. */
        fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
            this.reconciliationGroups = reconciliationGroups
        }

        /** An array of reconciliation rule variables for this payment. */
        fun reconciliationRuleVariables(
            reconciliationRuleVariables: List<ReconciliationRuleVariable>
        ) = apply {
            this.reconciliationRuleVariables.clear()
            this.reconciliationRuleVariables.addAll(reconciliationRuleVariables)
        }

        /** An array of reconciliation rule variables for this payment. */
        fun addReconciliationRuleVariable(reconciliationRuleVariable: ReconciliationRuleVariable) =
            apply {
                this.reconciliationRuleVariables.add(reconciliationRuleVariable)
            }

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        fun remittanceInformation(remittanceInformation: String) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /**
         * The statement description you expect to see on the transaction. For ACH payments, this
         * will be the full line item passed from the bank. For wire payments, this will be the OBI
         * field on the wire. For check payments, this will be the memo field.
         */
        fun statementDescriptor(statementDescriptor: String) = apply {
            this.statementDescriptor = statementDescriptor
        }

        /** The Expected Payment's status can be updated from partially_reconciled to reconciled. */
        fun status(status: Status) = apply { this.status = status }

        /**
         * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
         * signet, wire.
         */
        fun type(type: ExpectedPaymentType) = apply { this.type = type }

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

        fun build(): ExpectedPaymentUpdateParams =
            ExpectedPaymentUpdateParams(
                checkNotNull(id) { "`id` is required but was not set" },
                amountLowerBound,
                amountUpperBound,
                counterpartyId,
                currency,
                dateLowerBound,
                dateUpperBound,
                description,
                direction,
                internalAccountId,
                metadata,
                reconciliationFilters,
                reconciliationGroups,
                if (reconciliationRuleVariables.size == 0) null
                else reconciliationRuleVariables.toUnmodifiable(),
                remittanceInformation,
                statementDescriptor,
                status,
                type,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
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

    @JsonDeserialize(builder = ReconciliationRuleVariable.Builder::class)
    @NoAutoDetect
    class ReconciliationRuleVariable
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

            internal fun from(reconciliationRuleVariable: ReconciliationRuleVariable) = apply {
                additionalProperties(reconciliationRuleVariable.additionalProperties)
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

            fun build(): ReconciliationRuleVariable =
                ReconciliationRuleVariable(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReconciliationRuleVariable && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ReconciliationRuleVariable{additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val RECONCILED = Status(JsonField.of("reconciled"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            RECONCILED,
        }

        enum class Value {
            RECONCILED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                RECONCILED -> Value.RECONCILED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                RECONCILED -> Known.RECONCILED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
