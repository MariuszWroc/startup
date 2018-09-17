package com.atos.startup.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Colour {
	PURPLE(1), ORANGE(2), RED(3), YELLOW(4), GREEN(5), BLUE(6), GREY(7), AZURE(8), NONE(0);

	private static final List<Colour> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();
	private final Integer number;

	private Colour(Integer number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public static Colour randomColour() {
		return VALUES.get(RANDOM.nextInt(SIZE - 1));
	}
}
