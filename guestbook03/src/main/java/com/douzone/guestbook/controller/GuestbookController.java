package com.douzone.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.guestbook.repository.GuestbookRepository;
import com.douzone.guestbook.vo.GuestbookVo;

@Controller
public class GuestbookController {
	
	@Autowired
	private GuestbookRepository emaillistRepository;
	
	@RequestMapping("")
	public String index(Model model) {
		
		List<GuestbookVo> list = emaillistRepository.getList();
		model.addAttribute("list", list);
		return "index";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String add() {
		return "delete";
	}
//	
//	@RequestMapping(value="/add", method=RequestMethod.POST)
//	public String add(EmaillistVo vo) {
//		emaillistRepository.insert(vo);
//		return "redirect:/";
//	}

}
