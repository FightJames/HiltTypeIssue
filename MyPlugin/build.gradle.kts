// projectRoot/buildSrc2/build.gradle.kts

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    google()
    jcenter()
    gradlePluginPortal()
}

dependencies {
    implementation("com.android.tools.build:gradle:4.1.0")
}


gradlePlugin {
    // Add fake plugin, if you don't have any
    plugins.register("myplugin") {
        id = "myplugin"
        implementationClass = "MyPlugin"
    }
    // Or provide your implemented plugins
}
//class ClassLoaderPlugin: Plugin<Project> {
//    override fun apply(target: Project) {
//        // no-op
//    }
//}
//
//object Deps {
//    const val kotlinStdLib = "..."
//}