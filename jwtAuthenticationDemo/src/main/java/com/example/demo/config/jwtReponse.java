package com.example.demo.config;

import java.io.Serializable;

public class jwtReponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private final String jwttoken;


	public jwtReponse(String jwttoken) {
		super();
		this.jwttoken = jwttoken;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getJwttoken() {
		return jwttoken;
	}
	
	
}
