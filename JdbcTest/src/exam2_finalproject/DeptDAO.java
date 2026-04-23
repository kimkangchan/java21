package exam2_finalproject;

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

				// 레코드 저장용. ArrayList에 누적함.
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
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

	public int insert(Connection con, DeptDTO dto) throws DuplicatedDeptnoException {
		int n = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into dept (deptno,dname,loc) values (?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			n = pstmt.executeUpdate();
		} catch (SQLException e) {
			// SQLIntegrityConstraintViolationException 발생
			// e.printStackTrace();
			throw new DuplicatedDeptnoException(dto.getDeptno() + " 값이 중복되어 예외발생됨");
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
			// throw new DuplicatedDeptnoException(dto.getDeptno() + " 값이 중복되어 예외발생됨");
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} // try~catch~finally
		return n;
	}// end update
	
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
	}// end delete

}
