plugins {
    id("java")
    id("io.freefair.lombok") version "6.3.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.maven.apache.org/maven2")
    }
    maven {
        url = uri("https://jitpack.io")
    }
    maven {
        url = uri("https://repository.sonatype.org/content/groups/public")
    }
}

dependencies {
    testImplementation("org.seleniumhq.selenium:selenium-java:3.141.59")
    testImplementation("io.cucumber:cucumber-java:6.10.4")
    testImplementation("io.cucumber:cucumber-junit:6.10.4")
    testImplementation("net.serenity-bdd:serenity-core:2.4.34")
    testImplementation("net.serenity-bdd:serenity-junit:2.4.34")
    testImplementation("net.serenity-bdd:serenity-cucumber6:2.4.34")
}

tasks.test {
    useJUnitPlatform()
}
