package com.atos.startup;

import static com.atos.startup.logic.Settings.MAX_PLAYERS_COUNT;

import com.atos.startup.logic.Board;
import com.atos.startup.model.Colour;

public class StartMain {

	public static void main(String[] args) {
		int playersNumber = 4;
		if (playersNumber > 6) {
			prepareBoard(MAX_PLAYERS_COUNT.getNumber());
		} else {
			prepareBoard(playersNumber);
		}
	}

	private static void prepareBoard(int playersNumber) {
		Board board = new Board(playersNumber);
		System.out.println(board.getPlayers());
		System.out.println(board.toString());
		
		System.out.println(board.getPlayer(Colour.GREEN));
	}

}
