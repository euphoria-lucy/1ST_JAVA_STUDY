/* 나이, 성별(0: 남자, 1: 여자)을 입력받아 19세 미만이고 여자인 경우 
    입장료 (50000원)를 20% 할인하는 프로그램을 작성하라 */

package Operator;

import java.util.Scanner;

public class Logical_Test2 {

	public static void main(String args[ ]){

		Scanner sc = new Scanner(System.in);
		double money = 50000;
		double dc = 20;
		System.out.print("나이를 입력하세요 :   ");
		int age = sc.nextInt();
		System.out.print("성별을 입력하세요. 남자는 0, 여자는 1 :   ");
		int gender = sc.nextInt();
		if (age < 19 && gender == 1){
			System.out.println(money - money*0.8 + "원 입니다.");
		  }
		else {
			System.out.println(money + "원 입니다.");
		}

	    }
	
}
