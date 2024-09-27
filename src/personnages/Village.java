package personnages;

import java.security.PublicKey;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois;

	public Village(String nom) {
		this.nom = nom;
	}
	
	public void setChef(Chef chef) {
        this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public Village(String nom, int nbVillageoisMaximum) {
        this.nom = nom;
        this.villageois = new Gaulois[nbVillageoisMaximum]; 
        this.nbVillageois = 0;
    }

	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois ++;
			System.out.println(gaulois.getNom() + " a rejoint le village !");
		} else {
			System.out.println(" Le village est plein, impossible d'ajouter un nouvel habitant.");
		}
	}
	
	public Gaulois trouverHabitant(int position) {
		if (position >= 0 && position < nbVillageois) {
			return villageois[position];
		} else {
			System.out.println("Aucun villageois trouver à cette position.");
			return null;
		}
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois : ");
		for (int i = 0; i < nbVillageois; i++) {
			if (villageois[i] != null) {
				System.out.println("- " + villageois[i].getNom());
			}
		}
	}
	
	public static void main(String[] args) {
		Village irreductible = new Village("Village des Irréductibles", 30);
//		Gaulois gaulois = irreductible.trouverHabitant(30);
		Chef abraracourcix = new Chef("Abraracourcix", 6, irreductible);
		irreductible.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		irreductible.ajouterHabitant(asterix);
//		Gaulois gaulois = irreductible.trouverHabitant(1);
//		System.out.println(gaulois);
		Gaulois obelix = new Gaulois("Obélix", 25);
		irreductible.ajouterHabitant(obelix);
		irreductible.afficherVillageois();
	}
}





















