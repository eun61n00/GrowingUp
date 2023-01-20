package com.hellomygreenworld.hellospring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/delete")
public class DeleteApiController {

    @DeleteMapping("/{userId}")
    // http://localhost:8080/api/delete/100?account=user01
    public void delete(@PathVariable String userId, @RequestParam String account) {
        System.out.println(userId);
        System.out.println(account);
    }

}
