package Control_statement;

/* import java.util.Scanner;
public class SwitchOp{
    public static void main(String args[ ]){

	Scanner sc = new Scanner(System.in);
	System.out.print("사칙연산(+, -, *, /) 중 하나를 입력하세요. :  ");
	int a=20, b = 10; String op = sc.next( ); 
	switch(op) {
	    case "+" : System.out.println( a + "+" + b + "=" + (a+b) );
		break;
	    case "-" : System.out.println( a + "-" + b + "=" + (a-b) );
		break;
	    case "*" : System.out.println( a + "*" + b + "=" + (a*b) );
		break;
	    case "/" : System.out.println( a + "/" + b + "=" + (a/b) );
		break;
	    default : System.out.println("사칙연산자가 아닙니다.  ");
	}
    }
} */

import java.util.Scanner;
public class SwitchOp{
   public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
	System.out.print("수식 입력(수와 연산자 사이는 공백을 둘 것) : ");
	int num1 = scan.nextInt();
	String op = scan.next();
	int num2 = scan.nextInt();

	switch( op ){
		case "+" : System.out.println(num1 + " + " + num2 + " = " + (num1+num2)); break;
		case "-" : System.out.println(num1 + " - " + num2 + " = " + (num1-num2)); break;
		case "*" : System.out.println(num1 + " * " + num2 + " = " + (num1*num2)); break;
		case "/" : System.out.println(num1 + " / " + num2 + " = " + (num1/num2)); break;
		default : System.out.print("사칙연산자가 아닙니다.");
	}
   }
}
