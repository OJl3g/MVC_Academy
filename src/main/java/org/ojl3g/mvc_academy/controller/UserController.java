package org.ojl3g.mvc_academy.controller;

import org.ojl3g.mvc_academy.dto.UserLoginDTO;
import org.ojl3g.mvc_academy.model.User;
import org.ojl3g.mvc_academy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Написать стр для регистрации и к ним контроллер

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/login")
    public String login(Model model) {
        model.addAttribute("user", new UserLoginDTO());
        return "login";
    }


    @PostMapping(name = "login")
    public String loginPost(@ModelAttribute UserLoginDTO userLoginDTO) {



    }
}
