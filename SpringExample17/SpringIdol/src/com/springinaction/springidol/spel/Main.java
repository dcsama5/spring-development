package com.springinaction.springidol.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 * @throws PerformanceException 
	 */
	public static void main(String[] args) throws PerformanceException {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spel/spring-idol.xml");
		Performer kenny = (Performer) ctx.getBean("kenny");
		
		Performer hank = (Performer) ctx.getBean("hank");
		
		kenny.perform();
		hank.perform();
	

		
	}

}
