package controller;

import entity.Categoria;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("categoria")
public class CategoriaController {
    @GET
    public List<Categoria> todas() {
        return Categoria.listAll();
    }

    @POST
    public String save(Categoria cat) {
        Categoria.persist(cat);
        return "OK";
    }
}
