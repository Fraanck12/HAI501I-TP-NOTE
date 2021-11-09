package sujet;
//import java.util.ArrayList;

public class Enseignant extends Personne{
	
	public Enseignant(int num, String nom, String prenom) {
		super(num, nom, prenom);
	}
	
/*private ArrayList<Sujet> sujets;


	public Enseignant(int num, String nom, String prenom) {
		super(num, nom, prenom);
		setSujets(new ArrayList<Sujet>());
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Sujet> getSujets() {
		return sujets;
	}

	public void setSujets(ArrayList<Sujet> sujets) {
		this.sujets = sujets;
	}
	
	public void addSujet(Sujet s) {
		this.getSujets().add(s);
	}
	*/
	
	public void verifier() throws IllegalArgumentException{
		if(nom=="") {
			throw new IllegalArgumentException("le nom ne peut pas être null");
		}
	}

}
