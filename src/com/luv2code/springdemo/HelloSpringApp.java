package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		NoOfPerson p=context.getBean("myCoach",NoOfPerson.class);
		
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(p.getplayersCount());
		
		// Let's call a new method for fortune service
		System.out.println(theCoach.getDailyFortune());

		
		//close the context
		context.close();
	}

}
