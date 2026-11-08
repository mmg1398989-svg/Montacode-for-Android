pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        exclusiveContent {
            forRepository { maven("https://maven.aliyun.com/repository/central") }
            filter { includeModule("org.jetbrains.kotlin", "kotlin-compiler-embeddable") }
        }
        google()
        mavenCentral()
    }
}

rootProject.name = "STARACT"
include(":core", ":app")
