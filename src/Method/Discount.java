package Method;

/* 할인점에서 하나에 100,000원인 제품을 판매한다. 그 제품을 10개 이상 사는 고객에게는 10%를 할인
해준다. 고객이 구입한 그 제품의 수량을 입력하면 총 가격을 계산하는 프로그램을 설계하고 작성하라. 
Discount.java
가격을 계산하는 getPrice( )메서드를 작성 */

import java.util.Scanner;

public class Discount{
 public static void main(String args[ ]){

	Scanner sc = new Scanner(System.in);
	int productPrice = 100000;
	System.out.print("수량 입력 :  ");
	int count = sc.nextInt();
	getPrice( count, productPrice );
	
 } // main

 public static void getPrice( int productPrice, int count ){
	int price = 0;
	if (count >= 10){
		price = productPrice * count - ( productPrice * count ) / 10;
		System.out.println( "총 가격 : " + price + "원" );
	}else{
		price = productPrice*count;
		System.out.println(  "총 가격 : " + price + "원" );
	}
 }
}
