package com.atos.startup.dto;

import com.atos.startup.model.CardType;

public class CardDTO {
	
	private CardType type;
	private String description;
	
	public CardDTO(CardType type, String description) {
		this.type = type;
		this.description = description;
	}

	public CardType getType() {
		return type;
	}

	public void setType(CardType type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
