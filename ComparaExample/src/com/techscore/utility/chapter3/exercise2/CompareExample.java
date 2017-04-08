package com.techscore.utility.chapter3.exercise2;

public class CompareExample {

	public static void main(String[] args) {

		// 比較する人のオブジェクト作成
		ComparableHuman taro = new ComparableHuman("太郎", 15);
		ComparableHuman hanako = new ComparableHuman("花子", 12);
		ComparableHuman jiro = new ComparableHuman("次郎", 13);

		System.out.println("----- CompareTo()を用いて比較します -----");
		doCompare(taro, taro);
		doCompare(taro, hanako);
		doCompare(taro, jiro);
		doCompare(hanako, taro);
		doCompare(hanako, hanako);
		doCompare(hanako, jiro);
		doCompare(jiro, taro);
		doCompare(jiro, hanako);
		doCompare(jiro, jiro);

		System.out.println("\r\n----- equals()を用いて比較します ------");
		checkEqual(taro, taro);
		checkEqual(taro, hanako);
		checkEqual(taro, jiro);
		checkEqual(hanako, taro);
		checkEqual(hanako, hanako);
		checkEqual(hanako, jiro);
		checkEqual(jiro, taro);
		checkEqual(jiro, hanako);
		checkEqual(jiro, jiro);

	}

	// 二人をcompareTo()で比較してメッセージを表示する
	private static void doCompare(ComparableHuman a, ComparableHuman b) {
		if (a.compareTo(b) > 0) {
			System.out.println(a.getName() + "は" + b.getName() + "より年上です。");
		} else if (a.compareTo(b) < 0) {
			System.out.println(a.getName() + "は" + b.getName() + "より年下です。");
		} else {
			System.out.println(a.getName() + "は" + b.getName() + "は同い年です。");
		}
	}

	// 二人をequals()で比較してメッセージを表示する
	private static void checkEqual(ComparableHuman a, ComparableHuman b) {
		if (a.equals(b)) {
			System.out.println(a.getName() + "と" + b.getName() + "は同い年です。");
		} else {
			System.out.println(a.getName() + "と" + b.getName() + "は同い年ではありません。");
		}
	}

}
