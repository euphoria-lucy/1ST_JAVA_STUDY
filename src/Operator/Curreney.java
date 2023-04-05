/* 50000원은 money / 50000
   10000원은 50000원 나눈 나머지 / 10000
   5000원은 10000원 나눈 나머지 / 5000 
   이런 식으로 계산하기 */

package Operator;

import java.util.Scanner;

public class Curreney {

	public static void main(String args [ ]){

		Scanner sc = new Scanner(System.in);
		System.out.print("금액 입력 :  ");
		int money = sc.nextInt();
	         // if (money > 0){
		int five_man = money / 50000;
		int one_man = (money%50000)/10000;
		int five_chun = (money%10000)/5000;
		int one_chun = (money%5000)/1000;
		int five_back = (money%1000)/500;
		int one_back = (money%500)/100;
		int five_ship = (money%100)/100;
		int one_ship = (money%50)/100;
		int five = (money%10)/5;
		int one = (money%5)/1;
		System.out.println("오만원권 " + five_man + " 개" + "\n" + "만원권 " + one_man + " 개" + "\n" + "오천원권 " + five_chun + " 개" + "\n" + "천원권 " + one_chun + " 개" + "\n" + "오십원 " + five_ship + " 개" + "\n" + "십원 " + one_ship + " 개" + "\n" + "오원 " + five + " 개" + "\n" + "일원 " + one + " 개");
		// 백원, 오백원 하기
		
	    }
	
}
