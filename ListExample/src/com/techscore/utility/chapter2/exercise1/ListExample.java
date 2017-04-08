package com.techscore.utility.chapter2.exercise1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListExample {

	public static void measureProcessTime(List<Integer> list) {

		long before = 0;
		long after = 0;
		long time = 0;

		// ランダムアクセス
		Random random = new Random();
		before = System.currentTimeMillis();
		list.get(random.nextInt(1000000));
		after = System.currentTimeMillis();
		time = after - before;

		System.out.println("Complete Random Access Time:" + time + " (ms)");

		// 検索
		before = System.currentTimeMillis();
		list.indexOf(new Integer(6875764));
		after = System.currentTimeMillis();
		time = after - before;

		System.out.println("Complete Find Time:" + time + " (ms)");

		// 追加
		before = System.currentTimeMillis();
		list.add(new Integer(1000000));
		after = System.currentTimeMillis();
		time = after - before;

		System.out.println("Complete Adding Time:" + time + " (ms)");

		// 挿入
		before = System.currentTimeMillis();
		list.add(1, new Integer(1111111));
		after = System.currentTimeMillis();
		time = after - before;

		System.out.println("Complete Insert Time:" + time + " (ms)");

		// 削除
		before = System.currentTimeMillis();
		list.remove(1);
		after = System.currentTimeMillis();
		time = after - before;

		System.out.println("Complete Delete Time:" + time + " (ms)");

	}

	public static void main(String[] args) {

		System.out.println("----- Array List start -----");

		List<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i < 1000000; i++) {
			arrayList.add(new Integer(i));
		}

		ListExample.measureProcessTime(arrayList);

		System.out.println("----- Array List end -----");

		System.out.println("----- Linked List start -----");

		List<Integer> linkedList = new LinkedList<Integer>();

		for (int i = 0; i < 1000000; i++) {
			linkedList.add(new Integer(i));
		}

		ListExample.measureProcessTime(linkedList);

		System.out.println("----- Linked List end -----");

	}

}
