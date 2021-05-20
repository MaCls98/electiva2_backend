package demo.controllers

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/person")
class PersonController {

    @GetMapping("test")
    fun test(): String = "Done"
}