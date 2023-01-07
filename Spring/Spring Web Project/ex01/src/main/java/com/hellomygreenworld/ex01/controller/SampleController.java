package com.hellomygreenworld.ex01.controller;

import com.hellomygreenworld.ex01.domain.SampleDTO;
import com.hellomygreenworld.ex01.domain.SampleDTOList;
import com.hellomygreenworld.ex01.domain.TodoDTO;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, false));
    }

    @RequestMapping("")
    public void basic() {
        log.info("---------- basic ----------");
    }

    @RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST})
    public void basicGet() {
        log.info("---------- basic get ----------");
    }

    @GetMapping("/basicOnlyGet")
    public void basicGet2() {
        log.info("---------- basic get only get ----------");
    }

    @GetMapping("/ex01")
    public String ex01(SampleDTO dto) {
        log.info("" + dto);
        return "ex01";
    }

    @GetMapping("/ex02")
    public String ex02(@RequestParam("id") String name, @RequestParam("age") int age) {
        log.info("name: " + name);
        log.info("age: " + age);
        return "ex02";
    }

    @GetMapping("/ex03List")
    public String ex03List(@RequestParam("ids") ArrayList<String> ids) {
        log.info("ids: " + ids);
        return "ex03List";
    }

    @GetMapping("/ex03Array")
    public String ex03Array(@RequestParam("ids") String[] ids) {
        log.info("array ids: " + Arrays.toString(ids));
        return "ex03Array";
    }

    @GetMapping("/ex04Bean")
    public String ex04Bean(SampleDTOList dtoList) {
        log.info("list dtos: " + dtoList);
        return "ex04Bean";
    }

    @GetMapping("/ex05")
    public String ex03(TodoDTO todo) {
        log.info("todo: " + todo);
        return "ex05";
    }

    @GetMapping("/ex06")
    public String ex06(SampleDTO dto, @ModelAttribute("page") int page) {
        log.info("dto: " + dto);
        log.info("page: " + page);

        return "sample/ex06";
    }

    @GetMapping("/ex07")
    public void ex07() {
        log.info("----- ex07 -----");
    }

    @GetMapping("/ex08")
    public @ResponseBody SampleDTO ex08() {
        log.info("----- ex08 -----");
        SampleDTO dto = new SampleDTO();
        dto.setAge(20);
        dto.setName("eunbin");

        return dto;
    }

    @GetMapping("/ex09")
    public ResponseEntity<String> ex09() {
        log.info("----- ex09 -----");
        String msg = "{\"name\": \"홍길동\"}";
        HttpHeaders header = new HttpHeaders();
        header.add("Content-Type", "application/json;charset=UTF-8");
        return new ResponseEntity<>(msg, header, HttpStatus.OK);
    }

    @GetMapping("/exUpload")
    public void exUpload() {
        log.info("----- exUpload -----");

    }

    @PostMapping("/exUploadPost")
    public void exUploadPost(ArrayList<MultipartFile> files) {
        files.forEach(file -> {
            log.info("------------------------------");
            log.info("name: " + file.getOriginalFilename());
            log.info("size: " + file.getSize());
        });
    }
}
