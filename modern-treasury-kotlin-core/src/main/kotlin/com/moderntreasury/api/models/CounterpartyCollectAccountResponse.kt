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
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class CounterpartyCollectAccountResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("form_link")
    @ExcludeMissing
    private val formLink: JsonField<String> = JsonMissing.of(),
    @JsonProperty("is_resend")
    @ExcludeMissing
    private val isResend: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The id of the existing counterparty. */
    fun id(): String = id.getRequired("id")

    /**
     * This is the link to the secure Modern Treasury form. By default, Modern Treasury will send an
     * email to your counterparty that includes a link to this form. However, if `send_email` is
     * passed as `false` in the body then Modern Treasury will not send the email and you can send
     * it to the counterparty directly.
     */
    fun formLink(): String = formLink.getRequired("form_link")

    /**
     * This field will be `true` if an email requesting account details has already been sent to
     * this counterparty.
     */
    fun isResend(): Boolean = isResend.getRequired("is_resend")

    /** The id of the existing counterparty. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * This is the link to the secure Modern Treasury form. By default, Modern Treasury will send an
     * email to your counterparty that includes a link to this form. However, if `send_email` is
     * passed as `false` in the body then Modern Treasury will not send the email and you can send
     * it to the counterparty directly.
     */
    @JsonProperty("form_link") @ExcludeMissing fun _formLink(): JsonField<String> = formLink

    /**
     * This field will be `true` if an email requesting account details has already been sent to
     * this counterparty.
     */
    @JsonProperty("is_resend") @ExcludeMissing fun _isResend(): JsonField<Boolean> = isResend

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CounterpartyCollectAccountResponse = apply {
        if (!validated) {
            id()
            formLink()
            isResend()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var formLink: JsonField<String>? = null
        private var isResend: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(counterpartyCollectAccountResponse: CounterpartyCollectAccountResponse) =
            apply {
                id = counterpartyCollectAccountResponse.id
                formLink = counterpartyCollectAccountResponse.formLink
                isResend = counterpartyCollectAccountResponse.isResend
                additionalProperties =
                    counterpartyCollectAccountResponse.additionalProperties.toMutableMap()
            }

        /** The id of the existing counterparty. */
        fun id(id: String) = id(JsonField.of(id))

        /** The id of the existing counterparty. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * This is the link to the secure Modern Treasury form. By default, Modern Treasury will
         * send an email to your counterparty that includes a link to this form. However, if
         * `send_email` is passed as `false` in the body then Modern Treasury will not send the
         * email and you can send it to the counterparty directly.
         */
        fun formLink(formLink: String) = formLink(JsonField.of(formLink))

        /**
         * This is the link to the secure Modern Treasury form. By default, Modern Treasury will
         * send an email to your counterparty that includes a link to this form. However, if
         * `send_email` is passed as `false` in the body then Modern Treasury will not send the
         * email and you can send it to the counterparty directly.
         */
        fun formLink(formLink: JsonField<String>) = apply { this.formLink = formLink }

        /**
         * This field will be `true` if an email requesting account details has already been sent to
         * this counterparty.
         */
        fun isResend(isResend: Boolean) = isResend(JsonField.of(isResend))

        /**
         * This field will be `true` if an email requesting account details has already been sent to
         * this counterparty.
         */
        fun isResend(isResend: JsonField<Boolean>) = apply { this.isResend = isResend }

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

        fun build(): CounterpartyCollectAccountResponse =
            CounterpartyCollectAccountResponse(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(formLink) { "`formLink` is required but was not set" },
                checkNotNull(isResend) { "`isResend` is required but was not set" },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterpartyCollectAccountResponse && id == other.id && formLink == other.formLink && isResend == other.isResend && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, formLink, isResend, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CounterpartyCollectAccountResponse{id=$id, formLink=$formLink, isResend=$isResend, additionalProperties=$additionalProperties}"
}
