/* 주어진 섭씨 온도를 화씨 온도로 바꾸어 주는 프로그램을 설계한 후 작성하시오.
     주어진 섭씨 온도는 15도이다.
     (섭씨 온도 C를 화씨 온도 F로 바꾸어 주는 공식은 F = 9/5*c + 32이다.) */
// 1. 데이터 파악 → 변수 선언 → 초기화 → 연산 → 결과 출력

package DataType;

import java.util.Scanner;

public class Temp_1210 {
	
	public static void main(String args[]){

		Scanner scan = new Scanner(System.in); // 입력받을 변수보다 위에 입력
		int celsius = scan.nextInt();
		double fahrenheit;

		fahrenheit = (double)9/5*celsius + 32;

		System.out.println(fahrenheit);
	    }

}
