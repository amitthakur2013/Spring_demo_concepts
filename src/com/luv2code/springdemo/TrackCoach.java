package com.luv2code.springdemo;

public class TrackCoach implements Coach,NoOfPerson {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	//Default No-arg Constructor
	public TrackCoach() {
		
	}
	
	//define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "From track coach do the workout!!";
	}
	
	@Override
	public String getplayersCount() {
		return "The players in Track is track 1";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside metod domystartupstuff");
	}
	
	// add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("trackCoach: Inside cleanup method!");
	}
}
