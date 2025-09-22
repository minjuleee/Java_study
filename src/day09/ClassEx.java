package day09;

import utils.Mu;

public class ClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Mu.p(car1.toString());
		
		Car car2 = new Car("검정색", "마이바흐", "럭셔리");
		Mu.p(car2.toString());

	}

}

class Car {
	// instance 변수
	String color;
	String name;
	String type;
	
	// Constructor
	Car(){
		color = "미정";
		name = "비밀";
		type = "기본형";
		Mu.p("Car가 생성되었습니다.");
	}
	
	Car(String color, String name, String type){
		this.color = color;
		this.name = name;
		this.type = type;
		Mu.p("Car(...)가 생성되었습니다.");
	}
	
	// Method
	public String toString() {
		return "차 색상은 " + color + ", 이름은 " + name + ", 타입은 " + type;
	}
	
	// Code Block - 객체생성 전에 호출 static-한번만 생성, {} - 객체생성시 계속 호출
	static {
		Mu.p("static{}가 호출되었습니다.");
	}
	{
		Mu.p("{}가 호출되었습니다.");
	}
}
