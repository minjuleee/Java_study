package day06;

import java.util.Scanner;

import utils.Mu;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mu.p("While Example");
		
		int i = 0;
		while(i < 100) {
			Mu.p("현재의 i 값은 " + i + "입니다.");
			i++;
			// i = 10000;
		}
		Mu.p("이 시점에서의 i는 몇인가? " + i);
		
		// Infinity Loop
		i = 0;
		while(true) {
			Mu.p("Current i = " + i);
			i++;
			
			if(i % 10000 == 9999) {
				Scanner sc = new Scanner(System.in);
				System.out.print("그만할까요(Y) : ");
				if(sc.next().equals("Y")) {
					break;
				}
			}
		}

	}

}
