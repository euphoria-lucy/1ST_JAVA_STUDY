package Test;

public class Square_Test {

	public static void main(String[] args) {

		Square s1 = new Square() ;
		s1.base = 25;
		s1.height = 7;
		System.out.println("사각형의 넓이 : " + s1.getArea());
		System.out.println("사각형의 둘레 : " + s1.getRound());
	}

}

