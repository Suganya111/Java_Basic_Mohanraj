package com.aaludra.enums;

public class CurrencyGet {
	enum Currency {
		INR("India", "i"), EUR("Europe", "j"), USD("USA", "$");

		String country;
		String symbol;

		Currency(String country, String symbol) {
			this.country = country;
			this.symbol = symbol;
		}

		public static Currency getCountryName(String symbol) {
			for (Currency value : Currency.values()) {
				if (value.country.equals(symbol)) {

					return value;
				}
			}
			return null;
		}
	}

}
