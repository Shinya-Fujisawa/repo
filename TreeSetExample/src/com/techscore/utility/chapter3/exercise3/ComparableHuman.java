package com.techscore.utility.chapter3.exercise3;

import com.teckscore.sample.Human;

public class ComparableHuman extends Human implements Comparable<Object> {

	public ComparableHuman(String name, int age) {
		super(name, age);
	}

	// 年齢を比較して年齢が同じならtrueを返す
	public boolean equals(Human h) {
		return (this.getAge() == h.getAge());
	}

	// 年齢を比較して年連差を返す
	public int compareTo(Object obj) {
		return (this.getAge() - ((Human) obj).getAge());
	}
}
