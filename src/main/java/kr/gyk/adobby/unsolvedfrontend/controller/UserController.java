package kr.gyk.adobby.unsolvedfrontend.controller;

import kr.gyk.adobby.unsolvedfrontend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    @GetMapping("/user/myPage")
    public String myPage(){
        return "pages/myPage.html";
    }

    @GetMapping("/user/myPage/solved")
    public String myPageSolved(){
        return "pages/myPage_solved.html";
    }

    @GetMapping("/user/myPage/history")
    public String myPageHistory(){
        return "pages/myPage_history.html";
    }

    @GetMapping("/user/myPage/overView")
    public String myPageOverView(){
        return "pages/myPage_overView.html";
    }

}
