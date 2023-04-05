package Control_statement;

public class Dowhilesum1to100 {
	
	public static void main(String args[ ]){

		int num = 0, sum = 0;

		do {
		       num++;
		       sum += num;
		}while( num < 100 );
		       System.out.println( sum );

	 }

}
