package com.atos.startup.logic;

import static com.atos.startup.logic.Settings.FIELD_COUNT;

import java.util.ArrayList;
import java.util.List;

import com.atos.startup.model.BoardField;

public class FieldGenerator implements Generator<BoardField>{

	@Override
	public List<BoardField> generate() {
		List<BoardField> fields = new ArrayList<>();
		
		for (int i=0; i < FIELD_COUNT.getNumber(); i++) {
			BoardField field = new BoardField();
			fields.add(field);
		}
		return fields;
	}

}
