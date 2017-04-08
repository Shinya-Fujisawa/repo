package com.techscore.utility.chapter6.exercise2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertyExample {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("引数で読み込むプロパティファイルを指定して下さい。");
			System.exit(0);
		}

		InputStream input = null;

		try {
			// プロパティファイル読み込み
			input = new FileInputStream(args[0]);
			Properties properties = new Properties();
			properties.load(input);

			// プロパティファイルの内容表示
			Set set = properties.entrySet();
			Iterator itr = set.iterator();
			while(itr.hasNext()) {
				Map.Entry me = (Map.Entry)itr.next();
				System.out.println(me.getKey() + ":" + me.getValue());
			}
		} catch(FileNotFoundException e) {
			System.out.println(args[0]);
			System.out.println("指定されたファイルが見つかりません。");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				input = null;
			}
		}

	}

}
