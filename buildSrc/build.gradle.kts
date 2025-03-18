plugins {
    `kotlin-dsl`
    kotlin("jvm") version "1.9.20"
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:7.0.2")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20")
}
