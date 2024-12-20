// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.common.io.BaseEncoding
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.getRequiredHeader
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.errors.ModernTreasuryError
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

class WebhookServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : WebhookService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    override fun getSignature(value: String, key: String): String {
        val mac: Mac = Mac.getInstance("HmacSHA256")
        mac.init(SecretKeySpec(key.toByteArray(), "HmacSHA256"))
        val bytes = mac.doFinal(value.toByteArray())
        return BaseEncoding.base16().lowerCase().encode(bytes)
    }

    override fun validateSignature(payload: String, headers: Headers, key: String): Boolean {
        val expectedSignature = headers.getRequiredHeader("X-Signature")
        val signature = getSignature(payload, key)
        return signature == expectedSignature
    }
}
