package com.atos.startup.dto;

import com.atos.startup.model.Colour;
import com.atos.startup.model.FieldType;
import com.atos.startup.model.RealEstate;

public class FieldDTO {
	
	private FieldType type;
	private Colour color;
	private String fieldName;
	private RealEstate realEstate;
	
	public FieldDTO(FieldType type, Colour color, String fieldName, RealEstate realEstate) {
		this.type = type;
		this.color = color;
		this.fieldName = fieldName;
		this.realEstate = realEstate;
	}

	public FieldType getType() {
		return type;
	}

	public void setType(FieldType type) {
		this.type = type;
	}

	public Colour getColor() {
		return color;
	}

	public void setColor(Colour color) {
		this.color = color;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public RealEstate getRealEstate() {
		return realEstate;
	}

	public void setRealEstate(RealEstate realEstate) {
		this.realEstate = realEstate;
	}
	
	
	
	

}
