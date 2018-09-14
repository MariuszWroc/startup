package com.atos.startup.logic;

import java.util.List;

import com.atos.startup.model.BoardField;

public class BoardGenerator implements Generator<BoardField>{
	private static final int MAX_COUNT = 40;
	private List<BoardField> fields;

	public List<BoardField> generate() {
		for (int i=1; i <= MAX_COUNT; i++) {
			BoardField field = new BoardField();
			fields.add(field);
		}
		return fields;
	}

}
