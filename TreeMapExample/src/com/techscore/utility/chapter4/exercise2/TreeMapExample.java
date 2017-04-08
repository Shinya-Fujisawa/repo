package com.techscore.utility.chapter4.exercise2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		// ツリーマップ初期化
		TreeMap<ComparableHuman, String> map = new TreeMap<ComparableHuman, String>();

		// 追加する人のオブジェクト作成
		ComparableHuman taro = new ComparableHuman("太郎", 15);
		ComparableHuman hanako = new ComparableHuman("花子", 12);
		ComparableHuman jiro = new ComparableHuman("次郎", 13);

		// ツリーマップにHumanオブジェクト追加
		map.put(taro, "京都市左京区");
		map.put(hanako, "大阪市北区");
		map.put(jiro, "神戸市中央区");

		// ツリーマップ一覧表示
		Set<Entry<ComparableHuman, String>> set = map.entrySet();
		Iterator<Entry<ComparableHuman, String>> i = set.iterator();
		while(i.hasNext()) {
			Map.Entry<ComparableHuman, String> entry = (Map.Entry<ComparableHuman, String>)i.next();
			ComparableHuman h = (ComparableHuman) entry.getKey();
			System.out.println(
					" (名前)" + h.getName() +
					" (年齢)" + h.getAge() +
					" (住所)" + entry.getValue());

		}
	}

}
