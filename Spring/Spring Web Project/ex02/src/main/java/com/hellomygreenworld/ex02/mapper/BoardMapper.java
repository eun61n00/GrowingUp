package com.hellomygreenworld.ex02.mapper;

import com.hellomygreenworld.ex02.domain.BoardVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BoardMapper {

    public List<BoardVO> getList();

    public void insert(BoardVO boardVO);

    public void insertSelectKey(BoardVO boardVO);

    public BoardVO read(int bno);

    public int delete(int bno);

    public int update(BoardVO boardVO);

}
