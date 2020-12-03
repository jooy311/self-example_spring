package com.mini.board.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mini.board.dto.User;
import com.mini.board.mapper.UserMapper;

@Repository
public class UserDAOImpl implements UserDAO{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public User selectUser(String id) {
		return sqlSession.getMapper(UserMapper.class).selectUser(id);
	}

	@Override
	public int insertUser(String id, String password, String name) {
		return sqlSession.getMapper(UserMapper.class).insertUser(id, password, name);
	}

	@Override
	public List<User> selectAllUser() {
		return sqlSession.getMapper(UserMapper.class).selectAllUser();
	}
}
