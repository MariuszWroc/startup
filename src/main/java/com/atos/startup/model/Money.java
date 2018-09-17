package com.atos.startup.model;

public class Money {
	private Integer oneCredits;
	private Integer fiveCredits;
	private Integer tenCredits;
	private Integer twentyCredits;
	private Integer fiftyCredits;
	private Integer oneHundretCredits;
	private Integer fiveHundretsCredits;
	
	public Money(Integer oneCredits, Integer fiveCredits, Integer tenCredits, Integer twentyCredits,
			Integer fiftyCredits, Integer oneHundretCredits, Integer fiveHundretsCredits) {
		this.oneCredits = oneCredits;
		this.fiveCredits = fiveCredits;
		this.tenCredits = tenCredits;
		this.twentyCredits = twentyCredits;
		this.fiftyCredits = fiftyCredits;
		this.oneHundretCredits = oneHundretCredits;
		this.fiveHundretsCredits = fiveHundretsCredits;
	}

	public Money() {
		this.oneCredits = 5;
		this.fiveCredits = 1;
		this.tenCredits = 2;
		this.twentyCredits = 1;
		this.fiftyCredits = 1;
		this.oneHundretCredits = 4;
		this.fiveHundretsCredits = 2;
	}
	
	public Integer getOneCredits() {
		return oneCredits;
	}
	public void setOneCredits(Integer oneCredits) {
		this.oneCredits = oneCredits;
	}
	public Integer getFiveCredits() {
		return fiveCredits;
	}
	public void setFiveCredits(Integer fiveCredits) {
		this.fiveCredits = fiveCredits;
	}
	public Integer getTenCredits() {
		return tenCredits;
	}
	public void setTenCredits(Integer tenCredits) {
		this.tenCredits = tenCredits;
	}
	public Integer getTwentyCredits() {
		return twentyCredits;
	}
	public void setTwentyCredits(Integer twentyCredits) {
		this.twentyCredits = twentyCredits;
	}
	public Integer getFiftyCredits() {
		return fiftyCredits;
	}
	public void setFiftyCredits(Integer fiftyCredits) {
		this.fiftyCredits = fiftyCredits;
	}
	public Integer getOneHundretCredits() {
		return oneHundretCredits;
	}
	public void setOneHundretCredits(Integer oneHundretCredits) {
		this.oneHundretCredits = oneHundretCredits;
	}
	public Integer getFiveHundretsCredits() {
		return fiveHundretsCredits;
	}
	public void setFiveHundretsCredits(Integer fiveHundretsCredits) {
		this.fiveHundretsCredits = fiveHundretsCredits;
	}
	@Override
	public String toString() {
		return "Money [oneCredits=" + oneCredits + ", fiveCredits=" + fiveCredits + ", tenCredits=" + tenCredits
				+ ", twentyCredits=" + twentyCredits + ", fiftyCredits=" + fiftyCredits + ", oneHundretCredits="
				+ oneHundretCredits + ", fiveHundretsCredits=" + fiveHundretsCredits + "]";
	}
	
	
}
