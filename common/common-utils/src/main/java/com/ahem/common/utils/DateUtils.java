package com.ahem.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	public static String fomat(String pattern, Date date) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(date);
	}
}
