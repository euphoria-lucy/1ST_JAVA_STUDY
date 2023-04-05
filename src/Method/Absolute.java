package Method;

import java.util.Scanner;

public class Absolute{
	public static void main(String[] args){

		System.out.print("숫자 입력 :  ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt( );
		// 호출
		getAbsolute( num ); // 데이터타입 안쓰고 전달할 값만 쓰기

	} // end of main
	// 메서드 선언
	public static void getAbsolute( int num ){ // 호출할 때는 데이터타입, 전달할 값 다 쓰기
		// 절대값 구하기
		if(num > 0){
			System.out.print(num + " 의 절대값은 " + num);
		}else{
			System.out.print(num + " 의 절대값은 " + num*(-1));
		}
	}
}
