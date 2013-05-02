/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol;

import org.springframework.context.annotation.Scope;

/**
 *
 * @author Administrator
 */

@Scope("prototype")
public class Knife {
    
    private int sharpness;
    
    public Knife(int value)
    {
        this.sharpness = value;
    }
    
    public int getSharpness()
    {
        return this.sharpness;
    }
    
    public Knife setSharpness(int value)
    {
        this.sharpness = value;
        return this;
    }
    
}
