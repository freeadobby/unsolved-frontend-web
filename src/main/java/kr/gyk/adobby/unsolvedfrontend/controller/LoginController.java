package kr.gyk.adobby.unsolvedfrontend.controller;

import kr.gyk.adobby.unsolvedfrontend.dto.user.SignRequestDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login.html";
    }

    @PostMapping("/login")
    public String loginPost(SignRequestDTO signRequestDTO){
        SignRequestDTO.builder()
                .email("email")
                .password("password")
                .build();
        if(signRequestDTO.getEmail().equals("배현호")){
            if(signRequestDTO.getPassword().equals("배현호")){
                return "mypage.html";
            }
        }
        return "login.html";
    }
}
