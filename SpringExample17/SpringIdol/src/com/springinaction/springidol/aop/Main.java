/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol.aop;

import examples.PerformanceException;
import examples.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class Main {
    
    public static final ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/aop/aop.xml");
    
    public static void main(String[] args) throws PerformanceException
    {
  
        
        //CriticismEngine critengine = (CriticismEngine) ctx.getBean("criticismEngine");
        Performer ameer = (Performer) ctx.getBean("ameer");
        ameer.perform();
       
        
        // ContestantIntroducer.contestant.reward();
        
    }
}
