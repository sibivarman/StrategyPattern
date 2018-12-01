package com.orupro.DesignPattern.StrategyPattern;

public class StrategyPattern {

	public static void main(String[] args) {
		new StrategyPattern().demo();
	}
	
	private void demo() {
		goToOffice();
	}
	
	private void goToOffice() {
		
		//When humans go to office
		Human human = new OfficeWorker();
		human.liveLife();
		human.showTopWear();
		human.showBottommWear();
		
		//When humans go outing with friends
		human = new FriendlyHuman();
		human.liveLife();
		human.showTopWear();
		human.showBottommWear();
	}
	
}
