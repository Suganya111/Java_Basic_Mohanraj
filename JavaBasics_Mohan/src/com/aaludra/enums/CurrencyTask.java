package com.aaludra.enums;

public class CurrencyTask {

	public static void main(String[] args) {

		Currency in = Currency.INR;
		System.out.println("Symbol : " + in.getCountryName("india"));
		Currency us = Currency.USD;
		System.out.println("Symbol : " + us.getCountryName("USA"));
		Currency eu = Currency.EURO;
		System.out.println("Symbol : " + eu.name());

	}
}
