// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.http.Headers

interface WebhookServiceAsync {

    suspend fun getSignature(value: String, key: String): String

    suspend fun validateSignature(payload: String, headers: Headers, key: String): Boolean
}
