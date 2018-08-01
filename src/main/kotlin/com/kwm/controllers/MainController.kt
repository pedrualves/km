package com.kwm.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/")
class MainController {

    @GetMapping()
    fun index(): String = "index"

}
