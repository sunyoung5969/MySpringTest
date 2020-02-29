package org.zerock.mapper;

import java.util.List;

import org.zerock.dto.PageDTO;

public interface BoardMapper {
	
	public List<BoardVO> getList(PageDTO dto);
	
}
