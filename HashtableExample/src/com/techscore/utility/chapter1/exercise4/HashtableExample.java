package com.techscore.utility.chapter1.exercise4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HashtableExample extends JFrame implements ActionListener {

	private JButton SMAP[] =
		{
			new JButton("Kimura"),
			new JButton("Nakai"),
			new JButton("Inagaki"),
			new JButton("Kusanagi"),
			new JButton("Katori")
		};

	private JLabel label;

	private Hashtable<String, String> table = new Hashtable<String, String>();

	public HashtableExample() {
		super("Hashtable example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Hashtableに値を追加
		table.put((String)"Kimura",  (String)"Takuya");
		table.put((String)"Nakai", (String)"Masahiro");
		table.put((String)"Inagaki", (String)"Goro");
		table.put((String)"Kusanagi", (String)"Tsuyoshi");
		table.put((String)"Katori", (String)"Shingo");

		// 苗字を示すボタンを5つ追加
		Color backColor[] =
			{
				Color.green, Color.blue, Color.black, Color.yellow, Color.red
			};
		Color foreColor[] =
			{
				Color.black, Color.white, Color.white, Color.black, Color.white
			};

		Dimension size = new Dimension(150, 50);

		for (int i = 0; i < SMAP.length; i++) {
			SMAP[i].setBackground(backColor[i]);
			SMAP[i].setForeground(foreColor[i]);
			SMAP[i].setMinimumSize(size);
			SMAP[i].setPreferredSize(size);
			SMAP[i].setMaximumSize(size);
			SMAP[i].addActionListener(this);
		}

		// ボタンを配置
		Box topBox = new Box(BoxLayout.X_AXIS);
		getContentPane().add(topBox, BorderLayout.NORTH);

		topBox.add(Box.createHorizontalStrut(80));
		topBox.add(SMAP[0]);
		topBox.add(Box.createHorizontalGlue());
		topBox.add(SMAP[1]);
		topBox.add(Box.createHorizontalStrut(80));

		Box centerBox = new Box(BoxLayout.X_AXIS);
		getContentPane().add(centerBox, BorderLayout.CENTER);

		centerBox.add(Box.createHorizontalStrut(5));
		centerBox.add(SMAP[2]);
		centerBox.add(Box.createHorizontalGlue());
		centerBox.add(SMAP[3]);
		centerBox.add(Box.createHorizontalGlue());
		centerBox.add(SMAP[4]);
		centerBox.add(Box.createHorizontalStrut(5));

		// 名前を表示するラベルを追加
		label = new JLabel("SMAP");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setPreferredSize(new Dimension(460, 50));
		getContentPane().add(label, BorderLayout.SOUTH);

		pack();

	}

	public void actionPerformed(ActionEvent e) {

		String key = ((JButton) e.getSource()).getText();
		label.setText((String) table.get(key));
	}

	public static void main(String[] args) {
		new HashtableExample().setVisible(true);
	}

}
