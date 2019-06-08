package tuugii.mn.registrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/registrar", "/registrar/home"})
    public String Home(){
        return "home/index";
    }

}
