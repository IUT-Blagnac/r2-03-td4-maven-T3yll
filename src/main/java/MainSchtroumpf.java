package test;

import lesschtroumpfs.Schtroumpf;

public class MainSchtroumpf {

	public static void main (String[] argv) {
		Schtroumpf grognon = new Schtroumpf("Grognon", 135);
		grognon.sePresenter();
		grognon.chanter();
		grognon.allerTravailler();
		grognon.chanter();
		grognon.manger(10);
		grognon.chanter();
		grognon.anniversaire();
		grognon.sePresenter();
	}

}
