plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.editorsaku.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.editorsaku.app"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    // Kunci tetap: APK dari setiap build bisa dipasang di atas versi lama tanpa kehilangan data.
    signingConfigs {
        create("editor") {
            storeFile = file("editor.keystore")
            storePassword = "editorsaku"
            keyAlias = "editor"
            keyPassword = "editorsaku"
        }
    }
    buildTypes {
        getByName("debug") { signingConfig = signingConfigs.getByName("editor") }
        getByName("release") {
            signingConfig = signingConfigs.getByName("editor")
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
    lint { abortOnError = false; checkReleaseBuilds = false }
}
