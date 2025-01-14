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
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.util.Objects

/** Updates a given counterparty with new information. */
class CounterpartyUpdateParams
constructor(
    private val id: String,
    private val body: CounterpartyUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun id(): String = id

    /** A new email for the counterparty. */
    fun email(): String? = body.email()

    /** The id of the legal entity. */
    fun legalEntityId(): String? = body.legalEntityId()

    /**
     * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
     * string or `null` as the value.
     */
    fun metadata(): Metadata? = body.metadata()

    /** A new name for the counterparty. Will only update if passed. */
    fun name(): String? = body.name()

    /**
     * If this is `true`, Modern Treasury will send an email to the counterparty whenever an
     * associated payment order is sent to the bank.
     */
    fun sendRemittanceAdvice(): Boolean? = body.sendRemittanceAdvice()

    /** Either a valid SSN or EIN. */
    fun taxpayerIdentifier(): String? = body.taxpayerIdentifier()

    /** A new email for the counterparty. */
    fun _email(): JsonField<String> = body._email()

    /** The id of the legal entity. */
    fun _legalEntityId(): JsonField<String> = body._legalEntityId()

    /**
     * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
     * string or `null` as the value.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /** A new name for the counterparty. Will only update if passed. */
    fun _name(): JsonField<String> = body._name()

    /**
     * If this is `true`, Modern Treasury will send an email to the counterparty whenever an
     * associated payment order is sent to the bank.
     */
    fun _sendRemittanceAdvice(): JsonField<Boolean> = body._sendRemittanceAdvice()

    /** Either a valid SSN or EIN. */
    fun _taxpayerIdentifier(): JsonField<String> = body._taxpayerIdentifier()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): CounterpartyUpdateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class CounterpartyUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("legal_entity_id")
        @ExcludeMissing
        private val legalEntityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("send_remittance_advice")
        @ExcludeMissing
        private val sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("taxpayer_identifier")
        @ExcludeMissing
        private val taxpayerIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A new email for the counterparty. */
        fun email(): String? = email.getNullable("email")

        /** The id of the legal entity. */
        fun legalEntityId(): String? = legalEntityId.getNullable("legal_entity_id")

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /** A new name for the counterparty. Will only update if passed. */
        fun name(): String? = name.getNullable("name")

        /**
         * If this is `true`, Modern Treasury will send an email to the counterparty whenever an
         * associated payment order is sent to the bank.
         */
        fun sendRemittanceAdvice(): Boolean? =
            sendRemittanceAdvice.getNullable("send_remittance_advice")

        /** Either a valid SSN or EIN. */
        fun taxpayerIdentifier(): String? = taxpayerIdentifier.getNullable("taxpayer_identifier")

        /** A new email for the counterparty. */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /** The id of the legal entity. */
        @JsonProperty("legal_entity_id")
        @ExcludeMissing
        fun _legalEntityId(): JsonField<String> = legalEntityId

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /** A new name for the counterparty. Will only update if passed. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * If this is `true`, Modern Treasury will send an email to the counterparty whenever an
         * associated payment order is sent to the bank.
         */
        @JsonProperty("send_remittance_advice")
        @ExcludeMissing
        fun _sendRemittanceAdvice(): JsonField<Boolean> = sendRemittanceAdvice

        /** Either a valid SSN or EIN. */
        @JsonProperty("taxpayer_identifier")
        @ExcludeMissing
        fun _taxpayerIdentifier(): JsonField<String> = taxpayerIdentifier

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CounterpartyUpdateBody = apply {
            if (validated) {
                return@apply
            }

            email()
            legalEntityId()
            metadata()?.validate()
            name()
            sendRemittanceAdvice()
            taxpayerIdentifier()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var email: JsonField<String> = JsonMissing.of()
            private var legalEntityId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of()
            private var taxpayerIdentifier: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(counterpartyUpdateBody: CounterpartyUpdateBody) = apply {
                email = counterpartyUpdateBody.email
                legalEntityId = counterpartyUpdateBody.legalEntityId
                metadata = counterpartyUpdateBody.metadata
                name = counterpartyUpdateBody.name
                sendRemittanceAdvice = counterpartyUpdateBody.sendRemittanceAdvice
                taxpayerIdentifier = counterpartyUpdateBody.taxpayerIdentifier
                additionalProperties = counterpartyUpdateBody.additionalProperties.toMutableMap()
            }

            /** A new email for the counterparty. */
            fun email(email: String) = email(JsonField.of(email))

            /** A new email for the counterparty. */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** The id of the legal entity. */
            fun legalEntityId(legalEntityId: String?) =
                legalEntityId(JsonField.ofNullable(legalEntityId))

            /** The id of the legal entity. */
            fun legalEntityId(legalEntityId: JsonField<String>) = apply {
                this.legalEntityId = legalEntityId
            }

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** A new name for the counterparty. Will only update if passed. */
            fun name(name: String) = name(JsonField.of(name))

            /** A new name for the counterparty. Will only update if passed. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * If this is `true`, Modern Treasury will send an email to the counterparty whenever an
             * associated payment order is sent to the bank.
             */
            fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
                sendRemittanceAdvice(JsonField.of(sendRemittanceAdvice))

            /**
             * If this is `true`, Modern Treasury will send an email to the counterparty whenever an
             * associated payment order is sent to the bank.
             */
            fun sendRemittanceAdvice(sendRemittanceAdvice: JsonField<Boolean>) = apply {
                this.sendRemittanceAdvice = sendRemittanceAdvice
            }

            /** Either a valid SSN or EIN. */
            fun taxpayerIdentifier(taxpayerIdentifier: String) =
                taxpayerIdentifier(JsonField.of(taxpayerIdentifier))

            /** Either a valid SSN or EIN. */
            fun taxpayerIdentifier(taxpayerIdentifier: JsonField<String>) = apply {
                this.taxpayerIdentifier = taxpayerIdentifier
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

            fun build(): CounterpartyUpdateBody =
                CounterpartyUpdateBody(
                    email,
                    legalEntityId,
                    metadata,
                    name,
                    sendRemittanceAdvice,
                    taxpayerIdentifier,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CounterpartyUpdateBody && email == other.email && legalEntityId == other.legalEntityId && metadata == other.metadata && name == other.name && sendRemittanceAdvice == other.sendRemittanceAdvice && taxpayerIdentifier == other.taxpayerIdentifier && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(email, legalEntityId, metadata, name, sendRemittanceAdvice, taxpayerIdentifier, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CounterpartyUpdateBody{email=$email, legalEntityId=$legalEntityId, metadata=$metadata, name=$name, sendRemittanceAdvice=$sendRemittanceAdvice, taxpayerIdentifier=$taxpayerIdentifier, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var body: CounterpartyUpdateBody.Builder = CounterpartyUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(counterpartyUpdateParams: CounterpartyUpdateParams) = apply {
            id = counterpartyUpdateParams.id
            body = counterpartyUpdateParams.body.toBuilder()
            additionalHeaders = counterpartyUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = counterpartyUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        /** A new email for the counterparty. */
        fun email(email: String) = apply { body.email(email) }

        /** A new email for the counterparty. */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        /** The id of the legal entity. */
        fun legalEntityId(legalEntityId: String?) = apply { body.legalEntityId(legalEntityId) }

        /** The id of the legal entity. */
        fun legalEntityId(legalEntityId: JsonField<String>) = apply {
            body.legalEntityId(legalEntityId)
        }

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** A new name for the counterparty. Will only update if passed. */
        fun name(name: String) = apply { body.name(name) }

        /** A new name for the counterparty. Will only update if passed. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * If this is `true`, Modern Treasury will send an email to the counterparty whenever an
         * associated payment order is sent to the bank.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) = apply {
            body.sendRemittanceAdvice(sendRemittanceAdvice)
        }

        /**
         * If this is `true`, Modern Treasury will send an email to the counterparty whenever an
         * associated payment order is sent to the bank.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: JsonField<Boolean>) = apply {
            body.sendRemittanceAdvice(sendRemittanceAdvice)
        }

        /** Either a valid SSN or EIN. */
        fun taxpayerIdentifier(taxpayerIdentifier: String) = apply {
            body.taxpayerIdentifier(taxpayerIdentifier)
        }

        /** Either a valid SSN or EIN. */
        fun taxpayerIdentifier(taxpayerIdentifier: JsonField<String>) = apply {
            body.taxpayerIdentifier(taxpayerIdentifier)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): CounterpartyUpdateParams =
            CounterpartyUpdateParams(
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
     * string or `null` as the value.
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

        return /* spotless:off */ other is CounterpartyUpdateParams && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CounterpartyUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
