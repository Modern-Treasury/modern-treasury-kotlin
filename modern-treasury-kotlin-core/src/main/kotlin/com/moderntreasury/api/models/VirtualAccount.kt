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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class VirtualAccount
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_details")
    @ExcludeMissing
    private val accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of(),
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    private val counterpartyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("credit_ledger_account_id")
    @ExcludeMissing
    private val creditLedgerAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("debit_ledger_account_id")
    @ExcludeMissing
    private val debitLedgerAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    private val internalAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledger_account_id")
    @ExcludeMissing
    private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("routing_details")
    @ExcludeMissing
    private val routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** An array of account detail objects. */
    fun accountDetails(): List<AccountDetail> = accountDetails.getRequired("account_details")

    /** The ID of a counterparty that the virtual account belongs to. Optional. */
    fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The ID of a credit normal ledger account. When money enters the virtual account, this ledger
     * account will be credited. Must be accompanied by a debit_ledger_account_id if present.
     */
    fun creditLedgerAccountId(): String? =
        creditLedgerAccountId.getNullable("credit_ledger_account_id")

    /**
     * The ID of a debit normal ledger account. When money enters the virtual account, this ledger
     * account will be debited. Must be accompanied by a credit_ledger_account_id if present.
     */
    fun debitLedgerAccountId(): String? =
        debitLedgerAccountId.getNullable("debit_ledger_account_id")

    /** An optional free-form description for internal use. */
    fun description(): String? = description.getNullable("description")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** The ID of the internal account that the virtual account is in. */
    fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

    /**
     * If the virtual account links to a ledger account in Modern Treasury, the id of the ledger
     * account will be populated here.
     */
    fun ledgerAccountId(): String? = ledgerAccountId.getNullable("ledger_account_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** The name of the virtual account. */
    fun name(): String = name.getRequired("name")

    fun object_(): String = object_.getRequired("object")

    /**
     * An array of routing detail objects. These will be the routing details of the internal
     * account.
     */
    fun routingDetails(): List<RoutingDetail> = routingDetails.getRequired("routing_details")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** An array of account detail objects. */
    @JsonProperty("account_details")
    @ExcludeMissing
    fun _accountDetails(): JsonField<List<AccountDetail>> = accountDetails

    /** The ID of a counterparty that the virtual account belongs to. Optional. */
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    fun _counterpartyId(): JsonField<String> = counterpartyId

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * The ID of a credit normal ledger account. When money enters the virtual account, this ledger
     * account will be credited. Must be accompanied by a debit_ledger_account_id if present.
     */
    @JsonProperty("credit_ledger_account_id")
    @ExcludeMissing
    fun _creditLedgerAccountId(): JsonField<String> = creditLedgerAccountId

    /**
     * The ID of a debit normal ledger account. When money enters the virtual account, this ledger
     * account will be debited. Must be accompanied by a credit_ledger_account_id if present.
     */
    @JsonProperty("debit_ledger_account_id")
    @ExcludeMissing
    fun _debitLedgerAccountId(): JsonField<String> = debitLedgerAccountId

    /** An optional free-form description for internal use. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /** The ID of the internal account that the virtual account is in. */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId(): JsonField<String> = internalAccountId

    /**
     * If the virtual account links to a ledger account in Modern Treasury, the id of the ledger
     * account will be populated here.
     */
    @JsonProperty("ledger_account_id")
    @ExcludeMissing
    fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /** The name of the virtual account. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * An array of routing detail objects. These will be the routing details of the internal
     * account.
     */
    @JsonProperty("routing_details")
    @ExcludeMissing
    fun _routingDetails(): JsonField<List<RoutingDetail>> = routingDetails

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): VirtualAccount = apply {
        if (validated) {
            return@apply
        }

        id()
        accountDetails().forEach { it.validate() }
        counterpartyId()
        createdAt()
        creditLedgerAccountId()
        debitLedgerAccountId()
        description()
        discardedAt()
        internalAccountId()
        ledgerAccountId()
        liveMode()
        metadata().validate()
        name()
        object_()
        routingDetails().forEach { it.validate() }
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [VirtualAccount]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountDetails: JsonField<MutableList<AccountDetail>>? = null
        private var counterpartyId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditLedgerAccountId: JsonField<String>? = null
        private var debitLedgerAccountId: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var internalAccountId: JsonField<String>? = null
        private var ledgerAccountId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var name: JsonField<String>? = null
        private var object_: JsonField<String>? = null
        private var routingDetails: JsonField<MutableList<RoutingDetail>>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(virtualAccount: VirtualAccount) = apply {
            id = virtualAccount.id
            accountDetails = virtualAccount.accountDetails.map { it.toMutableList() }
            counterpartyId = virtualAccount.counterpartyId
            createdAt = virtualAccount.createdAt
            creditLedgerAccountId = virtualAccount.creditLedgerAccountId
            debitLedgerAccountId = virtualAccount.debitLedgerAccountId
            description = virtualAccount.description
            discardedAt = virtualAccount.discardedAt
            internalAccountId = virtualAccount.internalAccountId
            ledgerAccountId = virtualAccount.ledgerAccountId
            liveMode = virtualAccount.liveMode
            metadata = virtualAccount.metadata
            name = virtualAccount.name
            object_ = virtualAccount.object_
            routingDetails = virtualAccount.routingDetails.map { it.toMutableList() }
            updatedAt = virtualAccount.updatedAt
            additionalProperties = virtualAccount.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** An array of account detail objects. */
        fun accountDetails(accountDetails: List<AccountDetail>) =
            accountDetails(JsonField.of(accountDetails))

        /** An array of account detail objects. */
        fun accountDetails(accountDetails: JsonField<List<AccountDetail>>) = apply {
            this.accountDetails = accountDetails.map { it.toMutableList() }
        }

        /** An array of account detail objects. */
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

        /** The ID of a counterparty that the virtual account belongs to. Optional. */
        fun counterpartyId(counterpartyId: String?) =
            counterpartyId(JsonField.ofNullable(counterpartyId))

        /** The ID of a counterparty that the virtual account belongs to. Optional. */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The ID of a credit normal ledger account. When money enters the virtual account, this
         * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
         * present.
         */
        fun creditLedgerAccountId(creditLedgerAccountId: String?) =
            creditLedgerAccountId(JsonField.ofNullable(creditLedgerAccountId))

        /**
         * The ID of a credit normal ledger account. When money enters the virtual account, this
         * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
         * present.
         */
        fun creditLedgerAccountId(creditLedgerAccountId: JsonField<String>) = apply {
            this.creditLedgerAccountId = creditLedgerAccountId
        }

        /**
         * The ID of a debit normal ledger account. When money enters the virtual account, this
         * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
         * present.
         */
        fun debitLedgerAccountId(debitLedgerAccountId: String?) =
            debitLedgerAccountId(JsonField.ofNullable(debitLedgerAccountId))

        /**
         * The ID of a debit normal ledger account. When money enters the virtual account, this
         * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
         * present.
         */
        fun debitLedgerAccountId(debitLedgerAccountId: JsonField<String>) = apply {
            this.debitLedgerAccountId = debitLedgerAccountId
        }

        /** An optional free-form description for internal use. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** An optional free-form description for internal use. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** The ID of the internal account that the virtual account is in. */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /** The ID of the internal account that the virtual account is in. */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * If the virtual account links to a ledger account in Modern Treasury, the id of the ledger
         * account will be populated here.
         */
        fun ledgerAccountId(ledgerAccountId: String?) =
            ledgerAccountId(JsonField.ofNullable(ledgerAccountId))

        /**
         * If the virtual account links to a ledger account in Modern Treasury, the id of the ledger
         * account will be populated here.
         */
        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
            this.ledgerAccountId = ledgerAccountId
        }

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

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The name of the virtual account. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the virtual account. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

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
            this.routingDetails = routingDetails.map { it.toMutableList() }
        }

        /**
         * An array of routing detail objects. These will be the routing details of the internal
         * account.
         */
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

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
                checkRequired("id", id),
                checkRequired("accountDetails", accountDetails).map { it.toImmutable() },
                checkRequired("counterpartyId", counterpartyId),
                checkRequired("createdAt", createdAt),
                checkRequired("creditLedgerAccountId", creditLedgerAccountId),
                checkRequired("debitLedgerAccountId", debitLedgerAccountId),
                checkRequired("description", description),
                checkRequired("discardedAt", discardedAt),
                checkRequired("internalAccountId", internalAccountId),
                checkRequired("ledgerAccountId", ledgerAccountId),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("name", name),
                checkRequired("object_", object_),
                checkRequired("routingDetails", routingDetails).map { it.toImmutable() },
                checkRequired("updatedAt", updatedAt),
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VirtualAccount && id == other.id && accountDetails == other.accountDetails && counterpartyId == other.counterpartyId && createdAt == other.createdAt && creditLedgerAccountId == other.creditLedgerAccountId && debitLedgerAccountId == other.debitLedgerAccountId && description == other.description && discardedAt == other.discardedAt && internalAccountId == other.internalAccountId && ledgerAccountId == other.ledgerAccountId && liveMode == other.liveMode && metadata == other.metadata && name == other.name && object_ == other.object_ && routingDetails == other.routingDetails && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountDetails, counterpartyId, createdAt, creditLedgerAccountId, debitLedgerAccountId, description, discardedAt, internalAccountId, ledgerAccountId, liveMode, metadata, name, object_, routingDetails, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VirtualAccount{id=$id, accountDetails=$accountDetails, counterpartyId=$counterpartyId, createdAt=$createdAt, creditLedgerAccountId=$creditLedgerAccountId, debitLedgerAccountId=$debitLedgerAccountId, description=$description, discardedAt=$discardedAt, internalAccountId=$internalAccountId, ledgerAccountId=$ledgerAccountId, liveMode=$liveMode, metadata=$metadata, name=$name, object_=$object_, routingDetails=$routingDetails, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
