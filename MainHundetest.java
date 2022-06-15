package hund;

import java.util.ArrayList;

public class MainHundetest {

	public static void main(String[] args) {
		Hund bob = new Hund();
		bob.setGewicht(40.8);
		bob.setGroesse(80);
		bob.setRasse("Collie");

		Hund whatDoIKnow = new Hund();
		whatDoIKnow.setName("what do I know");
		whatDoIKnow.setGewicht(20);
		whatDoIKnow.setGroesse(40);
		whatDoIKnow.setRasse("Labradoodle");

		Hund larry = new Hund();
		larry.setName("larry");
		larry.setGewicht(82);
		larry.setGroesse(95);
		larry.setRasse("Chihuahua");

		Hund rex = new Hund();
		rex.setName("rex");
		rex.setGewicht(36.4);
		rex.setGroesse(76);
		rex.setRasse("Poodle");

		Hund snowball = new Hund();
		snowball.setName("snowball");
		snowball.setGewicht(35);
		snowball.setGroesse(72);
		snowball.setRasse("Pincher");

		Hund keineAhnung = new Hund();
		keineAhnung.setName("keine ahnung");
		keineAhnung.setGewicht(11);
		keineAhnung.setGroesse(16);
		keineAhnung.setRasse("Dachshund");

		ArrayList<Hund> dogs = new ArrayList<>();
		dogs.add(bob);
		dogs.add(whatDoIKnow);
		dogs.add(larry);
		dogs.add(rex);
		dogs.add(snowball);
		dogs.add(keineAhnung);

		HundSpeicher hs = new HundSpeicher(dogs);

	}

}
