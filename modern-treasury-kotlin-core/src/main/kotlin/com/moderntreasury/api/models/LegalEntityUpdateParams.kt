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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Update a legal entity. */
class LegalEntityUpdateParams
private constructor(
    private val id: String?,
    private val body: LegalEntityUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /**
     * A list of addresses for the entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun addresses(): List<LegalEntityAddressCreateRequest>? = body.addresses()

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun bankSettings(): LegalEntityBankSetting? = body.bankSettings()

    /**
     * The business's legal business name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun businessName(): String? = body.businessName()

    /**
     * The country of citizenship for an individual.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun citizenshipCountry(): String? = body.citizenshipCountry()

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun complianceDetails(): LegalEntityComplianceDetail? = body.complianceDetails()

    /**
     * A business's formation date (YYYY-MM-DD).
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateFormed(): LocalDate? = body.dateFormed()

    /**
     * An individual's date of birth (YYYY-MM-DD).
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateOfBirth(): LocalDate? = body.dateOfBirth()

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun doingBusinessAsNames(): List<String>? = body.doingBusinessAsNames()

    /**
     * The entity's primary email.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun email(): String? = body.email()

    /**
     * An individual's first name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun firstName(): String? = body.firstName()

    /**
     * A list of identifications for the legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun identifications(): List<IdentificationCreateRequest>? = body.identifications()

    /**
     * A list of industry classifications for the legal entity.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun industryClassifications(): List<LegalEntityIndustryClassification>? =
        body.industryClassifications()

    /**
     * An individual's last name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lastName(): String? = body.lastName()

    /**
     * The business's legal structure.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun legalStructure(): LegalStructure? = body.legalStructure()

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * An individual's middle name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun middleName(): String? = body.middleName()

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun phoneNumbers(): List<PhoneNumber>? = body.phoneNumbers()

    /**
     * Whether the individual is a politically exposed person.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun politicallyExposedPerson(): Boolean? = body.politicallyExposedPerson()

    /**
     * An individual's preferred name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun preferredName(): String? = body.preferredName()

    /**
     * An individual's prefix.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun prefix(): String? = body.prefix()

    /**
     * The risk rating of the legal entity. One of low, medium, high.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun riskRating(): RiskRating? = body.riskRating()

    /**
     * An individual's suffix.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun suffix(): String? = body.suffix()

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun wealthAndEmploymentDetails(): LegalEntityWealthEmploymentDetail? =
        body.wealthAndEmploymentDetails()

    /**
     * The entity's primary website URL.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun website(): String? = body.website()

    /**
     * Returns the raw JSON value of [addresses].
     *
     * Unlike [addresses], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addresses(): JsonField<List<LegalEntityAddressCreateRequest>> = body._addresses()

    /**
     * Returns the raw JSON value of [bankSettings].
     *
     * Unlike [bankSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bankSettings(): JsonField<LegalEntityBankSetting> = body._bankSettings()

    /**
     * Returns the raw JSON value of [businessName].
     *
     * Unlike [businessName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _businessName(): JsonField<String> = body._businessName()

    /**
     * Returns the raw JSON value of [citizenshipCountry].
     *
     * Unlike [citizenshipCountry], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _citizenshipCountry(): JsonField<String> = body._citizenshipCountry()

    /**
     * Returns the raw JSON value of [complianceDetails].
     *
     * Unlike [complianceDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _complianceDetails(): JsonField<LegalEntityComplianceDetail> = body._complianceDetails()

    /**
     * Returns the raw JSON value of [dateFormed].
     *
     * Unlike [dateFormed], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dateFormed(): JsonField<LocalDate> = body._dateFormed()

    /**
     * Returns the raw JSON value of [dateOfBirth].
     *
     * Unlike [dateOfBirth], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dateOfBirth(): JsonField<LocalDate> = body._dateOfBirth()

    /**
     * Returns the raw JSON value of [doingBusinessAsNames].
     *
     * Unlike [doingBusinessAsNames], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _doingBusinessAsNames(): JsonField<List<String>> = body._doingBusinessAsNames()

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _firstName(): JsonField<String> = body._firstName()

    /**
     * Returns the raw JSON value of [identifications].
     *
     * Unlike [identifications], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _identifications(): JsonField<List<IdentificationCreateRequest>> = body._identifications()

    /**
     * Returns the raw JSON value of [industryClassifications].
     *
     * Unlike [industryClassifications], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _industryClassifications(): JsonField<List<LegalEntityIndustryClassification>> =
        body._industryClassifications()

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lastName(): JsonField<String> = body._lastName()

    /**
     * Returns the raw JSON value of [legalStructure].
     *
     * Unlike [legalStructure], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _legalStructure(): JsonField<LegalStructure> = body._legalStructure()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [middleName].
     *
     * Unlike [middleName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _middleName(): JsonField<String> = body._middleName()

    /**
     * Returns the raw JSON value of [phoneNumbers].
     *
     * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phoneNumbers(): JsonField<List<PhoneNumber>> = body._phoneNumbers()

    /**
     * Returns the raw JSON value of [politicallyExposedPerson].
     *
     * Unlike [politicallyExposedPerson], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _politicallyExposedPerson(): JsonField<Boolean> = body._politicallyExposedPerson()

    /**
     * Returns the raw JSON value of [preferredName].
     *
     * Unlike [preferredName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _preferredName(): JsonField<String> = body._preferredName()

    /**
     * Returns the raw JSON value of [prefix].
     *
     * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _prefix(): JsonField<String> = body._prefix()

    /**
     * Returns the raw JSON value of [riskRating].
     *
     * Unlike [riskRating], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _riskRating(): JsonField<RiskRating> = body._riskRating()

    /**
     * Returns the raw JSON value of [suffix].
     *
     * Unlike [suffix], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _suffix(): JsonField<String> = body._suffix()

    /**
     * Returns the raw JSON value of [wealthAndEmploymentDetails].
     *
     * Unlike [wealthAndEmploymentDetails], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _wealthAndEmploymentDetails(): JsonField<LegalEntityWealthEmploymentDetail> =
        body._wealthAndEmploymentDetails()

    /**
     * Returns the raw JSON value of [website].
     *
     * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _website(): JsonField<String> = body._website()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): LegalEntityUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [LegalEntityUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [LegalEntityUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: LegalEntityUpdateRequest.Builder = LegalEntityUpdateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(legalEntityUpdateParams: LegalEntityUpdateParams) = apply {
            id = legalEntityUpdateParams.id
            body = legalEntityUpdateParams.body.toBuilder()
            additionalHeaders = legalEntityUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = legalEntityUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [addresses]
         * - [bankSettings]
         * - [businessName]
         * - [citizenshipCountry]
         * - [complianceDetails]
         * - etc.
         */
        fun body(body: LegalEntityUpdateRequest) = apply { this.body = body.toBuilder() }

        /** A list of addresses for the entity. */
        fun addresses(addresses: List<LegalEntityAddressCreateRequest>) = apply {
            body.addresses(addresses)
        }

        /**
         * Sets [Builder.addresses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addresses] with a well-typed
         * `List<LegalEntityAddressCreateRequest>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun addresses(addresses: JsonField<List<LegalEntityAddressCreateRequest>>) = apply {
            body.addresses(addresses)
        }

        /**
         * Adds a single [LegalEntityAddressCreateRequest] to [addresses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
            body.addAddress(address)
        }

        fun bankSettings(bankSettings: LegalEntityBankSetting?) = apply {
            body.bankSettings(bankSettings)
        }

        /**
         * Sets [Builder.bankSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankSettings] with a well-typed [LegalEntityBankSetting]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun bankSettings(bankSettings: JsonField<LegalEntityBankSetting>) = apply {
            body.bankSettings(bankSettings)
        }

        /** The business's legal business name. */
        fun businessName(businessName: String?) = apply { body.businessName(businessName) }

        /**
         * Sets [Builder.businessName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessName(businessName: JsonField<String>) = apply {
            body.businessName(businessName)
        }

        /** The country of citizenship for an individual. */
        fun citizenshipCountry(citizenshipCountry: String?) = apply {
            body.citizenshipCountry(citizenshipCountry)
        }

        /**
         * Sets [Builder.citizenshipCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.citizenshipCountry] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun citizenshipCountry(citizenshipCountry: JsonField<String>) = apply {
            body.citizenshipCountry(citizenshipCountry)
        }

        fun complianceDetails(complianceDetails: LegalEntityComplianceDetail?) = apply {
            body.complianceDetails(complianceDetails)
        }

        /**
         * Sets [Builder.complianceDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.complianceDetails] with a well-typed
         * [LegalEntityComplianceDetail] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun complianceDetails(complianceDetails: JsonField<LegalEntityComplianceDetail>) = apply {
            body.complianceDetails(complianceDetails)
        }

        /** A business's formation date (YYYY-MM-DD). */
        fun dateFormed(dateFormed: LocalDate?) = apply { body.dateFormed(dateFormed) }

        /**
         * Sets [Builder.dateFormed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateFormed] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dateFormed(dateFormed: JsonField<LocalDate>) = apply { body.dateFormed(dateFormed) }

        /** An individual's date of birth (YYYY-MM-DD). */
        fun dateOfBirth(dateOfBirth: LocalDate?) = apply { body.dateOfBirth(dateOfBirth) }

        /**
         * Sets [Builder.dateOfBirth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateOfBirth] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply { body.dateOfBirth(dateOfBirth) }

        fun doingBusinessAsNames(doingBusinessAsNames: List<String>) = apply {
            body.doingBusinessAsNames(doingBusinessAsNames)
        }

        /**
         * Sets [Builder.doingBusinessAsNames] to an arbitrary JSON value.
         *
         * You should usually call [Builder.doingBusinessAsNames] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun doingBusinessAsNames(doingBusinessAsNames: JsonField<List<String>>) = apply {
            body.doingBusinessAsNames(doingBusinessAsNames)
        }

        /**
         * Adds a single [String] to [doingBusinessAsNames].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
            body.addDoingBusinessAsName(doingBusinessAsName)
        }

        /** The entity's primary email. */
        fun email(email: String?) = apply { body.email(email) }

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        /** An individual's first name. */
        fun firstName(firstName: String?) = apply { body.firstName(firstName) }

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { body.firstName(firstName) }

        /** A list of identifications for the legal entity. */
        fun identifications(identifications: List<IdentificationCreateRequest>) = apply {
            body.identifications(identifications)
        }

        /**
         * Sets [Builder.identifications] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identifications] with a well-typed
         * `List<IdentificationCreateRequest>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun identifications(identifications: JsonField<List<IdentificationCreateRequest>>) = apply {
            body.identifications(identifications)
        }

        /**
         * Adds a single [IdentificationCreateRequest] to [identifications].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIdentification(identification: IdentificationCreateRequest) = apply {
            body.addIdentification(identification)
        }

        /** A list of industry classifications for the legal entity. */
        fun industryClassifications(
            industryClassifications: List<LegalEntityIndustryClassification>
        ) = apply { body.industryClassifications(industryClassifications) }

        /**
         * Sets [Builder.industryClassifications] to an arbitrary JSON value.
         *
         * You should usually call [Builder.industryClassifications] with a well-typed
         * `List<LegalEntityIndustryClassification>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun industryClassifications(
            industryClassifications: JsonField<List<LegalEntityIndustryClassification>>
        ) = apply { body.industryClassifications(industryClassifications) }

        /**
         * Adds a single [LegalEntityIndustryClassification] to [industryClassifications].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIndustryClassification(industryClassification: LegalEntityIndustryClassification) =
            apply {
                body.addIndustryClassification(industryClassification)
            }

        /** An individual's last name. */
        fun lastName(lastName: String?) = apply { body.lastName(lastName) }

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { body.lastName(lastName) }

        /** The business's legal structure. */
        fun legalStructure(legalStructure: LegalStructure?) = apply {
            body.legalStructure(legalStructure)
        }

        /**
         * Sets [Builder.legalStructure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalStructure] with a well-typed [LegalStructure] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun legalStructure(legalStructure: JsonField<LegalStructure>) = apply {
            body.legalStructure(legalStructure)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** An individual's middle name. */
        fun middleName(middleName: String?) = apply { body.middleName(middleName) }

        /**
         * Sets [Builder.middleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.middleName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun middleName(middleName: JsonField<String>) = apply { body.middleName(middleName) }

        fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = apply {
            body.phoneNumbers(phoneNumbers)
        }

        /**
         * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbers] with a well-typed `List<PhoneNumber>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber>>) = apply {
            body.phoneNumbers(phoneNumbers)
        }

        /**
         * Adds a single [PhoneNumber] to [phoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoneNumber(phoneNumber: PhoneNumber) = apply { body.addPhoneNumber(phoneNumber) }

        /** Whether the individual is a politically exposed person. */
        fun politicallyExposedPerson(politicallyExposedPerson: Boolean?) = apply {
            body.politicallyExposedPerson(politicallyExposedPerson)
        }

        /**
         * Alias for [Builder.politicallyExposedPerson].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun politicallyExposedPerson(politicallyExposedPerson: Boolean) =
            politicallyExposedPerson(politicallyExposedPerson as Boolean?)

        /**
         * Sets [Builder.politicallyExposedPerson] to an arbitrary JSON value.
         *
         * You should usually call [Builder.politicallyExposedPerson] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun politicallyExposedPerson(politicallyExposedPerson: JsonField<Boolean>) = apply {
            body.politicallyExposedPerson(politicallyExposedPerson)
        }

        /** An individual's preferred name. */
        fun preferredName(preferredName: String?) = apply { body.preferredName(preferredName) }

        /**
         * Sets [Builder.preferredName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preferredName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun preferredName(preferredName: JsonField<String>) = apply {
            body.preferredName(preferredName)
        }

        /** An individual's prefix. */
        fun prefix(prefix: String?) = apply { body.prefix(prefix) }

        /**
         * Sets [Builder.prefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prefix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prefix(prefix: JsonField<String>) = apply { body.prefix(prefix) }

        /** The risk rating of the legal entity. One of low, medium, high. */
        fun riskRating(riskRating: RiskRating?) = apply { body.riskRating(riskRating) }

        /**
         * Sets [Builder.riskRating] to an arbitrary JSON value.
         *
         * You should usually call [Builder.riskRating] with a well-typed [RiskRating] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun riskRating(riskRating: JsonField<RiskRating>) = apply { body.riskRating(riskRating) }

        /** An individual's suffix. */
        fun suffix(suffix: String?) = apply { body.suffix(suffix) }

        /**
         * Sets [Builder.suffix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suffix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun suffix(suffix: JsonField<String>) = apply { body.suffix(suffix) }

        fun wealthAndEmploymentDetails(
            wealthAndEmploymentDetails: LegalEntityWealthEmploymentDetail?
        ) = apply { body.wealthAndEmploymentDetails(wealthAndEmploymentDetails) }

        /**
         * Sets [Builder.wealthAndEmploymentDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wealthAndEmploymentDetails] with a well-typed
         * [LegalEntityWealthEmploymentDetail] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun wealthAndEmploymentDetails(
            wealthAndEmploymentDetails: JsonField<LegalEntityWealthEmploymentDetail>
        ) = apply { body.wealthAndEmploymentDetails(wealthAndEmploymentDetails) }

        /** The entity's primary website URL. */
        fun website(website: String?) = apply { body.website(website) }

        /**
         * Sets [Builder.website] to an arbitrary JSON value.
         *
         * You should usually call [Builder.website] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun website(website: JsonField<String>) = apply { body.website(website) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAlladditional_body_properties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAlladditional_body_properties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAlladditional_body_properties(keys: Set<String>) = apply {
            body.removeAlladditional_body_properties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [LegalEntityUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LegalEntityUpdateParams =
            LegalEntityUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): LegalEntityUpdateRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class LegalEntityUpdateRequest
    private constructor(
        private val addresses: JsonField<List<LegalEntityAddressCreateRequest>>,
        private val bankSettings: JsonField<LegalEntityBankSetting>,
        private val businessName: JsonField<String>,
        private val citizenshipCountry: JsonField<String>,
        private val complianceDetails: JsonField<LegalEntityComplianceDetail>,
        private val dateFormed: JsonField<LocalDate>,
        private val dateOfBirth: JsonField<LocalDate>,
        private val doingBusinessAsNames: JsonField<List<String>>,
        private val email: JsonField<String>,
        private val firstName: JsonField<String>,
        private val identifications: JsonField<List<IdentificationCreateRequest>>,
        private val industryClassifications: JsonField<List<LegalEntityIndustryClassification>>,
        private val lastName: JsonField<String>,
        private val legalStructure: JsonField<LegalStructure>,
        private val metadata: JsonField<Metadata>,
        private val middleName: JsonField<String>,
        private val phoneNumbers: JsonField<List<PhoneNumber>>,
        private val politicallyExposedPerson: JsonField<Boolean>,
        private val preferredName: JsonField<String>,
        private val prefix: JsonField<String>,
        private val riskRating: JsonField<RiskRating>,
        private val suffix: JsonField<String>,
        private val wealthAndEmploymentDetails: JsonField<LegalEntityWealthEmploymentDetail>,
        private val website: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("addresses")
            @ExcludeMissing
            addresses: JsonField<List<LegalEntityAddressCreateRequest>> = JsonMissing.of(),
            @JsonProperty("bank_settings")
            @ExcludeMissing
            bankSettings: JsonField<LegalEntityBankSetting> = JsonMissing.of(),
            @JsonProperty("business_name")
            @ExcludeMissing
            businessName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("citizenship_country")
            @ExcludeMissing
            citizenshipCountry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("compliance_details")
            @ExcludeMissing
            complianceDetails: JsonField<LegalEntityComplianceDetail> = JsonMissing.of(),
            @JsonProperty("date_formed")
            @ExcludeMissing
            dateFormed: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("date_of_birth")
            @ExcludeMissing
            dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("doing_business_as_names")
            @ExcludeMissing
            doingBusinessAsNames: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("identifications")
            @ExcludeMissing
            identifications: JsonField<List<IdentificationCreateRequest>> = JsonMissing.of(),
            @JsonProperty("industry_classifications")
            @ExcludeMissing
            industryClassifications: JsonField<List<LegalEntityIndustryClassification>> =
                JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("legal_structure")
            @ExcludeMissing
            legalStructure: JsonField<LegalStructure> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("middle_name")
            @ExcludeMissing
            middleName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_numbers")
            @ExcludeMissing
            phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of(),
            @JsonProperty("politically_exposed_person")
            @ExcludeMissing
            politicallyExposedPerson: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("preferred_name")
            @ExcludeMissing
            preferredName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prefix") @ExcludeMissing prefix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("risk_rating")
            @ExcludeMissing
            riskRating: JsonField<RiskRating> = JsonMissing.of(),
            @JsonProperty("suffix") @ExcludeMissing suffix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("wealth_and_employment_details")
            @ExcludeMissing
            wealthAndEmploymentDetails: JsonField<LegalEntityWealthEmploymentDetail> =
                JsonMissing.of(),
            @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
        ) : this(
            addresses,
            bankSettings,
            businessName,
            citizenshipCountry,
            complianceDetails,
            dateFormed,
            dateOfBirth,
            doingBusinessAsNames,
            email,
            firstName,
            identifications,
            industryClassifications,
            lastName,
            legalStructure,
            metadata,
            middleName,
            phoneNumbers,
            politicallyExposedPerson,
            preferredName,
            prefix,
            riskRating,
            suffix,
            wealthAndEmploymentDetails,
            website,
            mutableMapOf(),
        )

        /**
         * A list of addresses for the entity.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun addresses(): List<LegalEntityAddressCreateRequest>? = addresses.getNullable("addresses")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun bankSettings(): LegalEntityBankSetting? = bankSettings.getNullable("bank_settings")

        /**
         * The business's legal business name.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun businessName(): String? = businessName.getNullable("business_name")

        /**
         * The country of citizenship for an individual.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun citizenshipCountry(): String? = citizenshipCountry.getNullable("citizenship_country")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun complianceDetails(): LegalEntityComplianceDetail? =
            complianceDetails.getNullable("compliance_details")

        /**
         * A business's formation date (YYYY-MM-DD).
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dateFormed(): LocalDate? = dateFormed.getNullable("date_formed")

        /**
         * An individual's date of birth (YYYY-MM-DD).
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dateOfBirth(): LocalDate? = dateOfBirth.getNullable("date_of_birth")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun doingBusinessAsNames(): List<String>? =
            doingBusinessAsNames.getNullable("doing_business_as_names")

        /**
         * The entity's primary email.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun email(): String? = email.getNullable("email")

        /**
         * An individual's first name.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun firstName(): String? = firstName.getNullable("first_name")

        /**
         * A list of identifications for the legal entity.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun identifications(): List<IdentificationCreateRequest>? =
            identifications.getNullable("identifications")

        /**
         * A list of industry classifications for the legal entity.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun industryClassifications(): List<LegalEntityIndustryClassification>? =
            industryClassifications.getNullable("industry_classifications")

        /**
         * An individual's last name.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lastName(): String? = lastName.getNullable("last_name")

        /**
         * The business's legal structure.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun legalStructure(): LegalStructure? = legalStructure.getNullable("legal_structure")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * An individual's middle name.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun middleName(): String? = middleName.getNullable("middle_name")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun phoneNumbers(): List<PhoneNumber>? = phoneNumbers.getNullable("phone_numbers")

        /**
         * Whether the individual is a politically exposed person.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun politicallyExposedPerson(): Boolean? =
            politicallyExposedPerson.getNullable("politically_exposed_person")

        /**
         * An individual's preferred name.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun preferredName(): String? = preferredName.getNullable("preferred_name")

        /**
         * An individual's prefix.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun prefix(): String? = prefix.getNullable("prefix")

        /**
         * The risk rating of the legal entity. One of low, medium, high.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun riskRating(): RiskRating? = riskRating.getNullable("risk_rating")

        /**
         * An individual's suffix.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun suffix(): String? = suffix.getNullable("suffix")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun wealthAndEmploymentDetails(): LegalEntityWealthEmploymentDetail? =
            wealthAndEmploymentDetails.getNullable("wealth_and_employment_details")

        /**
         * The entity's primary website URL.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun website(): String? = website.getNullable("website")

        /**
         * Returns the raw JSON value of [addresses].
         *
         * Unlike [addresses], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addresses")
        @ExcludeMissing
        fun _addresses(): JsonField<List<LegalEntityAddressCreateRequest>> = addresses

        /**
         * Returns the raw JSON value of [bankSettings].
         *
         * Unlike [bankSettings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bank_settings")
        @ExcludeMissing
        fun _bankSettings(): JsonField<LegalEntityBankSetting> = bankSettings

        /**
         * Returns the raw JSON value of [businessName].
         *
         * Unlike [businessName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("business_name")
        @ExcludeMissing
        fun _businessName(): JsonField<String> = businessName

        /**
         * Returns the raw JSON value of [citizenshipCountry].
         *
         * Unlike [citizenshipCountry], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("citizenship_country")
        @ExcludeMissing
        fun _citizenshipCountry(): JsonField<String> = citizenshipCountry

        /**
         * Returns the raw JSON value of [complianceDetails].
         *
         * Unlike [complianceDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("compliance_details")
        @ExcludeMissing
        fun _complianceDetails(): JsonField<LegalEntityComplianceDetail> = complianceDetails

        /**
         * Returns the raw JSON value of [dateFormed].
         *
         * Unlike [dateFormed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date_formed")
        @ExcludeMissing
        fun _dateFormed(): JsonField<LocalDate> = dateFormed

        /**
         * Returns the raw JSON value of [dateOfBirth].
         *
         * Unlike [dateOfBirth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date_of_birth")
        @ExcludeMissing
        fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

        /**
         * Returns the raw JSON value of [doingBusinessAsNames].
         *
         * Unlike [doingBusinessAsNames], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("doing_business_as_names")
        @ExcludeMissing
        fun _doingBusinessAsNames(): JsonField<List<String>> = doingBusinessAsNames

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [identifications].
         *
         * Unlike [identifications], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("identifications")
        @ExcludeMissing
        fun _identifications(): JsonField<List<IdentificationCreateRequest>> = identifications

        /**
         * Returns the raw JSON value of [industryClassifications].
         *
         * Unlike [industryClassifications], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("industry_classifications")
        @ExcludeMissing
        fun _industryClassifications(): JsonField<List<LegalEntityIndustryClassification>> =
            industryClassifications

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [legalStructure].
         *
         * Unlike [legalStructure], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("legal_structure")
        @ExcludeMissing
        fun _legalStructure(): JsonField<LegalStructure> = legalStructure

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [middleName].
         *
         * Unlike [middleName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("middle_name")
        @ExcludeMissing
        fun _middleName(): JsonField<String> = middleName

        /**
         * Returns the raw JSON value of [phoneNumbers].
         *
         * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        fun _phoneNumbers(): JsonField<List<PhoneNumber>> = phoneNumbers

        /**
         * Returns the raw JSON value of [politicallyExposedPerson].
         *
         * Unlike [politicallyExposedPerson], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("politically_exposed_person")
        @ExcludeMissing
        fun _politicallyExposedPerson(): JsonField<Boolean> = politicallyExposedPerson

        /**
         * Returns the raw JSON value of [preferredName].
         *
         * Unlike [preferredName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("preferred_name")
        @ExcludeMissing
        fun _preferredName(): JsonField<String> = preferredName

        /**
         * Returns the raw JSON value of [prefix].
         *
         * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

        /**
         * Returns the raw JSON value of [riskRating].
         *
         * Unlike [riskRating], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("risk_rating")
        @ExcludeMissing
        fun _riskRating(): JsonField<RiskRating> = riskRating

        /**
         * Returns the raw JSON value of [suffix].
         *
         * Unlike [suffix], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("suffix") @ExcludeMissing fun _suffix(): JsonField<String> = suffix

        /**
         * Returns the raw JSON value of [wealthAndEmploymentDetails].
         *
         * Unlike [wealthAndEmploymentDetails], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("wealth_and_employment_details")
        @ExcludeMissing
        fun _wealthAndEmploymentDetails(): JsonField<LegalEntityWealthEmploymentDetail> =
            wealthAndEmploymentDetails

        /**
         * Returns the raw JSON value of [website].
         *
         * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

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
             * Returns a mutable builder for constructing an instance of [LegalEntityUpdateRequest].
             */
            fun builder() = Builder()
        }

        /** A builder for [LegalEntityUpdateRequest]. */
        class Builder internal constructor() {

            private var addresses: JsonField<MutableList<LegalEntityAddressCreateRequest>>? = null
            private var bankSettings: JsonField<LegalEntityBankSetting> = JsonMissing.of()
            private var businessName: JsonField<String> = JsonMissing.of()
            private var citizenshipCountry: JsonField<String> = JsonMissing.of()
            private var complianceDetails: JsonField<LegalEntityComplianceDetail> = JsonMissing.of()
            private var dateFormed: JsonField<LocalDate> = JsonMissing.of()
            private var dateOfBirth: JsonField<LocalDate> = JsonMissing.of()
            private var doingBusinessAsNames: JsonField<MutableList<String>>? = null
            private var email: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var identifications: JsonField<MutableList<IdentificationCreateRequest>>? = null
            private var industryClassifications:
                JsonField<MutableList<LegalEntityIndustryClassification>>? =
                null
            private var lastName: JsonField<String> = JsonMissing.of()
            private var legalStructure: JsonField<LegalStructure> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var middleName: JsonField<String> = JsonMissing.of()
            private var phoneNumbers: JsonField<MutableList<PhoneNumber>>? = null
            private var politicallyExposedPerson: JsonField<Boolean> = JsonMissing.of()
            private var preferredName: JsonField<String> = JsonMissing.of()
            private var prefix: JsonField<String> = JsonMissing.of()
            private var riskRating: JsonField<RiskRating> = JsonMissing.of()
            private var suffix: JsonField<String> = JsonMissing.of()
            private var wealthAndEmploymentDetails: JsonField<LegalEntityWealthEmploymentDetail> =
                JsonMissing.of()
            private var website: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(legalEntityUpdateRequest: LegalEntityUpdateRequest) = apply {
                addresses = legalEntityUpdateRequest.addresses.map { it.toMutableList() }
                bankSettings = legalEntityUpdateRequest.bankSettings
                businessName = legalEntityUpdateRequest.businessName
                citizenshipCountry = legalEntityUpdateRequest.citizenshipCountry
                complianceDetails = legalEntityUpdateRequest.complianceDetails
                dateFormed = legalEntityUpdateRequest.dateFormed
                dateOfBirth = legalEntityUpdateRequest.dateOfBirth
                doingBusinessAsNames =
                    legalEntityUpdateRequest.doingBusinessAsNames.map { it.toMutableList() }
                email = legalEntityUpdateRequest.email
                firstName = legalEntityUpdateRequest.firstName
                identifications =
                    legalEntityUpdateRequest.identifications.map { it.toMutableList() }
                industryClassifications =
                    legalEntityUpdateRequest.industryClassifications.map { it.toMutableList() }
                lastName = legalEntityUpdateRequest.lastName
                legalStructure = legalEntityUpdateRequest.legalStructure
                metadata = legalEntityUpdateRequest.metadata
                middleName = legalEntityUpdateRequest.middleName
                phoneNumbers = legalEntityUpdateRequest.phoneNumbers.map { it.toMutableList() }
                politicallyExposedPerson = legalEntityUpdateRequest.politicallyExposedPerson
                preferredName = legalEntityUpdateRequest.preferredName
                prefix = legalEntityUpdateRequest.prefix
                riskRating = legalEntityUpdateRequest.riskRating
                suffix = legalEntityUpdateRequest.suffix
                wealthAndEmploymentDetails = legalEntityUpdateRequest.wealthAndEmploymentDetails
                website = legalEntityUpdateRequest.website
                additionalProperties = legalEntityUpdateRequest.additionalProperties.toMutableMap()
            }

            /** A list of addresses for the entity. */
            fun addresses(addresses: List<LegalEntityAddressCreateRequest>) =
                addresses(JsonField.of(addresses))

            /**
             * Sets [Builder.addresses] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addresses] with a well-typed
             * `List<LegalEntityAddressCreateRequest>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun addresses(addresses: JsonField<List<LegalEntityAddressCreateRequest>>) = apply {
                this.addresses = addresses.map { it.toMutableList() }
            }

            /**
             * Adds a single [LegalEntityAddressCreateRequest] to [addresses].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
                addresses =
                    (addresses ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addresses", it).add(address)
                    }
            }

            fun bankSettings(bankSettings: LegalEntityBankSetting?) =
                bankSettings(JsonField.ofNullable(bankSettings))

            /**
             * Sets [Builder.bankSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bankSettings] with a well-typed
             * [LegalEntityBankSetting] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun bankSettings(bankSettings: JsonField<LegalEntityBankSetting>) = apply {
                this.bankSettings = bankSettings
            }

            /** The business's legal business name. */
            fun businessName(businessName: String?) =
                businessName(JsonField.ofNullable(businessName))

            /**
             * Sets [Builder.businessName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun businessName(businessName: JsonField<String>) = apply {
                this.businessName = businessName
            }

            /** The country of citizenship for an individual. */
            fun citizenshipCountry(citizenshipCountry: String?) =
                citizenshipCountry(JsonField.ofNullable(citizenshipCountry))

            /**
             * Sets [Builder.citizenshipCountry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.citizenshipCountry] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun citizenshipCountry(citizenshipCountry: JsonField<String>) = apply {
                this.citizenshipCountry = citizenshipCountry
            }

            fun complianceDetails(complianceDetails: LegalEntityComplianceDetail?) =
                complianceDetails(JsonField.ofNullable(complianceDetails))

            /**
             * Sets [Builder.complianceDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.complianceDetails] with a well-typed
             * [LegalEntityComplianceDetail] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun complianceDetails(complianceDetails: JsonField<LegalEntityComplianceDetail>) =
                apply {
                    this.complianceDetails = complianceDetails
                }

            /** A business's formation date (YYYY-MM-DD). */
            fun dateFormed(dateFormed: LocalDate?) = dateFormed(JsonField.ofNullable(dateFormed))

            /**
             * Sets [Builder.dateFormed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateFormed] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateFormed(dateFormed: JsonField<LocalDate>) = apply {
                this.dateFormed = dateFormed
            }

            /** An individual's date of birth (YYYY-MM-DD). */
            fun dateOfBirth(dateOfBirth: LocalDate?) =
                dateOfBirth(JsonField.ofNullable(dateOfBirth))

            /**
             * Sets [Builder.dateOfBirth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateOfBirth] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                this.dateOfBirth = dateOfBirth
            }

            fun doingBusinessAsNames(doingBusinessAsNames: List<String>) =
                doingBusinessAsNames(JsonField.of(doingBusinessAsNames))

            /**
             * Sets [Builder.doingBusinessAsNames] to an arbitrary JSON value.
             *
             * You should usually call [Builder.doingBusinessAsNames] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun doingBusinessAsNames(doingBusinessAsNames: JsonField<List<String>>) = apply {
                this.doingBusinessAsNames = doingBusinessAsNames.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [doingBusinessAsNames].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
                doingBusinessAsNames =
                    (doingBusinessAsNames ?: JsonField.of(mutableListOf())).also {
                        checkKnown("doingBusinessAsNames", it).add(doingBusinessAsName)
                    }
            }

            /** The entity's primary email. */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** An individual's first name. */
            fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** A list of identifications for the legal entity. */
            fun identifications(identifications: List<IdentificationCreateRequest>) =
                identifications(JsonField.of(identifications))

            /**
             * Sets [Builder.identifications] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identifications] with a well-typed
             * `List<IdentificationCreateRequest>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun identifications(identifications: JsonField<List<IdentificationCreateRequest>>) =
                apply {
                    this.identifications = identifications.map { it.toMutableList() }
                }

            /**
             * Adds a single [IdentificationCreateRequest] to [identifications].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIdentification(identification: IdentificationCreateRequest) = apply {
                identifications =
                    (identifications ?: JsonField.of(mutableListOf())).also {
                        checkKnown("identifications", it).add(identification)
                    }
            }

            /** A list of industry classifications for the legal entity. */
            fun industryClassifications(
                industryClassifications: List<LegalEntityIndustryClassification>
            ) = industryClassifications(JsonField.of(industryClassifications))

            /**
             * Sets [Builder.industryClassifications] to an arbitrary JSON value.
             *
             * You should usually call [Builder.industryClassifications] with a well-typed
             * `List<LegalEntityIndustryClassification>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun industryClassifications(
                industryClassifications: JsonField<List<LegalEntityIndustryClassification>>
            ) = apply {
                this.industryClassifications = industryClassifications.map { it.toMutableList() }
            }

            /**
             * Adds a single [LegalEntityIndustryClassification] to [industryClassifications].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIndustryClassification(
                industryClassification: LegalEntityIndustryClassification
            ) = apply {
                industryClassifications =
                    (industryClassifications ?: JsonField.of(mutableListOf())).also {
                        checkKnown("industryClassifications", it).add(industryClassification)
                    }
            }

            /** An individual's last name. */
            fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** The business's legal structure. */
            fun legalStructure(legalStructure: LegalStructure?) =
                legalStructure(JsonField.ofNullable(legalStructure))

            /**
             * Sets [Builder.legalStructure] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalStructure] with a well-typed [LegalStructure]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun legalStructure(legalStructure: JsonField<LegalStructure>) = apply {
                this.legalStructure = legalStructure
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** An individual's middle name. */
            fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

            /**
             * Sets [Builder.middleName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.middleName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

            fun phoneNumbers(phoneNumbers: List<PhoneNumber>) =
                phoneNumbers(JsonField.of(phoneNumbers))

            /**
             * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumbers] with a well-typed `List<PhoneNumber>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber>>) = apply {
                this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
            }

            /**
             * Adds a single [PhoneNumber] to [phoneNumbers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
                phoneNumbers =
                    (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("phoneNumbers", it).add(phoneNumber)
                    }
            }

            /** Whether the individual is a politically exposed person. */
            fun politicallyExposedPerson(politicallyExposedPerson: Boolean?) =
                politicallyExposedPerson(JsonField.ofNullable(politicallyExposedPerson))

            /**
             * Alias for [Builder.politicallyExposedPerson].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun politicallyExposedPerson(politicallyExposedPerson: Boolean) =
                politicallyExposedPerson(politicallyExposedPerson as Boolean?)

            /**
             * Sets [Builder.politicallyExposedPerson] to an arbitrary JSON value.
             *
             * You should usually call [Builder.politicallyExposedPerson] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun politicallyExposedPerson(politicallyExposedPerson: JsonField<Boolean>) = apply {
                this.politicallyExposedPerson = politicallyExposedPerson
            }

            /** An individual's preferred name. */
            fun preferredName(preferredName: String?) =
                preferredName(JsonField.ofNullable(preferredName))

            /**
             * Sets [Builder.preferredName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preferredName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preferredName(preferredName: JsonField<String>) = apply {
                this.preferredName = preferredName
            }

            /** An individual's prefix. */
            fun prefix(prefix: String?) = prefix(JsonField.ofNullable(prefix))

            /**
             * Sets [Builder.prefix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prefix] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

            /** The risk rating of the legal entity. One of low, medium, high. */
            fun riskRating(riskRating: RiskRating?) = riskRating(JsonField.ofNullable(riskRating))

            /**
             * Sets [Builder.riskRating] to an arbitrary JSON value.
             *
             * You should usually call [Builder.riskRating] with a well-typed [RiskRating] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun riskRating(riskRating: JsonField<RiskRating>) = apply {
                this.riskRating = riskRating
            }

            /** An individual's suffix. */
            fun suffix(suffix: String?) = suffix(JsonField.ofNullable(suffix))

            /**
             * Sets [Builder.suffix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suffix] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

            fun wealthAndEmploymentDetails(
                wealthAndEmploymentDetails: LegalEntityWealthEmploymentDetail?
            ) = wealthAndEmploymentDetails(JsonField.ofNullable(wealthAndEmploymentDetails))

            /**
             * Sets [Builder.wealthAndEmploymentDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wealthAndEmploymentDetails] with a well-typed
             * [LegalEntityWealthEmploymentDetail] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun wealthAndEmploymentDetails(
                wealthAndEmploymentDetails: JsonField<LegalEntityWealthEmploymentDetail>
            ) = apply { this.wealthAndEmploymentDetails = wealthAndEmploymentDetails }

            /** The entity's primary website URL. */
            fun website(website: String?) = website(JsonField.ofNullable(website))

            /**
             * Sets [Builder.website] to an arbitrary JSON value.
             *
             * You should usually call [Builder.website] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun website(website: JsonField<String>) = apply { this.website = website }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [LegalEntityUpdateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LegalEntityUpdateRequest =
                LegalEntityUpdateRequest(
                    (addresses ?: JsonMissing.of()).map { it.toImmutable() },
                    bankSettings,
                    businessName,
                    citizenshipCountry,
                    complianceDetails,
                    dateFormed,
                    dateOfBirth,
                    (doingBusinessAsNames ?: JsonMissing.of()).map { it.toImmutable() },
                    email,
                    firstName,
                    (identifications ?: JsonMissing.of()).map { it.toImmutable() },
                    (industryClassifications ?: JsonMissing.of()).map { it.toImmutable() },
                    lastName,
                    legalStructure,
                    metadata,
                    middleName,
                    (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                    politicallyExposedPerson,
                    preferredName,
                    prefix,
                    riskRating,
                    suffix,
                    wealthAndEmploymentDetails,
                    website,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LegalEntityUpdateRequest = apply {
            if (validated) {
                return@apply
            }

            addresses()?.forEach { it.validate() }
            bankSettings()?.validate()
            businessName()
            citizenshipCountry()
            complianceDetails()?.validate()
            dateFormed()
            dateOfBirth()
            doingBusinessAsNames()
            email()
            firstName()
            identifications()?.forEach { it.validate() }
            industryClassifications()?.forEach { it.validate() }
            lastName()
            legalStructure()?.validate()
            metadata()?.validate()
            middleName()
            phoneNumbers()?.forEach { it.validate() }
            politicallyExposedPerson()
            preferredName()
            prefix()
            riskRating()?.validate()
            suffix()
            wealthAndEmploymentDetails()?.validate()
            website()
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
            (addresses.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (bankSettings.asKnown()?.validity() ?: 0) +
                (if (businessName.asKnown() == null) 0 else 1) +
                (if (citizenshipCountry.asKnown() == null) 0 else 1) +
                (complianceDetails.asKnown()?.validity() ?: 0) +
                (if (dateFormed.asKnown() == null) 0 else 1) +
                (if (dateOfBirth.asKnown() == null) 0 else 1) +
                (doingBusinessAsNames.asKnown()?.size ?: 0) +
                (if (email.asKnown() == null) 0 else 1) +
                (if (firstName.asKnown() == null) 0 else 1) +
                (identifications.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (industryClassifications.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (lastName.asKnown() == null) 0 else 1) +
                (legalStructure.asKnown()?.validity() ?: 0) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (middleName.asKnown() == null) 0 else 1) +
                (phoneNumbers.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (politicallyExposedPerson.asKnown() == null) 0 else 1) +
                (if (preferredName.asKnown() == null) 0 else 1) +
                (if (prefix.asKnown() == null) 0 else 1) +
                (riskRating.asKnown()?.validity() ?: 0) +
                (if (suffix.asKnown() == null) 0 else 1) +
                (wealthAndEmploymentDetails.asKnown()?.validity() ?: 0) +
                (if (website.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LegalEntityUpdateRequest &&
                addresses == other.addresses &&
                bankSettings == other.bankSettings &&
                businessName == other.businessName &&
                citizenshipCountry == other.citizenshipCountry &&
                complianceDetails == other.complianceDetails &&
                dateFormed == other.dateFormed &&
                dateOfBirth == other.dateOfBirth &&
                doingBusinessAsNames == other.doingBusinessAsNames &&
                email == other.email &&
                firstName == other.firstName &&
                identifications == other.identifications &&
                industryClassifications == other.industryClassifications &&
                lastName == other.lastName &&
                legalStructure == other.legalStructure &&
                metadata == other.metadata &&
                middleName == other.middleName &&
                phoneNumbers == other.phoneNumbers &&
                politicallyExposedPerson == other.politicallyExposedPerson &&
                preferredName == other.preferredName &&
                prefix == other.prefix &&
                riskRating == other.riskRating &&
                suffix == other.suffix &&
                wealthAndEmploymentDetails == other.wealthAndEmploymentDetails &&
                website == other.website &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                addresses,
                bankSettings,
                businessName,
                citizenshipCountry,
                complianceDetails,
                dateFormed,
                dateOfBirth,
                doingBusinessAsNames,
                email,
                firstName,
                identifications,
                industryClassifications,
                lastName,
                legalStructure,
                metadata,
                middleName,
                phoneNumbers,
                politicallyExposedPerson,
                preferredName,
                prefix,
                riskRating,
                suffix,
                wealthAndEmploymentDetails,
                website,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntityUpdateRequest{addresses=$addresses, bankSettings=$bankSettings, businessName=$businessName, citizenshipCountry=$citizenshipCountry, complianceDetails=$complianceDetails, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, industryClassifications=$industryClassifications, lastName=$lastName, legalStructure=$legalStructure, metadata=$metadata, middleName=$middleName, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, riskRating=$riskRating, suffix=$suffix, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, additionalProperties=$additionalProperties}"
    }

    class LegalEntityBankSetting
    private constructor(
        private val id: JsonField<String>,
        private val backupWithholdingPercentage: JsonField<Long>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val discardedAt: JsonField<OffsetDateTime>,
        private val enableBackupWithholding: JsonField<Boolean>,
        private val liveMode: JsonField<Boolean>,
        private val object_: JsonField<String>,
        private val privacyOptOut: JsonField<Boolean>,
        private val regulationO: JsonField<Boolean>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("backup_withholding_percentage")
            @ExcludeMissing
            backupWithholdingPercentage: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("discarded_at")
            @ExcludeMissing
            discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("enable_backup_withholding")
            @ExcludeMissing
            enableBackupWithholding: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("live_mode")
            @ExcludeMissing
            liveMode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("privacy_opt_out")
            @ExcludeMissing
            privacyOptOut: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("regulation_o")
            @ExcludeMissing
            regulationO: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            backupWithholdingPercentage,
            createdAt,
            discardedAt,
            enableBackupWithholding,
            liveMode,
            object_,
            privacyOptOut,
            regulationO,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The percentage of backup withholding to apply to the legal entity.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun backupWithholdingPercentage(): Long? =
            backupWithholdingPercentage.getNullable("backup_withholding_percentage")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

        /**
         * Whether backup withholding is enabled. See more here -
         * https://www.irs.gov/businesses/small-businesses-self-employed/backup-withholding.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun enableBackupWithholding(): Boolean? =
            enableBackupWithholding.getNullable("enable_backup_withholding")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun object_(): String = object_.getRequired("object")

        /**
         * Cross River Bank specific setting to opt out of privacy policy.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun privacyOptOut(): Boolean? = privacyOptOut.getNullable("privacy_opt_out")

        /**
         * It covers, among other types of insider loans, extensions of credit by a member bank to
         * an executive officer, director, or principal shareholder of the member bank; a bank
         * holding company of which the member bank is a subsidiary; and any other subsidiary of
         * that bank holding company.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun regulationO(): Boolean? = regulationO.getNullable("regulation_o")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [backupWithholdingPercentage].
         *
         * Unlike [backupWithholdingPercentage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("backup_withholding_percentage")
        @ExcludeMissing
        fun _backupWithholdingPercentage(): JsonField<Long> = backupWithholdingPercentage

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [discardedAt].
         *
         * Unlike [discardedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

        /**
         * Returns the raw JSON value of [enableBackupWithholding].
         *
         * Unlike [enableBackupWithholding], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("enable_backup_withholding")
        @ExcludeMissing
        fun _enableBackupWithholding(): JsonField<Boolean> = enableBackupWithholding

        /**
         * Returns the raw JSON value of [liveMode].
         *
         * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

        /**
         * Returns the raw JSON value of [object_].
         *
         * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        /**
         * Returns the raw JSON value of [privacyOptOut].
         *
         * Unlike [privacyOptOut], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("privacy_opt_out")
        @ExcludeMissing
        fun _privacyOptOut(): JsonField<Boolean> = privacyOptOut

        /**
         * Returns the raw JSON value of [regulationO].
         *
         * Unlike [regulationO], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("regulation_o")
        @ExcludeMissing
        fun _regulationO(): JsonField<Boolean> = regulationO

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
             * Returns a mutable builder for constructing an instance of [LegalEntityBankSetting].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .backupWithholdingPercentage()
             * .createdAt()
             * .discardedAt()
             * .enableBackupWithholding()
             * .liveMode()
             * .object_()
             * .privacyOptOut()
             * .regulationO()
             * .updatedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LegalEntityBankSetting]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var backupWithholdingPercentage: JsonField<Long>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var discardedAt: JsonField<OffsetDateTime>? = null
            private var enableBackupWithholding: JsonField<Boolean>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var object_: JsonField<String>? = null
            private var privacyOptOut: JsonField<Boolean>? = null
            private var regulationO: JsonField<Boolean>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(legalEntityBankSetting: LegalEntityBankSetting) = apply {
                id = legalEntityBankSetting.id
                backupWithholdingPercentage = legalEntityBankSetting.backupWithholdingPercentage
                createdAt = legalEntityBankSetting.createdAt
                discardedAt = legalEntityBankSetting.discardedAt
                enableBackupWithholding = legalEntityBankSetting.enableBackupWithholding
                liveMode = legalEntityBankSetting.liveMode
                object_ = legalEntityBankSetting.object_
                privacyOptOut = legalEntityBankSetting.privacyOptOut
                regulationO = legalEntityBankSetting.regulationO
                updatedAt = legalEntityBankSetting.updatedAt
                additionalProperties = legalEntityBankSetting.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The percentage of backup withholding to apply to the legal entity. */
            fun backupWithholdingPercentage(backupWithholdingPercentage: Long?) =
                backupWithholdingPercentage(JsonField.ofNullable(backupWithholdingPercentage))

            /**
             * Alias for [Builder.backupWithholdingPercentage].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun backupWithholdingPercentage(backupWithholdingPercentage: Long) =
                backupWithholdingPercentage(backupWithholdingPercentage as Long?)

            /**
             * Sets [Builder.backupWithholdingPercentage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.backupWithholdingPercentage] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun backupWithholdingPercentage(backupWithholdingPercentage: JsonField<Long>) = apply {
                this.backupWithholdingPercentage = backupWithholdingPercentage
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun discardedAt(discardedAt: OffsetDateTime?) =
                discardedAt(JsonField.ofNullable(discardedAt))

            /**
             * Sets [Builder.discardedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discardedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                this.discardedAt = discardedAt
            }

            /**
             * Whether backup withholding is enabled. See more here -
             * https://www.irs.gov/businesses/small-businesses-self-employed/backup-withholding.
             */
            fun enableBackupWithholding(enableBackupWithholding: Boolean?) =
                enableBackupWithholding(JsonField.ofNullable(enableBackupWithholding))

            /**
             * Alias for [Builder.enableBackupWithholding].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun enableBackupWithholding(enableBackupWithholding: Boolean) =
                enableBackupWithholding(enableBackupWithholding as Boolean?)

            /**
             * Sets [Builder.enableBackupWithholding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enableBackupWithholding] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun enableBackupWithholding(enableBackupWithholding: JsonField<Boolean>) = apply {
                this.enableBackupWithholding = enableBackupWithholding
            }

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

            /**
             * Sets [Builder.liveMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.liveMode] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            fun object_(object_: String) = object_(JsonField.of(object_))

            /**
             * Sets [Builder.object_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.object_] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /** Cross River Bank specific setting to opt out of privacy policy. */
            fun privacyOptOut(privacyOptOut: Boolean?) =
                privacyOptOut(JsonField.ofNullable(privacyOptOut))

            /**
             * Alias for [Builder.privacyOptOut].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun privacyOptOut(privacyOptOut: Boolean) = privacyOptOut(privacyOptOut as Boolean?)

            /**
             * Sets [Builder.privacyOptOut] to an arbitrary JSON value.
             *
             * You should usually call [Builder.privacyOptOut] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun privacyOptOut(privacyOptOut: JsonField<Boolean>) = apply {
                this.privacyOptOut = privacyOptOut
            }

            /**
             * It covers, among other types of insider loans, extensions of credit by a member bank
             * to an executive officer, director, or principal shareholder of the member bank; a
             * bank holding company of which the member bank is a subsidiary; and any other
             * subsidiary of that bank holding company.
             */
            fun regulationO(regulationO: Boolean?) = regulationO(JsonField.ofNullable(regulationO))

            /**
             * Alias for [Builder.regulationO].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun regulationO(regulationO: Boolean) = regulationO(regulationO as Boolean?)

            /**
             * Sets [Builder.regulationO] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regulationO] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun regulationO(regulationO: JsonField<Boolean>) = apply {
                this.regulationO = regulationO
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [LegalEntityBankSetting].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .backupWithholdingPercentage()
             * .createdAt()
             * .discardedAt()
             * .enableBackupWithholding()
             * .liveMode()
             * .object_()
             * .privacyOptOut()
             * .regulationO()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LegalEntityBankSetting =
                LegalEntityBankSetting(
                    checkRequired("id", id),
                    checkRequired("backupWithholdingPercentage", backupWithholdingPercentage),
                    checkRequired("createdAt", createdAt),
                    checkRequired("discardedAt", discardedAt),
                    checkRequired("enableBackupWithholding", enableBackupWithholding),
                    checkRequired("liveMode", liveMode),
                    checkRequired("object_", object_),
                    checkRequired("privacyOptOut", privacyOptOut),
                    checkRequired("regulationO", regulationO),
                    checkRequired("updatedAt", updatedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LegalEntityBankSetting = apply {
            if (validated) {
                return@apply
            }

            id()
            backupWithholdingPercentage()
            createdAt()
            discardedAt()
            enableBackupWithholding()
            liveMode()
            object_()
            privacyOptOut()
            regulationO()
            updatedAt()
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
            (if (id.asKnown() == null) 0 else 1) +
                (if (backupWithholdingPercentage.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (discardedAt.asKnown() == null) 0 else 1) +
                (if (enableBackupWithholding.asKnown() == null) 0 else 1) +
                (if (liveMode.asKnown() == null) 0 else 1) +
                (if (object_.asKnown() == null) 0 else 1) +
                (if (privacyOptOut.asKnown() == null) 0 else 1) +
                (if (regulationO.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LegalEntityBankSetting &&
                id == other.id &&
                backupWithholdingPercentage == other.backupWithholdingPercentage &&
                createdAt == other.createdAt &&
                discardedAt == other.discardedAt &&
                enableBackupWithholding == other.enableBackupWithholding &&
                liveMode == other.liveMode &&
                object_ == other.object_ &&
                privacyOptOut == other.privacyOptOut &&
                regulationO == other.regulationO &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                backupWithholdingPercentage,
                createdAt,
                discardedAt,
                enableBackupWithholding,
                liveMode,
                object_,
                privacyOptOut,
                regulationO,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntityBankSetting{id=$id, backupWithholdingPercentage=$backupWithholdingPercentage, createdAt=$createdAt, discardedAt=$discardedAt, enableBackupWithholding=$enableBackupWithholding, liveMode=$liveMode, object_=$object_, privacyOptOut=$privacyOptOut, regulationO=$regulationO, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    /** The business's legal structure. */
    class LegalStructure @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val CORPORATION = of("corporation")

            val LLC = of("llc")

            val NON_PROFIT = of("non_profit")

            val PARTNERSHIP = of("partnership")

            val SOLE_PROPRIETORSHIP = of("sole_proprietorship")

            val TRUST = of("trust")

            fun of(value: String) = LegalStructure(JsonField.of(value))
        }

        /** An enum containing [LegalStructure]'s known values. */
        enum class Known {
            CORPORATION,
            LLC,
            NON_PROFIT,
            PARTNERSHIP,
            SOLE_PROPRIETORSHIP,
            TRUST,
        }

        /**
         * An enum containing [LegalStructure]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LegalStructure] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CORPORATION,
            LLC,
            NON_PROFIT,
            PARTNERSHIP,
            SOLE_PROPRIETORSHIP,
            TRUST,
            /**
             * An enum member indicating that [LegalStructure] was instantiated with an unknown
             * value.
             */
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
                CORPORATION -> Value.CORPORATION
                LLC -> Value.LLC
                NON_PROFIT -> Value.NON_PROFIT
                PARTNERSHIP -> Value.PARTNERSHIP
                SOLE_PROPRIETORSHIP -> Value.SOLE_PROPRIETORSHIP
                TRUST -> Value.TRUST
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
                CORPORATION -> Known.CORPORATION
                LLC -> Known.LLC
                NON_PROFIT -> Known.NON_PROFIT
                PARTNERSHIP -> Known.PARTNERSHIP
                SOLE_PROPRIETORSHIP -> Known.SOLE_PROPRIETORSHIP
                TRUST -> Known.TRUST
                else -> throw ModernTreasuryInvalidDataException("Unknown LegalStructure: $value")
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

        fun validate(): LegalStructure = apply {
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

            return other is LegalStructure && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /** A list of phone numbers in E.164 format. */
    class PhoneNumber
    private constructor(
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of()
        ) : this(phoneNumber, mutableMapOf())

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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

            /** Returns a mutable builder for constructing an instance of [PhoneNumber]. */
            fun builder() = Builder()
        }

        /** A builder for [PhoneNumber]. */
        class Builder internal constructor() {

            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(phoneNumber: PhoneNumber) = apply {
                this.phoneNumber = phoneNumber.phoneNumber
                additionalProperties = phoneNumber.additionalProperties.toMutableMap()
            }

            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [PhoneNumber].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PhoneNumber = PhoneNumber(phoneNumber, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): PhoneNumber = apply {
            if (validated) {
                return@apply
            }

            phoneNumber()
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
        internal fun validity(): Int = (if (phoneNumber.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PhoneNumber &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(phoneNumber, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PhoneNumber{phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    /** The risk rating of the legal entity. One of low, medium, high. */
    class RiskRating @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val LOW = of("low")

            val MEDIUM = of("medium")

            val HIGH = of("high")

            fun of(value: String) = RiskRating(JsonField.of(value))
        }

        /** An enum containing [RiskRating]'s known values. */
        enum class Known {
            LOW,
            MEDIUM,
            HIGH,
        }

        /**
         * An enum containing [RiskRating]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RiskRating] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOW,
            MEDIUM,
            HIGH,
            /**
             * An enum member indicating that [RiskRating] was instantiated with an unknown value.
             */
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
                LOW -> Value.LOW
                MEDIUM -> Value.MEDIUM
                HIGH -> Value.HIGH
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
                LOW -> Known.LOW
                MEDIUM -> Known.MEDIUM
                HIGH -> Known.HIGH
                else -> throw ModernTreasuryInvalidDataException("Unknown RiskRating: $value")
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

        fun validate(): RiskRating = apply {
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

            return other is RiskRating && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class LegalEntityWealthEmploymentDetail
    private constructor(
        private val id: JsonField<String>,
        private val annualIncome: JsonField<Long>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val discardedAt: JsonField<OffsetDateTime>,
        private val employerCountry: JsonField<String>,
        private val employerName: JsonField<String>,
        private val employerState: JsonField<String>,
        private val employmentStatus: JsonField<EmploymentStatus>,
        private val incomeCountry: JsonField<String>,
        private val incomeSource: JsonField<IncomeSource>,
        private val incomeState: JsonField<String>,
        private val industry: JsonField<Industry>,
        private val liveMode: JsonField<Boolean>,
        private val object_: JsonField<String>,
        private val occupation: JsonField<Occupation>,
        private val sourceOfFunds: JsonField<SourceOfFunds>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val wealthSource: JsonField<WealthSource>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("annual_income")
            @ExcludeMissing
            annualIncome: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("discarded_at")
            @ExcludeMissing
            discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("employer_country")
            @ExcludeMissing
            employerCountry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("employer_name")
            @ExcludeMissing
            employerName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("employer_state")
            @ExcludeMissing
            employerState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("employment_status")
            @ExcludeMissing
            employmentStatus: JsonField<EmploymentStatus> = JsonMissing.of(),
            @JsonProperty("income_country")
            @ExcludeMissing
            incomeCountry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("income_source")
            @ExcludeMissing
            incomeSource: JsonField<IncomeSource> = JsonMissing.of(),
            @JsonProperty("income_state")
            @ExcludeMissing
            incomeState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("industry")
            @ExcludeMissing
            industry: JsonField<Industry> = JsonMissing.of(),
            @JsonProperty("live_mode")
            @ExcludeMissing
            liveMode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("occupation")
            @ExcludeMissing
            occupation: JsonField<Occupation> = JsonMissing.of(),
            @JsonProperty("source_of_funds")
            @ExcludeMissing
            sourceOfFunds: JsonField<SourceOfFunds> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("wealth_source")
            @ExcludeMissing
            wealthSource: JsonField<WealthSource> = JsonMissing.of(),
        ) : this(
            id,
            annualIncome,
            createdAt,
            discardedAt,
            employerCountry,
            employerName,
            employerState,
            employmentStatus,
            incomeCountry,
            incomeSource,
            incomeState,
            industry,
            liveMode,
            object_,
            occupation,
            sourceOfFunds,
            updatedAt,
            wealthSource,
            mutableMapOf(),
        )

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The annual income of the individual.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun annualIncome(): Long? = annualIncome.getNullable("annual_income")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

        /**
         * The country in which the employer is located.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun employerCountry(): String? = employerCountry.getNullable("employer_country")

        /**
         * The name of the employer.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun employerName(): String? = employerName.getNullable("employer_name")

        /**
         * The state in which the employer is located.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun employerState(): String? = employerState.getNullable("employer_state")

        /**
         * The employment status of the individual.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun employmentStatus(): EmploymentStatus? =
            employmentStatus.getNullable("employment_status")

        /**
         * The country in which the individual's income is earned.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun incomeCountry(): String? = incomeCountry.getNullable("income_country")

        /**
         * The source of the individual's income.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun incomeSource(): IncomeSource? = incomeSource.getNullable("income_source")

        /**
         * The state in which the individual's income is earned.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun incomeState(): String? = incomeState.getNullable("income_state")

        /**
         * The industry of the individual.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun industry(): Industry? = industry.getNullable("industry")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun object_(): String = object_.getRequired("object")

        /**
         * The occupation of the individual.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun occupation(): Occupation? = occupation.getNullable("occupation")

        /**
         * The source of the individual's funds.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sourceOfFunds(): SourceOfFunds? = sourceOfFunds.getNullable("source_of_funds")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * The source of the individual's wealth.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun wealthSource(): WealthSource? = wealthSource.getNullable("wealth_source")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [annualIncome].
         *
         * Unlike [annualIncome], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("annual_income")
        @ExcludeMissing
        fun _annualIncome(): JsonField<Long> = annualIncome

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [discardedAt].
         *
         * Unlike [discardedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

        /**
         * Returns the raw JSON value of [employerCountry].
         *
         * Unlike [employerCountry], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("employer_country")
        @ExcludeMissing
        fun _employerCountry(): JsonField<String> = employerCountry

        /**
         * Returns the raw JSON value of [employerName].
         *
         * Unlike [employerName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("employer_name")
        @ExcludeMissing
        fun _employerName(): JsonField<String> = employerName

        /**
         * Returns the raw JSON value of [employerState].
         *
         * Unlike [employerState], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("employer_state")
        @ExcludeMissing
        fun _employerState(): JsonField<String> = employerState

        /**
         * Returns the raw JSON value of [employmentStatus].
         *
         * Unlike [employmentStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("employment_status")
        @ExcludeMissing
        fun _employmentStatus(): JsonField<EmploymentStatus> = employmentStatus

        /**
         * Returns the raw JSON value of [incomeCountry].
         *
         * Unlike [incomeCountry], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("income_country")
        @ExcludeMissing
        fun _incomeCountry(): JsonField<String> = incomeCountry

        /**
         * Returns the raw JSON value of [incomeSource].
         *
         * Unlike [incomeSource], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("income_source")
        @ExcludeMissing
        fun _incomeSource(): JsonField<IncomeSource> = incomeSource

        /**
         * Returns the raw JSON value of [incomeState].
         *
         * Unlike [incomeState], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("income_state")
        @ExcludeMissing
        fun _incomeState(): JsonField<String> = incomeState

        /**
         * Returns the raw JSON value of [industry].
         *
         * Unlike [industry], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("industry") @ExcludeMissing fun _industry(): JsonField<Industry> = industry

        /**
         * Returns the raw JSON value of [liveMode].
         *
         * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

        /**
         * Returns the raw JSON value of [object_].
         *
         * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        /**
         * Returns the raw JSON value of [occupation].
         *
         * Unlike [occupation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("occupation")
        @ExcludeMissing
        fun _occupation(): JsonField<Occupation> = occupation

        /**
         * Returns the raw JSON value of [sourceOfFunds].
         *
         * Unlike [sourceOfFunds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("source_of_funds")
        @ExcludeMissing
        fun _sourceOfFunds(): JsonField<SourceOfFunds> = sourceOfFunds

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [wealthSource].
         *
         * Unlike [wealthSource], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("wealth_source")
        @ExcludeMissing
        fun _wealthSource(): JsonField<WealthSource> = wealthSource

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
             * [LegalEntityWealthEmploymentDetail].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .annualIncome()
             * .createdAt()
             * .discardedAt()
             * .employerCountry()
             * .employerName()
             * .employerState()
             * .employmentStatus()
             * .incomeCountry()
             * .incomeSource()
             * .incomeState()
             * .industry()
             * .liveMode()
             * .object_()
             * .occupation()
             * .sourceOfFunds()
             * .updatedAt()
             * .wealthSource()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LegalEntityWealthEmploymentDetail]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var annualIncome: JsonField<Long>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var discardedAt: JsonField<OffsetDateTime>? = null
            private var employerCountry: JsonField<String>? = null
            private var employerName: JsonField<String>? = null
            private var employerState: JsonField<String>? = null
            private var employmentStatus: JsonField<EmploymentStatus>? = null
            private var incomeCountry: JsonField<String>? = null
            private var incomeSource: JsonField<IncomeSource>? = null
            private var incomeState: JsonField<String>? = null
            private var industry: JsonField<Industry>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var object_: JsonField<String>? = null
            private var occupation: JsonField<Occupation>? = null
            private var sourceOfFunds: JsonField<SourceOfFunds>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var wealthSource: JsonField<WealthSource>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                legalEntityWealthEmploymentDetail: LegalEntityWealthEmploymentDetail
            ) = apply {
                id = legalEntityWealthEmploymentDetail.id
                annualIncome = legalEntityWealthEmploymentDetail.annualIncome
                createdAt = legalEntityWealthEmploymentDetail.createdAt
                discardedAt = legalEntityWealthEmploymentDetail.discardedAt
                employerCountry = legalEntityWealthEmploymentDetail.employerCountry
                employerName = legalEntityWealthEmploymentDetail.employerName
                employerState = legalEntityWealthEmploymentDetail.employerState
                employmentStatus = legalEntityWealthEmploymentDetail.employmentStatus
                incomeCountry = legalEntityWealthEmploymentDetail.incomeCountry
                incomeSource = legalEntityWealthEmploymentDetail.incomeSource
                incomeState = legalEntityWealthEmploymentDetail.incomeState
                industry = legalEntityWealthEmploymentDetail.industry
                liveMode = legalEntityWealthEmploymentDetail.liveMode
                object_ = legalEntityWealthEmploymentDetail.object_
                occupation = legalEntityWealthEmploymentDetail.occupation
                sourceOfFunds = legalEntityWealthEmploymentDetail.sourceOfFunds
                updatedAt = legalEntityWealthEmploymentDetail.updatedAt
                wealthSource = legalEntityWealthEmploymentDetail.wealthSource
                additionalProperties =
                    legalEntityWealthEmploymentDetail.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The annual income of the individual. */
            fun annualIncome(annualIncome: Long?) = annualIncome(JsonField.ofNullable(annualIncome))

            /**
             * Alias for [Builder.annualIncome].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun annualIncome(annualIncome: Long) = annualIncome(annualIncome as Long?)

            /**
             * Sets [Builder.annualIncome] to an arbitrary JSON value.
             *
             * You should usually call [Builder.annualIncome] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun annualIncome(annualIncome: JsonField<Long>) = apply {
                this.annualIncome = annualIncome
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun discardedAt(discardedAt: OffsetDateTime?) =
                discardedAt(JsonField.ofNullable(discardedAt))

            /**
             * Sets [Builder.discardedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discardedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                this.discardedAt = discardedAt
            }

            /** The country in which the employer is located. */
            fun employerCountry(employerCountry: String?) =
                employerCountry(JsonField.ofNullable(employerCountry))

            /**
             * Sets [Builder.employerCountry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employerCountry] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun employerCountry(employerCountry: JsonField<String>) = apply {
                this.employerCountry = employerCountry
            }

            /** The name of the employer. */
            fun employerName(employerName: String?) =
                employerName(JsonField.ofNullable(employerName))

            /**
             * Sets [Builder.employerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employerName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun employerName(employerName: JsonField<String>) = apply {
                this.employerName = employerName
            }

            /** The state in which the employer is located. */
            fun employerState(employerState: String?) =
                employerState(JsonField.ofNullable(employerState))

            /**
             * Sets [Builder.employerState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employerState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun employerState(employerState: JsonField<String>) = apply {
                this.employerState = employerState
            }

            /** The employment status of the individual. */
            fun employmentStatus(employmentStatus: EmploymentStatus?) =
                employmentStatus(JsonField.ofNullable(employmentStatus))

            /**
             * Sets [Builder.employmentStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employmentStatus] with a well-typed
             * [EmploymentStatus] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun employmentStatus(employmentStatus: JsonField<EmploymentStatus>) = apply {
                this.employmentStatus = employmentStatus
            }

            /** The country in which the individual's income is earned. */
            fun incomeCountry(incomeCountry: String?) =
                incomeCountry(JsonField.ofNullable(incomeCountry))

            /**
             * Sets [Builder.incomeCountry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.incomeCountry] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun incomeCountry(incomeCountry: JsonField<String>) = apply {
                this.incomeCountry = incomeCountry
            }

            /** The source of the individual's income. */
            fun incomeSource(incomeSource: IncomeSource?) =
                incomeSource(JsonField.ofNullable(incomeSource))

            /**
             * Sets [Builder.incomeSource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.incomeSource] with a well-typed [IncomeSource] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun incomeSource(incomeSource: JsonField<IncomeSource>) = apply {
                this.incomeSource = incomeSource
            }

            /** The state in which the individual's income is earned. */
            fun incomeState(incomeState: String?) = incomeState(JsonField.ofNullable(incomeState))

            /**
             * Sets [Builder.incomeState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.incomeState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun incomeState(incomeState: JsonField<String>) = apply {
                this.incomeState = incomeState
            }

            /** The industry of the individual. */
            fun industry(industry: Industry?) = industry(JsonField.ofNullable(industry))

            /**
             * Sets [Builder.industry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.industry] with a well-typed [Industry] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun industry(industry: JsonField<Industry>) = apply { this.industry = industry }

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

            /**
             * Sets [Builder.liveMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.liveMode] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            fun object_(object_: String) = object_(JsonField.of(object_))

            /**
             * Sets [Builder.object_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.object_] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /** The occupation of the individual. */
            fun occupation(occupation: Occupation?) = occupation(JsonField.ofNullable(occupation))

            /**
             * Sets [Builder.occupation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.occupation] with a well-typed [Occupation] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun occupation(occupation: JsonField<Occupation>) = apply {
                this.occupation = occupation
            }

            /** The source of the individual's funds. */
            fun sourceOfFunds(sourceOfFunds: SourceOfFunds?) =
                sourceOfFunds(JsonField.ofNullable(sourceOfFunds))

            /**
             * Sets [Builder.sourceOfFunds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceOfFunds] with a well-typed [SourceOfFunds]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sourceOfFunds(sourceOfFunds: JsonField<SourceOfFunds>) = apply {
                this.sourceOfFunds = sourceOfFunds
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /** The source of the individual's wealth. */
            fun wealthSource(wealthSource: WealthSource?) =
                wealthSource(JsonField.ofNullable(wealthSource))

            /**
             * Sets [Builder.wealthSource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wealthSource] with a well-typed [WealthSource] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun wealthSource(wealthSource: JsonField<WealthSource>) = apply {
                this.wealthSource = wealthSource
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [LegalEntityWealthEmploymentDetail].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .annualIncome()
             * .createdAt()
             * .discardedAt()
             * .employerCountry()
             * .employerName()
             * .employerState()
             * .employmentStatus()
             * .incomeCountry()
             * .incomeSource()
             * .incomeState()
             * .industry()
             * .liveMode()
             * .object_()
             * .occupation()
             * .sourceOfFunds()
             * .updatedAt()
             * .wealthSource()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LegalEntityWealthEmploymentDetail =
                LegalEntityWealthEmploymentDetail(
                    checkRequired("id", id),
                    checkRequired("annualIncome", annualIncome),
                    checkRequired("createdAt", createdAt),
                    checkRequired("discardedAt", discardedAt),
                    checkRequired("employerCountry", employerCountry),
                    checkRequired("employerName", employerName),
                    checkRequired("employerState", employerState),
                    checkRequired("employmentStatus", employmentStatus),
                    checkRequired("incomeCountry", incomeCountry),
                    checkRequired("incomeSource", incomeSource),
                    checkRequired("incomeState", incomeState),
                    checkRequired("industry", industry),
                    checkRequired("liveMode", liveMode),
                    checkRequired("object_", object_),
                    checkRequired("occupation", occupation),
                    checkRequired("sourceOfFunds", sourceOfFunds),
                    checkRequired("updatedAt", updatedAt),
                    checkRequired("wealthSource", wealthSource),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LegalEntityWealthEmploymentDetail = apply {
            if (validated) {
                return@apply
            }

            id()
            annualIncome()
            createdAt()
            discardedAt()
            employerCountry()
            employerName()
            employerState()
            employmentStatus()?.validate()
            incomeCountry()
            incomeSource()?.validate()
            incomeState()
            industry()?.validate()
            liveMode()
            object_()
            occupation()?.validate()
            sourceOfFunds()?.validate()
            updatedAt()
            wealthSource()?.validate()
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
            (if (id.asKnown() == null) 0 else 1) +
                (if (annualIncome.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (discardedAt.asKnown() == null) 0 else 1) +
                (if (employerCountry.asKnown() == null) 0 else 1) +
                (if (employerName.asKnown() == null) 0 else 1) +
                (if (employerState.asKnown() == null) 0 else 1) +
                (employmentStatus.asKnown()?.validity() ?: 0) +
                (if (incomeCountry.asKnown() == null) 0 else 1) +
                (incomeSource.asKnown()?.validity() ?: 0) +
                (if (incomeState.asKnown() == null) 0 else 1) +
                (industry.asKnown()?.validity() ?: 0) +
                (if (liveMode.asKnown() == null) 0 else 1) +
                (if (object_.asKnown() == null) 0 else 1) +
                (occupation.asKnown()?.validity() ?: 0) +
                (sourceOfFunds.asKnown()?.validity() ?: 0) +
                (if (updatedAt.asKnown() == null) 0 else 1) +
                (wealthSource.asKnown()?.validity() ?: 0)

        /** The employment status of the individual. */
        class EmploymentStatus
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                val EMPLOYED = of("employed")

                val RETIRED = of("retired")

                val SELF_EMPLOYED = of("self_employed")

                val STUDENT = of("student")

                val UNEMPLOYED = of("unemployed")

                fun of(value: String) = EmploymentStatus(JsonField.of(value))
            }

            /** An enum containing [EmploymentStatus]'s known values. */
            enum class Known {
                EMPLOYED,
                RETIRED,
                SELF_EMPLOYED,
                STUDENT,
                UNEMPLOYED,
            }

            /**
             * An enum containing [EmploymentStatus]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [EmploymentStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EMPLOYED,
                RETIRED,
                SELF_EMPLOYED,
                STUDENT,
                UNEMPLOYED,
                /**
                 * An enum member indicating that [EmploymentStatus] was instantiated with an
                 * unknown value.
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
                    EMPLOYED -> Value.EMPLOYED
                    RETIRED -> Value.RETIRED
                    SELF_EMPLOYED -> Value.SELF_EMPLOYED
                    STUDENT -> Value.STUDENT
                    UNEMPLOYED -> Value.UNEMPLOYED
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
                    EMPLOYED -> Known.EMPLOYED
                    RETIRED -> Known.RETIRED
                    SELF_EMPLOYED -> Known.SELF_EMPLOYED
                    STUDENT -> Known.STUDENT
                    UNEMPLOYED -> Known.UNEMPLOYED
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown EmploymentStatus: $value")
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

            fun validate(): EmploymentStatus = apply {
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

                return other is EmploymentStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The source of the individual's income. */
        class IncomeSource @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val FAMILY_SUPPORT = of("family_support")

                val GOVERNMENT_BENEFITS = of("government_benefits")

                val INHERITANCE = of("inheritance")

                val INVESTMENTS = of("investments")

                val RENTAL_INCOME = of("rental_income")

                val RETIREMENT = of("retirement")

                val SALARY = of("salary")

                val SELF_EMPLOYED = of("self_employed")

                fun of(value: String) = IncomeSource(JsonField.of(value))
            }

            /** An enum containing [IncomeSource]'s known values. */
            enum class Known {
                FAMILY_SUPPORT,
                GOVERNMENT_BENEFITS,
                INHERITANCE,
                INVESTMENTS,
                RENTAL_INCOME,
                RETIREMENT,
                SALARY,
                SELF_EMPLOYED,
            }

            /**
             * An enum containing [IncomeSource]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [IncomeSource] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FAMILY_SUPPORT,
                GOVERNMENT_BENEFITS,
                INHERITANCE,
                INVESTMENTS,
                RENTAL_INCOME,
                RETIREMENT,
                SALARY,
                SELF_EMPLOYED,
                /**
                 * An enum member indicating that [IncomeSource] was instantiated with an unknown
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
                    FAMILY_SUPPORT -> Value.FAMILY_SUPPORT
                    GOVERNMENT_BENEFITS -> Value.GOVERNMENT_BENEFITS
                    INHERITANCE -> Value.INHERITANCE
                    INVESTMENTS -> Value.INVESTMENTS
                    RENTAL_INCOME -> Value.RENTAL_INCOME
                    RETIREMENT -> Value.RETIREMENT
                    SALARY -> Value.SALARY
                    SELF_EMPLOYED -> Value.SELF_EMPLOYED
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
                    FAMILY_SUPPORT -> Known.FAMILY_SUPPORT
                    GOVERNMENT_BENEFITS -> Known.GOVERNMENT_BENEFITS
                    INHERITANCE -> Known.INHERITANCE
                    INVESTMENTS -> Known.INVESTMENTS
                    RENTAL_INCOME -> Known.RENTAL_INCOME
                    RETIREMENT -> Known.RETIREMENT
                    SALARY -> Known.SALARY
                    SELF_EMPLOYED -> Known.SELF_EMPLOYED
                    else -> throw ModernTreasuryInvalidDataException("Unknown IncomeSource: $value")
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

            fun validate(): IncomeSource = apply {
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

                return other is IncomeSource && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The industry of the individual. */
        class Industry @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val ACCOUNTING = of("accounting")

                val AGRICULTURE = of("agriculture")

                val AUTOMOTIVE = of("automotive")

                val CHEMICAL_MANUFACTURING = of("chemical_manufacturing")

                val CONSTRUCTION = of("construction")

                val EDUCATIONAL_MEDICAL = of("educational_medical")

                val FOOD_SERVICE = of("food_service")

                val FINANCE = of("finance")

                val GASOLINE = of("gasoline")

                val HEALTH_STORES = of("health_stores")

                val LAUNDRY = of("laundry")

                val MAINTENANCE = of("maintenance")

                val MANUFACTURING = of("manufacturing")

                val MERCHANT_WHOLESALE = of("merchant_wholesale")

                val MINING = of("mining")

                val PERFORMING_ARTS = of("performing_arts")

                val PROFESSIONAL_NON_LEGAL = of("professional_non_legal")

                val PUBLIC_ADMINISTRATION = of("public_administration")

                val PUBLISHING = of("publishing")

                val REAL_ESTATE = of("real_estate")

                val RECREATION_GAMBLING = of("recreation_gambling")

                val RELIGIOUS_CHARITY = of("religious_charity")

                val RENTAL_SERVICES = of("rental_services")

                val RETAIL_CLOTHING = of("retail_clothing")

                val RETAIL_ELECTRONICS = of("retail_electronics")

                val RETAIL_FOOD = of("retail_food")

                val RETAIL_FURNISHING = of("retail_furnishing")

                val RETAIL_HOME = of("retail_home")

                val RETAIL_NON_STORE = of("retail_non_store")

                val RETAIL_SPORTING = of("retail_sporting")

                val TRANSPORTATION = of("transportation")

                val TRAVEL = of("travel")

                val UTILITIES = of("utilities")

                fun of(value: String) = Industry(JsonField.of(value))
            }

            /** An enum containing [Industry]'s known values. */
            enum class Known {
                ACCOUNTING,
                AGRICULTURE,
                AUTOMOTIVE,
                CHEMICAL_MANUFACTURING,
                CONSTRUCTION,
                EDUCATIONAL_MEDICAL,
                FOOD_SERVICE,
                FINANCE,
                GASOLINE,
                HEALTH_STORES,
                LAUNDRY,
                MAINTENANCE,
                MANUFACTURING,
                MERCHANT_WHOLESALE,
                MINING,
                PERFORMING_ARTS,
                PROFESSIONAL_NON_LEGAL,
                PUBLIC_ADMINISTRATION,
                PUBLISHING,
                REAL_ESTATE,
                RECREATION_GAMBLING,
                RELIGIOUS_CHARITY,
                RENTAL_SERVICES,
                RETAIL_CLOTHING,
                RETAIL_ELECTRONICS,
                RETAIL_FOOD,
                RETAIL_FURNISHING,
                RETAIL_HOME,
                RETAIL_NON_STORE,
                RETAIL_SPORTING,
                TRANSPORTATION,
                TRAVEL,
                UTILITIES,
            }

            /**
             * An enum containing [Industry]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Industry] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACCOUNTING,
                AGRICULTURE,
                AUTOMOTIVE,
                CHEMICAL_MANUFACTURING,
                CONSTRUCTION,
                EDUCATIONAL_MEDICAL,
                FOOD_SERVICE,
                FINANCE,
                GASOLINE,
                HEALTH_STORES,
                LAUNDRY,
                MAINTENANCE,
                MANUFACTURING,
                MERCHANT_WHOLESALE,
                MINING,
                PERFORMING_ARTS,
                PROFESSIONAL_NON_LEGAL,
                PUBLIC_ADMINISTRATION,
                PUBLISHING,
                REAL_ESTATE,
                RECREATION_GAMBLING,
                RELIGIOUS_CHARITY,
                RENTAL_SERVICES,
                RETAIL_CLOTHING,
                RETAIL_ELECTRONICS,
                RETAIL_FOOD,
                RETAIL_FURNISHING,
                RETAIL_HOME,
                RETAIL_NON_STORE,
                RETAIL_SPORTING,
                TRANSPORTATION,
                TRAVEL,
                UTILITIES,
                /**
                 * An enum member indicating that [Industry] was instantiated with an unknown value.
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
                    ACCOUNTING -> Value.ACCOUNTING
                    AGRICULTURE -> Value.AGRICULTURE
                    AUTOMOTIVE -> Value.AUTOMOTIVE
                    CHEMICAL_MANUFACTURING -> Value.CHEMICAL_MANUFACTURING
                    CONSTRUCTION -> Value.CONSTRUCTION
                    EDUCATIONAL_MEDICAL -> Value.EDUCATIONAL_MEDICAL
                    FOOD_SERVICE -> Value.FOOD_SERVICE
                    FINANCE -> Value.FINANCE
                    GASOLINE -> Value.GASOLINE
                    HEALTH_STORES -> Value.HEALTH_STORES
                    LAUNDRY -> Value.LAUNDRY
                    MAINTENANCE -> Value.MAINTENANCE
                    MANUFACTURING -> Value.MANUFACTURING
                    MERCHANT_WHOLESALE -> Value.MERCHANT_WHOLESALE
                    MINING -> Value.MINING
                    PERFORMING_ARTS -> Value.PERFORMING_ARTS
                    PROFESSIONAL_NON_LEGAL -> Value.PROFESSIONAL_NON_LEGAL
                    PUBLIC_ADMINISTRATION -> Value.PUBLIC_ADMINISTRATION
                    PUBLISHING -> Value.PUBLISHING
                    REAL_ESTATE -> Value.REAL_ESTATE
                    RECREATION_GAMBLING -> Value.RECREATION_GAMBLING
                    RELIGIOUS_CHARITY -> Value.RELIGIOUS_CHARITY
                    RENTAL_SERVICES -> Value.RENTAL_SERVICES
                    RETAIL_CLOTHING -> Value.RETAIL_CLOTHING
                    RETAIL_ELECTRONICS -> Value.RETAIL_ELECTRONICS
                    RETAIL_FOOD -> Value.RETAIL_FOOD
                    RETAIL_FURNISHING -> Value.RETAIL_FURNISHING
                    RETAIL_HOME -> Value.RETAIL_HOME
                    RETAIL_NON_STORE -> Value.RETAIL_NON_STORE
                    RETAIL_SPORTING -> Value.RETAIL_SPORTING
                    TRANSPORTATION -> Value.TRANSPORTATION
                    TRAVEL -> Value.TRAVEL
                    UTILITIES -> Value.UTILITIES
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
                    ACCOUNTING -> Known.ACCOUNTING
                    AGRICULTURE -> Known.AGRICULTURE
                    AUTOMOTIVE -> Known.AUTOMOTIVE
                    CHEMICAL_MANUFACTURING -> Known.CHEMICAL_MANUFACTURING
                    CONSTRUCTION -> Known.CONSTRUCTION
                    EDUCATIONAL_MEDICAL -> Known.EDUCATIONAL_MEDICAL
                    FOOD_SERVICE -> Known.FOOD_SERVICE
                    FINANCE -> Known.FINANCE
                    GASOLINE -> Known.GASOLINE
                    HEALTH_STORES -> Known.HEALTH_STORES
                    LAUNDRY -> Known.LAUNDRY
                    MAINTENANCE -> Known.MAINTENANCE
                    MANUFACTURING -> Known.MANUFACTURING
                    MERCHANT_WHOLESALE -> Known.MERCHANT_WHOLESALE
                    MINING -> Known.MINING
                    PERFORMING_ARTS -> Known.PERFORMING_ARTS
                    PROFESSIONAL_NON_LEGAL -> Known.PROFESSIONAL_NON_LEGAL
                    PUBLIC_ADMINISTRATION -> Known.PUBLIC_ADMINISTRATION
                    PUBLISHING -> Known.PUBLISHING
                    REAL_ESTATE -> Known.REAL_ESTATE
                    RECREATION_GAMBLING -> Known.RECREATION_GAMBLING
                    RELIGIOUS_CHARITY -> Known.RELIGIOUS_CHARITY
                    RENTAL_SERVICES -> Known.RENTAL_SERVICES
                    RETAIL_CLOTHING -> Known.RETAIL_CLOTHING
                    RETAIL_ELECTRONICS -> Known.RETAIL_ELECTRONICS
                    RETAIL_FOOD -> Known.RETAIL_FOOD
                    RETAIL_FURNISHING -> Known.RETAIL_FURNISHING
                    RETAIL_HOME -> Known.RETAIL_HOME
                    RETAIL_NON_STORE -> Known.RETAIL_NON_STORE
                    RETAIL_SPORTING -> Known.RETAIL_SPORTING
                    TRANSPORTATION -> Known.TRANSPORTATION
                    TRAVEL -> Known.TRAVEL
                    UTILITIES -> Known.UTILITIES
                    else -> throw ModernTreasuryInvalidDataException("Unknown Industry: $value")
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

            fun validate(): Industry = apply {
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

                return other is Industry && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The occupation of the individual. */
        class Occupation @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val CONSULTING = of("consulting")

                val EXECUTIVE = of("executive")

                val FINANCE_ACCOUNTING = of("finance_accounting")

                val FOOD_SERVICES = of("food_services")

                val GOVERNMENT = of("government")

                val HEALTHCARE = of("healthcare")

                val LEGAL_SERVICES = of("legal_services")

                val MANUFACTURING = of("manufacturing")

                val OTHER = of("other")

                val SALES = of("sales")

                val SCIENCE_ENGINEERING = of("science_engineering")

                val TECHNOLOGY = of("technology")

                fun of(value: String) = Occupation(JsonField.of(value))
            }

            /** An enum containing [Occupation]'s known values. */
            enum class Known {
                CONSULTING,
                EXECUTIVE,
                FINANCE_ACCOUNTING,
                FOOD_SERVICES,
                GOVERNMENT,
                HEALTHCARE,
                LEGAL_SERVICES,
                MANUFACTURING,
                OTHER,
                SALES,
                SCIENCE_ENGINEERING,
                TECHNOLOGY,
            }

            /**
             * An enum containing [Occupation]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Occupation] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CONSULTING,
                EXECUTIVE,
                FINANCE_ACCOUNTING,
                FOOD_SERVICES,
                GOVERNMENT,
                HEALTHCARE,
                LEGAL_SERVICES,
                MANUFACTURING,
                OTHER,
                SALES,
                SCIENCE_ENGINEERING,
                TECHNOLOGY,
                /**
                 * An enum member indicating that [Occupation] was instantiated with an unknown
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
                    CONSULTING -> Value.CONSULTING
                    EXECUTIVE -> Value.EXECUTIVE
                    FINANCE_ACCOUNTING -> Value.FINANCE_ACCOUNTING
                    FOOD_SERVICES -> Value.FOOD_SERVICES
                    GOVERNMENT -> Value.GOVERNMENT
                    HEALTHCARE -> Value.HEALTHCARE
                    LEGAL_SERVICES -> Value.LEGAL_SERVICES
                    MANUFACTURING -> Value.MANUFACTURING
                    OTHER -> Value.OTHER
                    SALES -> Value.SALES
                    SCIENCE_ENGINEERING -> Value.SCIENCE_ENGINEERING
                    TECHNOLOGY -> Value.TECHNOLOGY
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
                    CONSULTING -> Known.CONSULTING
                    EXECUTIVE -> Known.EXECUTIVE
                    FINANCE_ACCOUNTING -> Known.FINANCE_ACCOUNTING
                    FOOD_SERVICES -> Known.FOOD_SERVICES
                    GOVERNMENT -> Known.GOVERNMENT
                    HEALTHCARE -> Known.HEALTHCARE
                    LEGAL_SERVICES -> Known.LEGAL_SERVICES
                    MANUFACTURING -> Known.MANUFACTURING
                    OTHER -> Known.OTHER
                    SALES -> Known.SALES
                    SCIENCE_ENGINEERING -> Known.SCIENCE_ENGINEERING
                    TECHNOLOGY -> Known.TECHNOLOGY
                    else -> throw ModernTreasuryInvalidDataException("Unknown Occupation: $value")
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

            fun validate(): Occupation = apply {
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

                return other is Occupation && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The source of the individual's funds. */
        class SourceOfFunds @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val ALIMONY = of("alimony")

                val ANNUITY = of("annuity")

                val BUSINESS_OWNER = of("business_owner")

                val GENERAL_EMPLOYEE = of("general_employee")

                val GOVERNMENT_BENEFITS = of("government_benefits")

                val HOMEMAKER = of("homemaker")

                val INHERITANCE_GIFT = of("inheritance_gift")

                val INVESTMENT = of("investment")

                val LEGAL_SETTLEMENT = of("legal_settlement")

                val LOTTERY = of("lottery")

                val REAL_ESTATE = of("real_estate")

                val RETIRED = of("retired")

                val RETIREMENT = of("retirement")

                val SALARY = of("salary")

                val SELF_EMPLOYED = of("self_employed")

                val SENIOR_EXECUTIVE = of("senior_executive")

                val TRUST_INCOME = of("trust_income")

                fun of(value: String) = SourceOfFunds(JsonField.of(value))
            }

            /** An enum containing [SourceOfFunds]'s known values. */
            enum class Known {
                ALIMONY,
                ANNUITY,
                BUSINESS_OWNER,
                GENERAL_EMPLOYEE,
                GOVERNMENT_BENEFITS,
                HOMEMAKER,
                INHERITANCE_GIFT,
                INVESTMENT,
                LEGAL_SETTLEMENT,
                LOTTERY,
                REAL_ESTATE,
                RETIRED,
                RETIREMENT,
                SALARY,
                SELF_EMPLOYED,
                SENIOR_EXECUTIVE,
                TRUST_INCOME,
            }

            /**
             * An enum containing [SourceOfFunds]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [SourceOfFunds] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ALIMONY,
                ANNUITY,
                BUSINESS_OWNER,
                GENERAL_EMPLOYEE,
                GOVERNMENT_BENEFITS,
                HOMEMAKER,
                INHERITANCE_GIFT,
                INVESTMENT,
                LEGAL_SETTLEMENT,
                LOTTERY,
                REAL_ESTATE,
                RETIRED,
                RETIREMENT,
                SALARY,
                SELF_EMPLOYED,
                SENIOR_EXECUTIVE,
                TRUST_INCOME,
                /**
                 * An enum member indicating that [SourceOfFunds] was instantiated with an unknown
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
                    ALIMONY -> Value.ALIMONY
                    ANNUITY -> Value.ANNUITY
                    BUSINESS_OWNER -> Value.BUSINESS_OWNER
                    GENERAL_EMPLOYEE -> Value.GENERAL_EMPLOYEE
                    GOVERNMENT_BENEFITS -> Value.GOVERNMENT_BENEFITS
                    HOMEMAKER -> Value.HOMEMAKER
                    INHERITANCE_GIFT -> Value.INHERITANCE_GIFT
                    INVESTMENT -> Value.INVESTMENT
                    LEGAL_SETTLEMENT -> Value.LEGAL_SETTLEMENT
                    LOTTERY -> Value.LOTTERY
                    REAL_ESTATE -> Value.REAL_ESTATE
                    RETIRED -> Value.RETIRED
                    RETIREMENT -> Value.RETIREMENT
                    SALARY -> Value.SALARY
                    SELF_EMPLOYED -> Value.SELF_EMPLOYED
                    SENIOR_EXECUTIVE -> Value.SENIOR_EXECUTIVE
                    TRUST_INCOME -> Value.TRUST_INCOME
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
                    ALIMONY -> Known.ALIMONY
                    ANNUITY -> Known.ANNUITY
                    BUSINESS_OWNER -> Known.BUSINESS_OWNER
                    GENERAL_EMPLOYEE -> Known.GENERAL_EMPLOYEE
                    GOVERNMENT_BENEFITS -> Known.GOVERNMENT_BENEFITS
                    HOMEMAKER -> Known.HOMEMAKER
                    INHERITANCE_GIFT -> Known.INHERITANCE_GIFT
                    INVESTMENT -> Known.INVESTMENT
                    LEGAL_SETTLEMENT -> Known.LEGAL_SETTLEMENT
                    LOTTERY -> Known.LOTTERY
                    REAL_ESTATE -> Known.REAL_ESTATE
                    RETIRED -> Known.RETIRED
                    RETIREMENT -> Known.RETIREMENT
                    SALARY -> Known.SALARY
                    SELF_EMPLOYED -> Known.SELF_EMPLOYED
                    SENIOR_EXECUTIVE -> Known.SENIOR_EXECUTIVE
                    TRUST_INCOME -> Known.TRUST_INCOME
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown SourceOfFunds: $value")
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

            fun validate(): SourceOfFunds = apply {
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

                return other is SourceOfFunds && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The source of the individual's wealth. */
        class WealthSource @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val BUSINESS_SALE = of("business_sale")

                val FAMILY_SUPPORT = of("family_support")

                val GOVERNMENT_BENEFITS = of("government_benefits")

                val INHERITANCE = of("inheritance")

                val INVESTMENTS = of("investments")

                val OTHER = of("other")

                val RENTAL_INCOME = of("rental_income")

                val RETIREMENT = of("retirement")

                val SALARY = of("salary")

                val SELF_EMPLOYED = of("self_employed")

                fun of(value: String) = WealthSource(JsonField.of(value))
            }

            /** An enum containing [WealthSource]'s known values. */
            enum class Known {
                BUSINESS_SALE,
                FAMILY_SUPPORT,
                GOVERNMENT_BENEFITS,
                INHERITANCE,
                INVESTMENTS,
                OTHER,
                RENTAL_INCOME,
                RETIREMENT,
                SALARY,
                SELF_EMPLOYED,
            }

            /**
             * An enum containing [WealthSource]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [WealthSource] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BUSINESS_SALE,
                FAMILY_SUPPORT,
                GOVERNMENT_BENEFITS,
                INHERITANCE,
                INVESTMENTS,
                OTHER,
                RENTAL_INCOME,
                RETIREMENT,
                SALARY,
                SELF_EMPLOYED,
                /**
                 * An enum member indicating that [WealthSource] was instantiated with an unknown
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
                    BUSINESS_SALE -> Value.BUSINESS_SALE
                    FAMILY_SUPPORT -> Value.FAMILY_SUPPORT
                    GOVERNMENT_BENEFITS -> Value.GOVERNMENT_BENEFITS
                    INHERITANCE -> Value.INHERITANCE
                    INVESTMENTS -> Value.INVESTMENTS
                    OTHER -> Value.OTHER
                    RENTAL_INCOME -> Value.RENTAL_INCOME
                    RETIREMENT -> Value.RETIREMENT
                    SALARY -> Value.SALARY
                    SELF_EMPLOYED -> Value.SELF_EMPLOYED
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
                    BUSINESS_SALE -> Known.BUSINESS_SALE
                    FAMILY_SUPPORT -> Known.FAMILY_SUPPORT
                    GOVERNMENT_BENEFITS -> Known.GOVERNMENT_BENEFITS
                    INHERITANCE -> Known.INHERITANCE
                    INVESTMENTS -> Known.INVESTMENTS
                    OTHER -> Known.OTHER
                    RENTAL_INCOME -> Known.RENTAL_INCOME
                    RETIREMENT -> Known.RETIREMENT
                    SALARY -> Known.SALARY
                    SELF_EMPLOYED -> Known.SELF_EMPLOYED
                    else -> throw ModernTreasuryInvalidDataException("Unknown WealthSource: $value")
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

            fun validate(): WealthSource = apply {
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

                return other is WealthSource && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LegalEntityWealthEmploymentDetail &&
                id == other.id &&
                annualIncome == other.annualIncome &&
                createdAt == other.createdAt &&
                discardedAt == other.discardedAt &&
                employerCountry == other.employerCountry &&
                employerName == other.employerName &&
                employerState == other.employerState &&
                employmentStatus == other.employmentStatus &&
                incomeCountry == other.incomeCountry &&
                incomeSource == other.incomeSource &&
                incomeState == other.incomeState &&
                industry == other.industry &&
                liveMode == other.liveMode &&
                object_ == other.object_ &&
                occupation == other.occupation &&
                sourceOfFunds == other.sourceOfFunds &&
                updatedAt == other.updatedAt &&
                wealthSource == other.wealthSource &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                annualIncome,
                createdAt,
                discardedAt,
                employerCountry,
                employerName,
                employerState,
                employmentStatus,
                incomeCountry,
                incomeSource,
                incomeState,
                industry,
                liveMode,
                object_,
                occupation,
                sourceOfFunds,
                updatedAt,
                wealthSource,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntityWealthEmploymentDetail{id=$id, annualIncome=$annualIncome, createdAt=$createdAt, discardedAt=$discardedAt, employerCountry=$employerCountry, employerName=$employerName, employerState=$employerState, employmentStatus=$employmentStatus, incomeCountry=$incomeCountry, incomeSource=$incomeSource, incomeState=$incomeState, industry=$industry, liveMode=$liveMode, object_=$object_, occupation=$occupation, sourceOfFunds=$sourceOfFunds, updatedAt=$updatedAt, wealthSource=$wealthSource, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LegalEntityUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "LegalEntityUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
