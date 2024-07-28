package kr.gyk.adobby.unsolvedfrontend;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LayoutController {

    @GetMapping("/")
    public String layout(Model model) {
        return "common/layout";
    }
}
