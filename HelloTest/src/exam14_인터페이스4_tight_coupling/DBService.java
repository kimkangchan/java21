package exam14_인터페이스4_tight_coupling;

public class DBService {
	
	//MYSQLDAO dao;
	OracleDAO dao;
	//public void setDao(MYSQLDAO dao)
	public void setDao(OracleDAO dao) {
		this.dao = dao;
	}
	public void connect() {
		//dao.connectMySQL();
		dao.connectOracle();
	}
}
