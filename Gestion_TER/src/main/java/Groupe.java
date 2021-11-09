package sujet;

import java.util.ArrayList;

public class Groupe{
	
	private int numGroupe;
	private Sujet choix;
	private Enseignant encadrant;
	private Enseignant rapporteur;
	private ArrayList<Voeux> voeux;
	
	public Groupe(int numGroupe,Sujet choix,Enseignant encadrant,Enseignant rapporteur,ArrayList<Voeux> voeux) {
		this.numGroupe=numGroupe;
		this.choix=choix;
		this.encadrant=encadrant;
		this.rapporteur=rapporteur;
		
		this.voeux=new ArrayList<Voeux>();
		
	}

	public Sujet getChoix() {
		return choix;
	}

	public void setChoix(Sujet choix) {
		this.choix = choix;
	}

	public Enseignant getEncadrant() {
		return encadrant;
	}

	public void setEncadrant(Enseignant encadrant) {
		this.encadrant = encadrant;
	}

	public Enseignant getRapporteur() {
		return rapporteur;
	}

	public void setRapporteur(Enseignant rapporteur) {
		this.rapporteur = rapporteur;
	}

	public int getNumGroupe() {
		return numGroupe;
	}

	public void setNumGroupe(int numGroupe) {
		this.numGroupe = numGroupe;
	}

	public ArrayList<Voeux> getVoeux() {
		return voeux;
	}

	public void setVoeux(ArrayList<Voeux> voeux) {
		this.voeux = voeux;
	}
	
    public void ajoutVoeu(Voeux v){
    voeux.add(v.getPosition(),v);
   }
    
}
    
