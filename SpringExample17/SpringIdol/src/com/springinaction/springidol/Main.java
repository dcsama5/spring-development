package com.springinaction.springidol;

import examples.*;
import java.util.Collection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;






public class Main {

	/**
	 * @param args
	 * @throws PerformanceException 
	 */
        public static final ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
	public static void main(String[] args) throws PerformanceException {
		// TODO Auto-generated method stub
		
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringIdolConfig.class);
		
		Instrumentalist kenny = (Instrumentalist) ctx.getBean("kenny");
		kenny.perform();
                
                Instrumentalist eddie = (Instrumentalist) ctx.getBean("eddie");
                
                System.out.println("Eddie performing");
                eddie.perform();
//                KnifeJuggler juggler = (KnifeJuggler) ctx.getBean("knifejuggler");
//                
//                for(Knife f : juggler.getKnives())
//                {
//                    System.out.println(f.getSharpness());
//                }
               
               Juggler someguy = (Juggler) ctx.getBean("duke");
               someguy.perform();
               
               System.out.println("The great one ameer will now perform");
               Instrumentalist ameer = (Instrumentalist) ctx.getBean("ameer");
               ameer.perform();
               // OneManBand hank = (OneManBand) ctx.getBean("hank");
                //hank.perform();

	}
        
        public static ApplicationContext retrieveContext()
        {
            return Main.ctx;
        }

}
