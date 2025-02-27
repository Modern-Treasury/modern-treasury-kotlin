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
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Objects

/** Send an email requesting account details. */
class CounterpartyCollectAccountParams
private constructor(
    private val id: String,
    private val body: CounterpartyCollectAccountBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    /**
     * One of `credit` or `debit`. Use `credit` when you want to pay a counterparty. Use `debit`
     * when you need to charge a counterparty. This field helps us send a more tailored email to
     * your counterparties."
     */
    fun direction(): TransactionDirection = body.direction()

    /**
     * The URL you want your customer to visit upon filling out the form. By default, they will be
     * sent to a Modern Treasury landing page. This must be a valid HTTPS URL if set.
     */
    fun customRedirect(): String? = body.customRedirect()

    /**
     * The list of fields you want on the form. This field is optional and if it is not set, will
     * default to
     * [\"nameOnAccount\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\"]. The
     * full list of options is
     * [\"name\", \"nameOnAccount\", \"taxpayerIdentifier\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\", \"ibanNumber\", \"swiftCode\"].
     */
    fun fields(): List<Field>? = body.fields()

    /**
     * By default, Modern Treasury will send an email to your counterparty that includes a link to
     * the form they must fill out. However, if you would like to send the counterparty the link,
     * you can set this parameter to `false`. The JSON body will include the link to the secure
     * Modern Treasury form.
     */
    fun sendEmail(): Boolean? = body.sendEmail()

    /**
     * One of `credit` or `debit`. Use `credit` when you want to pay a counterparty. Use `debit`
     * when you need to charge a counterparty. This field helps us send a more tailored email to
     * your counterparties."
     */
    fun _direction(): JsonField<TransactionDirection> = body._direction()

    /**
     * The URL you want your customer to visit upon filling out the form. By default, they will be
     * sent to a Modern Treasury landing page. This must be a valid HTTPS URL if set.
     */
    fun _customRedirect(): JsonField<String> = body._customRedirect()

    /**
     * The list of fields you want on the form. This field is optional and if it is not set, will
     * default to
     * [\"nameOnAccount\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\"]. The
     * full list of options is
     * [\"name\", \"nameOnAccount\", \"taxpayerIdentifier\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\", \"ibanNumber\", \"swiftCode\"].
     */
    fun _fields(): JsonField<List<Field>> = body._fields()

    /**
     * By default, Modern Treasury will send an email to your counterparty that includes a link to
     * the form they must fill out. However, if you would like to send the counterparty the link,
     * you can set this parameter to `false`. The JSON body will include the link to the secure
     * Modern Treasury form.
     */
    fun _sendEmail(): JsonField<Boolean> = body._sendEmail()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): CounterpartyCollectAccountBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class CounterpartyCollectAccountBody
    @JsonCreator
    internal constructor(
        @JsonProperty("direction")
        @ExcludeMissing
        private val direction: JsonField<TransactionDirection> = JsonMissing.of(),
        @JsonProperty("custom_redirect")
        @ExcludeMissing
        private val customRedirect: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fields")
        @ExcludeMissing
        private val fields: JsonField<List<Field>> = JsonMissing.of(),
        @JsonProperty("send_email")
        @ExcludeMissing
        private val sendEmail: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * One of `credit` or `debit`. Use `credit` when you want to pay a counterparty. Use `debit`
         * when you need to charge a counterparty. This field helps us send a more tailored email to
         * your counterparties."
         */
        fun direction(): TransactionDirection = direction.getRequired("direction")

        /**
         * The URL you want your customer to visit upon filling out the form. By default, they will
         * be sent to a Modern Treasury landing page. This must be a valid HTTPS URL if set.
         */
        fun customRedirect(): String? = customRedirect.getNullable("custom_redirect")

        /**
         * The list of fields you want on the form. This field is optional and if it is not set,
         * will default to
         * [\"nameOnAccount\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\"].
         * The full list of options is
         * [\"name\", \"nameOnAccount\", \"taxpayerIdentifier\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\", \"ibanNumber\", \"swiftCode\"].
         */
        fun fields(): List<Field>? = fields.getNullable("fields")

        /**
         * By default, Modern Treasury will send an email to your counterparty that includes a link
         * to the form they must fill out. However, if you would like to send the counterparty the
         * link, you can set this parameter to `false`. The JSON body will include the link to the
         * secure Modern Treasury form.
         */
        fun sendEmail(): Boolean? = sendEmail.getNullable("send_email")

        /**
         * One of `credit` or `debit`. Use `credit` when you want to pay a counterparty. Use `debit`
         * when you need to charge a counterparty. This field helps us send a more tailored email to
         * your counterparties."
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<TransactionDirection> = direction

        /**
         * The URL you want your customer to visit upon filling out the form. By default, they will
         * be sent to a Modern Treasury landing page. This must be a valid HTTPS URL if set.
         */
        @JsonProperty("custom_redirect")
        @ExcludeMissing
        fun _customRedirect(): JsonField<String> = customRedirect

        /**
         * The list of fields you want on the form. This field is optional and if it is not set,
         * will default to
         * [\"nameOnAccount\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\"].
         * The full list of options is
         * [\"name\", \"nameOnAccount\", \"taxpayerIdentifier\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\", \"ibanNumber\", \"swiftCode\"].
         */
        @JsonProperty("fields") @ExcludeMissing fun _fields(): JsonField<List<Field>> = fields

        /**
         * By default, Modern Treasury will send an email to your counterparty that includes a link
         * to the form they must fill out. However, if you would like to send the counterparty the
         * link, you can set this parameter to `false`. The JSON body will include the link to the
         * secure Modern Treasury form.
         */
        @JsonProperty("send_email") @ExcludeMissing fun _sendEmail(): JsonField<Boolean> = sendEmail

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CounterpartyCollectAccountBody = apply {
            if (validated) {
                return@apply
            }

            direction()
            customRedirect()
            fields()
            sendEmail()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [CounterpartyCollectAccountBody]. */
        class Builder internal constructor() {

            private var direction: JsonField<TransactionDirection>? = null
            private var customRedirect: JsonField<String> = JsonMissing.of()
            private var fields: JsonField<MutableList<Field>>? = null
            private var sendEmail: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(counterpartyCollectAccountBody: CounterpartyCollectAccountBody) =
                apply {
                    direction = counterpartyCollectAccountBody.direction
                    customRedirect = counterpartyCollectAccountBody.customRedirect
                    fields = counterpartyCollectAccountBody.fields.map { it.toMutableList() }
                    sendEmail = counterpartyCollectAccountBody.sendEmail
                    additionalProperties =
                        counterpartyCollectAccountBody.additionalProperties.toMutableMap()
                }

            /**
             * One of `credit` or `debit`. Use `credit` when you want to pay a counterparty. Use
             * `debit` when you need to charge a counterparty. This field helps us send a more
             * tailored email to your counterparties."
             */
            fun direction(direction: TransactionDirection) = direction(JsonField.of(direction))

            /**
             * One of `credit` or `debit`. Use `credit` when you want to pay a counterparty. Use
             * `debit` when you need to charge a counterparty. This field helps us send a more
             * tailored email to your counterparties."
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
             * The URL you want your customer to visit upon filling out the form. By default, they
             * will be sent to a Modern Treasury landing page. This must be a valid HTTPS URL if
             * set.
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
             * The list of fields you want on the form. This field is optional and if it is not set,
             * will default to
             * [\"nameOnAccount\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\"].
             * The full list of options is
             * [\"name\", \"nameOnAccount\", \"taxpayerIdentifier\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\", \"ibanNumber\", \"swiftCode\"].
             */
            fun fields(fields: JsonField<List<Field>>) = apply {
                this.fields = fields.map { it.toMutableList() }
            }

            /**
             * The list of fields you want on the form. This field is optional and if it is not set,
             * will default to
             * [\"nameOnAccount\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\"].
             * The full list of options is
             * [\"name\", \"nameOnAccount\", \"taxpayerIdentifier\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\", \"ibanNumber\", \"swiftCode\"].
             */
            fun addField(field: Field) = apply {
                fields =
                    (fields ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(field)
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
             * By default, Modern Treasury will send an email to your counterparty that includes a
             * link to the form they must fill out. However, if you would like to send the
             * counterparty the link, you can set this parameter to `false`. The JSON body will
             * include the link to the secure Modern Treasury form.
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

            fun build(): CounterpartyCollectAccountBody =
                CounterpartyCollectAccountBody(
                    checkRequired("direction", direction),
                    customRedirect,
                    (fields ?: JsonMissing.of()).map { it.toImmutable() },
                    sendEmail,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CounterpartyCollectAccountBody && direction == other.direction && customRedirect == other.customRedirect && fields == other.fields && sendEmail == other.sendEmail && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(direction, customRedirect, fields, sendEmail, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CounterpartyCollectAccountBody{direction=$direction, customRedirect=$customRedirect, fields=$fields, sendEmail=$sendEmail, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [CounterpartyCollectAccountParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var id: String? = null
        private var body: CounterpartyCollectAccountBody.Builder =
            CounterpartyCollectAccountBody.builder()
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
         * One of `credit` or `debit`. Use `credit` when you want to pay a counterparty. Use `debit`
         * when you need to charge a counterparty. This field helps us send a more tailored email to
         * your counterparties."
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
         * The URL you want your customer to visit upon filling out the form. By default, they will
         * be sent to a Modern Treasury landing page. This must be a valid HTTPS URL if set.
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
         * The list of fields you want on the form. This field is optional and if it is not set,
         * will default to
         * [\"nameOnAccount\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\"].
         * The full list of options is
         * [\"name\", \"nameOnAccount\", \"taxpayerIdentifier\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\", \"ibanNumber\", \"swiftCode\"].
         */
        fun fields(fields: JsonField<List<Field>>) = apply { body.fields(fields) }

        /**
         * The list of fields you want on the form. This field is optional and if it is not set,
         * will default to
         * [\"nameOnAccount\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\"].
         * The full list of options is
         * [\"name\", \"nameOnAccount\", \"taxpayerIdentifier\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\", \"ibanNumber\", \"swiftCode\"].
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
         * By default, Modern Treasury will send an email to your counterparty that includes a link
         * to the form they must fill out. However, if you would like to send the counterparty the
         * link, you can set this parameter to `false`. The JSON body will include the link to the
         * secure Modern Treasury form.
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

        fun build(): CounterpartyCollectAccountParams =
            CounterpartyCollectAccountParams(
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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

            val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

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
