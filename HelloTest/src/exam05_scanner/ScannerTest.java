package exam05_scanner;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 : ");
		int age = scan.nextInt();
		
		System.out.println("이름을 입력하세요 : ");
		String name = scan.next();
		
		System.out.printf("당신의 나이는 %d이고, 이름은 %s입니다.\n",age,name);
		
		scan.close();

	}

}
