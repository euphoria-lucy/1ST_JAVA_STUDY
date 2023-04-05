package Control_statement;

import java.util.Scanner;

public class Fact_While {
	
	public static void main(String args[ ]){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(args[0]);
		int result = 1, i = 1;

		System.out.print("n! = ");
		while (i <= n){
		    if(i == n) System.out.print(i);
		    else System.out.print(i + "*");
		    result *= i;
		    i++;
		}
		System.out.println(" = " + result);

	    }

}
