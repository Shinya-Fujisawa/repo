package com.techscore.utility.chapter5.exercise3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.techscore.utility.common.PrintList;

public class CollectionsExample {

	public static void main(String[] args) {

		String[] str =
			{
				"aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii", "jj", "kk"
			};

		List<String> list = Arrays.asList(str);

		System.out.println("■初期値(listの初期値表示)");
		PrintList.out(list);

		System.out.println("〇Collections.reverse(list);を実行");
		Collections.reverse(list);
		PrintList.out(list);

		System.out.println("〇Collections.rotate(list, 3);を実行");
		Collections.rotate(list, 3);
		PrintList.out(list);

		System.out.println("〇Collections.shuffle(list);を実行");
		Collections.shuffle(list);
		PrintList.out(list);

		System.out.println("〇Collections.swap(list, 3, 5);を実行");
		Collections.swap(list, 3, 5);
		PrintList.out(list);

		System.out.println("■処理終了");

	}
}
