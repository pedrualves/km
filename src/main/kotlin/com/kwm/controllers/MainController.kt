package com.kwm.controllers

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class MainController {

    data class Message(val code: Int, val message: String)

    @GetMapping()
    fun index(): Message {
        return Message(0, "OK")
    }

}
