package Control_statement;

import java.util.Scanner;
public class GGGGcd{
    public static void main(String args[ ]){

	Scanner sc = new Scanner(System.in);
	System.out.print("숫자 입력 :  ");
	int num1 = sc.nextInt();
	System.out.print("숫자 입력 :  ");
	int num2 = sc.nextInt();

	int i = 1, gcd = 0;
	int max = (num1 > num2) ? num1 : num2;
	while (i <= max){
	    if (num1 % i == 0 && num2 % i == 0){
		gcd = i;
	    }
	    i++;
	}

	System.out.println("최대공약수 :  " + gcd);

    }
}
