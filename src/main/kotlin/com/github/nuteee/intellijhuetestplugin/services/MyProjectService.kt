package com.github.nuteee.intellijhuetestplugin.services

import com.intellij.openapi.project.Project
import com.github.nuteee.intellijhuetestplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
