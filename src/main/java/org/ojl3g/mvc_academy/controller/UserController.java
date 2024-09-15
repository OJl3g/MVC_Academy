package org.ojl3g.mvc_academy.controller;

import org.ojl3g.mvc_academy.dto.UserLoginDTO;
import org.ojl3g.mvc_academy.dto.UserRegistrationDTO;
import org.ojl3g.mvc_academy.model.User;
import org.ojl3g.mvc_academy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/register")// Отображение формы регистрации
    public String register(Model model) {
        model.addAttribute("user", new UserRegistrationDTO());
        return "register";// Возвращаем шаблон страницы регистрации
    }

    @PostMapping(value = "/register")// Обработка отправки формы регистрации
    public String registerUser(@ModelAttribute UserRegistrationDTO userRegistrationDTO) {
        User user = new User(); // Преобразуем DTO в сущность User
        user.setLogin(userRegistrationDTO.getLogin());
        user.setPassword(userRegistrationDTO.getPassword());
        user.setPhoneNumber(userRegistrationDTO.getPhoneNumber());
        user.setLevel(userRegistrationDTO.getLevel());

        userService.save(user); // Сохраняем пользователя через сервис

        return "redirect:/";// После регистрации перенаправляем на страницу логина
    }

    @GetMapping(value = "/login")
    public String login(Model model) {
        model.addAttribute("user", new UserLoginDTO());
        return "login";
    }


    @PostMapping(name = "login")
    public String loginPost(@ModelAttribute UserLoginDTO userLoginDTO) {
        return null;


    }
}
