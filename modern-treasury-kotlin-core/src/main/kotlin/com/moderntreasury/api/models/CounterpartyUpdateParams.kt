// File generated from our OpenAPI spec by Stainless.

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

class CounterpartyUpdateParams
constructor(
    private val id: String,
    private val email: String?,
    private val legalEntityId: String?,
    private val metadata: Metadata?,
    private val name: String?,
    private val sendRemittanceAdvice: Boolean?,
    private val taxpayerIdentifier: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun email(): String? = email

    fun legalEntityId(): String? = legalEntityId

    fun metadata(): Metadata? = metadata

    fun name(): String? = name

    fun sendRemittanceAdvice(): Boolean? = sendRemittanceAdvice

    fun taxpayerIdentifier(): String? = taxpayerIdentifier

    internal fun getBody(): CounterpartyUpdateBody {
        return CounterpartyUpdateBody(
            email,
            legalEntityId,
            metadata,
            name,
            sendRemittanceAdvice,
            taxpayerIdentifier,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @JsonDeserialize(builder = CounterpartyUpdateBody.Builder::class)
    @NoAutoDetect
    class CounterpartyUpdateBody
    internal constructor(
        private val email: String?,
        private val legalEntityId: String?,
        private val metadata: Metadata?,
        private val name: String?,
        private val sendRemittanceAdvice: Boolean?,
        private val taxpayerIdentifier: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** A new email for the counterparty. */
        @JsonProperty("email") fun email(): String? = email

        /** The id of the legal entity. */
        @JsonProperty("legal_entity_id") fun legalEntityId(): String? = legalEntityId

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** A new name for the counterparty. Will only update if passed. */
        @JsonProperty("name") fun name(): String? = name

        /**
         * If this is `true`, Modern Treasury will send an email to the counterparty whenever an
         * associated payment order is sent to the bank.
         */
        @JsonProperty("send_remittance_advice")
        fun sendRemittanceAdvice(): Boolean? = sendRemittanceAdvice

        /** Either a valid SSN or EIN. */
        @JsonProperty("taxpayer_identifier") fun taxpayerIdentifier(): String? = taxpayerIdentifier

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var email: String? = null
            private var legalEntityId: String? = null
            private var metadata: Metadata? = null
            private var name: String? = null
            private var sendRemittanceAdvice: Boolean? = null
            private var taxpayerIdentifier: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(counterpartyUpdateBody: CounterpartyUpdateBody) = apply {
                this.email = counterpartyUpdateBody.email
                this.legalEntityId = counterpartyUpdateBody.legalEntityId
                this.metadata = counterpartyUpdateBody.metadata
                this.name = counterpartyUpdateBody.name
                this.sendRemittanceAdvice = counterpartyUpdateBody.sendRemittanceAdvice
                this.taxpayerIdentifier = counterpartyUpdateBody.taxpayerIdentifier
                additionalProperties(counterpartyUpdateBody.additionalProperties)
            }

            /** A new email for the counterparty. */
            @JsonProperty("email") fun email(email: String) = apply { this.email = email }

            /** The id of the legal entity. */
            @JsonProperty("legal_entity_id")
            fun legalEntityId(legalEntityId: String) = apply { this.legalEntityId = legalEntityId }

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** A new name for the counterparty. Will only update if passed. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * If this is `true`, Modern Treasury will send an email to the counterparty whenever an
             * associated payment order is sent to the bank.
             */
            @JsonProperty("send_remittance_advice")
            fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) = apply {
                this.sendRemittanceAdvice = sendRemittanceAdvice
            }

            /** Either a valid SSN or EIN. */
            @JsonProperty("taxpayer_identifier")
            fun taxpayerIdentifier(taxpayerIdentifier: String) = apply {
                this.taxpayerIdentifier = taxpayerIdentifier
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

            fun build(): CounterpartyUpdateBody =
                CounterpartyUpdateBody(
                    email,
                    legalEntityId,
                    metadata,
                    name,
                    sendRemittanceAdvice,
                    taxpayerIdentifier,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CounterpartyUpdateBody && this.email == other.email && this.legalEntityId == other.legalEntityId && this.metadata == other.metadata && this.name == other.name && this.sendRemittanceAdvice == other.sendRemittanceAdvice && this.taxpayerIdentifier == other.taxpayerIdentifier && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(email, legalEntityId, metadata, name, sendRemittanceAdvice, taxpayerIdentifier, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CounterpartyUpdateBody{email=$email, legalEntityId=$legalEntityId, metadata=$metadata, name=$name, sendRemittanceAdvice=$sendRemittanceAdvice, taxpayerIdentifier=$taxpayerIdentifier, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterpartyUpdateParams && this.id == other.id && this.email == other.email && this.legalEntityId == other.legalEntityId && this.metadata == other.metadata && this.name == other.name && this.sendRemittanceAdvice == other.sendRemittanceAdvice && this.taxpayerIdentifier == other.taxpayerIdentifier && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(id, email, legalEntityId, metadata, name, sendRemittanceAdvice, taxpayerIdentifier, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CounterpartyUpdateParams{id=$id, email=$email, legalEntityId=$legalEntityId, metadata=$metadata, name=$name, sendRemittanceAdvice=$sendRemittanceAdvice, taxpayerIdentifier=$taxpayerIdentifier, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var email: String? = null
        private var legalEntityId: String? = null
        private var metadata: Metadata? = null
        private var name: String? = null
        private var sendRemittanceAdvice: Boolean? = null
        private var taxpayerIdentifier: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(counterpartyUpdateParams: CounterpartyUpdateParams) = apply {
            this.id = counterpartyUpdateParams.id
            this.email = counterpartyUpdateParams.email
            this.legalEntityId = counterpartyUpdateParams.legalEntityId
            this.metadata = counterpartyUpdateParams.metadata
            this.name = counterpartyUpdateParams.name
            this.sendRemittanceAdvice = counterpartyUpdateParams.sendRemittanceAdvice
            this.taxpayerIdentifier = counterpartyUpdateParams.taxpayerIdentifier
            additionalQueryParams(counterpartyUpdateParams.additionalQueryParams)
            additionalHeaders(counterpartyUpdateParams.additionalHeaders)
            additionalBodyProperties(counterpartyUpdateParams.additionalBodyProperties)
        }

        fun id(id: String) = apply { this.id = id }

        /** A new email for the counterparty. */
        fun email(email: String) = apply { this.email = email }

        /** The id of the legal entity. */
        fun legalEntityId(legalEntityId: String) = apply { this.legalEntityId = legalEntityId }

        /**
         * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
         * string or `null` as the value.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** A new name for the counterparty. Will only update if passed. */
        fun name(name: String) = apply { this.name = name }

        /**
         * If this is `true`, Modern Treasury will send an email to the counterparty whenever an
         * associated payment order is sent to the bank.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) = apply {
            this.sendRemittanceAdvice = sendRemittanceAdvice
        }

        /** Either a valid SSN or EIN. */
        fun taxpayerIdentifier(taxpayerIdentifier: String) = apply {
            this.taxpayerIdentifier = taxpayerIdentifier
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

        fun build(): CounterpartyUpdateParams =
            CounterpartyUpdateParams(
                checkNotNull(id) { "`id` is required but was not set" },
                email,
                legalEntityId,
                metadata,
                name,
                sendRemittanceAdvice,
                taxpayerIdentifier,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /**
     * Additional data in the form of key-value pairs. Pairs can be removed by passing an empty
     * string or `null` as the value.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }
}
