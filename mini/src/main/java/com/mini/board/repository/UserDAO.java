package com.mini.board.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mini.board.dto.User;

@Repository
public interface UserDAO {
	User selectUser(String id);
	int insertUser(String id, String password, String name);
	List<User> selectAllUser();
}
