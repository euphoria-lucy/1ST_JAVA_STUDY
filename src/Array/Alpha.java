package Array;

//알파벳 (대문자)을 배열을 이용하여 출력해보자.
public class Alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch [] = new char[26];
		// 대문자 출력
		for (int i = 0; i < ch.length; i++ ) {
			ch[i] = (char) (65+i);
			System.out.print(ch[i] + " ");
		}
		// 소문자 출력
		for (int i = 0; i < ch.length; i++ ) {
			ch[i] = (char) (97+i);
			System.out.print(ch[i] + " ");
		}

	}

}
