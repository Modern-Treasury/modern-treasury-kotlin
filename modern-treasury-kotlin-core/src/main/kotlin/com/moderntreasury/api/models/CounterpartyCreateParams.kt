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
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects

/** Create a new counterparty. */
class CounterpartyCreateParams
private constructor(
    private val body: CounterpartyCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A human friendly name for this counterparty. */
    fun name(): String? = body.name()

    fun accounting(): Accounting? = body.accounting()

    /** The accounts for this counterparty. */
    fun accounts(): List<Account>? = body.accounts()

    /** The counterparty's email. */
    fun email(): String? = body.email()

    /**
     * An optional type to auto-sync the counterparty to your ledger. Either `customer` or `vendor`.
     */
    @Deprecated("deprecated") fun ledgerType(): LedgerType? = body.ledgerType()

    fun legalEntity(): LegalEntityCreateRequest? = body.legalEntity()

    /** The id of the legal entity. */
    fun legalEntityId(): String? = body.legalEntityId()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata? = body.metadata()

    /**
     * Send an email to the counterparty whenever an associated payment order is sent to the bank.
     */
    fun sendRemittanceAdvice(): Boolean? = body.sendRemittanceAdvice()

    /** Either a valid SSN or EIN. */
    fun taxpayerIdentifier(): String? = body.taxpayerIdentifier()

    /** The verification status of the counterparty. */
    fun verificationStatus(): VerificationStatus? = body.verificationStatus()

    /** A human friendly name for this counterparty. */
    fun _name(): JsonField<String> = body._name()

    fun _accounting(): JsonField<Accounting> = body._accounting()

    /** The accounts for this counterparty. */
    fun _accounts(): JsonField<List<Account>> = body._accounts()

    /** The counterparty's email. */
    fun _email(): JsonField<String> = body._email()

    /**
     * An optional type to auto-sync the counterparty to your ledger. Either `customer` or `vendor`.
     */
    @Deprecated("deprecated") fun _ledgerType(): JsonField<LedgerType> = body._ledgerType()

    fun _legalEntity(): JsonField<LegalEntityCreateRequest> = body._legalEntity()

    /** The id of the legal entity. */
    fun _legalEntityId(): JsonField<String> = body._legalEntityId()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Send an email to the counterparty whenever an associated payment order is sent to the bank.
     */
    fun _sendRemittanceAdvice(): JsonField<Boolean> = body._sendRemittanceAdvice()

    /** Either a valid SSN or EIN. */
    fun _taxpayerIdentifier(): JsonField<String> = body._taxpayerIdentifier()

    /** The verification status of the counterparty. */
    fun _verificationStatus(): JsonField<VerificationStatus> = body._verificationStatus()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): CounterpartyCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CounterpartyCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accounting")
        @ExcludeMissing
        private val accounting: JsonField<Accounting> = JsonMissing.of(),
        @JsonProperty("accounts")
        @ExcludeMissing
        private val accounts: JsonField<List<Account>> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_type")
        @ExcludeMissing
        private val ledgerType: JsonField<LedgerType> = JsonMissing.of(),
        @JsonProperty("legal_entity")
        @ExcludeMissing
        private val legalEntity: JsonField<LegalEntityCreateRequest> = JsonMissing.of(),
        @JsonProperty("legal_entity_id")
        @ExcludeMissing
        private val legalEntityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("send_remittance_advice")
        @ExcludeMissing
        private val sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("taxpayer_identifier")
        @ExcludeMissing
        private val taxpayerIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verification_status")
        @ExcludeMissing
        private val verificationStatus: JsonField<VerificationStatus> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A human friendly name for this counterparty. */
        fun name(): String? = name.getNullable("name")

        fun accounting(): Accounting? = accounting.getNullable("accounting")

        /** The accounts for this counterparty. */
        fun accounts(): List<Account>? = accounts.getNullable("accounts")

        /** The counterparty's email. */
        fun email(): String? = email.getNullable("email")

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         */
        @Deprecated("deprecated")
        fun ledgerType(): LedgerType? = ledgerType.getNullable("ledger_type")

        fun legalEntity(): LegalEntityCreateRequest? = legalEntity.getNullable("legal_entity")

        /** The id of the legal entity. */
        fun legalEntityId(): String? = legalEntityId.getNullable("legal_entity_id")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * Send an email to the counterparty whenever an associated payment order is sent to the
         * bank.
         */
        fun sendRemittanceAdvice(): Boolean? =
            sendRemittanceAdvice.getNullable("send_remittance_advice")

        /** Either a valid SSN or EIN. */
        fun taxpayerIdentifier(): String? = taxpayerIdentifier.getNullable("taxpayer_identifier")

        /** The verification status of the counterparty. */
        fun verificationStatus(): VerificationStatus? =
            verificationStatus.getNullable("verification_status")

        /** A human friendly name for this counterparty. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("accounting")
        @ExcludeMissing
        fun _accounting(): JsonField<Accounting> = accounting

        /** The accounts for this counterparty. */
        @JsonProperty("accounts")
        @ExcludeMissing
        fun _accounts(): JsonField<List<Account>> = accounts

        /** The counterparty's email. */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         */
        @Deprecated("deprecated")
        @JsonProperty("ledger_type")
        @ExcludeMissing
        fun _ledgerType(): JsonField<LedgerType> = ledgerType

        @JsonProperty("legal_entity")
        @ExcludeMissing
        fun _legalEntity(): JsonField<LegalEntityCreateRequest> = legalEntity

        /** The id of the legal entity. */
        @JsonProperty("legal_entity_id")
        @ExcludeMissing
        fun _legalEntityId(): JsonField<String> = legalEntityId

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Send an email to the counterparty whenever an associated payment order is sent to the
         * bank.
         */
        @JsonProperty("send_remittance_advice")
        @ExcludeMissing
        fun _sendRemittanceAdvice(): JsonField<Boolean> = sendRemittanceAdvice

        /** Either a valid SSN or EIN. */
        @JsonProperty("taxpayer_identifier")
        @ExcludeMissing
        fun _taxpayerIdentifier(): JsonField<String> = taxpayerIdentifier

        /** The verification status of the counterparty. */
        @JsonProperty("verification_status")
        @ExcludeMissing
        fun _verificationStatus(): JsonField<VerificationStatus> = verificationStatus

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CounterpartyCreateRequest = apply {
            if (validated) {
                return@apply
            }

            name()
            accounting()?.validate()
            accounts()?.forEach { it.validate() }
            email()
            ledgerType()
            legalEntity()?.validate()
            legalEntityId()
            metadata()?.validate()
            sendRemittanceAdvice()
            taxpayerIdentifier()
            verificationStatus()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** A human friendly name for this counterparty. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun accounting(accounting: Accounting) = accounting(JsonField.of(accounting))

            fun accounting(accounting: JsonField<Accounting>) = apply {
                this.accounting = accounting
            }

            /** The accounts for this counterparty. */
            fun accounts(accounts: List<Account>) = accounts(JsonField.of(accounts))

            /** The accounts for this counterparty. */
            fun accounts(accounts: JsonField<List<Account>>) = apply {
                this.accounts = accounts.map { it.toMutableList() }
            }

            /** The accounts for this counterparty. */
            fun addAccount(account: Account) = apply {
                accounts =
                    (accounts ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(account)
                    }
            }

            /** The counterparty's email. */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /** The counterparty's email. */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /**
             * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
             * `vendor`.
             */
            @Deprecated("deprecated")
            fun ledgerType(ledgerType: LedgerType) = ledgerType(JsonField.of(ledgerType))

            /**
             * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
             * `vendor`.
             */
            @Deprecated("deprecated")
            fun ledgerType(ledgerType: JsonField<LedgerType>) = apply {
                this.ledgerType = ledgerType
            }

            fun legalEntity(legalEntity: LegalEntityCreateRequest) =
                legalEntity(JsonField.of(legalEntity))

            fun legalEntity(legalEntity: JsonField<LegalEntityCreateRequest>) = apply {
                this.legalEntity = legalEntity
            }

            /** The id of the legal entity. */
            fun legalEntityId(legalEntityId: String?) =
                legalEntityId(JsonField.ofNullable(legalEntityId))

            /** The id of the legal entity. */
            fun legalEntityId(legalEntityId: JsonField<String>) = apply {
                this.legalEntityId = legalEntityId
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * Send an email to the counterparty whenever an associated payment order is sent to the
             * bank.
             */
            fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
                sendRemittanceAdvice(JsonField.of(sendRemittanceAdvice))

            /**
             * Send an email to the counterparty whenever an associated payment order is sent to the
             * bank.
             */
            fun sendRemittanceAdvice(sendRemittanceAdvice: JsonField<Boolean>) = apply {
                this.sendRemittanceAdvice = sendRemittanceAdvice
            }

            /** Either a valid SSN or EIN. */
            fun taxpayerIdentifier(taxpayerIdentifier: String) =
                taxpayerIdentifier(JsonField.of(taxpayerIdentifier))

            /** Either a valid SSN or EIN. */
            fun taxpayerIdentifier(taxpayerIdentifier: JsonField<String>) = apply {
                this.taxpayerIdentifier = taxpayerIdentifier
            }

            /** The verification status of the counterparty. */
            fun verificationStatus(verificationStatus: VerificationStatus) =
                verificationStatus(JsonField.of(verificationStatus))

            /** The verification status of the counterparty. */
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
                    additionalProperties.toImmutable(),
                )
        }

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

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [CounterpartyCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: CounterpartyCreateRequest.Builder = CounterpartyCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(counterpartyCreateParams: CounterpartyCreateParams) = apply {
            body = counterpartyCreateParams.body.toBuilder()
            additionalHeaders = counterpartyCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = counterpartyCreateParams.additionalQueryParams.toBuilder()
        }

        /** A human friendly name for this counterparty. */
        fun name(name: String?) = apply { body.name(name) }

        /** A human friendly name for this counterparty. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun accounting(accounting: Accounting) = apply { body.accounting(accounting) }

        fun accounting(accounting: JsonField<Accounting>) = apply { body.accounting(accounting) }

        /** The accounts for this counterparty. */
        fun accounts(accounts: List<Account>) = apply { body.accounts(accounts) }

        /** The accounts for this counterparty. */
        fun accounts(accounts: JsonField<List<Account>>) = apply { body.accounts(accounts) }

        /** The accounts for this counterparty. */
        fun addAccount(account: Account) = apply { body.addAccount(account) }

        /** The counterparty's email. */
        fun email(email: String?) = apply { body.email(email) }

        /** The counterparty's email. */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         */
        @Deprecated("deprecated")
        fun ledgerType(ledgerType: LedgerType) = apply { body.ledgerType(ledgerType) }

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         */
        @Deprecated("deprecated")
        fun ledgerType(ledgerType: JsonField<LedgerType>) = apply { body.ledgerType(ledgerType) }

        fun legalEntity(legalEntity: LegalEntityCreateRequest) = apply {
            body.legalEntity(legalEntity)
        }

        fun legalEntity(legalEntity: JsonField<LegalEntityCreateRequest>) = apply {
            body.legalEntity(legalEntity)
        }

        /** The id of the legal entity. */
        fun legalEntityId(legalEntityId: String?) = apply { body.legalEntityId(legalEntityId) }

        /** The id of the legal entity. */
        fun legalEntityId(legalEntityId: JsonField<String>) = apply {
            body.legalEntityId(legalEntityId)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
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
         * Send an email to the counterparty whenever an associated payment order is sent to the
         * bank.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: JsonField<Boolean>) = apply {
            body.sendRemittanceAdvice(sendRemittanceAdvice)
        }

        /** Either a valid SSN or EIN. */
        fun taxpayerIdentifier(taxpayerIdentifier: String) = apply {
            body.taxpayerIdentifier(taxpayerIdentifier)
        }

        /** Either a valid SSN or EIN. */
        fun taxpayerIdentifier(taxpayerIdentifier: JsonField<String>) = apply {
            body.taxpayerIdentifier(taxpayerIdentifier)
        }

        /** The verification status of the counterparty. */
        fun verificationStatus(verificationStatus: VerificationStatus) = apply {
            body.verificationStatus(verificationStatus)
        }

        /** The verification status of the counterparty. */
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

        fun build(): CounterpartyCreateParams =
            CounterpartyCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Accounting
    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         */
        fun type(): Type? = type.getNullable("type")

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Accounting = apply {
            if (validated) {
                return@apply
            }

            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
             * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
             * `vendor`.
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

            fun build(): Accounting = Accounting(type, additionalProperties.toImmutable())
        }

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

    @NoAutoDetect
    class Account
    @JsonCreator
    private constructor(
        @JsonProperty("account_details")
        @ExcludeMissing
        private val accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of(),
        @JsonProperty("account_type")
        @ExcludeMissing
        private val accountType: JsonField<ExternalAccountType> = JsonMissing.of(),
        @JsonProperty("contact_details")
        @ExcludeMissing
        private val contactDetails: JsonField<List<ContactDetailCreateRequest>> = JsonMissing.of(),
        @JsonProperty("ledger_account")
        @ExcludeMissing
        private val ledgerAccount: JsonField<LedgerAccountCreateRequest> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("party_address")
        @ExcludeMissing
        private val partyAddress: JsonField<AddressRequest> = JsonMissing.of(),
        @JsonProperty("party_identifier")
        @ExcludeMissing
        private val partyIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("party_name")
        @ExcludeMissing
        private val partyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("party_type")
        @ExcludeMissing
        private val partyType: JsonField<PartyType> = JsonMissing.of(),
        @JsonProperty("plaid_processor_token")
        @ExcludeMissing
        private val plaidProcessorToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routing_details")
        @ExcludeMissing
        private val routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun accountDetails(): List<AccountDetail>? = accountDetails.getNullable("account_details")

        /** Can be `checking`, `savings` or `other`. */
        fun accountType(): ExternalAccountType? = accountType.getNullable("account_type")

        fun contactDetails(): List<ContactDetailCreateRequest>? =
            contactDetails.getNullable("contact_details")

        /**
         * Specifies a ledger account object that will be created with the external account. The
         * resulting ledger account is linked to the external account for auto-ledgering Payment
         * objects. See
         * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for more
         * details.
         */
        fun ledgerAccount(): LedgerAccountCreateRequest? =
            ledgerAccount.getNullable("ledger_account")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        fun name(): String? = name.getNullable("name")

        /** Required if receiving wire payments. */
        fun partyAddress(): AddressRequest? = partyAddress.getNullable("party_address")

        fun partyIdentifier(): String? = partyIdentifier.getNullable("party_identifier")

        /** If this value isn't provided, it will be inherited from the counterparty's name. */
        fun partyName(): String? = partyName.getNullable("party_name")

        /** Either `individual` or `business`. */
        fun partyType(): PartyType? = partyType.getNullable("party_type")

        /**
         * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you can
         * pass the processor token in this field.
         */
        fun plaidProcessorToken(): String? =
            plaidProcessorToken.getNullable("plaid_processor_token")

        fun routingDetails(): List<RoutingDetail>? = routingDetails.getNullable("routing_details")

        @JsonProperty("account_details")
        @ExcludeMissing
        fun _accountDetails(): JsonField<List<AccountDetail>> = accountDetails

        /** Can be `checking`, `savings` or `other`. */
        @JsonProperty("account_type")
        @ExcludeMissing
        fun _accountType(): JsonField<ExternalAccountType> = accountType

        @JsonProperty("contact_details")
        @ExcludeMissing
        fun _contactDetails(): JsonField<List<ContactDetailCreateRequest>> = contactDetails

        /**
         * Specifies a ledger account object that will be created with the external account. The
         * resulting ledger account is linked to the external account for auto-ledgering Payment
         * objects. See
         * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for more
         * details.
         */
        @JsonProperty("ledger_account")
        @ExcludeMissing
        fun _ledgerAccount(): JsonField<LedgerAccountCreateRequest> = ledgerAccount

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** Required if receiving wire payments. */
        @JsonProperty("party_address")
        @ExcludeMissing
        fun _partyAddress(): JsonField<AddressRequest> = partyAddress

        @JsonProperty("party_identifier")
        @ExcludeMissing
        fun _partyIdentifier(): JsonField<String> = partyIdentifier

        /** If this value isn't provided, it will be inherited from the counterparty's name. */
        @JsonProperty("party_name") @ExcludeMissing fun _partyName(): JsonField<String> = partyName

        /** Either `individual` or `business`. */
        @JsonProperty("party_type")
        @ExcludeMissing
        fun _partyType(): JsonField<PartyType> = partyType

        /**
         * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you can
         * pass the processor token in this field.
         */
        @JsonProperty("plaid_processor_token")
        @ExcludeMissing
        fun _plaidProcessorToken(): JsonField<String> = plaidProcessorToken

        @JsonProperty("routing_details")
        @ExcludeMissing
        fun _routingDetails(): JsonField<List<RoutingDetail>> = routingDetails

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Account = apply {
            if (validated) {
                return@apply
            }

            accountDetails()?.forEach { it.validate() }
            accountType()
            contactDetails()?.forEach { it.validate() }
            ledgerAccount()?.validate()
            metadata()?.validate()
            name()
            partyAddress()?.validate()
            partyIdentifier()
            partyName()
            partyType()
            plaidProcessorToken()
            routingDetails()?.forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun accountDetails(accountDetails: JsonField<List<AccountDetail>>) = apply {
                this.accountDetails = accountDetails.map { it.toMutableList() }
            }

            fun addAccountDetail(accountDetail: AccountDetail) = apply {
                accountDetails =
                    (accountDetails ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(accountDetail)
                    }
            }

            /** Can be `checking`, `savings` or `other`. */
            fun accountType(accountType: ExternalAccountType) =
                accountType(JsonField.of(accountType))

            /** Can be `checking`, `savings` or `other`. */
            fun accountType(accountType: JsonField<ExternalAccountType>) = apply {
                this.accountType = accountType
            }

            fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) =
                contactDetails(JsonField.of(contactDetails))

            fun contactDetails(contactDetails: JsonField<List<ContactDetailCreateRequest>>) =
                apply {
                    this.contactDetails = contactDetails.map { it.toMutableList() }
                }

            fun addContactDetail(contactDetail: ContactDetailCreateRequest) = apply {
                contactDetails =
                    (contactDetails ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(contactDetail)
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
             * Specifies a ledger account object that will be created with the external account. The
             * resulting ledger account is linked to the external account for auto-ledgering Payment
             * objects. See
             * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
             * more details.
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
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Required if receiving wire payments. */
            fun partyAddress(partyAddress: AddressRequest) =
                partyAddress(JsonField.of(partyAddress))

            /** Required if receiving wire payments. */
            fun partyAddress(partyAddress: JsonField<AddressRequest>) = apply {
                this.partyAddress = partyAddress
            }

            fun partyIdentifier(partyIdentifier: String) =
                partyIdentifier(JsonField.of(partyIdentifier))

            fun partyIdentifier(partyIdentifier: JsonField<String>) = apply {
                this.partyIdentifier = partyIdentifier
            }

            /** If this value isn't provided, it will be inherited from the counterparty's name. */
            fun partyName(partyName: String) = partyName(JsonField.of(partyName))

            /** If this value isn't provided, it will be inherited from the counterparty's name. */
            fun partyName(partyName: JsonField<String>) = apply { this.partyName = partyName }

            /** Either `individual` or `business`. */
            fun partyType(partyType: PartyType?) = partyType(JsonField.ofNullable(partyType))

            /** Either `individual` or `business`. */
            fun partyType(partyType: JsonField<PartyType>) = apply { this.partyType = partyType }

            /**
             * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you
             * can pass the processor token in this field.
             */
            fun plaidProcessorToken(plaidProcessorToken: String) =
                plaidProcessorToken(JsonField.of(plaidProcessorToken))

            /**
             * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you
             * can pass the processor token in this field.
             */
            fun plaidProcessorToken(plaidProcessorToken: JsonField<String>) = apply {
                this.plaidProcessorToken = plaidProcessorToken
            }

            fun routingDetails(routingDetails: List<RoutingDetail>) =
                routingDetails(JsonField.of(routingDetails))

            fun routingDetails(routingDetails: JsonField<List<RoutingDetail>>) = apply {
                this.routingDetails = routingDetails.map { it.toMutableList() }
            }

            fun addRoutingDetail(routingDetail: RoutingDetail) = apply {
                routingDetails =
                    (routingDetails ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(routingDetail)
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
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class AccountDetail
        @JsonCreator
        private constructor(
            @JsonProperty("account_number")
            @ExcludeMissing
            private val accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_number_type")
            @ExcludeMissing
            private val accountNumberType: JsonField<AccountNumberType> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun accountNumber(): String = accountNumber.getRequired("account_number")

            fun accountNumberType(): AccountNumberType? =
                accountNumberType.getNullable("account_number_type")

            @JsonProperty("account_number")
            @ExcludeMissing
            fun _accountNumber(): JsonField<String> = accountNumber

            @JsonProperty("account_number_type")
            @ExcludeMissing
            fun _accountNumberType(): JsonField<AccountNumberType> = accountNumberType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AccountDetail = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountNumberType()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                fun accountNumberType(accountNumberType: AccountNumberType) =
                    accountNumberType(JsonField.of(accountNumberType))

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

                fun build(): AccountDetail =
                    AccountDetail(
                        checkRequired("accountNumber", accountNumber),
                        accountNumberType,
                        additionalProperties.toImmutable(),
                    )
            }

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

                    val CLABE = of("clabe")

                    val HK_NUMBER = of("hk_number")

                    val IBAN = of("iban")

                    val ID_NUMBER = of("id_number")

                    val NZ_NUMBER = of("nz_number")

                    val OTHER = of("other")

                    val PAN = of("pan")

                    val SG_NUMBER = of("sg_number")

                    val WALLET_ADDRESS = of("wallet_address")

                    fun of(value: String) = AccountNumberType(JsonField.of(value))
                }

                /** An enum containing [AccountNumberType]'s known values. */
                enum class Known {
                    AU_NUMBER,
                    CLABE,
                    HK_NUMBER,
                    IBAN,
                    ID_NUMBER,
                    NZ_NUMBER,
                    OTHER,
                    PAN,
                    SG_NUMBER,
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
                    CLABE,
                    HK_NUMBER,
                    IBAN,
                    ID_NUMBER,
                    NZ_NUMBER,
                    OTHER,
                    PAN,
                    SG_NUMBER,
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
                        CLABE -> Value.CLABE
                        HK_NUMBER -> Value.HK_NUMBER
                        IBAN -> Value.IBAN
                        ID_NUMBER -> Value.ID_NUMBER
                        NZ_NUMBER -> Value.NZ_NUMBER
                        OTHER -> Value.OTHER
                        PAN -> Value.PAN
                        SG_NUMBER -> Value.SG_NUMBER
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
                        CLABE -> Known.CLABE
                        HK_NUMBER -> Known.HK_NUMBER
                        IBAN -> Known.IBAN
                        ID_NUMBER -> Known.ID_NUMBER
                        NZ_NUMBER -> Known.NZ_NUMBER
                        OTHER -> Known.OTHER
                        PAN -> Known.PAN
                        SG_NUMBER -> Known.SG_NUMBER
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

        @NoAutoDetect
        class ContactDetailCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("contact_identifier")
            @ExcludeMissing
            private val contactIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contact_identifier_type")
            @ExcludeMissing
            private val contactIdentifierType: JsonField<ContactIdentifierType> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun contactIdentifier(): String? = contactIdentifier.getNullable("contact_identifier")

            fun contactIdentifierType(): ContactIdentifierType? =
                contactIdentifierType.getNullable("contact_identifier_type")

            @JsonProperty("contact_identifier")
            @ExcludeMissing
            fun _contactIdentifier(): JsonField<String> = contactIdentifier

            @JsonProperty("contact_identifier_type")
            @ExcludeMissing
            fun _contactIdentifierType(): JsonField<ContactIdentifierType> = contactIdentifierType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ContactDetailCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                contactIdentifier()
                contactIdentifierType()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [ContactDetailCreateRequest]. */
            class Builder internal constructor() {

                private var contactIdentifier: JsonField<String> = JsonMissing.of()
                private var contactIdentifierType: JsonField<ContactIdentifierType> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(contactDetailCreateRequest: ContactDetailCreateRequest) = apply {
                    contactIdentifier = contactDetailCreateRequest.contactIdentifier
                    contactIdentifierType = contactDetailCreateRequest.contactIdentifierType
                    additionalProperties =
                        contactDetailCreateRequest.additionalProperties.toMutableMap()
                }

                fun contactIdentifier(contactIdentifier: String) =
                    contactIdentifier(JsonField.of(contactIdentifier))

                fun contactIdentifier(contactIdentifier: JsonField<String>) = apply {
                    this.contactIdentifier = contactIdentifier
                }

                fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) =
                    contactIdentifierType(JsonField.of(contactIdentifierType))

                fun contactIdentifierType(contactIdentifierType: JsonField<ContactIdentifierType>) =
                    apply {
                        this.contactIdentifierType = contactIdentifierType
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

                fun build(): ContactDetailCreateRequest =
                    ContactDetailCreateRequest(
                        contactIdentifier,
                        contactIdentifierType,
                        additionalProperties.toImmutable(),
                    )
            }

            class ContactIdentifierType
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

                    val EMAIL = of("email")

                    val PHONE_NUMBER = of("phone_number")

                    val WEBSITE = of("website")

                    fun of(value: String) = ContactIdentifierType(JsonField.of(value))
                }

                /** An enum containing [ContactIdentifierType]'s known values. */
                enum class Known {
                    EMAIL,
                    PHONE_NUMBER,
                    WEBSITE,
                }

                /**
                 * An enum containing [ContactIdentifierType]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [ContactIdentifierType] can contain an unknown value in a couple
                 * of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EMAIL,
                    PHONE_NUMBER,
                    WEBSITE,
                    /**
                     * An enum member indicating that [ContactIdentifierType] was instantiated with
                     * an unknown value.
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
                        EMAIL -> Value.EMAIL
                        PHONE_NUMBER -> Value.PHONE_NUMBER
                        WEBSITE -> Value.WEBSITE
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
                        EMAIL -> Known.EMAIL
                        PHONE_NUMBER -> Known.PHONE_NUMBER
                        WEBSITE -> Known.WEBSITE
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown ContactIdentifierType: $value"
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ContactIdentifierType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ContactDetailCreateRequest && contactIdentifier == other.contactIdentifier && contactIdentifierType == other.contactIdentifierType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(contactIdentifier, contactIdentifierType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ContactDetailCreateRequest{contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"
        }

        /**
         * Specifies a ledger account object that will be created with the external account. The
         * resulting ledger account is linked to the external account for auto-ledgering Payment
         * objects. See
         * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for more
         * details.
         */
        @NoAutoDetect
        class LedgerAccountCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ledger_id")
            @ExcludeMissing
            private val ledgerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("normal_balance")
            @ExcludeMissing
            private val normalBalance: JsonField<TransactionDirection> = JsonMissing.of(),
            @JsonProperty("currency_exponent")
            @ExcludeMissing
            private val currencyExponent: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ledger_account_category_ids")
            @ExcludeMissing
            private val ledgerAccountCategoryIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("ledgerable_id")
            @ExcludeMissing
            private val ledgerableId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ledgerable_type")
            @ExcludeMissing
            private val ledgerableType: JsonField<LedgerableType> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The currency of the ledger account. */
            fun currency(): String = currency.getRequired("currency")

            /** The id of the ledger that this account belongs to. */
            fun ledgerId(): String = ledgerId.getRequired("ledger_id")

            /** The name of the ledger account. */
            fun name(): String = name.getRequired("name")

            /** The normal balance of the ledger account. */
            fun normalBalance(): TransactionDirection = normalBalance.getRequired("normal_balance")

            /** The currency exponent of the ledger account. */
            fun currencyExponent(): Long? = currencyExponent.getNullable("currency_exponent")

            /** The description of the ledger account. */
            fun description(): String? = description.getNullable("description")

            /**
             * The array of ledger account category ids that this ledger account should be a child
             * of.
             */
            fun ledgerAccountCategoryIds(): List<String>? =
                ledgerAccountCategoryIds.getNullable("ledger_account_category_ids")

            /**
             * If the ledger account links to another object in Modern Treasury, the id will be
             * populated here, otherwise null.
             */
            fun ledgerableId(): String? = ledgerableId.getNullable("ledgerable_id")

            /**
             * If the ledger account links to another object in Modern Treasury, the type will be
             * populated here, otherwise null. The value is one of internal_account or
             * external_account.
             */
            fun ledgerableType(): LedgerableType? = ledgerableType.getNullable("ledgerable_type")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /** The currency of the ledger account. */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /** The id of the ledger that this account belongs to. */
            @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId(): JsonField<String> = ledgerId

            /** The name of the ledger account. */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /** The normal balance of the ledger account. */
            @JsonProperty("normal_balance")
            @ExcludeMissing
            fun _normalBalance(): JsonField<TransactionDirection> = normalBalance

            /** The currency exponent of the ledger account. */
            @JsonProperty("currency_exponent")
            @ExcludeMissing
            fun _currencyExponent(): JsonField<Long> = currencyExponent

            /** The description of the ledger account. */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * The array of ledger account category ids that this ledger account should be a child
             * of.
             */
            @JsonProperty("ledger_account_category_ids")
            @ExcludeMissing
            fun _ledgerAccountCategoryIds(): JsonField<List<String>> = ledgerAccountCategoryIds

            /**
             * If the ledger account links to another object in Modern Treasury, the id will be
             * populated here, otherwise null.
             */
            @JsonProperty("ledgerable_id")
            @ExcludeMissing
            fun _ledgerableId(): JsonField<String> = ledgerableId

            /**
             * If the ledger account links to another object in Modern Treasury, the type will be
             * populated here, otherwise null. The value is one of internal_account or
             * external_account.
             */
            @JsonProperty("ledgerable_type")
            @ExcludeMissing
            fun _ledgerableType(): JsonField<LedgerableType> = ledgerableType

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): LedgerAccountCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                currency()
                ledgerId()
                name()
                normalBalance()
                currencyExponent()
                description()
                ledgerAccountCategoryIds()
                ledgerableId()
                ledgerableType()
                metadata()?.validate()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [LedgerAccountCreateRequest]. */
            class Builder internal constructor() {

                private var currency: JsonField<String>? = null
                private var ledgerId: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var normalBalance: JsonField<TransactionDirection>? = null
                private var currencyExponent: JsonField<Long> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var ledgerAccountCategoryIds: JsonField<MutableList<String>>? = null
                private var ledgerableId: JsonField<String> = JsonMissing.of()
                private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(ledgerAccountCreateRequest: LedgerAccountCreateRequest) = apply {
                    currency = ledgerAccountCreateRequest.currency
                    ledgerId = ledgerAccountCreateRequest.ledgerId
                    name = ledgerAccountCreateRequest.name
                    normalBalance = ledgerAccountCreateRequest.normalBalance
                    currencyExponent = ledgerAccountCreateRequest.currencyExponent
                    description = ledgerAccountCreateRequest.description
                    ledgerAccountCategoryIds =
                        ledgerAccountCreateRequest.ledgerAccountCategoryIds.map {
                            it.toMutableList()
                        }
                    ledgerableId = ledgerAccountCreateRequest.ledgerableId
                    ledgerableType = ledgerAccountCreateRequest.ledgerableType
                    metadata = ledgerAccountCreateRequest.metadata
                    additionalProperties =
                        ledgerAccountCreateRequest.additionalProperties.toMutableMap()
                }

                /** The currency of the ledger account. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /** The currency of the ledger account. */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The id of the ledger that this account belongs to. */
                fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

                /** The id of the ledger that this account belongs to. */
                fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

                /** The name of the ledger account. */
                fun name(name: String) = name(JsonField.of(name))

                /** The name of the ledger account. */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The normal balance of the ledger account. */
                fun normalBalance(normalBalance: TransactionDirection) =
                    normalBalance(JsonField.of(normalBalance))

                /** The normal balance of the ledger account. */
                fun normalBalance(normalBalance: JsonField<TransactionDirection>) = apply {
                    this.normalBalance = normalBalance
                }

                /** The currency exponent of the ledger account. */
                fun currencyExponent(currencyExponent: Long?) =
                    currencyExponent(JsonField.ofNullable(currencyExponent))

                /** The currency exponent of the ledger account. */
                fun currencyExponent(currencyExponent: Long) =
                    currencyExponent(currencyExponent as Long?)

                /** The currency exponent of the ledger account. */
                fun currencyExponent(currencyExponent: JsonField<Long>) = apply {
                    this.currencyExponent = currencyExponent
                }

                /** The description of the ledger account. */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /** The description of the ledger account. */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * The array of ledger account category ids that this ledger account should be a
                 * child of.
                 */
                fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>) =
                    ledgerAccountCategoryIds(JsonField.of(ledgerAccountCategoryIds))

                /**
                 * The array of ledger account category ids that this ledger account should be a
                 * child of.
                 */
                fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: JsonField<List<String>>) =
                    apply {
                        this.ledgerAccountCategoryIds =
                            ledgerAccountCategoryIds.map { it.toMutableList() }
                    }

                /**
                 * The array of ledger account category ids that this ledger account should be a
                 * child of.
                 */
                fun addLedgerAccountCategoryId(ledgerAccountCategoryId: String) = apply {
                    ledgerAccountCategoryIds =
                        (ledgerAccountCategoryIds ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(ledgerAccountCategoryId)
                        }
                }

                /**
                 * If the ledger account links to another object in Modern Treasury, the id will be
                 * populated here, otherwise null.
                 */
                fun ledgerableId(ledgerableId: String) = ledgerableId(JsonField.of(ledgerableId))

                /**
                 * If the ledger account links to another object in Modern Treasury, the id will be
                 * populated here, otherwise null.
                 */
                fun ledgerableId(ledgerableId: JsonField<String>) = apply {
                    this.ledgerableId = ledgerableId
                }

                /**
                 * If the ledger account links to another object in Modern Treasury, the type will
                 * be populated here, otherwise null. The value is one of internal_account or
                 * external_account.
                 */
                fun ledgerableType(ledgerableType: LedgerableType) =
                    ledgerableType(JsonField.of(ledgerableType))

                /**
                 * If the ledger account links to another object in Modern Treasury, the type will
                 * be populated here, otherwise null. The value is one of internal_account or
                 * external_account.
                 */
                fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
                    this.ledgerableType = ledgerableType
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

                fun build(): LedgerAccountCreateRequest =
                    LedgerAccountCreateRequest(
                        checkRequired("currency", currency),
                        checkRequired("ledgerId", ledgerId),
                        checkRequired("name", name),
                        checkRequired("normalBalance", normalBalance),
                        currencyExponent,
                        description,
                        (ledgerAccountCategoryIds ?: JsonMissing.of()).map { it.toImmutable() },
                        ledgerableId,
                        ledgerableType,
                        metadata,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * If the ledger account links to another object in Modern Treasury, the type will be
             * populated here, otherwise null. The value is one of internal_account or
             * external_account.
             */
            class LedgerableType
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

                    val COUNTERPARTY = of("counterparty")

                    val EXTERNAL_ACCOUNT = of("external_account")

                    val INTERNAL_ACCOUNT = of("internal_account")

                    val VIRTUAL_ACCOUNT = of("virtual_account")

                    fun of(value: String) = LedgerableType(JsonField.of(value))
                }

                /** An enum containing [LedgerableType]'s known values. */
                enum class Known {
                    COUNTERPARTY,
                    EXTERNAL_ACCOUNT,
                    INTERNAL_ACCOUNT,
                    VIRTUAL_ACCOUNT,
                }

                /**
                 * An enum containing [LedgerableType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [LedgerableType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    COUNTERPARTY,
                    EXTERNAL_ACCOUNT,
                    INTERNAL_ACCOUNT,
                    VIRTUAL_ACCOUNT,
                    /**
                     * An enum member indicating that [LedgerableType] was instantiated with an
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
                        COUNTERPARTY -> Value.COUNTERPARTY
                        EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                        INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                        VIRTUAL_ACCOUNT -> Value.VIRTUAL_ACCOUNT
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
                        COUNTERPARTY -> Known.COUNTERPARTY
                        EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                        INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                        VIRTUAL_ACCOUNT -> Known.VIRTUAL_ACCOUNT
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown LedgerableType: $value"
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is LedgerableType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @NoAutoDetect
            class Metadata
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LedgerAccountCreateRequest && currency == other.currency && ledgerId == other.ledgerId && name == other.name && normalBalance == other.normalBalance && currencyExponent == other.currencyExponent && description == other.description && ledgerAccountCategoryIds == other.ledgerAccountCategoryIds && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(currency, ledgerId, name, normalBalance, currencyExponent, description, ledgerAccountCategoryIds, ledgerableId, ledgerableType, metadata, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LedgerAccountCreateRequest{currency=$currency, ledgerId=$ledgerId, name=$name, normalBalance=$normalBalance, currencyExponent=$currencyExponent, description=$description, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

        /** Required if receiving wire payments. */
        @NoAutoDetect
        class AddressRequest
        @JsonCreator
        private constructor(
            @JsonProperty("country")
            @ExcludeMissing
            private val country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1")
            @ExcludeMissing
            private val line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2")
            @ExcludeMissing
            private val line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locality")
            @ExcludeMissing
            private val locality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            private val postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region")
            @ExcludeMissing
            private val region: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(): String? = country.getNullable("country")

            fun line1(): String? = line1.getNullable("line1")

            fun line2(): String? = line2.getNullable("line2")

            /** Locality or City. */
            fun locality(): String? = locality.getNullable("locality")

            /** The postal code of the address. */
            fun postalCode(): String? = postalCode.getNullable("postal_code")

            /** Region or State. */
            fun region(): String? = region.getNullable("region")

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            /** Locality or City. */
            @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /** Region or State. */
            @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AddressRequest = apply {
                if (validated) {
                    return@apply
                }

                country()
                line1()
                line2()
                locality()
                postalCode()
                region()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [AddressRequest]. */
            class Builder internal constructor() {

                private var country: JsonField<String> = JsonMissing.of()
                private var line1: JsonField<String> = JsonMissing.of()
                private var line2: JsonField<String> = JsonMissing.of()
                private var locality: JsonField<String> = JsonMissing.of()
                private var postalCode: JsonField<String> = JsonMissing.of()
                private var region: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(addressRequest: AddressRequest) = apply {
                    country = addressRequest.country
                    line1 = addressRequest.line1
                    line2 = addressRequest.line2
                    locality = addressRequest.locality
                    postalCode = addressRequest.postalCode
                    region = addressRequest.region
                    additionalProperties = addressRequest.additionalProperties.toMutableMap()
                }

                /** Country code conforms to [ISO 3166-1 alpha-2] */
                fun country(country: String?) = country(JsonField.ofNullable(country))

                /** Country code conforms to [ISO 3166-1 alpha-2] */
                fun country(country: JsonField<String>) = apply { this.country = country }

                fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /** Locality or City. */
                fun locality(locality: String?) = locality(JsonField.ofNullable(locality))

                /** Locality or City. */
                fun locality(locality: JsonField<String>) = apply { this.locality = locality }

                /** The postal code of the address. */
                fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

                /** The postal code of the address. */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** Region or State. */
                fun region(region: String?) = region(JsonField.ofNullable(region))

                /** Region or State. */
                fun region(region: JsonField<String>) = apply { this.region = region }

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

                fun build(): AddressRequest =
                    AddressRequest(
                        country,
                        line1,
                        line2,
                        locality,
                        postalCode,
                        region,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AddressRequest && country == other.country && line1 == other.line1 && line2 == other.line2 && locality == other.locality && postalCode == other.postalCode && region == other.region && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(country, line1, line2, locality, postalCode, region, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AddressRequest{country=$country, line1=$line1, line2=$line2, locality=$locality, postalCode=$postalCode, region=$region, additionalProperties=$additionalProperties}"
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PartyType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class RoutingDetail
        @JsonCreator
        private constructor(
            @JsonProperty("routing_number")
            @ExcludeMissing
            private val routingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routing_number_type")
            @ExcludeMissing
            private val routingNumberType: JsonField<RoutingNumberType> = JsonMissing.of(),
            @JsonProperty("payment_type")
            @ExcludeMissing
            private val paymentType: JsonField<PaymentType> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun routingNumber(): String = routingNumber.getRequired("routing_number")

            fun routingNumberType(): RoutingNumberType =
                routingNumberType.getRequired("routing_number_type")

            fun paymentType(): PaymentType? = paymentType.getNullable("payment_type")

            @JsonProperty("routing_number")
            @ExcludeMissing
            fun _routingNumber(): JsonField<String> = routingNumber

            @JsonProperty("routing_number_type")
            @ExcludeMissing
            fun _routingNumberType(): JsonField<RoutingNumberType> = routingNumberType

            @JsonProperty("payment_type")
            @ExcludeMissing
            fun _paymentType(): JsonField<PaymentType> = paymentType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): RoutingDetail = apply {
                if (validated) {
                    return@apply
                }

                routingNumber()
                routingNumberType()
                paymentType()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun routingNumber(routingNumber: JsonField<String>) = apply {
                    this.routingNumber = routingNumber
                }

                fun routingNumberType(routingNumberType: RoutingNumberType) =
                    routingNumberType(JsonField.of(routingNumberType))

                fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) = apply {
                    this.routingNumberType = routingNumberType
                }

                fun paymentType(paymentType: PaymentType) = paymentType(JsonField.of(paymentType))

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

                fun build(): RoutingDetail =
                    RoutingDetail(
                        checkRequired("routingNumber", routingNumber),
                        checkRequired("routingNumberType", routingNumberType),
                        paymentType,
                        additionalProperties.toImmutable(),
                    )
            }

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

                    val BOOK = of("book")

                    val CARD = of("card")

                    val CHATS = of("chats")

                    val CHECK = of("check")

                    val CROSS_BORDER = of("cross_border")

                    val DK_NETS = of("dk_nets")

                    val EFT = of("eft")

                    val HU_ICS = of("hu_ics")

                    val INTERAC = of("interac")

                    val MASAV = of("masav")

                    val MX_CCEN = of("mx_ccen")

                    val NEFT = of("neft")

                    val NICS = of("nics")

                    val NZ_BECS = of("nz_becs")

                    val PL_ELIXIR = of("pl_elixir")

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

                    val WIRE = of("wire")

                    val ZENGIN = of("zengin")

                    fun of(value: String) = PaymentType(JsonField.of(value))
                }

                /** An enum containing [PaymentType]'s known values. */
                enum class Known {
                    ACH,
                    AU_BECS,
                    BACS,
                    BOOK,
                    CARD,
                    CHATS,
                    CHECK,
                    CROSS_BORDER,
                    DK_NETS,
                    EFT,
                    HU_ICS,
                    INTERAC,
                    MASAV,
                    MX_CCEN,
                    NEFT,
                    NICS,
                    NZ_BECS,
                    PL_ELIXIR,
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
                    BOOK,
                    CARD,
                    CHATS,
                    CHECK,
                    CROSS_BORDER,
                    DK_NETS,
                    EFT,
                    HU_ICS,
                    INTERAC,
                    MASAV,
                    MX_CCEN,
                    NEFT,
                    NICS,
                    NZ_BECS,
                    PL_ELIXIR,
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
                        BOOK -> Value.BOOK
                        CARD -> Value.CARD
                        CHATS -> Value.CHATS
                        CHECK -> Value.CHECK
                        CROSS_BORDER -> Value.CROSS_BORDER
                        DK_NETS -> Value.DK_NETS
                        EFT -> Value.EFT
                        HU_ICS -> Value.HU_ICS
                        INTERAC -> Value.INTERAC
                        MASAV -> Value.MASAV
                        MX_CCEN -> Value.MX_CCEN
                        NEFT -> Value.NEFT
                        NICS -> Value.NICS
                        NZ_BECS -> Value.NZ_BECS
                        PL_ELIXIR -> Value.PL_ELIXIR
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
                        BOOK -> Known.BOOK
                        CARD -> Known.CARD
                        CHATS -> Known.CHATS
                        CHECK -> Known.CHECK
                        CROSS_BORDER -> Known.CROSS_BORDER
                        DK_NETS -> Known.DK_NETS
                        EFT -> Known.EFT
                        HU_ICS -> Known.HU_ICS
                        INTERAC -> Known.INTERAC
                        MASAV -> Known.MASAV
                        MX_CCEN -> Known.MX_CCEN
                        NEFT -> Known.NEFT
                        NICS -> Known.NICS
                        NZ_BECS -> Known.NZ_BECS
                        PL_ELIXIR -> Known.PL_ELIXIR
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class LegalEntityCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("legal_entity_type")
        @ExcludeMissing
        private val legalEntityType: JsonField<LegalEntityType> = JsonMissing.of(),
        @JsonProperty("addresses")
        @ExcludeMissing
        private val addresses: JsonField<List<LegalEntityAddressCreateRequest>> = JsonMissing.of(),
        @JsonProperty("bank_settings")
        @ExcludeMissing
        private val bankSettings: JsonField<BankSettings> = JsonMissing.of(),
        @JsonProperty("business_name")
        @ExcludeMissing
        private val businessName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("citizenship_country")
        @ExcludeMissing
        private val citizenshipCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date_formed")
        @ExcludeMissing
        private val dateFormed: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("date_of_birth")
        @ExcludeMissing
        private val dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("doing_business_as_names")
        @ExcludeMissing
        private val doingBusinessAsNames: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_name")
        @ExcludeMissing
        private val firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identifications")
        @ExcludeMissing
        private val identifications: JsonField<List<IdentificationCreateRequest>> =
            JsonMissing.of(),
        @JsonProperty("last_name")
        @ExcludeMissing
        private val lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legal_entity_associations")
        @ExcludeMissing
        private val legalEntityAssociations:
            JsonField<List<LegalEntityAssociationInlineCreateRequest>> =
            JsonMissing.of(),
        @JsonProperty("legal_structure")
        @ExcludeMissing
        private val legalStructure: JsonField<LegalStructure> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("middle_name")
        @ExcludeMissing
        private val middleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        private val phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of(),
        @JsonProperty("politically_exposed_person")
        @ExcludeMissing
        private val politicallyExposedPerson: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("preferred_name")
        @ExcludeMissing
        private val preferredName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prefix")
        @ExcludeMissing
        private val prefix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("risk_rating")
        @ExcludeMissing
        private val riskRating: JsonField<RiskRating> = JsonMissing.of(),
        @JsonProperty("suffix")
        @ExcludeMissing
        private val suffix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wealth_and_employment_details")
        @ExcludeMissing
        private val wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails> =
            JsonMissing.of(),
        @JsonProperty("website")
        @ExcludeMissing
        private val website: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The type of legal entity. */
        fun legalEntityType(): LegalEntityType = legalEntityType.getRequired("legal_entity_type")

        /** A list of addresses for the entity. */
        fun addresses(): List<LegalEntityAddressCreateRequest>? = addresses.getNullable("addresses")

        fun bankSettings(): BankSettings? = bankSettings.getNullable("bank_settings")

        /** The business's legal business name. */
        fun businessName(): String? = businessName.getNullable("business_name")

        /** The country of citizenship for an individual. */
        fun citizenshipCountry(): String? = citizenshipCountry.getNullable("citizenship_country")

        /** A business's formation date (YYYY-MM-DD). */
        fun dateFormed(): LocalDate? = dateFormed.getNullable("date_formed")

        /** An individual's date of birth (YYYY-MM-DD). */
        fun dateOfBirth(): LocalDate? = dateOfBirth.getNullable("date_of_birth")

        fun doingBusinessAsNames(): List<String>? =
            doingBusinessAsNames.getNullable("doing_business_as_names")

        /** The entity's primary email. */
        fun email(): String? = email.getNullable("email")

        /** An individual's first name. */
        fun firstName(): String? = firstName.getNullable("first_name")

        /** A list of identifications for the legal entity. */
        fun identifications(): List<IdentificationCreateRequest>? =
            identifications.getNullable("identifications")

        /** An individual's last name. */
        fun lastName(): String? = lastName.getNullable("last_name")

        /** The legal entity associations and its child legal entities. */
        fun legalEntityAssociations(): List<LegalEntityAssociationInlineCreateRequest>? =
            legalEntityAssociations.getNullable("legal_entity_associations")

        /** The business's legal structure. */
        fun legalStructure(): LegalStructure? = legalStructure.getNullable("legal_structure")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /** An individual's middle name. */
        fun middleName(): String? = middleName.getNullable("middle_name")

        fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers.getNullable("phone_numbers")

        /** Whether the individual is a politically exposed person. */
        fun politicallyExposedPerson(): Boolean? =
            politicallyExposedPerson.getNullable("politically_exposed_person")

        /** An individual's preferred name. */
        fun preferredName(): String? = preferredName.getNullable("preferred_name")

        /** An individual's prefix. */
        fun prefix(): String? = prefix.getNullable("prefix")

        /** The risk rating of the legal entity. One of low, medium, high. */
        fun riskRating(): RiskRating? = riskRating.getNullable("risk_rating")

        /** An individual's suffix. */
        fun suffix(): String? = suffix.getNullable("suffix")

        fun wealthAndEmploymentDetails(): WealthAndEmploymentDetails? =
            wealthAndEmploymentDetails.getNullable("wealth_and_employment_details")

        /** The entity's primary website URL. */
        fun website(): String? = website.getNullable("website")

        /** The type of legal entity. */
        @JsonProperty("legal_entity_type")
        @ExcludeMissing
        fun _legalEntityType(): JsonField<LegalEntityType> = legalEntityType

        /** A list of addresses for the entity. */
        @JsonProperty("addresses")
        @ExcludeMissing
        fun _addresses(): JsonField<List<LegalEntityAddressCreateRequest>> = addresses

        @JsonProperty("bank_settings")
        @ExcludeMissing
        fun _bankSettings(): JsonField<BankSettings> = bankSettings

        /** The business's legal business name. */
        @JsonProperty("business_name")
        @ExcludeMissing
        fun _businessName(): JsonField<String> = businessName

        /** The country of citizenship for an individual. */
        @JsonProperty("citizenship_country")
        @ExcludeMissing
        fun _citizenshipCountry(): JsonField<String> = citizenshipCountry

        /** A business's formation date (YYYY-MM-DD). */
        @JsonProperty("date_formed")
        @ExcludeMissing
        fun _dateFormed(): JsonField<LocalDate> = dateFormed

        /** An individual's date of birth (YYYY-MM-DD). */
        @JsonProperty("date_of_birth")
        @ExcludeMissing
        fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

        @JsonProperty("doing_business_as_names")
        @ExcludeMissing
        fun _doingBusinessAsNames(): JsonField<List<String>> = doingBusinessAsNames

        /** The entity's primary email. */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /** An individual's first name. */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /** A list of identifications for the legal entity. */
        @JsonProperty("identifications")
        @ExcludeMissing
        fun _identifications(): JsonField<List<IdentificationCreateRequest>> = identifications

        /** An individual's last name. */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /** The legal entity associations and its child legal entities. */
        @JsonProperty("legal_entity_associations")
        @ExcludeMissing
        fun _legalEntityAssociations(): JsonField<List<LegalEntityAssociationInlineCreateRequest>> =
            legalEntityAssociations

        /** The business's legal structure. */
        @JsonProperty("legal_structure")
        @ExcludeMissing
        fun _legalStructure(): JsonField<LegalStructure> = legalStructure

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /** An individual's middle name. */
        @JsonProperty("middle_name")
        @ExcludeMissing
        fun _middleName(): JsonField<String> = middleName

        @JsonProperty("phone_numbers")
        @ExcludeMissing
        fun _phoneNumbers(): JsonField<List<PhoneNumber>> = phoneNumbers

        /** Whether the individual is a politically exposed person. */
        @JsonProperty("politically_exposed_person")
        @ExcludeMissing
        fun _politicallyExposedPerson(): JsonField<Boolean> = politicallyExposedPerson

        /** An individual's preferred name. */
        @JsonProperty("preferred_name")
        @ExcludeMissing
        fun _preferredName(): JsonField<String> = preferredName

        /** An individual's prefix. */
        @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

        /** The risk rating of the legal entity. One of low, medium, high. */
        @JsonProperty("risk_rating")
        @ExcludeMissing
        fun _riskRating(): JsonField<RiskRating> = riskRating

        /** An individual's suffix. */
        @JsonProperty("suffix") @ExcludeMissing fun _suffix(): JsonField<String> = suffix

        @JsonProperty("wealth_and_employment_details")
        @ExcludeMissing
        fun _wealthAndEmploymentDetails(): JsonField<WealthAndEmploymentDetails> =
            wealthAndEmploymentDetails

        /** The entity's primary website URL. */
        @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LegalEntityCreateRequest = apply {
            if (validated) {
                return@apply
            }

            legalEntityType()
            addresses()?.forEach { it.validate() }
            bankSettings()?.validate()
            businessName()
            citizenshipCountry()
            dateFormed()
            dateOfBirth()
            doingBusinessAsNames()
            email()
            firstName()
            identifications()?.forEach { it.validate() }
            lastName()
            legalEntityAssociations()?.forEach { it.validate() }
            legalStructure()
            metadata()?.validate()
            middleName()
            phoneNumbers()?.forEach { it.validate() }
            politicallyExposedPerson()
            preferredName()
            prefix()
            riskRating()
            suffix()
            wealthAndEmploymentDetails()?.validate()
            website()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [LegalEntityCreateRequest]. */
        class Builder internal constructor() {

            private var legalEntityType: JsonField<LegalEntityType>? = null
            private var addresses: JsonField<MutableList<LegalEntityAddressCreateRequest>>? = null
            private var bankSettings: JsonField<BankSettings> = JsonMissing.of()
            private var businessName: JsonField<String> = JsonMissing.of()
            private var citizenshipCountry: JsonField<String> = JsonMissing.of()
            private var dateFormed: JsonField<LocalDate> = JsonMissing.of()
            private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
            private var doingBusinessAsNames: JsonField<MutableList<String>>? = null
            private var email: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var identifications: JsonField<MutableList<IdentificationCreateRequest>>? = null
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
                dateFormed = legalEntityCreateRequest.dateFormed
                dateOfBirth = legalEntityCreateRequest.dateOfBirth
                doingBusinessAsNames =
                    legalEntityCreateRequest.doingBusinessAsNames.map { it.toMutableList() }
                email = legalEntityCreateRequest.email
                firstName = legalEntityCreateRequest.firstName
                identifications =
                    legalEntityCreateRequest.identifications.map { it.toMutableList() }
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

            /** The type of legal entity. */
            fun legalEntityType(legalEntityType: JsonField<LegalEntityType>) = apply {
                this.legalEntityType = legalEntityType
            }

            /** A list of addresses for the entity. */
            fun addresses(addresses: List<LegalEntityAddressCreateRequest>) =
                addresses(JsonField.of(addresses))

            /** A list of addresses for the entity. */
            fun addresses(addresses: JsonField<List<LegalEntityAddressCreateRequest>>) = apply {
                this.addresses = addresses.map { it.toMutableList() }
            }

            /** A list of addresses for the entity. */
            fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
                addresses =
                    (addresses ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(address)
                    }
            }

            fun bankSettings(bankSettings: BankSettings?) =
                bankSettings(JsonField.ofNullable(bankSettings))

            fun bankSettings(bankSettings: JsonField<BankSettings>) = apply {
                this.bankSettings = bankSettings
            }

            /** The business's legal business name. */
            fun businessName(businessName: String?) =
                businessName(JsonField.ofNullable(businessName))

            /** The business's legal business name. */
            fun businessName(businessName: JsonField<String>) = apply {
                this.businessName = businessName
            }

            /** The country of citizenship for an individual. */
            fun citizenshipCountry(citizenshipCountry: String?) =
                citizenshipCountry(JsonField.ofNullable(citizenshipCountry))

            /** The country of citizenship for an individual. */
            fun citizenshipCountry(citizenshipCountry: JsonField<String>) = apply {
                this.citizenshipCountry = citizenshipCountry
            }

            /** A business's formation date (YYYY-MM-DD). */
            fun dateFormed(dateFormed: LocalDate?) = dateFormed(JsonField.ofNullable(dateFormed))

            /** A business's formation date (YYYY-MM-DD). */
            fun dateFormed(dateFormed: JsonField<LocalDate>) = apply {
                this.dateFormed = dateFormed
            }

            /** An individual's date of birth (YYYY-MM-DD). */
            fun dateOfBirth(dateOfBirth: LocalDate?) =
                dateOfBirth(JsonField.ofNullable(dateOfBirth))

            /** An individual's date of birth (YYYY-MM-DD). */
            fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                this.dateOfBirth = dateOfBirth
            }

            fun doingBusinessAsNames(doingBusinessAsNames: List<String>) =
                doingBusinessAsNames(JsonField.of(doingBusinessAsNames))

            fun doingBusinessAsNames(doingBusinessAsNames: JsonField<List<String>>) = apply {
                this.doingBusinessAsNames = doingBusinessAsNames.map { it.toMutableList() }
            }

            fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
                doingBusinessAsNames =
                    (doingBusinessAsNames ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(doingBusinessAsName)
                    }
            }

            /** The entity's primary email. */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /** The entity's primary email. */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** An individual's first name. */
            fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

            /** An individual's first name. */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** A list of identifications for the legal entity. */
            fun identifications(identifications: List<IdentificationCreateRequest>) =
                identifications(JsonField.of(identifications))

            /** A list of identifications for the legal entity. */
            fun identifications(identifications: JsonField<List<IdentificationCreateRequest>>) =
                apply {
                    this.identifications = identifications.map { it.toMutableList() }
                }

            /** A list of identifications for the legal entity. */
            fun addIdentification(identification: IdentificationCreateRequest) = apply {
                identifications =
                    (identifications ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(identification)
                    }
            }

            /** An individual's last name. */
            fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

            /** An individual's last name. */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** The legal entity associations and its child legal entities. */
            fun legalEntityAssociations(
                legalEntityAssociations: List<LegalEntityAssociationInlineCreateRequest>?
            ) = legalEntityAssociations(JsonField.ofNullable(legalEntityAssociations))

            /** The legal entity associations and its child legal entities. */
            fun legalEntityAssociations(
                legalEntityAssociations: JsonField<List<LegalEntityAssociationInlineCreateRequest>>
            ) = apply {
                this.legalEntityAssociations = legalEntityAssociations.map { it.toMutableList() }
            }

            /** The legal entity associations and its child legal entities. */
            fun addLegalEntityAssociation(
                legalEntityAssociation: LegalEntityAssociationInlineCreateRequest
            ) = apply {
                legalEntityAssociations =
                    (legalEntityAssociations ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(legalEntityAssociation)
                    }
            }

            /** The business's legal structure. */
            fun legalStructure(legalStructure: LegalStructure?) =
                legalStructure(JsonField.ofNullable(legalStructure))

            /** The business's legal structure. */
            fun legalStructure(legalStructure: JsonField<LegalStructure>) = apply {
                this.legalStructure = legalStructure
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** An individual's middle name. */
            fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

            /** An individual's middle name. */
            fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

            fun phoneNumbers(phoneNumbers: List<PhoneNumber>) =
                phoneNumbers(JsonField.of(phoneNumbers))

            fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber>>) = apply {
                this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
            }

            fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
                phoneNumbers =
                    (phoneNumbers ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(phoneNumber)
                    }
            }

            /** Whether the individual is a politically exposed person. */
            fun politicallyExposedPerson(politicallyExposedPerson: Boolean?) =
                politicallyExposedPerson(JsonField.ofNullable(politicallyExposedPerson))

            /** Whether the individual is a politically exposed person. */
            fun politicallyExposedPerson(politicallyExposedPerson: Boolean) =
                politicallyExposedPerson(politicallyExposedPerson as Boolean?)

            /** Whether the individual is a politically exposed person. */
            fun politicallyExposedPerson(politicallyExposedPerson: JsonField<Boolean>) = apply {
                this.politicallyExposedPerson = politicallyExposedPerson
            }

            /** An individual's preferred name. */
            fun preferredName(preferredName: String?) =
                preferredName(JsonField.ofNullable(preferredName))

            /** An individual's preferred name. */
            fun preferredName(preferredName: JsonField<String>) = apply {
                this.preferredName = preferredName
            }

            /** An individual's prefix. */
            fun prefix(prefix: String?) = prefix(JsonField.ofNullable(prefix))

            /** An individual's prefix. */
            fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

            /** The risk rating of the legal entity. One of low, medium, high. */
            fun riskRating(riskRating: RiskRating?) = riskRating(JsonField.ofNullable(riskRating))

            /** The risk rating of the legal entity. One of low, medium, high. */
            fun riskRating(riskRating: JsonField<RiskRating>) = apply {
                this.riskRating = riskRating
            }

            /** An individual's suffix. */
            fun suffix(suffix: String?) = suffix(JsonField.ofNullable(suffix))

            /** An individual's suffix. */
            fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

            fun wealthAndEmploymentDetails(
                wealthAndEmploymentDetails: WealthAndEmploymentDetails?
            ) = wealthAndEmploymentDetails(JsonField.ofNullable(wealthAndEmploymentDetails))

            fun wealthAndEmploymentDetails(
                wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails>
            ) = apply { this.wealthAndEmploymentDetails = wealthAndEmploymentDetails }

            /** The entity's primary website URL. */
            fun website(website: String?) = website(JsonField.ofNullable(website))

            /** The entity's primary website URL. */
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

            fun build(): LegalEntityCreateRequest =
                LegalEntityCreateRequest(
                    checkRequired("legalEntityType", legalEntityType),
                    (addresses ?: JsonMissing.of()).map { it.toImmutable() },
                    bankSettings,
                    businessName,
                    citizenshipCountry,
                    dateFormed,
                    dateOfBirth,
                    (doingBusinessAsNames ?: JsonMissing.of()).map { it.toImmutable() },
                    email,
                    firstName,
                    (identifications ?: JsonMissing.of()).map { it.toImmutable() },
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
                    additionalProperties.toImmutable(),
                )
        }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LegalEntityType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class LegalEntityAddressCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("country")
            @ExcludeMissing
            private val country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1")
            @ExcludeMissing
            private val line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locality")
            @ExcludeMissing
            private val locality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            private val postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region")
            @ExcludeMissing
            private val region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address_types")
            @ExcludeMissing
            private val addressTypes: JsonField<List<AddressType>> = JsonMissing.of(),
            @JsonProperty("line2")
            @ExcludeMissing
            private val line2: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(): String? = country.getNullable("country")

            fun line1(): String? = line1.getNullable("line1")

            /** Locality or City. */
            fun locality(): String? = locality.getNullable("locality")

            /** The postal code of the address. */
            fun postalCode(): String? = postalCode.getNullable("postal_code")

            /** Region or State. */
            fun region(): String? = region.getNullable("region")

            /** The types of this address. */
            fun addressTypes(): List<AddressType>? = addressTypes.getNullable("address_types")

            fun line2(): String? = line2.getNullable("line2")

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /** Locality or City. */
            @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /** Region or State. */
            @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

            /** The types of this address. */
            @JsonProperty("address_types")
            @ExcludeMissing
            fun _addressTypes(): JsonField<List<AddressType>> = addressTypes

            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): LegalEntityAddressCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                country()
                line1()
                locality()
                postalCode()
                region()
                addressTypes()
                line2()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [LegalEntityAddressCreateRequest]. */
            class Builder internal constructor() {

                private var country: JsonField<String>? = null
                private var line1: JsonField<String>? = null
                private var locality: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var region: JsonField<String>? = null
                private var addressTypes: JsonField<MutableList<AddressType>>? = null
                private var line2: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest
                ) = apply {
                    country = legalEntityAddressCreateRequest.country
                    line1 = legalEntityAddressCreateRequest.line1
                    locality = legalEntityAddressCreateRequest.locality
                    postalCode = legalEntityAddressCreateRequest.postalCode
                    region = legalEntityAddressCreateRequest.region
                    addressTypes =
                        legalEntityAddressCreateRequest.addressTypes.map { it.toMutableList() }
                    line2 = legalEntityAddressCreateRequest.line2
                    additionalProperties =
                        legalEntityAddressCreateRequest.additionalProperties.toMutableMap()
                }

                /** Country code conforms to [ISO 3166-1 alpha-2] */
                fun country(country: String?) = country(JsonField.ofNullable(country))

                /** Country code conforms to [ISO 3166-1 alpha-2] */
                fun country(country: JsonField<String>) = apply { this.country = country }

                fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** Locality or City. */
                fun locality(locality: String?) = locality(JsonField.ofNullable(locality))

                /** Locality or City. */
                fun locality(locality: JsonField<String>) = apply { this.locality = locality }

                /** The postal code of the address. */
                fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

                /** The postal code of the address. */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** Region or State. */
                fun region(region: String?) = region(JsonField.ofNullable(region))

                /** Region or State. */
                fun region(region: JsonField<String>) = apply { this.region = region }

                /** The types of this address. */
                fun addressTypes(addressTypes: List<AddressType>) =
                    addressTypes(JsonField.of(addressTypes))

                /** The types of this address. */
                fun addressTypes(addressTypes: JsonField<List<AddressType>>) = apply {
                    this.addressTypes = addressTypes.map { it.toMutableList() }
                }

                /** The types of this address. */
                fun addAddressType(addressType: AddressType) = apply {
                    addressTypes =
                        (addressTypes ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(addressType)
                        }
                }

                fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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

                fun build(): LegalEntityAddressCreateRequest =
                    LegalEntityAddressCreateRequest(
                        checkRequired("country", country),
                        checkRequired("line1", line1),
                        checkRequired("locality", locality),
                        checkRequired("postalCode", postalCode),
                        checkRequired("region", region),
                        (addressTypes ?: JsonMissing.of()).map { it.toImmutable() },
                        line2,
                        additionalProperties.toImmutable(),
                    )
            }

            class AddressType
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

                    val BUSINESS = of("business")

                    val MAILING = of("mailing")

                    val OTHER = of("other")

                    val PO_BOX = of("po_box")

                    val RESIDENTIAL = of("residential")

                    fun of(value: String) = AddressType(JsonField.of(value))
                }

                /** An enum containing [AddressType]'s known values. */
                enum class Known {
                    BUSINESS,
                    MAILING,
                    OTHER,
                    PO_BOX,
                    RESIDENTIAL,
                }

                /**
                 * An enum containing [AddressType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AddressType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BUSINESS,
                    MAILING,
                    OTHER,
                    PO_BOX,
                    RESIDENTIAL,
                    /**
                     * An enum member indicating that [AddressType] was instantiated with an unknown
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
                        BUSINESS -> Value.BUSINESS
                        MAILING -> Value.MAILING
                        OTHER -> Value.OTHER
                        PO_BOX -> Value.PO_BOX
                        RESIDENTIAL -> Value.RESIDENTIAL
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
                        BUSINESS -> Known.BUSINESS
                        MAILING -> Known.MAILING
                        OTHER -> Known.OTHER
                        PO_BOX -> Known.PO_BOX
                        RESIDENTIAL -> Known.RESIDENTIAL
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown AddressType: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AddressType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LegalEntityAddressCreateRequest && country == other.country && line1 == other.line1 && locality == other.locality && postalCode == other.postalCode && region == other.region && addressTypes == other.addressTypes && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(country, line1, locality, postalCode, region, addressTypes, line2, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LegalEntityAddressCreateRequest{country=$country, line1=$line1, locality=$locality, postalCode=$postalCode, region=$region, addressTypes=$addressTypes, line2=$line2, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class IdentificationCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("id_number")
            @ExcludeMissing
            private val idNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id_type")
            @ExcludeMissing
            private val idType: JsonField<IdType> = JsonMissing.of(),
            @JsonProperty("issuing_country")
            @ExcludeMissing
            private val issuingCountry: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The ID number of identification document. */
            fun idNumber(): String = idNumber.getRequired("id_number")

            /** The type of ID number. */
            fun idType(): IdType = idType.getRequired("id_type")

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            fun issuingCountry(): String? = issuingCountry.getNullable("issuing_country")

            /** The ID number of identification document. */
            @JsonProperty("id_number") @ExcludeMissing fun _idNumber(): JsonField<String> = idNumber

            /** The type of ID number. */
            @JsonProperty("id_type") @ExcludeMissing fun _idType(): JsonField<IdType> = idType

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            @JsonProperty("issuing_country")
            @ExcludeMissing
            fun _issuingCountry(): JsonField<String> = issuingCountry

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): IdentificationCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                idNumber()
                idType()
                issuingCountry()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [IdentificationCreateRequest]. */
            class Builder internal constructor() {

                private var idNumber: JsonField<String>? = null
                private var idType: JsonField<IdType>? = null
                private var issuingCountry: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(identificationCreateRequest: IdentificationCreateRequest) =
                    apply {
                        idNumber = identificationCreateRequest.idNumber
                        idType = identificationCreateRequest.idType
                        issuingCountry = identificationCreateRequest.issuingCountry
                        additionalProperties =
                            identificationCreateRequest.additionalProperties.toMutableMap()
                    }

                /** The ID number of identification document. */
                fun idNumber(idNumber: String) = idNumber(JsonField.of(idNumber))

                /** The ID number of identification document. */
                fun idNumber(idNumber: JsonField<String>) = apply { this.idNumber = idNumber }

                /** The type of ID number. */
                fun idType(idType: IdType) = idType(JsonField.of(idType))

                /** The type of ID number. */
                fun idType(idType: JsonField<IdType>) = apply { this.idType = idType }

                /**
                 * The ISO 3166-1 alpha-2 country code of the country that issued the identification
                 */
                fun issuingCountry(issuingCountry: String?) =
                    issuingCountry(JsonField.ofNullable(issuingCountry))

                /**
                 * The ISO 3166-1 alpha-2 country code of the country that issued the identification
                 */
                fun issuingCountry(issuingCountry: JsonField<String>) = apply {
                    this.issuingCountry = issuingCountry
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

                fun build(): IdentificationCreateRequest =
                    IdentificationCreateRequest(
                        checkRequired("idNumber", idNumber),
                        checkRequired("idType", idType),
                        issuingCountry,
                        additionalProperties.toImmutable(),
                    )
            }

            /** The type of ID number. */
            class IdType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    val AR_CUIL = of("ar_cuil")

                    val AR_CUIT = of("ar_cuit")

                    val BR_CNPJ = of("br_cnpj")

                    val BR_CPF = of("br_cpf")

                    val CL_RUN = of("cl_run")

                    val CL_RUT = of("cl_rut")

                    val CO_CEDULAS = of("co_cedulas")

                    val CO_NIT = of("co_nit")

                    val HN_ID = of("hn_id")

                    val HN_RTN = of("hn_rtn")

                    val IN_LEI = of("in_lei")

                    val KR_BRN = of("kr_brn")

                    val KR_CRN = of("kr_crn")

                    val KR_RRN = of("kr_rrn")

                    val PASSPORT = of("passport")

                    val SA_TIN = of("sa_tin")

                    val SA_VAT = of("sa_vat")

                    val US_EIN = of("us_ein")

                    val US_ITIN = of("us_itin")

                    val US_SSN = of("us_ssn")

                    val VN_TIN = of("vn_tin")

                    fun of(value: String) = IdType(JsonField.of(value))
                }

                /** An enum containing [IdType]'s known values. */
                enum class Known {
                    AR_CUIL,
                    AR_CUIT,
                    BR_CNPJ,
                    BR_CPF,
                    CL_RUN,
                    CL_RUT,
                    CO_CEDULAS,
                    CO_NIT,
                    HN_ID,
                    HN_RTN,
                    IN_LEI,
                    KR_BRN,
                    KR_CRN,
                    KR_RRN,
                    PASSPORT,
                    SA_TIN,
                    SA_VAT,
                    US_EIN,
                    US_ITIN,
                    US_SSN,
                    VN_TIN,
                }

                /**
                 * An enum containing [IdType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [IdType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AR_CUIL,
                    AR_CUIT,
                    BR_CNPJ,
                    BR_CPF,
                    CL_RUN,
                    CL_RUT,
                    CO_CEDULAS,
                    CO_NIT,
                    HN_ID,
                    HN_RTN,
                    IN_LEI,
                    KR_BRN,
                    KR_CRN,
                    KR_RRN,
                    PASSPORT,
                    SA_TIN,
                    SA_VAT,
                    US_EIN,
                    US_ITIN,
                    US_SSN,
                    VN_TIN,
                    /**
                     * An enum member indicating that [IdType] was instantiated with an unknown
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
                        AR_CUIL -> Value.AR_CUIL
                        AR_CUIT -> Value.AR_CUIT
                        BR_CNPJ -> Value.BR_CNPJ
                        BR_CPF -> Value.BR_CPF
                        CL_RUN -> Value.CL_RUN
                        CL_RUT -> Value.CL_RUT
                        CO_CEDULAS -> Value.CO_CEDULAS
                        CO_NIT -> Value.CO_NIT
                        HN_ID -> Value.HN_ID
                        HN_RTN -> Value.HN_RTN
                        IN_LEI -> Value.IN_LEI
                        KR_BRN -> Value.KR_BRN
                        KR_CRN -> Value.KR_CRN
                        KR_RRN -> Value.KR_RRN
                        PASSPORT -> Value.PASSPORT
                        SA_TIN -> Value.SA_TIN
                        SA_VAT -> Value.SA_VAT
                        US_EIN -> Value.US_EIN
                        US_ITIN -> Value.US_ITIN
                        US_SSN -> Value.US_SSN
                        VN_TIN -> Value.VN_TIN
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
                        AR_CUIL -> Known.AR_CUIL
                        AR_CUIT -> Known.AR_CUIT
                        BR_CNPJ -> Known.BR_CNPJ
                        BR_CPF -> Known.BR_CPF
                        CL_RUN -> Known.CL_RUN
                        CL_RUT -> Known.CL_RUT
                        CO_CEDULAS -> Known.CO_CEDULAS
                        CO_NIT -> Known.CO_NIT
                        HN_ID -> Known.HN_ID
                        HN_RTN -> Known.HN_RTN
                        IN_LEI -> Known.IN_LEI
                        KR_BRN -> Known.KR_BRN
                        KR_CRN -> Known.KR_CRN
                        KR_RRN -> Known.KR_RRN
                        PASSPORT -> Known.PASSPORT
                        SA_TIN -> Known.SA_TIN
                        SA_VAT -> Known.SA_VAT
                        US_EIN -> Known.US_EIN
                        US_ITIN -> Known.US_ITIN
                        US_SSN -> Known.US_SSN
                        VN_TIN -> Known.VN_TIN
                        else -> throw ModernTreasuryInvalidDataException("Unknown IdType: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is IdType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is IdentificationCreateRequest && idNumber == other.idNumber && idType == other.idType && issuingCountry == other.issuingCountry && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(idNumber, idType, issuingCountry, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "IdentificationCreateRequest{idNumber=$idNumber, idType=$idType, issuingCountry=$issuingCountry, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class LegalEntityAssociationInlineCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("relationship_types")
            @ExcludeMissing
            private val relationshipTypes: JsonField<List<RelationshipType>> = JsonMissing.of(),
            @JsonProperty("child_legal_entity")
            @ExcludeMissing
            private val childLegalEntity: JsonField<ChildLegalEntityCreate> = JsonMissing.of(),
            @JsonProperty("child_legal_entity_id")
            @ExcludeMissing
            private val childLegalEntityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ownership_percentage")
            @ExcludeMissing
            private val ownershipPercentage: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("title")
            @ExcludeMissing
            private val title: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun relationshipTypes(): List<RelationshipType> =
                relationshipTypes.getRequired("relationship_types")

            /** The child legal entity. */
            fun childLegalEntity(): ChildLegalEntityCreate? =
                childLegalEntity.getNullable("child_legal_entity")

            /** The ID of the child legal entity. */
            fun childLegalEntityId(): String? =
                childLegalEntityId.getNullable("child_legal_entity_id")

            /** The child entity's ownership percentage iff they are a beneficial owner. */
            fun ownershipPercentage(): Long? =
                ownershipPercentage.getNullable("ownership_percentage")

            /** The job title of the child entity at the parent entity. */
            fun title(): String? = title.getNullable("title")

            @JsonProperty("relationship_types")
            @ExcludeMissing
            fun _relationshipTypes(): JsonField<List<RelationshipType>> = relationshipTypes

            /** The child legal entity. */
            @JsonProperty("child_legal_entity")
            @ExcludeMissing
            fun _childLegalEntity(): JsonField<ChildLegalEntityCreate> = childLegalEntity

            /** The ID of the child legal entity. */
            @JsonProperty("child_legal_entity_id")
            @ExcludeMissing
            fun _childLegalEntityId(): JsonField<String> = childLegalEntityId

            /** The child entity's ownership percentage iff they are a beneficial owner. */
            @JsonProperty("ownership_percentage")
            @ExcludeMissing
            fun _ownershipPercentage(): JsonField<Long> = ownershipPercentage

            /** The job title of the child entity at the parent entity. */
            @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): LegalEntityAssociationInlineCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                relationshipTypes()
                childLegalEntity()?.validate()
                childLegalEntityId()
                ownershipPercentage()
                title()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun relationshipTypes(relationshipTypes: JsonField<List<RelationshipType>>) =
                    apply {
                        this.relationshipTypes = relationshipTypes.map { it.toMutableList() }
                    }

                fun addRelationshipType(relationshipType: RelationshipType) = apply {
                    relationshipTypes =
                        (relationshipTypes ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(relationshipType)
                        }
                }

                /** The child legal entity. */
                fun childLegalEntity(childLegalEntity: ChildLegalEntityCreate) =
                    childLegalEntity(JsonField.of(childLegalEntity))

                /** The child legal entity. */
                fun childLegalEntity(childLegalEntity: JsonField<ChildLegalEntityCreate>) = apply {
                    this.childLegalEntity = childLegalEntity
                }

                /** The ID of the child legal entity. */
                fun childLegalEntityId(childLegalEntityId: String) =
                    childLegalEntityId(JsonField.of(childLegalEntityId))

                /** The ID of the child legal entity. */
                fun childLegalEntityId(childLegalEntityId: JsonField<String>) = apply {
                    this.childLegalEntityId = childLegalEntityId
                }

                /** The child entity's ownership percentage iff they are a beneficial owner. */
                fun ownershipPercentage(ownershipPercentage: Long?) =
                    ownershipPercentage(JsonField.ofNullable(ownershipPercentage))

                /** The child entity's ownership percentage iff they are a beneficial owner. */
                fun ownershipPercentage(ownershipPercentage: Long) =
                    ownershipPercentage(ownershipPercentage as Long?)

                /** The child entity's ownership percentage iff they are a beneficial owner. */
                fun ownershipPercentage(ownershipPercentage: JsonField<Long>) = apply {
                    this.ownershipPercentage = ownershipPercentage
                }

                /** The job title of the child entity at the parent entity. */
                fun title(title: String?) = title(JsonField.ofNullable(title))

                /** The job title of the child entity at the parent entity. */
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

                fun build(): LegalEntityAssociationInlineCreateRequest =
                    LegalEntityAssociationInlineCreateRequest(
                        checkRequired("relationshipTypes", relationshipTypes).map {
                            it.toImmutable()
                        },
                        childLegalEntity,
                        childLegalEntityId,
                        ownershipPercentage,
                        title,
                        additionalProperties.toImmutable(),
                    )
            }

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RelationshipType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The child legal entity. */
            @NoAutoDetect
            class ChildLegalEntityCreate
            @JsonCreator
            private constructor(
                @JsonProperty("addresses")
                @ExcludeMissing
                private val addresses: JsonField<List<LegalEntityAddressCreateRequest>> =
                    JsonMissing.of(),
                @JsonProperty("bank_settings")
                @ExcludeMissing
                private val bankSettings: JsonField<BankSettings> = JsonMissing.of(),
                @JsonProperty("business_name")
                @ExcludeMissing
                private val businessName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("citizenship_country")
                @ExcludeMissing
                private val citizenshipCountry: JsonField<String> = JsonMissing.of(),
                @JsonProperty("date_formed")
                @ExcludeMissing
                private val dateFormed: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("date_of_birth")
                @ExcludeMissing
                private val dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("doing_business_as_names")
                @ExcludeMissing
                private val doingBusinessAsNames: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("email")
                @ExcludeMissing
                private val email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("first_name")
                @ExcludeMissing
                private val firstName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("identifications")
                @ExcludeMissing
                private val identifications: JsonField<List<IdentificationCreateRequest>> =
                    JsonMissing.of(),
                @JsonProperty("last_name")
                @ExcludeMissing
                private val lastName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("legal_entity_type")
                @ExcludeMissing
                private val legalEntityType: JsonField<LegalEntityType> = JsonMissing.of(),
                @JsonProperty("legal_structure")
                @ExcludeMissing
                private val legalStructure: JsonField<LegalStructure> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                private val metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("middle_name")
                @ExcludeMissing
                private val middleName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone_numbers")
                @ExcludeMissing
                private val phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of(),
                @JsonProperty("politically_exposed_person")
                @ExcludeMissing
                private val politicallyExposedPerson: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("preferred_name")
                @ExcludeMissing
                private val preferredName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("prefix")
                @ExcludeMissing
                private val prefix: JsonField<String> = JsonMissing.of(),
                @JsonProperty("risk_rating")
                @ExcludeMissing
                private val riskRating: JsonField<RiskRating> = JsonMissing.of(),
                @JsonProperty("suffix")
                @ExcludeMissing
                private val suffix: JsonField<String> = JsonMissing.of(),
                @JsonProperty("wealth_and_employment_details")
                @ExcludeMissing
                private val wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails> =
                    JsonMissing.of(),
                @JsonProperty("website")
                @ExcludeMissing
                private val website: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** A list of addresses for the entity. */
                fun addresses(): List<LegalEntityAddressCreateRequest>? =
                    addresses.getNullable("addresses")

                fun bankSettings(): BankSettings? = bankSettings.getNullable("bank_settings")

                /** The business's legal business name. */
                fun businessName(): String? = businessName.getNullable("business_name")

                /** The country of citizenship for an individual. */
                fun citizenshipCountry(): String? =
                    citizenshipCountry.getNullable("citizenship_country")

                /** A business's formation date (YYYY-MM-DD). */
                fun dateFormed(): LocalDate? = dateFormed.getNullable("date_formed")

                /** An individual's date of birth (YYYY-MM-DD). */
                fun dateOfBirth(): LocalDate? = dateOfBirth.getNullable("date_of_birth")

                fun doingBusinessAsNames(): List<String>? =
                    doingBusinessAsNames.getNullable("doing_business_as_names")

                /** The entity's primary email. */
                fun email(): String? = email.getNullable("email")

                /** An individual's first name. */
                fun firstName(): String? = firstName.getNullable("first_name")

                /** A list of identifications for the legal entity. */
                fun identifications(): List<IdentificationCreateRequest>? =
                    identifications.getNullable("identifications")

                /** An individual's last name. */
                fun lastName(): String? = lastName.getNullable("last_name")

                /** The type of legal entity. */
                fun legalEntityType(): LegalEntityType? =
                    legalEntityType.getNullable("legal_entity_type")

                /** The business's legal structure. */
                fun legalStructure(): LegalStructure? =
                    legalStructure.getNullable("legal_structure")

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /** An individual's middle name. */
                fun middleName(): String? = middleName.getNullable("middle_name")

                fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers.getNullable("phone_numbers")

                /** Whether the individual is a politically exposed person. */
                fun politicallyExposedPerson(): Boolean? =
                    politicallyExposedPerson.getNullable("politically_exposed_person")

                /** An individual's preferred name. */
                fun preferredName(): String? = preferredName.getNullable("preferred_name")

                /** An individual's prefix. */
                fun prefix(): String? = prefix.getNullable("prefix")

                /** The risk rating of the legal entity. One of low, medium, high. */
                fun riskRating(): RiskRating? = riskRating.getNullable("risk_rating")

                /** An individual's suffix. */
                fun suffix(): String? = suffix.getNullable("suffix")

                fun wealthAndEmploymentDetails(): WealthAndEmploymentDetails? =
                    wealthAndEmploymentDetails.getNullable("wealth_and_employment_details")

                /** The entity's primary website URL. */
                fun website(): String? = website.getNullable("website")

                /** A list of addresses for the entity. */
                @JsonProperty("addresses")
                @ExcludeMissing
                fun _addresses(): JsonField<List<LegalEntityAddressCreateRequest>> = addresses

                @JsonProperty("bank_settings")
                @ExcludeMissing
                fun _bankSettings(): JsonField<BankSettings> = bankSettings

                /** The business's legal business name. */
                @JsonProperty("business_name")
                @ExcludeMissing
                fun _businessName(): JsonField<String> = businessName

                /** The country of citizenship for an individual. */
                @JsonProperty("citizenship_country")
                @ExcludeMissing
                fun _citizenshipCountry(): JsonField<String> = citizenshipCountry

                /** A business's formation date (YYYY-MM-DD). */
                @JsonProperty("date_formed")
                @ExcludeMissing
                fun _dateFormed(): JsonField<LocalDate> = dateFormed

                /** An individual's date of birth (YYYY-MM-DD). */
                @JsonProperty("date_of_birth")
                @ExcludeMissing
                fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

                @JsonProperty("doing_business_as_names")
                @ExcludeMissing
                fun _doingBusinessAsNames(): JsonField<List<String>> = doingBusinessAsNames

                /** The entity's primary email. */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                /** An individual's first name. */
                @JsonProperty("first_name")
                @ExcludeMissing
                fun _firstName(): JsonField<String> = firstName

                /** A list of identifications for the legal entity. */
                @JsonProperty("identifications")
                @ExcludeMissing
                fun _identifications(): JsonField<List<IdentificationCreateRequest>> =
                    identifications

                /** An individual's last name. */
                @JsonProperty("last_name")
                @ExcludeMissing
                fun _lastName(): JsonField<String> = lastName

                /** The type of legal entity. */
                @JsonProperty("legal_entity_type")
                @ExcludeMissing
                fun _legalEntityType(): JsonField<LegalEntityType> = legalEntityType

                /** The business's legal structure. */
                @JsonProperty("legal_structure")
                @ExcludeMissing
                fun _legalStructure(): JsonField<LegalStructure> = legalStructure

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /** An individual's middle name. */
                @JsonProperty("middle_name")
                @ExcludeMissing
                fun _middleName(): JsonField<String> = middleName

                @JsonProperty("phone_numbers")
                @ExcludeMissing
                fun _phoneNumbers(): JsonField<List<PhoneNumber>> = phoneNumbers

                /** Whether the individual is a politically exposed person. */
                @JsonProperty("politically_exposed_person")
                @ExcludeMissing
                fun _politicallyExposedPerson(): JsonField<Boolean> = politicallyExposedPerson

                /** An individual's preferred name. */
                @JsonProperty("preferred_name")
                @ExcludeMissing
                fun _preferredName(): JsonField<String> = preferredName

                /** An individual's prefix. */
                @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

                /** The risk rating of the legal entity. One of low, medium, high. */
                @JsonProperty("risk_rating")
                @ExcludeMissing
                fun _riskRating(): JsonField<RiskRating> = riskRating

                /** An individual's suffix. */
                @JsonProperty("suffix") @ExcludeMissing fun _suffix(): JsonField<String> = suffix

                @JsonProperty("wealth_and_employment_details")
                @ExcludeMissing
                fun _wealthAndEmploymentDetails(): JsonField<WealthAndEmploymentDetails> =
                    wealthAndEmploymentDetails

                /** The entity's primary website URL. */
                @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ChildLegalEntityCreate = apply {
                    if (validated) {
                        return@apply
                    }

                    addresses()?.forEach { it.validate() }
                    bankSettings()?.validate()
                    businessName()
                    citizenshipCountry()
                    dateFormed()
                    dateOfBirth()
                    doingBusinessAsNames()
                    email()
                    firstName()
                    identifications()?.forEach { it.validate() }
                    lastName()
                    legalEntityType()
                    legalStructure()
                    metadata()?.validate()
                    middleName()
                    phoneNumbers()?.forEach { it.validate() }
                    politicallyExposedPerson()
                    preferredName()
                    prefix()
                    riskRating()
                    suffix()
                    wealthAndEmploymentDetails()?.validate()
                    website()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                /** A builder for [ChildLegalEntityCreate]. */
                class Builder internal constructor() {

                    private var addresses:
                        JsonField<MutableList<LegalEntityAddressCreateRequest>>? =
                        null
                    private var bankSettings: JsonField<BankSettings> = JsonMissing.of()
                    private var businessName: JsonField<String> = JsonMissing.of()
                    private var citizenshipCountry: JsonField<String> = JsonMissing.of()
                    private var dateFormed: JsonField<LocalDate> = JsonMissing.of()
                    private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
                    private var doingBusinessAsNames: JsonField<MutableList<String>>? = null
                    private var email: JsonField<String> = JsonMissing.of()
                    private var firstName: JsonField<String> = JsonMissing.of()
                    private var identifications:
                        JsonField<MutableList<IdentificationCreateRequest>>? =
                        null
                    private var lastName: JsonField<String> = JsonMissing.of()
                    private var legalEntityType: JsonField<LegalEntityType> = JsonMissing.of()
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

                    internal fun from(childLegalEntityCreate: ChildLegalEntityCreate) = apply {
                        addresses = childLegalEntityCreate.addresses.map { it.toMutableList() }
                        bankSettings = childLegalEntityCreate.bankSettings
                        businessName = childLegalEntityCreate.businessName
                        citizenshipCountry = childLegalEntityCreate.citizenshipCountry
                        dateFormed = childLegalEntityCreate.dateFormed
                        dateOfBirth = childLegalEntityCreate.dateOfBirth
                        doingBusinessAsNames =
                            childLegalEntityCreate.doingBusinessAsNames.map { it.toMutableList() }
                        email = childLegalEntityCreate.email
                        firstName = childLegalEntityCreate.firstName
                        identifications =
                            childLegalEntityCreate.identifications.map { it.toMutableList() }
                        lastName = childLegalEntityCreate.lastName
                        legalEntityType = childLegalEntityCreate.legalEntityType
                        legalStructure = childLegalEntityCreate.legalStructure
                        metadata = childLegalEntityCreate.metadata
                        middleName = childLegalEntityCreate.middleName
                        phoneNumbers =
                            childLegalEntityCreate.phoneNumbers.map { it.toMutableList() }
                        politicallyExposedPerson = childLegalEntityCreate.politicallyExposedPerson
                        preferredName = childLegalEntityCreate.preferredName
                        prefix = childLegalEntityCreate.prefix
                        riskRating = childLegalEntityCreate.riskRating
                        suffix = childLegalEntityCreate.suffix
                        wealthAndEmploymentDetails =
                            childLegalEntityCreate.wealthAndEmploymentDetails
                        website = childLegalEntityCreate.website
                        additionalProperties =
                            childLegalEntityCreate.additionalProperties.toMutableMap()
                    }

                    /** A list of addresses for the entity. */
                    fun addresses(addresses: List<LegalEntityAddressCreateRequest>) =
                        addresses(JsonField.of(addresses))

                    /** A list of addresses for the entity. */
                    fun addresses(addresses: JsonField<List<LegalEntityAddressCreateRequest>>) =
                        apply {
                            this.addresses = addresses.map { it.toMutableList() }
                        }

                    /** A list of addresses for the entity. */
                    fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
                        addresses =
                            (addresses ?: JsonField.of(mutableListOf())).apply {
                                (asKnown()
                                        ?: throw IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        ))
                                    .add(address)
                            }
                    }

                    fun bankSettings(bankSettings: BankSettings?) =
                        bankSettings(JsonField.ofNullable(bankSettings))

                    fun bankSettings(bankSettings: JsonField<BankSettings>) = apply {
                        this.bankSettings = bankSettings
                    }

                    /** The business's legal business name. */
                    fun businessName(businessName: String?) =
                        businessName(JsonField.ofNullable(businessName))

                    /** The business's legal business name. */
                    fun businessName(businessName: JsonField<String>) = apply {
                        this.businessName = businessName
                    }

                    /** The country of citizenship for an individual. */
                    fun citizenshipCountry(citizenshipCountry: String?) =
                        citizenshipCountry(JsonField.ofNullable(citizenshipCountry))

                    /** The country of citizenship for an individual. */
                    fun citizenshipCountry(citizenshipCountry: JsonField<String>) = apply {
                        this.citizenshipCountry = citizenshipCountry
                    }

                    /** A business's formation date (YYYY-MM-DD). */
                    fun dateFormed(dateFormed: LocalDate?) =
                        dateFormed(JsonField.ofNullable(dateFormed))

                    /** A business's formation date (YYYY-MM-DD). */
                    fun dateFormed(dateFormed: JsonField<LocalDate>) = apply {
                        this.dateFormed = dateFormed
                    }

                    /** An individual's date of birth (YYYY-MM-DD). */
                    fun dateOfBirth(dateOfBirth: LocalDate?) =
                        dateOfBirth(JsonField.ofNullable(dateOfBirth))

                    /** An individual's date of birth (YYYY-MM-DD). */
                    fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    fun doingBusinessAsNames(doingBusinessAsNames: List<String>) =
                        doingBusinessAsNames(JsonField.of(doingBusinessAsNames))

                    fun doingBusinessAsNames(doingBusinessAsNames: JsonField<List<String>>) =
                        apply {
                            this.doingBusinessAsNames =
                                doingBusinessAsNames.map { it.toMutableList() }
                        }

                    fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
                        doingBusinessAsNames =
                            (doingBusinessAsNames ?: JsonField.of(mutableListOf())).apply {
                                (asKnown()
                                        ?: throw IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        ))
                                    .add(doingBusinessAsName)
                            }
                    }

                    /** The entity's primary email. */
                    fun email(email: String?) = email(JsonField.ofNullable(email))

                    /** The entity's primary email. */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    /** An individual's first name. */
                    fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

                    /** An individual's first name. */
                    fun firstName(firstName: JsonField<String>) = apply {
                        this.firstName = firstName
                    }

                    /** A list of identifications for the legal entity. */
                    fun identifications(identifications: List<IdentificationCreateRequest>) =
                        identifications(JsonField.of(identifications))

                    /** A list of identifications for the legal entity. */
                    fun identifications(
                        identifications: JsonField<List<IdentificationCreateRequest>>
                    ) = apply { this.identifications = identifications.map { it.toMutableList() } }

                    /** A list of identifications for the legal entity. */
                    fun addIdentification(identification: IdentificationCreateRequest) = apply {
                        identifications =
                            (identifications ?: JsonField.of(mutableListOf())).apply {
                                (asKnown()
                                        ?: throw IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        ))
                                    .add(identification)
                            }
                    }

                    /** An individual's last name. */
                    fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

                    /** An individual's last name. */
                    fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

                    /** The type of legal entity. */
                    fun legalEntityType(legalEntityType: LegalEntityType) =
                        legalEntityType(JsonField.of(legalEntityType))

                    /** The type of legal entity. */
                    fun legalEntityType(legalEntityType: JsonField<LegalEntityType>) = apply {
                        this.legalEntityType = legalEntityType
                    }

                    /** The business's legal structure. */
                    fun legalStructure(legalStructure: LegalStructure?) =
                        legalStructure(JsonField.ofNullable(legalStructure))

                    /** The business's legal structure. */
                    fun legalStructure(legalStructure: JsonField<LegalStructure>) = apply {
                        this.legalStructure = legalStructure
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /** An individual's middle name. */
                    fun middleName(middleName: String?) =
                        middleName(JsonField.ofNullable(middleName))

                    /** An individual's middle name. */
                    fun middleName(middleName: JsonField<String>) = apply {
                        this.middleName = middleName
                    }

                    fun phoneNumbers(phoneNumbers: List<PhoneNumber>) =
                        phoneNumbers(JsonField.of(phoneNumbers))

                    fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber>>) = apply {
                        this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
                    }

                    fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
                        phoneNumbers =
                            (phoneNumbers ?: JsonField.of(mutableListOf())).apply {
                                (asKnown()
                                        ?: throw IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        ))
                                    .add(phoneNumber)
                            }
                    }

                    /** Whether the individual is a politically exposed person. */
                    fun politicallyExposedPerson(politicallyExposedPerson: Boolean?) =
                        politicallyExposedPerson(JsonField.ofNullable(politicallyExposedPerson))

                    /** Whether the individual is a politically exposed person. */
                    fun politicallyExposedPerson(politicallyExposedPerson: Boolean) =
                        politicallyExposedPerson(politicallyExposedPerson as Boolean?)

                    /** Whether the individual is a politically exposed person. */
                    fun politicallyExposedPerson(politicallyExposedPerson: JsonField<Boolean>) =
                        apply {
                            this.politicallyExposedPerson = politicallyExposedPerson
                        }

                    /** An individual's preferred name. */
                    fun preferredName(preferredName: String?) =
                        preferredName(JsonField.ofNullable(preferredName))

                    /** An individual's preferred name. */
                    fun preferredName(preferredName: JsonField<String>) = apply {
                        this.preferredName = preferredName
                    }

                    /** An individual's prefix. */
                    fun prefix(prefix: String?) = prefix(JsonField.ofNullable(prefix))

                    /** An individual's prefix. */
                    fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                    /** The risk rating of the legal entity. One of low, medium, high. */
                    fun riskRating(riskRating: RiskRating?) =
                        riskRating(JsonField.ofNullable(riskRating))

                    /** The risk rating of the legal entity. One of low, medium, high. */
                    fun riskRating(riskRating: JsonField<RiskRating>) = apply {
                        this.riskRating = riskRating
                    }

                    /** An individual's suffix. */
                    fun suffix(suffix: String?) = suffix(JsonField.ofNullable(suffix))

                    /** An individual's suffix. */
                    fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

                    fun wealthAndEmploymentDetails(
                        wealthAndEmploymentDetails: WealthAndEmploymentDetails?
                    ) = wealthAndEmploymentDetails(JsonField.ofNullable(wealthAndEmploymentDetails))

                    fun wealthAndEmploymentDetails(
                        wealthAndEmploymentDetails: JsonField<WealthAndEmploymentDetails>
                    ) = apply { this.wealthAndEmploymentDetails = wealthAndEmploymentDetails }

                    /** The entity's primary website URL. */
                    fun website(website: String?) = website(JsonField.ofNullable(website))

                    /** The entity's primary website URL. */
                    fun website(website: JsonField<String>) = apply { this.website = website }

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

                    fun build(): ChildLegalEntityCreate =
                        ChildLegalEntityCreate(
                            (addresses ?: JsonMissing.of()).map { it.toImmutable() },
                            bankSettings,
                            businessName,
                            citizenshipCountry,
                            dateFormed,
                            dateOfBirth,
                            (doingBusinessAsNames ?: JsonMissing.of()).map { it.toImmutable() },
                            email,
                            firstName,
                            (identifications ?: JsonMissing.of()).map { it.toImmutable() },
                            lastName,
                            legalEntityType,
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
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class LegalEntityAddressCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("country")
                    @ExcludeMissing
                    private val country: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line1")
                    @ExcludeMissing
                    private val line1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("locality")
                    @ExcludeMissing
                    private val locality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("postal_code")
                    @ExcludeMissing
                    private val postalCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("region")
                    @ExcludeMissing
                    private val region: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address_types")
                    @ExcludeMissing
                    private val addressTypes: JsonField<List<AddressType>> = JsonMissing.of(),
                    @JsonProperty("line2")
                    @ExcludeMissing
                    private val line2: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    fun country(): String? = country.getNullable("country")

                    fun line1(): String? = line1.getNullable("line1")

                    /** Locality or City. */
                    fun locality(): String? = locality.getNullable("locality")

                    /** The postal code of the address. */
                    fun postalCode(): String? = postalCode.getNullable("postal_code")

                    /** Region or State. */
                    fun region(): String? = region.getNullable("region")

                    /** The types of this address. */
                    fun addressTypes(): List<AddressType>? =
                        addressTypes.getNullable("address_types")

                    fun line2(): String? = line2.getNullable("line2")

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    @JsonProperty("country")
                    @ExcludeMissing
                    fun _country(): JsonField<String> = country

                    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                    /** Locality or City. */
                    @JsonProperty("locality")
                    @ExcludeMissing
                    fun _locality(): JsonField<String> = locality

                    /** The postal code of the address. */
                    @JsonProperty("postal_code")
                    @ExcludeMissing
                    fun _postalCode(): JsonField<String> = postalCode

                    /** Region or State. */
                    @JsonProperty("region")
                    @ExcludeMissing
                    fun _region(): JsonField<String> = region

                    /** The types of this address. */
                    @JsonProperty("address_types")
                    @ExcludeMissing
                    fun _addressTypes(): JsonField<List<AddressType>> = addressTypes

                    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): LegalEntityAddressCreateRequest = apply {
                        if (validated) {
                            return@apply
                        }

                        country()
                        line1()
                        locality()
                        postalCode()
                        region()
                        addressTypes()
                        line2()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    /** A builder for [LegalEntityAddressCreateRequest]. */
                    class Builder internal constructor() {

                        private var country: JsonField<String>? = null
                        private var line1: JsonField<String>? = null
                        private var locality: JsonField<String>? = null
                        private var postalCode: JsonField<String>? = null
                        private var region: JsonField<String>? = null
                        private var addressTypes: JsonField<MutableList<AddressType>>? = null
                        private var line2: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest
                        ) = apply {
                            country = legalEntityAddressCreateRequest.country
                            line1 = legalEntityAddressCreateRequest.line1
                            locality = legalEntityAddressCreateRequest.locality
                            postalCode = legalEntityAddressCreateRequest.postalCode
                            region = legalEntityAddressCreateRequest.region
                            addressTypes =
                                legalEntityAddressCreateRequest.addressTypes.map {
                                    it.toMutableList()
                                }
                            line2 = legalEntityAddressCreateRequest.line2
                            additionalProperties =
                                legalEntityAddressCreateRequest.additionalProperties.toMutableMap()
                        }

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: String?) = country(JsonField.ofNullable(country))

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: JsonField<String>) = apply { this.country = country }

                        fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                        /** Locality or City. */
                        fun locality(locality: String?) = locality(JsonField.ofNullable(locality))

                        /** Locality or City. */
                        fun locality(locality: JsonField<String>) = apply {
                            this.locality = locality
                        }

                        /** The postal code of the address. */
                        fun postalCode(postalCode: String?) =
                            postalCode(JsonField.ofNullable(postalCode))

                        /** The postal code of the address. */
                        fun postalCode(postalCode: JsonField<String>) = apply {
                            this.postalCode = postalCode
                        }

                        /** Region or State. */
                        fun region(region: String?) = region(JsonField.ofNullable(region))

                        /** Region or State. */
                        fun region(region: JsonField<String>) = apply { this.region = region }

                        /** The types of this address. */
                        fun addressTypes(addressTypes: List<AddressType>) =
                            addressTypes(JsonField.of(addressTypes))

                        /** The types of this address. */
                        fun addressTypes(addressTypes: JsonField<List<AddressType>>) = apply {
                            this.addressTypes = addressTypes.map { it.toMutableList() }
                        }

                        /** The types of this address. */
                        fun addAddressType(addressType: AddressType) = apply {
                            addressTypes =
                                (addressTypes ?: JsonField.of(mutableListOf())).apply {
                                    (asKnown()
                                            ?: throw IllegalStateException(
                                                "Field was set to non-list type: ${javaClass.simpleName}"
                                            ))
                                        .add(addressType)
                                }
                        }

                        fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): LegalEntityAddressCreateRequest =
                            LegalEntityAddressCreateRequest(
                                checkRequired("country", country),
                                checkRequired("line1", line1),
                                checkRequired("locality", locality),
                                checkRequired("postalCode", postalCode),
                                checkRequired("region", region),
                                (addressTypes ?: JsonMissing.of()).map { it.toImmutable() },
                                line2,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class AddressType
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val BUSINESS = of("business")

                            val MAILING = of("mailing")

                            val OTHER = of("other")

                            val PO_BOX = of("po_box")

                            val RESIDENTIAL = of("residential")

                            fun of(value: String) = AddressType(JsonField.of(value))
                        }

                        /** An enum containing [AddressType]'s known values. */
                        enum class Known {
                            BUSINESS,
                            MAILING,
                            OTHER,
                            PO_BOX,
                            RESIDENTIAL,
                        }

                        /**
                         * An enum containing [AddressType]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [AddressType] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            BUSINESS,
                            MAILING,
                            OTHER,
                            PO_BOX,
                            RESIDENTIAL,
                            /**
                             * An enum member indicating that [AddressType] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                BUSINESS -> Value.BUSINESS
                                MAILING -> Value.MAILING
                                OTHER -> Value.OTHER
                                PO_BOX -> Value.PO_BOX
                                RESIDENTIAL -> Value.RESIDENTIAL
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   is a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                BUSINESS -> Known.BUSINESS
                                MAILING -> Known.MAILING
                                OTHER -> Known.OTHER
                                PO_BOX -> Known.PO_BOX
                                RESIDENTIAL -> Known.RESIDENTIAL
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown AddressType: $value"
                                    )
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   does not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString()
                                ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is AddressType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LegalEntityAddressCreateRequest && country == other.country && line1 == other.line1 && locality == other.locality && postalCode == other.postalCode && region == other.region && addressTypes == other.addressTypes && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(country, line1, locality, postalCode, region, addressTypes, line2, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LegalEntityAddressCreateRequest{country=$country, line1=$line1, locality=$locality, postalCode=$postalCode, region=$region, addressTypes=$addressTypes, line2=$line2, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class IdentificationCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("id_number")
                    @ExcludeMissing
                    private val idNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("id_type")
                    @ExcludeMissing
                    private val idType: JsonField<IdType> = JsonMissing.of(),
                    @JsonProperty("issuing_country")
                    @ExcludeMissing
                    private val issuingCountry: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The ID number of identification document. */
                    fun idNumber(): String = idNumber.getRequired("id_number")

                    /** The type of ID number. */
                    fun idType(): IdType = idType.getRequired("id_type")

                    /**
                     * The ISO 3166-1 alpha-2 country code of the country that issued the
                     * identification
                     */
                    fun issuingCountry(): String? = issuingCountry.getNullable("issuing_country")

                    /** The ID number of identification document. */
                    @JsonProperty("id_number")
                    @ExcludeMissing
                    fun _idNumber(): JsonField<String> = idNumber

                    /** The type of ID number. */
                    @JsonProperty("id_type")
                    @ExcludeMissing
                    fun _idType(): JsonField<IdType> = idType

                    /**
                     * The ISO 3166-1 alpha-2 country code of the country that issued the
                     * identification
                     */
                    @JsonProperty("issuing_country")
                    @ExcludeMissing
                    fun _issuingCountry(): JsonField<String> = issuingCountry

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): IdentificationCreateRequest = apply {
                        if (validated) {
                            return@apply
                        }

                        idNumber()
                        idType()
                        issuingCountry()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    /** A builder for [IdentificationCreateRequest]. */
                    class Builder internal constructor() {

                        private var idNumber: JsonField<String>? = null
                        private var idType: JsonField<IdType>? = null
                        private var issuingCountry: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            identificationCreateRequest: IdentificationCreateRequest
                        ) = apply {
                            idNumber = identificationCreateRequest.idNumber
                            idType = identificationCreateRequest.idType
                            issuingCountry = identificationCreateRequest.issuingCountry
                            additionalProperties =
                                identificationCreateRequest.additionalProperties.toMutableMap()
                        }

                        /** The ID number of identification document. */
                        fun idNumber(idNumber: String) = idNumber(JsonField.of(idNumber))

                        /** The ID number of identification document. */
                        fun idNumber(idNumber: JsonField<String>) = apply {
                            this.idNumber = idNumber
                        }

                        /** The type of ID number. */
                        fun idType(idType: IdType) = idType(JsonField.of(idType))

                        /** The type of ID number. */
                        fun idType(idType: JsonField<IdType>) = apply { this.idType = idType }

                        /**
                         * The ISO 3166-1 alpha-2 country code of the country that issued the
                         * identification
                         */
                        fun issuingCountry(issuingCountry: String?) =
                            issuingCountry(JsonField.ofNullable(issuingCountry))

                        /**
                         * The ISO 3166-1 alpha-2 country code of the country that issued the
                         * identification
                         */
                        fun issuingCountry(issuingCountry: JsonField<String>) = apply {
                            this.issuingCountry = issuingCountry
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): IdentificationCreateRequest =
                            IdentificationCreateRequest(
                                checkRequired("idNumber", idNumber),
                                checkRequired("idType", idType),
                                issuingCountry,
                                additionalProperties.toImmutable(),
                            )
                    }

                    /** The type of ID number. */
                    class IdType
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val AR_CUIL = of("ar_cuil")

                            val AR_CUIT = of("ar_cuit")

                            val BR_CNPJ = of("br_cnpj")

                            val BR_CPF = of("br_cpf")

                            val CL_RUN = of("cl_run")

                            val CL_RUT = of("cl_rut")

                            val CO_CEDULAS = of("co_cedulas")

                            val CO_NIT = of("co_nit")

                            val HN_ID = of("hn_id")

                            val HN_RTN = of("hn_rtn")

                            val IN_LEI = of("in_lei")

                            val KR_BRN = of("kr_brn")

                            val KR_CRN = of("kr_crn")

                            val KR_RRN = of("kr_rrn")

                            val PASSPORT = of("passport")

                            val SA_TIN = of("sa_tin")

                            val SA_VAT = of("sa_vat")

                            val US_EIN = of("us_ein")

                            val US_ITIN = of("us_itin")

                            val US_SSN = of("us_ssn")

                            val VN_TIN = of("vn_tin")

                            fun of(value: String) = IdType(JsonField.of(value))
                        }

                        /** An enum containing [IdType]'s known values. */
                        enum class Known {
                            AR_CUIL,
                            AR_CUIT,
                            BR_CNPJ,
                            BR_CPF,
                            CL_RUN,
                            CL_RUT,
                            CO_CEDULAS,
                            CO_NIT,
                            HN_ID,
                            HN_RTN,
                            IN_LEI,
                            KR_BRN,
                            KR_CRN,
                            KR_RRN,
                            PASSPORT,
                            SA_TIN,
                            SA_VAT,
                            US_EIN,
                            US_ITIN,
                            US_SSN,
                            VN_TIN,
                        }

                        /**
                         * An enum containing [IdType]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [IdType] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            AR_CUIL,
                            AR_CUIT,
                            BR_CNPJ,
                            BR_CPF,
                            CL_RUN,
                            CL_RUT,
                            CO_CEDULAS,
                            CO_NIT,
                            HN_ID,
                            HN_RTN,
                            IN_LEI,
                            KR_BRN,
                            KR_CRN,
                            KR_RRN,
                            PASSPORT,
                            SA_TIN,
                            SA_VAT,
                            US_EIN,
                            US_ITIN,
                            US_SSN,
                            VN_TIN,
                            /**
                             * An enum member indicating that [IdType] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                AR_CUIL -> Value.AR_CUIL
                                AR_CUIT -> Value.AR_CUIT
                                BR_CNPJ -> Value.BR_CNPJ
                                BR_CPF -> Value.BR_CPF
                                CL_RUN -> Value.CL_RUN
                                CL_RUT -> Value.CL_RUT
                                CO_CEDULAS -> Value.CO_CEDULAS
                                CO_NIT -> Value.CO_NIT
                                HN_ID -> Value.HN_ID
                                HN_RTN -> Value.HN_RTN
                                IN_LEI -> Value.IN_LEI
                                KR_BRN -> Value.KR_BRN
                                KR_CRN -> Value.KR_CRN
                                KR_RRN -> Value.KR_RRN
                                PASSPORT -> Value.PASSPORT
                                SA_TIN -> Value.SA_TIN
                                SA_VAT -> Value.SA_VAT
                                US_EIN -> Value.US_EIN
                                US_ITIN -> Value.US_ITIN
                                US_SSN -> Value.US_SSN
                                VN_TIN -> Value.VN_TIN
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   is a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                AR_CUIL -> Known.AR_CUIL
                                AR_CUIT -> Known.AR_CUIT
                                BR_CNPJ -> Known.BR_CNPJ
                                BR_CPF -> Known.BR_CPF
                                CL_RUN -> Known.CL_RUN
                                CL_RUT -> Known.CL_RUT
                                CO_CEDULAS -> Known.CO_CEDULAS
                                CO_NIT -> Known.CO_NIT
                                HN_ID -> Known.HN_ID
                                HN_RTN -> Known.HN_RTN
                                IN_LEI -> Known.IN_LEI
                                KR_BRN -> Known.KR_BRN
                                KR_CRN -> Known.KR_CRN
                                KR_RRN -> Known.KR_RRN
                                PASSPORT -> Known.PASSPORT
                                SA_TIN -> Known.SA_TIN
                                SA_VAT -> Known.SA_VAT
                                US_EIN -> Known.US_EIN
                                US_ITIN -> Known.US_ITIN
                                US_SSN -> Known.US_SSN
                                VN_TIN -> Known.VN_TIN
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown IdType: $value"
                                    )
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws ModernTreasuryInvalidDataException if this class instance's value
                         *   does not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString()
                                ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is IdType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is IdentificationCreateRequest && idNumber == other.idNumber && idType == other.idType && issuingCountry == other.issuingCountry && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(idNumber, idType, issuingCountry, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "IdentificationCreateRequest{idNumber=$idNumber, idType=$idType, issuingCountry=$issuingCountry, additionalProperties=$additionalProperties}"
                }

                /** The type of legal entity. */
                class LegalEntityType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * An enum containing [LegalEntityType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [LegalEntityType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        BUSINESS,
                        INDIVIDUAL,
                        /**
                         * An enum member indicating that [LegalEntityType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws ModernTreasuryInvalidDataException if this class instance's value is
                     *   a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            BUSINESS -> Known.BUSINESS
                            INDIVIDUAL -> Known.INDIVIDUAL
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown LegalEntityType: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws ModernTreasuryInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LegalEntityType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** The business's legal structure. */
                class LegalStructure
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * An enum containing [LegalStructure]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [LegalStructure] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
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
                         * An enum member indicating that [LegalStructure] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws ModernTreasuryInvalidDataException if this class instance's value is
                     *   a not a known member.
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
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown LegalStructure: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws ModernTreasuryInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw ModernTreasuryInvalidDataException("Value is not a String")

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
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @NoAutoDetect
                class Metadata
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Metadata = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    /** A builder for [Metadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

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

                /** A list of phone numbers in E.164 format. */
                @NoAutoDetect
                class PhoneNumber
                @JsonCreator
                private constructor(
                    @JsonProperty("phone_number")
                    @ExcludeMissing
                    private val phoneNumber: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

                    @JsonProperty("phone_number")
                    @ExcludeMissing
                    fun _phoneNumber(): JsonField<String> = phoneNumber

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): PhoneNumber = apply {
                        if (validated) {
                            return@apply
                        }

                        phoneNumber()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    /** A builder for [PhoneNumber]. */
                    class Builder internal constructor() {

                        private var phoneNumber: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(phoneNumber: PhoneNumber) = apply {
                            this.phoneNumber = phoneNumber.phoneNumber
                            additionalProperties = phoneNumber.additionalProperties.toMutableMap()
                        }

                        fun phoneNumber(phoneNumber: String) =
                            phoneNumber(JsonField.of(phoneNumber))

                        fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                            this.phoneNumber = phoneNumber
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): PhoneNumber =
                            PhoneNumber(phoneNumber, additionalProperties.toImmutable())
                    }

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
                class RiskRating
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * An enum containing [RiskRating]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [RiskRating] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        LOW,
                        MEDIUM,
                        HIGH,
                        /**
                         * An enum member indicating that [RiskRating] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws ModernTreasuryInvalidDataException if this class instance's value is
                     *   a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            LOW -> Known.LOW
                            MEDIUM -> Known.MEDIUM
                            HIGH -> Known.HIGH
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown RiskRating: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws ModernTreasuryInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw ModernTreasuryInvalidDataException("Value is not a String")

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

                    return /* spotless:off */ other is ChildLegalEntityCreate && addresses == other.addresses && bankSettings == other.bankSettings && businessName == other.businessName && citizenshipCountry == other.citizenshipCountry && dateFormed == other.dateFormed && dateOfBirth == other.dateOfBirth && doingBusinessAsNames == other.doingBusinessAsNames && email == other.email && firstName == other.firstName && identifications == other.identifications && lastName == other.lastName && legalEntityType == other.legalEntityType && legalStructure == other.legalStructure && metadata == other.metadata && middleName == other.middleName && phoneNumbers == other.phoneNumbers && politicallyExposedPerson == other.politicallyExposedPerson && preferredName == other.preferredName && prefix == other.prefix && riskRating == other.riskRating && suffix == other.suffix && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && website == other.website && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(addresses, bankSettings, businessName, citizenshipCountry, dateFormed, dateOfBirth, doingBusinessAsNames, email, firstName, identifications, lastName, legalEntityType, legalStructure, metadata, middleName, phoneNumbers, politicallyExposedPerson, preferredName, prefix, riskRating, suffix, wealthAndEmploymentDetails, website, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ChildLegalEntityCreate{addresses=$addresses, bankSettings=$bankSettings, businessName=$businessName, citizenshipCountry=$citizenshipCountry, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, lastName=$lastName, legalEntityType=$legalEntityType, legalStructure=$legalStructure, metadata=$metadata, middleName=$middleName, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, riskRating=$riskRating, suffix=$suffix, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, additionalProperties=$additionalProperties}"
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
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

        /** A list of phone numbers in E.164 format. */
        @NoAutoDetect
        class PhoneNumber
        @JsonCreator
        private constructor(
            @JsonProperty("phone_number")
            @ExcludeMissing
            private val phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PhoneNumber = apply {
                if (validated) {
                    return@apply
                }

                phoneNumber()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): PhoneNumber =
                    PhoneNumber(phoneNumber, additionalProperties.toImmutable())
            }

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

            return /* spotless:off */ other is LegalEntityCreateRequest && legalEntityType == other.legalEntityType && addresses == other.addresses && bankSettings == other.bankSettings && businessName == other.businessName && citizenshipCountry == other.citizenshipCountry && dateFormed == other.dateFormed && dateOfBirth == other.dateOfBirth && doingBusinessAsNames == other.doingBusinessAsNames && email == other.email && firstName == other.firstName && identifications == other.identifications && lastName == other.lastName && legalEntityAssociations == other.legalEntityAssociations && legalStructure == other.legalStructure && metadata == other.metadata && middleName == other.middleName && phoneNumbers == other.phoneNumbers && politicallyExposedPerson == other.politicallyExposedPerson && preferredName == other.preferredName && prefix == other.prefix && riskRating == other.riskRating && suffix == other.suffix && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && website == other.website && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(legalEntityType, addresses, bankSettings, businessName, citizenshipCountry, dateFormed, dateOfBirth, doingBusinessAsNames, email, firstName, identifications, lastName, legalEntityAssociations, legalStructure, metadata, middleName, phoneNumbers, politicallyExposedPerson, preferredName, prefix, riskRating, suffix, wealthAndEmploymentDetails, website, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntityCreateRequest{legalEntityType=$legalEntityType, addresses=$addresses, bankSettings=$bankSettings, businessName=$businessName, citizenshipCountry=$citizenshipCountry, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, lastName=$lastName, legalEntityAssociations=$legalEntityAssociations, legalStructure=$legalStructure, metadata=$metadata, middleName=$middleName, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, riskRating=$riskRating, suffix=$suffix, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, additionalProperties=$additionalProperties}"
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
