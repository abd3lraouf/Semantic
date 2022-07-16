plugins {
    id("com.diffplug.spotless")
}

spotless {
    kotlin {
        licenseHeaderFile("$rootDir/gradle/HEADER.txt")
        target("src/**/*.kt")
        ktlint()
    }
    groovyGradle {
        target("**/*.gradle")
        greclipse()
        indentWithSpaces()
    }
    kotlinGradle {
        target("**/*.gradle.kts")
        indentWithSpaces()
    }
}
