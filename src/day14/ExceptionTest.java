package day14;


import java.text.SimpleDateFormat;
import java.util.Date;

import utils.Mu;

public class ExceptionTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.setOperand(100, 27);
		c.divide1();
		
		c.setOperand(100, 0);
//		c.divide1();
		c.divide2();
		try {
			c.divide3();
		}
		catch(Exception e) { e.printStackTrace(); }
		
		c.setOperand(10001, 3);
		try {
			c.divide4();
		}
		catch(Exception e) { e.printStackTrace(); }
		
		
		Mu.p("프로그램 완벽 정상 종료");
	}

}

class Calculator {
	int left, right;
	public int exCount = 0;
	
	public void setOperand(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	// 무대비
	public void divide1() {
		System.out.println("[divide()] " + left/right);
	}
	
	// 예외 대비
	public void divide2() {
		try {
			System.out.println("[divide()] " + left/right);
		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			e.printStackTrace();
			
			 exCount++;
			 Date d = new Date();
			 SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");
			 System.out.println(sdf.format(d) + ":" + "[B001]" + "left=" + left + ", right=" + right);
		}	
	}
	
	// 예고 또는 경고
	// 나 예외 날 수도 있으니 호출하시는 쪽에서 책임
	public void divide3() throws Exception {	
		System.out.println("[divide()] " + left/right);
	}
	
	// 사용자(개발자, 나)가 예외를 강제로 발생시키는 메서드
	public void divide4() throws Exception {
		
//		throw new Exception("아 그냥 기분 나빠");
		
		if(left > 10000) {	// left가 10000보다 큰 경우 나누기 안할래
			throw new Exception("10000을 넘게 주다니 너 장난치냐");
		}
		System.out.println("[divide()] " + left/right);
	}
	
	
	
	
	
	
}
