package kr.gyk.adobby.unsolvedfrontend.controller;

import kr.gyk.adobby.unsolvedfrontend.dto.user.SignRequestDTO;
import kr.gyk.adobby.unsolvedfrontend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class LoginController {

    private final UserService userService;

    @GetMapping("/")
    public String index() {
        return "common/layout.html";
    }

    @GetMapping("/user/login")
    public String login(){
        return "pages/loginPage.html";
    }

    @PostMapping("/user/login")
    public String loginPost(SignRequestDTO signRequestDTO){
        if(userService.postUserObject(signRequestDTO) != null) {
                return "redirect:/";
        }
        return "pages/loginPage.html";
    }

    @GetMapping("/user")
    public String register(){
        return "pages/registerPage.html";
    }

    @GetMapping("/user/myPage")
    public String myPage(){
        return "pages/myPage.html";
    }
}
