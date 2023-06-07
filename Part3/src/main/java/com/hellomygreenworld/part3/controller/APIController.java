package com.hellomygreenworld.part3.controller;

import com.hellomygreenworld.part3.dto.UserRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {

    @GetMapping
    public UserRequest user(UserRequest userRequest) {
        return userRequest;
    }

}
