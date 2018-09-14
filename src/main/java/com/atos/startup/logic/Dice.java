package com.atos.startup.logic;

import java.util.Random;

public class Dice {
	private static final int MESH_NUMBER = 6;

	public int roll() {
		Random random = new Random();
		return random.nextInt()*MESH_NUMBER;
	};
}
