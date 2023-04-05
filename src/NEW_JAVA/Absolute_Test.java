package NEW_JAVA;

import java.util.Scanner;

public class Absolute_Test{
    public static void main(String args[ ]){

	Scanner sc = new Scanner(System.in);
	System.out.print("정수 입력 :  ");
	int num = sc.nextInt();
	int result = (num > 0)? num: num*(-1);
	System.out.println(num + " 의 절대값은 " + result + " 입니다.");

    }
}