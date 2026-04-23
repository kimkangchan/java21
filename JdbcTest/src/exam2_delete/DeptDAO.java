package exam2_delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptDAO {

	public int delete(Connection con, int deptno) throws RecordNotFoundException{
		int n = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "delete from dept where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			n = pstmt.executeUpdate();
		} catch (SQLException e) {
			if(n==0) throw new RecordNotFoundException(deptno + "존재하지 않습니다. 다시 확인하세요!");
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