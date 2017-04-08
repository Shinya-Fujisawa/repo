package com.teckscore.sample;

import java.util.Vector;

public class SampleNumberListVector {

	public static void main(String[] args) {

		int num = 0;
		try {
			num = Integer.parseInt(args[0]);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			num = 0;
		}

		Vector<String> vec = new Vector<String>();

		for (int i = 0; i < num; i++) {
			vec.add(new Integer(i).toString());
		}

		for (int i = 0; i < vec.size(); i++) {
			String text = (String)vec.get(i);
			System.out.println(text);
		}
	}

}
