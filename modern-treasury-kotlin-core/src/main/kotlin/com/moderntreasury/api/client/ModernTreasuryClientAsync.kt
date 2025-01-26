// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.client

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.ClientPingParams
import com.moderntreasury.api.models.PingResponse
import com.moderntreasury.api.services.async.AccountCollectionFlowServiceAsync
import com.moderntreasury.api.services.async.AccountDetailServiceAsync
import com.moderntreasury.api.services.async.BulkRequestServiceAsync
import com.moderntreasury.api.services.async.BulkResultServiceAsync
import com.moderntreasury.api.services.async.ConnectionLegalEntityServiceAsync
import com.moderntreasury.api.services.async.ConnectionServiceAsync
import com.moderntreasury.api.services.async.CounterpartyServiceAsync
import com.moderntreasury.api.services.async.DocumentServiceAsync
import com.moderntreasury.api.services.async.EventServiceAsync
import com.moderntreasury.api.services.async.ExpectedPaymentServiceAsync
import com.moderntreasury.api.services.async.ExternalAccountServiceAsync
import com.moderntreasury.api.services.async.ForeignExchangeQuoteServiceAsync
import com.moderntreasury.api.services.async.IncomingPaymentDetailServiceAsync
import com.moderntreasury.api.services.async.InternalAccountServiceAsync
import com.moderntreasury.api.services.async.InvoiceServiceAsync
import com.moderntreasury.api.services.async.LedgerAccountBalanceMonitorServiceAsync
import com.moderntreasury.api.services.async.LedgerAccountCategoryServiceAsync
import com.moderntreasury.api.services.async.LedgerAccountServiceAsync
import com.moderntreasury.api.services.async.LedgerAccountSettlementServiceAsync
import com.moderntreasury.api.services.async.LedgerAccountStatementServiceAsync
import com.moderntreasury.api.services.async.LedgerEntryServiceAsync
import com.moderntreasury.api.services.async.LedgerEventHandlerServiceAsync
import com.moderntreasury.api.services.async.LedgerServiceAsync
import com.moderntreasury.api.services.async.LedgerTransactionServiceAsync
import com.moderntreasury.api.services.async.LedgerableEventServiceAsync
import com.moderntreasury.api.services.async.LegalEntityAssociationServiceAsync
import com.moderntreasury.api.services.async.LegalEntityServiceAsync
import com.moderntreasury.api.services.async.LineItemServiceAsync
import com.moderntreasury.api.services.async.PaperItemServiceAsync
import com.moderntreasury.api.services.async.PaymentFlowServiceAsync
import com.moderntreasury.api.services.async.PaymentOrderServiceAsync
import com.moderntreasury.api.services.async.PaymentReferenceServiceAsync
import com.moderntreasury.api.services.async.ReturnServiceAsync
import com.moderntreasury.api.services.async.RoutingDetailServiceAsync
import com.moderntreasury.api.services.async.TransactionServiceAsync
import com.moderntreasury.api.services.async.ValidationServiceAsync
import com.moderntreasury.api.services.async.VirtualAccountServiceAsync
import com.moderntreasury.api.services.async.WebhookServiceAsync

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

    fun connectionLegalEntities(): ConnectionLegalEntityServiceAsync

    fun legalEntities(): LegalEntityServiceAsync

    fun legalEntityAssociations(): LegalEntityAssociationServiceAsync

    /**
     * A test endpoint often used to confirm credentials and headers are being passed in correctly.
     */
    suspend fun ping(
        params: ClientPingParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PingResponse

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()
}
