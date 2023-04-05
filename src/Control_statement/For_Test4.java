package Control_statement;

import java.util.Scanner;

public class For_Test4{
    public static void main(String args[ ]){

	Scanner sc = new Scanner(System.in);
	System.out.print("n 입력 : ");

	int n = sc.nextInt();
	double result = 0.0;
	double sum = 0.0;
	for (int i = 1; i <= n; i++){
		result = 1.0/i;
		sum += result;
	}
	System.out.println(sum);

    }
}
