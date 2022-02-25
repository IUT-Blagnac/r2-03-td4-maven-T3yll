package test;

import lesschtroumpfs.Village;
/**
C'est le main
 */
public class MainVillage {
	
	public static void main (String[] argv) {
		String[] nomsSchtroumpfs = {
		        "Grand Schtroumpf", "Schtroumpf courant (et pas ordinaire)", "Schtroumpf ordinaire (et pas courant)", "Schtroumpf moralisateur � lunettes",
		        "Schtroumpf boudeur", "Schtroumpf volant", "Schtroumpf �tonn�", "Schtroumpf acrobate", "Schtroumpf paresseux"
		};
		
		//Appel des méthodes
		Village v1 = new Village("SmurfLand", 100, nomsSchtroumpfs);
		v1.solstice_d_ete();
		v1.chefDuVillage();
		v1.envoyerAuTravail();
		v1.schtroumpsfHeureux();
		}
	}
