package Operator;

public class OddandEven {
	
	public static void main(String args[ ]){

		System.out.println("===홀수===");
		for(int i = 1; i <= 100; i++){
		   if (i%2 == 1){
		       System.out.print(i + "\t");
		   }
		}
		
		System.out.println("\n===짝수===");
		for(int i = 1; i <= 100; i++){
		   if (i%2 == 0){
		    System.out.print(i + "\t");
		   }
		}
	}

}
