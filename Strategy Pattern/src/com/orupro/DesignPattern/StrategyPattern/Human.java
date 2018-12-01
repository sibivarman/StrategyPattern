package com.orupro.DesignPattern.StrategyPattern;

public abstract class Human {

	TopWear topWear;
	BottomWear bottomWear;
	
	void liveLife() {
		System.out.println("Do stupid thinngs........");
	}
	
	void showTopWear() {
		topWear.showTopWear();
	}
	
	void showBottommWear() {
		bottomWear.showBottomWear();
	}
	
}
