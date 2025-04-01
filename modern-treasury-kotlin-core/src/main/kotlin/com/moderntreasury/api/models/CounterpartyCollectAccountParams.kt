// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.Objects

/** Send an email requesting account details. */
class CounterpartyCollectAccountParams
private constructor(
    private val id: String,
    private val body: CounterpartyCollectAccountRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    /**
     * One of `credit` or `debit`. Use `credit` when you want to pay a counterparty. Use `debit`
     * when you need to charge a counterparty. This field helps us send a more tailored email to
     * your counterparties."
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun direction(): TransactionDirection = body.direction()

    /**
     * The URL you want your customer to visit upon filling out the form. By default, they will be
     * sent to a Modern Treasury landing page. This must be a valid HTTPS URL if set.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customRedirect(): String? = body.customRedirect()

    /**
     * The list of fields you want on the form. This field is optional and if it is not set, will
     * default to
     * [\"nameOnAccount\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\"]. The
     * full list of options is
     * [\"name\", \"nameOnAccount\", \"taxpayerIdentifier\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\", \"ibanNumber\", \"swiftCode\"].
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fields(): List<Field>? = body.fields()

    /**
     * By default, Modern Treasury will send an email to your counterparty that includes a link to
     * the form they must fill out. However, if you would like to send the counterparty the link,
     * you can set this parameter to `false`. The JSON body will include the link to the secure
     * Modern Treasury form.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sendEmail(): Boolean? = body.sendEmail()

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _direction(): JsonField<TransactionDirection> = body._direction()

    /**
     * Returns the raw JSON value of [customRedirect].
     *
     * Unlike [customRedirect], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customRedirect(): JsonField<String> = body._customRedirect()

    /**
     * Returns the raw JSON value of [fields].
     *
     * Unlike [fields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fields(): JsonField<List<Field>> = body._fields()

    /**
     * Returns the raw JSON value of [sendEmail].
     *
     * Unlike [sendEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sendEmail(): JsonField<Boolean> = body._sendEmail()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CounterpartyCollectAccountParams].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .direction()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CounterpartyCollectAccountParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: CounterpartyCollectAccountRequest.Builder =
            CounterpartyCollectAccountRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(counterpartyCollectAccountParams: CounterpartyCollectAccountParams) =
            apply {
                id = counterpartyCollectAccountParams.id
                body = counterpartyCollectAccountParams.body.toBuilder()
                additionalHeaders = counterpartyCollectAccountParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    counterpartyCollectAccountParams.additionalQueryParams.toBuilder()
            }

        fun id(id: String) = apply { this.id = id }

        /**
         * One of `credit` or `debit`. Use `credit` when you want to pay a counterparty. Use `debit`
         * when you need to charge a counterparty. This field helps us send a more tailored email to
         * your counterparties."
         */
        fun direction(direction: TransactionDirection) = apply { body.direction(direction) }

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [TransactionDirection]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun direction(direction: JsonField<TransactionDirection>) = apply {
            body.direction(direction)
        }

        /**
         * The URL you want your customer to visit upon filling out the form. By default, they will
         * be sent to a Modern Treasury landing page. This must be a valid HTTPS URL if set.
         */
        fun customRedirect(customRedirect: String) = apply { body.customRedirect(customRedirect) }

        /**
         * Sets [Builder.customRedirect] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customRedirect] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customRedirect(customRedirect: JsonField<String>) = apply {
            body.customRedirect(customRedirect)
        }

        /**
         * The list of fields you want on the form. This field is optional and if it is not set,
         * will default to
         * [\"nameOnAccount\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\"].
         * The full list of options is
         * [\"name\", \"nameOnAccount\", \"taxpayerIdentifier\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\", \"ibanNumber\", \"swiftCode\"].
         */
        fun fields(fields: List<Field>) = apply { body.fields(fields) }

        /**
         * Sets [Builder.fields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fields] with a well-typed `List<Field>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fields(fields: JsonField<List<Field>>) = apply { body.fields(fields) }

        /**
         * Adds a single [Field] to [fields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addField(field: Field) = apply { body.addField(field) }

        /**
         * By default, Modern Treasury will send an email to your counterparty that includes a link
         * to the form they must fill out. However, if you would like to send the counterparty the
         * link, you can set this parameter to `false`. The JSON body will include the link to the
         * secure Modern Treasury form.
         */
        fun sendEmail(sendEmail: Boolean) = apply { body.sendEmail(sendEmail) }

        /**
         * Sets [Builder.sendEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendEmail] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sendEmail(sendEmail: JsonField<Boolean>) = apply { body.sendEmail(sendEmail) }

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
         * Returns an immutable instance of [CounterpartyCollectAccountParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .direction()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CounterpartyCollectAccountParams =
            CounterpartyCollectAccountParams(
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    internal fun _body(): CounterpartyCollectAccountRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class CounterpartyCollectAccountRequest
    private constructor(
        private val direction: JsonField<TransactionDirection>,
        private val customRedirect: JsonField<String>,
        private val fields: JsonField<List<Field>>,
        private val sendEmail: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<TransactionDirection> = JsonMissing.of(),
            @JsonProperty("custom_redirect")
            @ExcludeMissing
            customRedirect: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fields")
            @ExcludeMissing
            fields: JsonField<List<Field>> = JsonMissing.of(),
            @JsonProperty("send_email")
            @ExcludeMissing
            sendEmail: JsonField<Boolean> = JsonMissing.of(),
        ) : this(direction, customRedirect, fields, sendEmail, mutableMapOf())

        /**
         * One of `credit` or `debit`. Use `credit` when you want to pay a counterparty. Use `debit`
         * when you need to charge a counterparty. This field helps us send a more tailored email to
         * your counterparties."
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun direction(): TransactionDirection = direction.getRequired("direction")

        /**
         * The URL you want your customer to visit upon filling out the form. By default, they will
         * be sent to a Modern Treasury landing page. This must be a valid HTTPS URL if set.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customRedirect(): String? = customRedirect.getNullable("custom_redirect")

        /**
         * The list of fields you want on the form. This field is optional and if it is not set,
         * will default to
         * [\"nameOnAccount\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\"].
         * The full list of options is
         * [\"name\", \"nameOnAccount\", \"taxpayerIdentifier\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\", \"ibanNumber\", \"swiftCode\"].
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun fields(): List<Field>? = fields.getNullable("fields")

        /**
         * By default, Modern Treasury will send an email to your counterparty that includes a link
         * to the form they must fill out. However, if you would like to send the counterparty the
         * link, you can set this parameter to `false`. The JSON body will include the link to the
         * secure Modern Treasury form.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sendEmail(): Boolean? = sendEmail.getNullable("send_email")

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<TransactionDirection> = direction

        /**
         * Returns the raw JSON value of [customRedirect].
         *
         * Unlike [customRedirect], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_redirect")
        @ExcludeMissing
        fun _customRedirect(): JsonField<String> = customRedirect

        /**
         * Returns the raw JSON value of [fields].
         *
         * Unlike [fields], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fields") @ExcludeMissing fun _fields(): JsonField<List<Field>> = fields

        /**
         * Returns the raw JSON value of [sendEmail].
         *
         * Unlike [sendEmail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("send_email") @ExcludeMissing fun _sendEmail(): JsonField<Boolean> = sendEmail

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
             * [CounterpartyCollectAccountRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .direction()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CounterpartyCollectAccountRequest]. */
        class Builder internal constructor() {

            private var direction: JsonField<TransactionDirection>? = null
            private var customRedirect: JsonField<String> = JsonMissing.of()
            private var fields: JsonField<MutableList<Field>>? = null
            private var sendEmail: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                counterpartyCollectAccountRequest: CounterpartyCollectAccountRequest
            ) = apply {
                direction = counterpartyCollectAccountRequest.direction
                customRedirect = counterpartyCollectAccountRequest.customRedirect
                fields = counterpartyCollectAccountRequest.fields.map { it.toMutableList() }
                sendEmail = counterpartyCollectAccountRequest.sendEmail
                additionalProperties =
                    counterpartyCollectAccountRequest.additionalProperties.toMutableMap()
            }

            /**
             * One of `credit` or `debit`. Use `credit` when you want to pay a counterparty. Use
             * `debit` when you need to charge a counterparty. This field helps us send a more
             * tailored email to your counterparties."
             */
            fun direction(direction: TransactionDirection) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [TransactionDirection]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun direction(direction: JsonField<TransactionDirection>) = apply {
                this.direction = direction
            }

            /**
             * The URL you want your customer to visit upon filling out the form. By default, they
             * will be sent to a Modern Treasury landing page. This must be a valid HTTPS URL if
             * set.
             */
            fun customRedirect(customRedirect: String) =
                customRedirect(JsonField.of(customRedirect))

            /**
             * Sets [Builder.customRedirect] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customRedirect] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customRedirect(customRedirect: JsonField<String>) = apply {
                this.customRedirect = customRedirect
            }

            /**
             * The list of fields you want on the form. This field is optional and if it is not set,
             * will default to
             * [\"nameOnAccount\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\"].
             * The full list of options is
             * [\"name\", \"nameOnAccount\", \"taxpayerIdentifier\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\", \"ibanNumber\", \"swiftCode\"].
             */
            fun fields(fields: List<Field>) = fields(JsonField.of(fields))

            /**
             * Sets [Builder.fields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fields] with a well-typed `List<Field>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fields(fields: JsonField<List<Field>>) = apply {
                this.fields = fields.map { it.toMutableList() }
            }

            /**
             * Adds a single [Field] to [fields].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addField(field: Field) = apply {
                fields =
                    (fields ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fields", it).add(field)
                    }
            }

            /**
             * By default, Modern Treasury will send an email to your counterparty that includes a
             * link to the form they must fill out. However, if you would like to send the
             * counterparty the link, you can set this parameter to `false`. The JSON body will
             * include the link to the secure Modern Treasury form.
             */
            fun sendEmail(sendEmail: Boolean) = sendEmail(JsonField.of(sendEmail))

            /**
             * Sets [Builder.sendEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sendEmail] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sendEmail(sendEmail: JsonField<Boolean>) = apply { this.sendEmail = sendEmail }

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
             * Returns an immutable instance of [CounterpartyCollectAccountRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .direction()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CounterpartyCollectAccountRequest =
                CounterpartyCollectAccountRequest(
                    checkRequired("direction", direction),
                    customRedirect,
                    (fields ?: JsonMissing.of()).map { it.toImmutable() },
                    sendEmail,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CounterpartyCollectAccountRequest = apply {
            if (validated) {
                return@apply
            }

            direction().validate()
            customRedirect()
            fields()?.forEach { it.validate() }
            sendEmail()
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
            (direction.asKnown()?.validity() ?: 0) +
                (if (customRedirect.asKnown() == null) 0 else 1) +
                (fields.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (sendEmail.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CounterpartyCollectAccountRequest && direction == other.direction && customRedirect == other.customRedirect && fields == other.fields && sendEmail == other.sendEmail && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(direction, customRedirect, fields, sendEmail, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CounterpartyCollectAccountRequest{direction=$direction, customRedirect=$customRedirect, fields=$fields, sendEmail=$sendEmail, additionalProperties=$additionalProperties}"
    }

    class Field @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val NAME = of("name")

            val NAME_ON_ACCOUNT = of("nameOnAccount")

            val TAXPAYER_IDENTIFIER = of("taxpayerIdentifier")

            val ACCOUNT_TYPE = of("accountType")

            val ACCOUNT_NUMBER = of("accountNumber")

            val IBAN_NUMBER = of("ibanNumber")

            val CLABE_NUMBER = of("clabeNumber")

            val WALLET_ADDRESS = of("walletAddress")

            val PAN_NUMBER = of("panNumber")

            val ROUTING_NUMBER = of("routingNumber")

            val ABA_WIRE_ROUTING_NUMBER = of("abaWireRoutingNumber")

            val SWIFT_CODE = of("swiftCode")

            val AU_BSB = of("auBsb")

            val CA_CPA = of("caCpa")

            val CNAPS = of("cnaps")

            val GB_SORT_CODE = of("gbSortCode")

            val IN_IFSC = of("inIfsc")

            val MY_BRANCH_CODE = of("myBranchCode")

            val BR_CODIGO = of("brCodigo")

            val ROUTING_NUMBER_TYPE = of("routingNumberType")

            val ADDRESS = of("address")

            val JP_ZENGIN_CODE = of("jpZenginCode")

            val SE_BANKGIRO_CLEARING_CODE = of("seBankgiroClearingCode")

            val NZ_NATIONAL_CLEARING_CODE = of("nzNationalClearingCode")

            val HK_INTERBANK_CLEARING_CODE = of("hkInterbankClearingCode")

            val HU_INTERBANK_CLEARING_CODE = of("huInterbankClearingCode")

            val DK_INTERBANK_CLEARING_CODE = of("dkInterbankClearingCode")

            val ID_SKNBI_CODE = of("idSknbiCode")

            val ZA_NATIONAL_CLEARING_CODE = of("zaNationalClearingCode")

            fun of(value: String) = Field(JsonField.of(value))
        }

        /** An enum containing [Field]'s known values. */
        enum class Known {
            NAME,
            NAME_ON_ACCOUNT,
            TAXPAYER_IDENTIFIER,
            ACCOUNT_TYPE,
            ACCOUNT_NUMBER,
            IBAN_NUMBER,
            CLABE_NUMBER,
            WALLET_ADDRESS,
            PAN_NUMBER,
            ROUTING_NUMBER,
            ABA_WIRE_ROUTING_NUMBER,
            SWIFT_CODE,
            AU_BSB,
            CA_CPA,
            CNAPS,
            GB_SORT_CODE,
            IN_IFSC,
            MY_BRANCH_CODE,
            BR_CODIGO,
            ROUTING_NUMBER_TYPE,
            ADDRESS,
            JP_ZENGIN_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            NZ_NATIONAL_CLEARING_CODE,
            HK_INTERBANK_CLEARING_CODE,
            HU_INTERBANK_CLEARING_CODE,
            DK_INTERBANK_CLEARING_CODE,
            ID_SKNBI_CODE,
            ZA_NATIONAL_CLEARING_CODE,
        }

        /**
         * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Field] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NAME,
            NAME_ON_ACCOUNT,
            TAXPAYER_IDENTIFIER,
            ACCOUNT_TYPE,
            ACCOUNT_NUMBER,
            IBAN_NUMBER,
            CLABE_NUMBER,
            WALLET_ADDRESS,
            PAN_NUMBER,
            ROUTING_NUMBER,
            ABA_WIRE_ROUTING_NUMBER,
            SWIFT_CODE,
            AU_BSB,
            CA_CPA,
            CNAPS,
            GB_SORT_CODE,
            IN_IFSC,
            MY_BRANCH_CODE,
            BR_CODIGO,
            ROUTING_NUMBER_TYPE,
            ADDRESS,
            JP_ZENGIN_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            NZ_NATIONAL_CLEARING_CODE,
            HK_INTERBANK_CLEARING_CODE,
            HU_INTERBANK_CLEARING_CODE,
            DK_INTERBANK_CLEARING_CODE,
            ID_SKNBI_CODE,
            ZA_NATIONAL_CLEARING_CODE,
            /** An enum member indicating that [Field] was instantiated with an unknown value. */
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
                NAME -> Value.NAME
                NAME_ON_ACCOUNT -> Value.NAME_ON_ACCOUNT
                TAXPAYER_IDENTIFIER -> Value.TAXPAYER_IDENTIFIER
                ACCOUNT_TYPE -> Value.ACCOUNT_TYPE
                ACCOUNT_NUMBER -> Value.ACCOUNT_NUMBER
                IBAN_NUMBER -> Value.IBAN_NUMBER
                CLABE_NUMBER -> Value.CLABE_NUMBER
                WALLET_ADDRESS -> Value.WALLET_ADDRESS
                PAN_NUMBER -> Value.PAN_NUMBER
                ROUTING_NUMBER -> Value.ROUTING_NUMBER
                ABA_WIRE_ROUTING_NUMBER -> Value.ABA_WIRE_ROUTING_NUMBER
                SWIFT_CODE -> Value.SWIFT_CODE
                AU_BSB -> Value.AU_BSB
                CA_CPA -> Value.CA_CPA
                CNAPS -> Value.CNAPS
                GB_SORT_CODE -> Value.GB_SORT_CODE
                IN_IFSC -> Value.IN_IFSC
                MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                BR_CODIGO -> Value.BR_CODIGO
                ROUTING_NUMBER_TYPE -> Value.ROUTING_NUMBER_TYPE
                ADDRESS -> Value.ADDRESS
                JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                HK_INTERBANK_CLEARING_CODE -> Value.HK_INTERBANK_CLEARING_CODE
                HU_INTERBANK_CLEARING_CODE -> Value.HU_INTERBANK_CLEARING_CODE
                DK_INTERBANK_CLEARING_CODE -> Value.DK_INTERBANK_CLEARING_CODE
                ID_SKNBI_CODE -> Value.ID_SKNBI_CODE
                ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
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
                NAME -> Known.NAME
                NAME_ON_ACCOUNT -> Known.NAME_ON_ACCOUNT
                TAXPAYER_IDENTIFIER -> Known.TAXPAYER_IDENTIFIER
                ACCOUNT_TYPE -> Known.ACCOUNT_TYPE
                ACCOUNT_NUMBER -> Known.ACCOUNT_NUMBER
                IBAN_NUMBER -> Known.IBAN_NUMBER
                CLABE_NUMBER -> Known.CLABE_NUMBER
                WALLET_ADDRESS -> Known.WALLET_ADDRESS
                PAN_NUMBER -> Known.PAN_NUMBER
                ROUTING_NUMBER -> Known.ROUTING_NUMBER
                ABA_WIRE_ROUTING_NUMBER -> Known.ABA_WIRE_ROUTING_NUMBER
                SWIFT_CODE -> Known.SWIFT_CODE
                AU_BSB -> Known.AU_BSB
                CA_CPA -> Known.CA_CPA
                CNAPS -> Known.CNAPS
                GB_SORT_CODE -> Known.GB_SORT_CODE
                IN_IFSC -> Known.IN_IFSC
                MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                BR_CODIGO -> Known.BR_CODIGO
                ROUTING_NUMBER_TYPE -> Known.ROUTING_NUMBER_TYPE
                ADDRESS -> Known.ADDRESS
                JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                HK_INTERBANK_CLEARING_CODE -> Known.HK_INTERBANK_CLEARING_CODE
                HU_INTERBANK_CLEARING_CODE -> Known.HU_INTERBANK_CLEARING_CODE
                DK_INTERBANK_CLEARING_CODE -> Known.DK_INTERBANK_CLEARING_CODE
                ID_SKNBI_CODE -> Known.ID_SKNBI_CODE
                ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                else -> throw ModernTreasuryInvalidDataException("Unknown Field: $value")
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

        fun validate(): Field = apply {
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

            return /* spotless:off */ other is Field && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterpartyCollectAccountParams && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CounterpartyCollectAccountParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
