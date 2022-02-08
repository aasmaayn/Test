package com.example.test;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestContoller {
	
	
	
	@GetMapping("/getResponse")
	public ResponseEntity<Response> getResponse() {
		
		
		Response response = new Response("abc","abc");
		
		return ResponseEntity.ok(response);
		
		
		
	}
	
	
	
	

}
