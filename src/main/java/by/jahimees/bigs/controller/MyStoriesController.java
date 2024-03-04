package by.jahimees.bigs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static by.jahimees.bigs.util.constant.PageConstant.MY_STORIES;

@Controller
public class MyStoriesController {

    @GetMapping("/account/my_stories")
    public String openMyStoriesPage() {
        return MY_STORIES;
    }
}
