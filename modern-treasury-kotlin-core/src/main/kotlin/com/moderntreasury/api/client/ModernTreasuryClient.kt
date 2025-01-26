// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.client

import com.moderntreasury.api.core.RequestOptions
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
import com.moderntreasury.api.services.blocking.LedgerableEventService
import com.moderntreasury.api.services.blocking.LegalEntityAssociationService
import com.moderntreasury.api.services.blocking.LegalEntityService
import com.moderntreasury.api.services.blocking.LineItemService
import com.moderntreasury.api.services.blocking.PaperItemService
import com.moderntreasury.api.services.blocking.PaymentFlowService
import com.moderntreasury.api.services.blocking.PaymentOrderService
import com.moderntreasury.api.services.blocking.PaymentReferenceService
import com.moderntreasury.api.services.blocking.ReturnService
import com.moderntreasury.api.services.blocking.RoutingDetailService
import com.moderntreasury.api.services.blocking.TransactionService
import com.moderntreasury.api.services.blocking.ValidationService
import com.moderntreasury.api.services.blocking.VirtualAccountService
import com.moderntreasury.api.services.blocking.WebhookService

interface ModernTreasuryClient {

    fun async(): ModernTreasuryClientAsync

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

    fun ledgerableEvents(): LedgerableEventService

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

    fun webhooks(): WebhookService

    fun virtualAccounts(): VirtualAccountService

    fun bulkRequests(): BulkRequestService

    fun bulkResults(): BulkResultService

    fun ledgerAccountSettlements(): LedgerAccountSettlementService

    fun foreignExchangeQuotes(): ForeignExchangeQuoteService

    fun connectionLegalEntities(): ConnectionLegalEntityService

    fun legalEntities(): LegalEntityService

    fun legalEntityAssociations(): LegalEntityAssociationService

    /**
     * A test endpoint often used to confirm credentials and headers are being passed in correctly.
     */
    fun ping(
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
