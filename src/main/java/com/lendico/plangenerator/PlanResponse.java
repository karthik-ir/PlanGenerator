/**
 * 
 */
package com.lendico.plangenerator;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * @author karthik
 *
 */
public class PlanResponse {

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
	Date date;
	@JsonSerialize(using = DoubleSerializer.class)
	double anniuty;
	@JsonSerialize(using = DoubleSerializer.class)
	double principal;
	@JsonSerialize(using = DoubleSerializer.class)
	double interest;
	@JsonSerialize(using = DoubleSerializer.class)
	double initialOutstanding;
	@JsonSerialize(using = DoubleSerializer.class)
	double remainingOutstanding;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAnniuty() {
		return anniuty;
	}

	public void setAnniuty(double anniuty) {
		this.anniuty = anniuty;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getInitialOutstanding() {
		return initialOutstanding;
	}

	public void setInitialOutstanding(double initialOutstanding) {
		this.initialOutstanding = initialOutstanding;
	}

	public double getRemainingOutstanding() {
		return remainingOutstanding;
	}

	public void setRemainingOutstanding(double remainingOutstanding) {
		this.remainingOutstanding = remainingOutstanding;
	}

	public PlanResponse() {
	}

	public PlanResponse(Date date, double anniuty, double principal, double interest, double initialOutstanding,
			double remainingOutstanding) {
		super();
		this.date = date;
		this.anniuty = anniuty;
		this.principal = principal;
		this.interest = interest;
		this.initialOutstanding = initialOutstanding;
		this.remainingOutstanding = remainingOutstanding;
	}

}
