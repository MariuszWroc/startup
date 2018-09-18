package com.atos.startup.dto;

import com.atos.startup.model.Colour;
import com.atos.startup.model.Money;

public class PlayerDTO {
	
	private String name;
	private Colour color;
	private Money money;
	
	public PlayerDTO(String name, Colour color, Money money) {
		this.name = name;
		this.color = color;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Colour getColor() {
		return color;
	}

	public void setColor(Colour color) {
		this.color = color;
	}

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}
	
	
	
	

}
