/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.spel.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public class Country {
    
    private String name;
    private ArrayList<City> cities;

    public void setName(String name) {
        this.name = name;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public ArrayList<City> getCities() {
        return cities;
    }
    
    
}
