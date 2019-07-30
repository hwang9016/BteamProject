package mate.service;

import java.util.List;
import mate.domain.MateVO;

public interface MateService {
	
	public abstract List<MateVO> list(int start, int end);
	
	public abstract int delete(MateVO mateVO);
	
	public abstract void add(MateVO mateVO);
	
	public abstract int count();

	public abstract void write(MateVO mateVO);

}
