package org.spring.mvc.controller;

import org.spring.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

//    List<User> objects = new ArrayList<>();

    @RequestMapping("/")
    public String redirect() {
        return "redirect:/userlist";
    }

    @RequestMapping("/userlist")
    public String userList(Model model) {
        model.addAttribute("user", new User());
        return "userlist";
    }
}
