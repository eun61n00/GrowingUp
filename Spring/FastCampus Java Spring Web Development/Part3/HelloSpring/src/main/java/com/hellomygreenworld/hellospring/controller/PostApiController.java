package com.hellomygreenworld.hellospring.controller;

import com.hellomygreenworld.hellospring.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/post")
public class PostApiController {

    @PostMapping("/user")
    public void post(@RequestBody Map<String, Object> userData) {

        userData.forEach((key, value) -> {
            System.out.println("key: " + key);
            System.out.println("value: " + value);
            System.out.println("");
        });
    }

    @PostMapping("/userdto")
    public void postUserDTO(@RequestBody  UserDTO user) {
        System.out.println(user.toString());
    }

}
