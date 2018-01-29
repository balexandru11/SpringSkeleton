package org.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        return "index";

    }

    @RequestMapping("/hellojsp")
    public String hello2(Model model) {
        model.addAttribute("greeting", "Hello Spring MVC");
        return "helloworld";

    }
}
