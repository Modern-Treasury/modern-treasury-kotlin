// File generated from our OpenAPI spec by Stainless.

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
import java.util.Objects

class CounterpartyCreateParams
constructor(
    private val name: String?,
    private val accounting: Accounting?,
    private val accounts: List<Account>?,
    private val email: String?,
    private val ledgerType: LedgerType?,
    private val metadata: Metadata?,
    private val sendRemittanceAdvice: Boolean?,
    private val taxpayerIdentifier: String?,
    private val verificationStatus: VerificationStatus?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String? = name

    fun accounting(): Accounting? = accounting

    fun accounts(): List<Account>? = accounts

    fun email(): String? = email

    fun ledgerType(): LedgerType? = ledgerType

    fun metadata(): Metadata? = metadata

    fun sendRemittanceAdvice(): Boolean? = sendRemittanceAdvice

    fun taxpayerIdentifier(): String? = taxpayerIdentifier

    fun verificationStatus(): VerificationStatus? = verificationStatus

    internal fun getBody(): CounterpartyCreateBody {
        return CounterpartyCreateBody(
            name,
            accounting,
            accounts,
            email,
            ledgerType,
            metadata,
            sendRemittanceAdvice,
            taxpayerIdentifier,
            verificationStatus,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CounterpartyCreateBody.Builder::class)
    @NoAutoDetect
    class CounterpartyCreateBody
    internal constructor(
        private val name: String?,
        private val accounting: Accounting?,
        private val accounts: List<Account>?,
        private val email: String?,
        private val ledgerType: LedgerType?,
        private val metadata: Metadata?,
        private val sendRemittanceAdvice: Boolean?,
        private val taxpayerIdentifier: String?,
        private val verificationStatus: VerificationStatus?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CounterpartyCreateBody &&
                this.name == other.name &&
                this.accounting == other.accounting &&
                this.accounts == other.accounts &&
                this.email == other.email &&
                this.ledgerType == other.ledgerType &&
                this.metadata == other.metadata &&
                this.sendRemittanceAdvice == other.sendRemittanceAdvice &&
                this.taxpayerIdentifier == other.taxpayerIdentifier &&
                this.verificationStatus == other.verificationStatus &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        accounting,
                        accounts,
                        email,
                        ledgerType,
                        metadata,
                        sendRemittanceAdvice,
                        taxpayerIdentifier,
                        verificationStatus,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CounterpartyCreateBody{name=$name, accounting=$accounting, accounts=$accounts, email=$email, ledgerType=$ledgerType, metadata=$metadata, sendRemittanceAdvice=$sendRemittanceAdvice, taxpayerIdentifier=$taxpayerIdentifier, verificationStatus=$verificationStatus, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var accounting: Accounting? = null
            private var accounts: List<Account>? = null
            private var email: String? = null
            private var ledgerType: LedgerType? = null
            private var metadata: Metadata? = null
            private var sendRemittanceAdvice: Boolean? = null
            private var taxpayerIdentifier: String? = null
            private var verificationStatus: VerificationStatus? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(counterpartyCreateBody: CounterpartyCreateBody) = apply {
                this.name = counterpartyCreateBody.name
                this.accounting = counterpartyCreateBody.accounting
                this.accounts = counterpartyCreateBody.accounts
                this.email = counterpartyCreateBody.email
                this.ledgerType = counterpartyCreateBody.ledgerType
                this.metadata = counterpartyCreateBody.metadata
                this.sendRemittanceAdvice = counterpartyCreateBody.sendRemittanceAdvice
                this.taxpayerIdentifier = counterpartyCreateBody.taxpayerIdentifier
                this.verificationStatus = counterpartyCreateBody.verificationStatus
                additionalProperties(counterpartyCreateBody.additionalProperties)
            }

            /** A human friendly name for this counterparty. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("accounting")
            fun accounting(accounting: Accounting) = apply { this.accounting = accounting }

            /** The accounts for this counterparty. */
            @JsonProperty("accounts")
            fun accounts(accounts: List<Account>) = apply { this.accounts = accounts }

            /** The counterparty's email. */
            @JsonProperty("email") fun email(email: String) = apply { this.email = email }

            /**
             * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
             * `vendor`.
             */
            @JsonProperty("ledger_type")
            fun ledgerType(ledgerType: LedgerType) = apply { this.ledgerType = ledgerType }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * Send an email to the counterparty whenever an associated payment order is sent to the
             * bank.
             */
            @JsonProperty("send_remittance_advice")
            fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) = apply {
                this.sendRemittanceAdvice = sendRemittanceAdvice
            }

            /** Either a valid SSN or EIN. */
            @JsonProperty("taxpayer_identifier")
            fun taxpayerIdentifier(taxpayerIdentifier: String) = apply {
                this.taxpayerIdentifier = taxpayerIdentifier
            }

            /** The verification status of the counterparty. */
            @JsonProperty("verification_status")
            fun verificationStatus(verificationStatus: VerificationStatus) = apply {
                this.verificationStatus = verificationStatus
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

            fun build(): CounterpartyCreateBody =
                CounterpartyCreateBody(
                    name,
                    accounting,
                    accounts?.toUnmodifiable(),
                    email,
                    ledgerType,
                    metadata,
                    sendRemittanceAdvice,
                    taxpayerIdentifier,
                    verificationStatus,
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

        return other is CounterpartyCreateParams &&
            this.name == other.name &&
            this.accounting == other.accounting &&
            this.accounts == other.accounts &&
            this.email == other.email &&
            this.ledgerType == other.ledgerType &&
            this.metadata == other.metadata &&
            this.sendRemittanceAdvice == other.sendRemittanceAdvice &&
            this.taxpayerIdentifier == other.taxpayerIdentifier &&
            this.verificationStatus == other.verificationStatus &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            name,
            accounting,
            accounts,
            email,
            ledgerType,
            metadata,
            sendRemittanceAdvice,
            taxpayerIdentifier,
            verificationStatus,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "CounterpartyCreateParams{name=$name, accounting=$accounting, accounts=$accounts, email=$email, ledgerType=$ledgerType, metadata=$metadata, sendRemittanceAdvice=$sendRemittanceAdvice, taxpayerIdentifier=$taxpayerIdentifier, verificationStatus=$verificationStatus, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var accounting: Accounting? = null
        private var accounts: MutableList<Account> = mutableListOf()
        private var email: String? = null
        private var ledgerType: LedgerType? = null
        private var metadata: Metadata? = null
        private var sendRemittanceAdvice: Boolean? = null
        private var taxpayerIdentifier: String? = null
        private var verificationStatus: VerificationStatus? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(counterpartyCreateParams: CounterpartyCreateParams) = apply {
            this.name = counterpartyCreateParams.name
            this.accounting = counterpartyCreateParams.accounting
            this.accounts(counterpartyCreateParams.accounts ?: listOf())
            this.email = counterpartyCreateParams.email
            this.ledgerType = counterpartyCreateParams.ledgerType
            this.metadata = counterpartyCreateParams.metadata
            this.sendRemittanceAdvice = counterpartyCreateParams.sendRemittanceAdvice
            this.taxpayerIdentifier = counterpartyCreateParams.taxpayerIdentifier
            this.verificationStatus = counterpartyCreateParams.verificationStatus
            additionalQueryParams(counterpartyCreateParams.additionalQueryParams)
            additionalHeaders(counterpartyCreateParams.additionalHeaders)
            additionalBodyProperties(counterpartyCreateParams.additionalBodyProperties)
        }

        /** A human friendly name for this counterparty. */
        fun name(name: String) = apply { this.name = name }

        fun accounting(accounting: Accounting) = apply { this.accounting = accounting }

        /** The accounts for this counterparty. */
        fun accounts(accounts: List<Account>) = apply {
            this.accounts.clear()
            this.accounts.addAll(accounts)
        }

        /** The accounts for this counterparty. */
        fun addAccount(account: Account) = apply { this.accounts.add(account) }

        /** The counterparty's email. */
        fun email(email: String) = apply { this.email = email }

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         */
        fun ledgerType(ledgerType: LedgerType) = apply { this.ledgerType = ledgerType }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
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

        fun build(): CounterpartyCreateParams =
            CounterpartyCreateParams(
                name,
                accounting,
                if (accounts.size == 0) null else accounts.toUnmodifiable(),
                email,
                ledgerType,
                metadata,
                sendRemittanceAdvice,
                taxpayerIdentifier,
                verificationStatus,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Accounting.Builder::class)
    @NoAutoDetect
    class Accounting
    private constructor(
        private val type: Type?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         */
        @JsonProperty("type") fun type(): Type? = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Accounting &&
                this.type == other.type &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(type, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "Accounting{type=$type, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accounting: Accounting) = apply {
                this.type = accounting.type
                additionalProperties(accounting.additionalProperties)
            }

            /**
             * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
             * `vendor`.
             */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

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

            fun build(): Accounting = Accounting(type, additionalProperties.toUnmodifiable())
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val CUSTOMER = Type(JsonField.of("customer"))

                val VENDOR = Type(JsonField.of("vendor"))

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
        }
    }

    @JsonDeserialize(builder = Account.Builder::class)
    @NoAutoDetect
    class Account
    private constructor(
        private val accountType: ExternalAccountType?,
        private val partyType: PartyType?,
        private val partyAddress: AddressRequest?,
        private val name: String?,
        private val accountDetails: List<AccountDetail>?,
        private val routingDetails: List<RoutingDetail>?,
        private val metadata: Metadata?,
        private val partyName: String?,
        private val partyIdentifier: String?,
        private val ledgerAccount: LedgerAccountCreateRequest?,
        private val plaidProcessorToken: String?,
        private val contactDetails: List<ContactDetailCreateRequest>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Account &&
                this.accountType == other.accountType &&
                this.partyType == other.partyType &&
                this.partyAddress == other.partyAddress &&
                this.name == other.name &&
                this.accountDetails == other.accountDetails &&
                this.routingDetails == other.routingDetails &&
                this.metadata == other.metadata &&
                this.partyName == other.partyName &&
                this.partyIdentifier == other.partyIdentifier &&
                this.ledgerAccount == other.ledgerAccount &&
                this.plaidProcessorToken == other.plaidProcessorToken &&
                this.contactDetails == other.contactDetails &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountType,
                        partyType,
                        partyAddress,
                        name,
                        accountDetails,
                        routingDetails,
                        metadata,
                        partyName,
                        partyIdentifier,
                        ledgerAccount,
                        plaidProcessorToken,
                        contactDetails,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Account{accountType=$accountType, partyType=$partyType, partyAddress=$partyAddress, name=$name, accountDetails=$accountDetails, routingDetails=$routingDetails, metadata=$metadata, partyName=$partyName, partyIdentifier=$partyIdentifier, ledgerAccount=$ledgerAccount, plaidProcessorToken=$plaidProcessorToken, contactDetails=$contactDetails, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountType: ExternalAccountType? = null
            private var partyType: PartyType? = null
            private var partyAddress: AddressRequest? = null
            private var name: String? = null
            private var accountDetails: List<AccountDetail>? = null
            private var routingDetails: List<RoutingDetail>? = null
            private var metadata: Metadata? = null
            private var partyName: String? = null
            private var partyIdentifier: String? = null
            private var ledgerAccount: LedgerAccountCreateRequest? = null
            private var plaidProcessorToken: String? = null
            private var contactDetails: List<ContactDetailCreateRequest>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(account: Account) = apply {
                this.accountType = account.accountType
                this.partyType = account.partyType
                this.partyAddress = account.partyAddress
                this.name = account.name
                this.accountDetails = account.accountDetails
                this.routingDetails = account.routingDetails
                this.metadata = account.metadata
                this.partyName = account.partyName
                this.partyIdentifier = account.partyIdentifier
                this.ledgerAccount = account.ledgerAccount
                this.plaidProcessorToken = account.plaidProcessorToken
                this.contactDetails = account.contactDetails
                additionalProperties(account.additionalProperties)
            }

            /** Can be `checking`, `savings` or `other`. */
            @JsonProperty("account_type")
            fun accountType(accountType: ExternalAccountType) = apply {
                this.accountType = accountType
            }

            /** Either `individual` or `business`. */
            @JsonProperty("party_type")
            fun partyType(partyType: PartyType) = apply { this.partyType = partyType }

            /** Required if receiving wire payments. */
            @JsonProperty("party_address")
            fun partyAddress(partyAddress: AddressRequest) = apply {
                this.partyAddress = partyAddress
            }

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("account_details")
            fun accountDetails(accountDetails: List<AccountDetail>) = apply {
                this.accountDetails = accountDetails
            }

            @JsonProperty("routing_details")
            fun routingDetails(routingDetails: List<RoutingDetail>) = apply {
                this.routingDetails = routingDetails
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** If this value isn't provided, it will be inherited from the counterparty's name. */
            @JsonProperty("party_name")
            fun partyName(partyName: String) = apply { this.partyName = partyName }

            @JsonProperty("party_identifier")
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
            @JsonProperty("ledger_account")
            fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) = apply {
                this.ledgerAccount = ledgerAccount
            }

            /**
             * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you
             * can pass the processor token in this field.
             */
            @JsonProperty("plaid_processor_token")
            fun plaidProcessorToken(plaidProcessorToken: String) = apply {
                this.plaidProcessorToken = plaidProcessorToken
            }

            @JsonProperty("contact_details")
            fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) = apply {
                this.contactDetails = contactDetails
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

            fun build(): Account =
                Account(
                    accountType,
                    partyType,
                    partyAddress,
                    name,
                    accountDetails?.toUnmodifiable(),
                    routingDetails?.toUnmodifiable(),
                    metadata,
                    partyName,
                    partyIdentifier,
                    ledgerAccount,
                    plaidProcessorToken,
                    contactDetails?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = AccountDetail.Builder::class)
        @NoAutoDetect
        class AccountDetail
        private constructor(
            private val accountNumber: String?,
            private val accountNumberType: AccountNumberType?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonProperty("account_number") fun accountNumber(): String? = accountNumber

            @JsonProperty("account_number_type")
            fun accountNumberType(): AccountNumberType? = accountNumberType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccountDetail &&
                    this.accountNumber == other.accountNumber &&
                    this.accountNumberType == other.accountNumberType &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            accountNumber,
                            accountNumberType,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AccountDetail{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var accountNumber: String? = null
                private var accountNumberType: AccountNumberType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(accountDetail: AccountDetail) = apply {
                    this.accountNumber = accountDetail.accountNumber
                    this.accountNumberType = accountDetail.accountNumberType
                    additionalProperties(accountDetail.additionalProperties)
                }

                @JsonProperty("account_number")
                fun accountNumber(accountNumber: String) = apply {
                    this.accountNumber = accountNumber
                }

                @JsonProperty("account_number_type")
                fun accountNumberType(accountNumberType: AccountNumberType) = apply {
                    this.accountNumberType = accountNumberType
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

                fun build(): AccountDetail =
                    AccountDetail(
                        checkNotNull(accountNumber) {
                            "`accountNumber` is required but was not set"
                        },
                        accountNumberType,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class AccountNumberType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AccountNumberType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val IBAN = AccountNumberType(JsonField.of("iban"))

                    val CLABE = AccountNumberType(JsonField.of("clabe"))

                    val WALLET_ADDRESS = AccountNumberType(JsonField.of("wallet_address"))

                    val PAN = AccountNumberType(JsonField.of("pan"))

                    val OTHER = AccountNumberType(JsonField.of("other"))

                    fun of(value: String) = AccountNumberType(JsonField.of(value))
                }

                enum class Known {
                    IBAN,
                    CLABE,
                    WALLET_ADDRESS,
                    PAN,
                    OTHER,
                }

                enum class Value {
                    IBAN,
                    CLABE,
                    WALLET_ADDRESS,
                    PAN,
                    OTHER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        IBAN -> Value.IBAN
                        CLABE -> Value.CLABE
                        WALLET_ADDRESS -> Value.WALLET_ADDRESS
                        PAN -> Value.PAN
                        OTHER -> Value.OTHER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        IBAN -> Known.IBAN
                        CLABE -> Known.CLABE
                        WALLET_ADDRESS -> Known.WALLET_ADDRESS
                        PAN -> Known.PAN
                        OTHER -> Known.OTHER
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown AccountNumberType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        @JsonDeserialize(builder = ContactDetailCreateRequest.Builder::class)
        @NoAutoDetect
        class ContactDetailCreateRequest
        private constructor(
            private val contactIdentifier: String?,
            private val contactIdentifierType: ContactIdentifierType?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonProperty("contact_identifier") fun contactIdentifier(): String? = contactIdentifier

            @JsonProperty("contact_identifier_type")
            fun contactIdentifierType(): ContactIdentifierType? = contactIdentifierType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ContactDetailCreateRequest &&
                    this.contactIdentifier == other.contactIdentifier &&
                    this.contactIdentifierType == other.contactIdentifierType &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            contactIdentifier,
                            contactIdentifierType,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "ContactDetailCreateRequest{contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var contactIdentifier: String? = null
                private var contactIdentifierType: ContactIdentifierType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(contactDetailCreateRequest: ContactDetailCreateRequest) = apply {
                    this.contactIdentifier = contactDetailCreateRequest.contactIdentifier
                    this.contactIdentifierType = contactDetailCreateRequest.contactIdentifierType
                    additionalProperties(contactDetailCreateRequest.additionalProperties)
                }

                @JsonProperty("contact_identifier")
                fun contactIdentifier(contactIdentifier: String) = apply {
                    this.contactIdentifier = contactIdentifier
                }

                @JsonProperty("contact_identifier_type")
                fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) = apply {
                    this.contactIdentifierType = contactIdentifierType
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

                fun build(): ContactDetailCreateRequest =
                    ContactDetailCreateRequest(
                        contactIdentifier,
                        contactIdentifierType,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class ContactIdentifierType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ContactIdentifierType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val EMAIL = ContactIdentifierType(JsonField.of("email"))

                    val PHONE_NUMBER = ContactIdentifierType(JsonField.of("phone_number"))

                    val WEBSITE = ContactIdentifierType(JsonField.of("website"))

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
            }
        }

        /**
         * Specifies a ledger account object that will be created with the external account. The
         * resulting ledger account is linked to the external account for auto-ledgering Payment
         * objects. See
         * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for more
         * details.
         */
        @JsonDeserialize(builder = LedgerAccountCreateRequest.Builder::class)
        @NoAutoDetect
        class LedgerAccountCreateRequest
        private constructor(
            private val name: String?,
            private val description: String?,
            private val normalBalance: TransactionDirection?,
            private val ledgerId: String?,
            private val currency: String?,
            private val currencyExponent: Long?,
            private val ledgerableId: String?,
            private val ledgerableType: LedgerableType?,
            private val metadata: Metadata?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The name of the ledger account. */
            @JsonProperty("name") fun name(): String? = name

            /** The description of the ledger account. */
            @JsonProperty("description") fun description(): String? = description

            /** The normal balance of the ledger account. */
            @JsonProperty("normal_balance")
            fun normalBalance(): TransactionDirection? = normalBalance

            /** The id of the ledger that this account belongs to. */
            @JsonProperty("ledger_id") fun ledgerId(): String? = ledgerId

            /** The currency of the ledger account. */
            @JsonProperty("currency") fun currency(): String? = currency

            /** The currency exponent of the ledger account. */
            @JsonProperty("currency_exponent") fun currencyExponent(): Long? = currencyExponent

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LedgerAccountCreateRequest &&
                    this.name == other.name &&
                    this.description == other.description &&
                    this.normalBalance == other.normalBalance &&
                    this.ledgerId == other.ledgerId &&
                    this.currency == other.currency &&
                    this.currencyExponent == other.currencyExponent &&
                    this.ledgerableId == other.ledgerableId &&
                    this.ledgerableType == other.ledgerableType &&
                    this.metadata == other.metadata &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            name,
                            description,
                            normalBalance,
                            ledgerId,
                            currency,
                            currencyExponent,
                            ledgerableId,
                            ledgerableType,
                            metadata,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "LedgerAccountCreateRequest{name=$name, description=$description, normalBalance=$normalBalance, ledgerId=$ledgerId, currency=$currency, currencyExponent=$currencyExponent, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, additionalProperties=$additionalProperties}"

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
                private var ledgerableId: String? = null
                private var ledgerableType: LedgerableType? = null
                private var metadata: Metadata? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(ledgerAccountCreateRequest: LedgerAccountCreateRequest) = apply {
                    this.name = ledgerAccountCreateRequest.name
                    this.description = ledgerAccountCreateRequest.description
                    this.normalBalance = ledgerAccountCreateRequest.normalBalance
                    this.ledgerId = ledgerAccountCreateRequest.ledgerId
                    this.currency = ledgerAccountCreateRequest.currency
                    this.currencyExponent = ledgerAccountCreateRequest.currencyExponent
                    this.ledgerableId = ledgerAccountCreateRequest.ledgerableId
                    this.ledgerableType = ledgerAccountCreateRequest.ledgerableType
                    this.metadata = ledgerAccountCreateRequest.metadata
                    additionalProperties(ledgerAccountCreateRequest.additionalProperties)
                }

                /** The name of the ledger account. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                /** The description of the ledger account. */
                @JsonProperty("description")
                fun description(description: String) = apply { this.description = description }

                /** The normal balance of the ledger account. */
                @JsonProperty("normal_balance")
                fun normalBalance(normalBalance: TransactionDirection) = apply {
                    this.normalBalance = normalBalance
                }

                /** The id of the ledger that this account belongs to. */
                @JsonProperty("ledger_id")
                fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

                /** The currency of the ledger account. */
                @JsonProperty("currency")
                fun currency(currency: String) = apply { this.currency = currency }

                /** The currency exponent of the ledger account. */
                @JsonProperty("currency_exponent")
                fun currencyExponent(currencyExponent: Long) = apply {
                    this.currencyExponent = currencyExponent
                }

                /**
                 * If the ledger account links to another object in Modern Treasury, the id will be
                 * populated here, otherwise null.
                 */
                @JsonProperty("ledgerable_id")
                fun ledgerableId(ledgerableId: String) = apply { this.ledgerableId = ledgerableId }

                /**
                 * If the ledger account links to another object in Modern Treasury, the type will
                 * be populated here, otherwise null. The value is one of internal_account or
                 * external_account.
                 */
                @JsonProperty("ledgerable_type")
                fun ledgerableType(ledgerableType: LedgerableType) = apply {
                    this.ledgerableType = ledgerableType
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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
                        ledgerableId,
                        ledgerableType,
                        metadata,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class LedgerableType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LedgerableType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val EXTERNAL_ACCOUNT = LedgerableType(JsonField.of("external_account"))

                    val INTERNAL_ACCOUNT = LedgerableType(JsonField.of("internal_account"))

                    fun of(value: String) = LedgerableType(JsonField.of(value))
                }

                enum class Known {
                    EXTERNAL_ACCOUNT,
                    INTERNAL_ACCOUNT,
                }

                enum class Value {
                    EXTERNAL_ACCOUNT,
                    INTERNAL_ACCOUNT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                        INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                        INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown LedgerableType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
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

                    return other is Metadata &&
                        this.additionalProperties == other.additionalProperties
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

        /** Required if receiving wire payments. */
        @JsonDeserialize(builder = AddressRequest.Builder::class)
        @NoAutoDetect
        class AddressRequest
        private constructor(
            private val line1: String?,
            private val line2: String?,
            private val locality: String?,
            private val region: String?,
            private val postalCode: String?,
            private val country: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AddressRequest &&
                    this.line1 == other.line1 &&
                    this.line2 == other.line2 &&
                    this.locality == other.locality &&
                    this.region == other.region &&
                    this.postalCode == other.postalCode &&
                    this.country == other.country &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            line1,
                            line2,
                            locality,
                            region,
                            postalCode,
                            country,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AddressRequest{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

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
                    this.line1 = addressRequest.line1
                    this.line2 = addressRequest.line2
                    this.locality = addressRequest.locality
                    this.region = addressRequest.region
                    this.postalCode = addressRequest.postalCode
                    this.country = addressRequest.country
                    additionalProperties(addressRequest.additionalProperties)
                }

                @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

                /** Locality or City. */
                @JsonProperty("locality")
                fun locality(locality: String) = apply { this.locality = locality }

                /** Region or State. */
                @JsonProperty("region") fun region(region: String) = apply { this.region = region }

                /** The postal code of the address. */
                @JsonProperty("postal_code")
                fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                /** Country code conforms to [ISO 3166-1 alpha-2] */
                @JsonProperty("country")
                fun country(country: String) = apply { this.country = country }

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

                fun build(): AddressRequest =
                    AddressRequest(
                        line1,
                        line2,
                        locality,
                        region,
                        postalCode,
                        country,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class PartyType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PartyType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val BUSINESS = PartyType(JsonField.of("business"))

                val INDIVIDUAL = PartyType(JsonField.of("individual"))

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
        }

        @JsonDeserialize(builder = RoutingDetail.Builder::class)
        @NoAutoDetect
        class RoutingDetail
        private constructor(
            private val routingNumber: String?,
            private val routingNumberType: RoutingNumberType?,
            private val paymentType: PaymentType?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonProperty("routing_number") fun routingNumber(): String? = routingNumber

            @JsonProperty("routing_number_type")
            fun routingNumberType(): RoutingNumberType? = routingNumberType

            @JsonProperty("payment_type") fun paymentType(): PaymentType? = paymentType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RoutingDetail &&
                    this.routingNumber == other.routingNumber &&
                    this.routingNumberType == other.routingNumberType &&
                    this.paymentType == other.paymentType &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            routingNumber,
                            routingNumberType,
                            paymentType,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "RoutingDetail{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var routingNumber: String? = null
                private var routingNumberType: RoutingNumberType? = null
                private var paymentType: PaymentType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(routingDetail: RoutingDetail) = apply {
                    this.routingNumber = routingDetail.routingNumber
                    this.routingNumberType = routingDetail.routingNumberType
                    this.paymentType = routingDetail.paymentType
                    additionalProperties(routingDetail.additionalProperties)
                }

                @JsonProperty("routing_number")
                fun routingNumber(routingNumber: String) = apply {
                    this.routingNumber = routingNumber
                }

                @JsonProperty("routing_number_type")
                fun routingNumberType(routingNumberType: RoutingNumberType) = apply {
                    this.routingNumberType = routingNumberType
                }

                @JsonProperty("payment_type")
                fun paymentType(paymentType: PaymentType) = apply { this.paymentType = paymentType }

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

                fun build(): RoutingDetail =
                    RoutingDetail(
                        checkNotNull(routingNumber) {
                            "`routingNumber` is required but was not set"
                        },
                        checkNotNull(routingNumberType) {
                            "`routingNumberType` is required but was not set"
                        },
                        paymentType,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class RoutingNumberType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RoutingNumberType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ABA = RoutingNumberType(JsonField.of("aba"))

                    val AU_BSB = RoutingNumberType(JsonField.of("au_bsb"))

                    val BR_CODIGO = RoutingNumberType(JsonField.of("br_codigo"))

                    val CA_CPA = RoutingNumberType(JsonField.of("ca_cpa"))

                    val CHIPS = RoutingNumberType(JsonField.of("chips"))

                    val CNAPS = RoutingNumberType(JsonField.of("cnaps"))

                    val DK_INTERBANK_CLEARING_CODE =
                        RoutingNumberType(JsonField.of("dk_interbank_clearing_code"))

                    val GB_SORT_CODE = RoutingNumberType(JsonField.of("gb_sort_code"))

                    val HK_INTERBANK_CLEARING_CODE =
                        RoutingNumberType(JsonField.of("hk_interbank_clearing_code"))

                    val HU_INTERBANK_CLEARING_CODE =
                        RoutingNumberType(JsonField.of("hu_interbank_clearing_code"))

                    val IN_IFSC = RoutingNumberType(JsonField.of("in_ifsc"))

                    val JP_ZENGIN_CODE = RoutingNumberType(JsonField.of("jp_zengin_code"))

                    val MY_BRANCH_CODE = RoutingNumberType(JsonField.of("my_branch_code"))

                    val NZ_NATIONAL_CLEARING_CODE =
                        RoutingNumberType(JsonField.of("nz_national_clearing_code"))

                    val SE_BANKGIRO_CLEARING_CODE =
                        RoutingNumberType(JsonField.of("se_bankgiro_clearing_code"))

                    val SWIFT = RoutingNumberType(JsonField.of("swift"))

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
                    IN_IFSC,
                    JP_ZENGIN_CODE,
                    MY_BRANCH_CODE,
                    NZ_NATIONAL_CLEARING_CODE,
                    SE_BANKGIRO_CLEARING_CODE,
                    SWIFT,
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
                    IN_IFSC,
                    JP_ZENGIN_CODE,
                    MY_BRANCH_CODE,
                    NZ_NATIONAL_CLEARING_CODE,
                    SE_BANKGIRO_CLEARING_CODE,
                    SWIFT,
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
                        IN_IFSC -> Value.IN_IFSC
                        JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                        MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                        NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                        SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                        SWIFT -> Value.SWIFT
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
                        IN_IFSC -> Known.IN_IFSC
                        JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                        MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                        NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                        SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                        SWIFT -> Known.SWIFT
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown RoutingNumberType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class PaymentType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PaymentType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ACH = PaymentType(JsonField.of("ach"))

                    val AU_BECS = PaymentType(JsonField.of("au_becs"))

                    val BACS = PaymentType(JsonField.of("bacs"))

                    val BOOK = PaymentType(JsonField.of("book"))

                    val CARD = PaymentType(JsonField.of("card"))

                    val CHATS = PaymentType(JsonField.of("chats"))

                    val CHECK = PaymentType(JsonField.of("check"))

                    val CROSS_BORDER = PaymentType(JsonField.of("cross_border"))

                    val DK_NETS = PaymentType(JsonField.of("dk_nets"))

                    val EFT = PaymentType(JsonField.of("eft"))

                    val HU_ICS = PaymentType(JsonField.of("hu_ics"))

                    val INTERAC = PaymentType(JsonField.of("interac"))

                    val MASAV = PaymentType(JsonField.of("masav"))

                    val NEFT = PaymentType(JsonField.of("neft"))

                    val NICS = PaymentType(JsonField.of("nics"))

                    val NZ_BECS = PaymentType(JsonField.of("nz_becs"))

                    val PROVXCHANGE = PaymentType(JsonField.of("provxchange"))

                    val RO_SENT = PaymentType(JsonField.of("ro_sent"))

                    val RTP = PaymentType(JsonField.of("rtp"))

                    val SG_GIRO = PaymentType(JsonField.of("sg_giro"))

                    val SE_BANKGIROT = PaymentType(JsonField.of("se_bankgirot"))

                    val SEN = PaymentType(JsonField.of("sen"))

                    val SEPA = PaymentType(JsonField.of("sepa"))

                    val SIC = PaymentType(JsonField.of("sic"))

                    val SIGNET = PaymentType(JsonField.of("signet"))

                    val WIRE = PaymentType(JsonField.of("wire"))

                    val ZENGIN = PaymentType(JsonField.of("zengin"))

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
                    NEFT,
                    NICS,
                    NZ_BECS,
                    PROVXCHANGE,
                    RO_SENT,
                    RTP,
                    SG_GIRO,
                    SE_BANKGIROT,
                    SEN,
                    SEPA,
                    SIC,
                    SIGNET,
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
                    NEFT,
                    NICS,
                    NZ_BECS,
                    PROVXCHANGE,
                    RO_SENT,
                    RTP,
                    SG_GIRO,
                    SE_BANKGIROT,
                    SEN,
                    SEPA,
                    SIC,
                    SIGNET,
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
                        NEFT -> Value.NEFT
                        NICS -> Value.NICS
                        NZ_BECS -> Value.NZ_BECS
                        PROVXCHANGE -> Value.PROVXCHANGE
                        RO_SENT -> Value.RO_SENT
                        RTP -> Value.RTP
                        SG_GIRO -> Value.SG_GIRO
                        SE_BANKGIROT -> Value.SE_BANKGIROT
                        SEN -> Value.SEN
                        SEPA -> Value.SEPA
                        SIC -> Value.SIC
                        SIGNET -> Value.SIGNET
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
                        NEFT -> Known.NEFT
                        NICS -> Known.NICS
                        NZ_BECS -> Known.NZ_BECS
                        PROVXCHANGE -> Known.PROVXCHANGE
                        RO_SENT -> Known.RO_SENT
                        RTP -> Known.RTP
                        SG_GIRO -> Known.SG_GIRO
                        SE_BANKGIROT -> Known.SE_BANKGIROT
                        SEN -> Known.SEN
                        SEPA -> Known.SEPA
                        SIC -> Known.SIC
                        SIGNET -> Known.SIGNET
                        WIRE -> Known.WIRE
                        ZENGIN -> Known.ZENGIN
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }
    }

    class LedgerType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LedgerType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CUSTOMER = LedgerType(JsonField.of("customer"))

            val VENDOR = LedgerType(JsonField.of("vendor"))

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

    class VerificationStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VerificationStatus && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val DENIED = VerificationStatus(JsonField.of("denied"))

            val NEEDS_APPROVAL = VerificationStatus(JsonField.of("needs_approval"))

            val UNVERIFIED = VerificationStatus(JsonField.of("unverified"))

            val VERIFIED = VerificationStatus(JsonField.of("verified"))

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
    }
}
