/* 숫자를 입력받아 짝수면 "짝수", 홀수이면 "홀수" 라고 출력한다
1. 키보드 입력 n
2. n%2 == 0 짝수
3. if (조건) {
         참
   }else{
         거짓
   }
*/

package Operator;

import java.util.Scanner;

public class Arith_Test2 {
	
	public static void main(String args[ ]){

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();

		if (num%2 == 0){
		    System.out.println("짝수");
		}else{
		    System.out.println("홀수");
		}

		System.out.println( 3==4 );
		System.out.println( 3!=4 );
		System.out.println( 3>4 );
		System.out.println( 3<5 );
		System.out.println( 3>=3 );
		System.out.println( 3<=3 );
		

	   }

}
