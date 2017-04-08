package com.techscore.utility.chapter1.exercise3;

/**
 *
 * EqualsExample.java
 *
 * オブジェクトの同一性について比較する
 * "eqauls"メソッドで比較した場合、全てのオブジェクトは「同一」と判断される。
 * "=="で比較した場合、"test"と"te"+"st"以外は異なるものと判断される。
 *
 */
public class EqualsExample {

	private static String testString[] =
		{
			"test",new String("test"),
			"te" + "st",
			"te" + new String("st"),
			new String("te") + new String("st")
		};

	public static void main(String[] args) {

		for (int i = 0; i < testString.length - 1; i++) {

			System.out.println("test case " + String.valueOf((i + 1)) + "----------");

			for (int j = i + 1; j < testString.length; j++) {
				System.out.println("pattern i:" + i + " j:" + j);
				System.out.println("equals:" + (testString[i].equals(testString[j])));
				System.out.println("==:" + (testString[i] == testString[j]));
			}
		}
	}

}
