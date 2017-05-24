package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by panyu on 2017/5/24.
 */
@Controller

public class LoginController {
    @RequestMapping(value = "/login")
    public String printHello(ModelMap model) {
//        model.addAttribute("msg", "Spring MVC Hello World");
//        model.addAttribute("name", "yuntao");

        System.out.print("hello");
        return "Views/index";

    }
}
