# Changelog

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
