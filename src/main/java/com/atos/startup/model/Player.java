package com.atos.startup.model;

import java.util.ArrayList;
import java.util.List;

public final class Player {
	private static final int START_POSITION = 1;
	private Money money;
	private Integer positionOnBoard;
	private List<BoardField> fieldsOwnerships;
	private boolean inJail;

	public Player() {
		this.money = new Money();
		this.positionOnBoard = START_POSITION;
		this.fieldsOwnerships = new ArrayList<>();
		this.inJail = false;
	}

	public boolean isInJail() {
		return inJail;
	}

	public void setInJail(boolean inJail) {
		this.inJail = inJail;
	}

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	public Integer getPositionOnBoard() {
		return positionOnBoard;
	}

	public void setPositionOnBoard(Integer positionOnBoard) {
		this.positionOnBoard = positionOnBoard;
	}

	public static int getStartPosition() {
		return START_POSITION;
	}

	public List<BoardField> getFieldsOwnerships() {
		return fieldsOwnerships;
	}

	public void setFieldsOwnerships(List<BoardField> fieldsOwnerships) {
		this.fieldsOwnerships = fieldsOwnerships;
	}

	@Override
	public String toString() {
		return "Player [money=" + money + ", position=" + positionOnBoard + ", fieldsOwnerships=" + fieldsOwnerships
				+ ", inJail=" + inJail + "]";
	}

}
