package exam14_인터페이스5_loose_coupling;

public class MySQLDAO implements DBDAO{

	@Override
	public void connectDB() {
		System.out.println("MySQLDAO.connectMySQL()");
		
	}

//	public void connectMySQL() {
//		System.out.println("MYSQLDAO.connectMySQL()");
//	}
	
}
