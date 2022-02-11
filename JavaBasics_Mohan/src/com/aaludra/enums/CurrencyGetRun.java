package com.aaludra.enums;

import com.aaludra.enums.CurrencyGet.Currency;

public class CurrencyGetRun {

	public static void main(String[] args) {
		Currency s = Currency.getCurrencyName("INR");
		System.out.println(s.symbol);
		Currency h = Currency.getCurrencyName("USD");
		System.out.println(h.symbol);
		Currency f = Currency.getCurrencyName("EUR");
		System.out.println(f.symbol);
	}
}