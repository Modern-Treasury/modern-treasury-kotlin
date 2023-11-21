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

class VirtualAccountCreateParams
constructor(
    private val internalAccountId: String,
    private val name: String,
    private val accountDetails: List<AccountDetailCreateRequest>?,
    private val counterpartyId: String?,
    private val creditLedgerAccountId: String?,
    private val debitLedgerAccountId: String?,
    private val description: String?,
    private val metadata: Metadata?,
    private val routingDetails: List<RoutingDetailCreateRequest>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun internalAccountId(): String = internalAccountId

    fun name(): String = name

    fun accountDetails(): List<AccountDetailCreateRequest>? = accountDetails

    fun counterpartyId(): String? = counterpartyId

    fun creditLedgerAccountId(): String? = creditLedgerAccountId

    fun debitLedgerAccountId(): String? = debitLedgerAccountId

    fun description(): String? = description

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
            metadata,
            routingDetails,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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
        private val metadata: Metadata?,
        private val routingDetails: List<RoutingDetailCreateRequest>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VirtualAccountCreateBody &&
                this.internalAccountId == other.internalAccountId &&
                this.name == other.name &&
                this.accountDetails == other.accountDetails &&
                this.counterpartyId == other.counterpartyId &&
                this.creditLedgerAccountId == other.creditLedgerAccountId &&
                this.debitLedgerAccountId == other.debitLedgerAccountId &&
                this.description == other.description &&
                this.metadata == other.metadata &&
                this.routingDetails == other.routingDetails &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        internalAccountId,
                        name,
                        accountDetails,
                        counterpartyId,
                        creditLedgerAccountId,
                        debitLedgerAccountId,
                        description,
                        metadata,
                        routingDetails,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "VirtualAccountCreateBody{internalAccountId=$internalAccountId, name=$name, accountDetails=$accountDetails, counterpartyId=$counterpartyId, creditLedgerAccountId=$creditLedgerAccountId, debitLedgerAccountId=$debitLedgerAccountId, description=$description, metadata=$metadata, routingDetails=$routingDetails, additionalProperties=$additionalProperties}"

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
                    accountDetails?.toUnmodifiable(),
                    counterpartyId,
                    creditLedgerAccountId,
                    debitLedgerAccountId,
                    description,
                    metadata,
                    routingDetails?.toUnmodifiable(),
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
            this.internalAccountId == other.internalAccountId &&
            this.name == other.name &&
            this.accountDetails == other.accountDetails &&
            this.counterpartyId == other.counterpartyId &&
            this.creditLedgerAccountId == other.creditLedgerAccountId &&
            this.debitLedgerAccountId == other.debitLedgerAccountId &&
            this.description == other.description &&
            this.metadata == other.metadata &&
            this.routingDetails == other.routingDetails &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            internalAccountId,
            name,
            accountDetails,
            counterpartyId,
            creditLedgerAccountId,
            debitLedgerAccountId,
            description,
            metadata,
            routingDetails,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "VirtualAccountCreateParams{internalAccountId=$internalAccountId, name=$name, accountDetails=$accountDetails, counterpartyId=$counterpartyId, creditLedgerAccountId=$creditLedgerAccountId, debitLedgerAccountId=$debitLedgerAccountId, description=$description, metadata=$metadata, routingDetails=$routingDetails, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var metadata: Metadata? = null
        private var routingDetails: MutableList<RoutingDetailCreateRequest> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(virtualAccountCreateParams: VirtualAccountCreateParams) = apply {
            this.internalAccountId = virtualAccountCreateParams.internalAccountId
            this.name = virtualAccountCreateParams.name
            this.accountDetails(virtualAccountCreateParams.accountDetails ?: listOf())
            this.counterpartyId = virtualAccountCreateParams.counterpartyId
            this.creditLedgerAccountId = virtualAccountCreateParams.creditLedgerAccountId
            this.debitLedgerAccountId = virtualAccountCreateParams.debitLedgerAccountId
            this.description = virtualAccountCreateParams.description
            this.metadata = virtualAccountCreateParams.metadata
            this.routingDetails(virtualAccountCreateParams.routingDetails ?: listOf())
            additionalQueryParams(virtualAccountCreateParams.additionalQueryParams)
            additionalHeaders(virtualAccountCreateParams.additionalHeaders)
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
                checkNotNull(internalAccountId) {
                    "`internalAccountId` is required but was not set"
                },
                checkNotNull(name) { "`name` is required but was not set" },
                if (accountDetails.size == 0) null else accountDetails.toUnmodifiable(),
                counterpartyId,
                creditLedgerAccountId,
                debitLedgerAccountId,
                description,
                metadata,
                if (routingDetails.size == 0) null else routingDetails.toUnmodifiable(),
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

                val SE_BANKGIROT = PaymentType(JsonField.of("se_bankgirot"))

                val SEN = PaymentType(JsonField.of("sen"))

                val SEPA = PaymentType(JsonField.of("sepa"))

                val SG_GIRO = PaymentType(JsonField.of("sg_giro"))

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
                SE_BANKGIROT,
                SEN,
                SEPA,
                SG_GIRO,
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
                SE_BANKGIROT,
                SEN,
                SEPA,
                SG_GIRO,
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
                    SE_BANKGIROT -> Value.SE_BANKGIROT
                    SEN -> Value.SEN
                    SEPA -> Value.SEPA
                    SG_GIRO -> Value.SG_GIRO
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
                    SE_BANKGIROT -> Known.SE_BANKGIROT
                    SEN -> Known.SEN
                    SEPA -> Known.SEPA
                    SG_GIRO -> Known.SG_GIRO
                    SIC -> Known.SIC
                    SIGNET -> Known.SIGNET
                    WIRE -> Known.WIRE
                    ZENGIN -> Known.ZENGIN
                    else -> throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
