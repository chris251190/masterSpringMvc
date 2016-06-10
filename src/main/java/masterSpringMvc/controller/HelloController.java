package masterSpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Christian on 10.06.2016.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String hallo() {
        return "resultPage";
    }
}
