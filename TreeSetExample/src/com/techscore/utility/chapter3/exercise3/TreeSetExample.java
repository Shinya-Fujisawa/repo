package com.techscore.utility.chapter3.exercise3;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		// ツリーセット初期化
		TreeSet<ComparableHuman> set = new TreeSet<ComparableHuman>();

		// 追加する人のオブジェクト作成
		ComparableHuman taro = new ComparableHuman("太郎", 15);
		ComparableHuman hanako = new ComparableHuman("花子", 12);
		ComparableHuman jiro = new ComparableHuman("次郎", 13);

		// ツリーセットにHumanオブジェクト追加
		set.add(jiro);
		set.add(taro);
		set.add(hanako);

		// ツリーセット一覧表示
		Iterator<ComparableHuman> i = set.iterator();
		while(i.hasNext()) {
			ComparableHuman h = (ComparableHuman) i.next();
			System.out.println("(名前)" + h.getName() + " (年齢)" + h.getAge());
		}

		// 年齢順に表示されていることを確認

	}

}
