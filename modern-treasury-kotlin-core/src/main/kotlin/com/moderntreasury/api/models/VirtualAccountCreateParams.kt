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
import java.util.Collections
import java.util.Objects

/** create virtual_account */
class VirtualAccountCreateParams
private constructor(
    private val body: VirtualAccountCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The ID of the internal account that this virtual account is associated with.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun internalAccountId(): String = body.internalAccountId()

    /**
     * The name of the virtual account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * An array of account detail objects.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun accountDetails(): List<AccountDetailCreateRequest>? = body.accountDetails()

    /**
     * The ID of the counterparty that the virtual account belongs to.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun counterpartyId(): String? = body.counterpartyId()

    /**
     * The ID of a credit normal ledger account. When money leaves the virtual account, this ledger
     * account will be credited. Must be accompanied by a debit_ledger_account_id if present.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun creditLedgerAccountId(): String? = body.creditLedgerAccountId()

    /**
     * The ID of a debit normal ledger account. When money enters the virtual account, this ledger
     * account will be debited. Must be accompanied by a credit_ledger_account_id if present.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun debitLedgerAccountId(): String? = body.debitLedgerAccountId()

    /**
     * An optional description for internal use.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * Specifies a ledger account object that will be created with the virtual account. The
     * resulting ledger account is linked to the virtual account for auto-ledgering IPDs.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerAccount(): LedgerAccountCreateRequest? = body.ledgerAccount()

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * An array of routing detail objects.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun routingDetails(): List<RoutingDetailCreateRequest>? = body.routingDetails()

    /**
     * Returns the raw JSON value of [internalAccountId].
     *
     * Unlike [internalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _internalAccountId(): JsonField<String> = body._internalAccountId()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [accountDetails].
     *
     * Unlike [accountDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountDetails(): JsonField<List<AccountDetailCreateRequest>> = body._accountDetails()

    /**
     * Returns the raw JSON value of [counterpartyId].
     *
     * Unlike [counterpartyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _counterpartyId(): JsonField<String> = body._counterpartyId()

    /**
     * Returns the raw JSON value of [creditLedgerAccountId].
     *
     * Unlike [creditLedgerAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _creditLedgerAccountId(): JsonField<String> = body._creditLedgerAccountId()

    /**
     * Returns the raw JSON value of [debitLedgerAccountId].
     *
     * Unlike [debitLedgerAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _debitLedgerAccountId(): JsonField<String> = body._debitLedgerAccountId()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [ledgerAccount].
     *
     * Unlike [ledgerAccount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ledgerAccount(): JsonField<LedgerAccountCreateRequest> = body._ledgerAccount()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [routingDetails].
     *
     * Unlike [routingDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _routingDetails(): JsonField<List<RoutingDetailCreateRequest>> = body._routingDetails()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VirtualAccountCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .internalAccountId()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [VirtualAccountCreateParams]. */
    class Builder internal constructor() {

        private var body: VirtualAccountCreateRequest.Builder =
            VirtualAccountCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(virtualAccountCreateParams: VirtualAccountCreateParams) = apply {
            body = virtualAccountCreateParams.body.toBuilder()
            additionalHeaders = virtualAccountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = virtualAccountCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [internalAccountId]
         * - [name]
         * - [accountDetails]
         * - [counterpartyId]
         * - [creditLedgerAccountId]
         * - etc.
         */
        fun body(body: VirtualAccountCreateRequest) = apply { this.body = body.toBuilder() }

        /** The ID of the internal account that this virtual account is associated with. */
        fun internalAccountId(internalAccountId: String) = apply {
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

        /** The name of the virtual account. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** An array of account detail objects. */
        fun accountDetails(accountDetails: List<AccountDetailCreateRequest>) = apply {
            body.accountDetails(accountDetails)
        }

        /**
         * Sets [Builder.accountDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountDetails] with a well-typed
         * `List<AccountDetailCreateRequest>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun accountDetails(accountDetails: JsonField<List<AccountDetailCreateRequest>>) = apply {
            body.accountDetails(accountDetails)
        }

        /**
         * Adds a single [AccountDetailCreateRequest] to [accountDetails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccountDetail(accountDetail: AccountDetailCreateRequest) = apply {
            body.addAccountDetail(accountDetail)
        }

        /** The ID of the counterparty that the virtual account belongs to. */
        fun counterpartyId(counterpartyId: String) = apply { body.counterpartyId(counterpartyId) }

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

        /**
         * The ID of a credit normal ledger account. When money leaves the virtual account, this
         * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
         * present.
         */
        fun creditLedgerAccountId(creditLedgerAccountId: String) = apply {
            body.creditLedgerAccountId(creditLedgerAccountId)
        }

        /**
         * Sets [Builder.creditLedgerAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditLedgerAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditLedgerAccountId(creditLedgerAccountId: JsonField<String>) = apply {
            body.creditLedgerAccountId(creditLedgerAccountId)
        }

        /**
         * The ID of a debit normal ledger account. When money enters the virtual account, this
         * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
         * present.
         */
        fun debitLedgerAccountId(debitLedgerAccountId: String) = apply {
            body.debitLedgerAccountId(debitLedgerAccountId)
        }

        /**
         * Sets [Builder.debitLedgerAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debitLedgerAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debitLedgerAccountId(debitLedgerAccountId: JsonField<String>) = apply {
            body.debitLedgerAccountId(debitLedgerAccountId)
        }

        /** An optional description for internal use. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Specifies a ledger account object that will be created with the virtual account. The
         * resulting ledger account is linked to the virtual account for auto-ledgering IPDs.
         */
        fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) = apply {
            body.ledgerAccount(ledgerAccount)
        }

        /**
         * Sets [Builder.ledgerAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerAccount] with a well-typed
         * [LedgerAccountCreateRequest] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun ledgerAccount(ledgerAccount: JsonField<LedgerAccountCreateRequest>) = apply {
            body.ledgerAccount(ledgerAccount)
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

        /** An array of routing detail objects. */
        fun routingDetails(routingDetails: List<RoutingDetailCreateRequest>) = apply {
            body.routingDetails(routingDetails)
        }

        /**
         * Sets [Builder.routingDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingDetails] with a well-typed
         * `List<RoutingDetailCreateRequest>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun routingDetails(routingDetails: JsonField<List<RoutingDetailCreateRequest>>) = apply {
            body.routingDetails(routingDetails)
        }

        /**
         * Adds a single [RoutingDetailCreateRequest] to [routingDetails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRoutingDetail(routingDetail: RoutingDetailCreateRequest) = apply {
            body.addRoutingDetail(routingDetail)
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

        /**
         * Returns an immutable instance of [VirtualAccountCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .internalAccountId()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VirtualAccountCreateParams =
            VirtualAccountCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): VirtualAccountCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class VirtualAccountCreateRequest
    private constructor(
        private val internalAccountId: JsonField<String>,
        private val name: JsonField<String>,
        private val accountDetails: JsonField<List<AccountDetailCreateRequest>>,
        private val counterpartyId: JsonField<String>,
        private val creditLedgerAccountId: JsonField<String>,
        private val debitLedgerAccountId: JsonField<String>,
        private val description: JsonField<String>,
        private val ledgerAccount: JsonField<LedgerAccountCreateRequest>,
        private val metadata: JsonField<Metadata>,
        private val routingDetails: JsonField<List<RoutingDetailCreateRequest>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("internal_account_id")
            @ExcludeMissing
            internalAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_details")
            @ExcludeMissing
            accountDetails: JsonField<List<AccountDetailCreateRequest>> = JsonMissing.of(),
            @JsonProperty("counterparty_id")
            @ExcludeMissing
            counterpartyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credit_ledger_account_id")
            @ExcludeMissing
            creditLedgerAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("debit_ledger_account_id")
            @ExcludeMissing
            debitLedgerAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ledger_account")
            @ExcludeMissing
            ledgerAccount: JsonField<LedgerAccountCreateRequest> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("routing_details")
            @ExcludeMissing
            routingDetails: JsonField<List<RoutingDetailCreateRequest>> = JsonMissing.of(),
        ) : this(
            internalAccountId,
            name,
            accountDetails,
            counterpartyId,
            creditLedgerAccountId,
            debitLedgerAccountId,
            description,
            ledgerAccount,
            metadata,
            routingDetails,
            mutableMapOf(),
        )

        /**
         * The ID of the internal account that this virtual account is associated with.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

        /**
         * The name of the virtual account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * An array of account detail objects.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountDetails(): List<AccountDetailCreateRequest>? =
            accountDetails.getNullable("account_details")

        /**
         * The ID of the counterparty that the virtual account belongs to.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

        /**
         * The ID of a credit normal ledger account. When money leaves the virtual account, this
         * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
         * present.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun creditLedgerAccountId(): String? =
            creditLedgerAccountId.getNullable("credit_ledger_account_id")

        /**
         * The ID of a debit normal ledger account. When money enters the virtual account, this
         * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
         * present.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun debitLedgerAccountId(): String? =
            debitLedgerAccountId.getNullable("debit_ledger_account_id")

        /**
         * An optional description for internal use.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * Specifies a ledger account object that will be created with the virtual account. The
         * resulting ledger account is linked to the virtual account for auto-ledgering IPDs.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ledgerAccount(): LedgerAccountCreateRequest? =
            ledgerAccount.getNullable("ledger_account")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * An array of routing detail objects.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun routingDetails(): List<RoutingDetailCreateRequest>? =
            routingDetails.getNullable("routing_details")

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [accountDetails].
         *
         * Unlike [accountDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_details")
        @ExcludeMissing
        fun _accountDetails(): JsonField<List<AccountDetailCreateRequest>> = accountDetails

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
         * Returns the raw JSON value of [creditLedgerAccountId].
         *
         * Unlike [creditLedgerAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("credit_ledger_account_id")
        @ExcludeMissing
        fun _creditLedgerAccountId(): JsonField<String> = creditLedgerAccountId

        /**
         * Returns the raw JSON value of [debitLedgerAccountId].
         *
         * Unlike [debitLedgerAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("debit_ledger_account_id")
        @ExcludeMissing
        fun _debitLedgerAccountId(): JsonField<String> = debitLedgerAccountId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [ledgerAccount].
         *
         * Unlike [ledgerAccount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ledger_account")
        @ExcludeMissing
        fun _ledgerAccount(): JsonField<LedgerAccountCreateRequest> = ledgerAccount

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [routingDetails].
         *
         * Unlike [routingDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_details")
        @ExcludeMissing
        fun _routingDetails(): JsonField<List<RoutingDetailCreateRequest>> = routingDetails

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
             * [VirtualAccountCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .internalAccountId()
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [VirtualAccountCreateRequest]. */
        class Builder internal constructor() {

            private var internalAccountId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var accountDetails: JsonField<MutableList<AccountDetailCreateRequest>>? = null
            private var counterpartyId: JsonField<String> = JsonMissing.of()
            private var creditLedgerAccountId: JsonField<String> = JsonMissing.of()
            private var debitLedgerAccountId: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var ledgerAccount: JsonField<LedgerAccountCreateRequest> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var routingDetails: JsonField<MutableList<RoutingDetailCreateRequest>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(virtualAccountCreateRequest: VirtualAccountCreateRequest) = apply {
                internalAccountId = virtualAccountCreateRequest.internalAccountId
                name = virtualAccountCreateRequest.name
                accountDetails =
                    virtualAccountCreateRequest.accountDetails.map { it.toMutableList() }
                counterpartyId = virtualAccountCreateRequest.counterpartyId
                creditLedgerAccountId = virtualAccountCreateRequest.creditLedgerAccountId
                debitLedgerAccountId = virtualAccountCreateRequest.debitLedgerAccountId
                description = virtualAccountCreateRequest.description
                ledgerAccount = virtualAccountCreateRequest.ledgerAccount
                metadata = virtualAccountCreateRequest.metadata
                routingDetails =
                    virtualAccountCreateRequest.routingDetails.map { it.toMutableList() }
                additionalProperties =
                    virtualAccountCreateRequest.additionalProperties.toMutableMap()
            }

            /** The ID of the internal account that this virtual account is associated with. */
            fun internalAccountId(internalAccountId: String) =
                internalAccountId(JsonField.of(internalAccountId))

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

            /** The name of the virtual account. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** An array of account detail objects. */
            fun accountDetails(accountDetails: List<AccountDetailCreateRequest>) =
                accountDetails(JsonField.of(accountDetails))

            /**
             * Sets [Builder.accountDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountDetails] with a well-typed
             * `List<AccountDetailCreateRequest>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun accountDetails(accountDetails: JsonField<List<AccountDetailCreateRequest>>) =
                apply {
                    this.accountDetails = accountDetails.map { it.toMutableList() }
                }

            /**
             * Adds a single [AccountDetailCreateRequest] to [accountDetails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAccountDetail(accountDetail: AccountDetailCreateRequest) = apply {
                accountDetails =
                    (accountDetails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("accountDetails", it).add(accountDetail)
                    }
            }

            /** The ID of the counterparty that the virtual account belongs to. */
            fun counterpartyId(counterpartyId: String) =
                counterpartyId(JsonField.of(counterpartyId))

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

            /**
             * The ID of a credit normal ledger account. When money leaves the virtual account, this
             * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
             * present.
             */
            fun creditLedgerAccountId(creditLedgerAccountId: String) =
                creditLedgerAccountId(JsonField.of(creditLedgerAccountId))

            /**
             * Sets [Builder.creditLedgerAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditLedgerAccountId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditLedgerAccountId(creditLedgerAccountId: JsonField<String>) = apply {
                this.creditLedgerAccountId = creditLedgerAccountId
            }

            /**
             * The ID of a debit normal ledger account. When money enters the virtual account, this
             * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
             * present.
             */
            fun debitLedgerAccountId(debitLedgerAccountId: String) =
                debitLedgerAccountId(JsonField.of(debitLedgerAccountId))

            /**
             * Sets [Builder.debitLedgerAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.debitLedgerAccountId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun debitLedgerAccountId(debitLedgerAccountId: JsonField<String>) = apply {
                this.debitLedgerAccountId = debitLedgerAccountId
            }

            /** An optional description for internal use. */
            fun description(description: String) = description(JsonField.of(description))

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
             * Specifies a ledger account object that will be created with the virtual account. The
             * resulting ledger account is linked to the virtual account for auto-ledgering IPDs.
             */
            fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) =
                ledgerAccount(JsonField.of(ledgerAccount))

            /**
             * Sets [Builder.ledgerAccount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerAccount] with a well-typed
             * [LedgerAccountCreateRequest] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun ledgerAccount(ledgerAccount: JsonField<LedgerAccountCreateRequest>) = apply {
                this.ledgerAccount = ledgerAccount
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

            /** An array of routing detail objects. */
            fun routingDetails(routingDetails: List<RoutingDetailCreateRequest>) =
                routingDetails(JsonField.of(routingDetails))

            /**
             * Sets [Builder.routingDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingDetails] with a well-typed
             * `List<RoutingDetailCreateRequest>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun routingDetails(routingDetails: JsonField<List<RoutingDetailCreateRequest>>) =
                apply {
                    this.routingDetails = routingDetails.map { it.toMutableList() }
                }

            /**
             * Adds a single [RoutingDetailCreateRequest] to [routingDetails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRoutingDetail(routingDetail: RoutingDetailCreateRequest) = apply {
                routingDetails =
                    (routingDetails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("routingDetails", it).add(routingDetail)
                    }
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
             * Returns an immutable instance of [VirtualAccountCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .internalAccountId()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): VirtualAccountCreateRequest =
                VirtualAccountCreateRequest(
                    checkRequired("internalAccountId", internalAccountId),
                    checkRequired("name", name),
                    (accountDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    counterpartyId,
                    creditLedgerAccountId,
                    debitLedgerAccountId,
                    description,
                    ledgerAccount,
                    metadata,
                    (routingDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): VirtualAccountCreateRequest = apply {
            if (validated) {
                return@apply
            }

            internalAccountId()
            name()
            accountDetails()?.forEach { it.validate() }
            counterpartyId()
            creditLedgerAccountId()
            debitLedgerAccountId()
            description()
            ledgerAccount()?.validate()
            metadata()?.validate()
            routingDetails()?.forEach { it.validate() }
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
            (if (internalAccountId.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (accountDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (counterpartyId.asKnown() == null) 0 else 1) +
                (if (creditLedgerAccountId.asKnown() == null) 0 else 1) +
                (if (debitLedgerAccountId.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (ledgerAccount.asKnown()?.validity() ?: 0) +
                (metadata.asKnown()?.validity() ?: 0) +
                (routingDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VirtualAccountCreateRequest && internalAccountId == other.internalAccountId && name == other.name && accountDetails == other.accountDetails && counterpartyId == other.counterpartyId && creditLedgerAccountId == other.creditLedgerAccountId && debitLedgerAccountId == other.debitLedgerAccountId && description == other.description && ledgerAccount == other.ledgerAccount && metadata == other.metadata && routingDetails == other.routingDetails && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(internalAccountId, name, accountDetails, counterpartyId, creditLedgerAccountId, debitLedgerAccountId, description, ledgerAccount, metadata, routingDetails, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VirtualAccountCreateRequest{internalAccountId=$internalAccountId, name=$name, accountDetails=$accountDetails, counterpartyId=$counterpartyId, creditLedgerAccountId=$creditLedgerAccountId, debitLedgerAccountId=$debitLedgerAccountId, description=$description, ledgerAccount=$ledgerAccount, metadata=$metadata, routingDetails=$routingDetails, additionalProperties=$additionalProperties}"
    }

    class AccountDetailCreateRequest
    private constructor(
        private val accountNumber: JsonField<String>,
        private val accountNumberType: JsonField<AccountNumberType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_number")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_number_type")
            @ExcludeMissing
            accountNumberType: JsonField<AccountNumberType> = JsonMissing.of(),
        ) : this(accountNumber, accountNumberType, mutableMapOf())

        /**
         * The account number for the bank account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumber(): String = accountNumber.getRequired("account_number")

        /**
         * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account
         * number is in a generic format.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountNumberType(): AccountNumberType? =
            accountNumberType.getNullable("account_number_type")

        /**
         * Returns the raw JSON value of [accountNumber].
         *
         * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /**
         * Returns the raw JSON value of [accountNumberType].
         *
         * Unlike [accountNumberType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number_type")
        @ExcludeMissing
        fun _accountNumberType(): JsonField<AccountNumberType> = accountNumberType

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
             * [AccountDetailCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AccountDetailCreateRequest]. */
        class Builder internal constructor() {

            private var accountNumber: JsonField<String>? = null
            private var accountNumberType: JsonField<AccountNumberType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountDetailCreateRequest: AccountDetailCreateRequest) = apply {
                accountNumber = accountDetailCreateRequest.accountNumber
                accountNumberType = accountDetailCreateRequest.accountNumberType
                additionalProperties =
                    accountDetailCreateRequest.additionalProperties.toMutableMap()
            }

            /** The account number for the bank account. */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /**
             * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account
             * number is in a generic format.
             */
            fun accountNumberType(accountNumberType: AccountNumberType) =
                accountNumberType(JsonField.of(accountNumberType))

            /**
             * Sets [Builder.accountNumberType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumberType] with a well-typed
             * [AccountNumberType] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun accountNumberType(accountNumberType: JsonField<AccountNumberType>) = apply {
                this.accountNumberType = accountNumberType
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
             * Returns an immutable instance of [AccountDetailCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountDetailCreateRequest =
                AccountDetailCreateRequest(
                    checkRequired("accountNumber", accountNumber),
                    accountNumberType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccountDetailCreateRequest = apply {
            if (validated) {
                return@apply
            }

            accountNumber()
            accountNumberType()?.validate()
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
            (if (accountNumber.asKnown() == null) 0 else 1) +
                (accountNumberType.asKnown()?.validity() ?: 0)

        /**
         * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account
         * number is in a generic format.
         */
        class AccountNumberType
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

                val AU_NUMBER = of("au_number")

                val BASE_ADDRESS = of("base_address")

                val CLABE = of("clabe")

                val ETHEREUM_ADDRESS = of("ethereum_address")

                val HK_NUMBER = of("hk_number")

                val IBAN = of("iban")

                val ID_NUMBER = of("id_number")

                val NZ_NUMBER = of("nz_number")

                val OTHER = of("other")

                val PAN = of("pan")

                val POLYGON_ADDRESS = of("polygon_address")

                val SG_NUMBER = of("sg_number")

                val SOLANA_ADDRESS = of("solana_address")

                val WALLET_ADDRESS = of("wallet_address")

                fun of(value: String) = AccountNumberType(JsonField.of(value))
            }

            /** An enum containing [AccountNumberType]'s known values. */
            enum class Known {
                AU_NUMBER,
                BASE_ADDRESS,
                CLABE,
                ETHEREUM_ADDRESS,
                HK_NUMBER,
                IBAN,
                ID_NUMBER,
                NZ_NUMBER,
                OTHER,
                PAN,
                POLYGON_ADDRESS,
                SG_NUMBER,
                SOLANA_ADDRESS,
                WALLET_ADDRESS,
            }

            /**
             * An enum containing [AccountNumberType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AccountNumberType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AU_NUMBER,
                BASE_ADDRESS,
                CLABE,
                ETHEREUM_ADDRESS,
                HK_NUMBER,
                IBAN,
                ID_NUMBER,
                NZ_NUMBER,
                OTHER,
                PAN,
                POLYGON_ADDRESS,
                SG_NUMBER,
                SOLANA_ADDRESS,
                WALLET_ADDRESS,
                /**
                 * An enum member indicating that [AccountNumberType] was instantiated with an
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
                    AU_NUMBER -> Value.AU_NUMBER
                    BASE_ADDRESS -> Value.BASE_ADDRESS
                    CLABE -> Value.CLABE
                    ETHEREUM_ADDRESS -> Value.ETHEREUM_ADDRESS
                    HK_NUMBER -> Value.HK_NUMBER
                    IBAN -> Value.IBAN
                    ID_NUMBER -> Value.ID_NUMBER
                    NZ_NUMBER -> Value.NZ_NUMBER
                    OTHER -> Value.OTHER
                    PAN -> Value.PAN
                    POLYGON_ADDRESS -> Value.POLYGON_ADDRESS
                    SG_NUMBER -> Value.SG_NUMBER
                    SOLANA_ADDRESS -> Value.SOLANA_ADDRESS
                    WALLET_ADDRESS -> Value.WALLET_ADDRESS
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
                    AU_NUMBER -> Known.AU_NUMBER
                    BASE_ADDRESS -> Known.BASE_ADDRESS
                    CLABE -> Known.CLABE
                    ETHEREUM_ADDRESS -> Known.ETHEREUM_ADDRESS
                    HK_NUMBER -> Known.HK_NUMBER
                    IBAN -> Known.IBAN
                    ID_NUMBER -> Known.ID_NUMBER
                    NZ_NUMBER -> Known.NZ_NUMBER
                    OTHER -> Known.OTHER
                    PAN -> Known.PAN
                    POLYGON_ADDRESS -> Known.POLYGON_ADDRESS
                    SG_NUMBER -> Known.SG_NUMBER
                    SOLANA_ADDRESS -> Known.SOLANA_ADDRESS
                    WALLET_ADDRESS -> Known.WALLET_ADDRESS
                    else ->
                        throw ModernTreasuryInvalidDataException(
                            "Unknown AccountNumberType: $value"
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

            private var validated: Boolean = false

            fun validate(): AccountNumberType = apply {
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

                return /* spotless:off */ other is AccountNumberType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountDetailCreateRequest && accountNumber == other.accountNumber && accountNumberType == other.accountNumberType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumber, accountNumberType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountDetailCreateRequest{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"
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

    class RoutingDetailCreateRequest
    private constructor(
        private val routingNumber: JsonField<String>,
        private val routingNumberType: JsonField<RoutingNumberType>,
        private val paymentType: JsonField<PaymentType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("routing_number")
            @ExcludeMissing
            routingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routing_number_type")
            @ExcludeMissing
            routingNumberType: JsonField<RoutingNumberType> = JsonMissing.of(),
            @JsonProperty("payment_type")
            @ExcludeMissing
            paymentType: JsonField<PaymentType> = JsonMissing.of(),
        ) : this(routingNumber, routingNumberType, paymentType, mutableMapOf())

        /**
         * The routing number of the bank.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun routingNumber(): String = routingNumber.getRequired("routing_number")

        /**
         * The type of routing number. See
         * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
         * details.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun routingNumberType(): RoutingNumberType =
            routingNumberType.getRequired("routing_number_type")

        /**
         * If the routing detail is to be used for a specific payment type this field will be
         * populated, otherwise null.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentType(): PaymentType? = paymentType.getNullable("payment_type")

        /**
         * Returns the raw JSON value of [routingNumber].
         *
         * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        /**
         * Returns the raw JSON value of [routingNumberType].
         *
         * Unlike [routingNumberType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_number_type")
        @ExcludeMissing
        fun _routingNumberType(): JsonField<RoutingNumberType> = routingNumberType

        /**
         * Returns the raw JSON value of [paymentType].
         *
         * Unlike [paymentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payment_type")
        @ExcludeMissing
        fun _paymentType(): JsonField<PaymentType> = paymentType

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
             * [RoutingDetailCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .routingNumber()
             * .routingNumberType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [RoutingDetailCreateRequest]. */
        class Builder internal constructor() {

            private var routingNumber: JsonField<String>? = null
            private var routingNumberType: JsonField<RoutingNumberType>? = null
            private var paymentType: JsonField<PaymentType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(routingDetailCreateRequest: RoutingDetailCreateRequest) = apply {
                routingNumber = routingDetailCreateRequest.routingNumber
                routingNumberType = routingDetailCreateRequest.routingNumberType
                paymentType = routingDetailCreateRequest.paymentType
                additionalProperties =
                    routingDetailCreateRequest.additionalProperties.toMutableMap()
            }

            /** The routing number of the bank. */
            fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

            /**
             * Sets [Builder.routingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
            }

            /**
             * The type of routing number. See
             * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
             * details.
             */
            fun routingNumberType(routingNumberType: RoutingNumberType) =
                routingNumberType(JsonField.of(routingNumberType))

            /**
             * Sets [Builder.routingNumberType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingNumberType] with a well-typed
             * [RoutingNumberType] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) = apply {
                this.routingNumberType = routingNumberType
            }

            /**
             * If the routing detail is to be used for a specific payment type this field will be
             * populated, otherwise null.
             */
            fun paymentType(paymentType: PaymentType?) =
                paymentType(JsonField.ofNullable(paymentType))

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
             * Returns an immutable instance of [RoutingDetailCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .routingNumber()
             * .routingNumberType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RoutingDetailCreateRequest =
                RoutingDetailCreateRequest(
                    checkRequired("routingNumber", routingNumber),
                    checkRequired("routingNumberType", routingNumberType),
                    paymentType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RoutingDetailCreateRequest = apply {
            if (validated) {
                return@apply
            }

            routingNumber()
            routingNumberType().validate()
            paymentType()?.validate()
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
            (if (routingNumber.asKnown() == null) 0 else 1) +
                (routingNumberType.asKnown()?.validity() ?: 0) +
                (paymentType.asKnown()?.validity() ?: 0)

        /**
         * The type of routing number. See
         * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
         * details.
         */
        class RoutingNumberType
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

                val ABA = of("aba")

                val AU_BSB = of("au_bsb")

                val BR_CODIGO = of("br_codigo")

                val CA_CPA = of("ca_cpa")

                val CHIPS = of("chips")

                val CNAPS = of("cnaps")

                val DK_INTERBANK_CLEARING_CODE = of("dk_interbank_clearing_code")

                val GB_SORT_CODE = of("gb_sort_code")

                val HK_INTERBANK_CLEARING_CODE = of("hk_interbank_clearing_code")

                val HU_INTERBANK_CLEARING_CODE = of("hu_interbank_clearing_code")

                val ID_SKNBI_CODE = of("id_sknbi_code")

                val IL_BANK_CODE = of("il_bank_code")

                val IN_IFSC = of("in_ifsc")

                val JP_ZENGIN_CODE = of("jp_zengin_code")

                val MX_BANK_IDENTIFIER = of("mx_bank_identifier")

                val MY_BRANCH_CODE = of("my_branch_code")

                val NZ_NATIONAL_CLEARING_CODE = of("nz_national_clearing_code")

                val PL_NATIONAL_CLEARING_CODE = of("pl_national_clearing_code")

                val SE_BANKGIRO_CLEARING_CODE = of("se_bankgiro_clearing_code")

                val SG_INTERBANK_CLEARING_CODE = of("sg_interbank_clearing_code")

                val SWIFT = of("swift")

                val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

                fun of(value: String) = RoutingNumberType(JsonField.of(value))
            }

            /** An enum containing [RoutingNumberType]'s known values. */
            enum class Known {
                ABA,
                AU_BSB,
                BR_CODIGO,
                CA_CPA,
                CHIPS,
                CNAPS,
                DK_INTERBANK_CLEARING_CODE,
                GB_SORT_CODE,
                HK_INTERBANK_CLEARING_CODE,
                HU_INTERBANK_CLEARING_CODE,
                ID_SKNBI_CODE,
                IL_BANK_CODE,
                IN_IFSC,
                JP_ZENGIN_CODE,
                MX_BANK_IDENTIFIER,
                MY_BRANCH_CODE,
                NZ_NATIONAL_CLEARING_CODE,
                PL_NATIONAL_CLEARING_CODE,
                SE_BANKGIRO_CLEARING_CODE,
                SG_INTERBANK_CLEARING_CODE,
                SWIFT,
                ZA_NATIONAL_CLEARING_CODE,
            }

            /**
             * An enum containing [RoutingNumberType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [RoutingNumberType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ABA,
                AU_BSB,
                BR_CODIGO,
                CA_CPA,
                CHIPS,
                CNAPS,
                DK_INTERBANK_CLEARING_CODE,
                GB_SORT_CODE,
                HK_INTERBANK_CLEARING_CODE,
                HU_INTERBANK_CLEARING_CODE,
                ID_SKNBI_CODE,
                IL_BANK_CODE,
                IN_IFSC,
                JP_ZENGIN_CODE,
                MX_BANK_IDENTIFIER,
                MY_BRANCH_CODE,
                NZ_NATIONAL_CLEARING_CODE,
                PL_NATIONAL_CLEARING_CODE,
                SE_BANKGIRO_CLEARING_CODE,
                SG_INTERBANK_CLEARING_CODE,
                SWIFT,
                ZA_NATIONAL_CLEARING_CODE,
                /**
                 * An enum member indicating that [RoutingNumberType] was instantiated with an
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
                    ABA -> Value.ABA
                    AU_BSB -> Value.AU_BSB
                    BR_CODIGO -> Value.BR_CODIGO
                    CA_CPA -> Value.CA_CPA
                    CHIPS -> Value.CHIPS
                    CNAPS -> Value.CNAPS
                    DK_INTERBANK_CLEARING_CODE -> Value.DK_INTERBANK_CLEARING_CODE
                    GB_SORT_CODE -> Value.GB_SORT_CODE
                    HK_INTERBANK_CLEARING_CODE -> Value.HK_INTERBANK_CLEARING_CODE
                    HU_INTERBANK_CLEARING_CODE -> Value.HU_INTERBANK_CLEARING_CODE
                    ID_SKNBI_CODE -> Value.ID_SKNBI_CODE
                    IL_BANK_CODE -> Value.IL_BANK_CODE
                    IN_IFSC -> Value.IN_IFSC
                    JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                    MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
                    MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                    NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                    PL_NATIONAL_CLEARING_CODE -> Value.PL_NATIONAL_CLEARING_CODE
                    SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                    SG_INTERBANK_CLEARING_CODE -> Value.SG_INTERBANK_CLEARING_CODE
                    SWIFT -> Value.SWIFT
                    ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
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
                    ABA -> Known.ABA
                    AU_BSB -> Known.AU_BSB
                    BR_CODIGO -> Known.BR_CODIGO
                    CA_CPA -> Known.CA_CPA
                    CHIPS -> Known.CHIPS
                    CNAPS -> Known.CNAPS
                    DK_INTERBANK_CLEARING_CODE -> Known.DK_INTERBANK_CLEARING_CODE
                    GB_SORT_CODE -> Known.GB_SORT_CODE
                    HK_INTERBANK_CLEARING_CODE -> Known.HK_INTERBANK_CLEARING_CODE
                    HU_INTERBANK_CLEARING_CODE -> Known.HU_INTERBANK_CLEARING_CODE
                    ID_SKNBI_CODE -> Known.ID_SKNBI_CODE
                    IL_BANK_CODE -> Known.IL_BANK_CODE
                    IN_IFSC -> Known.IN_IFSC
                    JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                    MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                    MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                    NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                    PL_NATIONAL_CLEARING_CODE -> Known.PL_NATIONAL_CLEARING_CODE
                    SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                    SG_INTERBANK_CLEARING_CODE -> Known.SG_INTERBANK_CLEARING_CODE
                    SWIFT -> Known.SWIFT
                    ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                    else ->
                        throw ModernTreasuryInvalidDataException(
                            "Unknown RoutingNumberType: $value"
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

            private var validated: Boolean = false

            fun validate(): RoutingNumberType = apply {
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

                return /* spotless:off */ other is RoutingNumberType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * If the routing detail is to be used for a specific payment type this field will be
         * populated, otherwise null.
         */
        class PaymentType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                val ACH = of("ach")

                val AU_BECS = of("au_becs")

                val BACS = of("bacs")

                val BASE = of("base")

                val BOOK = of("book")

                val CARD = of("card")

                val CHATS = of("chats")

                val CHECK = of("check")

                val CROSS_BORDER = of("cross_border")

                val DK_NETS = of("dk_nets")

                val EFT = of("eft")

                val ETHEREUM = of("ethereum")

                val HU_ICS = of("hu_ics")

                val INTERAC = of("interac")

                val MASAV = of("masav")

                val MX_CCEN = of("mx_ccen")

                val NEFT = of("neft")

                val NICS = of("nics")

                val NZ_BECS = of("nz_becs")

                val PL_ELIXIR = of("pl_elixir")

                val POLYGON = of("polygon")

                val PROVXCHANGE = of("provxchange")

                val RO_SENT = of("ro_sent")

                val RTP = of("rtp")

                val SE_BANKGIROT = of("se_bankgirot")

                val SEN = of("sen")

                val SEPA = of("sepa")

                val SG_GIRO = of("sg_giro")

                val SIC = of("sic")

                val SIGNET = of("signet")

                val SKNBI = of("sknbi")

                val SOLANA = of("solana")

                val WIRE = of("wire")

                val ZENGIN = of("zengin")

                fun of(value: String) = PaymentType(JsonField.of(value))
            }

            /** An enum containing [PaymentType]'s known values. */
            enum class Known {
                ACH,
                AU_BECS,
                BACS,
                BASE,
                BOOK,
                CARD,
                CHATS,
                CHECK,
                CROSS_BORDER,
                DK_NETS,
                EFT,
                ETHEREUM,
                HU_ICS,
                INTERAC,
                MASAV,
                MX_CCEN,
                NEFT,
                NICS,
                NZ_BECS,
                PL_ELIXIR,
                POLYGON,
                PROVXCHANGE,
                RO_SENT,
                RTP,
                SE_BANKGIROT,
                SEN,
                SEPA,
                SG_GIRO,
                SIC,
                SIGNET,
                SKNBI,
                SOLANA,
                WIRE,
                ZENGIN,
            }

            /**
             * An enum containing [PaymentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACH,
                AU_BECS,
                BACS,
                BASE,
                BOOK,
                CARD,
                CHATS,
                CHECK,
                CROSS_BORDER,
                DK_NETS,
                EFT,
                ETHEREUM,
                HU_ICS,
                INTERAC,
                MASAV,
                MX_CCEN,
                NEFT,
                NICS,
                NZ_BECS,
                PL_ELIXIR,
                POLYGON,
                PROVXCHANGE,
                RO_SENT,
                RTP,
                SE_BANKGIROT,
                SEN,
                SEPA,
                SG_GIRO,
                SIC,
                SIGNET,
                SKNBI,
                SOLANA,
                WIRE,
                ZENGIN,
                /**
                 * An enum member indicating that [PaymentType] was instantiated with an unknown
                 * value.
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
                    ACH -> Value.ACH
                    AU_BECS -> Value.AU_BECS
                    BACS -> Value.BACS
                    BASE -> Value.BASE
                    BOOK -> Value.BOOK
                    CARD -> Value.CARD
                    CHATS -> Value.CHATS
                    CHECK -> Value.CHECK
                    CROSS_BORDER -> Value.CROSS_BORDER
                    DK_NETS -> Value.DK_NETS
                    EFT -> Value.EFT
                    ETHEREUM -> Value.ETHEREUM
                    HU_ICS -> Value.HU_ICS
                    INTERAC -> Value.INTERAC
                    MASAV -> Value.MASAV
                    MX_CCEN -> Value.MX_CCEN
                    NEFT -> Value.NEFT
                    NICS -> Value.NICS
                    NZ_BECS -> Value.NZ_BECS
                    PL_ELIXIR -> Value.PL_ELIXIR
                    POLYGON -> Value.POLYGON
                    PROVXCHANGE -> Value.PROVXCHANGE
                    RO_SENT -> Value.RO_SENT
                    RTP -> Value.RTP
                    SE_BANKGIROT -> Value.SE_BANKGIROT
                    SEN -> Value.SEN
                    SEPA -> Value.SEPA
                    SG_GIRO -> Value.SG_GIRO
                    SIC -> Value.SIC
                    SIGNET -> Value.SIGNET
                    SKNBI -> Value.SKNBI
                    SOLANA -> Value.SOLANA
                    WIRE -> Value.WIRE
                    ZENGIN -> Value.ZENGIN
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
                    ACH -> Known.ACH
                    AU_BECS -> Known.AU_BECS
                    BACS -> Known.BACS
                    BASE -> Known.BASE
                    BOOK -> Known.BOOK
                    CARD -> Known.CARD
                    CHATS -> Known.CHATS
                    CHECK -> Known.CHECK
                    CROSS_BORDER -> Known.CROSS_BORDER
                    DK_NETS -> Known.DK_NETS
                    EFT -> Known.EFT
                    ETHEREUM -> Known.ETHEREUM
                    HU_ICS -> Known.HU_ICS
                    INTERAC -> Known.INTERAC
                    MASAV -> Known.MASAV
                    MX_CCEN -> Known.MX_CCEN
                    NEFT -> Known.NEFT
                    NICS -> Known.NICS
                    NZ_BECS -> Known.NZ_BECS
                    PL_ELIXIR -> Known.PL_ELIXIR
                    POLYGON -> Known.POLYGON
                    PROVXCHANGE -> Known.PROVXCHANGE
                    RO_SENT -> Known.RO_SENT
                    RTP -> Known.RTP
                    SE_BANKGIROT -> Known.SE_BANKGIROT
                    SEN -> Known.SEN
                    SEPA -> Known.SEPA
                    SG_GIRO -> Known.SG_GIRO
                    SIC -> Known.SIC
                    SIGNET -> Known.SIGNET
                    SKNBI -> Known.SKNBI
                    SOLANA -> Known.SOLANA
                    WIRE -> Known.WIRE
                    ZENGIN -> Known.ZENGIN
                    else -> throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RoutingDetailCreateRequest && routingNumber == other.routingNumber && routingNumberType == other.routingNumberType && paymentType == other.paymentType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(routingNumber, routingNumberType, paymentType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RoutingDetailCreateRequest{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VirtualAccountCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "VirtualAccountCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
