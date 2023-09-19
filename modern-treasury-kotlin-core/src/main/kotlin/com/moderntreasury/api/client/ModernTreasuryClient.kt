@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.client

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.*
import com.moderntreasury.api.services.blocking.*

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

    fun ledgerAccountPayouts(): LedgerAccountPayoutService

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

    /**
     * A test endpoint often used to confirm credentials and headers are being passed in correctly.
     */
    fun ping(
        params: ClientPingParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PingResponse
}
