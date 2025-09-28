package day12;

import utils.Mu;

public interface MyInterface {
	int aaa = 500;	// 인터페이스에서 변수를 정의하면 자동으로 static이 된다.
	
	void myMethod();
	
	default void dMethod() {
		Mu.p("[dMethod()] Called");
	}
	
	default void dMethod2() {
		Mu.p("[dMethod2()] Called");
	}
	
	static void sMethod() {
		Mu.p("[sMethod] 누가 저를 부르셨어요?");
	}
}
