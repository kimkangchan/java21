package workshop1;

import java.util.List;

public interface StuService {
	public abstract void setDao(StuDAO dao);
	public abstract List<StuDTO> list();

}
