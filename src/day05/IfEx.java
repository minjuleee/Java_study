package day05;

import java.util.Random;

import utils.Mu;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mu.p("If Example");
		
		Random rd = new Random();
		int a = rd.nextInt(151);
		Mu.p("현재 뽑힌 a의 값: " + a);
		
		if(a > 100) {
			Mu.p(Mu.RED + "a는 매우 큰 수군요" + Mu.END);
		}
		else if(a > 100) {
			Mu.p(Mu.GREEN + "a는 적당히 큽니다" + Mu.END);
		}
		else {
			Mu.p("a는 허접입니다.");
		}
		
		// nested
		int eng = rd.nextInt(101);
		int math = rd.nextInt(101);
		
		// 영어와 수학 점수가 모두 60점 이상이면 Pass, 아니면 Fail을 출력하시오.
		// 영어 : **점, 수학 : **점, Pass or Fail
		String result = "";
		if((eng >= 60) && (math >= 60)) {
			result = "Pass";
		} else {
			result = "Fail";
		}
		
		Mu.p("영어 : " + eng +"점, 수학 : " + math + "점, " + result);
		
		// 다른 방법 : 하나를 지정하고 아닐 때만 변경
		result = "Fail";
		
		if((eng >= 60) && (math >= 60)) {
			result = "Pass";
		}
		
		Mu.p("영어 : " + eng +"점, 수학 : " + math + "점, " + result);
	}

}
