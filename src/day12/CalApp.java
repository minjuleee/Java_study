package day12;

import utils.Mu;

public class CalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mu.p(Mu.BOLD + Mu.RED + "Super Calculator De Jesus" + Mu.END);
		
//		CalculatorDummy c = new CalculatorDummy();
		Calculator c = new Calculator();
		
		c.setOperand(10, 20, 31);
		Mu.p("합계는 두둥 " + c.sum());
		Mu.p("초 어려운 연산 평균은 " + c.avg());
	}

}

 class CalculatorDummy implements CalculatorI {
	 public void setOperand(int a, int b, int c) {
		 
	 }
	 
	 public int sum() {
		 return 100;
	 }
	 
	 public double avg() {
		 return 30.0;
	 }
 }