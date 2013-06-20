package examples;
public class Instrumentalist implements Performer {
	
	public Instrumentalist() 
	{
		
		
	}
	@Override
	public void perform() throws PerformanceException  {
		thisinstrument.play();
		System.out.println(song);
	}
	
	public String song;
	
	public void setSong(String song)
	{
		this.song = song;
	}
	
	private Instrument thisinstrument;

    public Instrument getInstrument() {
        return thisinstrument;
    }
	
	public void setInstrument(Instrument thisinstrument)
	{
		this.thisinstrument = thisinstrument;
	}

	public String getSong()
	{
		return this.song;
	}

}
