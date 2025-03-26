// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.http.Headers

interface WebhookService {

    fun getSignature(value: String, key: String): String

    fun validateSignature(payload: String, headers: Headers, key: String): Boolean
}
