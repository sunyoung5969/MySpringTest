package org.zerock.dto;

import lombok.Data;

@Data
public class PageDTO {
	
	private int page;
	private int amount;
	
	public PageDTO() {
		
		this.page = 1;
		this.amount = 20;
		
	}
	
}
