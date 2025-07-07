// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.client

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
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
import com.moderntreasury.api.services.async.LegalEntityAssociationServiceAsync
import com.moderntreasury.api.services.async.LegalEntityServiceAsync
import com.moderntreasury.api.services.async.LineItemServiceAsync
import com.moderntreasury.api.services.async.PaperItemServiceAsync
import com.moderntreasury.api.services.async.PaymentActionServiceAsync
import com.moderntreasury.api.services.async.PaymentFlowServiceAsync
import com.moderntreasury.api.services.async.PaymentOrderServiceAsync
import com.moderntreasury.api.services.async.PaymentReferenceServiceAsync
import com.moderntreasury.api.services.async.ReturnServiceAsync
import com.moderntreasury.api.services.async.RoutingDetailServiceAsync
import com.moderntreasury.api.services.async.TransactionServiceAsync
import com.moderntreasury.api.services.async.ValidationServiceAsync
import com.moderntreasury.api.services.async.VirtualAccountServiceAsync

/**
 * A client for interacting with the Modern Treasury REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
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
interface ModernTreasuryClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): ModernTreasuryClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ModernTreasuryClientAsync

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

    fun virtualAccounts(): VirtualAccountServiceAsync

    fun bulkRequests(): BulkRequestServiceAsync

    fun bulkResults(): BulkResultServiceAsync

    fun ledgerAccountSettlements(): LedgerAccountSettlementServiceAsync

    fun foreignExchangeQuotes(): ForeignExchangeQuoteServiceAsync

    fun connectionLegalEntities(): ConnectionLegalEntityServiceAsync

    fun legalEntities(): LegalEntityServiceAsync

    fun legalEntityAssociations(): LegalEntityAssociationServiceAsync

    fun paymentActions(): PaymentActionServiceAsync

    /**
     * A test endpoint often used to confirm credentials and headers are being passed in correctly.
     */
    suspend fun ping(
        params: ClientPingParams = ClientPingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PingResponse

    /** @see [ping] */
    suspend fun ping(requestOptions: RequestOptions): PingResponse =
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
     * A view of [ModernTreasuryClientAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ModernTreasuryClientAsync.WithRawResponse

        fun connections(): ConnectionServiceAsync.WithRawResponse

        fun counterparties(): CounterpartyServiceAsync.WithRawResponse

        fun events(): EventServiceAsync.WithRawResponse

        fun expectedPayments(): ExpectedPaymentServiceAsync.WithRawResponse

        fun externalAccounts(): ExternalAccountServiceAsync.WithRawResponse

        fun incomingPaymentDetails(): IncomingPaymentDetailServiceAsync.WithRawResponse

        fun invoices(): InvoiceServiceAsync.WithRawResponse

        fun documents(): DocumentServiceAsync.WithRawResponse

        fun accountCollectionFlows(): AccountCollectionFlowServiceAsync.WithRawResponse

        fun accountDetails(): AccountDetailServiceAsync.WithRawResponse

        fun routingDetails(): RoutingDetailServiceAsync.WithRawResponse

        fun internalAccounts(): InternalAccountServiceAsync.WithRawResponse

        fun ledgers(): LedgerServiceAsync.WithRawResponse

        fun ledgerAccountCategories(): LedgerAccountCategoryServiceAsync.WithRawResponse

        fun ledgerAccounts(): LedgerAccountServiceAsync.WithRawResponse

        fun ledgerAccountBalanceMonitors(): LedgerAccountBalanceMonitorServiceAsync.WithRawResponse

        fun ledgerAccountStatements(): LedgerAccountStatementServiceAsync.WithRawResponse

        fun ledgerEntries(): LedgerEntryServiceAsync.WithRawResponse

        fun ledgerEventHandlers(): LedgerEventHandlerServiceAsync.WithRawResponse

        fun ledgerTransactions(): LedgerTransactionServiceAsync.WithRawResponse

        fun lineItems(): LineItemServiceAsync.WithRawResponse

        fun paymentFlows(): PaymentFlowServiceAsync.WithRawResponse

        fun paymentOrders(): PaymentOrderServiceAsync.WithRawResponse

        fun paymentReferences(): PaymentReferenceServiceAsync.WithRawResponse

        fun returns(): ReturnServiceAsync.WithRawResponse

        fun transactions(): TransactionServiceAsync.WithRawResponse

        fun validations(): ValidationServiceAsync.WithRawResponse

        fun paperItems(): PaperItemServiceAsync.WithRawResponse

        fun virtualAccounts(): VirtualAccountServiceAsync.WithRawResponse

        fun bulkRequests(): BulkRequestServiceAsync.WithRawResponse

        fun bulkResults(): BulkResultServiceAsync.WithRawResponse

        fun ledgerAccountSettlements(): LedgerAccountSettlementServiceAsync.WithRawResponse

        fun foreignExchangeQuotes(): ForeignExchangeQuoteServiceAsync.WithRawResponse

        fun connectionLegalEntities(): ConnectionLegalEntityServiceAsync.WithRawResponse

        fun legalEntities(): LegalEntityServiceAsync.WithRawResponse

        fun legalEntityAssociations(): LegalEntityAssociationServiceAsync.WithRawResponse

        fun paymentActions(): PaymentActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/ping`, but is otherwise the same as
         * [ModernTreasuryClientAsync.ping].
         */
        @MustBeClosed
        suspend fun ping(
            params: ClientPingParams = ClientPingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PingResponse>

        /** @see [ping] */
        @MustBeClosed
        suspend fun ping(requestOptions: RequestOptions): HttpResponseFor<PingResponse> =
            ping(ClientPingParams.none(), requestOptions)
    }
}
