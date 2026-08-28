// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPagerAsync
import com.moderntreasury.api.core.PageAsync
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.VirtualAccountSettingServiceAsync
import java.util.Objects

/** @see VirtualAccountSettingServiceAsync.list */
class VirtualAccountSettingListPageAsync
private constructor(
    private val service: VirtualAccountSettingServiceAsync,
    private val params: VirtualAccountSettingListParams,
    private val headers: Headers,
    private val items: List<VirtualAccountSetting>,
) : PageAsync<VirtualAccountSetting> {

    fun perPage(): String? = headers.values("X-Per-Page").firstOrNull()

    fun afterCursor(): String? = headers.values("X-After-Cursor").firstOrNull()

    override fun hasNextPage(): Boolean = afterCursor() != null

    fun nextPageParams(): VirtualAccountSettingListParams {
        val nextCursor =
            afterCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override suspend fun nextPage(): VirtualAccountSettingListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<VirtualAccountSetting> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VirtualAccountSettingListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<VirtualAccountSetting> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [VirtualAccountSettingListPageAsync].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [VirtualAccountSettingListPageAsync]. */
    class Builder internal constructor() {

        private var service: VirtualAccountSettingServiceAsync? = null
        private var params: VirtualAccountSettingListParams? = null
        private var headers: Headers? = null
        private var items: List<VirtualAccountSetting>? = null

        internal fun from(virtualAccountSettingListPageAsync: VirtualAccountSettingListPageAsync) =
            apply {
                service = virtualAccountSettingListPageAsync.service
                params = virtualAccountSettingListPageAsync.params
                headers = virtualAccountSettingListPageAsync.headers
                items = virtualAccountSettingListPageAsync.items
            }

        fun service(service: VirtualAccountSettingServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VirtualAccountSettingListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<VirtualAccountSetting>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [VirtualAccountSettingListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VirtualAccountSettingListPageAsync =
            VirtualAccountSettingListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VirtualAccountSettingListPageAsync &&
            service == other.service &&
            params == other.params &&
            headers == other.headers &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, headers, items)

    override fun toString() =
        "VirtualAccountSettingListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
