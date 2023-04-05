package Control_statement;

import java.util.Scanner;

public class GGcd{
    public static void main(String args[ ]){

	int gcd(int num1, num2){
	    if ( num2 == 0 ){
		return num1;
	    }else{
		return gcd (num2, num1 % num2);
	    }
	}

	Scanner sc = new Scanner(System.in);
	System.out.print("정수를 입력하세요 :  ");
	int num1 = sc.nextInt();
	System.out.print("정수를 입력하세요 :  ");
	int num2 = sc.nextInt();

	System.out.println("최대공약수는  " + gcd (num1, num2) + " 입니다.");

    }
}
