package lesschtroumpfs;

public class Schtroumpf {
	private String name;
	private int age;
	private Village village;
	private boolean content;
	private boolean ermite;
	
	public Schtroumpf(String pfNom, int pfAge) {
		this.name = pfNom;
		this.age = pfAge;
		this.content = true;
		this.ermite = false;
	}
	public Schtroumpf(String pfNom, int pfAge, Village pfVillage) {
		this.name = pfNom;
		this.age = pfAge;
		this.content = true;
		this.ermite = true;
		this.village = pfVillage;
	}
	public String getNom() {
		return this.name;
	}
	public Village getVillage() {
		return this.village;
	}
	public void setVillage(Village pfV) {
		this.village = pfV;
	}
	public int getAge() {
		return this.age;
	}
	/**
	Check si le schtroumpf est content
	 */
	public boolean estContent() {
		return this.content;
	}
	public String toString() {
		if ((this.content == true) && (this.ermite == true)) {
			return "Je suis "+ this.name + " jai " + this.age + " ans, je suis content et je suis un ermite";
		}
		if ((this.content == false) && (this.ermite == true)) {
			return "Je suis "+ this.name + " jai " + this.age + " ans, je suis pas content et je suis un ermite";
		}
		if ((this.content == true) && (this.ermite == false)) {
			return "Je suis "+ this.name + " jai " + this.age + " ans, je suis content et je viens de " + this.village;
		}
		if ((this.content == false) && (this.ermite == false)) {
			return "Je suis "+ this.name + " jai " + this.age + " ans, je suis pas content et je viens de " + this.village;
		}
		else {
			return "Erreur";
		}
	}
	public void sePresenter() {
		System.out.println(this.toString());
	}
	public String leChant() {
		if(this.content == true) {
			return "la, la, la Schtroumpf la, la";
		}
		else {
			return "gloups";
		}
	}
	public void chanter() {
		System.out.println(this.leChant());
	}
	public void anniversaire() {
		this.age = this.age + 1;
	}
	public void manger(int pfQte) {
		if(pfQte > 0) {
			this.content = true;
		}
		else {
			this.content = false;
		}
	}
	public void allerTravailler() {
		this.content = false;
	}
	public void recolterSalsepareille() {
		if(this.ermite == false) {
			this.village.setSalse(5);
			this.content = false;
		}
		else {
			manger(5);
		}
	}
	public void dinerAuVillage() {
		if(this.ermite == false) {
			if(this.village.getStockSalsepareille() >= 3) {
			manger(3);
			this.village.moinsSalse(3);
			}
			else {
				this.content = false;
			}
		}
		else {
			this.content = false;
		}
	}
		
	
}
