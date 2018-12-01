package com.orupro.DesignPattern.StrategyPattern;

public class OfficeWorker extends Human{

	public OfficeWorker() {
		topWear = new FormalShirt();
		bottomWear = new FormalPant();
	}
	
}
