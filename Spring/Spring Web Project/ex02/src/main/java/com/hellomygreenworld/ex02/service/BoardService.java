package com.hellomygreenworld.ex02.service;

import com.hellomygreenworld.ex02.domain.BoardVO;

import java.util.List;

public interface BoardService {

    public void register(BoardVO boardVO);

    public BoardVO get(int bno);

    public boolean modify(BoardVO boardVO);

    public boolean remove(int bno);

    public List<BoardVO> getList();

}
