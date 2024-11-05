// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.client

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.getPackageVersion
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.*
import com.moderntreasury.api.services.async.*

class ModernTreasuryClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ModernTreasuryClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.containsKey("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: ModernTreasuryClient by lazy { ModernTreasuryClientImpl(clientOptions) }

    private val connections: ConnectionServiceAsync by lazy {
        ConnectionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val counterparties: CounterpartyServiceAsync by lazy {
        CounterpartyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val events: EventServiceAsync by lazy {
        EventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val expectedPayments: ExpectedPaymentServiceAsync by lazy {
        ExpectedPaymentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val externalAccounts: ExternalAccountServiceAsync by lazy {
        ExternalAccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val incomingPaymentDetails: IncomingPaymentDetailServiceAsync by lazy {
        IncomingPaymentDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val invoices: InvoiceServiceAsync by lazy {
        InvoiceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val documents: DocumentServiceAsync by lazy {
        DocumentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val accountCollectionFlows: AccountCollectionFlowServiceAsync by lazy {
        AccountCollectionFlowServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val accountDetails: AccountDetailServiceAsync by lazy {
        AccountDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val routingDetails: RoutingDetailServiceAsync by lazy {
        RoutingDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val internalAccounts: InternalAccountServiceAsync by lazy {
        InternalAccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ledgers: LedgerServiceAsync by lazy {
        LedgerServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ledgerableEvents: LedgerableEventServiceAsync by lazy {
        LedgerableEventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ledgerAccountCategories: LedgerAccountCategoryServiceAsync by lazy {
        LedgerAccountCategoryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ledgerAccounts: LedgerAccountServiceAsync by lazy {
        LedgerAccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ledgerAccountBalanceMonitors: LedgerAccountBalanceMonitorServiceAsync by lazy {
        LedgerAccountBalanceMonitorServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ledgerAccountStatements: LedgerAccountStatementServiceAsync by lazy {
        LedgerAccountStatementServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ledgerEntries: LedgerEntryServiceAsync by lazy {
        LedgerEntryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ledgerEventHandlers: LedgerEventHandlerServiceAsync by lazy {
        LedgerEventHandlerServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ledgerTransactions: LedgerTransactionServiceAsync by lazy {
        LedgerTransactionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val lineItems: LineItemServiceAsync by lazy {
        LineItemServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val paymentFlows: PaymentFlowServiceAsync by lazy {
        PaymentFlowServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val paymentOrders: PaymentOrderServiceAsync by lazy {
        PaymentOrderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val paymentReferences: PaymentReferenceServiceAsync by lazy {
        PaymentReferenceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val returns: ReturnServiceAsync by lazy {
        ReturnServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val transactions: TransactionServiceAsync by lazy {
        TransactionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val validations: ValidationServiceAsync by lazy {
        ValidationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val paperItems: PaperItemServiceAsync by lazy {
        PaperItemServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val virtualAccounts: VirtualAccountServiceAsync by lazy {
        VirtualAccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val bulkRequests: BulkRequestServiceAsync by lazy {
        BulkRequestServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val bulkResults: BulkResultServiceAsync by lazy {
        BulkResultServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ledgerAccountSettlements: LedgerAccountSettlementServiceAsync by lazy {
        LedgerAccountSettlementServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val foreignExchangeQuotes: ForeignExchangeQuoteServiceAsync by lazy {
        ForeignExchangeQuoteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val connectionLegalEntities: ConnectionLegalEntityServiceAsync by lazy {
        ConnectionLegalEntityServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val legalEntities: LegalEntityServiceAsync by lazy {
        LegalEntityServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val legalEntityAssociations: LegalEntityAssociationServiceAsync by lazy {
        LegalEntityAssociationServiceAsyncImpl(clientOptionsWithUserAgent)
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
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
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
