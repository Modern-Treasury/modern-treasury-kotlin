@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.google.common.collect.ListMultimap

interface WebhookServiceAsync {

    suspend fun getSignature(value: String, key: String): String

    suspend fun validateSignature(
        payload: String,
        headers: ListMultimap<String, String>,
        key: String
    ): Boolean
}
