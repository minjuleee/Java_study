package day10;

import utils.Mu;

public class Parent {
	String name = "Parent";
	String familyName = "Leopard";
	
	Parent(){
		Mu.p("Parent Created");
	}
	
	void eat() {
		Mu.p("빵 먹기");
		Mu.p("밥 먹기");
		Mu.p("미소라멘 먹기");
		Mu.p("음료수 먹기");
	
	}
}
