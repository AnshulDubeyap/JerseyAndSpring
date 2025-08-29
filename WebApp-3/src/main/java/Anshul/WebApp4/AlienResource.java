package Anshul.WebApp4;


import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	
	// Now we connect it with database and get the data with database 
	// We don't have a database now, so now assume the file alienRepository is acting like a database
	
	// Lets get the object of AlienRepository
	
	AlienRepository repo = new AlienRepository();
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAliens() {
		System.out.print("getAliens() called");
		
		return repo.getAliens();
	}
	
	// Now we want to save a alien in database, for that we create a new resource
	
	@POST
	@Path("alien")
	public Alien createAlien(Alien a1) {
		System.out.print("printAlien() called");
		repo.create(a1);
		
		return null;
		
	}
	

}
