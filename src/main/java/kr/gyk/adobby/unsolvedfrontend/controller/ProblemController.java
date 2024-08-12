package kr.gyk.adobby.unsolvedfrontend.controller;

import kr.gyk.adobby.unsolvedfrontend.dto.problem.ProblemDetailDTO;
import kr.gyk.adobby.unsolvedfrontend.dto.problem.ProblemDetailListDTO;
import kr.gyk.adobby.unsolvedfrontend.dto.problem.ProblemTagDTO;
import kr.gyk.adobby.unsolvedfrontend.form.TierForm;
import kr.gyk.adobby.unsolvedfrontend.service.ProblemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Slf4j
@RequiredArgsConstructor
@Controller
public class ProblemController {

    private final ProblemService problemService;

    @GetMapping("/problemList")
    public String problemList() {
        return "pages/problemList";
    }

    @GetMapping("/problemList/tier")
    public String problemTierList(@RequestParam String tierName, String num, Model model, Model problemModel) {
        TierForm tierForm = new TierForm();
        tierForm.setTierName(tierName);
        tierForm.setNum(num);
        model.addAttribute("tierForm", tierForm);
        //TODO :: 문제 리스트 받아서 problemModel addAttribute
        ArrayList<ProblemTagDTO> arrayList2 = new ArrayList<>();
        ArrayList<ProblemDetailDTO> arrayList = new ArrayList<>();
        arrayList2.add(ProblemTagDTO.builder()
                .name("구현")
                .build());
        arrayList2.add(ProblemTagDTO.builder()
                .name("수학")
                .build());
        arrayList.add(ProblemDetailDTO.builder()
                        .id(1234L)
                        .tier(3)
                        .title("배현호가못푼문제")
                        .acceptedUserCount(123412L)
                        .tags(arrayList2)
                .build());
        arrayList.add(ProblemDetailDTO.builder()
                .id(123412321L)
                .tier(21)
                .title("배현호가푼문제")
                        .tags(arrayList2)
                        .acceptedUserCount(68679L)
                .build());
        ProblemDetailListDTO problemListDTO = ProblemDetailListDTO.builder()
                .problemList(arrayList)
                .build();
        problemModel.addAttribute("problemDetailList", problemListDTO);

        return "pages/problemTierList";
    }

    @GetMapping("/problemList/type")
    public String problemTypeList(@RequestParam String typeName, Model model, Model problemModel) {
        model.addAttribute("typeName", typeName);

        ArrayList<ProblemTagDTO> arrayList2 = new ArrayList<>();
        ArrayList<ProblemDetailDTO> arrayList = new ArrayList<>();
        arrayList2.add(ProblemTagDTO.builder()
                .name("구현")
                .build());
        arrayList2.add(ProblemTagDTO.builder()
                .name("수학")
                .build());
        arrayList.add(ProblemDetailDTO.builder()
                .id(1234L)
                .tier(3)
                .title("배현호가못푼문제")
                .acceptedUserCount(123412L)
                .tags(arrayList2)
                .build());
        arrayList.add(ProblemDetailDTO.builder()
                .id(123412321L)
                .tier(21)
                .title("배현호가푼문제")
                .tags(arrayList2)
                .acceptedUserCount(68679L)
                .build());
        ProblemDetailListDTO problemListDTO = ProblemDetailListDTO.builder()
                .problemList(arrayList)
                .build();

        problemModel.addAttribute("problemDetailList", problemListDTO);

        return "pages/problemTypeList";
    }

    @GetMapping("/problemList/total")
    public String problemTotalList(Model problemModel) {
        ProblemDetailListDTO problemListDTO = new ProblemDetailListDTO();
        //TODO :: 전체 문제 받아오기
        problemModel.addAttribute("problemDetailList", problemListDTO);

        return "pages/problemTotalList";
    }

}
