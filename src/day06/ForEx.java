package day06;

import utils.Mu;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mu.p("For Example");
		
		// 1. for
		for(int i=0; i<100; i++) {
			Mu.p("현재 i는 " + i + "입니다.");
		}
		
//		Mu.p("i는 과연 무엇인가?? " + i);
		
		for(int j=0; j>10; j++) {
			Mu.p("한 번이라도 도냐?");
		}
		
		// 2. do while
		boolean isTeacher = true;
		do {
			Mu.p("야 이 바보야");
		} while(isTeacher != true);
		// 출력이 안될 것으로 예상했으나 출력이 된다.
		// do는 먼저 실행부터 함. 사용시 유의
		
		// 실습과제
		// 1부터 100까지를 출력하되,
		// 3의 배수는 빼고 출력하십시오.
		
		for(int i=0; i<100; i++) {
			if((i+1) % 3 != 0) {
				Mu.p("" + (i+1));
			}
		}
	}

}
