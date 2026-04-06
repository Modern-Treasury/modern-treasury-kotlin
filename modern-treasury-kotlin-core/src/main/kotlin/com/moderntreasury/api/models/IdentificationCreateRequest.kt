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
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

class IdentificationCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val idNumber: JsonField<String>,
    private val idType: JsonField<IdType>,
    private val documents: JsonField<List<Document>>,
    private val expirationDate: JsonField<LocalDate>,
    private val issuingCountry: JsonField<String>,
    private val issuingRegion: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id_number") @ExcludeMissing idNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id_type") @ExcludeMissing idType: JsonField<IdType> = JsonMissing.of(),
        @JsonProperty("documents")
        @ExcludeMissing
        documents: JsonField<List<Document>> = JsonMissing.of(),
        @JsonProperty("expiration_date")
        @ExcludeMissing
        expirationDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("issuing_country")
        @ExcludeMissing
        issuingCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("issuing_region")
        @ExcludeMissing
        issuingRegion: JsonField<String> = JsonMissing.of(),
    ) : this(
        idNumber,
        idType,
        documents,
        expirationDate,
        issuingCountry,
        issuingRegion,
        mutableMapOf(),
    )

    /**
     * The ID number of identification document.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idNumber(): String = idNumber.getRequired("id_number")

    /**
     * The type of ID number.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idType(): IdType = idType.getRequired("id_type")

    /**
     * A list of documents to attach to the identification.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun documents(): List<Document>? = documents.getNullable("documents")

    /**
     * The date when the Identification is no longer considered valid by the issuing authority.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expirationDate(): LocalDate? = expirationDate.getNullable("expiration_date")

    /**
     * The ISO 3166-1 alpha-2 country code of the country that issued the identification
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun issuingCountry(): String? = issuingCountry.getNullable("issuing_country")

    /**
     * The region in which the identifcation was issued.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun issuingRegion(): String? = issuingRegion.getNullable("issuing_region")

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
     * Returns the raw JSON value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documents")
    @ExcludeMissing
    fun _documents(): JsonField<List<Document>> = documents

    /**
     * Returns the raw JSON value of [expirationDate].
     *
     * Unlike [expirationDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiration_date")
    @ExcludeMissing
    fun _expirationDate(): JsonField<LocalDate> = expirationDate

    /**
     * Returns the raw JSON value of [issuingCountry].
     *
     * Unlike [issuingCountry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("issuing_country")
    @ExcludeMissing
    fun _issuingCountry(): JsonField<String> = issuingCountry

    /**
     * Returns the raw JSON value of [issuingRegion].
     *
     * Unlike [issuingRegion], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [IdentificationCreateRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .idNumber()
         * .idType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [IdentificationCreateRequest]. */
    class Builder internal constructor() {

        private var idNumber: JsonField<String>? = null
        private var idType: JsonField<IdType>? = null
        private var documents: JsonField<MutableList<Document>>? = null
        private var expirationDate: JsonField<LocalDate> = JsonMissing.of()
        private var issuingCountry: JsonField<String> = JsonMissing.of()
        private var issuingRegion: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(identificationCreateRequest: IdentificationCreateRequest) = apply {
            idNumber = identificationCreateRequest.idNumber
            idType = identificationCreateRequest.idType
            documents = identificationCreateRequest.documents.map { it.toMutableList() }
            expirationDate = identificationCreateRequest.expirationDate
            issuingCountry = identificationCreateRequest.issuingCountry
            issuingRegion = identificationCreateRequest.issuingRegion
            additionalProperties = identificationCreateRequest.additionalProperties.toMutableMap()
        }

        /** The ID number of identification document. */
        fun idNumber(idNumber: String) = idNumber(JsonField.of(idNumber))

        /**
         * Sets [Builder.idNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idNumber] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idNumber(idNumber: JsonField<String>) = apply { this.idNumber = idNumber }

        /** The type of ID number. */
        fun idType(idType: IdType) = idType(JsonField.of(idType))

        /**
         * Sets [Builder.idType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idType] with a well-typed [IdType] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idType(idType: JsonField<IdType>) = apply { this.idType = idType }

        /** A list of documents to attach to the identification. */
        fun documents(documents: List<Document>) = documents(JsonField.of(documents))

        /**
         * Sets [Builder.documents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documents] with a well-typed `List<Document>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documents(documents: JsonField<List<Document>>) = apply {
            this.documents = documents.map { it.toMutableList() }
        }

        /**
         * Adds a single [Document] to [documents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocument(document: Document) = apply {
            documents =
                (documents ?: JsonField.of(mutableListOf())).also {
                    checkKnown("documents", it).add(document)
                }
        }

        /**
         * The date when the Identification is no longer considered valid by the issuing authority.
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
         * You should usually call [Builder.issuingRegion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [IdentificationCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .idNumber()
         * .idType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IdentificationCreateRequest =
            IdentificationCreateRequest(
                checkRequired("idNumber", idNumber),
                checkRequired("idType", idType),
                (documents ?: JsonMissing.of()).map { it.toImmutable() },
                expirationDate,
                issuingCountry,
                issuingRegion,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IdentificationCreateRequest = apply {
        if (validated) {
            return@apply
        }

        idNumber()
        idType().validate()
        documents()?.forEach { it.validate() }
        expirationDate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (idNumber.asKnown() == null) 0 else 1) +
            (idType.asKnown()?.validity() ?: 0) +
            (documents.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (expirationDate.asKnown() == null) 0 else 1) +
            (if (issuingCountry.asKnown() == null) 0 else 1) +
            (if (issuingRegion.asKnown() == null) 0 else 1)

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

            val AR_CUIL = of("ar_cuil")

            val AR_CUIT = of("ar_cuit")

            val BR_CNPJ = of("br_cnpj")

            val BR_CPF = of("br_cpf")

            val CA_SIN = of("ca_sin")

            val CL_RUN = of("cl_run")

            val CL_RUT = of("cl_rut")

            val CO_CEDULAS = of("co_cedulas")

            val CO_NIT = of("co_nit")

            val DRIVERS_LICENSE = of("drivers_license")

            val HN_ID = of("hn_id")

            val HN_RTN = of("hn_rtn")

            val IE_PPS = of("ie_pps")

            val IN_LEI = of("in_lei")

            val KR_BRN = of("kr_brn")

            val KR_CRN = of("kr_crn")

            val KR_RRN = of("kr_rrn")

            val PASSPORT = of("passport")

            val SA_TIN = of("sa_tin")

            val SA_VAT = of("sa_vat")

            val US_EIN = of("us_ein")

            val US_ITIN = of("us_itin")

            val US_SSN = of("us_ssn")

            val VN_TIN = of("vn_tin")

            fun of(value: String) = IdType(JsonField.of(value))
        }

        /** An enum containing [IdType]'s known values. */
        enum class Known {
            AR_CUIL,
            AR_CUIT,
            BR_CNPJ,
            BR_CPF,
            CA_SIN,
            CL_RUN,
            CL_RUT,
            CO_CEDULAS,
            CO_NIT,
            DRIVERS_LICENSE,
            HN_ID,
            HN_RTN,
            IE_PPS,
            IN_LEI,
            KR_BRN,
            KR_CRN,
            KR_RRN,
            PASSPORT,
            SA_TIN,
            SA_VAT,
            US_EIN,
            US_ITIN,
            US_SSN,
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
            AR_CUIL,
            AR_CUIT,
            BR_CNPJ,
            BR_CPF,
            CA_SIN,
            CL_RUN,
            CL_RUT,
            CO_CEDULAS,
            CO_NIT,
            DRIVERS_LICENSE,
            HN_ID,
            HN_RTN,
            IE_PPS,
            IN_LEI,
            KR_BRN,
            KR_CRN,
            KR_RRN,
            PASSPORT,
            SA_TIN,
            SA_VAT,
            US_EIN,
            US_ITIN,
            US_SSN,
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
                AR_CUIL -> Value.AR_CUIL
                AR_CUIT -> Value.AR_CUIT
                BR_CNPJ -> Value.BR_CNPJ
                BR_CPF -> Value.BR_CPF
                CA_SIN -> Value.CA_SIN
                CL_RUN -> Value.CL_RUN
                CL_RUT -> Value.CL_RUT
                CO_CEDULAS -> Value.CO_CEDULAS
                CO_NIT -> Value.CO_NIT
                DRIVERS_LICENSE -> Value.DRIVERS_LICENSE
                HN_ID -> Value.HN_ID
                HN_RTN -> Value.HN_RTN
                IE_PPS -> Value.IE_PPS
                IN_LEI -> Value.IN_LEI
                KR_BRN -> Value.KR_BRN
                KR_CRN -> Value.KR_CRN
                KR_RRN -> Value.KR_RRN
                PASSPORT -> Value.PASSPORT
                SA_TIN -> Value.SA_TIN
                SA_VAT -> Value.SA_VAT
                US_EIN -> Value.US_EIN
                US_ITIN -> Value.US_ITIN
                US_SSN -> Value.US_SSN
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
                AR_CUIL -> Known.AR_CUIL
                AR_CUIT -> Known.AR_CUIT
                BR_CNPJ -> Known.BR_CNPJ
                BR_CPF -> Known.BR_CPF
                CA_SIN -> Known.CA_SIN
                CL_RUN -> Known.CL_RUN
                CL_RUT -> Known.CL_RUT
                CO_CEDULAS -> Known.CO_CEDULAS
                CO_NIT -> Known.CO_NIT
                DRIVERS_LICENSE -> Known.DRIVERS_LICENSE
                HN_ID -> Known.HN_ID
                HN_RTN -> Known.HN_RTN
                IE_PPS -> Known.IE_PPS
                IN_LEI -> Known.IN_LEI
                KR_BRN -> Known.KR_BRN
                KR_CRN -> Known.KR_CRN
                KR_RRN -> Known.KR_RRN
                PASSPORT -> Known.PASSPORT
                SA_TIN -> Known.SA_TIN
                SA_VAT -> Known.SA_VAT
                US_EIN -> Known.US_EIN
                US_ITIN -> Known.US_ITIN
                US_SSN -> Known.US_SSN
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

    class Document
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val documentType: JsonField<DocumentType>,
        private val fileData: JsonField<String>,
        private val filename: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("document_type")
            @ExcludeMissing
            documentType: JsonField<DocumentType> = JsonMissing.of(),
            @JsonProperty("file_data")
            @ExcludeMissing
            fileData: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filename") @ExcludeMissing filename: JsonField<String> = JsonMissing.of(),
        ) : this(documentType, fileData, filename, mutableMapOf())

        /**
         * A category given to the document, can be `null`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentType(): DocumentType = documentType.getRequired("document_type")

        /**
         * Base64-encoded file content for the document.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fileData(): String = fileData.getRequired("file_data")

        /**
         * The original filename of the document.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun filename(): String? = filename.getNullable("filename")

        /**
         * Returns the raw JSON value of [documentType].
         *
         * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("document_type")
        @ExcludeMissing
        fun _documentType(): JsonField<DocumentType> = documentType

        /**
         * Returns the raw JSON value of [fileData].
         *
         * Unlike [fileData], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_data") @ExcludeMissing fun _fileData(): JsonField<String> = fileData

        /**
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

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
             * Returns a mutable builder for constructing an instance of [Document].
             *
             * The following fields are required:
             * ```kotlin
             * .documentType()
             * .fileData()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Document]. */
        class Builder internal constructor() {

            private var documentType: JsonField<DocumentType>? = null
            private var fileData: JsonField<String>? = null
            private var filename: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(document: Document) = apply {
                documentType = document.documentType
                fileData = document.fileData
                filename = document.filename
                additionalProperties = document.additionalProperties.toMutableMap()
            }

            /** A category given to the document, can be `null`. */
            fun documentType(documentType: DocumentType) = documentType(JsonField.of(documentType))

            /**
             * Sets [Builder.documentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentType] with a well-typed [DocumentType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentType(documentType: JsonField<DocumentType>) = apply {
                this.documentType = documentType
            }

            /** Base64-encoded file content for the document. */
            fun fileData(fileData: String) = fileData(JsonField.of(fileData))

            /**
             * Sets [Builder.fileData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileData] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileData(fileData: JsonField<String>) = apply { this.fileData = fileData }

            /** The original filename of the document. */
            fun filename(filename: String) = filename(JsonField.of(filename))

            /**
             * Sets [Builder.filename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filename] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

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
             * Returns an immutable instance of [Document].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .documentType()
             * .fileData()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Document =
                Document(
                    checkRequired("documentType", documentType),
                    checkRequired("fileData", fileData),
                    filename,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Document = apply {
            if (validated) {
                return@apply
            }

            documentType().validate()
            fileData()
            filename()
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
            (documentType.asKnown()?.validity() ?: 0) +
                (if (fileData.asKnown() == null) 0 else 1) +
                (if (filename.asKnown() == null) 0 else 1)

        /** A category given to the document, can be `null`. */
        class DocumentType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ARTICLES_OF_INCORPORATION = of("articles_of_incorporation")

                val CERTIFICATE_OF_GOOD_STANDING = of("certificate_of_good_standing")

                val EIN_LETTER = of("ein_letter")

                val GENERIC = of("generic")

                val IDENTIFICATION_BACK = of("identification_back")

                val IDENTIFICATION_FRONT = of("identification_front")

                val PROOF_OF_ADDRESS = of("proof_of_address")

                fun of(value: String) = DocumentType(JsonField.of(value))
            }

            /** An enum containing [DocumentType]'s known values. */
            enum class Known {
                ARTICLES_OF_INCORPORATION,
                CERTIFICATE_OF_GOOD_STANDING,
                EIN_LETTER,
                GENERIC,
                IDENTIFICATION_BACK,
                IDENTIFICATION_FRONT,
                PROOF_OF_ADDRESS,
            }

            /**
             * An enum containing [DocumentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DocumentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ARTICLES_OF_INCORPORATION,
                CERTIFICATE_OF_GOOD_STANDING,
                EIN_LETTER,
                GENERIC,
                IDENTIFICATION_BACK,
                IDENTIFICATION_FRONT,
                PROOF_OF_ADDRESS,
                /**
                 * An enum member indicating that [DocumentType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ARTICLES_OF_INCORPORATION -> Value.ARTICLES_OF_INCORPORATION
                    CERTIFICATE_OF_GOOD_STANDING -> Value.CERTIFICATE_OF_GOOD_STANDING
                    EIN_LETTER -> Value.EIN_LETTER
                    GENERIC -> Value.GENERIC
                    IDENTIFICATION_BACK -> Value.IDENTIFICATION_BACK
                    IDENTIFICATION_FRONT -> Value.IDENTIFICATION_FRONT
                    PROOF_OF_ADDRESS -> Value.PROOF_OF_ADDRESS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    ARTICLES_OF_INCORPORATION -> Known.ARTICLES_OF_INCORPORATION
                    CERTIFICATE_OF_GOOD_STANDING -> Known.CERTIFICATE_OF_GOOD_STANDING
                    EIN_LETTER -> Known.EIN_LETTER
                    GENERIC -> Known.GENERIC
                    IDENTIFICATION_BACK -> Known.IDENTIFICATION_BACK
                    IDENTIFICATION_FRONT -> Known.IDENTIFICATION_FRONT
                    PROOF_OF_ADDRESS -> Known.PROOF_OF_ADDRESS
                    else -> throw ModernTreasuryInvalidDataException("Unknown DocumentType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw ModernTreasuryInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): DocumentType = apply {
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

                return other is DocumentType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Document &&
                documentType == other.documentType &&
                fileData == other.fileData &&
                filename == other.filename &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(documentType, fileData, filename, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Document{documentType=$documentType, fileData=$fileData, filename=$filename, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IdentificationCreateRequest &&
            idNumber == other.idNumber &&
            idType == other.idType &&
            documents == other.documents &&
            expirationDate == other.expirationDate &&
            issuingCountry == other.issuingCountry &&
            issuingRegion == other.issuingRegion &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            idNumber,
            idType,
            documents,
            expirationDate,
            issuingCountry,
            issuingRegion,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IdentificationCreateRequest{idNumber=$idNumber, idType=$idType, documents=$documents, expirationDate=$expirationDate, issuingCountry=$issuingCountry, issuingRegion=$issuingRegion, additionalProperties=$additionalProperties}"
}
