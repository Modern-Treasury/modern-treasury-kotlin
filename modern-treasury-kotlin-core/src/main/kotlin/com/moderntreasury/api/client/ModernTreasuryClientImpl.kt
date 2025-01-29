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
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.ClientPingParams
import com.moderntreasury.api.models.PingResponse
import com.moderntreasury.api.services.blocking.AccountCollectionFlowService
import com.moderntreasury.api.services.blocking.AccountCollectionFlowServiceImpl
import com.moderntreasury.api.services.blocking.AccountDetailService
import com.moderntreasury.api.services.blocking.AccountDetailServiceImpl
import com.moderntreasury.api.services.blocking.BulkRequestService
import com.moderntreasury.api.services.blocking.BulkRequestServiceImpl
import com.moderntreasury.api.services.blocking.BulkResultService
import com.moderntreasury.api.services.blocking.BulkResultServiceImpl
import com.moderntreasury.api.services.blocking.ConnectionLegalEntityService
import com.moderntreasury.api.services.blocking.ConnectionLegalEntityServiceImpl
import com.moderntreasury.api.services.blocking.ConnectionService
import com.moderntreasury.api.services.blocking.ConnectionServiceImpl
import com.moderntreasury.api.services.blocking.CounterpartyService
import com.moderntreasury.api.services.blocking.CounterpartyServiceImpl
import com.moderntreasury.api.services.blocking.DocumentService
import com.moderntreasury.api.services.blocking.DocumentServiceImpl
import com.moderntreasury.api.services.blocking.EventService
import com.moderntreasury.api.services.blocking.EventServiceImpl
import com.moderntreasury.api.services.blocking.ExpectedPaymentService
import com.moderntreasury.api.services.blocking.ExpectedPaymentServiceImpl
import com.moderntreasury.api.services.blocking.ExternalAccountService
import com.moderntreasury.api.services.blocking.ExternalAccountServiceImpl
import com.moderntreasury.api.services.blocking.ForeignExchangeQuoteService
import com.moderntreasury.api.services.blocking.ForeignExchangeQuoteServiceImpl
import com.moderntreasury.api.services.blocking.IncomingPaymentDetailService
import com.moderntreasury.api.services.blocking.IncomingPaymentDetailServiceImpl
import com.moderntreasury.api.services.blocking.InternalAccountService
import com.moderntreasury.api.services.blocking.InternalAccountServiceImpl
import com.moderntreasury.api.services.blocking.InvoiceService
import com.moderntreasury.api.services.blocking.InvoiceServiceImpl
import com.moderntreasury.api.services.blocking.LedgerAccountBalanceMonitorService
import com.moderntreasury.api.services.blocking.LedgerAccountBalanceMonitorServiceImpl
import com.moderntreasury.api.services.blocking.LedgerAccountCategoryService
import com.moderntreasury.api.services.blocking.LedgerAccountCategoryServiceImpl
import com.moderntreasury.api.services.blocking.LedgerAccountService
import com.moderntreasury.api.services.blocking.LedgerAccountServiceImpl
import com.moderntreasury.api.services.blocking.LedgerAccountSettlementService
import com.moderntreasury.api.services.blocking.LedgerAccountSettlementServiceImpl
import com.moderntreasury.api.services.blocking.LedgerAccountStatementService
import com.moderntreasury.api.services.blocking.LedgerAccountStatementServiceImpl
import com.moderntreasury.api.services.blocking.LedgerEntryService
import com.moderntreasury.api.services.blocking.LedgerEntryServiceImpl
import com.moderntreasury.api.services.blocking.LedgerEventHandlerService
import com.moderntreasury.api.services.blocking.LedgerEventHandlerServiceImpl
import com.moderntreasury.api.services.blocking.LedgerService
import com.moderntreasury.api.services.blocking.LedgerServiceImpl
import com.moderntreasury.api.services.blocking.LedgerTransactionService
import com.moderntreasury.api.services.blocking.LedgerTransactionServiceImpl
import com.moderntreasury.api.services.blocking.LedgerableEventService
import com.moderntreasury.api.services.blocking.LedgerableEventServiceImpl
import com.moderntreasury.api.services.blocking.LegalEntityAssociationService
import com.moderntreasury.api.services.blocking.LegalEntityAssociationServiceImpl
import com.moderntreasury.api.services.blocking.LegalEntityService
import com.moderntreasury.api.services.blocking.LegalEntityServiceImpl
import com.moderntreasury.api.services.blocking.LineItemService
import com.moderntreasury.api.services.blocking.LineItemServiceImpl
import com.moderntreasury.api.services.blocking.PaperItemService
import com.moderntreasury.api.services.blocking.PaperItemServiceImpl
import com.moderntreasury.api.services.blocking.PaymentFlowService
import com.moderntreasury.api.services.blocking.PaymentFlowServiceImpl
import com.moderntreasury.api.services.blocking.PaymentOrderService
import com.moderntreasury.api.services.blocking.PaymentOrderServiceImpl
import com.moderntreasury.api.services.blocking.PaymentReferenceService
import com.moderntreasury.api.services.blocking.PaymentReferenceServiceImpl
import com.moderntreasury.api.services.blocking.ReturnService
import com.moderntreasury.api.services.blocking.ReturnServiceImpl
import com.moderntreasury.api.services.blocking.RoutingDetailService
import com.moderntreasury.api.services.blocking.RoutingDetailServiceImpl
import com.moderntreasury.api.services.blocking.TransactionService
import com.moderntreasury.api.services.blocking.TransactionServiceImpl
import com.moderntreasury.api.services.blocking.ValidationService
import com.moderntreasury.api.services.blocking.ValidationServiceImpl
import com.moderntreasury.api.services.blocking.VirtualAccountService
import com.moderntreasury.api.services.blocking.VirtualAccountServiceImpl
import com.moderntreasury.api.services.blocking.WebhookService
import com.moderntreasury.api.services.blocking.WebhookServiceImpl

class ModernTreasuryClientImpl(
    private val clientOptions: ClientOptions,
) : ModernTreasuryClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: ModernTreasuryClientAsync by lazy {
        ModernTreasuryClientAsyncImpl(clientOptions)
    }

    private val connections: ConnectionService by lazy {
        ConnectionServiceImpl(clientOptionsWithUserAgent)
    }

    private val counterparties: CounterpartyService by lazy {
        CounterpartyServiceImpl(clientOptionsWithUserAgent)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptionsWithUserAgent) }

    private val expectedPayments: ExpectedPaymentService by lazy {
        ExpectedPaymentServiceImpl(clientOptionsWithUserAgent)
    }

    private val externalAccounts: ExternalAccountService by lazy {
        ExternalAccountServiceImpl(clientOptionsWithUserAgent)
    }

    private val incomingPaymentDetails: IncomingPaymentDetailService by lazy {
        IncomingPaymentDetailServiceImpl(clientOptionsWithUserAgent)
    }

    private val invoices: InvoiceService by lazy { InvoiceServiceImpl(clientOptionsWithUserAgent) }

    private val documents: DocumentService by lazy {
        DocumentServiceImpl(clientOptionsWithUserAgent)
    }

    private val accountCollectionFlows: AccountCollectionFlowService by lazy {
        AccountCollectionFlowServiceImpl(clientOptionsWithUserAgent)
    }

    private val accountDetails: AccountDetailService by lazy {
        AccountDetailServiceImpl(clientOptionsWithUserAgent)
    }

    private val routingDetails: RoutingDetailService by lazy {
        RoutingDetailServiceImpl(clientOptionsWithUserAgent)
    }

    private val internalAccounts: InternalAccountService by lazy {
        InternalAccountServiceImpl(clientOptionsWithUserAgent)
    }

    private val ledgers: LedgerService by lazy { LedgerServiceImpl(clientOptionsWithUserAgent) }

    private val ledgerableEvents: LedgerableEventService by lazy {
        LedgerableEventServiceImpl(clientOptionsWithUserAgent)
    }

    private val ledgerAccountCategories: LedgerAccountCategoryService by lazy {
        LedgerAccountCategoryServiceImpl(clientOptionsWithUserAgent)
    }

    private val ledgerAccounts: LedgerAccountService by lazy {
        LedgerAccountServiceImpl(clientOptionsWithUserAgent)
    }

    private val ledgerAccountBalanceMonitors: LedgerAccountBalanceMonitorService by lazy {
        LedgerAccountBalanceMonitorServiceImpl(clientOptionsWithUserAgent)
    }

    private val ledgerAccountStatements: LedgerAccountStatementService by lazy {
        LedgerAccountStatementServiceImpl(clientOptionsWithUserAgent)
    }

    private val ledgerEntries: LedgerEntryService by lazy {
        LedgerEntryServiceImpl(clientOptionsWithUserAgent)
    }

    private val ledgerEventHandlers: LedgerEventHandlerService by lazy {
        LedgerEventHandlerServiceImpl(clientOptionsWithUserAgent)
    }

    private val ledgerTransactions: LedgerTransactionService by lazy {
        LedgerTransactionServiceImpl(clientOptionsWithUserAgent)
    }

    private val lineItems: LineItemService by lazy {
        LineItemServiceImpl(clientOptionsWithUserAgent)
    }

    private val paymentFlows: PaymentFlowService by lazy {
        PaymentFlowServiceImpl(clientOptionsWithUserAgent)
    }

    private val paymentOrders: PaymentOrderService by lazy {
        PaymentOrderServiceImpl(clientOptionsWithUserAgent)
    }

    private val paymentReferences: PaymentReferenceService by lazy {
        PaymentReferenceServiceImpl(clientOptionsWithUserAgent)
    }

    private val returns: ReturnService by lazy { ReturnServiceImpl(clientOptionsWithUserAgent) }

    private val transactions: TransactionService by lazy {
        TransactionServiceImpl(clientOptionsWithUserAgent)
    }

    private val validations: ValidationService by lazy {
        ValidationServiceImpl(clientOptionsWithUserAgent)
    }

    private val paperItems: PaperItemService by lazy {
        PaperItemServiceImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptions) }

    private val virtualAccounts: VirtualAccountService by lazy {
        VirtualAccountServiceImpl(clientOptionsWithUserAgent)
    }

    private val bulkRequests: BulkRequestService by lazy {
        BulkRequestServiceImpl(clientOptionsWithUserAgent)
    }

    private val bulkResults: BulkResultService by lazy {
        BulkResultServiceImpl(clientOptionsWithUserAgent)
    }

    private val ledgerAccountSettlements: LedgerAccountSettlementService by lazy {
        LedgerAccountSettlementServiceImpl(clientOptionsWithUserAgent)
    }

    private val foreignExchangeQuotes: ForeignExchangeQuoteService by lazy {
        ForeignExchangeQuoteServiceImpl(clientOptionsWithUserAgent)
    }

    private val connectionLegalEntities: ConnectionLegalEntityService by lazy {
        ConnectionLegalEntityServiceImpl(clientOptionsWithUserAgent)
    }

    private val legalEntities: LegalEntityService by lazy {
        LegalEntityServiceImpl(clientOptionsWithUserAgent)
    }

    private val legalEntityAssociations: LegalEntityAssociationService by lazy {
        LegalEntityAssociationServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): ModernTreasuryClientAsync = async

    override fun connections(): ConnectionService = connections

    override fun counterparties(): CounterpartyService = counterparties

    override fun events(): EventService = events

    override fun expectedPayments(): ExpectedPaymentService = expectedPayments

    override fun externalAccounts(): ExternalAccountService = externalAccounts

    override fun incomingPaymentDetails(): IncomingPaymentDetailService = incomingPaymentDetails

    override fun invoices(): InvoiceService = invoices

    override fun documents(): DocumentService = documents

    override fun accountCollectionFlows(): AccountCollectionFlowService = accountCollectionFlows

    override fun accountDetails(): AccountDetailService = accountDetails

    override fun routingDetails(): RoutingDetailService = routingDetails

    override fun internalAccounts(): InternalAccountService = internalAccounts

    override fun ledgers(): LedgerService = ledgers

    override fun ledgerableEvents(): LedgerableEventService = ledgerableEvents

    override fun ledgerAccountCategories(): LedgerAccountCategoryService = ledgerAccountCategories

    override fun ledgerAccounts(): LedgerAccountService = ledgerAccounts

    override fun ledgerAccountBalanceMonitors(): LedgerAccountBalanceMonitorService =
        ledgerAccountBalanceMonitors

    override fun ledgerAccountStatements(): LedgerAccountStatementService = ledgerAccountStatements

    override fun ledgerEntries(): LedgerEntryService = ledgerEntries

    override fun ledgerEventHandlers(): LedgerEventHandlerService = ledgerEventHandlers

    override fun ledgerTransactions(): LedgerTransactionService = ledgerTransactions

    override fun lineItems(): LineItemService = lineItems

    override fun paymentFlows(): PaymentFlowService = paymentFlows

    override fun paymentOrders(): PaymentOrderService = paymentOrders

    override fun paymentReferences(): PaymentReferenceService = paymentReferences

    override fun returns(): ReturnService = returns

    override fun transactions(): TransactionService = transactions

    override fun validations(): ValidationService = validations

    override fun paperItems(): PaperItemService = paperItems

    override fun webhooks(): WebhookService = webhooks

    override fun virtualAccounts(): VirtualAccountService = virtualAccounts

    override fun bulkRequests(): BulkRequestService = bulkRequests

    override fun bulkResults(): BulkResultService = bulkResults

    override fun ledgerAccountSettlements(): LedgerAccountSettlementService =
        ledgerAccountSettlements

    override fun foreignExchangeQuotes(): ForeignExchangeQuoteService = foreignExchangeQuotes

    override fun connectionLegalEntities(): ConnectionLegalEntityService = connectionLegalEntities

    override fun legalEntities(): LegalEntityService = legalEntities

    override fun legalEntityAssociations(): LegalEntityAssociationService = legalEntityAssociations

    private val pingHandler: Handler<PingResponse> =
        jsonHandler<PingResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * A test endpoint often used to confirm credentials and headers are being passed in correctly.
     */
    override fun ping(params: ClientPingParams, requestOptions: RequestOptions): PingResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ping")
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { pingHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    override fun close() = clientOptions.httpClient.close()
}
