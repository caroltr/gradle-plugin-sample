plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        create("PrecompiledScriptPluginClass") {
            id = "PrecompiledScriptPluginClass"
            implementationClass = "PrecompiledScriptPluginClass"
        }
    }
}

repositories {
    mavenCentral()
}
