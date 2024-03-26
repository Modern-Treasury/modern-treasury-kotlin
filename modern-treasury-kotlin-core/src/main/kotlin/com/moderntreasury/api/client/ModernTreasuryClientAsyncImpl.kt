// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.client

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.*
import com.moderntreasury.api.services.async.*
import com.moderntreasury.api.services.errorHandler
import com.moderntreasury.api.services.jsonHandler
import com.moderntreasury.api.services.withErrorHandler

class ModernTreasuryClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ModernTreasuryClientAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val sync: ModernTreasuryClient by lazy { ModernTreasuryClientImpl(clientOptions) }

    private val connections: ConnectionServiceAsync by lazy {
        ConnectionServiceAsyncImpl(clientOptions)
    }

    private val counterparties: CounterpartyServiceAsync by lazy {
        CounterpartyServiceAsyncImpl(clientOptions)
    }

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val expectedPayments: ExpectedPaymentServiceAsync by lazy {
        ExpectedPaymentServiceAsyncImpl(clientOptions)
    }

    private val externalAccounts: ExternalAccountServiceAsync by lazy {
        ExternalAccountServiceAsyncImpl(clientOptions)
    }

    private val incomingPaymentDetails: IncomingPaymentDetailServiceAsync by lazy {
        IncomingPaymentDetailServiceAsyncImpl(clientOptions)
    }

    private val invoices: InvoiceServiceAsync by lazy { InvoiceServiceAsyncImpl(clientOptions) }

    private val documents: DocumentServiceAsync by lazy { DocumentServiceAsyncImpl(clientOptions) }

    private val accountCollectionFlows: AccountCollectionFlowServiceAsync by lazy {
        AccountCollectionFlowServiceAsyncImpl(clientOptions)
    }

    private val accountDetails: AccountDetailServiceAsync by lazy {
        AccountDetailServiceAsyncImpl(clientOptions)
    }

    private val routingDetails: RoutingDetailServiceAsync by lazy {
        RoutingDetailServiceAsyncImpl(clientOptions)
    }

    private val internalAccounts: InternalAccountServiceAsync by lazy {
        InternalAccountServiceAsyncImpl(clientOptions)
    }

    private val ledgers: LedgerServiceAsync by lazy { LedgerServiceAsyncImpl(clientOptions) }

    private val ledgerableEvents: LedgerableEventServiceAsync by lazy {
        LedgerableEventServiceAsyncImpl(clientOptions)
    }

    private val ledgerAccountCategories: LedgerAccountCategoryServiceAsync by lazy {
        LedgerAccountCategoryServiceAsyncImpl(clientOptions)
    }

    private val ledgerAccounts: LedgerAccountServiceAsync by lazy {
        LedgerAccountServiceAsyncImpl(clientOptions)
    }

    private val ledgerAccountBalanceMonitors: LedgerAccountBalanceMonitorServiceAsync by lazy {
        LedgerAccountBalanceMonitorServiceAsyncImpl(clientOptions)
    }

    private val ledgerAccountPayouts: LedgerAccountPayoutServiceAsync by lazy {
        LedgerAccountPayoutServiceAsyncImpl(clientOptions)
    }

    private val ledgerAccountStatements: LedgerAccountStatementServiceAsync by lazy {
        LedgerAccountStatementServiceAsyncImpl(clientOptions)
    }

    private val ledgerEntries: LedgerEntryServiceAsync by lazy {
        LedgerEntryServiceAsyncImpl(clientOptions)
    }

    private val ledgerEventHandlers: LedgerEventHandlerServiceAsync by lazy {
        LedgerEventHandlerServiceAsyncImpl(clientOptions)
    }

    private val ledgerTransactions: LedgerTransactionServiceAsync by lazy {
        LedgerTransactionServiceAsyncImpl(clientOptions)
    }

    private val lineItems: LineItemServiceAsync by lazy { LineItemServiceAsyncImpl(clientOptions) }

    private val paymentFlows: PaymentFlowServiceAsync by lazy {
        PaymentFlowServiceAsyncImpl(clientOptions)
    }

    private val paymentOrders: PaymentOrderServiceAsync by lazy {
        PaymentOrderServiceAsyncImpl(clientOptions)
    }

    private val paymentReferences: PaymentReferenceServiceAsync by lazy {
        PaymentReferenceServiceAsyncImpl(clientOptions)
    }

    private val returns: ReturnServiceAsync by lazy { ReturnServiceAsyncImpl(clientOptions) }

    private val transactions: TransactionServiceAsync by lazy {
        TransactionServiceAsyncImpl(clientOptions)
    }

    private val validations: ValidationServiceAsync by lazy {
        ValidationServiceAsyncImpl(clientOptions)
    }

    private val paperItems: PaperItemServiceAsync by lazy {
        PaperItemServiceAsyncImpl(clientOptions)
    }

    private val webhooks: WebhookServiceAsync by lazy { WebhookServiceAsyncImpl(clientOptions) }

    private val virtualAccounts: VirtualAccountServiceAsync by lazy {
        VirtualAccountServiceAsyncImpl(clientOptions)
    }

    private val bulkRequests: BulkRequestServiceAsync by lazy {
        BulkRequestServiceAsyncImpl(clientOptions)
    }

    private val bulkResults: BulkResultServiceAsync by lazy {
        BulkResultServiceAsyncImpl(clientOptions)
    }

    private val ledgerAccountSettlements: LedgerAccountSettlementServiceAsync by lazy {
        LedgerAccountSettlementServiceAsyncImpl(clientOptions)
    }

    private val foreignExchangeQuotes: ForeignExchangeQuoteServiceAsync by lazy {
        ForeignExchangeQuoteServiceAsyncImpl(clientOptions)
    }

    private val connectionLegalEntities: ConnectionLegalEntityServiceAsync by lazy {
        ConnectionLegalEntityServiceAsyncImpl(clientOptions)
    }

    private val legalEntities: LegalEntityServiceAsync by lazy {
        LegalEntityServiceAsyncImpl(clientOptions)
    }

    private val legalEntityAssociations: LegalEntityAssociationServiceAsync by lazy {
        LegalEntityAssociationServiceAsyncImpl(clientOptions)
    }

    override fun sync(): ModernTreasuryClient = sync

    override fun connections(): ConnectionServiceAsync = connections

    override fun counterparties(): CounterpartyServiceAsync = counterparties

    override fun events(): EventServiceAsync = events

    override fun expectedPayments(): ExpectedPaymentServiceAsync = expectedPayments

    override fun externalAccounts(): ExternalAccountServiceAsync = externalAccounts

    override fun incomingPaymentDetails(): IncomingPaymentDetailServiceAsync =
        incomingPaymentDetails

    override fun invoices(): InvoiceServiceAsync = invoices

    override fun documents(): DocumentServiceAsync = documents

    override fun accountCollectionFlows(): AccountCollectionFlowServiceAsync =
        accountCollectionFlows

    override fun accountDetails(): AccountDetailServiceAsync = accountDetails

    override fun routingDetails(): RoutingDetailServiceAsync = routingDetails

    override fun internalAccounts(): InternalAccountServiceAsync = internalAccounts

    override fun ledgers(): LedgerServiceAsync = ledgers

    override fun ledgerableEvents(): LedgerableEventServiceAsync = ledgerableEvents

    override fun ledgerAccountCategories(): LedgerAccountCategoryServiceAsync =
        ledgerAccountCategories

    override fun ledgerAccounts(): LedgerAccountServiceAsync = ledgerAccounts

    override fun ledgerAccountBalanceMonitors(): LedgerAccountBalanceMonitorServiceAsync =
        ledgerAccountBalanceMonitors

    override fun ledgerAccountPayouts(): LedgerAccountPayoutServiceAsync = ledgerAccountPayouts

    override fun ledgerAccountStatements(): LedgerAccountStatementServiceAsync =
        ledgerAccountStatements

    override fun ledgerEntries(): LedgerEntryServiceAsync = ledgerEntries

    override fun ledgerEventHandlers(): LedgerEventHandlerServiceAsync = ledgerEventHandlers

    override fun ledgerTransactions(): LedgerTransactionServiceAsync = ledgerTransactions

    override fun lineItems(): LineItemServiceAsync = lineItems

    override fun paymentFlows(): PaymentFlowServiceAsync = paymentFlows

    override fun paymentOrders(): PaymentOrderServiceAsync = paymentOrders

    override fun paymentReferences(): PaymentReferenceServiceAsync = paymentReferences

    override fun returns(): ReturnServiceAsync = returns

    override fun transactions(): TransactionServiceAsync = transactions

    override fun validations(): ValidationServiceAsync = validations

    override fun paperItems(): PaperItemServiceAsync = paperItems

    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun virtualAccounts(): VirtualAccountServiceAsync = virtualAccounts

    override fun bulkRequests(): BulkRequestServiceAsync = bulkRequests

    override fun bulkResults(): BulkResultServiceAsync = bulkResults

    override fun ledgerAccountSettlements(): LedgerAccountSettlementServiceAsync =
        ledgerAccountSettlements

    override fun foreignExchangeQuotes(): ForeignExchangeQuoteServiceAsync = foreignExchangeQuotes

    override fun connectionLegalEntities(): ConnectionLegalEntityServiceAsync =
        connectionLegalEntities

    override fun legalEntities(): LegalEntityServiceAsync = legalEntities

    override fun legalEntityAssociations(): LegalEntityAssociationServiceAsync =
        legalEntityAssociations

    private val pingHandler: Handler<PingResponse> =
        jsonHandler<PingResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * A test endpoint often used to confirm credentials and headers are being passed in correctly.
     */
    override suspend fun ping(
        params: ClientPingParams,
        requestOptions: RequestOptions
    ): PingResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ping")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { pingHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
