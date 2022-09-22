package site.metacoding.red.domain.explusion;

import java.util.List;

public interface ExplusionDao {
	public Explusion findById(Integer id);
	public List<Explusion> findAll();
	public void update(Explusion explusion); // DTO 생각해보기
	public void delete(Integer id);
}
