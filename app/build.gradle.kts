plugins {
    alias(libs.plugins.android.application)
    id("com.google.gms.google-services") // Firebase Google Services Plugin
}

android {
    namespace = "com.example.fit_trackai_project"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.fit_trackai_project"
        minSdk = 33
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    // Firebase SDK - Firebase Bill of Materials (BOM)
    implementation(platform("com.google.firebase:firebase-bom:33.7.0"))  // Ensures compatibility between Firebase SDK versions

    // Firebase Authentication
    implementation("com.google.firebase:firebase-auth")  // To handle user authentication (login, signup, etc.)

    // Firebase Analytics (optional, but useful for tracking user activity)
    implementation("com.google.firebase:firebase-analytics")

    // Android dependencies
    implementation(libs.appcompat)  // Compatibility library
    implementation(libs.material)   // Material Components for UI
    implementation(libs.activity)   // For Activity support
    implementation(libs.constraintlayout)  // Layout support

    // Testing dependencies
    testImplementation(libs.junit)  // For unit testing
    androidTestImplementation(libs.ext.junit)  // For Android-specific testing
    androidTestImplementation(libs.espresso.core)  // UI testing

}
