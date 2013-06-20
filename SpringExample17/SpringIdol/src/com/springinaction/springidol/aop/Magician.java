/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol.aop;

import examples.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;
/**
 *
 * @author Administrator
 */

interface MindReader {
    
    void interceptThoughts(ProceedingJoinPoint jp, String thoughts) throws Throwable;
    
}
public class Magician implements MindReader {
    
    private String thoughts;
    
    public void interceptThoughts(ProceedingJoinPoint jp, String thoughts) {
        
        StopWatch sw = new StopWatch("Timing some activity");
        try {
            sw.start(jp.toShortString());
            jp.proceed();
            System.out.println(jp.getSignature());
            
          /*  if(this instanceof Millionaire)
            {
                Class<? extends Millionaire> millionaire_ameer = jp.getClass();
                
                System.out.println()
            }*/
        }
        catch(Throwable t)
        {
            System.out.println(t);
        }
        finally {
            sw.stop();
            System.out.println("It took you " + sw.prettyPrint() + "to think of "+thoughts);
           
        }

    }

}
