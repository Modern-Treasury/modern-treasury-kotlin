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
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/** update expected payment */
class ExpectedPaymentUpdateParams
private constructor(
    private val id: String,
    private val body: ExpectedPaymentUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    /**
     * The lowest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amountLowerBound(): Long? = body.amountLowerBound()

    /**
     * The highest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amountUpperBound(): Long? = body.amountUpperBound()

    /**
     * The ID of the counterparty you expect for this payment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun counterpartyId(): String? = body.counterpartyId()

    /**
     * Must conform to ISO 4217. Defaults to the currency of the internal account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currency(): Currency? = body.currency()

    /**
     * The earliest date the payment may come in. Format: yyyy-mm-dd
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateLowerBound(): LocalDate? = body.dateLowerBound()

    /**
     * The latest date the payment may come in. Format: yyyy-mm-dd
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateUpperBound(): LocalDate? = body.dateUpperBound()

    /**
     * An optional description for internal use.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * One of credit or debit. When you are receiving money, use credit. When you are being charged,
     * use debit.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun direction(): Direction? = body.direction()

    /**
     * The ID of the Internal Account for the expected payment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun internalAccountId(): String? = body.internalAccountId()

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /** The reconciliation filters you have for this payment. */
    fun _reconciliationFilters(): JsonValue = body._reconciliationFilters()

    /** The reconciliation groups you have for this payment. */
    fun _reconciliationGroups(): JsonValue = body._reconciliationGroups()

    /**
     * An array of reconciliation rule variables for this payment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reconciliationRuleVariables(): List<ReconciliationRule>? =
        body.reconciliationRuleVariables()

    /**
     * For `ach`, this field will be passed through on an addenda record. For `wire` payments the
     * field will be passed through as the "Originator to Beneficiary Information", also known as
     * OBI or Fedwire tag 6000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun remittanceInformation(): String? = body.remittanceInformation()

    /**
     * The statement description you expect to see on the transaction. For ACH payments, this will
     * be the full line item passed from the bank. For wire payments, this will be the OBI field on
     * the wire. For check payments, this will be the memo field.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun statementDescriptor(): String? = body.statementDescriptor()

    /**
     * The Expected Payment's status can be updated from partially_reconciled to reconciled.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Status? = body.status()

    /**
     * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet,
     * wire.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): ExpectedPaymentType? = body.type()

    /**
     * Returns the raw JSON value of [amountLowerBound].
     *
     * Unlike [amountLowerBound], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _amountLowerBound(): JsonField<Long> = body._amountLowerBound()

    /**
     * Returns the raw JSON value of [amountUpperBound].
     *
     * Unlike [amountUpperBound], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _amountUpperBound(): JsonField<Long> = body._amountUpperBound()

    /**
     * Returns the raw JSON value of [counterpartyId].
     *
     * Unlike [counterpartyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _counterpartyId(): JsonField<String> = body._counterpartyId()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<Currency> = body._currency()

    /**
     * Returns the raw JSON value of [dateLowerBound].
     *
     * Unlike [dateLowerBound], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dateLowerBound(): JsonField<LocalDate> = body._dateLowerBound()

    /**
     * Returns the raw JSON value of [dateUpperBound].
     *
     * Unlike [dateUpperBound], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dateUpperBound(): JsonField<LocalDate> = body._dateUpperBound()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _direction(): JsonField<Direction> = body._direction()

    /**
     * Returns the raw JSON value of [internalAccountId].
     *
     * Unlike [internalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _internalAccountId(): JsonField<String> = body._internalAccountId()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [reconciliationRuleVariables].
     *
     * Unlike [reconciliationRuleVariables], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _reconciliationRuleVariables(): JsonField<List<ReconciliationRule>> =
        body._reconciliationRuleVariables()

    /**
     * Returns the raw JSON value of [remittanceInformation].
     *
     * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _remittanceInformation(): JsonField<String> = body._remittanceInformation()

    /**
     * Returns the raw JSON value of [statementDescriptor].
     *
     * Unlike [statementDescriptor], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _statementDescriptor(): JsonField<String> = body._statementDescriptor()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<Status> = body._status()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<ExpectedPaymentType> = body._type()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExpectedPaymentUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ExpectedPaymentUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: ExpectedPaymentUpdateRequest.Builder =
            ExpectedPaymentUpdateRequest.builder()
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
        fun amountLowerBound(amountLowerBound: Long?) = apply {
            body.amountLowerBound(amountLowerBound)
        }

        /**
         * Alias for [Builder.amountLowerBound].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun amountLowerBound(amountLowerBound: Long) = amountLowerBound(amountLowerBound as Long?)

        /**
         * Sets [Builder.amountLowerBound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountLowerBound] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amountLowerBound(amountLowerBound: JsonField<Long>) = apply {
            body.amountLowerBound(amountLowerBound)
        }

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountUpperBound(amountUpperBound: Long?) = apply {
            body.amountUpperBound(amountUpperBound)
        }

        /**
         * Alias for [Builder.amountUpperBound].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun amountUpperBound(amountUpperBound: Long) = amountUpperBound(amountUpperBound as Long?)

        /**
         * Sets [Builder.amountUpperBound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountUpperBound] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amountUpperBound(amountUpperBound: JsonField<Long>) = apply {
            body.amountUpperBound(amountUpperBound)
        }

        /** The ID of the counterparty you expect for this payment. */
        fun counterpartyId(counterpartyId: String?) = apply { body.counterpartyId(counterpartyId) }

        /**
         * Sets [Builder.counterpartyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counterpartyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            body.counterpartyId(counterpartyId)
        }

        /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
        fun currency(currency: Currency?) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { body.currency(currency) }

        /** The earliest date the payment may come in. Format: yyyy-mm-dd */
        fun dateLowerBound(dateLowerBound: LocalDate?) = apply {
            body.dateLowerBound(dateLowerBound)
        }

        /**
         * Sets [Builder.dateLowerBound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateLowerBound] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateLowerBound(dateLowerBound: JsonField<LocalDate>) = apply {
            body.dateLowerBound(dateLowerBound)
        }

        /** The latest date the payment may come in. Format: yyyy-mm-dd */
        fun dateUpperBound(dateUpperBound: LocalDate?) = apply {
            body.dateUpperBound(dateUpperBound)
        }

        /**
         * Sets [Builder.dateUpperBound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateUpperBound] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateUpperBound(dateUpperBound: JsonField<LocalDate>) = apply {
            body.dateUpperBound(dateUpperBound)
        }

        /** An optional description for internal use. */
        fun description(description: String?) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         */
        fun direction(direction: Direction?) = apply { body.direction(direction) }

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { body.direction(direction) }

        /** The ID of the Internal Account for the expected payment. */
        fun internalAccountId(internalAccountId: String?) = apply {
            body.internalAccountId(internalAccountId)
        }

        /**
         * Sets [Builder.internalAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internalAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            body.internalAccountId(internalAccountId)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** The reconciliation filters you have for this payment. */
        fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
            body.reconciliationFilters(reconciliationFilters)
        }

        /** The reconciliation groups you have for this payment. */
        fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
            body.reconciliationGroups(reconciliationGroups)
        }

        /** An array of reconciliation rule variables for this payment. */
        fun reconciliationRuleVariables(reconciliationRuleVariables: List<ReconciliationRule>?) =
            apply {
                body.reconciliationRuleVariables(reconciliationRuleVariables)
            }

        /**
         * Sets [Builder.reconciliationRuleVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reconciliationRuleVariables] with a well-typed
         * `List<ReconciliationRule>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun reconciliationRuleVariables(
            reconciliationRuleVariables: JsonField<List<ReconciliationRule>>
        ) = apply { body.reconciliationRuleVariables(reconciliationRuleVariables) }

        /**
         * Adds a single [ReconciliationRule] to [reconciliationRuleVariables].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReconciliationRuleVariable(reconciliationRuleVariable: ReconciliationRule) = apply {
            body.addReconciliationRuleVariable(reconciliationRuleVariable)
        }

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        fun remittanceInformation(remittanceInformation: String?) = apply {
            body.remittanceInformation(remittanceInformation)
        }

        /**
         * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remittanceInformation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            body.remittanceInformation(remittanceInformation)
        }

        /**
         * The statement description you expect to see on the transaction. For ACH payments, this
         * will be the full line item passed from the bank. For wire payments, this will be the OBI
         * field on the wire. For check payments, this will be the memo field.
         */
        fun statementDescriptor(statementDescriptor: String?) = apply {
            body.statementDescriptor(statementDescriptor)
        }

        /**
         * Sets [Builder.statementDescriptor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementDescriptor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
            body.statementDescriptor(statementDescriptor)
        }

        /** The Expected Payment's status can be updated from partially_reconciled to reconciled. */
        fun status(status: Status?) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { body.status(status) }

        /**
         * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
         * signet, wire.
         */
        fun type(type: ExpectedPaymentType?) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [ExpectedPaymentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<ExpectedPaymentType>) = apply { body.type(type) }

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

        /**
         * Returns an immutable instance of [ExpectedPaymentUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExpectedPaymentUpdateParams =
            ExpectedPaymentUpdateParams(
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    internal fun _body(): ExpectedPaymentUpdateRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class ExpectedPaymentUpdateRequest
    private constructor(
        private val amountLowerBound: JsonField<Long>,
        private val amountUpperBound: JsonField<Long>,
        private val counterpartyId: JsonField<String>,
        private val currency: JsonField<Currency>,
        private val dateLowerBound: JsonField<LocalDate>,
        private val dateUpperBound: JsonField<LocalDate>,
        private val description: JsonField<String>,
        private val direction: JsonField<Direction>,
        private val internalAccountId: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val reconciliationFilters: JsonValue,
        private val reconciliationGroups: JsonValue,
        private val reconciliationRuleVariables: JsonField<List<ReconciliationRule>>,
        private val remittanceInformation: JsonField<String>,
        private val statementDescriptor: JsonField<String>,
        private val status: JsonField<Status>,
        private val type: JsonField<ExpectedPaymentType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount_lower_bound")
            @ExcludeMissing
            amountLowerBound: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("amount_upper_bound")
            @ExcludeMissing
            amountUpperBound: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("counterparty_id")
            @ExcludeMissing
            counterpartyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("date_lower_bound")
            @ExcludeMissing
            dateLowerBound: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("date_upper_bound")
            @ExcludeMissing
            dateUpperBound: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<Direction> = JsonMissing.of(),
            @JsonProperty("internal_account_id")
            @ExcludeMissing
            internalAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("reconciliation_filters")
            @ExcludeMissing
            reconciliationFilters: JsonValue = JsonMissing.of(),
            @JsonProperty("reconciliation_groups")
            @ExcludeMissing
            reconciliationGroups: JsonValue = JsonMissing.of(),
            @JsonProperty("reconciliation_rule_variables")
            @ExcludeMissing
            reconciliationRuleVariables: JsonField<List<ReconciliationRule>> = JsonMissing.of(),
            @JsonProperty("remittance_information")
            @ExcludeMissing
            remittanceInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            statementDescriptor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<ExpectedPaymentType> = JsonMissing.of(),
        ) : this(
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
            mutableMapOf(),
        )

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun amountLowerBound(): Long? = amountLowerBound.getNullable("amount_lower_bound")

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun amountUpperBound(): Long? = amountUpperBound.getNullable("amount_upper_bound")

        /**
         * The ID of the counterparty you expect for this payment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

        /**
         * Must conform to ISO 4217. Defaults to the currency of the internal account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currency(): Currency? = currency.getNullable("currency")

        /**
         * The earliest date the payment may come in. Format: yyyy-mm-dd
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dateLowerBound(): LocalDate? = dateLowerBound.getNullable("date_lower_bound")

        /**
         * The latest date the payment may come in. Format: yyyy-mm-dd
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dateUpperBound(): LocalDate? = dateUpperBound.getNullable("date_upper_bound")

        /**
         * An optional description for internal use.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun direction(): Direction? = direction.getNullable("direction")

        /**
         * The ID of the Internal Account for the expected payment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun internalAccountId(): String? = internalAccountId.getNullable("internal_account_id")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /** The reconciliation filters you have for this payment. */
        @JsonProperty("reconciliation_filters")
        @ExcludeMissing
        fun _reconciliationFilters(): JsonValue = reconciliationFilters

        /** The reconciliation groups you have for this payment. */
        @JsonProperty("reconciliation_groups")
        @ExcludeMissing
        fun _reconciliationGroups(): JsonValue = reconciliationGroups

        /**
         * An array of reconciliation rule variables for this payment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun reconciliationRuleVariables(): List<ReconciliationRule>? =
            reconciliationRuleVariables.getNullable("reconciliation_rule_variables")

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun remittanceInformation(): String? =
            remittanceInformation.getNullable("remittance_information")

        /**
         * The statement description you expect to see on the transaction. For ACH payments, this
         * will be the full line item passed from the bank. For wire payments, this will be the OBI
         * field on the wire. For check payments, this will be the memo field.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun statementDescriptor(): String? = statementDescriptor.getNullable("statement_descriptor")

        /**
         * The Expected Payment's status can be updated from partially_reconciled to reconciled.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): Status? = status.getNullable("status")

        /**
         * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
         * signet, wire.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun type(): ExpectedPaymentType? = type.getNullable("type")

        /**
         * Returns the raw JSON value of [amountLowerBound].
         *
         * Unlike [amountLowerBound], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("amount_lower_bound")
        @ExcludeMissing
        fun _amountLowerBound(): JsonField<Long> = amountLowerBound

        /**
         * Returns the raw JSON value of [amountUpperBound].
         *
         * Unlike [amountUpperBound], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("amount_upper_bound")
        @ExcludeMissing
        fun _amountUpperBound(): JsonField<Long> = amountUpperBound

        /**
         * Returns the raw JSON value of [counterpartyId].
         *
         * Unlike [counterpartyId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        fun _counterpartyId(): JsonField<String> = counterpartyId

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [dateLowerBound].
         *
         * Unlike [dateLowerBound], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("date_lower_bound")
        @ExcludeMissing
        fun _dateLowerBound(): JsonField<LocalDate> = dateLowerBound

        /**
         * Returns the raw JSON value of [dateUpperBound].
         *
         * Unlike [dateUpperBound], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("date_upper_bound")
        @ExcludeMissing
        fun _dateUpperBound(): JsonField<LocalDate> = dateUpperBound

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<Direction> = direction

        /**
         * Returns the raw JSON value of [internalAccountId].
         *
         * Unlike [internalAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        fun _internalAccountId(): JsonField<String> = internalAccountId

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [reconciliationRuleVariables].
         *
         * Unlike [reconciliationRuleVariables], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("reconciliation_rule_variables")
        @ExcludeMissing
        fun _reconciliationRuleVariables(): JsonField<List<ReconciliationRule>> =
            reconciliationRuleVariables

        /**
         * Returns the raw JSON value of [remittanceInformation].
         *
         * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("remittance_information")
        @ExcludeMissing
        fun _remittanceInformation(): JsonField<String> = remittanceInformation

        /**
         * Returns the raw JSON value of [statementDescriptor].
         *
         * Unlike [statementDescriptor], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("statement_descriptor")
        @ExcludeMissing
        fun _statementDescriptor(): JsonField<String> = statementDescriptor

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<ExpectedPaymentType> = type

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
             * [ExpectedPaymentUpdateRequest].
             */
            fun builder() = Builder()
        }

        /** A builder for [ExpectedPaymentUpdateRequest]. */
        class Builder internal constructor() {

            private var amountLowerBound: JsonField<Long> = JsonMissing.of()
            private var amountUpperBound: JsonField<Long> = JsonMissing.of()
            private var counterpartyId: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var dateLowerBound: JsonField<LocalDate> = JsonMissing.of()
            private var dateUpperBound: JsonField<LocalDate> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var direction: JsonField<Direction> = JsonMissing.of()
            private var internalAccountId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var reconciliationFilters: JsonValue = JsonMissing.of()
            private var reconciliationGroups: JsonValue = JsonMissing.of()
            private var reconciliationRuleVariables: JsonField<MutableList<ReconciliationRule>>? =
                null
            private var remittanceInformation: JsonField<String> = JsonMissing.of()
            private var statementDescriptor: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var type: JsonField<ExpectedPaymentType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(expectedPaymentUpdateRequest: ExpectedPaymentUpdateRequest) = apply {
                amountLowerBound = expectedPaymentUpdateRequest.amountLowerBound
                amountUpperBound = expectedPaymentUpdateRequest.amountUpperBound
                counterpartyId = expectedPaymentUpdateRequest.counterpartyId
                currency = expectedPaymentUpdateRequest.currency
                dateLowerBound = expectedPaymentUpdateRequest.dateLowerBound
                dateUpperBound = expectedPaymentUpdateRequest.dateUpperBound
                description = expectedPaymentUpdateRequest.description
                direction = expectedPaymentUpdateRequest.direction
                internalAccountId = expectedPaymentUpdateRequest.internalAccountId
                metadata = expectedPaymentUpdateRequest.metadata
                reconciliationFilters = expectedPaymentUpdateRequest.reconciliationFilters
                reconciliationGroups = expectedPaymentUpdateRequest.reconciliationGroups
                reconciliationRuleVariables =
                    expectedPaymentUpdateRequest.reconciliationRuleVariables.map {
                        it.toMutableList()
                    }
                remittanceInformation = expectedPaymentUpdateRequest.remittanceInformation
                statementDescriptor = expectedPaymentUpdateRequest.statementDescriptor
                status = expectedPaymentUpdateRequest.status
                type = expectedPaymentUpdateRequest.type
                additionalProperties =
                    expectedPaymentUpdateRequest.additionalProperties.toMutableMap()
            }

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amountLowerBound(amountLowerBound: Long?) =
                amountLowerBound(JsonField.ofNullable(amountLowerBound))

            /**
             * Alias for [Builder.amountLowerBound].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun amountLowerBound(amountLowerBound: Long) =
                amountLowerBound(amountLowerBound as Long?)

            /**
             * Sets [Builder.amountLowerBound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountLowerBound] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountLowerBound(amountLowerBound: JsonField<Long>) = apply {
                this.amountLowerBound = amountLowerBound
            }

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amountUpperBound(amountUpperBound: Long?) =
                amountUpperBound(JsonField.ofNullable(amountUpperBound))

            /**
             * Alias for [Builder.amountUpperBound].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun amountUpperBound(amountUpperBound: Long) =
                amountUpperBound(amountUpperBound as Long?)

            /**
             * Sets [Builder.amountUpperBound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountUpperBound] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountUpperBound(amountUpperBound: JsonField<Long>) = apply {
                this.amountUpperBound = amountUpperBound
            }

            /** The ID of the counterparty you expect for this payment. */
            fun counterpartyId(counterpartyId: String?) =
                counterpartyId(JsonField.ofNullable(counterpartyId))

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

            /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
            fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** The earliest date the payment may come in. Format: yyyy-mm-dd */
            fun dateLowerBound(dateLowerBound: LocalDate?) =
                dateLowerBound(JsonField.ofNullable(dateLowerBound))

            /**
             * Sets [Builder.dateLowerBound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateLowerBound] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateLowerBound(dateLowerBound: JsonField<LocalDate>) = apply {
                this.dateLowerBound = dateLowerBound
            }

            /** The latest date the payment may come in. Format: yyyy-mm-dd */
            fun dateUpperBound(dateUpperBound: LocalDate?) =
                dateUpperBound(JsonField.ofNullable(dateUpperBound))

            /**
             * Sets [Builder.dateUpperBound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateUpperBound] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateUpperBound(dateUpperBound: JsonField<LocalDate>) = apply {
                this.dateUpperBound = dateUpperBound
            }

            /** An optional description for internal use. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            fun direction(direction: Direction?) = direction(JsonField.ofNullable(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [Direction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

            /** The ID of the Internal Account for the expected payment. */
            fun internalAccountId(internalAccountId: String?) =
                internalAccountId(JsonField.ofNullable(internalAccountId))

            /**
             * Sets [Builder.internalAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.internalAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun internalAccountId(internalAccountId: JsonField<String>) = apply {
                this.internalAccountId = internalAccountId
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                reconciliationRuleVariables: List<ReconciliationRule>?
            ) = reconciliationRuleVariables(JsonField.ofNullable(reconciliationRuleVariables))

            /**
             * Sets [Builder.reconciliationRuleVariables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reconciliationRuleVariables] with a well-typed
             * `List<ReconciliationRule>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun reconciliationRuleVariables(
                reconciliationRuleVariables: JsonField<List<ReconciliationRule>>
            ) = apply {
                this.reconciliationRuleVariables =
                    reconciliationRuleVariables.map { it.toMutableList() }
            }

            /**
             * Adds a single [ReconciliationRule] to [reconciliationRuleVariables].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReconciliationRuleVariable(reconciliationRuleVariable: ReconciliationRule) =
                apply {
                    reconciliationRuleVariables =
                        (reconciliationRuleVariables ?: JsonField.of(mutableListOf())).also {
                            checkKnown("reconciliationRuleVariables", it)
                                .add(reconciliationRuleVariable)
                        }
                }

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            fun remittanceInformation(remittanceInformation: String?) =
                remittanceInformation(JsonField.ofNullable(remittanceInformation))

            /**
             * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remittanceInformation] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             */
            fun statementDescriptor(statementDescriptor: String?) =
                statementDescriptor(JsonField.ofNullable(statementDescriptor))

            /**
             * Sets [Builder.statementDescriptor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statementDescriptor] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                this.statementDescriptor = statementDescriptor
            }

            /**
             * The Expected Payment's status can be updated from partially_reconciled to reconciled.
             */
            fun status(status: Status?) = status(JsonField.ofNullable(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            fun type(type: ExpectedPaymentType?) = type(JsonField.ofNullable(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [ExpectedPaymentType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<ExpectedPaymentType>) = apply { this.type = type }

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
             * Returns an immutable instance of [ExpectedPaymentUpdateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ExpectedPaymentUpdateRequest =
                ExpectedPaymentUpdateRequest(
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
                    (reconciliationRuleVariables ?: JsonMissing.of()).map { it.toImmutable() },
                    remittanceInformation,
                    statementDescriptor,
                    status,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ExpectedPaymentUpdateRequest = apply {
            if (validated) {
                return@apply
            }

            amountLowerBound()
            amountUpperBound()
            counterpartyId()
            currency()?.validate()
            dateLowerBound()
            dateUpperBound()
            description()
            direction()?.validate()
            internalAccountId()
            metadata()?.validate()
            reconciliationRuleVariables()?.forEach { it.validate() }
            remittanceInformation()
            statementDescriptor()
            status()?.validate()
            type()?.validate()
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
            (if (amountLowerBound.asKnown() == null) 0 else 1) +
                (if (amountUpperBound.asKnown() == null) 0 else 1) +
                (if (counterpartyId.asKnown() == null) 0 else 1) +
                (currency.asKnown()?.validity() ?: 0) +
                (if (dateLowerBound.asKnown() == null) 0 else 1) +
                (if (dateUpperBound.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (direction.asKnown()?.validity() ?: 0) +
                (if (internalAccountId.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (reconciliationRuleVariables.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (remittanceInformation.asKnown() == null) 0 else 1) +
                (if (statementDescriptor.asKnown() == null) 0 else 1) +
                (status.asKnown()?.validity() ?: 0) +
                (type.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExpectedPaymentUpdateRequest && amountLowerBound == other.amountLowerBound && amountUpperBound == other.amountUpperBound && counterpartyId == other.counterpartyId && currency == other.currency && dateLowerBound == other.dateLowerBound && dateUpperBound == other.dateUpperBound && description == other.description && direction == other.direction && internalAccountId == other.internalAccountId && metadata == other.metadata && reconciliationFilters == other.reconciliationFilters && reconciliationGroups == other.reconciliationGroups && reconciliationRuleVariables == other.reconciliationRuleVariables && remittanceInformation == other.remittanceInformation && statementDescriptor == other.statementDescriptor && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amountLowerBound, amountUpperBound, counterpartyId, currency, dateLowerBound, dateUpperBound, description, direction, internalAccountId, metadata, reconciliationFilters, reconciliationGroups, reconciliationRuleVariables, remittanceInformation, statementDescriptor, status, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExpectedPaymentUpdateRequest{amountLowerBound=$amountLowerBound, amountUpperBound=$amountUpperBound, counterpartyId=$counterpartyId, currency=$currency, dateLowerBound=$dateLowerBound, dateUpperBound=$dateUpperBound, description=$description, direction=$direction, internalAccountId=$internalAccountId, metadata=$metadata, reconciliationFilters=$reconciliationFilters, reconciliationGroups=$reconciliationGroups, reconciliationRuleVariables=$reconciliationRuleVariables, remittanceInformation=$remittanceInformation, statementDescriptor=$statementDescriptor, status=$status, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * One of credit or debit. When you are receiving money, use credit. When you are being charged,
     * use debit.
     */
    class Direction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val CREDIT = of("credit")

            val DEBIT = of("debit")

            fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            CREDIT,
            DEBIT,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT,
            DEBIT,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown value.
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
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
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
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
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

        fun validate(): Direction = apply {
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

            return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

    /** The Expected Payment's status can be updated from partially_reconciled to reconciled. */
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

            val RECONCILED = of("reconciled")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            RECONCILED
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
            RECONCILED,
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
                RECONCILED -> Value.RECONCILED
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
                RECONCILED -> Known.RECONCILED
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

        return /* spotless:off */ other is ExpectedPaymentUpdateParams && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExpectedPaymentUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
