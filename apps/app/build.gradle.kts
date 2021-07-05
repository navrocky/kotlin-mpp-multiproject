plugins {
    kotlin("multiplatform") version "1.5.20"
    application
}

group = "com.acme"
version = "1.0"

application {
    mainClass.set("MainKt")
}

kotlin {

    jvm {
        withJava()
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":libs:lib"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
            }
        }
    }
}
