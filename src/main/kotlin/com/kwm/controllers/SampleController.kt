package com.kwm.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class SampleController {

    data class Message(val code: Int, val message: String)

    @GetMapping("/health")
    fun health(): Message = Message(0, "OK")

}