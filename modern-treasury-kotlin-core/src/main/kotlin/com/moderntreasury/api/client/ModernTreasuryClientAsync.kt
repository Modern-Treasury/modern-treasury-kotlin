// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.client

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.*
import com.moderntreasury.api.services.async.*

interface ModernTreasuryClientAsync {

    fun sync(): ModernTreasuryClient

    fun connections(): ConnectionServiceAsync

    fun counterparties(): CounterpartyServiceAsync

    fun events(): EventServiceAsync

    fun expectedPayments(): ExpectedPaymentServiceAsync

    fun externalAccounts(): ExternalAccountServiceAsync

    fun incomingPaymentDetails(): IncomingPaymentDetailServiceAsync

    fun invoices(): InvoiceServiceAsync

    fun documents(): DocumentServiceAsync

    fun accountCollectionFlows(): AccountCollectionFlowServiceAsync

    fun accountDetails(): AccountDetailServiceAsync

    fun routingDetails(): RoutingDetailServiceAsync

    fun internalAccounts(): InternalAccountServiceAsync

    fun ledgers(): LedgerServiceAsync

    fun ledgerableEvents(): LedgerableEventServiceAsync

    fun ledgerAccountCategories(): LedgerAccountCategoryServiceAsync

    fun ledgerAccounts(): LedgerAccountServiceAsync

    fun ledgerAccountBalanceMonitors(): LedgerAccountBalanceMonitorServiceAsync

    fun ledgerAccountPayouts(): LedgerAccountPayoutServiceAsync

    fun ledgerAccountStatements(): LedgerAccountStatementServiceAsync

    fun ledgerEntries(): LedgerEntryServiceAsync

    fun ledgerEventHandlers(): LedgerEventHandlerServiceAsync

    fun ledgerTransactions(): LedgerTransactionServiceAsync

    fun lineItems(): LineItemServiceAsync

    fun paymentFlows(): PaymentFlowServiceAsync

    fun paymentOrders(): PaymentOrderServiceAsync

    fun paymentReferences(): PaymentReferenceServiceAsync

    fun returns(): ReturnServiceAsync

    fun transactions(): TransactionServiceAsync

    fun validations(): ValidationServiceAsync

    fun paperItems(): PaperItemServiceAsync

    fun webhooks(): WebhookServiceAsync

    fun virtualAccounts(): VirtualAccountServiceAsync

    fun bulkRequests(): BulkRequestServiceAsync

    fun bulkResults(): BulkResultServiceAsync

    fun ledgerAccountSettlements(): LedgerAccountSettlementServiceAsync

    fun foreignExchangeQuotes(): ForeignExchangeQuoteServiceAsync

    /**
     * A test endpoint often used to confirm credentials and headers are being passed in correctly.
     */
    suspend fun ping(
        params: ClientPingParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PingResponse
}
