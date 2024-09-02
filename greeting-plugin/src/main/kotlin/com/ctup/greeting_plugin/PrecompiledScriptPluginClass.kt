import org.gradle.api.Plugin
import org.gradle.api.Project

class PrecompiledScriptPluginClass: Plugin<Project> {

    override fun apply(project: Project) {
        project.task("helloPrecompiledScriptPluginClass") {
            doLast {
                println("Hello from PrecompiledScriptPluginClass! \\o/")
            }
        }
    }
}
