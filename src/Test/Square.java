package Test;

public class Square {
	int base;
	int height;
	
	public int getArea() {
		int area = base * height;
		return area;
	}
	public int getRound() {
		int round = (base + height)*2;
		return round;
	}

}

