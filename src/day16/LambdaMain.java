package day16;

import utils.Mu;

public class LambdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. General
		CalculableClass cc = new CalculableClass();
		cc.calculate(100, 1000);
		// 수식이 오래됐네..... 바꿔야? => 본체를 수정해야 함
		
		// 2. Anonymous Object(익명 객체)
		Calculable c1 = new Calculable() {
			public void calculate(int x, int y) {
				Mu.p("[익명객체] " + (x+y)*1.2);
			}
		};
		c1.calculate(100, 1000);
		
		// 3. Lambda I : 람다식으로 정의하면 자동으로 메서드와 매핑
		// 인터페이스의 함수가 반드시 1개(구현을 해야하는)
		Calculable c2 = (x, y) -> { Mu.p("[람다정식] " + (x+y)*1.3); };
		c2.calculate(100, 1000);
	}

}
