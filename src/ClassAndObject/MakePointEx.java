package ClassAndObject;

/* 좌표 상의 점을 모델링하여 점을 생성하고 이동하는 프로그램을 작성해보자.
1. x,y 좌표를 입력 받아 점을 생성한다.
2. 생성자메서드를 통해 점을 생성한다.
3. 점의 현재 위치를 출력한다.
4. 점을 입력 받은 값만큼 이동한다.*/

class MakePoint{
	// 멤버변수
	private double x;
	private double y;
	
	// 생성자메서드 → 오버로딩
	public MakePoint() {}
	
	public MakePoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// 점을 이동시키고 기다리기 때문에 리턴타입X
	public void movePoint(double dx, double dy) { // dx 대신 offsetX, dy 대신 offsetY로 작성해도 됨
		this.x = this.x + dx;
		this.y = this.y + dx;
		// this.printPoint(); // 점을 이동시킨 것을 보여주고 싶으면 작성
	}
	
	public void printPoint() {
		System.out.println("점의 좌표 : (" + x + " , " + y + ")");
	}
}

public class MakePointEx {

	public static void main(String[] args) {
		
		MakePoint p1 = new MakePoint(3.5, 6.7);
		p1.printPoint();
		p1.movePoint(-5.2, 2.3);
		p1.printPoint(); // this.printPoint(); 대신 작성해도 프린팅이 됨

	}

}

