package exam14_인터페이스5_loose_coupling;

public interface DBDAO {
	
	// DB 연동 시 종류와 무관하게 연동할 수 있는 매서드 정의
	
	public abstract void connectDB();
}
