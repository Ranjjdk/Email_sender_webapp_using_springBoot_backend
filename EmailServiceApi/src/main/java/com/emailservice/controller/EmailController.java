package com.emailservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.emailservice.model.EmailData;
import com.emailservice.service.EmailService;

@RestController
@CrossOrigin
public class EmailController {
	
	@Autowired
	private EmailService emailService;

	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome() {
		
		emailService.sendEmail(null, null, null);
		
		return "email sent ";
	}
	
	
	@PostMapping("/sendemail")
	public ResponseEntity<?> emailSender(@RequestBody EmailData data ) {
		
		boolean isSend = emailService.sendEmail(data.getSubject(),data.getMessage(),data.getTo());
		
		
		System.out.println("email+++++++++++"+data);
		if(isSend) {
		return ResponseEntity.ok("done");
			}
	
		else {
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email not send ");
		}
	}
	
}
