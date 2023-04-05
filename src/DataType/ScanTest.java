// 입력 받은 수(3)를 거꾸로 출력

package DataType;

import java.util.Scanner;

public class ScanTest {

	public static void main(String args[ ]){

		// 선언
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3; //정수 선언
		String input;

		// 입력
		System.out.print("숫자를 입력하세요.(스페이스로 분리) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		System.out.print("문자열 입력 : ");
		input = sc.next();

		// 출력
		System.out.println(num3);
		System.out.println(num2);
		System.out.println(num1);
		System.out.println(input);
		

	    }
	
}
