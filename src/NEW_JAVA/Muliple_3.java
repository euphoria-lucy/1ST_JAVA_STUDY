package NEW_JAVA;

import java.util.Scanner;
public class Muliple_3{
    public static void main(String args[ ]){

	Scanner sc = new Scanner(System.in);
	System.out.print("정수 입력 :  ");
	int num = sc.nextInt();
	if (num % 3 == 0){
		System.out.println(num + "은(는) 3의 배수입니다.");
	}
    }
}
