// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = VirtualAccount.Builder::class)
@NoAutoDetect
class VirtualAccount
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val counterpartyId: JsonField<String>,
    private val internalAccountId: JsonField<String>,
    private val accountDetails: JsonField<List<AccountDetail>>,
    private val routingDetails: JsonField<List<RoutingDetail>>,
    private val debitLedgerAccountId: JsonField<String>,
    private val creditLedgerAccountId: JsonField<String>,
    private val ledgerAccountId: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** The name of the virtual account. */
    fun name(): String = name.getRequired("name")

    /** An optional free-form description for internal use. */
    fun description(): String? = description.getNullable("description")

    /** The ID of a counterparty that the virtual account belongs to. Optional. */
    fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

    /** The ID of the internal account that the virtual account is in. */
    fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

    /** An array of account detail objects. */
    fun accountDetails(): List<AccountDetail> = accountDetails.getRequired("account_details")

    /**
     * An array of routing detail objects. These will be the routing details of the internal
     * account.
     */
    fun routingDetails(): List<RoutingDetail> = routingDetails.getRequired("routing_details")

    /**
     * The ID of a debit normal ledger account. When money enters the virtual account, this ledger
     * account will be debited. Must be accompanied by a credit_ledger_account_id if present.
     */
    fun debitLedgerAccountId(): String? =
        debitLedgerAccountId.getNullable("debit_ledger_account_id")

    /**
     * The ID of a credit normal ledger account. When money enters the virtual account, this ledger
     * account will be credited. Must be accompanied by a debit_ledger_account_id if present.
     */
    fun creditLedgerAccountId(): String? =
        creditLedgerAccountId.getNullable("credit_ledger_account_id")

    /**
     * If the virtual account links to a ledger account in Modern Treasury, the id of the ledger
     * account will be populated here.
     */
    fun ledgerAccountId(): String? = ledgerAccountId.getNullable("ledger_account_id")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

    /** The name of the virtual account. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** An optional free-form description for internal use. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The ID of a counterparty that the virtual account belongs to. Optional. */
    @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

    /** The ID of the internal account that the virtual account is in. */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId() = internalAccountId

    /** An array of account detail objects. */
    @JsonProperty("account_details") @ExcludeMissing fun _accountDetails() = accountDetails

    /**
     * An array of routing detail objects. These will be the routing details of the internal
     * account.
     */
    @JsonProperty("routing_details") @ExcludeMissing fun _routingDetails() = routingDetails

    /**
     * The ID of a debit normal ledger account. When money enters the virtual account, this ledger
     * account will be debited. Must be accompanied by a credit_ledger_account_id if present.
     */
    @JsonProperty("debit_ledger_account_id")
    @ExcludeMissing
    fun _debitLedgerAccountId() = debitLedgerAccountId

    /**
     * The ID of a credit normal ledger account. When money enters the virtual account, this ledger
     * account will be credited. Must be accompanied by a debit_ledger_account_id if present.
     */
    @JsonProperty("credit_ledger_account_id")
    @ExcludeMissing
    fun _creditLedgerAccountId() = creditLedgerAccountId

    /**
     * If the virtual account links to a ledger account in Modern Treasury, the id of the ledger
     * account will be populated here.
     */
    @JsonProperty("ledger_account_id") @ExcludeMissing fun _ledgerAccountId() = ledgerAccountId

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): VirtualAccount = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            name()
            description()
            counterpartyId()
            internalAccountId()
            accountDetails().forEach { it.validate() }
            routingDetails().forEach { it.validate() }
            debitLedgerAccountId()
            creditLedgerAccountId()
            ledgerAccountId()
            metadata().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VirtualAccount &&
            this.id == other.id &&
            this.object_ == other.object_ &&
            this.liveMode == other.liveMode &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.discardedAt == other.discardedAt &&
            this.name == other.name &&
            this.description == other.description &&
            this.counterpartyId == other.counterpartyId &&
            this.internalAccountId == other.internalAccountId &&
            this.accountDetails == other.accountDetails &&
            this.routingDetails == other.routingDetails &&
            this.debitLedgerAccountId == other.debitLedgerAccountId &&
            this.creditLedgerAccountId == other.creditLedgerAccountId &&
            this.ledgerAccountId == other.ledgerAccountId &&
            this.metadata == other.metadata &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    discardedAt,
                    name,
                    description,
                    counterpartyId,
                    internalAccountId,
                    accountDetails,
                    routingDetails,
                    debitLedgerAccountId,
                    creditLedgerAccountId,
                    ledgerAccountId,
                    metadata,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "VirtualAccount{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, name=$name, description=$description, counterpartyId=$counterpartyId, internalAccountId=$internalAccountId, accountDetails=$accountDetails, routingDetails=$routingDetails, debitLedgerAccountId=$debitLedgerAccountId, creditLedgerAccountId=$creditLedgerAccountId, ledgerAccountId=$ledgerAccountId, metadata=$metadata, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var counterpartyId: JsonField<String> = JsonMissing.of()
        private var internalAccountId: JsonField<String> = JsonMissing.of()
        private var accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of()
        private var routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of()
        private var debitLedgerAccountId: JsonField<String> = JsonMissing.of()
        private var creditLedgerAccountId: JsonField<String> = JsonMissing.of()
        private var ledgerAccountId: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(virtualAccount: VirtualAccount) = apply {
            this.id = virtualAccount.id
            this.object_ = virtualAccount.object_
            this.liveMode = virtualAccount.liveMode
            this.createdAt = virtualAccount.createdAt
            this.updatedAt = virtualAccount.updatedAt
            this.discardedAt = virtualAccount.discardedAt
            this.name = virtualAccount.name
            this.description = virtualAccount.description
            this.counterpartyId = virtualAccount.counterpartyId
            this.internalAccountId = virtualAccount.internalAccountId
            this.accountDetails = virtualAccount.accountDetails
            this.routingDetails = virtualAccount.routingDetails
            this.debitLedgerAccountId = virtualAccount.debitLedgerAccountId
            this.creditLedgerAccountId = virtualAccount.creditLedgerAccountId
            this.ledgerAccountId = virtualAccount.ledgerAccountId
            this.metadata = virtualAccount.metadata
            additionalProperties(virtualAccount.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode")
        @ExcludeMissing
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** The name of the virtual account. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the virtual account. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** An optional free-form description for internal use. */
        fun description(description: String) = description(JsonField.of(description))

        /** An optional free-form description for internal use. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The ID of a counterparty that the virtual account belongs to. Optional. */
        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

        /** The ID of a counterparty that the virtual account belongs to. Optional. */
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        /** The ID of the internal account that the virtual account is in. */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /** The ID of the internal account that the virtual account is in. */
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /** An array of account detail objects. */
        fun accountDetails(accountDetails: List<AccountDetail>) =
            accountDetails(JsonField.of(accountDetails))

        /** An array of account detail objects. */
        @JsonProperty("account_details")
        @ExcludeMissing
        fun accountDetails(accountDetails: JsonField<List<AccountDetail>>) = apply {
            this.accountDetails = accountDetails
        }

        /**
         * An array of routing detail objects. These will be the routing details of the internal
         * account.
         */
        fun routingDetails(routingDetails: List<RoutingDetail>) =
            routingDetails(JsonField.of(routingDetails))

        /**
         * An array of routing detail objects. These will be the routing details of the internal
         * account.
         */
        @JsonProperty("routing_details")
        @ExcludeMissing
        fun routingDetails(routingDetails: JsonField<List<RoutingDetail>>) = apply {
            this.routingDetails = routingDetails
        }

        /**
         * The ID of a debit normal ledger account. When money enters the virtual account, this
         * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
         * present.
         */
        fun debitLedgerAccountId(debitLedgerAccountId: String) =
            debitLedgerAccountId(JsonField.of(debitLedgerAccountId))

        /**
         * The ID of a debit normal ledger account. When money enters the virtual account, this
         * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
         * present.
         */
        @JsonProperty("debit_ledger_account_id")
        @ExcludeMissing
        fun debitLedgerAccountId(debitLedgerAccountId: JsonField<String>) = apply {
            this.debitLedgerAccountId = debitLedgerAccountId
        }

        /**
         * The ID of a credit normal ledger account. When money enters the virtual account, this
         * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
         * present.
         */
        fun creditLedgerAccountId(creditLedgerAccountId: String) =
            creditLedgerAccountId(JsonField.of(creditLedgerAccountId))

        /**
         * The ID of a credit normal ledger account. When money enters the virtual account, this
         * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
         * present.
         */
        @JsonProperty("credit_ledger_account_id")
        @ExcludeMissing
        fun creditLedgerAccountId(creditLedgerAccountId: JsonField<String>) = apply {
            this.creditLedgerAccountId = creditLedgerAccountId
        }

        /**
         * If the virtual account links to a ledger account in Modern Treasury, the id of the ledger
         * account will be populated here.
         */
        fun ledgerAccountId(ledgerAccountId: String) =
            ledgerAccountId(JsonField.of(ledgerAccountId))

        /**
         * If the virtual account links to a ledger account in Modern Treasury, the id of the ledger
         * account will be populated here.
         */
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
            this.ledgerAccountId = ledgerAccountId
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

        fun build(): VirtualAccount =
            VirtualAccount(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                name,
                description,
                counterpartyId,
                internalAccountId,
                accountDetails.map { it.toUnmodifiable() },
                routingDetails.map { it.toUnmodifiable() },
                debitLedgerAccountId,
                creditLedgerAccountId,
                ledgerAccountId,
                metadata,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

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
