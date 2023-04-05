package ClassAndObject;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(5);
			// c1.r = 5;
			// c1.getRound(); // 반지름 2로 잡아놓고 괄호 안에 매개변수를 넣으면 구하고자하는 것은 반지름이지만, 구해지는 것은 괄호 안 매개변수이다.
			System.out.println("둘레 :  " + c1.getRound()); // 이 괄호 안에는 매개변수 넣으면 안됨
			System.out.println("넓이 :  " + c1.getArea());
			
			
		Circle c2 = new Circle(10); // 반지름이 없는 원 만들기
		// c2.r = 10; // 반지름을 10으로 늘림(바꿈)
		System.out.println("둘레 :  " + c2.getRound());
		System.out.println("넓이 :  " + c2.getArea());
		
		Circle c3 = new Circle(7);
		// c3.r = 7;
		System.out.println("둘레 :  " + c3.getRound());
		System.out.println("넓이 :  " + c3.getArea());
		
	}

}

