package day09;

import utils.Mu;

public class AuthEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mc = new MyClass();
		Mu.p("이름은 : " + mc.name);
		mc.name = "너의 이름은";
		Mu.p("이름은 : " + mc.name);
		Mu.p("너의 나이는 : " + mc.getAge());
		mc.setAge(40);
		Mu.p("너의 나이는 : " + mc.getAge());
	}

}

class MyClass {
	public String name = "Noname";
	private int age = 70;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
