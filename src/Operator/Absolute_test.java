// a 값의 부호 반전 : a*(-1)

package Operator;

import java.util.Scanner;

public class Absolute_test {
	
	public static void main(String args[ ]){

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("정수 입력 :  ");
		num = sc.nextInt();
	 	if (num>0){
			System.out.print(num+"의 절대 값은" + num + "입니다");
		} else {
			System.out.print(num+"의 절대 값은" + num*(-1) + "입니다");	
		}		

	}

}
