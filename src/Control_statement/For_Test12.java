package Control_statement;

public class For_Test12{
    public static void main(String args[ ]){

	for (int i = 1; i < 10; i++){ // i 선언 및 반복문설정
	    for (int j = 1; j < 10; j++){ // j 선언 및 반복문 설정
		if(i  +  j  == 14){ // i 와 j의 조건 설정
			System.out.print(i + " "); // i 출력
			System.out.println(j); // j 출력
		} //if문 
	    } // for문
	} // for문

    }
}
