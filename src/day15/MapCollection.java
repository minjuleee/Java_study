package day15;

import java.util.HashMap;
import java.util.TreeMap;

public class MapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		TreeMap tm = new TreeMap();
		
		// (1) put() : 데이터 저장 
		hm.put("Steak", 10000);
		hm.put("Curry", 500);
		hm.put("Chicken", 20000);
		hm.put("Rice", 9000);
		
		tm.put("Steak", 10000);
		tm.put("Curry", 500);
		tm.put("Chicken", 20000);
		tm.put("Rice", 9000);
		
		System.out.println("HashMap : " + hm);
		System.out.println("TreeMap : " + tm);
		
		// (2) 데이터 조회 : get()
		System.out.println("치킨 얼마나 " + hm.get("Chicken"));
		
		// (3) 데이터 삭제 : remove(), 데이터 교체 : replace()
		hm.remove("Rice");
		hm.replace("Steak", 1000);
		System.out.println("[새로운 메뉴판] : " + hm);
		
		// Map Collection은 차후 등장할 JSON(제이슨) 형식을 해석하는데 유용하다.
		
	}

}
