package day03;

import utils.Mu;

public class OperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mu.p(Mu.RED + "Operation Example" + Mu.END);
		
		// 1. 대입 연산
		int a = 100;	// 100을 a에 할당(assign)
		String b = "Winter";
		
		Mu.p("1. 대입 연산 : " + a + ", " + b);
		
		// 2. 대입 연산 II
		a += 10;	// 더해서 넣는다.
		Mu.p("2. 대입 연산 II : " + a);
		Mu.p("" + a);
		
		System.out.println(a);
		
		// 3. 산술 연산
		a = 5 + 5 * 2;	// a = 15
		a = (5 + 5) * 2;	// a = 20
		Mu.p("3. 산술 연산 : " + a);
		
		// 4. 산술 연산 II
		final int NUM_OF_GROUP = 11;
		int job = 1625342112 % NUM_OF_GROUP;
		Mu.p("4. 담당 작업 " + job + "입니다");
		
		// 5. 산술 연산 III
		float numf = 10 / 4;	// 정수와 정수의 연산 결과는 정수
		Mu.p("5. 산술 연산 III : " + numf);
		float numf2 = 10F / 4;
		Mu.p("5. 산술 연산 III : " + numf2);
		float numf3 = (float)(10 / 4D);
		Mu.p("5. 산술 연산 III : " + numf3);
		
		// 6. 0으로 나누어보기
		// float num = 10 / 0;		// 현재는 오류가 남(Exception)
		
		// 7. 증감 연산
		int x = 10, y = 10;
		int x1 = x++;	// x를 x1에 넣고 ++ 처리 
		int y1 = ++y;	// y를 ++하고 y1에 넣기 
		Mu.p("7. 증감 연산 : " + x1 + ", " + y1);
		
		// 8. 비교 연산
		int a1 = 10, a2 = 5;
		Mu.p("8. 비교 연산 : " + (a1 == a2));
		
		// 9. 논리 연산
		boolean result1 = 100.0 <= 99.99999999;	// false
		boolean result2 = (10 % 3) == 1;	// true
		Mu.p("9. 논리 연산: " + result1);
		Mu.p("9. 논리 연산: " + result2);
		Mu.p("9. 논리 연산: " + (result1&&result2));	// 둘 다 true여야만 true
		Mu.p("9. 논리 연산: " + (result1||result2));	// 둘 중 하나만 true이면 true
		Mu.p("9. 논리 연산: " + (result1^result2));
		
		// 10. 삼항 연산
		int score = 70;
		String dad1 = score > 60 ? "잘했어" : "?!?!?!?!?";
		String dad2 = score > 99 ? "당연 " : "그것도 점수냐?";
		Mu.p("10. 삼항연산: dad1, dad2: " + dad1 + ", " + dad2);
		
		String host1 = (score > 30)? "맥주 ":"야 그냥 귀국해";
		Mu.p("10. host1 : " + host1);
		
		// 점수가 90점 이상이면 A, 80점 이상이면 B, 그 아래면 F
		score = 90;
		String grade = (score>=90)? "A" : (score>=80)? "B" : "F";
		Mu.p("10. Final Grade = " + grade);
	}

}
