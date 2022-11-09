package com.example.demo.exceptionResponse;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ReaponseHandler {
	public static ResponseEntity<?> getResponse(String message,HttpStatus status,Object obj){
		Map<String , Object> map=new HashMap<String,Object>();
		map.put("message", message);
		map.put("status", status);
		map.put("data", obj);
		return new ResponseEntity<Object>(map,status);
		
	}
}