package ClassAndObject;

public class Account_02_Test {

	public static void main(String[] args) {

		Account_02 a = new Account_02("111-222", 10000);
		a.fixedDeposit(1, 1000);
		System.out.println(a.toString());
		
		Account_02 b = new Account_02("222-222", 30000);
		b.fixedDeposit(2, 1000);
		System.out.println(b.toString());
		
	}

}

