import com.ctup.greeting_plugin.tasks.GreetTask
import org.gradle.api.InvalidUserDataException
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.register

// ./gradlew greet -PmyName="Jane Doe"
class PrecompiledScriptPluginClass: Plugin<Project> {

    override fun apply(project: Project) {
        project.tasks.register<GreetTask>("greet") {
            group = "Sample"
            description = "Exemplifies how to implement a precompiled script plugin using a Kotlin class"

            val nameArg = project.properties["myName"]

            if (nameArg == null) {
                throw InvalidUserDataException("Missing name")
            } else {
                name.set(nameArg.toString())
            }
        }
    }
}
