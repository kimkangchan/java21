package exam14_인터페이스5_loose_coupling;

public class DBService {
	
	DBDAO dao;
	
	public void setDao(DBDAO dao) {
		this.dao=dao;
	}
	public void connect() {
		dao.connectDB();
	}
}
