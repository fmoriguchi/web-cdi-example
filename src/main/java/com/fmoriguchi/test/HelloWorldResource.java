/**
 * 
 */
package com.fmoriguchi.test;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author japa
 *
 */
@Path("/hello")
public class HelloWorldResource {

	@Inject
	TestMessage message;
	
	@GET
	public String message() {
		
		return "Hello REST !";
	}
	
	@GET
	@Path("cdi")
	public String cdi() {
		
		return "Hello CDI !";
	}
}
