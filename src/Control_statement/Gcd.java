package Control_statement;

import java.util.Scanner;

public class Gcd{
    public static void main(String args[ ]){

	Scanner sc = new Scanner(System.in);
	System.out.print("첫 번째 숫자를 입력하세요 :  ");
	int num1;
	System.out.print("두 번째 숫자를 입력하세요 :  ");
	int num2;
	int some;

	while ( num2 != 0){
	    some = num1 % num2;
	    num1 = num2;
	    num2 = some;
	}

	return num1;

    }
}

