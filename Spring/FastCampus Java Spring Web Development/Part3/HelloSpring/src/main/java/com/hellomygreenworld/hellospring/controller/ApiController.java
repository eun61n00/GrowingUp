package com.hellomygreenworld.hellospring.controller;

import com.hellomygreenworld.hellospring.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api-controller")
public class ApiController {

    @GetMapping("/hello")
    public String  hello() {
        return "hello spring boot!";
    }

    // TEXT response
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    @PostMapping("/json")
    public UserDTO json(@RequestBody UserDTO userDTO) {
        return userDTO;
    }

    @PutMapping("/put")
    public ResponseEntity<UserDTO> put(@RequestBody UserDTO userDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userDTO);
    }

}
