package com.atos.startup.dto;

import com.atos.startup.model.Colour;
import com.atos.startup.model.FieldType;
import com.atos.startup.model.RealEstate;

public class FieldDTO {
	
	private FieldType type;
	private Colour colour;
	private String fieldName;
	private RealEstate realEstate;
	public FieldDTO(FieldType type, Colour colour, String fieldName, RealEstate realEstate) {
		super();
		this.type = type;
		this.colour = colour;
		this.fieldName = fieldName;
		this.realEstate = realEstate;
	}
	public FieldType getType() {
		return type;
	}
	public void setType(FieldType type) {
		this.type = type;
	}
	public Colour getColour() {
		return colour;
	}
	public void setColour(Colour colour) {
		this.colour = colour;
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
