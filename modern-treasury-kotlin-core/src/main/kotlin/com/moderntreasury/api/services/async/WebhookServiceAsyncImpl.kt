// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.common.io.BaseEncoding
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.getRequiredHeader
import com.moderntreasury.api.core.http.Headers
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

class WebhookServiceAsyncImpl(private val clientOptions: ClientOptions) : WebhookServiceAsync {

    override suspend fun getSignature(value: String, key: String): String {
        val mac: Mac = Mac.getInstance("HmacSHA256")
        mac.init(SecretKeySpec(key.toByteArray(), "HmacSHA256"))
        val bytes = mac.doFinal(value.toByteArray())
        return BaseEncoding.base16().lowerCase().encode(bytes)
    }

    override suspend fun validateSignature(
        payload: String,
        headers: Headers,
        key: String,
    ): Boolean {
        val expectedSignature = headers.getRequiredHeader("X-Signature")
        val signature = getSignature(payload, key)
        return signature == expectedSignature
    }
}
