package com.atos.startup.model;

import java.util.List;

public class BoardField {
	private static final long serialVersionUID = -3610499441626872839L;
	private Integer id;
	private Colour colour;
	private String name;
	private FieldType type;
	private String description;
	private List <RealEstate> realEstates;
	
	public BoardField(Integer id, Colour colour, String name, FieldType type, String description) {
		this.id = id;
		this.colour = colour;
		this.name = name;
		this.type = type;
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Colour getColour() {
		return colour;
	}
	public void setColour(Colour colour) {
		this.colour = colour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public FieldType getType() {
		return type;
	}
	public void setType(FieldType type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<RealEstate> getRealEstates() {
		return realEstates;
	}
	public void setRealEstates(List<RealEstate> realEstates) {
		this.realEstates = realEstates;
	}
	
	
}
