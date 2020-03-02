package org.zerock.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.DTO.PageDTO;
import org.zerock.service.BoardService;
import org.zerock.vo.BoardVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@RequestMapping("/board/*")
@Controller
@AllArgsConstructor
public class BoardController {
	
	private BoardService service;
	
	/*
	@GetMapping("/list")
	public void list(@ModelAttribute("pageDTO") PageDTO dto, Model model) {
		log.info("list.............");
		log.info(service);
		
		model.addAttribute("list", service.getPageList(dto));
		
	}
	*/
	@GetMapping("/list")
	public void list(@ModelAttribute("pageDTO") PageDTO dto, Model model) {
		log.info("board...list......");
		log.info(dto);
		log.info(service);
		model.addAttribute("sample", "Hello List");
		model.addAttribute("list", service.getPageList(dto) );
		//model.addAttribute("pageUtil", new PageUtil(dto, service.getTotal()) );
		
	}
	
}
