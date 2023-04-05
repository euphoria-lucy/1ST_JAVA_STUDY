package Control_statement;

public class star_04{
	   public static void main(String args[]) {

	      for(int i = 1; i <=5; i++) {
	         for(int j = 1; j <= 5 - i; j++) {
	            System.out.print("  ");
	         }
	         
	         for(int k = 1; k <= i*2-1; k++) {
	            System.out.print(" *");
	         }
	      System.out.print("\n");
	      }

	   }
	}

