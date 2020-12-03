package com.mini.board.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mini.board.dto.Board;
import com.mini.board.mapper.BoardMapper;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public void create(Board board) throws Exception {
		sqlSession.getMapper(BoardMapper.class).create(board);
	}

	@Override
	public List<Board> listAll() throws Exception {
		return sqlSession.getMapper(BoardMapper.class).listAll();
	}

	@Override
	public Board read(int boardCode) throws Exception {
		return sqlSession.getMapper(BoardMapper.class).read(boardCode);
	}

	@Override
	public void delete(int boardCode) throws Exception {
		sqlSession.getMapper(BoardMapper.class).delete(boardCode);
		
	}

	@Override
	public void update(Board board) throws Exception {
		sqlSession.getMapper(BoardMapper.class).update(board);
	}

	@Override
	public void updateCount(int boardCode) throws Exception {
		sqlSession.getMapper(BoardMapper.class).updateCount(boardCode);
	}

}
