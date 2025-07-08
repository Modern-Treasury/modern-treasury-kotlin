import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    signAllPublications()
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaHtml"),
            sourcesJar = true,
        )
    )

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
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
