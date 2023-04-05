/* 두 개의 임의의 실수(3.5와 7.2를 정의하고
사칙연산의 결과를 출력하는 프로그램을 작성하시오 */

package DataType;

import java.util.Scanner;

public class Four_op_1210 {

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		double number1;
		double number2; // 일반화
		
		System.out.print("첫 번째 실수 입력 :   ");
		number1 = sc.nextDouble();
		System.out.print("두 번째 실수 입력 :   ");
		number2 = sc.nextDouble();

		System.out.println(number1+number2);
		System.out.println(number1-number2);
		System.out.println(number1*number2);
		System.out.println(number1/number2);
		// System.out.println(number1 + "+" + number2 + (number1 + number2));
		// System.out.println(number1 + "-" + number2 + (number1 - number2));
		// System.out.println(number1 + "*" + number2 + (number1 * number2));
		// System.out.println(number1 + "/" + number2 + (number1 / number2));
	    }
	
}
