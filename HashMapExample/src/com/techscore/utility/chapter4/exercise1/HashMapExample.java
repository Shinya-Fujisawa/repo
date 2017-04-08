package com.techscore.utility.chapter4.exercise1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		// ハッシュマップ初期化
		HashMap<ComparableHuman, String> map = new HashMap<ComparableHuman, String>();

		// 追加する人のオブジェクト作成
		ComparableHuman taro = new ComparableHuman("太郎", 15);
		ComparableHuman hanako = new ComparableHuman("花子", 12);
		ComparableHuman jiro = new ComparableHuman("次郎", 13);

		// ハッシュマップにHumanオブジェクトを追加
		map.put((ComparableHuman)taro, "京都市左京区");
		map.put((ComparableHuman)hanako, "大阪市北区");
		map.put((ComparableHuman)jiro, "神戸市中央区");

		// ハッシュマップ一覧表示
		Set<Entry<ComparableHuman, String>> entry = map.entrySet();
		Iterator<Entry<ComparableHuman, String>> i = entry.iterator();
		while(i.hasNext()) {
			Map.Entry<ComparableHuman, String> e = (Map.Entry<ComparableHuman, String>) i.next();
			ComparableHuman h = (ComparableHuman) e.getKey();
			System.out.println(
					"(名前)" + h.getName() +
					" (年齢)" + h.getAge() +
					" (住所)" + e.getValue());
		}
	}

}
