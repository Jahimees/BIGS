package by.jahimees.bigs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static by.jahimees.bigs.util.constant.PageConstant.SEARCH;

@Controller
public class SearchController {

    @GetMapping("/search")
    public String openSearchPage() {
        return SEARCH;
    }
}
