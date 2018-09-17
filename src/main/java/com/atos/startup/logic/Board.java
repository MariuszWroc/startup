package com.atos.startup.logic;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import com.atos.startup.model.Bank;
import com.atos.startup.model.BoardField;
import com.atos.startup.model.Colour;
import com.atos.startup.model.Player;

public class Board {
	private final Map<Colour, Player> players = new EnumMap<>(Colour.class);
	private final Bank bank;
	private final List<BoardField> fields;
	
	public Board(int playersNumber) {
		preparePlayers(playersNumber);
		this.bank = new Bank();
		this.fields = new FieldGenerator().generate();
	}
	
	private Map<Colour, Player> preparePlayers(int playersNumber) {
		for (int i = 0; i < playersNumber; i++) {
			players.put(Colour.randomColour(), new Player());
		}
		return players;
	}
	
	
	public Map<Colour, Player> getPlayers() {
		return players;
	}

	public Player getPlayer(Colour colour) {
		return players.get(colour);
	}

	public Bank getBank() {
		return bank;
	}

	public List<BoardField> getFields() {
		return fields;
	}

	@Override
	public String toString() {
		return "Board [players=" + players + ", bank=" + bank + ", fields=" + fields + "]";
	}

}
