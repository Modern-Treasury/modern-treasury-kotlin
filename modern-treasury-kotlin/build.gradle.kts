plugins {
    id("modern-treasury.kotlin")
    id("modern-treasury.publish")
}

dependencies {
    api(project(":modern-treasury-kotlin-client-okhttp"))
}
