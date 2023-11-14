package com.emailservice.model;

public class EmailData {
	
	
	private String subject;
	private String to;
	private String message;
	
	
	public EmailData(){
	
	
	}
	
	public EmailData(String subject, String to, String message) {
		
		this.subject = subject;
		this.to = to;
		this.message = message;
	}
	
	



	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "EmailData [subject=" + subject + ", to=" + to + ", message=" + message + "]";
	}
	
	
    
    
    
}
