/**
 * 
 */
package com.lendico.plangenerator;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author karthik
 *
 */
@Component
public class PlanServiceImpl implements PlanService {

	public static final int NUM_OF_DAYS_IN_YEAR = 360;
	public static final int NUM_OF_DAYS_IN_MONTH = 30;

	@Override
	public List<PlanResponse> calculate(PlanRequest request) {
		List<PlanResponse> response = new LinkedList<PlanResponse>();
		calculate(request.getDuration(), request.getNominalRate(), request.getLoanAmount(), request.getStartDate(),
				calculateAnniuity(request.getLoanAmount(), request.getDuration(), request.getNominalRate()), response);
		return response;
	}

	private double calculateAnniuity(double loanAmount, int duration, double nominalRate) {
		double totalAmount = loanAmount + (loanAmount*nominalRate/100);
		return totalAmount/duration;
	}

	private void calculate(int durationInMonths, double interestRate, double loanAmount, Date payoutDate, double annuity,
			List<PlanResponse> payoutPlan) {
		if (durationInMonths == 0)
			return;

		double initialOutstanding = loanAmount;
		double interest = (interestRate * NUM_OF_DAYS_IN_MONTH * (loanAmount / NUM_OF_DAYS_IN_YEAR)) / 100;
		double remainingOutstanding = loanAmount - annuity + interest;

		//Check if anything additional or less be paid at the end of the tenure
		if (remainingOutstanding < 0 || durationInMonths -1 ==0) {
			annuity = annuity + remainingOutstanding;
			remainingOutstanding = 0;
		}

		double principal = annuity - interest;
		annuity = principal + interest;

		PlanResponse node = new PlanResponse(payoutDate, annuity, principal, interest, initialOutstanding,
				remainingOutstanding);
		payoutPlan.add(node);

		calculate(durationInMonths - 1, interestRate, remainingOutstanding, new LendicoUtils().getNextMonth(payoutDate),
				annuity, payoutPlan);
	}

}
