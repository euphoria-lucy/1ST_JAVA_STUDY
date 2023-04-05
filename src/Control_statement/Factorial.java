package Control_statement;

import java.util.Scanner;

public class Factorial{
    public static void main(String args[ ]){

	Scanner sc = new Scanner(System.in);
	System.out.print("n 입력 :  ");
	int n = sc.nextInt( );
	int sum = 1;

	for (int i = 1; i<=n; i++){
		sum = sum*i;
	} 
	System.out.println("n! = 1*2*3*4*.....n = " + sum);

    }
}
