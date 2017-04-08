package com.teckscore.sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class CSVReader {

	public static void main(String[] args) {

		System.out.println("処理開始");

		List<Human> data = new ArrayList<Human>();

		FileReader reader = null;
		BufferedReader br = null;

		try {
			reader = new FileReader("member.csv");
			br = new BufferedReader(reader);

			String line = br.readLine();
			String[] items = new String[]{""};
			while(line != null) {
				if (!line.trim().equals("")) {
					items = line.split(",");
					data.add(new Human(items[0],Integer.valueOf(items[1])));
				}
				line = br.readLine();
			}

			for (Human d : data) {
				System.out.println(d.toString());
			}

			System.out.println("処理終了");

		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			bufferedReaderClose(br);
			fileReaderClose(reader);
		}

	}

	private static void bufferedReaderClose(BufferedReader obj) {
		try {
			if (obj != null) {
				obj.close();
				obj = null;
			}
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	private static void fileReaderClose(FileReader obj) {
		try {
			if (obj != null) {
				obj.close();
				obj = null;
			}
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
