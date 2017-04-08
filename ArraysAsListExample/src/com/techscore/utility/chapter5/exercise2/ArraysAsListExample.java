package com.techscore.utility.chapter5.exercise2;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {

		System.out.println("■配列初期化");

		String[] str = { "aaa", "bbb", "ccc", "ddd", "eee" };
		printArray(str);

		System.out.println("〇配列からList作成");
		List<String> list = Arrays.asList(str);

		System.out.println("〇Listの4つ目の要素を\"hoge\"に変更");
		list.set(3, "hoge");
		printArray(str);

		try {
			System.out.println("〇Listに要素の追加を行う");
			list.add(3, "arara");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("\t" + e.getClass() + "\t" + e.getMessage() + "\t" + e.getCause());
			printArray(str);
		}

		try {
			System.out.println("〇Listから要素の削除を行う");
			list.remove("eee");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("\t" + e.getClass() + "\t" + e.getMessage() + "\t" + e.getCause());
			printArray(str);
		}

		System.out.println("■処理終了");

	}

	private static void printArray(String[] array) {
		System.out.print("\t 配列の中身｛");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println("｝");
	}
}
