package day12;

public class Calculator implements CalculatorI {
	int first, second, third;
	
	public void setOperand(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public int sum() {
		return first + second + third;
	}
	
	public double avg() {
		return (double)sum() / 3;
	}
}
