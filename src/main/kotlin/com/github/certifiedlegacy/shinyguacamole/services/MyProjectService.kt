package com.github.certifiedlegacy.shinyguacamole.services

import com.intellij.openapi.project.Project
import com.github.certifiedlegacy.shinyguacamole.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
