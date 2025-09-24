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
	
	// @Getter
	public int getAge() {
		return age;
	}
	
	// @Setter
	public void setAge(int age) {
		this.age = age;
	}
	
	// 변수는 대부분 private
	// => 변수마다 set/get 메서드가 존재할 가능성이 높다
	// => 변수가 100개면? => set/get 합쳐서 200개 개발?
	
	// getter/setter는 추후 Spring에서 lombok 라이브러리를 통해 
	// 해당하는 getter/setter 들 + toString()
}
