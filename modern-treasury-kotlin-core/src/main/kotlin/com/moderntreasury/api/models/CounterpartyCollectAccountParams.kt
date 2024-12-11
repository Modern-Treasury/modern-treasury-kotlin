// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun direction(): TransactionDirection = direction

    fun customRedirect(): String? = customRedirect

    fun fields(): List<Field>? = fields

    fun sendEmail(): Boolean? = sendEmail

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): CounterpartyCollectAccountBody {
        return CounterpartyCollectAccountBody(
            direction,
            customRedirect,
            fields,
            sendEmail,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

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
                    fields?.toImmutable(),
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

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var direction: TransactionDirection? = null
        private var customRedirect: String? = null
        private var fields: MutableList<Field> = mutableListOf()
        private var sendEmail: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(counterpartyCollectAccountParams: CounterpartyCollectAccountParams) =
            apply {
                id = counterpartyCollectAccountParams.id
                direction = counterpartyCollectAccountParams.direction
                customRedirect = counterpartyCollectAccountParams.customRedirect
                fields = counterpartyCollectAccountParams.fields?.toMutableList() ?: mutableListOf()
                sendEmail = counterpartyCollectAccountParams.sendEmail
                additionalHeaders = counterpartyCollectAccountParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    counterpartyCollectAccountParams.additionalQueryParams.toBuilder()
                additionalBodyProperties =
                    counterpartyCollectAccountParams.additionalBodyProperties.toMutableMap()
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): CounterpartyCollectAccountParams =
            CounterpartyCollectAccountParams(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(direction) { "`direction` is required but was not set" },
                customRedirect,
                fields.toImmutable().ifEmpty { null },
                sendEmail,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class Field
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Field && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

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
                ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
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
                ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                else -> throw ModernTreasuryInvalidDataException("Unknown Field: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterpartyCollectAccountParams && id == other.id && direction == other.direction && customRedirect == other.customRedirect && fields == other.fields && sendEmail == other.sendEmail && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, direction, customRedirect, fields, sendEmail, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CounterpartyCollectAccountParams{id=$id, direction=$direction, customRedirect=$customRedirect, fields=$fields, sendEmail=$sendEmail, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
