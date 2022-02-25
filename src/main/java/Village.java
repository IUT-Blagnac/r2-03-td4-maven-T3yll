package lesschtroumpfs;


public class Village {
	private String nom;
	private Schtroumpf [] Smurftab;
	private int nbSchtroumpf; 
	private int salse;
	
	public Village (String pfNomV, int pfStockSalsepareille, String[] pfNomsDesSchtroumpfs) {
		this.nom = pfNomV;
		this.salse = pfStockSalsepareille;
		this.Smurftab = new Schtroumpf[100];
		int random;
		for(int i = 0 ; i < pfNomsDesSchtroumpfs.length ; i++) {
			random = (int)(Math.random()*150);
			Schtroumpf a = new Schtroumpf(pfNomsDesSchtroumpfs[i], random);
			Smurftab[i] = a;
			this.nbSchtroumpf ++;
		}
	}
	public String getNom() {
		return this.nom;
	}
	public int getnbSchtroumpf() {
		return this.nbSchtroumpf;
	}
	public int getStockSalsepareille() {
		return this.salse;
	}
	public void solstice_d_ete() {
		int compteur = 0;
		for(int i = 0; i < this.getnbSchtroumpf() ; i++) {
			this.Smurftab[i].sePresenter();
			this.Smurftab[i].leChant();
			if(this.Smurftab[i].estContent()) {
				compteur = compteur + 1;
			}
		}
		System.out.println(getNom());
		System.out.println(getnbSchtroumpf());
		System.out.println("Nombre de Schtroumpfs contents :" + compteur);
	}
	public void chefDuVillage() {
		int age = 0;
		String nom = "";
		for(int i = 0; i < this.getnbSchtroumpf() ; i++) {
			if(this.Smurftab[i].getAge() > age) {
				age = this.Smurftab[i].getAge();
				nom = this.Smurftab[i].getNom();
			}
		}
		System.out.println("Le chef du village est: " + nom + " Il a " + age + " ans");
	}
	public void envoyerAuTravail () {
		this.Smurftab[0].allerTravailler();
		for(int i = 1; i < this.getnbSchtroumpf() ; i = i + 2) {
			this.Smurftab[i].allerTravailler();
		} 
	}
	public void schtroumpsfHeureux () {
		for(int i = 1; i < this.getnbSchtroumpf() ; i++) {
			if(this.Smurftab[i].estContent()) {
				this.Smurftab[i].sePresenter();
				this.Smurftab[i].chanter();
			}
		}
	}
	public void setSalse(int pfQte) {
		this.salse = this.salse + pfQte;
	}
	public void moinsSalse(int pfQte) {
		this.salse = this.salse - pfQte;
	}
	public void dinerTousEnsemble() {
		int i = 0;
		while(this.getStockSalsepareille() >0) {
			this.Smurftab[i].dinerAuVillage();
			i = i + 1;
		}
		for(int cpt = i ; cpt < this.getnbSchtroumpf() ; cpt++) {
			this.Smurftab[i].estContent();
		}
	}
}
