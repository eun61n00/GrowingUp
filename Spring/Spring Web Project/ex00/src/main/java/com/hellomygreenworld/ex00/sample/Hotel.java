package com.hellomygreenworld.ex00.sample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@RequiredArgsConstructor
public class Hotel {

    private final Chef chef;

}