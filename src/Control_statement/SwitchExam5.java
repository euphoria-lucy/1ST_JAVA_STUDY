package Control_statement;

public class SwitchExam5{
    public static void main(String args[ ]){

	int grade = Integer.parseInt( args[0] );
	
	switch( grade ) {
	    case 1: case 2:
		System.out.println (grade + "반은 뉴미디어소프트웨어과 입니다."); break;
	    case 3: case 4:
		System.out.println (grade +"반은 뉴미디어웹솔루션과 입니다."); break;
	    case 5: case 6:
		System.out.println (grade +"반은 뉴미디어디자인과 입니다."); break;
	    default : System.out.println("아무 과도 아닙니다.");  
	}
    }
}
