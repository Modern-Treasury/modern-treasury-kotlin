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

class VirtualAccountCreateParams
constructor(
    private val name: String,
    private val description: String?,
    private val counterpartyId: String?,
    private val internalAccountId: String,
    private val accountDetails: List<AccountDetailCreateRequest>?,
    private val routingDetails: List<RoutingDetailCreateRequest>?,
    private val debitLedgerAccountId: String?,
    private val creditLedgerAccountId: String?,
    private val metadata: Metadata?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun description(): String? = description

    fun counterpartyId(): String? = counterpartyId

    fun internalAccountId(): String = internalAccountId

    fun accountDetails(): List<AccountDetailCreateRequest>? = accountDetails

    fun routingDetails(): List<RoutingDetailCreateRequest>? = routingDetails

    fun debitLedgerAccountId(): String? = debitLedgerAccountId

    fun creditLedgerAccountId(): String? = creditLedgerAccountId

    fun metadata(): Metadata? = metadata

    internal fun getBody(): VirtualAccountCreateBody {
        return VirtualAccountCreateBody(
            name,
            description,
            counterpartyId,
            internalAccountId,
            accountDetails,
            routingDetails,
            debitLedgerAccountId,
            creditLedgerAccountId,
            metadata,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = VirtualAccountCreateBody.Builder::class)
    @NoAutoDetect
    class VirtualAccountCreateBody
    internal constructor(
        private val name: String?,
        private val description: String?,
        private val counterpartyId: String?,
        private val internalAccountId: String?,
        private val accountDetails: List<AccountDetailCreateRequest>?,
        private val routingDetails: List<RoutingDetailCreateRequest>?,
        private val debitLedgerAccountId: String?,
        private val creditLedgerAccountId: String?,
        private val metadata: Metadata?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The name of the virtual account. */
        @JsonProperty("name") fun name(): String? = name

        /** An optional description for internal use. */
        @JsonProperty("description") fun description(): String? = description

        /** The ID of the counterparty that the virtual account belongs to. */
        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

        /** The ID of the internal account that this virtual account is associated with. */
        @JsonProperty("internal_account_id") fun internalAccountId(): String? = internalAccountId

        /** An array of account detail objects. */
        @JsonProperty("account_details")
        fun accountDetails(): List<AccountDetailCreateRequest>? = accountDetails

        /** An array of routing detail objects. */
        @JsonProperty("routing_details")
        fun routingDetails(): List<RoutingDetailCreateRequest>? = routingDetails

        /**
         * The ID of a debit normal ledger account. When money enters the virtual account, this
         * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
         * present.
         */
        @JsonProperty("debit_ledger_account_id")
        fun debitLedgerAccountId(): String? = debitLedgerAccountId

        /**
         * The ID of a credit normal ledger account. When money leaves the virtual account, this
         * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
         * present.
         */
        @JsonProperty("credit_ledger_account_id")
        fun creditLedgerAccountId(): String? = creditLedgerAccountId

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
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

            return other is VirtualAccountCreateBody &&
                this.name == other.name &&
                this.description == other.description &&
                this.counterpartyId == other.counterpartyId &&
                this.internalAccountId == other.internalAccountId &&
                this.accountDetails == other.accountDetails &&
                this.routingDetails == other.routingDetails &&
                this.debitLedgerAccountId == other.debitLedgerAccountId &&
                this.creditLedgerAccountId == other.creditLedgerAccountId &&
                this.metadata == other.metadata &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        description,
                        counterpartyId,
                        internalAccountId,
                        accountDetails,
                        routingDetails,
                        debitLedgerAccountId,
                        creditLedgerAccountId,
                        metadata,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "VirtualAccountCreateBody{name=$name, description=$description, counterpartyId=$counterpartyId, internalAccountId=$internalAccountId, accountDetails=$accountDetails, routingDetails=$routingDetails, debitLedgerAccountId=$debitLedgerAccountId, creditLedgerAccountId=$creditLedgerAccountId, metadata=$metadata, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var description: String? = null
            private var counterpartyId: String? = null
            private var internalAccountId: String? = null
            private var accountDetails: List<AccountDetailCreateRequest>? = null
            private var routingDetails: List<RoutingDetailCreateRequest>? = null
            private var debitLedgerAccountId: String? = null
            private var creditLedgerAccountId: String? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(virtualAccountCreateBody: VirtualAccountCreateBody) = apply {
                this.name = virtualAccountCreateBody.name
                this.description = virtualAccountCreateBody.description
                this.counterpartyId = virtualAccountCreateBody.counterpartyId
                this.internalAccountId = virtualAccountCreateBody.internalAccountId
                this.accountDetails = virtualAccountCreateBody.accountDetails
                this.routingDetails = virtualAccountCreateBody.routingDetails
                this.debitLedgerAccountId = virtualAccountCreateBody.debitLedgerAccountId
                this.creditLedgerAccountId = virtualAccountCreateBody.creditLedgerAccountId
                this.metadata = virtualAccountCreateBody.metadata
                additionalProperties(virtualAccountCreateBody.additionalProperties)
            }

            /** The name of the virtual account. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** An optional description for internal use. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** The ID of the counterparty that the virtual account belongs to. */
            @JsonProperty("counterparty_id")
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            /** The ID of the internal account that this virtual account is associated with. */
            @JsonProperty("internal_account_id")
            fun internalAccountId(internalAccountId: String) = apply {
                this.internalAccountId = internalAccountId
            }

            /** An array of account detail objects. */
            @JsonProperty("account_details")
            fun accountDetails(accountDetails: List<AccountDetailCreateRequest>) = apply {
                this.accountDetails = accountDetails
            }

            /** An array of routing detail objects. */
            @JsonProperty("routing_details")
            fun routingDetails(routingDetails: List<RoutingDetailCreateRequest>) = apply {
                this.routingDetails = routingDetails
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

            fun build(): VirtualAccountCreateBody =
                VirtualAccountCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    description,
                    counterpartyId,
                    checkNotNull(internalAccountId) {
                        "`internalAccountId` is required but was not set"
                    },
                    accountDetails?.toUnmodifiable(),
                    routingDetails?.toUnmodifiable(),
                    debitLedgerAccountId,
                    creditLedgerAccountId,
                    metadata,
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

        return other is VirtualAccountCreateParams &&
            this.name == other.name &&
            this.description == other.description &&
            this.counterpartyId == other.counterpartyId &&
            this.internalAccountId == other.internalAccountId &&
            this.accountDetails == other.accountDetails &&
            this.routingDetails == other.routingDetails &&
            this.debitLedgerAccountId == other.debitLedgerAccountId &&
            this.creditLedgerAccountId == other.creditLedgerAccountId &&
            this.metadata == other.metadata &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            name,
            description,
            counterpartyId,
            internalAccountId,
            accountDetails,
            routingDetails,
            debitLedgerAccountId,
            creditLedgerAccountId,
            metadata,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "VirtualAccountCreateParams{name=$name, description=$description, counterpartyId=$counterpartyId, internalAccountId=$internalAccountId, accountDetails=$accountDetails, routingDetails=$routingDetails, debitLedgerAccountId=$debitLedgerAccountId, creditLedgerAccountId=$creditLedgerAccountId, metadata=$metadata, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var description: String? = null
        private var counterpartyId: String? = null
        private var internalAccountId: String? = null
        private var accountDetails: List<AccountDetailCreateRequest>? = null
        private var routingDetails: List<RoutingDetailCreateRequest>? = null
        private var debitLedgerAccountId: String? = null
        private var creditLedgerAccountId: String? = null
        private var metadata: Metadata? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(virtualAccountCreateParams: VirtualAccountCreateParams) = apply {
            this.name = virtualAccountCreateParams.name
            this.description = virtualAccountCreateParams.description
            this.counterpartyId = virtualAccountCreateParams.counterpartyId
            this.internalAccountId = virtualAccountCreateParams.internalAccountId
            this.accountDetails = virtualAccountCreateParams.accountDetails
            this.routingDetails = virtualAccountCreateParams.routingDetails
            this.debitLedgerAccountId = virtualAccountCreateParams.debitLedgerAccountId
            this.creditLedgerAccountId = virtualAccountCreateParams.creditLedgerAccountId
            this.metadata = virtualAccountCreateParams.metadata
            additionalQueryParams(virtualAccountCreateParams.additionalQueryParams)
            additionalHeaders(virtualAccountCreateParams.additionalHeaders)
            additionalBodyProperties(virtualAccountCreateParams.additionalBodyProperties)
        }

        /** The name of the virtual account. */
        fun name(name: String) = apply { this.name = name }

        /** An optional description for internal use. */
        fun description(description: String) = apply { this.description = description }

        /** The ID of the counterparty that the virtual account belongs to. */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /** The ID of the internal account that this virtual account is associated with. */
        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        /** An array of account detail objects. */
        fun accountDetails(accountDetails: List<AccountDetailCreateRequest>) = apply {
            this.accountDetails = accountDetails
        }

        /** An array of routing detail objects. */
        fun routingDetails(routingDetails: List<RoutingDetailCreateRequest>) = apply {
            this.routingDetails = routingDetails
        }

        /**
         * The ID of a debit normal ledger account. When money enters the virtual account, this
         * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
         * present.
         */
        fun debitLedgerAccountId(debitLedgerAccountId: String) = apply {
            this.debitLedgerAccountId = debitLedgerAccountId
        }

        /**
         * The ID of a credit normal ledger account. When money leaves the virtual account, this
         * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
         * present.
         */
        fun creditLedgerAccountId(creditLedgerAccountId: String) = apply {
            this.creditLedgerAccountId = creditLedgerAccountId
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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

        fun build(): VirtualAccountCreateParams =
            VirtualAccountCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                description,
                counterpartyId,
                checkNotNull(internalAccountId) {
                    "`internalAccountId` is required but was not set"
                },
                accountDetails?.toUnmodifiable(),
                routingDetails?.toUnmodifiable(),
                debitLedgerAccountId,
                creditLedgerAccountId,
                metadata,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountDetailCreateRequest &&
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
            "AccountDetailCreateRequest{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"

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

                val CLABE = AccountNumberType(JsonField.of("clabe"))

                val IBAN = AccountNumberType(JsonField.of("iban"))

                val OTHER = AccountNumberType(JsonField.of("other"))

                val PAN = AccountNumberType(JsonField.of("pan"))

                val WALLET_ADDRESS = AccountNumberType(JsonField.of("wallet_address"))

                fun of(value: String) = AccountNumberType(JsonField.of(value))
            }

            enum class Known {
                CLABE,
                IBAN,
                OTHER,
                PAN,
                WALLET_ADDRESS,
            }

            enum class Value {
                CLABE,
                IBAN,
                OTHER,
                PAN,
                WALLET_ADDRESS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CLABE -> Value.CLABE
                    IBAN -> Value.IBAN
                    OTHER -> Value.OTHER
                    PAN -> Value.PAN
                    WALLET_ADDRESS -> Value.WALLET_ADDRESS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CLABE -> Known.CLABE
                    IBAN -> Known.IBAN
                    OTHER -> Known.OTHER
                    PAN -> Known.PAN
                    WALLET_ADDRESS -> Known.WALLET_ADDRESS
                    else ->
                        throw ModernTreasuryInvalidDataException(
                            "Unknown AccountNumberType: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()
        }
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

    @JsonDeserialize(builder = RoutingDetailCreateRequest.Builder::class)
    @NoAutoDetect
    class RoutingDetailCreateRequest
    private constructor(
        private val routingNumber: String?,
        private val routingNumberType: RoutingNumberType?,
        private val paymentType: PaymentType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The routing number of the bank. */
        @JsonProperty("routing_number") fun routingNumber(): String? = routingNumber

        /** One of `aba`, `swift`, `ca_cpa`, `au_bsb`, `gb_sort_code`, `in_ifsc`, `cnaps`. */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RoutingDetailCreateRequest &&
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
            "RoutingDetailCreateRequest{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"

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

            /** One of `aba`, `swift`, `ca_cpa`, `au_bsb`, `gb_sort_code`, `in_ifsc`, `cnaps`. */
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

                val GB_SORT_CODE = RoutingNumberType(JsonField.of("gb_sort_code"))

                val IN_IFSC = RoutingNumberType(JsonField.of("in_ifsc"))

                val MY_BRANCH_CODE = RoutingNumberType(JsonField.of("my_branch_code"))

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
                GB_SORT_CODE,
                IN_IFSC,
                MY_BRANCH_CODE,
                SWIFT,
            }

            enum class Value {
                ABA,
                AU_BSB,
                BR_CODIGO,
                CA_CPA,
                CHIPS,
                CNAPS,
                GB_SORT_CODE,
                IN_IFSC,
                MY_BRANCH_CODE,
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
                    GB_SORT_CODE -> Value.GB_SORT_CODE
                    IN_IFSC -> Value.IN_IFSC
                    MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
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
                    GB_SORT_CODE -> Known.GB_SORT_CODE
                    IN_IFSC -> Known.IN_IFSC
                    MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
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

                val CHECK = PaymentType(JsonField.of("check"))

                val CROSS_BORDER = PaymentType(JsonField.of("cross_border"))

                val EFT = PaymentType(JsonField.of("eft"))

                val INTERAC = PaymentType(JsonField.of("interac"))

                val MASAV = PaymentType(JsonField.of("masav"))

                val NEFT = PaymentType(JsonField.of("neft"))

                val PROVXCHANGE = PaymentType(JsonField.of("provxchange"))

                val RTP = PaymentType(JsonField.of("rtp"))

                val SEN = PaymentType(JsonField.of("sen"))

                val SEPA = PaymentType(JsonField.of("sepa"))

                val SIGNET = PaymentType(JsonField.of("signet"))

                val WIRE = PaymentType(JsonField.of("wire"))

                fun of(value: String) = PaymentType(JsonField.of(value))
            }

            enum class Known {
                ACH,
                AU_BECS,
                BACS,
                BOOK,
                CARD,
                CHECK,
                CROSS_BORDER,
                EFT,
                INTERAC,
                MASAV,
                NEFT,
                PROVXCHANGE,
                RTP,
                SEN,
                SEPA,
                SIGNET,
                WIRE,
            }

            enum class Value {
                ACH,
                AU_BECS,
                BACS,
                BOOK,
                CARD,
                CHECK,
                CROSS_BORDER,
                EFT,
                INTERAC,
                MASAV,
                NEFT,
                PROVXCHANGE,
                RTP,
                SEN,
                SEPA,
                SIGNET,
                WIRE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACH -> Value.ACH
                    AU_BECS -> Value.AU_BECS
                    BACS -> Value.BACS
                    BOOK -> Value.BOOK
                    CARD -> Value.CARD
                    CHECK -> Value.CHECK
                    CROSS_BORDER -> Value.CROSS_BORDER
                    EFT -> Value.EFT
                    INTERAC -> Value.INTERAC
                    MASAV -> Value.MASAV
                    NEFT -> Value.NEFT
                    PROVXCHANGE -> Value.PROVXCHANGE
                    RTP -> Value.RTP
                    SEN -> Value.SEN
                    SEPA -> Value.SEPA
                    SIGNET -> Value.SIGNET
                    WIRE -> Value.WIRE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACH -> Known.ACH
                    AU_BECS -> Known.AU_BECS
                    BACS -> Known.BACS
                    BOOK -> Known.BOOK
                    CARD -> Known.CARD
                    CHECK -> Known.CHECK
                    CROSS_BORDER -> Known.CROSS_BORDER
                    EFT -> Known.EFT
                    INTERAC -> Known.INTERAC
                    MASAV -> Known.MASAV
                    NEFT -> Known.NEFT
                    PROVXCHANGE -> Known.PROVXCHANGE
                    RTP -> Known.RTP
                    SEN -> Known.SEN
                    SEPA -> Known.SEPA
                    SIGNET -> Known.SIGNET
                    WIRE -> Known.WIRE
                    else -> throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
