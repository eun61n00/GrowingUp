package com.hellomygreenworld.ex02.controller;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring-config/applicationContext.xml",
        "file:src/main/webapp/WEB-INF/spring-config/dispatcher-servlet.xml"})
@Log4j
public class BoardControllerTests {

    @Setter(onMethod_ = {@Autowired})
    private WebApplicationContext ctx;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
    }

    @Test
    public void testList() throws Exception {
        log.info(
                mockMvc.perform(MockMvcRequestBuilders.get("/board/list"))
                        .andReturn()
                        .getModelAndView()
                        .getModelMap());
    }

    @Test
    public void testRegister() throws Exception {
        String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/register")
                .param("title", "test title")
                .param("content", "test content (controller)")
                .param("writer", "test writer")
        ).andReturn()
                .getModelAndView()
                .getViewName();

        log.info(resultPage);
    }

    @Test
    public void testGet() throws Exception {
        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/get")
                .param("id", "1")
        ).andReturn().getModelAndView().getModelMap());
    }

    @Test
    public void testModify() throws Exception {
        String result = mockMvc.perform(MockMvcRequestBuilders.post("/board/modify")
                        .param("id", "13")
                        .param("title", "test title")
                        .param("content", "test content (controller - modify)")
                        .param("writer", "user00")
        ).andReturn()
                .getModelAndView()
                .getViewName();

        log.info(result);
    }

    @Test
    public void testRemove() throws Exception {
        String result = mockMvc.perform(MockMvcRequestBuilders.post("/board/remove")
                .param("id", "18")
        ).andReturn().getModelAndView().getViewName();

        log.info(result);
    }

}
