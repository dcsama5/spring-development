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
		Instrumentalist kenny = (Instrumentalist) ctx.getBean("kenny");
		
		Performer hank = (OneManBand) ctx.getBean("hank");
		
		
		kenny.perform();
		hank.perform();
		System.out.println(hank.getClass());
		System.out.println(kenny.getSong().hashCode());
		
		
		

		
	}

}
