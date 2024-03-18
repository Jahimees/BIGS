package by.jahimees.bigs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static by.jahimees.bigs.util.constant.PageConstant.LOGIN;
import static by.jahimees.bigs.util.constant.PageConstant.REGISTER;

@Controller
public class AuthController {

    @GetMapping("/register")
    public String openRegisterPage() {
        return REGISTER;
    }

    @GetMapping("/login")
    public String openLoginPage() {
        return LOGIN;
    }
}
