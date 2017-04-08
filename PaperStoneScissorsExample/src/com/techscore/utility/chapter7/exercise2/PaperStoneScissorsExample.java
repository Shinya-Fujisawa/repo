package com.techscore.utility.chapter7.exercise2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class PaperStoneScissorsExample {

	public static void main(String[] args) {

		System.out.println("■ゲーム開始■");

		printUsage();

		Random random = new Random();

		Janken.Hand computer = null;
		Janken.Hand player = null;

		int win = 0;
		int lost = 0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			String line = null;
			while ((line = reader.readLine()) != null && !".".equals(line)) {
				// コンピュータの手を乱数で決定する
				computer = getHand(random.nextInt(3));
				if (!line.matches("[0-2]")) {
					printError();
					continue;
				} else {
					player = getHand(Integer.parseInt(line));
				}
				System.out.println("------------------------------------------");
				System.out.println("じゃんけんぽん");
				System.out.println("　あなたの手　　　　　：" + player.name + "　");
				System.out.println("　コンピュータの手　　：" + computer.name);
				switch(Janken.poi(player, computer)) {
				case Janken.DRAW:
					System.out.println("結果：あいこ");
					break;
				case Janken.LOST:
					lost++;
					System.out.println("結果：コンピュータの勝ち");
					break;
				case Janken.WIN:
					win++;
					System.out.println("結果：あなたの勝ち");
					break;
				}
				System.out.println("------------------------------------------");
				System.out.println("あなたの " + win + "(勝) " + lost + "(敗)です。");
			}
			System.out.println("■ゲーム終了■");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static Janken.Hand getHand(int num) {
		switch(num) {
		case 0:
			return Janken.STONE;
		case 1:
			return Janken.PAPER;
		case 2:
			return Janken.SCISSORS;
		default:
			printError();
			return null;
		}
	}

	private static void printUsage() {
		System.out.println("(printUsage)0:グー、1:パー、2:チョキ、.:終了");
	}

	private static void printError() {
		System.out.println("入力値が不正です。");
		printUsage();
	}

}

/**
 * じゃんけんを定義するクラス
 * @author shiny
 *
 */
class Janken {
	static Hand STONE 		= new Hand("グー", 0);
	static Hand PAPER 		= new Hand("パー", 1);
	static Hand SCISSORS 	= new Hand("チョキ", 2);
	static final int WIN 	= 1;
	static final int LOST 	= -1;
	static final int DRAW 	= 0;

	static int poi(Hand player, Hand com) {
		switch(player.number - com.number) {
		case 0:
			return Janken.DRAW;
		case 1:
			return Janken.WIN;
		case -2:
			return Janken.WIN;
		default:
			return Janken.LOST;
		}
	}

	static class Hand {
		String name = null;
		int number = -1;
		private Hand(String name, int number) {
			this.name = name;
			this.number = number;
		}
	}
}
