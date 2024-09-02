plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)

    // in order to this ID be recognized, it must be located in buildSrc/src/main/kotlin folder
    id("PrecompiledScriptPlugin")
}

android {
    namespace = "com.ctup.gradlepluginsample"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ctup.gradlepluginsample"
        minSdk = 31
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}

// Sample of Script Plugin
// ./gradlew helloScriptPlugin
class GreetingScriptPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.task("helloScriptPlugin") {
            doLast {
                println("This is an example of Script Plugin")
            }
        }
    }
}

// Apply the plugin implemented in this file
apply<GreetingScriptPlugin>()

// Apply `ScriptPlugin.gradle.kts` in this file
apply(from = "ScriptPlugin.gradle.kts")