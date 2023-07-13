package com.moderntreasury.api.core.http

import com.moderntreasury.api.core.RequestOptions
import java.io.Closeable

interface HttpClient : Closeable {

    fun execute(
        request: HttpRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    suspend fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse
}
