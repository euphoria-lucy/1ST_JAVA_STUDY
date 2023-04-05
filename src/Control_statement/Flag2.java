package Control_statement;

import java.util.Scanner;

public class Flag2{
    public static void main(String args[ ]){

	Scanner sc = new Scanner(System.in);
	int sum = 0; int flag = 1;
	System.out.print("숫자 입력 :  ");
	int n = sc.nextInt( );
	for (int i = 1; i<=n; i++){
	    if(i%2==1){ // 홀수라면
		flag = 1;
	    }else{
		flag =-1;
	    }
		sum+=(i*flag);
	} // for문 
	System.out.println(sum);

    } // main
} // class
