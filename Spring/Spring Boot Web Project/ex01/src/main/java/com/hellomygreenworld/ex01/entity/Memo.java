package com.hellomygreenworld.ex01.entity;

import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "tbl_memo")
@ToString
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

}
