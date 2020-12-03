package com.mini.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mini.board.dto.User;

public interface UserMapper {

	//int insertUser(String id, String password, String name);
	int insertUser(@Param("id") String id, @Param("password") String password, @Param("name") String name);
	User selectUser(String id);
	List<User> selectAllUser();
}
