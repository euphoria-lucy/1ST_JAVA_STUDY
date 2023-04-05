package ClassAndObject;

//회원가입과 회원수 체크

class Customer{
	private String id;
	private String pwd;
	static int numberOfCustomer = 0;
	
	// 생성자 메서드 : Alt + Shift + s누르고 Field하기
	public Customer(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
		numberOfCustomer++;
	}
	
	
	public void printNumberOfCustomer() {
		System.out.println("전체 회원수 : " + Customer.numberOfCustomer);
	}
	
}

public class CustomerTest {

	public static void main(String[] args) {

		Customer a = new Customer("aaa", "111");
		Customer b = new Customer("pjs", "205");
		Customer c = new Customer("psh", "330");
		Customer d = new Customer("cjh", "545");
		Customer e = new Customer("sss", "1223");
		e.printNumberOfCustomer(); // 전체회원수 출력
		System.out.println(Customer.numberOfCustomer); // Customer 회원수 출력
		
	}

}

