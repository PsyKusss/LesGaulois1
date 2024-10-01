package personnages;

public class Musee {
    private Trophee[] trophees;
    private int nbTrophee;

    public Musee() {
        this.trophees = new Trophee[200]; 
        this.nbTrophee = 0;
    }

    public void donnerTrophee(Gaulois gaulois, Equipement equipement) {
        if (nbTrophee < trophees.length) { 
            trophees[nbTrophee] = new Trophee(gaulois, equipement); 
            nbTrophee++;
        } else {
            System.out.println("Le musée est plein, impossible d'ajouter plus de trophées.");
        }
    }

    public int getNbTrophee() {
        return nbTrophee;
    }
    
    public Trophee[] getTrophees() {
        return trophees;
    }
    
    public void extraireInstructionsOCaml() {
		
	}
}