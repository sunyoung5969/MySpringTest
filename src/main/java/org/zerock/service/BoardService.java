package org.zerock.service;

import java.util.List;

import org.zerock.DTO.PageDTO;
import org.zerock.vo.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getPageList(PageDTO dto);
	
}
