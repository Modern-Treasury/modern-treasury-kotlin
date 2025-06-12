// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.RoutingNumberLookupRequest
import com.moderntreasury.api.models.ValidationValidateRoutingNumberParams

interface ValidationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ValidationService

    /** Validates the routing number information supplied without creating a routing detail */
    fun validateRoutingNumber(
        params: ValidationValidateRoutingNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingNumberLookupRequest

    /** A view of [ValidationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ValidationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/validations/routing_numbers`, but is otherwise
         * the same as [ValidationService.validateRoutingNumber].
         */
        @MustBeClosed
        fun validateRoutingNumber(
            params: ValidationValidateRoutingNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingNumberLookupRequest>
    }
}
