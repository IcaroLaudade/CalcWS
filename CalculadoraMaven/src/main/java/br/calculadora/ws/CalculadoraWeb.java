/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calculadora.ws;

import br.calculadora.dao.Calculos;
import com.sun.jersey.api.client.WebResource;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import java.util.List;


public class CalculadoraWeb {

    private static final String URL = "http://localhost:8080/CalculadoraWebService/recursos/calculadora";
    private Client c = Client.create();
    private Gson gson = new Gson();

    public List<Calculos> getAll() {

        WebResource wr = c.resource(URL);
        String json = wr.get(String.class);
        return gson.fromJson(json,
                new TypeToken<List<Calculos>>() {
                }.getType());
    }

    public void post(Calculos calc) {
        WebResource wr = c.resource(URL);
        wr.type("application/json").accept("application/json").post(gson.toJson(calc));
    }
}
/*    public List<CalculadoraBO> getAll() {
       WebTarget webTarget 
  = client.target("http://localhost:8082/spring-jersey");
        String responseMsg = target.path("myresource").request().get(String.class);
//WebResource wr = c.resource(
//"http://localhost:8080/MeuCinema/webresources/filmes");
return wr.get(String.class);
    }
    
    
    /*    public List<CalculadoraBO> get() {
        List<CalculadoraBO> contas = new ArrayList();
        HttpURLConnection urlConnection = null;

        try {
            URL url = new URL(URL);
            urlConnection = (HttpURLConnection) url.openConnection();

            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            Scanner s = new Scanner(in);
            String conteudo = s.useDelimiter("\\A").next();

            Gson gson = new Gson();
            Calculos post = gson.fromJson(conteudo, Calculos.class);
            contas.add(post);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            urlConnection.disconnect();
        }
        return contas;
    }
 */
