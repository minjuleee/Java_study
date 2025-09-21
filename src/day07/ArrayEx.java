package day07;

import utils.Mu;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mu.p("Array Example");
		
		String[] str = new String[5];
		Mu.p("str.length?? " + str.length);
		str[0] = "Eliot";
		str[3] = "Sala";
		
		// 배열의 length
		Mu.p("str.length?? " + str.length);
		
		// String을 정의하는 2가지 방법
		String[] stdName1 = new String[5];
		String[] stdName2 = {"A", "B", "C", "D", "Federer"};
		
		String aaa = new String("James");
		String bbb = "David";
		String ccc = new String("James");
		String ddd = "David";
		
		Mu.p("aaa == ccc? " + (aaa==ccc));	// false
		Mu.p("bbb == ddd? " + (bbb==ddd));	// true
		
		// 문자열은 값을 직접 입력한 경우 같은 값을 갖는 변수끼리 재사용한다.
		// -> 메모리 낭비를 막아줄 수 있음
		// -> new로 선언하고 같은 지 확인하기 위해서는 equals 메서드를 사용한다.
		Mu.p("aaa == ccc? " + (aaa == ccc));
		Mu.p("bbb == ddd? " + (bbb == ddd));
		Mu.p("aaa == ccc? " + aaa.equals(ccc));
		
		int score1 = 100;	// primitive type
		Integer score2 = new Integer(100);	// class type
		// => Integer class의 기능을 활용하는 것이 아니면 primitive 사용 권장
		
		int[] scores = {10, 20, 10, 30, 20};
		
		// stdName2와 scores를 이용하여 학생의 이름과 점수를 출력해보세요.
		// 학생이름1 : **점
		// 학생이름2 : **점
		// ...
		for(int i=0;i<stdName2.length; i++) {
			Mu.p(stdName2[i] + " : " + scores[i] + "점");
		}
		
		// 2-dimensional array
		String[][] classStd = {{"A", "B"}, {"C", "D"}};
		// classStd[0][0] ~ classStd[1][1]
		// A학생의 위치는 classStd[0][0]
		// C학생의 위치는 classStd[1][0]
		String[] class0 = classStd[0];	// 차원 축소 -> 곰곰히 생각해볼 
		
		// 학년, 반, 학생 => String[][]
		// => 학 번 직접 써보면 다시는 안쓰게 됨
		
		// 모든 학생 이름 출력하기
		Mu.p("");
		Mu.p("General");
		for(int i=0; i<stdName2.length; i++) {
			Mu.p(stdName2[i]);
		}
		
		Mu.p("");
		Mu.p("Enhanced For");
		for(String name : stdName2) {
			Mu.p(name);
		}
		
		// Enhanced For를 이용하여 점수를 출력하시오.
		for(int score : scores) {
			Mu.p("" + score);
		}
		
		// Enhanced For를 활용한 Difficulty GOD 문제
		// String[][] classStd = {{"A", "B"}, {"C", "D"}}
		// 모든 학생의 이름을 출력해보세요.
		for(String[] cls : classStd) {
			for(String std : cls) {
				Mu.p("학생이름 : " + std);
			}
		}
	}

}
