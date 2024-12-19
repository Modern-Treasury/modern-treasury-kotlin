plugins {
    id("modern-treasury.kotlin")
    application
}

dependencies {
    implementation(project(":modern-treasury-kotlin"))
}

application {
    mainClass = "com.moderntreasury.api.example.MainKt"
}
