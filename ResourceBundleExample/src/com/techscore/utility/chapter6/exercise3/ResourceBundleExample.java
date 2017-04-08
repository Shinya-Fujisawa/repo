package com.techscore.utility.chapter6.exercise3;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {

	public static void main(String[] args) {

        Locale locale = null;

        if (args.length == 0) {
            System.out.println("実行方法:java com.techscore.utility.chapter6.exercise3.ResourceBundleExample 言語名");
            System.out.println("言語名は \"en\", \"fr\", \"ja\" から選んでください。");
        } else {
            locale = new Locale(args[0]);
        }

        if (locale == null) {
            System.out.println("指定された言語が見つかりませんでした、デフォルトのロケールを使用します。");
            locale = Locale.getDefault();
        }

        try {
            ResourceBundle bundle = ResourceBundle.getBundle("com.techscore.utility.chapter6.exercise3.hello", locale);
            System.out.println(bundle.getString("hello"));
        } catch (Exception e) {
            System.out.println("\t" + e.getClass() + " が発生");
        }

	}

}
