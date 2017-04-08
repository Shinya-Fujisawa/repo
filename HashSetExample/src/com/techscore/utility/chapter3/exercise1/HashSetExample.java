package com.techscore.utility.chapter3.exercise1;

import java.util.HashSet;
import java.util.Iterator;

import com.teckscore.sample.Human;

public class HashSetExample {

	public static void main(String[] args) {

		// ハッシュセット初期化
		HashSet<Human> set = new HashSet<Human>();

		// 追加する人のオブジェクトを作成
		Human taro 		= new Human("太郎", 15);
		Human hanako 	= new Human("花子", 12);
		Human jiro 		= new Human("次郎", 13);

		// ハッシュセットにHumanオブジェクト追加
		set.add(taro);
		set.add(hanako);
		set.add(jiro);
		set.add(taro);

		// ハッシュセット一覧表示
		Iterator<Human> i = set.iterator();
		while(i.hasNext()) {
			Human h = (Human)i.next();
			System.out.println("(名前)" + h.getName() + " (年齢)" + h.getAge());
		}

		// 太郎が1回しか表示されないことを確認
	}

}
