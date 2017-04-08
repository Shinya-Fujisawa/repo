package com.techscore.utility.chapter6.exercise1;

import java.util.Locale;

public class AvailableLocaleExample {

	public static void main(String[] args) {

		Locale locale[] = Locale.getAvailableLocales();

		System.out.println("\t言語名\t\t\t国名");
		System.out.println("---------------------------------------");

		for (int i = 0; i < locale.length; i++) {
			System.out.println(
					locale[i].getDisplayLanguage() + ":" +
					locale[i].getDisplayCountry() + ":" +
					locale[i].getVariant() + "_" +
					locale[i].getDisplayScript());
		}

	}

}
