package com.springinaction.spel.collections;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/spel/collections/spring-cities.xml");
                
                Location place = (Location)ctx.getBean("selectedcity");
                System.out.println(place.getCity().getName());
                System.out.println(place.getLatitude());
                
                Country country = (Country) ctx.getBean("america");
                List<City> cities = country.getCities();
                
                for(Iterator<City> it=cities.iterator(); it.hasNext();)
                {
                    System.out.println(it.next().getName());
                }
              
                
	}
}
