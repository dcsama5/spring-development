package com.springinaction.springidol.spel;

public class Instrumentalist implements Performer {
	
	public Instrumentalist() 
	{
		
		
	}
	@Override
	public void perform() throws PerformanceException {
		instrument.play();
		System.out.println(song);
	}
	
	public String song;
	
	public void setSong(String song)
	{
		this.song = song;
	}
	
	private Instrument instrument;
	
	public void setInstrument(Instrument instrument)
	{
		this.instrument = instrument;
	}

	

}
