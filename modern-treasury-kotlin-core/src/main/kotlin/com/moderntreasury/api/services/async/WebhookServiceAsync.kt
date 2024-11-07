// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.http.Headers

interface WebhookServiceAsync {

    suspend fun getSignature(value: String, key: String): String

    suspend fun validateSignature(payload: String, headers: Headers, key: String): Boolean
}
