package com.mini.board.service;

import java.util.List;

import com.mini.board.dto.User;

public interface UserService {
	User getUser(String id);
	int addUser(String id, String password, String name);
	List<User> getAllUser();
}
