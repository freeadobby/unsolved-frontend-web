package kr.gyk.adobby.unsolvedfrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionpageController {

    @GetMapping("/question")
    public String questionPage(Model model) {
        return "question.html";
    }
}
