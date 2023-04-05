package Test;

public class Triangle {
	int height; // 캡슐화 시키고 싶으면 int 앞에 private 붙이면 됨
	int base;
	
	public double getArea() {
		double area = height * base * 0.5;
		return area;
	}
}

