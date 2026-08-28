// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.VirtualAccountSetting
import com.moderntreasury.api.models.VirtualAccountSettingCreateParams
import com.moderntreasury.api.models.VirtualAccountSettingListPage
import com.moderntreasury.api.models.VirtualAccountSettingListParams

interface VirtualAccountSettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VirtualAccountSettingService

    /** Create a virtual account setting. */
    fun create(
        params: VirtualAccountSettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccountSetting

    /** List virtual account settings. */
    fun list(
        params: VirtualAccountSettingListParams = VirtualAccountSettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualAccountSettingListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): VirtualAccountSettingListPage =
        list(VirtualAccountSettingListParams.none(), requestOptions)

    /**
     * A view of [VirtualAccountSettingService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): VirtualAccountSettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/virtual_account_settings`, but is otherwise
         * the same as [VirtualAccountSettingService.create].
         */
        @MustBeClosed
        fun create(
            params: VirtualAccountSettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccountSetting>

        /**
         * Returns a raw HTTP response for `get /api/virtual_account_settings`, but is otherwise the
         * same as [VirtualAccountSettingService.list].
         */
        @MustBeClosed
        fun list(
            params: VirtualAccountSettingListParams = VirtualAccountSettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualAccountSettingListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VirtualAccountSettingListPage> =
            list(VirtualAccountSettingListParams.none(), requestOptions)
    }
}
