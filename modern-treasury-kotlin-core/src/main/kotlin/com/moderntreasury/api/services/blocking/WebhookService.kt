@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.google.common.collect.ListMultimap

interface WebhookService {

    fun getSignature(value: String, key: String): String

    fun validateSignature(
        payload: String,
        headers: ListMultimap<String, String>,
        key: String
    ): Boolean
}
