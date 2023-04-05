package Test;

//자동차가 운행한다.
public class Car {
	// 정적 특성
	String name;
	int speed = 0;
	
	// 동적인특성 (메서드)
	public void stop() {
		speed = 0;
	}
	public void speedUp() {
		speed += 10;
	}
	public void speedDown() {
		if (speed >= 10) { // 속도가 10 이상일 때
			speed -= 10;
		} else if (speed < 10 && speed >= 0) { // 속도는 항상 >= 0 (양수)
			speed = 0;
		}
	}
}

