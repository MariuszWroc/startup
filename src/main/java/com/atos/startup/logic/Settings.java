package com.atos.startup.logic;

public enum Settings {
	MAX_PLAYERS_COUNT(6),
	FIELD_COUNT(40),
	MESH_NUMBER(6);

	private final Integer number;

	private Settings(Integer number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}
}
