package ClassAndObject;

//부피를 구하자, 멤버변수만 갖자
class Box{
	private int width; // 캡슐화 시켜 정보보호하기
	private int height;
	private int depth;
	
	public Box() {} // 매개변수가 있을 때는 이렇게 없는 것을 하나 입력해주면 좋음
	
	public Box(int width, int height, int depth) {
		this.width = width; // this는 "지금 나의"라는 의미
		this.height = height;
		this.depth = depth;
	}
	
	public int getVolume() {
		return this.depth * this.height * this.width;
	}
}

public class BoxTest {
	public static void main(String[] args) {
		Box b1 = new Box(5, 4, 3);
		/* b1.depth = 5;
		b1.height = 4;
		b1.width = 3; */
		// System.out.println("부피 :  " + (b1.depth * b1.height * b1.width)); → 캡슐화X
		System.out.println("부피 :  " + b1.getVolume());
	}
}
