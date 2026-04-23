package exam2_delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptServiceImpl implements DeptService {
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

	public DeptServiceImpl() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int delete(int deptno) throws RecordNotFoundException{
		int n = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			n = dao.delete(con, deptno);
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
		return n;
	}
}
