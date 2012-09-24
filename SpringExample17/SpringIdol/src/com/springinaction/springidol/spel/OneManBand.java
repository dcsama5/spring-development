package com.springinaction.springidol.spel;

import java.util.*;

public class OneManBand implements Performer {

	public OneManBand()
	{
		
	}
	@Override
	public void perform() throws PerformanceException {
	
		for(Object key : instruments.keySet())
		{
			System.out.println(key + " : ");
			String instrument = (String) instruments.get(key);
			System.out.println(instrument);
		}
		
		System.out.println(song);

	}
	
	private String song;
	
	public void setSong(String song)
	{
		this.song = song;
	}
	
	private Properties instruments;
	
	public void setInstruments(Properties instruments)
	{
		this.instruments = instruments;
	}
	
	

}
