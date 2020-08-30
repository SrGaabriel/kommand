plugins {
    kotlin("multiplatform") apply true
}

group = "com.gabriel.kommand.project"
version = "1.0"

repositories {
    mavenCentral()
}

kotlin {
    /* Targets configuration omitted. 
    *  To find out how to configure the targets, please follow the link:
    *  https://kotlinlang.org/docs/reference/building-mpp-with-gradle.html#setting-up-targets */

    sourceSets {
        val commonMain by getting {
            repositories {
                jcenter()
            }
            dependencies {
                implementation(kotlin("stdlib-common"))

                api("org.koin:koin-core:3.0.0-alpha-2")

                api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.5")
                api("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.3.5")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
    }
}