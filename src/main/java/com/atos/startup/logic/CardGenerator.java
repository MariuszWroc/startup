package com.atos.startup.logic;

import static com.atos.startup.model.CardType.CHANCE;
import static com.atos.startup.model.CardType.SOCIAL_SECURITY;
import static com.atos.startup.model.CardType.TITLE_OF_OWNERSHIP;

import java.util.ArrayList;
import java.util.List;

import com.atos.startup.model.Card;
import com.atos.startup.model.CardType;

public class CardGenerator implements Generator<Card>{

	private List<Card> cards = new ArrayList<>();

	@Override
	public List<Card> generate() {
		createCards(CHANCE);
		createCards(SOCIAL_SECURITY);
		createCards(TITLE_OF_OWNERSHIP);
		return cards;
	}

	private void createCards(CardType type) {
		for(int i = 0; i < type.getNumber(); i++) {
			Card card = new Card(i, "some description", type);
			cards.add(card );
		}
	}

}
