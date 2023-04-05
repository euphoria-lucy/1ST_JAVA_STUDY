package Control_statement;

public class For_Test2{
    public static void main(String args[ ]){

	int result = 0;
	for (int i = 1; i <= 4; i++){
	    for (int j = 1; j <= i; j++){
		result++ ;
		System.out.printf("%02d", result);
	    }
	System.out.print("\n");
	}

    }
}
