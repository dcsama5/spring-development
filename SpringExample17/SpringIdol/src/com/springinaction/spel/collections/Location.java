/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.spel.collections;

/**
 *
 * @author Administrator
 */
public class Location {

    public City getCity() {
        return city;
    }

    public int getLongnitude() {
        return longnitude;
    }

    public int getLatitude() {
        return latitude;
    }
    
    
    private City city;
    private int longnitude;
    private int latitude;

    public void setCity(City city) {
        this.city = city;
    }

    public void setLongnitude(int longnitude) {
        this.longnitude = longnitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }
    
    
    
}
