package main.planche;

import main.Joueur;
import main.box.BoxDomino;
import main.lien.LienDomino;

public class PlancheDomino extends Planche {

	public PlancheDomino() {
		super(30, 30);

		for (int i = 0; i <= 6; i++)
			for (int j = 0; j <= i; j++)
				this.pioche.add(new BoxDomino(new LienDomino(i), new LienDomino(j)));
	}

	@Override
	public void addJoueur(Joueur joueur) {
		if (this.joueurs.size() <= 2)
			super.addJoueur(joueur);
	}

	@Override
	public void tour() {
		// si il ne peut pas jouer il pioche et passe
		//
	}

	@Override
	public void partie() {
		// inscription des joueurs
		// pioche a tour de role 7 dominos
		// le plus gros double le joue (obligatoire)
		// chaque joueur joue a tour de role
		/*
		 * addJoueur(new Joueur("1")); addJoueur(new Joueur("2"));
		 * 
		 * joueurs.get(0).pioche(pioche()); joueurs.get(0).pioche(pioche());
		 * joueurs.get(0).pioche(pioche());
		 */
		
		BoxDomino dom1 = new BoxDomino(new LienDomino(0), new LienDomino(0));
		BoxDomino dom2 = new BoxDomino(new LienDomino(0), new LienDomino(1));
		BoxDomino dom3 = new BoxDomino(new LienDomino(1), new LienDomino(2));
		BoxDomino dom4 = new BoxDomino(new LienDomino(0), new LienDomino(0));

		System.out.println(dom2.estAjoutable(dom1, 2, 1));
		if (dom2.estAjoutable(dom1, 2, 1))
			dom2.ajout(dom1, 2, 1);
		System.out.println(dom3.estAjoutable(dom2.getBox2(), 1, 2));
		if (dom3.estAjoutable(dom2.getBox2(), 1, 2))
			dom3.ajout(dom2.getBox2(), 1, 2);
		System.out.println(dom4.estAjoutable(dom1, 0, 0));
		if (dom4.estAjoutable(dom1, 0, 0))
			dom4.ajout(dom1, 0, 0);

	}
}