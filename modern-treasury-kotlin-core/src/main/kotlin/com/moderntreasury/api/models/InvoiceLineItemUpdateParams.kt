// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.util.Objects

class InvoiceLineItemUpdateParams
constructor(
    private val invoiceId: String,
    private val id: String,
    private val body: InvoiceLineItemUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun invoiceId(): String = invoiceId

    fun id(): String = id

    /** An optional free-form description of the line item. */
    fun description(): String? = body.description()

    /**
     * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
     * increases the invoice's `total_amount` due. `credit` has the opposite intention and effect.
     */
    fun direction(): String? = body.direction()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata? = body.metadata()

    /** The name of the line item, typically a product or SKU name. */
    fun name(): String? = body.name()

    /**
     * The number of units of a product or service that this line item is for. Must be a whole
     * number. Defaults to 1 if not provided.
     */
    fun quantity(): Long? = body.quantity()

    /**
     * The cost per unit of the product or service that this line item is for, specified in the
     * invoice currency's smallest unit.
     */
    fun unitAmount(): Long? = body.unitAmount()

    /**
     * The cost per unit of the product or service that this line item is for, specified in the
     * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
     */
    fun unitAmountDecimal(): String? = body.unitAmountDecimal()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): InvoiceLineItemUpdateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> invoiceId
            1 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class InvoiceLineItemUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("description") private val description: String?,
        @JsonProperty("direction") private val direction: String?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("name") private val name: String?,
        @JsonProperty("quantity") private val quantity: Long?,
        @JsonProperty("unit_amount") private val unitAmount: Long?,
        @JsonProperty("unit_amount_decimal") private val unitAmountDecimal: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** An optional free-form description of the line item. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
         * increases the invoice's `total_amount` due. `credit` has the opposite intention and
         * effect.
         */
        @JsonProperty("direction") fun direction(): String? = direction

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** The name of the line item, typically a product or SKU name. */
        @JsonProperty("name") fun name(): String? = name

        /**
         * The number of units of a product or service that this line item is for. Must be a whole
         * number. Defaults to 1 if not provided.
         */
        @JsonProperty("quantity") fun quantity(): Long? = quantity

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit.
         */
        @JsonProperty("unit_amount") fun unitAmount(): Long? = unitAmount

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
         */
        @JsonProperty("unit_amount_decimal") fun unitAmountDecimal(): String? = unitAmountDecimal

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var direction: String? = null
            private var metadata: Metadata? = null
            private var name: String? = null
            private var quantity: Long? = null
            private var unitAmount: Long? = null
            private var unitAmountDecimal: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoiceLineItemUpdateBody: InvoiceLineItemUpdateBody) = apply {
                description = invoiceLineItemUpdateBody.description
                direction = invoiceLineItemUpdateBody.direction
                metadata = invoiceLineItemUpdateBody.metadata
                name = invoiceLineItemUpdateBody.name
                quantity = invoiceLineItemUpdateBody.quantity
                unitAmount = invoiceLineItemUpdateBody.unitAmount
                unitAmountDecimal = invoiceLineItemUpdateBody.unitAmountDecimal
                additionalProperties = invoiceLineItemUpdateBody.additionalProperties.toMutableMap()
            }

            /** An optional free-form description of the line item. */
            fun description(description: String) = apply { this.description = description }

            /**
             * Either `debit` or `credit`. `debit` indicates that a client owes the business money
             * and increases the invoice's `total_amount` due. `credit` has the opposite intention
             * and effect.
             */
            fun direction(direction: String) = apply { this.direction = direction }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** The name of the line item, typically a product or SKU name. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The number of units of a product or service that this line item is for. Must be a
             * whole number. Defaults to 1 if not provided.
             */
            fun quantity(quantity: Long) = apply { this.quantity = quantity }

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit.
             */
            fun unitAmount(unitAmount: Long) = apply { this.unitAmount = unitAmount }

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
             */
            fun unitAmountDecimal(unitAmountDecimal: String) = apply {
                this.unitAmountDecimal = unitAmountDecimal
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

            fun build(): InvoiceLineItemUpdateBody =
                InvoiceLineItemUpdateBody(
                    description,
                    direction,
                    metadata,
                    name,
                    quantity,
                    unitAmount,
                    unitAmountDecimal,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceLineItemUpdateBody && description == other.description && direction == other.direction && metadata == other.metadata && name == other.name && quantity == other.quantity && unitAmount == other.unitAmount && unitAmountDecimal == other.unitAmountDecimal && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, direction, metadata, name, quantity, unitAmount, unitAmountDecimal, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceLineItemUpdateBody{description=$description, direction=$direction, metadata=$metadata, name=$name, quantity=$quantity, unitAmount=$unitAmount, unitAmountDecimal=$unitAmountDecimal, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var invoiceId: String? = null
        private var id: String? = null
        private var body: InvoiceLineItemUpdateBody.Builder = InvoiceLineItemUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(invoiceLineItemUpdateParams: InvoiceLineItemUpdateParams) = apply {
            invoiceId = invoiceLineItemUpdateParams.invoiceId
            id = invoiceLineItemUpdateParams.id
            body = invoiceLineItemUpdateParams.body.toBuilder()
            additionalHeaders = invoiceLineItemUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceLineItemUpdateParams.additionalQueryParams.toBuilder()
        }

        fun invoiceId(invoiceId: String) = apply { this.invoiceId = invoiceId }

        fun id(id: String) = apply { this.id = id }

        /** An optional free-form description of the line item. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
         * increases the invoice's `total_amount` due. `credit` has the opposite intention and
         * effect.
         */
        fun direction(direction: String) = apply { body.direction(direction) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /** The name of the line item, typically a product or SKU name. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * The number of units of a product or service that this line item is for. Must be a whole
         * number. Defaults to 1 if not provided.
         */
        fun quantity(quantity: Long) = apply { body.quantity(quantity) }

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit.
         */
        fun unitAmount(unitAmount: Long) = apply { body.unitAmount(unitAmount) }

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
         */
        fun unitAmountDecimal(unitAmountDecimal: String) = apply {
            body.unitAmountDecimal(unitAmountDecimal)
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

        fun build(): InvoiceLineItemUpdateParams =
            InvoiceLineItemUpdateParams(
                checkNotNull(invoiceId) { "`invoiceId` is required but was not set" },
                checkNotNull(id) { "`id` is required but was not set" },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

        return /* spotless:off */ other is InvoiceLineItemUpdateParams && invoiceId == other.invoiceId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(invoiceId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InvoiceLineItemUpdateParams{invoiceId=$invoiceId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
