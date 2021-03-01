package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor!");
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method of emailaddress!");
		this.emailAddress=emailAddress;
	}
	
	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method for team!");
		this.team=team;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	// setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method!");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes!";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
