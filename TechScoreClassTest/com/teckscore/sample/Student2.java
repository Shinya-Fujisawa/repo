package com.teckscore.sample;

public class Student2 {

	private String name = null;
	private int age = -1;
	private String school = null;

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

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String toString() {
		return "名前は" + this.name + "さんです。" +
				"年は" + this.age + "歳です。" +
				"学校は" + this.school + "です。";
	}
}
