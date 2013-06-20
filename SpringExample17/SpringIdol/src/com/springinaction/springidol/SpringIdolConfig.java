/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import examples.*;
/**
 *
 * @author ameer
 */

@Configuration
public class SpringIdolConfig {
    
    @Bean
    public Performer duke() //name of the beans
    {
        return new Juggler();
    }
    
    @Bean
    public Performer ameer()
    {
        Instrumentalist ameer = new Instrumentalist();
        Instrument x =  (Instrument) Main.retrieveContext().getBean("saxophone");
        ameer.setInstrument(x);
        return ameer;
    }
}
