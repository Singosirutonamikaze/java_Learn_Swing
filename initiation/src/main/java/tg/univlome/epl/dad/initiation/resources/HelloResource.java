package tg.univlome.epl.dad.initiation.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

/**
 *
 * @author 
 */
@Path("/hello")
public class HelloResource {
    
    @GET
    public String saluer(){
        return "Hello  I am siruto";
    }
   
}
