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

class CounterpartyCreateParams
constructor(
    private val body: CounterpartyCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

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
    fun ledgerType(): LedgerType? = body.ledgerType()

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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): CounterpartyCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CounterpartyCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("name") private val name: String?,
        @JsonProperty("accounting") private val accounting: Accounting?,
        @JsonProperty("accounts") private val accounts: List<Account>?,
        @JsonProperty("email") private val email: String?,
        @JsonProperty("ledger_type") private val ledgerType: LedgerType?,
        @JsonProperty("legal_entity") private val legalEntity: LegalEntityCreateRequest?,
        @JsonProperty("legal_entity_id") private val legalEntityId: String?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("send_remittance_advice") private val sendRemittanceAdvice: Boolean?,
        @JsonProperty("taxpayer_identifier") private val taxpayerIdentifier: String?,
        @JsonProperty("verification_status") private val verificationStatus: VerificationStatus?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A human friendly name for this counterparty. */
        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("accounting") fun accounting(): Accounting? = accounting

        /** The accounts for this counterparty. */
        @JsonProperty("accounts") fun accounts(): List<Account>? = accounts

        /** The counterparty's email. */
        @JsonProperty("email") fun email(): String? = email

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         */
        @JsonProperty("ledger_type") fun ledgerType(): LedgerType? = ledgerType

        @JsonProperty("legal_entity") fun legalEntity(): LegalEntityCreateRequest? = legalEntity

        /** The id of the legal entity. */
        @JsonProperty("legal_entity_id") fun legalEntityId(): String? = legalEntityId

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * Send an email to the counterparty whenever an associated payment order is sent to the
         * bank.
         */
        @JsonProperty("send_remittance_advice")
        fun sendRemittanceAdvice(): Boolean? = sendRemittanceAdvice

        /** Either a valid SSN or EIN. */
        @JsonProperty("taxpayer_identifier") fun taxpayerIdentifier(): String? = taxpayerIdentifier

        /** The verification status of the counterparty. */
        @JsonProperty("verification_status")
        fun verificationStatus(): VerificationStatus? = verificationStatus

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var accounting: Accounting? = null
            private var accounts: MutableList<Account>? = null
            private var email: String? = null
            private var ledgerType: LedgerType? = null
            private var legalEntity: LegalEntityCreateRequest? = null
            private var legalEntityId: String? = null
            private var metadata: Metadata? = null
            private var sendRemittanceAdvice: Boolean? = null
            private var taxpayerIdentifier: String? = null
            private var verificationStatus: VerificationStatus? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(counterpartyCreateBody: CounterpartyCreateBody) = apply {
                name = counterpartyCreateBody.name
                accounting = counterpartyCreateBody.accounting
                accounts = counterpartyCreateBody.accounts?.toMutableList()
                email = counterpartyCreateBody.email
                ledgerType = counterpartyCreateBody.ledgerType
                legalEntity = counterpartyCreateBody.legalEntity
                legalEntityId = counterpartyCreateBody.legalEntityId
                metadata = counterpartyCreateBody.metadata
                sendRemittanceAdvice = counterpartyCreateBody.sendRemittanceAdvice
                taxpayerIdentifier = counterpartyCreateBody.taxpayerIdentifier
                verificationStatus = counterpartyCreateBody.verificationStatus
                additionalProperties = counterpartyCreateBody.additionalProperties.toMutableMap()
            }

            /** A human friendly name for this counterparty. */
            fun name(name: String) = apply { this.name = name }

            fun accounting(accounting: Accounting) = apply { this.accounting = accounting }

            /** The accounts for this counterparty. */
            fun accounts(accounts: List<Account>) = apply {
                this.accounts = accounts.toMutableList()
            }

            /** The accounts for this counterparty. */
            fun addAccount(account: Account) = apply {
                accounts = (accounts ?: mutableListOf()).apply { add(account) }
            }

            /** The counterparty's email. */
            fun email(email: String) = apply { this.email = email }

            /**
             * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
             * `vendor`.
             */
            fun ledgerType(ledgerType: LedgerType) = apply { this.ledgerType = ledgerType }

            fun legalEntity(legalEntity: LegalEntityCreateRequest) = apply {
                this.legalEntity = legalEntity
            }

            /** The id of the legal entity. */
            fun legalEntityId(legalEntityId: String) = apply { this.legalEntityId = legalEntityId }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * Send an email to the counterparty whenever an associated payment order is sent to the
             * bank.
             */
            fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) = apply {
                this.sendRemittanceAdvice = sendRemittanceAdvice
            }

            /** Either a valid SSN or EIN. */
            fun taxpayerIdentifier(taxpayerIdentifier: String) = apply {
                this.taxpayerIdentifier = taxpayerIdentifier
            }

            /** The verification status of the counterparty. */
            fun verificationStatus(verificationStatus: VerificationStatus) = apply {
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

            fun build(): CounterpartyCreateBody =
                CounterpartyCreateBody(
                    name,
                    accounting,
                    accounts?.toImmutable(),
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

            return /* spotless:off */ other is CounterpartyCreateBody && name == other.name && accounting == other.accounting && accounts == other.accounts && email == other.email && ledgerType == other.ledgerType && legalEntity == other.legalEntity && legalEntityId == other.legalEntityId && metadata == other.metadata && sendRemittanceAdvice == other.sendRemittanceAdvice && taxpayerIdentifier == other.taxpayerIdentifier && verificationStatus == other.verificationStatus && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, accounting, accounts, email, ledgerType, legalEntity, legalEntityId, metadata, sendRemittanceAdvice, taxpayerIdentifier, verificationStatus, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CounterpartyCreateBody{name=$name, accounting=$accounting, accounts=$accounts, email=$email, ledgerType=$ledgerType, legalEntity=$legalEntity, legalEntityId=$legalEntityId, metadata=$metadata, sendRemittanceAdvice=$sendRemittanceAdvice, taxpayerIdentifier=$taxpayerIdentifier, verificationStatus=$verificationStatus, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: CounterpartyCreateBody.Builder = CounterpartyCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(counterpartyCreateParams: CounterpartyCreateParams) = apply {
            body = counterpartyCreateParams.body.toBuilder()
            additionalHeaders = counterpartyCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = counterpartyCreateParams.additionalQueryParams.toBuilder()
        }

        /** A human friendly name for this counterparty. */
        fun name(name: String) = apply { body.name(name) }

        fun accounting(accounting: Accounting) = apply { body.accounting(accounting) }

        /** The accounts for this counterparty. */
        fun accounts(accounts: List<Account>) = apply { body.accounts(accounts) }

        /** The accounts for this counterparty. */
        fun addAccount(account: Account) = apply { body.addAccount(account) }

        /** The counterparty's email. */
        fun email(email: String) = apply { body.email(email) }

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         */
        fun ledgerType(ledgerType: LedgerType) = apply { body.ledgerType(ledgerType) }

        fun legalEntity(legalEntity: LegalEntityCreateRequest) = apply {
            body.legalEntity(legalEntity)
        }

        /** The id of the legal entity. */
        fun legalEntityId(legalEntityId: String) = apply { body.legalEntityId(legalEntityId) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Send an email to the counterparty whenever an associated payment order is sent to the
         * bank.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) = apply {
            body.sendRemittanceAdvice(sendRemittanceAdvice)
        }

        /** Either a valid SSN or EIN. */
        fun taxpayerIdentifier(taxpayerIdentifier: String) = apply {
            body.taxpayerIdentifier(taxpayerIdentifier)
        }

        /** The verification status of the counterparty. */
        fun verificationStatus(verificationStatus: VerificationStatus) = apply {
            body.verificationStatus(verificationStatus)
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
        @JsonProperty("type") private val type: Type?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         */
        @JsonProperty("type") fun type(): Type? = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accounting: Accounting) = apply {
                type = accounting.type
                additionalProperties = accounting.additionalProperties.toMutableMap()
            }

            /**
             * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
             * `vendor`.
             */
            fun type(type: Type) = apply { this.type = type }

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

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val CUSTOMER = of("customer")

                val VENDOR = of("vendor")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                CUSTOMER,
                VENDOR,
            }

            enum class Value {
                CUSTOMER,
                VENDOR,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CUSTOMER -> Value.CUSTOMER
                    VENDOR -> Value.VENDOR
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CUSTOMER -> Known.CUSTOMER
                    VENDOR -> Known.VENDOR
                    else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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
        @JsonProperty("account_type") private val accountType: ExternalAccountType?,
        @JsonProperty("party_type") private val partyType: PartyType?,
        @JsonProperty("party_address") private val partyAddress: AddressRequest?,
        @JsonProperty("name") private val name: String?,
        @JsonProperty("account_details") private val accountDetails: List<AccountDetail>?,
        @JsonProperty("routing_details") private val routingDetails: List<RoutingDetail>?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("party_name") private val partyName: String?,
        @JsonProperty("party_identifier") private val partyIdentifier: String?,
        @JsonProperty("ledger_account") private val ledgerAccount: LedgerAccountCreateRequest?,
        @JsonProperty("plaid_processor_token") private val plaidProcessorToken: String?,
        @JsonProperty("contact_details")
        private val contactDetails: List<ContactDetailCreateRequest>?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Can be `checking`, `savings` or `other`. */
        @JsonProperty("account_type") fun accountType(): ExternalAccountType? = accountType

        /** Either `individual` or `business`. */
        @JsonProperty("party_type") fun partyType(): PartyType? = partyType

        /** Required if receiving wire payments. */
        @JsonProperty("party_address") fun partyAddress(): AddressRequest? = partyAddress

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("account_details") fun accountDetails(): List<AccountDetail>? = accountDetails

        @JsonProperty("routing_details") fun routingDetails(): List<RoutingDetail>? = routingDetails

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** If this value isn't provided, it will be inherited from the counterparty's name. */
        @JsonProperty("party_name") fun partyName(): String? = partyName

        @JsonProperty("party_identifier") fun partyIdentifier(): String? = partyIdentifier

        /**
         * Specifies a ledger account object that will be created with the external account. The
         * resulting ledger account is linked to the external account for auto-ledgering Payment
         * objects. See
         * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for more
         * details.
         */
        @JsonProperty("ledger_account")
        fun ledgerAccount(): LedgerAccountCreateRequest? = ledgerAccount

        /**
         * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you can
         * pass the processor token in this field.
         */
        @JsonProperty("plaid_processor_token")
        fun plaidProcessorToken(): String? = plaidProcessorToken

        @JsonProperty("contact_details")
        fun contactDetails(): List<ContactDetailCreateRequest>? = contactDetails

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountType: ExternalAccountType? = null
            private var partyType: PartyType? = null
            private var partyAddress: AddressRequest? = null
            private var name: String? = null
            private var accountDetails: MutableList<AccountDetail>? = null
            private var routingDetails: MutableList<RoutingDetail>? = null
            private var metadata: Metadata? = null
            private var partyName: String? = null
            private var partyIdentifier: String? = null
            private var ledgerAccount: LedgerAccountCreateRequest? = null
            private var plaidProcessorToken: String? = null
            private var contactDetails: MutableList<ContactDetailCreateRequest>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(account: Account) = apply {
                accountType = account.accountType
                partyType = account.partyType
                partyAddress = account.partyAddress
                name = account.name
                accountDetails = account.accountDetails?.toMutableList()
                routingDetails = account.routingDetails?.toMutableList()
                metadata = account.metadata
                partyName = account.partyName
                partyIdentifier = account.partyIdentifier
                ledgerAccount = account.ledgerAccount
                plaidProcessorToken = account.plaidProcessorToken
                contactDetails = account.contactDetails?.toMutableList()
                additionalProperties = account.additionalProperties.toMutableMap()
            }

            /** Can be `checking`, `savings` or `other`. */
            fun accountType(accountType: ExternalAccountType) = apply {
                this.accountType = accountType
            }

            /** Either `individual` or `business`. */
            fun partyType(partyType: PartyType) = apply { this.partyType = partyType }

            /** Required if receiving wire payments. */
            fun partyAddress(partyAddress: AddressRequest) = apply {
                this.partyAddress = partyAddress
            }

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            fun name(name: String) = apply { this.name = name }

            fun accountDetails(accountDetails: List<AccountDetail>) = apply {
                this.accountDetails = accountDetails.toMutableList()
            }

            fun addAccountDetail(accountDetail: AccountDetail) = apply {
                accountDetails = (accountDetails ?: mutableListOf()).apply { add(accountDetail) }
            }

            fun routingDetails(routingDetails: List<RoutingDetail>) = apply {
                this.routingDetails = routingDetails.toMutableList()
            }

            fun addRoutingDetail(routingDetail: RoutingDetail) = apply {
                routingDetails = (routingDetails ?: mutableListOf()).apply { add(routingDetail) }
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** If this value isn't provided, it will be inherited from the counterparty's name. */
            fun partyName(partyName: String) = apply { this.partyName = partyName }

            fun partyIdentifier(partyIdentifier: String) = apply {
                this.partyIdentifier = partyIdentifier
            }

            /**
             * Specifies a ledger account object that will be created with the external account. The
             * resulting ledger account is linked to the external account for auto-ledgering Payment
             * objects. See
             * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
             * more details.
             */
            fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) = apply {
                this.ledgerAccount = ledgerAccount
            }

            /**
             * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you
             * can pass the processor token in this field.
             */
            fun plaidProcessorToken(plaidProcessorToken: String) = apply {
                this.plaidProcessorToken = plaidProcessorToken
            }

            fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) = apply {
                this.contactDetails = contactDetails.toMutableList()
            }

            fun addContactDetail(contactDetail: ContactDetailCreateRequest) = apply {
                contactDetails = (contactDetails ?: mutableListOf()).apply { add(contactDetail) }
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
                    accountType,
                    partyType,
                    partyAddress,
                    name,
                    accountDetails?.toImmutable(),
                    routingDetails?.toImmutable(),
                    metadata,
                    partyName,
                    partyIdentifier,
                    ledgerAccount,
                    plaidProcessorToken,
                    contactDetails?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class AccountDetail
        @JsonCreator
        private constructor(
            @JsonProperty("account_number") private val accountNumber: String,
            @JsonProperty("account_number_type") private val accountNumberType: AccountNumberType?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("account_number") fun accountNumber(): String = accountNumber

            @JsonProperty("account_number_type")
            fun accountNumberType(): AccountNumberType? = accountNumberType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var accountNumber: String? = null
                private var accountNumberType: AccountNumberType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(accountDetail: AccountDetail) = apply {
                    accountNumber = accountDetail.accountNumber
                    accountNumberType = accountDetail.accountNumberType
                    additionalProperties = accountDetail.additionalProperties.toMutableMap()
                }

                fun accountNumber(accountNumber: String) = apply {
                    this.accountNumber = accountNumber
                }

                fun accountNumberType(accountNumberType: AccountNumberType) = apply {
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
                        checkNotNull(accountNumber) {
                            "`accountNumber` is required but was not set"
                        },
                        accountNumberType,
                        additionalProperties.toImmutable(),
                    )
            }

            class AccountNumberType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()

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
            @JsonProperty("contact_identifier") private val contactIdentifier: String?,
            @JsonProperty("contact_identifier_type")
            private val contactIdentifierType: ContactIdentifierType?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("contact_identifier") fun contactIdentifier(): String? = contactIdentifier

            @JsonProperty("contact_identifier_type")
            fun contactIdentifierType(): ContactIdentifierType? = contactIdentifierType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var contactIdentifier: String? = null
                private var contactIdentifierType: ContactIdentifierType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(contactDetailCreateRequest: ContactDetailCreateRequest) = apply {
                    contactIdentifier = contactDetailCreateRequest.contactIdentifier
                    contactIdentifierType = contactDetailCreateRequest.contactIdentifierType
                    additionalProperties =
                        contactDetailCreateRequest.additionalProperties.toMutableMap()
                }

                fun contactIdentifier(contactIdentifier: String) = apply {
                    this.contactIdentifier = contactIdentifier
                }

                fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) = apply {
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
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val EMAIL = of("email")

                    val PHONE_NUMBER = of("phone_number")

                    val WEBSITE = of("website")

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
            @JsonProperty("name") private val name: String,
            @JsonProperty("description") private val description: String?,
            @JsonProperty("normal_balance") private val normalBalance: TransactionDirection,
            @JsonProperty("ledger_id") private val ledgerId: String,
            @JsonProperty("currency") private val currency: String,
            @JsonProperty("currency_exponent") private val currencyExponent: Long?,
            @JsonProperty("ledger_account_category_ids")
            private val ledgerAccountCategoryIds: List<String>?,
            @JsonProperty("ledgerable_id") private val ledgerableId: String?,
            @JsonProperty("ledgerable_type") private val ledgerableType: LedgerableType?,
            @JsonProperty("metadata") private val metadata: Metadata?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The name of the ledger account. */
            @JsonProperty("name") fun name(): String = name

            /** The description of the ledger account. */
            @JsonProperty("description") fun description(): String? = description

            /** The normal balance of the ledger account. */
            @JsonProperty("normal_balance")
            fun normalBalance(): TransactionDirection = normalBalance

            /** The id of the ledger that this account belongs to. */
            @JsonProperty("ledger_id") fun ledgerId(): String = ledgerId

            /** The currency of the ledger account. */
            @JsonProperty("currency") fun currency(): String = currency

            /** The currency exponent of the ledger account. */
            @JsonProperty("currency_exponent") fun currencyExponent(): Long? = currencyExponent

            /**
             * The array of ledger account category ids that this ledger account should be a child
             * of.
             */
            @JsonProperty("ledger_account_category_ids")
            fun ledgerAccountCategoryIds(): List<String>? = ledgerAccountCategoryIds

            /**
             * If the ledger account links to another object in Modern Treasury, the id will be
             * populated here, otherwise null.
             */
            @JsonProperty("ledgerable_id") fun ledgerableId(): String? = ledgerableId

            /**
             * If the ledger account links to another object in Modern Treasury, the type will be
             * populated here, otherwise null. The value is one of internal_account or
             * external_account.
             */
            @JsonProperty("ledgerable_type") fun ledgerableType(): LedgerableType? = ledgerableType

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") fun metadata(): Metadata? = metadata

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var name: String? = null
                private var description: String? = null
                private var normalBalance: TransactionDirection? = null
                private var ledgerId: String? = null
                private var currency: String? = null
                private var currencyExponent: Long? = null
                private var ledgerAccountCategoryIds: MutableList<String>? = null
                private var ledgerableId: String? = null
                private var ledgerableType: LedgerableType? = null
                private var metadata: Metadata? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(ledgerAccountCreateRequest: LedgerAccountCreateRequest) = apply {
                    name = ledgerAccountCreateRequest.name
                    description = ledgerAccountCreateRequest.description
                    normalBalance = ledgerAccountCreateRequest.normalBalance
                    ledgerId = ledgerAccountCreateRequest.ledgerId
                    currency = ledgerAccountCreateRequest.currency
                    currencyExponent = ledgerAccountCreateRequest.currencyExponent
                    ledgerAccountCategoryIds =
                        ledgerAccountCreateRequest.ledgerAccountCategoryIds?.toMutableList()
                    ledgerableId = ledgerAccountCreateRequest.ledgerableId
                    ledgerableType = ledgerAccountCreateRequest.ledgerableType
                    metadata = ledgerAccountCreateRequest.metadata
                    additionalProperties =
                        ledgerAccountCreateRequest.additionalProperties.toMutableMap()
                }

                /** The name of the ledger account. */
                fun name(name: String) = apply { this.name = name }

                /** The description of the ledger account. */
                fun description(description: String) = apply { this.description = description }

                /** The normal balance of the ledger account. */
                fun normalBalance(normalBalance: TransactionDirection) = apply {
                    this.normalBalance = normalBalance
                }

                /** The id of the ledger that this account belongs to. */
                fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

                /** The currency of the ledger account. */
                fun currency(currency: String) = apply { this.currency = currency }

                /** The currency exponent of the ledger account. */
                fun currencyExponent(currencyExponent: Long) = apply {
                    this.currencyExponent = currencyExponent
                }

                /**
                 * The array of ledger account category ids that this ledger account should be a
                 * child of.
                 */
                fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>) = apply {
                    this.ledgerAccountCategoryIds = ledgerAccountCategoryIds.toMutableList()
                }

                /**
                 * The array of ledger account category ids that this ledger account should be a
                 * child of.
                 */
                fun addLedgerAccountCategoryId(ledgerAccountCategoryId: String) = apply {
                    ledgerAccountCategoryIds =
                        (ledgerAccountCategoryIds ?: mutableListOf()).apply {
                            add(ledgerAccountCategoryId)
                        }
                }

                /**
                 * If the ledger account links to another object in Modern Treasury, the id will be
                 * populated here, otherwise null.
                 */
                fun ledgerableId(ledgerableId: String) = apply { this.ledgerableId = ledgerableId }

                /**
                 * If the ledger account links to another object in Modern Treasury, the type will
                 * be populated here, otherwise null. The value is one of internal_account or
                 * external_account.
                 */
                fun ledgerableType(ledgerableType: LedgerableType) = apply {
                    this.ledgerableType = ledgerableType
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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
                        checkNotNull(name) { "`name` is required but was not set" },
                        description,
                        checkNotNull(normalBalance) {
                            "`normalBalance` is required but was not set"
                        },
                        checkNotNull(ledgerId) { "`ledgerId` is required but was not set" },
                        checkNotNull(currency) { "`currency` is required but was not set" },
                        currencyExponent,
                        ledgerAccountCategoryIds?.toImmutable(),
                        ledgerableId,
                        ledgerableType,
                        metadata,
                        additionalProperties.toImmutable(),
                    )
            }

            class LedgerableType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val COUNTERPARTY = of("counterparty")

                    val EXTERNAL_ACCOUNT = of("external_account")

                    val INTERNAL_ACCOUNT = of("internal_account")

                    val VIRTUAL_ACCOUNT = of("virtual_account")

                    fun of(value: String) = LedgerableType(JsonField.of(value))
                }

                enum class Known {
                    COUNTERPARTY,
                    EXTERNAL_ACCOUNT,
                    INTERNAL_ACCOUNT,
                    VIRTUAL_ACCOUNT,
                }

                enum class Value {
                    COUNTERPARTY,
                    EXTERNAL_ACCOUNT,
                    INTERNAL_ACCOUNT,
                    VIRTUAL_ACCOUNT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        COUNTERPARTY -> Value.COUNTERPARTY
                        EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                        INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                        VIRTUAL_ACCOUNT -> Value.VIRTUAL_ACCOUNT
                        else -> Value._UNKNOWN
                    }

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

                fun asString(): String = _value().asStringOrThrow()

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

                return /* spotless:off */ other is LedgerAccountCreateRequest && name == other.name && description == other.description && normalBalance == other.normalBalance && ledgerId == other.ledgerId && currency == other.currency && currencyExponent == other.currencyExponent && ledgerAccountCategoryIds == other.ledgerAccountCategoryIds && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(name, description, normalBalance, ledgerId, currency, currencyExponent, ledgerAccountCategoryIds, ledgerableId, ledgerableType, metadata, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LedgerAccountCreateRequest{name=$name, description=$description, normalBalance=$normalBalance, ledgerId=$ledgerId, currency=$currency, currencyExponent=$currencyExponent, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
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
            @JsonProperty("line1") private val line1: String?,
            @JsonProperty("line2") private val line2: String?,
            @JsonProperty("locality") private val locality: String?,
            @JsonProperty("region") private val region: String?,
            @JsonProperty("postal_code") private val postalCode: String?,
            @JsonProperty("country") private val country: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

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

                internal fun from(addressRequest: AddressRequest) = apply {
                    line1 = addressRequest.line1
                    line2 = addressRequest.line2
                    locality = addressRequest.locality
                    region = addressRequest.region
                    postalCode = addressRequest.postalCode
                    country = addressRequest.country
                    additionalProperties = addressRequest.additionalProperties.toMutableMap()
                }

                fun line1(line1: String) = apply { this.line1 = line1 }

                fun line2(line2: String) = apply { this.line2 = line2 }

                /** Locality or City. */
                fun locality(locality: String) = apply { this.locality = locality }

                /** Region or State. */
                fun region(region: String) = apply { this.region = region }

                /** The postal code of the address. */
                fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                /** Country code conforms to [ISO 3166-1 alpha-2] */
                fun country(country: String) = apply { this.country = country }

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
                        line1,
                        line2,
                        locality,
                        region,
                        postalCode,
                        country,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AddressRequest && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(line1, line2, locality, region, postalCode, country, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AddressRequest{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
        }

        class PartyType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val BUSINESS = of("business")

                val INDIVIDUAL = of("individual")

                fun of(value: String) = PartyType(JsonField.of(value))
            }

            enum class Known {
                BUSINESS,
                INDIVIDUAL,
            }

            enum class Value {
                BUSINESS,
                INDIVIDUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BUSINESS -> Value.BUSINESS
                    INDIVIDUAL -> Value.INDIVIDUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BUSINESS -> Known.BUSINESS
                    INDIVIDUAL -> Known.INDIVIDUAL
                    else -> throw ModernTreasuryInvalidDataException("Unknown PartyType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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
            @JsonProperty("routing_number") private val routingNumber: String,
            @JsonProperty("routing_number_type") private val routingNumberType: RoutingNumberType,
            @JsonProperty("payment_type") private val paymentType: PaymentType?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("routing_number") fun routingNumber(): String = routingNumber

            @JsonProperty("routing_number_type")
            fun routingNumberType(): RoutingNumberType = routingNumberType

            @JsonProperty("payment_type") fun paymentType(): PaymentType? = paymentType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var routingNumber: String? = null
                private var routingNumberType: RoutingNumberType? = null
                private var paymentType: PaymentType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(routingDetail: RoutingDetail) = apply {
                    routingNumber = routingDetail.routingNumber
                    routingNumberType = routingDetail.routingNumberType
                    paymentType = routingDetail.paymentType
                    additionalProperties = routingDetail.additionalProperties.toMutableMap()
                }

                fun routingNumber(routingNumber: String) = apply {
                    this.routingNumber = routingNumber
                }

                fun routingNumberType(routingNumberType: RoutingNumberType) = apply {
                    this.routingNumberType = routingNumberType
                }

                fun paymentType(paymentType: PaymentType) = apply { this.paymentType = paymentType }

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
                        checkNotNull(routingNumber) {
                            "`routingNumber` is required but was not set"
                        },
                        checkNotNull(routingNumberType) {
                            "`routingNumberType` is required but was not set"
                        },
                        paymentType,
                        additionalProperties.toImmutable(),
                    )
            }

            class RoutingNumberType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                    val SWIFT = of("swift")

                    val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

                    fun of(value: String) = RoutingNumberType(JsonField.of(value))
                }

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
                    SWIFT,
                    ZA_NATIONAL_CLEARING_CODE,
                }

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
                    SWIFT,
                    ZA_NATIONAL_CLEARING_CODE,
                    _UNKNOWN,
                }

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
                        SWIFT -> Value.SWIFT
                        ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
                        else -> Value._UNKNOWN
                    }

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
                        SWIFT -> Known.SWIFT
                        ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown RoutingNumberType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

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
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()

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

            return /* spotless:off */ other is Account && accountType == other.accountType && partyType == other.partyType && partyAddress == other.partyAddress && name == other.name && accountDetails == other.accountDetails && routingDetails == other.routingDetails && metadata == other.metadata && partyName == other.partyName && partyIdentifier == other.partyIdentifier && ledgerAccount == other.ledgerAccount && plaidProcessorToken == other.plaidProcessorToken && contactDetails == other.contactDetails && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountType, partyType, partyAddress, name, accountDetails, routingDetails, metadata, partyName, partyIdentifier, ledgerAccount, plaidProcessorToken, contactDetails, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Account{accountType=$accountType, partyType=$partyType, partyAddress=$partyAddress, name=$name, accountDetails=$accountDetails, routingDetails=$routingDetails, metadata=$metadata, partyName=$partyName, partyIdentifier=$partyIdentifier, ledgerAccount=$ledgerAccount, plaidProcessorToken=$plaidProcessorToken, contactDetails=$contactDetails, additionalProperties=$additionalProperties}"
    }

    class LedgerType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CUSTOMER = of("customer")

            val VENDOR = of("vendor")

            fun of(value: String) = LedgerType(JsonField.of(value))
        }

        enum class Known {
            CUSTOMER,
            VENDOR,
        }

        enum class Value {
            CUSTOMER,
            VENDOR,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CUSTOMER -> Value.CUSTOMER
                VENDOR -> Value.VENDOR
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CUSTOMER -> Known.CUSTOMER
                VENDOR -> Known.VENDOR
                else -> throw ModernTreasuryInvalidDataException("Unknown LedgerType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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
        @JsonProperty("legal_entity_type") private val legalEntityType: LegalEntityType,
        @JsonProperty("risk_rating") private val riskRating: RiskRating?,
        @JsonProperty("prefix") private val prefix: String?,
        @JsonProperty("first_name") private val firstName: String?,
        @JsonProperty("middle_name") private val middleName: String?,
        @JsonProperty("last_name") private val lastName: String?,
        @JsonProperty("suffix") private val suffix: String?,
        @JsonProperty("preferred_name") private val preferredName: String?,
        @JsonProperty("citizenship_country") private val citizenshipCountry: String?,
        @JsonProperty("politically_exposed_person") private val politicallyExposedPerson: Boolean?,
        @JsonProperty("date_of_birth") private val dateOfBirth: LocalDate?,
        @JsonProperty("date_formed") private val dateFormed: LocalDate?,
        @JsonProperty("business_name") private val businessName: String?,
        @JsonProperty("doing_business_as_names") private val doingBusinessAsNames: List<String>?,
        @JsonProperty("legal_structure") private val legalStructure: LegalStructure?,
        @JsonProperty("phone_numbers") private val phoneNumbers: List<PhoneNumber>?,
        @JsonProperty("email") private val email: String?,
        @JsonProperty("website") private val website: String?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("bank_settings") private val bankSettings: BankSettings?,
        @JsonProperty("wealth_and_employment_details")
        private val wealthAndEmploymentDetails: WealthAndEmploymentDetails?,
        @JsonProperty("addresses") private val addresses: List<LegalEntityAddressCreateRequest>?,
        @JsonProperty("identifications")
        private val identifications: List<IdentificationCreateRequest>?,
        @JsonProperty("legal_entity_associations")
        private val legalEntityAssociations: List<LegalEntityAssociationInlineCreateRequest>?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The type of legal entity. */
        @JsonProperty("legal_entity_type") fun legalEntityType(): LegalEntityType = legalEntityType

        /** The risk rating of the legal entity. One of low, medium, high. */
        @JsonProperty("risk_rating") fun riskRating(): RiskRating? = riskRating

        /** An individual's prefix. */
        @JsonProperty("prefix") fun prefix(): String? = prefix

        /** An individual's first name. */
        @JsonProperty("first_name") fun firstName(): String? = firstName

        /** An individual's middle name. */
        @JsonProperty("middle_name") fun middleName(): String? = middleName

        /** An individual's last name. */
        @JsonProperty("last_name") fun lastName(): String? = lastName

        /** An individual's suffix. */
        @JsonProperty("suffix") fun suffix(): String? = suffix

        /** An individual's preferred name. */
        @JsonProperty("preferred_name") fun preferredName(): String? = preferredName

        /** The country of citizenship for an individual. */
        @JsonProperty("citizenship_country") fun citizenshipCountry(): String? = citizenshipCountry

        /** Whether the individual is a politically exposed person. */
        @JsonProperty("politically_exposed_person")
        fun politicallyExposedPerson(): Boolean? = politicallyExposedPerson

        /** An individual's date of birth (YYYY-MM-DD). */
        @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate? = dateOfBirth

        /** A business's formation date (YYYY-MM-DD). */
        @JsonProperty("date_formed") fun dateFormed(): LocalDate? = dateFormed

        /** The business's legal business name. */
        @JsonProperty("business_name") fun businessName(): String? = businessName

        @JsonProperty("doing_business_as_names")
        fun doingBusinessAsNames(): List<String>? = doingBusinessAsNames

        /** The business's legal structure. */
        @JsonProperty("legal_structure") fun legalStructure(): LegalStructure? = legalStructure

        @JsonProperty("phone_numbers") fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers

        /** The entity's primary email. */
        @JsonProperty("email") fun email(): String? = email

        /** The entity's primary website URL. */
        @JsonProperty("website") fun website(): String? = website

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonProperty("bank_settings") fun bankSettings(): BankSettings? = bankSettings

        @JsonProperty("wealth_and_employment_details")
        fun wealthAndEmploymentDetails(): WealthAndEmploymentDetails? = wealthAndEmploymentDetails

        /** A list of addresses for the entity. */
        @JsonProperty("addresses")
        fun addresses(): List<LegalEntityAddressCreateRequest>? = addresses

        /** A list of identifications for the legal entity. */
        @JsonProperty("identifications")
        fun identifications(): List<IdentificationCreateRequest>? = identifications

        /** The legal entity associations and its child legal entities. */
        @JsonProperty("legal_entity_associations")
        fun legalEntityAssociations(): List<LegalEntityAssociationInlineCreateRequest>? =
            legalEntityAssociations

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var legalEntityType: LegalEntityType? = null
            private var riskRating: RiskRating? = null
            private var prefix: String? = null
            private var firstName: String? = null
            private var middleName: String? = null
            private var lastName: String? = null
            private var suffix: String? = null
            private var preferredName: String? = null
            private var citizenshipCountry: String? = null
            private var politicallyExposedPerson: Boolean? = null
            private var dateOfBirth: LocalDate? = null
            private var dateFormed: LocalDate? = null
            private var businessName: String? = null
            private var doingBusinessAsNames: MutableList<String>? = null
            private var legalStructure: LegalStructure? = null
            private var phoneNumbers: MutableList<PhoneNumber>? = null
            private var email: String? = null
            private var website: String? = null
            private var metadata: Metadata? = null
            private var bankSettings: BankSettings? = null
            private var wealthAndEmploymentDetails: WealthAndEmploymentDetails? = null
            private var addresses: MutableList<LegalEntityAddressCreateRequest>? = null
            private var identifications: MutableList<IdentificationCreateRequest>? = null
            private var legalEntityAssociations:
                MutableList<LegalEntityAssociationInlineCreateRequest>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(legalEntityCreateRequest: LegalEntityCreateRequest) = apply {
                legalEntityType = legalEntityCreateRequest.legalEntityType
                riskRating = legalEntityCreateRequest.riskRating
                prefix = legalEntityCreateRequest.prefix
                firstName = legalEntityCreateRequest.firstName
                middleName = legalEntityCreateRequest.middleName
                lastName = legalEntityCreateRequest.lastName
                suffix = legalEntityCreateRequest.suffix
                preferredName = legalEntityCreateRequest.preferredName
                citizenshipCountry = legalEntityCreateRequest.citizenshipCountry
                politicallyExposedPerson = legalEntityCreateRequest.politicallyExposedPerson
                dateOfBirth = legalEntityCreateRequest.dateOfBirth
                dateFormed = legalEntityCreateRequest.dateFormed
                businessName = legalEntityCreateRequest.businessName
                doingBusinessAsNames =
                    legalEntityCreateRequest.doingBusinessAsNames?.toMutableList()
                legalStructure = legalEntityCreateRequest.legalStructure
                phoneNumbers = legalEntityCreateRequest.phoneNumbers?.toMutableList()
                email = legalEntityCreateRequest.email
                website = legalEntityCreateRequest.website
                metadata = legalEntityCreateRequest.metadata
                bankSettings = legalEntityCreateRequest.bankSettings
                wealthAndEmploymentDetails = legalEntityCreateRequest.wealthAndEmploymentDetails
                addresses = legalEntityCreateRequest.addresses?.toMutableList()
                identifications = legalEntityCreateRequest.identifications?.toMutableList()
                legalEntityAssociations =
                    legalEntityCreateRequest.legalEntityAssociations?.toMutableList()
                additionalProperties = legalEntityCreateRequest.additionalProperties.toMutableMap()
            }

            /** The type of legal entity. */
            fun legalEntityType(legalEntityType: LegalEntityType) = apply {
                this.legalEntityType = legalEntityType
            }

            /** The risk rating of the legal entity. One of low, medium, high. */
            fun riskRating(riskRating: RiskRating) = apply { this.riskRating = riskRating }

            /** An individual's prefix. */
            fun prefix(prefix: String) = apply { this.prefix = prefix }

            /** An individual's first name. */
            fun firstName(firstName: String) = apply { this.firstName = firstName }

            /** An individual's middle name. */
            fun middleName(middleName: String) = apply { this.middleName = middleName }

            /** An individual's last name. */
            fun lastName(lastName: String) = apply { this.lastName = lastName }

            /** An individual's suffix. */
            fun suffix(suffix: String) = apply { this.suffix = suffix }

            /** An individual's preferred name. */
            fun preferredName(preferredName: String) = apply { this.preferredName = preferredName }

            /** The country of citizenship for an individual. */
            fun citizenshipCountry(citizenshipCountry: String) = apply {
                this.citizenshipCountry = citizenshipCountry
            }

            /** Whether the individual is a politically exposed person. */
            fun politicallyExposedPerson(politicallyExposedPerson: Boolean) = apply {
                this.politicallyExposedPerson = politicallyExposedPerson
            }

            /** An individual's date of birth (YYYY-MM-DD). */
            fun dateOfBirth(dateOfBirth: LocalDate) = apply { this.dateOfBirth = dateOfBirth }

            /** A business's formation date (YYYY-MM-DD). */
            fun dateFormed(dateFormed: LocalDate) = apply { this.dateFormed = dateFormed }

            /** The business's legal business name. */
            fun businessName(businessName: String) = apply { this.businessName = businessName }

            fun doingBusinessAsNames(doingBusinessAsNames: List<String>) = apply {
                this.doingBusinessAsNames = doingBusinessAsNames.toMutableList()
            }

            fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
                doingBusinessAsNames =
                    (doingBusinessAsNames ?: mutableListOf()).apply { add(doingBusinessAsName) }
            }

            /** The business's legal structure. */
            fun legalStructure(legalStructure: LegalStructure) = apply {
                this.legalStructure = legalStructure
            }

            fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = apply {
                this.phoneNumbers = phoneNumbers.toMutableList()
            }

            fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
                phoneNumbers = (phoneNumbers ?: mutableListOf()).apply { add(phoneNumber) }
            }

            /** The entity's primary email. */
            fun email(email: String) = apply { this.email = email }

            /** The entity's primary website URL. */
            fun website(website: String) = apply { this.website = website }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            fun bankSettings(bankSettings: BankSettings) = apply {
                this.bankSettings = bankSettings
            }

            fun wealthAndEmploymentDetails(wealthAndEmploymentDetails: WealthAndEmploymentDetails) =
                apply {
                    this.wealthAndEmploymentDetails = wealthAndEmploymentDetails
                }

            /** A list of addresses for the entity. */
            fun addresses(addresses: List<LegalEntityAddressCreateRequest>) = apply {
                this.addresses = addresses.toMutableList()
            }

            /** A list of addresses for the entity. */
            fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
                addresses = (addresses ?: mutableListOf()).apply { add(address) }
            }

            /** A list of identifications for the legal entity. */
            fun identifications(identifications: List<IdentificationCreateRequest>) = apply {
                this.identifications = identifications.toMutableList()
            }

            /** A list of identifications for the legal entity. */
            fun addIdentification(identification: IdentificationCreateRequest) = apply {
                identifications = (identifications ?: mutableListOf()).apply { add(identification) }
            }

            /** The legal entity associations and its child legal entities. */
            fun legalEntityAssociations(
                legalEntityAssociations: List<LegalEntityAssociationInlineCreateRequest>
            ) = apply { this.legalEntityAssociations = legalEntityAssociations.toMutableList() }

            /** The legal entity associations and its child legal entities. */
            fun addLegalEntityAssociation(
                legalEntityAssociation: LegalEntityAssociationInlineCreateRequest
            ) = apply {
                legalEntityAssociations =
                    (legalEntityAssociations ?: mutableListOf()).apply {
                        add(legalEntityAssociation)
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

            fun build(): LegalEntityCreateRequest =
                LegalEntityCreateRequest(
                    checkNotNull(legalEntityType) {
                        "`legalEntityType` is required but was not set"
                    },
                    riskRating,
                    prefix,
                    firstName,
                    middleName,
                    lastName,
                    suffix,
                    preferredName,
                    citizenshipCountry,
                    politicallyExposedPerson,
                    dateOfBirth,
                    dateFormed,
                    businessName,
                    doingBusinessAsNames?.toImmutable(),
                    legalStructure,
                    phoneNumbers?.toImmutable(),
                    email,
                    website,
                    metadata,
                    bankSettings,
                    wealthAndEmploymentDetails,
                    addresses?.toImmutable(),
                    identifications?.toImmutable(),
                    legalEntityAssociations?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        class LegalEntityType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val BUSINESS = of("business")

                val INDIVIDUAL = of("individual")

                fun of(value: String) = LegalEntityType(JsonField.of(value))
            }

            enum class Known {
                BUSINESS,
                INDIVIDUAL,
            }

            enum class Value {
                BUSINESS,
                INDIVIDUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BUSINESS -> Value.BUSINESS
                    INDIVIDUAL -> Value.INDIVIDUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BUSINESS -> Known.BUSINESS
                    INDIVIDUAL -> Known.INDIVIDUAL
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown LegalEntityType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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
            @JsonProperty("address_types") private val addressTypes: List<AddressType>?,
            @JsonProperty("line1") private val line1: String?,
            @JsonProperty("line2") private val line2: String?,
            @JsonProperty("locality") private val locality: String?,
            @JsonProperty("region") private val region: String?,
            @JsonProperty("postal_code") private val postalCode: String?,
            @JsonProperty("country") private val country: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The types of this address. */
            @JsonProperty("address_types") fun addressTypes(): List<AddressType>? = addressTypes

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

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var addressTypes: MutableList<AddressType>? = null
                private var line1: String? = null
                private var line2: String? = null
                private var locality: String? = null
                private var region: String? = null
                private var postalCode: String? = null
                private var country: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest
                ) = apply {
                    addressTypes = legalEntityAddressCreateRequest.addressTypes?.toMutableList()
                    line1 = legalEntityAddressCreateRequest.line1
                    line2 = legalEntityAddressCreateRequest.line2
                    locality = legalEntityAddressCreateRequest.locality
                    region = legalEntityAddressCreateRequest.region
                    postalCode = legalEntityAddressCreateRequest.postalCode
                    country = legalEntityAddressCreateRequest.country
                    additionalProperties =
                        legalEntityAddressCreateRequest.additionalProperties.toMutableMap()
                }

                /** The types of this address. */
                fun addressTypes(addressTypes: List<AddressType>) = apply {
                    this.addressTypes = addressTypes.toMutableList()
                }

                /** The types of this address. */
                fun addAddressType(addressType: AddressType) = apply {
                    addressTypes = (addressTypes ?: mutableListOf()).apply { add(addressType) }
                }

                fun line1(line1: String) = apply { this.line1 = line1 }

                fun line2(line2: String) = apply { this.line2 = line2 }

                /** Locality or City. */
                fun locality(locality: String) = apply { this.locality = locality }

                /** Region or State. */
                fun region(region: String) = apply { this.region = region }

                /** The postal code of the address. */
                fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                /** Country code conforms to [ISO 3166-1 alpha-2] */
                fun country(country: String) = apply { this.country = country }

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
                        addressTypes?.toImmutable(),
                        line1,
                        line2,
                        locality,
                        region,
                        postalCode,
                        country,
                        additionalProperties.toImmutable(),
                    )
            }

            class AddressType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val BUSINESS = of("business")

                    val MAILING = of("mailing")

                    val OTHER = of("other")

                    val PO_BOX = of("po_box")

                    val RESIDENTIAL = of("residential")

                    fun of(value: String) = AddressType(JsonField.of(value))
                }

                enum class Known {
                    BUSINESS,
                    MAILING,
                    OTHER,
                    PO_BOX,
                    RESIDENTIAL,
                }

                enum class Value {
                    BUSINESS,
                    MAILING,
                    OTHER,
                    PO_BOX,
                    RESIDENTIAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        BUSINESS -> Value.BUSINESS
                        MAILING -> Value.MAILING
                        OTHER -> Value.OTHER
                        PO_BOX -> Value.PO_BOX
                        RESIDENTIAL -> Value.RESIDENTIAL
                        else -> Value._UNKNOWN
                    }

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

                fun asString(): String = _value().asStringOrThrow()

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

                return /* spotless:off */ other is LegalEntityAddressCreateRequest && addressTypes == other.addressTypes && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(addressTypes, line1, line2, locality, region, postalCode, country, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LegalEntityAddressCreateRequest{addressTypes=$addressTypes, line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class IdentificationCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("id_number") private val idNumber: String,
            @JsonProperty("id_type") private val idType: IdType,
            @JsonProperty("issuing_country") private val issuingCountry: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The ID number of identification document. */
            @JsonProperty("id_number") fun idNumber(): String = idNumber

            /** The type of ID number. */
            @JsonProperty("id_type") fun idType(): IdType = idType

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            @JsonProperty("issuing_country") fun issuingCountry(): String? = issuingCountry

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var idNumber: String? = null
                private var idType: IdType? = null
                private var issuingCountry: String? = null
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
                fun idNumber(idNumber: String) = apply { this.idNumber = idNumber }

                /** The type of ID number. */
                fun idType(idType: IdType) = apply { this.idType = idType }

                /**
                 * The ISO 3166-1 alpha-2 country code of the country that issued the identification
                 */
                fun issuingCountry(issuingCountry: String) = apply {
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
                        checkNotNull(idNumber) { "`idNumber` is required but was not set" },
                        checkNotNull(idType) { "`idType` is required but was not set" },
                        issuingCountry,
                        additionalProperties.toImmutable(),
                    )
            }

            class IdType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()

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
            private val relationshipTypes: List<RelationshipType>,
            @JsonProperty("title") private val title: String?,
            @JsonProperty("ownership_percentage") private val ownershipPercentage: Long?,
            @JsonProperty("child_legal_entity")
            private val childLegalEntity: ChildLegalEntityCreate?,
            @JsonProperty("child_legal_entity_id") private val childLegalEntityId: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("relationship_types")
            fun relationshipTypes(): List<RelationshipType> = relationshipTypes

            /** The job title of the child entity at the parent entity. */
            @JsonProperty("title") fun title(): String? = title

            /** The child entity's ownership percentage iff they are a beneficial owner. */
            @JsonProperty("ownership_percentage")
            fun ownershipPercentage(): Long? = ownershipPercentage

            /** The child legal entity. */
            @JsonProperty("child_legal_entity")
            fun childLegalEntity(): ChildLegalEntityCreate? = childLegalEntity

            /** The ID of the child legal entity. */
            @JsonProperty("child_legal_entity_id")
            fun childLegalEntityId(): String? = childLegalEntityId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var relationshipTypes: MutableList<RelationshipType>? = null
                private var title: String? = null
                private var ownershipPercentage: Long? = null
                private var childLegalEntity: ChildLegalEntityCreate? = null
                private var childLegalEntityId: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    legalEntityAssociationInlineCreateRequest:
                        LegalEntityAssociationInlineCreateRequest
                ) = apply {
                    relationshipTypes =
                        legalEntityAssociationInlineCreateRequest.relationshipTypes.toMutableList()
                    title = legalEntityAssociationInlineCreateRequest.title
                    ownershipPercentage =
                        legalEntityAssociationInlineCreateRequest.ownershipPercentage
                    childLegalEntity = legalEntityAssociationInlineCreateRequest.childLegalEntity
                    childLegalEntityId =
                        legalEntityAssociationInlineCreateRequest.childLegalEntityId
                    additionalProperties =
                        legalEntityAssociationInlineCreateRequest.additionalProperties
                            .toMutableMap()
                }

                fun relationshipTypes(relationshipTypes: List<RelationshipType>) = apply {
                    this.relationshipTypes = relationshipTypes.toMutableList()
                }

                fun addRelationshipType(relationshipType: RelationshipType) = apply {
                    relationshipTypes =
                        (relationshipTypes ?: mutableListOf()).apply { add(relationshipType) }
                }

                /** The job title of the child entity at the parent entity. */
                fun title(title: String) = apply { this.title = title }

                /** The child entity's ownership percentage iff they are a beneficial owner. */
                fun ownershipPercentage(ownershipPercentage: Long) = apply {
                    this.ownershipPercentage = ownershipPercentage
                }

                /** The child legal entity. */
                fun childLegalEntity(childLegalEntity: ChildLegalEntityCreate) = apply {
                    this.childLegalEntity = childLegalEntity
                }

                /** The ID of the child legal entity. */
                fun childLegalEntityId(childLegalEntityId: String) = apply {
                    this.childLegalEntityId = childLegalEntityId
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

                fun build(): LegalEntityAssociationInlineCreateRequest =
                    LegalEntityAssociationInlineCreateRequest(
                        checkNotNull(relationshipTypes) {
                                "`relationshipTypes` is required but was not set"
                            }
                            .toImmutable(),
                        title,
                        ownershipPercentage,
                        childLegalEntity,
                        childLegalEntityId,
                        additionalProperties.toImmutable(),
                    )
            }

            class RelationshipType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val BENEFICIAL_OWNER = of("beneficial_owner")

                    val CONTROL_PERSON = of("control_person")

                    fun of(value: String) = RelationshipType(JsonField.of(value))
                }

                enum class Known {
                    BENEFICIAL_OWNER,
                    CONTROL_PERSON,
                }

                enum class Value {
                    BENEFICIAL_OWNER,
                    CONTROL_PERSON,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        BENEFICIAL_OWNER -> Value.BENEFICIAL_OWNER
                        CONTROL_PERSON -> Value.CONTROL_PERSON
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        BENEFICIAL_OWNER -> Known.BENEFICIAL_OWNER
                        CONTROL_PERSON -> Known.CONTROL_PERSON
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown RelationshipType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

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
                @JsonProperty("legal_entity_type") private val legalEntityType: LegalEntityType?,
                @JsonProperty("risk_rating") private val riskRating: RiskRating?,
                @JsonProperty("prefix") private val prefix: String?,
                @JsonProperty("first_name") private val firstName: String?,
                @JsonProperty("middle_name") private val middleName: String?,
                @JsonProperty("last_name") private val lastName: String?,
                @JsonProperty("suffix") private val suffix: String?,
                @JsonProperty("preferred_name") private val preferredName: String?,
                @JsonProperty("citizenship_country") private val citizenshipCountry: String?,
                @JsonProperty("politically_exposed_person")
                private val politicallyExposedPerson: Boolean?,
                @JsonProperty("date_of_birth") private val dateOfBirth: LocalDate?,
                @JsonProperty("date_formed") private val dateFormed: LocalDate?,
                @JsonProperty("business_name") private val businessName: String?,
                @JsonProperty("doing_business_as_names")
                private val doingBusinessAsNames: List<String>?,
                @JsonProperty("legal_structure") private val legalStructure: LegalStructure?,
                @JsonProperty("phone_numbers") private val phoneNumbers: List<PhoneNumber>?,
                @JsonProperty("email") private val email: String?,
                @JsonProperty("website") private val website: String?,
                @JsonProperty("metadata") private val metadata: Metadata?,
                @JsonProperty("bank_settings") private val bankSettings: BankSettings?,
                @JsonProperty("wealth_and_employment_details")
                private val wealthAndEmploymentDetails: WealthAndEmploymentDetails?,
                @JsonProperty("addresses")
                private val addresses: List<LegalEntityAddressCreateRequest>?,
                @JsonProperty("identifications")
                private val identifications: List<IdentificationCreateRequest>?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The type of legal entity. */
                @JsonProperty("legal_entity_type")
                fun legalEntityType(): LegalEntityType? = legalEntityType

                /** The risk rating of the legal entity. One of low, medium, high. */
                @JsonProperty("risk_rating") fun riskRating(): RiskRating? = riskRating

                /** An individual's prefix. */
                @JsonProperty("prefix") fun prefix(): String? = prefix

                /** An individual's first name. */
                @JsonProperty("first_name") fun firstName(): String? = firstName

                /** An individual's middle name. */
                @JsonProperty("middle_name") fun middleName(): String? = middleName

                /** An individual's last name. */
                @JsonProperty("last_name") fun lastName(): String? = lastName

                /** An individual's suffix. */
                @JsonProperty("suffix") fun suffix(): String? = suffix

                /** An individual's preferred name. */
                @JsonProperty("preferred_name") fun preferredName(): String? = preferredName

                /** The country of citizenship for an individual. */
                @JsonProperty("citizenship_country")
                fun citizenshipCountry(): String? = citizenshipCountry

                /** Whether the individual is a politically exposed person. */
                @JsonProperty("politically_exposed_person")
                fun politicallyExposedPerson(): Boolean? = politicallyExposedPerson

                /** An individual's date of birth (YYYY-MM-DD). */
                @JsonProperty("date_of_birth") fun dateOfBirth(): LocalDate? = dateOfBirth

                /** A business's formation date (YYYY-MM-DD). */
                @JsonProperty("date_formed") fun dateFormed(): LocalDate? = dateFormed

                /** The business's legal business name. */
                @JsonProperty("business_name") fun businessName(): String? = businessName

                @JsonProperty("doing_business_as_names")
                fun doingBusinessAsNames(): List<String>? = doingBusinessAsNames

                /** The business's legal structure. */
                @JsonProperty("legal_structure")
                fun legalStructure(): LegalStructure? = legalStructure

                @JsonProperty("phone_numbers") fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers

                /** The entity's primary email. */
                @JsonProperty("email") fun email(): String? = email

                /** The entity's primary website URL. */
                @JsonProperty("website") fun website(): String? = website

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata") fun metadata(): Metadata? = metadata

                @JsonProperty("bank_settings") fun bankSettings(): BankSettings? = bankSettings

                @JsonProperty("wealth_and_employment_details")
                fun wealthAndEmploymentDetails(): WealthAndEmploymentDetails? =
                    wealthAndEmploymentDetails

                /** A list of addresses for the entity. */
                @JsonProperty("addresses")
                fun addresses(): List<LegalEntityAddressCreateRequest>? = addresses

                /** A list of identifications for the legal entity. */
                @JsonProperty("identifications")
                fun identifications(): List<IdentificationCreateRequest>? = identifications

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var legalEntityType: LegalEntityType? = null
                    private var riskRating: RiskRating? = null
                    private var prefix: String? = null
                    private var firstName: String? = null
                    private var middleName: String? = null
                    private var lastName: String? = null
                    private var suffix: String? = null
                    private var preferredName: String? = null
                    private var citizenshipCountry: String? = null
                    private var politicallyExposedPerson: Boolean? = null
                    private var dateOfBirth: LocalDate? = null
                    private var dateFormed: LocalDate? = null
                    private var businessName: String? = null
                    private var doingBusinessAsNames: MutableList<String>? = null
                    private var legalStructure: LegalStructure? = null
                    private var phoneNumbers: MutableList<PhoneNumber>? = null
                    private var email: String? = null
                    private var website: String? = null
                    private var metadata: Metadata? = null
                    private var bankSettings: BankSettings? = null
                    private var wealthAndEmploymentDetails: WealthAndEmploymentDetails? = null
                    private var addresses: MutableList<LegalEntityAddressCreateRequest>? = null
                    private var identifications: MutableList<IdentificationCreateRequest>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(childLegalEntityCreate: ChildLegalEntityCreate) = apply {
                        legalEntityType = childLegalEntityCreate.legalEntityType
                        riskRating = childLegalEntityCreate.riskRating
                        prefix = childLegalEntityCreate.prefix
                        firstName = childLegalEntityCreate.firstName
                        middleName = childLegalEntityCreate.middleName
                        lastName = childLegalEntityCreate.lastName
                        suffix = childLegalEntityCreate.suffix
                        preferredName = childLegalEntityCreate.preferredName
                        citizenshipCountry = childLegalEntityCreate.citizenshipCountry
                        politicallyExposedPerson = childLegalEntityCreate.politicallyExposedPerson
                        dateOfBirth = childLegalEntityCreate.dateOfBirth
                        dateFormed = childLegalEntityCreate.dateFormed
                        businessName = childLegalEntityCreate.businessName
                        doingBusinessAsNames =
                            childLegalEntityCreate.doingBusinessAsNames?.toMutableList()
                        legalStructure = childLegalEntityCreate.legalStructure
                        phoneNumbers = childLegalEntityCreate.phoneNumbers?.toMutableList()
                        email = childLegalEntityCreate.email
                        website = childLegalEntityCreate.website
                        metadata = childLegalEntityCreate.metadata
                        bankSettings = childLegalEntityCreate.bankSettings
                        wealthAndEmploymentDetails =
                            childLegalEntityCreate.wealthAndEmploymentDetails
                        addresses = childLegalEntityCreate.addresses?.toMutableList()
                        identifications = childLegalEntityCreate.identifications?.toMutableList()
                        additionalProperties =
                            childLegalEntityCreate.additionalProperties.toMutableMap()
                    }

                    /** The type of legal entity. */
                    fun legalEntityType(legalEntityType: LegalEntityType) = apply {
                        this.legalEntityType = legalEntityType
                    }

                    /** The risk rating of the legal entity. One of low, medium, high. */
                    fun riskRating(riskRating: RiskRating) = apply { this.riskRating = riskRating }

                    /** An individual's prefix. */
                    fun prefix(prefix: String) = apply { this.prefix = prefix }

                    /** An individual's first name. */
                    fun firstName(firstName: String) = apply { this.firstName = firstName }

                    /** An individual's middle name. */
                    fun middleName(middleName: String) = apply { this.middleName = middleName }

                    /** An individual's last name. */
                    fun lastName(lastName: String) = apply { this.lastName = lastName }

                    /** An individual's suffix. */
                    fun suffix(suffix: String) = apply { this.suffix = suffix }

                    /** An individual's preferred name. */
                    fun preferredName(preferredName: String) = apply {
                        this.preferredName = preferredName
                    }

                    /** The country of citizenship for an individual. */
                    fun citizenshipCountry(citizenshipCountry: String) = apply {
                        this.citizenshipCountry = citizenshipCountry
                    }

                    /** Whether the individual is a politically exposed person. */
                    fun politicallyExposedPerson(politicallyExposedPerson: Boolean) = apply {
                        this.politicallyExposedPerson = politicallyExposedPerson
                    }

                    /** An individual's date of birth (YYYY-MM-DD). */
                    fun dateOfBirth(dateOfBirth: LocalDate) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    /** A business's formation date (YYYY-MM-DD). */
                    fun dateFormed(dateFormed: LocalDate) = apply { this.dateFormed = dateFormed }

                    /** The business's legal business name. */
                    fun businessName(businessName: String) = apply {
                        this.businessName = businessName
                    }

                    fun doingBusinessAsNames(doingBusinessAsNames: List<String>) = apply {
                        this.doingBusinessAsNames = doingBusinessAsNames.toMutableList()
                    }

                    fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
                        doingBusinessAsNames =
                            (doingBusinessAsNames ?: mutableListOf()).apply {
                                add(doingBusinessAsName)
                            }
                    }

                    /** The business's legal structure. */
                    fun legalStructure(legalStructure: LegalStructure) = apply {
                        this.legalStructure = legalStructure
                    }

                    fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = apply {
                        this.phoneNumbers = phoneNumbers.toMutableList()
                    }

                    fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
                        phoneNumbers = (phoneNumbers ?: mutableListOf()).apply { add(phoneNumber) }
                    }

                    /** The entity's primary email. */
                    fun email(email: String) = apply { this.email = email }

                    /** The entity's primary website URL. */
                    fun website(website: String) = apply { this.website = website }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                    fun bankSettings(bankSettings: BankSettings) = apply {
                        this.bankSettings = bankSettings
                    }

                    fun wealthAndEmploymentDetails(
                        wealthAndEmploymentDetails: WealthAndEmploymentDetails
                    ) = apply { this.wealthAndEmploymentDetails = wealthAndEmploymentDetails }

                    /** A list of addresses for the entity. */
                    fun addresses(addresses: List<LegalEntityAddressCreateRequest>) = apply {
                        this.addresses = addresses.toMutableList()
                    }

                    /** A list of addresses for the entity. */
                    fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
                        addresses = (addresses ?: mutableListOf()).apply { add(address) }
                    }

                    /** A list of identifications for the legal entity. */
                    fun identifications(identifications: List<IdentificationCreateRequest>) =
                        apply {
                            this.identifications = identifications.toMutableList()
                        }

                    /** A list of identifications for the legal entity. */
                    fun addIdentification(identification: IdentificationCreateRequest) = apply {
                        identifications =
                            (identifications ?: mutableListOf()).apply { add(identification) }
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

                    fun build(): ChildLegalEntityCreate =
                        ChildLegalEntityCreate(
                            legalEntityType,
                            riskRating,
                            prefix,
                            firstName,
                            middleName,
                            lastName,
                            suffix,
                            preferredName,
                            citizenshipCountry,
                            politicallyExposedPerson,
                            dateOfBirth,
                            dateFormed,
                            businessName,
                            doingBusinessAsNames?.toImmutable(),
                            legalStructure,
                            phoneNumbers?.toImmutable(),
                            email,
                            website,
                            metadata,
                            bankSettings,
                            wealthAndEmploymentDetails,
                            addresses?.toImmutable(),
                            identifications?.toImmutable(),
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class LegalEntityAddressCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("address_types") private val addressTypes: List<AddressType>?,
                    @JsonProperty("line1") private val line1: String?,
                    @JsonProperty("line2") private val line2: String?,
                    @JsonProperty("locality") private val locality: String?,
                    @JsonProperty("region") private val region: String?,
                    @JsonProperty("postal_code") private val postalCode: String?,
                    @JsonProperty("country") private val country: String?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The types of this address. */
                    @JsonProperty("address_types")
                    fun addressTypes(): List<AddressType>? = addressTypes

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

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var addressTypes: MutableList<AddressType>? = null
                        private var line1: String? = null
                        private var line2: String? = null
                        private var locality: String? = null
                        private var region: String? = null
                        private var postalCode: String? = null
                        private var country: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest
                        ) = apply {
                            addressTypes =
                                legalEntityAddressCreateRequest.addressTypes?.toMutableList()
                            line1 = legalEntityAddressCreateRequest.line1
                            line2 = legalEntityAddressCreateRequest.line2
                            locality = legalEntityAddressCreateRequest.locality
                            region = legalEntityAddressCreateRequest.region
                            postalCode = legalEntityAddressCreateRequest.postalCode
                            country = legalEntityAddressCreateRequest.country
                            additionalProperties =
                                legalEntityAddressCreateRequest.additionalProperties.toMutableMap()
                        }

                        /** The types of this address. */
                        fun addressTypes(addressTypes: List<AddressType>) = apply {
                            this.addressTypes = addressTypes.toMutableList()
                        }

                        /** The types of this address. */
                        fun addAddressType(addressType: AddressType) = apply {
                            addressTypes =
                                (addressTypes ?: mutableListOf()).apply { add(addressType) }
                        }

                        fun line1(line1: String) = apply { this.line1 = line1 }

                        fun line2(line2: String) = apply { this.line2 = line2 }

                        /** Locality or City. */
                        fun locality(locality: String) = apply { this.locality = locality }

                        /** Region or State. */
                        fun region(region: String) = apply { this.region = region }

                        /** The postal code of the address. */
                        fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: String) = apply { this.country = country }

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
                                addressTypes?.toImmutable(),
                                line1,
                                line2,
                                locality,
                                region,
                                postalCode,
                                country,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class AddressType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

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

                        enum class Known {
                            BUSINESS,
                            MAILING,
                            OTHER,
                            PO_BOX,
                            RESIDENTIAL,
                        }

                        enum class Value {
                            BUSINESS,
                            MAILING,
                            OTHER,
                            PO_BOX,
                            RESIDENTIAL,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                BUSINESS -> Value.BUSINESS
                                MAILING -> Value.MAILING
                                OTHER -> Value.OTHER
                                PO_BOX -> Value.PO_BOX
                                RESIDENTIAL -> Value.RESIDENTIAL
                                else -> Value._UNKNOWN
                            }

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

                        fun asString(): String = _value().asStringOrThrow()

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

                        return /* spotless:off */ other is LegalEntityAddressCreateRequest && addressTypes == other.addressTypes && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(addressTypes, line1, line2, locality, region, postalCode, country, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LegalEntityAddressCreateRequest{addressTypes=$addressTypes, line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class IdentificationCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("id_number") private val idNumber: String,
                    @JsonProperty("id_type") private val idType: IdType,
                    @JsonProperty("issuing_country") private val issuingCountry: String?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The ID number of identification document. */
                    @JsonProperty("id_number") fun idNumber(): String = idNumber

                    /** The type of ID number. */
                    @JsonProperty("id_type") fun idType(): IdType = idType

                    /**
                     * The ISO 3166-1 alpha-2 country code of the country that issued the
                     * identification
                     */
                    @JsonProperty("issuing_country") fun issuingCountry(): String? = issuingCountry

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var idNumber: String? = null
                        private var idType: IdType? = null
                        private var issuingCountry: String? = null
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
                        fun idNumber(idNumber: String) = apply { this.idNumber = idNumber }

                        /** The type of ID number. */
                        fun idType(idType: IdType) = apply { this.idType = idType }

                        /**
                         * The ISO 3166-1 alpha-2 country code of the country that issued the
                         * identification
                         */
                        fun issuingCountry(issuingCountry: String) = apply {
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
                                checkNotNull(idNumber) { "`idNumber` is required but was not set" },
                                checkNotNull(idType) { "`idType` is required but was not set" },
                                issuingCountry,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class IdType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

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
                            _UNKNOWN,
                        }

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

                        fun asString(): String = _value().asStringOrThrow()

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

                class LegalEntityType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val BUSINESS = of("business")

                        val INDIVIDUAL = of("individual")

                        fun of(value: String) = LegalEntityType(JsonField.of(value))
                    }

                    enum class Known {
                        BUSINESS,
                        INDIVIDUAL,
                    }

                    enum class Value {
                        BUSINESS,
                        INDIVIDUAL,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            BUSINESS -> Value.BUSINESS
                            INDIVIDUAL -> Value.INDIVIDUAL
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            BUSINESS -> Known.BUSINESS
                            INDIVIDUAL -> Known.INDIVIDUAL
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown LegalEntityType: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LegalEntityType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class LegalStructure
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

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

                    enum class Known {
                        CORPORATION,
                        LLC,
                        NON_PROFIT,
                        PARTNERSHIP,
                        SOLE_PROPRIETORSHIP,
                        TRUST,
                    }

                    enum class Value {
                        CORPORATION,
                        LLC,
                        NON_PROFIT,
                        PARTNERSHIP,
                        SOLE_PROPRIETORSHIP,
                        TRUST,
                        _UNKNOWN,
                    }

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

                    fun asString(): String = _value().asStringOrThrow()

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
                    @JsonProperty("phone_number") private val phoneNumber: String?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonProperty("phone_number") fun phoneNumber(): String? = phoneNumber

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var phoneNumber: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(phoneNumber: PhoneNumber) = apply {
                            this.phoneNumber = phoneNumber.phoneNumber
                            additionalProperties = phoneNumber.additionalProperties.toMutableMap()
                        }

                        fun phoneNumber(phoneNumber: String) = apply {
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

                class RiskRating
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val LOW = of("low")

                        val MEDIUM = of("medium")

                        val HIGH = of("high")

                        fun of(value: String) = RiskRating(JsonField.of(value))
                    }

                    enum class Known {
                        LOW,
                        MEDIUM,
                        HIGH,
                    }

                    enum class Value {
                        LOW,
                        MEDIUM,
                        HIGH,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            LOW -> Value.LOW
                            MEDIUM -> Value.MEDIUM
                            HIGH -> Value.HIGH
                            else -> Value._UNKNOWN
                        }

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

                    fun asString(): String = _value().asStringOrThrow()

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

                    return /* spotless:off */ other is ChildLegalEntityCreate && legalEntityType == other.legalEntityType && riskRating == other.riskRating && prefix == other.prefix && firstName == other.firstName && middleName == other.middleName && lastName == other.lastName && suffix == other.suffix && preferredName == other.preferredName && citizenshipCountry == other.citizenshipCountry && politicallyExposedPerson == other.politicallyExposedPerson && dateOfBirth == other.dateOfBirth && dateFormed == other.dateFormed && businessName == other.businessName && doingBusinessAsNames == other.doingBusinessAsNames && legalStructure == other.legalStructure && phoneNumbers == other.phoneNumbers && email == other.email && website == other.website && metadata == other.metadata && bankSettings == other.bankSettings && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && addresses == other.addresses && identifications == other.identifications && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(legalEntityType, riskRating, prefix, firstName, middleName, lastName, suffix, preferredName, citizenshipCountry, politicallyExposedPerson, dateOfBirth, dateFormed, businessName, doingBusinessAsNames, legalStructure, phoneNumbers, email, website, metadata, bankSettings, wealthAndEmploymentDetails, addresses, identifications, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ChildLegalEntityCreate{legalEntityType=$legalEntityType, riskRating=$riskRating, prefix=$prefix, firstName=$firstName, middleName=$middleName, lastName=$lastName, suffix=$suffix, preferredName=$preferredName, citizenshipCountry=$citizenshipCountry, politicallyExposedPerson=$politicallyExposedPerson, dateOfBirth=$dateOfBirth, dateFormed=$dateFormed, businessName=$businessName, doingBusinessAsNames=$doingBusinessAsNames, legalStructure=$legalStructure, phoneNumbers=$phoneNumbers, email=$email, website=$website, metadata=$metadata, bankSettings=$bankSettings, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, addresses=$addresses, identifications=$identifications, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LegalEntityAssociationInlineCreateRequest && relationshipTypes == other.relationshipTypes && title == other.title && ownershipPercentage == other.ownershipPercentage && childLegalEntity == other.childLegalEntity && childLegalEntityId == other.childLegalEntityId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(relationshipTypes, title, ownershipPercentage, childLegalEntity, childLegalEntityId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LegalEntityAssociationInlineCreateRequest{relationshipTypes=$relationshipTypes, title=$title, ownershipPercentage=$ownershipPercentage, childLegalEntity=$childLegalEntity, childLegalEntityId=$childLegalEntityId, additionalProperties=$additionalProperties}"
        }

        class LegalStructure
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

            enum class Known {
                CORPORATION,
                LLC,
                NON_PROFIT,
                PARTNERSHIP,
                SOLE_PROPRIETORSHIP,
                TRUST,
            }

            enum class Value {
                CORPORATION,
                LLC,
                NON_PROFIT,
                PARTNERSHIP,
                SOLE_PROPRIETORSHIP,
                TRUST,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

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
            @JsonProperty("phone_number") private val phoneNumber: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("phone_number") fun phoneNumber(): String? = phoneNumber

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var phoneNumber: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(phoneNumber: PhoneNumber) = apply {
                    this.phoneNumber = phoneNumber.phoneNumber
                    additionalProperties = phoneNumber.additionalProperties.toMutableMap()
                }

                fun phoneNumber(phoneNumber: String) = apply { this.phoneNumber = phoneNumber }

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

        class RiskRating
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val LOW = of("low")

                val MEDIUM = of("medium")

                val HIGH = of("high")

                fun of(value: String) = RiskRating(JsonField.of(value))
            }

            enum class Known {
                LOW,
                MEDIUM,
                HIGH,
            }

            enum class Value {
                LOW,
                MEDIUM,
                HIGH,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    LOW -> Value.LOW
                    MEDIUM -> Value.MEDIUM
                    HIGH -> Value.HIGH
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    LOW -> Known.LOW
                    MEDIUM -> Known.MEDIUM
                    HIGH -> Known.HIGH
                    else -> throw ModernTreasuryInvalidDataException("Unknown RiskRating: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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

            return /* spotless:off */ other is LegalEntityCreateRequest && legalEntityType == other.legalEntityType && riskRating == other.riskRating && prefix == other.prefix && firstName == other.firstName && middleName == other.middleName && lastName == other.lastName && suffix == other.suffix && preferredName == other.preferredName && citizenshipCountry == other.citizenshipCountry && politicallyExposedPerson == other.politicallyExposedPerson && dateOfBirth == other.dateOfBirth && dateFormed == other.dateFormed && businessName == other.businessName && doingBusinessAsNames == other.doingBusinessAsNames && legalStructure == other.legalStructure && phoneNumbers == other.phoneNumbers && email == other.email && website == other.website && metadata == other.metadata && bankSettings == other.bankSettings && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && addresses == other.addresses && identifications == other.identifications && legalEntityAssociations == other.legalEntityAssociations && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(legalEntityType, riskRating, prefix, firstName, middleName, lastName, suffix, preferredName, citizenshipCountry, politicallyExposedPerson, dateOfBirth, dateFormed, businessName, doingBusinessAsNames, legalStructure, phoneNumbers, email, website, metadata, bankSettings, wealthAndEmploymentDetails, addresses, identifications, legalEntityAssociations, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntityCreateRequest{legalEntityType=$legalEntityType, riskRating=$riskRating, prefix=$prefix, firstName=$firstName, middleName=$middleName, lastName=$lastName, suffix=$suffix, preferredName=$preferredName, citizenshipCountry=$citizenshipCountry, politicallyExposedPerson=$politicallyExposedPerson, dateOfBirth=$dateOfBirth, dateFormed=$dateFormed, businessName=$businessName, doingBusinessAsNames=$doingBusinessAsNames, legalStructure=$legalStructure, phoneNumbers=$phoneNumbers, email=$email, website=$website, metadata=$metadata, bankSettings=$bankSettings, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, addresses=$addresses, identifications=$identifications, legalEntityAssociations=$legalEntityAssociations, additionalProperties=$additionalProperties}"
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

    class VerificationStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DENIED = of("denied")

            val NEEDS_APPROVAL = of("needs_approval")

            val UNVERIFIED = of("unverified")

            val VERIFIED = of("verified")

            fun of(value: String) = VerificationStatus(JsonField.of(value))
        }

        enum class Known {
            DENIED,
            NEEDS_APPROVAL,
            UNVERIFIED,
            VERIFIED,
        }

        enum class Value {
            DENIED,
            NEEDS_APPROVAL,
            UNVERIFIED,
            VERIFIED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DENIED -> Value.DENIED
                NEEDS_APPROVAL -> Value.NEEDS_APPROVAL
                UNVERIFIED -> Value.UNVERIFIED
                VERIFIED -> Value.VERIFIED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DENIED -> Known.DENIED
                NEEDS_APPROVAL -> Known.NEEDS_APPROVAL
                UNVERIFIED -> Known.UNVERIFIED
                VERIFIED -> Known.VERIFIED
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown VerificationStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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
