package personnages;

public class Romain {
	private String nom;
	private int force;
	
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
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
	}
}
