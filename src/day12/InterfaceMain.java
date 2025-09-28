package day12;

import utils.Mu;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mc = new MyClass();
		Mu.p("mc.aaa = " + MyInterface.aaa);
		Mu.p("mc.aaa = " + MyClass.aaa);
		
		mc.dMethod();
		mc.dMethod2();
//		mc.sMethod(); // static 함수는 구현되지 않
		MyInterface.sMethod();	// static함수로 인해 더욱 인터페이스의 정의가 모
		
		// Headaches 
		MyInterface mi = new MyClass();	// 인터페이스의 변수는 사용하기 위해
		mi.dMethod2();
		Mu.p("mi.aaa = " + mi.aaa);
//		mi.sMethod();	// 실제로 new로 만들어진 객체는 MyClass
//		MyInterface mi2 = new MyInterface();	// 어림도 없음
	}

}
