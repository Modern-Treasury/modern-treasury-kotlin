# Modern Treasury Kotlin API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.moderntreasury.api/modern-treasury-kotlin)](https://central.sonatype.com/artifact/com.moderntreasury.api/modern-treasury-kotlin/6.2.0)
[![javadoc](https://javadoc.io/badge2/com.moderntreasury.api/modern-treasury-kotlin/6.2.0/javadoc.svg)](https://javadoc.io/doc/com.moderntreasury.api/modern-treasury-kotlin/6.2.0)

<!-- x-release-please-end -->

The Modern Treasury Kotlin SDK provides convenient access to the [Modern Treasury REST API](https://docs.moderntreasury.com) from applications written in Kotlin.

The Modern Treasury Kotlin SDK is similar to the Modern Treasury Java SDK but with minor differences that make it more ergonomic for use in Kotlin, such as nullable values instead of `Optional`, `Sequence` instead of `Stream`, and suspend functions instead of `CompletableFuture`.

<!-- x-release-please-start-version -->

The REST API documentation can be found on [docs.moderntreasury.com](https://docs.moderntreasury.com). KDocs are available on [javadoc.io](https://javadoc.io/doc/com.moderntreasury.api/modern-treasury-kotlin/6.2.0).

<!-- x-release-please-end -->

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.moderntreasury:modern-treasury-kotlin:6.2.0")
```

### Maven

```xml
<dependency>
  <groupId>com.moderntreasury</groupId>
  <artifactId>modern-treasury-kotlin</artifactId>
  <version>6.2.0</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```kotlin
import com.moderntreasury.api.client.ModernTreasuryClient
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyCreateParams

// Configures using the `MODERN_TREASURY_API_KEY`, `MODERN_TREASURY_ORGANIZATION_ID`, `MODERN_TREASURY_WEBHOOK_KEY` and `MODERN_TREASURY_BASE_URL` environment variables
val client: ModernTreasuryClient = ModernTreasuryOkHttpClient.fromEnv()

val params: CounterpartyCreateParams = CounterpartyCreateParams.builder()
    .name("my first counterparty")
    .build()
val counterparty: Counterparty = client.counterparties().create(params)
```

## Client configuration

Configure the client using environment variables:

```kotlin
import com.moderntreasury.api.client.ModernTreasuryClient
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient

// Configures using the `MODERN_TREASURY_API_KEY`, `MODERN_TREASURY_ORGANIZATION_ID`, `MODERN_TREASURY_WEBHOOK_KEY` and `MODERN_TREASURY_BASE_URL` environment variables
val client: ModernTreasuryClient = ModernTreasuryOkHttpClient.fromEnv()
```

Or manually:

```kotlin
import com.moderntreasury.api.client.ModernTreasuryClient
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient

val client: ModernTreasuryClient = ModernTreasuryOkHttpClient.builder()
    .apiKey("My API Key")
    .organizationId("my-organization-ID")
    .build()
```

Or using a combination of the two approaches:

```kotlin
import com.moderntreasury.api.client.ModernTreasuryClient
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient

val client: ModernTreasuryClient = ModernTreasuryOkHttpClient.builder()
    // Configures using the `MODERN_TREASURY_API_KEY`, `MODERN_TREASURY_ORGANIZATION_ID`, `MODERN_TREASURY_WEBHOOK_KEY` and `MODERN_TREASURY_BASE_URL` environment variables
    .fromEnv()
    .apiKey("My API Key")
    .build()
```

See this table for the available options:

| Setter           | Environment variable              | Required | Default value                      |
| ---------------- | --------------------------------- | -------- | ---------------------------------- |
| `apiKey`         | `MODERN_TREASURY_API_KEY`         | true     | -                                  |
| `organizationId` | `MODERN_TREASURY_ORGANIZATION_ID` | true     | -                                  |
| `webhookKey`     | `MODERN_TREASURY_WEBHOOK_KEY`     | false    | -                                  |
| `baseUrl`        | `MODERN_TREASURY_BASE_URL`        | true     | `"https://app.moderntreasury.com"` |

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

## Requests and responses

To send a request to the Modern Treasury API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Kotlin class.

For example, `client.counterparties().create(...)` should be called with an instance of `CounterpartyCreateParams`, and it will return an instance of `Counterparty`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```kotlin
import com.moderntreasury.api.client.ModernTreasuryClient
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyCreateParams

// Configures using the `MODERN_TREASURY_API_KEY`, `MODERN_TREASURY_ORGANIZATION_ID`, `MODERN_TREASURY_WEBHOOK_KEY` and `MODERN_TREASURY_BASE_URL` environment variables
val client: ModernTreasuryClient = ModernTreasuryOkHttpClient.fromEnv()

val params: CounterpartyCreateParams = CounterpartyCreateParams.builder()
    .name("my first counterparty")
    .build()
val counterparty: Counterparty = client.async().counterparties().create(params)
```

Or create an asynchronous client from the beginning:

```kotlin
import com.moderntreasury.api.client.ModernTreasuryClientAsync
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyCreateParams

// Configures using the `MODERN_TREASURY_API_KEY`, `MODERN_TREASURY_ORGANIZATION_ID`, `MODERN_TREASURY_WEBHOOK_KEY` and `MODERN_TREASURY_BASE_URL` environment variables
val client: ModernTreasuryClientAsync = ModernTreasuryOkHttpClientAsync.fromEnv()

val params: CounterpartyCreateParams = CounterpartyCreateParams.builder()
    .name("my first counterparty")
    .build()
val counterparty: Counterparty = client.counterparties().create(params)
```

The asynchronous client supports the same options as the synchronous one, except most methods are [suspending](https://kotlinlang.org/docs/coroutines-guide.html).

## File uploads

The SDK defines methods that accept files.

To upload a file, pass a [`Path`](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html):

```kotlin
import com.moderntreasury.api.models.Document
import com.moderntreasury.api.models.DocumentCreateParams
import java.nio.file.Paths

val params: DocumentCreateParams = DocumentCreateParams.builder()
    .documentableId("24c6b7a3-02...")
    .documentableType(DocumentCreateParams.DocumentableType.COUNTERPARTIES)
    .file(Paths.get("my/file.txt"))
    .build()
val document: Document = client.documents().create(params)
```

Or an arbitrary [`InputStream`](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html):

```kotlin
import com.moderntreasury.api.models.Document
import com.moderntreasury.api.models.DocumentCreateParams
import java.net.URL

val params: DocumentCreateParams = DocumentCreateParams.builder()
    .documentableId("24c6b7a3-02...")
    .documentableType(DocumentCreateParams.DocumentableType.COUNTERPARTIES)
    .file(URL("https://example.com/my/file.txt").openStream())
    .build()
val document: Document = client.documents().create(params)
```

Or a `ByteArray`:

```kotlin
import com.moderntreasury.api.models.Document
import com.moderntreasury.api.models.DocumentCreateParams

val params: DocumentCreateParams = DocumentCreateParams.builder()
    .documentableId("24c6b7a3-02...")
    .documentableType(DocumentCreateParams.DocumentableType.COUNTERPARTIES)
    .file("content".toByteArray())
    .build()
val document: Document = client.documents().create(params)
```

Note that when passing a non-`Path` its filename is unknown so it will not be included in the request. To manually set a filename, pass a [`MultipartField`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/core/Values.kt):

```kotlin
import com.moderntreasury.api.core.MultipartField
import com.moderntreasury.api.models.Document
import com.moderntreasury.api.models.DocumentCreateParams
import java.io.InputStream
import java.net.URL

val params: DocumentCreateParams = DocumentCreateParams.builder()
    .documentableId("24c6b7a3-02...")
    .documentableType(DocumentCreateParams.DocumentableType.COUNTERPARTIES)
    .file(MultipartField.builder<InputStream>()
        .value(URL("https://example.com/my/file.txt").openStream())
        .filename("my/file.txt")
        .build())
    .build()
val document: Document = client.documents().create(params)
```

## Raw responses

The SDK defines methods that deserialize responses into instances of Kotlin classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```kotlin
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyCreateParams

val params: CounterpartyCreateParams = CounterpartyCreateParams.builder()
    .name("my first counterparty")
    .build()
val counterparty: HttpResponseFor<Counterparty> = client.counterparties().withRawResponse().create(params)

val statusCode: Int = counterparty.statusCode()
val headers: Headers = counterparty.headers()
```

You can still deserialize the response into an instance of a Kotlin class if needed:

```kotlin
import com.moderntreasury.api.models.Counterparty

val parsedCounterparty: Counterparty = counterparty.parse()
```

## Error handling

The SDK throws custom unchecked exception types:

- [`ModernTreasuryServiceException`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/errors/ModernTreasuryServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                                     |
  | ------ | --------------------------------------------------------------------------------------------------------------------------------------------- |
  | 400    | [`BadRequestException`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/errors/UnexpectedStatusCodeException.kt) |

- [`ModernTreasuryIoException`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/errors/ModernTreasuryIoException.kt): I/O networking errors.

- [`ModernTreasuryInvalidDataException`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/errors/ModernTreasuryInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`ModernTreasuryException`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/errors/ModernTreasuryException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

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

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `MODERN_TREASURY_LOG` environment variable to `info`:

```sh
$ export MODERN_TREASURY_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export MODERN_TREASURY_LOG=debug
```

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`ModernTreasuryOkHttpClient`](modern-treasury-kotlin-client-okhttp/src/main/kotlin/com/moderntreasury/api/client/okhttp/ModernTreasuryOkHttpClient.kt) or [`ModernTreasuryOkHttpClientAsync`](modern-treasury-kotlin-client-okhttp/src/main/kotlin/com/moderntreasury/api/client/okhttp/ModernTreasuryOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a response.

To set a custom number of retries, configure the client using the `maxRetries` method:

```kotlin
import com.moderntreasury.api.client.ModernTreasuryClient
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient

val client: ModernTreasuryClient = ModernTreasuryOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build()
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```kotlin
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyCreateParams

val counterparty: Counterparty = client.counterparties().create(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
)
```

Or configure the default for all method calls at the client level:

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

To route requests through a proxy, configure the client using the `proxy` method:

```kotlin
import com.moderntreasury.api.client.ModernTreasuryClient
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import java.net.InetSocketAddress
import java.net.Proxy

val client: ModernTreasuryClient = ModernTreasuryOkHttpClient.builder()
    .fromEnv()
    .proxy(Proxy(
      Proxy.Type.HTTP, InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build()
```

### Custom HTTP client

The SDK consists of three artifacts:

- `modern-treasury-kotlin-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`ModernTreasuryClient`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/client/ModernTreasuryClient.kt), [`ModernTreasuryClientAsync`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/client/ModernTreasuryClientAsync.kt), [`ModernTreasuryClientImpl`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/client/ModernTreasuryClientImpl.kt), and [`ModernTreasuryClientAsyncImpl`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/client/ModernTreasuryClientAsyncImpl.kt), all of which can work with any HTTP client
- `modern-treasury-kotlin-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`ModernTreasuryOkHttpClient`](modern-treasury-kotlin-client-okhttp/src/main/kotlin/com/moderntreasury/api/client/okhttp/ModernTreasuryOkHttpClient.kt) and [`ModernTreasuryOkHttpClientAsync`](modern-treasury-kotlin-client-okhttp/src/main/kotlin/com/moderntreasury/api/client/okhttp/ModernTreasuryOkHttpClientAsync.kt), which provide a way to construct [`ModernTreasuryClientImpl`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/client/ModernTreasuryClientImpl.kt) and [`ModernTreasuryClientAsyncImpl`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/client/ModernTreasuryClientAsyncImpl.kt), respectively, using OkHttp
- `modern-treasury-kotlin`
  - Depends on and exposes the APIs of both `modern-treasury-kotlin-core` and `modern-treasury-kotlin-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`modern-treasury-kotlin` dependency](#installation) with `modern-treasury-kotlin-core`
2. Copy `modern-treasury-kotlin-client-okhttp`'s [`OkHttpClient`](modern-treasury-kotlin-client-okhttp/src/main/kotlin/com/moderntreasury/api/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`ModernTreasuryClientImpl`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/client/ModernTreasuryClientImpl.kt) or [`ModernTreasuryClientAsyncImpl`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/client/ModernTreasuryClientAsyncImpl.kt), similarly to [`ModernTreasuryOkHttpClient`](modern-treasury-kotlin-client-okhttp/src/main/kotlin/com/moderntreasury/api/client/okhttp/ModernTreasuryOkHttpClient.kt) or [`ModernTreasuryOkHttpClientAsync`](modern-treasury-kotlin-client-okhttp/src/main/kotlin/com/moderntreasury/api/client/okhttp/ModernTreasuryOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`modern-treasury-kotlin` dependency](#installation) with `modern-treasury-kotlin-core`
2. Write a class that implements the [`HttpClient`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/core/http/HttpClient.kt) interface
3. Construct [`ModernTreasuryClientImpl`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/client/ModernTreasuryClientImpl.kt) or [`ModernTreasuryClientAsyncImpl`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/client/ModernTreasuryClientAsyncImpl.kt), similarly to [`ModernTreasuryOkHttpClient`](modern-treasury-kotlin-client-okhttp/src/main/kotlin/com/moderntreasury/api/client/okhttp/ModernTreasuryOkHttpClient.kt) or [`ModernTreasuryOkHttpClientAsync`](modern-treasury-kotlin-client-okhttp/src/main/kotlin/com/moderntreasury/api/client/okhttp/ModernTreasuryOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```kotlin
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.CounterpartyCreateParams

val params: CounterpartyCreateParams = CounterpartyCreateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build()
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/core/Values.kt) object to its setter:

```kotlin
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.CounterpartyCreateParams

val params: CounterpartyCreateParams = CounterpartyCreateParams.builder()
    .name(JsonValue.from(42))
    .build()
```

The most straightforward way to create a [`JsonValue`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/core/Values.kt) is using its `from(...)` method:

```kotlin
import com.moderntreasury.api.core.JsonValue

// Create primitive JSON values
val nullValue: JsonValue = JsonValue.from(null)
val booleanValue: JsonValue = JsonValue.from(true)
val numberValue: JsonValue = JsonValue.from(42)
val stringValue: JsonValue = JsonValue.from("Hello World!")

// Create a JSON array value equivalent to `["Hello", "World"]`
val arrayValue: JsonValue = JsonValue.from(listOf(
  "Hello", "World"
))

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
val objectValue: JsonValue = JsonValue.from(mapOf(
  "a" to 1, "b" to 2
))

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
val complexValue: JsonValue = JsonValue.from(mapOf(
  "a" to listOf(
    1, 2
  ), "b" to listOf(
    3, 4
  )
))
```

Normally a `Builder` class's `build` method will throw [`IllegalStateException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html) if any required parameter or property is unset.

To forcibly omit a required parameter or property, pass [`JsonMissing`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/core/Values.kt):

```kotlin
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.models.CounterpartyCreateParams

val params: CounterpartyCreateParams = CounterpartyCreateParams.builder()
    .name(JsonMissing.of())
    .build()
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```kotlin
import com.moderntreasury.api.core.JsonBoolean
import com.moderntreasury.api.core.JsonNull
import com.moderntreasury.api.core.JsonNumber
import com.moderntreasury.api.core.JsonValue

val additionalProperties: Map<String, JsonValue> = client.counterparties().create(params)._additionalProperties()
val secretPropertyValue: JsonValue = additionalProperties.get("secretProperty")

val result = when (secretPropertyValue) {
    is JsonNull -> "It's null!"
    is JsonBoolean -> "It's a boolean!"
    is JsonNumber -> "It's a number!"
    // Other types include `JsonMissing`, `JsonString`, `JsonArray`, and `JsonObject`
    else -> "It's something else!"
}
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```kotlin
import com.moderntreasury.api.core.JsonField

val name: JsonField<String> = client.counterparties().create(params)._name()

if (name.isMissing()) {
  // The property is absent from the JSON response
} else if (name.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  val jsonString: String? = name.asString();

  // Try to deserialize into a custom type
  val myObject: MyClass = name.asUnknown()!!.convert(MyClass::class.java)
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`ModernTreasuryInvalidDataException`](modern-treasury-kotlin-core/src/main/kotlin/com/moderntreasury/api/errors/ModernTreasuryInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```kotlin
import com.moderntreasury.api.models.Counterparty

val counterparty: Counterparty = client.counterparties().create(params).validate()
```

Or configure the method call to validate the response using the `responseValidation` method:

```kotlin
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyCreateParams

val counterparty: Counterparty = client.counterparties().create(
  params, RequestOptions.builder().responseValidation(true).build()
)
```

Or configure the default for all method calls at the client level:

```kotlin
import com.moderntreasury.api.client.ModernTreasuryClient
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient

val client: ModernTreasuryClient = ModernTreasuryOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build()
```

## FAQ

### Why don't you use plain `enum` classes?

Kotlin `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/Modern-Treasury/modern-treasury-kotlin/issues) with questions, bugs, or suggestions.
