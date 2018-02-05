package org.spring.mvc.controller;

import org.spring.mvc.entity.User;
import org.spring.mvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String redirect() {
        return "redirect:/userlist";
    }

    @RequestMapping("/userlist")
    public String userList(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("userlist", userRepository.findAll());
        return "userlist";
    }
}
