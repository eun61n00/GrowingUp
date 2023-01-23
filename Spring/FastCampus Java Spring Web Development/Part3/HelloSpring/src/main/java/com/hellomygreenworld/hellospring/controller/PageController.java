package com.hellomygreenworld.hellospring.controller;

import com.hellomygreenworld.hellospring.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    // Json을 어떻게 내려줄것인가?
    // ResponseEntity로 내려주기

    // ResponseBody로 내려주기
    @ResponseBody
    @GetMapping("/user")
    public UserDTO user() {
        var user = new UserDTO();
        user.setUserId(100);
        user.setUserAddress("hellomygreenworld");
        user.setUserPassword("P@ssw0rd");
        return user;
    }

}
