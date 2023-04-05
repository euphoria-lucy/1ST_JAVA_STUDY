/* 1. 정수형(int) 변수 a,b,c를 선언한다.
    2. a,b에 각각 10, 20을 배정(=)한다.
    3. c에 a+b를 배정(=)한다.
    4. 문자형(String) 변수 str에 "자바를 즐깁시다!~"를 지정한다.
    5. a, b, c, str 를 화면에 출력한다.  */

package DataType;

public class Var_Test1 {
	
	 public static void main(String args[ ]){

			int a; // int a, b, c;로 작성가능
			int b;
			int c;
			String str; // String str = "자바를 즐깁시다!~";로 작성가능
			a = 10;
			b = 20;
			c = a+b;
			str = "자바를 즐깁시다!~";

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(str); // 한꺼번에 써야하는데 줄바꿈을 해야한다면 "\n"을 넣고 + 다음기호 넣으면 된다. System.out.println(a+"\n" +b 이런식으로 하면 된다.

		    }

}
