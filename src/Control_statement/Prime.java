package Control_statement;

import java.util.Scanner;

public class Prime {
   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);
      System.out.print("n 입력 : ");
      int n = sc.nextInt();
      int result = 0;

      for(int i = 2; i < n; i++) {
         if (n % i == 0) 
	result += 1;
      }

      if(sum >= 1){
	System.out.println(n + "은 소수가 아니다.");
      }else{ 
	System.out.println(n + "은 소수이다.");
      }

   }
}
