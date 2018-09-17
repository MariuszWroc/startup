package com.atos.startup.model;

public final class Player {
	private Money money;

	public Player() {
		this.money = new Money();
	}

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Player [money=" + money + "]";
	}

}
