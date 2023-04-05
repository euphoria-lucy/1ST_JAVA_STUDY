package ClassAndObject;

//학생 : 학번, 이름, 전공, 전번

public class Student {

	private int number;
	private String name;
	private String major;
	private String telNum;
	
	public Student(int number) {
		super();
		this.number = number;
	}

	public Student(int number, String name) {
		// super(); // this(number)를 사용하려면 super()는 사용X
		this(number); // this.number = number;
		this.name = name;
	}

	public Student(int number, String name, String major) {
		// super();
		this(number, name); // this.number = number;, this.name = name;
		this.major = major;
	}

	public Student(int number, String name, String major, String telNum) {
		// super();
		this(number, name, major); // this.number = number;, this.name = name;, this.major = major;
		this.telNum = telNum;
	}
	
}

