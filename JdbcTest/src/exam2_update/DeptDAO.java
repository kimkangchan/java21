package exam2_update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptDAO {

	public int update(Connection con, DeptDTO dto) {
		int n = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "update dept set dname = ?, loc = ? where deptno = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(3, dto.getDeptno());
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());
			n = pstmt.executeUpdate();
		} catch (SQLException e) {
			// SQLIntegrityConstraintViolationException 발생
			 e.printStackTrace();
			//throw new DuplicatedDeptnoException(dto.getDeptno() + " 값이 중복되어 예외발생됨");
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} // try~catch~finally
		return n;
	}// end insert
}// end class