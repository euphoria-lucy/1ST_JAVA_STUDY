package ClassAndObject;

/* 은행계좌(Account)를 정의하고 테스트하는 프로그램을 작성하라.
1. 은행계좌번호와 잔액으로 계좌 객체를 생성한다.
2. 입금을 하는 deposit()메서드를 갖는다.
3. 출금을 하는 withdraw() 메서드를 갖는다. 잔액이 부족하면 출금할 수 없으며, 적당한 메시지를 나타낸다.
4. 계좌의 현재 상태를 출력하는 메서드를 갖는다.

은행계좌와 잔액은 접근제어자 private로 보호해야 한다.
1. 따라서 계좌를 한 번 생성하면 외부에서는 접근 할 수 없고 (생성자 메서드)
2. 클래스 내부에서만 변경이 가능해야 한다. (set 메서드)
3. 값을 불러올 때도 직접 접근이 어려우므로 클래스 내부 메서드를 이용해야 한다. (get 메서드) 

실행과정 
1. 계좌번호 12345, 잔액 10000원으로 계좌를 생성하라. 
2. 20000원을 입금하라. 
3. 50000원을 출금하라. 
4. 15000원을 출금하라. 
5. 계좌의 잔액을 출력하라. */

class Account {
	private String Bank_account; // 은행계좌번호
	private int balance; // 잔액
	
	// 생성자 메서드
	public Account() {}
	
	// set 메서드
	public void set(String Bank_account) {
		this.Bank_account = Bank_account;
		System.out.println("은행계좌 : " + Bank_account); // 은행계좌 출력
	}
	
	// get 메서드
	public void get(int balance) {
		this.balance = balance;
		System.out.println("잔액 : " + balance + "원"); // 잔액 출력
	}
		   
	public Account(String Bank_account, int balance) { 
		this.Bank_account = Bank_account;
		this.balance = balance;
	}
	
	// 입금 메서드
	public void deposit(int dbalance) { 
		this.balance = balance + dbalance;
		System.out.println("입금 : " + balance + "원"); // 입금한 돈 출력
	}
	
	// 출금 메서드
	public void withdraw(int wbalance) { 
		this.balance = balance - wbalance;
		if (balance < 0) {
			System.out.println("출금 : " + balance + "원"); // 출금한 돈 출력
			System.out.println("잔액이 부족하니 다시 입력해주세요."); // 잔액 부족 메세지 출력
		}
	}
	
	// 현재 상태 메서드
	public int situation() {
		return this.balance;
	}
	
	// 현재 상태 출력 메서드
	public void printsituation() {
		System.out.println("현재금액 : " + balance + "원");
	}
	
		   
	public void printAccount() {
	}
		   
}
