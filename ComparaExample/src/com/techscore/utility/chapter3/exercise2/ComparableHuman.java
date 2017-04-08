package com.techscore.utility.chapter3.exercise2;

import com.teckscore.sample.Human;

public class ComparableHuman extends Human implements Comparable<Object> {

	public ComparableHuman(String name, int age) {
		super(name, age);
	}

	// 年齢を比較する。年齢が同じならtrueを返す
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ComparableHuman)) {
			return false;
		}
		ComparableHuman h = (ComparableHuman) obj;
		if (this.getAge() == h.getAge()) {
			return true;
		} else {
			return false;
		}
	}

	// 年齢を比較して年齢差を返す
	public int compareTo(Object obj) {
		if (obj == null) {
			return this.getAge();
		} else {
			return (this.getAge() - ((Human) obj).getAge());
		}
	}
}
