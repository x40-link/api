import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    `java-library`
    id("org.jetbrains.kotlin.jvm") version "2.4.20"
    `maven-publish`
}

group = "com.x40.link"
version = providers.gradleProperty("apiVersion").orElse("0.0.0-SNAPSHOT").get()

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
    withSourcesJar()
}

kotlin {
    compilerOptions.jvmTarget = JvmTarget.JVM_17
    sourceSets.main {
        kotlin.srcDir("../gen/android")
    }
}

sourceSets.main {
    java.srcDir("../gen/android")
}

dependencies {
    api("com.google.protobuf:protobuf-javalite:4.32.0")
    api("com.google.protobuf:protobuf-kotlin-lite:4.32.0")
    api("io.grpc:grpc-stub:1.84.0")
    api("io.grpc:grpc-protobuf-lite:1.84.0")
    api("io.grpc:grpc-kotlin-stub:1.5.0")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
    repositories {
        providers.gradleProperty("mavenRepositoryUrl").orNull?.let { repositoryUrl ->
            maven {
                url = uri(repositoryUrl)
                if (providers.environmentVariable("MAVEN_USERNAME").isPresent) {
                    credentials {
                        username = providers.environmentVariable("MAVEN_USERNAME").get()
                        password = providers.environmentVariable("MAVEN_PASSWORD").orNull
                    }
                }
            }
        }
    }
}
