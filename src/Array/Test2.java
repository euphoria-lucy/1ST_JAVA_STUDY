package Array;

//초기화
public class Test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		for(int i = 0; i<a.length; i++) { //length는 배열을 사용하면 자동으로 JVM에서 입력한다. 배열을 쓰면 for문이 필수로 온다.
			System.out.println(a[i]); // .length는 배열의 길이를 나타내는 속성이다.
		}
		/* System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]); */
		
		double [] b = new double[4];
		for(int j = 0; j<b.length; j++) {
			System.out.println(b[j]);
		}
		/* System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]); */
	}

}

