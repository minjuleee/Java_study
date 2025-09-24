package day10;

import java.util.Random;

import utils.Mu;

public class DepartEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department[] dm = new Department[5];
		
		dm[0] = new Department("강남점");
		dm[1] = new Department("본점");
		dm[2] = new Department("USA점");
		dm[3] = new Department("일본점");
		dm[4] = new Department("속리산점");

		Department.setPranOpenInd(true);
		
		Random rd = new Random();
		for(int i=0; i<dm.length; i++) {
//			if(rd.nextInt(2) == 1)
//				dm[i].setOpenInd(true);
//			else
//				dm[i].setOpenInd(false);
			
			dm[i].setOpenInd(rd.nextInt(2)==1? true : false);
		}
		Mu.p("지점 오픈 상태 체크 결과");
		for(int i=0; i<dm.length; i++) {
			Mu.p(dm[i].name + "\t: " + (dm[i].getOpenStatus()? "열었어" : "닫았어"));
		}
		
		// 1억 이하의 임의의 금액을 얻은 후 1000단위 이하를 절사하여
		for(int i=0; i<10; i++) {
			for(int j=0; j<dm.length; j++) {
				int todayAmt = rd.nextInt(100000001) / 1000 * 1000;
				dm[j].addAmt(todayAmt);
			}
		}
		
		// 각 지점의 매출을 출력한다.
		for(Department dd : dm) {
			Mu.p(dd.name + "\t: " + dd.getAmt());
		}
	}

}

class Department {
	// 1. name : 백화점 지점의 이름, 생성할 때 지정 가능함
	// 2. pranName : 브랜드 이름, 수정 불가, 최초에 "내백화점"으로 세팅
	// 3. amt : 지점의 매출액, 초기값은 0, 직접 수정 불가
	// 4. openInd : 현재 지점의 오픈 가능 여부(true or false)
	// 5. pranOpenInd : 전체(브랜드) 레벨 백화점의 오픈 가능 여부
	// 6. getOpenStatus() : 현재 지점이 오픈 가능한지 여부를 return
	// 7. addAmt(int amt) : 매출액을 더하는 메서드
	
	// Step0. 클래스 설명 넣기
	// 백화점 지점 단위를 객체로 갖는 클래스
	
	// Step1. 필드 정의
	public String name;
	private static final String pranName = "내백화점";
	private int amt;
	private boolean openInd;
	public static boolean pranOpenInd;
	
	// Step2. Constructor
	Department(){
		name = "미정";
	}
	
	Department(String name){
		this.name = name;
	}
	
	
	// Step3. getOpenStatus를 구현
	public boolean getOpenStatus() {
		
		// 1번 방식
//		if(pranOpenInd == false) {
//			return false;
//		} else {
//			if(openInd == true)
//				return true;
//			else
//				return false;
//		}
		
		// 2번 방식
//		if(pranOpenInd == true && openInd == true) {
//			return true;
//		}
//		return false;
		
		// 3번 방식
		return pranOpenInd && openInd;
		
	}
	
	
	// Step4. Getter/Setter(openInd, pranInd, amt)
	
	// @Getter
	public boolean getOpenInd() {
		return openInd;
	}
	
	// @Setter
	public void setOpenInd(boolean openInd) {
		this.openInd = openInd;
	}
	
	// @Getter
	public boolean getPranOpenInd() {
		return pranOpenInd;
	}
	
	// @Setter
	public static void setPranOpenInd(boolean status) {
		pranOpenInd = status;
	}
	
	// @Getter
	public int getAmt() {
		return amt;
	}
	
	
	// Step5. User Function(addAmt)
	public void addAmt(int amt){
		this.amt += amt;
	}
}
