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
    @JsonProperty("account_type")
    @ExcludeMissing
    private val accountType: JsonField<AccountType> = JsonMissing.of(),
    @JsonProperty("party_name")
    @ExcludeMissing
    private val partyName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("party_type")
    @ExcludeMissing
    private val partyType: JsonField<PartyType> = JsonMissing.of(),
    @JsonProperty("party_address")
    @ExcludeMissing
    private val partyAddress: JsonField<Address> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_details")
    @ExcludeMissing
    private val accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of(),
    @JsonProperty("routing_details")
    @ExcludeMissing
    private val routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of(),
    @JsonProperty("connection")
    @ExcludeMissing
    private val connection: JsonField<Connection> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("parent_account_id")
    @ExcludeMissing
    private val parentAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    private val counterpartyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("legal_entity_id")
    @ExcludeMissing
    private val legalEntityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledger_account_id")
    @ExcludeMissing
    private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
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

    /** Can be checking, savings or other. */
    fun accountType(): AccountType? = accountType.getNullable("account_type")

    /** The legal name of the entity which owns the account. */
    fun partyName(): String = partyName.getRequired("party_name")

    /** Either individual or business. */
    fun partyType(): PartyType? = partyType.getNullable("party_type")

    /** The address associated with the owner or null. */
    fun partyAddress(): Address? = partyAddress.getNullable("party_address")

    /** A nickname for the account. */
    fun name(): String? = name.getNullable("name")

    /** An array of account detail objects. */
    fun accountDetails(): List<AccountDetail> = accountDetails.getRequired("account_details")

    /** An array of routing detail objects. */
    fun routingDetails(): List<RoutingDetail> = routingDetails.getRequired("routing_details")

    /** Specifies which financial institution the accounts belong to. */
    fun connection(): Connection = connection.getRequired("connection")

    /** The currency of the account. */
    fun currency(): Currency = currency.getRequired("currency")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** The parent InternalAccount of this account. */
    fun parentAccountId(): String? = parentAccountId.getNullable("parent_account_id")

    /** The Counterparty associated to this account. */
    fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

    /** The Legal Entity associated to this account */
    fun legalEntityId(): String? = legalEntityId.getNullable("legal_entity_id")

    /**
     * If the internal account links to a ledger account in Modern Treasury, the id of the ledger
     * account will be populated here.
     */
    fun ledgerAccountId(): String? = ledgerAccountId.getNullable("ledger_account_id")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** Can be checking, savings or other. */
    @JsonProperty("account_type") @ExcludeMissing fun _accountType() = accountType

    /** The legal name of the entity which owns the account. */
    @JsonProperty("party_name") @ExcludeMissing fun _partyName() = partyName

    /** Either individual or business. */
    @JsonProperty("party_type") @ExcludeMissing fun _partyType() = partyType

    /** The address associated with the owner or null. */
    @JsonProperty("party_address") @ExcludeMissing fun _partyAddress() = partyAddress

    /** A nickname for the account. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** An array of account detail objects. */
    @JsonProperty("account_details") @ExcludeMissing fun _accountDetails() = accountDetails

    /** An array of routing detail objects. */
    @JsonProperty("routing_details") @ExcludeMissing fun _routingDetails() = routingDetails

    /** Specifies which financial institution the accounts belong to. */
    @JsonProperty("connection") @ExcludeMissing fun _connection() = connection

    /** The currency of the account. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    /** The parent InternalAccount of this account. */
    @JsonProperty("parent_account_id") @ExcludeMissing fun _parentAccountId() = parentAccountId

    /** The Counterparty associated to this account. */
    @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

    /** The Legal Entity associated to this account */
    @JsonProperty("legal_entity_id") @ExcludeMissing fun _legalEntityId() = legalEntityId

    /**
     * If the internal account links to a ledger account in Modern Treasury, the id of the ledger
     * account will be populated here.
     */
    @JsonProperty("ledger_account_id") @ExcludeMissing fun _ledgerAccountId() = ledgerAccountId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InternalAccount = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            accountType()
            partyName()
            partyType()
            partyAddress()?.validate()
            name()
            accountDetails().forEach { it.validate() }
            routingDetails().forEach { it.validate() }
            connection().validate()
            currency()
            metadata().validate()
            parentAccountId()
            counterpartyId()
            legalEntityId()
            ledgerAccountId()
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
        private var accountType: JsonField<AccountType> = JsonMissing.of()
        private var partyName: JsonField<String> = JsonMissing.of()
        private var partyType: JsonField<PartyType> = JsonMissing.of()
        private var partyAddress: JsonField<Address> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of()
        private var routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of()
        private var connection: JsonField<Connection> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var parentAccountId: JsonField<String> = JsonMissing.of()
        private var counterpartyId: JsonField<String> = JsonMissing.of()
        private var legalEntityId: JsonField<String> = JsonMissing.of()
        private var ledgerAccountId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(internalAccount: InternalAccount) = apply {
            id = internalAccount.id
            object_ = internalAccount.object_
            liveMode = internalAccount.liveMode
            createdAt = internalAccount.createdAt
            updatedAt = internalAccount.updatedAt
            accountType = internalAccount.accountType
            partyName = internalAccount.partyName
            partyType = internalAccount.partyType
            partyAddress = internalAccount.partyAddress
            name = internalAccount.name
            accountDetails = internalAccount.accountDetails
            routingDetails = internalAccount.routingDetails
            connection = internalAccount.connection
            currency = internalAccount.currency
            metadata = internalAccount.metadata
            parentAccountId = internalAccount.parentAccountId
            counterpartyId = internalAccount.counterpartyId
            legalEntityId = internalAccount.legalEntityId
            ledgerAccountId = internalAccount.ledgerAccountId
            additionalProperties = internalAccount.additionalProperties.toMutableMap()
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

        /** Can be checking, savings or other. */
        fun accountType(accountType: AccountType) = accountType(JsonField.of(accountType))

        /** Can be checking, savings or other. */
        fun accountType(accountType: JsonField<AccountType>) = apply {
            this.accountType = accountType
        }

        /** The legal name of the entity which owns the account. */
        fun partyName(partyName: String) = partyName(JsonField.of(partyName))

        /** The legal name of the entity which owns the account. */
        fun partyName(partyName: JsonField<String>) = apply { this.partyName = partyName }

        /** Either individual or business. */
        fun partyType(partyType: PartyType) = partyType(JsonField.of(partyType))

        /** Either individual or business. */
        fun partyType(partyType: JsonField<PartyType>) = apply { this.partyType = partyType }

        /** The address associated with the owner or null. */
        fun partyAddress(partyAddress: Address) = partyAddress(JsonField.of(partyAddress))

        /** The address associated with the owner or null. */
        fun partyAddress(partyAddress: JsonField<Address>) = apply {
            this.partyAddress = partyAddress
        }

        /** A nickname for the account. */
        fun name(name: String) = name(JsonField.of(name))

        /** A nickname for the account. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** An array of account detail objects. */
        fun accountDetails(accountDetails: List<AccountDetail>) =
            accountDetails(JsonField.of(accountDetails))

        /** An array of account detail objects. */
        fun accountDetails(accountDetails: JsonField<List<AccountDetail>>) = apply {
            this.accountDetails = accountDetails
        }

        /** An array of routing detail objects. */
        fun routingDetails(routingDetails: List<RoutingDetail>) =
            routingDetails(JsonField.of(routingDetails))

        /** An array of routing detail objects. */
        fun routingDetails(routingDetails: JsonField<List<RoutingDetail>>) = apply {
            this.routingDetails = routingDetails
        }

        /** Specifies which financial institution the accounts belong to. */
        fun connection(connection: Connection) = connection(JsonField.of(connection))

        /** Specifies which financial institution the accounts belong to. */
        fun connection(connection: JsonField<Connection>) = apply { this.connection = connection }

        /** The currency of the account. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The currency of the account. */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The parent InternalAccount of this account. */
        fun parentAccountId(parentAccountId: String) =
            parentAccountId(JsonField.of(parentAccountId))

        /** The parent InternalAccount of this account. */
        fun parentAccountId(parentAccountId: JsonField<String>) = apply {
            this.parentAccountId = parentAccountId
        }

        /** The Counterparty associated to this account. */
        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

        /** The Counterparty associated to this account. */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        /** The Legal Entity associated to this account */
        fun legalEntityId(legalEntityId: String) = legalEntityId(JsonField.of(legalEntityId))

        /** The Legal Entity associated to this account */
        fun legalEntityId(legalEntityId: JsonField<String>) = apply {
            this.legalEntityId = legalEntityId
        }

        /**
         * If the internal account links to a ledger account in Modern Treasury, the id of the
         * ledger account will be populated here.
         */
        fun ledgerAccountId(ledgerAccountId: String) =
            ledgerAccountId(JsonField.of(ledgerAccountId))

        /**
         * If the internal account links to a ledger account in Modern Treasury, the id of the
         * ledger account will be populated here.
         */
        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
            this.ledgerAccountId = ledgerAccountId
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

        fun build(): InternalAccount =
            InternalAccount(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                accountType,
                partyName,
                partyType,
                partyAddress,
                name,
                accountDetails.map { it.toImmutable() },
                routingDetails.map { it.toImmutable() },
                connection,
                currency,
                metadata,
                parentAccountId,
                counterpartyId,
                legalEntityId,
                ledgerAccountId,
                additionalProperties.toImmutable(),
            )
    }

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

    /** The address associated with the owner or null. */
    @NoAutoDetect
    class Address
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
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality")
        @ExcludeMissing
        private val locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region")
        @ExcludeMissing
        private val region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun object_(): String = object_.getRequired("object")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        fun line1(): String? = line1.getNullable("line1")

        fun line2(): String? = line2.getNullable("line2")

        /** Locality or City. */
        fun locality(): String? = locality.getNullable("locality")

        /** Region or State. */
        fun region(): String? = region.getNullable("region")

        /** The postal code of the address. */
        fun postalCode(): String? = postalCode.getNullable("postal_code")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String? = country.getNullable("country")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("object") @ExcludeMissing fun _object_() = object_

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality() = locality

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region() = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country() = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Address = apply {
            if (!validated) {
                id()
                object_()
                liveMode()
                createdAt()
                updatedAt()
                line1()
                line2()
                locality()
                region()
                postalCode()
                country()
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
            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(address: Address) = apply {
                id = address.id
                object_ = address.object_
                liveMode = address.liveMode
                createdAt = address.createdAt
                updatedAt = address.updatedAt
                line1 = address.line1
                line2 = address.line2
                locality = address.locality
                region = address.region
                postalCode = address.postalCode
                country = address.country
                additionalProperties = address.additionalProperties.toMutableMap()
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

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun line1(line1: String) = line1(JsonField.of(line1))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String) = line2(JsonField.of(line2))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /** Locality or City. */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /** Region or State. */
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = country(JsonField.of(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: JsonField<String>) = apply { this.country = country }

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
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
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

            return /* spotless:off */ other is Address && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, line1, line2, locality, region, postalCode, country, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Address{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InternalAccount && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && accountType == other.accountType && partyName == other.partyName && partyType == other.partyType && partyAddress == other.partyAddress && name == other.name && accountDetails == other.accountDetails && routingDetails == other.routingDetails && connection == other.connection && currency == other.currency && metadata == other.metadata && parentAccountId == other.parentAccountId && counterpartyId == other.counterpartyId && legalEntityId == other.legalEntityId && ledgerAccountId == other.ledgerAccountId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, accountType, partyName, partyType, partyAddress, name, accountDetails, routingDetails, connection, currency, metadata, parentAccountId, counterpartyId, legalEntityId, ledgerAccountId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InternalAccount{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, accountType=$accountType, partyName=$partyName, partyType=$partyType, partyAddress=$partyAddress, name=$name, accountDetails=$accountDetails, routingDetails=$routingDetails, connection=$connection, currency=$currency, metadata=$metadata, parentAccountId=$parentAccountId, counterpartyId=$counterpartyId, legalEntityId=$legalEntityId, ledgerAccountId=$ledgerAccountId, additionalProperties=$additionalProperties}"
}
