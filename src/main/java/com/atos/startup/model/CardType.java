package com.atos.startup.model;

public enum CardType {
	TITLE_OF_OWNERSHIP(28), CHANCE(16), SOCIAL_SECURITY(16);
	
	private final Integer number;
	
	private CardType(Integer number) {
		this.number = number;
	}
	
	public Integer getNumber() {
		return number;
	}
}
