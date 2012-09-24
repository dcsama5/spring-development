package com.springinaction.springidol;

public class PoeticJuggler extends Juggler{

	private Poem poem;
	
	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	}
	
	public void perform() throws PerformanceException {
		super.perform();
		System.out.println("WHile reciting...");
		poem.recite();
	}
	
}
