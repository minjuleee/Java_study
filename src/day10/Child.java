package day10;

import utils.Mu;

public class Child extends Parent {
	String name = "Huntrix";
	
	Child(){
		Mu.p("Child Created(" + super.name + "의 후손)");
	}
	
	void eat() {	// Overriding
		super.eat();
		Mu.p("아이스크림 먹기");
		Mu.p("불량식품 아폴론 먹기");
	}
}
