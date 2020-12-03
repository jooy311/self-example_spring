package com.mini.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mini.board.dto.User;
import com.mini.board.repository.UserDAO;
import com.mini.board.service.UserService;


@Controller
public class JoinController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/join", method = RequestMethod.GET)
	public String joinUser() {
		return "join";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String joinUser(@ModelAttribute User user, Model model) {
		String name = user.getName();
		String id = user.getId();
		String password = user.getPassword();
		
		if(id.equals("") || password.equals("") || name.equals("")) {
			model.addAttribute("message", "빈칸이 있으면 안됩니다.");
			return "join";
		}
		
		if(userService.getUser(id) != null) {
			model.addAttribute("message", "이미 사용중인 아이디입니다.");
			return "join";//중복검사
		}
		
		userService.addUser(id, password, name);
		return "redirect:/login";
	}
}
