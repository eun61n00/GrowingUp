package com.hellomygreenworld.hellospring.controller;

import com.hellomygreenworld.hellospring.dto.CarUserDTO;
import com.hellomygreenworld.hellospring.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api/put")
public class PutApiController {

    @PutMapping("/user")
    public void user(@RequestBody Map<String, Objects> stringObjectsMap) {

        stringObjectsMap.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value + "\n");
        });

    }

    @PutMapping("/userdto")
    public void userdto(@RequestBody UserDTO user) {
        System.out.println(user.toString());
    }

    @PutMapping("/caruserdto/{userId}")
    public CarUserDTO carUserDto(@RequestBody CarUserDTO carUserDTO, @PathVariable(name="userId") String userName) {
        System.out.println(carUserDTO.toString());
        System.out.println(userName);
        carUserDTO.setId(userName);
        return carUserDTO;
    }

}
