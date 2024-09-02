// ./gradlew helloPrecompiledScriptPlugin

tasks.register("helloPrecompiledScriptPlugin") {
    doLast {
        println("Hello from the PrecompiledScriptPlugin")
    }
}
