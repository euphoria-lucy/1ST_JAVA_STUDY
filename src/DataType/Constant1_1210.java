package DataType;

import java.util.Scanner;

public class Constant1_1210 {

	public static void main(String args[ ]){

		Scanner sc = new Scanner(System.in);

		System.out.print("시험점수 :   ");
		int score = sc.nextInt( );
		final int standard = 85;
		System.out.println(score+"-"+standard+"="+(score - standard));

	    }
	
}
