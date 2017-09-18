/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.servicos;


import br.calculadora.bo.Calculos;
import calculos.ejb.CalculosRemote;
import com.google.gson.Gson;
import javax.ejb.EJB;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;


/**
 * REST Web Service
 *
 * @author Icaro
 */
@Path("calculadora")
public class CalculadoraResource {

    private Gson gson = new Gson();
    @EJB
    private CalculosRemote ejb;

    public CalculadoraResource() {
    }

    @GET
    @Produces("application/json")
    public String getCalculos() {
        return gson.toJson(ejb.consultarTodos());
    }

    @Path("{id}")
    @GET
    @Produces("application/json")
    public String getCalculo(@PathParam("id") String calculoId) {
        return gson.toJson(ejb.consultarPorId(Long.valueOf(calculoId)));
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public void salvarCalculo(String calculo) {
        try {
            Calculos calc = gson.fromJson(calculo, Calculos.class);
            ejb.salvar(calc);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @DELETE
    @Path("/{id}")
    public void removerCalculo(final @PathParam("id") String id
    ) {
        ejb.remover(Long.valueOf(id));
    }

    @PUT
    @Consumes("application/json")
    public void putCalculo(String calculo) {
        salvarCalculo(calculo);
    }
}
