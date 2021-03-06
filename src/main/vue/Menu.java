package main.vue;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import main.planche.PlancheDomino;
import main.planche.PlanchePuzzle;

@SuppressWarnings("serial")
public class Menu extends JFrame {
	public Menu() {
		this.pack();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setSize((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
				(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight());
		this.setVisible(true);
		this.setTitle("Menu");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(2, 4));

		JButton domino = new JButton("Domino");
		JButton puzzle = new JButton("Puzzle");
		JButton dominoGommettes = new JButton("Domino-gommettes");
		JButton saboteur = new JButton("Saboteur");

		JPanel imageDomino = new ImagePan("Images/domino.jpg");
		this.add(imageDomino, BorderLayout.CENTER);

		JPanel imagePuzzle = new ImagePan("Images/puzzle.jpg");
		this.add(imagePuzzle, BorderLayout.CENTER);

		JPanel imageDominoGommettes = new ImagePan("Images/dominoGommettes.jpg");
		this.add(imageDominoGommettes, BorderLayout.CENTER);

		JPanel imageSaboteur = new ImagePan("Images/Saboteur.jpg");
		this.add(imageSaboteur, BorderLayout.CENTER);

		domino.addActionListener(event -> {
			this.setVisible(false);

			PlancheDomino planche = new PlancheDomino();
			InfoPartie partie = new InfoPartie(planche);
		});
		this.add(domino);

		puzzle.addActionListener(event -> {
			this.setVisible(false);

			PlanchePuzzle planche = new PlanchePuzzle();
			// InfoPartie partie = new InfoPartie(planche);
		});
		this.add(puzzle);

		dominoGommettes.addActionListener(event -> {

		});
		this.add(dominoGommettes);

		saboteur.addActionListener(event -> {

		});
		this.add(saboteur);
	}
}
