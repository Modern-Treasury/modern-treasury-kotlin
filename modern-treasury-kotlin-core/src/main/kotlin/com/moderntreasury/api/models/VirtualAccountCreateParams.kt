// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
    fun accountDetails(): List<AccountDetailCreate>? = body.accountDetails()

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
    fun routingDetails(): List<RoutingDetailCreate>? = body.routingDetails()

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
    fun _accountDetails(): JsonField<List<AccountDetailCreate>> = body._accountDetails()

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
    fun _routingDetails(): JsonField<List<RoutingDetailCreate>> = body._routingDetails()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
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
        fun accountDetails(accountDetails: List<AccountDetailCreate>) = apply {
            body.accountDetails(accountDetails)
        }

        /**
         * Sets [Builder.accountDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountDetails] with a well-typed
         * `List<AccountDetailCreate>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun accountDetails(accountDetails: JsonField<List<AccountDetailCreate>>) = apply {
            body.accountDetails(accountDetails)
        }

        /**
         * Adds a single [AccountDetailCreate] to [accountDetails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccountDetail(accountDetail: AccountDetailCreate) = apply {
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
        fun routingDetails(routingDetails: List<RoutingDetailCreate>) = apply {
            body.routingDetails(routingDetails)
        }

        /**
         * Sets [Builder.routingDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingDetails] with a well-typed
         * `List<RoutingDetailCreate>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun routingDetails(routingDetails: JsonField<List<RoutingDetailCreate>>) = apply {
            body.routingDetails(routingDetails)
        }

        /**
         * Adds a single [RoutingDetailCreate] to [routingDetails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRoutingDetail(routingDetail: RoutingDetailCreate) = apply {
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
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val internalAccountId: JsonField<String>,
        private val name: JsonField<String>,
        private val accountDetails: JsonField<List<AccountDetailCreate>>,
        private val counterpartyId: JsonField<String>,
        private val creditLedgerAccountId: JsonField<String>,
        private val debitLedgerAccountId: JsonField<String>,
        private val description: JsonField<String>,
        private val ledgerAccount: JsonField<LedgerAccountCreateRequest>,
        private val metadata: JsonField<Metadata>,
        private val routingDetails: JsonField<List<RoutingDetailCreate>>,
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
            accountDetails: JsonField<List<AccountDetailCreate>> = JsonMissing.of(),
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
            routingDetails: JsonField<List<RoutingDetailCreate>> = JsonMissing.of(),
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
        fun accountDetails(): List<AccountDetailCreate>? =
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
        fun routingDetails(): List<RoutingDetailCreate>? =
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
        fun _accountDetails(): JsonField<List<AccountDetailCreate>> = accountDetails

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
        fun _routingDetails(): JsonField<List<RoutingDetailCreate>> = routingDetails

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
            private var accountDetails: JsonField<MutableList<AccountDetailCreate>>? = null
            private var counterpartyId: JsonField<String> = JsonMissing.of()
            private var creditLedgerAccountId: JsonField<String> = JsonMissing.of()
            private var debitLedgerAccountId: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var ledgerAccount: JsonField<LedgerAccountCreateRequest> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var routingDetails: JsonField<MutableList<RoutingDetailCreate>>? = null
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
            fun accountDetails(accountDetails: List<AccountDetailCreate>) =
                accountDetails(JsonField.of(accountDetails))

            /**
             * Sets [Builder.accountDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountDetails] with a well-typed
             * `List<AccountDetailCreate>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun accountDetails(accountDetails: JsonField<List<AccountDetailCreate>>) = apply {
                this.accountDetails = accountDetails.map { it.toMutableList() }
            }

            /**
             * Adds a single [AccountDetailCreate] to [accountDetails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAccountDetail(accountDetail: AccountDetailCreate) = apply {
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
            fun routingDetails(routingDetails: List<RoutingDetailCreate>) =
                routingDetails(JsonField.of(routingDetails))

            /**
             * Sets [Builder.routingDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingDetails] with a well-typed
             * `List<RoutingDetailCreate>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun routingDetails(routingDetails: JsonField<List<RoutingDetailCreate>>) = apply {
                this.routingDetails = routingDetails.map { it.toMutableList() }
            }

            /**
             * Adds a single [RoutingDetailCreate] to [routingDetails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRoutingDetail(routingDetail: RoutingDetailCreate) = apply {
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

            return other is VirtualAccountCreateRequest &&
                internalAccountId == other.internalAccountId &&
                name == other.name &&
                accountDetails == other.accountDetails &&
                counterpartyId == other.counterpartyId &&
                creditLedgerAccountId == other.creditLedgerAccountId &&
                debitLedgerAccountId == other.debitLedgerAccountId &&
                description == other.description &&
                ledgerAccount == other.ledgerAccount &&
                metadata == other.metadata &&
                routingDetails == other.routingDetails &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
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
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VirtualAccountCreateRequest{internalAccountId=$internalAccountId, name=$name, accountDetails=$accountDetails, counterpartyId=$counterpartyId, creditLedgerAccountId=$creditLedgerAccountId, debitLedgerAccountId=$debitLedgerAccountId, description=$description, ledgerAccount=$ledgerAccount, metadata=$metadata, routingDetails=$routingDetails, additionalProperties=$additionalProperties}"
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VirtualAccountCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VirtualAccountCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
