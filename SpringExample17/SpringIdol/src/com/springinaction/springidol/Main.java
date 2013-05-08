package com.springinaction.springidol;

import java.util.Collection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;






public class Main {

	/**
	 * @param args
	 * @throws PerformanceException 
	 */
	public static void main(String[] args) throws PerformanceException {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringIdolConfig.class);
		
	/*	
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
          */      
               Juggler someguy = (Juggler) ctx.getBean("duke");
               someguy.perform();
               // OneManBand hank = (OneManBand) ctx.getBean("hank");
                //hank.perform();

	}

}
