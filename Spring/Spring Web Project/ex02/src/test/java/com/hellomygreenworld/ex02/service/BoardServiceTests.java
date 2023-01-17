package com.hellomygreenworld.ex02.service;

import com.hellomygreenworld.ex02.domain.BoardVO;
import com.hellomygreenworld.ex02.domain.Criteria;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring-config/applicationContext.xml")
@Log4j
public class BoardServiceTests {

    @Setter(onMethod_ = {@Autowired})
    private BoardService service;

    @Test
    public void testExist() {
        log.info(service);
        assertNotNull(service);
    }

    @Test
    public void testRegister() {

        BoardVO boardVO = new BoardVO();
        boardVO.setTitle("new board title");
        boardVO.setContent("new board content");
        boardVO.setWriter("new board writer");

        service.register(boardVO);
        log.info("=== testRegister ===");
        log.info("\tBno of created board: " + boardVO.getId());

    }

    @Test
    public void testGetList() {
        log.info("=== testGetList ===");
        Criteria criteria = new Criteria();
        service.getList(criteria).forEach(boardVO -> log.info(boardVO));
    }

    @Test
    public void testGet() {
        log.info("=== testGet ===");
        log.info(service.get(1));
    }

    @Test
    public void testModify() {

        BoardVO boardVO = service.get(1);
        boardVO.setTitle("modified title");

        log.info("=== testModify ===");
        log.info("\t Modify result: " + service.modify(boardVO));
    }

    @Test
    public void testRemove() {
        log.info("=== testRemove === ");
        log.info("\t Delete result: " + service.remove(2));
    }

}
