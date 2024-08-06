package kr.gyk.adobby.unsolvedfrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainpageController {

    @GetMapping("/mainpage")
    public String mainPage(Model model) {
        return "mainpage.html";
    }
}