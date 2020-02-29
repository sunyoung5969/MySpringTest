package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.dto.PageDTO;
import org.zerock.service.BoardService;

import lombok.extern.log4j.Log4j;

//

@Log4j
@RequestMapping("/board/*")
@Controller
public class BoardController {
	
	private BoardService service;
	
	@GetMapping("/list")
	public void list(PageDTO dto, Model model) {
		log.info("list.............");
		log.info(dto);
		
	}
	
}
