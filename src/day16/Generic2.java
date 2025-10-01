package day16;

import java.util.ArrayList;

import utils.Mu;

public class Generic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LuxuryBox<Instrument> box1 = new LuxuryBox();
		LuxuryBox<Violin> box2 = new LuxuryBox();
		LuxuryBox<Flute> box3 = new LuxuryBox();
		
//		LuxuryBox<Bat> box4 = new LuxuryBox();
//		extends Instrument 조건에 의해 입구컷 당함
		
		Bat bat = new Bat();
		Mu.p(box3.<Bat>get(bat) + "");
		Mu.p(box3.<String>get("Cello") + "");
		
	}

}

class Instrument {}
class Violin extends Instrument {}
class Flute extends Instrument {}

class SportsTool {}
class Bat extends SportsTool {}

class LuxuryBox<T extends Instrument> {
	ArrayList<T> items = new ArrayList();
	
	public <T> T get(T data) {
		return data;
	}
}