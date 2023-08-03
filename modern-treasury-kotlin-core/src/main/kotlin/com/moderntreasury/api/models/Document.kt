package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = Document.Builder::class)
@NoAutoDetect
class Document
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val documentType: JsonField<String>,
    private val source: JsonField<String>,
    private val documentableId: JsonField<String>,
    private val documentableType: JsonField<DocumentableType>,
    private val documentDetails: JsonField<List<DocumentDetail>>,
    private val file: JsonField<File>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** A category given to the document, can be `null`. */
    fun documentType(): String? = documentType.getNullable("document_type")

    /** The source of the document. Can be `vendor`, `customer`, or `modern_treasury`. */
    fun source(): String = source.getRequired("source")

    /** The unique identifier for the associated object. */
    fun documentableId(): String = documentableId.getRequired("documentable_id")

    /**
     * The type of the associated object. Currently can be one of `payment_order`, `transaction`,
     * `paper_item`, `expected_payment`, `counterparty`, `organization`, `case`, `internal_account`,
     * `decision`, or `external_account`.
     */
    fun documentableType(): DocumentableType = documentableType.getRequired("documentable_type")

    fun documentDetails(): List<DocumentDetail> = documentDetails.getRequired("document_details")

    fun file(): File = file.getRequired("file")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

    /** A category given to the document, can be `null`. */
    @JsonProperty("document_type") @ExcludeMissing fun _documentType() = documentType

    /** The source of the document. Can be `vendor`, `customer`, or `modern_treasury`. */
    @JsonProperty("source") @ExcludeMissing fun _source() = source

    /** The unique identifier for the associated object. */
    @JsonProperty("documentable_id") @ExcludeMissing fun _documentableId() = documentableId

    /**
     * The type of the associated object. Currently can be one of `payment_order`, `transaction`,
     * `paper_item`, `expected_payment`, `counterparty`, `organization`, `case`, `internal_account`,
     * `decision`, or `external_account`.
     */
    @JsonProperty("documentable_type") @ExcludeMissing fun _documentableType() = documentableType

    @JsonProperty("document_details") @ExcludeMissing fun _documentDetails() = documentDetails

    @JsonProperty("file") @ExcludeMissing fun _file() = file

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Document = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            documentType()
            source()
            documentableId()
            documentableType()
            documentDetails().forEach { it.validate() }
            file().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Document &&
            this.id == other.id &&
            this.object_ == other.object_ &&
            this.liveMode == other.liveMode &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.discardedAt == other.discardedAt &&
            this.documentType == other.documentType &&
            this.source == other.source &&
            this.documentableId == other.documentableId &&
            this.documentableType == other.documentableType &&
            this.documentDetails == other.documentDetails &&
            this.file == other.file &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    discardedAt,
                    documentType,
                    source,
                    documentableId,
                    documentableType,
                    documentDetails,
                    file,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Document{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, documentType=$documentType, source=$source, documentableId=$documentableId, documentableType=$documentableType, documentDetails=$documentDetails, file=$file, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var documentType: JsonField<String> = JsonMissing.of()
        private var source: JsonField<String> = JsonMissing.of()
        private var documentableId: JsonField<String> = JsonMissing.of()
        private var documentableType: JsonField<DocumentableType> = JsonMissing.of()
        private var documentDetails: JsonField<List<DocumentDetail>> = JsonMissing.of()
        private var file: JsonField<File> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(document: Document) = apply {
            this.id = document.id
            this.object_ = document.object_
            this.liveMode = document.liveMode
            this.createdAt = document.createdAt
            this.updatedAt = document.updatedAt
            this.discardedAt = document.discardedAt
            this.documentType = document.documentType
            this.source = document.source
            this.documentableId = document.documentableId
            this.documentableType = document.documentableType
            this.documentDetails = document.documentDetails
            this.file = document.file
            additionalProperties(document.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode")
        @ExcludeMissing
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** A category given to the document, can be `null`. */
        fun documentType(documentType: String) = documentType(JsonField.of(documentType))

        /** A category given to the document, can be `null`. */
        @JsonProperty("document_type")
        @ExcludeMissing
        fun documentType(documentType: JsonField<String>) = apply {
            this.documentType = documentType
        }

        /** The source of the document. Can be `vendor`, `customer`, or `modern_treasury`. */
        fun source(source: String) = source(JsonField.of(source))

        /** The source of the document. Can be `vendor`, `customer`, or `modern_treasury`. */
        @JsonProperty("source")
        @ExcludeMissing
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** The unique identifier for the associated object. */
        fun documentableId(documentableId: String) = documentableId(JsonField.of(documentableId))

        /** The unique identifier for the associated object. */
        @JsonProperty("documentable_id")
        @ExcludeMissing
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
         * The type of the associated object. Currently can be one of `payment_order`,
         * `transaction`, `paper_item`, `expected_payment`, `counterparty`, `organization`, `case`,
         * `internal_account`, `decision`, or `external_account`.
         */
        @JsonProperty("documentable_type")
        @ExcludeMissing
        fun documentableType(documentableType: JsonField<DocumentableType>) = apply {
            this.documentableType = documentableType
        }

        fun documentDetails(documentDetails: List<DocumentDetail>) =
            documentDetails(JsonField.of(documentDetails))

        @JsonProperty("document_details")
        @ExcludeMissing
        fun documentDetails(documentDetails: JsonField<List<DocumentDetail>>) = apply {
            this.documentDetails = documentDetails
        }

        fun file(file: File) = file(JsonField.of(file))

        @JsonProperty("file")
        @ExcludeMissing
        fun file(file: JsonField<File>) = apply { this.file = file }

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

        fun build(): Document =
            Document(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                documentType,
                source,
                documentableId,
                documentableType,
                documentDetails.map { it.toUnmodifiable() },
                file,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = DocumentDetail.Builder::class)
    @NoAutoDetect
    class DocumentDetail
    private constructor(
        private val id: JsonField<String>,
        private val object_: JsonField<String>,
        private val liveMode: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val discardedAt: JsonField<OffsetDateTime>,
        private val documentIdentifierType: JsonField<String>,
        private val documentIdentifier: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun object_(): String = object_.getRequired("object")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

        fun documentIdentifierType(): String =
            documentIdentifierType.getRequired("document_identifier_type")

        fun documentIdentifier(): String = documentIdentifier.getRequired("document_identifier")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("object") @ExcludeMissing fun _object_() = object_

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

        @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

        @JsonProperty("document_identifier_type")
        @ExcludeMissing
        fun _documentIdentifierType() = documentIdentifierType

        @JsonProperty("document_identifier")
        @ExcludeMissing
        fun _documentIdentifier() = documentIdentifier

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DocumentDetail = apply {
            if (!validated) {
                id()
                object_()
                liveMode()
                createdAt()
                updatedAt()
                discardedAt()
                documentIdentifierType()
                documentIdentifier()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DocumentDetail &&
                this.id == other.id &&
                this.object_ == other.object_ &&
                this.liveMode == other.liveMode &&
                this.createdAt == other.createdAt &&
                this.updatedAt == other.updatedAt &&
                this.discardedAt == other.discardedAt &&
                this.documentIdentifierType == other.documentIdentifierType &&
                this.documentIdentifier == other.documentIdentifier &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        object_,
                        liveMode,
                        createdAt,
                        updatedAt,
                        discardedAt,
                        documentIdentifierType,
                        documentIdentifier,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DocumentDetail{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, documentIdentifierType=$documentIdentifierType, documentIdentifier=$documentIdentifier, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var object_: JsonField<String> = JsonMissing.of()
            private var liveMode: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var documentIdentifierType: JsonField<String> = JsonMissing.of()
            private var documentIdentifier: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(documentDetail: DocumentDetail) = apply {
                this.id = documentDetail.id
                this.object_ = documentDetail.object_
                this.liveMode = documentDetail.liveMode
                this.createdAt = documentDetail.createdAt
                this.updatedAt = documentDetail.updatedAt
                this.discardedAt = documentDetail.discardedAt
                this.documentIdentifierType = documentDetail.documentIdentifierType
                this.documentIdentifier = documentDetail.documentIdentifier
                additionalProperties(documentDetail.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun object_(object_: String) = object_(JsonField.of(object_))

            @JsonProperty("object")
            @ExcludeMissing
            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            @JsonProperty("live_mode")
            @ExcludeMissing
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            @JsonProperty("updated_at")
            @ExcludeMissing
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

            @JsonProperty("discarded_at")
            @ExcludeMissing
            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                this.discardedAt = discardedAt
            }

            fun documentIdentifierType(documentIdentifierType: String) =
                documentIdentifierType(JsonField.of(documentIdentifierType))

            @JsonProperty("document_identifier_type")
            @ExcludeMissing
            fun documentIdentifierType(documentIdentifierType: JsonField<String>) = apply {
                this.documentIdentifierType = documentIdentifierType
            }

            fun documentIdentifier(documentIdentifier: String) =
                documentIdentifier(JsonField.of(documentIdentifier))

            @JsonProperty("document_identifier")
            @ExcludeMissing
            fun documentIdentifier(documentIdentifier: JsonField<String>) = apply {
                this.documentIdentifier = documentIdentifier
            }

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

            fun build(): DocumentDetail =
                DocumentDetail(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    discardedAt,
                    documentIdentifierType,
                    documentIdentifier,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class DocumentableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DocumentableType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CASE = DocumentableType(JsonField.of("case"))

            val COUNTERPARTY = DocumentableType(JsonField.of("counterparty"))

            val EXPECTED_PAYMENT = DocumentableType(JsonField.of("expected_payment"))

            val EXTERNAL_ACCOUNT = DocumentableType(JsonField.of("external_account"))

            val INTERNAL_ACCOUNT = DocumentableType(JsonField.of("internal_account"))

            val ORGANIZATION = DocumentableType(JsonField.of("organization"))

            val PAPER_ITEM = DocumentableType(JsonField.of("paper_item"))

            val PAYMENT_ORDER = DocumentableType(JsonField.of("payment_order"))

            val TRANSACTION = DocumentableType(JsonField.of("transaction"))

            val DECISION = DocumentableType(JsonField.of("decision"))

            val CONNECTION = DocumentableType(JsonField.of("connection"))

            fun of(value: String) = DocumentableType(JsonField.of(value))
        }

        enum class Known {
            CASE,
            COUNTERPARTY,
            EXPECTED_PAYMENT,
            EXTERNAL_ACCOUNT,
            INTERNAL_ACCOUNT,
            ORGANIZATION,
            PAPER_ITEM,
            PAYMENT_ORDER,
            TRANSACTION,
            DECISION,
            CONNECTION,
        }

        enum class Value {
            CASE,
            COUNTERPARTY,
            EXPECTED_PAYMENT,
            EXTERNAL_ACCOUNT,
            INTERNAL_ACCOUNT,
            ORGANIZATION,
            PAPER_ITEM,
            PAYMENT_ORDER,
            TRANSACTION,
            DECISION,
            CONNECTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CASE -> Value.CASE
                COUNTERPARTY -> Value.COUNTERPARTY
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                ORGANIZATION -> Value.ORGANIZATION
                PAPER_ITEM -> Value.PAPER_ITEM
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                TRANSACTION -> Value.TRANSACTION
                DECISION -> Value.DECISION
                CONNECTION -> Value.CONNECTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CASE -> Known.CASE
                COUNTERPARTY -> Known.COUNTERPARTY
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                ORGANIZATION -> Known.ORGANIZATION
                PAPER_ITEM -> Known.PAPER_ITEM
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                TRANSACTION -> Known.TRANSACTION
                DECISION -> Known.DECISION
                CONNECTION -> Known.CONNECTION
                else -> throw ModernTreasuryInvalidDataException("Unknown DocumentableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = File.Builder::class)
    @NoAutoDetect
    class File
    private constructor(
        private val size: JsonField<Long>,
        private val filename: JsonField<String>,
        private val contentType: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The size of the document in bytes. */
        fun size(): Long? = size.getNullable("size")

        /** The original filename of the document. */
        fun filename(): String? = filename.getNullable("filename")

        /** The MIME content type of the document. */
        fun contentType(): String? = contentType.getNullable("content_type")

        /** The size of the document in bytes. */
        @JsonProperty("size") @ExcludeMissing fun _size() = size

        /** The original filename of the document. */
        @JsonProperty("filename") @ExcludeMissing fun _filename() = filename

        /** The MIME content type of the document. */
        @JsonProperty("content_type") @ExcludeMissing fun _contentType() = contentType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): File = apply {
            if (!validated) {
                size()
                filename()
                contentType()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is File &&
                this.size == other.size &&
                this.filename == other.filename &&
                this.contentType == other.contentType &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        size,
                        filename,
                        contentType,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "File{size=$size, filename=$filename, contentType=$contentType, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var size: JsonField<Long> = JsonMissing.of()
            private var filename: JsonField<String> = JsonMissing.of()
            private var contentType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(file: File) = apply {
                this.size = file.size
                this.filename = file.filename
                this.contentType = file.contentType
                additionalProperties(file.additionalProperties)
            }

            /** The size of the document in bytes. */
            fun size(size: Long) = size(JsonField.of(size))

            /** The size of the document in bytes. */
            @JsonProperty("size")
            @ExcludeMissing
            fun size(size: JsonField<Long>) = apply { this.size = size }

            /** The original filename of the document. */
            fun filename(filename: String) = filename(JsonField.of(filename))

            /** The original filename of the document. */
            @JsonProperty("filename")
            @ExcludeMissing
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

            /** The MIME content type of the document. */
            fun contentType(contentType: String) = contentType(JsonField.of(contentType))

            /** The MIME content type of the document. */
            @JsonProperty("content_type")
            @ExcludeMissing
            fun contentType(contentType: JsonField<String>) = apply {
                this.contentType = contentType
            }

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

            fun build(): File =
                File(
                    size,
                    filename,
                    contentType,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
