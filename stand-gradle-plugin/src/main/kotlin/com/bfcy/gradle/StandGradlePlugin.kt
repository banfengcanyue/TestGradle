package com.bfcy.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class StandGradlePlugin : Plugin<Project> {
    override fun apply(p0: Project) {
        println("Method 3: Test Gradle in stand")
    }
}