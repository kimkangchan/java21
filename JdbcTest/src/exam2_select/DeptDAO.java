package exam2_select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// 직접 MySQL 연동
// dept 테이블의 레코드를 잘 포장에서 deptSelectMain 까지 전

public class DeptDAO {

	// 데이터 조회하는 메서드
	public List<DeptDTO> list(Connection con) {
		
		List<DeptDTO> list = new ArrayList<DeptDTO>();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select deptno, dname, loc from dept";

		try {
			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();
			while (rs.next()) { // 행선택
				// 열선택
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				//레코드 저장용. ArrayList에 누적함.
				DeptDTO dto = new DeptDTO(deptno,dname,loc);
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list; // DeptServiceImpl
	}

}
