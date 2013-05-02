/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol;

import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Provider;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author Administrator
 */
public class KnifeJuggler {
    
    private Set<Knife> knives;
    private int rating;
    
    public Set<Knife> getKnives() {
        return knives;
    }

    public void setKnives(Set<Knife> knives) {
        this.knives = knives;
    }
    
    @Inject
    public KnifeJuggler(Provider<Knife> knifeProvider)
    {
        knives = new HashSet<Knife>();
        //0,1,1,2,3,5,8
        
        
        
        int previous = 0;
        int current = 1;
        
        int result;
        for(int i=0; i<10; i++)
        {
       
        
      
        }
        for(int i=0; i<5; i++) 
        {
             result = previous + current;
        previous = current;
        current = result;
            knives.add(knifeProvider.get().setSharpness(result));
            
        }
        
        
        
    }
    
}
