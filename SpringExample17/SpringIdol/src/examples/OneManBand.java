package examples;
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
		
		System.out.println(song);

	}
	
	private String song;

	public void setSong(String song)
	{
		this.song = song;
		
	}
	


	
	private Map<String, Instrument> instruments;
	
	public void setInstruments(Map<String, Instrument> instruments)
	{
		this.instruments = instruments;
	}
	
	public String getSong()
	{
		return this.song;
	}


}
