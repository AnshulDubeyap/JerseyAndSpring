package Anshul.WebApp1;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

// Creating our own resources

// Whenever I call aliens, it will use this resource
@Path("aliens")
public class AlienResources {

	// Whenever we use get request, this method in AlienResources is called
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Alien createAlien() {
		
		System.out.print("Get Alien method is Called");		
		Alien a1 = new Alien();
		
		a1.setName("Anshul");
		a1.setPoints(88);
		
		return a1;
	}
}