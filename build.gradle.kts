import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.72"
    kotlin("plugin.spring") version "1.3.72"
}

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.3.2.RELEASE")
        classpath("io.spring.gradle:dependency-management-plugin:1.0.9.RELEASE")
    }
}


subprojects {

    apply( plugin = "org.springframework.boot" )
    apply( plugin = "io.spring.dependency-management")
    apply( plugin = "kotlin" )
    apply( plugin = "kotlin-kapt" )
    apply( plugin = "org.jetbrains.kotlin.plugin.spring" )

    group = "com.kenny"
    version = "0.0.1.RELEASE"
    java.sourceCompatibility = JavaVersion.VERSION_11

    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        compileOnly("org.projectlombok:lombok:1.18.12")
        testImplementation("org.springframework.boot:spring-boot-starter-test") {
            exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
        }
    }

    repositories {
        mavenCentral()
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }
}

