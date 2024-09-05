# Gradle Plugin Sample

This project contains examples of custom plugin implementations.

It consists of two modules:

- **:app -** the main module

- **:custom-plugins -** contains the implemented custom plugins

## Important files

- **settings.gradle.kts** - contains the `includeBuild` declaration which includes the `custom-plugins` module as included build. For more information, see the ([composite builds](https://docs.gradle.org/current/userguide/composite_builds.html)) documentation.
  
- **app/build.gradle.kts**
    - GreetingScriptPlugin - an example of a script plugin defined directly in the `build.gradle file` (this approach is not recommended)
    - Applying plugins:
        - `apply<GreetingScriptPlugin>()` - when the plugin declaration is within the same file
        - `apply(from = "ScriptPlugin.gradle.kts")` - apply a plugin from another file
        - To add precompiled plugins from the `buildSrc` folder or `composite builds`:
     
          ```
          apply(plugin = "PrecompiledScriptPluginClass")
          ```
          
          or

          ```
          plugins {
              ...
              id("PrecompiledScriptPlugin")
          
          }
          ```

- **custom-plugins/build.gradle.kts** - define the built plugins using the `gadlePlugin {}` script block
