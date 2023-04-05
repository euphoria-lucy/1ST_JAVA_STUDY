/* 직사각형 모양의 땅 면적을 계산하여 출력하는 프로그램을 설계한 후 작성하시오.
땅의 가로 길이는 100m이고 세로 길이는 50m이다. */
// 1. 데이터파악 → 변수 선언 → 초기화 → 연산 → 결과 출력

package DataType;

public class Square_1210 {
	
	public static void main(String args[]){

		int width;	 //가로
		int height; //세로
		int result; //결과
		
		width=100;
		height=50; // 초기화 단계
		
		result = width*height; // 일반화
		System.out.println("땅의 면적 : " + result + "㎡");
	    }

}
