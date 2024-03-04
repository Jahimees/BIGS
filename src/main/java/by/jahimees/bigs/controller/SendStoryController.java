package by.jahimees.bigs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static by.jahimees.bigs.util.constant.PageConstant.SEND_STORY;

@Controller
public class SendStoryController {

    @GetMapping("/send_story")
    public String openSendStoryPage() {
        return SEND_STORY;
    }
}
