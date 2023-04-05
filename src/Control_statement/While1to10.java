package Control_statement;

import java.util.Scanner;

public class While1to10{
    public static void main(String args[ ]){

	Scanner sc = new Scanner(System.in);
	int score, count = 0, total = 0;
	double average;

	do {
		System.out.print("점수 입력 : ");
		score = sc.nextInt();
		total += score;
		count++;
	}while(score > 0 );
			if (count > 1){
				System.out.println("= = = = = = = ");
				System.out.println("합계 :  " + total);
				average = (double)total/count;
				System.out.printf("평균 :  %.2f", average);
			}else{
				System.out.println("입력 점수 없음");
			}

    }
}
