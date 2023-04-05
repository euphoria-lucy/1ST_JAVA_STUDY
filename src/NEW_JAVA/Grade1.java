package NEW_JAVA;

//학번 입력 받고(String 선언), String으로 이름 선언, 점수 국어, 영어, 수학, 자바 4개 int 형으로 선언, 총점 정수로 입력, 평균 double로 선언
import java.util.Scanner;

public class Grade1{
 public static void main(String args[ ]){

	for(int i = 1; i <= 3; i++){
		Scanner sc = new Scanner(System.in);
		System.out.print("학번 :  ");
		String grade = sc.next();
		System.out.print("이름 :  ");
		String name = sc.next();
	
		int kor, eng, math, java;
		System.out.print("국어 :  ");
		kor = sc.nextInt();
		System.out.print("영어 :  ");
		eng = sc.nextInt();
		System.out.print("수학 :  ");
		math = sc.nextInt();
		System.out.print("자바 :  ");
		java = sc.nextInt();

		int total = (kor+eng+math+java);
		double average = (double)total/4;
		char result;
	

	if ( average >= 90) {
		result = 'A';
	}else if (average >= 80) {
		result = 'B';
	}else if (average >= 70) {
		result = 'C';
	}else if (average >= 60) {
		result = 'D';
	}else{
		result = 'E';
	}

	System.out.print(grade + " " + name + " " + kor + " " + eng + " " + math + " " + java + " " + total);
	System.out.printf(" %.2f", average); 
	System.out.print(" " + result);

	}
 }
}
