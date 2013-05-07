/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author ameer
 */

@Configuration
public class SpringIdolConfig {
    
    @Bean
    public Performer duke() {
        return new Juggler();
    }
    
}
