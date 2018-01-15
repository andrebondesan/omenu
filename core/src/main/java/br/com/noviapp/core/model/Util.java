package br.com.noviapp.core.model;

import com.google.gson.Gson;

public class Util {
	
	public static String toJson (Object clazz) {
		Gson json = new Gson();
		return json.toJson(clazz);
	}

}
