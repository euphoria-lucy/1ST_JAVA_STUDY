package Control_statement;

import java.util.Scanner;

public class GGGcd {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

      System.out.print("첫 번째 수를 입력하세요 :  ");
      int num1 = sc.nextInt();
      System.out.print("두 번째 수를 입력하세요 :  ");
      int num2 = sc.nextInt();
      
      int max = 0;
      
      for(int i = 1; i <= num1 && i <= num2; i++)
         if(num1 % i == 0 && num2 % i == 0) max = i;
      
      System.out.println(num1 + " 과 " + num2 + " 의 최대공약수는 " + max + " 입니다.");
   }
}
