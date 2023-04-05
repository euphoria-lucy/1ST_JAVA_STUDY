package Control_statement;

import java.util.Scanner;
public class WhileScore_2{
    public static void main(String args[ ]){

	// 변수선언 및 초기화
	int score = 0, count = 0, total = 0;
	double average;
	Scanner sc = new Scanner(System.in);

	//반복
	while ( true ){
	    System.out.print("점수 입력 :  ");
	    score = sc.nextInt( );
	    if ( score != 0){
	       count++;
	       total += score;
	    }else{
	       break;
	    }
	}

	//합, 평균
	if (count == 0){
	    System.out.println("입력 점수 없음");
	}else{
	    System.out.println("=======");
	    System.out.println("합계 :  " + total);
	    average = (double)total/count;
	    System.out.printf("평균 :  %.2f", average);
	}

    }
}

// NaN : Not a Number라는 의미 (수항 연산이 불가능 할때 나타나는 에러), 에러의 한 종류
// Exception (예외) : divide( / ) by zero
