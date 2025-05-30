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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.Objects

class PingResponse
private constructor(
    private val ping: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ping") @ExcludeMissing ping: JsonField<String> = JsonMissing.of()
    ) : this(ping, mutableMapOf())

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ping(): String = ping.getRequired("ping")

    /**
     * Returns the raw JSON value of [ping].
     *
     * Unlike [ping], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ping") @ExcludeMissing fun _ping(): JsonField<String> = ping

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
         * Returns a mutable builder for constructing an instance of [PingResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .ping()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PingResponse]. */
    class Builder internal constructor() {

        private var ping: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(pingResponse: PingResponse) = apply {
            ping = pingResponse.ping
            additionalProperties = pingResponse.additionalProperties.toMutableMap()
        }

        fun ping(ping: String) = ping(JsonField.of(ping))

        /**
         * Sets [Builder.ping] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ping] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ping(ping: JsonField<String>) = apply { this.ping = ping }

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
         * Returns an immutable instance of [PingResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .ping()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PingResponse =
            PingResponse(checkRequired("ping", ping), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PingResponse = apply {
        if (validated) {
            return@apply
        }

        ping()
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
    internal fun validity(): Int = (if (ping.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PingResponse && ping == other.ping && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(ping, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "PingResponse{ping=$ping, additionalProperties=$additionalProperties}"
}
