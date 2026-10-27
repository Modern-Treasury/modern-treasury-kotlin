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
import com.moderntreasury.api.core.allMaxBy
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.getOrThrow
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class EmbeddableFlow
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val clientToken: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val liveMode: JsonField<Boolean>,
    private val object_: JsonField<String>,
    private val options: JsonField<Options>,
    private val status: JsonField<Status>,
    private val template: JsonField<Template>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_token")
        @ExcludeMissing
        clientToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("options") @ExcludeMissing options: JsonField<Options> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("template") @ExcludeMissing template: JsonField<Template> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        clientToken,
        createdAt,
        expiresAt,
        liveMode,
        object_,
        options,
        status,
        template,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientToken(): String = clientToken.getRequired("client_token")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun object_(): String = object_.getRequired("object")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun options(): Options = options.getRequired("options")

    /**
     * The current status of the underlying flow.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun template(): Template = template.getRequired("template")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [clientToken].
     *
     * Unlike [clientToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_token")
    @ExcludeMissing
    fun _clientToken(): JsonField<String> = clientToken

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [liveMode].
     *
     * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<Options> = options

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [template].
     *
     * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("template") @ExcludeMissing fun _template(): JsonField<Template> = template

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [EmbeddableFlow].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .clientToken()
         * .createdAt()
         * .expiresAt()
         * .liveMode()
         * .object_()
         * .options()
         * .status()
         * .template()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EmbeddableFlow]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var clientToken: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var object_: JsonField<String>? = null
        private var options: JsonField<Options>? = null
        private var status: JsonField<Status>? = null
        private var template: JsonField<Template>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(embeddableFlow: EmbeddableFlow) = apply {
            id = embeddableFlow.id
            clientToken = embeddableFlow.clientToken
            createdAt = embeddableFlow.createdAt
            expiresAt = embeddableFlow.expiresAt
            liveMode = embeddableFlow.liveMode
            object_ = embeddableFlow.object_
            options = embeddableFlow.options
            status = embeddableFlow.status
            template = embeddableFlow.template
            updatedAt = embeddableFlow.updatedAt
            additionalProperties = embeddableFlow.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun clientToken(clientToken: String) = clientToken(JsonField.of(clientToken))

        /**
         * Sets [Builder.clientToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientToken(clientToken: JsonField<String>) = apply { this.clientToken = clientToken }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * Sets [Builder.liveMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liveMode] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        fun options(options: Options) = options(JsonField.of(options))

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed [Options] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun options(options: JsonField<Options>) = apply { this.options = options }

        /** Alias for calling [options] with `Options.ofUnionMember0(unionMember0)`. */
        fun options(unionMember0: Options.UnionMember0) =
            options(Options.ofUnionMember0(unionMember0))

        /** Alias for calling [options] with `Options.ofUnionMember1(unionMember1)`. */
        fun options(unionMember1: Options.UnionMember1) =
            options(Options.ofUnionMember1(unionMember1))

        /** Alias for calling [options] with `Options.ofUnionMember2(unionMember2)`. */
        fun options(unionMember2: Options.UnionMember2) =
            options(Options.ofUnionMember2(unionMember2))

        /** The current status of the underlying flow. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun template(template: Template) = template(JsonField.of(template))

        /**
         * Sets [Builder.template] to an arbitrary JSON value.
         *
         * You should usually call [Builder.template] with a well-typed [Template] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun template(template: JsonField<Template>) = apply { this.template = template }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [EmbeddableFlow].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .clientToken()
         * .createdAt()
         * .expiresAt()
         * .liveMode()
         * .object_()
         * .options()
         * .status()
         * .template()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmbeddableFlow =
            EmbeddableFlow(
                checkRequired("id", id),
                checkRequired("clientToken", clientToken),
                checkRequired("createdAt", createdAt),
                checkRequired("expiresAt", expiresAt),
                checkRequired("liveMode", liveMode),
                checkRequired("object_", object_),
                checkRequired("options", options),
                checkRequired("status", status),
                checkRequired("template", template),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): EmbeddableFlow = apply {
        if (validated) {
            return@apply
        }

        id()
        clientToken()
        createdAt()
        expiresAt()
        liveMode()
        object_()
        options().validate()
        status().validate()
        template().validate()
        updatedAt()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (clientToken.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (expiresAt.asKnown() == null) 0 else 1) +
            (if (liveMode.asKnown() == null) 0 else 1) +
            (if (object_.asKnown() == null) 0 else 1) +
            (options.asKnown()?.validity() ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (template.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    @JsonDeserialize(using = Options.Deserializer::class)
    @JsonSerialize(using = Options.Serializer::class)
    class Options
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val unionMember1: UnionMember1? = null,
        private val unionMember2: UnionMember2? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): UnionMember0? = unionMember0

        fun unionMember1(): UnionMember1? = unionMember1

        fun unionMember2(): UnionMember2? = unionMember2

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun isUnionMember2(): Boolean = unionMember2 != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")

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
         *     override fun visitUnionMember0(unionMember0: UnionMember0): String? = unionMember0.toString()
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
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
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
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
                    }

                    override fun visitUnionMember2(unionMember2: UnionMember2) {
                        unionMember2.validate()
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
                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                        unionMember0.validity()

                    override fun visitUnionMember1(unionMember1: UnionMember1) =
                        unionMember1.validity()

                    override fun visitUnionMember2(unionMember2: UnionMember2) =
                        unionMember2.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Options &&
                unionMember0 == other.unionMember0 &&
                unionMember1 == other.unionMember1 &&
                unionMember2 == other.unionMember2
        }

        override fun hashCode(): Int = Objects.hash(unionMember0, unionMember1, unionMember2)

        override fun toString(): String =
            when {
                unionMember0 != null -> "Options{unionMember0=$unionMember0}"
                unionMember1 != null -> "Options{unionMember1=$unionMember1}"
                unionMember2 != null -> "Options{unionMember2=$unionMember2}"
                _json != null -> "Options{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Options")
            }

        companion object {

            fun ofUnionMember0(unionMember0: UnionMember0) = Options(unionMember0 = unionMember0)

            fun ofUnionMember1(unionMember1: UnionMember1) = Options(unionMember1 = unionMember1)

            fun ofUnionMember2(unionMember2: UnionMember2) = Options(unionMember2 = unionMember2)
        }

        /**
         * An interface that defines how to map each variant of [Options] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            fun visitUnionMember2(unionMember2: UnionMember2): T

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
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                Options(unionMember0 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                Options(unionMember1 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UnionMember2>())?.let {
                                Options(unionMember2 = it, _json = json)
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
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value.unionMember2 != null -> generator.writeObject(value.unionMember2)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Options")
                }
            }
        }

        class UnionMember0
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val legalEntityId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("legal_entity_id")
                @ExcludeMissing
                legalEntityId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(legalEntityId, type, mutableMapOf())

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun legalEntityId(): String = legalEntityId.getRequired("legal_entity_id")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [legalEntityId].
             *
             * Unlike [legalEntityId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("legal_entity_id")
            @ExcludeMissing
            fun _legalEntityId(): JsonField<String> = legalEntityId

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [UnionMember0].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .legalEntityId()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UnionMember0]. */
            class Builder internal constructor() {

                private var legalEntityId: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unionMember0: UnionMember0) = apply {
                    legalEntityId = unionMember0.legalEntityId
                    type = unionMember0.type
                    additionalProperties = unionMember0.additionalProperties.toMutableMap()
                }

                fun legalEntityId(legalEntityId: String) =
                    legalEntityId(JsonField.of(legalEntityId))

                /**
                 * Sets [Builder.legalEntityId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.legalEntityId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun legalEntityId(legalEntityId: JsonField<String>) = apply {
                    this.legalEntityId = legalEntityId
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [UnionMember0].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .legalEntityId()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UnionMember0 =
                    UnionMember0(
                        checkRequired("legalEntityId", legalEntityId),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): UnionMember0 = apply {
                if (validated) {
                    return@apply
                }

                legalEntityId()
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
            internal fun validity(): Int =
                (if (legalEntityId.asKnown() == null) 0 else 1) + (type.asKnown()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    INDIVIDUAL
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INDIVIDUAL,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
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
                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember0 &&
                    legalEntityId == other.legalEntityId &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(legalEntityId, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember0{legalEntityId=$legalEntityId, type=$type, additionalProperties=$additionalProperties}"
        }

        class UnionMember1
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val counterpartyId: JsonField<String>,
            private val externalAccountId: JsonField<String>,
            private val paymentTypes: JsonField<List<String>>,
            private val receivingCountries: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("counterparty_id")
                @ExcludeMissing
                counterpartyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("external_account_id")
                @ExcludeMissing
                externalAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_types")
                @ExcludeMissing
                paymentTypes: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("receiving_countries")
                @ExcludeMissing
                receivingCountries: JsonField<List<String>> = JsonMissing.of(),
            ) : this(
                counterpartyId,
                externalAccountId,
                paymentTypes,
                receivingCountries,
                mutableMapOf(),
            )

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun externalAccountId(): String? = externalAccountId.getNullable("external_account_id")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentTypes(): List<String> = paymentTypes.getRequired("payment_types")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun receivingCountries(): List<String> =
                receivingCountries.getRequired("receiving_countries")

            /**
             * Returns the raw JSON value of [counterpartyId].
             *
             * Unlike [counterpartyId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("counterparty_id")
            @ExcludeMissing
            fun _counterpartyId(): JsonField<String> = counterpartyId

            /**
             * Returns the raw JSON value of [externalAccountId].
             *
             * Unlike [externalAccountId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("external_account_id")
            @ExcludeMissing
            fun _externalAccountId(): JsonField<String> = externalAccountId

            /**
             * Returns the raw JSON value of [paymentTypes].
             *
             * Unlike [paymentTypes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payment_types")
            @ExcludeMissing
            fun _paymentTypes(): JsonField<List<String>> = paymentTypes

            /**
             * Returns the raw JSON value of [receivingCountries].
             *
             * Unlike [receivingCountries], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("receiving_countries")
            @ExcludeMissing
            fun _receivingCountries(): JsonField<List<String>> = receivingCountries

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
                 * Returns a mutable builder for constructing an instance of [UnionMember1].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .counterpartyId()
                 * .externalAccountId()
                 * .paymentTypes()
                 * .receivingCountries()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UnionMember1]. */
            class Builder internal constructor() {

                private var counterpartyId: JsonField<String>? = null
                private var externalAccountId: JsonField<String>? = null
                private var paymentTypes: JsonField<MutableList<String>>? = null
                private var receivingCountries: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unionMember1: UnionMember1) = apply {
                    counterpartyId = unionMember1.counterpartyId
                    externalAccountId = unionMember1.externalAccountId
                    paymentTypes = unionMember1.paymentTypes.map { it.toMutableList() }
                    receivingCountries = unionMember1.receivingCountries.map { it.toMutableList() }
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                fun counterpartyId(counterpartyId: String?) =
                    counterpartyId(JsonField.ofNullable(counterpartyId))

                /**
                 * Sets [Builder.counterpartyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.counterpartyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun counterpartyId(counterpartyId: JsonField<String>) = apply {
                    this.counterpartyId = counterpartyId
                }

                fun externalAccountId(externalAccountId: String?) =
                    externalAccountId(JsonField.ofNullable(externalAccountId))

                /**
                 * Sets [Builder.externalAccountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalAccountId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun externalAccountId(externalAccountId: JsonField<String>) = apply {
                    this.externalAccountId = externalAccountId
                }

                fun paymentTypes(paymentTypes: List<String>) =
                    paymentTypes(JsonField.of(paymentTypes))

                /**
                 * Sets [Builder.paymentTypes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentTypes] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentTypes(paymentTypes: JsonField<List<String>>) = apply {
                    this.paymentTypes = paymentTypes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [paymentTypes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentType(paymentType: String) = apply {
                    paymentTypes =
                        (paymentTypes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("paymentTypes", it).add(paymentType)
                        }
                }

                fun receivingCountries(receivingCountries: List<String>) =
                    receivingCountries(JsonField.of(receivingCountries))

                /**
                 * Sets [Builder.receivingCountries] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.receivingCountries] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun receivingCountries(receivingCountries: JsonField<List<String>>) = apply {
                    this.receivingCountries = receivingCountries.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [receivingCountries].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addReceivingCountry(receivingCountry: String) = apply {
                    receivingCountries =
                        (receivingCountries ?: JsonField.of(mutableListOf())).also {
                            checkKnown("receivingCountries", it).add(receivingCountry)
                        }
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

                /**
                 * Returns an immutable instance of [UnionMember1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .counterpartyId()
                 * .externalAccountId()
                 * .paymentTypes()
                 * .receivingCountries()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UnionMember1 =
                    UnionMember1(
                        checkRequired("counterpartyId", counterpartyId),
                        checkRequired("externalAccountId", externalAccountId),
                        checkRequired("paymentTypes", paymentTypes).map { it.toImmutable() },
                        checkRequired("receivingCountries", receivingCountries).map {
                            it.toImmutable()
                        },
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): UnionMember1 = apply {
                if (validated) {
                    return@apply
                }

                counterpartyId()
                externalAccountId()
                paymentTypes()
                receivingCountries()
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
                (if (counterpartyId.asKnown() == null) 0 else 1) +
                    (if (externalAccountId.asKnown() == null) 0 else 1) +
                    (paymentTypes.asKnown()?.size ?: 0) +
                    (receivingCountries.asKnown()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember1 &&
                    counterpartyId == other.counterpartyId &&
                    externalAccountId == other.externalAccountId &&
                    paymentTypes == other.paymentTypes &&
                    receivingCountries == other.receivingCountries &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    counterpartyId,
                    externalAccountId,
                    paymentTypes,
                    receivingCountries,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember1{counterpartyId=$counterpartyId, externalAccountId=$externalAccountId, paymentTypes=$paymentTypes, receivingCountries=$receivingCountries, additionalProperties=$additionalProperties}"
        }

        class UnionMember2
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val counterpartyId: JsonField<String>,
            private val currency: JsonField<String>,
            private val direction: JsonField<TransactionDirection>,
            private val dueDate: JsonField<LocalDate>,
            private val effectiveDateSelectionEnabled: JsonField<Boolean>,
            private val existingExternalAccountsFilter: JsonField<ExistingExternalAccountsFilter>,
            private val externalAccountCollection: JsonField<ExternalAccountCollection>,
            private val originatingAccountId: JsonField<String>,
            private val paymentOrderId: JsonField<String>,
            private val receivingAccountId: JsonField<String>,
            private val selectedEffectiveDate: JsonField<LocalDate>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("counterparty_id")
                @ExcludeMissing
                counterpartyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("direction")
                @ExcludeMissing
                direction: JsonField<TransactionDirection> = JsonMissing.of(),
                @JsonProperty("due_date")
                @ExcludeMissing
                dueDate: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("effective_date_selection_enabled")
                @ExcludeMissing
                effectiveDateSelectionEnabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("existing_external_accounts_filter")
                @ExcludeMissing
                existingExternalAccountsFilter: JsonField<ExistingExternalAccountsFilter> =
                    JsonMissing.of(),
                @JsonProperty("external_account_collection")
                @ExcludeMissing
                externalAccountCollection: JsonField<ExternalAccountCollection> = JsonMissing.of(),
                @JsonProperty("originating_account_id")
                @ExcludeMissing
                originatingAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_order_id")
                @ExcludeMissing
                paymentOrderId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("receiving_account_id")
                @ExcludeMissing
                receivingAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("selected_effective_date")
                @ExcludeMissing
                selectedEffectiveDate: JsonField<LocalDate> = JsonMissing.of(),
            ) : this(
                amount,
                counterpartyId,
                currency,
                direction,
                dueDate,
                effectiveDateSelectionEnabled,
                existingExternalAccountsFilter,
                externalAccountCollection,
                originatingAccountId,
                paymentOrderId,
                receivingAccountId,
                selectedEffectiveDate,
                mutableMapOf(),
            )

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun direction(): TransactionDirection = direction.getRequired("direction")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun dueDate(): LocalDate? = dueDate.getNullable("due_date")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun effectiveDateSelectionEnabled(): Boolean =
                effectiveDateSelectionEnabled.getRequired("effective_date_selection_enabled")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun existingExternalAccountsFilter(): ExistingExternalAccountsFilter? =
                existingExternalAccountsFilter.getNullable("existing_external_accounts_filter")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun externalAccountCollection(): ExternalAccountCollection =
                externalAccountCollection.getRequired("external_account_collection")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun originatingAccountId(): String =
                originatingAccountId.getRequired("originating_account_id")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun paymentOrderId(): String? = paymentOrderId.getNullable("payment_order_id")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun receivingAccountId(): String? =
                receivingAccountId.getNullable("receiving_account_id")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun selectedEffectiveDate(): LocalDate? =
                selectedEffectiveDate.getNullable("selected_effective_date")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [counterpartyId].
             *
             * Unlike [counterpartyId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("counterparty_id")
            @ExcludeMissing
            fun _counterpartyId(): JsonField<String> = counterpartyId

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [direction].
             *
             * Unlike [direction], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<TransactionDirection> = direction

            /**
             * Returns the raw JSON value of [dueDate].
             *
             * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("due_date") @ExcludeMissing fun _dueDate(): JsonField<LocalDate> = dueDate

            /**
             * Returns the raw JSON value of [effectiveDateSelectionEnabled].
             *
             * Unlike [effectiveDateSelectionEnabled], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("effective_date_selection_enabled")
            @ExcludeMissing
            fun _effectiveDateSelectionEnabled(): JsonField<Boolean> = effectiveDateSelectionEnabled

            /**
             * Returns the raw JSON value of [existingExternalAccountsFilter].
             *
             * Unlike [existingExternalAccountsFilter], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("existing_external_accounts_filter")
            @ExcludeMissing
            fun _existingExternalAccountsFilter(): JsonField<ExistingExternalAccountsFilter> =
                existingExternalAccountsFilter

            /**
             * Returns the raw JSON value of [externalAccountCollection].
             *
             * Unlike [externalAccountCollection], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("external_account_collection")
            @ExcludeMissing
            fun _externalAccountCollection(): JsonField<ExternalAccountCollection> =
                externalAccountCollection

            /**
             * Returns the raw JSON value of [originatingAccountId].
             *
             * Unlike [originatingAccountId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("originating_account_id")
            @ExcludeMissing
            fun _originatingAccountId(): JsonField<String> = originatingAccountId

            /**
             * Returns the raw JSON value of [paymentOrderId].
             *
             * Unlike [paymentOrderId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_order_id")
            @ExcludeMissing
            fun _paymentOrderId(): JsonField<String> = paymentOrderId

            /**
             * Returns the raw JSON value of [receivingAccountId].
             *
             * Unlike [receivingAccountId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("receiving_account_id")
            @ExcludeMissing
            fun _receivingAccountId(): JsonField<String> = receivingAccountId

            /**
             * Returns the raw JSON value of [selectedEffectiveDate].
             *
             * Unlike [selectedEffectiveDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("selected_effective_date")
            @ExcludeMissing
            fun _selectedEffectiveDate(): JsonField<LocalDate> = selectedEffectiveDate

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
                 * Returns a mutable builder for constructing an instance of [UnionMember2].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .counterpartyId()
                 * .currency()
                 * .direction()
                 * .dueDate()
                 * .effectiveDateSelectionEnabled()
                 * .existingExternalAccountsFilter()
                 * .externalAccountCollection()
                 * .originatingAccountId()
                 * .paymentOrderId()
                 * .receivingAccountId()
                 * .selectedEffectiveDate()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UnionMember2]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var counterpartyId: JsonField<String>? = null
                private var currency: JsonField<String>? = null
                private var direction: JsonField<TransactionDirection>? = null
                private var dueDate: JsonField<LocalDate>? = null
                private var effectiveDateSelectionEnabled: JsonField<Boolean>? = null
                private var existingExternalAccountsFilter:
                    JsonField<ExistingExternalAccountsFilter>? =
                    null
                private var externalAccountCollection: JsonField<ExternalAccountCollection>? = null
                private var originatingAccountId: JsonField<String>? = null
                private var paymentOrderId: JsonField<String>? = null
                private var receivingAccountId: JsonField<String>? = null
                private var selectedEffectiveDate: JsonField<LocalDate>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unionMember2: UnionMember2) = apply {
                    amount = unionMember2.amount
                    counterpartyId = unionMember2.counterpartyId
                    currency = unionMember2.currency
                    direction = unionMember2.direction
                    dueDate = unionMember2.dueDate
                    effectiveDateSelectionEnabled = unionMember2.effectiveDateSelectionEnabled
                    existingExternalAccountsFilter = unionMember2.existingExternalAccountsFilter
                    externalAccountCollection = unionMember2.externalAccountCollection
                    originatingAccountId = unionMember2.originatingAccountId
                    paymentOrderId = unionMember2.paymentOrderId
                    receivingAccountId = unionMember2.receivingAccountId
                    selectedEffectiveDate = unionMember2.selectedEffectiveDate
                    additionalProperties = unionMember2.additionalProperties.toMutableMap()
                }

                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun counterpartyId(counterpartyId: String?) =
                    counterpartyId(JsonField.ofNullable(counterpartyId))

                /**
                 * Sets [Builder.counterpartyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.counterpartyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun counterpartyId(counterpartyId: JsonField<String>) = apply {
                    this.counterpartyId = counterpartyId
                }

                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun direction(direction: TransactionDirection) = direction(JsonField.of(direction))

                /**
                 * Sets [Builder.direction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.direction] with a well-typed
                 * [TransactionDirection] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun direction(direction: JsonField<TransactionDirection>) = apply {
                    this.direction = direction
                }

                fun dueDate(dueDate: LocalDate?) = dueDate(JsonField.ofNullable(dueDate))

                /**
                 * Sets [Builder.dueDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dueDate] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dueDate(dueDate: JsonField<LocalDate>) = apply { this.dueDate = dueDate }

                fun effectiveDateSelectionEnabled(effectiveDateSelectionEnabled: Boolean) =
                    effectiveDateSelectionEnabled(JsonField.of(effectiveDateSelectionEnabled))

                /**
                 * Sets [Builder.effectiveDateSelectionEnabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.effectiveDateSelectionEnabled] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun effectiveDateSelectionEnabled(
                    effectiveDateSelectionEnabled: JsonField<Boolean>
                ) = apply { this.effectiveDateSelectionEnabled = effectiveDateSelectionEnabled }

                fun existingExternalAccountsFilter(
                    existingExternalAccountsFilter: ExistingExternalAccountsFilter?
                ) =
                    existingExternalAccountsFilter(
                        JsonField.ofNullable(existingExternalAccountsFilter)
                    )

                /**
                 * Sets [Builder.existingExternalAccountsFilter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.existingExternalAccountsFilter] with a
                 * well-typed [ExistingExternalAccountsFilter] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun existingExternalAccountsFilter(
                    existingExternalAccountsFilter: JsonField<ExistingExternalAccountsFilter>
                ) = apply { this.existingExternalAccountsFilter = existingExternalAccountsFilter }

                fun externalAccountCollection(
                    externalAccountCollection: ExternalAccountCollection
                ) = externalAccountCollection(JsonField.of(externalAccountCollection))

                /**
                 * Sets [Builder.externalAccountCollection] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalAccountCollection] with a well-typed
                 * [ExternalAccountCollection] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun externalAccountCollection(
                    externalAccountCollection: JsonField<ExternalAccountCollection>
                ) = apply { this.externalAccountCollection = externalAccountCollection }

                fun originatingAccountId(originatingAccountId: String) =
                    originatingAccountId(JsonField.of(originatingAccountId))

                /**
                 * Sets [Builder.originatingAccountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originatingAccountId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
                    this.originatingAccountId = originatingAccountId
                }

                fun paymentOrderId(paymentOrderId: String?) =
                    paymentOrderId(JsonField.ofNullable(paymentOrderId))

                /**
                 * Sets [Builder.paymentOrderId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentOrderId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun paymentOrderId(paymentOrderId: JsonField<String>) = apply {
                    this.paymentOrderId = paymentOrderId
                }

                fun receivingAccountId(receivingAccountId: String?) =
                    receivingAccountId(JsonField.ofNullable(receivingAccountId))

                /**
                 * Sets [Builder.receivingAccountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.receivingAccountId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
                    this.receivingAccountId = receivingAccountId
                }

                fun selectedEffectiveDate(selectedEffectiveDate: LocalDate?) =
                    selectedEffectiveDate(JsonField.ofNullable(selectedEffectiveDate))

                /**
                 * Sets [Builder.selectedEffectiveDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.selectedEffectiveDate] with a well-typed
                 * [LocalDate] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun selectedEffectiveDate(selectedEffectiveDate: JsonField<LocalDate>) = apply {
                    this.selectedEffectiveDate = selectedEffectiveDate
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

                /**
                 * Returns an immutable instance of [UnionMember2].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .counterpartyId()
                 * .currency()
                 * .direction()
                 * .dueDate()
                 * .effectiveDateSelectionEnabled()
                 * .existingExternalAccountsFilter()
                 * .externalAccountCollection()
                 * .originatingAccountId()
                 * .paymentOrderId()
                 * .receivingAccountId()
                 * .selectedEffectiveDate()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UnionMember2 =
                    UnionMember2(
                        checkRequired("amount", amount),
                        checkRequired("counterpartyId", counterpartyId),
                        checkRequired("currency", currency),
                        checkRequired("direction", direction),
                        checkRequired("dueDate", dueDate),
                        checkRequired(
                            "effectiveDateSelectionEnabled",
                            effectiveDateSelectionEnabled,
                        ),
                        checkRequired(
                            "existingExternalAccountsFilter",
                            existingExternalAccountsFilter,
                        ),
                        checkRequired("externalAccountCollection", externalAccountCollection),
                        checkRequired("originatingAccountId", originatingAccountId),
                        checkRequired("paymentOrderId", paymentOrderId),
                        checkRequired("receivingAccountId", receivingAccountId),
                        checkRequired("selectedEffectiveDate", selectedEffectiveDate),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): UnionMember2 = apply {
                if (validated) {
                    return@apply
                }

                amount()
                counterpartyId()
                currency()
                direction().validate()
                dueDate()
                effectiveDateSelectionEnabled()
                existingExternalAccountsFilter()?.validate()
                externalAccountCollection().validate()
                originatingAccountId()
                paymentOrderId()
                receivingAccountId()
                selectedEffectiveDate()
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
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (counterpartyId.asKnown() == null) 0 else 1) +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (direction.asKnown()?.validity() ?: 0) +
                    (if (dueDate.asKnown() == null) 0 else 1) +
                    (if (effectiveDateSelectionEnabled.asKnown() == null) 0 else 1) +
                    (existingExternalAccountsFilter.asKnown()?.validity() ?: 0) +
                    (externalAccountCollection.asKnown()?.validity() ?: 0) +
                    (if (originatingAccountId.asKnown() == null) 0 else 1) +
                    (if (paymentOrderId.asKnown() == null) 0 else 1) +
                    (if (receivingAccountId.asKnown() == null) 0 else 1) +
                    (if (selectedEffectiveDate.asKnown() == null) 0 else 1)

            class ExistingExternalAccountsFilter
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    val VERIFIED = of("verified")

                    fun of(value: String) = ExistingExternalAccountsFilter(JsonField.of(value))
                }

                /** An enum containing [ExistingExternalAccountsFilter]'s known values. */
                enum class Known {
                    VERIFIED
                }

                /**
                 * An enum containing [ExistingExternalAccountsFilter]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [ExistingExternalAccountsFilter] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    VERIFIED,
                    /**
                     * An enum member indicating that [ExistingExternalAccountsFilter] was
                     * instantiated with an unknown value.
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
                        VERIFIED -> Value.VERIFIED
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
                        VERIFIED -> Known.VERIFIED
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown ExistingExternalAccountsFilter: $value"
                            )
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
                fun validate(): ExistingExternalAccountsFilter = apply {
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

                    return other is ExistingExternalAccountsFilter && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class ExternalAccountCollection
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    val ENABLED = of("enabled")

                    val DISABLED = of("disabled")

                    fun of(value: String) = ExternalAccountCollection(JsonField.of(value))
                }

                /** An enum containing [ExternalAccountCollection]'s known values. */
                enum class Known {
                    ENABLED,
                    DISABLED,
                }

                /**
                 * An enum containing [ExternalAccountCollection]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [ExternalAccountCollection] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ENABLED,
                    DISABLED,
                    /**
                     * An enum member indicating that [ExternalAccountCollection] was instantiated
                     * with an unknown value.
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
                        ENABLED -> Value.ENABLED
                        DISABLED -> Value.DISABLED
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
                        ENABLED -> Known.ENABLED
                        DISABLED -> Known.DISABLED
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown ExternalAccountCollection: $value"
                            )
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
                fun validate(): ExternalAccountCollection = apply {
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

                    return other is ExternalAccountCollection && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember2 &&
                    amount == other.amount &&
                    counterpartyId == other.counterpartyId &&
                    currency == other.currency &&
                    direction == other.direction &&
                    dueDate == other.dueDate &&
                    effectiveDateSelectionEnabled == other.effectiveDateSelectionEnabled &&
                    existingExternalAccountsFilter == other.existingExternalAccountsFilter &&
                    externalAccountCollection == other.externalAccountCollection &&
                    originatingAccountId == other.originatingAccountId &&
                    paymentOrderId == other.paymentOrderId &&
                    receivingAccountId == other.receivingAccountId &&
                    selectedEffectiveDate == other.selectedEffectiveDate &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    counterpartyId,
                    currency,
                    direction,
                    dueDate,
                    effectiveDateSelectionEnabled,
                    existingExternalAccountsFilter,
                    externalAccountCollection,
                    originatingAccountId,
                    paymentOrderId,
                    receivingAccountId,
                    selectedEffectiveDate,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember2{amount=$amount, counterpartyId=$counterpartyId, currency=$currency, direction=$direction, dueDate=$dueDate, effectiveDateSelectionEnabled=$effectiveDateSelectionEnabled, existingExternalAccountsFilter=$existingExternalAccountsFilter, externalAccountCollection=$externalAccountCollection, originatingAccountId=$originatingAccountId, paymentOrderId=$paymentOrderId, receivingAccountId=$receivingAccountId, selectedEffectiveDate=$selectedEffectiveDate, additionalProperties=$additionalProperties}"
        }
    }

    /** The current status of the underlying flow. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val CANCELLED = of("cancelled")

            val COMPLETED = of("completed")

            val EXPIRED = of("expired")

            val PENDING = of("pending")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CANCELLED,
            COMPLETED,
            EXPIRED,
            PENDING,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CANCELLED,
            COMPLETED,
            EXPIRED,
            PENDING,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                CANCELLED -> Value.CANCELLED
                COMPLETED -> Value.COMPLETED
                EXPIRED -> Value.EXPIRED
                PENDING -> Value.PENDING
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
                CANCELLED -> Known.CANCELLED
                COMPLETED -> Known.COMPLETED
                EXPIRED -> Known.EXPIRED
                PENDING -> Known.PENDING
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

        return other is EmbeddableFlow &&
            id == other.id &&
            clientToken == other.clientToken &&
            createdAt == other.createdAt &&
            expiresAt == other.expiresAt &&
            liveMode == other.liveMode &&
            object_ == other.object_ &&
            options == other.options &&
            status == other.status &&
            template == other.template &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            clientToken,
            createdAt,
            expiresAt,
            liveMode,
            object_,
            options,
            status,
            template,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmbeddableFlow{id=$id, clientToken=$clientToken, createdAt=$createdAt, expiresAt=$expiresAt, liveMode=$liveMode, object_=$object_, options=$options, status=$status, template=$template, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
