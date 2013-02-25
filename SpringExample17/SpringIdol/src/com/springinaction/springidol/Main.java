package com.springinaction.springidol;

import java.util.Collection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;






public class Main {

	/**
	 * @param args
	 * @throws PerformanceException 
	 */
	public static void main(String[] args) throws PerformanceException {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
		
		OneManBand hank = (OneManBand) ctx.getBean("hank");
		hank.perform();
		Poem hankspoem = hank.getPoem();
		if(hankspoem instanceof Sonnet29)
			System.out.println("Hanks poem is of type "+Sonnet29.class);
		Instrumentalist kenny = (Instrumentalist) ctx.getBean("kenny");
		Collection<Instrument> list = kenny.getInstruments();
		for(Instrument e : list)
		{
			e.play();
		}

	}

}
