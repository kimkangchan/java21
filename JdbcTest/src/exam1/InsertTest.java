package exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {

		// 테이블 조회
		// 1. 4가지 정보
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/testdb";
		String userid = "root";
		String passwd = "max1234!@";

		// 2. 드라이버 로딩
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 3. connection 맺기
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "insert into dept (deptno,dname,loc) values (50,'개발','서울')";
			pstmt = con.prepareStatement(sql);

			int n = pstmt.executeUpdate();
			
			if(n==1) System.out.println("저장 성공!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
