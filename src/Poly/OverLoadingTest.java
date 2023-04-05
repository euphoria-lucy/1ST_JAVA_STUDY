package Poly;

//다형성 오버로딩 : 한 클래스 안에서 매개변수가 다른 것은 각기 다른 행동 (이름이 같더라도)
class Test{
	int number;
	public void show() { // 매개변수 없을 때
		System.out.println("내 번호 :  " + number);
	}
	
	public void show(String name) { // 메서드 이름은 같지만 매개변수에 따라 다르게 행동함 // main이 있을 때
		System.out.println("내 이름 :  " + name);
	}
}
public class OverLoadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		t1.number = 1;
		t1.show();
		t1.show("나미림");
	}

}
