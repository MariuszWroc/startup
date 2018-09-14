package com.atos.startup.model;

public class Card {
	private Integer id;
	private String description;
	
	public Card(Integer id, String description) {
		this.id = id;
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Card [id=" + id + ", description=" + description + "]";
	}
	
	
}
