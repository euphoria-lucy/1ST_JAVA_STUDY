// 나이를 입력 받아 19세 이상이면 성인, 그렇지 않으면 청소년 이라고 출력

package Operator;

import java.util.Scanner;

public class Relation_Test {
	
	public static void main(String args[ ]){

		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();

		if (age >= 19){
		    System.out.println("성인");
		}else{ // else = (age<19)
		    System.out.println("청소년");
		}

	 }

}
