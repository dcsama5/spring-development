package com.springinaction.springidol;


import java.util.*;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eddie")
public class Instrumentalist implements Performer {
    
    
	
        @Value("3")
        private int noOfdicks;

    public Poem getPoem() {
        return poem;
    }

    public int getNoOfdicks() {
        return noOfdicks;
    }

    public Instrument getInstrument() {
        return instrument;
    }
        
    
    
        @Autowired
	private Poem poem;
        
        

	@Override
	public void perform() throws PerformanceException {
		instrument.play();
		poem.recite();
	}
	
	
	
	private Instrument instrument;
    
        @Inject
        @Named("piano")
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
