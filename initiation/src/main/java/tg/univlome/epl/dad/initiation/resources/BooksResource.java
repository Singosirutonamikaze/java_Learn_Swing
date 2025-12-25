/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.initiation.resources;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

/**
 *
 * @author siruto
 */
@Path("/books")
public class BooksResource {

    @GET
    public String getBooks() {
        return "Cuisine et moi java EE /12";
    }
    
    @POST
    public String createBook(String livre) {
        return livre;
    }
    
    @GET
    @Path("{id}")
    public String getBookById(@PathParam("id") int id){
        return "Java for life" + id;
    }
    
    @Path("{id}")
    public void updateBookById(@PathParam("id") int id){
    }
    
    @DELETE
    @Path("{id}")
    public void deleteBookById(@PathParam("id") int id){
    }
}
