package com.shubham.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just get it over with... " + fortuneService.getFortune();
	}
	
	//init method
	public void initMethod() {
		System.out.println("trackCoach: inside initMethod");
	}
	
	//destroy method
	public void destroyMethod() {
		System.out.println("TrackCoach: inside destroyMethod");
	}

}
