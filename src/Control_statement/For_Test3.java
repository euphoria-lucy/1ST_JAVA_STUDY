package Control_statement;

public class For_Test3{
    public static void main(String args[ ]){

	double sum=0.0;
	for (int i = 1; i <= 100; i++){  /* 100까지 출력하기 위해 for문 사용하여 선언 */
		sum +=1.0 / i ; /* for문이 계속 반복되는 동안 result가 더해지도록 선언 */
	}
	System.out.println(sum); /* for문이 끝난 후 결과 출력 */

    }
}
