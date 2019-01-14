package com.danaedwards;

public class PC
{
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	public PC(Case theCase, Monitor monitor, Motherboard motherboard)
	{
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
	public void powerUp() {
//		getTheCase().pressPowerButton();
		// Even better:
		theCase.pressPowerButton();
		drawLogo();
	}
	
	private void drawLogo() {
		monitor.drawPixelAt(1200, 800, "yellow");
	}
	// Let's change to private, we won't be able to access them from Main
//	public Case getTheCase()
	private Case getTheCase()
	{
		return theCase;
	}
//	public Monitor getMonitor()
	private Monitor getMonitor()
	{
		return monitor;
	}
//	public Motherboard getMotherboard()
	private Motherboard getMotherboard()
	{
		return motherboard;
	}
	
	
}
