package exam2_delete;

import java.util.Scanner;

public class DeptDeleteMain {

	public static void main(String[] args) {

		DeptService service = new DeptServiceImpl();
		service.setDao(new DeptDAO());

		Scanner scan = new Scanner(System.in);

		System.out.println("삭제할 부서번호를 입력하시오");
		int deptno = scan.nextInt();

		int n=0;
		try {
			n = service.delete(deptno);
		} catch (RecordNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		if (n >= 1)
			System.out.println("삭제 성공!");

	}

}
