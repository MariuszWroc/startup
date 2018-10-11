package com.atos.startup.dto;

import com.atos.startup.model.Colour;
import com.atos.startup.model.Money;

public class PlayerDTO {
	
	private String name;
	private Colour colour;
	private Money money;
	
	public PlayerDTO(String name, Colour colour, Money money) {
		super();
		this.name = name;
		this.colour = colour;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	

}
