// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects

class AccountCollectionFlowCreateParams
constructor(
    private val counterpartyId: String,
    private val paymentTypes: List<String>,
    private val receivingCountries: List<ReceivingCountry>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun counterpartyId(): String = counterpartyId

    fun paymentTypes(): List<String> = paymentTypes

    fun receivingCountries(): List<ReceivingCountry>? = receivingCountries

    internal fun getBody(): AccountCollectionFlowCreateBody {
        return AccountCollectionFlowCreateBody(
            counterpartyId,
            paymentTypes,
            receivingCountries,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = AccountCollectionFlowCreateBody.Builder::class)
    @NoAutoDetect
    class AccountCollectionFlowCreateBody
    internal constructor(
        private val counterpartyId: String?,
        private val paymentTypes: List<String>?,
        private val receivingCountries: List<ReceivingCountry>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Required. */
        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

        @JsonProperty("payment_types") fun paymentTypes(): List<String>? = paymentTypes

        @JsonProperty("receiving_countries")
        fun receivingCountries(): List<ReceivingCountry>? = receivingCountries

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var counterpartyId: String? = null
            private var paymentTypes: List<String>? = null
            private var receivingCountries: List<ReceivingCountry>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountCollectionFlowCreateBody: AccountCollectionFlowCreateBody) =
                apply {
                    this.counterpartyId = accountCollectionFlowCreateBody.counterpartyId
                    this.paymentTypes = accountCollectionFlowCreateBody.paymentTypes
                    this.receivingCountries = accountCollectionFlowCreateBody.receivingCountries
                    additionalProperties(accountCollectionFlowCreateBody.additionalProperties)
                }

            /** Required. */
            @JsonProperty("counterparty_id")
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            @JsonProperty("payment_types")
            fun paymentTypes(paymentTypes: List<String>) = apply {
                this.paymentTypes = paymentTypes
            }

            @JsonProperty("receiving_countries")
            fun receivingCountries(receivingCountries: List<ReceivingCountry>) = apply {
                this.receivingCountries = receivingCountries
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

            fun build(): AccountCollectionFlowCreateBody =
                AccountCollectionFlowCreateBody(
                    checkNotNull(counterpartyId) { "`counterpartyId` is required but was not set" },
                    checkNotNull(paymentTypes) { "`paymentTypes` is required but was not set" }
                        .toImmutable(),
                    receivingCountries?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountCollectionFlowCreateBody && this.counterpartyId == other.counterpartyId && this.paymentTypes == other.paymentTypes && this.receivingCountries == other.receivingCountries && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(counterpartyId, paymentTypes, receivingCountries, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AccountCollectionFlowCreateBody{counterpartyId=$counterpartyId, paymentTypes=$paymentTypes, receivingCountries=$receivingCountries, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountCollectionFlowCreateParams && this.counterpartyId == other.counterpartyId && this.paymentTypes == other.paymentTypes && this.receivingCountries == other.receivingCountries && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(counterpartyId, paymentTypes, receivingCountries, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AccountCollectionFlowCreateParams{counterpartyId=$counterpartyId, paymentTypes=$paymentTypes, receivingCountries=$receivingCountries, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var counterpartyId: String? = null
        private var paymentTypes: MutableList<String> = mutableListOf()
        private var receivingCountries: MutableList<ReceivingCountry> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountCollectionFlowCreateParams: AccountCollectionFlowCreateParams) =
            apply {
                this.counterpartyId = accountCollectionFlowCreateParams.counterpartyId
                this.paymentTypes(accountCollectionFlowCreateParams.paymentTypes)
                this.receivingCountries(
                    accountCollectionFlowCreateParams.receivingCountries ?: listOf()
                )
                additionalQueryParams(accountCollectionFlowCreateParams.additionalQueryParams)
                additionalHeaders(accountCollectionFlowCreateParams.additionalHeaders)
                additionalBodyProperties(accountCollectionFlowCreateParams.additionalBodyProperties)
            }

        /** Required. */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        fun paymentTypes(paymentTypes: List<String>) = apply {
            this.paymentTypes.clear()
            this.paymentTypes.addAll(paymentTypes)
        }

        fun addPaymentType(paymentType: String) = apply { this.paymentTypes.add(paymentType) }

        fun receivingCountries(receivingCountries: List<ReceivingCountry>) = apply {
            this.receivingCountries.clear()
            this.receivingCountries.addAll(receivingCountries)
        }

        fun addReceivingCountry(receivingCountry: ReceivingCountry) = apply {
            this.receivingCountries.add(receivingCountry)
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

        fun build(): AccountCollectionFlowCreateParams =
            AccountCollectionFlowCreateParams(
                checkNotNull(counterpartyId) { "`counterpartyId` is required but was not set" },
                checkNotNull(paymentTypes) { "`paymentTypes` is required but was not set" }
                    .toImmutable(),
                if (receivingCountries.size == 0) null else receivingCountries.toImmutable(),
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class ReceivingCountry
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReceivingCountry && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val USA = ReceivingCountry(JsonField.of("USA"))

            val AUS = ReceivingCountry(JsonField.of("AUS"))

            val BEL = ReceivingCountry(JsonField.of("BEL"))

            val CAN = ReceivingCountry(JsonField.of("CAN"))

            val CHL = ReceivingCountry(JsonField.of("CHL"))

            val CHN = ReceivingCountry(JsonField.of("CHN"))

            val COL = ReceivingCountry(JsonField.of("COL"))

            val FRA = ReceivingCountry(JsonField.of("FRA"))

            val DEU = ReceivingCountry(JsonField.of("DEU"))

            val HKG = ReceivingCountry(JsonField.of("HKG"))

            val IND = ReceivingCountry(JsonField.of("IND"))

            val IRL = ReceivingCountry(JsonField.of("IRL"))

            val ITA = ReceivingCountry(JsonField.of("ITA"))

            val MEX = ReceivingCountry(JsonField.of("MEX"))

            val NLD = ReceivingCountry(JsonField.of("NLD"))

            val PER = ReceivingCountry(JsonField.of("PER"))

            val ESP = ReceivingCountry(JsonField.of("ESP"))

            val GBR = ReceivingCountry(JsonField.of("GBR"))

            fun of(value: String) = ReceivingCountry(JsonField.of(value))
        }

        enum class Known {
            USA,
            AUS,
            BEL,
            CAN,
            CHL,
            CHN,
            COL,
            FRA,
            DEU,
            HKG,
            IND,
            IRL,
            ITA,
            MEX,
            NLD,
            PER,
            ESP,
            GBR,
        }

        enum class Value {
            USA,
            AUS,
            BEL,
            CAN,
            CHL,
            CHN,
            COL,
            FRA,
            DEU,
            HKG,
            IND,
            IRL,
            ITA,
            MEX,
            NLD,
            PER,
            ESP,
            GBR,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                USA -> Value.USA
                AUS -> Value.AUS
                BEL -> Value.BEL
                CAN -> Value.CAN
                CHL -> Value.CHL
                CHN -> Value.CHN
                COL -> Value.COL
                FRA -> Value.FRA
                DEU -> Value.DEU
                HKG -> Value.HKG
                IND -> Value.IND
                IRL -> Value.IRL
                ITA -> Value.ITA
                MEX -> Value.MEX
                NLD -> Value.NLD
                PER -> Value.PER
                ESP -> Value.ESP
                GBR -> Value.GBR
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                USA -> Known.USA
                AUS -> Known.AUS
                BEL -> Known.BEL
                CAN -> Known.CAN
                CHL -> Known.CHL
                CHN -> Known.CHN
                COL -> Known.COL
                FRA -> Known.FRA
                DEU -> Known.DEU
                HKG -> Known.HKG
                IND -> Known.IND
                IRL -> Known.IRL
                ITA -> Known.ITA
                MEX -> Known.MEX
                NLD -> Known.NLD
                PER -> Known.PER
                ESP -> Known.ESP
                GBR -> Known.GBR
                else -> throw ModernTreasuryInvalidDataException("Unknown ReceivingCountry: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
