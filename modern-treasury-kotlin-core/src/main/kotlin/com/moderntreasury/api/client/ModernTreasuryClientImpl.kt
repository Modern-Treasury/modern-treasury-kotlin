// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.client

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.*
import com.moderntreasury.api.services.blocking.*

class ModernTreasuryClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : ModernTreasuryClient {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val async: ModernTreasuryClientAsync by lazy {
        ModernTreasuryClientAsyncImpl(clientOptions)
    }

    private val connections: ConnectionService by lazy { ConnectionServiceImpl(clientOptions) }

    private val counterparties: CounterpartyService by lazy {
        CounterpartyServiceImpl(clientOptions)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    private val expectedPayments: ExpectedPaymentService by lazy {
        ExpectedPaymentServiceImpl(clientOptions)
    }

    private val externalAccounts: ExternalAccountService by lazy {
        ExternalAccountServiceImpl(clientOptions)
    }

    private val incomingPaymentDetails: IncomingPaymentDetailService by lazy {
        IncomingPaymentDetailServiceImpl(clientOptions)
    }

    private val invoices: InvoiceService by lazy { InvoiceServiceImpl(clientOptions) }

    private val documents: DocumentService by lazy { DocumentServiceImpl(clientOptions) }

    private val accountCollectionFlows: AccountCollectionFlowService by lazy {
        AccountCollectionFlowServiceImpl(clientOptions)
    }

    private val accountDetails: AccountDetailService by lazy {
        AccountDetailServiceImpl(clientOptions)
    }

    private val routingDetails: RoutingDetailService by lazy {
        RoutingDetailServiceImpl(clientOptions)
    }

    private val internalAccounts: InternalAccountService by lazy {
        InternalAccountServiceImpl(clientOptions)
    }

    private val ledgers: LedgerService by lazy { LedgerServiceImpl(clientOptions) }

    private val ledgerableEvents: LedgerableEventService by lazy {
        LedgerableEventServiceImpl(clientOptions)
    }

    private val ledgerAccountCategories: LedgerAccountCategoryService by lazy {
        LedgerAccountCategoryServiceImpl(clientOptions)
    }

    private val ledgerAccounts: LedgerAccountService by lazy {
        LedgerAccountServiceImpl(clientOptions)
    }

    private val ledgerAccountBalanceMonitors: LedgerAccountBalanceMonitorService by lazy {
        LedgerAccountBalanceMonitorServiceImpl(clientOptions)
    }

    private val ledgerAccountStatements: LedgerAccountStatementService by lazy {
        LedgerAccountStatementServiceImpl(clientOptions)
    }

    private val ledgerEntries: LedgerEntryService by lazy { LedgerEntryServiceImpl(clientOptions) }

    private val ledgerEventHandlers: LedgerEventHandlerService by lazy {
        LedgerEventHandlerServiceImpl(clientOptions)
    }

    private val ledgerTransactions: LedgerTransactionService by lazy {
        LedgerTransactionServiceImpl(clientOptions)
    }

    private val lineItems: LineItemService by lazy { LineItemServiceImpl(clientOptions) }

    private val paymentFlows: PaymentFlowService by lazy { PaymentFlowServiceImpl(clientOptions) }

    private val paymentOrders: PaymentOrderService by lazy {
        PaymentOrderServiceImpl(clientOptions)
    }

    private val paymentReferences: PaymentReferenceService by lazy {
        PaymentReferenceServiceImpl(clientOptions)
    }

    private val returns: ReturnService by lazy { ReturnServiceImpl(clientOptions) }

    private val transactions: TransactionService by lazy { TransactionServiceImpl(clientOptions) }

    private val validations: ValidationService by lazy { ValidationServiceImpl(clientOptions) }

    private val paperItems: PaperItemService by lazy { PaperItemServiceImpl(clientOptions) }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptions) }

    private val virtualAccounts: VirtualAccountService by lazy {
        VirtualAccountServiceImpl(clientOptions)
    }

    private val bulkRequests: BulkRequestService by lazy { BulkRequestServiceImpl(clientOptions) }

    private val bulkResults: BulkResultService by lazy { BulkResultServiceImpl(clientOptions) }

    private val ledgerAccountSettlements: LedgerAccountSettlementService by lazy {
        LedgerAccountSettlementServiceImpl(clientOptions)
    }

    private val foreignExchangeQuotes: ForeignExchangeQuoteService by lazy {
        ForeignExchangeQuoteServiceImpl(clientOptions)
    }

    private val connectionLegalEntities: ConnectionLegalEntityService by lazy {
        ConnectionLegalEntityServiceImpl(clientOptions)
    }

    private val legalEntities: LegalEntityService by lazy { LegalEntityServiceImpl(clientOptions) }

    private val legalEntityAssociations: LegalEntityAssociationService by lazy {
        LegalEntityAssociationServiceImpl(clientOptions)
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
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
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
}
