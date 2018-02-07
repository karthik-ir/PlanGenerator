/**
 * 
 */
package com.lendico.plangenerator;

import java.util.List;

import org.jvnet.hk2.annotations.Service;

/**
 * @author karthik
 *
 */
@Service
public interface PlanService {

	public List<PlanResponse> calculate(PlanRequest request);
}
