// Sample of Script Plugin in another file
// ./gradlew helloAnotherScriptPlugin
class GreetingAnotherScriptPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.task("helloAnotherScriptPlugin") {
            doLast {
                println("This is an example of Script Plugin in a separate file")
            }
        }
    }
}

// Apply the plugin
apply<GreetingAnotherScriptPlugin>()