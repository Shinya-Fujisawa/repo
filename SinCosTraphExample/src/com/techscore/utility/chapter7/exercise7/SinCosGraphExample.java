package com.techscore.utility.chapter7.exercise7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class SinCosGraphExample extends JFrame {

	public SinCosGraphExample(String str) {
		super(str);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(new DrawGraph(), BorderLayout.CENTER);
		pack();
	}

	public static void main(String[] args) {
		SinCosGraphExample frame = new SinCosGraphExample("TECHSCORE UTILITY CHAP.7 exercise1");
		frame.setSize(500, 300);
		frame.setVisible(true);
	}

	class DrawGraph extends JComponent {
		// 原点をX0, Y0
		private int X0 = 30;
		private int Y0 = 150;

		public void paint(Graphics g) {
			Dimension dimension = getSize();
			g.setColor(Color.black);
			g.fillRect(0, 0, dimension.width, dimension.height);
			g.setColor(Color.white);
			g.setFont(new Font(null, Font.ITALIC, 13));

			// X軸とY軸の描画
			drawAxis(g);

			// 関数の描画
			drawFunction(g, new DegreeToCosFunction(), 0, 360, Color.RED);
			drawFunction(g, new DegreeToSinFunction(), 0, 360, Color.PINK);

		}

		/**
		 * X軸とY軸を描画するメソッド
		 * ここではサイズ等は固定とする
		 * @param g Graphicsインスタンスを指定
		 */
		private void drawAxis(Graphics g) {
			// X軸の描画
			g.drawLine(X0, Y0, 480, Y0);
			g.drawString("x", 420, 165);
			// Y軸の描画
			g.drawLine(X0, 260, X0, 10);
			g.drawString("y", 10, 10);
		}

		/**
		 * 関数を描画するメソッド
		 * @param g Graphicsインスタンスを指定
		 * @param function 使用する関数の名前を指定
		 * @param x_min 描画範囲の最小値を指定
		 * @param x_max 描画範囲の最大値を指定
		 * @param color 描画する色
		 */
		private void drawFunction(Graphics g, Function function, int x_min, int x_max, Color color) {
			g.setColor(color);
			int x[] = new int[x_max - x_min + 1];
			int y[] = new int[x_max - x_min + 1];
			for (int n = x_min; n <= x_max; n++) {
				x[n] = X0 + n;
				y[n] = Y0 - (int)(function.f(n) * 100);
			}
			g.drawPolyline(x, y, 360);
			g.drawString(function.getName(), x[x.length - 1] + 10, y[y.length - 1]);
		}
	}

}

// 関数インターフェース
interface Function {
	public String getName();
	public double f(double x);
}

// 度数表現からCosを返す関数
class DegreeToCosFunction implements Function {
	public double f(double x) {
		return Math.cos(Math.toRadians(x));
	}
	public String getName() {
		return "cos";
	}
}

// 度数表現からSinを返す関数
class DegreeToSinFunction implements Function {
	public double f(double x) {
		return Math.sin(Math.toRadians(x));
	}
	public String getName() {
		return "sin";
	}
}
