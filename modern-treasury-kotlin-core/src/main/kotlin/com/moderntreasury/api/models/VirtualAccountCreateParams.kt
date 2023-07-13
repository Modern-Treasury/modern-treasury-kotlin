package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.models.*
import java.util.Objects

class VirtualAccountCreateParams
constructor(
    private val name: String,
    private val description: String?,
    private val counterpartyId: String?,
    private val internalAccountId: String,
    private val accountDetails: List<AccountDetail>?,
    private val routingDetails: List<RoutingDetail>?,
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

    fun accountDetails(): List<AccountDetail>? = accountDetails

    fun routingDetails(): List<RoutingDetail>? = routingDetails

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
        private val accountDetails: List<AccountDetail>?,
        private val routingDetails: List<RoutingDetail>?,
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
        @JsonProperty("account_details") fun accountDetails(): List<AccountDetail>? = accountDetails

        /** An array of routing detail objects. */
        @JsonProperty("routing_details") fun routingDetails(): List<RoutingDetail>? = routingDetails

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
            private var accountDetails: List<AccountDetail>? = null
            private var routingDetails: List<RoutingDetail>? = null
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
            fun accountDetails(accountDetails: List<AccountDetail>) = apply {
                this.accountDetails = accountDetails
            }

            /** An array of routing detail objects. */
            @JsonProperty("routing_details")
            fun routingDetails(routingDetails: List<RoutingDetail>) = apply {
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
        private var accountDetails: List<AccountDetail>? = null
        private var routingDetails: List<RoutingDetail>? = null
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
        fun accountDetails(accountDetails: List<AccountDetail>) = apply {
            this.accountDetails = accountDetails
        }

        /** An array of routing detail objects. */
        fun routingDetails(routingDetails: List<RoutingDetail>) = apply {
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
}
