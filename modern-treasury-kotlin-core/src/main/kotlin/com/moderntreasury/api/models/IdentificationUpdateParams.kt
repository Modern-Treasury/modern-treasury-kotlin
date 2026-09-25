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
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/** Update an existing Identification. */
class IdentificationUpdateParams
private constructor(
    private val id: String?,
    private val body: IdentificationUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /**
     * The date when the Identification is no longer considered valid by the issuing authority.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expirationDate(): LocalDate? = body.expirationDate()

    /**
     * The ID number of identification document.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun idNumber(): String? = body.idNumber()

    /**
     * The type of ID number.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun idType(): IdType? = body.idType()

    /**
     * The ISO 3166-1 alpha-2 country code of the country that issued the identification
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun issuingCountry(): String? = body.issuingCountry()

    /**
     * The region in which the identifcation was issued.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun issuingRegion(): String? = body.issuingRegion()

    /**
     * Returns the raw JSON value of [expirationDate].
     *
     * Unlike [expirationDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _expirationDate(): JsonField<LocalDate> = body._expirationDate()

    /**
     * Returns the raw JSON value of [idNumber].
     *
     * Unlike [idNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _idNumber(): JsonField<String> = body._idNumber()

    /**
     * Returns the raw JSON value of [idType].
     *
     * Unlike [idType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _idType(): JsonField<IdType> = body._idType()

    /**
     * Returns the raw JSON value of [issuingCountry].
     *
     * Unlike [issuingCountry], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _issuingCountry(): JsonField<String> = body._issuingCountry()

    /**
     * Returns the raw JSON value of [issuingRegion].
     *
     * Unlike [issuingRegion], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _issuingRegion(): JsonField<String> = body._issuingRegion()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): IdentificationUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [IdentificationUpdateParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [IdentificationUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: IdentificationUpdateRequest.Builder =
            IdentificationUpdateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(identificationUpdateParams: IdentificationUpdateParams) = apply {
            id = identificationUpdateParams.id
            body = identificationUpdateParams.body.toBuilder()
            additionalHeaders = identificationUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = identificationUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [expirationDate]
         * - [idNumber]
         * - [idType]
         * - [issuingCountry]
         * - [issuingRegion]
         * - etc.
         */
        fun body(body: IdentificationUpdateRequest) = apply { this.body = body.toBuilder() }

        /**
         * The date when the Identification is no longer considered valid by the issuing authority.
         */
        fun expirationDate(expirationDate: LocalDate?) = apply {
            body.expirationDate(expirationDate)
        }

        /**
         * Sets [Builder.expirationDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expirationDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
            body.expirationDate(expirationDate)
        }

        /** The ID number of identification document. */
        fun idNumber(idNumber: String) = apply { body.idNumber(idNumber) }

        /**
         * Sets [Builder.idNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idNumber] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idNumber(idNumber: JsonField<String>) = apply { body.idNumber(idNumber) }

        /** The type of ID number. */
        fun idType(idType: IdType) = apply { body.idType(idType) }

        /**
         * Sets [Builder.idType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idType] with a well-typed [IdType] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idType(idType: JsonField<IdType>) = apply { body.idType(idType) }

        /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
        fun issuingCountry(issuingCountry: String?) = apply { body.issuingCountry(issuingCountry) }

        /**
         * Sets [Builder.issuingCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuingCountry] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun issuingCountry(issuingCountry: JsonField<String>) = apply {
            body.issuingCountry(issuingCountry)
        }

        /** The region in which the identifcation was issued. */
        fun issuingRegion(issuingRegion: String?) = apply { body.issuingRegion(issuingRegion) }

        /**
         * Sets [Builder.issuingRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuingRegion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun issuingRegion(issuingRegion: JsonField<String>) = apply {
            body.issuingRegion(issuingRegion)
        }

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
         * Returns an immutable instance of [IdentificationUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): IdentificationUpdateParams =
            IdentificationUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): IdentificationUpdateRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class IdentificationUpdateRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val expirationDate: JsonField<LocalDate>,
        private val idNumber: JsonField<String>,
        private val idType: JsonField<IdType>,
        private val issuingCountry: JsonField<String>,
        private val issuingRegion: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("expiration_date")
            @ExcludeMissing
            expirationDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("id_number")
            @ExcludeMissing
            idNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id_type") @ExcludeMissing idType: JsonField<IdType> = JsonMissing.of(),
            @JsonProperty("issuing_country")
            @ExcludeMissing
            issuingCountry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("issuing_region")
            @ExcludeMissing
            issuingRegion: JsonField<String> = JsonMissing.of(),
        ) : this(expirationDate, idNumber, idType, issuingCountry, issuingRegion, mutableMapOf())

        /**
         * The date when the Identification is no longer considered valid by the issuing authority.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expirationDate(): LocalDate? = expirationDate.getNullable("expiration_date")

        /**
         * The ID number of identification document.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun idNumber(): String? = idNumber.getNullable("id_number")

        /**
         * The type of ID number.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun idType(): IdType? = idType.getNullable("id_type")

        /**
         * The ISO 3166-1 alpha-2 country code of the country that issued the identification
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun issuingCountry(): String? = issuingCountry.getNullable("issuing_country")

        /**
         * The region in which the identifcation was issued.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun issuingRegion(): String? = issuingRegion.getNullable("issuing_region")

        /**
         * Returns the raw JSON value of [expirationDate].
         *
         * Unlike [expirationDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expiration_date")
        @ExcludeMissing
        fun _expirationDate(): JsonField<LocalDate> = expirationDate

        /**
         * Returns the raw JSON value of [idNumber].
         *
         * Unlike [idNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id_number") @ExcludeMissing fun _idNumber(): JsonField<String> = idNumber

        /**
         * Returns the raw JSON value of [idType].
         *
         * Unlike [idType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id_type") @ExcludeMissing fun _idType(): JsonField<IdType> = idType

        /**
         * Returns the raw JSON value of [issuingCountry].
         *
         * Unlike [issuingCountry], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("issuing_country")
        @ExcludeMissing
        fun _issuingCountry(): JsonField<String> = issuingCountry

        /**
         * Returns the raw JSON value of [issuingRegion].
         *
         * Unlike [issuingRegion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("issuing_region")
        @ExcludeMissing
        fun _issuingRegion(): JsonField<String> = issuingRegion

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
             * [IdentificationUpdateRequest].
             */
            fun builder() = Builder()
        }

        /** A builder for [IdentificationUpdateRequest]. */
        class Builder internal constructor() {

            private var expirationDate: JsonField<LocalDate> = JsonMissing.of()
            private var idNumber: JsonField<String> = JsonMissing.of()
            private var idType: JsonField<IdType> = JsonMissing.of()
            private var issuingCountry: JsonField<String> = JsonMissing.of()
            private var issuingRegion: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(identificationUpdateRequest: IdentificationUpdateRequest) = apply {
                expirationDate = identificationUpdateRequest.expirationDate
                idNumber = identificationUpdateRequest.idNumber
                idType = identificationUpdateRequest.idType
                issuingCountry = identificationUpdateRequest.issuingCountry
                issuingRegion = identificationUpdateRequest.issuingRegion
                additionalProperties =
                    identificationUpdateRequest.additionalProperties.toMutableMap()
            }

            /**
             * The date when the Identification is no longer considered valid by the issuing
             * authority.
             */
            fun expirationDate(expirationDate: LocalDate?) =
                expirationDate(JsonField.ofNullable(expirationDate))

            /**
             * Sets [Builder.expirationDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expirationDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expirationDate(expirationDate: JsonField<LocalDate>) = apply {
                this.expirationDate = expirationDate
            }

            /** The ID number of identification document. */
            fun idNumber(idNumber: String) = idNumber(JsonField.of(idNumber))

            /**
             * Sets [Builder.idNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idNumber] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idNumber(idNumber: JsonField<String>) = apply { this.idNumber = idNumber }

            /** The type of ID number. */
            fun idType(idType: IdType) = idType(JsonField.of(idType))

            /**
             * Sets [Builder.idType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idType] with a well-typed [IdType] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idType(idType: JsonField<IdType>) = apply { this.idType = idType }

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            fun issuingCountry(issuingCountry: String?) =
                issuingCountry(JsonField.ofNullable(issuingCountry))

            /**
             * Sets [Builder.issuingCountry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.issuingCountry] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun issuingCountry(issuingCountry: JsonField<String>) = apply {
                this.issuingCountry = issuingCountry
            }

            /** The region in which the identifcation was issued. */
            fun issuingRegion(issuingRegion: String?) =
                issuingRegion(JsonField.ofNullable(issuingRegion))

            /**
             * Sets [Builder.issuingRegion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.issuingRegion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun issuingRegion(issuingRegion: JsonField<String>) = apply {
                this.issuingRegion = issuingRegion
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

            /**
             * Returns an immutable instance of [IdentificationUpdateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): IdentificationUpdateRequest =
                IdentificationUpdateRequest(
                    expirationDate,
                    idNumber,
                    idType,
                    issuingCountry,
                    issuingRegion,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): IdentificationUpdateRequest = apply {
            if (validated) {
                return@apply
            }

            expirationDate()
            idNumber()
            idType()?.validate()
            issuingCountry()
            issuingRegion()
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
            (if (expirationDate.asKnown() == null) 0 else 1) +
                (if (idNumber.asKnown() == null) 0 else 1) +
                (idType.asKnown()?.validity() ?: 0) +
                (if (issuingCountry.asKnown() == null) 0 else 1) +
                (if (issuingRegion.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IdentificationUpdateRequest &&
                expirationDate == other.expirationDate &&
                idNumber == other.idNumber &&
                idType == other.idType &&
                issuingCountry == other.issuingCountry &&
                issuingRegion == other.issuingRegion &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                expirationDate,
                idNumber,
                idType,
                issuingCountry,
                issuingRegion,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IdentificationUpdateRequest{expirationDate=$expirationDate, idNumber=$idNumber, idType=$idType, issuingCountry=$issuingCountry, issuingRegion=$issuingRegion, additionalProperties=$additionalProperties}"
    }

    /** The type of ID number. */
    class IdType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val AD_NRT = of("ad_nrt")

            val AE_EID = of("ae_eid")

            val AE_TRN = of("ae_trn")

            val AG_TIN = of("ag_tin")

            val AI_TIN = of("ai_tin")

            val AL_NID = of("al_nid")

            val AL_NIPT = of("al_nipt")

            val AM_TIN = of("am_tin")

            val AO_NIF = of("ao_nif")

            val AR_CUIL = of("ar_cuil")

            val AR_CUIT = of("ar_cuit")

            val AT_ATIN = of("at_atin")

            val AT_VAT = of("at_vat")

            val AU_ABN = of("au_abn")

            val AU_TFN = of("au_tfn")

            val AW_TIN = of("aw_tin")

            val AZ_PIN = of("az_pin")

            val BB_TIN = of("bb_tin")

            val BD_TIN = of("bd_tin")

            val BE_ENT = of("be_ent")

            val BE_NRN = of("be_nrn")

            val BF_IFU = of("bf_ifu")

            val BG_EGN = of("bg_egn")

            val BH_CPR = of("bh_cpr")

            val BH_VAT = of("bh_vat")

            val BJ_IFU = of("bj_ifu")

            val BO_NIT = of("bo_nit")

            val BR_CNPJ = of("br_cnpj")

            val BR_CPF = of("br_cpf")

            val BS_TIN = of("bs_tin")

            val BT_BIN = of("bt_bin")

            val BW_TIN = of("bw_tin")

            val BZ_TIN = of("bz_tin")

            val CA_BN = of("ca_bn")

            val CA_SIN = of("ca_sin")

            val CH_AHV = of("ch_ahv")

            val CH_UID = of("ch_uid")

            val CI_NCC = of("ci_ncc")

            val CL_RUN = of("cl_run")

            val CL_RUT = of("cl_rut")

            val CM_NIU = of("cm_niu")

            val CO_CEDULAS = of("co_cedulas")

            val CO_NIT = of("co_nit")

            val CR_CPF = of("cr_cpf")

            val CW_CRIB = of("cw_crib")

            val CY_TIN = of("cy_tin")

            val CZ_ICO = of("cz_ico")

            val CZ_RC = of("cz_rc")

            val DE_STID = of("de_stid")

            val DE_STNR = of("de_stnr")

            val DE_VAT = of("de_vat")

            val DK_CPR = of("dk_cpr")

            val DK_CVR = of("dk_cvr")

            val DM_TIN = of("dm_tin")

            val DO_CEDULA = of("do_cedula")

            val DO_RNC = of("do_rnc")

            val DRIVERS_LICENSE = of("drivers_license")

            val EC_RUC = of("ec_ruc")

            val EE_IK = of("ee_ik")

            val EE_RK = of("ee_rk")

            val ES_NIE = of("es_nie")

            val ES_NIF = of("es_nif")

            val FI_HETU = of("fi_hetu")

            val FI_YTJ = of("fi_ytj")

            val FJ_TIN = of("fj_tin")

            val FO_PTAL = of("fo_ptal")

            val FR_NIF = of("fr_nif")

            val FR_SIREN = of("fr_siren")

            val FR_VAT = of("fr_vat")

            val GB_NINO = of("gb_nino")

            val GB_UTR = of("gb_utr")

            val GB_VAT = of("gb_vat")

            val GD_TIN = of("gd_tin")

            val GE_IC = of("ge_ic")

            val GE_PN = of("ge_pn")

            val GE_TIN = of("ge_tin")

            val GENERIC_INTERNATIONAL = of("generic_international")

            val GG_SIN = of("gg_sin")

            val GH_PIN = of("gh_pin")

            val GH_TIN = of("gh_tin")

            val GI_TRN = of("gi_trn")

            val GL_CPR = of("gl_cpr")

            val GL_GER = of("gl_ger")

            val GM_TIN = of("gm_tin")

            val GR_VAT = of("gr_vat")

            val GT_NIT = of("gt_nit")

            val HK_BRN = of("hk_brn")

            val HK_HKID = of("hk_hkid")

            val HN_ID = of("hn_id")

            val HN_RTN = of("hn_rtn")

            val HR_OIB = of("hr_oib")

            val HU_ADJ = of("hu_adj")

            val HU_ANUM = of("hu_anum")

            val ID_NIK = of("id_nik")

            val ID_NPWP = of("id_npwp")

            val IE_PPS = of("ie_pps")

            val IE_TRN = of("ie_trn")

            val IL_CN = of("il_cn")

            val IL_PIN = of("il_pin")

            val IM_TRN = of("im_trn")

            val IN_LEI = of("in_lei")

            val IS_KNT = of("is_knt")

            val IT_CF = of("it_cf")

            val IT_PIVA = of("it_piva")

            val JE_SSN = of("je_ssn")

            val JE_TIN = of("je_tin")

            val JM_TRN = of("jm_trn")

            val JO_TIN = of("jo_tin")

            val JP_HB = of("jp_hb")

            val JP_MN = of("jp_mn")

            val KE_PIN = of("ke_pin")

            val KG_PIN = of("kg_pin")

            val KN_TIN = of("kn_tin")

            val KR_BRN = of("kr_brn")

            val KR_CRN = of("kr_crn")

            val KR_RRN = of("kr_rrn")

            val KW_CID = of("kw_cid")

            val KZ_BIN = of("kz_bin")

            val KZ_IIN = of("kz_iin")

            val LA_TIN = of("la_tin")

            val LC_TIN = of("lc_tin")

            val LI_PEID = of("li_peid")

            val LK_TIN = of("lk_tin")

            val LS_TIN = of("ls_tin")

            val LT_AK = of("lt_ak")

            val LT_JAK = of("lt_jak")

            val LU_MTC = of("lu_mtc")

            val LU_VAT = of("lu_vat")

            val LV_PK = of("lv_pk")

            val LV_RN = of("lv_rn")

            val MD_IDNP = of("md_idnp")

            val ME_JMBG = of("me_jmbg")

            val ME_PIB = of("me_pib")

            val MG_NIF = of("mg_nif")

            val MH_SSN = of("mh_ssn")

            val MO_BIR = of("mo_bir")

            val MO_TIN_B = of("mo_tin_b")

            val MO_TIN_I = of("mo_tin_i")

            val MR_NIF = of("mr_nif")

            val MT_TIN = of("mt_tin")

            val MT_VAT = of("mt_vat")

            val MU_TAN = of("mu_tan")

            val MW_TPIN = of("mw_tpin")

            val MX_CURP = of("mx_curp")

            val MX_INE = of("mx_ine")

            val MX_RFC = of("mx_rfc")

            val MY_NPC = of("my_npc")

            val MY_NRIC = of("my_nric")

            val MY_TIN_B = of("my_tin_b")

            val MZ_NUIT = of("mz_nuit")

            val NA_TIN = of("na_tin")

            val NATIONAL_ID = of("national_id")

            val NL_BSN = of("nl_bsn")

            val NL_BTW = of("nl_btw")

            val NL_RSIN = of("nl_rsin")

            val NO_FDN = of("no_fdn")

            val NO_MVA = of("no_mva")

            val NO_ORGNR = of("no_orgnr")

            val NR_TIN = of("nr_tin")

            val NZ_IRD = of("nz_ird")

            val OM_CID = of("om_cid")

            val PA_CEDULA = of("pa_cedula")

            val PA_RUC = of("pa_ruc")

            val PASSPORT = of("passport")

            val PE_RUC = of("pe_ruc")

            val PG_TIN = of("pg_tin")

            val PH_TIN = of("ph_tin")

            val PL_NIP = of("pl_nip")

            val PL_PESEL = of("pl_pesel")

            val PT_NIF = of("pt_nif")

            val PY_RUC = of("py_ruc")

            val RO_CNP = of("ro_cnp")

            val RO_CUI = of("ro_cui")

            val SA_TIN = of("sa_tin")

            val SA_VAT = of("sa_vat")

            val SE_ORGNR = of("se_orgnr")

            val SE_PNMR = of("se_pnmr")

            val SG_FIN = of("sg_fin")

            val SG_NRIC = of("sg_nric")

            val SG_UEN = of("sg_uen")

            val SI_DAV = of("si_dav")

            val SI_TIN = of("si_tin")

            val SK_ICO = of("sk_ico")

            val SK_RC = of("sk_rc")

            val US_EIN = of("us_ein")

            val US_ITIN = of("us_itin")

            val US_SSN = of("us_ssn")

            val UY_RUT = of("uy_rut")

            val VN_TIN = of("vn_tin")

            fun of(value: String) = IdType(JsonField.of(value))
        }

        /** An enum containing [IdType]'s known values. */
        enum class Known {
            AD_NRT,
            AE_EID,
            AE_TRN,
            AG_TIN,
            AI_TIN,
            AL_NID,
            AL_NIPT,
            AM_TIN,
            AO_NIF,
            AR_CUIL,
            AR_CUIT,
            AT_ATIN,
            AT_VAT,
            AU_ABN,
            AU_TFN,
            AW_TIN,
            AZ_PIN,
            BB_TIN,
            BD_TIN,
            BE_ENT,
            BE_NRN,
            BF_IFU,
            BG_EGN,
            BH_CPR,
            BH_VAT,
            BJ_IFU,
            BO_NIT,
            BR_CNPJ,
            BR_CPF,
            BS_TIN,
            BT_BIN,
            BW_TIN,
            BZ_TIN,
            CA_BN,
            CA_SIN,
            CH_AHV,
            CH_UID,
            CI_NCC,
            CL_RUN,
            CL_RUT,
            CM_NIU,
            CO_CEDULAS,
            CO_NIT,
            CR_CPF,
            CW_CRIB,
            CY_TIN,
            CZ_ICO,
            CZ_RC,
            DE_STID,
            DE_STNR,
            DE_VAT,
            DK_CPR,
            DK_CVR,
            DM_TIN,
            DO_CEDULA,
            DO_RNC,
            DRIVERS_LICENSE,
            EC_RUC,
            EE_IK,
            EE_RK,
            ES_NIE,
            ES_NIF,
            FI_HETU,
            FI_YTJ,
            FJ_TIN,
            FO_PTAL,
            FR_NIF,
            FR_SIREN,
            FR_VAT,
            GB_NINO,
            GB_UTR,
            GB_VAT,
            GD_TIN,
            GE_IC,
            GE_PN,
            GE_TIN,
            GENERIC_INTERNATIONAL,
            GG_SIN,
            GH_PIN,
            GH_TIN,
            GI_TRN,
            GL_CPR,
            GL_GER,
            GM_TIN,
            GR_VAT,
            GT_NIT,
            HK_BRN,
            HK_HKID,
            HN_ID,
            HN_RTN,
            HR_OIB,
            HU_ADJ,
            HU_ANUM,
            ID_NIK,
            ID_NPWP,
            IE_PPS,
            IE_TRN,
            IL_CN,
            IL_PIN,
            IM_TRN,
            IN_LEI,
            IS_KNT,
            IT_CF,
            IT_PIVA,
            JE_SSN,
            JE_TIN,
            JM_TRN,
            JO_TIN,
            JP_HB,
            JP_MN,
            KE_PIN,
            KG_PIN,
            KN_TIN,
            KR_BRN,
            KR_CRN,
            KR_RRN,
            KW_CID,
            KZ_BIN,
            KZ_IIN,
            LA_TIN,
            LC_TIN,
            LI_PEID,
            LK_TIN,
            LS_TIN,
            LT_AK,
            LT_JAK,
            LU_MTC,
            LU_VAT,
            LV_PK,
            LV_RN,
            MD_IDNP,
            ME_JMBG,
            ME_PIB,
            MG_NIF,
            MH_SSN,
            MO_BIR,
            MO_TIN_B,
            MO_TIN_I,
            MR_NIF,
            MT_TIN,
            MT_VAT,
            MU_TAN,
            MW_TPIN,
            MX_CURP,
            MX_INE,
            MX_RFC,
            MY_NPC,
            MY_NRIC,
            MY_TIN_B,
            MZ_NUIT,
            NA_TIN,
            NATIONAL_ID,
            NL_BSN,
            NL_BTW,
            NL_RSIN,
            NO_FDN,
            NO_MVA,
            NO_ORGNR,
            NR_TIN,
            NZ_IRD,
            OM_CID,
            PA_CEDULA,
            PA_RUC,
            PASSPORT,
            PE_RUC,
            PG_TIN,
            PH_TIN,
            PL_NIP,
            PL_PESEL,
            PT_NIF,
            PY_RUC,
            RO_CNP,
            RO_CUI,
            SA_TIN,
            SA_VAT,
            SE_ORGNR,
            SE_PNMR,
            SG_FIN,
            SG_NRIC,
            SG_UEN,
            SI_DAV,
            SI_TIN,
            SK_ICO,
            SK_RC,
            US_EIN,
            US_ITIN,
            US_SSN,
            UY_RUT,
            VN_TIN,
        }

        /**
         * An enum containing [IdType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [IdType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AD_NRT,
            AE_EID,
            AE_TRN,
            AG_TIN,
            AI_TIN,
            AL_NID,
            AL_NIPT,
            AM_TIN,
            AO_NIF,
            AR_CUIL,
            AR_CUIT,
            AT_ATIN,
            AT_VAT,
            AU_ABN,
            AU_TFN,
            AW_TIN,
            AZ_PIN,
            BB_TIN,
            BD_TIN,
            BE_ENT,
            BE_NRN,
            BF_IFU,
            BG_EGN,
            BH_CPR,
            BH_VAT,
            BJ_IFU,
            BO_NIT,
            BR_CNPJ,
            BR_CPF,
            BS_TIN,
            BT_BIN,
            BW_TIN,
            BZ_TIN,
            CA_BN,
            CA_SIN,
            CH_AHV,
            CH_UID,
            CI_NCC,
            CL_RUN,
            CL_RUT,
            CM_NIU,
            CO_CEDULAS,
            CO_NIT,
            CR_CPF,
            CW_CRIB,
            CY_TIN,
            CZ_ICO,
            CZ_RC,
            DE_STID,
            DE_STNR,
            DE_VAT,
            DK_CPR,
            DK_CVR,
            DM_TIN,
            DO_CEDULA,
            DO_RNC,
            DRIVERS_LICENSE,
            EC_RUC,
            EE_IK,
            EE_RK,
            ES_NIE,
            ES_NIF,
            FI_HETU,
            FI_YTJ,
            FJ_TIN,
            FO_PTAL,
            FR_NIF,
            FR_SIREN,
            FR_VAT,
            GB_NINO,
            GB_UTR,
            GB_VAT,
            GD_TIN,
            GE_IC,
            GE_PN,
            GE_TIN,
            GENERIC_INTERNATIONAL,
            GG_SIN,
            GH_PIN,
            GH_TIN,
            GI_TRN,
            GL_CPR,
            GL_GER,
            GM_TIN,
            GR_VAT,
            GT_NIT,
            HK_BRN,
            HK_HKID,
            HN_ID,
            HN_RTN,
            HR_OIB,
            HU_ADJ,
            HU_ANUM,
            ID_NIK,
            ID_NPWP,
            IE_PPS,
            IE_TRN,
            IL_CN,
            IL_PIN,
            IM_TRN,
            IN_LEI,
            IS_KNT,
            IT_CF,
            IT_PIVA,
            JE_SSN,
            JE_TIN,
            JM_TRN,
            JO_TIN,
            JP_HB,
            JP_MN,
            KE_PIN,
            KG_PIN,
            KN_TIN,
            KR_BRN,
            KR_CRN,
            KR_RRN,
            KW_CID,
            KZ_BIN,
            KZ_IIN,
            LA_TIN,
            LC_TIN,
            LI_PEID,
            LK_TIN,
            LS_TIN,
            LT_AK,
            LT_JAK,
            LU_MTC,
            LU_VAT,
            LV_PK,
            LV_RN,
            MD_IDNP,
            ME_JMBG,
            ME_PIB,
            MG_NIF,
            MH_SSN,
            MO_BIR,
            MO_TIN_B,
            MO_TIN_I,
            MR_NIF,
            MT_TIN,
            MT_VAT,
            MU_TAN,
            MW_TPIN,
            MX_CURP,
            MX_INE,
            MX_RFC,
            MY_NPC,
            MY_NRIC,
            MY_TIN_B,
            MZ_NUIT,
            NA_TIN,
            NATIONAL_ID,
            NL_BSN,
            NL_BTW,
            NL_RSIN,
            NO_FDN,
            NO_MVA,
            NO_ORGNR,
            NR_TIN,
            NZ_IRD,
            OM_CID,
            PA_CEDULA,
            PA_RUC,
            PASSPORT,
            PE_RUC,
            PG_TIN,
            PH_TIN,
            PL_NIP,
            PL_PESEL,
            PT_NIF,
            PY_RUC,
            RO_CNP,
            RO_CUI,
            SA_TIN,
            SA_VAT,
            SE_ORGNR,
            SE_PNMR,
            SG_FIN,
            SG_NRIC,
            SG_UEN,
            SI_DAV,
            SI_TIN,
            SK_ICO,
            SK_RC,
            US_EIN,
            US_ITIN,
            US_SSN,
            UY_RUT,
            VN_TIN,
            /** An enum member indicating that [IdType] was instantiated with an unknown value. */
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
                AD_NRT -> Value.AD_NRT
                AE_EID -> Value.AE_EID
                AE_TRN -> Value.AE_TRN
                AG_TIN -> Value.AG_TIN
                AI_TIN -> Value.AI_TIN
                AL_NID -> Value.AL_NID
                AL_NIPT -> Value.AL_NIPT
                AM_TIN -> Value.AM_TIN
                AO_NIF -> Value.AO_NIF
                AR_CUIL -> Value.AR_CUIL
                AR_CUIT -> Value.AR_CUIT
                AT_ATIN -> Value.AT_ATIN
                AT_VAT -> Value.AT_VAT
                AU_ABN -> Value.AU_ABN
                AU_TFN -> Value.AU_TFN
                AW_TIN -> Value.AW_TIN
                AZ_PIN -> Value.AZ_PIN
                BB_TIN -> Value.BB_TIN
                BD_TIN -> Value.BD_TIN
                BE_ENT -> Value.BE_ENT
                BE_NRN -> Value.BE_NRN
                BF_IFU -> Value.BF_IFU
                BG_EGN -> Value.BG_EGN
                BH_CPR -> Value.BH_CPR
                BH_VAT -> Value.BH_VAT
                BJ_IFU -> Value.BJ_IFU
                BO_NIT -> Value.BO_NIT
                BR_CNPJ -> Value.BR_CNPJ
                BR_CPF -> Value.BR_CPF
                BS_TIN -> Value.BS_TIN
                BT_BIN -> Value.BT_BIN
                BW_TIN -> Value.BW_TIN
                BZ_TIN -> Value.BZ_TIN
                CA_BN -> Value.CA_BN
                CA_SIN -> Value.CA_SIN
                CH_AHV -> Value.CH_AHV
                CH_UID -> Value.CH_UID
                CI_NCC -> Value.CI_NCC
                CL_RUN -> Value.CL_RUN
                CL_RUT -> Value.CL_RUT
                CM_NIU -> Value.CM_NIU
                CO_CEDULAS -> Value.CO_CEDULAS
                CO_NIT -> Value.CO_NIT
                CR_CPF -> Value.CR_CPF
                CW_CRIB -> Value.CW_CRIB
                CY_TIN -> Value.CY_TIN
                CZ_ICO -> Value.CZ_ICO
                CZ_RC -> Value.CZ_RC
                DE_STID -> Value.DE_STID
                DE_STNR -> Value.DE_STNR
                DE_VAT -> Value.DE_VAT
                DK_CPR -> Value.DK_CPR
                DK_CVR -> Value.DK_CVR
                DM_TIN -> Value.DM_TIN
                DO_CEDULA -> Value.DO_CEDULA
                DO_RNC -> Value.DO_RNC
                DRIVERS_LICENSE -> Value.DRIVERS_LICENSE
                EC_RUC -> Value.EC_RUC
                EE_IK -> Value.EE_IK
                EE_RK -> Value.EE_RK
                ES_NIE -> Value.ES_NIE
                ES_NIF -> Value.ES_NIF
                FI_HETU -> Value.FI_HETU
                FI_YTJ -> Value.FI_YTJ
                FJ_TIN -> Value.FJ_TIN
                FO_PTAL -> Value.FO_PTAL
                FR_NIF -> Value.FR_NIF
                FR_SIREN -> Value.FR_SIREN
                FR_VAT -> Value.FR_VAT
                GB_NINO -> Value.GB_NINO
                GB_UTR -> Value.GB_UTR
                GB_VAT -> Value.GB_VAT
                GD_TIN -> Value.GD_TIN
                GE_IC -> Value.GE_IC
                GE_PN -> Value.GE_PN
                GE_TIN -> Value.GE_TIN
                GENERIC_INTERNATIONAL -> Value.GENERIC_INTERNATIONAL
                GG_SIN -> Value.GG_SIN
                GH_PIN -> Value.GH_PIN
                GH_TIN -> Value.GH_TIN
                GI_TRN -> Value.GI_TRN
                GL_CPR -> Value.GL_CPR
                GL_GER -> Value.GL_GER
                GM_TIN -> Value.GM_TIN
                GR_VAT -> Value.GR_VAT
                GT_NIT -> Value.GT_NIT
                HK_BRN -> Value.HK_BRN
                HK_HKID -> Value.HK_HKID
                HN_ID -> Value.HN_ID
                HN_RTN -> Value.HN_RTN
                HR_OIB -> Value.HR_OIB
                HU_ADJ -> Value.HU_ADJ
                HU_ANUM -> Value.HU_ANUM
                ID_NIK -> Value.ID_NIK
                ID_NPWP -> Value.ID_NPWP
                IE_PPS -> Value.IE_PPS
                IE_TRN -> Value.IE_TRN
                IL_CN -> Value.IL_CN
                IL_PIN -> Value.IL_PIN
                IM_TRN -> Value.IM_TRN
                IN_LEI -> Value.IN_LEI
                IS_KNT -> Value.IS_KNT
                IT_CF -> Value.IT_CF
                IT_PIVA -> Value.IT_PIVA
                JE_SSN -> Value.JE_SSN
                JE_TIN -> Value.JE_TIN
                JM_TRN -> Value.JM_TRN
                JO_TIN -> Value.JO_TIN
                JP_HB -> Value.JP_HB
                JP_MN -> Value.JP_MN
                KE_PIN -> Value.KE_PIN
                KG_PIN -> Value.KG_PIN
                KN_TIN -> Value.KN_TIN
                KR_BRN -> Value.KR_BRN
                KR_CRN -> Value.KR_CRN
                KR_RRN -> Value.KR_RRN
                KW_CID -> Value.KW_CID
                KZ_BIN -> Value.KZ_BIN
                KZ_IIN -> Value.KZ_IIN
                LA_TIN -> Value.LA_TIN
                LC_TIN -> Value.LC_TIN
                LI_PEID -> Value.LI_PEID
                LK_TIN -> Value.LK_TIN
                LS_TIN -> Value.LS_TIN
                LT_AK -> Value.LT_AK
                LT_JAK -> Value.LT_JAK
                LU_MTC -> Value.LU_MTC
                LU_VAT -> Value.LU_VAT
                LV_PK -> Value.LV_PK
                LV_RN -> Value.LV_RN
                MD_IDNP -> Value.MD_IDNP
                ME_JMBG -> Value.ME_JMBG
                ME_PIB -> Value.ME_PIB
                MG_NIF -> Value.MG_NIF
                MH_SSN -> Value.MH_SSN
                MO_BIR -> Value.MO_BIR
                MO_TIN_B -> Value.MO_TIN_B
                MO_TIN_I -> Value.MO_TIN_I
                MR_NIF -> Value.MR_NIF
                MT_TIN -> Value.MT_TIN
                MT_VAT -> Value.MT_VAT
                MU_TAN -> Value.MU_TAN
                MW_TPIN -> Value.MW_TPIN
                MX_CURP -> Value.MX_CURP
                MX_INE -> Value.MX_INE
                MX_RFC -> Value.MX_RFC
                MY_NPC -> Value.MY_NPC
                MY_NRIC -> Value.MY_NRIC
                MY_TIN_B -> Value.MY_TIN_B
                MZ_NUIT -> Value.MZ_NUIT
                NA_TIN -> Value.NA_TIN
                NATIONAL_ID -> Value.NATIONAL_ID
                NL_BSN -> Value.NL_BSN
                NL_BTW -> Value.NL_BTW
                NL_RSIN -> Value.NL_RSIN
                NO_FDN -> Value.NO_FDN
                NO_MVA -> Value.NO_MVA
                NO_ORGNR -> Value.NO_ORGNR
                NR_TIN -> Value.NR_TIN
                NZ_IRD -> Value.NZ_IRD
                OM_CID -> Value.OM_CID
                PA_CEDULA -> Value.PA_CEDULA
                PA_RUC -> Value.PA_RUC
                PASSPORT -> Value.PASSPORT
                PE_RUC -> Value.PE_RUC
                PG_TIN -> Value.PG_TIN
                PH_TIN -> Value.PH_TIN
                PL_NIP -> Value.PL_NIP
                PL_PESEL -> Value.PL_PESEL
                PT_NIF -> Value.PT_NIF
                PY_RUC -> Value.PY_RUC
                RO_CNP -> Value.RO_CNP
                RO_CUI -> Value.RO_CUI
                SA_TIN -> Value.SA_TIN
                SA_VAT -> Value.SA_VAT
                SE_ORGNR -> Value.SE_ORGNR
                SE_PNMR -> Value.SE_PNMR
                SG_FIN -> Value.SG_FIN
                SG_NRIC -> Value.SG_NRIC
                SG_UEN -> Value.SG_UEN
                SI_DAV -> Value.SI_DAV
                SI_TIN -> Value.SI_TIN
                SK_ICO -> Value.SK_ICO
                SK_RC -> Value.SK_RC
                US_EIN -> Value.US_EIN
                US_ITIN -> Value.US_ITIN
                US_SSN -> Value.US_SSN
                UY_RUT -> Value.UY_RUT
                VN_TIN -> Value.VN_TIN
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
                AD_NRT -> Known.AD_NRT
                AE_EID -> Known.AE_EID
                AE_TRN -> Known.AE_TRN
                AG_TIN -> Known.AG_TIN
                AI_TIN -> Known.AI_TIN
                AL_NID -> Known.AL_NID
                AL_NIPT -> Known.AL_NIPT
                AM_TIN -> Known.AM_TIN
                AO_NIF -> Known.AO_NIF
                AR_CUIL -> Known.AR_CUIL
                AR_CUIT -> Known.AR_CUIT
                AT_ATIN -> Known.AT_ATIN
                AT_VAT -> Known.AT_VAT
                AU_ABN -> Known.AU_ABN
                AU_TFN -> Known.AU_TFN
                AW_TIN -> Known.AW_TIN
                AZ_PIN -> Known.AZ_PIN
                BB_TIN -> Known.BB_TIN
                BD_TIN -> Known.BD_TIN
                BE_ENT -> Known.BE_ENT
                BE_NRN -> Known.BE_NRN
                BF_IFU -> Known.BF_IFU
                BG_EGN -> Known.BG_EGN
                BH_CPR -> Known.BH_CPR
                BH_VAT -> Known.BH_VAT
                BJ_IFU -> Known.BJ_IFU
                BO_NIT -> Known.BO_NIT
                BR_CNPJ -> Known.BR_CNPJ
                BR_CPF -> Known.BR_CPF
                BS_TIN -> Known.BS_TIN
                BT_BIN -> Known.BT_BIN
                BW_TIN -> Known.BW_TIN
                BZ_TIN -> Known.BZ_TIN
                CA_BN -> Known.CA_BN
                CA_SIN -> Known.CA_SIN
                CH_AHV -> Known.CH_AHV
                CH_UID -> Known.CH_UID
                CI_NCC -> Known.CI_NCC
                CL_RUN -> Known.CL_RUN
                CL_RUT -> Known.CL_RUT
                CM_NIU -> Known.CM_NIU
                CO_CEDULAS -> Known.CO_CEDULAS
                CO_NIT -> Known.CO_NIT
                CR_CPF -> Known.CR_CPF
                CW_CRIB -> Known.CW_CRIB
                CY_TIN -> Known.CY_TIN
                CZ_ICO -> Known.CZ_ICO
                CZ_RC -> Known.CZ_RC
                DE_STID -> Known.DE_STID
                DE_STNR -> Known.DE_STNR
                DE_VAT -> Known.DE_VAT
                DK_CPR -> Known.DK_CPR
                DK_CVR -> Known.DK_CVR
                DM_TIN -> Known.DM_TIN
                DO_CEDULA -> Known.DO_CEDULA
                DO_RNC -> Known.DO_RNC
                DRIVERS_LICENSE -> Known.DRIVERS_LICENSE
                EC_RUC -> Known.EC_RUC
                EE_IK -> Known.EE_IK
                EE_RK -> Known.EE_RK
                ES_NIE -> Known.ES_NIE
                ES_NIF -> Known.ES_NIF
                FI_HETU -> Known.FI_HETU
                FI_YTJ -> Known.FI_YTJ
                FJ_TIN -> Known.FJ_TIN
                FO_PTAL -> Known.FO_PTAL
                FR_NIF -> Known.FR_NIF
                FR_SIREN -> Known.FR_SIREN
                FR_VAT -> Known.FR_VAT
                GB_NINO -> Known.GB_NINO
                GB_UTR -> Known.GB_UTR
                GB_VAT -> Known.GB_VAT
                GD_TIN -> Known.GD_TIN
                GE_IC -> Known.GE_IC
                GE_PN -> Known.GE_PN
                GE_TIN -> Known.GE_TIN
                GENERIC_INTERNATIONAL -> Known.GENERIC_INTERNATIONAL
                GG_SIN -> Known.GG_SIN
                GH_PIN -> Known.GH_PIN
                GH_TIN -> Known.GH_TIN
                GI_TRN -> Known.GI_TRN
                GL_CPR -> Known.GL_CPR
                GL_GER -> Known.GL_GER
                GM_TIN -> Known.GM_TIN
                GR_VAT -> Known.GR_VAT
                GT_NIT -> Known.GT_NIT
                HK_BRN -> Known.HK_BRN
                HK_HKID -> Known.HK_HKID
                HN_ID -> Known.HN_ID
                HN_RTN -> Known.HN_RTN
                HR_OIB -> Known.HR_OIB
                HU_ADJ -> Known.HU_ADJ
                HU_ANUM -> Known.HU_ANUM
                ID_NIK -> Known.ID_NIK
                ID_NPWP -> Known.ID_NPWP
                IE_PPS -> Known.IE_PPS
                IE_TRN -> Known.IE_TRN
                IL_CN -> Known.IL_CN
                IL_PIN -> Known.IL_PIN
                IM_TRN -> Known.IM_TRN
                IN_LEI -> Known.IN_LEI
                IS_KNT -> Known.IS_KNT
                IT_CF -> Known.IT_CF
                IT_PIVA -> Known.IT_PIVA
                JE_SSN -> Known.JE_SSN
                JE_TIN -> Known.JE_TIN
                JM_TRN -> Known.JM_TRN
                JO_TIN -> Known.JO_TIN
                JP_HB -> Known.JP_HB
                JP_MN -> Known.JP_MN
                KE_PIN -> Known.KE_PIN
                KG_PIN -> Known.KG_PIN
                KN_TIN -> Known.KN_TIN
                KR_BRN -> Known.KR_BRN
                KR_CRN -> Known.KR_CRN
                KR_RRN -> Known.KR_RRN
                KW_CID -> Known.KW_CID
                KZ_BIN -> Known.KZ_BIN
                KZ_IIN -> Known.KZ_IIN
                LA_TIN -> Known.LA_TIN
                LC_TIN -> Known.LC_TIN
                LI_PEID -> Known.LI_PEID
                LK_TIN -> Known.LK_TIN
                LS_TIN -> Known.LS_TIN
                LT_AK -> Known.LT_AK
                LT_JAK -> Known.LT_JAK
                LU_MTC -> Known.LU_MTC
                LU_VAT -> Known.LU_VAT
                LV_PK -> Known.LV_PK
                LV_RN -> Known.LV_RN
                MD_IDNP -> Known.MD_IDNP
                ME_JMBG -> Known.ME_JMBG
                ME_PIB -> Known.ME_PIB
                MG_NIF -> Known.MG_NIF
                MH_SSN -> Known.MH_SSN
                MO_BIR -> Known.MO_BIR
                MO_TIN_B -> Known.MO_TIN_B
                MO_TIN_I -> Known.MO_TIN_I
                MR_NIF -> Known.MR_NIF
                MT_TIN -> Known.MT_TIN
                MT_VAT -> Known.MT_VAT
                MU_TAN -> Known.MU_TAN
                MW_TPIN -> Known.MW_TPIN
                MX_CURP -> Known.MX_CURP
                MX_INE -> Known.MX_INE
                MX_RFC -> Known.MX_RFC
                MY_NPC -> Known.MY_NPC
                MY_NRIC -> Known.MY_NRIC
                MY_TIN_B -> Known.MY_TIN_B
                MZ_NUIT -> Known.MZ_NUIT
                NA_TIN -> Known.NA_TIN
                NATIONAL_ID -> Known.NATIONAL_ID
                NL_BSN -> Known.NL_BSN
                NL_BTW -> Known.NL_BTW
                NL_RSIN -> Known.NL_RSIN
                NO_FDN -> Known.NO_FDN
                NO_MVA -> Known.NO_MVA
                NO_ORGNR -> Known.NO_ORGNR
                NR_TIN -> Known.NR_TIN
                NZ_IRD -> Known.NZ_IRD
                OM_CID -> Known.OM_CID
                PA_CEDULA -> Known.PA_CEDULA
                PA_RUC -> Known.PA_RUC
                PASSPORT -> Known.PASSPORT
                PE_RUC -> Known.PE_RUC
                PG_TIN -> Known.PG_TIN
                PH_TIN -> Known.PH_TIN
                PL_NIP -> Known.PL_NIP
                PL_PESEL -> Known.PL_PESEL
                PT_NIF -> Known.PT_NIF
                PY_RUC -> Known.PY_RUC
                RO_CNP -> Known.RO_CNP
                RO_CUI -> Known.RO_CUI
                SA_TIN -> Known.SA_TIN
                SA_VAT -> Known.SA_VAT
                SE_ORGNR -> Known.SE_ORGNR
                SE_PNMR -> Known.SE_PNMR
                SG_FIN -> Known.SG_FIN
                SG_NRIC -> Known.SG_NRIC
                SG_UEN -> Known.SG_UEN
                SI_DAV -> Known.SI_DAV
                SI_TIN -> Known.SI_TIN
                SK_ICO -> Known.SK_ICO
                SK_RC -> Known.SK_RC
                US_EIN -> Known.US_EIN
                US_ITIN -> Known.US_ITIN
                US_SSN -> Known.US_SSN
                UY_RUT -> Known.UY_RUT
                VN_TIN -> Known.VN_TIN
                else -> throw ModernTreasuryInvalidDataException("Unknown IdType: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): IdType = apply {
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

            return other is IdType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IdentificationUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "IdentificationUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
