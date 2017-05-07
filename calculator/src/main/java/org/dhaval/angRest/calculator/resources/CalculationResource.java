package org.dhaval.angRest.calculator.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.dhaval.angRest.calculator.service.CalculationService;

/**
 * @author dhavalsimaria
 *
 */
@Path("/results")
public class CalculationResource {

	CalculationService calcService = new CalculationService();
	
	@GET
	@Path("/sum")
	@Produces(MediaType.APPLICATION_JSON)
	public double getResult(@QueryParam("input1") double input1, @QueryParam("input2") double input2){
		double sum = calcService.getSum(input1, input2);
		return sum;
	}
}
