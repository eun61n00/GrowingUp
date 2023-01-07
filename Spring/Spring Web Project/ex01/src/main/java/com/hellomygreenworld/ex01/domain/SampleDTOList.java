package com.hellomygreenworld.ex01.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SampleDTOList {

    private List<SampleDTO> dtoList;

    public SampleDTOList() {
        dtoList = new ArrayList<>();
    }

}
