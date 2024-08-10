package kr.gyk.adobby.unsolvedfrontend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CommunityController {

    @GetMapping("/community")
    public String community() {
        return "pages/communityPage";
    }

    @GetMapping("/community/create")
    public String create() {
        return "pages/questionCreatePage";
    }

    @GetMapping("/community/detail")
    public String detail() {
        return "pages/questionDetailPage";
    }
}
