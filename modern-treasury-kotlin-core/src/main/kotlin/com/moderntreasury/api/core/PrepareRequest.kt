package com.moderntreasury.api.core

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.http.HttpRequest
import java.util.concurrent.CompletableFuture

internal fun HttpRequest.prepare(clientOptions: ClientOptions, params: Params): HttpRequest =
    toBuilder()
      .putAllQueryParams(clientOptions.queryParams)
      .replaceAllQueryParams(params._queryParams())
      .putAllHeaders(clientOptions.headers)
      .replaceAllHeaders(params._headers())
      .build()

internal suspend fun HttpRequest.prepareAsync(clientOptions: ClientOptions, params: Params) =
    // This async version exists to make it easier to add async specific preparation logic in the future.
    prepare(clientOptions, params)
