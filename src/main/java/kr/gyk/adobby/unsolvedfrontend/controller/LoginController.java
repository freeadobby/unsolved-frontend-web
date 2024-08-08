package kr.gyk.adobby.unsolvedfrontend.controller;

import jakarta.validation.Valid;
import kr.gyk.adobby.unsolvedfrontend.dto.user.SignRequestDTO;
import kr.gyk.adobby.unsolvedfrontend.dto.user.SignResponseDTO;
import kr.gyk.adobby.unsolvedfrontend.form.LoginForm;
import kr.gyk.adobby.unsolvedfrontend.form.RegisterForm;
import kr.gyk.adobby.unsolvedfrontend.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class LoginController {

    private final UserService userService;

    @GetMapping("/")
    public String index() {
        return "common/layout.html";
    }

    @GetMapping("/user/login")
    public String login(LoginForm loginForm){
        return "pages/loginPage.html";
    }

    @PostMapping("/user/login")
    public String loginPost(@Valid LoginForm loginForm){
        userService.login(loginForm);
        return "redirect:/user/myPage";
    }

    @GetMapping("/user")
    public String register(RegisterForm registerForm){
        return "pages/registerPage";
    }

    @PostMapping("/user")
    public String registerPost(@Valid RegisterForm registerForm){
        // TODO :: 백엔드 요청
        userService.register(registerForm);
        return "redirect:/user/myPage";
    }

}
