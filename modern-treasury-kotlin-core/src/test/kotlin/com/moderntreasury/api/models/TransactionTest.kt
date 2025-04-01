// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionTest {

    @Test
    fun create() {
        val transaction =
            Transaction.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .asOfDate(LocalDate.parse("2019-12-27"))
                .asOfTime("as_of_time")
                .asOfTimezone("as_of_timezone")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .customIdentifiers(
                    Transaction.CustomIdentifiers.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .direction("direction")
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .foreignExchangeRate(
                    Transaction.ForeignExchangeRate.builder()
                        .baseAmount(0L)
                        .baseCurrency(Currency.AED)
                        .exponent(0L)
                        .rateString("rate_string")
                        .targetAmount(0L)
                        .targetCurrency(Currency.AED)
                        .value(0L)
                        .build()
                )
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    Transaction.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .object_("object")
                .posted(true)
                .reconciled(true)
                .type(Transaction.Type.ACH)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vendorCode("vendor_code")
                .vendorCodeType(Transaction.VendorCodeType.BAI2)
                .vendorCustomerId("vendor_customer_id")
                .vendorId("vendor_id")
                .details(
                    Transaction.Details.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .vendorDescription("vendor_description")
                .build()

        assertThat(transaction.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transaction.amount()).isEqualTo(0L)
        assertThat(transaction.asOfDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(transaction.asOfTime()).isEqualTo("as_of_time")
        assertThat(transaction.asOfTimezone()).isEqualTo("as_of_timezone")
        assertThat(transaction.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.currency()).isEqualTo(Currency.AED)
        assertThat(transaction.customIdentifiers())
            .isEqualTo(
                Transaction.CustomIdentifiers.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(transaction.direction()).isEqualTo("direction")
        assertThat(transaction.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.foreignExchangeRate())
            .isEqualTo(
                Transaction.ForeignExchangeRate.builder()
                    .baseAmount(0L)
                    .baseCurrency(Currency.AED)
                    .exponent(0L)
                    .rateString("rate_string")
                    .targetAmount(0L)
                    .targetCurrency(Currency.AED)
                    .value(0L)
                    .build()
            )
        assertThat(transaction.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transaction.liveMode()).isEqualTo(true)
        assertThat(transaction.metadata())
            .isEqualTo(
                Transaction.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(transaction.object_()).isEqualTo("object")
        assertThat(transaction.posted()).isEqualTo(true)
        assertThat(transaction.reconciled()).isEqualTo(true)
        assertThat(transaction.type()).isEqualTo(Transaction.Type.ACH)
        assertThat(transaction.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.vendorCode()).isEqualTo("vendor_code")
        assertThat(transaction.vendorCodeType()).isEqualTo(Transaction.VendorCodeType.BAI2)
        assertThat(transaction.vendorCustomerId()).isEqualTo("vendor_customer_id")
        assertThat(transaction.vendorId()).isEqualTo("vendor_id")
        assertThat(transaction.details())
            .isEqualTo(
                Transaction.Details.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(transaction.vendorDescription()).isEqualTo("vendor_description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transaction =
            Transaction.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .asOfDate(LocalDate.parse("2019-12-27"))
                .asOfTime("as_of_time")
                .asOfTimezone("as_of_timezone")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .customIdentifiers(
                    Transaction.CustomIdentifiers.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .direction("direction")
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .foreignExchangeRate(
                    Transaction.ForeignExchangeRate.builder()
                        .baseAmount(0L)
                        .baseCurrency(Currency.AED)
                        .exponent(0L)
                        .rateString("rate_string")
                        .targetAmount(0L)
                        .targetCurrency(Currency.AED)
                        .value(0L)
                        .build()
                )
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    Transaction.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .object_("object")
                .posted(true)
                .reconciled(true)
                .type(Transaction.Type.ACH)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vendorCode("vendor_code")
                .vendorCodeType(Transaction.VendorCodeType.BAI2)
                .vendorCustomerId("vendor_customer_id")
                .vendorId("vendor_id")
                .details(
                    Transaction.Details.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .vendorDescription("vendor_description")
                .build()

        val roundtrippedTransaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transaction),
                jacksonTypeRef<Transaction>(),
            )

        assertThat(roundtrippedTransaction).isEqualTo(transaction)
    }
}
