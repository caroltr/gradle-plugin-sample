package com.ctup.greeting_plugin.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

abstract class GreetTask: DefaultTask() {

    @get:Input
    val name: Property<String> = project.objects.property(String::class.java)

    @TaskAction
    fun run() {
        println(name.get())
    }
}