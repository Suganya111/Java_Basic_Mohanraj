package com.aaludra.enums;

public enum Currency {
	INR("india", "RU"), USD("USA", "$"), EURO("Europe", "EU");

	private String countryName;
	private String symbol;

	private Currency(String countryName, String symbol) {
		this.countryName = countryName;
		this.symbol = symbol;
	}

	public String getCountryName(String countryName) {
		return symbol;
	}
	public String getSymbol() {
		return countryName;
	}
}