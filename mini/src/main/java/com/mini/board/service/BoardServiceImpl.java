package com.mini.board.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mini.board.dto.Board;
import com.mini.board.dto.User;
import com.mini.board.mapper.UserMapper;
import com.mini.board.repository.BoardDAO;
import com.mini.board.repository.UserDAO;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO boardDAO;

	@Override
	public void create(Board board) throws Exception {
		boardDAO.create(board);
	}

	@Override
	public List<Board> listAll() throws Exception {
		return boardDAO.listAll();
	}

	@Override
	public Board read(int boardCode) throws Exception {
		return boardDAO.read(boardCode);
	}

	@Override
	public void delete(int boardCode) throws Exception {
		boardDAO.delete(boardCode);
	}

	@Override
	public void update(Board board) throws Exception {
		boardDAO.update(board);
	}

	@Override
	public void updateCount(int boardCode) throws Exception {
		boardDAO.updateCount(boardCode);
				
	}

}
