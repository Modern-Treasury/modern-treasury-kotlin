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

/** Create a new counterparty. */
class CounterpartyCreateParams
private constructor(
    private val body: CounterpartyCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A human friendly name for this counterparty.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = body.name()

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun accounting(): Accounting? = body.accounting()

    /**
     * The accounts for this counterparty.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun accounts(): List<Account>? = body.accounts()

    /**
     * The counterparty's email.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun email(): String? = body.email()

    /**
     * An optional type to auto-sync the counterparty to your ledger. Either `customer` or `vendor`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun ledgerType(): LedgerType? = body.ledgerType()

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun legalEntity(): LegalEntityCreateRequest? = body.legalEntity()

    /**
     * The id of the legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun legalEntityId(): String? = body.legalEntityId()

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * Send an email to the counterparty whenever an associated payment order is sent to the bank.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sendRemittanceAdvice(): Boolean? = body.sendRemittanceAdvice()

    /**
     * Either a valid SSN or EIN.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxpayerIdentifier(): String? = body.taxpayerIdentifier()

    /**
     * The verification status of the counterparty.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun verificationStatus(): VerificationStatus? = body.verificationStatus()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [accounting].
     *
     * Unlike [accounting], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accounting(): JsonField<Accounting> = body._accounting()

    /**
     * Returns the raw JSON value of [accounts].
     *
     * Unlike [accounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accounts(): JsonField<List<Account>> = body._accounts()

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

    /**
     * Returns the raw JSON value of [ledgerType].
     *
     * Unlike [ledgerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated") fun _ledgerType(): JsonField<LedgerType> = body._ledgerType()

    /**
     * Returns the raw JSON value of [legalEntity].
     *
     * Unlike [legalEntity], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _legalEntity(): JsonField<LegalEntityCreateRequest> = body._legalEntity()

    /**
     * Returns the raw JSON value of [legalEntityId].
     *
     * Unlike [legalEntityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _legalEntityId(): JsonField<String> = body._legalEntityId()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [sendRemittanceAdvice].
     *
     * Unlike [sendRemittanceAdvice], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sendRemittanceAdvice(): JsonField<Boolean> = body._sendRemittanceAdvice()

    /**
     * Returns the raw JSON value of [taxpayerIdentifier].
     *
     * Unlike [taxpayerIdentifier], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _taxpayerIdentifier(): JsonField<String> = body._taxpayerIdentifier()

    /**
     * Returns the raw JSON value of [verificationStatus].
     *
     * Unlike [verificationStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _verificationStatus(): JsonField<VerificationStatus> = body._verificationStatus()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CounterpartyCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CounterpartyCreateParams]. */
    class Builder internal constructor() {

        private var body: CounterpartyCreateRequest.Builder = CounterpartyCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(counterpartyCreateParams: CounterpartyCreateParams) = apply {
            body = counterpartyCreateParams.body.toBuilder()
            additionalHeaders = counterpartyCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = counterpartyCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [accounting]
         * - [accounts]
         * - [email]
         * - [ledgerType]
         * - etc.
         */
        fun body(body: CounterpartyCreateRequest) = apply { this.body = body.toBuilder() }

        /** A human friendly name for this counterparty. */
        fun name(name: String?) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun accounting(accounting: Accounting) = apply { body.accounting(accounting) }

        /**
         * Sets [Builder.accounting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accounting] with a well-typed [Accounting] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accounting(accounting: JsonField<Accounting>) = apply { body.accounting(accounting) }

        /** The accounts for this counterparty. */
        fun accounts(accounts: List<Account>) = apply { body.accounts(accounts) }

        /**
         * Sets [Builder.accounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accounts] with a well-typed `List<Account>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accounts(accounts: JsonField<List<Account>>) = apply { body.accounts(accounts) }

        /**
         * Adds a single [Account] to [accounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccount(account: Account) = apply { body.addAccount(account) }

        /** The counterparty's email. */
        fun email(email: String?) = apply { body.email(email) }

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         */
        @Deprecated("deprecated")
        fun ledgerType(ledgerType: LedgerType) = apply { body.ledgerType(ledgerType) }

        /**
         * Sets [Builder.ledgerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerType] with a well-typed [LedgerType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun ledgerType(ledgerType: JsonField<LedgerType>) = apply { body.ledgerType(ledgerType) }

        fun legalEntity(legalEntity: LegalEntityCreateRequest) = apply {
            body.legalEntity(legalEntity)
        }

        /**
         * Sets [Builder.legalEntity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalEntity] with a well-typed
         * [LegalEntityCreateRequest] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun legalEntity(legalEntity: JsonField<LegalEntityCreateRequest>) = apply {
            body.legalEntity(legalEntity)
        }

        /** The id of the legal entity. */
        fun legalEntityId(legalEntityId: String?) = apply { body.legalEntityId(legalEntityId) }

        /**
         * Sets [Builder.legalEntityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalEntityId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun legalEntityId(legalEntityId: JsonField<String>) = apply {
            body.legalEntityId(legalEntityId)
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

        /**
         * Send an email to the counterparty whenever an associated payment order is sent to the
         * bank.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) = apply {
            body.sendRemittanceAdvice(sendRemittanceAdvice)
        }

        /**
         * Sets [Builder.sendRemittanceAdvice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendRemittanceAdvice] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: JsonField<Boolean>) = apply {
            body.sendRemittanceAdvice(sendRemittanceAdvice)
        }

        /** Either a valid SSN or EIN. */
        fun taxpayerIdentifier(taxpayerIdentifier: String) = apply {
            body.taxpayerIdentifier(taxpayerIdentifier)
        }

        /**
         * Sets [Builder.taxpayerIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxpayerIdentifier] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taxpayerIdentifier(taxpayerIdentifier: JsonField<String>) = apply {
            body.taxpayerIdentifier(taxpayerIdentifier)
        }

        /** The verification status of the counterparty. */
        fun verificationStatus(verificationStatus: VerificationStatus) = apply {
            body.verificationStatus(verificationStatus)
        }

        /**
         * Sets [Builder.verificationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationStatus] with a well-typed
         * [VerificationStatus] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun verificationStatus(verificationStatus: JsonField<VerificationStatus>) = apply {
            body.verificationStatus(verificationStatus)
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
         * Returns an immutable instance of [CounterpartyCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CounterpartyCreateParams =
            CounterpartyCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CounterpartyCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class CounterpartyCreateRequest
    private constructor(
        private val name: JsonField<String>,
        private val accounting: JsonField<Accounting>,
        private val accounts: JsonField<List<Account>>,
        private val email: JsonField<String>,
        private val ledgerType: JsonField<LedgerType>,
        private val legalEntity: JsonField<LegalEntityCreateRequest>,
        private val legalEntityId: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val sendRemittanceAdvice: JsonField<Boolean>,
        private val taxpayerIdentifier: JsonField<String>,
        private val verificationStatus: JsonField<VerificationStatus>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accounting")
            @ExcludeMissing
            accounting: JsonField<Accounting> = JsonMissing.of(),
            @JsonProperty("accounts")
            @ExcludeMissing
            accounts: JsonField<List<Account>> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ledger_type")
            @ExcludeMissing
            ledgerType: JsonField<LedgerType> = JsonMissing.of(),
            @JsonProperty("legal_entity")
            @ExcludeMissing
            legalEntity: JsonField<LegalEntityCreateRequest> = JsonMissing.of(),
            @JsonProperty("legal_entity_id")
            @ExcludeMissing
            legalEntityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("send_remittance_advice")
            @ExcludeMissing
            sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("taxpayer_identifier")
            @ExcludeMissing
            taxpayerIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("verification_status")
            @ExcludeMissing
            verificationStatus: JsonField<VerificationStatus> = JsonMissing.of(),
        ) : this(
            name,
            accounting,
            accounts,
            email,
            ledgerType,
            legalEntity,
            legalEntityId,
            metadata,
            sendRemittanceAdvice,
            taxpayerIdentifier,
            verificationStatus,
            mutableMapOf(),
        )

        /**
         * A human friendly name for this counterparty.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accounting(): Accounting? = accounting.getNullable("accounting")

        /**
         * The accounts for this counterparty.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accounts(): List<Account>? = accounts.getNullable("accounts")

        /**
         * The counterparty's email.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun email(): String? = email.getNullable("email")

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun ledgerType(): LedgerType? = ledgerType.getNullable("ledger_type")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun legalEntity(): LegalEntityCreateRequest? = legalEntity.getNullable("legal_entity")

        /**
         * The id of the legal entity.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun legalEntityId(): String? = legalEntityId.getNullable("legal_entity_id")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * Send an email to the counterparty whenever an associated payment order is sent to the
         * bank.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sendRemittanceAdvice(): Boolean? =
            sendRemittanceAdvice.getNullable("send_remittance_advice")

        /**
         * Either a valid SSN or EIN.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun taxpayerIdentifier(): String? = taxpayerIdentifier.getNullable("taxpayer_identifier")

        /**
         * The verification status of the counterparty.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun verificationStatus(): VerificationStatus? =
            verificationStatus.getNullable("verification_status")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [accounting].
         *
         * Unlike [accounting], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accounting")
        @ExcludeMissing
        fun _accounting(): JsonField<Accounting> = accounting

        /**
         * Returns the raw JSON value of [accounts].
         *
         * Unlike [accounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accounts")
        @ExcludeMissing
        fun _accounts(): JsonField<List<Account>> = accounts

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [ledgerType].
         *
         * Unlike [ledgerType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("ledger_type")
        @ExcludeMissing
        fun _ledgerType(): JsonField<LedgerType> = ledgerType

        /**
         * Returns the raw JSON value of [legalEntity].
         *
         * Unlike [legalEntity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("legal_entity")
        @ExcludeMissing
        fun _legalEntity(): JsonField<LegalEntityCreateRequest> = legalEntity

        /**
         * Returns the raw JSON value of [legalEntityId].
         *
         * Unlike [legalEntityId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("legal_entity_id")
        @ExcludeMissing
        fun _legalEntityId(): JsonField<String> = legalEntityId

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [sendRemittanceAdvice].
         *
         * Unlike [sendRemittanceAdvice], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("send_remittance_advice")
        @ExcludeMissing
        fun _sendRemittanceAdvice(): JsonField<Boolean> = sendRemittanceAdvice

        /**
         * Returns the raw JSON value of [taxpayerIdentifier].
         *
         * Unlike [taxpayerIdentifier], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("taxpayer_identifier")
        @ExcludeMissing
        fun _taxpayerIdentifier(): JsonField<String> = taxpayerIdentifier

        /**
         * Returns the raw JSON value of [verificationStatus].
         *
         * Unlike [verificationStatus], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("verification_status")
        @ExcludeMissing
        fun _verificationStatus(): JsonField<VerificationStatus> = verificationStatus

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
             * [CounterpartyCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CounterpartyCreateRequest]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var accounting: JsonField<Accounting> = JsonMissing.of()
            private var accounts: JsonField<MutableList<Account>>? = null
            private var email: JsonField<String> = JsonMissing.of()
            private var ledgerType: JsonField<LedgerType> = JsonMissing.of()
            private var legalEntity: JsonField<LegalEntityCreateRequest> = JsonMissing.of()
            private var legalEntityId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of()
            private var taxpayerIdentifier: JsonField<String> = JsonMissing.of()
            private var verificationStatus: JsonField<VerificationStatus> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(counterpartyCreateRequest: CounterpartyCreateRequest) = apply {
                name = counterpartyCreateRequest.name
                accounting = counterpartyCreateRequest.accounting
                accounts = counterpartyCreateRequest.accounts.map { it.toMutableList() }
                email = counterpartyCreateRequest.email
                ledgerType = counterpartyCreateRequest.ledgerType
                legalEntity = counterpartyCreateRequest.legalEntity
                legalEntityId = counterpartyCreateRequest.legalEntityId
                metadata = counterpartyCreateRequest.metadata
                sendRemittanceAdvice = counterpartyCreateRequest.sendRemittanceAdvice
                taxpayerIdentifier = counterpartyCreateRequest.taxpayerIdentifier
                verificationStatus = counterpartyCreateRequest.verificationStatus
                additionalProperties = counterpartyCreateRequest.additionalProperties.toMutableMap()
            }

            /** A human friendly name for this counterparty. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun accounting(accounting: Accounting) = accounting(JsonField.of(accounting))

            /**
             * Sets [Builder.accounting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accounting] with a well-typed [Accounting] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accounting(accounting: JsonField<Accounting>) = apply {
                this.accounting = accounting
            }

            /** The accounts for this counterparty. */
            fun accounts(accounts: List<Account>) = accounts(JsonField.of(accounts))

            /**
             * Sets [Builder.accounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accounts] with a well-typed `List<Account>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accounts(accounts: JsonField<List<Account>>) = apply {
                this.accounts = accounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Account] to [accounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAccount(account: Account) = apply {
                accounts =
                    (accounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("accounts", it).add(account)
                    }
            }

            /** The counterparty's email. */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /**
             * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
             * `vendor`.
             */
            @Deprecated("deprecated")
            fun ledgerType(ledgerType: LedgerType) = ledgerType(JsonField.of(ledgerType))

            /**
             * Sets [Builder.ledgerType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerType] with a well-typed [LedgerType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun ledgerType(ledgerType: JsonField<LedgerType>) = apply {
                this.ledgerType = ledgerType
            }

            fun legalEntity(legalEntity: LegalEntityCreateRequest) =
                legalEntity(JsonField.of(legalEntity))

            /**
             * Sets [Builder.legalEntity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalEntity] with a well-typed
             * [LegalEntityCreateRequest] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun legalEntity(legalEntity: JsonField<LegalEntityCreateRequest>) = apply {
                this.legalEntity = legalEntity
            }

            /** The id of the legal entity. */
            fun legalEntityId(legalEntityId: String?) =
                legalEntityId(JsonField.ofNullable(legalEntityId))

            /**
             * Sets [Builder.legalEntityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalEntityId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legalEntityId(legalEntityId: JsonField<String>) = apply {
                this.legalEntityId = legalEntityId
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

            /**
             * Send an email to the counterparty whenever an associated payment order is sent to the
             * bank.
             */
            fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
                sendRemittanceAdvice(JsonField.of(sendRemittanceAdvice))

            /**
             * Sets [Builder.sendRemittanceAdvice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sendRemittanceAdvice] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sendRemittanceAdvice(sendRemittanceAdvice: JsonField<Boolean>) = apply {
                this.sendRemittanceAdvice = sendRemittanceAdvice
            }

            /** Either a valid SSN or EIN. */
            fun taxpayerIdentifier(taxpayerIdentifier: String) =
                taxpayerIdentifier(JsonField.of(taxpayerIdentifier))

            /**
             * Sets [Builder.taxpayerIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxpayerIdentifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxpayerIdentifier(taxpayerIdentifier: JsonField<String>) = apply {
                this.taxpayerIdentifier = taxpayerIdentifier
            }

            /** The verification status of the counterparty. */
            fun verificationStatus(verificationStatus: VerificationStatus) =
                verificationStatus(JsonField.of(verificationStatus))

            /**
             * Sets [Builder.verificationStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verificationStatus] with a well-typed
             * [VerificationStatus] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun verificationStatus(verificationStatus: JsonField<VerificationStatus>) = apply {
                this.verificationStatus = verificationStatus
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
             * Returns an immutable instance of [CounterpartyCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CounterpartyCreateRequest =
                CounterpartyCreateRequest(
                    checkRequired("name", name),
                    accounting,
                    (accounts ?: JsonMissing.of()).map { it.toImmutable() },
                    email,
                    ledgerType,
                    legalEntity,
                    legalEntityId,
                    metadata,
                    sendRemittanceAdvice,
                    taxpayerIdentifier,
                    verificationStatus,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CounterpartyCreateRequest = apply {
            if (validated) {
                return@apply
            }

            name()
            accounting()?.validate()
            accounts()?.forEach { it.validate() }
            email()
            ledgerType()?.validate()
            legalEntity()?.validate()
            legalEntityId()
            metadata()?.validate()
            sendRemittanceAdvice()
            taxpayerIdentifier()
            verificationStatus()?.validate()
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
            (if (name.asKnown() == null) 0 else 1) +
                (accounting.asKnown()?.validity() ?: 0) +
                (accounts.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (email.asKnown() == null) 0 else 1) +
                (ledgerType.asKnown()?.validity() ?: 0) +
                (legalEntity.asKnown()?.validity() ?: 0) +
                (if (legalEntityId.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (sendRemittanceAdvice.asKnown() == null) 0 else 1) +
                (if (taxpayerIdentifier.asKnown() == null) 0 else 1) +
                (verificationStatus.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CounterpartyCreateRequest && name == other.name && accounting == other.accounting && accounts == other.accounts && email == other.email && ledgerType == other.ledgerType && legalEntity == other.legalEntity && legalEntityId == other.legalEntityId && metadata == other.metadata && sendRemittanceAdvice == other.sendRemittanceAdvice && taxpayerIdentifier == other.taxpayerIdentifier && verificationStatus == other.verificationStatus && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, accounting, accounts, email, ledgerType, legalEntity, legalEntityId, metadata, sendRemittanceAdvice, taxpayerIdentifier, verificationStatus, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CounterpartyCreateRequest{name=$name, accounting=$accounting, accounts=$accounts, email=$email, ledgerType=$ledgerType, legalEntity=$legalEntity, legalEntityId=$legalEntityId, metadata=$metadata, sendRemittanceAdvice=$sendRemittanceAdvice, taxpayerIdentifier=$taxpayerIdentifier, verificationStatus=$verificationStatus, additionalProperties=$additionalProperties}"
    }

    class Accounting
    private constructor(
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of()
        ) : this(type, mutableMapOf())

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun type(): Type? = type.getNullable("type")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [Accounting]. */
            fun builder() = Builder()
        }

        /** A builder for [Accounting]. */
        class Builder internal constructor() {

            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accounting: Accounting) = apply {
                type = accounting.type
                additionalProperties = accounting.additionalProperties.toMutableMap()
            }

            /**
             * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
             * `vendor`.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Accounting].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Accounting = Accounting(type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Accounting = apply {
            if (validated) {
                return@apply
            }

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
        internal fun validity(): Int = (type.asKnown()?.validity() ?: 0)

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val CUSTOMER = of("customer")

                val VENDOR = of("vendor")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                CUSTOMER,
                VENDOR,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CUSTOMER,
                VENDOR,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    CUSTOMER -> Value.CUSTOMER
                    VENDOR -> Value.VENDOR
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
                    CUSTOMER -> Known.CUSTOMER
                    VENDOR -> Known.VENDOR
                    else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Accounting && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Accounting{type=$type, additionalProperties=$additionalProperties}"
    }

    class Account
    private constructor(
        private val accountDetails: JsonField<List<AccountDetail>>,
        private val accountType: JsonField<ExternalAccountType>,
        private val contactDetails: JsonField<List<ContactDetailCreateRequest>>,
        private val ledgerAccount: JsonField<LedgerAccountCreateRequest>,
        private val metadata: JsonField<Metadata>,
        private val name: JsonField<String>,
        private val partyAddress: JsonField<AddressRequest>,
        private val partyIdentifier: JsonField<String>,
        private val partyName: JsonField<String>,
        private val partyType: JsonField<PartyType>,
        private val plaidProcessorToken: JsonField<String>,
        private val routingDetails: JsonField<List<RoutingDetail>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_details")
            @ExcludeMissing
            accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of(),
            @JsonProperty("account_type")
            @ExcludeMissing
            accountType: JsonField<ExternalAccountType> = JsonMissing.of(),
            @JsonProperty("contact_details")
            @ExcludeMissing
            contactDetails: JsonField<List<ContactDetailCreateRequest>> = JsonMissing.of(),
            @JsonProperty("ledger_account")
            @ExcludeMissing
            ledgerAccount: JsonField<LedgerAccountCreateRequest> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("party_address")
            @ExcludeMissing
            partyAddress: JsonField<AddressRequest> = JsonMissing.of(),
            @JsonProperty("party_identifier")
            @ExcludeMissing
            partyIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("party_name")
            @ExcludeMissing
            partyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("party_type")
            @ExcludeMissing
            partyType: JsonField<PartyType> = JsonMissing.of(),
            @JsonProperty("plaid_processor_token")
            @ExcludeMissing
            plaidProcessorToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routing_details")
            @ExcludeMissing
            routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of(),
        ) : this(
            accountDetails,
            accountType,
            contactDetails,
            ledgerAccount,
            metadata,
            name,
            partyAddress,
            partyIdentifier,
            partyName,
            partyType,
            plaidProcessorToken,
            routingDetails,
            mutableMapOf(),
        )

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountDetails(): List<AccountDetail>? = accountDetails.getNullable("account_details")

        /**
         * Can be `checking`, `savings` or `other`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountType(): ExternalAccountType? = accountType.getNullable("account_type")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun contactDetails(): List<ContactDetailCreateRequest>? =
            contactDetails.getNullable("contact_details")

        /**
         * Specifies a ledger account object that will be created with the external account. The
         * resulting ledger account is linked to the external account for auto-ledgering Payment
         * objects. See
         * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for more
         * details.
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
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * Required if receiving wire payments.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun partyAddress(): AddressRequest? = partyAddress.getNullable("party_address")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun partyIdentifier(): String? = partyIdentifier.getNullable("party_identifier")

        /**
         * If this value isn't provided, it will be inherited from the counterparty's name.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun partyName(): String? = partyName.getNullable("party_name")

        /**
         * Either `individual` or `business`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun partyType(): PartyType? = partyType.getNullable("party_type")

        /**
         * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you can
         * pass the processor token in this field.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun plaidProcessorToken(): String? =
            plaidProcessorToken.getNullable("plaid_processor_token")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun routingDetails(): List<RoutingDetail>? = routingDetails.getNullable("routing_details")

        /**
         * Returns the raw JSON value of [accountDetails].
         *
         * Unlike [accountDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_details")
        @ExcludeMissing
        fun _accountDetails(): JsonField<List<AccountDetail>> = accountDetails

        /**
         * Returns the raw JSON value of [accountType].
         *
         * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_type")
        @ExcludeMissing
        fun _accountType(): JsonField<ExternalAccountType> = accountType

        /**
         * Returns the raw JSON value of [contactDetails].
         *
         * Unlike [contactDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contact_details")
        @ExcludeMissing
        fun _contactDetails(): JsonField<List<ContactDetailCreateRequest>> = contactDetails

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [partyAddress].
         *
         * Unlike [partyAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("party_address")
        @ExcludeMissing
        fun _partyAddress(): JsonField<AddressRequest> = partyAddress

        /**
         * Returns the raw JSON value of [partyIdentifier].
         *
         * Unlike [partyIdentifier], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("party_identifier")
        @ExcludeMissing
        fun _partyIdentifier(): JsonField<String> = partyIdentifier

        /**
         * Returns the raw JSON value of [partyName].
         *
         * Unlike [partyName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("party_name") @ExcludeMissing fun _partyName(): JsonField<String> = partyName

        /**
         * Returns the raw JSON value of [partyType].
         *
         * Unlike [partyType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("party_type")
        @ExcludeMissing
        fun _partyType(): JsonField<PartyType> = partyType

        /**
         * Returns the raw JSON value of [plaidProcessorToken].
         *
         * Unlike [plaidProcessorToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("plaid_processor_token")
        @ExcludeMissing
        fun _plaidProcessorToken(): JsonField<String> = plaidProcessorToken

        /**
         * Returns the raw JSON value of [routingDetails].
         *
         * Unlike [routingDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_details")
        @ExcludeMissing
        fun _routingDetails(): JsonField<List<RoutingDetail>> = routingDetails

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

            /** Returns a mutable builder for constructing an instance of [Account]. */
            fun builder() = Builder()
        }

        /** A builder for [Account]. */
        class Builder internal constructor() {

            private var accountDetails: JsonField<MutableList<AccountDetail>>? = null
            private var accountType: JsonField<ExternalAccountType> = JsonMissing.of()
            private var contactDetails: JsonField<MutableList<ContactDetailCreateRequest>>? = null
            private var ledgerAccount: JsonField<LedgerAccountCreateRequest> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var partyAddress: JsonField<AddressRequest> = JsonMissing.of()
            private var partyIdentifier: JsonField<String> = JsonMissing.of()
            private var partyName: JsonField<String> = JsonMissing.of()
            private var partyType: JsonField<PartyType> = JsonMissing.of()
            private var plaidProcessorToken: JsonField<String> = JsonMissing.of()
            private var routingDetails: JsonField<MutableList<RoutingDetail>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(account: Account) = apply {
                accountDetails = account.accountDetails.map { it.toMutableList() }
                accountType = account.accountType
                contactDetails = account.contactDetails.map { it.toMutableList() }
                ledgerAccount = account.ledgerAccount
                metadata = account.metadata
                name = account.name
                partyAddress = account.partyAddress
                partyIdentifier = account.partyIdentifier
                partyName = account.partyName
                partyType = account.partyType
                plaidProcessorToken = account.plaidProcessorToken
                routingDetails = account.routingDetails.map { it.toMutableList() }
                additionalProperties = account.additionalProperties.toMutableMap()
            }

            fun accountDetails(accountDetails: List<AccountDetail>) =
                accountDetails(JsonField.of(accountDetails))

            /**
             * Sets [Builder.accountDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountDetails] with a well-typed
             * `List<AccountDetail>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
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

            /** Can be `checking`, `savings` or `other`. */
            fun accountType(accountType: ExternalAccountType) =
                accountType(JsonField.of(accountType))

            /**
             * Sets [Builder.accountType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountType] with a well-typed [ExternalAccountType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accountType(accountType: JsonField<ExternalAccountType>) = apply {
                this.accountType = accountType
            }

            fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) =
                contactDetails(JsonField.of(contactDetails))

            /**
             * Sets [Builder.contactDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactDetails] with a well-typed
             * `List<ContactDetailCreateRequest>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun contactDetails(contactDetails: JsonField<List<ContactDetailCreateRequest>>) =
                apply {
                    this.contactDetails = contactDetails.map { it.toMutableList() }
                }

            /**
             * Adds a single [ContactDetailCreateRequest] to [contactDetails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContactDetail(contactDetail: ContactDetailCreateRequest) = apply {
                contactDetails =
                    (contactDetails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contactDetails", it).add(contactDetail)
                    }
            }

            /**
             * Specifies a ledger account object that will be created with the external account. The
             * resulting ledger account is linked to the external account for auto-ledgering Payment
             * objects. See
             * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
             * more details.
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

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Required if receiving wire payments. */
            fun partyAddress(partyAddress: AddressRequest) =
                partyAddress(JsonField.of(partyAddress))

            /**
             * Sets [Builder.partyAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partyAddress] with a well-typed [AddressRequest]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun partyAddress(partyAddress: JsonField<AddressRequest>) = apply {
                this.partyAddress = partyAddress
            }

            fun partyIdentifier(partyIdentifier: String) =
                partyIdentifier(JsonField.of(partyIdentifier))

            /**
             * Sets [Builder.partyIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partyIdentifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun partyIdentifier(partyIdentifier: JsonField<String>) = apply {
                this.partyIdentifier = partyIdentifier
            }

            /** If this value isn't provided, it will be inherited from the counterparty's name. */
            fun partyName(partyName: String) = partyName(JsonField.of(partyName))

            /**
             * Sets [Builder.partyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partyName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun partyName(partyName: JsonField<String>) = apply { this.partyName = partyName }

            /** Either `individual` or `business`. */
            fun partyType(partyType: PartyType?) = partyType(JsonField.ofNullable(partyType))

            /**
             * Sets [Builder.partyType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partyType] with a well-typed [PartyType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun partyType(partyType: JsonField<PartyType>) = apply { this.partyType = partyType }

            /**
             * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you
             * can pass the processor token in this field.
             */
            fun plaidProcessorToken(plaidProcessorToken: String) =
                plaidProcessorToken(JsonField.of(plaidProcessorToken))

            /**
             * Sets [Builder.plaidProcessorToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.plaidProcessorToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun plaidProcessorToken(plaidProcessorToken: JsonField<String>) = apply {
                this.plaidProcessorToken = plaidProcessorToken
            }

            fun routingDetails(routingDetails: List<RoutingDetail>) =
                routingDetails(JsonField.of(routingDetails))

            /**
             * Sets [Builder.routingDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingDetails] with a well-typed
             * `List<RoutingDetail>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
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
             * Returns an immutable instance of [Account].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Account =
                Account(
                    (accountDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    accountType,
                    (contactDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    ledgerAccount,
                    metadata,
                    name,
                    partyAddress,
                    partyIdentifier,
                    partyName,
                    partyType,
                    plaidProcessorToken,
                    (routingDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Account = apply {
            if (validated) {
                return@apply
            }

            accountDetails()?.forEach { it.validate() }
            accountType()?.validate()
            contactDetails()?.forEach { it.validate() }
            ledgerAccount()?.validate()
            metadata()?.validate()
            name()
            partyAddress()?.validate()
            partyIdentifier()
            partyName()
            partyType()?.validate()
            plaidProcessorToken()
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
            (accountDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (accountType.asKnown()?.validity() ?: 0) +
                (contactDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (ledgerAccount.asKnown()?.validity() ?: 0) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (name.asKnown() == null) 0 else 1) +
                (partyAddress.asKnown()?.validity() ?: 0) +
                (if (partyIdentifier.asKnown() == null) 0 else 1) +
                (if (partyName.asKnown() == null) 0 else 1) +
                (partyType.asKnown()?.validity() ?: 0) +
                (if (plaidProcessorToken.asKnown() == null) 0 else 1) +
                (routingDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        class AccountDetail
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
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("account_number")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
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
             * Unlike [accountNumberType], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [AccountDetail].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [AccountDetail]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountNumberType: JsonField<AccountNumberType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(accountDetail: AccountDetail) = apply {
                    accountNumber = accountDetail.accountNumber
                    accountNumberType = accountDetail.accountNumberType
                    additionalProperties = accountDetail.additionalProperties.toMutableMap()
                }

                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /**
                 * Sets [Builder.accountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                fun accountNumberType(accountNumberType: AccountNumberType) =
                    accountNumberType(JsonField.of(accountNumberType))

                /**
                 * Sets [Builder.accountNumberType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountNumberType] with a well-typed
                 * [AccountNumberType] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AccountDetail].
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
                fun build(): AccountDetail =
                    AccountDetail(
                        checkRequired("accountNumber", accountNumber),
                        accountNumberType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AccountDetail = apply {
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

            class AccountNumberType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * An instance of [AccountNumberType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
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
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
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

                return /* spotless:off */ other is AccountDetail && accountNumber == other.accountNumber && accountNumberType == other.accountNumberType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(accountNumber, accountNumberType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccountDetail{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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

        /** Either `individual` or `business`. */
        class PartyType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val BUSINESS = of("business")

                val INDIVIDUAL = of("individual")

                fun of(value: String) = PartyType(JsonField.of(value))
            }

            /** An enum containing [PartyType]'s known values. */
            enum class Known {
                BUSINESS,
                INDIVIDUAL,
            }

            /**
             * An enum containing [PartyType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PartyType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BUSINESS,
                INDIVIDUAL,
                /**
                 * An enum member indicating that [PartyType] was instantiated with an unknown
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
                    BUSINESS -> Value.BUSINESS
                    INDIVIDUAL -> Value.INDIVIDUAL
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
                    BUSINESS -> Known.BUSINESS
                    INDIVIDUAL -> Known.INDIVIDUAL
                    else -> throw ModernTreasuryInvalidDataException("Unknown PartyType: $value")
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

            fun validate(): PartyType = apply {
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

                return /* spotless:off */ other is PartyType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class RoutingDetail
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
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun routingNumber(): String = routingNumber.getRequired("routing_number")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun routingNumberType(): RoutingNumberType =
                routingNumberType.getRequired("routing_number_type")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
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
             * Unlike [routingNumberType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("routing_number_type")
            @ExcludeMissing
            fun _routingNumberType(): JsonField<RoutingNumberType> = routingNumberType

            /**
             * Returns the raw JSON value of [paymentType].
             *
             * Unlike [paymentType], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of [RoutingDetail].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .routingNumber()
                 * .routingNumberType()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [RoutingDetail]. */
            class Builder internal constructor() {

                private var routingNumber: JsonField<String>? = null
                private var routingNumberType: JsonField<RoutingNumberType>? = null
                private var paymentType: JsonField<PaymentType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(routingDetail: RoutingDetail) = apply {
                    routingNumber = routingDetail.routingNumber
                    routingNumberType = routingDetail.routingNumberType
                    paymentType = routingDetail.paymentType
                    additionalProperties = routingDetail.additionalProperties.toMutableMap()
                }

                fun routingNumber(routingNumber: String) =
                    routingNumber(JsonField.of(routingNumber))

                /**
                 * Sets [Builder.routingNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routingNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun routingNumber(routingNumber: JsonField<String>) = apply {
                    this.routingNumber = routingNumber
                }

                fun routingNumberType(routingNumberType: RoutingNumberType) =
                    routingNumberType(JsonField.of(routingNumberType))

                /**
                 * Sets [Builder.routingNumberType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routingNumberType] with a well-typed
                 * [RoutingNumberType] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) = apply {
                    this.routingNumberType = routingNumberType
                }

                fun paymentType(paymentType: PaymentType) = paymentType(JsonField.of(paymentType))

                /**
                 * Sets [Builder.paymentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentType] with a well-typed [PaymentType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [RoutingDetail].
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
                fun build(): RoutingDetail =
                    RoutingDetail(
                        checkRequired("routingNumber", routingNumber),
                        checkRequired("routingNumberType", routingNumberType),
                        paymentType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RoutingDetail = apply {
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

            class RoutingNumberType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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

                    val MY_BRANCH_CODE = of("my_branch_code")

                    val MX_BANK_IDENTIFIER = of("mx_bank_identifier")

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
                    MY_BRANCH_CODE,
                    MX_BANK_IDENTIFIER,
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
                 * An instance of [RoutingNumberType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                    MY_BRANCH_CODE,
                    MX_BANK_IDENTIFIER,
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                        MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                        MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
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
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
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
                        MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                        MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
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
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
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

            class PaymentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
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
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
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

                return /* spotless:off */ other is RoutingDetail && routingNumber == other.routingNumber && routingNumberType == other.routingNumberType && paymentType == other.paymentType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(routingNumber, routingNumberType, paymentType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RoutingDetail{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Account && accountDetails == other.accountDetails && accountType == other.accountType && contactDetails == other.contactDetails && ledgerAccount == other.ledgerAccount && metadata == other.metadata && name == other.name && partyAddress == other.partyAddress && partyIdentifier == other.partyIdentifier && partyName == other.partyName && partyType == other.partyType && plaidProcessorToken == other.plaidProcessorToken && routingDetails == other.routingDetails && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountDetails, accountType, contactDetails, ledgerAccount, metadata, name, partyAddress, partyIdentifier, partyName, partyType, plaidProcessorToken, routingDetails, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Account{accountDetails=$accountDetails, accountType=$accountType, contactDetails=$contactDetails, ledgerAccount=$ledgerAccount, metadata=$metadata, name=$name, partyAddress=$partyAddress, partyIdentifier=$partyIdentifier, partyName=$partyName, partyType=$partyType, plaidProcessorToken=$plaidProcessorToken, routingDetails=$routingDetails, additionalProperties=$additionalProperties}"
    }

    /**
     * An optional type to auto-sync the counterparty to your ledger. Either `customer` or `vendor`.
     */
    @Deprecated("deprecated")
    class LedgerType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val CUSTOMER = of("customer")

            val VENDOR = of("vendor")

            fun of(value: String) = LedgerType(JsonField.of(value))
        }

        /** An enum containing [LedgerType]'s known values. */
        enum class Known {
            CUSTOMER,
            VENDOR,
        }

        /**
         * An enum containing [LedgerType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LedgerType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CUSTOMER,
            VENDOR,
            /**
             * An enum member indicating that [LedgerType] was instantiated with an unknown value.
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
                CUSTOMER -> Value.CUSTOMER
                VENDOR -> Value.VENDOR
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
                CUSTOMER -> Known.CUSTOMER
                VENDOR -> Known.VENDOR
                else -> throw ModernTreasuryInvalidDataException("Unknown LedgerType: $value")
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

        fun validate(): LedgerType = apply {
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

            return /* spotless:off */ other is LedgerType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class LegalEntityCreateRequest
    private constructor(
        private val legalEntityType: JsonField<LegalEntityType>,
        private val addresses: JsonField<List<LegalEntityAddressCreateRequest>>,
        private val bankSettings: JsonField<BankSettings>,
        private val businessName: JsonField<String>,
        private val citizenshipCountry: JsonField<String>,
        private val complianceDetails: JsonField<LegalEntityComplianceDetail>,
        private val dateFormed: JsonField<LocalDate>,
        private val dateOfBirth: JsonField<LocalDate>,
        private val doingBusinessAsNames: JsonField<List<String>>,
        private val email: JsonField<String>,
        private val firstName: JsonField<String>,
        private val identifications: JsonField<List<IdentificationCreateRequest>>,
        private val industryClassifications: JsonField<List<LegalEntityIndustryClassification>>,
        private val lastName: JsonField<String>,
        private val legalEntityAssociations:
            JsonField<List<LegalEntityAssociationInlineCreateRequest>>,
        private val legalStructure: JsonField<LegalStructure>,
        private val metadata: JsonField<Metadata>,
        private val middleName: JsonField<String>,
        private val phoneNumbers: JsonField<List<PhoneNumber>>,
        private val politicallyExposedPerson: JsonField<Boolean>,
        private val preferredName: JsonField<String>,
        private val prefix: JsonField<String>,
        private val riskRating: JsonField<RiskRating>,
        private val suffix: JsonField<String>,
        private val wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails>,
        private val website: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("legal_entity_type")
            @ExcludeMissing
            legalEntityType: JsonField<LegalEntityType> = JsonMissing.of(),
            @JsonProperty("addresses")
            @ExcludeMissing
            addresses: JsonField<List<LegalEntityAddressCreateRequest>> = JsonMissing.of(),
            @JsonProperty("bank_settings")
            @ExcludeMissing
            bankSettings: JsonField<BankSettings> = JsonMissing.of(),
            @JsonProperty("business_name")
            @ExcludeMissing
            businessName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("citizenship_country")
            @ExcludeMissing
            citizenshipCountry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("compliance_details")
            @ExcludeMissing
            complianceDetails: JsonField<LegalEntityComplianceDetail> = JsonMissing.of(),
            @JsonProperty("date_formed")
            @ExcludeMissing
            dateFormed: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("date_of_birth")
            @ExcludeMissing
            dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("doing_business_as_names")
            @ExcludeMissing
            doingBusinessAsNames: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("identifications")
            @ExcludeMissing
            identifications: JsonField<List<IdentificationCreateRequest>> = JsonMissing.of(),
            @JsonProperty("industry_classifications")
            @ExcludeMissing
            industryClassifications: JsonField<List<LegalEntityIndustryClassification>> =
                JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("legal_entity_associations")
            @ExcludeMissing
            legalEntityAssociations: JsonField<List<LegalEntityAssociationInlineCreateRequest>> =
                JsonMissing.of(),
            @JsonProperty("legal_structure")
            @ExcludeMissing
            legalStructure: JsonField<LegalStructure> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("middle_name")
            @ExcludeMissing
            middleName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_numbers")
            @ExcludeMissing
            phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of(),
            @JsonProperty("politically_exposed_person")
            @ExcludeMissing
            politicallyExposedPerson: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("preferred_name")
            @ExcludeMissing
            preferredName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prefix") @ExcludeMissing prefix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("risk_rating")
            @ExcludeMissing
            riskRating: JsonField<RiskRating> = JsonMissing.of(),
            @JsonProperty("suffix") @ExcludeMissing suffix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("wealth_and_employment_details")
            @ExcludeMissing
            wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails> = JsonMissing.of(),
            @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
        ) : this(
            legalEntityType,
            addresses,
            bankSettings,
            businessName,
            citizenshipCountry,
            complianceDetails,
            dateFormed,
            dateOfBirth,
            doingBusinessAsNames,
            email,
            firstName,
            identifications,
            industryClassifications,
            lastName,
            legalEntityAssociations,
            legalStructure,
            metadata,
            middleName,
            phoneNumbers,
            politicallyExposedPerson,
            preferredName,
            prefix,
            riskRating,
            suffix,
            wealthAndEmploymentDetails,
            website,
            mutableMapOf(),
        )

        /**
         * The type of legal entity.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun legalEntityType(): LegalEntityType = legalEntityType.getRequired("legal_entity_type")

        /**
         * A list of addresses for the entity.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun addresses(): List<LegalEntityAddressCreateRequest>? = addresses.getNullable("addresses")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun bankSettings(): BankSettings? = bankSettings.getNullable("bank_settings")

        /**
         * The business's legal business name.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun businessName(): String? = businessName.getNullable("business_name")

        /**
         * The country of citizenship for an individual.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun citizenshipCountry(): String? = citizenshipCountry.getNullable("citizenship_country")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun complianceDetails(): LegalEntityComplianceDetail? =
            complianceDetails.getNullable("compliance_details")

        /**
         * A business's formation date (YYYY-MM-DD).
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dateFormed(): LocalDate? = dateFormed.getNullable("date_formed")

        /**
         * An individual's date of birth (YYYY-MM-DD).
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dateOfBirth(): LocalDate? = dateOfBirth.getNullable("date_of_birth")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun doingBusinessAsNames(): List<String>? =
            doingBusinessAsNames.getNullable("doing_business_as_names")

        /**
         * The entity's primary email.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun email(): String? = email.getNullable("email")

        /**
         * An individual's first name.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun firstName(): String? = firstName.getNullable("first_name")

        /**
         * A list of identifications for the legal entity.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun identifications(): List<IdentificationCreateRequest>? =
            identifications.getNullable("identifications")

        /**
         * A list of industry classifications for the legal entity.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun industryClassifications(): List<LegalEntityIndustryClassification>? =
            industryClassifications.getNullable("industry_classifications")

        /**
         * An individual's last name.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lastName(): String? = lastName.getNullable("last_name")

        /**
         * The legal entity associations and its child legal entities.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun legalEntityAssociations(): List<LegalEntityAssociationInlineCreateRequest>? =
            legalEntityAssociations.getNullable("legal_entity_associations")

        /**
         * The business's legal structure.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun legalStructure(): LegalStructure? = legalStructure.getNullable("legal_structure")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * An individual's middle name.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun middleName(): String? = middleName.getNullable("middle_name")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers.getNullable("phone_numbers")

        /**
         * Whether the individual is a politically exposed person.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun politicallyExposedPerson(): Boolean? =
            politicallyExposedPerson.getNullable("politically_exposed_person")

        /**
         * An individual's preferred name.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun preferredName(): String? = preferredName.getNullable("preferred_name")

        /**
         * An individual's prefix.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun prefix(): String? = prefix.getNullable("prefix")

        /**
         * The risk rating of the legal entity. One of low, medium, high.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun riskRating(): RiskRating? = riskRating.getNullable("risk_rating")

        /**
         * An individual's suffix.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun suffix(): String? = suffix.getNullable("suffix")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun wealthAndEmploymentDetails(): WealthAndEmploymentDetails? =
            wealthAndEmploymentDetails.getNullable("wealth_and_employment_details")

        /**
         * The entity's primary website URL.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun website(): String? = website.getNullable("website")

        /**
         * Returns the raw JSON value of [legalEntityType].
         *
         * Unlike [legalEntityType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("legal_entity_type")
        @ExcludeMissing
        fun _legalEntityType(): JsonField<LegalEntityType> = legalEntityType

        /**
         * Returns the raw JSON value of [addresses].
         *
         * Unlike [addresses], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addresses")
        @ExcludeMissing
        fun _addresses(): JsonField<List<LegalEntityAddressCreateRequest>> = addresses

        /**
         * Returns the raw JSON value of [bankSettings].
         *
         * Unlike [bankSettings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bank_settings")
        @ExcludeMissing
        fun _bankSettings(): JsonField<BankSettings> = bankSettings

        /**
         * Returns the raw JSON value of [businessName].
         *
         * Unlike [businessName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("business_name")
        @ExcludeMissing
        fun _businessName(): JsonField<String> = businessName

        /**
         * Returns the raw JSON value of [citizenshipCountry].
         *
         * Unlike [citizenshipCountry], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("citizenship_country")
        @ExcludeMissing
        fun _citizenshipCountry(): JsonField<String> = citizenshipCountry

        /**
         * Returns the raw JSON value of [complianceDetails].
         *
         * Unlike [complianceDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("compliance_details")
        @ExcludeMissing
        fun _complianceDetails(): JsonField<LegalEntityComplianceDetail> = complianceDetails

        /**
         * Returns the raw JSON value of [dateFormed].
         *
         * Unlike [dateFormed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date_formed")
        @ExcludeMissing
        fun _dateFormed(): JsonField<LocalDate> = dateFormed

        /**
         * Returns the raw JSON value of [dateOfBirth].
         *
         * Unlike [dateOfBirth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date_of_birth")
        @ExcludeMissing
        fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

        /**
         * Returns the raw JSON value of [doingBusinessAsNames].
         *
         * Unlike [doingBusinessAsNames], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("doing_business_as_names")
        @ExcludeMissing
        fun _doingBusinessAsNames(): JsonField<List<String>> = doingBusinessAsNames

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [identifications].
         *
         * Unlike [identifications], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("identifications")
        @ExcludeMissing
        fun _identifications(): JsonField<List<IdentificationCreateRequest>> = identifications

        /**
         * Returns the raw JSON value of [industryClassifications].
         *
         * Unlike [industryClassifications], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("industry_classifications")
        @ExcludeMissing
        fun _industryClassifications(): JsonField<List<LegalEntityIndustryClassification>> =
            industryClassifications

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [legalEntityAssociations].
         *
         * Unlike [legalEntityAssociations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("legal_entity_associations")
        @ExcludeMissing
        fun _legalEntityAssociations(): JsonField<List<LegalEntityAssociationInlineCreateRequest>> =
            legalEntityAssociations

        /**
         * Returns the raw JSON value of [legalStructure].
         *
         * Unlike [legalStructure], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("legal_structure")
        @ExcludeMissing
        fun _legalStructure(): JsonField<LegalStructure> = legalStructure

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [middleName].
         *
         * Unlike [middleName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("middle_name")
        @ExcludeMissing
        fun _middleName(): JsonField<String> = middleName

        /**
         * Returns the raw JSON value of [phoneNumbers].
         *
         * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        fun _phoneNumbers(): JsonField<List<PhoneNumber>> = phoneNumbers

        /**
         * Returns the raw JSON value of [politicallyExposedPerson].
         *
         * Unlike [politicallyExposedPerson], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("politically_exposed_person")
        @ExcludeMissing
        fun _politicallyExposedPerson(): JsonField<Boolean> = politicallyExposedPerson

        /**
         * Returns the raw JSON value of [preferredName].
         *
         * Unlike [preferredName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("preferred_name")
        @ExcludeMissing
        fun _preferredName(): JsonField<String> = preferredName

        /**
         * Returns the raw JSON value of [prefix].
         *
         * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

        /**
         * Returns the raw JSON value of [riskRating].
         *
         * Unlike [riskRating], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("risk_rating")
        @ExcludeMissing
        fun _riskRating(): JsonField<RiskRating> = riskRating

        /**
         * Returns the raw JSON value of [suffix].
         *
         * Unlike [suffix], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("suffix") @ExcludeMissing fun _suffix(): JsonField<String> = suffix

        /**
         * Returns the raw JSON value of [wealthAndEmploymentDetails].
         *
         * Unlike [wealthAndEmploymentDetails], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("wealth_and_employment_details")
        @ExcludeMissing
        fun _wealthAndEmploymentDetails(): JsonField<WealthAndEmploymentDetails> =
            wealthAndEmploymentDetails

        /**
         * Returns the raw JSON value of [website].
         *
         * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

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
             * Returns a mutable builder for constructing an instance of [LegalEntityCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .legalEntityType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LegalEntityCreateRequest]. */
        class Builder internal constructor() {

            private var legalEntityType: JsonField<LegalEntityType>? = null
            private var addresses: JsonField<MutableList<LegalEntityAddressCreateRequest>>? = null
            private var bankSettings: JsonField<BankSettings> = JsonMissing.of()
            private var businessName: JsonField<String> = JsonMissing.of()
            private var citizenshipCountry: JsonField<String> = JsonMissing.of()
            private var complianceDetails: JsonField<LegalEntityComplianceDetail> = JsonMissing.of()
            private var dateFormed: JsonField<LocalDate> = JsonMissing.of()
            private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
            private var doingBusinessAsNames: JsonField<MutableList<String>>? = null
            private var email: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var identifications: JsonField<MutableList<IdentificationCreateRequest>>? = null
            private var industryClassifications:
                JsonField<MutableList<LegalEntityIndustryClassification>>? =
                null
            private var lastName: JsonField<String> = JsonMissing.of()
            private var legalEntityAssociations:
                JsonField<MutableList<LegalEntityAssociationInlineCreateRequest>>? =
                null
            private var legalStructure: JsonField<LegalStructure> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var middleName: JsonField<String> = JsonMissing.of()
            private var phoneNumbers: JsonField<MutableList<PhoneNumber>>? = null
            private var politicallyExposedPerson: JsonField<Boolean> = JsonMissing.of()
            private var preferredName: JsonField<String> = JsonMissing.of()
            private var prefix: JsonField<String> = JsonMissing.of()
            private var riskRating: JsonField<RiskRating> = JsonMissing.of()
            private var suffix: JsonField<String> = JsonMissing.of()
            private var wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails> =
                JsonMissing.of()
            private var website: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(legalEntityCreateRequest: LegalEntityCreateRequest) = apply {
                legalEntityType = legalEntityCreateRequest.legalEntityType
                addresses = legalEntityCreateRequest.addresses.map { it.toMutableList() }
                bankSettings = legalEntityCreateRequest.bankSettings
                businessName = legalEntityCreateRequest.businessName
                citizenshipCountry = legalEntityCreateRequest.citizenshipCountry
                complianceDetails = legalEntityCreateRequest.complianceDetails
                dateFormed = legalEntityCreateRequest.dateFormed
                dateOfBirth = legalEntityCreateRequest.dateOfBirth
                doingBusinessAsNames =
                    legalEntityCreateRequest.doingBusinessAsNames.map { it.toMutableList() }
                email = legalEntityCreateRequest.email
                firstName = legalEntityCreateRequest.firstName
                identifications =
                    legalEntityCreateRequest.identifications.map { it.toMutableList() }
                industryClassifications =
                    legalEntityCreateRequest.industryClassifications.map { it.toMutableList() }
                lastName = legalEntityCreateRequest.lastName
                legalEntityAssociations =
                    legalEntityCreateRequest.legalEntityAssociations.map { it.toMutableList() }
                legalStructure = legalEntityCreateRequest.legalStructure
                metadata = legalEntityCreateRequest.metadata
                middleName = legalEntityCreateRequest.middleName
                phoneNumbers = legalEntityCreateRequest.phoneNumbers.map { it.toMutableList() }
                politicallyExposedPerson = legalEntityCreateRequest.politicallyExposedPerson
                preferredName = legalEntityCreateRequest.preferredName
                prefix = legalEntityCreateRequest.prefix
                riskRating = legalEntityCreateRequest.riskRating
                suffix = legalEntityCreateRequest.suffix
                wealthAndEmploymentDetails = legalEntityCreateRequest.wealthAndEmploymentDetails
                website = legalEntityCreateRequest.website
                additionalProperties = legalEntityCreateRequest.additionalProperties.toMutableMap()
            }

            /** The type of legal entity. */
            fun legalEntityType(legalEntityType: LegalEntityType) =
                legalEntityType(JsonField.of(legalEntityType))

            /**
             * Sets [Builder.legalEntityType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalEntityType] with a well-typed [LegalEntityType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun legalEntityType(legalEntityType: JsonField<LegalEntityType>) = apply {
                this.legalEntityType = legalEntityType
            }

            /** A list of addresses for the entity. */
            fun addresses(addresses: List<LegalEntityAddressCreateRequest>) =
                addresses(JsonField.of(addresses))

            /**
             * Sets [Builder.addresses] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addresses] with a well-typed
             * `List<LegalEntityAddressCreateRequest>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun addresses(addresses: JsonField<List<LegalEntityAddressCreateRequest>>) = apply {
                this.addresses = addresses.map { it.toMutableList() }
            }

            /**
             * Adds a single [LegalEntityAddressCreateRequest] to [addresses].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
                addresses =
                    (addresses ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addresses", it).add(address)
                    }
            }

            fun bankSettings(bankSettings: BankSettings?) =
                bankSettings(JsonField.ofNullable(bankSettings))

            /**
             * Sets [Builder.bankSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bankSettings] with a well-typed [BankSettings] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bankSettings(bankSettings: JsonField<BankSettings>) = apply {
                this.bankSettings = bankSettings
            }

            /** The business's legal business name. */
            fun businessName(businessName: String?) =
                businessName(JsonField.ofNullable(businessName))

            /**
             * Sets [Builder.businessName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun businessName(businessName: JsonField<String>) = apply {
                this.businessName = businessName
            }

            /** The country of citizenship for an individual. */
            fun citizenshipCountry(citizenshipCountry: String?) =
                citizenshipCountry(JsonField.ofNullable(citizenshipCountry))

            /**
             * Sets [Builder.citizenshipCountry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.citizenshipCountry] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun citizenshipCountry(citizenshipCountry: JsonField<String>) = apply {
                this.citizenshipCountry = citizenshipCountry
            }

            fun complianceDetails(complianceDetails: LegalEntityComplianceDetail?) =
                complianceDetails(JsonField.ofNullable(complianceDetails))

            /**
             * Sets [Builder.complianceDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.complianceDetails] with a well-typed
             * [LegalEntityComplianceDetail] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun complianceDetails(complianceDetails: JsonField<LegalEntityComplianceDetail>) =
                apply {
                    this.complianceDetails = complianceDetails
                }

            /** A business's formation date (YYYY-MM-DD). */
            fun dateFormed(dateFormed: LocalDate?) = dateFormed(JsonField.ofNullable(dateFormed))

            /**
             * Sets [Builder.dateFormed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateFormed] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateFormed(dateFormed: JsonField<LocalDate>) = apply {
                this.dateFormed = dateFormed
            }

            /** An individual's date of birth (YYYY-MM-DD). */
            fun dateOfBirth(dateOfBirth: LocalDate?) =
                dateOfBirth(JsonField.ofNullable(dateOfBirth))

            /**
             * Sets [Builder.dateOfBirth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateOfBirth] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                this.dateOfBirth = dateOfBirth
            }

            fun doingBusinessAsNames(doingBusinessAsNames: List<String>) =
                doingBusinessAsNames(JsonField.of(doingBusinessAsNames))

            /**
             * Sets [Builder.doingBusinessAsNames] to an arbitrary JSON value.
             *
             * You should usually call [Builder.doingBusinessAsNames] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun doingBusinessAsNames(doingBusinessAsNames: JsonField<List<String>>) = apply {
                this.doingBusinessAsNames = doingBusinessAsNames.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [doingBusinessAsNames].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
                doingBusinessAsNames =
                    (doingBusinessAsNames ?: JsonField.of(mutableListOf())).also {
                        checkKnown("doingBusinessAsNames", it).add(doingBusinessAsName)
                    }
            }

            /** The entity's primary email. */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** An individual's first name. */
            fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** A list of identifications for the legal entity. */
            fun identifications(identifications: List<IdentificationCreateRequest>) =
                identifications(JsonField.of(identifications))

            /**
             * Sets [Builder.identifications] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identifications] with a well-typed
             * `List<IdentificationCreateRequest>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun identifications(identifications: JsonField<List<IdentificationCreateRequest>>) =
                apply {
                    this.identifications = identifications.map { it.toMutableList() }
                }

            /**
             * Adds a single [IdentificationCreateRequest] to [identifications].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIdentification(identification: IdentificationCreateRequest) = apply {
                identifications =
                    (identifications ?: JsonField.of(mutableListOf())).also {
                        checkKnown("identifications", it).add(identification)
                    }
            }

            /** A list of industry classifications for the legal entity. */
            fun industryClassifications(
                industryClassifications: List<LegalEntityIndustryClassification>
            ) = industryClassifications(JsonField.of(industryClassifications))

            /**
             * Sets [Builder.industryClassifications] to an arbitrary JSON value.
             *
             * You should usually call [Builder.industryClassifications] with a well-typed
             * `List<LegalEntityIndustryClassification>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun industryClassifications(
                industryClassifications: JsonField<List<LegalEntityIndustryClassification>>
            ) = apply {
                this.industryClassifications = industryClassifications.map { it.toMutableList() }
            }

            /**
             * Adds a single [LegalEntityIndustryClassification] to [industryClassifications].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIndustryClassification(
                industryClassification: LegalEntityIndustryClassification
            ) = apply {
                industryClassifications =
                    (industryClassifications ?: JsonField.of(mutableListOf())).also {
                        checkKnown("industryClassifications", it).add(industryClassification)
                    }
            }

            /** An individual's last name. */
            fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** The legal entity associations and its child legal entities. */
            fun legalEntityAssociations(
                legalEntityAssociations: List<LegalEntityAssociationInlineCreateRequest>?
            ) = legalEntityAssociations(JsonField.ofNullable(legalEntityAssociations))

            /**
             * Sets [Builder.legalEntityAssociations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalEntityAssociations] with a well-typed
             * `List<LegalEntityAssociationInlineCreateRequest>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun legalEntityAssociations(
                legalEntityAssociations: JsonField<List<LegalEntityAssociationInlineCreateRequest>>
            ) = apply {
                this.legalEntityAssociations = legalEntityAssociations.map { it.toMutableList() }
            }

            /**
             * Adds a single [LegalEntityAssociationInlineCreateRequest] to
             * [legalEntityAssociations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLegalEntityAssociation(
                legalEntityAssociation: LegalEntityAssociationInlineCreateRequest
            ) = apply {
                legalEntityAssociations =
                    (legalEntityAssociations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("legalEntityAssociations", it).add(legalEntityAssociation)
                    }
            }

            /** The business's legal structure. */
            fun legalStructure(legalStructure: LegalStructure?) =
                legalStructure(JsonField.ofNullable(legalStructure))

            /**
             * Sets [Builder.legalStructure] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalStructure] with a well-typed [LegalStructure]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun legalStructure(legalStructure: JsonField<LegalStructure>) = apply {
                this.legalStructure = legalStructure
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

            /** An individual's middle name. */
            fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

            /**
             * Sets [Builder.middleName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.middleName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

            fun phoneNumbers(phoneNumbers: List<PhoneNumber>) =
                phoneNumbers(JsonField.of(phoneNumbers))

            /**
             * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumbers] with a well-typed `List<PhoneNumber>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber>>) = apply {
                this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
            }

            /**
             * Adds a single [PhoneNumber] to [phoneNumbers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
                phoneNumbers =
                    (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("phoneNumbers", it).add(phoneNumber)
                    }
            }

            /** Whether the individual is a politically exposed person. */
            fun politicallyExposedPerson(politicallyExposedPerson: Boolean?) =
                politicallyExposedPerson(JsonField.ofNullable(politicallyExposedPerson))

            /**
             * Alias for [Builder.politicallyExposedPerson].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun politicallyExposedPerson(politicallyExposedPerson: Boolean) =
                politicallyExposedPerson(politicallyExposedPerson as Boolean?)

            /**
             * Sets [Builder.politicallyExposedPerson] to an arbitrary JSON value.
             *
             * You should usually call [Builder.politicallyExposedPerson] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun politicallyExposedPerson(politicallyExposedPerson: JsonField<Boolean>) = apply {
                this.politicallyExposedPerson = politicallyExposedPerson
            }

            /** An individual's preferred name. */
            fun preferredName(preferredName: String?) =
                preferredName(JsonField.ofNullable(preferredName))

            /**
             * Sets [Builder.preferredName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preferredName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preferredName(preferredName: JsonField<String>) = apply {
                this.preferredName = preferredName
            }

            /** An individual's prefix. */
            fun prefix(prefix: String?) = prefix(JsonField.ofNullable(prefix))

            /**
             * Sets [Builder.prefix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prefix] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

            /** The risk rating of the legal entity. One of low, medium, high. */
            fun riskRating(riskRating: RiskRating?) = riskRating(JsonField.ofNullable(riskRating))

            /**
             * Sets [Builder.riskRating] to an arbitrary JSON value.
             *
             * You should usually call [Builder.riskRating] with a well-typed [RiskRating] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun riskRating(riskRating: JsonField<RiskRating>) = apply {
                this.riskRating = riskRating
            }

            /** An individual's suffix. */
            fun suffix(suffix: String?) = suffix(JsonField.ofNullable(suffix))

            /**
             * Sets [Builder.suffix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suffix] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

            fun wealthAndEmploymentDetails(
                wealthAndEmploymentDetails: WealthAndEmploymentDetails?
            ) = wealthAndEmploymentDetails(JsonField.ofNullable(wealthAndEmploymentDetails))

            /**
             * Sets [Builder.wealthAndEmploymentDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wealthAndEmploymentDetails] with a well-typed
             * [WealthAndEmploymentDetails] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun wealthAndEmploymentDetails(
                wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails>
            ) = apply { this.wealthAndEmploymentDetails = wealthAndEmploymentDetails }

            /** The entity's primary website URL. */
            fun website(website: String?) = website(JsonField.ofNullable(website))

            /**
             * Sets [Builder.website] to an arbitrary JSON value.
             *
             * You should usually call [Builder.website] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun website(website: JsonField<String>) = apply { this.website = website }

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
             * Returns an immutable instance of [LegalEntityCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .legalEntityType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LegalEntityCreateRequest =
                LegalEntityCreateRequest(
                    checkRequired("legalEntityType", legalEntityType),
                    (addresses ?: JsonMissing.of()).map { it.toImmutable() },
                    bankSettings,
                    businessName,
                    citizenshipCountry,
                    complianceDetails,
                    dateFormed,
                    dateOfBirth,
                    (doingBusinessAsNames ?: JsonMissing.of()).map { it.toImmutable() },
                    email,
                    firstName,
                    (identifications ?: JsonMissing.of()).map { it.toImmutable() },
                    (industryClassifications ?: JsonMissing.of()).map { it.toImmutable() },
                    lastName,
                    (legalEntityAssociations ?: JsonMissing.of()).map { it.toImmutable() },
                    legalStructure,
                    metadata,
                    middleName,
                    (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                    politicallyExposedPerson,
                    preferredName,
                    prefix,
                    riskRating,
                    suffix,
                    wealthAndEmploymentDetails,
                    website,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LegalEntityCreateRequest = apply {
            if (validated) {
                return@apply
            }

            legalEntityType().validate()
            addresses()?.forEach { it.validate() }
            bankSettings()?.validate()
            businessName()
            citizenshipCountry()
            complianceDetails()?.validate()
            dateFormed()
            dateOfBirth()
            doingBusinessAsNames()
            email()
            firstName()
            identifications()?.forEach { it.validate() }
            industryClassifications()?.forEach { it.validate() }
            lastName()
            legalEntityAssociations()?.forEach { it.validate() }
            legalStructure()?.validate()
            metadata()?.validate()
            middleName()
            phoneNumbers()?.forEach { it.validate() }
            politicallyExposedPerson()
            preferredName()
            prefix()
            riskRating()?.validate()
            suffix()
            wealthAndEmploymentDetails()?.validate()
            website()
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
            (legalEntityType.asKnown()?.validity() ?: 0) +
                (addresses.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (bankSettings.asKnown()?.validity() ?: 0) +
                (if (businessName.asKnown() == null) 0 else 1) +
                (if (citizenshipCountry.asKnown() == null) 0 else 1) +
                (complianceDetails.asKnown()?.validity() ?: 0) +
                (if (dateFormed.asKnown() == null) 0 else 1) +
                (if (dateOfBirth.asKnown() == null) 0 else 1) +
                (doingBusinessAsNames.asKnown()?.size ?: 0) +
                (if (email.asKnown() == null) 0 else 1) +
                (if (firstName.asKnown() == null) 0 else 1) +
                (identifications.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (industryClassifications.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (lastName.asKnown() == null) 0 else 1) +
                (legalEntityAssociations.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (legalStructure.asKnown()?.validity() ?: 0) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (middleName.asKnown() == null) 0 else 1) +
                (phoneNumbers.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (politicallyExposedPerson.asKnown() == null) 0 else 1) +
                (if (preferredName.asKnown() == null) 0 else 1) +
                (if (prefix.asKnown() == null) 0 else 1) +
                (riskRating.asKnown()?.validity() ?: 0) +
                (if (suffix.asKnown() == null) 0 else 1) +
                (wealthAndEmploymentDetails.asKnown()?.validity() ?: 0) +
                (if (website.asKnown() == null) 0 else 1)

        /** The type of legal entity. */
        class LegalEntityType
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

                val BUSINESS = of("business")

                val INDIVIDUAL = of("individual")

                fun of(value: String) = LegalEntityType(JsonField.of(value))
            }

            /** An enum containing [LegalEntityType]'s known values. */
            enum class Known {
                BUSINESS,
                INDIVIDUAL,
            }

            /**
             * An enum containing [LegalEntityType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [LegalEntityType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BUSINESS,
                INDIVIDUAL,
                /**
                 * An enum member indicating that [LegalEntityType] was instantiated with an unknown
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
                    BUSINESS -> Value.BUSINESS
                    INDIVIDUAL -> Value.INDIVIDUAL
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
                    BUSINESS -> Known.BUSINESS
                    INDIVIDUAL -> Known.INDIVIDUAL
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown LegalEntityType: $value")
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

            fun validate(): LegalEntityType = apply {
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

                return /* spotless:off */ other is LegalEntityType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class LegalEntityAssociationInlineCreateRequest
        private constructor(
            private val relationshipTypes: JsonField<List<RelationshipType>>,
            private val childLegalEntity: JsonField<ChildLegalEntityCreate>,
            private val childLegalEntityId: JsonField<String>,
            private val ownershipPercentage: JsonField<Long>,
            private val title: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("relationship_types")
                @ExcludeMissing
                relationshipTypes: JsonField<List<RelationshipType>> = JsonMissing.of(),
                @JsonProperty("child_legal_entity")
                @ExcludeMissing
                childLegalEntity: JsonField<ChildLegalEntityCreate> = JsonMissing.of(),
                @JsonProperty("child_legal_entity_id")
                @ExcludeMissing
                childLegalEntityId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ownership_percentage")
                @ExcludeMissing
                ownershipPercentage: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            ) : this(
                relationshipTypes,
                childLegalEntity,
                childLegalEntityId,
                ownershipPercentage,
                title,
                mutableMapOf(),
            )

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun relationshipTypes(): List<RelationshipType> =
                relationshipTypes.getRequired("relationship_types")

            /**
             * The child legal entity.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun childLegalEntity(): ChildLegalEntityCreate? =
                childLegalEntity.getNullable("child_legal_entity")

            /**
             * The ID of the child legal entity.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun childLegalEntityId(): String? =
                childLegalEntityId.getNullable("child_legal_entity_id")

            /**
             * The child entity's ownership percentage iff they are a beneficial owner.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ownershipPercentage(): Long? =
                ownershipPercentage.getNullable("ownership_percentage")

            /**
             * The job title of the child entity at the parent entity.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun title(): String? = title.getNullable("title")

            /**
             * Returns the raw JSON value of [relationshipTypes].
             *
             * Unlike [relationshipTypes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("relationship_types")
            @ExcludeMissing
            fun _relationshipTypes(): JsonField<List<RelationshipType>> = relationshipTypes

            /**
             * Returns the raw JSON value of [childLegalEntity].
             *
             * Unlike [childLegalEntity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("child_legal_entity")
            @ExcludeMissing
            fun _childLegalEntity(): JsonField<ChildLegalEntityCreate> = childLegalEntity

            /**
             * Returns the raw JSON value of [childLegalEntityId].
             *
             * Unlike [childLegalEntityId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("child_legal_entity_id")
            @ExcludeMissing
            fun _childLegalEntityId(): JsonField<String> = childLegalEntityId

            /**
             * Returns the raw JSON value of [ownershipPercentage].
             *
             * Unlike [ownershipPercentage], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ownership_percentage")
            @ExcludeMissing
            fun _ownershipPercentage(): JsonField<Long> = ownershipPercentage

            /**
             * Returns the raw JSON value of [title].
             *
             * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
                 * [LegalEntityAssociationInlineCreateRequest].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .relationshipTypes()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [LegalEntityAssociationInlineCreateRequest]. */
            class Builder internal constructor() {

                private var relationshipTypes: JsonField<MutableList<RelationshipType>>? = null
                private var childLegalEntity: JsonField<ChildLegalEntityCreate> = JsonMissing.of()
                private var childLegalEntityId: JsonField<String> = JsonMissing.of()
                private var ownershipPercentage: JsonField<Long> = JsonMissing.of()
                private var title: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    legalEntityAssociationInlineCreateRequest:
                        LegalEntityAssociationInlineCreateRequest
                ) = apply {
                    relationshipTypes =
                        legalEntityAssociationInlineCreateRequest.relationshipTypes.map {
                            it.toMutableList()
                        }
                    childLegalEntity = legalEntityAssociationInlineCreateRequest.childLegalEntity
                    childLegalEntityId =
                        legalEntityAssociationInlineCreateRequest.childLegalEntityId
                    ownershipPercentage =
                        legalEntityAssociationInlineCreateRequest.ownershipPercentage
                    title = legalEntityAssociationInlineCreateRequest.title
                    additionalProperties =
                        legalEntityAssociationInlineCreateRequest.additionalProperties
                            .toMutableMap()
                }

                fun relationshipTypes(relationshipTypes: List<RelationshipType>) =
                    relationshipTypes(JsonField.of(relationshipTypes))

                /**
                 * Sets [Builder.relationshipTypes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.relationshipTypes] with a well-typed
                 * `List<RelationshipType>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun relationshipTypes(relationshipTypes: JsonField<List<RelationshipType>>) =
                    apply {
                        this.relationshipTypes = relationshipTypes.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [RelationshipType] to [relationshipTypes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRelationshipType(relationshipType: RelationshipType) = apply {
                    relationshipTypes =
                        (relationshipTypes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("relationshipTypes", it).add(relationshipType)
                        }
                }

                /** The child legal entity. */
                fun childLegalEntity(childLegalEntity: ChildLegalEntityCreate) =
                    childLegalEntity(JsonField.of(childLegalEntity))

                /**
                 * Sets [Builder.childLegalEntity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.childLegalEntity] with a well-typed
                 * [ChildLegalEntityCreate] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun childLegalEntity(childLegalEntity: JsonField<ChildLegalEntityCreate>) = apply {
                    this.childLegalEntity = childLegalEntity
                }

                /** The ID of the child legal entity. */
                fun childLegalEntityId(childLegalEntityId: String) =
                    childLegalEntityId(JsonField.of(childLegalEntityId))

                /**
                 * Sets [Builder.childLegalEntityId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.childLegalEntityId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun childLegalEntityId(childLegalEntityId: JsonField<String>) = apply {
                    this.childLegalEntityId = childLegalEntityId
                }

                /** The child entity's ownership percentage iff they are a beneficial owner. */
                fun ownershipPercentage(ownershipPercentage: Long?) =
                    ownershipPercentage(JsonField.ofNullable(ownershipPercentage))

                /**
                 * Alias for [Builder.ownershipPercentage].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun ownershipPercentage(ownershipPercentage: Long) =
                    ownershipPercentage(ownershipPercentage as Long?)

                /**
                 * Sets [Builder.ownershipPercentage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ownershipPercentage] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun ownershipPercentage(ownershipPercentage: JsonField<Long>) = apply {
                    this.ownershipPercentage = ownershipPercentage
                }

                /** The job title of the child entity at the parent entity. */
                fun title(title: String?) = title(JsonField.ofNullable(title))

                /**
                 * Sets [Builder.title] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.title] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun title(title: JsonField<String>) = apply { this.title = title }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [LegalEntityAssociationInlineCreateRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .relationshipTypes()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): LegalEntityAssociationInlineCreateRequest =
                    LegalEntityAssociationInlineCreateRequest(
                        checkRequired("relationshipTypes", relationshipTypes).map {
                            it.toImmutable()
                        },
                        childLegalEntity,
                        childLegalEntityId,
                        ownershipPercentage,
                        title,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): LegalEntityAssociationInlineCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                relationshipTypes().forEach { it.validate() }
                childLegalEntity()?.validate()
                childLegalEntityId()
                ownershipPercentage()
                title()
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
                (relationshipTypes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (childLegalEntity.asKnown()?.validity() ?: 0) +
                    (if (childLegalEntityId.asKnown() == null) 0 else 1) +
                    (if (ownershipPercentage.asKnown() == null) 0 else 1) +
                    (if (title.asKnown() == null) 0 else 1)

            /** A list of relationship types for how the child entity relates to parent entity. */
            class RelationshipType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val BENEFICIAL_OWNER = of("beneficial_owner")

                    val CONTROL_PERSON = of("control_person")

                    fun of(value: String) = RelationshipType(JsonField.of(value))
                }

                /** An enum containing [RelationshipType]'s known values. */
                enum class Known {
                    BENEFICIAL_OWNER,
                    CONTROL_PERSON,
                }

                /**
                 * An enum containing [RelationshipType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [RelationshipType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BENEFICIAL_OWNER,
                    CONTROL_PERSON,
                    /**
                     * An enum member indicating that [RelationshipType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        BENEFICIAL_OWNER -> Value.BENEFICIAL_OWNER
                        CONTROL_PERSON -> Value.CONTROL_PERSON
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        BENEFICIAL_OWNER -> Known.BENEFICIAL_OWNER
                        CONTROL_PERSON -> Known.CONTROL_PERSON
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown RelationshipType: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): RelationshipType = apply {
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

                    return /* spotless:off */ other is RelationshipType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LegalEntityAssociationInlineCreateRequest && relationshipTypes == other.relationshipTypes && childLegalEntity == other.childLegalEntity && childLegalEntityId == other.childLegalEntityId && ownershipPercentage == other.ownershipPercentage && title == other.title && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(relationshipTypes, childLegalEntity, childLegalEntityId, ownershipPercentage, title, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LegalEntityAssociationInlineCreateRequest{relationshipTypes=$relationshipTypes, childLegalEntity=$childLegalEntity, childLegalEntityId=$childLegalEntityId, ownershipPercentage=$ownershipPercentage, title=$title, additionalProperties=$additionalProperties}"
        }

        /** The business's legal structure. */
        class LegalStructure
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

                val CORPORATION = of("corporation")

                val LLC = of("llc")

                val NON_PROFIT = of("non_profit")

                val PARTNERSHIP = of("partnership")

                val SOLE_PROPRIETORSHIP = of("sole_proprietorship")

                val TRUST = of("trust")

                fun of(value: String) = LegalStructure(JsonField.of(value))
            }

            /** An enum containing [LegalStructure]'s known values. */
            enum class Known {
                CORPORATION,
                LLC,
                NON_PROFIT,
                PARTNERSHIP,
                SOLE_PROPRIETORSHIP,
                TRUST,
            }

            /**
             * An enum containing [LegalStructure]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [LegalStructure] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CORPORATION,
                LLC,
                NON_PROFIT,
                PARTNERSHIP,
                SOLE_PROPRIETORSHIP,
                TRUST,
                /**
                 * An enum member indicating that [LegalStructure] was instantiated with an unknown
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
                    CORPORATION -> Value.CORPORATION
                    LLC -> Value.LLC
                    NON_PROFIT -> Value.NON_PROFIT
                    PARTNERSHIP -> Value.PARTNERSHIP
                    SOLE_PROPRIETORSHIP -> Value.SOLE_PROPRIETORSHIP
                    TRUST -> Value.TRUST
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
                    CORPORATION -> Known.CORPORATION
                    LLC -> Known.LLC
                    NON_PROFIT -> Known.NON_PROFIT
                    PARTNERSHIP -> Known.PARTNERSHIP
                    SOLE_PROPRIETORSHIP -> Known.SOLE_PROPRIETORSHIP
                    TRUST -> Known.TRUST
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown LegalStructure: $value")
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

            fun validate(): LegalStructure = apply {
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

                return /* spotless:off */ other is LegalStructure && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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

        /** A list of phone numbers in E.164 format. */
        class PhoneNumber
        private constructor(
            private val phoneNumber: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("phone_number")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of()
            ) : this(phoneNumber, mutableMapOf())

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

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

                /** Returns a mutable builder for constructing an instance of [PhoneNumber]. */
                fun builder() = Builder()
            }

            /** A builder for [PhoneNumber]. */
            class Builder internal constructor() {

                private var phoneNumber: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(phoneNumber: PhoneNumber) = apply {
                    this.phoneNumber = phoneNumber.phoneNumber
                    additionalProperties = phoneNumber.additionalProperties.toMutableMap()
                }

                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PhoneNumber].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PhoneNumber =
                    PhoneNumber(phoneNumber, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): PhoneNumber = apply {
                if (validated) {
                    return@apply
                }

                phoneNumber()
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
            internal fun validity(): Int = (if (phoneNumber.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PhoneNumber && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(phoneNumber, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PhoneNumber{phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
        }

        /** The risk rating of the legal entity. One of low, medium, high. */
        class RiskRating @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val LOW = of("low")

                val MEDIUM = of("medium")

                val HIGH = of("high")

                fun of(value: String) = RiskRating(JsonField.of(value))
            }

            /** An enum containing [RiskRating]'s known values. */
            enum class Known {
                LOW,
                MEDIUM,
                HIGH,
            }

            /**
             * An enum containing [RiskRating]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RiskRating] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LOW,
                MEDIUM,
                HIGH,
                /**
                 * An enum member indicating that [RiskRating] was instantiated with an unknown
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
                    LOW -> Value.LOW
                    MEDIUM -> Value.MEDIUM
                    HIGH -> Value.HIGH
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
                    LOW -> Known.LOW
                    MEDIUM -> Known.MEDIUM
                    HIGH -> Known.HIGH
                    else -> throw ModernTreasuryInvalidDataException("Unknown RiskRating: $value")
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

            fun validate(): RiskRating = apply {
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

                return /* spotless:off */ other is RiskRating && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LegalEntityCreateRequest && legalEntityType == other.legalEntityType && addresses == other.addresses && bankSettings == other.bankSettings && businessName == other.businessName && citizenshipCountry == other.citizenshipCountry && complianceDetails == other.complianceDetails && dateFormed == other.dateFormed && dateOfBirth == other.dateOfBirth && doingBusinessAsNames == other.doingBusinessAsNames && email == other.email && firstName == other.firstName && identifications == other.identifications && industryClassifications == other.industryClassifications && lastName == other.lastName && legalEntityAssociations == other.legalEntityAssociations && legalStructure == other.legalStructure && metadata == other.metadata && middleName == other.middleName && phoneNumbers == other.phoneNumbers && politicallyExposedPerson == other.politicallyExposedPerson && preferredName == other.preferredName && prefix == other.prefix && riskRating == other.riskRating && suffix == other.suffix && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && website == other.website && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(legalEntityType, addresses, bankSettings, businessName, citizenshipCountry, complianceDetails, dateFormed, dateOfBirth, doingBusinessAsNames, email, firstName, identifications, industryClassifications, lastName, legalEntityAssociations, legalStructure, metadata, middleName, phoneNumbers, politicallyExposedPerson, preferredName, prefix, riskRating, suffix, wealthAndEmploymentDetails, website, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntityCreateRequest{legalEntityType=$legalEntityType, addresses=$addresses, bankSettings=$bankSettings, businessName=$businessName, citizenshipCountry=$citizenshipCountry, complianceDetails=$complianceDetails, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, industryClassifications=$industryClassifications, lastName=$lastName, legalEntityAssociations=$legalEntityAssociations, legalStructure=$legalStructure, metadata=$metadata, middleName=$middleName, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, riskRating=$riskRating, suffix=$suffix, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, additionalProperties=$additionalProperties}"
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

    /** The verification status of the counterparty. */
    class VerificationStatus
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val DENIED = of("denied")

            val NEEDS_APPROVAL = of("needs_approval")

            val UNVERIFIED = of("unverified")

            val VERIFIED = of("verified")

            fun of(value: String) = VerificationStatus(JsonField.of(value))
        }

        /** An enum containing [VerificationStatus]'s known values. */
        enum class Known {
            DENIED,
            NEEDS_APPROVAL,
            UNVERIFIED,
            VERIFIED,
        }

        /**
         * An enum containing [VerificationStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VerificationStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DENIED,
            NEEDS_APPROVAL,
            UNVERIFIED,
            VERIFIED,
            /**
             * An enum member indicating that [VerificationStatus] was instantiated with an unknown
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
                DENIED -> Value.DENIED
                NEEDS_APPROVAL -> Value.NEEDS_APPROVAL
                UNVERIFIED -> Value.UNVERIFIED
                VERIFIED -> Value.VERIFIED
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
                DENIED -> Known.DENIED
                NEEDS_APPROVAL -> Known.NEEDS_APPROVAL
                UNVERIFIED -> Known.UNVERIFIED
                VERIFIED -> Known.VERIFIED
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown VerificationStatus: $value")
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

        fun validate(): VerificationStatus = apply {
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

            return /* spotless:off */ other is VerificationStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterpartyCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CounterpartyCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
