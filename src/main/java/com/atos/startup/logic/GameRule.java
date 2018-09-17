package com.atos.startup.logic;

public interface GameRule<T, V> {
	public T useRule(V variable);
}
