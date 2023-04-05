package Operator;

import java.util.Scanner;

public class Tri2 {
	
	public static void main(String args[ ]){

		Scanner sc = new Scanner(System.in);
		int age;
		String result;
		System.out.print("나이를 입력하세요 :  ");
		age = sc.nextInt();

		result = ( age <= 19)? "청소년":  "성인";

		System.out.print("당신은 " + result + "입니다");

	    }

}
