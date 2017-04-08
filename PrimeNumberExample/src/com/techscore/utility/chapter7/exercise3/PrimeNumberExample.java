package com.techscore.utility.chapter7.exercise3;

import java.math.BigInteger;

public class PrimeNumberExample {

	public static void main(String[] args) {

		if(args.length == 0) {
			System.out.println("引数で桁数を指定して下さい。");
			System.exit(0);
		}
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < new Integer(args[0]).intValue(); i++){
			buf.append("9");
		}

		// １づつ減算するために利用
		BigInteger decreasing = new BigInteger("1");
		// 指定された桁数の最大値の数値を表す
		BigInteger biginteger = new BigInteger(buf.toString());

		// 素数を探す
		while(!biginteger.isProbablePrime(1)) {
			// 1を引く
			biginteger = biginteger.subtract(decreasing);
		}
		System.out.println(biginteger);
		System.out.println("処理終了");
		
		System.exit(0);
		
	}

}
