# Modern Treasury Kotlin API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.moderntreasury.api/modern-treasury-kotlin)](https://central.sonatype.com/artifact/com.moderntreasury.api/modern-treasury-kotlin/2.13.0)

<!-- x-release-please-end -->

The Modern Treasury Kotlin SDK provides convenient access to the Modern Treasury REST API from applications written in Kotlin. It includes helper classes with helpful types and documentation for every request and response property.

The Modern Treasury Kotlin SDK is similar to the Modern Treasury Java SDK but with minor differences that make it more ergonomic for use in Kotlin, such as nullable values instead of `Optional`, `Sequence` instead of `Stream`, and suspend functions instead of `CompletableFuture`.

## Documentation

The REST API documentation can be found on [docs.moderntreasury.com](https://docs.moderntreasury.com).

---

## Getting started

### Install dependencies

#### Gradle

<!-- x-release-please-start-version -->

```kotlin
implementation("com.moderntreasury:modern-treasury-kotlin:2.13.0")
```

#### Maven

```xml
<dependency>
    <groupId>com.moderntreasury</groupId>
    <artifactId>modern-treasury-kotlin</artifactId>
    <version>2.13.0</version>
</dependency>
```

<!-- x-release-please-end -->

### Configure the client

Use `ModernTreasuryOkHttpClient.builder()` to configure the client. At a minimum you need to set `.apiKey()` and `.organizationId()`:

```kotlin
import com.moderntreasury.api.client.ModernTreasuryClient
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient

val client: ModernTreasuryClient = ModernTreasuryOkHttpClient.builder()
    .apiKey("My API Key")
    .organizationId("my-organization-ID")
    .build()
```

Alternately, set the environment with `MODERN_TREASURY_API_KEY`, `MODERN_TREASURY_ORGANIZATION_ID` or `MODERN_TREASURY_WEBHOOK_KEY`, and use `ModernTreasuryOkHttpClient.fromEnv()` to read from the environment.

```kotlin
import com.moderntreasury.api.client.ModernTreasuryClient
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient

val client: ModernTreasuryClient = ModernTreasuryOkHttpClient.fromEnv()

// Note: you can also call fromEnv() from the client builder, for example if you need to set additional properties
val client: ModernTreasuryClient = ModernTreasuryOkHttpClient.builder()
    .fromEnv()
    // ... set properties on the builder
    .build()
```

| Property       | Environment variable              | Required | Default value |
| -------------- | --------------------------------- | -------- | ------------- |
| apiKey         | `MODERN_TREASURY_API_KEY`         | true     | —             |
| organizationId | `MODERN_TREASURY_ORGANIZATION_ID` | true     | —             |
| webhookKey     | `MODERN_TREASURY_WEBHOOK_KEY`     | false    | —             |

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new counterparty, first use the `CounterpartyCreateParams` builder to specify attributes, then pass that to the `create` method of the `counterparties` service.

```kotlin
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyCreateParams

val params: CounterpartyCreateParams = CounterpartyCreateParams.builder()
    .name("my first counterparty")
    .build()
val counterparty: Counterparty = client.counterparties().create(params)
```

### Example: listing resources

The Modern Treasury API provides a `list` method to get a paginated list of counterparties. You can retrieve the first page by:

```kotlin
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyListPage

val page: CounterpartyListPage = client.counterparties().list()
for (counterparty: Counterparty in page.items()) {
    print(counterparty)
}
```

Use the `CounterpartyListParams` builder to set parameters:

```kotlin
import com.moderntreasury.api.models.CounterpartyListPage
import com.moderntreasury.api.models.CounterpartyListParams
import java.time.OffsetDateTime

val params: CounterpartyListParams = CounterpartyListParams.builder()
    .afterCursor("after_cursor")
    .createdAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    .createdAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    .email("dev@stainlessapi.com")
    .legalEntityId("legal_entity_id")
    .metadata(CounterpartyListParams.Metadata.builder()
        .putAdditionalProperty("foo", "string")
        .build())
    .name("name")
    .perPage(0L)
    .build()
val page1: CounterpartyListPage = client.counterparties().list(params)

// Using the `from` method of the builder you can reuse previous params values:
val page2: CounterpartyListPage = client.counterparties().list(CounterpartyListParams.builder()
    .from(params)
    .afterCursor("abc123...")
    .build())

// Or easily get params for the next page by using the helper `getNextPageParams`:
val page3: CounterpartyListPage = client.counterparties().list(params.getNextPageParams(page2))
```

See [Pagination](#pagination) below for more information on transparently working with lists of objects without worrying about fetching each page.

---

## Requests

### Parameters and bodies

To make a request to the Modern Treasury API, you generally build an instance of the appropriate `Params` class.

In [Example: creating a resource](#example-creating-a-resource) above, we used the `CounterpartyCreateParams.builder()` to pass to the `create` method of the `counterparties` service.

Sometimes, the API may support other properties that are not yet supported in the Kotlin SDK types. In that case, you can attach them using the `putAdditionalProperty` method.

```kotlin
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.CounterpartyCreateParams

val params: CounterpartyCreateParams = CounterpartyCreateParams.builder()
    // ... normal properties
    .putAdditionalProperty("secret_param", JsonValue.from("4242"))
    .build()
```

## Responses

### Response validation

When receiving a response, the Modern Treasury Kotlin SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Kotlin type. If you directly access the mistaken property, the SDK will throw an unchecked `ModernTreasuryInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```kotlin
import com.moderntreasury.api.models.Counterparty

val counterparty: Counterparty = client.counterparties().create().validate()
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```kotlin
import com.moderntreasury.api.core.JsonField
import java.util.Optional

val field: JsonField = responseObj._field

if (field.isMissing()) {
  // Value was not specified in the JSON response
} else if (field.isNull()) {
  // Value was provided as a literal null
} else {
  // See if value was provided as a string
  val jsonString: String? = field.asString();

  // If the value given by the API did not match the shape that the SDK expects
  // you can deserialise into a custom type
  val myObj: MyClass = responseObj._field.asUnknown()?.convert(MyClass.class)
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```kotlin
import com.moderntreasury.api.core.JsonValue

val secret: JsonValue = asyncResponse._additionalProperties().get("secret_field")
```

---

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`, which automatically handles fetching more pages for you:

### Synchronous

```kotlin
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyListPage

// As a Sequence:
client.counterparties().list(params).autoPager()
    .take(50)
    .forEach { counterparty -> print(counterparty) }
```

### Asynchronous

```kotlin
// As a Flow:
asyncClient.counterparties().list(params).autoPager()
    .take(50)
    .collect { counterparty -> print(counterparty) }
```

### Manual pagination

If none of the above helpers meet your needs, you can also manually request pages one-by-one. A page of results has a `data()` method to fetch the list of objects, as well as top-level `response` and other methods to fetch top-level data about the page. It also has methods `hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```kotlin
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyListPage

val page = client.counterparties().list(params)
while (page != null) {
    for (counterparty in page.items) {
        print(counterparty)
    }

    page = page.getNextPage()
}
```

---

## Error handling

This library throws exceptions in a single hierarchy for easy handling:

- **`ModernTreasuryException`** - Base exception for all exceptions

- **`ModernTreasuryServiceException`** - HTTP errors with a well-formed response body we were able to parse. The exception message and the `.debuggingRequestId()` will be set by the server.

  | 400    | BadRequestException           |
  | ------ | ----------------------------- |
  | 401    | AuthenticationException       |
  | 403    | PermissionDeniedException     |
  | 404    | NotFoundException             |
  | 422    | UnprocessableEntityException  |
  | 429    | RateLimitException            |
  | 5xx    | InternalServerException       |
  | others | UnexpectedStatusCodeException |

- **`ModernTreasuryIoException`** - I/O networking errors
- **`ModernTreasuryInvalidDataException`** - any other exceptions on the client side, e.g.:
  - We failed to serialize the request body
  - We failed to parse the response body (has access to response code and body)

## Network options

### Retries

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 408 Request Timeout, 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default. You can provide a `maxRetries` on the client builder to configure this:

```kotlin
import com.moderntreasury.api.client.ModernTreasuryClient
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient

val client: ModernTreasuryClient = ModernTreasuryOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build()
```

### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

```kotlin
import com.moderntreasury.api.client.ModernTreasuryClient
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import java.time.Duration

val client: ModernTreasuryClient = ModernTreasuryOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build()
```

### Proxies

Requests can be routed through a proxy. You can configure this on the client builder:

```kotlin
import com.moderntreasury.api.client.ModernTreasuryClient
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import java.net.InetSocketAddress
import java.net.Proxy

val client: ModernTreasuryClient = ModernTreasuryOkHttpClient.builder()
    .fromEnv()
    .proxy(Proxy(Proxy.Type.HTTP, InetSocketAddress("example.com", 8080)))
    .build()
```

## Logging

We use the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

You can enable logging by setting the environment variable `MODERN_TREASURY_LOG` to `info`.

```sh
$ export MODERN_TREASURY_LOG=info
```

Or to `debug` for more verbose logging.

```sh
$ export MODERN_TREASURY_LOG=debug
```

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/Modern-Treasury/modern-treasury-kotlin/issues) with questions, bugs, or suggestions.

## Requirements

This library requires Java 8 or later.
