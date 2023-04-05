package Test;

class Account{
	private String accountNumber;
	private int balance;
	/*
	 * public void setAccountNumber(String accountNumber) { // setter → 바꾸고 싶을 때 사용 accountNumber를 바꾸고 싶으면 set을 붙여서 바꾼다. this.accountNumber = accountNumber; }
	 * public int getBalance() { // getter → 값을 읽어줌 return this.balance; }
	 */
	
	// Alt + Shift + S 누르고 "Generate Getters and Setters"누르면 아래 코드 완성
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 부모 (Object)의 메서드 toString() 오버라이딩
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	
}

public class AccountTest {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		a1.setAccountNumber("111-11-22222");
		a1.getBalance();
		System.out.println(a1.toString());
		
	}

}

