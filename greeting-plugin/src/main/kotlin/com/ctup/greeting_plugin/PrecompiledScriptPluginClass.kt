import org.gradle.api.Plugin
import org.gradle.api.Project

class PrecompiledScriptPluginClass: Plugin<Project> {

    override fun apply(project: Project) {
        project.task("helloPrecompiledScriptPluginClass") {
            group = "Sample"
            description = "Exemplifies how to implement a precompiled script plugin using a Kotlin class"
            doLast {
                println("Hello from PrecompiledScriptPluginClass! \\o/")
            }
        }
    }
}
