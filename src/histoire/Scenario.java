package histoire;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

//	public static void main(String[] args) {
//		Gaulois asterix = new Gaulois("Astérix",8);
//		Romain minus = new Romain("Minus",6);
//		
//		asterix.parler("Bonjour à tous");
//		minus.parler("UN GAU... UN GAUGAU...");
//		asterix.frapper(minus);
//		asterix.frapper(minus);
//		asterix.frapper(minus);
//	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		Romain minus = new Romain("Minus",6);
		Druide panoramix = new Druide("Panoramix",5,10);
		
		panoramix.parler("Je vais aller préparer une petite potion ...");
		panoramix.preparerPotion();
		
	}
}
