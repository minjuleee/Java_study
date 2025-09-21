package day08;

import utils.Mu;

public class Cat {
	
	int age;
	String name;
	static int numOfCats = 0;
	
	// Constructor
	Cat(String n){
		name = n;
		numOfCats++;
	}
	
	Cat(String n, int a){
		name = n;
		age = a;
		numOfCats++;
	}
	
	Cat(){
		name = "나중에";
		age = 1;
		numOfCats++;
	}
	
	public void eat() {
		Mu.p("야옹 하면서 밥달라고 한 후 밥을 먹는다");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("나비", 5);
		Mu.p("고양이의 이름은 : " + cat1.name);
		cat1.eat();
		Cat cat2 = new Cat();
		Cat cat3 = new Cat();
		Cat cat4 = new Cat();
		Cat cat5 = new Cat();
		Mu.p("전체 고양이 수 : " + Cat.numOfCats);
	}

}
