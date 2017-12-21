package com.ejercicio.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ejercicio.soap.OperationOutput;

@Path("/customer")
public interface CustomerServiceREST {

	@GET
	@Path("/restarest/{elemone}/{elemtwo}")
	@Produces(MediaType.APPLICATION_JSON)
	public OperationOutput restarRest(@PathParam("elemone") String elemone, @PathParam("elemtwo") String elemtwo);

	@GET
	@Path("/sumarest/{elemone}/{elemtwo}")
	@Produces(MediaType.APPLICATION_JSON)
	public OperationOutput sumarRest(@PathParam("elemone") String elemone, @PathParam("elemtwo") String elemtwo);
}