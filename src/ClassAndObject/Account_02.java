package ClassAndObject;

public class Account_02 {
	private String accountNumber;
	private int balance;
	static double interest = 0.07; // static 변수를 사용한 이유는 interest를 공유하여 사용해야 하기 때문
	
	public Account_02(String accountNumber, int balance) {
		super(); // super : Object의 생성자 메서드 호출
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

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

	@Override
	public String toString() {
		return "계좌 상세 [계좌번호 : " + accountNumber + ", 잔액 : " + balance + "]";
	}
	
	// 정기예탁 메서드 (fixedDeposit)를 작성하고, 기간(년)과 금액을 입력하면 이자를 더한 원금을 계산하라. 연간 이율 2%
	public void fixedDeposit(int period, int amount) {
		this.balance += (period * Account_02.interest * amount) + amount;
	}
	
}

