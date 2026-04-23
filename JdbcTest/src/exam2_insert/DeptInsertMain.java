package exam2_insert;

import java.util.Scanner;

public class DeptInsertMain {

	public static void main(String[] args) {

		DeptService service = new DeptServiceImpl();
		service.setDao(new DeptDAO());

		Scanner scan = new Scanner(System.in);

		System.out.println("부서번호를 입력하시오");
		int deptno = scan.nextInt();
		System.out.println("부서명을 입력하시오");
		String dname = scan.next();
		System.out.println("부서위치를 입력하시오");
		String loc = scan.next();

		DeptDTO dto = new DeptDTO(deptno, dname, loc);
		int n = 0;
		try {
			n = service.insert(dto);
		} catch (DuplicatedDeptnoException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		if (n >= 1)
			System.out.println("저장 성공!");

	}

}
