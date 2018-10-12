package com.atos.startup.xml.example;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.atos.startup.model.Colour;
import com.atos.startup.model.Money;

@XmlRootElement
public class PlayerXmlExample {

	private long id;
	private String name;
	private Colour colour;
	private Money money;

	public long getId() {
		return id;
	}

	@XmlAttribute
	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public Colour getColour() {
		return colour;
	}

	@XmlElement
	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public Money getMoney() {
		return money;
	}

	@XmlElement
	public void setMoney(Money money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "PlayerXmlExample [id=" + id + ", name=" + name + ", colour=" + colour + ", money=" + money + "]";
	}
	

}
