plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit)

    implementation(libs.guava)
    implementation("org.springframework:spring-core:6.1.5")
    implementation("org.springframework:spring-context:6.1.5")
    implementation("org.springframework:spring-beans:6.1.5")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

application {
    mainClass = "org.example.App"
}
