package com.atos.startup.logic;

import java.util.List;

import com.atos.startup.model.Card;

public class CardGenerator implements Generator<Card>{
	private static final int MAX_COUNT = 0;
	private List<Card> cards;

	@Override
	public List<Card> generate() {
		for (int i=1; i <= MAX_COUNT; i++) {
			Card card = new Card(i, "");
			cards.add(card);
		}
		return cards;
	}

}
