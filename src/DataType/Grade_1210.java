package DataType;

import java.util.Scanner;

public class Grade_1210 {

	public static void main(String args[]){

		String name;
		int homework;
		int bonus;
		int total;

		System.out.println("------- 자바실행 -------");
		System.out.println("이름   과제   보너스   합계");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 :   ");
		name= sc.next();
		System.out.print("과제 점수 입력 :   ");
		homework = sc.nextInt( );
		System.out.print("보너스 점수 입력 :   ");
		bonus = sc.nextInt( );
		total =homework+bonus;
		System.out.println(name + "\t" + homework + " \t" + bonus + "\t" + total); 

		System.out.print("이름 입력 :   ");
		name = sc.next();
		System.out.print("과제 점수 입력 :   ");
		homework = sc.nextInt( );
		System.out.print("보너스 점수 입력 :   ");
		bonus = sc.nextInt( );
		total = homework+bonus;
		System.out.println(name + "\t" + homework + " \t" + bonus + "\t" + total);

		System.out.print("이름 입력 :   ");
		name = sc.next();
		System.out.print("과제 점수 입력 :   ");
		homework = sc.nextInt( );
		System.out.print("보너스 점수 입력 :   ");
		bonus = sc.nextInt( );
		total = homework+bonus;
		System.out.println(name + "\t" + homework + " \t" + bonus + "\t" + total);


	    }
	
}
