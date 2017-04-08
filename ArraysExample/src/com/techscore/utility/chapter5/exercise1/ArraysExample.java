package com.techscore.utility.chapter5.exercise1;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {

		float[] floatArray = {23, 14, 641, 66, 6, 62, 2, 56, 0, 542 };

		System.out.println("■初期値");
		printArray(floatArray);

		System.out.println("〇fill実行");
		Arrays.fill(floatArray, 3, 4, 33);
		printArray(floatArray);

		System.out.println("〇sort実行");
		Arrays.sort(floatArray);
		printArray(floatArray);

		System.out.println("〇binarySearch実行(33を検索)");
		float searchValue = 1F;
		int result = Arrays.binarySearch(floatArray, searchValue);
		if (result >= 0) {
			System.out.println("値を検出しました。" + searchValue + "\t" + result);
		} else {
			System.out.println("値を検出できませんでした。" + searchValue + "\t" + result);
		}
		printArray(floatArray);

		System.out.println("■処理終了");

	}

	private static void printArray(float[] array) {
		System.out.print("\t[");
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println("]");
	}
}
