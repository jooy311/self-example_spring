package com.mini.board.service;

import java.util.List;

import com.mini.board.dto.Board;
import com.mini.board.dto.User;

public interface BoardService {
	public void create(Board board) throws Exception;

	public List<Board> listAll() throws Exception;

	public Board read(int boardCode) throws Exception;

	public void delete(int boardCode) throws Exception;

	public void update(Board board) throws Exception;
	
	public void updateCount(int boardCode) throws Exception;
}
