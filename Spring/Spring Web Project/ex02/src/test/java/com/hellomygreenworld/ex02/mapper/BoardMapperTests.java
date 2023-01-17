package com.hellomygreenworld.ex02.boardMapper;

import com.hellomygreenworld.ex02.domain.BoardVO;
import com.hellomygreenworld.ex02.domain.Criteria;
import com.hellomygreenworld.ex02.mapper.BoardMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring-config/applicationContext.xml")
@Log4j
public class BoardMapperTests {

    @Setter(onMethod_ = {@Autowired})
    private BoardMapper boardMapper;

    @Test
    public void testGetList() {
        log.info(boardMapper.getList());
        boardMapper.getList().forEach(board -> log.info(board));
    }

    @Test
    public void testGetListWithPaging() {
        Criteria criteria = new Criteria(2, 20);
        List<BoardVO> list = boardMapper.getListWithPaging(criteria);
        list.forEach(boardVO -> log.info(boardVO));
    }

    @Test
    public void testInsert() {

        for (int i = 0; i < 100000 ; i++) {

            BoardVO boardVO = new BoardVO();
            boardVO.setTitle("inserted title");
            boardVO.setContent("inserted content");
            boardVO.setWriter("inserted writer");

            boardMapper.insert(boardVO);
            log.info(boardVO);
        }
    }

    @Test
    public void testInsertSelectKey() {
        BoardVO boardVO = new BoardVO();
        boardVO.setTitle("inserted title select key");
        boardVO.setContent("inserted content select key");
        boardVO.setWriter("inserted writer select key");

        boardMapper.insertSelectKey(boardVO);
        log.info(boardVO);
    }

    @Test
    public void testRead() {

        BoardVO boardVO = boardMapper.read(5);
        log.info(boardMapper);
    }

    @Test
    public void testDelete() {
        log.info("DELETE COUNT: " + boardMapper.delete(10));
    }

    @Test
    public void testUpdate() {
        BoardVO boardVO = new BoardVO();
        boardVO.setId(5);
        boardVO.setTitle("updated title");
        boardVO.setContent("updated content");
        boardVO.setWriter("updated writer");

        int count = boardMapper.update(boardVO);
        log.info("UPDATE COUNT: " + count);
    }
    
    @Test
    public void testPaging() {
        Criteria criteria = new Criteria(2, 20);
        
        List<BoardVO> list = boardMapper.getListWithPaging(criteria);

        list.forEach(boardVO -> log.info(boardVO));
    }

}
