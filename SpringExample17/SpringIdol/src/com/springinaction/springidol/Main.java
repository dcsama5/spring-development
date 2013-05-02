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
		
		
		Instrumentalist kenny = (Instrumentalist) ctx.getBean("kenny");
		kenny.perform();
                
                Instrumentalist eddie = (Instrumentalist) ctx.getBean("eddie");
                
                System.out.println("Eddie performing");
                eddie.perform();
                KnifeJuggler juggler = (KnifeJuggler) ctx.getBean("knifejuggler");
                
                for(Knife f : juggler.getKnives())
                {
                    System.out.println(f.getSharpness());
                }
               // OneManBand hank = (OneManBand) ctx.getBean("hank");
                //hank.perform();

	}

}
