plugins {
    id("modern-treasury.kotlin")
    application
}

dependencies {
    implementation(project(":modern-treasury-kotlin"))
}

application {
    // Use `./gradlew :modern-treasury-kotlin-example:run` to run `Main`
    // Use `./gradlew :modern-treasury-kotlin-example:run -Dexample=Something` to run `SomethingExample`
    mainClass = "com.moderntreasury.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
