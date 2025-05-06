pluginManagement {
    repositories {
        maven {
            url = uri("<artifacts_url>")
            credentials {
                username = ""
                password = ""
            }
            authentication {
                register("basic", BasicAuthentication::class)
            }
        }
    }
    includeBuild("../../AwesomeProject/node_modules/@react-native/gradle-plugin")
}

plugins {
    id("com.facebook.react.settings")
}

extensions.configure<com.facebook.react.ReactSettingsExtension> {
    autolinkLibrariesFromCommand(
        workingDirectory = File("../../AwesomeProject/")
    )
}

rootProject.name = "AwesomeProject"
include(":app")
includeBuild("../../AwesomeProject/node_modules/@react-native/gradle-plugin")