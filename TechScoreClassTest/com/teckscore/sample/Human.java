package com.teckscore.sample;

public class Human {

	protected String name = null;
	protected int age = -1;

	private static int NUM_EYE = 2;

	public Human(){
		this.name = "";
		this.age = -1;
	}
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}
	public String getName(String name) {
		this.name = name;
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "名前は" + this.name + "さんです。" +
				"年は" + this.age + "歳です。";
	}
}
