package day16;

import utils.Mu;

public class CalculableClass implements Calculable {
	public void calculate(int x, int y) {
		Mu.p("[아주일반적인방식임] " + (x+y));
	}
}
