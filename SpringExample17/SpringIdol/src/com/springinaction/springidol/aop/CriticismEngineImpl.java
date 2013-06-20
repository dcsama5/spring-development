/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol.aop;

/**
 *
 * @author Administrator
 */
public class CriticismEngineImpl implements CriticismEngine {

   
    public String getCriticism() {
        
        return criticismPool[0];
    }

    private String[] criticismPool;
    public void setCriticismPool(String[] criticismpool) {
        this.criticismPool = criticismpool;
        
    }
    
}
