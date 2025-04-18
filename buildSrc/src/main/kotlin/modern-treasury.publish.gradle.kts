plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Modern Treasury")
                description.set("The Modern Treasury REST API. Please see https://docs.moderntreasury.com for\nmore details.")
                url.set("https://docs.moderntreasury.com")

                licenses {
                    license {
                        name.set("MIT")
                    }
                }

                developers {
                    developer {
                        name.set("Modern Treasury")
                        email.set("sdk-feedback@moderntreasury.com")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/Modern-Treasury/modern-treasury-kotlin.git")
                    developerConnection.set("scm:git:git://github.com/Modern-Treasury/modern-treasury-kotlin.git")
                    url.set("https://github.com/Modern-Treasury/modern-treasury-kotlin")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
