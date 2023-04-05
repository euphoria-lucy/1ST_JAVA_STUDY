/*  ▶ 프로그램의 실행 중 변화하지 않는 값
     ▶ 정수형, 실수형, 문자형(' '), 논리형 상수가 있다.
     ▶ final 예약어를 변수타입 앞에 쓰며 상수명은 대문자로 작성한다.
     ▶ 상수사용의 유용한 점
       ①. 불분명한 값에 의미를 부여
       ②. 프로그램 수정 용이
       ③. 프로그래머에 의해 잘못 입력되는 것을 방지 */

package DataType;

public class ConstantTest {
	
	 public static void main(String args[]){

			final double PI = 3.14; // 실수형 상수 → 원주율은 프로그램 종료시까지 변하지 않는다.
			final int MANJUM = 100; // 정수형 상수
			final int CUTLINE = 250;
			final char PASS = 'A';
			int score = 180;
			int jumsu = 89;

			System.out.println("반지름이 3인 원의 넓이 :"  + (PI*3*3));
			System.out.println("반지름이 5인 원의 둘레 :"  + (PI*2*5));

			if(score>=CUTLINE) {
			   System.out.println("통과");
			}else{
			   System.out.println("불합격");
			}
			if(jumsu == MANJUM){
			   System.out.println("만점");
			}else{
			   System.out.println("노력요함");
			}	

		    }

}
