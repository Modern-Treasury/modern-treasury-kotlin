// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class VirtualAccount
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    private val counterpartyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    private val internalAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_details")
    @ExcludeMissing
    private val accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of(),
    @JsonProperty("routing_details")
    @ExcludeMissing
    private val routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of(),
    @JsonProperty("debit_ledger_account_id")
    @ExcludeMissing
    private val debitLedgerAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("credit_ledger_account_id")
    @ExcludeMissing
    private val creditLedgerAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledger_account_id")
    @ExcludeMissing
    private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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

    private var validated: Boolean = false

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
            id = virtualAccount.id
            object_ = virtualAccount.object_
            liveMode = virtualAccount.liveMode
            createdAt = virtualAccount.createdAt
            updatedAt = virtualAccount.updatedAt
            discardedAt = virtualAccount.discardedAt
            name = virtualAccount.name
            description = virtualAccount.description
            counterpartyId = virtualAccount.counterpartyId
            internalAccountId = virtualAccount.internalAccountId
            accountDetails = virtualAccount.accountDetails
            routingDetails = virtualAccount.routingDetails
            debitLedgerAccountId = virtualAccount.debitLedgerAccountId
            creditLedgerAccountId = virtualAccount.creditLedgerAccountId
            ledgerAccountId = virtualAccount.ledgerAccountId
            metadata = virtualAccount.metadata
            additionalProperties = virtualAccount.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

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
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** The name of the virtual account. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the virtual account. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** An optional free-form description for internal use. */
        fun description(description: String) = description(JsonField.of(description))

        /** An optional free-form description for internal use. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The ID of a counterparty that the virtual account belongs to. Optional. */
        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

        /** The ID of a counterparty that the virtual account belongs to. Optional. */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        /** The ID of the internal account that the virtual account is in. */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /** The ID of the internal account that the virtual account is in. */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /** An array of account detail objects. */
        fun accountDetails(accountDetails: List<AccountDetail>) =
            accountDetails(JsonField.of(accountDetails))

        /** An array of account detail objects. */
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
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                accountDetails.map { it.toImmutable() },
                routingDetails.map { it.toImmutable() },
                debitLedgerAccountId,
                creditLedgerAccountId,
                ledgerAccountId,
                metadata,
                additionalProperties.toImmutable(),
            )
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

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VirtualAccount && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && discardedAt == other.discardedAt && name == other.name && description == other.description && counterpartyId == other.counterpartyId && internalAccountId == other.internalAccountId && accountDetails == other.accountDetails && routingDetails == other.routingDetails && debitLedgerAccountId == other.debitLedgerAccountId && creditLedgerAccountId == other.creditLedgerAccountId && ledgerAccountId == other.ledgerAccountId && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, name, description, counterpartyId, internalAccountId, accountDetails, routingDetails, debitLedgerAccountId, creditLedgerAccountId, ledgerAccountId, metadata, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VirtualAccount{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, name=$name, description=$description, counterpartyId=$counterpartyId, internalAccountId=$internalAccountId, accountDetails=$accountDetails, routingDetails=$routingDetails, debitLedgerAccountId=$debitLedgerAccountId, creditLedgerAccountId=$creditLedgerAccountId, ledgerAccountId=$ledgerAccountId, metadata=$metadata, additionalProperties=$additionalProperties}"
}
