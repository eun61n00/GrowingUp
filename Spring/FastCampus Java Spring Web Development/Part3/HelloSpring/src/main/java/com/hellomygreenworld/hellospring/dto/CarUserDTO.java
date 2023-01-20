package com.hellomygreenworld.hellospring.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(value= PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CarUserDTO {

    private String id;
    private String address;
    private String email;
    private String password;
    private List<CarDTO> carList;

}