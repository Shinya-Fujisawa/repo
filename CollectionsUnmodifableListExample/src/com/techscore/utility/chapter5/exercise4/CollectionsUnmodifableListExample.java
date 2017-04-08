package com.techscore.utility.chapter5.exercise4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.techscore.utility.common.PrintList;

public class CollectionsUnmodifableListExample {

	public static void main(String[] args) {

		int[] primitive_int_array = { 23, 14, 641, 66, 6, 2, 56, 0, 542 };

		Integer[] wrapped_int_array = new Integer[primitive_int_array.length];

		for (int i = 0; i < wrapped_int_array.length; i++) {
			wrapped_int_array[i] = new Integer(primitive_int_array[i]);
		}

		List<Integer> list = Arrays.asList(wrapped_int_array);

		System.out.println("■初期化(Listの初期値表示");
		PrintList.out(list);

		System.out.println("〇Collections.sort(list, Collections.reverseOrder());を実行");
		Collections.sort(list, Collections.reverseOrder());
		PrintList.out(list);

		try {
			list = Collections.unmodifiableList(list);
			System.out.println("■list = Collections.unmodifiableList(list);");
			System.out.println("〇Collections.shuffle(list);を実行");
			Collections.shuffle(list);
			PrintList.out(list);
		} catch(Exception e) {
			System.out.println("実行時エラー\t" + e.getClass() + "\t" + e.getMessage() + "\t" + e.getCause());
			e.printStackTrace();
		}

	}

}
