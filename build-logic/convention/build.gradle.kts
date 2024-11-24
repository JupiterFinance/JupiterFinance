plugins {
  `kotlin-dsl`
}

dependencies {
  compileOnly(libs.android.gradle)
  compileOnly(libs.compose.gradle)
  compileOnly(libs.kotlin.gradle)
  compileOnly(libs.ksp.gradle)
}

gradlePlugin {
  plugins {
    register("jupiterfinance.application") {
      id = "jupiterfinance.application"
      implementationClass = "ApplicationConventionPlugin"
    }
    
    register("jupiterfinance.library") {
      id = "jupiterfinance.library"
      implementationClass = "LibraryConventionPlugin"
    }
    
    register("jupiterfinance.compose") {
      id = "jupiterfinance.compose"
      implementationClass = "ComposeConventionPlugin"
    }
  }
}