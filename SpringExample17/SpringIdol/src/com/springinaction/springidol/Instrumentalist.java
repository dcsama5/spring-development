package com.springinaction.springidol;


import java.util.*;

public class Instrumentalist implements Performer {
	private Poem poem;
	
	public Instrumentalist(Poem poem) 
	{
		this.poem = poem;
		
	}
	@Override
	public void perform() throws PerformanceException {
		instrument.play();
		poem.recite();
	}
	
	
	
	
	private Instrument instrument;
	
	public void setInstrument(Instrument instrument)
	{
		this.instrument = instrument;
	}

	public Collection<Instrument> getInstruments() {
		Collection<Instrument> instruments = new ArrayList<Instrument>();
		instruments.add(this.instrument);
				return instruments;
	}

	

}
