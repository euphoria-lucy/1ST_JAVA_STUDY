package DataType;

public class TypeTest {

	public static void main(String args[ ]){
		int a = 19;
		// long b = 2147483648;
		double c = 3.14;
		double d = 7.789;

		// int e = a + b;
		// int f = a + c;
		double h = c + d;
		double g = a + d; /* int + double 은 int가 double로 형변화. 자바의 원칙. 그래서 에러X 작은 놈은 큰 놈으로 형변화함. 큰거에서 작은거로는 변화 일어나지 않음 : 자동형변환*/
		
		byte b1 = 10;	
		int b2 = b1; // 에러발생X 작은타입 → 큰타입은 jvm이 자동형변환시켜줌
		System.out.println(b2);

		int n1 = 300;	
		byte n2 = (byte)n1; // 에러발생. 큰타입 → 작은타입 손실발생 : 굳이 쓸라면 강제형변환
		System.out.println(n2);
	    }
	
}
