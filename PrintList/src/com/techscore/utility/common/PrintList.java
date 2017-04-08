package com.techscore.utility.common;

import java.util.Iterator;
import java.util.List;

public class PrintList {

	public static void out(List<?> list) {
		if (list != null) {
			System.out.print("\t[");
			Iterator<?> itr = list.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next() + "\t");
			}
			System.out.println("]\r\n");
		}
	}
}
