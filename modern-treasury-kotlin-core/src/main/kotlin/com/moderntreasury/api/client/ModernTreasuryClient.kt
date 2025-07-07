// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.client

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ClientPingParams
import com.moderntreasury.api.models.PingResponse
import com.moderntreasury.api.services.blocking.AccountCollectionFlowService
import com.moderntreasury.api.services.blocking.AccountDetailService
import com.moderntreasury.api.services.blocking.BulkRequestService
import com.moderntreasury.api.services.blocking.BulkResultService
import com.moderntreasury.api.services.blocking.ConnectionLegalEntityService
import com.moderntreasury.api.services.blocking.ConnectionService
import com.moderntreasury.api.services.blocking.CounterpartyService
import com.moderntreasury.api.services.blocking.DocumentService
import com.moderntreasury.api.services.blocking.EventService
import com.moderntreasury.api.services.blocking.ExpectedPaymentService
import com.moderntreasury.api.services.blocking.ExternalAccountService
import com.moderntreasury.api.services.blocking.ForeignExchangeQuoteService
import com.moderntreasury.api.services.blocking.IncomingPaymentDetailService
import com.moderntreasury.api.services.blocking.InternalAccountService
import com.moderntreasury.api.services.blocking.InvoiceService
import com.moderntreasury.api.services.blocking.LedgerAccountBalanceMonitorService
import com.moderntreasury.api.services.blocking.LedgerAccountCategoryService
import com.moderntreasury.api.services.blocking.LedgerAccountService
import com.moderntreasury.api.services.blocking.LedgerAccountSettlementService
import com.moderntreasury.api.services.blocking.LedgerAccountStatementService
import com.moderntreasury.api.services.blocking.LedgerEntryService
import com.moderntreasury.api.services.blocking.LedgerEventHandlerService
import com.moderntreasury.api.services.blocking.LedgerService
import com.moderntreasury.api.services.blocking.LedgerTransactionService
import com.moderntreasury.api.services.blocking.LegalEntityAssociationService
import com.moderntreasury.api.services.blocking.LegalEntityService
import com.moderntreasury.api.services.blocking.LineItemService
import com.moderntreasury.api.services.blocking.PaperItemService
import com.moderntreasury.api.services.blocking.PaymentActionService
import com.moderntreasury.api.services.blocking.PaymentFlowService
import com.moderntreasury.api.services.blocking.PaymentOrderService
import com.moderntreasury.api.services.blocking.PaymentReferenceService
import com.moderntreasury.api.services.blocking.ReturnService
import com.moderntreasury.api.services.blocking.RoutingDetailService
import com.moderntreasury.api.services.blocking.TransactionService
import com.moderntreasury.api.services.blocking.ValidationService
import com.moderntreasury.api.services.blocking.VirtualAccountService

/**
 * A client for interacting with the Modern Treasury REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface ModernTreasuryClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): ModernTreasuryClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ModernTreasuryClient

    fun connections(): ConnectionService

    fun counterparties(): CounterpartyService

    fun events(): EventService

    fun expectedPayments(): ExpectedPaymentService

    fun externalAccounts(): ExternalAccountService

    fun incomingPaymentDetails(): IncomingPaymentDetailService

    fun invoices(): InvoiceService

    fun documents(): DocumentService

    fun accountCollectionFlows(): AccountCollectionFlowService

    fun accountDetails(): AccountDetailService

    fun routingDetails(): RoutingDetailService

    fun internalAccounts(): InternalAccountService

    fun ledgers(): LedgerService

    fun ledgerAccountCategories(): LedgerAccountCategoryService

    fun ledgerAccounts(): LedgerAccountService

    fun ledgerAccountBalanceMonitors(): LedgerAccountBalanceMonitorService

    fun ledgerAccountStatements(): LedgerAccountStatementService

    fun ledgerEntries(): LedgerEntryService

    fun ledgerEventHandlers(): LedgerEventHandlerService

    fun ledgerTransactions(): LedgerTransactionService

    fun lineItems(): LineItemService

    fun paymentFlows(): PaymentFlowService

    fun paymentOrders(): PaymentOrderService

    fun paymentReferences(): PaymentReferenceService

    fun returns(): ReturnService

    fun transactions(): TransactionService

    fun validations(): ValidationService

    fun paperItems(): PaperItemService

    fun virtualAccounts(): VirtualAccountService

    fun bulkRequests(): BulkRequestService

    fun bulkResults(): BulkResultService

    fun ledgerAccountSettlements(): LedgerAccountSettlementService

    fun foreignExchangeQuotes(): ForeignExchangeQuoteService

    fun connectionLegalEntities(): ConnectionLegalEntityService

    fun legalEntities(): LegalEntityService

    fun legalEntityAssociations(): LegalEntityAssociationService

    fun paymentActions(): PaymentActionService

    /**
     * A test endpoint often used to confirm credentials and headers are being passed in correctly.
     */
    fun ping(
        params: ClientPingParams = ClientPingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PingResponse

    /** @see [ping] */
    fun ping(requestOptions: RequestOptions): PingResponse =
        ping(ClientPingParams.none(), requestOptions)

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

    /**
     * A view of [ModernTreasuryClient] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ModernTreasuryClient.WithRawResponse

        fun connections(): ConnectionService.WithRawResponse

        fun counterparties(): CounterpartyService.WithRawResponse

        fun events(): EventService.WithRawResponse

        fun expectedPayments(): ExpectedPaymentService.WithRawResponse

        fun externalAccounts(): ExternalAccountService.WithRawResponse

        fun incomingPaymentDetails(): IncomingPaymentDetailService.WithRawResponse

        fun invoices(): InvoiceService.WithRawResponse

        fun documents(): DocumentService.WithRawResponse

        fun accountCollectionFlows(): AccountCollectionFlowService.WithRawResponse

        fun accountDetails(): AccountDetailService.WithRawResponse

        fun routingDetails(): RoutingDetailService.WithRawResponse

        fun internalAccounts(): InternalAccountService.WithRawResponse

        fun ledgers(): LedgerService.WithRawResponse

        fun ledgerAccountCategories(): LedgerAccountCategoryService.WithRawResponse

        fun ledgerAccounts(): LedgerAccountService.WithRawResponse

        fun ledgerAccountBalanceMonitors(): LedgerAccountBalanceMonitorService.WithRawResponse

        fun ledgerAccountStatements(): LedgerAccountStatementService.WithRawResponse

        fun ledgerEntries(): LedgerEntryService.WithRawResponse

        fun ledgerEventHandlers(): LedgerEventHandlerService.WithRawResponse

        fun ledgerTransactions(): LedgerTransactionService.WithRawResponse

        fun lineItems(): LineItemService.WithRawResponse

        fun paymentFlows(): PaymentFlowService.WithRawResponse

        fun paymentOrders(): PaymentOrderService.WithRawResponse

        fun paymentReferences(): PaymentReferenceService.WithRawResponse

        fun returns(): ReturnService.WithRawResponse

        fun transactions(): TransactionService.WithRawResponse

        fun validations(): ValidationService.WithRawResponse

        fun paperItems(): PaperItemService.WithRawResponse

        fun virtualAccounts(): VirtualAccountService.WithRawResponse

        fun bulkRequests(): BulkRequestService.WithRawResponse

        fun bulkResults(): BulkResultService.WithRawResponse

        fun ledgerAccountSettlements(): LedgerAccountSettlementService.WithRawResponse

        fun foreignExchangeQuotes(): ForeignExchangeQuoteService.WithRawResponse

        fun connectionLegalEntities(): ConnectionLegalEntityService.WithRawResponse

        fun legalEntities(): LegalEntityService.WithRawResponse

        fun legalEntityAssociations(): LegalEntityAssociationService.WithRawResponse

        fun paymentActions(): PaymentActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/ping`, but is otherwise the same as
         * [ModernTreasuryClient.ping].
         */
        @MustBeClosed
        fun ping(
            params: ClientPingParams = ClientPingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PingResponse>

        /** @see [ping] */
        @MustBeClosed
        fun ping(requestOptions: RequestOptions): HttpResponseFor<PingResponse> =
            ping(ClientPingParams.none(), requestOptions)
    }
}
