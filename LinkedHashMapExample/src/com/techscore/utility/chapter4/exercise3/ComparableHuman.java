package com.techscore.utility.chapter4.exercise3;

import com.teckscore.sample.Human;

public class ComparableHuman extends Human implements Comparable<Object> {

	public ComparableHuman(String name, int age) {
		super(name, age);
	}

	public boolean equals(Human h) {
		return (this.getAge() == h.getAge());
	}

	public int compareTo(Object obj) {
		return (this.getAge() - ((Human) obj).getAge());
	}
}
