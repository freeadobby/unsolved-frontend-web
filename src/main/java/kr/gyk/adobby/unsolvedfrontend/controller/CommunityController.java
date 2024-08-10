package kr.gyk.adobby.unsolvedfrontend.controller;

import jakarta.validation.Valid;
import kr.gyk.adobby.unsolvedfrontend.form.AnswerForm;
import kr.gyk.adobby.unsolvedfrontend.form.QuestionForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class CommunityController {

    @GetMapping("/community")
    public String community(Model model) {
        List<QuestionForm> questionList = new ArrayList<>();
        //TODO :: 대충 질문 리스트 받아오기
        model.addAttribute("questionList",questionList);
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

    @PostMapping("/answer/create/{id}")
    public String createAnswer(Model model, @PathVariable("id") Long id, @RequestParam(value="content") String content) {
        QuestionForm question = new QuestionForm();
        AnswerForm answerForm = new AnswerForm();
        // TODO: 답변 내용을 answer 에 넣고 id로 질문 받아온뒤 question.answers 에 넣고 저장하면 될듯
        return String.format("redirect:/community/detail?id=%s", id);
    }
}
