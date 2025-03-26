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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class LedgerAccountBalanceMonitor
private constructor(
    private val id: JsonField<String>,
    private val alertCondition: JsonField<AlertCondition>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currentLedgerAccountBalanceState: JsonField<CurrentLedgerAccountBalanceState>,
    private val description: JsonField<String>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val ledgerAccountId: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val object_: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alert_condition")
        @ExcludeMissing
        alertCondition: JsonField<AlertCondition> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("current_ledger_account_balance_state")
        @ExcludeMissing
        currentLedgerAccountBalanceState: JsonField<CurrentLedgerAccountBalanceState> =
            JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        ledgerAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        alertCondition,
        createdAt,
        currentLedgerAccountBalanceState,
        description,
        discardedAt,
        ledgerAccountId,
        liveMode,
        metadata,
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
     * Describes the condition that must be satisfied for the monitor to be triggered.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun alertCondition(): AlertCondition = alertCondition.getRequired("alert_condition")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The ledger account's balances and the monitor state as of the current ledger account lock
     * version.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currentLedgerAccountBalanceState(): CurrentLedgerAccountBalanceState =
        currentLedgerAccountBalanceState.getRequired("current_ledger_account_balance_state")

    /**
     * An optional, free-form description for internal use.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /**
     * The ledger account associated with this balance monitor.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

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
     * Returns the raw JSON value of [alertCondition].
     *
     * Unlike [alertCondition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alert_condition")
    @ExcludeMissing
    fun _alertCondition(): JsonField<AlertCondition> = alertCondition

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [currentLedgerAccountBalanceState].
     *
     * Unlike [currentLedgerAccountBalanceState], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("current_ledger_account_balance_state")
    @ExcludeMissing
    fun _currentLedgerAccountBalanceState(): JsonField<CurrentLedgerAccountBalanceState> =
        currentLedgerAccountBalanceState

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [discardedAt].
     *
     * Unlike [discardedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /**
     * Returns the raw JSON value of [ledgerAccountId].
     *
     * Unlike [ledgerAccountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ledger_account_id")
    @ExcludeMissing
    fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

    /**
     * Returns the raw JSON value of [liveMode].
     *
     * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
         * Returns a mutable builder for constructing an instance of [LedgerAccountBalanceMonitor].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .alertCondition()
         * .createdAt()
         * .currentLedgerAccountBalanceState()
         * .description()
         * .discardedAt()
         * .ledgerAccountId()
         * .liveMode()
         * .metadata()
         * .object_()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LedgerAccountBalanceMonitor]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var alertCondition: JsonField<AlertCondition>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currentLedgerAccountBalanceState: JsonField<CurrentLedgerAccountBalanceState>? =
            null
        private var description: JsonField<String>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var ledgerAccountId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var object_: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerAccountBalanceMonitor: LedgerAccountBalanceMonitor) = apply {
            id = ledgerAccountBalanceMonitor.id
            alertCondition = ledgerAccountBalanceMonitor.alertCondition
            createdAt = ledgerAccountBalanceMonitor.createdAt
            currentLedgerAccountBalanceState =
                ledgerAccountBalanceMonitor.currentLedgerAccountBalanceState
            description = ledgerAccountBalanceMonitor.description
            discardedAt = ledgerAccountBalanceMonitor.discardedAt
            ledgerAccountId = ledgerAccountBalanceMonitor.ledgerAccountId
            liveMode = ledgerAccountBalanceMonitor.liveMode
            metadata = ledgerAccountBalanceMonitor.metadata
            object_ = ledgerAccountBalanceMonitor.object_
            updatedAt = ledgerAccountBalanceMonitor.updatedAt
            additionalProperties = ledgerAccountBalanceMonitor.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Describes the condition that must be satisfied for the monitor to be triggered. */
        fun alertCondition(alertCondition: AlertCondition) =
            alertCondition(JsonField.of(alertCondition))

        /**
         * Sets [Builder.alertCondition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alertCondition] with a well-typed [AlertCondition] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun alertCondition(alertCondition: JsonField<AlertCondition>) = apply {
            this.alertCondition = alertCondition
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The ledger account's balances and the monitor state as of the current ledger account lock
         * version.
         */
        fun currentLedgerAccountBalanceState(
            currentLedgerAccountBalanceState: CurrentLedgerAccountBalanceState
        ) = currentLedgerAccountBalanceState(JsonField.of(currentLedgerAccountBalanceState))

        /**
         * Sets [Builder.currentLedgerAccountBalanceState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentLedgerAccountBalanceState] with a well-typed
         * [CurrentLedgerAccountBalanceState] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun currentLedgerAccountBalanceState(
            currentLedgerAccountBalanceState: JsonField<CurrentLedgerAccountBalanceState>
        ) = apply { this.currentLedgerAccountBalanceState = currentLedgerAccountBalanceState }

        /** An optional, free-form description for internal use. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

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

        /** The ledger account associated with this balance monitor. */
        fun ledgerAccountId(ledgerAccountId: String) =
            ledgerAccountId(JsonField.of(ledgerAccountId))

        /**
         * Sets [Builder.ledgerAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
            this.ledgerAccountId = ledgerAccountId
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
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [LedgerAccountBalanceMonitor].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .alertCondition()
         * .createdAt()
         * .currentLedgerAccountBalanceState()
         * .description()
         * .discardedAt()
         * .ledgerAccountId()
         * .liveMode()
         * .metadata()
         * .object_()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LedgerAccountBalanceMonitor =
            LedgerAccountBalanceMonitor(
                checkRequired("id", id),
                checkRequired("alertCondition", alertCondition),
                checkRequired("createdAt", createdAt),
                checkRequired("currentLedgerAccountBalanceState", currentLedgerAccountBalanceState),
                checkRequired("description", description),
                checkRequired("discardedAt", discardedAt),
                checkRequired("ledgerAccountId", ledgerAccountId),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("object_", object_),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LedgerAccountBalanceMonitor = apply {
        if (validated) {
            return@apply
        }

        id()
        alertCondition().validate()
        createdAt()
        currentLedgerAccountBalanceState().validate()
        description()
        discardedAt()
        ledgerAccountId()
        liveMode()
        metadata().validate()
        object_()
        updatedAt()
        validated = true
    }

    /** Describes the condition that must be satisfied for the monitor to be triggered. */
    class AlertCondition
    private constructor(
        private val field: JsonField<String>,
        private val operator: JsonField<String>,
        private val value: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("field") @ExcludeMissing field: JsonField<String> = JsonMissing.of(),
            @JsonProperty("operator")
            @ExcludeMissing
            operator: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
        ) : this(field, operator, value, mutableMapOf())

        /**
         * One of `available_balance_amount`, `pending_balance_amount`, `posted_balance_amount`,
         * `ledger_account_lock_version`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun field(): String = field.getRequired("field")

        /**
         * A logical operator to compare the `field` against the `value`. One of `less_than`,
         * `less_than_or_equals`, `equals`, `greater_than_or_equals`, `greater_than`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun operator(): String = operator.getRequired("operator")

        /**
         * The monitor's `current_ledger_account_balance_state.triggered` will be `true` when
         * comparing the `field` to this integer value using the `operator` is logically true.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): Long = value.getRequired("value")

        /**
         * Returns the raw JSON value of [field].
         *
         * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<String> = field

        /**
         * Returns the raw JSON value of [operator].
         *
         * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

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
             * Returns a mutable builder for constructing an instance of [AlertCondition].
             *
             * The following fields are required:
             * ```kotlin
             * .field()
             * .operator()
             * .value()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AlertCondition]. */
        class Builder internal constructor() {

            private var field: JsonField<String>? = null
            private var operator: JsonField<String>? = null
            private var value: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(alertCondition: AlertCondition) = apply {
                field = alertCondition.field
                operator = alertCondition.operator
                value = alertCondition.value
                additionalProperties = alertCondition.additionalProperties.toMutableMap()
            }

            /**
             * One of `available_balance_amount`, `pending_balance_amount`, `posted_balance_amount`,
             * `ledger_account_lock_version`.
             */
            fun field(field: String) = field(JsonField.of(field))

            /**
             * Sets [Builder.field] to an arbitrary JSON value.
             *
             * You should usually call [Builder.field] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun field(field: JsonField<String>) = apply { this.field = field }

            /**
             * A logical operator to compare the `field` against the `value`. One of `less_than`,
             * `less_than_or_equals`, `equals`, `greater_than_or_equals`, `greater_than`.
             */
            fun operator(operator: String) = operator(JsonField.of(operator))

            /**
             * Sets [Builder.operator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operator] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operator(operator: JsonField<String>) = apply { this.operator = operator }

            /**
             * The monitor's `current_ledger_account_balance_state.triggered` will be `true` when
             * comparing the `field` to this integer value using the `operator` is logically true.
             */
            fun value(value: Long) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun value(value: JsonField<Long>) = apply { this.value = value }

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
             * Returns an immutable instance of [AlertCondition].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .field()
             * .operator()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AlertCondition =
                AlertCondition(
                    checkRequired("field", field),
                    checkRequired("operator", operator),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AlertCondition = apply {
            if (validated) {
                return@apply
            }

            field()
            operator()
            value()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AlertCondition && field == other.field && operator == other.operator && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(field, operator, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AlertCondition{field=$field, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
    }

    /**
     * The ledger account's balances and the monitor state as of the current ledger account lock
     * version.
     */
    class CurrentLedgerAccountBalanceState
    private constructor(
        private val balances: JsonField<LedgerBalances>,
        private val ledgerAccountLockVersion: JsonField<Long>,
        private val triggered: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("balances")
            @ExcludeMissing
            balances: JsonField<LedgerBalances> = JsonMissing.of(),
            @JsonProperty("ledger_account_lock_version")
            @ExcludeMissing
            ledgerAccountLockVersion: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("triggered")
            @ExcludeMissing
            triggered: JsonField<Boolean> = JsonMissing.of(),
        ) : this(balances, ledgerAccountLockVersion, triggered, mutableMapOf())

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun balances(): LedgerBalances = balances.getRequired("balances")

        /**
         * The current lock version of the ledger account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ledgerAccountLockVersion(): Long =
            ledgerAccountLockVersion.getRequired("ledger_account_lock_version")

        /**
         * If `true`, the ledger account's balances satisfy the `alert_condition` at this lock
         * version.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun triggered(): Boolean = triggered.getRequired("triggered")

        /**
         * Returns the raw JSON value of [balances].
         *
         * Unlike [balances], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("balances")
        @ExcludeMissing
        fun _balances(): JsonField<LedgerBalances> = balances

        /**
         * Returns the raw JSON value of [ledgerAccountLockVersion].
         *
         * Unlike [ledgerAccountLockVersion], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ledger_account_lock_version")
        @ExcludeMissing
        fun _ledgerAccountLockVersion(): JsonField<Long> = ledgerAccountLockVersion

        /**
         * Returns the raw JSON value of [triggered].
         *
         * Unlike [triggered], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("triggered") @ExcludeMissing fun _triggered(): JsonField<Boolean> = triggered

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
             * [CurrentLedgerAccountBalanceState].
             *
             * The following fields are required:
             * ```kotlin
             * .balances()
             * .ledgerAccountLockVersion()
             * .triggered()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CurrentLedgerAccountBalanceState]. */
        class Builder internal constructor() {

            private var balances: JsonField<LedgerBalances>? = null
            private var ledgerAccountLockVersion: JsonField<Long>? = null
            private var triggered: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(currentLedgerAccountBalanceState: CurrentLedgerAccountBalanceState) =
                apply {
                    balances = currentLedgerAccountBalanceState.balances
                    ledgerAccountLockVersion =
                        currentLedgerAccountBalanceState.ledgerAccountLockVersion
                    triggered = currentLedgerAccountBalanceState.triggered
                    additionalProperties =
                        currentLedgerAccountBalanceState.additionalProperties.toMutableMap()
                }

            fun balances(balances: LedgerBalances) = balances(JsonField.of(balances))

            /**
             * Sets [Builder.balances] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balances] with a well-typed [LedgerBalances] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun balances(balances: JsonField<LedgerBalances>) = apply { this.balances = balances }

            /** The current lock version of the ledger account. */
            fun ledgerAccountLockVersion(ledgerAccountLockVersion: Long) =
                ledgerAccountLockVersion(JsonField.of(ledgerAccountLockVersion))

            /**
             * Sets [Builder.ledgerAccountLockVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerAccountLockVersion] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ledgerAccountLockVersion(ledgerAccountLockVersion: JsonField<Long>) = apply {
                this.ledgerAccountLockVersion = ledgerAccountLockVersion
            }

            /**
             * If `true`, the ledger account's balances satisfy the `alert_condition` at this lock
             * version.
             */
            fun triggered(triggered: Boolean) = triggered(JsonField.of(triggered))

            /**
             * Sets [Builder.triggered] to an arbitrary JSON value.
             *
             * You should usually call [Builder.triggered] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun triggered(triggered: JsonField<Boolean>) = apply { this.triggered = triggered }

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
             * Returns an immutable instance of [CurrentLedgerAccountBalanceState].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .balances()
             * .ledgerAccountLockVersion()
             * .triggered()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CurrentLedgerAccountBalanceState =
                CurrentLedgerAccountBalanceState(
                    checkRequired("balances", balances),
                    checkRequired("ledgerAccountLockVersion", ledgerAccountLockVersion),
                    checkRequired("triggered", triggered),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CurrentLedgerAccountBalanceState = apply {
            if (validated) {
                return@apply
            }

            balances().validate()
            ledgerAccountLockVersion()
            triggered()
            validated = true
        }

        class LedgerBalances
        private constructor(
            private val availableBalance: JsonField<LedgerBalance>,
            private val pendingBalance: JsonField<LedgerBalance>,
            private val postedBalance: JsonField<LedgerBalance>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("available_balance")
                @ExcludeMissing
                availableBalance: JsonField<LedgerBalance> = JsonMissing.of(),
                @JsonProperty("pending_balance")
                @ExcludeMissing
                pendingBalance: JsonField<LedgerBalance> = JsonMissing.of(),
                @JsonProperty("posted_balance")
                @ExcludeMissing
                postedBalance: JsonField<LedgerBalance> = JsonMissing.of(),
            ) : this(availableBalance, pendingBalance, postedBalance, mutableMapOf())

            /**
             * The available_balance is the sum of all posted inbound entries and pending outbound
             * entries. For credit normal, available_amount = posted_credits - pending_debits; for
             * debit normal, available_amount = posted_debits - pending_credits.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun availableBalance(): LedgerBalance =
                availableBalance.getRequired("available_balance")

            /**
             * The pending_balance is the sum of all pending and posted entries.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun pendingBalance(): LedgerBalance = pendingBalance.getRequired("pending_balance")

            /**
             * The posted_balance is the sum of all posted entries.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun postedBalance(): LedgerBalance = postedBalance.getRequired("posted_balance")

            /**
             * Returns the raw JSON value of [availableBalance].
             *
             * Unlike [availableBalance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("available_balance")
            @ExcludeMissing
            fun _availableBalance(): JsonField<LedgerBalance> = availableBalance

            /**
             * Returns the raw JSON value of [pendingBalance].
             *
             * Unlike [pendingBalance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("pending_balance")
            @ExcludeMissing
            fun _pendingBalance(): JsonField<LedgerBalance> = pendingBalance

            /**
             * Returns the raw JSON value of [postedBalance].
             *
             * Unlike [postedBalance], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("posted_balance")
            @ExcludeMissing
            fun _postedBalance(): JsonField<LedgerBalance> = postedBalance

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
                 * Returns a mutable builder for constructing an instance of [LedgerBalances].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .availableBalance()
                 * .pendingBalance()
                 * .postedBalance()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [LedgerBalances]. */
            class Builder internal constructor() {

                private var availableBalance: JsonField<LedgerBalance>? = null
                private var pendingBalance: JsonField<LedgerBalance>? = null
                private var postedBalance: JsonField<LedgerBalance>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(ledgerBalances: LedgerBalances) = apply {
                    availableBalance = ledgerBalances.availableBalance
                    pendingBalance = ledgerBalances.pendingBalance
                    postedBalance = ledgerBalances.postedBalance
                    additionalProperties = ledgerBalances.additionalProperties.toMutableMap()
                }

                /**
                 * The available_balance is the sum of all posted inbound entries and pending
                 * outbound entries. For credit normal, available_amount = posted_credits -
                 * pending_debits; for debit normal, available_amount = posted_debits -
                 * pending_credits.
                 */
                fun availableBalance(availableBalance: LedgerBalance) =
                    availableBalance(JsonField.of(availableBalance))

                /**
                 * Sets [Builder.availableBalance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.availableBalance] with a well-typed
                 * [LedgerBalance] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun availableBalance(availableBalance: JsonField<LedgerBalance>) = apply {
                    this.availableBalance = availableBalance
                }

                /** The pending_balance is the sum of all pending and posted entries. */
                fun pendingBalance(pendingBalance: LedgerBalance) =
                    pendingBalance(JsonField.of(pendingBalance))

                /**
                 * Sets [Builder.pendingBalance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pendingBalance] with a well-typed
                 * [LedgerBalance] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun pendingBalance(pendingBalance: JsonField<LedgerBalance>) = apply {
                    this.pendingBalance = pendingBalance
                }

                /** The posted_balance is the sum of all posted entries. */
                fun postedBalance(postedBalance: LedgerBalance) =
                    postedBalance(JsonField.of(postedBalance))

                /**
                 * Sets [Builder.postedBalance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postedBalance] with a well-typed [LedgerBalance]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun postedBalance(postedBalance: JsonField<LedgerBalance>) = apply {
                    this.postedBalance = postedBalance
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [LedgerBalances].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .availableBalance()
                 * .pendingBalance()
                 * .postedBalance()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): LedgerBalances =
                    LedgerBalances(
                        checkRequired("availableBalance", availableBalance),
                        checkRequired("pendingBalance", pendingBalance),
                        checkRequired("postedBalance", postedBalance),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): LedgerBalances = apply {
                if (validated) {
                    return@apply
                }

                availableBalance().validate()
                pendingBalance().validate()
                postedBalance().validate()
                validated = true
            }

            /**
             * The available_balance is the sum of all posted inbound entries and pending outbound
             * entries. For credit normal, available_amount = posted_credits - pending_debits; for
             * debit normal, available_amount = posted_debits - pending_credits.
             */
            class LedgerBalance
            private constructor(
                private val amount: JsonField<Long>,
                private val credits: JsonField<Long>,
                private val currency: JsonField<String>,
                private val currencyExponent: JsonField<Long>,
                private val debits: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("credits")
                    @ExcludeMissing
                    credits: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("currency_exponent")
                    @ExcludeMissing
                    currencyExponent: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("debits")
                    @ExcludeMissing
                    debits: JsonField<Long> = JsonMissing.of(),
                ) : this(amount, credits, currency, currencyExponent, debits, mutableMapOf())

                /**
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun credits(): Long = credits.getRequired("credits")

                /**
                 * The currency of the ledger account.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * The currency exponent of the ledger account.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currencyExponent(): Long = currencyExponent.getRequired("currency_exponent")

                /**
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun debits(): Long = debits.getRequired("debits")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [credits].
                 *
                 * Unlike [credits], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<Long> = credits

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [currencyExponent].
                 *
                 * Unlike [currencyExponent], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("currency_exponent")
                @ExcludeMissing
                fun _currencyExponent(): JsonField<Long> = currencyExponent

                /**
                 * Returns the raw JSON value of [debits].
                 *
                 * Unlike [debits], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("debits") @ExcludeMissing fun _debits(): JsonField<Long> = debits

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
                     * Returns a mutable builder for constructing an instance of [LedgerBalance].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amount()
                     * .credits()
                     * .currency()
                     * .currencyExponent()
                     * .debits()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [LedgerBalance]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var credits: JsonField<Long>? = null
                    private var currency: JsonField<String>? = null
                    private var currencyExponent: JsonField<Long>? = null
                    private var debits: JsonField<Long>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(ledgerBalance: LedgerBalance) = apply {
                        amount = ledgerBalance.amount
                        credits = ledgerBalance.credits
                        currency = ledgerBalance.currency
                        currencyExponent = ledgerBalance.currencyExponent
                        debits = ledgerBalance.debits
                        additionalProperties = ledgerBalance.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    fun credits(credits: Long) = credits(JsonField.of(credits))

                    /**
                     * Sets [Builder.credits] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.credits] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun credits(credits: JsonField<Long>) = apply { this.credits = credits }

                    /** The currency of the ledger account. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    /** The currency exponent of the ledger account. */
                    fun currencyExponent(currencyExponent: Long) =
                        currencyExponent(JsonField.of(currencyExponent))

                    /**
                     * Sets [Builder.currencyExponent] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currencyExponent] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun currencyExponent(currencyExponent: JsonField<Long>) = apply {
                        this.currencyExponent = currencyExponent
                    }

                    fun debits(debits: Long) = debits(JsonField.of(debits))

                    /**
                     * Sets [Builder.debits] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.debits] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun debits(debits: JsonField<Long>) = apply { this.debits = debits }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [LedgerBalance].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amount()
                     * .credits()
                     * .currency()
                     * .currencyExponent()
                     * .debits()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): LedgerBalance =
                        LedgerBalance(
                            checkRequired("amount", amount),
                            checkRequired("credits", credits),
                            checkRequired("currency", currency),
                            checkRequired("currencyExponent", currencyExponent),
                            checkRequired("debits", debits),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): LedgerBalance = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    credits()
                    currency()
                    currencyExponent()
                    debits()
                    validated = true
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is LedgerBalance && amount == other.amount && credits == other.credits && currency == other.currency && currencyExponent == other.currencyExponent && debits == other.debits && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, credits, currency, currencyExponent, debits, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LedgerBalance{amount=$amount, credits=$credits, currency=$currency, currencyExponent=$currencyExponent, debits=$debits, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LedgerBalances && availableBalance == other.availableBalance && pendingBalance == other.pendingBalance && postedBalance == other.postedBalance && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(availableBalance, pendingBalance, postedBalance, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LedgerBalances{availableBalance=$availableBalance, pendingBalance=$pendingBalance, postedBalance=$postedBalance, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CurrentLedgerAccountBalanceState && balances == other.balances && ledgerAccountLockVersion == other.ledgerAccountLockVersion && triggered == other.triggered && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(balances, ledgerAccountLockVersion, triggered, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CurrentLedgerAccountBalanceState{balances=$balances, ledgerAccountLockVersion=$ledgerAccountLockVersion, triggered=$triggered, additionalProperties=$additionalProperties}"
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountBalanceMonitor && id == other.id && alertCondition == other.alertCondition && createdAt == other.createdAt && currentLedgerAccountBalanceState == other.currentLedgerAccountBalanceState && description == other.description && discardedAt == other.discardedAt && ledgerAccountId == other.ledgerAccountId && liveMode == other.liveMode && metadata == other.metadata && object_ == other.object_ && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, alertCondition, createdAt, currentLedgerAccountBalanceState, description, discardedAt, ledgerAccountId, liveMode, metadata, object_, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerAccountBalanceMonitor{id=$id, alertCondition=$alertCondition, createdAt=$createdAt, currentLedgerAccountBalanceState=$currentLedgerAccountBalanceState, description=$description, discardedAt=$discardedAt, ledgerAccountId=$ledgerAccountId, liveMode=$liveMode, metadata=$metadata, object_=$object_, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
