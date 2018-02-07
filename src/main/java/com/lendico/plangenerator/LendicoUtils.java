/**
 * 
 */
package com.lendico.plangenerator;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author karthik
 *
 */
public class LendicoUtils {

	public double formatDouble(Double val) {
		DecimalFormat df = new DecimalFormat("#.##");
		return Double.valueOf(df.format(val));
	}

	public Date getNextMonth(Date payoutDate) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date(payoutDate.getTime()));
		cal.add(Calendar.MONTH, 1);
		payoutDate = cal.getTime();
		return payoutDate;
	}
}
