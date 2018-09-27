package com.atos.startup.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class DiceTest {

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[10][0];
    }

	@Test()
	public void testRoll() {
		int rolledValue = Dice.roll();
		System.out.println(rolledValue);
		assertEquals(true, checkIfContains(rolledValue));
	}

	private boolean checkIfContains(int rolledValue) {
		int[] array = new int[12];
		for (int i = 2; i < array.length; i++) {
			if (rolledValue == i) {
				return true;
			}
		}
		return false;
	}

}
