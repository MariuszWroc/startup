package com.atos.startup.model;

import static com.atos.startup.model.RealEstate.HOTEL;
import static com.atos.startup.model.RealEstate.HOUSE;

import static com.atos.startup.model.CardType.CHANCE;
import static com.atos.startup.model.CardType.SOCIAL_SECURITY;
import static com.atos.startup.model.CardType.TITLE_OF_OWNERSHIP;

import java.util.HashSet;
import java.util.Set;

public class Bank {
	private Set<Card> cards = new HashSet<>();
	private Money money; 
	private int housesNumber;
	private int hotelsNumber;
	
	public Bank() {
		fillCards();
		money = new Money(100, 100, 100, 100, 100, 100, 100); 
		housesNumber = HOTEL.getNumber();
		hotelsNumber = HOUSE.getNumber();
	}

	private void fillCards() {
		createCards(CHANCE);
		createCards(SOCIAL_SECURITY);
		createCards(TITLE_OF_OWNERSHIP);
	}

	private void createCards(CardType type) {
		Integer number = type.getNumber();
		for(int i = 0; i < number; i++) {
			Card card = new Card(i, "some description", type);
			cards.add(card );
		}
	}

	public Set<Card> getCards() {
		return cards;
	}

	public void setCards(Set<Card> cards) {
		this.cards = cards;
	}

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	public int getHousesNumber() {
		return housesNumber;
	}

	public void setHousesNumber(int housesNumber) {
		this.housesNumber = housesNumber;
	}

	public int getHotelsNumber() {
		return hotelsNumber;
	}

	public void setHotelsNumber(int hotelsNumber) {
		this.hotelsNumber = hotelsNumber;
	}

	@Override
	public String toString() {
		return "Bank [cards=" + cards + ", money=" + money + ", housesNumber=" + housesNumber + ", hotelsNumber="
				+ hotelsNumber + "]";
	}
	
}
