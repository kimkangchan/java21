package workshop1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;


public class StuServiceImpl implements StuService {
	// 인스턴스 변수
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/workshop";
	String userid = "root";
	String passwd = "max1234!@";
	
	StuDAO dao;
	public void setDao(StuDAO dao) {
		this.dao = dao;
	}

	public StuServiceImpl() {
		try {
			Class.forName(driver); // Class.forName(“com.mysql.cj.jdbc.Driver” );
		} catch (ClassNotFoundException e) {
		}
	}

	@Override
	public List<StuDTO> list() {
		List<StuDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			// DeptDAO 연동해서 list()호출
			list = dao.list(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
