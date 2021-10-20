package com.github.chetankmcs.fzfintellij.services

import com.intellij.openapi.project.Project
import com.github.chetankmcs.fzfintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
