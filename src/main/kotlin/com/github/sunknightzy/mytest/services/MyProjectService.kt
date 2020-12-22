package com.github.sunknightzy.mytest.services

import com.intellij.openapi.project.Project
import com.github.sunknightzy.mytest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
