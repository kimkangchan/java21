package workshop;

import java.util.Scanner;
public class Test10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주소를 입력하시오.");
		String doname = scan.next();
		String si = scan.next(); 
		String gu = scan.next();
		
		System.out.printf("도명 : %s \n시명 : %s \n구명 : %s",doname, si, gu);
	
		scan.close();
	}

}
