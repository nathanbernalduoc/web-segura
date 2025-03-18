package com.example.web_seguro;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(@RequestParam(name="name", required=false, defaultValue = "Seguridad y calidad en el Desarrollo") String name, Model model) {
        model.addAttribute("name", name);
        return "Home";
    }
    
    @GetMapping("/")
    public String root(@RequestParam(name="name", required=false, defaultValue = "Seguridad y calidad en el Desarrollo") String name, Model model) {
        model.addAttribute("name", name);
        return "Home";
    }
    
}
