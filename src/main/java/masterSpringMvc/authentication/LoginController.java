package masterSpringMvc.authentication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Christian on 21.06.2016.
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String authenticate() {
        return "login";
    }
}
