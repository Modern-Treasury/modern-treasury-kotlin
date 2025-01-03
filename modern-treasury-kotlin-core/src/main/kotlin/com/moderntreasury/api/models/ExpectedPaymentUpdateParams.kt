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
import java.util.Objects

class ExpectedPaymentUpdateParams
constructor(
    private val id: String,
    private val body: ExpectedPaymentUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun id(): String = id

    /**
     * The lowest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    fun amountLowerBound(): Long? = body.amountLowerBound()

    /**
     * The highest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    fun amountUpperBound(): Long? = body.amountUpperBound()

    /** The ID of the counterparty you expect for this payment. */
    fun counterpartyId(): String? = body.counterpartyId()

    /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
    fun currency(): Currency? = body.currency()

    /** The earliest date the payment may come in. Format: yyyy-mm-dd */
    fun dateLowerBound(): LocalDate? = body.dateLowerBound()

    /** The latest date the payment may come in. Format: yyyy-mm-dd */
    fun dateUpperBound(): LocalDate? = body.dateUpperBound()

    /** An optional description for internal use. */
    fun description(): String? = body.description()

    /**
     * One of credit or debit. When you are receiving money, use credit. When you are being charged,
     * use debit.
     */
    fun direction(): Direction? = body.direction()

    /** The ID of the Internal Account for the expected payment. */
    fun internalAccountId(): String? = body.internalAccountId()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata? = body.metadata()

    /** The reconciliation filters you have for this payment. */
    fun reconciliationFilters(): JsonValue? = body.reconciliationFilters()

    /** The reconciliation groups you have for this payment. */
    fun reconciliationGroups(): JsonValue? = body.reconciliationGroups()

    /** An array of reconciliation rule variables for this payment. */
    fun reconciliationRuleVariables(): List<ReconciliationRule>? =
        body.reconciliationRuleVariables()

    /**
     * For `ach`, this field will be passed through on an addenda record. For `wire` payments the
     * field will be passed through as the "Originator to Beneficiary Information", also known as
     * OBI or Fedwire tag 6000.
     */
    fun remittanceInformation(): String? = body.remittanceInformation()

    /**
     * The statement description you expect to see on the transaction. For ACH payments, this will
     * be the full line item passed from the bank. For wire payments, this will be the OBI field on
     * the wire. For check payments, this will be the memo field.
     */
    fun statementDescriptor(): String? = body.statementDescriptor()

    /** The Expected Payment's status can be updated from partially_reconciled to reconciled. */
    fun status(): Status? = body.status()

    /**
     * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet,
     * wire.
     */
    fun type(): ExpectedPaymentType? = body.type()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): ExpectedPaymentUpdateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class ExpectedPaymentUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount_lower_bound") private val amountLowerBound: Long?,
        @JsonProperty("amount_upper_bound") private val amountUpperBound: Long?,
        @JsonProperty("counterparty_id") private val counterpartyId: String?,
        @JsonProperty("currency") private val currency: Currency?,
        @JsonProperty("date_lower_bound") private val dateLowerBound: LocalDate?,
        @JsonProperty("date_upper_bound") private val dateUpperBound: LocalDate?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("direction") private val direction: Direction?,
        @JsonProperty("internal_account_id") private val internalAccountId: String?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("reconciliation_filters") private val reconciliationFilters: JsonValue?,
        @JsonProperty("reconciliation_groups") private val reconciliationGroups: JsonValue?,
        @JsonProperty("reconciliation_rule_variables")
        private val reconciliationRuleVariables: List<ReconciliationRule>?,
        @JsonProperty("remittance_information") private val remittanceInformation: String?,
        @JsonProperty("statement_descriptor") private val statementDescriptor: String?,
        @JsonProperty("status") private val status: Status?,
        @JsonProperty("type") private val type: ExpectedPaymentType?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
        @JsonProperty("direction") fun direction(): Direction? = direction

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
        fun reconciliationRuleVariables(): List<ReconciliationRule>? = reconciliationRuleVariables

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
            private var direction: Direction? = null
            private var internalAccountId: String? = null
            private var metadata: Metadata? = null
            private var reconciliationFilters: JsonValue? = null
            private var reconciliationGroups: JsonValue? = null
            private var reconciliationRuleVariables: MutableList<ReconciliationRule>? = null
            private var remittanceInformation: String? = null
            private var statementDescriptor: String? = null
            private var status: Status? = null
            private var type: ExpectedPaymentType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(expectedPaymentUpdateBody: ExpectedPaymentUpdateBody) = apply {
                amountLowerBound = expectedPaymentUpdateBody.amountLowerBound
                amountUpperBound = expectedPaymentUpdateBody.amountUpperBound
                counterpartyId = expectedPaymentUpdateBody.counterpartyId
                currency = expectedPaymentUpdateBody.currency
                dateLowerBound = expectedPaymentUpdateBody.dateLowerBound
                dateUpperBound = expectedPaymentUpdateBody.dateUpperBound
                description = expectedPaymentUpdateBody.description
                direction = expectedPaymentUpdateBody.direction
                internalAccountId = expectedPaymentUpdateBody.internalAccountId
                metadata = expectedPaymentUpdateBody.metadata
                reconciliationFilters = expectedPaymentUpdateBody.reconciliationFilters
                reconciliationGroups = expectedPaymentUpdateBody.reconciliationGroups
                reconciliationRuleVariables =
                    expectedPaymentUpdateBody.reconciliationRuleVariables?.toMutableList()
                remittanceInformation = expectedPaymentUpdateBody.remittanceInformation
                statementDescriptor = expectedPaymentUpdateBody.statementDescriptor
                status = expectedPaymentUpdateBody.status
                type = expectedPaymentUpdateBody.type
                additionalProperties = expectedPaymentUpdateBody.additionalProperties.toMutableMap()
            }

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amountLowerBound(amountLowerBound: Long) = apply {
                this.amountLowerBound = amountLowerBound
            }

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amountUpperBound(amountUpperBound: Long) = apply {
                this.amountUpperBound = amountUpperBound
            }

            /** The ID of the counterparty you expect for this payment. */
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

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
            fun direction(direction: Direction) = apply { this.direction = direction }

            /** The ID of the Internal Account for the expected payment. */
            fun internalAccountId(internalAccountId: String) = apply {
                this.internalAccountId = internalAccountId
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
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
            fun reconciliationRuleVariables(reconciliationRuleVariables: List<ReconciliationRule>) =
                apply {
                    this.reconciliationRuleVariables = reconciliationRuleVariables.toMutableList()
                }

            /** An array of reconciliation rule variables for this payment. */
            fun addReconciliationRuleVariable(reconciliationRuleVariable: ReconciliationRule) =
                apply {
                    reconciliationRuleVariables =
                        (reconciliationRuleVariables ?: mutableListOf()).apply {
                            add(reconciliationRuleVariable)
                        }
                }

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            fun remittanceInformation(remittanceInformation: String) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             */
            fun statementDescriptor(statementDescriptor: String) = apply {
                this.statementDescriptor = statementDescriptor
            }

            /**
             * The Expected Payment's status can be updated from partially_reconciled to reconciled.
             */
            fun status(status: Status) = apply { this.status = status }

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            fun type(type: ExpectedPaymentType) = apply { this.type = type }

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
                    reconciliationRuleVariables?.toImmutable(),
                    remittanceInformation,
                    statementDescriptor,
                    status,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExpectedPaymentUpdateBody && amountLowerBound == other.amountLowerBound && amountUpperBound == other.amountUpperBound && counterpartyId == other.counterpartyId && currency == other.currency && dateLowerBound == other.dateLowerBound && dateUpperBound == other.dateUpperBound && description == other.description && direction == other.direction && internalAccountId == other.internalAccountId && metadata == other.metadata && reconciliationFilters == other.reconciliationFilters && reconciliationGroups == other.reconciliationGroups && reconciliationRuleVariables == other.reconciliationRuleVariables && remittanceInformation == other.remittanceInformation && statementDescriptor == other.statementDescriptor && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amountLowerBound, amountUpperBound, counterpartyId, currency, dateLowerBound, dateUpperBound, description, direction, internalAccountId, metadata, reconciliationFilters, reconciliationGroups, reconciliationRuleVariables, remittanceInformation, statementDescriptor, status, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExpectedPaymentUpdateBody{amountLowerBound=$amountLowerBound, amountUpperBound=$amountUpperBound, counterpartyId=$counterpartyId, currency=$currency, dateLowerBound=$dateLowerBound, dateUpperBound=$dateUpperBound, description=$description, direction=$direction, internalAccountId=$internalAccountId, metadata=$metadata, reconciliationFilters=$reconciliationFilters, reconciliationGroups=$reconciliationGroups, reconciliationRuleVariables=$reconciliationRuleVariables, remittanceInformation=$remittanceInformation, statementDescriptor=$statementDescriptor, status=$status, type=$type, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var body: ExpectedPaymentUpdateBody.Builder = ExpectedPaymentUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(expectedPaymentUpdateParams: ExpectedPaymentUpdateParams) = apply {
            id = expectedPaymentUpdateParams.id
            body = expectedPaymentUpdateParams.body.toBuilder()
            additionalHeaders = expectedPaymentUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = expectedPaymentUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountLowerBound(amountLowerBound: Long) = apply {
            body.amountLowerBound(amountLowerBound)
        }

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountUpperBound(amountUpperBound: Long) = apply {
            body.amountUpperBound(amountUpperBound)
        }

        /** The ID of the counterparty you expect for this payment. */
        fun counterpartyId(counterpartyId: String) = apply { body.counterpartyId(counterpartyId) }

        /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
        fun currency(currency: Currency) = apply { body.currency(currency) }

        /** The earliest date the payment may come in. Format: yyyy-mm-dd */
        fun dateLowerBound(dateLowerBound: LocalDate) = apply {
            body.dateLowerBound(dateLowerBound)
        }

        /** The latest date the payment may come in. Format: yyyy-mm-dd */
        fun dateUpperBound(dateUpperBound: LocalDate) = apply {
            body.dateUpperBound(dateUpperBound)
        }

        /** An optional description for internal use. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         */
        fun direction(direction: Direction) = apply { body.direction(direction) }

        /** The ID of the Internal Account for the expected payment. */
        fun internalAccountId(internalAccountId: String) = apply {
            body.internalAccountId(internalAccountId)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /** The reconciliation filters you have for this payment. */
        fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
            body.reconciliationFilters(reconciliationFilters)
        }

        /** The reconciliation groups you have for this payment. */
        fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
            body.reconciliationGroups(reconciliationGroups)
        }

        /** An array of reconciliation rule variables for this payment. */
        fun reconciliationRuleVariables(reconciliationRuleVariables: List<ReconciliationRule>) =
            apply {
                body.reconciliationRuleVariables(reconciliationRuleVariables)
            }

        /** An array of reconciliation rule variables for this payment. */
        fun addReconciliationRuleVariable(reconciliationRuleVariable: ReconciliationRule) = apply {
            body.addReconciliationRuleVariable(reconciliationRuleVariable)
        }

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        fun remittanceInformation(remittanceInformation: String) = apply {
            body.remittanceInformation(remittanceInformation)
        }

        /**
         * The statement description you expect to see on the transaction. For ACH payments, this
         * will be the full line item passed from the bank. For wire payments, this will be the OBI
         * field on the wire. For check payments, this will be the memo field.
         */
        fun statementDescriptor(statementDescriptor: String) = apply {
            body.statementDescriptor(statementDescriptor)
        }

        /** The Expected Payment's status can be updated from partially_reconciled to reconciled. */
        fun status(status: Status) = apply { body.status(status) }

        /**
         * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
         * signet, wire.
         */
        fun type(type: ExpectedPaymentType) = apply { body.type(type) }

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

        fun build(): ExpectedPaymentUpdateParams =
            ExpectedPaymentUpdateParams(
                checkNotNull(id) { "`id` is required but was not set" },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CREDIT = of("credit")

            val DEBIT = of("debit")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val RECONCILED = of("reconciled")

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

        return /* spotless:off */ other is ExpectedPaymentUpdateParams && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExpectedPaymentUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
