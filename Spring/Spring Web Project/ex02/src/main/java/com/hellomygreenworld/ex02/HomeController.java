package com.hellomygreenworld.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model) {

        model.addAttribute("greeting", "hello world");

        return "home";
    }

}