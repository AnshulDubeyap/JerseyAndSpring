package Anshul.WebApp4;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
	
	List<Alien> aliens;
	
	
	// Constructor function
	
	public AlienRepository() {
		aliens  = new ArrayList<Alien>();
		
		Alien a1 = new Alien();

		a1.setName("Anshul");
		a1.setPoints(88);

		Alien a2 = new Alien();

		a2.setName("Wiliam");
		a2.setPoints(90);
		
		aliens.add(a2);
		aliens.add(a1);
	}
	
	// Method to get All Aliens
	public List<Alien> getAliens() {	
		return aliens;
	}
	
	// Method to get a single alien
	public Alien getAlien(String aname) {
		
		for(Alien a : aliens) {
			if(a.getName() == aname) {
				return a;
			}
		}
		
		return new Alien();
	}

	public void create(Alien a1) {
		// add a1 alien to the list aliens
		aliens.add(a1);
	}
}
