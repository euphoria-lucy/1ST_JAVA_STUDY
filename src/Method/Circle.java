package Method;

//원의 넓이와 둘레를 구하는 프로그램 작성
//getArea( ), getCircum( )
import java.util.Scanner;

public class Circle{
 public static void main(String args[ ]){

	// 변수
	Scanner sc = new Scanner(System.in);
	System.out.print("원의 반지름 입력 :  ");
	int radius = sc.nextInt();
	final double PI = 3.14;
	System.out.print("넓이 :  " + getArea( radius, PI )  + " 둘레 :  " + getCircum( radius, PI ));

 } // main
	public static double getArea( int radius, double PI ){
		double area = PI*radius*radius;
	return area;
	} // getArea

	public static double getCircum( int radius, double PI ){
		double circum = 2*radius*PI;
	return circum;
	} // getCircum

} // end
