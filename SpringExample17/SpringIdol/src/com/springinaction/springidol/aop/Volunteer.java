/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol.aop;

import examples.*;

/**
 *
 * @author Administrator
 */

 interface Thinker {
    
    void thinkOfSomething(String something);
    
    
}
public class Volunteer implements Thinker {

    private String thoughts; 
    
    
    public void thinkOfSomething(String thoughts) {
        System.out.print("boom");
        this.thoughts = thoughts;
    }
    
    public String getSomething()
    {
        return this.thoughts;
    }
    
}
