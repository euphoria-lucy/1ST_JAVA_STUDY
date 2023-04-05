package Method;

/* 직사각형 모양의 땅 면적을 계산하여 출력하는 프로그램을 설계한 후 작성하시오.
가로, 세로 키보드 입력 */

import java.util.Scanner;

public class Square_1210 {
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.print("가로, 세로 입력 (스페이스로 분리) :  ");
int width, height;
int result; //결과

width = sc.nextInt();
height = sc.nextInt();

result = getArea( width, height ); 
System.out.println("땅의 면적 : " + result + "㎡");

} // end of main

public static int getArea( int width, int height ){
return (width * height);
}
}
