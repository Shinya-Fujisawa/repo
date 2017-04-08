package com.techscore.utility.chapter1.exercise1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VectorExample extends JFrame implements ActionListener {

	private JButton continent[] =
		{
			new JButton("Euracia"),
			new JButton("North America"),
			new JButton("Africa"),
			new JButton("Australia"),
			new JButton("South America")
		};

	private JButton display;
	private JButton initialize;

	private Vector<JButton> vector = new Vector<JButton>();

	public VectorExample(){
		super("Vector example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.vector.clear();

		Color backColor[] =
			{
				Color.green,
				Color.blue,
				Color.black,
				Color.yellow,
				Color.red
			};

		Color foreColor[] =
			{
				Color.black,
				Color.white,
				Color.white,
				Color.black,
				Color.white
			};

		Dimension size = new Dimension(150, 50);

		for (int i = 0; i < this.continent.length; i++) {
			this.continent[i].setBackground(backColor[i]);
			this.continent[i].setForeground(foreColor[i]);
			this.continent[i].setMinimumSize(size);
			this.continent[i].setPreferredSize(size);
			this.continent[i].setMaximumSize(size);
			this.continent[i].addActionListener(this);
		}

		Box topBox = new Box(BoxLayout.X_AXIS);
		getContentPane().add(topBox, BorderLayout.NORTH);

		topBox.add(Box.createHorizontalStrut(80));
		topBox.add(this.continent[0]);
		topBox.add(Box.createHorizontalGlue());
		topBox.add(this.continent[1]);
		topBox.add(Box.createHorizontalStrut(80));


		Box centerBox = new Box(BoxLayout.X_AXIS);
		getContentPane().add(centerBox, BorderLayout.CENTER);

		centerBox.add(Box.createHorizontalStrut(5));
		centerBox.add(this.continent[2]);
		centerBox.add(Box.createHorizontalGlue());
		centerBox.add(this.continent[3]);
		centerBox.add(Box.createHorizontalGlue());
		centerBox.add(this.continent[4]);
		centerBox.add(Box.createHorizontalStrut(5));

		display = new JButton("表示");
		display.addActionListener(this);

		initialize = new JButton("初期化");
		initialize.addActionListener(this);

		Box bottomBox = new Box(BoxLayout.X_AXIS);
		getContentPane().add(bottomBox, BorderLayout.SOUTH);

		bottomBox.add(Box.createHorizontalStrut(60));
		bottomBox.add(display);
		bottomBox.add(Box.createHorizontalGlue());
		bottomBox.add(initialize);
		bottomBox.add(Box.createHorizontalStrut(60));

		pack();

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(display)) {
//			for (int i = 0; i < this.vector.size(); i++) {
//				JButton btn = vector.get(i);
//				System.out.println(btn.getText());
//			}
			Enumeration<JButton> en = this.vector.elements();
			while(en.hasMoreElements()) {
				JButton button = (JButton)en.nextElement();
				System.out.println(button.getText());
			}

		} else if (e.getSource().equals(initialize)) {
			this.vector.clear();
		} else {
			for (int j = 0; j < this.continent.length; j++) {
				if (e.getSource().equals(this.continent[j])){
					this.vector.add(this.continent[j]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		new VectorExample().setVisible(true);
	}

}
