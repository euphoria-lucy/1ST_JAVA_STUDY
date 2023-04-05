package Operator;

public class Print_Test {
	
	public static void main(String args[ ]){

		System.out.println("Good\tMorning"); //탭  (세로줄 맞출때 유용하게 사용)
		System.out.println("Good\nMorning"); //줄바꿈
		System.out.println("Good\'Morning"); // 작은 따옴표
		System.out.println("Good\"Morning"); // 큰 따옴표
		System.out.println("Good\\Morning"); // 백슬래시

		System.out.printf("%f\n", 1.23456); // 소수점 이하 6자리
		System.out.printf("%.3f\n", 1.23456); // 소수점 이하 3자리 → 4자리에서 반올림

	    }

}
