// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects

class CounterpartyCollectAccountParams
constructor(
    private val id: String,
    private val direction: TransactionDirection,
    private val customRedirect: String?,
    private val fields: List<Field>?,
    private val sendEmail: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun direction(): TransactionDirection = direction

    fun customRedirect(): String? = customRedirect

    fun fields(): List<Field>? = fields

    fun sendEmail(): Boolean? = sendEmail

    internal fun getBody(): CounterpartyCollectAccountBody {
        return CounterpartyCollectAccountBody(
            direction,
            customRedirect,
            fields,
            sendEmail,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @JsonDeserialize(builder = CounterpartyCollectAccountBody.Builder::class)
    @NoAutoDetect
    class CounterpartyCollectAccountBody
    internal constructor(
        private val direction: TransactionDirection?,
        private val customRedirect: String?,
        private val fields: List<Field>?,
        private val sendEmail: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * One of `credit` or `debit`. Use `credit` when you want to pay a counterparty. Use `debit`
         * when you need to charge a counterparty. This field helps us send a more tailored email to
         * your counterparties."
         */
        @JsonProperty("direction") fun direction(): TransactionDirection? = direction

        /**
         * The URL you want your customer to visit upon filling out the form. By default, they will
         * be sent to a Modern Treasury landing page. This must be a valid HTTPS URL if set.
         */
        @JsonProperty("custom_redirect") fun customRedirect(): String? = customRedirect

        /**
         * The list of fields you want on the form. This field is optional and if it is not set,
         * will default to
         * [\"nameOnAccount\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\"].
         * The full list of options is
         * [\"name\", \"nameOnAccount\", \"taxpayerIdentifier\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\", \"ibanNumber\", \"swiftCode\"].
         */
        @JsonProperty("fields") fun fields(): List<Field>? = fields

        /**
         * By default, Modern Treasury will send an email to your counterparty that includes a link
         * to the form they must fill out. However, if you would like to send the counterparty the
         * link, you can set this parameter to `false`. The JSON body will include the link to the
         * secure Modern Treasury form.
         */
        @JsonProperty("send_email") fun sendEmail(): Boolean? = sendEmail

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CounterpartyCollectAccountBody &&
                this.direction == other.direction &&
                this.customRedirect == other.customRedirect &&
                this.fields == other.fields &&
                this.sendEmail == other.sendEmail &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        direction,
                        customRedirect,
                        fields,
                        sendEmail,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CounterpartyCollectAccountBody{direction=$direction, customRedirect=$customRedirect, fields=$fields, sendEmail=$sendEmail, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var direction: TransactionDirection? = null
            private var customRedirect: String? = null
            private var fields: List<Field>? = null
            private var sendEmail: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(counterpartyCollectAccountBody: CounterpartyCollectAccountBody) =
                apply {
                    this.direction = counterpartyCollectAccountBody.direction
                    this.customRedirect = counterpartyCollectAccountBody.customRedirect
                    this.fields = counterpartyCollectAccountBody.fields
                    this.sendEmail = counterpartyCollectAccountBody.sendEmail
                    additionalProperties(counterpartyCollectAccountBody.additionalProperties)
                }

            /**
             * One of `credit` or `debit`. Use `credit` when you want to pay a counterparty. Use
             * `debit` when you need to charge a counterparty. This field helps us send a more
             * tailored email to your counterparties."
             */
            @JsonProperty("direction")
            fun direction(direction: TransactionDirection) = apply { this.direction = direction }

            /**
             * The URL you want your customer to visit upon filling out the form. By default, they
             * will be sent to a Modern Treasury landing page. This must be a valid HTTPS URL if
             * set.
             */
            @JsonProperty("custom_redirect")
            fun customRedirect(customRedirect: String) = apply {
                this.customRedirect = customRedirect
            }

            /**
             * The list of fields you want on the form. This field is optional and if it is not set,
             * will default to
             * [\"nameOnAccount\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\"].
             * The full list of options is
             * [\"name\", \"nameOnAccount\", \"taxpayerIdentifier\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\", \"ibanNumber\", \"swiftCode\"].
             */
            @JsonProperty("fields") fun fields(fields: List<Field>) = apply { this.fields = fields }

            /**
             * By default, Modern Treasury will send an email to your counterparty that includes a
             * link to the form they must fill out. However, if you would like to send the
             * counterparty the link, you can set this parameter to `false`. The JSON body will
             * include the link to the secure Modern Treasury form.
             */
            @JsonProperty("send_email")
            fun sendEmail(sendEmail: Boolean) = apply { this.sendEmail = sendEmail }

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

            fun build(): CounterpartyCollectAccountBody =
                CounterpartyCollectAccountBody(
                    checkNotNull(direction) { "`direction` is required but was not set" },
                    customRedirect,
                    fields?.toUnmodifiable(),
                    sendEmail,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CounterpartyCollectAccountParams &&
            this.id == other.id &&
            this.direction == other.direction &&
            this.customRedirect == other.customRedirect &&
            this.fields == other.fields &&
            this.sendEmail == other.sendEmail &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            id,
            direction,
            customRedirect,
            fields,
            sendEmail,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "CounterpartyCollectAccountParams{id=$id, direction=$direction, customRedirect=$customRedirect, fields=$fields, sendEmail=$sendEmail, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var direction: TransactionDirection? = null
        private var customRedirect: String? = null
        private var fields: MutableList<Field> = mutableListOf()
        private var sendEmail: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(counterpartyCollectAccountParams: CounterpartyCollectAccountParams) =
            apply {
                this.id = counterpartyCollectAccountParams.id
                this.direction = counterpartyCollectAccountParams.direction
                this.customRedirect = counterpartyCollectAccountParams.customRedirect
                this.fields(counterpartyCollectAccountParams.fields ?: listOf())
                this.sendEmail = counterpartyCollectAccountParams.sendEmail
                additionalQueryParams(counterpartyCollectAccountParams.additionalQueryParams)
                additionalHeaders(counterpartyCollectAccountParams.additionalHeaders)
                additionalBodyProperties(counterpartyCollectAccountParams.additionalBodyProperties)
            }

        fun id(id: String) = apply { this.id = id }

        /**
         * One of `credit` or `debit`. Use `credit` when you want to pay a counterparty. Use `debit`
         * when you need to charge a counterparty. This field helps us send a more tailored email to
         * your counterparties."
         */
        fun direction(direction: TransactionDirection) = apply { this.direction = direction }

        /**
         * The URL you want your customer to visit upon filling out the form. By default, they will
         * be sent to a Modern Treasury landing page. This must be a valid HTTPS URL if set.
         */
        fun customRedirect(customRedirect: String) = apply { this.customRedirect = customRedirect }

        /**
         * The list of fields you want on the form. This field is optional and if it is not set,
         * will default to
         * [\"nameOnAccount\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\"].
         * The full list of options is
         * [\"name\", \"nameOnAccount\", \"taxpayerIdentifier\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\", \"ibanNumber\", \"swiftCode\"].
         */
        fun fields(fields: List<Field>) = apply {
            this.fields.clear()
            this.fields.addAll(fields)
        }

        /**
         * The list of fields you want on the form. This field is optional and if it is not set,
         * will default to
         * [\"nameOnAccount\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\"].
         * The full list of options is
         * [\"name\", \"nameOnAccount\", \"taxpayerIdentifier\", \"accountType\", \"accountNumber\", \"routingNumber\", \"address\", \"ibanNumber\", \"swiftCode\"].
         */
        fun addField(field: Field) = apply { this.fields.add(field) }

        /**
         * By default, Modern Treasury will send an email to your counterparty that includes a link
         * to the form they must fill out. However, if you would like to send the counterparty the
         * link, you can set this parameter to `false`. The JSON body will include the link to the
         * secure Modern Treasury form.
         */
        fun sendEmail(sendEmail: Boolean) = apply { this.sendEmail = sendEmail }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): CounterpartyCollectAccountParams =
            CounterpartyCollectAccountParams(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(direction) { "`direction` is required but was not set" },
                customRedirect,
                if (fields.size == 0) null else fields.toUnmodifiable(),
                sendEmail,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Field
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Field && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val NAME = Field(JsonField.of("name"))

            val NAME_ON_ACCOUNT = Field(JsonField.of("nameOnAccount"))

            val TAXPAYER_IDENTIFIER = Field(JsonField.of("taxpayerIdentifier"))

            val ACCOUNT_TYPE = Field(JsonField.of("accountType"))

            val ACCOUNT_NUMBER = Field(JsonField.of("accountNumber"))

            val IBAN_NUMBER = Field(JsonField.of("ibanNumber"))

            val CLABE_NUMBER = Field(JsonField.of("clabeNumber"))

            val WALLET_ADDRESS = Field(JsonField.of("walletAddress"))

            val PAN_NUMBER = Field(JsonField.of("panNumber"))

            val ROUTING_NUMBER = Field(JsonField.of("routingNumber"))

            val ABA_WIRE_ROUTING_NUMBER = Field(JsonField.of("abaWireRoutingNumber"))

            val SWIFT_CODE = Field(JsonField.of("swiftCode"))

            val AU_BSB = Field(JsonField.of("auBsb"))

            val CA_CPA = Field(JsonField.of("caCpa"))

            val CNAPS = Field(JsonField.of("cnaps"))

            val GB_SORT_CODE = Field(JsonField.of("gbSortCode"))

            val IN_IFSC = Field(JsonField.of("inIfsc"))

            val MY_BRANCH_CODE = Field(JsonField.of("myBranchCode"))

            val BR_CODIGO = Field(JsonField.of("brCodigo"))

            val ROUTING_NUMBER_TYPE = Field(JsonField.of("routingNumberType"))

            val ADDRESS = Field(JsonField.of("address"))

            val JP_ZENGIN_CODE = Field(JsonField.of("jp_zengin_code"))

            val SE_BANKGIRO_CLEARING_CODE = Field(JsonField.of("se_bankgiro_clearing_code"))

            val NZ_NATIONAL_CLEARING_CODE = Field(JsonField.of("nz_national_clearing_code"))

            val HK_INTERBANK_CLEARING_CODE = Field(JsonField.of("hk_interbank_clearing_code"))

            val HU_INTERBANK_CLEARING_CODE = Field(JsonField.of("hu_interbank_clearing_code"))

            val DK_INTERBANK_CLEARING_CODE = Field(JsonField.of("dk_interbank_clearing_code"))

            val ID_SKNBI_CODE = Field(JsonField.of("id_sknbi_code"))

            fun of(value: String) = Field(JsonField.of(value))
        }

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
        }

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
            _UNKNOWN,
        }

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
                else -> Value._UNKNOWN
            }

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
                else -> throw ModernTreasuryInvalidDataException("Unknown Field: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
