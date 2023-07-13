package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import java.util.Objects

@JsonDeserialize(builder = PingResponse.Builder::class)
@NoAutoDetect
class PingResponse
private constructor(
    private val ping: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun ping(): String = ping.getRequired("ping")

    @JsonProperty("ping") @ExcludeMissing fun _ping() = ping

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PingResponse = apply {
        if (!validated) {
            ping()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PingResponse &&
            this.ping == other.ping &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(ping, additionalProperties)
        }
        return hashCode
    }

    override fun toString() = "PingResponse{ping=$ping, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var ping: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(pingResponse: PingResponse) = apply {
            this.ping = pingResponse.ping
            additionalProperties(pingResponse.additionalProperties)
        }

        fun ping(ping: String) = ping(JsonField.of(ping))

        @JsonProperty("ping")
        @ExcludeMissing
        fun ping(ping: JsonField<String>) = apply { this.ping = ping }

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

        fun build(): PingResponse = PingResponse(ping, additionalProperties.toUnmodifiable())
    }
}
