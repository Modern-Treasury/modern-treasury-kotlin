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
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.Objects

/** Create a virtual account setting. */
class VirtualAccountSettingCreateParams
private constructor(
    private val body: VirtualAccountSettingCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The method used to allocate virtual account numbers.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allocationType(): String = body.allocationType()

    /**
     * The ID of the internal account for the virtual account setting.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun internalAccountId(): String = body.internalAccountId()

    /**
     * The prefix, suffix, or bank-assigned identifier for the virtual account numbers.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allocationIdentifier(): String? = body.allocationIdentifier()

    /**
     * The total length of generated virtual account numbers.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allocationLength(): Long? = body.allocationLength()

    /**
     * The inclusive end of the virtual account number range.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allocationRangeEnd(): String? = body.allocationRangeEnd()

    /**
     * The inclusive start of the virtual account number range.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allocationRangeStart(): String? = body.allocationRangeStart()

    /**
     * A user-defined identifier for the virtual account setting.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun externalId(): String? = body.externalId()

    /**
     * The length of a generated virtual account setting prefix.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun generatedAllocationIdentifierLength(): Long? = body.generatedAllocationIdentifierLength()

    /**
     * Returns the raw JSON value of [allocationType].
     *
     * Unlike [allocationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _allocationType(): JsonField<String> = body._allocationType()

    /**
     * Returns the raw JSON value of [internalAccountId].
     *
     * Unlike [internalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _internalAccountId(): JsonField<String> = body._internalAccountId()

    /**
     * Returns the raw JSON value of [allocationIdentifier].
     *
     * Unlike [allocationIdentifier], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _allocationIdentifier(): JsonField<String> = body._allocationIdentifier()

    /**
     * Returns the raw JSON value of [allocationLength].
     *
     * Unlike [allocationLength], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _allocationLength(): JsonField<Long> = body._allocationLength()

    /**
     * Returns the raw JSON value of [allocationRangeEnd].
     *
     * Unlike [allocationRangeEnd], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _allocationRangeEnd(): JsonField<String> = body._allocationRangeEnd()

    /**
     * Returns the raw JSON value of [allocationRangeStart].
     *
     * Unlike [allocationRangeStart], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _allocationRangeStart(): JsonField<String> = body._allocationRangeStart()

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _externalId(): JsonField<String> = body._externalId()

    /**
     * Returns the raw JSON value of [generatedAllocationIdentifierLength].
     *
     * Unlike [generatedAllocationIdentifierLength], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    fun _generatedAllocationIdentifierLength(): JsonField<Long> =
        body._generatedAllocationIdentifierLength()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [VirtualAccountSettingCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .allocationType()
         * .internalAccountId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [VirtualAccountSettingCreateParams]. */
    class Builder internal constructor() {

        private var body: VirtualAccountSettingCreateRequest.Builder =
            VirtualAccountSettingCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(virtualAccountSettingCreateParams: VirtualAccountSettingCreateParams) =
            apply {
                body = virtualAccountSettingCreateParams.body.toBuilder()
                additionalHeaders = virtualAccountSettingCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    virtualAccountSettingCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [allocationType]
         * - [internalAccountId]
         * - [allocationIdentifier]
         * - [allocationLength]
         * - [allocationRangeEnd]
         * - etc.
         */
        fun body(body: VirtualAccountSettingCreateRequest) = apply { this.body = body.toBuilder() }

        /** The method used to allocate virtual account numbers. */
        fun allocationType(allocationType: String) = apply { body.allocationType(allocationType) }

        /**
         * Sets [Builder.allocationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allocationType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allocationType(allocationType: JsonField<String>) = apply {
            body.allocationType(allocationType)
        }

        /** The ID of the internal account for the virtual account setting. */
        fun internalAccountId(internalAccountId: String) = apply {
            body.internalAccountId(internalAccountId)
        }

        /**
         * Sets [Builder.internalAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internalAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            body.internalAccountId(internalAccountId)
        }

        /** The prefix, suffix, or bank-assigned identifier for the virtual account numbers. */
        fun allocationIdentifier(allocationIdentifier: String?) = apply {
            body.allocationIdentifier(allocationIdentifier)
        }

        /**
         * Sets [Builder.allocationIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allocationIdentifier] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allocationIdentifier(allocationIdentifier: JsonField<String>) = apply {
            body.allocationIdentifier(allocationIdentifier)
        }

        /** The total length of generated virtual account numbers. */
        fun allocationLength(allocationLength: Long?) = apply {
            body.allocationLength(allocationLength)
        }

        /**
         * Alias for [Builder.allocationLength].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun allocationLength(allocationLength: Long) = allocationLength(allocationLength as Long?)

        /**
         * Sets [Builder.allocationLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allocationLength] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allocationLength(allocationLength: JsonField<Long>) = apply {
            body.allocationLength(allocationLength)
        }

        /** The inclusive end of the virtual account number range. */
        fun allocationRangeEnd(allocationRangeEnd: String?) = apply {
            body.allocationRangeEnd(allocationRangeEnd)
        }

        /**
         * Sets [Builder.allocationRangeEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allocationRangeEnd] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allocationRangeEnd(allocationRangeEnd: JsonField<String>) = apply {
            body.allocationRangeEnd(allocationRangeEnd)
        }

        /** The inclusive start of the virtual account number range. */
        fun allocationRangeStart(allocationRangeStart: String?) = apply {
            body.allocationRangeStart(allocationRangeStart)
        }

        /**
         * Sets [Builder.allocationRangeStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allocationRangeStart] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allocationRangeStart(allocationRangeStart: JsonField<String>) = apply {
            body.allocationRangeStart(allocationRangeStart)
        }

        /** A user-defined identifier for the virtual account setting. */
        fun externalId(externalId: String?) = apply { body.externalId(externalId) }

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { body.externalId(externalId) }

        /** The length of a generated virtual account setting prefix. */
        fun generatedAllocationIdentifierLength(generatedAllocationIdentifierLength: Long?) =
            apply {
                body.generatedAllocationIdentifierLength(generatedAllocationIdentifierLength)
            }

        /**
         * Alias for [Builder.generatedAllocationIdentifierLength].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun generatedAllocationIdentifierLength(generatedAllocationIdentifierLength: Long) =
            generatedAllocationIdentifierLength(generatedAllocationIdentifierLength as Long?)

        /**
         * Sets [Builder.generatedAllocationIdentifierLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.generatedAllocationIdentifierLength] with a well-typed
         * [Long] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun generatedAllocationIdentifierLength(
            generatedAllocationIdentifierLength: JsonField<Long>
        ) = apply { body.generatedAllocationIdentifierLength(generatedAllocationIdentifierLength) }

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
         * Returns an immutable instance of [VirtualAccountSettingCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .allocationType()
         * .internalAccountId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VirtualAccountSettingCreateParams =
            VirtualAccountSettingCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): VirtualAccountSettingCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class VirtualAccountSettingCreateRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allocationType: JsonField<String>,
        private val internalAccountId: JsonField<String>,
        private val allocationIdentifier: JsonField<String>,
        private val allocationLength: JsonField<Long>,
        private val allocationRangeEnd: JsonField<String>,
        private val allocationRangeStart: JsonField<String>,
        private val externalId: JsonField<String>,
        private val generatedAllocationIdentifierLength: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allocation_type")
            @ExcludeMissing
            allocationType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("internal_account_id")
            @ExcludeMissing
            internalAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allocation_identifier")
            @ExcludeMissing
            allocationIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allocation_length")
            @ExcludeMissing
            allocationLength: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("allocation_range_end")
            @ExcludeMissing
            allocationRangeEnd: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allocation_range_start")
            @ExcludeMissing
            allocationRangeStart: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_id")
            @ExcludeMissing
            externalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("generated_allocation_identifier_length")
            @ExcludeMissing
            generatedAllocationIdentifierLength: JsonField<Long> = JsonMissing.of(),
        ) : this(
            allocationType,
            internalAccountId,
            allocationIdentifier,
            allocationLength,
            allocationRangeEnd,
            allocationRangeStart,
            externalId,
            generatedAllocationIdentifierLength,
            mutableMapOf(),
        )

        /**
         * The method used to allocate virtual account numbers.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun allocationType(): String = allocationType.getRequired("allocation_type")

        /**
         * The ID of the internal account for the virtual account setting.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

        /**
         * The prefix, suffix, or bank-assigned identifier for the virtual account numbers.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allocationIdentifier(): String? =
            allocationIdentifier.getNullable("allocation_identifier")

        /**
         * The total length of generated virtual account numbers.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allocationLength(): Long? = allocationLength.getNullable("allocation_length")

        /**
         * The inclusive end of the virtual account number range.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allocationRangeEnd(): String? = allocationRangeEnd.getNullable("allocation_range_end")

        /**
         * The inclusive start of the virtual account number range.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allocationRangeStart(): String? =
            allocationRangeStart.getNullable("allocation_range_start")

        /**
         * A user-defined identifier for the virtual account setting.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun externalId(): String? = externalId.getNullable("external_id")

        /**
         * The length of a generated virtual account setting prefix.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun generatedAllocationIdentifierLength(): Long? =
            generatedAllocationIdentifierLength.getNullable(
                "generated_allocation_identifier_length"
            )

        /**
         * Returns the raw JSON value of [allocationType].
         *
         * Unlike [allocationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allocation_type")
        @ExcludeMissing
        fun _allocationType(): JsonField<String> = allocationType

        /**
         * Returns the raw JSON value of [internalAccountId].
         *
         * Unlike [internalAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        fun _internalAccountId(): JsonField<String> = internalAccountId

        /**
         * Returns the raw JSON value of [allocationIdentifier].
         *
         * Unlike [allocationIdentifier], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allocation_identifier")
        @ExcludeMissing
        fun _allocationIdentifier(): JsonField<String> = allocationIdentifier

        /**
         * Returns the raw JSON value of [allocationLength].
         *
         * Unlike [allocationLength], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allocation_length")
        @ExcludeMissing
        fun _allocationLength(): JsonField<Long> = allocationLength

        /**
         * Returns the raw JSON value of [allocationRangeEnd].
         *
         * Unlike [allocationRangeEnd], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allocation_range_end")
        @ExcludeMissing
        fun _allocationRangeEnd(): JsonField<String> = allocationRangeEnd

        /**
         * Returns the raw JSON value of [allocationRangeStart].
         *
         * Unlike [allocationRangeStart], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allocation_range_start")
        @ExcludeMissing
        fun _allocationRangeStart(): JsonField<String> = allocationRangeStart

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [generatedAllocationIdentifierLength].
         *
         * Unlike [generatedAllocationIdentifierLength], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("generated_allocation_identifier_length")
        @ExcludeMissing
        fun _generatedAllocationIdentifierLength(): JsonField<Long> =
            generatedAllocationIdentifierLength

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
             * [VirtualAccountSettingCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .allocationType()
             * .internalAccountId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [VirtualAccountSettingCreateRequest]. */
        class Builder internal constructor() {

            private var allocationType: JsonField<String>? = null
            private var internalAccountId: JsonField<String>? = null
            private var allocationIdentifier: JsonField<String> = JsonMissing.of()
            private var allocationLength: JsonField<Long> = JsonMissing.of()
            private var allocationRangeEnd: JsonField<String> = JsonMissing.of()
            private var allocationRangeStart: JsonField<String> = JsonMissing.of()
            private var externalId: JsonField<String> = JsonMissing.of()
            private var generatedAllocationIdentifierLength: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                virtualAccountSettingCreateRequest: VirtualAccountSettingCreateRequest
            ) = apply {
                allocationType = virtualAccountSettingCreateRequest.allocationType
                internalAccountId = virtualAccountSettingCreateRequest.internalAccountId
                allocationIdentifier = virtualAccountSettingCreateRequest.allocationIdentifier
                allocationLength = virtualAccountSettingCreateRequest.allocationLength
                allocationRangeEnd = virtualAccountSettingCreateRequest.allocationRangeEnd
                allocationRangeStart = virtualAccountSettingCreateRequest.allocationRangeStart
                externalId = virtualAccountSettingCreateRequest.externalId
                generatedAllocationIdentifierLength =
                    virtualAccountSettingCreateRequest.generatedAllocationIdentifierLength
                additionalProperties =
                    virtualAccountSettingCreateRequest.additionalProperties.toMutableMap()
            }

            /** The method used to allocate virtual account numbers. */
            fun allocationType(allocationType: String) =
                allocationType(JsonField.of(allocationType))

            /**
             * Sets [Builder.allocationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allocationType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allocationType(allocationType: JsonField<String>) = apply {
                this.allocationType = allocationType
            }

            /** The ID of the internal account for the virtual account setting. */
            fun internalAccountId(internalAccountId: String) =
                internalAccountId(JsonField.of(internalAccountId))

            /**
             * Sets [Builder.internalAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.internalAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun internalAccountId(internalAccountId: JsonField<String>) = apply {
                this.internalAccountId = internalAccountId
            }

            /** The prefix, suffix, or bank-assigned identifier for the virtual account numbers. */
            fun allocationIdentifier(allocationIdentifier: String?) =
                allocationIdentifier(JsonField.ofNullable(allocationIdentifier))

            /**
             * Sets [Builder.allocationIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allocationIdentifier] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allocationIdentifier(allocationIdentifier: JsonField<String>) = apply {
                this.allocationIdentifier = allocationIdentifier
            }

            /** The total length of generated virtual account numbers. */
            fun allocationLength(allocationLength: Long?) =
                allocationLength(JsonField.ofNullable(allocationLength))

            /**
             * Alias for [Builder.allocationLength].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun allocationLength(allocationLength: Long) =
                allocationLength(allocationLength as Long?)

            /**
             * Sets [Builder.allocationLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allocationLength] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allocationLength(allocationLength: JsonField<Long>) = apply {
                this.allocationLength = allocationLength
            }

            /** The inclusive end of the virtual account number range. */
            fun allocationRangeEnd(allocationRangeEnd: String?) =
                allocationRangeEnd(JsonField.ofNullable(allocationRangeEnd))

            /**
             * Sets [Builder.allocationRangeEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allocationRangeEnd] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allocationRangeEnd(allocationRangeEnd: JsonField<String>) = apply {
                this.allocationRangeEnd = allocationRangeEnd
            }

            /** The inclusive start of the virtual account number range. */
            fun allocationRangeStart(allocationRangeStart: String?) =
                allocationRangeStart(JsonField.ofNullable(allocationRangeStart))

            /**
             * Sets [Builder.allocationRangeStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allocationRangeStart] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allocationRangeStart(allocationRangeStart: JsonField<String>) = apply {
                this.allocationRangeStart = allocationRangeStart
            }

            /** A user-defined identifier for the virtual account setting. */
            fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /** The length of a generated virtual account setting prefix. */
            fun generatedAllocationIdentifierLength(generatedAllocationIdentifierLength: Long?) =
                generatedAllocationIdentifierLength(
                    JsonField.ofNullable(generatedAllocationIdentifierLength)
                )

            /**
             * Alias for [Builder.generatedAllocationIdentifierLength].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun generatedAllocationIdentifierLength(generatedAllocationIdentifierLength: Long) =
                generatedAllocationIdentifierLength(generatedAllocationIdentifierLength as Long?)

            /**
             * Sets [Builder.generatedAllocationIdentifierLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.generatedAllocationIdentifierLength] with a
             * well-typed [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun generatedAllocationIdentifierLength(
                generatedAllocationIdentifierLength: JsonField<Long>
            ) = apply {
                this.generatedAllocationIdentifierLength = generatedAllocationIdentifierLength
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
             * Returns an immutable instance of [VirtualAccountSettingCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .allocationType()
             * .internalAccountId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): VirtualAccountSettingCreateRequest =
                VirtualAccountSettingCreateRequest(
                    checkRequired("allocationType", allocationType),
                    checkRequired("internalAccountId", internalAccountId),
                    allocationIdentifier,
                    allocationLength,
                    allocationRangeEnd,
                    allocationRangeStart,
                    externalId,
                    generatedAllocationIdentifierLength,
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
        fun validate(): VirtualAccountSettingCreateRequest = apply {
            if (validated) {
                return@apply
            }

            allocationType()
            internalAccountId()
            allocationIdentifier()
            allocationLength()
            allocationRangeEnd()
            allocationRangeStart()
            externalId()
            generatedAllocationIdentifierLength()
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
            (if (allocationType.asKnown() == null) 0 else 1) +
                (if (internalAccountId.asKnown() == null) 0 else 1) +
                (if (allocationIdentifier.asKnown() == null) 0 else 1) +
                (if (allocationLength.asKnown() == null) 0 else 1) +
                (if (allocationRangeEnd.asKnown() == null) 0 else 1) +
                (if (allocationRangeStart.asKnown() == null) 0 else 1) +
                (if (externalId.asKnown() == null) 0 else 1) +
                (if (generatedAllocationIdentifierLength.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VirtualAccountSettingCreateRequest &&
                allocationType == other.allocationType &&
                internalAccountId == other.internalAccountId &&
                allocationIdentifier == other.allocationIdentifier &&
                allocationLength == other.allocationLength &&
                allocationRangeEnd == other.allocationRangeEnd &&
                allocationRangeStart == other.allocationRangeStart &&
                externalId == other.externalId &&
                generatedAllocationIdentifierLength == other.generatedAllocationIdentifierLength &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allocationType,
                internalAccountId,
                allocationIdentifier,
                allocationLength,
                allocationRangeEnd,
                allocationRangeStart,
                externalId,
                generatedAllocationIdentifierLength,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VirtualAccountSettingCreateRequest{allocationType=$allocationType, internalAccountId=$internalAccountId, allocationIdentifier=$allocationIdentifier, allocationLength=$allocationLength, allocationRangeEnd=$allocationRangeEnd, allocationRangeStart=$allocationRangeStart, externalId=$externalId, generatedAllocationIdentifierLength=$generatedAllocationIdentifierLength, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VirtualAccountSettingCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VirtualAccountSettingCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
