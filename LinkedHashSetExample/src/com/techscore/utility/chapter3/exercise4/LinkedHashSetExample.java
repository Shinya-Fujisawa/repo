package com.techscore.utility.chapter3.exercise4;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		// リンクハッシュセット初期化
		LinkedHashSet<ComparableHuman> set = new LinkedHashSet<ComparableHuman>();

		// 追加する人のオブジェクト作成
		ComparableHuman taro = new ComparableHuman("太郎", 15);
		ComparableHuman hanako = new ComparableHuman("花子", 12);
		ComparableHuman jiro = new ComparableHuman("次郎", 13);

		// リンクハッシュセットにHumanオブジェクト追加
		set.add(taro);
		set.add(hanako);
		set.add(jiro);

		// リンクハッシュセット一覧表示
		Iterator<ComparableHuman> i = set.iterator();
		while(i.hasNext()) {
			ComparableHuman h = (ComparableHuman) i.next();
			System.out.println("(名前)" + h.getName() + " (年齢)" + h.getAge());
		}
	}

}
