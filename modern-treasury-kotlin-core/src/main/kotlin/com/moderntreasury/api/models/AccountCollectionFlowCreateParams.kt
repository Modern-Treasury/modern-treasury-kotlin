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
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Objects

/** create account_collection_flow */
class AccountCollectionFlowCreateParams
constructor(
    private val body: AccountCollectionFlowCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Required. */
    fun counterpartyId(): String = body.counterpartyId()

    fun paymentTypes(): List<String> = body.paymentTypes()

    fun receivingCountries(): List<ReceivingCountry>? = body.receivingCountries()

    /** Required. */
    fun _counterpartyId(): JsonField<String> = body._counterpartyId()

    fun _paymentTypes(): JsonField<List<String>> = body._paymentTypes()

    fun _receivingCountries(): JsonField<List<ReceivingCountry>> = body._receivingCountries()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): AccountCollectionFlowCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class AccountCollectionFlowCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        private val counterpartyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_types")
        @ExcludeMissing
        private val paymentTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("receiving_countries")
        @ExcludeMissing
        private val receivingCountries: JsonField<List<ReceivingCountry>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Required. */
        fun counterpartyId(): String = counterpartyId.getRequired("counterparty_id")

        fun paymentTypes(): List<String> = paymentTypes.getRequired("payment_types")

        fun receivingCountries(): List<ReceivingCountry>? =
            receivingCountries.getNullable("receiving_countries")

        /** Required. */
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        fun _counterpartyId(): JsonField<String> = counterpartyId

        @JsonProperty("payment_types")
        @ExcludeMissing
        fun _paymentTypes(): JsonField<List<String>> = paymentTypes

        @JsonProperty("receiving_countries")
        @ExcludeMissing
        fun _receivingCountries(): JsonField<List<ReceivingCountry>> = receivingCountries

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AccountCollectionFlowCreateBody = apply {
            if (validated) {
                return@apply
            }

            counterpartyId()
            paymentTypes()
            receivingCountries()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var counterpartyId: JsonField<String>? = null
            private var paymentTypes: JsonField<MutableList<String>>? = null
            private var receivingCountries: JsonField<MutableList<ReceivingCountry>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountCollectionFlowCreateBody: AccountCollectionFlowCreateBody) =
                apply {
                    counterpartyId = accountCollectionFlowCreateBody.counterpartyId
                    paymentTypes =
                        accountCollectionFlowCreateBody.paymentTypes.map { it.toMutableList() }
                    receivingCountries =
                        accountCollectionFlowCreateBody.receivingCountries.map {
                            it.toMutableList()
                        }
                    additionalProperties =
                        accountCollectionFlowCreateBody.additionalProperties.toMutableMap()
                }

            /** Required. */
            fun counterpartyId(counterpartyId: String) =
                counterpartyId(JsonField.of(counterpartyId))

            /** Required. */
            fun counterpartyId(counterpartyId: JsonField<String>) = apply {
                this.counterpartyId = counterpartyId
            }

            fun paymentTypes(paymentTypes: List<String>) = paymentTypes(JsonField.of(paymentTypes))

            fun paymentTypes(paymentTypes: JsonField<List<String>>) = apply {
                this.paymentTypes = paymentTypes.map { it.toMutableList() }
            }

            fun addPaymentType(paymentType: String) = apply {
                paymentTypes =
                    (paymentTypes ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(paymentType)
                    }
            }

            fun receivingCountries(receivingCountries: List<ReceivingCountry>) =
                receivingCountries(JsonField.of(receivingCountries))

            fun receivingCountries(receivingCountries: JsonField<List<ReceivingCountry>>) = apply {
                this.receivingCountries = receivingCountries.map { it.toMutableList() }
            }

            fun addReceivingCountry(receivingCountry: ReceivingCountry) = apply {
                receivingCountries =
                    (receivingCountries ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(receivingCountry)
                    }
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

            fun build(): AccountCollectionFlowCreateBody =
                AccountCollectionFlowCreateBody(
                    checkRequired("counterpartyId", counterpartyId),
                    checkRequired("paymentTypes", paymentTypes).map { it.toImmutable() },
                    (receivingCountries ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountCollectionFlowCreateBody && counterpartyId == other.counterpartyId && paymentTypes == other.paymentTypes && receivingCountries == other.receivingCountries && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(counterpartyId, paymentTypes, receivingCountries, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountCollectionFlowCreateBody{counterpartyId=$counterpartyId, paymentTypes=$paymentTypes, receivingCountries=$receivingCountries, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: AccountCollectionFlowCreateBody.Builder =
            AccountCollectionFlowCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(accountCollectionFlowCreateParams: AccountCollectionFlowCreateParams) =
            apply {
                body = accountCollectionFlowCreateParams.body.toBuilder()
                additionalHeaders = accountCollectionFlowCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    accountCollectionFlowCreateParams.additionalQueryParams.toBuilder()
            }

        /** Required. */
        fun counterpartyId(counterpartyId: String) = apply { body.counterpartyId(counterpartyId) }

        /** Required. */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            body.counterpartyId(counterpartyId)
        }

        fun paymentTypes(paymentTypes: List<String>) = apply { body.paymentTypes(paymentTypes) }

        fun paymentTypes(paymentTypes: JsonField<List<String>>) = apply {
            body.paymentTypes(paymentTypes)
        }

        fun addPaymentType(paymentType: String) = apply { body.addPaymentType(paymentType) }

        fun receivingCountries(receivingCountries: List<ReceivingCountry>) = apply {
            body.receivingCountries(receivingCountries)
        }

        fun receivingCountries(receivingCountries: JsonField<List<ReceivingCountry>>) = apply {
            body.receivingCountries(receivingCountries)
        }

        fun addReceivingCountry(receivingCountry: ReceivingCountry) = apply {
            body.addReceivingCountry(receivingCountry)
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

        fun build(): AccountCollectionFlowCreateParams =
            AccountCollectionFlowCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class ReceivingCountry
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val USA = of("USA")

            val AUS = of("AUS")

            val BEL = of("BEL")

            val CAN = of("CAN")

            val CHL = of("CHL")

            val CHN = of("CHN")

            val COL = of("COL")

            val FRA = of("FRA")

            val DEU = of("DEU")

            val HKG = of("HKG")

            val IND = of("IND")

            val IRL = of("IRL")

            val ITA = of("ITA")

            val MEX = of("MEX")

            val NLD = of("NLD")

            val PER = of("PER")

            val ESP = of("ESP")

            val GBR = of("GBR")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReceivingCountry && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountCollectionFlowCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountCollectionFlowCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
