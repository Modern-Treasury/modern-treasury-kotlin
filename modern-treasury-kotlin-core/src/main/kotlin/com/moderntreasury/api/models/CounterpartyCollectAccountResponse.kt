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

class CounterpartyCollectAccountResponse
private constructor(
    private val id: JsonField<String>,
    private val formLink: JsonField<String>,
    private val isResend: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("form_link") @ExcludeMissing formLink: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_resend") @ExcludeMissing isResend: JsonField<Boolean> = JsonMissing.of(),
    ) : this(id, formLink, isResend, mutableMapOf())

    /**
     * The id of the existing counterparty.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * This is the link to the secure Modern Treasury form. By default, Modern Treasury will send an
     * email to your counterparty that includes a link to this form. However, if `send_email` is
     * passed as `false` in the body then Modern Treasury will not send the email and you can send
     * it to the counterparty directly.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun formLink(): String = formLink.getRequired("form_link")

    /**
     * This field will be `true` if an email requesting account details has already been sent to
     * this counterparty.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isResend(): Boolean = isResend.getRequired("is_resend")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [formLink].
     *
     * Unlike [formLink], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("form_link") @ExcludeMissing fun _formLink(): JsonField<String> = formLink

    /**
     * Returns the raw JSON value of [isResend].
     *
     * Unlike [isResend], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_resend") @ExcludeMissing fun _isResend(): JsonField<Boolean> = isResend

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
         * [CounterpartyCollectAccountResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .formLink()
         * .isResend()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CounterpartyCollectAccountResponse]. */
    class Builder internal constructor() {

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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * This is the link to the secure Modern Treasury form. By default, Modern Treasury will
         * send an email to your counterparty that includes a link to this form. However, if
         * `send_email` is passed as `false` in the body then Modern Treasury will not send the
         * email and you can send it to the counterparty directly.
         */
        fun formLink(formLink: String) = formLink(JsonField.of(formLink))

        /**
         * Sets [Builder.formLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formLink] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun formLink(formLink: JsonField<String>) = apply { this.formLink = formLink }

        /**
         * This field will be `true` if an email requesting account details has already been sent to
         * this counterparty.
         */
        fun isResend(isResend: Boolean) = isResend(JsonField.of(isResend))

        /**
         * Sets [Builder.isResend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isResend] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        /**
         * Returns an immutable instance of [CounterpartyCollectAccountResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .formLink()
         * .isResend()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CounterpartyCollectAccountResponse =
            CounterpartyCollectAccountResponse(
                checkRequired("id", id),
                checkRequired("formLink", formLink),
                checkRequired("isResend", isResend),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CounterpartyCollectAccountResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        formLink()
        isResend()
        validated = true
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
