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
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class Ledger
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** An optional free-form description for internal use. */
    fun description(): String? = description.getNullable("description")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** The name of the ledger. */
    fun name(): String = name.getRequired("name")

    fun object_(): String = object_.getRequired("object")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** An optional free-form description for internal use. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /** The name of the ledger. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Ledger = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        description()
        discardedAt()
        liveMode()
        metadata().validate()
        name()
        object_()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var name: JsonField<String>? = null
        private var object_: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledger: Ledger) = apply {
            id = ledger.id
            createdAt = ledger.createdAt
            description = ledger.description
            discardedAt = ledger.discardedAt
            liveMode = ledger.liveMode
            metadata = ledger.metadata
            name = ledger.name
            object_ = ledger.object_
            updatedAt = ledger.updatedAt
            additionalProperties = ledger.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** An optional free-form description for internal use. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** An optional free-form description for internal use. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
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

        /** The name of the ledger. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the ledger. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

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

        fun build(): Ledger =
            Ledger(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("discardedAt", discardedAt),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("name", name),
                checkRequired("object_", object_),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toImmutable(),
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

        class Builder internal constructor() {

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

        return /* spotless:off */ other is Ledger && id == other.id && createdAt == other.createdAt && description == other.description && discardedAt == other.discardedAt && liveMode == other.liveMode && metadata == other.metadata && name == other.name && object_ == other.object_ && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, description, discardedAt, liveMode, metadata, name, object_, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Ledger{id=$id, createdAt=$createdAt, description=$description, discardedAt=$discardedAt, liveMode=$liveMode, metadata=$metadata, name=$name, object_=$object_, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
