package com.mini.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mini.board.dto.Board;
import com.mini.board.dto.User;

public interface BoardMapper {
	public void create(Board board) throws Exception;

	public List<Board> listAll() throws Exception;

	public Board read(int boardCode) throws Exception;

	public void delete(int boardCode) throws Exception;

	public void update(Board board) throws Exception;
	
	public void updateCount(int boardCode) throws Exception;

}
