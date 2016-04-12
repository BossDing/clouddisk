package com.dounine.clouddisk360.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URLUtil {

	public final static String decode(String code){
		try {
			return URLDecoder.decode(code,"utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
}