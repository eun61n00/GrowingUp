package com.hellomygreenworld.ex02.mapper;

import com.hellomygreenworld.ex02.domain.BoardVO;
import com.hellomygreenworld.ex02.domain.Criteria;

import java.util.List;

public interface BoardMapper {

    public List<BoardVO> getList();

    public List<BoardVO> getListWithPaging(Criteria criteria);

    public void insert(BoardVO boardVO);

    public void insertSelectKey(BoardVO boardVO);

    public BoardVO read(int id);

    public int delete(int id);

    public int update(BoardVO boardVO);

}
