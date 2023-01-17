package com.hellomygreenworld.ex02.domain;

import lombok.Data;

import java.util.Date;

@Data
public class BoardVO {

    private int id;
    private String title;
    private String content;
    private String writer;
    private Date regdate;
    private Date updatedate;

}
