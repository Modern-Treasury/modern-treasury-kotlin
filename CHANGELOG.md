# Changelog

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
