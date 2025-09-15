package day05;

import java.util.Random;

import utils.Mu;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mu.p("Switch Example");
		
		Random rd = new Random();
		
		int i = rd.nextInt(3);	// i는 0, 1, 2 중 하나
		
		switch(i){
			case 0:
				Mu.p("아 0이시네 꽝입니다.");
				break;
			case 1:
				Mu.p("아 1이시네 꽝입니다.");
				break;
			case 2:
				Mu.p(Mu.RED + Mu.BOLD + "축 !! 당첨" + Mu.END);
				break;
			default:
				Mu.p("엄청난 시스템 버그 발생... 정상이 아님");
		}
		
		// 의도적으로 break를 빼는 경우
		// 아래 단계 작업이 상위 작업ㅇ르 반드시 포함해야하는 경우
		// 작업간 계층 구조가 존재할 때
		
		int workProcess = rd.nextInt(4);
		Mu.p("앞으로 해야할 작업은???");
		
		switch(workProcess) {
			case 0:
				Mu.p("Step1 : 작업준비");
			case 1:
				Mu.p("Step2 : 개발준비");
			case 2:
				Mu.p("Step3 : 개발완료");
			case 3:
				Mu.p("Step4 : 출시준비");		
		}
		
		// if 문으로 구현한다면
		if(workProcess == 0) {
			Mu.p("Step1 : 작업준비");
			Mu.p("Step2 : 개발준비");
			Mu.p("Step3 : 개발완료");
			Mu.p("Step4 : 출시준비");
		}
		else if(workProcess == 1) {
			Mu.p("Step2 : 개발준비");
			Mu.p("Step3 : 개발완료");
			Mu.p("Step4 : 출시준비");
		}
		else if(workProcess == 2) {
			Mu.p("Step3 : 개발완료");
			Mu.p("Step4 : 출시준비");
		}
		else {
			Mu.p("Step4 : 출시준비");
		}
		
		// switch case를 이용하여 다음을 구현해보세요.
		// 임의의 수(0~9)를 하나 얻는다.
		// 홀수인지 짝수인지 출력하는 로직을 구현해보세요.
		int num = rd.nextInt(10);
		String result = "";
//		switch(num) {
//			case(0):
//				result = "짝수";
//				break;
//			case(1):
//				result = "홀수";
//				break;
//			case(2):
//				result = "짝수";
//				break;
//			case(3):
//				result = "홀수";
//				break;
//			case(4):
//				result = "짝수";
//				break;
//			case(5):
//				result = "홀수";
//				break;
//			case(6):
//				result = "짝수";
//				break;
//			case(7):
//				result = "홀수";
//				break;
//			case(8):
//				result = "짝수";
//				break;
//			case(9):
//				result = "홀수";
//				break;
//		}
//		Mu.p("결과 :" + result);
		
		// 방법 1
		switch(num % 2) {
			case 0:
				Mu.p("num : " + num + ", 짝수");
				break;
			default:
				Mu.p("num : " + num + ", 홀수");
		}
		
		// 방법 2
		switch (num) {
			case 0, 2, 4, 6, 8:
				Mu.p("num : " + num + ", 짝수");
				break;
			case 1, 3, 5, 7, 9:
				Mu.p("num : " + num + ", 홀수");
				break;
		}
		
	}

}
