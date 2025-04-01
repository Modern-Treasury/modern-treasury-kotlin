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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Document
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val documentDetails: JsonField<List<DocumentDetail>>,
    private val documentType: JsonField<String>,
    private val documentableId: JsonField<String>,
    private val documentableType: JsonField<DocumentableType>,
    private val file: JsonField<File>,
    private val liveMode: JsonField<Boolean>,
    private val object_: JsonField<String>,
    private val source: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("document_details")
        @ExcludeMissing
        documentDetails: JsonField<List<DocumentDetail>> = JsonMissing.of(),
        @JsonProperty("document_type")
        @ExcludeMissing
        documentType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("documentable_id")
        @ExcludeMissing
        documentableId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("documentable_type")
        @ExcludeMissing
        documentableType: JsonField<DocumentableType> = JsonMissing.of(),
        @JsonProperty("file") @ExcludeMissing file: JsonField<File> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        discardedAt,
        documentDetails,
        documentType,
        documentableId,
        documentableType,
        file,
        liveMode,
        object_,
        source,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentDetails(): List<DocumentDetail> = documentDetails.getRequired("document_details")

    /**
     * A category given to the document, can be `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun documentType(): String? = documentType.getNullable("document_type")

    /**
     * The unique identifier for the associated object.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentableId(): String = documentableId.getRequired("documentable_id")

    /**
     * The type of the associated object. Currently can be one of `payment_order`, `transaction`,
     * `paper_item`, `expected_payment`, `counterparty`, `organization`, `case`, `internal_account`,
     * `decision`, or `external_account`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentableType(): DocumentableType = documentableType.getRequired("documentable_type")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun file(): File = file.getRequired("file")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
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
     * The source of the document. Can be `vendor`, `customer`, or `modern_treasury`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

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
     * Returns the raw JSON value of [documentDetails].
     *
     * Unlike [documentDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_details")
    @ExcludeMissing
    fun _documentDetails(): JsonField<List<DocumentDetail>> = documentDetails

    /**
     * Returns the raw JSON value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_type")
    @ExcludeMissing
    fun _documentType(): JsonField<String> = documentType

    /**
     * Returns the raw JSON value of [documentableId].
     *
     * Unlike [documentableId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documentable_id")
    @ExcludeMissing
    fun _documentableId(): JsonField<String> = documentableId

    /**
     * Returns the raw JSON value of [documentableType].
     *
     * Unlike [documentableType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("documentable_type")
    @ExcludeMissing
    fun _documentableType(): JsonField<DocumentableType> = documentableType

    /**
     * Returns the raw JSON value of [file].
     *
     * Unlike [file], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file") @ExcludeMissing fun _file(): JsonField<File> = file

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
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

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
         * Returns a mutable builder for constructing an instance of [Document].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .discardedAt()
         * .documentDetails()
         * .documentType()
         * .documentableId()
         * .documentableType()
         * .file()
         * .liveMode()
         * .object_()
         * .source()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Document]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var documentDetails: JsonField<MutableList<DocumentDetail>>? = null
        private var documentType: JsonField<String>? = null
        private var documentableId: JsonField<String>? = null
        private var documentableType: JsonField<DocumentableType>? = null
        private var file: JsonField<File>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var object_: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(document: Document) = apply {
            id = document.id
            createdAt = document.createdAt
            discardedAt = document.discardedAt
            documentDetails = document.documentDetails.map { it.toMutableList() }
            documentType = document.documentType
            documentableId = document.documentableId
            documentableType = document.documentableType
            file = document.file
            liveMode = document.liveMode
            object_ = document.object_
            source = document.source
            updatedAt = document.updatedAt
            additionalProperties = document.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        /**
         * Sets [Builder.discardedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discardedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        fun documentDetails(documentDetails: List<DocumentDetail>) =
            documentDetails(JsonField.of(documentDetails))

        /**
         * Sets [Builder.documentDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentDetails] with a well-typed
         * `List<DocumentDetail>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun documentDetails(documentDetails: JsonField<List<DocumentDetail>>) = apply {
            this.documentDetails = documentDetails.map { it.toMutableList() }
        }

        /**
         * Adds a single [DocumentDetail] to [documentDetails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocumentDetail(documentDetail: DocumentDetail) = apply {
            documentDetails =
                (documentDetails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("documentDetails", it).add(documentDetail)
                }
        }

        /** A category given to the document, can be `null`. */
        fun documentType(documentType: String?) = documentType(JsonField.ofNullable(documentType))

        /**
         * Sets [Builder.documentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun documentType(documentType: JsonField<String>) = apply {
            this.documentType = documentType
        }

        /** The unique identifier for the associated object. */
        fun documentableId(documentableId: String) = documentableId(JsonField.of(documentableId))

        /**
         * Sets [Builder.documentableId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentableId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentableId(documentableId: JsonField<String>) = apply {
            this.documentableId = documentableId
        }

        /**
         * The type of the associated object. Currently can be one of `payment_order`,
         * `transaction`, `paper_item`, `expected_payment`, `counterparty`, `organization`, `case`,
         * `internal_account`, `decision`, or `external_account`.
         */
        fun documentableType(documentableType: DocumentableType) =
            documentableType(JsonField.of(documentableType))

        /**
         * Sets [Builder.documentableType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentableType] with a well-typed [DocumentableType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun documentableType(documentableType: JsonField<DocumentableType>) = apply {
            this.documentableType = documentableType
        }

        fun file(file: File) = file(JsonField.of(file))

        /**
         * Sets [Builder.file] to an arbitrary JSON value.
         *
         * You should usually call [Builder.file] with a well-typed [File] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun file(file: JsonField<File>) = apply { this.file = file }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * Sets [Builder.liveMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liveMode] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The source of the document. Can be `vendor`, `customer`, or `modern_treasury`. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * .id()
         * .createdAt()
         * .discardedAt()
         * .documentDetails()
         * .documentType()
         * .documentableId()
         * .documentableType()
         * .file()
         * .liveMode()
         * .object_()
         * .source()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Document =
            Document(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("discardedAt", discardedAt),
                checkRequired("documentDetails", documentDetails).map { it.toImmutable() },
                checkRequired("documentType", documentType),
                checkRequired("documentableId", documentableId),
                checkRequired("documentableType", documentableType),
                checkRequired("file", file),
                checkRequired("liveMode", liveMode),
                checkRequired("object_", object_),
                checkRequired("source", source),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Document = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        discardedAt()
        documentDetails().forEach { it.validate() }
        documentType()
        documentableId()
        documentableType().validate()
        file().validate()
        liveMode()
        object_()
        source()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (discardedAt.asKnown() == null) 0 else 1) +
            (documentDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (documentType.asKnown() == null) 0 else 1) +
            (if (documentableId.asKnown() == null) 0 else 1) +
            (documentableType.asKnown()?.validity() ?: 0) +
            (file.asKnown()?.validity() ?: 0) +
            (if (liveMode.asKnown() == null) 0 else 1) +
            (if (object_.asKnown() == null) 0 else 1) +
            (if (source.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    class DocumentDetail
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val discardedAt: JsonField<OffsetDateTime>,
        private val documentIdentifier: JsonField<String>,
        private val documentIdentifierType: JsonField<String>,
        private val liveMode: JsonField<Boolean>,
        private val object_: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("discarded_at")
            @ExcludeMissing
            discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("document_identifier")
            @ExcludeMissing
            documentIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("document_identifier_type")
            @ExcludeMissing
            documentIdentifierType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("live_mode")
            @ExcludeMissing
            liveMode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            discardedAt,
            documentIdentifier,
            documentIdentifierType,
            liveMode,
            object_,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

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
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentIdentifier(): String = documentIdentifier.getRequired("document_identifier")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentIdentifierType(): String =
            documentIdentifierType.getRequired("document_identifier_type")

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
         * Returns the raw JSON value of [documentIdentifier].
         *
         * Unlike [documentIdentifier], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("document_identifier")
        @ExcludeMissing
        fun _documentIdentifier(): JsonField<String> = documentIdentifier

        /**
         * Returns the raw JSON value of [documentIdentifierType].
         *
         * Unlike [documentIdentifierType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("document_identifier_type")
        @ExcludeMissing
        fun _documentIdentifierType(): JsonField<String> = documentIdentifierType

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
             * Returns a mutable builder for constructing an instance of [DocumentDetail].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .createdAt()
             * .discardedAt()
             * .documentIdentifier()
             * .documentIdentifierType()
             * .liveMode()
             * .object_()
             * .updatedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [DocumentDetail]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var discardedAt: JsonField<OffsetDateTime>? = null
            private var documentIdentifier: JsonField<String>? = null
            private var documentIdentifierType: JsonField<String>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var object_: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(documentDetail: DocumentDetail) = apply {
                id = documentDetail.id
                createdAt = documentDetail.createdAt
                discardedAt = documentDetail.discardedAt
                documentIdentifier = documentDetail.documentIdentifier
                documentIdentifierType = documentDetail.documentIdentifierType
                liveMode = documentDetail.liveMode
                object_ = documentDetail.object_
                updatedAt = documentDetail.updatedAt
                additionalProperties = documentDetail.additionalProperties.toMutableMap()
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

            fun documentIdentifier(documentIdentifier: String) =
                documentIdentifier(JsonField.of(documentIdentifier))

            /**
             * Sets [Builder.documentIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentIdentifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentIdentifier(documentIdentifier: JsonField<String>) = apply {
                this.documentIdentifier = documentIdentifier
            }

            fun documentIdentifierType(documentIdentifierType: String) =
                documentIdentifierType(JsonField.of(documentIdentifierType))

            /**
             * Sets [Builder.documentIdentifierType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentIdentifierType] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun documentIdentifierType(documentIdentifierType: JsonField<String>) = apply {
                this.documentIdentifierType = documentIdentifierType
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
             * Returns an immutable instance of [DocumentDetail].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .createdAt()
             * .discardedAt()
             * .documentIdentifier()
             * .documentIdentifierType()
             * .liveMode()
             * .object_()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DocumentDetail =
                DocumentDetail(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("discardedAt", discardedAt),
                    checkRequired("documentIdentifier", documentIdentifier),
                    checkRequired("documentIdentifierType", documentIdentifierType),
                    checkRequired("liveMode", liveMode),
                    checkRequired("object_", object_),
                    checkRequired("updatedAt", updatedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DocumentDetail = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            discardedAt()
            documentIdentifier()
            documentIdentifierType()
            liveMode()
            object_()
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
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (discardedAt.asKnown() == null) 0 else 1) +
                (if (documentIdentifier.asKnown() == null) 0 else 1) +
                (if (documentIdentifierType.asKnown() == null) 0 else 1) +
                (if (liveMode.asKnown() == null) 0 else 1) +
                (if (object_.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DocumentDetail && id == other.id && createdAt == other.createdAt && discardedAt == other.discardedAt && documentIdentifier == other.documentIdentifier && documentIdentifierType == other.documentIdentifierType && liveMode == other.liveMode && object_ == other.object_ && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, createdAt, discardedAt, documentIdentifier, documentIdentifierType, liveMode, object_, updatedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DocumentDetail{id=$id, createdAt=$createdAt, discardedAt=$discardedAt, documentIdentifier=$documentIdentifier, documentIdentifierType=$documentIdentifierType, liveMode=$liveMode, object_=$object_, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    /**
     * The type of the associated object. Currently can be one of `payment_order`, `transaction`,
     * `paper_item`, `expected_payment`, `counterparty`, `organization`, `case`, `internal_account`,
     * `decision`, or `external_account`.
     */
    class DocumentableType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val CASE = of("case")

            val COUNTERPARTY = of("counterparty")

            val EXPECTED_PAYMENT = of("expected_payment")

            val EXTERNAL_ACCOUNT = of("external_account")

            val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

            val INTERNAL_ACCOUNT = of("internal_account")

            val ORGANIZATION = of("organization")

            val PAPER_ITEM = of("paper_item")

            val PAYMENT_ORDER = of("payment_order")

            val TRANSACTION = of("transaction")

            val DECISION = of("decision")

            val CONNECTION = of("connection")

            fun of(value: String) = DocumentableType(JsonField.of(value))
        }

        /** An enum containing [DocumentableType]'s known values. */
        enum class Known {
            CASE,
            COUNTERPARTY,
            EXPECTED_PAYMENT,
            EXTERNAL_ACCOUNT,
            INCOMING_PAYMENT_DETAIL,
            INTERNAL_ACCOUNT,
            ORGANIZATION,
            PAPER_ITEM,
            PAYMENT_ORDER,
            TRANSACTION,
            DECISION,
            CONNECTION,
        }

        /**
         * An enum containing [DocumentableType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DocumentableType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CASE,
            COUNTERPARTY,
            EXPECTED_PAYMENT,
            EXTERNAL_ACCOUNT,
            INCOMING_PAYMENT_DETAIL,
            INTERNAL_ACCOUNT,
            ORGANIZATION,
            PAPER_ITEM,
            PAYMENT_ORDER,
            TRANSACTION,
            DECISION,
            CONNECTION,
            /**
             * An enum member indicating that [DocumentableType] was instantiated with an unknown
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
                CASE -> Value.CASE
                COUNTERPARTY -> Value.COUNTERPARTY
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                ORGANIZATION -> Value.ORGANIZATION
                PAPER_ITEM -> Value.PAPER_ITEM
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                TRANSACTION -> Value.TRANSACTION
                DECISION -> Value.DECISION
                CONNECTION -> Value.CONNECTION
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
                CASE -> Known.CASE
                COUNTERPARTY -> Known.COUNTERPARTY
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                ORGANIZATION -> Known.ORGANIZATION
                PAPER_ITEM -> Known.PAPER_ITEM
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                TRANSACTION -> Known.TRANSACTION
                DECISION -> Known.DECISION
                CONNECTION -> Known.CONNECTION
                else -> throw ModernTreasuryInvalidDataException("Unknown DocumentableType: $value")
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

        fun validate(): DocumentableType = apply {
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

            return /* spotless:off */ other is DocumentableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class File
    private constructor(
        private val contentType: JsonField<String>,
        private val filename: JsonField<String>,
        private val size: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("content_type")
            @ExcludeMissing
            contentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filename")
            @ExcludeMissing
            filename: JsonField<String> = JsonMissing.of(),
            @JsonProperty("size") @ExcludeMissing size: JsonField<Long> = JsonMissing.of(),
        ) : this(contentType, filename, size, mutableMapOf())

        /**
         * The MIME content type of the document.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun contentType(): String? = contentType.getNullable("content_type")

        /**
         * The original filename of the document.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun filename(): String? = filename.getNullable("filename")

        /**
         * The size of the document in bytes.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun size(): Long? = size.getNullable("size")

        /**
         * Returns the raw JSON value of [contentType].
         *
         * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content_type")
        @ExcludeMissing
        fun _contentType(): JsonField<String> = contentType

        /**
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

        /**
         * Returns the raw JSON value of [size].
         *
         * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Long> = size

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

            /** Returns a mutable builder for constructing an instance of [File]. */
            fun builder() = Builder()
        }

        /** A builder for [File]. */
        class Builder internal constructor() {

            private var contentType: JsonField<String> = JsonMissing.of()
            private var filename: JsonField<String> = JsonMissing.of()
            private var size: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(file: File) = apply {
                contentType = file.contentType
                filename = file.filename
                size = file.size
                additionalProperties = file.additionalProperties.toMutableMap()
            }

            /** The MIME content type of the document. */
            fun contentType(contentType: String) = contentType(JsonField.of(contentType))

            /**
             * Sets [Builder.contentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentType(contentType: JsonField<String>) = apply {
                this.contentType = contentType
            }

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

            /** The size of the document in bytes. */
            fun size(size: Long) = size(JsonField.of(size))

            /**
             * Sets [Builder.size] to an arbitrary JSON value.
             *
             * You should usually call [Builder.size] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun size(size: JsonField<Long>) = apply { this.size = size }

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
             * Returns an immutable instance of [File].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): File =
                File(contentType, filename, size, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): File = apply {
            if (validated) {
                return@apply
            }

            contentType()
            filename()
            size()
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
            (if (contentType.asKnown() == null) 0 else 1) +
                (if (filename.asKnown() == null) 0 else 1) +
                (if (size.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is File && contentType == other.contentType && filename == other.filename && size == other.size && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contentType, filename, size, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "File{contentType=$contentType, filename=$filename, size=$size, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Document && id == other.id && createdAt == other.createdAt && discardedAt == other.discardedAt && documentDetails == other.documentDetails && documentType == other.documentType && documentableId == other.documentableId && documentableType == other.documentableType && file == other.file && liveMode == other.liveMode && object_ == other.object_ && source == other.source && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, discardedAt, documentDetails, documentType, documentableId, documentableType, file, liveMode, object_, source, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Document{id=$id, createdAt=$createdAt, discardedAt=$discardedAt, documentDetails=$documentDetails, documentType=$documentType, documentableId=$documentableId, documentableType=$documentableType, file=$file, liveMode=$liveMode, object_=$object_, source=$source, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
