/**
 * 
 */
package com.lendico.plangenerator;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * @author karthik
 *
 */
public class DoubleSerializer extends JsonSerializer<Double> {

	@Override
	public void serialize(Double arg0, JsonGenerator arg1, SerializerProvider arg2)
			throws IOException, JsonProcessingException {

		arg1.writeString(Double.toString(new LendicoUtils().formatDouble(arg0)));
	}

}
