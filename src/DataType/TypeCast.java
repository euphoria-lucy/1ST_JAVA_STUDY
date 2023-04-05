package DataType;

public class TypeCast {

	public static void main(String[] args) {

		int a = 12;
		byte b = (byte) a; 
		byte d = (byte)(a+b); // 변수를 넘길 때는 기본형 int로 넘어간다.
		System.out.println("a + b:" + d);
		
	}

}
