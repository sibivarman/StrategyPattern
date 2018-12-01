package com.orupro.DesignPattern.StrategyPattern;

public class FriendlyHuman extends Human{

	public FriendlyHuman() {
		topWear = new CasualShirt();
		bottomWear = new JeanPant();
	}
	
}
