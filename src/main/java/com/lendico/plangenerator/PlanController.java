/**
 * 
 */
package com.lendico.plangenerator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author karthik
 *
 */

@RestController(value="/")
public class PlanController {

	@Autowired
	PlanService planService;
	
	
	@RequestMapping(value = "/plan",method=RequestMethod.POST)
	public ResponseEntity<List<PlanResponse>> calculatePlan(@RequestBody PlanRequest request){
		return new ResponseEntity<List<PlanResponse>>(planService.calculate(request), HttpStatus.OK);
	}
}
