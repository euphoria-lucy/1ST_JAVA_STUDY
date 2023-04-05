package Array;

//1+2+3+4......+100의 합을 배열을 이용하여 구하시오.
public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int[] array = new int[100];
		for (int i = 0; i<array.length; i++) {
			array[i] = i+1;
			sum += array[i];
		}
		System.out.println(sum);
	}

}

