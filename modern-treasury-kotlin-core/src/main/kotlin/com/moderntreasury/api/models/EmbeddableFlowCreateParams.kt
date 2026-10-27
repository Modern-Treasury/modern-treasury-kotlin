// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.BaseDeserializer
import com.moderntreasury.api.core.BaseSerializer
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.allMaxBy
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.getOrThrow
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.Objects

/** create embeddable_flow */
class EmbeddableFlowCreateParams
private constructor(
    private val body: EmbeddableFlowCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The parameters for the selected template's flow.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun options(): Options = body.options()

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun template(): Template = body.template()

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _options(): JsonField<Options> = body._options()

    /**
     * Returns the raw JSON value of [template].
     *
     * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _template(): JsonField<Template> = body._template()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmbeddableFlowCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .options()
         * .template()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EmbeddableFlowCreateParams]. */
    class Builder internal constructor() {

        private var body: EmbeddableFlowCreateRequest.Builder =
            EmbeddableFlowCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(embeddableFlowCreateParams: EmbeddableFlowCreateParams) = apply {
            body = embeddableFlowCreateParams.body.toBuilder()
            additionalHeaders = embeddableFlowCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = embeddableFlowCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [options]
         * - [template]
         */
        fun body(body: EmbeddableFlowCreateRequest) = apply { this.body = body.toBuilder() }

        /** The parameters for the selected template's flow. */
        fun options(options: Options) = apply { body.options(options) }

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed [Options] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun options(options: JsonField<Options>) = apply { body.options(options) }

        /**
         * Alias for calling [options] with
         * `Options.ofAccountCollectionFlowCreateRequest(accountCollectionFlowCreateRequest)`.
         */
        fun options(accountCollectionFlowCreateRequest: AccountCollectionFlowCreateRequest) =
            apply {
                body.options(accountCollectionFlowCreateRequest)
            }

        /**
         * Alias for calling [options] with
         * `Options.ofPaymentFlowCreateRequest(paymentFlowCreateRequest)`.
         */
        fun options(paymentFlowCreateRequest: PaymentFlowCreateRequest) = apply {
            body.options(paymentFlowCreateRequest)
        }

        /** Alias for calling [options] with `Options.ofType(type)`. */
        fun options(type: Options.Type) = apply { body.options(type) }

        fun template(template: Template) = apply { body.template(template) }

        /**
         * Sets [Builder.template] to an arbitrary JSON value.
         *
         * You should usually call [Builder.template] with a well-typed [Template] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun template(template: JsonField<Template>) = apply { body.template(template) }

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

        /**
         * Returns an immutable instance of [EmbeddableFlowCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .options()
         * .template()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmbeddableFlowCreateParams =
            EmbeddableFlowCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): EmbeddableFlowCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class EmbeddableFlowCreateRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val options: JsonField<Options>,
        private val template: JsonField<Template>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("options") @ExcludeMissing options: JsonField<Options> = JsonMissing.of(),
            @JsonProperty("template")
            @ExcludeMissing
            template: JsonField<Template> = JsonMissing.of(),
        ) : this(options, template, mutableMapOf())

        /**
         * The parameters for the selected template's flow.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun options(): Options = options.getRequired("options")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun template(): Template = template.getRequired("template")

        /**
         * Returns the raw JSON value of [options].
         *
         * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<Options> = options

        /**
         * Returns the raw JSON value of [template].
         *
         * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("template") @ExcludeMissing fun _template(): JsonField<Template> = template

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [EmbeddableFlowCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .options()
             * .template()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [EmbeddableFlowCreateRequest]. */
        class Builder internal constructor() {

            private var options: JsonField<Options>? = null
            private var template: JsonField<Template>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(embeddableFlowCreateRequest: EmbeddableFlowCreateRequest) = apply {
                options = embeddableFlowCreateRequest.options
                template = embeddableFlowCreateRequest.template
                additionalProperties =
                    embeddableFlowCreateRequest.additionalProperties.toMutableMap()
            }

            /** The parameters for the selected template's flow. */
            fun options(options: Options) = options(JsonField.of(options))

            /**
             * Sets [Builder.options] to an arbitrary JSON value.
             *
             * You should usually call [Builder.options] with a well-typed [Options] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun options(options: JsonField<Options>) = apply { this.options = options }

            /**
             * Alias for calling [options] with
             * `Options.ofAccountCollectionFlowCreateRequest(accountCollectionFlowCreateRequest)`.
             */
            fun options(accountCollectionFlowCreateRequest: AccountCollectionFlowCreateRequest) =
                options(
                    Options.ofAccountCollectionFlowCreateRequest(accountCollectionFlowCreateRequest)
                )

            /**
             * Alias for calling [options] with
             * `Options.ofPaymentFlowCreateRequest(paymentFlowCreateRequest)`.
             */
            fun options(paymentFlowCreateRequest: PaymentFlowCreateRequest) =
                options(Options.ofPaymentFlowCreateRequest(paymentFlowCreateRequest))

            /** Alias for calling [options] with `Options.ofType(type)`. */
            fun options(type: Options.Type) = options(Options.ofType(type))

            fun template(template: Template) = template(JsonField.of(template))

            /**
             * Sets [Builder.template] to an arbitrary JSON value.
             *
             * You should usually call [Builder.template] with a well-typed [Template] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun template(template: JsonField<Template>) = apply { this.template = template }

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

            /**
             * Returns an immutable instance of [EmbeddableFlowCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .options()
             * .template()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): EmbeddableFlowCreateRequest =
                EmbeddableFlowCreateRequest(
                    checkRequired("options", options),
                    checkRequired("template", template),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): EmbeddableFlowCreateRequest = apply {
            if (validated) {
                return@apply
            }

            options().validate()
            template().validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (options.asKnown()?.validity() ?: 0) + (template.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EmbeddableFlowCreateRequest &&
                options == other.options &&
                template == other.template &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(options, template, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EmbeddableFlowCreateRequest{options=$options, template=$template, additionalProperties=$additionalProperties}"
    }

    /** The parameters for the selected template's flow. */
    @JsonDeserialize(using = Options.Deserializer::class)
    @JsonSerialize(using = Options.Serializer::class)
    class Options
    private constructor(
        private val accountCollectionFlowCreateRequest: AccountCollectionFlowCreateRequest? = null,
        private val paymentFlowCreateRequest: PaymentFlowCreateRequest? = null,
        private val type: Type? = null,
        private val _json: JsonValue? = null,
    ) {

        fun accountCollectionFlowCreateRequest(): AccountCollectionFlowCreateRequest? =
            accountCollectionFlowCreateRequest

        fun paymentFlowCreateRequest(): PaymentFlowCreateRequest? = paymentFlowCreateRequest

        fun type(): Type? = type

        fun isAccountCollectionFlowCreateRequest(): Boolean =
            accountCollectionFlowCreateRequest != null

        fun isPaymentFlowCreateRequest(): Boolean = paymentFlowCreateRequest != null

        fun isType(): Boolean = type != null

        fun asAccountCollectionFlowCreateRequest(): AccountCollectionFlowCreateRequest =
            accountCollectionFlowCreateRequest.getOrThrow("accountCollectionFlowCreateRequest")

        fun asPaymentFlowCreateRequest(): PaymentFlowCreateRequest =
            paymentFlowCreateRequest.getOrThrow("paymentFlowCreateRequest")

        fun asType(): Type = type.getOrThrow("type")

        fun _json(): JsonValue? = _json

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```kotlin
         * import com.moderntreasury.api.core.JsonValue
         *
         * val result: String? = options.accept(object : Options.Visitor<String?> {
         *     override fun visitAccountCollectionFlowCreateRequest(accountCollectionFlowCreateRequest: AccountCollectionFlowCreateRequest): String? = accountCollectionFlowCreateRequest.toString()
         *
         *     // ...
         *
         *     override fun unknown(json: JsonValue?): String? {
         *         // Or inspect the `json`.
         *         return null
         *     }
         * })
         * ```
         *
         * @throws ModernTreasuryInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                accountCollectionFlowCreateRequest != null ->
                    visitor.visitAccountCollectionFlowCreateRequest(
                        accountCollectionFlowCreateRequest
                    )
                paymentFlowCreateRequest != null ->
                    visitor.visitPaymentFlowCreateRequest(paymentFlowCreateRequest)
                type != null -> visitor.visitType(type)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Options = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAccountCollectionFlowCreateRequest(
                        accountCollectionFlowCreateRequest: AccountCollectionFlowCreateRequest
                    ) {
                        accountCollectionFlowCreateRequest.validate()
                    }

                    override fun visitPaymentFlowCreateRequest(
                        paymentFlowCreateRequest: PaymentFlowCreateRequest
                    ) {
                        paymentFlowCreateRequest.validate()
                    }

                    override fun visitType(type: Type) {
                        type.validate()
                    }
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitAccountCollectionFlowCreateRequest(
                        accountCollectionFlowCreateRequest: AccountCollectionFlowCreateRequest
                    ) = accountCollectionFlowCreateRequest.validity()

                    override fun visitPaymentFlowCreateRequest(
                        paymentFlowCreateRequest: PaymentFlowCreateRequest
                    ) = paymentFlowCreateRequest.validity()

                    override fun visitType(type: Type) = type.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Options &&
                accountCollectionFlowCreateRequest == other.accountCollectionFlowCreateRequest &&
                paymentFlowCreateRequest == other.paymentFlowCreateRequest &&
                type == other.type
        }

        override fun hashCode(): Int =
            Objects.hash(accountCollectionFlowCreateRequest, paymentFlowCreateRequest, type)

        override fun toString(): String =
            when {
                accountCollectionFlowCreateRequest != null ->
                    "Options{accountCollectionFlowCreateRequest=$accountCollectionFlowCreateRequest}"
                paymentFlowCreateRequest != null ->
                    "Options{paymentFlowCreateRequest=$paymentFlowCreateRequest}"
                type != null -> "Options{type=$type}"
                _json != null -> "Options{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Options")
            }

        companion object {

            fun ofAccountCollectionFlowCreateRequest(
                accountCollectionFlowCreateRequest: AccountCollectionFlowCreateRequest
            ) = Options(accountCollectionFlowCreateRequest = accountCollectionFlowCreateRequest)

            fun ofPaymentFlowCreateRequest(paymentFlowCreateRequest: PaymentFlowCreateRequest) =
                Options(paymentFlowCreateRequest = paymentFlowCreateRequest)

            fun ofType(type: Type) = Options(type = type)
        }

        /**
         * An interface that defines how to map each variant of [Options] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitAccountCollectionFlowCreateRequest(
                accountCollectionFlowCreateRequest: AccountCollectionFlowCreateRequest
            ): T

            fun visitPaymentFlowCreateRequest(paymentFlowCreateRequest: PaymentFlowCreateRequest): T

            fun visitType(type: Type): T

            /**
             * Maps an unknown variant of [Options] to a value of type [T].
             *
             * An instance of [Options] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws ModernTreasuryInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw ModernTreasuryInvalidDataException("Unknown Options: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Options>(Options::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Options {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<AccountCollectionFlowCreateRequest>(),
                                )
                                ?.let {
                                    Options(accountCollectionFlowCreateRequest = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PaymentFlowCreateRequest>())?.let {
                                Options(paymentFlowCreateRequest = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Type>())?.let {
                                Options(type = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Options(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Options>(Options::class) {

            override fun serialize(
                value: Options,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.accountCollectionFlowCreateRequest != null ->
                        generator.writeObject(value.accountCollectionFlowCreateRequest)
                    value.paymentFlowCreateRequest != null ->
                        generator.writeObject(value.paymentFlowCreateRequest)
                    value.type != null -> generator.writeObject(value.type)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Options")
                }
            }
        }

        class Type
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonField<InnerType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonField<InnerType> = JsonMissing.of()
            ) : this(type, mutableMapOf())

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): InnerType = type.getRequired("type")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<InnerType> = type

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Type].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Type]. */
            class Builder internal constructor() {

                private var type: JsonField<InnerType>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(type: Type) = apply {
                    this.type = type.type
                    additionalProperties = type.additionalProperties.toMutableMap()
                }

                fun type(type: InnerType) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [InnerType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun type(type: JsonField<InnerType>) = apply { this.type = type }

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

                /**
                 * Returns an immutable instance of [Type].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Type =
                    Type(checkRequired("type", type), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                type().validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ModernTreasuryInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = (type.asKnown()?.validity() ?: 0)

            class InnerType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val INDIVIDUAL = of("individual")

                    fun of(value: String) = InnerType(JsonField.of(value))
                }

                /** An enum containing [InnerType]'s known values. */
                enum class Known {
                    INDIVIDUAL
                }

                /**
                 * An enum containing [InnerType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [InnerType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INDIVIDUAL,
                    /**
                     * An enum member indicating that [InnerType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        INDIVIDUAL -> Value.INDIVIDUAL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        INDIVIDUAL -> Known.INDIVIDUAL
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown InnerType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ModernTreasuryInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): InnerType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ModernTreasuryInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InnerType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Type{type=$type, additionalProperties=$additionalProperties}"
        }
    }

    class Template @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val LEGAL_ENTITY_ONBOARDING = of("legal_entity_onboarding")

            val ACCOUNT_COLLECTION = of("account_collection")

            val PAYMENT = of("payment")

            fun of(value: String) = Template(JsonField.of(value))
        }

        /** An enum containing [Template]'s known values. */
        enum class Known {
            LEGAL_ENTITY_ONBOARDING,
            ACCOUNT_COLLECTION,
            PAYMENT,
        }

        /**
         * An enum containing [Template]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Template] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LEGAL_ENTITY_ONBOARDING,
            ACCOUNT_COLLECTION,
            PAYMENT,
            /** An enum member indicating that [Template] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                LEGAL_ENTITY_ONBOARDING -> Value.LEGAL_ENTITY_ONBOARDING
                ACCOUNT_COLLECTION -> Value.ACCOUNT_COLLECTION
                PAYMENT -> Value.PAYMENT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                LEGAL_ENTITY_ONBOARDING -> Known.LEGAL_ENTITY_ONBOARDING
                ACCOUNT_COLLECTION -> Known.ACCOUNT_COLLECTION
                PAYMENT -> Known.PAYMENT
                else -> throw ModernTreasuryInvalidDataException("Unknown Template: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Template = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Template && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmbeddableFlowCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EmbeddableFlowCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
