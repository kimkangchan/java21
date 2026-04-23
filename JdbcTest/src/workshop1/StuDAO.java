package workshop1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StuDAO {

	public List<StuDTO> list(Connection con) {

		List<StuDTO> list = new ArrayList<StuDTO>();

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select STUDENT_NO as 학번, STUDENT_NAME as 이름, STUDENT_ADDRESS as 주소, ENTRANCE_DATE as 입학년도, ABSENCE_YN as 휴학여부 from TB_STUDENT";

		try {
			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();
			while (rs.next()) { // 행선택
				// 열선택
				String number = rs.getString("학번");
				String name = rs.getString("이름");
				String address = rs.getString("주소");
				String date = rs.getString("입학년도");
				String absence = rs.getString("휴학여부");

				// 레코드 저장용. ArrayList에 누적함.
				StuDTO dto = new StuDTO(number, name, address, date, absence);
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
