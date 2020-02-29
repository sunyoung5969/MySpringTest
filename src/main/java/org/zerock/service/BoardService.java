package org.zerock.service;

import java.util.List;

import org.zerock.dto.PageDTO;

public interface BoardService {
	
	public List<BoardVO> getPageList(PageDTO dto);
	
}
