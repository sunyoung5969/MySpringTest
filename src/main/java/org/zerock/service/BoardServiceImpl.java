package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.DTO.PageDTO;
import org.zerock.mapper.BoardMapper;
import org.zerock.vo.BoardVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {
	
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getPageList(PageDTO dto) {

		log.info("여기까지 올수있니");
		
		//return null;
		return mapper.getList(dto);
	}
	
}
