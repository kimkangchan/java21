package exam2_finalproject;

import java.util.List;
import java.util.Scanner;

//화면처리 담당
// DeptService와 연동
public class DeptMain {

	public static void main(String[] args) {

		// 메뉴 보여주기
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1. 부서 목록 보기");
			System.out.println("2. 부서 추가");
			System.out.println("3. 부서 삭제");
			System.out.println("4. 부서 수정");
			System.out.println("0. 종료");
			System.out.println("------------------------");
			System.out.println("------------------------");

			// 번호 읽기
			String num = scan.next();
			if ("1".equals(num)) {
				// deptService와 연동
				DeptService service = new DeptServiceImpl();
				service.setDao(new DeptDAO());

				List<DeptDTO> list = service.list();

				System.out.println("부서번호\t\t 부서명 \t\t 부서위치");
				System.out.println("----------------------------");
				for (DeptDTO dto : list) {
					System.out.printf("%d	%s	%s \n", dto.getDeptno(), dto.getDname(), dto.getLoc());
				}
				System.out.println("----------------------------");

			} else if ("2".equals(num)) {

				System.out.println("부서번호를 입력하시오");
				int deptno = scan.nextInt();
				System.out.println("부서명을 입력하시오");
				String dname = scan.next();
				System.out.println("부서위치를 입력하시오");
				String loc = scan.next();

				DeptService service = new DeptServiceImpl();
				service.setDao(new DeptDAO());

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

			} else if ("3".equals(num)) {
				DeptService service = new DeptServiceImpl();
				service.setDao(new DeptDAO());


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

			} else if ("4".equals(num)) {

				System.out.println("수정할 부서번호를 입력하시오");
				int deptno = scan.nextInt();
				System.out.println("수정할 부서명을 입력하시오");
				String dname = scan.next();
				System.out.println("수정할 부서위치를 입력하시오");
				String loc = scan.next();
				
				DeptService service = new DeptServiceImpl();
				service.setDao(new DeptDAO());
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				int n = service.update(dto);
				if (n >= 1)
					System.out.println("수정 성공!");

			} else {
				scan.close();
				System.out.println("프로그램 종료");
				System.exit(0);
			} // end else
		} // end while

	}

} // end main
