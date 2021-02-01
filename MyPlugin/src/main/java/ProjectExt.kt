import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion

fun BaseExtension.defaultProjectConfig() {
    compileSdkVersion(30)
    buildToolsVersion("30.0.2")
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(30)
    }

    compileOptions {
        targetCompatibility = JavaVersion.VERSION_1_8
        sourceCompatibility = JavaVersion.VERSION_1_8
    }

    lintOptions {
        isAbortOnError = false
        xmlReport = false
    }
}