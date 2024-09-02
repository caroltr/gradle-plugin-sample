plugins {
    `java-gradle-plugin` // necessary for creating a Gradle plugin
    `kotlin-dsl` // required for writing build scripts and plugins in Kotlin
}

gradlePlugin {
    plugins {
        create("greetingPlugin") {
            id = "MyGreetingPlugin"
            implementationClass = "com.ctup.greeting_plugin.GreetingPlugin"
        }

        create("PrecompiledScriptPluginClass") {
            id = "PrecompiledScriptPluginClass"
            implementationClass = "PrecompiledScriptPluginClass"
        }
    }
}

repositories {
    mavenCentral()
}