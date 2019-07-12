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
    val junitVersion = "5.5.0"
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks.test {
    useJUnitPlatform()
}
