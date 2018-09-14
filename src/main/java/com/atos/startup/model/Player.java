package com.atos.startup.model;

public class Player {
	private Long id;
	private Colour colour;
	private Money money;
	private Integer startPosition;
	private BoardField actualPosition;
	
	public Player(Long id, Colour colour, Integer startPosition) {
		this.id = id;
		this.colour = colour;
		this.money = new Money();
		this.startPosition = startPosition;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Colour getColour() {
		return colour;
	}
	public void setColour(Colour colour) {
		this.colour = colour;
	}
	public Money getMoney() {
		return money;
	}
	public void setMoney(Money money) {
		this.money = money;
	}
	public Integer getStartPosition() {
		return startPosition;
	}
	public void setStartPosition(Integer startPosition) {
		this.startPosition = startPosition;
	}
	
}
