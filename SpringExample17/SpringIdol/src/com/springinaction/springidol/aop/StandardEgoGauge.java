/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol.aop;

/**
 *
 * @author Administrator
 */
public class StandardEgoGauge implements egoGauge{

    public int gaugeEgo() {
        System.out.println("HI. YOU HAVE A VERY HIGH EGO TODAY SORT YOURSELF OUT MY FRIEND");
        
    return ((int) Math.random()*100);
    
    }
    
}
