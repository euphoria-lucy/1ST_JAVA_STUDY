package Poly;

//다형성 → 오버라이딩
class Mom{
	int money;
	public void shopping() {
		System.out.println("알뜰 쇼핑을 합니다.");
	}
}

class Me extends Mom{
	String name;
	public void shopping() { // 부모의 메서드를 재정의
		System.out.println("메이크업 제품을 마음껏 삽니다.");
	}
}

public class OverringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Me m1 = new Me();
		m1.name = "양미성";
		m1.shopping();
	}

}

