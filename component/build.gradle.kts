plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    commonConfig()

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.AndroidX.materialDesign)
}