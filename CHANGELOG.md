# Changelog

## 7.19.0 (2026-01-30)

Full Changelog: [v7.18.1...v7.19.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.18.1...v7.19.0)

### Features

* **api:** api update ([ba44df7](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/ba44df7f084fcf330f6d485823beb9fef681d827))
* **api:** api update ([c7a37c0](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c7a37c0e8527e314d7a35b7bb53be6977fdc48a6))
* **client:** send `X-Stainless-Kotlin-Version` header ([e940bc5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e940bc51d6b004b37428c635b122c007d50875d7))


### Bug Fixes

* **client:** disallow coercion from float to int ([c093127](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c093127c5b199e9391cfd235d1d190b4637222cd))
* **client:** fully respect max retries ([22157c4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/22157c49b051156fc734acca5f9a7dbbad52fca0))
* **client:** preserve time zone in lenient date-time parsing ([7d73e0e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/7d73e0e732fecaa0d670a8f83617553cf8dbfcf9))
* **client:** send retry count header for max retries 0 ([22157c4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/22157c49b051156fc734acca5f9a7dbbad52fca0))
* date time deserialization leniency ([8c3d80d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8c3d80dcc67268e74c49cf1a527f799200f19c0e))
* **docs:** fix mcp installation instructions for remote servers ([92780e5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/92780e5d3a6fb66d8eb13fa516a3abbe723010c2))


### Chores

* **ci:** upgrade `actions/setup-java` ([8e26134](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8e2613417898f14d5978e4d92e250a1a6911ee9c))
* **client:** improve example values ([3178e85](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3178e85eccef9250dacdec925a500f86c493d928))
* **internal:** allow passing args to `./scripts/test` ([4b13327](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4b133272c773dbfcc65dc72716e43a621cf67334))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([44a023d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/44a023d428692b15478e1c87a977cc628cc1cb48))
* **internal:** depend on packages directly in example ([22157c4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/22157c49b051156fc734acca5f9a7dbbad52fca0))
* **internal:** update `actions/checkout` version ([b9bacba](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b9bacbaa4c4da1f97e1561d4dd75dcad0e5c8bab))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/3240) in tests ([8c3d80d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8c3d80dcc67268e74c49cf1a527f799200f19c0e))


### Documentation

* add comment for arbitrary value fields ([b8869d9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b8869d95c9c43642e755fcb00fb2db032c09e857))

## 7.18.1 (2026-01-14)

Full Changelog: [v7.18.0...v7.18.1](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.18.0...v7.18.1)

## 7.18.0 (2026-01-13)

Full Changelog: [v7.17.0...v7.18.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.17.0...v7.18.0)

### Features

* **api:** api update ([174bf90](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/174bf9044c366247d9f140a2861693c18b287524))
* **api:** api update ([3bb5118](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3bb511846de50418bfdae41bc7d90ed5765cb8cd))
* **api:** api update ([9d123c5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9d123c5bfef6a10c51a6b44cf3d50c9315ee73d4))
* **api:** api update ([fd86b52](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/fd86b525e66c7310907c1463f9749f06b1f5564a))
* **api:** api update ([885b4ca](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/885b4ca63b12a97f78cb68654121cef7cf717e34))
* **api:** api update ([12e6021](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/12e6021dbebdc3ee72e825036c5ba9d41307514e))
* **api:** api update ([921a6af](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/921a6af46d6859c85023ff9f2778f98b5aff136b))
* **api:** api update ([89627d4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/89627d438058cd9a7d72a9d4f9effcf1acf48893))
* **api:** manual updates ([f988226](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f988226790e9bd75e94516ad12fb59ef560e687c))
* **api:** manual updates ([b5c6297](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b5c6297c3b0967860fa45f3916b404f3062224bf))
* **api:** manual updates ([f69b2cd](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f69b2cdbcab69c85abc20b98441490f7a3cd9a2f))
* **api:** manual updates ([175b3e7](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/175b3e7265a78da18e0613ac9abb59c21d034260))
* **api:** manual updates ([737e3b9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/737e3b9ba9732f6e2bdb8b0b43688ca64090ddb1))
* **api:** manual updates ([abdb07b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/abdb07b62ba81492a6cdfb5e7f9ba619500d6773))
* **client:** add `HttpRequest#url()` method ([0797d0f](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0797d0f0d4da6f5abdf7770dd63e442e94e2f1b8))
* **client:** allow configuring dispatcher executor service ([ea8a829](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/ea8a829a8127ece5a94023152fb25420a4aa6c4c))


### Bug Fixes

* **client:** multi-value header serialization ([54005ae](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/54005ae410fb79b8cd4db3dd031d71f3eb8a9a3b))
* **test:** resolve failing Prism tests ([3323fa5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3323fa5f93719966153d6ea2896e8b93d8ddc061))


### Chores

* add splat as owner of SDK PRs ([84e2fe7](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/84e2fe7d675b9d8e6bce61968848463d1cf1f2c5))
* **internal:** codegen related update ([78bd262](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/78bd2621ca96f55b65a78f14234ebdfb4901c886))
* **internal:** codegen related update ([564e20c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/564e20c3286cb37d41821a79047ba59792fa319c))
* **internal:** codegen related update ([f38fe91](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f38fe919b920c7a14668e8912dad027ebb41dcc2))
* **internal:** codegen related update ([d111bba](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d111bba85e1b898e4329551e9e9fbeb3cb63f7cd))
* **internal:** codegen related update ([88e4d3d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/88e4d3df766806558406e9b3d6db0576749cab95))
* **internal:** codegen related update ([63c176c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/63c176c8df76c94d7a6cdae0d00415dc94d6e49f))
* **internal:** codegen related update ([47ef8f9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/47ef8f95b0dc2a1cf182848541dbd5539f410fb6))
* **internal:** refactor build files to support future stainless package uploads ([f84aff0](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f84aff0a7e78296b66e93c719a7bd62d63247093))
* **internal:** use different example values for some enums ([eb7f783](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/eb7f78325bc430d34eeb3c8725ab190522f05161))


### Documentation

* prominently feature MCP server setup in root SDK readmes ([77e0383](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/77e0383e9f30315aa37371a20b879867aa2b4d89))
* remove `$` for better copy-pasteabality ([493a413](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/493a413960722f0bc713d95952e8f91343de19a2))

## 7.17.0 (2025-11-05)

Full Changelog: [v7.16.0...v7.17.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.16.0...v7.17.0)

### Features

* **api:** api update ([f12909b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f12909bf3b75af5874b50c13a6f5d63edf52438d))
* **api:** api update ([5de77cf](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/5de77cf6ea8956a034fba50173c9c33ee390944e))

## 7.16.0 (2025-10-22)

Full Changelog: [v7.15.0...v7.16.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.15.0...v7.16.0)

### Features

* **api:** api update ([48796fb](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/48796fbeff74c45bd6c20b7be40bf9b19c15ada6))
* **api:** api update ([8f52bde](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8f52bde669cfa95761ec64c994f0dee6383ff3bf))
* **api:** manual updates ([800ca2c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/800ca2c529f95da5da0d935191ba2c3e0e91f3ca))

## 7.15.0 (2025-10-09)

Full Changelog: [v7.14.0...v7.15.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.14.0...v7.15.0)

### Features

* **api:** api update ([3020a40](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3020a4094130f5266d505196013cfbf0c1577f6d))
* **api:** api update ([fa3ee7a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/fa3ee7aaa4437d26b55379a3d30f596a4005858a))
* **api:** api update ([a682fe5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a682fe56aa71e8c4f6f4c417574205a2ca43bb2e))
* **api:** api update ([4e966f1](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4e966f19c19080796534e8a2a66ebd94da37a63b))
* **api:** api update ([82c46b6](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/82c46b6d129592f49d735a81ad7c20720e316f11))
* **api:** api update ([c172b38](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c172b381138fc0a2000079bacd23800939368ab8))
* **api:** api update ([be0fc95](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/be0fc9539bb94161bb86a8043cf9d584b10e0784))
* **api:** api update ([707a8cd](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/707a8cd142e12cb7a1daeaedfbfcdcb3b4c1d4a9))
* **api:** api update ([cd4e2e2](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/cd4e2e29b0e215d5de65a1ea41a13ca8ce819ab4))
* **api:** api update ([6e74de1](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6e74de15d643c22b1b6a304658099ecf836eb163))
* **api:** api update ([d32d841](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d32d84104164ca32a057280b667af98a0328eed3))
* **client:** add convenience overloads for some methods ([8834a23](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8834a239c8102442e113f201ed9ab72845ccc2a2))
* **client:** expose sleeper option ([4162efe](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4162efe5cfae61db2a5f833dceccc8fa35c8b6d5))


### Bug Fixes

* **client:** deserialization of empty objects ([14158f8](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/14158f8855dc6c10d10abac7839826e6ef23c5ec))
* **client:** ensure single timer is created per client ([4162efe](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4162efe5cfae61db2a5f833dceccc8fa35c8b6d5))


### Chores

* improve example values ([10eff86](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/10eff86740e0edea97f09c1b88001538d54142cd))
* **internal:** improve examples ([d8bb4d4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d8bb4d4a18227ebe5b14e556582ba0ec8c2a6d56))
* **internal:** use some smaller example values ([482bd9a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/482bd9a1eaebd5c4b65e7619d85bf67dd95a32fa))
* **internal:** use some smaller example values ([746228b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/746228b62c4658b49784101f2446a25bb33c6b57))

## 7.14.0 (2025-09-15)

Full Changelog: [v7.13.0...v7.14.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.13.0...v7.14.0)

### Features

* **api:** api update ([00354f1](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/00354f1b3f128502c6d0d76e0133b893fc73602d))


### Bug Fixes

* **client:** incorrect `getPackageVersion` impl ([583d2a0](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/583d2a0571173e0f4f465d15046252a51e923b6f))

## 7.13.0 (2025-09-11)

Full Changelog: [v7.12.0...v7.13.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.12.0...v7.13.0)

### Features

* **api:** api update ([bf90705](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/bf9070510c867267e4a36e0b89434fdae47f371d))

## 7.12.0 (2025-09-05)

Full Changelog: [v7.11.0...v7.12.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.11.0...v7.12.0)

### Features

* **api:** api update ([54afc08](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/54afc08aa0a8d0d1a849009259f7592a3b648ddc))
* **api:** api update ([558d54a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/558d54a6aea262b6af577174b62c6bd10454becd))


### Bug Fixes

* **ci:** use java-version 21 for publish step ([46bf59b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/46bf59bd29c15ea799b47b6624423de345f3db59))
* **client:** name conflict ([b2635db](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b2635dbfbfd13713c23cdd3b0712f74dc4252dbc))
* fix casing issue ([94ef0e4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/94ef0e43e9999e3ea4cc390747929b58a0adf4c5))
* update singularization rules ([f5f0f2b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f5f0f2b9ee4d0fe998afe9d5aa3a36121c92958e))

## 7.11.0 (2025-08-22)

Full Changelog: [v7.10.0...v7.11.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.10.0...v7.11.0)

### Features

* **api:** api update ([5a5a485](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/5a5a485d98e496442458d9923145f7cb7adc5463))
* **api:** api update ([217cbb7](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/217cbb776210e8ae720ee77d1133bdfaaf349f9e))
* **api:** api update ([e975017](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e975017954590d230cf6d123d117c491e5c15cef))


### Bug Fixes

* **client:** ensure correct binary content type ([378fac7](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/378fac73633e87114bcdc3e01d2d429ae7722dc0))
* **client:** missing multipart content type ([c181f23](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c181f23cd0b412b6f37f6c06081783f8a8fc7c93))


### Performance Improvements

* **internal:** make formatting faster ([e11f2e1](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e11f2e16027f3fedda4dd43eefd6dbe8dfbb0d3e))


### Chores

* **ci:** add build job ([f758357](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f758357f69c79150f9babef29e6ceffbb732cca9))
* **ci:** reduce log noise ([b17f98f](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b17f98f80eae58b02a5d724762eac98d955058dd))
* **client:** refactor closing / shutdown ([3c98dc0](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3c98dc08fedb43b5b8daac7562362b78d6612723))
* **client:** rename parameter ([378fac7](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/378fac73633e87114bcdc3e01d2d429ae7722dc0))
* **internal:** dynamically determine included projects ([741da2a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/741da2ad91125acc9b6a88015604bfb1bf50fc22))
* **internal:** fix multipart tests ([9b906b7](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9b906b75bfc5130342284ac7bf0dec6a3702a182))
* **internal:** format identity methods ([5cece29](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/5cece29645d67ce25f5dd80d5cf136eb1c4e3315))
* **internal:** support passing arguments to test script ([b133705](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b13370528855ca9ec3bd105d0d64776e062daa9a))
* **internal:** support running ktfmt directly ([1061577](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/1061577aa2115af85920f133d9a03a211201de62))
* remove memory upper bound from publishing step ([eb512d8](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/eb512d828be756e1646541490d55140e203c3e40))

## 7.10.0 (2025-08-12)

Full Changelog: [v7.9.0...v7.10.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.9.0...v7.10.0)

### Features

* **api:** manual updates ([dbaf66e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/dbaf66e9595ce17733c241f11535b3fff3b8c7a7))

## 7.9.0 (2025-08-12)

Full Changelog: [v7.8.0...v7.9.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.8.0...v7.9.0)

### Features

* **api:** api update ([253114d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/253114db17cde68fd585e02d93b14eaa2a0e2990))

## 7.8.0 (2025-08-12)

Full Changelog: [v7.7.0...v7.8.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.7.0...v7.8.0)

### Features

* **api:** api update ([57ffa23](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/57ffa2331804b78ed5912e30ae16c3e86351ccb2))

## 7.7.0 (2025-08-08)

Full Changelog: [v7.6.0...v7.7.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.6.0...v7.7.0)

### Features

* **api:** api update ([342f0c4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/342f0c4bf8fa4366d817ca60b1d4552ca58b834a))
* **api:** api update ([6dc51db](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6dc51db3b8bdeb6c8b4b835459955ffaf0f35ce1))
* **api:** manual updates ([38b2ce5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/38b2ce59483b5726e20a2066f835a981c31ecad8))
* **api:** manual updates ([e97916c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e97916cc5f1d2597f4efeae64c5ff502091e970d))


### Chores

* **example:** fix run example comment ([618d453](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/618d453356d14b7c69b1e39743e411f399496e98))
* increase max gradle JVM heap to 8GB ([93b0b1f](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/93b0b1f5bce91320714c26c57763271423b48ae9))
* **internal:** add lock helper ([d696cf3](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d696cf3d9621e9c51491ad7acade1f279365f0bd))
* **internal:** update comment in script ([f949bf5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f949bf51869a0abcec939ba13121afef0df7c997))
* update @stainless-api/prism-cli to v5.15.0 ([1688a91](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/1688a916cfae45c6d5ed3fd504d50d0aad07971c))

## 7.6.0 (2025-08-01)

Full Changelog: [v7.5.0...v7.6.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.5.0...v7.6.0)

### Features

* add retryable exception ([6c0a6a5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6c0a6a564d92baeb8efaa2caa439dac82b74feaf))
* **api:** api update ([6541cb7](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6541cb75dbfb5911c8638fd854b0e840de7547da))
* **api:** api update ([f8a4209](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f8a42097df0acc9a25cd5df31b0ca9ae61359f66))
* **api:** api update ([2bc342d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/2bc342d614875a16a83fa266a92c86a2220e42b3))
* **api:** api update ([fc0490a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/fc0490a28b1a95206ccdae179fc9abae25db1cb3))
* **api:** api update ([ccede06](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/ccede06cb944b13461444a7647ee0c1e7fe01c39))
* **api:** api update ([fcdcf3b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/fcdcf3bc5072d0187c606b9fbcad76bb096dc655))
* **api:** api update ([0c0f30b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0c0f30b941b41c1029a7cb42a890246beaa6996b))
* **client:** add `{QueryParams,Headers}#put(String, JsonValue)` methods ([3abf3f9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3abf3f9f871e3553f984a8675bad6c1ab69a651d))
* **client:** add https config options ([a823f2e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a823f2ed8313e121371d9acd28f025ccef211116))
* **client:** allow configuring env via system properties ([348e5f1](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/348e5f14cbcbc8a31d6da92f8a9d294fc94bdb86))
* **client:** allow setting additional multipart body props ([aa1430b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/aa1430b590460e910d7606e1a370b88ac9179796))
* **client:** ensure compat with proguard ([f2eee34](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f2eee349a25aef81a9e45361527c8862a38dd8dd))


### Bug Fixes

* **client:** accidental mutability of some classes ([0680266](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0680266b4f5aac176ea3fa62e1c81ab00d957866))
* **client:** ensure error handling always occurs ([e7ed4f9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e7ed4f9c1ea43b1e74d17ff7507af41ffe36df3e))
* **client:** r8 support ([308dca2](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/308dca291e1b935b8ba53c1cfdb50c509ba1f3fc))
* **client:** some bad `_additionalBodyProperties` serialization ([fae5651](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/fae5651f5193ca968b986168e22c337ce1030e64))
* **client:** unique model names ([193d799](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/193d7996392a4d7123909536bd66847ebb936085))


### Chores

* **ci:** bump `actions/setup-java` to v4 ([bc5fbe0](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/bc5fbe09b6eb3b846dff7c8671fce56c98b75128))
* **internal:** allow running specific example from cli ([14be2d3](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/14be2d3e85386e813483d354f25f3566d55d54b8))
* **internal:** bump ci test timeout ([0e61c51](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0e61c51889f938fc8bed910f4ad4a46475467489))
* **internal:** reduce proguard ci logging ([6bc2dc9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6bc2dc9759cb129a6da1883fed88efb65edd217e))
* **internal:** refactor delegating from client to options ([99235db](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/99235dbe14a4d010d0b4cb26e4de88b29c49a375))
* **internal:** remove unnecessary `[...]` in `[@see](https://github.com/see)` ([099e83a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/099e83a0bbaa3836f43f34573d77a0c39d8921b4))


### Documentation

* fix missing readme comment ([3506165](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/35061655add87ef08561c159ad18d728753a64b7))
* more code comments ([79cf1eb](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/79cf1eb9e27465decb9f66d20facaddfcf47553e))

## 7.5.0 (2025-07-15)

Full Changelog: [v7.4.0...v7.5.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.4.0...v7.5.0)

### Features

* **api:** api update ([18235d3](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/18235d3457f4278215852c72f675cc7313e6adf4))
* **api:** api update ([e4bcf5c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e4bcf5c496aa736b9bd13a2fb85d0fb4ebc4623c))
* **api:** api update ([f2cda28](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f2cda281756e92c61526f5bcb68e983f3b17eb06))
* **api:** api update ([6133e24](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6133e2415892bc538eec4a6b12ae421e2ee4e57e))
* **api:** manual updates ([27deeae](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/27deeae21a145c8c6a4bb89d691b629f356c8f2e))
* **api:** manual updates ([ce9c1f6](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/ce9c1f6b56ae0195c74101620276d774015342eb))
* **api:** manual updates ([170a873](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/170a873709361ea2af987098bbdc18ad193f4cfd))
* **api:** manual updates ([f00b41b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f00b41b0b1ef49c0c5a0eaa554f355a7839b80be))


### Chores

* **ci:** ensure docs generation always succeeds ([a88bdd5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a88bdd5d52175857edc00040f2f6ef965fa02f20))

## 7.4.0 (2025-07-07)

Full Changelog: [v7.3.1...v7.4.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.3.1...v7.4.0)

### Features

* **api:** api update ([607b024](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/607b0242c6d91ef7fb84e9b0c6aa25b3d4aa408c))
* **api:** api update ([a063133](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a0631333c68c8308eb5155d454bb56edc2c0dc0e))
* **api:** api update ([7dd7a73](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/7dd7a739161b604a670cff05c87a2b477755ef65))
* **api:** api update ([5682202](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/568220214c9d8133d8f06fc53108ca1315e47d28))


### Bug Fixes

* **ci:** release-doctor — report correct token name ([cb59a1c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/cb59a1ca0ba3a429f9d34f87052b069333e10599))
* **client:** bump max requests per host to max requests (5 -&gt; 64) ([be65f68](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/be65f68b7f261298c4501087ba74de38289a8ebd))
* **client:** don't close client on `withOptions` usage when original is gc'd ([8655fa4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8655fa46c85d184683ca148920e56f335ca5f3a1))


### Chores

* **ci:** enable for pull requests ([ac05bd7](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/ac05bd7c72cb951ad5293062d4bea485ada4ba42))
* **ci:** only run for pushes and fork pull requests ([f5f8fd6](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f5f8fd690ac7773cd3cb2a08d1c15ba6e8d99080))


### Refactors

* **internal:** minor `ClientOptionsTest` change ([c805e84](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c805e8489b34ccdf6a520ea132c93f67c111c6e4))

## 7.3.1 (2025-06-16)

Full Changelog: [v7.3.0...v7.3.1](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.3.0...v7.3.1)

### Bug Fixes

* **client:** incorrect page response header names ([2f16fd6](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/2f16fd6ac5c07b8b892ef27340989d6b56e5da2c))

## 7.3.0 (2025-06-16)

Full Changelog: [v7.2.0...v7.3.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.2.0...v7.3.0)

### Features

* **api:** api update ([87b454b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/87b454b73aa4c96a99be341a9f441346820b68a5))
* **api:** api update ([cbf9b6d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/cbf9b6d39a5f5310ffdbc984ebf8659ef7ca8c32))
* **client:** add a `withOptions` method ([2bfa668](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/2bfa6687059fa14152f288baa8b8bbdaf6e2d7ef))
* **client:** implement per-endpoint base URL support ([c9c48b0](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c9c48b07d050f1ba65654386ee2abbb72e517be8))


### Bug Fixes

* **client:** header pagination bug ([d08f4d2](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d08f4d274873b8a0284fa006254986f42efadb82))
* **tests:** fix test value ([1cbd5a3](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/1cbd5a3a094b65162713da5b1ed4251289e2816c))

## 7.2.0 (2025-05-27)

Full Changelog: [v7.1.0...v7.2.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.1.0...v7.2.0)

### Features

* **internal:** try out dokka gradle plugin v2 ([839b0f5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/839b0f56bbec40041e388a8bf196fa8494ad737f))

## 7.1.0 (2025-05-23)

Full Changelog: [v7.0.2...v7.1.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.0.2...v7.1.0)

### Features

* **api:** api update ([4313dd5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4313dd57a3e8f3523876e73c58b0011a01c12403))
* **api:** manual updates ([a9e8d21](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a9e8d21a701990b3b17dfbf59fadaf3d6cffa5ea))

## 7.0.2 (2025-05-21)

Full Changelog: [v7.0.1...v7.0.2](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.0.1...v7.0.2)

### Chores

* **docs:** grammar improvements ([80ac73c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/80ac73cb24bcc748ed745e9e609ef9b6a96324da))

## 7.0.1 (2025-05-15)

Full Changelog: [v7.0.0...v7.0.1](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v7.0.0...v7.0.1)

### Chores

* **internal:** update JVM publishing method ([4ef9d82](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4ef9d825034dedb27f45e72e232cbf3c6ee5d846))

## 7.0.0 (2025-05-08)

Full Changelog: [v6.2.0...v7.0.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v6.2.0...v7.0.0)

### ⚠ BREAKING CHANGES

* **client:** extract auto pagination to shared classes
* **client:** **Migration:** - If you were referencing the `AutoPager` class on a specific `*Page` or `*PageAsync` type, then you should instead reference the shared `AutoPager` and `AutoPagerAsync` types, under the `core` package
    - If you were referencing `getNextPage` or `getNextPageParams`:
       - Swap to `nextPage()` and `nextPageParams()`
       - Note that these both now return non-nullable types (use `hasNextPage()` before calling these, since they will throw if it's impossible to get another page)

### Features

* **api:** only send idempotency headers on PUT / POST requests ([14464d6](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/14464d69cbf2b940e522bce7c4cc062c5293fd6a))
* **client:** allow providing some params positionally ([a7f305b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a7f305b3a7c7850828dbe382479094b631f3797e))
* **client:** extract auto pagination to shared classes ([98610c2](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/98610c298e22885c98daf1fc4c11ebefd857d3ee))


### Bug Fixes

* **client:** add missing convenience methods ([3a1457d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3a1457d2a9d07d612d683a66b1f1ad00f9248ce7))


### Chores

* **ci:** add timeout thresholds for CI jobs ([1c03454](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/1c03454928f14a9af3da3582a8be12ef3567b3c0))
* **ci:** only use depot for staging repos ([448d987](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/448d987105eede54de994539bb70a873b8d09fea))
* **ci:** run on more branches and use depot runners ([a5c03fd](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a5c03fd5dc0315568ab60ccec951fac428675704))
* **internal:** java 17 -&gt; 21 on ci ([2caf496](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/2caf4964090867b819ea4b9f3add696aa050e54d))
* **internal:** remove flaky `-Xbackend-threads=0` option ([e899f1b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e899f1b235798c8877c5e66bebb63df695f309d8))
* **internal:** update java toolchain ([dcc4b16](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/dcc4b16270345a8d311f1f0541213693d69b868c))
* **internal:** use `byteInputStream()` in tests ([3a1457d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3a1457d2a9d07d612d683a66b1f1ad00f9248ce7))

## 6.2.0 (2025-04-16)

Full Changelog: [v6.1.0...v6.2.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v6.1.0...v6.2.0)

### Features

* **client:** make pagination robust to missing data ([d34657d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d34657d06208be774be70afd73910ff6d37e88e6))
* **client:** support setting base URL via env var ([#400](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/400)) ([6d5367d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6d5367daa482b38a644490cbaa8245f6e8076d65))


### Bug Fixes

* **client:** bump to better jackson version ([#403](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/403)) ([cb00977](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/cb009776650db7a65cae025b4cc868ca30c72479))


### Performance Improvements

* **internal:** improve compilation+test speed ([62fb342](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/62fb342b521efdc310d21e01b7c8c03b45fc9132))


### Chores

* **internal:** expand CI branch coverage ([#402](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/402)) ([561a4e5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/561a4e5994eaaf285a5dfa655eb441c9d7249a5f))
* **internal:** reduce CI branch coverage ([02eefa5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/02eefa52b6e6d5b15649559a412ed9c0780581d1))


### Documentation

* add comments for page methods ([d34657d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d34657d06208be774be70afd73910ff6d37e88e6))
* **client:** update jackson compat error message ([a58933d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a58933dca11791ac4bf260f93977ce2399328cbb))
* explain http client customization ([976e199](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/976e19971bcbf1b5b01f123ede6ed1de59f5374c))
* explain jackson compat in readme ([ee29af3](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/ee29af30a4c2cb69e62bc286145c62584a6a3ffe))
* update documentation links to be more uniform ([128eac7](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/128eac7f245a604e8bea1425c80146deb5390592))


### Refactors

* **client:** deduplicate page response classes ([#404](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/404)) ([d34657d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d34657d06208be774be70afd73910ff6d37e88e6))
* **client:** migrate pages to builder pattern ([#405](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/405)) ([3860c13](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3860c1326498635220164d69534445cec27ab46a))

## 6.1.0 (2025-04-04)

Full Changelog: [v6.0.0...v6.1.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v6.0.0...v6.1.0)

### Features

* add MCP server ([348ae09](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/348ae0968a9133ace89bfb7bae6e9abaff5eaac6))
* **client:** add enum validation method ([4209c03](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4209c03efbb2de930989f64d3b22a6b4221f2e0f))
* **client:** expose request body setter and getter ([#395](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/395)) ([674c6c3](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/674c6c3e27c3226535bf3bf1fcf38552e2108572))
* **client:** make union deserialization more robust ([#393](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/393)) ([4209c03](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4209c03efbb2de930989f64d3b22a6b4221f2e0f))


### Bug Fixes

* **client:** don't call `validate()` during deserialization if we don't have to ([#391](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/391)) ([cb367da](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/cb367dac9d2acd748dd26e7bc4524ee019a61365))
* **client:** limit json deserialization coercion ([#392](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/392)) ([d89868e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d89868ecb85fa86f7bce20b53095077433a3ae10))


### Performance Improvements

* **client:** cached parsed type in `HttpResponseFor` ([#396](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/396)) ([f2e65c5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f2e65c5703a4cba40ac96499305b92ff311910e2))


### Chores

* **api:** updates to bulk creation request, legal entity schemas and more ([#387](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/387)) ([9430d3f](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9430d3f1866e7af2358b4d0557bfdacfa6dcd4dc))
* **client:** remove unnecessary json state from some query param classes ([4209c03](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4209c03efbb2de930989f64d3b22a6b4221f2e0f))
* configure new SDK language ([1d7db20](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/1d7db206704e1dec1201fd3e2920853728006367))
* configure new SDK language ([86736ec](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/86736ecb65b1447f3dea78a66a4a8c96867b1843))
* internal codegen changes ([17b808c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/17b808c32b8c77ed1bf142408613d6e34b93bb48))
* **internal:** add invalid json deserialization tests ([4209c03](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4209c03efbb2de930989f64d3b22a6b4221f2e0f))
* **internal:** add json roundtripping tests ([4209c03](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4209c03efbb2de930989f64d3b22a6b4221f2e0f))
* **internal:** codegen related update ([#394](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/394)) ([8828084](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/882808456322d9a6d64dfdb1f7a6864a1c4c83a7))
* **internal:** remove CI condition ([#390](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/390)) ([598e53c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/598e53c9e3d4e78510c9f22beab6f7829bce789c))
* Remove deprecated/unused remote spec feature ([fcf2ffd](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/fcf2ffdeec0a5021f1abfeacc670612230f1e5a2))


### Documentation

* add comments to `JsonField` classes ([#397](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/397)) ([77c9559](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/77c9559bb7c1d92a1549abb5e907c15fecebacbe))
* document how to forcibly omit required field ([8592c44](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8592c44d2cebd65e1ae30409dcb4f4b24228508f))
* swap examples used in readme ([#398](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/398)) ([8592c44](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8592c44d2cebd65e1ae30409dcb4f4b24228508f))

## 6.0.0 (2025-03-26)

Full Changelog: [v5.0.0...v6.0.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v5.0.0...v6.0.0)

### ⚠ BREAKING CHANGES

* **client:** refactor exception structure and methods
* **client:** refactor multipart formdata impl ([#351](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/351))

### Features

* **client:** accept `InputStream` and `Path` for file params ([#354](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/354)) ([c63239b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c63239b56c97b65ac4de4fba93fbd6b38337e9ff))
* **client:** allow omitting params object when none required ([#343](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/343)) ([9ed5c6f](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9ed5c6feb9c48ce830fed665b4c0d31d94cc3762))
* **client:** detect binary incompatible jackson versions ([#356](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/356)) ([f85a4c1](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f85a4c11256bd94a20a6be4bbb9ad2867cdcca41))
* **client:** support a lower jackson version ([#383](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/383)) ([7740c27](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/7740c27aca00568c76dd0daae820d981eccfd748))
* **client:** support raw response access ([#350](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/350)) ([47a890d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/47a890ddddb8a820d4b1db36e51f02ab72ee3cb4))
* **client:** throw on incompatible jackson version ([7740c27](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/7740c27aca00568c76dd0daae820d981eccfd748))
* generate and publish docs ([#357](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/357)) ([98b76a2](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/98b76a2fcc03d8ab08ed82a4ea41a4ed9c753d07))


### Bug Fixes

* **client:** map deserialization bug ([8c0ac2d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8c0ac2d3c93bcf157026b4826ac27360b4f578ee))
* **client:** mark some request bodies as optional ([#339](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/339)) ([422ed99](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/422ed9964f19bb88f3bbb7ee9bfb132ba970c68d))
* **client:** support kotlin 1.8 runtime ([#373](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/373)) ([4b5869e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4b5869e3980d49c8d646350a4b0d4ac963d5fe20))
* **client:** swap `PaymentOrderCreateParams` and `DocumentCreateParams` class to multipart ([#379](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/379)) ([2efcebb](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/2efcebb6185272f62ff3a603ce92e0a72172bd0b))


### Chores

* add hash of OpenAPI spec/config inputs to .stats.yml ([#385](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/385)) ([a4e3881](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a4e38812021c0a5a18dd601bf5749934e179ffba))
* **ci:** update gradle actions to v4 ([#336](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/336)) ([58674f4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/58674f42d44fb9bc61426de99949235cb1425d1d))
* **client:** delete unused enums ([#378](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/378)) ([35084b0](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/35084b0486b63dc209ab9bece01be950ba27dc2d))
* **client:** refactor exception structure and methods ([c34f7c9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c34f7c9d8d58b378a9306b3e1d6679473b9f1b0a))
* **client:** refactor multipart formdata impl ([#351](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/351)) ([b4b1aa3](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b4b1aa35c0117f4707fd4f64bad060f70cfab57b))
* **client:** remove checked exception related code ([#337](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/337)) ([ae99b89](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/ae99b89386d95b477b6eb6ea8bbdfa99079d7fd9))
* **client:** use deep identity methods for primitive array types ([#345](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/345)) ([e6c133e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e6c133e49e1b343da7af564c1b4287d945fd3bb2))
* **docs:** add faq to readme ([#338](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/338)) ([5c5fb0f](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/5c5fb0f645ea7158e698bfbb0dd9b16abf1ee50f))
* **internal:** add `.kotlin` to `.gitignore` ([#359](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/359)) ([43525c0](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/43525c08988246c93ec60bb9348620898d6ade9e))
* **internal:** add async service tests ([#344](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/344)) ([30ef263](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/30ef2632ffd823cfe1cb4860dc107d1cca808771))
* **internal:** add generated comment ([#367](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/367)) ([434df14](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/434df14f91f85c4b03dd11363c6d3838530085e9))
* **internal:** add missing release please block ([#375](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/375)) ([6aafaaf](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6aafaaf315cf9616e34a118837f7441e73fdb931))
* **internal:** add some tests for union classes ([#372](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/372)) ([7df14cb](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/7df14cb0cb0678b0ce1da372ec018fc0e46b87f9))
* **internal:** delete duplicate tests ([800d036](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/800d03676295738e3c3d4acedd91e615861df62c))
* **internal:** delete unused methods and annotations ([#386](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/386)) ([8c0ac2d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8c0ac2d3c93bcf157026b4826ac27360b4f578ee))
* **internal:** generate more tests ([2a8c4f3](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/2a8c4f3f300c56a4fd5794387d3446b4669114b2))
* **internal:** get rid of configuration cache ([#334](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/334)) ([5120b99](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/5120b994f77fa88e26c5d91e3faf0caaca3dfdf5))
* **internal:** improve sync service tests ([30ef263](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/30ef2632ffd823cfe1cb4860dc107d1cca808771))
* **internal:** make multipart assertions more robust ([2efcebb](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/2efcebb6185272f62ff3a603ce92e0a72172bd0b))
* **internal:** make test classes internal ([#366](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/366)) ([5fa6cf0](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/5fa6cf0ad4cf0a1b8383445eca2232cf553abd30))
* **internal:** reenable warnings as errors ([6901739](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/69017390b90ab99164cfd3bfbf3592e6163eab3c))
* **internal:** refactor `ErrorHandlingTest` ([#349](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/349)) ([d2e278c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d2e278cc80566be508f84918e42da1995131b5d7))
* **internal:** refactor `ServiceParamsTest` ([#347](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/347)) ([a334993](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a334993354a82e475c08b081b47431e2ad2df3f6))
* **internal:** refactor query param serialization impl and tests ([#369](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/369)) ([e3d9051](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e3d905134fea84de67dc753a02f2e0e9ee7cc456))
* **internal:** refactor some test assertions ([800d036](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/800d03676295738e3c3d4acedd91e615861df62c))
* **internal:** reformat some tests ([#371](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/371)) ([2a8c4f3](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/2a8c4f3f300c56a4fd5794387d3446b4669114b2))
* **internal:** remove extra empty newlines ([#364](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/364)) ([1125e64](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/1125e6439e84bafefd115e0bed2fb227c49e37a8))
* **internal:** remove unnecessary `assertNotNull` calls ([2efcebb](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/2efcebb6185272f62ff3a603ce92e0a72172bd0b))
* **internal:** remove unnecessary import ([#380](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/380)) ([d8d976b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d8d976bba0aaa45ea2011a9b468a3c0b72411856))
* **internal:** remove unnecessary non-null asserts in tests ([422ed99](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/422ed9964f19bb88f3bbb7ee9bfb132ba970c68d))
* **internal:** rename `getPathParam` ([#370](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/370)) ([800d036](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/800d03676295738e3c3d4acedd91e615861df62c))
* **internal:** rename internal body classes ([7825cc9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/7825cc9628a94ffc1e152ea5e6386ff839744e44))
* **internal:** reorder some params methodsc ([800d036](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/800d03676295738e3c3d4acedd91e615861df62c))
* **internal:** use `assertNotNull` in tests for type narrowing ([422ed99](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/422ed9964f19bb88f3bbb7ee9bfb132ba970c68d))


### Documentation

* add `build` method comments ([#368](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/368)) ([d44b1aa](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d44b1aa56499110cf27500d831bfe3a313dc54c2))
* add immutability explanation to readme ([#341](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/341)) ([4c81dc9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4c81dc9bece117ee7c51ad2ddc1752481e89b0bd))
* add raw response readme documentation ([#352](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/352)) ([2c228ac](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/2c228ac7160d8818742edda0ee671313dcd4c804))
* add source file links to readme ([#342](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/342)) ([69b1fa5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/69b1fa532ac46227a9ff51b61ace8a5e6f5d6f8b))
* deduplicate and refine comments ([#365](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/365)) ([77da959](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/77da959a57c6cb74235a0dc368b11d595085c2e3))
* document `JsonValue` construction in readme ([#363](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/363)) ([700fb0e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/700fb0e637757405590011d6382aece2d5268a64))
* document file uploads in readme ([#355](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/355)) ([0264939](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/02649398399807bebdc440b0348b227d1af7db0b))
* make URL purpose clearer in readme ([#361](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/361)) ([b6eac64](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b6eac643de60fc23d6b370d9dcfa56d4699c022b))
* minor readme tweak ([#382](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/382)) ([501c95a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/501c95a310a98ba28c3832f0e696e1c0ddf131a5))
* note required fields in `builder` javadoc ([#353](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/353)) ([5604aa5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/5604aa56b7bec55e4d63155938e53245156219d4))
* readme parameter tweaks ([30ef263](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/30ef2632ffd823cfe1cb4860dc107d1cca808771))
* refine comments on multipart params ([2efcebb](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/2efcebb6185272f62ff3a603ce92e0a72172bd0b))
* revise readme docs about nested params ([#362](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/362)) ([b532bb5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b532bb523c8617448bd54585708c25bae162d287))
* update readme exception docs ([#381](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/381)) ([7be6b7b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/7be6b7ba4bb8aa5f670fdd4837a03279009f01d9))
* update URLs from stainlessapi.com to stainless.com ([#348](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/348)) ([ff2c077](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/ff2c07754e95b8dfe9d3361c8d9937421744ef4d))

## 5.0.0 (2025-02-19)

Full Changelog: [v4.0.1...v5.0.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v4.0.1...v5.0.0)

### ⚠ BREAKING CHANGES

* **client:** better union variant method and variable names ([#315](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/315))

### Features

* **client:** add `_queryParams` and `_headers` methods ([#322](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/322)) ([91459d4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/91459d423135c63f623aff5b70d112ccbb25ee9a))
* **client:** add `close` method ([#317](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/317)) ([b0a2f29](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b0a2f29bab953eb4100398be26a25fa9834e0bc7))
* **client:** better union variant method and variable names ([#315](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/315)) ([249b6e3](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/249b6e3a41f074b53e97a31cacbcba49f8e7ee27))
* **client:** send client-side timeout headers ([#326](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/326)) ([7c72d08](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/7c72d08d8f524dd02aa7d5170dbaad278a098615))
* **client:** support `JsonField#asX()` for known values ([#332](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/332)) ([66a5bb9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/66a5bb9d05cb9548135173c75e723ff7839216a0))
* **client:** update enum `asX` methods ([#331](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/331)) ([59402a1](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/59402a1f820559622e0bb98ed75bc5f664ad30a2))


### Bug Fixes

* **api:** add missing `@MustBeClosed` annotations ([#327](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/327)) ([e779b2c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e779b2cc9b6b8bb41e619c5038841dcb5de6dffa))
* **api:** switch `CompletableFuture&lt;Void&gt;` to `CompletableFuture<Void?>` ([e779b2c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e779b2cc9b6b8bb41e619c5038841dcb5de6dffa))
* **client:** add missing validation calls on response ([e779b2c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e779b2cc9b6b8bb41e619c5038841dcb5de6dffa))
* **client:** always provide a body for `PATCH` methods ([e779b2c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e779b2cc9b6b8bb41e619c5038841dcb5de6dffa))
* **client:** don't leak responses when retrying ([#324](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/324)) ([2ef0c0b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/2ef0c0bdabc2d80faf637037d39e5ad932ef1e07))
* **client:** make some classes and constructors non-public ([#320](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/320)) ([7b43770](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/7b43770851f3e2a255c2c89954aabf1f672b162f))
* format webhooks ([26f5151](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/26f51512c93185859093e1224a5468b86ca3b01c))


### Chores

* add max retries to test ([#316](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/316)) ([e7f737e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e7f737eaf882866635b92569a7b8acdcdaae9824))
* **docs:** reorganize readme ([#333](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/333)) ([6f05eaf](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6f05eafe97afe49eef2d0be5bfbd8946833fdfac))
* **internal:** improve `RetryingHttpClientTest` ([#323](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/323)) ([a023313](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a023313cffdff0677fef84d79fe5bb9767649ed8))
* **internal:** minor formatting/style changes ([e779b2c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e779b2cc9b6b8bb41e619c5038841dcb5de6dffa))
* **internal:** optimize build and test perf ([b9f05d9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b9f05d94264c9bffaf5c4e34749a9f6c467e1df9))
* **internal:** remove some unnecessary `constructor` keywords ([7b43770](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/7b43770851f3e2a255c2c89954aabf1f672b162f))
* **internal:** rename some tests ([e779b2c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e779b2cc9b6b8bb41e619c5038841dcb5de6dffa))
* **internal:** swap `checkNotNull` to `checkRequired` ([#313](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/313)) ([d959e95](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d959e95ed97474c00fc4b0c08b2c85f768f9fd57))
* **internal:** update formatter ([#329](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/329)) ([b9f05d9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b9f05d94264c9bffaf5c4e34749a9f6c467e1df9))
* **internal:** update some formatting in `Values.kt` ([66a5bb9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/66a5bb9d05cb9548135173c75e723ff7839216a0))


### Documentation

* `async` and `sync` method comments ([#319](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/319)) ([97feed4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/97feed4ab120f8df649a69c916efab727918cace))
* add client documentation ([#318](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/318)) ([3753bf5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3753bf5cbd6112c2a0e57f58c5aefd90c6788563))
* add more phantom reachability docs ([#328](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/328)) ([ed738cc](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/ed738ccba48ea4ced6c07a1fd0fa44c218011091))
* builder, enum, and union comments ([#321](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/321)) ([e1b7010](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e1b70108b04e2fe4725461983321b0869370deeb))
* fix incorrect additional properties info ([#325](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/325)) ([16603ae](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/16603aec7bc846a42977c8546cb5cc90689f299e))


### Refactors

* **internal:** extract request preparation logic ([91459d4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/91459d423135c63f623aff5b70d112ccbb25ee9a))

## 4.0.1 (2025-01-22)

Full Changelog: [v4.0.0...v4.0.1](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v4.0.0...v4.0.1)

### Bug Fixes

* **client:** make service impl constructors internal ([#308](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/308)) ([d78da89](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d78da89658e3af24789ac7f708f9e61ed306a0f4))


### Chores

* **api:** adds new APIs for LedgerAccountSettlement LedgerEntries ([#310](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/310)) ([fca1859](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/fca1859b57491a2aed3abaa6b393174278658a18))
* change casing of organization in license ([#309](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/309)) ([e434cd2](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e434cd294e602e81e2d5a633ac97a51d9f214c2c))
* **internal:** add and tweak check functions ([#301](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/301)) ([0d2ef5c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0d2ef5cab2657a209c1bcd203e1db426cfe1797a))
* **internal:** tweak client options nullability handling ([0d2ef5c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0d2ef5cab2657a209c1bcd203e1db426cfe1797a))
* **internal:** upgrade kotlin compiler and gradle ([#306](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/306)) ([2e0cb6e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/2e0cb6eeb23da23443c7e6438a45030afd9adf03))
* simplify examples involving lists ([#303](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/303)) ([f6e1fc5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f6e1fc5fa65858c363658be0561ea0e7070a567d))
* simplify examples involving unions ([#304](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/304)) ([3dfa839](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3dfa839a8c295920b4b9bd2eb498fc9b2ff02668))


### Documentation

* add more documentation ([#307](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/307)) ([b1269f4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b1269f4f266c4e27450efc5bd81ff076fe11be0f))
* add sonatype readme badge ([#305](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/305)) ([236c6ec](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/236c6ec5ad095d2a2ed95e3bfd84be3d5fd4b9a6))
* move up requirements section ([#312](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/312)) ([f1f3a1c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f1f3a1cd0d636e669604354243b3fcb37f4337f2))
* update readme ([#311](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/311)) ([bd58ac5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/bd58ac544525641910213b69b38aa043a0ccb166))

## 4.0.0 (2025-01-14)

Full Changelog: [v3.1.0...v4.0.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v3.1.0...v4.0.0)

### ⚠ BREAKING CHANGES

* **client:** switch query params objects to use `QueryParams` ([#283](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/283))

### Features

* **client:** add more builder convenience methods for lists ([#295](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/295)) ([9167c5d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9167c5db8045137a99c28f00e2fcfeb0cafbad76))
* **client:** add various convenience setters to models ([#292](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/292)) ([9d38e5a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9d38e5ae570bbeb8aabd5a3afbb04ef208079f97))
* **client:** allow setting arbitrary JSON for top-level body params ([9d38e5a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9d38e5ae570bbeb8aabd5a3afbb04ef208079f97))
* **client:** expose getters for `JsonField` of body params ([9d38e5a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9d38e5ae570bbeb8aabd5a3afbb04ef208079f97))
* **client:** put body field in params, add more convenience methods, and add missing docs ([#287](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/287)) ([c3037e7](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c3037e788ec52418e25ce1a46862882134e3093d))


### Bug Fixes

* **client:** add some missing `validate()` calls ([#297](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/297)) ([a2910af](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a2910af3dbc73529b11fdcbc2805491c067cf5ab))
* **client:** allow passing null for nullable fields where missing ([#290](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/290)) ([f3181b5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f3181b5bf021a3aa37a078b1950f71603a2cb7c2))
* **client:** consider header properties in page equality ([#293](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/293)) ([b1bda99](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b1bda99137224cf544ba9decb2b187ce353a56f4))
* **client:** consistently throw on omitting required fields ([9d38e5a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9d38e5ae570bbeb8aabd5a3afbb04ef208079f97))
* **client:** convert `JsonField` containing list type to mutable in builder ([9d38e5a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9d38e5ae570bbeb8aabd5a3afbb04ef208079f97))


### Chores

* bump license year ([#286](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/286)) ([5c1fcfc](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/5c1fcfc759167fde824a573fd3e5e58757ba23e8))
* **docs:** add example project ([#281](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/281)) ([cd4f196](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/cd4f1965d0fab989c12bc78ca489f2cf1c1e407d))
* **docs:** fix unused import ([#282](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/282)) ([5aaf526](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/5aaf526ab0ae4d9e22612c995680e3439517d948))
* **docs:** update readme ([#280](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/280)) ([95e1838](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/95e18386d49a47bb3e78cf96570392513a7e7887))
* **internal:** extract a `checkRequired` function ([#300](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/300)) ([aba017d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/aba017d168ada6507d418177c2cfc74cc930e5c2))
* **internal:** refactor `validate` methods ([a2910af](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a2910af3dbc73529b11fdcbc2805491c067cf5ab))
* **internal:** remove unused and expand used wildcard imports ([#275](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/275)) ([6f1c269](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6f1c2693fc378d0a3184b6d0640871daa8fb05ce))
* **internal:** remove unused Gradle imports ([#298](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/298)) ([ab6f389](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/ab6f3897b6f90d7594e6293514621c83b8cb8bc8))
* **internal:** remove unused or unnecessary Gradle imports ([#299](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/299)) ([0b641f2](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0b641f262d081ca27b3cad4181de46d5148b9130))
* update parameter examples in tests and docs ([#279](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/279)) ([e394ff2](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/e394ff2faa72bad63be5cffc8bf0899aa60c0b84))


### Documentation

* add params class javadocs ([#291](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/291)) ([3a4a79e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3a4a79e8c0e8def61496474c4723eccfef1a1d13))
* add some missing javadocs ([#288](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/288)) ([b48841f](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b48841f03d84216674eaf1eff53fc0c2ffdf2f9e))
* **readme:** fix misplaced period ([#294](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/294)) ([80c3e41](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/80c3e41ac609825e126c0f70a9cfd3d16ca2c5f7))
* update some builder method javadocs ([#296](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/296)) ([d620edf](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d620edff3efe63c0df9086ceb343e6ce296f29db))


### Styles

* **internal:** explicitly add some method return types ([9d38e5a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9d38e5ae570bbeb8aabd5a3afbb04ef208079f97))
* **internal:** move headers and query params setters below others ([9d38e5a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9d38e5ae570bbeb8aabd5a3afbb04ef208079f97))
* **internal:** simplify existing convenience setters on params ([9d38e5a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9d38e5ae570bbeb8aabd5a3afbb04ef208079f97))
* **internal:** sort fields ([#289](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/289)) ([6fa11e4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/6fa11e40cd8454e78c454ae7773feff0f12a8a51))


### Refactors

* **client:** switch query params objects to use `QueryParams` ([#283](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/283)) ([b032c4e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b032c4e535197b53b1a7fd8dc5f0e465a7607eca))
* **internal:** use constructor to deserialize json ([#284](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/284)) ([b1aaca1](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b1aaca16a18027324ff557c28369b177b74f758e))

## 3.1.0 (2024-12-12)

Full Changelog: [v3.0.0...v3.1.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v3.0.0...v3.1.0)

### Features

* **client:** add logging when debug env is set ([#263](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/263)) ([0a35699](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0a356997b231e57403fd595c9fd26c9652b3e6f9))
* derive gpg release key's id via gpg itself ([#266](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/266)) ([1b9031e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/1b9031e3777c69b6a9dce8201c9e91f2f876bcd0))


### Chores

* **api:** additional fields for requests to get BalanceReports and create LegalEntities ([#256](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/256)) ([0d986bd](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0d986bdc4ec804364eed15e4fc8c6e83f694415d))
* **deps:** bump jackson to 2.18.1 ([#259](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/259)) ([27203d2](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/27203d298c206cfc067190fbf2838fe02cda4fe0))
* **internal:** remove unused and expand used wildcard imports ([8b79f8e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8b79f8ef68939e30d6fae16a8a639d99ee9530d4))
* **internal:** remove unused and expand used wildcard imports ([#274](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/274)) ([70be887](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/70be887601a43284d64a396444181cb3b87ad648))
* **internal:** remove unused imports ([#271](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/271)) ([4b09ab6](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4b09ab68d7a07dc5d01fe1724994af060e49c509))
* **internal:** update example values ([#265](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/265)) ([153803f](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/153803fcf95812d005419867689d7035fa180f27))
* minor refactors ([#267](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/267)) ([c505c66](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c505c66be58666f9bd300b7f45c587053d8095a8))
* sync openapi spec ([#264](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/264)) ([a49b265](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a49b265309cbe130725799f8f6ceeb2e1c767c92))
* **test:** remove unused imports ([#272](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/272)) ([c4b7c9d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c4b7c9d0725ca840a41e45dfa46a775a2f99f6d5))
* **test:** use `JsonValue` instead of `JsonString` ([#273](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/273)) ([1633837](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/163383752d77e58d610cde32d0b6e55c3cda0548))
* update example values in tests and docs ([#268](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/268)) ([8cd8077](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8cd8077a268ea46d469fb15ba703b15b26154311))


### Styles

* **internal:** make enum value definitions less verbose ([#269](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/269)) ([b9cd7ac](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/b9cd7acf7de12ce7dfbf50fdcbd0bca2ad6768a0))
* **internal:** move enum identity methods to bottom of class ([#270](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/270)) ([7d49191](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/7d491912f38889b7c75e67bfdb3dc1c68c62bdc7))
* **internal:** move identity methods to bottom of error class ([#261](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/261)) ([17ec4bb](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/17ec4bba8113c0ee10525e9f227d3f1af7ec3387))
* **internal:** reduce verbosity of identity methods ([#260](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/260)) ([4dd3b2f](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4dd3b2f8e17f429121bb7794350a77c2b74bab23))
* **internal:** reorder some params methods and improve consistency of implementations ([#262](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/262)) ([ba4298e](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/ba4298e35d85e2175c14998b6c9bbafd0e041ddf))


### Refactors

* **internal:** split `closeWhenPhantomReachable` function ([#258](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/258)) ([d51d886](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d51d886b7eeab4e77b92cdd6f833236a445b2d3b))

## 3.0.0 (2024-11-11)

Full Changelog: [v2.21.0...v3.0.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.21.0...v3.0.0)

### ⚠ BREAKING CHANGES

* **client:** replace multimaps with custom types ([#251](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/251))
* **client:** add/rename methods for headers/query params ([#249](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/249))
* **client:** rename header and query params builder methods ([#248](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/248))

### Features

* **client:** add `Headers` class ([#245](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/245)) ([a4a5e53](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a4a5e533b8e4897d5b2138c97f3f0d452644efa2))
* **client:** add `QueryParams` class ([#246](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/246)) ([d821eb3](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/d821eb379b3b89b87e6405d281fca0245b339c1f))
* **client:** add/rename methods for headers/query params ([#249](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/249)) ([f14ffd7](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f14ffd7d369182b45a1cce3551afb55241f6d757))
* **client:** additional builder setters for error class ([0ca24d9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0ca24d9b2178d798586a95c3650530942264a9fa))
* **client:** clean up resource leaks when the resource becomes phantom reachable ([#238](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/238)) ([599cbc9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/599cbc9f4c1dabdc05684daa5f8b98756b503493))
* **client:** more additional body param setters ([#253](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/253)) ([ad1ce51](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/ad1ce5136d71a2177721daa4858f999aa842a7b2))
* **client:** propagate headers/query params methods to client builders ([#247](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/247)) ([f3b37e9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f3b37e9e61a14c99c52241d1b86ca10047f6163b))
* **client:** replace multimaps with custom types ([#251](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/251)) ([a1560b5](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a1560b5aa73395de19d07a5ef21144006ff8f5a5))


### Bug Fixes

* **client:** ensure constructed objects are immutable ([#243](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/243)) ([c345686](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c3456867af88c9b40da40aacc8e3f074e12c2ab5))
* **client:** error class `toBuilder` not copying fields ([#254](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/254)) ([0ca24d9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0ca24d9b2178d798586a95c3650530942264a9fa))
* **client:** remove `@JvmStatic` from error ([#242](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/242)) ([004cc15](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/004cc15b96533b991b45c6880fcd5bbc9d6f6550))


### Performance Improvements

* **tests:** remove unused dependencies ([#255](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/255)) ([4ae0c4d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4ae0c4db02c0ae7d5f6507a922645516cde00ff2))


### Styles

* **internal:** make `getOrThrow` terse and consistent ([#240](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/240)) ([52f2cf9](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/52f2cf9940eb5c401c9569d1446cf1e107aaa8ae))


### Refactors

* **client:** http request methods ([#250](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/250)) ([adf3f92](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/adf3f923bbb92204804b398148013ada56f9ab71))
* **client:** rename header and query params builder methods ([#248](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/248)) ([3ea587f](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/3ea587f826130f2a5af82e97c35faf567dcb772c))
* **internal:** polish `ClientOptions` ([#244](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/244)) ([381ce19](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/381ce1924724f0f835e27473d0e37d918eddd489))

## 2.21.0 (2024-10-25)

Full Changelog: [v2.20.1...v2.21.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.20.1...v2.21.0)

### Features

* **api:** updates to required fields for ExpectedPayments ([#224](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/224)) ([0e93a3c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0e93a3c5d186e91b84ba7a76e25ba3d5fb9a2a38))
* **client:** add `User-Agent` header ([#236](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/236)) ([a743ad0](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a743ad05d62bc2d169afcc57494e89f091d0a5be))
* **client:** set `X-Stainless-Runtime` header ([#235](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/235)) ([2cb241a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/2cb241a5bc0aa859482f4c46a5f5540882fc73f4))


### Bug Fixes

* **client:** accidental double-wrapping with `RetryingHttpClient` ([#237](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/237)) ([636de8b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/636de8b24e4bce1e3727a6f7e6501a64d3456b46))
* **client:** implement `hashCode` for `IsMissing` ([#234](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/234)) ([cf9a189](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/cf9a189afcf947fa5b8a86b76c927cdfbcc8b6b7))
* use date time serialization for query parameters ([#218](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/218)) ([06adac6](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/06adac6a92c1073a5bb9aad5dd683614af60832c))


### Chores

* **internal:** omit unnecessary code ([68ab76a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/68ab76aefb0e2cf61fd228288882664a5018fe54))
* **internal:** remove unnecessary `[@file](https://github.com/file):Suppress("OVERLOADS_INTERFACE")` ([#228](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/228)) ([66933ce](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/66933ce739cdb342094ea1915f7bc91ec6622638))
* **internal:** remove unnecessary `[@file](https://github.com/file):Suppress("OVERLOADS_INTERFACE")` ([#232](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/232)) ([c479746](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/c479746df98b4a37219804bb41d384b2f3f15054))
* **internal:** remove useless `[@file](https://github.com/file):JvmSynthetic` ([#231](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/231)) ([bd00994](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/bd00994d2a5545ae7bcd345e789e7a962d3492fa))


### Styles

* **client:** make toString methods consistent ([#226](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/226)) ([9ab186a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9ab186a3cbc42899174f5e1ca4da91d6b48a8c40))
* **internal:** improve `OkHttpClient` formatting ([#229](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/229)) ([7c9011d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/7c9011d28d51ca0c5ebc88e81f91f98eda7b170e))
* **internal:** improve `RetryingHttpClient` formatting ([#233](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/233)) ([dc12770](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/dc12770cf5df75bd3e6537005e92aa847cbc3d47))
* **internal:** improve terseness of handlers ([#220](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/220)) ([fa5407d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/fa5407d455fb42b1f147bae99ad3a03f6c8b97e1))
* **internal:** improve terseness of Properties.kt ([#221](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/221)) ([be63d21](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/be63d21f72b18710d4571e2082e6032ed4dd5dfd))
* **internal:** move Handlers.kt and HttpRequestBodies.kt to core ([31ec99c](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/31ec99c257d56ffa5a585bde5354d1bf3f23f778))
* **internal:** simplify client build method ([#230](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/230)) ([55be460](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/55be460391dd8a6b9fc704c6ca874bd434937eaa))
* **internal:** update comment formatting ([#227](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/227)) ([9d2416b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/9d2416b354d0d0a20de95617e6642b5ababa6701))
* **internal:** update some spacing ([#225](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/225)) ([003d77d](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/003d77dff7f00bd087d43f1f88df9d4dbade566e))

## 2.20.1 (2024-10-03)

Full Changelog: [v2.20.0...v2.20.1](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.20.0...v2.20.1)

### Styles

* **client:** disable formatting for java boilerplate ([#217](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/217)) ([4efc5d2](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/4efc5d28fbbdd89b58c06c9257ca8b1dc5766bc5))
* **client:** move equals, hashCode, and toString to the bottom of entity files ([#215](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/215)) ([abd9a3b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/abd9a3bfe4e1f4cd7553186b1b530c8ced43687c))

## 2.20.0 (2024-09-24)

Full Changelog: [v2.19.0...v2.20.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.19.0...v2.20.0)

### Features

* **api:** add `usbank_payment_application_reference_id` to `reference_number_type` ([#209](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/209)) ([347658a](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/347658a0906708b8330c959a880f91fdbfb57f89))
* **client:** added structured fields to errors ([#212](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/212)) ([25322b4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/25322b4af31f5ea25edd1938eb97e115d6920823))
* **client:** send retry count header ([#214](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/214)) ([93c32da](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/93c32da160dec4d69f50b67993b085d7775f6d5d))


### Chores

* **api:** fields and parameters added to bulk actions, transactions and invoice creation ([#213](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/213)) ([f261a36](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/f261a360f2163336c965d1c54c1af458a6f6e7df))


### Documentation

* adjust additional properties example ([#211](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/211)) ([0ddce69](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/0ddce69ba00c7234e3e7599c8a716264e88060e2))

## 2.19.0 (2024-09-09)

Full Changelog: [v2.18.1...v2.19.0](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.18.1...v2.19.0)

### Features

* **api:** add us_bank RTP ID's as reference_number_type ([#207](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/207)) ([8282ccb](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/8282ccb881b75a6f4010d61883e775a97d59dfde))


### Chores

* **docs:** update description of `bankgirot` to `se_bankgirot` ([#208](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/208)) ([90050f6](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/90050f62869b2c4b460320d9ecb18fd1881f0a83))
* use headless jdk for containers ([#205](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/205)) ([a5dffc4](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/a5dffc4decd88036499e63430e4ffa7e1eca2372))

## 2.18.1 (2024-08-22)

Full Changelog: [v2.18.0...v2.18.1](https://github.com/Modern-Treasury/modern-treasury-kotlin/compare/v2.18.0...v2.18.1)

### Bug Fixes

* remove additionalBodyProperties from methods that don't support request bodies ([#203](https://github.com/Modern-Treasury/modern-treasury-kotlin/issues/203)) ([36cd19b](https://github.com/Modern-Treasury/modern-treasury-kotlin/commit/36cd19b17746b83783ca7ded4843ab433941a8ac))

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
