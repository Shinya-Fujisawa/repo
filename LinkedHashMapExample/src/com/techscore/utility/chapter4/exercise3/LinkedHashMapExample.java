package com.techscore.utility.chapter4.exercise3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapExample {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		// リンクハッシュマップ初期化
		LinkedHashMap<ComparableHuman, String> map = new LinkedHashMap<ComparableHuman, String>();

		// 追加する人のオブジェクト作成
		ComparableHuman taro = new ComparableHuman("太郎", 15);
		ComparableHuman hanako = new ComparableHuman("花子", 12);
		ComparableHuman jiro = new ComparableHuman("次郎", 13);

		// リンクハッシュマップにHumanオブジェクト追加
		map.put(taro, "京都市左京区");
		map.put(hanako, "大阪市北区");
		map.put(jiro, "神戸市中央区");

		// リンクハッシュマップ一覧表示
		Set<Entry<ComparableHuman, String>> set = map.entrySet();
		Iterator<Entry<ComparableHuman, String>> i = set.iterator();
		while(i.hasNext()) {
			Map.Entry entry = (Map.Entry)i.next();
			ComparableHuman h = (ComparableHuman) entry.getKey();
			System.out.println(
					" (名前)" + h.getName() +
					" (年齢)" + h.getAge() +
					" (住所)" + entry.getValue());
		}
	}

}
