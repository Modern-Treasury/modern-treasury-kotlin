// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.errors

import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.http.Headers

abstract class ModernTreasuryServiceException
protected constructor(message: String, cause: Throwable? = null) :
    ModernTreasuryException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
