package Control_statement;

import java.util.Scanner;

public class Menu {
    public static void main(String args[ ]){

	Scanner sc = new Scanner(System.in);
	System.out.println("==== TO Do list====");
	System.out.println("1. 밥을 먹는다.");
	System.out.println("2. 공부를 한다.");
	System.out.println("3. 편의점에 간다.");
	System.out.print("==> 입력 ==> ");
	System.out.print("========== ");
	int menu = sc.nextInt();

	/* switch(menu) {
	    case 1 : 
		String food = sc.next();
		System.out.println("저녁식사로 " + food + "를 드시는 군요"); 
		break;
	    case 2 : 
		int time = sc.nextInt();
		if(time>22){
		    System.out.println("늦었어,... 그만자");

		}else{
		    System.out.println("더 열심히 공부해!!");
		}
		break;
	    case 3 : 
		String store = sc.next();
		System.out.println("편의점에서 " + store + "를 사시는 군요");
		break;
	} */

	 /* switch(menu){
	    case 1 : eat(); break;
	    case 2 : study(); break;
	    case 3 : store(); break;
	} */
	
    }
}