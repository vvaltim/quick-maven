package br.com.waltervjunior.TesteQuick;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/medico")
public class App {
	
	@Path("/teste")
	@GET
	@Produces({ MediaType.APPLICATION_JSON }) // http://localhost:8080/rest/medico/teste
	public String teste() {
		return "Hello World";
	}
    
}
