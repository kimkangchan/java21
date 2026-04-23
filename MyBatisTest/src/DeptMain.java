import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.DeptDTO;

public class DeptMain {

	public static void main(String[] args) {
		
		SqlSession session = MySqlSessionFactory.getSession();		
		DeptDTO dto = session.selectOne("findByDeptno", 20);
		//-----------------------------------------------------
		DeptDTO data = new DeptDTO();
		data.setDeptno(10);
		data.setDname("ACCOUNTING");
		DeptDTO dto2 = session.selectOne("findByDeptnoAndDname", data);
		//-----------------------------------------------------
		HashMap<String,Object> map = new HashMap<String, Object>();
		map.put("x", 10);
		map.put("y", "ACCOUNTING");
		DeptDTO dto3 = session.selectOne("findByDeptnoAndDnameMap", map);
		
		System.out.println(dto);
		System.out.println(dto2);
		System.out.println(dto3);
		//-----------------------------------------------------
		//다중행
		List<DeptDTO> list = session.selectList("findAll");
		System.out.println(list);
		
		DeptDTO data2 = new DeptDTO();
		data2.setDeptno(40);
		data2.setDname("인사과");
		List<DeptDTO> list2 = session.selectList("findByDnameOrDeptno",data2);
		System.out.println(list);
		System.out.println(list2);
		
		//insert
//		DeptDTO data3 = new DeptDTO(61,"개발","서울");
//		int n= session.insert("insert",data3);
//		if(n>=1)System.out.println("저장성공");
		//session.commit();
		
		//update
		HashMap<String,Object> map2 = new HashMap<String, Object>();
		map2.put("deptno", 61);
		map2.put("dname", "IT개발");
		map2.put("loc", "서울시");
		int n2 = session.update("update",map2);
		if(n2>=1)System.out.println("저장성공");
		session.commit();
		
		//delete
		int n3 = session.delete("delete",61);
		if(n3>=1)System.out.println("삭제성공");
		session.commit();
		
		// &lt; 실습
		List<DeptDTO> list3 = session.selectList("findByDeptnoLessThen",40);
		System.out.println(list3);
		
		List<DeptDTO> list4 = session.selectList("findByDeptno2",30);
		System.out.println(list4);
		//자원반납
		session.close();
	}

}
