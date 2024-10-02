// File generated from our OpenAPI spec by Stainless.

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

@JsonDeserialize(builder = CounterpartyCollectAccountResponse.Builder::class)
@NoAutoDetect
class CounterpartyCollectAccountResponse
private constructor(
    private val id: JsonField<String>,
    private val isResend: JsonField<Boolean>,
    private val formLink: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The id of the existing counterparty. */
    fun id(): String = id.getRequired("id")

    /**
     * This field will be `true` if an email requesting account details has already been sent to
     * this counterparty.
     */
    fun isResend(): Boolean = isResend.getRequired("is_resend")

    /**
     * This is the link to the secure Modern Treasury form. By default, Modern Treasury will send an
     * email to your counterparty that includes a link to this form. However, if `send_email` is
     * passed as `false` in the body then Modern Treasury will not send the email and you can send
     * it to the counterparty directly.
     */
    fun formLink(): String = formLink.getRequired("form_link")

    /** The id of the existing counterparty. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * This field will be `true` if an email requesting account details has already been sent to
     * this counterparty.
     */
    @JsonProperty("is_resend") @ExcludeMissing fun _isResend() = isResend

    /**
     * This is the link to the secure Modern Treasury form. By default, Modern Treasury will send an
     * email to your counterparty that includes a link to this form. However, if `send_email` is
     * passed as `false` in the body then Modern Treasury will not send the email and you can send
     * it to the counterparty directly.
     */
    @JsonProperty("form_link") @ExcludeMissing fun _formLink() = formLink

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CounterpartyCollectAccountResponse = apply {
        if (!validated) {
            id()
            isResend()
            formLink()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var isResend: JsonField<Boolean> = JsonMissing.of()
        private var formLink: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(counterpartyCollectAccountResponse: CounterpartyCollectAccountResponse) =
            apply {
                this.id = counterpartyCollectAccountResponse.id
                this.isResend = counterpartyCollectAccountResponse.isResend
                this.formLink = counterpartyCollectAccountResponse.formLink
                additionalProperties(counterpartyCollectAccountResponse.additionalProperties)
            }

        /** The id of the existing counterparty. */
        fun id(id: String) = id(JsonField.of(id))

        /** The id of the existing counterparty. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * This field will be `true` if an email requesting account details has already been sent to
         * this counterparty.
         */
        fun isResend(isResend: Boolean) = isResend(JsonField.of(isResend))

        /**
         * This field will be `true` if an email requesting account details has already been sent to
         * this counterparty.
         */
        @JsonProperty("is_resend")
        @ExcludeMissing
        fun isResend(isResend: JsonField<Boolean>) = apply { this.isResend = isResend }

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
        @JsonProperty("form_link")
        @ExcludeMissing
        fun formLink(formLink: JsonField<String>) = apply { this.formLink = formLink }

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

        fun build(): CounterpartyCollectAccountResponse =
            CounterpartyCollectAccountResponse(
                id,
                isResend,
                formLink,
                additionalProperties.toUnmodifiable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CounterpartyCollectAccountResponse &&
            this.id == other.id &&
            this.isResend == other.isResend &&
            this.formLink == other.formLink &&
            this.additionalProperties == other.additionalProperties
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    isResend,
                    formLink,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CounterpartyCollectAccountResponse{id=$id, isResend=$isResend, formLink=$formLink, additionalProperties=$additionalProperties}"
}
