package Inheritance;

//상속 → 코드 재활용
class Student{
	private int number; // 멤버변수는 private 달거임, 진정한 캡슐화 함
	private String name; // 외부에서 직접 접근 못 하게 private 사용
	public Student(int number, String name) {
		this.number = number; // 외부에 들어온 number를 내가 입력한 number로 바꿈
		this.name = name; // 외부에 들어온 name을 나 자신 name으로 바꿔라
	}
	public void study() {}
	public void eat() {}
}

//1학년 멤버변수 : 학년, 이름, 체육복(초록색), 공부하다, 밥먹다, 자바 프로젝트
/* class Grade1 extends Student{
	String colorOfTraining = ":green";
	public void javaProject() {}
}

//2학년 멤버변수 : 학번, 이름, 체육복(노란색), 공부하다, 밥먹다, 파이썬 프로젝트
class Grade2 extends Student{
	
}

//3학년 멤버변수 : 학년, 이름, 체육복(파랑색), 공부하다, 밥먹다, 취업준비
class Grade3 extends Student{
	
} */

public class StudentTest {
	
	public static void main(String args[]) {
		
		Student s1 = new Student(1219, "나미림");
	}
	

}

