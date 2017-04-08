package com.teckscore.sample;

public class Student extends Human {

	private String school = null;

	public Student() {
		super();
		this.school = "";
	}
	public Student(String school) {
		super();
		this.school = school;
	}
	public Student(String school, String name, int age) {
		super(name, age);
		this.school = school;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String toString() {
		return "名前は" + name + "さんです。" +
				"年は" + age + "歳です。" +
				"学校は" + this.school + "です。";
	}
}
