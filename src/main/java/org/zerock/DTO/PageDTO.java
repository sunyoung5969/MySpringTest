package org.zerock.DTO;

import lombok.Data;

@Data
public class PageDTO {
	
	private int page;
	private int amount;
	
	public PageDTO() {
		
		page = 1;
		amount = 20;
		
	}
	
}
