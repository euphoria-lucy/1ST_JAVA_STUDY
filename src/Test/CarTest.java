package Test;


public class CarTest {

	public static void main(String[] args) {
		
		// 인스턴스 (instance) 객체 (c1) 생성
		 Car c1 = new Car(); // c1을 Car에서 가져옴
		 c1.name = "캐스퍼";
		 
		 for (int i = 0; i < 10; i++) { // 10번 반복
			 c1.speedUp(); // 속도 : 100
		 }
		 System.out.println(c1.name + "의 속도 : " + c1.speed);
		 
		 
		 Car c2 = new Car();
		 c2.name = "그랜저";
		 
		 c2.speedUp();c2.speedUp();c2.speedUp();
		 c2.speedDown();
		 System.out.println(c2.name + "의 속도 : " + c2.speed);
	}

}

