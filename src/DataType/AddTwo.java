package DataType;

/* 두 정수 더하기 → 정해진 값 X → 변수 두 개
1. 변수 선언 → int(정수: integer), String(문자열)
2. 변수 초기화 → =(뒤의 값을 앞에 배정)
*/

public class AddTwo {

	public static void main(String args[ ]){
		int num1;
		int num2; // 메모리 할당
		num1 = 5;
		num2 = 7; // 초기화 => 값이 배정
		System.out.println(num1 + num2);

		num1 = 100;
		num2 = 1000;
		System.out.println(num1 + num2); // 가장 최근값만 남는다 => overwrite
		System.out.println(num1);
		System.out.println(num2);

	    }
	
}
