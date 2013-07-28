/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package chapter05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
*
* @author Administrator
*/
class Connector {
	
	private Connection c;
	String PERSONS_TABLE = "CREATE TABLE PEOPLE(PersonID int,LastName varchar(255),FirstName varchar(255),Address varchar(255),City varchar(255))";
	String INSERT1 = "INSERT INTO PEOPLE (PERSONID, LASTNAME, FIRSTNAME, ADDRESS, CITY) VALUES ('1', 'RANJIT', 'SING', '45A BELL HOUSE', 'LONDON')";
	String INSERT2 = "INSERT INTO PEOPLE VALUES ('2', 'AMEER', 'ALI', '7 ROBSONA VENUE', 'WILLESDEN')";
	String INSERT3 = "INSERT INTO PEOPLE VALUES ('4', 'AMEER', 'ALI', '7 ROBSONA VENUE', 'WILLESDEN')";
	public Connector() 
	{
		try {
			c = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/testdb", "SA", "");
		}
		catch(SQLException e)
		{
			System.out.println("Exception caught whilst trying to connect to the datbaase");
			System.out.println(e);
		}
	}
	
	public void createTable() 
	{
		try {
			System.out.println("Attempting to create PEOPLE TABLE...");
			c.createStatement().execute(PERSONS_TABLE);
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		
		
		
	}
	
	public boolean insertData() 
	{
		boolean result = false;
		boolean result2 = false;
                boolean result3 = false;
		try{
			
			System.out.println("Inserting data...");
			result =  c.createStatement().execute(INSERT1);
			result2 = c.createStatement().execute(INSERT2);
                        result3 = c.createStatement().execute(INSERT3);
			System.out.println("result is " +result3);
			return result;
		}
		catch(SQLException e)
		{
			System.out.println(e);
			return result;
		}
	}
	
	public Connection getConnection()
	{
		return this.c;
	}
}
