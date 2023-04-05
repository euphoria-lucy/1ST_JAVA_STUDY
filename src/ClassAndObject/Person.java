package ClassAndObject;

public class Person {

	private String first_name;
	private String name;
	
	public Person() {}
	public Person(String first_name, String name) {
		super();
		this.first_name = first_name;
		this.name = name;
	}
	
	// 성 반환 메서드
	public String getLastName() {
		return first_name;
	}
	
	// 이름 반환 메서드
	public String getFirstName() {
		return name;
	}
	
	// 성, 이름 포함된 문자 총수 반환 메서드
	public String getLength() {
		return first_name + name;
	}

	@Override
	public String toString() {
		return "성 : " + first_name + ", 이름 : " + name + "]";
	}
	
}

