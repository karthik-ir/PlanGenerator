/**
 * 
 */
package com.lendico.plangenerator;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author karthik
 *
 */
public class PlanRequest {
	private double loanAmount;
	private double nominalRate;
	private int duration;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
	private Date startDate;

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getNominalRate() {
		return nominalRate;
	}

	public void setNominalRate(double nominalRate) {
		this.nominalRate = nominalRate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
