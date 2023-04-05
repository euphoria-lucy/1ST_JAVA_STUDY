package Test;

public class Student {
	private String name;
	private int number;
	static int count = 0;
	
	public Student() {}
	
		public Student(String name, int number) {
			this.name = name;
			this.number = number;
			Student.count++;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public int getNumber() {
			return number;
		}
	
		public void setNumber(int number) {
			this.number = number;
		}
	
		@Override
		public String toString() {
			return "Student [이름 : " + name + ", 학번 : " + number + "]";
		}
	
}
	
	
