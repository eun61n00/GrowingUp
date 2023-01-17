package com.hellomygreenworld.ex02.service;

import com.hellomygreenworld.ex02.domain.BoardVO;
import com.hellomygreenworld.ex02.domain.Criteria;

import java.util.List;

public interface BoardService {

    public void register(BoardVO boardVO);

    public BoardVO get(int id);

    public boolean modify(BoardVO boardVO);

    public boolean remove(int id);

    public List<BoardVO> getList(Criteria criteria);

}
