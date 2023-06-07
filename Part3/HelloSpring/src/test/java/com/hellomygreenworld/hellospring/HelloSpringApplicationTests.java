package com.hellomygreenworld.hellospring;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hellomygreenworld.hellospring.dto.UserDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloSpringApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("====================");

        var objectMapper = new ObjectMapper();
        var user = new UserDTO(100, "greenworld", "user100@gmail.com", "P@ssw0rd");
        var text = objectMapper.writeValueAsString(user);

        System.out.println(text);

        System.out.println("====================");
        var objectUser = objectMapper.readValue(text, UserDTO.class);
        System.out.println(objectUser);
    }

}
