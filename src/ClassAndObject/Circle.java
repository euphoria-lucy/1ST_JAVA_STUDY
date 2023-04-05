package ClassAndObject;

public class Circle {

		
		// 멤버변수
		int r;
		final double PI = 3.14;
		
		// 생성자 메서드 → 인스턴스 생성
		public Circle(int r) { // 외부로부터 들어온 반지름을 
			this.r = r; // 내가 바꾼 반지름으로 넣겠다.
		}
		
		public double getRound() { // ()안에 매개변수 넣으면 안된다. 
			return (2*PI*this.r); // this : 나 자신의 인스턴스객체 의미
		}
		
		public double getArea() {
			return (PI*this.r*this.r); // "PI * 내가 갖고 있는 반지름 * 내가 갖고 있는 반지름" 이라는 의미
		}

}

