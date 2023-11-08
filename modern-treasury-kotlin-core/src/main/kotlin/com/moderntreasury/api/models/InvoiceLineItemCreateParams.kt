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

class InvoiceLineItemCreateParams
constructor(
    private val invoiceId: String,
    private val name: String,
    private val unitAmount: Long,
    private val description: String?,
    private val direction: String?,
    private val quantity: Long?,
    private val unitAmountDecimal: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun invoiceId(): String = invoiceId

    fun name(): String = name

    fun unitAmount(): Long = unitAmount

    fun description(): String? = description

    fun direction(): String? = direction

    fun quantity(): Long? = quantity

    fun unitAmountDecimal(): String? = unitAmountDecimal

    internal fun getBody(): InvoiceLineItemCreateBody {
        return InvoiceLineItemCreateBody(
            name,
            unitAmount,
            description,
            direction,
            quantity,
            unitAmountDecimal,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> invoiceId
            else -> ""
        }
    }

    @JsonDeserialize(builder = InvoiceLineItemCreateBody.Builder::class)
    @NoAutoDetect
    class InvoiceLineItemCreateBody
    internal constructor(
        private val name: String?,
        private val unitAmount: Long?,
        private val description: String?,
        private val direction: String?,
        private val quantity: Long?,
        private val unitAmountDecimal: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The name of the line item, typically a product or SKU name. */
        @JsonProperty("name") fun name(): String? = name

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit.
         */
        @JsonProperty("unit_amount") fun unitAmount(): Long? = unitAmount

        /** An optional free-form description of the line item. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
         * increases the invoice's `total_amount` due. `credit` has the opposite intention and
         * effect.
         */
        @JsonProperty("direction") fun direction(): String? = direction

        /**
         * The number of units of a product or service that this line item is for. Must be a whole
         * number. Defaults to 1 if not provided.
         */
        @JsonProperty("quantity") fun quantity(): Long? = quantity

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
         */
        @JsonProperty("unit_amount_decimal") fun unitAmountDecimal(): String? = unitAmountDecimal

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InvoiceLineItemCreateBody &&
                this.name == other.name &&
                this.unitAmount == other.unitAmount &&
                this.description == other.description &&
                this.direction == other.direction &&
                this.quantity == other.quantity &&
                this.unitAmountDecimal == other.unitAmountDecimal &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        unitAmount,
                        description,
                        direction,
                        quantity,
                        unitAmountDecimal,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "InvoiceLineItemCreateBody{name=$name, unitAmount=$unitAmount, description=$description, direction=$direction, quantity=$quantity, unitAmountDecimal=$unitAmountDecimal, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var unitAmount: Long? = null
            private var description: String? = null
            private var direction: String? = null
            private var quantity: Long? = null
            private var unitAmountDecimal: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoiceLineItemCreateBody: InvoiceLineItemCreateBody) = apply {
                this.name = invoiceLineItemCreateBody.name
                this.unitAmount = invoiceLineItemCreateBody.unitAmount
                this.description = invoiceLineItemCreateBody.description
                this.direction = invoiceLineItemCreateBody.direction
                this.quantity = invoiceLineItemCreateBody.quantity
                this.unitAmountDecimal = invoiceLineItemCreateBody.unitAmountDecimal
                additionalProperties(invoiceLineItemCreateBody.additionalProperties)
            }

            /** The name of the line item, typically a product or SKU name. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit.
             */
            @JsonProperty("unit_amount")
            fun unitAmount(unitAmount: Long) = apply { this.unitAmount = unitAmount }

            /** An optional free-form description of the line item. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * Either `debit` or `credit`. `debit` indicates that a client owes the business money
             * and increases the invoice's `total_amount` due. `credit` has the opposite intention
             * and effect.
             */
            @JsonProperty("direction")
            fun direction(direction: String) = apply { this.direction = direction }

            /**
             * The number of units of a product or service that this line item is for. Must be a
             * whole number. Defaults to 1 if not provided.
             */
            @JsonProperty("quantity")
            fun quantity(quantity: Long) = apply { this.quantity = quantity }

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
             */
            @JsonProperty("unit_amount_decimal")
            fun unitAmountDecimal(unitAmountDecimal: String) = apply {
                this.unitAmountDecimal = unitAmountDecimal
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

            fun build(): InvoiceLineItemCreateBody =
                InvoiceLineItemCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                    description,
                    direction,
                    quantity,
                    unitAmountDecimal,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceLineItemCreateParams &&
            this.invoiceId == other.invoiceId &&
            this.name == other.name &&
            this.unitAmount == other.unitAmount &&
            this.description == other.description &&
            this.direction == other.direction &&
            this.quantity == other.quantity &&
            this.unitAmountDecimal == other.unitAmountDecimal &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            invoiceId,
            name,
            unitAmount,
            description,
            direction,
            quantity,
            unitAmountDecimal,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "InvoiceLineItemCreateParams{invoiceId=$invoiceId, name=$name, unitAmount=$unitAmount, description=$description, direction=$direction, quantity=$quantity, unitAmountDecimal=$unitAmountDecimal, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var invoiceId: String? = null
        private var name: String? = null
        private var unitAmount: Long? = null
        private var description: String? = null
        private var direction: String? = null
        private var quantity: Long? = null
        private var unitAmountDecimal: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceLineItemCreateParams: InvoiceLineItemCreateParams) = apply {
            this.invoiceId = invoiceLineItemCreateParams.invoiceId
            this.name = invoiceLineItemCreateParams.name
            this.unitAmount = invoiceLineItemCreateParams.unitAmount
            this.description = invoiceLineItemCreateParams.description
            this.direction = invoiceLineItemCreateParams.direction
            this.quantity = invoiceLineItemCreateParams.quantity
            this.unitAmountDecimal = invoiceLineItemCreateParams.unitAmountDecimal
            additionalQueryParams(invoiceLineItemCreateParams.additionalQueryParams)
            additionalHeaders(invoiceLineItemCreateParams.additionalHeaders)
            additionalBodyProperties(invoiceLineItemCreateParams.additionalBodyProperties)
        }

        fun invoiceId(invoiceId: String) = apply { this.invoiceId = invoiceId }

        /** The name of the line item, typically a product or SKU name. */
        fun name(name: String) = apply { this.name = name }

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit.
         */
        fun unitAmount(unitAmount: Long) = apply { this.unitAmount = unitAmount }

        /** An optional free-form description of the line item. */
        fun description(description: String) = apply { this.description = description }

        /**
         * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
         * increases the invoice's `total_amount` due. `credit` has the opposite intention and
         * effect.
         */
        fun direction(direction: String) = apply { this.direction = direction }

        /**
         * The number of units of a product or service that this line item is for. Must be a whole
         * number. Defaults to 1 if not provided.
         */
        fun quantity(quantity: Long) = apply { this.quantity = quantity }

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
         */
        fun unitAmountDecimal(unitAmountDecimal: String) = apply {
            this.unitAmountDecimal = unitAmountDecimal
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

        fun build(): InvoiceLineItemCreateParams =
            InvoiceLineItemCreateParams(
                checkNotNull(invoiceId) { "`invoiceId` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                description,
                direction,
                quantity,
                unitAmountDecimal,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
