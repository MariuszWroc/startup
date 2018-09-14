package com.atos.startup.logic;

import java.util.List;

import com.atos.startup.model.BoardField;

public class BoardGeneratorRule {
	private List<BoardField> fields;

	public List<BoardField> generate() {
		for (int i=1; i <= 40; i++) {
			BoardField field = new BoardField();
		}
		return null;
	}

}
