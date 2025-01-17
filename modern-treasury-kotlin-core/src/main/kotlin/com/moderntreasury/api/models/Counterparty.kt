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
class Counterparty
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("accounts")
    @ExcludeMissing
    private val accounts: JsonField<List<Account>> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("email") @ExcludeMissing private val email: JsonField<String> = JsonMissing.of(),
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
    @JsonProperty("send_remittance_advice")
    @ExcludeMissing
    private val sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("verification_status")
    @ExcludeMissing
    private val verificationStatus: JsonField<VerificationStatus> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** The accounts for this counterparty. */
    fun accounts(): List<Account> = accounts.getRequired("accounts")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** The counterparty's email. */
    fun email(): String? = email.getNullable("email")

    /** The id of the legal entity. */
    fun legalEntityId(): String? = legalEntityId.getNullable("legal_entity_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** A human friendly name for this counterparty. */
    fun name(): String? = name.getNullable("name")

    fun object_(): String = object_.getRequired("object")

    /**
     * Send an email to the counterparty whenever an associated payment order is sent to the bank.
     */
    fun sendRemittanceAdvice(): Boolean = sendRemittanceAdvice.getRequired("send_remittance_advice")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The verification status of the counterparty. */
    fun verificationStatus(): VerificationStatus =
        verificationStatus.getRequired("verification_status")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The accounts for this counterparty. */
    @JsonProperty("accounts") @ExcludeMissing fun _accounts(): JsonField<List<Account>> = accounts

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /** The counterparty's email. */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /** The id of the legal entity. */
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

    /** A human friendly name for this counterparty. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Send an email to the counterparty whenever an associated payment order is sent to the bank.
     */
    @JsonProperty("send_remittance_advice")
    @ExcludeMissing
    fun _sendRemittanceAdvice(): JsonField<Boolean> = sendRemittanceAdvice

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /** The verification status of the counterparty. */
    @JsonProperty("verification_status")
    @ExcludeMissing
    fun _verificationStatus(): JsonField<VerificationStatus> = verificationStatus

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Counterparty = apply {
        if (validated) {
            return@apply
        }

        id()
        accounts().forEach { it.validate() }
        createdAt()
        discardedAt()
        email()
        legalEntityId()
        liveMode()
        metadata().validate()
        name()
        object_()
        sendRemittanceAdvice()
        updatedAt()
        verificationStatus()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var accounts: JsonField<MutableList<Account>>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var email: JsonField<String>? = null
        private var legalEntityId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var name: JsonField<String>? = null
        private var object_: JsonField<String>? = null
        private var sendRemittanceAdvice: JsonField<Boolean>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var verificationStatus: JsonField<VerificationStatus>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(counterparty: Counterparty) = apply {
            id = counterparty.id
            accounts = counterparty.accounts.map { it.toMutableList() }
            createdAt = counterparty.createdAt
            discardedAt = counterparty.discardedAt
            email = counterparty.email
            legalEntityId = counterparty.legalEntityId
            liveMode = counterparty.liveMode
            metadata = counterparty.metadata
            name = counterparty.name
            object_ = counterparty.object_
            sendRemittanceAdvice = counterparty.sendRemittanceAdvice
            updatedAt = counterparty.updatedAt
            verificationStatus = counterparty.verificationStatus
            additionalProperties = counterparty.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The accounts for this counterparty. */
        fun accounts(accounts: List<Account>) = accounts(JsonField.of(accounts))

        /** The accounts for this counterparty. */
        fun accounts(accounts: JsonField<List<Account>>) = apply {
            this.accounts = accounts.map { it.toMutableList() }
        }

        /** The accounts for this counterparty. */
        fun addAccount(account: Account) = apply {
            accounts =
                (accounts ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(account)
                }
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** The counterparty's email. */
        fun email(email: String?) = email(JsonField.ofNullable(email))

        /** The counterparty's email. */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The id of the legal entity. */
        fun legalEntityId(legalEntityId: String?) =
            legalEntityId(JsonField.ofNullable(legalEntityId))

        /** The id of the legal entity. */
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

        /** A human friendly name for this counterparty. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** A human friendly name for this counterparty. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

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

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
                checkRequired("id", id),
                checkRequired("accounts", accounts).map { it.toImmutable() },
                checkRequired("createdAt", createdAt),
                checkRequired("discardedAt", discardedAt),
                checkRequired("email", email),
                checkRequired("legalEntityId", legalEntityId),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("name", name),
                checkRequired("object_", object_),
                checkRequired("sendRemittanceAdvice", sendRemittanceAdvice),
                checkRequired("updatedAt", updatedAt),
                checkRequired("verificationStatus", verificationStatus),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Account
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_details")
        @ExcludeMissing
        private val accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of(),
        @JsonProperty("account_type")
        @ExcludeMissing
        private val accountType: JsonField<ExternalAccountType> = JsonMissing.of(),
        @JsonProperty("contact_details")
        @ExcludeMissing
        private val contactDetails: JsonField<List<ContactDetail>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("verification_source")
        @ExcludeMissing
        private val verificationSource: JsonField<VerificationSource> = JsonMissing.of(),
        @JsonProperty("verification_status")
        @ExcludeMissing
        private val verificationStatus: JsonField<VerificationStatus> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String? = id.getNullable("id")

        fun accountDetails(): List<AccountDetail>? = accountDetails.getNullable("account_details")

        /** Can be `checking`, `savings` or `other`. */
        fun accountType(): ExternalAccountType? = accountType.getNullable("account_type")

        fun contactDetails(): List<ContactDetail>? = contactDetails.getNullable("contact_details")

        fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

        fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

        /**
         * If the external account links to a ledger account in Modern Treasury, the id of the
         * ledger account will be populated here.
         */
        fun ledgerAccountId(): String? = ledgerAccountId.getNullable("ledger_account_id")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean? = liveMode.getNullable("live_mode")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        fun name(): String? = name.getNullable("name")

        fun object_(): String? = object_.getNullable("object")

        /** The address associated with the owner or `null`. */
        fun partyAddress(): Address? = partyAddress.getNullable("party_address")

        /** The legal name of the entity which owns the account. */
        fun partyName(): String? = partyName.getNullable("party_name")

        /** Either `individual` or `business`. */
        fun partyType(): PartyType? = partyType.getNullable("party_type")

        fun routingDetails(): List<RoutingDetail>? = routingDetails.getNullable("routing_details")

        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

        fun verificationSource(): VerificationSource? =
            verificationSource.getNullable("verification_source")

        fun verificationStatus(): VerificationStatus? =
            verificationStatus.getNullable("verification_status")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("account_details")
        @ExcludeMissing
        fun _accountDetails(): JsonField<List<AccountDetail>> = accountDetails

        /** Can be `checking`, `savings` or `other`. */
        @JsonProperty("account_type")
        @ExcludeMissing
        fun _accountType(): JsonField<ExternalAccountType> = accountType

        @JsonProperty("contact_details")
        @ExcludeMissing
        fun _contactDetails(): JsonField<List<ContactDetail>> = contactDetails

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

        /**
         * If the external account links to a ledger account in Modern Treasury, the id of the
         * ledger account will be populated here.
         */
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        /** The address associated with the owner or `null`. */
        @JsonProperty("party_address")
        @ExcludeMissing
        fun _partyAddress(): JsonField<Address> = partyAddress

        /** The legal name of the entity which owns the account. */
        @JsonProperty("party_name") @ExcludeMissing fun _partyName(): JsonField<String> = partyName

        /** Either `individual` or `business`. */
        @JsonProperty("party_type")
        @ExcludeMissing
        fun _partyType(): JsonField<PartyType> = partyType

        @JsonProperty("routing_details")
        @ExcludeMissing
        fun _routingDetails(): JsonField<List<RoutingDetail>> = routingDetails

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        @JsonProperty("verification_source")
        @ExcludeMissing
        fun _verificationSource(): JsonField<VerificationSource> = verificationSource

        @JsonProperty("verification_status")
        @ExcludeMissing
        fun _verificationStatus(): JsonField<VerificationStatus> = verificationStatus

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Account = apply {
            if (validated) {
                return@apply
            }

            id()
            accountDetails()?.forEach { it.validate() }
            accountType()
            contactDetails()?.forEach { it.validate() }
            createdAt()
            discardedAt()
            ledgerAccountId()
            liveMode()
            metadata()?.validate()
            name()
            object_()
            partyAddress()?.validate()
            partyName()
            partyType()
            routingDetails()?.forEach { it.validate() }
            updatedAt()
            verificationSource()
            verificationStatus()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var accountDetails: JsonField<MutableList<AccountDetail>>? = null
            private var accountType: JsonField<ExternalAccountType> = JsonMissing.of()
            private var contactDetails: JsonField<MutableList<ContactDetail>>? = null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var ledgerAccountId: JsonField<String> = JsonMissing.of()
            private var liveMode: JsonField<Boolean> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var object_: JsonField<String> = JsonMissing.of()
            private var partyAddress: JsonField<Address> = JsonMissing.of()
            private var partyName: JsonField<String> = JsonMissing.of()
            private var partyType: JsonField<PartyType> = JsonMissing.of()
            private var routingDetails: JsonField<MutableList<RoutingDetail>>? = null
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var verificationSource: JsonField<VerificationSource> = JsonMissing.of()
            private var verificationStatus: JsonField<VerificationStatus> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(account: Account) = apply {
                id = account.id
                accountDetails = account.accountDetails.map { it.toMutableList() }
                accountType = account.accountType
                contactDetails = account.contactDetails.map { it.toMutableList() }
                createdAt = account.createdAt
                discardedAt = account.discardedAt
                ledgerAccountId = account.ledgerAccountId
                liveMode = account.liveMode
                metadata = account.metadata
                name = account.name
                object_ = account.object_
                partyAddress = account.partyAddress
                partyName = account.partyName
                partyType = account.partyType
                routingDetails = account.routingDetails.map { it.toMutableList() }
                updatedAt = account.updatedAt
                verificationSource = account.verificationSource
                verificationStatus = account.verificationStatus
                additionalProperties = account.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun accountDetails(accountDetails: List<AccountDetail>) =
                accountDetails(JsonField.of(accountDetails))

            fun accountDetails(accountDetails: JsonField<List<AccountDetail>>) = apply {
                this.accountDetails = accountDetails.map { it.toMutableList() }
            }

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

            /** Can be `checking`, `savings` or `other`. */
            fun accountType(accountType: ExternalAccountType) =
                accountType(JsonField.of(accountType))

            /** Can be `checking`, `savings` or `other`. */
            fun accountType(accountType: JsonField<ExternalAccountType>) = apply {
                this.accountType = accountType
            }

            fun contactDetails(contactDetails: List<ContactDetail>) =
                contactDetails(JsonField.of(contactDetails))

            fun contactDetails(contactDetails: JsonField<List<ContactDetail>>) = apply {
                this.contactDetails = contactDetails.map { it.toMutableList() }
            }

            fun addContactDetail(contactDetail: ContactDetail) = apply {
                contactDetails =
                    (contactDetails ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(contactDetail)
                    }
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun discardedAt(discardedAt: OffsetDateTime?) =
                discardedAt(JsonField.ofNullable(discardedAt))

            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                this.discardedAt = discardedAt
            }

            /**
             * If the external account links to a ledger account in Modern Treasury, the id of the
             * ledger account will be populated here.
             */
            fun ledgerAccountId(ledgerAccountId: String?) =
                ledgerAccountId(JsonField.ofNullable(ledgerAccountId))

            /**
             * If the external account links to a ledger account in Modern Treasury, the id of the
             * ledger account will be populated here.
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
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun object_(object_: String) = object_(JsonField.of(object_))

            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /** The address associated with the owner or `null`. */
            fun partyAddress(partyAddress: Address?) =
                partyAddress(JsonField.ofNullable(partyAddress))

            /** The address associated with the owner or `null`. */
            fun partyAddress(partyAddress: JsonField<Address>) = apply {
                this.partyAddress = partyAddress
            }

            /** The legal name of the entity which owns the account. */
            fun partyName(partyName: String) = partyName(JsonField.of(partyName))

            /** The legal name of the entity which owns the account. */
            fun partyName(partyName: JsonField<String>) = apply { this.partyName = partyName }

            /** Either `individual` or `business`. */
            fun partyType(partyType: PartyType?) = partyType(JsonField.ofNullable(partyType))

            /** Either `individual` or `business`. */
            fun partyType(partyType: JsonField<PartyType>) = apply { this.partyType = partyType }

            fun routingDetails(routingDetails: List<RoutingDetail>) =
                routingDetails(JsonField.of(routingDetails))

            fun routingDetails(routingDetails: JsonField<List<RoutingDetail>>) = apply {
                this.routingDetails = routingDetails.map { it.toMutableList() }
            }

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

            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun verificationSource(verificationSource: VerificationSource?) =
                verificationSource(JsonField.ofNullable(verificationSource))

            fun verificationSource(verificationSource: JsonField<VerificationSource>) = apply {
                this.verificationSource = verificationSource
            }

            fun verificationStatus(verificationStatus: VerificationStatus) =
                verificationStatus(JsonField.of(verificationStatus))

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

            fun build(): Account =
                Account(
                    id,
                    (accountDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    accountType,
                    (contactDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    createdAt,
                    discardedAt,
                    ledgerAccountId,
                    liveMode,
                    metadata,
                    name,
                    object_,
                    partyAddress,
                    partyName,
                    partyType,
                    (routingDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    updatedAt,
                    verificationSource,
                    verificationStatus,
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
            @JsonProperty("contact_identifier")
            @ExcludeMissing
            private val contactIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contact_identifier_type")
            @ExcludeMissing
            private val contactIdentifierType: JsonField<ContactIdentifierType> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("discarded_at")
            @ExcludeMissing
            private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("live_mode")
            @ExcludeMissing
            private val liveMode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("object")
            @ExcludeMissing
            private val object_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun contactIdentifier(): String = contactIdentifier.getRequired("contact_identifier")

            fun contactIdentifierType(): ContactIdentifierType =
                contactIdentifierType.getRequired("contact_identifier_type")

            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(): Boolean = liveMode.getRequired("live_mode")

            fun object_(): String = object_.getRequired("object")

            fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("contact_identifier")
            @ExcludeMissing
            fun _contactIdentifier(): JsonField<String> = contactIdentifier

            @JsonProperty("contact_identifier_type")
            @ExcludeMissing
            fun _contactIdentifierType(): JsonField<ContactIdentifierType> = contactIdentifierType

            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            @JsonProperty("discarded_at")
            @ExcludeMissing
            fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            @JsonProperty("live_mode")
            @ExcludeMissing
            fun _liveMode(): JsonField<Boolean> = liveMode

            @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ContactDetail = apply {
                if (validated) {
                    return@apply
                }

                id()
                contactIdentifier()
                contactIdentifierType()
                createdAt()
                discardedAt()
                liveMode()
                object_()
                updatedAt()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String>? = null
                private var contactIdentifier: JsonField<String>? = null
                private var contactIdentifierType: JsonField<ContactIdentifierType>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var discardedAt: JsonField<OffsetDateTime>? = null
                private var liveMode: JsonField<Boolean>? = null
                private var object_: JsonField<String>? = null
                private var updatedAt: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(contactDetail: ContactDetail) = apply {
                    id = contactDetail.id
                    contactIdentifier = contactDetail.contactIdentifier
                    contactIdentifierType = contactDetail.contactIdentifierType
                    createdAt = contactDetail.createdAt
                    discardedAt = contactDetail.discardedAt
                    liveMode = contactDetail.liveMode
                    object_ = contactDetail.object_
                    updatedAt = contactDetail.updatedAt
                    additionalProperties = contactDetail.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun discardedAt(discardedAt: OffsetDateTime?) =
                    discardedAt(JsonField.ofNullable(discardedAt))

                fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                    this.discardedAt = discardedAt
                }

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

                fun object_(object_: String) = object_(JsonField.of(object_))

                fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

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
                        checkRequired("id", id),
                        checkRequired("contactIdentifier", contactIdentifier),
                        checkRequired("contactIdentifierType", contactIdentifierType),
                        checkRequired("createdAt", createdAt),
                        checkRequired("discardedAt", discardedAt),
                        checkRequired("liveMode", liveMode),
                        checkRequired("object_", object_),
                        checkRequired("updatedAt", updatedAt),
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

                return /* spotless:off */ other is ContactDetail && id == other.id && contactIdentifier == other.contactIdentifier && contactIdentifierType == other.contactIdentifierType && createdAt == other.createdAt && discardedAt == other.discardedAt && liveMode == other.liveMode && object_ == other.object_ && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, contactIdentifier, contactIdentifierType, createdAt, discardedAt, liveMode, object_, updatedAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ContactDetail{id=$id, contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, createdAt=$createdAt, discardedAt=$discardedAt, liveMode=$liveMode, object_=$object_, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
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
            @JsonProperty("live_mode")
            @ExcludeMissing
            fun _liveMode(): JsonField<Boolean> = liveMode

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
                 * This field will be true if this object exists in the live environment or false if
                 * it exists in the test environment.
                 */
                fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

                /**
                 * This field will be true if this object exists in the live environment or false if
                 * it exists in the test environment.
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
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

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

        /** Either `individual` or `business`. */
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

            return /* spotless:off */ other is Account && id == other.id && accountDetails == other.accountDetails && accountType == other.accountType && contactDetails == other.contactDetails && createdAt == other.createdAt && discardedAt == other.discardedAt && ledgerAccountId == other.ledgerAccountId && liveMode == other.liveMode && metadata == other.metadata && name == other.name && object_ == other.object_ && partyAddress == other.partyAddress && partyName == other.partyName && partyType == other.partyType && routingDetails == other.routingDetails && updatedAt == other.updatedAt && verificationSource == other.verificationSource && verificationStatus == other.verificationStatus && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, accountDetails, accountType, contactDetails, createdAt, discardedAt, ledgerAccountId, liveMode, metadata, name, object_, partyAddress, partyName, partyType, routingDetails, updatedAt, verificationSource, verificationStatus, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Account{id=$id, accountDetails=$accountDetails, accountType=$accountType, contactDetails=$contactDetails, createdAt=$createdAt, discardedAt=$discardedAt, ledgerAccountId=$ledgerAccountId, liveMode=$liveMode, metadata=$metadata, name=$name, object_=$object_, partyAddress=$partyAddress, partyName=$partyName, partyType=$partyType, routingDetails=$routingDetails, updatedAt=$updatedAt, verificationSource=$verificationSource, verificationStatus=$verificationStatus, additionalProperties=$additionalProperties}"
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

    /** The verification status of the counterparty. */
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

        return /* spotless:off */ other is Counterparty && id == other.id && accounts == other.accounts && createdAt == other.createdAt && discardedAt == other.discardedAt && email == other.email && legalEntityId == other.legalEntityId && liveMode == other.liveMode && metadata == other.metadata && name == other.name && object_ == other.object_ && sendRemittanceAdvice == other.sendRemittanceAdvice && updatedAt == other.updatedAt && verificationStatus == other.verificationStatus && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accounts, createdAt, discardedAt, email, legalEntityId, liveMode, metadata, name, object_, sendRemittanceAdvice, updatedAt, verificationStatus, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Counterparty{id=$id, accounts=$accounts, createdAt=$createdAt, discardedAt=$discardedAt, email=$email, legalEntityId=$legalEntityId, liveMode=$liveMode, metadata=$metadata, name=$name, object_=$object_, sendRemittanceAdvice=$sendRemittanceAdvice, updatedAt=$updatedAt, verificationStatus=$verificationStatus, additionalProperties=$additionalProperties}"
}
