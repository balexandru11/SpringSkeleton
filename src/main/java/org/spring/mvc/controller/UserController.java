package org.spring.mvc.controller;

import org.apache.commons.lang3.StringUtils;
import org.spring.mvc.entity.User;
import org.spring.mvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author balexandru
 */
@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user, ModelMap model) {
        User currentUser = (User) model.get("user");
        if (StringUtils.isBlank(currentUser.getPassword()) ||
                StringUtils.isBlank(currentUser.getUsername()) ||
                StringUtils.isBlank(currentUser.getCountry())) {
            model.addAttribute("error", "Please complete all fields");
            return "userlist";
        }
        userRepository.save(user);
        List<User> userList = getUserList();
        model.addAttribute("userlist", userList);
        return "userlist";
    }

    @RequestMapping(value = "/deleteuser/{id}", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity deleteuser(@PathVariable("id") long id) {
        userRepository.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    public List<User> getUserList() {
        return userRepository.findAll();
    }


}
