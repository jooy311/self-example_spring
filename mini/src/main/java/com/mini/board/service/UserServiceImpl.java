package com.mini.board.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mini.board.dto.User;
import com.mini.board.mapper.UserMapper;
import com.mini.board.repository.UserDAO;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public User getUser(String id) {
		return userDAO.selectUser(id);
	}

	@Override
	public int addUser(String id, String password, String name) {
		return userDAO.insertUser(id, password, name);
	}

	@Override
	public List<User> getAllUser() {
		return userDAO.selectAllUser();
	}

}
