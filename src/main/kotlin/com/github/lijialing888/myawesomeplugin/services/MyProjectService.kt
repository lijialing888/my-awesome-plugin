package com.github.lijialing888.myawesomeplugin.services

import com.github.lijialing888.myawesomeplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
