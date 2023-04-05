package Array;

//초기화 (사용자)
public class Test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[3];
		// 1.
		score[0] = 99;
		score[1] = 98;
		score[2] = 56;
		
		// 2.
		double[] b = new double[] {3.5, 6.7, 2.0}; //이렇게 초기화 하려면 사이즈를 주면 안된다.
		for (int i = 0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		// 3.
		String[] s = {"I", "am", "a", "girl"};
		for (int i = 0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		String[] t = new String[3];
		for (int i = 0; i<t.length; i++) {
			System.out.println(t[i]);
		}
	}

}

