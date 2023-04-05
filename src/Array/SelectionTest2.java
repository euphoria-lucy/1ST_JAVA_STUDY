package Array;

//5, 3, 8, 6, 4 내림차순 (선택정렬)
public class SelectionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5, 3, 8, 6, 4};
		int temp;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) { // 내림차순
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

