plugins {
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_12
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.5.0")
}

tasks.test {
    useJUnitPlatform()
}
