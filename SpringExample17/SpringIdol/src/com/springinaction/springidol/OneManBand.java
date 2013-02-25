package com.springinaction.springidol;

import java.util.*;

public class OneManBand implements Performer {

	public OneManBand()
	{
		
	}
	@Override
	public void perform() throws PerformanceException {
	
		for(String key : instruments.keySet())
		{
			System.out.println(key + " : ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
		poem.recite();
		

	}
	
	private Poem poem;
	
	public void setPoem(Poem poem)
	{
		this.poem = poem;
	}
	
	private Map<String, Instrument> instruments;
	
	public void setInstruments(Map<String, Instrument> instruments)
	{
		this.instruments = instruments;
	}
	
	public Poem getPoem()
	{
		return this.poem;
	}

}
