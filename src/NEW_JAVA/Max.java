package NEW_JAVA;

import java.util.Scanner;
public class Max{
    public static void main(String args[ ]){

	Scanner sc = new Scanner(System.in);
	int num1, num2;
	System.out.print("첫 번째 수 입력 :  ");
	num1 = sc.nextInt();
	System.out.print("두 번째 수 입력 :  ");
	num2 = sc.nextInt();
	
	if (num1 > num2 ){
		System.out.print(num1 + " 와" + num2 + " 중 큰 수는 " + num1 + " 입니다.");
	}else{
		System.out.print(num1 + " 와 " + num2 + " 중 큰 수는 " + num2 + " 입니다.");
	}


    }
}
