package com.atos.startup.model;

public final class Card {
	private final Integer id;
	private final String description;
	private final CardType type;
	
	public Card(Integer id, String description, CardType type) {
		this.id = id;
		this.description = description;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public CardType getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", description=" + description + ", type=" + type + "]";
	}

}
