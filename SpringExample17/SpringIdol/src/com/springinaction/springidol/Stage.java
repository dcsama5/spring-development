package com.springinaction.springidol;

public class Stage {

	private final String name= "Ameer's Stage";
	
	private Stage()
	{
		
	}
	
	private static class StageSingletonHolder {
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance()
	{
		return StageSingletonHolder.instance;
	}
	
	public void getName()
	{
		System.out.println(name);
	}
}
