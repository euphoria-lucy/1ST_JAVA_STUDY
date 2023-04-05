package Array;

/* 1-2+3-4+5-6 .....+99-100의 합계를 1차원 배열을 이용하여 구하라.
   1. int형, 배열 요소 갯수가 100개인 배열을 선언하라.
   2. (초기화) for문을 이용하여 배열의 값을 배정하라.
   3. 더하는 식은 한 번만 사용한다. */
public class Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0; // 합계 저장 변수 선언
		int[] array = new int[100]; // 배열선언
		for(int i = 0; i < array.length; i++) {// for문을 사용해 배열 끝까지 가도록 사용
			// 쌤 코드
			// int [ ] a = new int[100];
			// for(int i = 0; i < a.length; i++){
			//	if(i %2==1) {
			// 		a[i] = (i+1)*(-1);
			//	}else{
			//		a[i] = i+1;
			//  }
			//	sum += a[i];
			array[i]=i+1;
			if (array[i] % 2 == 0) { // 짝수 구분 명령문
				sum-=array[i]; // 짝수일때 sum에 array[i] 반복 저장
				System.out.print("-" + array[i]); // 짝수이므로 -짝수로 출력
			}else if (array[i] !=1 && array[i] % 2 == 1){ // 홀수 구분 명령문
				sum+=array[i];// 홀수일때 sum에 array[i] 반복 저장
				System.out.print("+" + array[i]); // 홀수이므로 +홀수로 출력
			}
			if (array[i] == 1) { // 1을 따로 출력하기 위해 작성
				System.out.print(1);
			}

		}
			
		System.out.println(" = " + sum); // 합계 출력문
    }
}
