package Control_statement;

import java.util.Scanner;
public class Tax_calculate{
    public static void main(String args[ ]){

	Scanner sc = new Scanner(System.in);
	System.out.print("근로소득을 입력하세요(천 만원) :  ");
	int salary = sc.nextInt( );

	System.out.print("당신의 근로소득에 대한 소득세는 (만 원) :  ");
	if (salary <= 2000){
		System.out.println((int)(salary*0.05));
	}else if (salary <=4000){
		System.out.print((int)(salary*0.15));
	}else if (salary <= 8000){
		System.out.print((int)(salary*0.25));
	}else{
		System.out.print((int)(salary*0.4));
	}	

    }
}
