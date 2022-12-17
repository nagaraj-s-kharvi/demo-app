package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class StatusController {
	
	@GetMapping("/status")
	public ResponseEntity<String> status() {
		return ResponseEntity.ok("App is live and Running !!!");
	}
	
	@GetMapping("/health")
	public ResponseEntity<String> health() {
		return ResponseEntity.ok("App is live !!!");
	}
}
