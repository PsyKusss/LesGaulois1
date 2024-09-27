package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		assert force > 0 : "La force d'un Romain doit être positive.";
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force > 0 : "La force d'un Romain est positive.";
		int ancienneForce = force;
		force -= forceCoup;
		if (force > 0) {
			parler( "Aie");
		} else {
			parler("J'abandonne ...");
		}		
		assert ancienneForce > force : "La force d'un Romain a diminué.";
	}
	
	public void sEquiper(Equipement equipement) {
        switch (nbEquipement) {
            case 2:
            	System.out.println("Le soldat " + nom + " est déjà bien protégé !");;
                break;
            case 1:
                if (equipements[0] == equipement) {
                	System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
                } else {
                    ajouterEquipement(equipement);
                }
                break;
            case 0:
                ajouterEquipement(equipement);
                break;
        }
    }
	
	private void ajouterEquipement(Equipement equipement) {
        equipements[nbEquipement] = equipement;
        nbEquipement++;
        System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
    }
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.BOUCLIER);
        minus.sEquiper(Equipement.CASQUE);
	}
}
