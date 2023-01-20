package com.hellomygreenworld.hellospring.controller;

import com.hellomygreenworld.hellospring.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/gethello")
    public String getHello() {
        return "get Hello";
    }

    @RequestMapping(value = "/gethi", method = RequestMethod.GET)
    public String getHi() {
        return "get Hi";
    }

    // http://localhost:8080/api/path-variable/{id}
    @GetMapping("/path-variable/{id}")
    public String pathVariable(@PathVariable(name="id") String idValue) {
        System.out.println("path-variable: " + idValue);
        return idValue;
    }

    //http://localhost:8080/api/query-param?user={user_name}&email={email}
    @GetMapping("/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {

        StringBuilder stringBuilder = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("");

            stringBuilder.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return stringBuilder.toString();
    }

    @GetMapping("/query-param02")
    public String queryParam02(
            @RequestParam String user,
            @RequestParam String email
    ) {
        return user + " " + email + "\n";
    }

    @GetMapping("/query-param03")
    public String queryParam03(UserDTO user) {
        return user.toString();
    }

}
