package exam14_인터페이스5_loose_coupling;

public class OracleDAO implements DBDAO{

	@Override
	public void connectDB() {
		System.out.println("OracleDAO.connectMySQL()");
		
	}
	
//	public void connectOracle() {
//		System.out.println("ConnectOracle.connectOracle()");
//	}
	
}
