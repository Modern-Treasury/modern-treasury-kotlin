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
class Counterparty
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
    @JsonProperty("accounts")
    @ExcludeMissing
    private val accounts: JsonField<List<Account>> = JsonMissing.of(),
    @JsonProperty("email") @ExcludeMissing private val email: JsonField<String> = JsonMissing.of(),
    @JsonProperty("legal_entity_id")
    @ExcludeMissing
    private val legalEntityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("send_remittance_advice")
    @ExcludeMissing
    private val sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("verification_status")
    @ExcludeMissing
    private val verificationStatus: JsonField<VerificationStatus> = JsonMissing.of(),
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

    /** A human friendly name for this counterparty. */
    fun name(): String? = name.getNullable("name")

    /** The accounts for this counterparty. */
    fun accounts(): List<Account> = accounts.getRequired("accounts")

    /** The counterparty's email. */
    fun email(): String? = email.getNullable("email")

    /** The id of the legal entity. */
    fun legalEntityId(): String? = legalEntityId.getNullable("legal_entity_id")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * Send an email to the counterparty whenever an associated payment order is sent to the bank.
     */
    fun sendRemittanceAdvice(): Boolean = sendRemittanceAdvice.getRequired("send_remittance_advice")

    /** The verification status of the counterparty. */
    fun verificationStatus(): VerificationStatus =
        verificationStatus.getRequired("verification_status")

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

    /** A human friendly name for this counterparty. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** The accounts for this counterparty. */
    @JsonProperty("accounts") @ExcludeMissing fun _accounts() = accounts

    /** The counterparty's email. */
    @JsonProperty("email") @ExcludeMissing fun _email() = email

    /** The id of the legal entity. */
    @JsonProperty("legal_entity_id") @ExcludeMissing fun _legalEntityId() = legalEntityId

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    /**
     * Send an email to the counterparty whenever an associated payment order is sent to the bank.
     */
    @JsonProperty("send_remittance_advice")
    @ExcludeMissing
    fun _sendRemittanceAdvice() = sendRemittanceAdvice

    /** The verification status of the counterparty. */
    @JsonProperty("verification_status")
    @ExcludeMissing
    fun _verificationStatus() = verificationStatus

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Counterparty = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            name()
            accounts().forEach { it.validate() }
            email()
            legalEntityId()
            metadata().validate()
            sendRemittanceAdvice()
            verificationStatus()
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
        private var accounts: JsonField<List<Account>> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var legalEntityId: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of()
        private var verificationStatus: JsonField<VerificationStatus> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(counterparty: Counterparty) = apply {
            id = counterparty.id
            object_ = counterparty.object_
            liveMode = counterparty.liveMode
            createdAt = counterparty.createdAt
            updatedAt = counterparty.updatedAt
            discardedAt = counterparty.discardedAt
            name = counterparty.name
            accounts = counterparty.accounts
            email = counterparty.email
            legalEntityId = counterparty.legalEntityId
            metadata = counterparty.metadata
            sendRemittanceAdvice = counterparty.sendRemittanceAdvice
            verificationStatus = counterparty.verificationStatus
            additionalProperties = counterparty.additionalProperties.toMutableMap()
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

        /** A human friendly name for this counterparty. */
        fun name(name: String) = name(JsonField.of(name))

        /** A human friendly name for this counterparty. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The accounts for this counterparty. */
        fun accounts(accounts: List<Account>) = accounts(JsonField.of(accounts))

        /** The accounts for this counterparty. */
        fun accounts(accounts: JsonField<List<Account>>) = apply { this.accounts = accounts }

        /** The counterparty's email. */
        fun email(email: String) = email(JsonField.of(email))

        /** The counterparty's email. */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The id of the legal entity. */
        fun legalEntityId(legalEntityId: String) = legalEntityId(JsonField.of(legalEntityId))

        /** The id of the legal entity. */
        fun legalEntityId(legalEntityId: JsonField<String>) = apply {
            this.legalEntityId = legalEntityId
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /**
         * Send an email to the counterparty whenever an associated payment order is sent to the
         * bank.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
            sendRemittanceAdvice(JsonField.of(sendRemittanceAdvice))

        /**
         * Send an email to the counterparty whenever an associated payment order is sent to the
         * bank.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: JsonField<Boolean>) = apply {
            this.sendRemittanceAdvice = sendRemittanceAdvice
        }

        /** The verification status of the counterparty. */
        fun verificationStatus(verificationStatus: VerificationStatus) =
            verificationStatus(JsonField.of(verificationStatus))

        /** The verification status of the counterparty. */
        fun verificationStatus(verificationStatus: JsonField<VerificationStatus>) = apply {
            this.verificationStatus = verificationStatus
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

        fun build(): Counterparty =
            Counterparty(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                name,
                accounts.map { it.toImmutable() },
                email,
                legalEntityId,
                metadata,
                sendRemittanceAdvice,
                verificationStatus,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Account
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
        @JsonProperty("account_type")
        @ExcludeMissing
        private val accountType: JsonField<ExternalAccountType> = JsonMissing.of(),
        @JsonProperty("party_type")
        @ExcludeMissing
        private val partyType: JsonField<PartyType> = JsonMissing.of(),
        @JsonProperty("party_address")
        @ExcludeMissing
        private val partyAddress: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_details")
        @ExcludeMissing
        private val accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of(),
        @JsonProperty("routing_details")
        @ExcludeMissing
        private val routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("party_name")
        @ExcludeMissing
        private val partyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_details")
        @ExcludeMissing
        private val contactDetails: JsonField<List<ContactDetail>> = JsonMissing.of(),
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verification_status")
        @ExcludeMissing
        private val verificationStatus: JsonField<VerificationStatus> = JsonMissing.of(),
        @JsonProperty("verification_source")
        @ExcludeMissing
        private val verificationSource: JsonField<VerificationSource> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String? = id.getNullable("id")

        fun object_(): String? = object_.getNullable("object")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean? = liveMode.getNullable("live_mode")

        fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

        fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

        /** Can be `checking`, `savings` or `other`. */
        fun accountType(): ExternalAccountType? = accountType.getNullable("account_type")

        /** Either `individual` or `business`. */
        fun partyType(): PartyType? = partyType.getNullable("party_type")

        /** The address associated with the owner or `null`. */
        fun partyAddress(): Address? = partyAddress.getNullable("party_address")

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        fun name(): String? = name.getNullable("name")

        fun accountDetails(): List<AccountDetail>? = accountDetails.getNullable("account_details")

        fun routingDetails(): List<RoutingDetail>? = routingDetails.getNullable("routing_details")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /** The legal name of the entity which owns the account. */
        fun partyName(): String? = partyName.getNullable("party_name")

        fun contactDetails(): List<ContactDetail>? = contactDetails.getNullable("contact_details")

        /**
         * If the external account links to a ledger account in Modern Treasury, the id of the
         * ledger account will be populated here.
         */
        fun ledgerAccountId(): String? = ledgerAccountId.getNullable("ledger_account_id")

        fun verificationStatus(): VerificationStatus? =
            verificationStatus.getNullable("verification_status")

        fun verificationSource(): VerificationSource? =
            verificationSource.getNullable("verification_source")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("object") @ExcludeMissing fun _object_() = object_

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

        @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

        /** Can be `checking`, `savings` or `other`. */
        @JsonProperty("account_type") @ExcludeMissing fun _accountType() = accountType

        /** Either `individual` or `business`. */
        @JsonProperty("party_type") @ExcludeMissing fun _partyType() = partyType

        /** The address associated with the owner or `null`. */
        @JsonProperty("party_address") @ExcludeMissing fun _partyAddress() = partyAddress

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("account_details") @ExcludeMissing fun _accountDetails() = accountDetails

        @JsonProperty("routing_details") @ExcludeMissing fun _routingDetails() = routingDetails

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

        /** The legal name of the entity which owns the account. */
        @JsonProperty("party_name") @ExcludeMissing fun _partyName() = partyName

        @JsonProperty("contact_details") @ExcludeMissing fun _contactDetails() = contactDetails

        /**
         * If the external account links to a ledger account in Modern Treasury, the id of the
         * ledger account will be populated here.
         */
        @JsonProperty("ledger_account_id") @ExcludeMissing fun _ledgerAccountId() = ledgerAccountId

        @JsonProperty("verification_status")
        @ExcludeMissing
        fun _verificationStatus() = verificationStatus

        @JsonProperty("verification_source")
        @ExcludeMissing
        fun _verificationSource() = verificationSource

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Account = apply {
            if (!validated) {
                id()
                object_()
                liveMode()
                createdAt()
                updatedAt()
                discardedAt()
                accountType()
                partyType()
                partyAddress()?.validate()
                name()
                accountDetails()?.forEach { it.validate() }
                routingDetails()?.forEach { it.validate() }
                metadata()?.validate()
                partyName()
                contactDetails()?.forEach { it.validate() }
                ledgerAccountId()
                verificationStatus()
                verificationSource()
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
            private var accountType: JsonField<ExternalAccountType> = JsonMissing.of()
            private var partyType: JsonField<PartyType> = JsonMissing.of()
            private var partyAddress: JsonField<Address> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of()
            private var routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var partyName: JsonField<String> = JsonMissing.of()
            private var contactDetails: JsonField<List<ContactDetail>> = JsonMissing.of()
            private var ledgerAccountId: JsonField<String> = JsonMissing.of()
            private var verificationStatus: JsonField<VerificationStatus> = JsonMissing.of()
            private var verificationSource: JsonField<VerificationSource> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(account: Account) = apply {
                id = account.id
                object_ = account.object_
                liveMode = account.liveMode
                createdAt = account.createdAt
                updatedAt = account.updatedAt
                discardedAt = account.discardedAt
                accountType = account.accountType
                partyType = account.partyType
                partyAddress = account.partyAddress
                name = account.name
                accountDetails = account.accountDetails
                routingDetails = account.routingDetails
                metadata = account.metadata
                partyName = account.partyName
                contactDetails = account.contactDetails
                ledgerAccountId = account.ledgerAccountId
                verificationStatus = account.verificationStatus
                verificationSource = account.verificationSource
                additionalProperties = account.additionalProperties.toMutableMap()
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

            fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                this.discardedAt = discardedAt
            }

            /** Can be `checking`, `savings` or `other`. */
            fun accountType(accountType: ExternalAccountType) =
                accountType(JsonField.of(accountType))

            /** Can be `checking`, `savings` or `other`. */
            fun accountType(accountType: JsonField<ExternalAccountType>) = apply {
                this.accountType = accountType
            }

            /** Either `individual` or `business`. */
            fun partyType(partyType: PartyType) = partyType(JsonField.of(partyType))

            /** Either `individual` or `business`. */
            fun partyType(partyType: JsonField<PartyType>) = apply { this.partyType = partyType }

            /** The address associated with the owner or `null`. */
            fun partyAddress(partyAddress: Address) = partyAddress(JsonField.of(partyAddress))

            /** The address associated with the owner or `null`. */
            fun partyAddress(partyAddress: JsonField<Address>) = apply {
                this.partyAddress = partyAddress
            }

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun accountDetails(accountDetails: List<AccountDetail>) =
                accountDetails(JsonField.of(accountDetails))

            fun accountDetails(accountDetails: JsonField<List<AccountDetail>>) = apply {
                this.accountDetails = accountDetails
            }

            fun routingDetails(routingDetails: List<RoutingDetail>) =
                routingDetails(JsonField.of(routingDetails))

            fun routingDetails(routingDetails: JsonField<List<RoutingDetail>>) = apply {
                this.routingDetails = routingDetails
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** The legal name of the entity which owns the account. */
            fun partyName(partyName: String) = partyName(JsonField.of(partyName))

            /** The legal name of the entity which owns the account. */
            fun partyName(partyName: JsonField<String>) = apply { this.partyName = partyName }

            fun contactDetails(contactDetails: List<ContactDetail>) =
                contactDetails(JsonField.of(contactDetails))

            fun contactDetails(contactDetails: JsonField<List<ContactDetail>>) = apply {
                this.contactDetails = contactDetails
            }

            /**
             * If the external account links to a ledger account in Modern Treasury, the id of the
             * ledger account will be populated here.
             */
            fun ledgerAccountId(ledgerAccountId: String) =
                ledgerAccountId(JsonField.of(ledgerAccountId))

            /**
             * If the external account links to a ledger account in Modern Treasury, the id of the
             * ledger account will be populated here.
             */
            fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                this.ledgerAccountId = ledgerAccountId
            }

            fun verificationStatus(verificationStatus: VerificationStatus) =
                verificationStatus(JsonField.of(verificationStatus))

            fun verificationStatus(verificationStatus: JsonField<VerificationStatus>) = apply {
                this.verificationStatus = verificationStatus
            }

            fun verificationSource(verificationSource: VerificationSource) =
                verificationSource(JsonField.of(verificationSource))

            fun verificationSource(verificationSource: JsonField<VerificationSource>) = apply {
                this.verificationSource = verificationSource
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

            fun build(): Account =
                Account(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    discardedAt,
                    accountType,
                    partyType,
                    partyAddress,
                    name,
                    accountDetails.map { it.toImmutable() },
                    routingDetails.map { it.toImmutable() },
                    metadata,
                    partyName,
                    contactDetails.map { it.toImmutable() },
                    ledgerAccountId,
                    verificationStatus,
                    verificationSource,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class ContactDetail
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("contact_identifier")
            @ExcludeMissing
            private val contactIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contact_identifier_type")
            @ExcludeMissing
            private val contactIdentifierType: JsonField<ContactIdentifierType> = JsonMissing.of(),
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

            fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

            fun contactIdentifier(): String = contactIdentifier.getRequired("contact_identifier")

            fun contactIdentifierType(): ContactIdentifierType =
                contactIdentifierType.getRequired("contact_identifier_type")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("object") @ExcludeMissing fun _object_() = object_

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

            @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

            @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

            @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

            @JsonProperty("contact_identifier")
            @ExcludeMissing
            fun _contactIdentifier() = contactIdentifier

            @JsonProperty("contact_identifier_type")
            @ExcludeMissing
            fun _contactIdentifierType() = contactIdentifierType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ContactDetail = apply {
                if (!validated) {
                    id()
                    object_()
                    liveMode()
                    createdAt()
                    updatedAt()
                    discardedAt()
                    contactIdentifier()
                    contactIdentifierType()
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
                private var contactIdentifier: JsonField<String> = JsonMissing.of()
                private var contactIdentifierType: JsonField<ContactIdentifierType> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(contactDetail: ContactDetail) = apply {
                    id = contactDetail.id
                    object_ = contactDetail.object_
                    liveMode = contactDetail.liveMode
                    createdAt = contactDetail.createdAt
                    updatedAt = contactDetail.updatedAt
                    discardedAt = contactDetail.discardedAt
                    contactIdentifier = contactDetail.contactIdentifier
                    contactIdentifierType = contactDetail.contactIdentifierType
                    additionalProperties = contactDetail.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun object_(object_: String) = object_(JsonField.of(object_))

                fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

                /**
                 * This field will be true if this object exists in the live environment or false if
                 * it exists in the test environment.
                 */
                fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

                /**
                 * This field will be true if this object exists in the live environment or false if
                 * it exists in the test environment.
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

                fun discardedAt(discardedAt: OffsetDateTime) =
                    discardedAt(JsonField.of(discardedAt))

                fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                    this.discardedAt = discardedAt
                }

                fun contactIdentifier(contactIdentifier: String) =
                    contactIdentifier(JsonField.of(contactIdentifier))

                fun contactIdentifier(contactIdentifier: JsonField<String>) = apply {
                    this.contactIdentifier = contactIdentifier
                }

                fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) =
                    contactIdentifierType(JsonField.of(contactIdentifierType))

                fun contactIdentifierType(contactIdentifierType: JsonField<ContactIdentifierType>) =
                    apply {
                        this.contactIdentifierType = contactIdentifierType
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): ContactDetail =
                    ContactDetail(
                        id,
                        object_,
                        liveMode,
                        createdAt,
                        updatedAt,
                        discardedAt,
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

                return /* spotless:off */ other is ContactDetail && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && discardedAt == other.discardedAt && contactIdentifier == other.contactIdentifier && contactIdentifierType == other.contactIdentifierType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, contactIdentifier, contactIdentifierType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ContactDetail{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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

        /** The address associated with the owner or `null`. */
        @NoAutoDetect
        class Address
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
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
                 * This field will be true if this object exists in the live environment or false if
                 * it exists in the test environment.
                 */
                fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

                /**
                 * This field will be true if this object exists in the live environment or false if
                 * it exists in the test environment.
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
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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

        class VerificationSource
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ACH_PRENOTE = of("ach_prenote")

                val MICRODEPOSITS = of("microdeposits")

                val PLAID = of("plaid")

                fun of(value: String) = VerificationSource(JsonField.of(value))
            }

            enum class Known {
                ACH_PRENOTE,
                MICRODEPOSITS,
                PLAID,
            }

            enum class Value {
                ACH_PRENOTE,
                MICRODEPOSITS,
                PLAID,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACH_PRENOTE -> Value.ACH_PRENOTE
                    MICRODEPOSITS -> Value.MICRODEPOSITS
                    PLAID -> Value.PLAID
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACH_PRENOTE -> Known.ACH_PRENOTE
                    MICRODEPOSITS -> Known.MICRODEPOSITS
                    PLAID -> Known.PLAID
                    else ->
                        throw ModernTreasuryInvalidDataException(
                            "Unknown VerificationSource: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is VerificationSource && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class VerificationStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val PENDING_VERIFICATION = of("pending_verification")

                val UNVERIFIED = of("unverified")

                val VERIFIED = of("verified")

                fun of(value: String) = VerificationStatus(JsonField.of(value))
            }

            enum class Known {
                PENDING_VERIFICATION,
                UNVERIFIED,
                VERIFIED,
            }

            enum class Value {
                PENDING_VERIFICATION,
                UNVERIFIED,
                VERIFIED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PENDING_VERIFICATION -> Value.PENDING_VERIFICATION
                    UNVERIFIED -> Value.UNVERIFIED
                    VERIFIED -> Value.VERIFIED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PENDING_VERIFICATION -> Known.PENDING_VERIFICATION
                    UNVERIFIED -> Known.UNVERIFIED
                    VERIFIED -> Known.VERIFIED
                    else ->
                        throw ModernTreasuryInvalidDataException(
                            "Unknown VerificationStatus: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is VerificationStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Account && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && discardedAt == other.discardedAt && accountType == other.accountType && partyType == other.partyType && partyAddress == other.partyAddress && name == other.name && accountDetails == other.accountDetails && routingDetails == other.routingDetails && metadata == other.metadata && partyName == other.partyName && contactDetails == other.contactDetails && ledgerAccountId == other.ledgerAccountId && verificationStatus == other.verificationStatus && verificationSource == other.verificationSource && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, accountType, partyType, partyAddress, name, accountDetails, routingDetails, metadata, partyName, contactDetails, ledgerAccountId, verificationStatus, verificationSource, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Account{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, accountType=$accountType, partyType=$partyType, partyAddress=$partyAddress, name=$name, accountDetails=$accountDetails, routingDetails=$routingDetails, metadata=$metadata, partyName=$partyName, contactDetails=$contactDetails, ledgerAccountId=$ledgerAccountId, verificationStatus=$verificationStatus, verificationSource=$verificationSource, additionalProperties=$additionalProperties}"
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

    class VerificationStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DENIED = of("denied")

            val NEEDS_APPROVAL = of("needs_approval")

            val UNVERIFIED = of("unverified")

            val VERIFIED = of("verified")

            fun of(value: String) = VerificationStatus(JsonField.of(value))
        }

        enum class Known {
            DENIED,
            NEEDS_APPROVAL,
            UNVERIFIED,
            VERIFIED,
        }

        enum class Value {
            DENIED,
            NEEDS_APPROVAL,
            UNVERIFIED,
            VERIFIED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DENIED -> Value.DENIED
                NEEDS_APPROVAL -> Value.NEEDS_APPROVAL
                UNVERIFIED -> Value.UNVERIFIED
                VERIFIED -> Value.VERIFIED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DENIED -> Known.DENIED
                NEEDS_APPROVAL -> Known.NEEDS_APPROVAL
                UNVERIFIED -> Known.UNVERIFIED
                VERIFIED -> Known.VERIFIED
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown VerificationStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VerificationStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Counterparty && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && discardedAt == other.discardedAt && name == other.name && accounts == other.accounts && email == other.email && legalEntityId == other.legalEntityId && metadata == other.metadata && sendRemittanceAdvice == other.sendRemittanceAdvice && verificationStatus == other.verificationStatus && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, name, accounts, email, legalEntityId, metadata, sendRemittanceAdvice, verificationStatus, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Counterparty{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, name=$name, accounts=$accounts, email=$email, legalEntityId=$legalEntityId, metadata=$metadata, sendRemittanceAdvice=$sendRemittanceAdvice, verificationStatus=$verificationStatus, additionalProperties=$additionalProperties}"
}
