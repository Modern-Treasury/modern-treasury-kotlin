# Changelog

## 2.18.0 (2024-08-21)

Full Changelog: [v2.17.0...v2.18.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.17.0...v2.18.0)

### Features

* **api:** add wells fargo reference number types ([#200](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/200)) ([b7efc13](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b7efc1336c7ecf3dd3adf712abef068c8b820a2d))


### Bug Fixes

* **docs:** use correct putAdditionalProperty value ([#202](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/202)) ([56456d0](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/56456d071a5507d4b71b18fd02ff68151a200539))

## 2.17.0 (2024-08-13)

Full Changelog: [v2.16.0...v2.17.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.16.0...v2.17.0)

### Features

* **api:** add pagination params 'created at' and 'updated at' ([#197](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/197)) ([95fcab9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/95fcab91b90fb7aa8aeab565448096a61fccfd72))
* **api:** updates ([#199](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/199)) ([7a64edf](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/7a64edf1d58eef16e56476d8365748402dc0ab06))
* **client:** improve binary return values ([#195](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/195)) ([4049778](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/40497786014f35af37636037a1b76a743dda8132))


### Chores

* **ci:** bump prism mock server version ([#198](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/198)) ([8f885aa](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8f885aa1e4de604b5f41e6c3b4fed5bf98190d74))
* **ci:** limit release doctor target branches ([#191](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/191)) ([494ca06](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/494ca0660cb6527f8f6bdccc85d333fe41babf30))
* **ci:** run tests in CI ([#196](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/196)) ([fbf2896](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/fbf2896cb6fedf853121e0aedf60ba9eb729f92c))
* **internal:** remove unused test file ([#194](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/194)) ([936258c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/936258cd9a054053e61c794d71b9830115848f2f))
* **tests:** update prism version ([#193](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/193)) ([43fd6bf](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/43fd6bf95d3e8b5adb3341ebd24512d029b35608))

## 2.16.0 (2024-07-15)

Full Changelog: [v2.15.1...v2.16.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.15.1...v2.16.0)

### Features

* **api:** updates ([#189](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/189)) ([4954613](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4954613bb0c55a6e7addbc386f7c704731d83511))


### Chores

* **ci:** also run workflows for PRs targeting `next` ([#186](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/186)) ([86013ea](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/86013eabda25c082ce49eaba56db68f2907fc92f))
* **docs:** minor update to formatting of API link in README ([#190](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/190)) ([147b0b7](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/147b0b7cbfffcbace07a7330d04273fd0a5c50cc))


### Documentation

* **examples:** update example values ([#188](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/188)) ([f6f79dd](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f6f79ddd8c76e43e46f236aa9e2ccaf0c66fba68))

## 2.15.1 (2024-07-10)

Full Changelog: [v2.15.0...v2.15.1](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.15.0...v2.15.1)

### Chores

* **docs:** document minimum Java version (Java 8) in README ([#184](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/184)) ([a9eb7cd](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a9eb7cd41b7c17d54cbcf75c1ccf20804c7c87ad))

## 2.15.0 (2024-07-01)

Full Changelog: [v2.14.0...v2.15.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.14.0...v2.15.0)

### Features

* **api:** add kr_brn kr_crn kr_rrn enum values ([#177](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/177)) ([929b060](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/929b060c1e1a9202905e34eab2a184dd8e06c7ec))
* **api:** add risk rating field ([#178](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/178)) ([d9455a1](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d9455a16112e91c614ffb06486d294741dc43219))
* **api:** updates ([#183](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/183)) ([bf14c8a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/bf14c8aad845dc98ec3a6d358908f7ab531e7bf0))
* **client:** add support for `putQueryParam` on `ClientOptions` ([#181](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/181)) ([4fd26bd](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4fd26bdd6d91389043e6cd3a5218dbe945a31720))


### Bug Fixes

* fix enum type to be non nullable ([#180](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/180)) ([d56c560](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d56c560623cf871bdaf43c9e37894f20611c493a))


### Chores

* gitignore test server logs ([#182](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/182)) ([c985d55](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c985d55bbefa5ca72b118ea96054794cf25e99cb))
* **internal:** add code reviewer ([#175](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/175)) ([fa1567a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/fa1567a78941af28db4d835ea78470e465243954))
* **internal:** sync urls ([#179](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/179)) ([2abbf8a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/2abbf8ac4fbfc4ef7b0517e5b341131d3f84b438))

## 2.14.0 (2024-05-28)

Full Changelog: [v2.13.0...v2.14.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.13.0...v2.14.0)

### Features

* **api:** add currency to ledger account categories ([#171](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/171)) ([3b14a1c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3b14a1c8fdb1ed175c1522c694184bfdda9526bc))
* **api:** invoice overdue reminders ([aea03ef](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/aea03efc2a99c0da8f7cec24ac5ec59cd42d9c51))
* **api:** mark ConnectionLegalEntity response properties as required ([#173](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/173)) ([a23854a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a23854a984a77e2073a98671513c9c8cd94583f6))
* **api:** remove deprecated ledger account payouts ([#172](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/172)) ([aea03ef](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/aea03efc2a99c0da8f7cec24ac5ec59cd42d9c51))
* **api:** updates ([#165](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/165)) ([b974879](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b97487987aa4765f26c7faa47ae438912ad50cb1))
* **api:** various API updates ([#160](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/160)) ([772e345](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/772e345810d1d5e82ca482b99d00030f2f41c1a4))
* propagate resource description field from stainless config to SDK docs ([#167](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/167)) ([6b14459](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6b144592cc0d75b30e9edfe4a016a9276f25a09d))


### Bug Fixes

* **client:** do not strip date-time 00 seconds when getQueryParams() is called ([#161](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/161)) ([a3a2332](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a3a23325874c6557c8a6876f9dd16f0c295a918f))


### Chores

* **docs:** add SECURITY.md ([#168](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/168)) ([50419c1](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/50419c1225c4112b311aae6852b4486b5f1e987b))
* **docs:** streamline payment purpose and vendor failure handling ([#169](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/169)) ([89fb3e4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/89fb3e4cb1544b46ddfd63f364309cdd26549fc2))
* **internal:** add dev scripts ([#174](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/174)) ([c6f6875](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c6f6875c7b73cf92c682e0eff6f15c6e9847da90))
* **internal:** add link to openapi spec ([#162](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/162)) ([46e75e7](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/46e75e73868ea6c0290e8915faa142e8a7fd66bb))
* **internal:** add scripts-to-rule-them-all ([#170](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/170)) ([ce2fbc6](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/ce2fbc6e844749df39f385ed40e2caa1a8d519a4))
* **internal:** add scripts/mock ([#163](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/163)) ([c317e48](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c317e48fdd4ef6e117c9514dedf5d8557770978b))
* **internal:** bump mock server version to ~5.8.0 ([#164](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/164)) ([7399951](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/7399951f5f541efcc2da90f22cf4505cc6471f79))
* **internal:** gradlew v8.7, use gradle task config avoidance APIs ([#157](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/157)) ([e1660e2](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e1660e29c0a4b2cd5a9496a96b44e41f8c23d97b))
* **internal:** use actions/checkout@v4 for codeflow ([#159](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/159)) ([20838b6](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/20838b6eba500d098cac7780d3043a052933908e))

## 2.13.0 (2024-04-21)

Full Changelog: [v2.12.0...v2.13.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.12.0...v2.13.0)

### Features

* **api:** add ledger_transaction_id field to reversal ([#155](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/155)) ([29f6174](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/29f617483b7aac71429ad741ab98dd0305c1914e))
* **client:** implement support for multipart/form-data body requests ([#152](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/152)) ([ef3db8b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/ef3db8b1236dabb5de7d01177cb8f53914ac3395))


### Chores

* **ci:** validate Gradle wrapper ([#156](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/156)) ([48ff372](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/48ff37263b20ff66a4d156b32e48066b451ec68b))
* **internal:** formatting ([#153](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/153)) ([a39d7a1](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a39d7a137bdb8629d1d75d788bc76604ce86ad07))


### Documentation

* **examples:** use counterparties in snippets ([#150](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/150)) ([d5ca6ce](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d5ca6ce77249cc0a192dc78b18d0faf1541f34d8))


### Build System

* configure UTF-8 locale in devcontainer ([#154](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/154)) ([7154287](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/7154287e9d31dd6da6bf7508d0deedff9be6db00))

## 2.12.0 (2024-04-09)

Full Changelog: [v2.11.0...v2.12.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.11.0...v2.12.0)

### Features

* **api:** add id type in_lei ([#148](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/148)) ([6a533e7](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6a533e786c777acf6ff3d9d69a0dbdae253e6a1f))
* **api:** update account number type enum ([#142](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/142)) ([996e7d4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/996e7d45922c8cefb4de82d7f865f9bd392edf23))


### Chores

* **deps:** update jackson to v2.14.3 ([#144](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/144)) ([c5edf39](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c5edf39bf0fcb4d54e2bcf0ea88e5a48bdbe970d))
* **deps:** update junit5 to v5.9.3 ([#146](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/146)) ([6bcc7fd](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6bcc7fd85a85ef7996c32ea7965c3d8ebf901db6))
* **deps:** update kotlin-gradle-plugin to v1.9.23 ([#145](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/145)) ([8df62b7](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8df62b791e0ea8221797c52b618ab94707a6e960))
* **deps:** update kotlinx-coroutines-core to v1.8.0 ([#147](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/147)) ([699f561](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/699f561c52bd834a0a308dfee723afac5fd753a8))
* **tests:** import wiremock.client.WireMock.put ([#149](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/149)) ([3047524](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3047524fad00755d32ed29ee74dec72d8bc98a6a))

## 2.11.0 (2024-03-26)

Full Changelog: [v2.10.0...v2.11.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.10.0...v2.11.0)

### Features

* add HttpRequestBody.contentLength() ([#133](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/133)) ([8d03d2c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8d03d2c39e6b58e75f4f40fa2b2da92a48364115))
* **api:** add citibank enums ([#139](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/139)) ([0006fde](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0006fdee4e101226644647721be07a45a7ec388e))
* **api:** add date_formed property to legal entities ([#131](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/131)) ([4239b76](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4239b76a8cc523d52b0c5aa6bf716f2032e57600))
* **api:** add line item metadata ([4fc10db](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4fc10dbb9074cc59bdeb0260337c0af4be688636))
* **api:** extend list invoices query params ([#134](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/134)) ([85118ef](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/85118ef0e8e0ee871cb8d04b0f90b449c2062621))
* **api:** introduce bulk transaction create ([#137](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/137)) ([4fc10db](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4fc10dbb9074cc59bdeb0260337c0af4be688636))
* **api:** rename `associated_legal_entity` to `child_legal_entity` ([#135](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/135)) ([16cdeff](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/16cdeff7ea634670953da94bc0c2c38758a1695a))
* **api:** rename `id_type` enum from `cl_nut` to `cl_rut` ([16cdeff](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/16cdeff7ea634670953da94bc0c2c38758a1695a))
* **api:** updates ([#138](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/138)) ([48020dc](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/48020dc1ca9e09ed4ab9abed634e23fb6dc99f3a))


### Chores

* add back removed code ([8424e94](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8424e94b378c248b07712ba36da56eb9ea565641))
* **internal:** temporary commit ([#140](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/140)) ([d673027](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d6730276c11536bbc4dd7fb1484263d2c73ed6f8))


### Documentation

* **readme:** consistent use of sentence case in headings ([#136](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/136)) ([9d46fdf](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9d46fdfa3a4a7e0bf261cfaa0112bf3922536550))

## 2.10.0 (2024-03-05)

Full Changelog: [v2.9.0...v2.10.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.9.0...v2.10.0)

### Features

* **api:** add legal_structure enum member ([#128](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/128)) ([515d31c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/515d31c951e7b621b170b6d8eb638da1b3400edf))


### Chores

* add api.md ([#130](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/130)) ([8fe41fb](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8fe41fbebafb31bb228ce5cd764af5781c3b5deb))

## 2.9.0 (2024-02-29)

Full Changelog: [v2.8.0...v2.9.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.8.0...v2.9.0)

### Features

* **api:** add legal_entities resource ([#127](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/127)) ([115738d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/115738d2fc2abca10a3e92e0b3c2605bd013e476))
* **api:** added foreign exchange rate information ([#115](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/115)) ([b71184b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b71184b0a6b5f1212ab1452b480103b51657a9e8))


### Chores

* **ci:** update actions/setup-java action to v4 ([#121](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/121)) ([cb39752](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/cb397520b2ed877a13bb3214b4f5646e4e571693))
* **ci:** uses Stainless GitHub App for releases ([#111](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/111)) ([8b88e71](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8b88e71920c80cbb8fc58fd682cfdf9377707227))
* **internal:** refactor release environment script ([#113](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/113)) ([65b9074](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/65b907418544fc57ef7ce9f8ab616ccbc6843efc))
* **internal:** update deps ([#119](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/119)) ([5b0a6d3](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/5b0a6d38cc60f30b2f95fe774808bf78b5c2c2cc))
* update dependency com.diffplug.spotless:spotless-plugin-gradle to v6.25.0 ([#123](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/123)) ([a5cf1e5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a5cf1e57017c17662e775995c43b23e531640f3c))
* update dependency com.github.tomakehurst:wiremock-jre8 to v2.35.2 ([#126](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/126)) ([c35f291](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c35f29175084128aae65cdce06d404c733255cc7))
* update dependency com.google.guava:guava to v33 ([#124](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/124)) ([49b23b4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/49b23b499549fe71169636a6407737fa574b0e53))
* update dependency com.squareup.okhttp3:okhttp to v4.12.0 ([#122](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/122)) ([64e90c3](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/64e90c37c1cafcb9ffc7a4b299a88d8c09de64c2))
* update dependency org.apache.httpcomponents.client5:httpclient5 to v5.3.1 ([#120](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/120)) ([ce543cb](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/ce543cbe593a3dd6404092e55bee6fce12420859))
* update dependency org.apache.httpcomponents.core5:httpcore5 to v5.2.4 ([#116](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/116)) ([3c0fb0a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3c0fb0af48fd7e4874ad10ec24c0c1c6820c1586))
* update dependency org.assertj:assertj-guava to v3.25.3 ([#118](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/118)) ([314f053](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/314f0531572d0ec590609637c2fc16e33d599ab1))
* update dependency org.slf4j:slf4j-simple to v1.7.36 ([#117](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/117)) ([8782308](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/87823086eb710bb9ba2e3ed4301423d7e5eaee30))
* update dependency org.slf4j:slf4j-simple to v2 ([#125](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/125)) ([1bf8a11](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/1bf8a11e6303c2c5dcc337d87ad10fa4c458d977))

## 2.8.0 (2024-02-13)

Full Changelog: [v2.7.1...v2.8.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.7.1...v2.8.0)

### Features

* **api:** updates ([#109](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/109)) ([16d8280](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/16d828011032940705750e68aff8fee0e9b21805))
* **api:** updates parameters, error codes ([#106](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/106)) ([ec0470d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/ec0470dfa8f74a7337a913350beff253948cdf85))


### Bug Fixes

* **docs:** wrong client import in readme usage example ([#110](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/110)) ([6332461](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/633246138f75f30b2f05bfa13457a8a17f47c09b))
* **pagination:** correct hasNextPage check ([#107](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/107)) ([54bacb3](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/54bacb366fe416d033539ce573280dbaec4fa977))


### Chores

* **interal:** make link to api.md relative ([#108](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/108)) ([5976287](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/59762872d3a060a2eb109bd486b94fc21a9c109d))
* **internal:** support pre-release versioning ([#104](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/104)) ([0d28c33](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0d28c331fefeda7a798a0faf286a51ef4e903ed1))

## 2.7.1 (2024-01-30)

Full Changelog: [v2.7.0...v2.7.1](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.7.0...v2.7.1)

### Bug Fixes

* **ci:** ignore stainless-app edits to release PR title ([#103](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/103)) ([8487c6c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8487c6c7caf8275e4b72ba5bf0726c88e04d188d))


### Chores

* **internal:** speculative retry-after-ms support ([#101](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/101)) ([895542a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/895542ac7762c638983f38cf5145b7d2584e1c3a))

## 2.7.0 (2024-01-16)

Full Changelog: [v2.6.0...v2.7.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.6.0...v2.7.0)

### Features

* **api:** add `ledger_transactions` to expected payment request ([#95](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/95)) ([6da6adf](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6da6adfeb434f6283dfb22bc7137fb003576622a))
* **api:** add create and delete operations for internal accounts balance reports ([#99](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/99)) ([1d4d2d5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/1d4d2d58abab5d788d9a89b8cd09b0e25aab15fd))


### Chores

* add .keep files for examples and custom code directories ([#97](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/97)) ([f2b05a4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f2b05a4c4d96db63527e7032f32a049e2472ba25))
* **internal:** minor improvements to auth code ([#98](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/98)) ([bf0acc5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/bf0acc5df99ab3b47852b091a46b30deede38eea))


### Documentation

* **readme:** improve api reference ([#100](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/100)) ([541d2f3](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/541d2f32352b189bcced0de9bc910a663c5b8f31))

## 2.6.0 (2024-01-02)

Full Changelog: [v2.5.0...v2.6.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.5.0...v2.6.0)

### Features

* **api:** remove reversed and reversing ledger account status type ([#93](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/93)) ([2d29bf5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/2d29bf5f0274294048d2247c414b7b118584c802))


### Chores

* **ci:** run release workflow once per day ([#91](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/91)) ([5342a3b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/5342a3b9ea8dd0d4395413263cefca2d391a984e))
* **internal:** bump license ([#94](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/94)) ([a360f01](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a360f0137d55dcbd91facde65d7ca962cda22aea))

## 2.5.0 (2023-12-08)

Full Changelog: [v2.4.1...v2.5.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.4.1...v2.5.0)

### Features

* **api:** updates ([#90](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/90)) ([5299328](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/529932864fe3d8425b792e26aa0629004d5b8ede))

## 2.4.1 (2023-12-04)

Full Changelog: [v2.4.0...v2.4.1](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.4.0...v2.4.1)

## 2.4.0 (2023-11-21)

Full Changelog: [v2.3.0...v2.4.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.3.0...v2.4.0)

### Features

* **api:** updates ([#84](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/84)) ([88848fc](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/88848fc9049db20dd32070e428c71fcf9003378d))

## 2.3.0 (2023-11-10)

Full Changelog: [v2.2.0...v2.3.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.2.0...v2.3.0)

### Features

* **api:** add dk_interbank_clearing_code and dk_nets enum members ([#82](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/82)) ([b93796e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b93796e5c4a714aef82acf3946c2630707ad6da1))
* **api:** updates ([#80](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/80)) ([3d68407](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3d68407ac618f07c0a03c1160ec38e678cabffb9))


### Chores

* **internal:** skip bulk requests tests ([#83](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/83)) ([d4a4c57](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d4a4c577fc61fcdeb9a88090431834500852dac6))

## 2.2.0 (2023-11-05)

Full Changelog: [v2.1.0...v2.2.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.1.0...v2.2.0)

### Features

* **client:** allow binary returns ([#77](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/77)) ([6739408](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/673940897a1793a93d90d0c150c2053272903bcd))


### Chores

* remove bad tests ([#79](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/79)) ([d70490e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d70490e3ef399950c9f8f8386d4472d9436a6695))

## 2.1.0 (2023-10-31)

Full Changelog: [v2.0.0...v2.1.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.0.0...v2.1.0)

### Features

* **api:** updates ([#75](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/75)) ([4a23577](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4a235778a69887c051cb5f4eff8d39976c8526fd))
* **github:** include a devcontainer setup ([#76](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/76)) ([348327a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/348327a4007861f9de8d9b49ee558e3395651b3c))

## 2.0.0 (2023-10-24)

Full Changelog: [v1.6.1...v2.0.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v1.6.1...v2.0.0)

### ⚠ BREAKING CHANGES

* **types:** consolidate direction enums into a shared TransactionDirection type ([#66](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/66))

### Features

* **api:** updates ([#70](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/70)) ([96cdff6](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/96cdff6a804aa5d1a55046ebbfa3f5df97b412cd))
* **client:** adjust retry behavior ([#71](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/71)) ([9b4f8a9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9b4f8a928dbf5b0e06254c07e95496216f9a8105))
* make webhook headers case insensitive ([#65](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/65)) ([96ffb1a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/96ffb1a28bbe17031b5a0a48d25055eb64484766))
* **types:** consolidate direction enums into a shared TransactionDirection type ([#66](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/66)) ([1c038d5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/1c038d5a7bf54ab1e77610a3f30bb364ade40d40))


### Bug Fixes

* **api:** use date-time for effective_at ([#69](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/69)) ([2e103ca](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/2e103caefc40a2a74367fd033ec5f2911b4f0d26))
* update maven group id in README ([#63](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/63)) ([01666b6](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/01666b685039ffb0426263410ee0a780e7da3c3a))


### Chores

* **internal:** minor reformatting ([#62](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/62)) ([0f24a86](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0f24a8694de582bb0959d539d86f732367cae2d8))
* **internal:** rearrange client arguments ([#60](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/60)) ([286e005](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/286e0057d4fbfe4943174fc691b33c1d4ec5a09f))
* show deprecation notice on interfaces ([#59](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/59)) ([46cab99](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/46cab9989b5ed8077c93fd9ca96b5e6a9cb4401f))


### Documentation

* organisation -&gt; organization (UK to US English) ([#67](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/67)) ([d727b9f](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d727b9fe2a61a36ea1e642cf7de43088ac0895af))

## 1.6.1 (2023-10-04)

Full Changelog: [v1.6.0...v1.6.1](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v1.6.0...v1.6.1)

### Chores

* **internal:** add a top-level generated comment to each file ([#58](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/58)) ([0b2aa37](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0b2aa37828d2ebe200e26ffd2536bb1be9b81ed6))

## 1.6.0 (2023-10-02)

Full Changelog: [v1.5.2...v1.6.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v1.5.2...v1.6.0)

### Features

* **api:** updates ([#54](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/54)) ([0aba90d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0aba90df348ee03aa0ccc213480763805ddbafb8))
* **client:** retry on 408 Request Timeout ([#51](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/51)) ([4593e81](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4593e81f841acb578c05070faeed32921a01ef52))

## 1.5.2 (2023-08-31)

Full Changelog: [v1.5.1...v1.5.2](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v1.5.1...v1.5.2)

## 1.5.1 (2023-08-28)

Full Changelog: [v1.5.0...v1.5.1](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v1.5.0...v1.5.1)

### Bug Fixes

* set correct timeouts on okhttp client ([#40](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/40)) ([fc18cac](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/fc18cac79158c55150cfa21b15dda8cf9c63b042))


### Chores

* **ci:** setup workflows to create releases and release PRs ([#44](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/44)) ([6f1567e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6f1567e35b6562a2d0a81213d9214a5d6d79eb8f))
* **internal:** minor code re-ordering ([#43](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/43)) ([e729d4e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e729d4e2c8a0f42b26ede17025fb7fc2033b37bc))

## [1.5.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v1.4.0...v1.5.0) (2023-08-15)


### Features

* **api:** support multiple `id`s in `ledger` `retrieve`/`list` endpoints ([#35](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/35)) ([212d5a0](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/212d5a0fa030c25308cd137a864e0575ca7786e7))
* default timeout is set for java clients ([#36](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/36)) ([daafcb5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/daafcb5b24b4fdce6b34cd655566cb9414989811))
* generate addXxx methods for array types ([#38](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/38)) ([6ad9a81](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6ad9a81bae627d417b3a066572c4bca9ecd12b86))


### Documentation

* **readme:** remove beta status + document versioning policy ([#33](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/33)) ([26efb88](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/26efb88563dac55eb8e87983fa7b8bdaab037415))


### Chores

* assign default reviewers to release PRs ([#37](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/37)) ([dae5dad](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/dae5dad262ae1c4e409320f488f6cfc0e24b3b53))
* **internal:** reorganize types ([#31](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/31)) ([3b4a624](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3b4a6248fcd9a53f5fd4f00e4b72da63298882eb))

## [1.4.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v1.3.0...v1.4.0) (2023-08-03)


### Features

* **api:** updates ([#26](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/26)) ([b8a6071](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b8a6071fea653bbebb3811aa6383d2ccdfb43105))


### Chores

* **ci:** allow release to proceed without signing key id secret ([#29](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/29)) ([da25c9a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/da25c9aea809c863d396628fba31630c9e8b6568))

## [1.3.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v1.2.0...v1.3.0) (2023-08-03)


### Features

* **api:** add `metadata` in several places it was missing; add `description` ([#20](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/20)) ([1b83131](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/1b8313160e71f34ed3d4f6bddd92ec85437b3af9))


### Chores

* **internal:** publish with --stacktrace for more helpful error information ([#23](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/23)) ([adca74e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/adca74ec0a63be41a47c563250aadd25adc77b52))
* **internal:** set maven group id to com.moderntreasury ([#22](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/22)) ([ecca73f](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/ecca73f4a5bd76981e11aa64d2a3b3ed42a2b0d4))
* **internal:** support passing GPG_SIGNING_KEY_ID from secrets ([#24](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/24)) ([6f5fcca](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6f5fcca8f1ff7e858d368a9e528aa55afe186989))

## [1.2.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v1.1.0...v1.2.0) (2023-08-02)


### Features

* **api:** updates ([#14](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/14)) ([7c7600f](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/7c7600f9382ca55698127e65638d359e1745650d))
* **test:** unskip file uploads tests ([#19](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/19)) ([5922066](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/592206624d6cb5677b9dd96cf65a19739c5a370b))


### Chores

* **internal:** change Sonatype host to oss.sonatype.org ([#17](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/17)) ([0c5f55c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0c5f55c913ad0b8bc63a801635cd4ac9c53b28bb))

## [1.1.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v0.0.1...v1.1.0) (2023-07-27)

### ⚠ BREAKING CHANGES

- **types:** rename account connection flow to account collection flow ([#9](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/9))
- **api:** update parameters for virtual account create request ([#5](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/5))

### Features

- **api:** update parameters for virtual account create request ([#5](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/5)) ([3f00568](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3f00568d1cd48ca870d5c0286d516e953cb25bd0))
- **api:** updates ([#11](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/11)) ([3a8a0bb](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3a8a0bb1b45e0f41384c61b9305ee91fddaa0f43))
- **ci:** add a publish-sonatype workflow for manual running ([#12](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/12)) ([d1e3229](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d1e3229a94d81b2d10483c1b2c685a43a4e1d8ed))

### Bug Fixes

- **api:** add response body to `get /api/virtual_accounts` and update resources ([#3](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/3)) ([c4034e0](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c4034e0faeebc08aabfd7cbedb5cc521436a6b29))
- auto-close responses even if an exception is thrown during deserialization ([9d023d7](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9d023d751e54cc4376f99f41090ab53d4fb917b9))

### Chores

- **internal:** minor reformatting ([#4](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/4)) ([18284ad](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/18284ade50d6a13b629c6bb106c087c21a1b68d4))
- **internal:** minor reformatting + remove internal examples classes ([#1](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/1)) ([71dc8f2](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/71dc8f237451f7e9d5996d07708445807e3051f7))

### Refactors

- **types:** rename account connection flow to account collection flow ([#9](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/9)) ([50ee109](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/50ee10924b16ce57f26b45553a109c74e31406e8))
