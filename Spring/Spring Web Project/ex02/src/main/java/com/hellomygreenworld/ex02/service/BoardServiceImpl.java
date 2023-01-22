package com.hellomygreenworld.ex02.service;

import com.hellomygreenworld.ex02.domain.BoardVO;
import com.hellomygreenworld.ex02.domain.Criteria;
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
    public BoardVO get(int id) {
        log.info("get - " + id);
        return mapper.read(id);
    }

    @Override
    public boolean modify(BoardVO boardVO) {
        log.info("modify - " + boardVO);
        return mapper.update(boardVO) == 1;
    }

    @Override
    public boolean remove(int id) {
        log.info("remove - " + id);
        return mapper.delete(id) == 1;
    }

    @Override
    public List<BoardVO> getList(Criteria criteria) {
        log.info("get list with criteria - " + criteria);
        return mapper.getListWithPaging(criteria);
    }

    @Override
    public int getTotalCount(Criteria criteria) {
        log.info("get total count - " + criteria);
        return mapper.getTotalCount(criteria);
    }
}
