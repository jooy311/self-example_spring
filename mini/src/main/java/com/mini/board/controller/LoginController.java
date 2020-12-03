package com.mini.board.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mini.board.dto.User;
import com.mini.board.service.UserService;

@Controller
public class LoginController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute User user, Model model, HttpSession session) {
		
		for(User u : userService.getAllUser()) {
			if(!user.getId().equals(u.getId()) || !user.getPassword().equals(u.getPassword())) {
				model.addAttribute("message", "아이디 또는 비밀번호가 맞지 않습니다.");
				return "login";
			}
		}
		
		user.setName(userService.getUser(user.getId()).getName());
		
		session.setAttribute("loginUser", user);
		
		return "redirect:/board/list";
	}
}
