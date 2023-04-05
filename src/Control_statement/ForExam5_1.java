package Control_statement;

public class ForExam5_1{
    public static void main(String args[ ]){

	for (int i = 5; i >= 1; i--){ 
	    for (int j = 1; j <= i; j++){  // for (int j = 1; j <= 6-i; j++){ // 공백
		System.out.print(j+" ");
	    }
	    System.out.print("\n");
	}
    }
}
