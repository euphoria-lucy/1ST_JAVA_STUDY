package Control_statement;

public class star_03{
    public static void main(String args[ ]){

	for(int i = 5; i >= 1; i--) {
	    for (int k = 5; k >= i+1; k--) {
	    System.out.print(" ");
	    }
	    for (int j = 1; j <= i; j++) {
	    System.out.print("*");
	    }
	    System.out.print("\n");
	}
    }
}
