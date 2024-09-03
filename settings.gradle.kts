pluginManagement {
    includeBuild("custom-plugins")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

// https://medium.com/@ttdevelopment/encountering-the-unable-to-make-progress-running-work-error-in-gradle-6bc363ac1eb8
gradle.startParameter.excludedTaskNames.addAll(listOf(":custom-plugins:testClasses"))

rootProject.name = "Gradle Plugin Sample"
include(":app")
