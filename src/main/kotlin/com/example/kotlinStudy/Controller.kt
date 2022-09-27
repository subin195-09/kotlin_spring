package com.example.kotlinStudy

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class Controller {

    @GetMapping("/")
    fun blog(model: Model): String {
        print("이게 되는게 맞나요..?")
        model["title"] = "Blog"
        print("model error?")
        return "blog"
    }
}