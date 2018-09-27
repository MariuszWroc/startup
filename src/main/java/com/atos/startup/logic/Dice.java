package com.atos.startup.logic;

import java.util.Random;

import static com.atos.startup.logic.Settings.MESH_NUMBER;

public class Dice {
	
	private static final int LOWEST_ALLOWED_MESH_NUMBER = 1;

	private Dice() {
	}

	public static int roll() {
		return randomNumber() + randomNumber();
	}

	private static int randomNumber() {
		return new Random().ints(LOWEST_ALLOWED_MESH_NUMBER, (MESH_NUMBER.getNumber() + 1)).limit(1).findFirst().getAsInt();
	}
}
