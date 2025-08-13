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
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class VirtualAccount
private constructor(
    private val id: JsonField<String>,
    private val accountDetails: JsonField<List<AccountDetail>>,
    private val counterpartyId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val creditLedgerAccountId: JsonField<String>,
    private val debitLedgerAccountId: JsonField<String>,
    private val description: JsonField<String>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val internalAccountId: JsonField<String>,
    private val ledgerAccountId: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val name: JsonField<String>,
    private val object_: JsonField<String>,
    private val routingDetails: JsonField<List<RoutingDetail>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_details")
        @ExcludeMissing
        accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of(),
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        counterpartyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_ledger_account_id")
        @ExcludeMissing
        creditLedgerAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("debit_ledger_account_id")
        @ExcludeMissing
        debitLedgerAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        internalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        ledgerAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routing_details")
        @ExcludeMissing
        routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        accountDetails,
        counterpartyId,
        createdAt,
        creditLedgerAccountId,
        debitLedgerAccountId,
        description,
        discardedAt,
        internalAccountId,
        ledgerAccountId,
        liveMode,
        metadata,
        name,
        object_,
        routingDetails,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * An array of account detail objects.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountDetails(): List<AccountDetail> = accountDetails.getRequired("account_details")

    /**
     * The ID of a counterparty that the virtual account belongs to. Optional.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The ID of a credit normal ledger account. When money enters the virtual account, this ledger
     * account will be credited. Must be accompanied by a debit_ledger_account_id if present.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun creditLedgerAccountId(): String? =
        creditLedgerAccountId.getNullable("credit_ledger_account_id")

    /**
     * The ID of a debit normal ledger account. When money enters the virtual account, this ledger
     * account will be debited. Must be accompanied by a credit_ledger_account_id if present.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun debitLedgerAccountId(): String? =
        debitLedgerAccountId.getNullable("debit_ledger_account_id")

    /**
     * An optional free-form description for internal use.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /**
     * The ID of the internal account that the virtual account is in.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

    /**
     * If the virtual account links to a ledger account in Modern Treasury, the id of the ledger
     * account will be populated here.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerAccountId(): String? = ledgerAccountId.getNullable("ledger_account_id")

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
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * The name of the virtual account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun object_(): String = object_.getRequired("object")

    /**
     * An array of routing detail objects. These will be the routing details of the internal
     * account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routingDetails(): List<RoutingDetail> = routingDetails.getRequired("routing_details")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountDetails].
     *
     * Unlike [accountDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_details")
    @ExcludeMissing
    fun _accountDetails(): JsonField<List<AccountDetail>> = accountDetails

    /**
     * Returns the raw JSON value of [counterpartyId].
     *
     * Unlike [counterpartyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    fun _counterpartyId(): JsonField<String> = counterpartyId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [creditLedgerAccountId].
     *
     * Unlike [creditLedgerAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_ledger_account_id")
    @ExcludeMissing
    fun _creditLedgerAccountId(): JsonField<String> = creditLedgerAccountId

    /**
     * Returns the raw JSON value of [debitLedgerAccountId].
     *
     * Unlike [debitLedgerAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("debit_ledger_account_id")
    @ExcludeMissing
    fun _debitLedgerAccountId(): JsonField<String> = debitLedgerAccountId

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [discardedAt].
     *
     * Unlike [discardedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

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
     * Returns the raw JSON value of [ledgerAccountId].
     *
     * Unlike [ledgerAccountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ledger_account_id")
    @ExcludeMissing
    fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Returns the raw JSON value of [routingDetails].
     *
     * Unlike [routingDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing_details")
    @ExcludeMissing
    fun _routingDetails(): JsonField<List<RoutingDetail>> = routingDetails

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [VirtualAccount].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountDetails()
         * .counterpartyId()
         * .createdAt()
         * .creditLedgerAccountId()
         * .debitLedgerAccountId()
         * .description()
         * .discardedAt()
         * .internalAccountId()
         * .ledgerAccountId()
         * .liveMode()
         * .metadata()
         * .name()
         * .object_()
         * .routingDetails()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [VirtualAccount]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountDetails: JsonField<MutableList<AccountDetail>>? = null
        private var counterpartyId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditLedgerAccountId: JsonField<String>? = null
        private var debitLedgerAccountId: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var internalAccountId: JsonField<String>? = null
        private var ledgerAccountId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var name: JsonField<String>? = null
        private var object_: JsonField<String>? = null
        private var routingDetails: JsonField<MutableList<RoutingDetail>>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(virtualAccount: VirtualAccount) = apply {
            id = virtualAccount.id
            accountDetails = virtualAccount.accountDetails.map { it.toMutableList() }
            counterpartyId = virtualAccount.counterpartyId
            createdAt = virtualAccount.createdAt
            creditLedgerAccountId = virtualAccount.creditLedgerAccountId
            debitLedgerAccountId = virtualAccount.debitLedgerAccountId
            description = virtualAccount.description
            discardedAt = virtualAccount.discardedAt
            internalAccountId = virtualAccount.internalAccountId
            ledgerAccountId = virtualAccount.ledgerAccountId
            liveMode = virtualAccount.liveMode
            metadata = virtualAccount.metadata
            name = virtualAccount.name
            object_ = virtualAccount.object_
            routingDetails = virtualAccount.routingDetails.map { it.toMutableList() }
            updatedAt = virtualAccount.updatedAt
            additionalProperties = virtualAccount.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** An array of account detail objects. */
        fun accountDetails(accountDetails: List<AccountDetail>) =
            accountDetails(JsonField.of(accountDetails))

        /**
         * Sets [Builder.accountDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountDetails] with a well-typed `List<AccountDetail>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun accountDetails(accountDetails: JsonField<List<AccountDetail>>) = apply {
            this.accountDetails = accountDetails.map { it.toMutableList() }
        }

        /**
         * Adds a single [AccountDetail] to [accountDetails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccountDetail(accountDetail: AccountDetail) = apply {
            accountDetails =
                (accountDetails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("accountDetails", it).add(accountDetail)
                }
        }

        /** The ID of a counterparty that the virtual account belongs to. Optional. */
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

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The ID of a credit normal ledger account. When money enters the virtual account, this
         * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
         * present.
         */
        fun creditLedgerAccountId(creditLedgerAccountId: String?) =
            creditLedgerAccountId(JsonField.ofNullable(creditLedgerAccountId))

        /**
         * Sets [Builder.creditLedgerAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditLedgerAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditLedgerAccountId(creditLedgerAccountId: JsonField<String>) = apply {
            this.creditLedgerAccountId = creditLedgerAccountId
        }

        /**
         * The ID of a debit normal ledger account. When money enters the virtual account, this
         * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
         * present.
         */
        fun debitLedgerAccountId(debitLedgerAccountId: String?) =
            debitLedgerAccountId(JsonField.ofNullable(debitLedgerAccountId))

        /**
         * Sets [Builder.debitLedgerAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debitLedgerAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debitLedgerAccountId(debitLedgerAccountId: JsonField<String>) = apply {
            this.debitLedgerAccountId = debitLedgerAccountId
        }

        /** An optional free-form description for internal use. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        /**
         * Sets [Builder.discardedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discardedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** The ID of the internal account that the virtual account is in. */
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

        /**
         * If the virtual account links to a ledger account in Modern Treasury, the id of the ledger
         * account will be populated here.
         */
        fun ledgerAccountId(ledgerAccountId: String?) =
            ledgerAccountId(JsonField.ofNullable(ledgerAccountId))

        /**
         * Sets [Builder.ledgerAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
            this.ledgerAccountId = ledgerAccountId
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
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The name of the virtual account. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * An array of routing detail objects. These will be the routing details of the internal
         * account.
         */
        fun routingDetails(routingDetails: List<RoutingDetail>) =
            routingDetails(JsonField.of(routingDetails))

        /**
         * Sets [Builder.routingDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingDetails] with a well-typed `List<RoutingDetail>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun routingDetails(routingDetails: JsonField<List<RoutingDetail>>) = apply {
            this.routingDetails = routingDetails.map { it.toMutableList() }
        }

        /**
         * Adds a single [RoutingDetail] to [routingDetails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRoutingDetail(routingDetail: RoutingDetail) = apply {
            routingDetails =
                (routingDetails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("routingDetails", it).add(routingDetail)
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
         * Returns an immutable instance of [VirtualAccount].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountDetails()
         * .counterpartyId()
         * .createdAt()
         * .creditLedgerAccountId()
         * .debitLedgerAccountId()
         * .description()
         * .discardedAt()
         * .internalAccountId()
         * .ledgerAccountId()
         * .liveMode()
         * .metadata()
         * .name()
         * .object_()
         * .routingDetails()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VirtualAccount =
            VirtualAccount(
                checkRequired("id", id),
                checkRequired("accountDetails", accountDetails).map { it.toImmutable() },
                checkRequired("counterpartyId", counterpartyId),
                checkRequired("createdAt", createdAt),
                checkRequired("creditLedgerAccountId", creditLedgerAccountId),
                checkRequired("debitLedgerAccountId", debitLedgerAccountId),
                checkRequired("description", description),
                checkRequired("discardedAt", discardedAt),
                checkRequired("internalAccountId", internalAccountId),
                checkRequired("ledgerAccountId", ledgerAccountId),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("name", name),
                checkRequired("object_", object_),
                checkRequired("routingDetails", routingDetails).map { it.toImmutable() },
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VirtualAccount = apply {
        if (validated) {
            return@apply
        }

        id()
        accountDetails().forEach { it.validate() }
        counterpartyId()
        createdAt()
        creditLedgerAccountId()
        debitLedgerAccountId()
        description()
        discardedAt()
        internalAccountId()
        ledgerAccountId()
        liveMode()
        metadata().validate()
        name()
        object_()
        routingDetails().forEach { it.validate() }
        updatedAt()
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
            (accountDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (counterpartyId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (creditLedgerAccountId.asKnown() == null) 0 else 1) +
            (if (debitLedgerAccountId.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (discardedAt.asKnown() == null) 0 else 1) +
            (if (internalAccountId.asKnown() == null) 0 else 1) +
            (if (ledgerAccountId.asKnown() == null) 0 else 1) +
            (if (liveMode.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (object_.asKnown() == null) 0 else 1) +
            (routingDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1)

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

        return other is VirtualAccount &&
            id == other.id &&
            accountDetails == other.accountDetails &&
            counterpartyId == other.counterpartyId &&
            createdAt == other.createdAt &&
            creditLedgerAccountId == other.creditLedgerAccountId &&
            debitLedgerAccountId == other.debitLedgerAccountId &&
            description == other.description &&
            discardedAt == other.discardedAt &&
            internalAccountId == other.internalAccountId &&
            ledgerAccountId == other.ledgerAccountId &&
            liveMode == other.liveMode &&
            metadata == other.metadata &&
            name == other.name &&
            object_ == other.object_ &&
            routingDetails == other.routingDetails &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountDetails,
            counterpartyId,
            createdAt,
            creditLedgerAccountId,
            debitLedgerAccountId,
            description,
            discardedAt,
            internalAccountId,
            ledgerAccountId,
            liveMode,
            metadata,
            name,
            object_,
            routingDetails,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VirtualAccount{id=$id, accountDetails=$accountDetails, counterpartyId=$counterpartyId, createdAt=$createdAt, creditLedgerAccountId=$creditLedgerAccountId, debitLedgerAccountId=$debitLedgerAccountId, description=$description, discardedAt=$discardedAt, internalAccountId=$internalAccountId, ledgerAccountId=$ledgerAccountId, liveMode=$liveMode, metadata=$metadata, name=$name, object_=$object_, routingDetails=$routingDetails, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
