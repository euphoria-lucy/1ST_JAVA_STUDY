package Control_statement;

public class star_05{
    public static void main(String args[ ]){

	for(int i = 0; i < 5; i++) {
	    for(int j = 4; j > i; j--){
		System.out.print("  "); 
	    } // for

	    for(int j = 1; j <= i; j++){
		System.out.print(" *");  // *출력
	    } // for

      	   System.out.print(" " + (char)(65+i));
         
	     for(int j = 1; j <= i; j++) {
		 System.out.print(" *");  // *출력
	    } // for
      
      System.out.print("\n");
	} // for 

      } // main
   } // class
