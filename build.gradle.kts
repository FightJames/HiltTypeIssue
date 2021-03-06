// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    val kotlin_version by extra("1.3.72")

    repositories {
        google()
        jcenter()
    }


    dependencies {
        classpath ("com.android.tools.build:gradle:4.1.0")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.28-alpha")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

plugins {
    id ("myplugin")
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}


//task clean(type: Delete) {
//    delete rootProject.buildDir
//}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
