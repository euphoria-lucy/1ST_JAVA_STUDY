package Test;

/* 사각형을 정의하고 넓이를 구하자.
 1. 가로, 세로 길이를 주면 사각형을 생성한다. 생성자메서드에 가로세로 길이 들어옴
 2. getter, setter
 3. 넓이를 구하는 메서드는 getArea()
 4. 출력 → toString() 오버라이딩 */

class Reactangle{
	private int width;
	private int height;
	
	
	public Reactangle() {}
	public Reactangle(int width, int height) {
		this.height = height; // this.setHeight(height); 이렇게 하면 캡슐화됨
		this.width = width; // this.setWidth(width):
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getArea() {
		return this.height * this.width; // return this.getHeight() * this.getWidth(); 이렇게 할 수 있음
	}

	@Override
	public String toString() {
		return "Reactangle [가로 = " + width + ", 세로 = " + height + ", 면적 = " + getArea() + "]";
	}
	
}

public class RectangleTest {

	public static void main(String[] args) {

		Reactangle r1 = new Reactangle(10, 7);
		System.out.println(r1.toString());

	}

}

