package kr.gyk.adobby.unsolvedfrontend.controller;

import jakarta.validation.Valid;
import kr.gyk.adobby.unsolvedfrontend.form.QuestionForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequiredArgsConstructor
public class CommunityController {

    @GetMapping("/community")
    public String community() {
        return "pages/communityPage";
    }

    @GetMapping("/community/create")
    public String create(QuestionForm questionForm) {
        return "pages/questionCreatePage";
    }

    @PostMapping("/community/create")
    public String createPost(@Valid QuestionForm questionForm) {
        //TODO :: questionForm 의 질문 정보 DB? 리포지토리? 에 저장

        return "redirect:/community";
    }

    @GetMapping("/community/detail")
    public String detail(@RequestParam Long id) {
        //TODO :: id 기반으로 해서 질문 가져오기
        return "pages/questionDetailPage";
    }
}
