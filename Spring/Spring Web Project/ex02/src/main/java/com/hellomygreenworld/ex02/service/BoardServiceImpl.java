package com.hellomygreenworld.ex02.service;

import com.hellomygreenworld.ex02.domain.BoardVO;
import com.hellomygreenworld.ex02.mapper.BoardMapper;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

    @Setter(onMethod_ = {@Autowired})
    private BoardMapper mapper;

    @Override
    public void register(BoardVO boardVO) {
        log.info("register - " + boardVO);
        mapper.insertSelectKey(boardVO);
    }

    @Override
    public BoardVO get(int bno) {
        log.info("get - " + bno);
        return mapper.read(bno);
    }

    @Override
    public boolean modify(BoardVO boardVO) {
        log.info("modify - " + boardVO);
        return mapper.update(boardVO) == 1;
    }

    @Override
    public boolean remove(int bno) {
        log.info("remove - " + bno);
        return mapper.delete(bno) == 1;
    }

    @Override
    public List<BoardVO> getList() {
        log.info("get list");
        return mapper.getList();
    }
}
