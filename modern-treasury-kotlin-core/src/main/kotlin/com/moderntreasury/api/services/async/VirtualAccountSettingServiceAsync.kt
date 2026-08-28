// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.VirtualAccountSetting
import com.moderntreasury.api.models.VirtualAccountSettingCreateParams
import com.moderntreasury.api.models.VirtualAccountSettingListPageAsync
import com.moderntreasury.api.models.VirtualAccountSettingListParams

interface VirtualAccountSettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VirtualAccountSettingServiceAsync

    /** Create a virtual account setting. */
    suspend fun create(
        params: VirtualAccountSettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccountSetting

    /** List virtual account settings. */
    suspend fun list(
        params: VirtualAccountSettingListParams = VirtualAccountSettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccountSettingListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): VirtualAccountSettingListPageAsync =
        list(VirtualAccountSettingListParams.none(), requestOptions)

    /**
     * A view of [VirtualAccountSettingServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): VirtualAccountSettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/virtual_account_settings`, but is otherwise
         * the same as [VirtualAccountSettingServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: VirtualAccountSettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccountSetting>

        /**
         * Returns a raw HTTP response for `get /api/virtual_account_settings`, but is otherwise the
         * same as [VirtualAccountSettingServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: VirtualAccountSettingListParams = VirtualAccountSettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccountSettingListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<VirtualAccountSettingListPageAsync> =
            list(VirtualAccountSettingListParams.none(), requestOptions)
    }
}
