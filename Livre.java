
public class Livre {
	// Variables
	private String titre, auteur;
	private int nbPages; 
	private float prix;

	// Constructeur
	public Livre(String unAuteur, String unTitre, int nb, float pr) {
		auteur = unAuteur;
		titre = unTitre;
		nbPages = nb;
		prix = pr;
	}
	public Livre(String unAuteur, String unTitre) {
		auteur = unAuteur;
		titre = unTitre;
	}

	public Livre(int nb) {
	  nbPages = nb;
	}
	public Livre(float Prix, boolean PrixFix) {
		//PrixFix = PrixFix;
		prix = Prix;
	}
	
	// Accesseur
	public String getAuteur() {
	  return auteur;
	}
	public String getTitre() {
		return titre;
	 }
	public int getNbPages() {
		return nbPages;
	 }
	public float getPrix() {
		//prix = 510;
			return prix;
			return prix;
	}
	
	// Modificateur
	void setNbPages(int nb) {
		if(nb < 0) System.out.println("Erreur !");
		else  nbPages = nb;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public void setPrix(float prix) {
			this.prix = prix;
	}
	
	  public static void main(String[] args){
		Livre l1 = new Livre("Sarr", "Les Dev");
		Livre l2 = new Livre("Diop", "base");
		System.out.println("Auteur1: "+l1.getAuteur()+ "  Titre: "+l1.getTitre()); 
		System.out.println("Auteur2: "+l2.getAuteur()+ "  Titre: "+l2.getTitre()); 
		
		l1.setNbPages(100);
		l2.setNbPages(120);
		l1.setPrix(500);
		
		System.out.println(l1.getNbPages() + l2.getNbPages());
		
		l1.afficheToi();//Donne la description du livre
        l1.toString();

		Livre l3 = new Livre (300);
		System.out.println(l3.getNbPages());
	   } 

	//methode 
	    public void afficheToi() {
		 System.out.println("Ce livre est ecrit par "+getAuteur()+" et est intitule "
	     +"'"+getTitre()+ "'" +" avec "+getNbPages()+" pages.");
		 if(getPrix() <= 0) {
				System.out.println("Le prix n'est pas encore fixer!");
			}
		 else if (getPrix() > 0)
		 System.out.println("Il coute "+getPrix()+"Frc");
		 
	    }
	 

	
	  
	 
	
}
