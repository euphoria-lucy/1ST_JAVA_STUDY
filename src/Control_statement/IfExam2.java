package Control_statement;

import java.util.Scanner;

public class IfExam2{
    public static void main(String args[ ]){

	Scanner sc = new Scanner(System.in);

	System.out.print("사칙연산자( +, -, *, / ) 중 하나를 작성하세요. :  ");
	int a = 20, b = 10; String op = sc.next() ;
	if (op. equals ("+")) System.out.println( a + " + " + b + " = " + (a+b)); 
	else if  (op. equals ("-")) System.out.println(a + " - " + b + "= " + (a-b)); 
	else if  (op. equals ("*")) System.out.println(a + " * " + b + " = " + (a*b));	
	else if  (op. equals ("/")) System.out.println(a + " / " + b + " = " + (a/b)); 
	else  System.out.println("사칙연산자가 아닙니다. ");
    }
}
