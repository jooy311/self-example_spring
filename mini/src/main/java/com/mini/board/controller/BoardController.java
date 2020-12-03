package com.mini.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mini.board.dto.Board;
import com.mini.board.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/board", method=RequestMethod.GET)
	public String boardList(){
		return "board";
	}
	
	//�Խ��� �ۼ�
	@RequestMapping(value="/board", method=RequestMethod.POST)
	public String boardWrite(@ModelAttribute Board board) throws Exception{
		boardService.create(board);
		return "redirect:/board/list";
	}
	
	//�Խ��� ���
	@RequestMapping(value="/board/list", method=RequestMethod.GET)
	public String boardList(Model model) throws Exception{
		List<Board> list = boardService.listAll();
		model.addAttribute("boardlist", list);
		return "boardList";
	}
	
	//�Խ��� �� ��ȸ
	@RequestMapping(value="/view_{boardCode}", method=RequestMethod.GET)
	public String boardView(@PathVariable int boardCode, @RequestParam String writerId ,Model model) throws Exception{
		Board board = boardService.read(boardCode);
		boardService.updateCount(boardCode);
	
		model.addAttribute("detailView", boardService.read(boardCode));
		model.addAttribute("writerId", writerId);
		System.out.println("ù��° "+boardService.read(boardCode).getWriterId());
		System.out.println("�ι�°  "+ writerId);
		
		return "boardView";
	}
	
	//�Խ��� ����
	@RequestMapping(value="/delete_{boardCode}", method= {RequestMethod.GET})
	public String boardDelete(@PathVariable int boardCode, Model model) throws Exception {
		boardService.delete(boardCode);
		return "redirect:/board/list";
	}
	
	//�Խ��� ����
	@RequestMapping(value="/updateView_{boardCode}", method= {RequestMethod.GET})
	public String boardUpdateView(@PathVariable int boardCode, Model model) throws Exception {
		model.addAttribute("detailView", boardService.read(boardCode));
		return "boardView_update";
	}
	
	@RequestMapping(value="/update", method= {RequestMethod.POST})
	public String boardUpdate(@ModelAttribute Board board ,Model model) throws Exception {
		boardService.update(board);
		return "boardView";
	}
}
