/* 1부터 100사이의 숫자 중 1의 자리가 3,6,9인 수를 찾아보는 프로그램
    - % 연산자 이용
    - 1의 자리를 표현하는 방법 생각
    - !=, ==, && 연산자를 적절히 사용 */

package Operator;

public class LogicalOp {
	
	public static void main(String args[ ]){

		System.out.println("\t\t\t\t\t\t== 1의 자리가 3,6,9인 수 ==");
		for(int i = 1; i <100; i++){
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.print(i+"\t");
			}
		}
	}

}

/* for (int i = 1; i<100; i++) {
if (((i%10)%3==0&&(i%10)!=0)){
	System.out.print(i + " ");
	}
} */
