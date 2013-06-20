/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 *
 * @author Administrator
 */
@Aspect
public class ContestantIntroducer {
    
    @DeclareParents(
            value="examples.Performer+",
            defaultImpl=GraciousContestant.class)
    
    public static Contestant contestant;
    
    
    @After("com.springinaction.springidol.aop.AnnotatedAudience.applaud() && " + "this(contestant)")
    public void makeContestant(Contestant cons)
    {
        cons.reward();
    }
    
}
