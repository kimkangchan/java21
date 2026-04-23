package workshop1;

import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("****************************");
			System.out.println("[학생정보관리메뉴]");
			System.out.println("****************************");
			System.out.println("1.전체 학생 목록");
			System.out.println("0.종료");
			System.out.println("****************************");
			System.out.print("메뉴입력 => ");
			int n = scan.nextInt();

			System.out.println("============================================================================");
			System.out.println("학번\t\t이름\t\t\t\t주소\t\t\t\t입학년도\t\t휴학여부");
			System.out.println("----------------------------------------------------------------------------");

			if (n == 1) {
				StuService service = new StuServiceImpl();
				service.setDao(new StuDAO());

				List<StuDTO> list = service.list();
				for (StuDTO dto : list) {
					System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s \n", dto.getNumber(), dto.getName(), dto.getAddress(),
							dto.getDate(), dto.getAbsence()); // dto.toString()
				}
			} else {
				System.exit(0);
			}
		}
	}

}
