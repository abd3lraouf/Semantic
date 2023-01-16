plugins {
    `kotlin-dsl`
    id("com.diffplug.spotless") version "6.8.0"
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:6.13.0")
}

spotless {
    kotlinGradle {
        ktlint()
    }
}
