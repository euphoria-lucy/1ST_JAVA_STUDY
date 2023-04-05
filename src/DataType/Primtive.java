package DataType;

public class Primtive {

	public static void main(String args[ ]){
		//1. boolean : 1바이트, 참, 거짓, 단독X
		boolean lunch = false;
		if (lunch == true){
			System.out.println("점심을 먹었어요");
		}else{
			System.out.println("점심을 안 먹었어요");
		}	

		//2. byte형 정수 : 1바이트(=8비트)로 표현
		byte b1 = 30;
		byte b2 = 20;	
		//byte b3 = b1 + b2;
		System.out.println(b1);
		System.out.println(b2);

		//3. short형 정수 : 2바이트
		short s1 = 2000;
		short s2 = 2022;
		//short s3 = s1 + s2;

		//4. int형 정수 : 4바이트
		int n1 = 2147483647;
		int n2 = 3;
		int n3 = n1 + n2;
		System.out.println(n3);

		//5. long형 정수 : 8바이트 = 64비트
		long myMoney = 10000000000L;
		System.out.println("나의 전 재산:" + myMoney);

		//6. 실수 : 소수점을 포함
		double d1 = 123.456789;
		System.out.println(d1);
		float f1 = 12.345F;
		System.out.println(f1);

	    }
	
}
