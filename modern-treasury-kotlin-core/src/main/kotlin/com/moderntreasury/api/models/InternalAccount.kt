// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class InternalAccount
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_details")
    @ExcludeMissing
    private val accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of(),
    @JsonProperty("account_type")
    @ExcludeMissing
    private val accountType: JsonField<AccountType> = JsonMissing.of(),
    @JsonProperty("connection")
    @ExcludeMissing
    private val connection: JsonField<Connection> = JsonMissing.of(),
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    private val counterpartyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("ledger_account_id")
    @ExcludeMissing
    private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("legal_entity_id")
    @ExcludeMissing
    private val legalEntityId: JsonField<String> = JsonMissing.of(),
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
    @JsonProperty("parent_account_id")
    @ExcludeMissing
    private val parentAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("party_address")
    @ExcludeMissing
    private val partyAddress: JsonField<Address> = JsonMissing.of(),
    @JsonProperty("party_name")
    @ExcludeMissing
    private val partyName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("party_type")
    @ExcludeMissing
    private val partyType: JsonField<PartyType> = JsonMissing.of(),
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

    /** Can be checking, savings or other. */
    fun accountType(): AccountType? = accountType.getNullable("account_type")

    /** Specifies which financial institution the accounts belong to. */
    fun connection(): Connection = connection.getRequired("connection")

    /** The Counterparty associated to this account. */
    fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The currency of the account. */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * If the internal account links to a ledger account in Modern Treasury, the id of the ledger
     * account will be populated here.
     */
    fun ledgerAccountId(): String? = ledgerAccountId.getNullable("ledger_account_id")

    /** The Legal Entity associated to this account */
    fun legalEntityId(): String? = legalEntityId.getNullable("legal_entity_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** A nickname for the account. */
    fun name(): String? = name.getNullable("name")

    fun object_(): String = object_.getRequired("object")

    /** The parent InternalAccount of this account. */
    fun parentAccountId(): String? = parentAccountId.getNullable("parent_account_id")

    /** The address associated with the owner or null. */
    fun partyAddress(): Address? = partyAddress.getNullable("party_address")

    /** The legal name of the entity which owns the account. */
    fun partyName(): String = partyName.getRequired("party_name")

    /** Either individual or business. */
    fun partyType(): PartyType? = partyType.getNullable("party_type")

    /** An array of routing detail objects. */
    fun routingDetails(): List<RoutingDetail> = routingDetails.getRequired("routing_details")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** An array of account detail objects. */
    @JsonProperty("account_details")
    @ExcludeMissing
    fun _accountDetails(): JsonField<List<AccountDetail>> = accountDetails

    /** Can be checking, savings or other. */
    @JsonProperty("account_type")
    @ExcludeMissing
    fun _accountType(): JsonField<AccountType> = accountType

    /** Specifies which financial institution the accounts belong to. */
    @JsonProperty("connection")
    @ExcludeMissing
    fun _connection(): JsonField<Connection> = connection

    /** The Counterparty associated to this account. */
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    fun _counterpartyId(): JsonField<String> = counterpartyId

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The currency of the account. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * If the internal account links to a ledger account in Modern Treasury, the id of the ledger
     * account will be populated here.
     */
    @JsonProperty("ledger_account_id")
    @ExcludeMissing
    fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

    /** The Legal Entity associated to this account */
    @JsonProperty("legal_entity_id")
    @ExcludeMissing
    fun _legalEntityId(): JsonField<String> = legalEntityId

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /** A nickname for the account. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /** The parent InternalAccount of this account. */
    @JsonProperty("parent_account_id")
    @ExcludeMissing
    fun _parentAccountId(): JsonField<String> = parentAccountId

    /** The address associated with the owner or null. */
    @JsonProperty("party_address")
    @ExcludeMissing
    fun _partyAddress(): JsonField<Address> = partyAddress

    /** The legal name of the entity which owns the account. */
    @JsonProperty("party_name") @ExcludeMissing fun _partyName(): JsonField<String> = partyName

    /** Either individual or business. */
    @JsonProperty("party_type") @ExcludeMissing fun _partyType(): JsonField<PartyType> = partyType

    /** An array of routing detail objects. */
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

    fun validate(): InternalAccount = apply {
        if (validated) {
            return@apply
        }

        id()
        accountDetails().forEach { it.validate() }
        accountType()
        connection().validate()
        counterpartyId()
        createdAt()
        currency()
        ledgerAccountId()
        legalEntityId()
        liveMode()
        metadata().validate()
        name()
        object_()
        parentAccountId()
        partyAddress()?.validate()
        partyName()
        partyType()
        routingDetails().forEach { it.validate() }
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var accountDetails: JsonField<MutableList<AccountDetail>>? = null
        private var accountType: JsonField<AccountType>? = null
        private var connection: JsonField<Connection>? = null
        private var counterpartyId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var ledgerAccountId: JsonField<String>? = null
        private var legalEntityId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var name: JsonField<String>? = null
        private var object_: JsonField<String>? = null
        private var parentAccountId: JsonField<String>? = null
        private var partyAddress: JsonField<Address>? = null
        private var partyName: JsonField<String>? = null
        private var partyType: JsonField<PartyType>? = null
        private var routingDetails: JsonField<MutableList<RoutingDetail>>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(internalAccount: InternalAccount) = apply {
            id = internalAccount.id
            accountDetails = internalAccount.accountDetails.map { it.toMutableList() }
            accountType = internalAccount.accountType
            connection = internalAccount.connection
            counterpartyId = internalAccount.counterpartyId
            createdAt = internalAccount.createdAt
            currency = internalAccount.currency
            ledgerAccountId = internalAccount.ledgerAccountId
            legalEntityId = internalAccount.legalEntityId
            liveMode = internalAccount.liveMode
            metadata = internalAccount.metadata
            name = internalAccount.name
            object_ = internalAccount.object_
            parentAccountId = internalAccount.parentAccountId
            partyAddress = internalAccount.partyAddress
            partyName = internalAccount.partyName
            partyType = internalAccount.partyType
            routingDetails = internalAccount.routingDetails.map { it.toMutableList() }
            updatedAt = internalAccount.updatedAt
            additionalProperties = internalAccount.additionalProperties.toMutableMap()
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

        /** Can be checking, savings or other. */
        fun accountType(accountType: AccountType?) = accountType(JsonField.ofNullable(accountType))

        /** Can be checking, savings or other. */
        fun accountType(accountType: JsonField<AccountType>) = apply {
            this.accountType = accountType
        }

        /** Specifies which financial institution the accounts belong to. */
        fun connection(connection: Connection) = connection(JsonField.of(connection))

        /** Specifies which financial institution the accounts belong to. */
        fun connection(connection: JsonField<Connection>) = apply { this.connection = connection }

        /** The Counterparty associated to this account. */
        fun counterpartyId(counterpartyId: String?) =
            counterpartyId(JsonField.ofNullable(counterpartyId))

        /** The Counterparty associated to this account. */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The currency of the account. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The currency of the account. */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * If the internal account links to a ledger account in Modern Treasury, the id of the
         * ledger account will be populated here.
         */
        fun ledgerAccountId(ledgerAccountId: String?) =
            ledgerAccountId(JsonField.ofNullable(ledgerAccountId))

        /**
         * If the internal account links to a ledger account in Modern Treasury, the id of the
         * ledger account will be populated here.
         */
        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
            this.ledgerAccountId = ledgerAccountId
        }

        /** The Legal Entity associated to this account */
        fun legalEntityId(legalEntityId: String?) =
            legalEntityId(JsonField.ofNullable(legalEntityId))

        /** The Legal Entity associated to this account */
        fun legalEntityId(legalEntityId: JsonField<String>) = apply {
            this.legalEntityId = legalEntityId
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

        /** A nickname for the account. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** A nickname for the account. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The parent InternalAccount of this account. */
        fun parentAccountId(parentAccountId: String?) =
            parentAccountId(JsonField.ofNullable(parentAccountId))

        /** The parent InternalAccount of this account. */
        fun parentAccountId(parentAccountId: JsonField<String>) = apply {
            this.parentAccountId = parentAccountId
        }

        /** The address associated with the owner or null. */
        fun partyAddress(partyAddress: Address?) = partyAddress(JsonField.ofNullable(partyAddress))

        /** The address associated with the owner or null. */
        fun partyAddress(partyAddress: JsonField<Address>) = apply {
            this.partyAddress = partyAddress
        }

        /** The legal name of the entity which owns the account. */
        fun partyName(partyName: String) = partyName(JsonField.of(partyName))

        /** The legal name of the entity which owns the account. */
        fun partyName(partyName: JsonField<String>) = apply { this.partyName = partyName }

        /** Either individual or business. */
        fun partyType(partyType: PartyType?) = partyType(JsonField.ofNullable(partyType))

        /** Either individual or business. */
        fun partyType(partyType: JsonField<PartyType>) = apply { this.partyType = partyType }

        /** An array of routing detail objects. */
        fun routingDetails(routingDetails: List<RoutingDetail>) =
            routingDetails(JsonField.of(routingDetails))

        /** An array of routing detail objects. */
        fun routingDetails(routingDetails: JsonField<List<RoutingDetail>>) = apply {
            this.routingDetails = routingDetails.map { it.toMutableList() }
        }

        /** An array of routing detail objects. */
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

        fun build(): InternalAccount =
            InternalAccount(
                checkRequired("id", id),
                checkRequired("accountDetails", accountDetails).map { it.toImmutable() },
                checkRequired("accountType", accountType),
                checkRequired("connection", connection),
                checkRequired("counterpartyId", counterpartyId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("ledgerAccountId", ledgerAccountId),
                checkRequired("legalEntityId", legalEntityId),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("name", name),
                checkRequired("object_", object_),
                checkRequired("parentAccountId", parentAccountId),
                checkRequired("partyAddress", partyAddress),
                checkRequired("partyName", partyName),
                checkRequired("partyType", partyType),
                checkRequired("routingDetails", routingDetails).map { it.toImmutable() },
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toImmutable(),
            )
    }

    /** Can be checking, savings or other. */
    class AccountType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CASH = of("cash")

            val CHECKING = of("checking")

            val GENERAL_LEDGER = of("general_ledger")

            val LOAN = of("loan")

            val NON_RESIDENT = of("non_resident")

            val OTHER = of("other")

            val OVERDRAFT = of("overdraft")

            val SAVINGS = of("savings")

            fun of(value: String) = AccountType(JsonField.of(value))
        }

        enum class Known {
            CASH,
            CHECKING,
            GENERAL_LEDGER,
            LOAN,
            NON_RESIDENT,
            OTHER,
            OVERDRAFT,
            SAVINGS,
        }

        enum class Value {
            CASH,
            CHECKING,
            GENERAL_LEDGER,
            LOAN,
            NON_RESIDENT,
            OTHER,
            OVERDRAFT,
            SAVINGS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CASH -> Value.CASH
                CHECKING -> Value.CHECKING
                GENERAL_LEDGER -> Value.GENERAL_LEDGER
                LOAN -> Value.LOAN
                NON_RESIDENT -> Value.NON_RESIDENT
                OTHER -> Value.OTHER
                OVERDRAFT -> Value.OVERDRAFT
                SAVINGS -> Value.SAVINGS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CASH -> Known.CASH
                CHECKING -> Known.CHECKING
                GENERAL_LEDGER -> Known.GENERAL_LEDGER
                LOAN -> Known.LOAN
                NON_RESIDENT -> Known.NON_RESIDENT
                OTHER -> Known.OTHER
                OVERDRAFT -> Known.OVERDRAFT
                SAVINGS -> Known.SAVINGS
                else -> throw ModernTreasuryInvalidDataException("Unknown AccountType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

    /** The address associated with the owner or null. */
    @NoAutoDetect
    class Address
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("locality")
        @ExcludeMissing
        private val locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region")
        @ExcludeMissing
        private val region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String? = country.getNullable("country")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun line1(): String? = line1.getNullable("line1")

        fun line2(): String? = line2.getNullable("line2")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        /** Locality or City. */
        fun locality(): String? = locality.getNullable("locality")

        fun object_(): String = object_.getRequired("object")

        /** The postal code of the address. */
        fun postalCode(): String? = postalCode.getNullable("postal_code")

        /** Region or State. */
        fun region(): String? = region.getNullable("region")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        /** The postal code of the address. */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Address = apply {
            if (validated) {
                return@apply
            }

            id()
            country()
            createdAt()
            line1()
            line2()
            liveMode()
            locality()
            object_()
            postalCode()
            region()
            updatedAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var line1: JsonField<String>? = null
            private var line2: JsonField<String>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var locality: JsonField<String>? = null
            private var object_: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var region: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(address: Address) = apply {
                id = address.id
                country = address.country
                createdAt = address.createdAt
                line1 = address.line1
                line2 = address.line2
                liveMode = address.liveMode
                locality = address.locality
                object_ = address.object_
                postalCode = address.postalCode
                region = address.region
                updatedAt = address.updatedAt
                additionalProperties = address.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String?) = country(JsonField.ofNullable(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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

            /** Locality or City. */
            fun locality(locality: String?) = locality(JsonField.ofNullable(locality))

            /** Locality or City. */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            fun object_(object_: String) = object_(JsonField.of(object_))

            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /** The postal code of the address. */
            fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

            /** The postal code of the address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String?) = region(JsonField.ofNullable(region))

            /** Region or State. */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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

            fun build(): Address =
                Address(
                    checkRequired("id", id),
                    checkRequired("country", country),
                    checkRequired("createdAt", createdAt),
                    checkRequired("line1", line1),
                    checkRequired("line2", line2),
                    checkRequired("liveMode", liveMode),
                    checkRequired("locality", locality),
                    checkRequired("object_", object_),
                    checkRequired("postalCode", postalCode),
                    checkRequired("region", region),
                    checkRequired("updatedAt", updatedAt),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Address && id == other.id && country == other.country && createdAt == other.createdAt && line1 == other.line1 && line2 == other.line2 && liveMode == other.liveMode && locality == other.locality && object_ == other.object_ && postalCode == other.postalCode && region == other.region && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, country, createdAt, line1, line2, liveMode, locality, object_, postalCode, region, updatedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Address{id=$id, country=$country, createdAt=$createdAt, line1=$line1, line2=$line2, liveMode=$liveMode, locality=$locality, object_=$object_, postalCode=$postalCode, region=$region, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    /** Either individual or business. */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InternalAccount && id == other.id && accountDetails == other.accountDetails && accountType == other.accountType && connection == other.connection && counterpartyId == other.counterpartyId && createdAt == other.createdAt && currency == other.currency && ledgerAccountId == other.ledgerAccountId && legalEntityId == other.legalEntityId && liveMode == other.liveMode && metadata == other.metadata && name == other.name && object_ == other.object_ && parentAccountId == other.parentAccountId && partyAddress == other.partyAddress && partyName == other.partyName && partyType == other.partyType && routingDetails == other.routingDetails && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountDetails, accountType, connection, counterpartyId, createdAt, currency, ledgerAccountId, legalEntityId, liveMode, metadata, name, object_, parentAccountId, partyAddress, partyName, partyType, routingDetails, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InternalAccount{id=$id, accountDetails=$accountDetails, accountType=$accountType, connection=$connection, counterpartyId=$counterpartyId, createdAt=$createdAt, currency=$currency, ledgerAccountId=$ledgerAccountId, legalEntityId=$legalEntityId, liveMode=$liveMode, metadata=$metadata, name=$name, object_=$object_, parentAccountId=$parentAccountId, partyAddress=$partyAddress, partyName=$partyName, partyType=$partyType, routingDetails=$routingDetails, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
