package com.aaludra.enums;

import com.aaludra.enums.CurrencyGet.Currency;

public class CurrencyGetRun {

	public static void main(String[] args) {
		Currency s = Currency.getCountryName("India");
		System.out.println(s.symbol);
		Currency h = Currency.getCountryName("Europe");
		System.out.println(h.symbol);
		Currency f = Currency.getCountryName("USA");
		System.out.println(f.symbol);

	}
}