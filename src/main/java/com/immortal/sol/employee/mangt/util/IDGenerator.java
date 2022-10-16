package com.immortal.sol.employee.mangt.util;

import com.immortal.sol.employee.mangt.exception.PropertyNotFoundException;

public class IDGenerator {
	
	public static String getEmpId(long autoint) throws PropertyNotFoundException {
		String dits = AppCache.getValue("ID_NUMBER_DIGITS");
		String format = "%0"+dits+"d";
		String str = String.format(format, autoint);
		return str;
	}

}
