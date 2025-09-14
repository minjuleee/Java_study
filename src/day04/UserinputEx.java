package day04;

import java.util.Scanner;

import utils.Mu;

public class UserinputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mu mu = new Mu();
		mu.p("User Input Example");
		
		// 1. 실행 시 입력하기
		String workDate = args[0];
		mu.p("작업일자 : " + workDate);
		String workType = args[1];
		mu.p("작업유형 : " + workType);
		
		// 2. Scanner 사용하기
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하십시오 : ");
		String name = sc.next();
		mu.p("앗 당신이 그 유명한 \"" + name + "\"님?");
		
		int score1;
		System.out.print("당신의 Java 점수를 입력하십시오 : ");
		score1 = sc.nextInt();
		mu.p(name + "님, " + (score1>50? "계속하십시오" : "관둬"));
		
		double score2;
		System.out.print("당신의 IQ를 입력하십시오 : ");
		score2 = sc.nextDouble();
		mu.p("당신의 지능점수는 " + score2 + " 실화냐?");
		

	}

}
