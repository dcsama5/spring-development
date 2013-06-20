/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author Administrator
 */

 interface Thinker {
    
    void thinkOfSomething(String something);
    
    
}
public class Volunteer implements Thinker {

    private String something; 
    
    
    public void thinkOfSomething(String something) {
        this.something = something;
    }
    
    public String getSomething()
    {
        return this.something;
    }
    
}
