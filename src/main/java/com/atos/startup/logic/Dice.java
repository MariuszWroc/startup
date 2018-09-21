package com.atos.startup.logic;

import java.util.Random;

import static com.atos.startup.logic.Settings.MESH_NUMBER;

public class Dice {
	
	private Dice() {
	}

	public static int roll() {
		Random random = new Random();
		return random.nextInt()*MESH_NUMBER.getNumber();
	}
}
