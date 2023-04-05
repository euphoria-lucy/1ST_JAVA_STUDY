package Control_statement;

import java.util.Scanner;

public class FlagSum1{
    public static void main(String args[ ]){

	Scanner sc = new Scanner(System.in);
	System.out.print("n을 입력하세요 :  ");
	int n = sc.nextInt();
	int sum=0;

	for (int i = 1; i <= n; i++){
		switch (i % 2) {
			case 0 : sum -= i;
			break;
			default : sum += i;
		}
	}
	System.out.print(sum);		

    }
}
