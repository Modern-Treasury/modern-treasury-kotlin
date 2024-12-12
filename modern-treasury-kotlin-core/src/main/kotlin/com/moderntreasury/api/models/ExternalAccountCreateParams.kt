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
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Objects

class ExternalAccountCreateParams
constructor(
    private val counterpartyId: String?,
    private val accountDetails: List<AccountDetail>?,
    private val accountType: ExternalAccountType?,
    private val contactDetails: List<ContactDetailCreateRequest>?,
    private val ledgerAccount: LedgerAccountCreateRequest?,
    private val metadata: Metadata?,
    private val name: String?,
    private val partyAddress: AddressRequest?,
    private val partyIdentifier: String?,
    private val partyName: String?,
    private val partyType: PartyType?,
    private val plaidProcessorToken: String?,
    private val routingDetails: List<RoutingDetail>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun counterpartyId(): String? = counterpartyId

    fun accountDetails(): List<AccountDetail>? = accountDetails

    fun accountType(): ExternalAccountType? = accountType

    fun contactDetails(): List<ContactDetailCreateRequest>? = contactDetails

    fun ledgerAccount(): LedgerAccountCreateRequest? = ledgerAccount

    fun metadata(): Metadata? = metadata

    fun name(): String? = name

    fun partyAddress(): AddressRequest? = partyAddress

    fun partyIdentifier(): String? = partyIdentifier

    fun partyName(): String? = partyName

    fun partyType(): PartyType? = partyType

    fun plaidProcessorToken(): String? = plaidProcessorToken

    fun routingDetails(): List<RoutingDetail>? = routingDetails

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): ExternalAccountCreateBody {
        return ExternalAccountCreateBody(
            counterpartyId,
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
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = ExternalAccountCreateBody.Builder::class)
    @NoAutoDetect
    class ExternalAccountCreateBody
    internal constructor(
        private val counterpartyId: String?,
        private val accountDetails: List<AccountDetail>?,
        private val accountType: ExternalAccountType?,
        private val contactDetails: List<ContactDetailCreateRequest>?,
        private val ledgerAccount: LedgerAccountCreateRequest?,
        private val metadata: Metadata?,
        private val name: String?,
        private val partyAddress: AddressRequest?,
        private val partyIdentifier: String?,
        private val partyName: String?,
        private val partyType: PartyType?,
        private val plaidProcessorToken: String?,
        private val routingDetails: List<RoutingDetail>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

        @JsonProperty("account_details") fun accountDetails(): List<AccountDetail>? = accountDetails

        /** Can be `checking`, `savings` or `other`. */
        @JsonProperty("account_type") fun accountType(): ExternalAccountType? = accountType

        @JsonProperty("contact_details")
        fun contactDetails(): List<ContactDetailCreateRequest>? = contactDetails

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
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        @JsonProperty("name") fun name(): String? = name

        /** Required if receiving wire payments. */
        @JsonProperty("party_address") fun partyAddress(): AddressRequest? = partyAddress

        @JsonProperty("party_identifier") fun partyIdentifier(): String? = partyIdentifier

        /** If this value isn't provided, it will be inherited from the counterparty's name. */
        @JsonProperty("party_name") fun partyName(): String? = partyName

        /** Either `individual` or `business`. */
        @JsonProperty("party_type") fun partyType(): PartyType? = partyType

        /**
         * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you can
         * pass the processor token in this field.
         */
        @JsonProperty("plaid_processor_token")
        fun plaidProcessorToken(): String? = plaidProcessorToken

        @JsonProperty("routing_details") fun routingDetails(): List<RoutingDetail>? = routingDetails

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var counterpartyId: String? = null
            private var accountDetails: List<AccountDetail>? = null
            private var accountType: ExternalAccountType? = null
            private var contactDetails: List<ContactDetailCreateRequest>? = null
            private var ledgerAccount: LedgerAccountCreateRequest? = null
            private var metadata: Metadata? = null
            private var name: String? = null
            private var partyAddress: AddressRequest? = null
            private var partyIdentifier: String? = null
            private var partyName: String? = null
            private var partyType: PartyType? = null
            private var plaidProcessorToken: String? = null
            private var routingDetails: List<RoutingDetail>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(externalAccountCreateBody: ExternalAccountCreateBody) = apply {
                this.counterpartyId = externalAccountCreateBody.counterpartyId
                this.accountDetails = externalAccountCreateBody.accountDetails
                this.accountType = externalAccountCreateBody.accountType
                this.contactDetails = externalAccountCreateBody.contactDetails
                this.ledgerAccount = externalAccountCreateBody.ledgerAccount
                this.metadata = externalAccountCreateBody.metadata
                this.name = externalAccountCreateBody.name
                this.partyAddress = externalAccountCreateBody.partyAddress
                this.partyIdentifier = externalAccountCreateBody.partyIdentifier
                this.partyName = externalAccountCreateBody.partyName
                this.partyType = externalAccountCreateBody.partyType
                this.plaidProcessorToken = externalAccountCreateBody.plaidProcessorToken
                this.routingDetails = externalAccountCreateBody.routingDetails
                additionalProperties(externalAccountCreateBody.additionalProperties)
            }

            @JsonProperty("counterparty_id")
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            @JsonProperty("account_details")
            fun accountDetails(accountDetails: List<AccountDetail>) = apply {
                this.accountDetails = accountDetails
            }

            /** Can be `checking`, `savings` or `other`. */
            @JsonProperty("account_type")
            fun accountType(accountType: ExternalAccountType) = apply {
                this.accountType = accountType
            }

            @JsonProperty("contact_details")
            fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) = apply {
                this.contactDetails = contactDetails
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
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** Required if receiving wire payments. */
            @JsonProperty("party_address")
            fun partyAddress(partyAddress: AddressRequest) = apply {
                this.partyAddress = partyAddress
            }

            @JsonProperty("party_identifier")
            fun partyIdentifier(partyIdentifier: String) = apply {
                this.partyIdentifier = partyIdentifier
            }

            /** If this value isn't provided, it will be inherited from the counterparty's name. */
            @JsonProperty("party_name")
            fun partyName(partyName: String) = apply { this.partyName = partyName }

            /** Either `individual` or `business`. */
            @JsonProperty("party_type")
            fun partyType(partyType: PartyType) = apply { this.partyType = partyType }

            /**
             * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you
             * can pass the processor token in this field.
             */
            @JsonProperty("plaid_processor_token")
            fun plaidProcessorToken(plaidProcessorToken: String) = apply {
                this.plaidProcessorToken = plaidProcessorToken
            }

            @JsonProperty("routing_details")
            fun routingDetails(routingDetails: List<RoutingDetail>) = apply {
                this.routingDetails = routingDetails
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

            fun build(): ExternalAccountCreateBody =
                ExternalAccountCreateBody(
                    counterpartyId,
                    accountDetails?.toImmutable(),
                    accountType,
                    contactDetails?.toImmutable(),
                    ledgerAccount,
                    metadata,
                    name,
                    partyAddress,
                    partyIdentifier,
                    partyName,
                    partyType,
                    plaidProcessorToken,
                    routingDetails?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalAccountCreateBody && counterpartyId == other.counterpartyId && accountDetails == other.accountDetails && accountType == other.accountType && contactDetails == other.contactDetails && ledgerAccount == other.ledgerAccount && metadata == other.metadata && name == other.name && partyAddress == other.partyAddress && partyIdentifier == other.partyIdentifier && partyName == other.partyName && partyType == other.partyType && plaidProcessorToken == other.plaidProcessorToken && routingDetails == other.routingDetails && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(counterpartyId, accountDetails, accountType, contactDetails, ledgerAccount, metadata, name, partyAddress, partyIdentifier, partyName, partyType, plaidProcessorToken, routingDetails, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalAccountCreateBody{counterpartyId=$counterpartyId, accountDetails=$accountDetails, accountType=$accountType, contactDetails=$contactDetails, ledgerAccount=$ledgerAccount, metadata=$metadata, name=$name, partyAddress=$partyAddress, partyIdentifier=$partyIdentifier, partyName=$partyName, partyType=$partyType, plaidProcessorToken=$plaidProcessorToken, routingDetails=$routingDetails, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var counterpartyId: String? = null
        private var accountDetails: MutableList<AccountDetail> = mutableListOf()
        private var accountType: ExternalAccountType? = null
        private var contactDetails: MutableList<ContactDetailCreateRequest> = mutableListOf()
        private var ledgerAccount: LedgerAccountCreateRequest? = null
        private var metadata: Metadata? = null
        private var name: String? = null
        private var partyAddress: AddressRequest? = null
        private var partyIdentifier: String? = null
        private var partyName: String? = null
        private var partyType: PartyType? = null
        private var plaidProcessorToken: String? = null
        private var routingDetails: MutableList<RoutingDetail> = mutableListOf()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(externalAccountCreateParams: ExternalAccountCreateParams) = apply {
            counterpartyId = externalAccountCreateParams.counterpartyId
            accountDetails =
                externalAccountCreateParams.accountDetails?.toMutableList() ?: mutableListOf()
            accountType = externalAccountCreateParams.accountType
            contactDetails =
                externalAccountCreateParams.contactDetails?.toMutableList() ?: mutableListOf()
            ledgerAccount = externalAccountCreateParams.ledgerAccount
            metadata = externalAccountCreateParams.metadata
            name = externalAccountCreateParams.name
            partyAddress = externalAccountCreateParams.partyAddress
            partyIdentifier = externalAccountCreateParams.partyIdentifier
            partyName = externalAccountCreateParams.partyName
            partyType = externalAccountCreateParams.partyType
            plaidProcessorToken = externalAccountCreateParams.plaidProcessorToken
            routingDetails =
                externalAccountCreateParams.routingDetails?.toMutableList() ?: mutableListOf()
            additionalHeaders = externalAccountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalAccountCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                externalAccountCreateParams.additionalBodyProperties.toMutableMap()
        }

        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        fun accountDetails(accountDetails: List<AccountDetail>) = apply {
            this.accountDetails.clear()
            this.accountDetails.addAll(accountDetails)
        }

        fun addAccountDetail(accountDetail: AccountDetail) = apply {
            this.accountDetails.add(accountDetail)
        }

        /** Can be `checking`, `savings` or `other`. */
        fun accountType(accountType: ExternalAccountType) = apply { this.accountType = accountType }

        fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) = apply {
            this.contactDetails.clear()
            this.contactDetails.addAll(contactDetails)
        }

        fun addContactDetail(contactDetail: ContactDetailCreateRequest) = apply {
            this.contactDetails.add(contactDetail)
        }

        /**
         * Specifies a ledger account object that will be created with the external account. The
         * resulting ledger account is linked to the external account for auto-ledgering Payment
         * objects. See
         * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for more
         * details.
         */
        fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) = apply {
            this.ledgerAccount = ledgerAccount
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        fun name(name: String) = apply { this.name = name }

        /** Required if receiving wire payments. */
        fun partyAddress(partyAddress: AddressRequest) = apply { this.partyAddress = partyAddress }

        fun partyIdentifier(partyIdentifier: String) = apply {
            this.partyIdentifier = partyIdentifier
        }

        /** If this value isn't provided, it will be inherited from the counterparty's name. */
        fun partyName(partyName: String) = apply { this.partyName = partyName }

        /** Either `individual` or `business`. */
        fun partyType(partyType: PartyType) = apply { this.partyType = partyType }

        /**
         * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you can
         * pass the processor token in this field.
         */
        fun plaidProcessorToken(plaidProcessorToken: String) = apply {
            this.plaidProcessorToken = plaidProcessorToken
        }

        fun routingDetails(routingDetails: List<RoutingDetail>) = apply {
            this.routingDetails.clear()
            this.routingDetails.addAll(routingDetails)
        }

        fun addRoutingDetail(routingDetail: RoutingDetail) = apply {
            this.routingDetails.add(routingDetail)
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
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): ExternalAccountCreateParams =
            ExternalAccountCreateParams(
                counterpartyId,
                accountDetails.toImmutable().ifEmpty { null },
                accountType,
                contactDetails.toImmutable().ifEmpty { null },
                ledgerAccount,
                metadata,
                name,
                partyAddress,
                partyIdentifier,
                partyName,
                partyType,
                plaidProcessorToken,
                routingDetails.toImmutable().ifEmpty { null },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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

        @JsonProperty("account_number") fun accountNumber(): String? = accountNumber

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
                this.accountNumber = accountDetail.accountNumber
                this.accountNumberType = accountDetail.accountNumberType
                additionalProperties(accountDetail.additionalProperties)
            }

            @JsonProperty("account_number")
            fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): AccountDetail =
                AccountDetail(
                    checkNotNull(accountNumber) { "`accountNumber` is required but was not set" },
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

    @JsonDeserialize(builder = ContactDetailCreateRequest.Builder::class)
    @NoAutoDetect
    class ContactDetailCreateRequest
    private constructor(
        private val contactIdentifier: String?,
        private val contactIdentifierType: ContactIdentifierType?,
        private val additionalProperties: Map<String, JsonValue>,
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
     * objects. See https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects
     * for more details.
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
        private val ledgerAccountCategoryIds: List<String>?,
        private val ledgerableId: String?,
        private val ledgerableType: LedgerableType?,
        private val metadata: Metadata?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The name of the ledger account. */
        @JsonProperty("name") fun name(): String? = name

        /** The description of the ledger account. */
        @JsonProperty("description") fun description(): String? = description

        /** The normal balance of the ledger account. */
        @JsonProperty("normal_balance") fun normalBalance(): TransactionDirection? = normalBalance

        /** The id of the ledger that this account belongs to. */
        @JsonProperty("ledger_id") fun ledgerId(): String? = ledgerId

        /** The currency of the ledger account. */
        @JsonProperty("currency") fun currency(): String? = currency

        /** The currency exponent of the ledger account. */
        @JsonProperty("currency_exponent") fun currencyExponent(): Long? = currencyExponent

        /**
         * The array of ledger account category ids that this ledger account should be a child of.
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
         * populated here, otherwise null. The value is one of internal_account or external_account.
         */
        @JsonProperty("ledgerable_type") fun ledgerableType(): LedgerableType? = ledgerableType

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
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
            private var ledgerAccountCategoryIds: List<String>? = null
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
                this.ledgerAccountCategoryIds = ledgerAccountCreateRequest.ledgerAccountCategoryIds
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
             * The array of ledger account category ids that this ledger account should be a child
             * of.
             */
            @JsonProperty("ledger_account_category_ids")
            fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>) = apply {
                this.ledgerAccountCategoryIds = ledgerAccountCategoryIds
            }

            /**
             * If the ledger account links to another object in Modern Treasury, the id will be
             * populated here, otherwise null.
             */
            @JsonProperty("ledgerable_id")
            fun ledgerableId(ledgerableId: String) = apply { this.ledgerableId = ledgerableId }

            /**
             * If the ledger account links to another object in Modern Treasury, the type will be
             * populated here, otherwise null. The value is one of internal_account or
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): LedgerAccountCreateRequest =
                LedgerAccountCreateRequest(
                    checkNotNull(name) { "`name` is required but was not set" },
                    description,
                    checkNotNull(normalBalance) { "`normalBalance` is required but was not set" },
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
                        throw ModernTreasuryInvalidDataException("Unknown LedgerableType: $value")
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
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
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
            @JsonProperty("country") fun country(country: String) = apply { this.country = country }

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

    @JsonDeserialize(builder = RoutingDetail.Builder::class)
    @NoAutoDetect
    class RoutingDetail
    private constructor(
        private val routingNumber: String?,
        private val routingNumberType: RoutingNumberType?,
        private val paymentType: PaymentType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("routing_number") fun routingNumber(): String? = routingNumber

        @JsonProperty("routing_number_type")
        fun routingNumberType(): RoutingNumberType? = routingNumberType

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
                this.routingNumber = routingDetail.routingNumber
                this.routingNumberType = routingDetail.routingNumberType
                this.paymentType = routingDetail.paymentType
                additionalProperties(routingDetail.additionalProperties)
            }

            @JsonProperty("routing_number")
            fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): RoutingDetail =
                RoutingDetail(
                    checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
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
                    else -> throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
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

        return /* spotless:off */ other is ExternalAccountCreateParams && counterpartyId == other.counterpartyId && accountDetails == other.accountDetails && accountType == other.accountType && contactDetails == other.contactDetails && ledgerAccount == other.ledgerAccount && metadata == other.metadata && name == other.name && partyAddress == other.partyAddress && partyIdentifier == other.partyIdentifier && partyName == other.partyName && partyType == other.partyType && plaidProcessorToken == other.plaidProcessorToken && routingDetails == other.routingDetails && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(counterpartyId, accountDetails, accountType, contactDetails, ledgerAccount, metadata, name, partyAddress, partyIdentifier, partyName, partyType, plaidProcessorToken, routingDetails, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ExternalAccountCreateParams{counterpartyId=$counterpartyId, accountDetails=$accountDetails, accountType=$accountType, contactDetails=$contactDetails, ledgerAccount=$ledgerAccount, metadata=$metadata, name=$name, partyAddress=$partyAddress, partyIdentifier=$partyIdentifier, partyName=$partyName, partyType=$partyType, plaidProcessorToken=$plaidProcessorToken, routingDetails=$routingDetails, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
