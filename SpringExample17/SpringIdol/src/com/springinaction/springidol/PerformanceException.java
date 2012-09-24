package com.springinaction.springidol;

public class PerformanceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	
	public PerformanceException()
	{
		System.out.println("Performer cannot perform action for some reason");
	}
	public PerformanceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}



}
