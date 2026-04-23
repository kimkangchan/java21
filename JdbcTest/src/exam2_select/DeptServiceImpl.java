package exam2_select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

// 로직처리 + 트랜잭션 처리 ( con.commit() )
// Connection 얻어서 DeptDTO와 연
public class DeptServiceImpl implements DeptService {
	// 인스턴스 변수
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/testdb";
	String userid = "root";
	String passwd = "max1234!@";

	// DeptDAO 설정
	DeptDAO dao;

	// set 메서드로 초기화
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

	// 기본 생성자
	public DeptServiceImpl() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public List<DeptDTO> list() {

		List<DeptDTO> list = null;
		Connection con = null;

		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DeptDAO 연동해서 list()호출
			list = dao.list(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list; // DeptSelectMain에 리턴

	}

}
