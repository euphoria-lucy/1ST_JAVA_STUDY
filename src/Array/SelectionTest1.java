package Array;

//3, 7, 9, 5 오름차순 선택정렬
public class SelectionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3, 7, 9, 5};
		int temp;
		// 출력
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		// 정렬
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) { // 오름차순
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

}

