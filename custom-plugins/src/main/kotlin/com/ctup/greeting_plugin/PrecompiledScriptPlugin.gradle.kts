// ./gradlew helloPrecompiledScriptPlugin

tasks.register("helloPrecompiledScriptPlugin") {
    group = "Sample"

    doLast {
        println("Hello from the PrecompiledScriptPlugin")
    }
}
