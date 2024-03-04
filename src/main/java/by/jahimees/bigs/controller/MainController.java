package by.jahimees.bigs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static by.jahimees.bigs.util.constant.PageConstant.MAIN;

@Controller
public class MainController {

    @GetMapping("/main")
    public String openMainPage() {
        return MAIN;
    }
}
