// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects

class VirtualAccountCreateParams
constructor(
    private val internalAccountId: String,
    private val name: String,
    private val accountDetails: List<AccountDetailCreateRequest>?,
    private val counterpartyId: String?,
    private val creditLedgerAccountId: String?,
    private val debitLedgerAccountId: String?,
    private val description: String?,
    private val ledgerAccount: LedgerAccountCreateRequest?,
    private val metadata: Metadata?,
    private val routingDetails: List<RoutingDetailCreateRequest>?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun internalAccountId(): String = internalAccountId

    fun name(): String = name

    fun accountDetails(): List<AccountDetailCreateRequest>? = accountDetails

    fun counterpartyId(): String? = counterpartyId

    fun creditLedgerAccountId(): String? = creditLedgerAccountId

    fun debitLedgerAccountId(): String? = debitLedgerAccountId

    fun description(): String? = description

    fun ledgerAccount(): LedgerAccountCreateRequest? = ledgerAccount

    fun metadata(): Metadata? = metadata

    fun routingDetails(): List<RoutingDetailCreateRequest>? = routingDetails

    internal fun getBody(): VirtualAccountCreateBody {
        return VirtualAccountCreateBody(
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
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = VirtualAccountCreateBody.Builder::class)
    @NoAutoDetect
    class VirtualAccountCreateBody
    internal constructor(
        private val internalAccountId: String?,
        private val name: String?,
        private val accountDetails: List<AccountDetailCreateRequest>?,
        private val counterpartyId: String?,
        private val creditLedgerAccountId: String?,
        private val debitLedgerAccountId: String?,
        private val description: String?,
        private val ledgerAccount: LedgerAccountCreateRequest?,
        private val metadata: Metadata?,
        private val routingDetails: List<RoutingDetailCreateRequest>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The ID of the internal account that this virtual account is associated with. */
        @JsonProperty("internal_account_id") fun internalAccountId(): String? = internalAccountId

        /** The name of the virtual account. */
        @JsonProperty("name") fun name(): String? = name

        /** An array of account detail objects. */
        @JsonProperty("account_details")
        fun accountDetails(): List<AccountDetailCreateRequest>? = accountDetails

        /** The ID of the counterparty that the virtual account belongs to. */
        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

        /**
         * The ID of a credit normal ledger account. When money leaves the virtual account, this
         * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
         * present.
         */
        @JsonProperty("credit_ledger_account_id")
        fun creditLedgerAccountId(): String? = creditLedgerAccountId

        /**
         * The ID of a debit normal ledger account. When money enters the virtual account, this
         * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
         * present.
         */
        @JsonProperty("debit_ledger_account_id")
        fun debitLedgerAccountId(): String? = debitLedgerAccountId

        /** An optional description for internal use. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * Specifies a ledger account object that will be created with the virtual account. The
         * resulting ledger account is linked to the virtual account for auto-ledgering IPDs.
         */
        @JsonProperty("ledger_account")
        fun ledgerAccount(): LedgerAccountCreateRequest? = ledgerAccount

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An array of routing detail objects. */
        @JsonProperty("routing_details")
        fun routingDetails(): List<RoutingDetailCreateRequest>? = routingDetails

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var internalAccountId: String? = null
            private var name: String? = null
            private var accountDetails: List<AccountDetailCreateRequest>? = null
            private var counterpartyId: String? = null
            private var creditLedgerAccountId: String? = null
            private var debitLedgerAccountId: String? = null
            private var description: String? = null
            private var ledgerAccount: LedgerAccountCreateRequest? = null
            private var metadata: Metadata? = null
            private var routingDetails: List<RoutingDetailCreateRequest>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(virtualAccountCreateBody: VirtualAccountCreateBody) = apply {
                this.internalAccountId = virtualAccountCreateBody.internalAccountId
                this.name = virtualAccountCreateBody.name
                this.accountDetails = virtualAccountCreateBody.accountDetails
                this.counterpartyId = virtualAccountCreateBody.counterpartyId
                this.creditLedgerAccountId = virtualAccountCreateBody.creditLedgerAccountId
                this.debitLedgerAccountId = virtualAccountCreateBody.debitLedgerAccountId
                this.description = virtualAccountCreateBody.description
                this.ledgerAccount = virtualAccountCreateBody.ledgerAccount
                this.metadata = virtualAccountCreateBody.metadata
                this.routingDetails = virtualAccountCreateBody.routingDetails
                additionalProperties(virtualAccountCreateBody.additionalProperties)
            }

            /** The ID of the internal account that this virtual account is associated with. */
            @JsonProperty("internal_account_id")
            fun internalAccountId(internalAccountId: String) = apply {
                this.internalAccountId = internalAccountId
            }

            /** The name of the virtual account. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** An array of account detail objects. */
            @JsonProperty("account_details")
            fun accountDetails(accountDetails: List<AccountDetailCreateRequest>) = apply {
                this.accountDetails = accountDetails
            }

            /** The ID of the counterparty that the virtual account belongs to. */
            @JsonProperty("counterparty_id")
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            /**
             * The ID of a credit normal ledger account. When money leaves the virtual account, this
             * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
             * present.
             */
            @JsonProperty("credit_ledger_account_id")
            fun creditLedgerAccountId(creditLedgerAccountId: String) = apply {
                this.creditLedgerAccountId = creditLedgerAccountId
            }

            /**
             * The ID of a debit normal ledger account. When money enters the virtual account, this
             * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
             * present.
             */
            @JsonProperty("debit_ledger_account_id")
            fun debitLedgerAccountId(debitLedgerAccountId: String) = apply {
                this.debitLedgerAccountId = debitLedgerAccountId
            }

            /** An optional description for internal use. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * Specifies a ledger account object that will be created with the virtual account. The
             * resulting ledger account is linked to the virtual account for auto-ledgering IPDs.
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

            /** An array of routing detail objects. */
            @JsonProperty("routing_details")
            fun routingDetails(routingDetails: List<RoutingDetailCreateRequest>) = apply {
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

            fun build(): VirtualAccountCreateBody =
                VirtualAccountCreateBody(
                    checkNotNull(internalAccountId) {
                        "`internalAccountId` is required but was not set"
                    },
                    checkNotNull(name) { "`name` is required but was not set" },
                    accountDetails?.toImmutable(),
                    counterpartyId,
                    creditLedgerAccountId,
                    debitLedgerAccountId,
                    description,
                    ledgerAccount,
                    metadata,
                    routingDetails?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VirtualAccountCreateBody && this.internalAccountId == other.internalAccountId && this.name == other.name && this.accountDetails == other.accountDetails && this.counterpartyId == other.counterpartyId && this.creditLedgerAccountId == other.creditLedgerAccountId && this.debitLedgerAccountId == other.debitLedgerAccountId && this.description == other.description && this.ledgerAccount == other.ledgerAccount && this.metadata == other.metadata && this.routingDetails == other.routingDetails && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(internalAccountId, name, accountDetails, counterpartyId, creditLedgerAccountId, debitLedgerAccountId, description, ledgerAccount, metadata, routingDetails, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "VirtualAccountCreateBody{internalAccountId=$internalAccountId, name=$name, accountDetails=$accountDetails, counterpartyId=$counterpartyId, creditLedgerAccountId=$creditLedgerAccountId, debitLedgerAccountId=$debitLedgerAccountId, description=$description, ledgerAccount=$ledgerAccount, metadata=$metadata, routingDetails=$routingDetails, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VirtualAccountCreateParams && this.internalAccountId == other.internalAccountId && this.name == other.name && this.accountDetails == other.accountDetails && this.counterpartyId == other.counterpartyId && this.creditLedgerAccountId == other.creditLedgerAccountId && this.debitLedgerAccountId == other.debitLedgerAccountId && this.description == other.description && this.ledgerAccount == other.ledgerAccount && this.metadata == other.metadata && this.routingDetails == other.routingDetails && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(internalAccountId, name, accountDetails, counterpartyId, creditLedgerAccountId, debitLedgerAccountId, description, ledgerAccount, metadata, routingDetails, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "VirtualAccountCreateParams{internalAccountId=$internalAccountId, name=$name, accountDetails=$accountDetails, counterpartyId=$counterpartyId, creditLedgerAccountId=$creditLedgerAccountId, debitLedgerAccountId=$debitLedgerAccountId, description=$description, ledgerAccount=$ledgerAccount, metadata=$metadata, routingDetails=$routingDetails, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var internalAccountId: String? = null
        private var name: String? = null
        private var accountDetails: MutableList<AccountDetailCreateRequest> = mutableListOf()
        private var counterpartyId: String? = null
        private var creditLedgerAccountId: String? = null
        private var debitLedgerAccountId: String? = null
        private var description: String? = null
        private var ledgerAccount: LedgerAccountCreateRequest? = null
        private var metadata: Metadata? = null
        private var routingDetails: MutableList<RoutingDetailCreateRequest> = mutableListOf()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(virtualAccountCreateParams: VirtualAccountCreateParams) = apply {
            this.internalAccountId = virtualAccountCreateParams.internalAccountId
            this.name = virtualAccountCreateParams.name
            this.accountDetails(virtualAccountCreateParams.accountDetails ?: listOf())
            this.counterpartyId = virtualAccountCreateParams.counterpartyId
            this.creditLedgerAccountId = virtualAccountCreateParams.creditLedgerAccountId
            this.debitLedgerAccountId = virtualAccountCreateParams.debitLedgerAccountId
            this.description = virtualAccountCreateParams.description
            this.ledgerAccount = virtualAccountCreateParams.ledgerAccount
            this.metadata = virtualAccountCreateParams.metadata
            this.routingDetails(virtualAccountCreateParams.routingDetails ?: listOf())
            additionalHeaders(virtualAccountCreateParams.additionalHeaders)
            additionalQueryParams(virtualAccountCreateParams.additionalQueryParams)
            additionalBodyProperties(virtualAccountCreateParams.additionalBodyProperties)
        }

        /** The ID of the internal account that this virtual account is associated with. */
        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        /** The name of the virtual account. */
        fun name(name: String) = apply { this.name = name }

        /** An array of account detail objects. */
        fun accountDetails(accountDetails: List<AccountDetailCreateRequest>) = apply {
            this.accountDetails.clear()
            this.accountDetails.addAll(accountDetails)
        }

        /** An array of account detail objects. */
        fun addAccountDetail(accountDetail: AccountDetailCreateRequest) = apply {
            this.accountDetails.add(accountDetail)
        }

        /** The ID of the counterparty that the virtual account belongs to. */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /**
         * The ID of a credit normal ledger account. When money leaves the virtual account, this
         * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
         * present.
         */
        fun creditLedgerAccountId(creditLedgerAccountId: String) = apply {
            this.creditLedgerAccountId = creditLedgerAccountId
        }

        /**
         * The ID of a debit normal ledger account. When money enters the virtual account, this
         * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
         * present.
         */
        fun debitLedgerAccountId(debitLedgerAccountId: String) = apply {
            this.debitLedgerAccountId = debitLedgerAccountId
        }

        /** An optional description for internal use. */
        fun description(description: String) = apply { this.description = description }

        /**
         * Specifies a ledger account object that will be created with the virtual account. The
         * resulting ledger account is linked to the virtual account for auto-ledgering IPDs.
         */
        fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) = apply {
            this.ledgerAccount = ledgerAccount
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** An array of routing detail objects. */
        fun routingDetails(routingDetails: List<RoutingDetailCreateRequest>) = apply {
            this.routingDetails.clear()
            this.routingDetails.addAll(routingDetails)
        }

        /** An array of routing detail objects. */
        fun addRoutingDetail(routingDetail: RoutingDetailCreateRequest) = apply {
            this.routingDetails.add(routingDetail)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

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

        fun build(): VirtualAccountCreateParams =
            VirtualAccountCreateParams(
                checkNotNull(internalAccountId) {
                    "`internalAccountId` is required but was not set"
                },
                checkNotNull(name) { "`name` is required but was not set" },
                if (accountDetails.size == 0) null else accountDetails.toImmutable(),
                counterpartyId,
                creditLedgerAccountId,
                debitLedgerAccountId,
                description,
                ledgerAccount,
                metadata,
                if (routingDetails.size == 0) null else routingDetails.toImmutable(),
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = AccountDetailCreateRequest.Builder::class)
    @NoAutoDetect
    class AccountDetailCreateRequest
    private constructor(
        private val accountNumber: String?,
        private val accountNumberType: AccountNumberType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The account number for the bank account. */
        @JsonProperty("account_number") fun accountNumber(): String? = accountNumber

        /**
         * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account
         * number is in a generic format.
         */
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

            internal fun from(accountDetailCreateRequest: AccountDetailCreateRequest) = apply {
                this.accountNumber = accountDetailCreateRequest.accountNumber
                this.accountNumberType = accountDetailCreateRequest.accountNumberType
                additionalProperties(accountDetailCreateRequest.additionalProperties)
            }

            /** The account number for the bank account. */
            @JsonProperty("account_number")
            fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

            /**
             * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account
             * number is in a generic format.
             */
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

            fun build(): AccountDetailCreateRequest =
                AccountDetailCreateRequest(
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccountNumberType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val AU_NUMBER = AccountNumberType(JsonField.of("au_number"))

                val CLABE = AccountNumberType(JsonField.of("clabe"))

                val HK_NUMBER = AccountNumberType(JsonField.of("hk_number"))

                val IBAN = AccountNumberType(JsonField.of("iban"))

                val ID_NUMBER = AccountNumberType(JsonField.of("id_number"))

                val NZ_NUMBER = AccountNumberType(JsonField.of("nz_number"))

                val OTHER = AccountNumberType(JsonField.of("other"))

                val PAN = AccountNumberType(JsonField.of("pan"))

                val SG_NUMBER = AccountNumberType(JsonField.of("sg_number"))

                val WALLET_ADDRESS = AccountNumberType(JsonField.of("wallet_address"))

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
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountDetailCreateRequest && this.accountNumber == other.accountNumber && this.accountNumberType == other.accountNumberType && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(accountNumber, accountNumberType, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AccountDetailCreateRequest{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"
    }

    /**
     * Specifies a ledger account object that will be created with the virtual account. The
     * resulting ledger account is linked to the virtual account for auto-ledgering IPDs.
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LedgerableType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val COUNTERPARTY = LedgerableType(JsonField.of("counterparty"))

                val EXTERNAL_ACCOUNT = LedgerableType(JsonField.of("external_account"))

                val INTERNAL_ACCOUNT = LedgerableType(JsonField.of("internal_account"))

                val VIRTUAL_ACCOUNT = LedgerableType(JsonField.of("virtual_account"))

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

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerAccountCreateRequest && this.name == other.name && this.description == other.description && this.normalBalance == other.normalBalance && this.ledgerId == other.ledgerId && this.currency == other.currency && this.currencyExponent == other.currencyExponent && this.ledgerAccountCategoryIds == other.ledgerAccountCategoryIds && this.ledgerableId == other.ledgerableId && this.ledgerableType == other.ledgerableType && this.metadata == other.metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(name, description, normalBalance, ledgerId, currency, currencyExponent, ledgerAccountCategoryIds, ledgerableId, ledgerableType, metadata, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

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

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = RoutingDetailCreateRequest.Builder::class)
    @NoAutoDetect
    class RoutingDetailCreateRequest
    private constructor(
        private val routingNumber: String?,
        private val routingNumberType: RoutingNumberType?,
        private val paymentType: PaymentType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The routing number of the bank. */
        @JsonProperty("routing_number") fun routingNumber(): String? = routingNumber

        /**
         * The type of routing number. See
         * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
         * details.
         */
        @JsonProperty("routing_number_type")
        fun routingNumberType(): RoutingNumberType? = routingNumberType

        /**
         * If the routing detail is to be used for a specific payment type this field will be
         * populated, otherwise null.
         */
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

            internal fun from(routingDetailCreateRequest: RoutingDetailCreateRequest) = apply {
                this.routingNumber = routingDetailCreateRequest.routingNumber
                this.routingNumberType = routingDetailCreateRequest.routingNumberType
                this.paymentType = routingDetailCreateRequest.paymentType
                additionalProperties(routingDetailCreateRequest.additionalProperties)
            }

            /** The routing number of the bank. */
            @JsonProperty("routing_number")
            fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

            /**
             * The type of routing number. See
             * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
             * details.
             */
            @JsonProperty("routing_number_type")
            fun routingNumberType(routingNumberType: RoutingNumberType) = apply {
                this.routingNumberType = routingNumberType
            }

            /**
             * If the routing detail is to be used for a specific payment type this field will be
             * populated, otherwise null.
             */
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

            fun build(): RoutingDetailCreateRequest =
                RoutingDetailCreateRequest(
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RoutingNumberType && this.value == other.value /* spotless:on */
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

                val ID_SKNBI_CODE = RoutingNumberType(JsonField.of("id_sknbi_code"))

                val IN_IFSC = RoutingNumberType(JsonField.of("in_ifsc"))

                val JP_ZENGIN_CODE = RoutingNumberType(JsonField.of("jp_zengin_code"))

                val MX_BANK_IDENTIFIER = RoutingNumberType(JsonField.of("mx_bank_identifier"))

                val MY_BRANCH_CODE = RoutingNumberType(JsonField.of("my_branch_code"))

                val NZ_NATIONAL_CLEARING_CODE =
                    RoutingNumberType(JsonField.of("nz_national_clearing_code"))

                val PL_NATIONAL_CLEARING_CODE =
                    RoutingNumberType(JsonField.of("pl_national_clearing_code"))

                val SE_BANKGIRO_CLEARING_CODE =
                    RoutingNumberType(JsonField.of("se_bankgiro_clearing_code"))

                val SWIFT = RoutingNumberType(JsonField.of("swift"))

                val ZA_NATIONAL_CLEARING_CODE =
                    RoutingNumberType(JsonField.of("za_national_clearing_code"))

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
                MX_BANK_IDENTIFIER,
                MY_BRANCH_CODE,
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
                MX_BANK_IDENTIFIER,
                MY_BRANCH_CODE,
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
                    MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
                    MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
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
                    MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                    MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
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
        }

        class PaymentType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PaymentType && this.value == other.value /* spotless:on */
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

                val MX_CCEN = PaymentType(JsonField.of("mx_ccen"))

                val NEFT = PaymentType(JsonField.of("neft"))

                val NICS = PaymentType(JsonField.of("nics"))

                val NZ_BECS = PaymentType(JsonField.of("nz_becs"))

                val PL_ELIXIR = PaymentType(JsonField.of("pl_elixir"))

                val PROVXCHANGE = PaymentType(JsonField.of("provxchange"))

                val RO_SENT = PaymentType(JsonField.of("ro_sent"))

                val RTP = PaymentType(JsonField.of("rtp"))

                val SE_BANKGIROT = PaymentType(JsonField.of("se_bankgirot"))

                val SEN = PaymentType(JsonField.of("sen"))

                val SEPA = PaymentType(JsonField.of("sepa"))

                val SG_GIRO = PaymentType(JsonField.of("sg_giro"))

                val SIC = PaymentType(JsonField.of("sic"))

                val SIGNET = PaymentType(JsonField.of("signet"))

                val SKNBI = PaymentType(JsonField.of("sknbi"))

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
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RoutingDetailCreateRequest && this.routingNumber == other.routingNumber && this.routingNumberType == other.routingNumberType && this.paymentType == other.paymentType && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(routingNumber, routingNumberType, paymentType, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "RoutingDetailCreateRequest{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"
    }
}
