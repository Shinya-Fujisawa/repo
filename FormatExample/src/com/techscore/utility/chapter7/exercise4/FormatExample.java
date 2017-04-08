package com.techscore.utility.chapter7.exercise4;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormatExample {

	private static final String[] formats =
		{
			"0",
			"#.###E0",
			"#.000E0",
			"000.#########E0",
			"00000.00000#########"
		};

	public static void main(String[] args) {
		System.out.println("■円周率");
		printNumber(Math.PI);
		System.out.println("■自然対数の底");
		printNumber(Math.E);
		System.exit(0);
	}

	private static void printNumber(double d) {
		System.out.println("---------------------+-----------------------");
		System.out.println(" フォーマット        | 結果                  ");
		System.out.println("---------------------+-----------------------");
		for (int i = 0; i < formats.length; i++) {
			NumberFormat format = new DecimalFormat(formats[i]);
			System.out.println(fillSpace(formats[i]) + " | " + format.format(d));
		}
	}

	private static String fillSpace(String str) {
		int size = str.length();
		for (int n = 0; n < 20 - size; n++) {
			str += " ";
		}
		return str;
	}
}
